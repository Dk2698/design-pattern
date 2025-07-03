package com.kumar.practice.alarm;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AlarmClockManager manager = new AlarmClockManager();

        manager.setAlarm(LocalDateTime.now().plusSeconds(5), "Wake up");
        manager.setAlarm(LocalDateTime.now().plusSeconds(10), "Meeting");
        manager.setAlarm(LocalDateTime.now().plusSeconds(15), "Workout");

        Thread.sleep(20000);  // Keep main thread alive long enough
    }
}
