package com.tasks.patterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};
        JavaDeveloper developer = new JavaDeveloper("Serhey Demchenko", skills);

        Iterator iterator = developer.getIterator();
        System.out.println("Deveoper: " + developer.getName());
        System.out.println("Skills: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
