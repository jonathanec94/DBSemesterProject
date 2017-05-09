/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nikolai
 */
public class Book {

    private String title;
    private String author;
    private List<City> cities = new ArrayList<>();
    private List<String> tmpCities = new ArrayList<>();
    

    public Book() {
    }
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> listOfPossibleCities) {
        this.cities = listOfPossibleCities;
    }
    
     public List<String> getTmpCities() {
        return tmpCities;
    }

    public void setTmpCities(List<String> listOfPossibleCities) {
        this.tmpCities = listOfPossibleCities;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", cities=" + cities +", tmpCities="+ tmpCities + '}';
    }

}
