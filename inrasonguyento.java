package ex1;
import java.util.Scanner;
public class inrasonguyento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i,a,b;
Scanner sc = new Scanner(System.in);
System.out.println("Bai tap in ra so nguyen to");
System.out.print("Nhap n: ");
n=sc.nextInt();
System.out.print("cac so tim duoc la: ");
for (a=2; a<=n; a++)
	{
	for(i=2; i<a; i++)
		if(a%i==0) break;
		else {b=a;
		System.out.print(" "+b);break;
	}
	}
}
}