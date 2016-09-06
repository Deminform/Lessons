package com.tasks.myPatterns.observer;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> orders);
}
