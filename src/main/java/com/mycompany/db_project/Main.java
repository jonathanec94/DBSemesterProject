/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.db_project;

import DbInterface.Facade;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author nikolai
 */
public class Main {

    Facade instance = new Facade(null);
//new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/10267.txt")))
    public static void main(String[] args) {
        Main main = new Main();
        main.instance.insertBooksWithCities();
    }
}
