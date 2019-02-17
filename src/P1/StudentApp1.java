/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aashgar
 */
public class StudentApp1 {
    public static void main(String[] args) {
//        Student[] students = {
//            new Student("Ahmad", "CS", 88.2),
//            new Student("Ali", "Art", 69.9),
//            new Student("Maher", "Eng", 77.2),
//        };
        Student[] students = new Student[3];
       // Scanner scanner = new Scanner(System.in);
        for(int i=0; i<students.length; i++){
            System.out.println("Enter data");
            Student s= new Student();
            s.setName(JOptionPane.
               showInputDialog(null, "Student", "Name", JOptionPane.INFORMATION_MESSAGE));
            s.setMajor(JOptionPane.
               showInputDialog(null, "Student", "Major", JOptionPane.INFORMATION_MESSAGE));
            s.setGrade(Double.parseDouble(JOptionPane.
               showInputDialog(null, "Student", "Name", JOptionPane.INFORMATION_MESSAGE)));
            students[i] = s;
        }
        sortArray(students);
        showData(students);
        
        

        
       
    }
private static void showData(Student[] students){
     System.out.println("==================");
        System.out.printf("%-10s%-10s%-13s\n","Name","Major","Grade");
        for(Student student:students)
            System.out.printf("%-10s%-10s%-10.2f\n",
                    student.getName(),
                    student.getMajor(),student.getGrade());
}

public static void sortArray(Student[] s){
    //Student[] newArray = s;
    
    
    for(int i = 0; i < s.length; i++)
        for(int j=i+1; j<s.length; j++)
            if(s[j].getGrade() > s[i].getGrade())
            {
                Student temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
    
        
        
    
    
}
    
}
