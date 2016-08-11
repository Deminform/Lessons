package com.tasks.patterns.behavioral.chain;

public class SMSNotifier extends Notifier {

    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("Sending SMS to manager: " + msg);
    }
}
