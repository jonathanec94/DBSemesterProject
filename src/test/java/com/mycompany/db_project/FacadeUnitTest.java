/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.db_project;

import DbInterface.Facade;
import entity.Book;
import java.io.BufferedReader;
import java.io.IOException;
import static org.hamcrest.CoreMatchers.is;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author Jonathan
 */
public class FacadeUnitTest {
    
    public FacadeUnitTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
     @Test
    public void testFindAllCitiesUnit() throws IOException{
    
        BufferedReader bufferedReader = Mockito.mock(BufferedReader.class);
        Mockito.when(bufferedReader.readLine()).thenReturn("Title: TestMock title", "Author: TestMock author", "*** START", "City wgwe Copenhagen","test. Hello there", null);
        Facade instance = new Facade(null);
        Book book = instance.findAllPossibleCitiesInBook(bufferedReader);
        assertThat(book.getAuthor(), is("TestMock author"));
        assertThat(book.getTitle(), is("TestMock title"));
        assertThat(book.getTmpCities().size(), is(3));
    }
    
}
