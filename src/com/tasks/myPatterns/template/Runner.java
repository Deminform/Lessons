package com.tasks.myPatterns.template;

public class Runner {
    public static void main(String[] args) {
        ProcedureTemplate guitarMusician = new GuitarMusician();
        ProcedureTemplate pianoMusician = new PianoMusician();

        guitarMusician.sequence();

        System.out.println("\n===================================\n");

        pianoMusician.sequence();
    }
}
