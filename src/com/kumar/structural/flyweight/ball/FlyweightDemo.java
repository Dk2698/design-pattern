package com.kumar.structural.flyweight.ball;

import java.util.AbstractMap;
import java.util.Map;

public class FlyweightDemo {
    private static final String colors[] = {"Green", "Yellow", "Pink"};

    private static final Map<String, String> urlMap = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("Green", "url1"),
            new AbstractMap.SimpleEntry<>("Yellow", "url2"),
            new AbstractMap.SimpleEntry<>("Pink", "url3")
    );

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String color = getColor();
            String url = urlMap.get(color);
            Ball ball = BallFactory.getBall(color, url);

            ball.setCoordX(getX());
            ball.setCoordY(getY());
            ball.setRadius(50);

            ball.draw();
            System.out.println(ball.hashCode());
        }
    }

    private static String getColor(){
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getX(){
        return (int) (Math.random() * 50);
    }

    private static int getY(){
        return (int) (Math.random() * 50);
    }
}
