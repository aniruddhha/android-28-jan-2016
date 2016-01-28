/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.main;

import com.codekul.collection.MyCollection;
import com.codekul.generics.Car;

/**
 *
 * @author aniruddha
 */
public class Main {
 
    public static void main(String[] args) {
        
        Car<String> carString = new Car<>(); // type erasures 
        carString.getT();
        
        Car<Integer> carInt = new Car<>();
        carInt.getT();
        
        MyCollection myCol = new MyCollection();
    }
}
