 package com.attainware.maven2example;
 import junit.framework.TestCase;

import com.attainware.maven2example.App;
 
 public class AppTest extends TestCase
 {
       public void testApp()  
       {
           assertTrue( App.now().length() > 0 );
       }
 }