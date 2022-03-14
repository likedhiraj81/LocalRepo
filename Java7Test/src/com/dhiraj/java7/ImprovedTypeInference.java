package com.dhiraj.java7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

import sun.text.resources.FormatData_ar_BH;


public class ImprovedTypeInference {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Map<String,String> params = new HashMap<String,String>();
        params.put("One", "1");
        params.put("Twenty", "Seven");
        params.put("Manish", "Manisha");
        params.clear();
        params.values();
        params.containsKey("One");
       
        params.size();
        // using for-each loop for iteration over Map.entrySet()
        
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,String> entry :  params.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }
}
