package test;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aashgar
 */
public class mainApp1 {
    public static void main(String[] args) {
        int balance;        
        System.out.println("Enter your balance:");
        Scanner scanner = new Scanner(System.in);
        balance = Integer.parseUnsignedInt(scanner.next());
        System.out.println("Balance = "+ 
                Integer.toUnsignedString(balance));
    }
    
}
