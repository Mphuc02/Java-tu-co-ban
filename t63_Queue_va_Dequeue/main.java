package t63_Queue_va_Dequeue;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import t61_bai_tap_quan_ly_sinh_vien_bang_ArayLists.DS_SV;

public class main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//queue
		Queue<String> danhSachSV = new LinkedList<String>();
		danhSachSV.offer("Titv 1");
		danhSachSV.offer("Nguyen Van A");
		danhSachSV.offer("Nguyen Van B");
		danhSachSV.offer("TITV 2");
		
		while(!danhSachSV.isEmpty())
		{
			String tenString = danhSachSV.poll(); //lay ra nhung khong xoa
			System.out.println(tenString);
		}
		
		
		//priority_queue
		Queue<String> p_danhSachSV = new PriorityQueue<String>();
		
		p_danhSachSV.offer("Nguyen Van B");
		p_danhSachSV.offer("Nguyen Van A");
		p_danhSachSV.offer("TITV 2");
		p_danhSachSV.offer("TITV 1");
		while(!p_danhSachSV.isEmpty())
		{
			String tenString = p_danhSachSV.poll(); //lay ra nhung khong xoa
			System.out.println(tenString);
		}
		
		//Dequeue
		Deque<String> d_danhSachSV = new ArrayDeque<String>();
		d_danhSachSV.offer("Titv 1");
		d_danhSachSV.offer("Nguyen Van A");
		d_danhSachSV.offer("Nguyen Van B");
		d_danhSachSV.offer("TITV 2");
		d_danhSachSV.offerLast("TITV 4");
		d_danhSachSV.offerFirst("TITV 0");
		
		while(!d_danhSachSV.isEmpty())
		{
			String tenString = d_danhSachSV.poll(); //lay ra va xoa
			System.out.println(tenString);
		}
	}
}
