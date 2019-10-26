package ru.job4j.bank;

import java.util.*;

public class Account {
	private String user;
	private double value;
	private String requisites;

	public Account(double value, String requisites) {
		this.value = value;
		this.requisites = requisites;
	}

	public String getUser() {
		return user;
	}

	public double getValue() {
		return value;
	}

	public String getRequisites() {
		return requisites;
	}

	public void addAmount(double amount) {
		this.value += amount;
	}

	public void offsAmount(double amount) {
		this.value -= amount;
	}
}
