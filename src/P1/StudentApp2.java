/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

/**
 *
 * @author aashgar
 */
public class StudentApp2 {
    public static void main(String[] args) {
        Operation<Integer> mult = (X)-> (X * X);
        System.out.println("5 by 5= " + mult.apply(5));
    }
    
    interface Operation<T>{
        T apply(T data);
    }
    
}
