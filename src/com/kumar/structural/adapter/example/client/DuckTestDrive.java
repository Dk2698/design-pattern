package com.kumar.structural.adapter.example.client;

import com.kumar.structural.adapter.example.adaptee.Turkey;
import com.kumar.structural.adapter.example.adaptee.WildTurkey;
import com.kumar.structural.adapter.example.adapter.TurkeyAdapter;
import com.kumar.structural.adapter.example.target.Duck;
import com.kumar.structural.adapter.example.target.MallardDuck;

public class DuckTestDrive {
    public static void main(String[] args) {
        final Duck duck = new MallardDuck();

        Turkey turkey=  new WildTurkey();
        final Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("the Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\n The Duck says ....");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
