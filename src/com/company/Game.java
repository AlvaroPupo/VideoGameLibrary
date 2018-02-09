package com.company;

public class Game {

    private String title;
    private String due_Date;

    public Game(String title) {
        this.title = title;
        due_Date = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDue_Date() {
        return due_Date;
    }

    public void setDue_Date(String due_Date) {
        this.due_Date = due_Date;
    }
}
