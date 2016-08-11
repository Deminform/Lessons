package com.tasks.patterns.behavioral.chain;

public class Bugtracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is ok", Priority.ROUTINE);
        System.out.println("\n=============================================\n");
        reportNotifier.notifyManager("Something went wrong!", Priority.IMPORTANT);
        System.out.println("\n=============================================\n");
        reportNotifier.notifyManager("Houston, we've had problem here!!!", Priority.ASAP);
    }
}
