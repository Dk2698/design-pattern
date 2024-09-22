package com.kumar.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> conextMap =  new HashMap<>();

    public void put(String strVariable, int intValue){
        conextMap.put(strVariable,intValue);
    }

    public int get(String strVariable){
        return conextMap.get(strVariable);
    }
}
