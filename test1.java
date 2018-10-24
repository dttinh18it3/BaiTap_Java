package ex1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		float a,b,c,d,s,q,m,n;
		System.out.println("tim nghiem pt bac 2: ");
		System.out.print("a= ");
		a=key.nextFloat() ;
		System.out.print("b=");
		b=key.nextFloat();
		System.out.print("c=");
		c=key.nextFloat();
		s=-c/b;
		if(a==0)
			{if(b==0)
				{if(c==0) System.out.print("pt vo so nghiem");
				   else System.out.print("pt vo nghiem");}
		 	  else System.out.print("nghiem cua pt la:"+s);}
		else 
			{d=b*b-4*a*c;
			 if(d<0) System.out.print("phuong trinh vo nghiem");
			  else
				if(d==0) 
				{ q=-b/2*a;
			      System.out.print("phuong trinh co nghiem kep: " +q);
				}
				  else 
					  {m=(float)(-b+Math.sqrt(d))/2*a;
					   n=(float)(b-Math.sqrt(d))/2*a;
					   System.out.print("phuong trinh co 2 nghiem phan biet:"+m  +n);
					  }
		}}

}
