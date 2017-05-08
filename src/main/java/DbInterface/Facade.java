/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbInterface;

import DbInterface.DbInterface;
import entity.Book;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nikolai
 */
public class Facade {
    
    DbInterface db;
    
    public Facade (DbInterface db){
        this.db = db;
    }

    public Book findAllPossibleCitiesInBook(String fileName) throws FileNotFoundException, IOException {
        Book book = new Book();

        BufferedReader in = null;

        in = new BufferedReader(new FileReader(fileName));

        String line;

        boolean isBookStarted = false;
        HashSet<String> setWords = new HashSet<String>();
        
        while ((line = in.readLine()) != null) {
            if (line.contains("*** START")) {
                isBookStarted = true;
            } else if (!isBookStarted && line.toLowerCase().contains("title")) {
                book.setTitle(line.replace("Title: ", ""));
            } else if (!isBookStarted && line.toLowerCase().contains("author")) {
                book.setAuthor(line.replace("Author: ", ""));
            }

            //Look through the book after the cities  
            if (isBookStarted) {
                //Find all words that starts with a uppercase
                String pattern = "([A-Z])\\w+";
                //String pattern = "^([A-Z\\u0080-\\u024F]+(?:. |-| |'))*[a-zA-Z\\u0080-\\u024F]*$";
                Pattern r = Pattern.compile(pattern);
                Matcher m = r.matcher(line);
                
                //now match the word with the cities
                if(m.find()) {
                    String tmpStr = m.group(0);
                    if(tmpStr.length() > 2)
                        setWords.add(m.group(0).toLowerCase());
                    //setWords.add(m.group(0));
                   
                }
            }

        }
        in.close();
        
        List<String> list = new ArrayList<String>(setWords);
        book.setCities(list);
        
//        for (String string : list) {
//            System.out.println(string);
//        }
//        System.out.println("size: "+list.size());
        

        return book;
    }

}
