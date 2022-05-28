/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javaapp2;

import static org.junit.jupiter.api.Assertions.assertEquals;  

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;
/**
 *
 * @author MABOW
 */
public class messageTest
{
    message Message = new message();
    public messageTest() {
    }

    @Test
    public void testGetMessage() 
    {
        String expected = "I have arrived";
        String actual = Message.getMessage();
        
        assertEquals(expected,actual);
    }
    
}
