package t42_Ghi_de_phuong_thuc;

public class main {
	public static void main(String[] args) 
	{
		//Các phương thức static sẽ không thể bị ghi đè
		//Nếu muốn ngăn ghi đề 1 phương thức thì thêm từ khoá final vào sau public/private và trước void/int/float/...
		animal animal = new animal("4_chan");
		animal.eat();
		animal.makeSound();
		
		dog dog = new dog();
		dog.eat();
		dog.makeSound();
		
		catt catt = new catt();
		catt.eat();
		catt.makeSound();
	}
}
