/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbInterface;

import DtoEntity.*;
import entity.Book;
import entity.City;
import java.util.List;

/**
 *
 * @author nikolai
 */
public interface DbInterface {
    
    public List<City> findCities(List<String> city);
    public boolean insertBook(Book book);
    
    public List<DtoBookAuthor> getBooksByCity(String city);
    public List<DtoCity> getCitiesByTitle(String title);
    public List<DtoBookAuthor> getBooksByAuthor(String author);
    public List<DtoBookCity> getBooksByGeolocation(double latitude, double longitude);
    
}
