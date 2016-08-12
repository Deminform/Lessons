package com.tasks.patterns.behavioral.mediator;

public class SimpleUser implements User {
    Chat chat;
    String name;

    public SimpleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMsg(String msg) {
        chat.sendMsg(msg, this);
    }

    @Override
    public void getMsg(String msg) {
        System.out.println(this.name + " receiving message: " + msg + ".");
    }
}
