package t66_Generic;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
	public static void main(String[] args)
	{
		box b =new box(20);
		System.out.println(b.getValue());
		
		//box b1 = new box(15.5); => Báo lỗi
		 
		box2 b2 = new box2<Integer>(15);
		System.out.println("Gia tri: " + b2.getValue());
		b2 = new box2<String>("muoi lam");
		System.out.println("Gia tri: " + b2.getValue());
		
		
	}
}
