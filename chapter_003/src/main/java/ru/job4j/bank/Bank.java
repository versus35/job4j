package ru.job4j.bank;
/**
 * @author Bulankin Viktor.
 * @version 1.0.
 * @since 26.10.2019.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
	private Map<User, List<Account>> userListMap = new HashMap<>();
	private Account accountFirst;
	private Account accountSecond;
	private User userFirst;
	private User userSecond;

	/**
	 * Список пользователей со списком их счетов.
	 * @return Список пользователей и их счетов.
	 */
	public Map<User, List<Account>> getUsersAccount() {
		return userListMap;
	}

	/**
	 * Метод добавления пользователей в пустой список.
	 * @param user  Новый пользователь.
	 */

	public void addUsers(User user) {
		userListMap.putIfAbsent(user, new ArrayList<Account>());
	}

	/**
	 * Метод удаления пользователей.
	 * @param user Удаляемый пользователь.
	 */
	public void deleteUsers(User user) {
		userListMap.remove(user);
	}

	/**
	 * Метод добавляет сче пользователя в список.
	 * @param passport Паспортные данные пользователя.
	 * @param account Счет.
	 */

	public void addAccountToUsers(String passport, Account account) {
		List accounts = userListMap.get(findUser(passport));
		if (accounts != null && accounts.indexOf(account) == -1) {
			accounts.add(account);
		}
	}

	/**
	 * Метод удаляет пользователя из списка.
	 * @param passport Паспортные данне пользователя.
	 * @param account Счет.
	 */

	public void deleteAccountToUsers(String passport, Account account) {
		List accounts = userListMap.get(findUser(passport));
		if (accounts != null && accounts.indexOf(account) != -1) {
			accounts.remove(account);
		}
	}

	/**
	 * Метод поиска пользователя в списке по паспортным данным.
	 * @param passport Паспортные данные пользователя.
	 * @return Результат поиска.
	 */

	private User findUser(String passport) {
		User result = User.EMPTY;
		for (Map.Entry<User, List<Account>> entry : userListMap.entrySet()) {
			if (entry.getKey().getPassport() == passport) {
				result = entry.getKey();
				break;
			}
		}
		return result;
	}

	/**
	 * Метод возвращает список счетов пользователя.
	 * @param passport Паспортные данные пользователя.
	 * @return Счет пользователя.
	 */

	public List<Account> getUsersAccount(String passport) {
		return userListMap.get(findUser(passport));
	}

	/**
	 * Метод возращает актульный счет пользователя.
	 * @param passport Паспортные данные пользователя.
	 * @param requisite Реквизиты пользователя.
	 * @return Счет.
	 */

	public Account getUsersActualAccount(String passport, String requisite) {
		Account userAccount = accountFirst;
		ArrayList<Account> userAccounts = (ArrayList<Account>) getUsersAccount(passport);
		if (userAccounts.size() > 0) {
			for (Account account : userAccounts) {
				if (account.getRequisites().equals(requisite)) {
					userAccount = account;
					break;
				}
			}
		}
		return userAccount;
	}

	/**
	 * Метод перевода денежных средств.
	 * @param srcPassport Паспортные данные пользователся счета с которого переводятся деньги.
	 * @param srcRequisite Реквизиты счета с которого переводятся деньги.
	 * @param destPassport Паспортные данные пользователя на счет оторого переводятся деньги.
	 * @param dstRequisite Реквизиты счета получателя.
	 * @param amount Сумма перевода.
	 * @return Успешность операции.
	 */

	public boolean transferMoney(String srcPassport, String srcRequisite,
	                             String destPassport, String dstRequisite, double amount) {
		boolean result = false;
		Account first = getUsersActualAccount(srcPassport, srcRequisite);
		Account second = getUsersActualAccount(destPassport, dstRequisite);
		if (first != null && second != null) {
			if (first.getValue() >= amount) {
				result = true;
			}
		}
		return result;
	}
}
