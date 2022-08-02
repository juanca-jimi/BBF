package com.bbf.client;

import java.util.WeakHashMap;

public abstract class Attacker
{


    short healthPoints = 0;

    short damage = 0;
    boolean isAlive = true;
    Weapon weapon = new Fist();



    String name = null;



    double fightMultiplier = .1;


    public boolean isAlive(){
        return this.isAlive;
    }


    public Attack attack()
    {
        return new Attack(this);
    }

    public void getsAttacked(Attack attack)
    {
        setDamage(attack.getDamage());
        if(getHealthPoints() <= getDamage())
            setIsAlive(false);
    }

    private void setIsAlive(boolean b)
    {
        this.isAlive = b;
    }

    private short getDamage()
    {
        return  this.damage;
    }

    private short getHealthPoints()
    {
        return this.healthPoints;
    }

    void setDamage(double damage)
    {
        this.damage += damage;
    }

    public double getFightMultiplier(){
        return  this.getFightMultiplier();
    }
    public void setFightMultiplier(double fightMultiplier)
    {
        this.fightMultiplier = fightMultiplier;
    }
    public double getWeaponMultiplier(){
        return this.weapon.getWeaponMultiplier();
    }


    public void setDamage(short damage)
    {
        this.damage = damage;
    }

    public void setAlive(boolean alive)
    {
        isAlive = alive;
    }

    public Weapon getWeapon()
    {
        return weapon;
    }

    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setHealthPoints(short healthPoints)
    {
        this.healthPoints = healthPoints;
    }

}
