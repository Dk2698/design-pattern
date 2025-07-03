package com.kumar.structural.flyweight.Letter;

import java.util.HashMap;
import java.util.Map;

public class LetterFactor {
    private  static Map<Character, ILetter> characterCache = new HashMap<>();

    static ILetter createLetter(char characterValue){
        if (characterCache.containsKey(characterValue)){
            return characterCache.get(characterValue);
        }else {
            final DocumentCharacter characterObj = new DocumentCharacter(characterValue, "Arial", 10);
            characterCache.put(characterValue, characterObj);
            return characterObj;
        }
    }
}
