/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author aniruddha
 */
public class MyCollection {

    public MyCollection() {

        Collection<String> collectionString = new ArrayList<>();
        collectionString.add("India");
        collectionString.add("China");
        collectionString.add("Japan");
        collectionString.add("Shri Lanka");

        Collection<String> subCollection = new ArrayList<>();
        subCollection.add("India");
        subCollection.add("Japan12344");

        Boolean isContaining = collectionString.containsAll(subCollection);
        System.out.println("Is Containing - " + isContaining);

        List<String> listString = new ArrayList<>();
        listString.add("Pune");
        listString.add("Mumbai");
        listString.add("Kolhapur");
        listString.add("Nagpur");

        Iterator<String> iterator = listString.iterator();
        while (iterator.hasNext()) {

            String element = iterator.next();
            System.out.println("Element is " + element);
        }

        for (int i = 0; i < listString.size(); i++) {

            String element = listString.get(i);
            System.out.println("element for - " + element);
        }

        for (String element : listString) {

            System.out.println("element foreach - " + element);
        }

        Set<String> setString = new TreeSet<>();
        setString.add("Xiomi");
        setString.add("Android");
        setString.add("Apple");
        setString.add("Android");
        setString.add("RIM");
        setString.add("Windows");

        for (String element : setString) {
            System.out.println("Set Element - " + element);
        }
        
        Map<String, Integer> mapStringInt = new HashMap<>();
        mapStringInt.put("key_mobile", 12343);
        mapStringInt.put("key_city", 3333);
        mapStringInt.put("key_state", 3333);
        mapStringInt.put("key_country", 76587);
        
        Set<String> setKeys = mapStringInt.keySet();
        for(String key : setKeys){
            
            Integer value = mapStringInt.get(key);
            System.out.println("Key Set -> key - "+key+" Value - "+ value);
        }
        
        Collection<Integer> collectionValues = mapStringInt.values();
        for(Integer value : collectionValues){
            
            System.out.println("Collection Values -> Value - "+value);
        }
        
        Set<Map.Entry<String,Integer>> entries = mapStringInt.entrySet();
        
        for(Map.Entry<String,Integer> entry : entries){
        
            System.out.println("Entry Set -> key - "+entry.getKey() +" Value - "+entry.getValue());
        }
    }
}
