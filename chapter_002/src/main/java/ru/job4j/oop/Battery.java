package ru.job4j.oop;

public class Battery {
	private  int load;
	public Battery(int size) {
		this.load = size;
	}
	public void exchange(Battery another){
		this.load = this.load - another.load;
		another.load = 0;
	}

	public static void main(String[] args) {
		Battery battery = new Battery(100);
		Battery exch = new Battery(85);
		System.out.println("load: " + battery.load + " " + "exch: " + exch.load);
		battery.exchange(exch);
		System.out.println("load: " + battery.load + " " + "exch: " + exch.load);
	}
}
