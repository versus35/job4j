package ru.job4j.bank;
/**
 * @author Bulankin Viktor.
 * @version 1.0.
 * @since 26.10.2019.
 */

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BankTest {
	private Account accountFirst;
	private Account accountSecond;
	private User userFirst;
	private User userSecond;

	/**
	 * Пользователи, которые добавляются в список.
	 * Аккаунты пользователей.
	 */
	@Before
	public void createData() {
		userFirst = new User("Bob", "passport");
		userSecond = new User("Bob2", "passport2");
		accountFirst = new Account(100d, "1234567890");
		accountSecond = new Account(1000d, "9234567890");
	}

	/**
	 * Туст проверки добавления нового пользователя.
	 */
	@Test
	public void addUsers() {
		Bank userListMap = new Bank();
		userFirst = new User("Bob", "passport");
		userSecond = new User("Bob2", "passport2");
		userListMap.addUsers(userFirst);
		userListMap.addUsers(userSecond);
		List<User> result = new ArrayList<>();
		for (Map.Entry<User, List<Account>> entry : userListMap.getUsersAccount().entrySet()) {
			result.add(entry.getKey());
		}
		List<User> expect = new ArrayList<>();
		expect.add(userFirst);
		expect.add(userSecond);
		assertThat(result, is(expect));
	}

	/**
	 * Тест проверки удаления пользователя.
	 */
	@Test
	public void deleteUser() {
		Bank userListMap = new Bank();
		userFirst = new User("Bob", "passport");
		userSecond = new User("Bob2", "passport2");
		userListMap.addUsers(userFirst);
		userListMap.addUsers(userSecond);
		userListMap.deleteUsers(userFirst);
		List<User> result = new ArrayList<>();
		for (Map.Entry<User, List<Account>> entry : userListMap.getUsersAccount().entrySet()) {
			result.add(entry.getKey());
		}
		List<User> expected = new ArrayList<>();
		expected.add(userSecond);
		assertThat(result, is(expected));
	}

	/**
	 * Тест проверк добавления аккаунта пользователя.
	 */

	@Test
	public void addAccountToUsers() {
		Bank userListMap = new Bank();
		userFirst = new User("Bob", "passport");
		userSecond = new User("Bob2", "passport2");
		userListMap.addUsers(userFirst);
		userListMap.addUsers(userSecond);
		userListMap.addAccountToUsers(userFirst.getPassport(), accountFirst);
		userListMap.addAccountToUsers(userSecond.getPassport(), accountSecond);
		List<User> result = new ArrayList<>();
		for (Map.Entry<User, List<Account>> entry : userListMap.getUsersAccount().entrySet()) {
			result.add(entry.getKey());
		}
		List<User> expected = new ArrayList<>();
		expected.add(userFirst);
		expected.add(userSecond);
		assertThat(result, is(expected));
	}

	/**
	 * Тест проверки удаления аккаунта пользователя.
	 */
	@Test
	public void deleteAccountToUsers() {
		Bank userListMap = new Bank();
		userFirst = new User("Bob", "passport");
		userSecond = new User("Bob2", "passport2");
		userListMap.addUsers(userFirst);
		userListMap.addUsers(userSecond);
		userListMap.addAccountToUsers(userFirst.getPassport(), accountFirst);
		userListMap.addAccountToUsers(userSecond.getPassport(), accountSecond);
		userListMap.deleteAccountToUsers(userFirst.getPassport(), accountFirst);
		List<Account> result = new ArrayList<>();
		for (Map.Entry<User, List<Account>> entry : userListMap.getUsersAccount().entrySet()) {
			result = entry.getValue();
		}
		List<Account> expected = new ArrayList<>();
		expected.add(accountSecond);
		assertThat(result, is(expected));
	}

	/**
	 * Тест проверки получения счетов пользователя по паспортным данным.
	 */
	@Test
	public void getUsersAccount() {
		Bank userListMap = new Bank();
		userFirst = new User("Bob", "passport");
		userSecond = new User("Bob2", "passport2");
		userListMap.addUsers(userFirst);
		userListMap.getUsersAccount(userFirst.getPassport());
		List<User> result = new ArrayList<>();
		for (Map.Entry<User, List<Account>> entry : userListMap.getUsersAccount().entrySet()) {
			result.add(entry.getKey());
		}
		List<User> expected = new ArrayList<>();
		expected.add(userFirst);
		assertThat(result, is(expected));
	}

	/**
	 * Тест проверки получения актуального счета пользователя по паспортным данным и реквизитам.
	 */
	@Test
	public void getUserActualAccount() {
		Bank userListMap = new Bank();
		userFirst = new User("Bob", "passport");
		userListMap.addUsers(userFirst);
		userListMap.getUsersActualAccount(userFirst.getPassport(), "123_123");
		List<User> result = new ArrayList<>();
		for (Map.Entry<User, List<Account>> entry : userListMap.getUsersAccount().entrySet()) {
			result.add(entry.getKey());
		}
		List<User> expected = new ArrayList<>();
		expected.add(userFirst);
		assertThat(result, is(expected));
	}

	/**
	 * Тест проверки успешности операции перевода денежной суммы.
	 */
	@Test
	public void transferMoneyTru() {
		Bank userAccounts = new Bank();
		userAccounts.addUsers(userFirst);
		userAccounts.addAccountToUsers(userFirst.getPassport(), accountFirst);
		userAccounts.addAccountToUsers(userFirst.getPassport(), accountSecond);
		userAccounts.addUsers(userSecond);
		userAccounts.addAccountToUsers(userSecond.getPassport(), accountFirst);
		boolean result = userAccounts.transferMoney(userFirst.getPassport(), accountFirst.getRequisites(),
				userSecond.getPassport(), accountFirst.getRequisites(), 90d);
		assertThat(result, is(true));
	}

	/**
	 * Тест проверки отказа в операции перевода денежных средст.
	 */
	@Test
	public void transferMoneyFalse() {
		Bank userAccounts = new Bank();
		userAccounts.addUsers(userFirst);
		userAccounts.addAccountToUsers(userFirst.getPassport(), accountFirst);
		userAccounts.addAccountToUsers(userFirst.getPassport(), accountSecond);
		userAccounts.addUsers(userSecond);
		userAccounts.addAccountToUsers(userSecond.getPassport(), accountFirst);
		boolean result = userAccounts.transferMoney(userFirst.getPassport(), accountFirst.getRequisites(),
				userSecond.getPassport(), accountFirst.getRequisites(), 190);
		assertThat(result, is(false));
	}

}
