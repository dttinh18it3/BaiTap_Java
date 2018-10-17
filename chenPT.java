package test;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class chenPT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NHẬP MẢNG
				int i;
				Scanner input= new Scanner(System.in);
				System.out.print("So phan tu cua mang: ");
				int n=input.nextInt();
				int[] a= new int[n];
				int[] b= new int[n+1];
				for(i=0;i<a.length;i++)
				{
					System.out.print("a["+i+"]:");
					a[i]=input.nextInt();
				}
		//CHÈN PHẦN TỬ
				System.out.print("Nhap Vi Tri Can Chen k=");
				int k=input.nextInt();
				if(k>n) System.out.print("ban da nhap sai. Moi ban nhap lai");
				else System.out.print("Nhap X:");
					int x=input.nextInt();
					for(i=0;i<k;i++)
					{
						b[i]=a[i];
					}
					b[k]=x;
					for(i=k+1;i<=b.length-1; i++)
					{
						b[i]=a[i-1];
					}
		//IN MẢNG MỚI
				System.out.println("Mang Sau Khi Chen");
				for(i=0;i<=b.length;i++)
				{
					System.out.print(" "+b[i]);
				}
	}

}
