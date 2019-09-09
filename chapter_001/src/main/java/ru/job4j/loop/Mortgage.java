package ru.job4j.loop;


    public class Mortgage {
        public int year(int amount, int salary, double percent) {
            int year = 0;
           // double interst = 0;
            while (amount > salary) {
                salary += amount;
                percent = amount * percent/100;
                salary -=percent;
                year++;
            }
           return year;
        }
    }
