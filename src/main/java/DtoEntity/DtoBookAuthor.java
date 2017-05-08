/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DtoEntity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nikolai
 */
public class DtoBookAuthor {
    private String title;
    private String author;
    private List<DtoCity> Cities = new ArrayList<>();

    public DtoBookAuthor(String title, String author) {
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

    public List<DtoCity> getCities() {
        return Cities;
    }

    public void setCities(List<DtoCity> Cities) {
        this.Cities = Cities;
    }
    
    
}
