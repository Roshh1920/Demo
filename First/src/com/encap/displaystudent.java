package com.encap;

public class displaystudent
{
        void display(StudentVo svo)
        {
            System.out.println("Student Info is ");
            System.out.println("Sid "+ svo.getSid());
            System.out.println("Name "+ svo.getName());
            System.out.println("Age"+ svo.getAge());
            System.out.println("Gender "+ svo.getGender());
            System.out.println("City "+ svo.getCity());
        }
}