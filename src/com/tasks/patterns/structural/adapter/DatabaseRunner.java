package com.tasks.patterns.structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdaptorJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
