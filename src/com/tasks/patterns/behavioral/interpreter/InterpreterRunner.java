package com.tasks.patterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDev = getJavaEEExpression();

        System.out.println("Does developer knows Java Core: " + isJava.interpreter("Java Core"));
        System.out.println("Does developer knows Java EE: " + isJavaEEDev.interpreter("Java Spring"));

    }

    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("JavaCore");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java, spring);
    }
}
