## Problem Requirements (assumptions)
    Multiple alarms can be set.
    Alarms go off (ring) at the scheduled time.
    The system supports concurrency (multi-threaded).
    You can add, remove, and list alarms. 
    Thread-safe design is important.

    Concurrency: Java's ExecutorService, ScheduledExecutorService, or custom threads.
    Data Structures: Thread-safe collection for storing alarms (ConcurrentSkipListSet, PriorityQueue with locks).
    Time Management: Use java.time.LocalDateTime or System.currentTimeMillis().

## 🛠️ Real LLD Example: Design an Alarm Clock System
#### 🔍 Requirements
    Users can set, delete, and view alarms.
    Alarm should ring at the correct time.
    Support multiple alarms.
    Must be thread-safe (background checking).

## 🧱 Step 1: Identify Core Classes
    | Entity         | Responsibility                                                |
    | -------------- | ------------------------------------------------------------- |
    | `Alarm`        | Holds time and label for alarm                                |
    | `AlarmManager` | Adds/removes/list alarms; background thread to check and ring |
    | `ClockService` | Keeps system time, can simulate time changes                  |
    | `Notifier`     | Handles ringing (e.g., print message or send callback)        |

## 📦 Step 2: Alarm Class
```java
public class Alarm implements Comparable<Alarm> {
private final LocalDateTime time;
private final String label;

    public Alarm(LocalDateTime time, String label) {
        this.time = time;
        this.label = label;
    }

    public LocalDateTime getTime() { return time; }
    public String getLabel() { return label; }

    @Override
    public int compareTo(Alarm other) {
        return this.time.compareTo(other.time);
    }
}
```

## 👷 Step 3: AlarmManager with Background Thread
```java
public class AlarmManager {
    private final PriorityQueue<Alarm> alarms = new PriorityQueue<>();
    private final Object lock = new Object();
    private final Thread workerThread;

    public AlarmManager() {
        workerThread = new Thread(this::runClock);
        workerThread.setDaemon(true); // auto-stops with main thread
        workerThread.start();
    }

    public void setAlarm(LocalDateTime time, String label) {
        synchronized (lock) {
            alarms.offer(new Alarm(time, label));
            lock.notify();
        }
    }

    public void deleteAlarm(LocalDateTime time) {
        synchronized (lock) {
            alarms.removeIf(alarm -> alarm.getTime().equals(time));
        }
    }

    private void runClock() {
        while (true) {
            try {
                Alarm nextAlarm;
                synchronized (lock) {
                    while (alarms.isEmpty()) lock.wait();

                    nextAlarm = alarms.peek();
                    long waitTime = Duration.between(LocalDateTime.now(), nextAlarm.getTime()).toMillis();

                    if (waitTime > 0) {
                        lock.wait(waitTime);
                    } else {
                        System.out.println("⏰ Alarm ringing: " + nextAlarm.getLabel());
                        alarms.poll();
                    }
                }
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
```
## 👤 Step 4: Sample Main to Test

```java
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AlarmManager manager = new AlarmManager();
        manager.setAlarm(LocalDateTime.now().plusSeconds(5), "Wake up!");
        manager.setAlarm(LocalDateTime.now().plusSeconds(10), "Meeting starts");

        Thread.sleep(15000); // Keep main alive
    }
}
```