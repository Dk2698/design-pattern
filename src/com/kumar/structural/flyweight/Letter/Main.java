package com.kumar.structural.flyweight.Letter;

public class Main {
    public static void main(String[] args) {
        new CharacterLatter('t' ,"Arial",10,0,1);
        new CharacterLatter('h' ,"Arial",10,0,2);
        new CharacterLatter('i' ,"Arial",10,0,3);
        new CharacterLatter('s' ,"Arial",10,0,4);


        // sol
        final ILetter object1 = LetterFactor.createLetter('t');
        object1.display(0,0);

        final ILetter object2 = LetterFactor.createLetter('t');
        object2.display(0, 6);
    }
}
