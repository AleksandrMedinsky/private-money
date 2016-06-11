package com.jmoney.model;

public class Account {

    private String name;
    private int integer;
    private int fraction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public int getFraction() {
        return fraction;
    }

    public void setFraction(int fraction) {
        this.fraction = fraction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (integer != account.integer) return false;
        if (fraction != account.fraction) return false;
        return name != null ? name.equals(account.name) : account.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + integer;
        result = 31 * result + fraction;
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", integer=" + integer +
                ", fraction=" + fraction +
                '}';
    }
}