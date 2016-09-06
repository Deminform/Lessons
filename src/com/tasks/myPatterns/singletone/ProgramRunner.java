package com.tasks.myPatterns.singletone;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First log info");
        ProgramLogger.getProgramLogger().addLogInfo("Second log info");
        ProgramLogger.getProgramLogger().addLogInfo("Third log info");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
