package com.bbf.client;

public class Purse
{
    private double money = 0;

    public double getMoney()
    {
        return money;
    }

    public void addMoney(double money)
    {
        this.money += money;
    }

    public void setMoney(double money)
    {
        this.money = money;
    }
}