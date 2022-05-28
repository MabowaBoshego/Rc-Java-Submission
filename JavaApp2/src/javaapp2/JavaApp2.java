/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapp2;

import java.util.Scanner;

/**
 *
 * @author MABOW
 */
public class JavaApp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String username;
        String password;
        System.out.println("enter username:");
        username = scan.next();
        System.out.println("enter password :");
        password = scan.next();
        if(username.compareTo("John") == 0 && password.compareTo("12345") == 0)
        {
            System.out.println("Login Successful");
        }
        else
        {
            System.out.println("Wrong username or/and password");
        }
        

    }
}
 