package ex1;
import java.util.Scanner;
import java.util.Arrays;
public class mang1chieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khai báo mảng
Scanner sc = new Scanner(System.in);
System.out.print("Nhập chiều dài mảng: ");
int length = sc.nextInt();
int[] Mang = new int[length];
for(int i=0; i<length; i++)
{
	System.out.printf("Phần tử %d : " ,i);
	Mang[i]=sc.nextInt();
	sc.nextLine();
}
	System.out.printf("Mảng của bạn là: ");
	for(int n: Mang)
	{
		System.out.print(n+" ");
	}
	sc.nextLine();
	
	//sum, min, max
	int sum=0, min=Mang[0], max=Mang[0];
	for(int i=0 ; i<length; i++)
	{
		sum=sum+Mang[i];
		if(min>Mang[i]) min=Mang[i];
		if(max<Mang[i]) max=Mang[i];
	}
	System.out.printf("Tổng các phần tử là: %d %n", +sum);
	System.out.printf("Phần tử nhỏ nhất: %d  %n", +min);
	System.out.print("Phần tử lớn nhất là: "+max);
	sc.nextLine();
	
	
	//Sắp xếp
	System.out.print("Thứ tự tăng dần: ");
	Arrays.sort(Mang);
	System.out.print(Arrays.toString(Mang) );
	sc.nextLine();
	
	System.out.print("Thứ tự giảm dần: ");
	for(int i=0; i<length-1;i++)
		for(int j=i+1; j<length; j++)
	{
		if(Mang[j]<Mang[i])
		{
			int t=Mang[i];
			Mang[i]=Mang[j];
			Mang[j]=t;
		}
		for( int r=0;r<length;r++)
			{
		System.out.print(Mang[i]+" ");
			}
	}
	
	
	}

}
