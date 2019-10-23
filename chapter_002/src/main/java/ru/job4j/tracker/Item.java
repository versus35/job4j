package ru.job4j.tracker;

public class Item {
	private String id;
	private String name;
	private String decs;
	private long time;
	private String testName;
	private String test;

	public Item(String id, String name, String decs, long time) {
		this.id = id;
		this.name = name;
		this.decs = decs;
		this.time = time;
	}

	public Item(String name) {
		this.name = name;
	}

	public Item(String testName, String test) {
		this.testName = testName;
		this.test = test;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return decs;
	}

	public void setDecs(String decs) {
		this.decs = decs;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

}
