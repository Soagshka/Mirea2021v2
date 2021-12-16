package com.mirea.demo.modeles;

public class PatchModel {
    private int id;
    private String str;

    public PatchModel(int id, String str) {
        this.id = id;
        this.str = str;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
