package day4;

import java.util.*;

interface MyInterface
{
	void sampleMethod();
}
interface MyInter
{
	int findsquare(int x);
}

public class java8demos
{
	public static void main(String[] args) {
	
		MyInterface obj =()->{
			System.out.println("Hello");
		};
		obj.sampleMethod();
		
		MyInter obj1 =(num)->{
			return num*num;
		};
		System.out.println(obj1.findsquare(2));
		
		List<Integer> nums = new ArrayList<Integer>();
		for(int y=100;y<107;y++) {
			nums.add(y);
		}
		//Use lambda for each
		//1. Implementing single abstract method interfaces
		nums.forEach((num)-> System.out.println(num));
	}
}
