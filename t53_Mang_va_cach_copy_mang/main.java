package t53_Mang_va_cach_copy_mang;

import java.util.Arrays;

public class main 
{
	public static void main(String[] args) 
	{
		int array1[][] = new int[3][];
		for(int i = 1;i<=3;i++)
		{
			array1[i-1] = new int[i+1];
			for(int j = 0;j<=i;j++)
				array1[i-1][j]=j;
		}
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<array1[i].length;j++)
				System.out.print(array1[i][j] + " ");
			System.out.println();
		}
		
		//Các cách sao chép array
		
		/*
		 * Toán tử gán:
		 * -cả 2 mảng cùng tham chiếu tới 1 đối tượng mảng
		 * -khi thay đổi thì cả 2 đều thay đổi
		 */
		int apple[],orange[];
		apple = new int[] {1,2,3};
		orange = apple;
		apple[0]++;
		System.out.println(apple[0] + "\n" +orange[0]);
		
		/*
		 * Arraycopy
		 * -Hai biến mảng tham chiếu đến 2 đối tượng khác nhau
		 * -Khi thay đổi trên 1 mảng sẽ không ảnh hưởng tới mảng kia
		 */
		int banana[] = new int[apple.length];
		System.arraycopy(apple, 0, banana, 0, apple.length);
		apple[0]++;
		System.out.println(apple[0] + "\n" + banana[0]);
		
		/*
		 * Clone
		 * -2 mảng tham chiếu tới 2 đối tượng mảng khác nhau
		 * -thay đổi mảng này sẽ không ảnh hưởng tới mảng kia
		 */
		int watermelon[];
		watermelon = apple.clone();
		System.out.println(watermelon[0]);
		
		//in ra cả mảng
		System.out.println(Arrays.toString(banana));
	
	}
}
