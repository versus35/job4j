package ru.job4j.bank;

/**
 * @author Bulankin Viktor.
 * @version 1.0.
 * @since 26.10.2019.
 */

public class User {
	public static final User EMPTY = new User();
	private String name;
	private String passport;

	public User(String name, String passport) {
		this.name = name;
		this.passport = passport;
	}

	public User() {

	}

	public static User getEMPTY() {
		return EMPTY;
	}

	public String getName() {
		return name;
	}


	public String getPassport() {
		return passport;
	}

	@Override
	public boolean equals(Object anotherUser) {
		boolean isEqual = false;
		if (anotherUser instanceof User) {
			if (this == anotherUser) {
				isEqual = true;
			} else {
				User user = (User) anotherUser;
				if (this.getPassport().equals(user.getPassport())) {
					isEqual = true;
				}
			}
		}
		return isEqual;
	}

	@Override
	public int hashCode() {
		return this.getPassport().hashCode() + this.getName().hashCode();
	}
}
