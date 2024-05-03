package com.sohot.es.q2;

public class Order {
    int num;
    String id;
    int year;
    int month;
    int day;
    String name;
    String product;
    String address;

    public Order(){}

    public Order(int num, String id, int year, int month, int day, String name, String product, String address) {
        this.num = num;
        this.id = id;
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
        this.product = product;
        this.address = address;
    }
}
