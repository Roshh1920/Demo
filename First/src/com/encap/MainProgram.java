package com.encap;

public class MainProgram {
	 
    public static void main(String[] args) {

        StudentVo svo=null;
        SetStudent get=new SetStudent();
        svo=get.setStudent();        
        displaystudent disp=new displaystudent();
        disp.display(svo);
    }
 
}