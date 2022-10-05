package t62_Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Stack<String> st = new Stack<String>();
			
		/*
		 * st.push("gia tri"); //Dua gia tri vao stack st.pop(); //lay gia tri o cuoi
		 * ngan xep ra va xoa gia tri st.peek(); //lay gia tri ra nhung khong xoa
		 * st.clear(); //xoa tat ca gia tri trong stack st.contains("phuc"); //Kiem tra
		 * xem co ton tai trong stack khong
		 */		
		
		//Dao nguoc 1 chuoi
		System.out.println("Nhap vao chuoi: ");
		String s = sc.nextLine();
		String S[] = s.split(" ");
		for(String i : S)
			st.push(i);
		while(!st.isEmpty())
		{
			String temp = st.pop();
			System.out.println(temp);
		}
		
		//Chuyen so tu he thap phan sang nhi phan
		System.out.println("Nhap vao a: ");
		int a = sc.nextInt();
		Stack<Integer>stack = new Stack<Integer>();
		while(a>0)
		{
			stack.push(a % 2);
			a/=2;
		}
		while(!stack.isEmpty())
		{
			int b = stack.pop();
			System.out.print(b);
		}
	}
}
