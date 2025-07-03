package com.kumar.practice.alarm;


import java.time.Duration;
import java.time.LocalDateTime;
import java.util.PriorityQueue;

class AlarmClockManager {
    private final PriorityQueue<Alarm> alarmQueue = new PriorityQueue<>();
    private final Object lock = new Object();
    private final Thread alarmThread;

    public AlarmClockManager() {
        alarmThread = new Thread(this::startAlarmChecker);
        alarmThread.start();
    }

    public void setAlarm(LocalDateTime time, String label) {
        Alarm alarm = new Alarm(time, label);
        synchronized (lock) {
            alarmQueue.offer(alarm);
            lock.notify();  // Wake up alarmThread if it's waiting
        }
        System.out.println("Alarm set for " + time + " with label: " + label);
    }

    public void startAlarmChecker() {
        while (true) {
            try {
                Alarm nextAlarm = null;
                synchronized (lock) {
                    while (alarmQueue.isEmpty()) {
                        lock.wait();
                    }

                    nextAlarm = alarmQueue.peek();
                    long delay = Duration.between(LocalDateTime.now(), nextAlarm.getTime()).toMillis();

                    if (delay > 0) {
                        lock.wait(delay);
                    } else {
                        alarmQueue.poll();  // Remove alarm
                        System.out.println("⏰ Alarm ringing! " + nextAlarm.getLabel() + " at " + LocalDateTime.now());
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
