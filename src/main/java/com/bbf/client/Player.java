package com.bbf.client;

public class Player {
    private String item;
    protected Player player = null;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Player{" +
                "item='" + item + '\'' +
                ", player=" + player +
                '}';
    }
}
