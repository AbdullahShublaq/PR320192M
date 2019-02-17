package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aashgar
 */
public class mainApp2 {
    public enum Dir {R,L,N,S};
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.setName("Ahmad"); s1.setGrade(90);
       Student s2 = new Student();
       s2.setName("Maher"); s2.setGrade(77);
        System.out.println("Count" + Student.getCount());
    }
private static class Student{
    private String name;
    private int grade;
    private static int count=0;

        public Student() {
            ++count;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public static int getCount() {
            return count;
        }

        public static void setCount(int count) {
            Student.count = count;
        }
    
    
}
}
