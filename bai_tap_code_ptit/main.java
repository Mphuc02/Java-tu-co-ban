package bai_tap_code_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

class Nguoi implements Comparable<Nguoi>
{
	private String tenFull = "",
				   ten,
				   arrTen[];
	
	public Nguoi(String s)
	{
		arrTen = s.trim().split("\\s+");
		for(int i = 0;i < arrTen.length; i++)
		{
			arrTen[i] = Character.toString( arrTen[i].charAt(0)).toUpperCase() + arrTen[i].substring(1).toLowerCase();
			tenFull += arrTen[i] + " ";
		}
		tenFull = tenFull.trim();
		ten = arrTen[arrTen.length-1];
	}
	

	public String getTen() 
	{
		return ten;
	}

	public String[] getArrTen() 
	{
		return arrTen;
	}

	@Override
	public int compareTo(Nguoi o) 
	{
		String temp[] = o.getArrTen();
		if(ten.compareTo(o.getTen()) != 0)
			return ten.compareTo(o.getTen());
		for(int i = 0;i<arrTen.length-1;i++)
		{
			int m = arrTen[i].compareTo(temp[i]);
			if(m != 0)
				return m;
		}
		return 0;
	}
	
	@Override
	public String toString()
	{
		return tenFull;
	}
}

public class main
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner sc = new Scanner(new File("D:\\Learning\\jav\\123\\src\\bai_tap_code_ptit\\DATA.txt"));
		ArrayList<Nguoi> N = new ArrayList<>();
		while(sc.hasNextLine())
		{
			N.add(new Nguoi(sc.nextLine()));
		}
		Collections.sort(N);
		for(Nguoi i: N)
		{
			System.out.println(i);
		}
 	}
}