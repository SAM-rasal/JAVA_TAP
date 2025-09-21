package com.Transflower;

public class Student {
    private int RollNo;
    private String Name;
    private int Marks;
    private int Standard;

    // Default Constructor 
    Student() {
        this.RollNo = 1;
        this.Name = "Samruddhi"; 
    }

    @Override
    public String toString() {
        return "Name : " + this.Name + " | Roll no : " + this.RollNo;
    }

    public static void main(String[] args) {
        System.out.println("Hello Everyone, Nice to meet you !!!");

        Student s1 = new Student();
        System.out.println(s1);
    }
}
