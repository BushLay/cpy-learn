package com.bushlay.demo.entity;

public class Plan {
    private String date;
    private int num;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "date='" + date + '\'' +
                ", num=" + num +
                '}';
    }
}
