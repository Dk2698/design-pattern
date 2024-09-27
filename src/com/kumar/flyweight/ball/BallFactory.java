package com.kumar.flyweight.ball;

import java.util.HashMap;

public class BallFactory {
    private static final HashMap ballMap = new HashMap<>();

    public static Ball getBall(String color, String url) {
        StringBuilder sb = new StringBuilder();
        sb.append(color);
        sb.append(url);

        String ballCacheKey = sb.toString();
        Ball ball = (Ball) ballMap.get(ballCacheKey);
        if (ball == null) {
            ball = new Ball(color, url);
            ballMap.put(ballCacheKey, ball);
            System.out.println("creating cicle of color: " + color);
        }
        return ball;
    }
}
