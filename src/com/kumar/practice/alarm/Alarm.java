package com.kumar.practice.alarm;

import java.time.LocalDateTime;

class Alarm implements Comparable<Alarm> {
    private final LocalDateTime time;
    private final String label;

    public Alarm(LocalDateTime time, String label) {
        this.time = time;
        this.label = label;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public int compareTo(Alarm other) {
        return this.time.compareTo(other.time);
    }
}
