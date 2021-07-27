package com.encap;

public class SetStudent 
{

    StudentVo setStudent()
     {
         StudentVo svo=new StudentVo();

         svo.setSid(100);
         svo.setName("Ritik");
         svo.setAge(21);
         svo.setGender("Male");
         svo.setCity("Delhi");
 
         
        return svo;
     }
 
}
