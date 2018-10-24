package ex1;
import java.util.Scanner;
public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Nhập vào một số (<10000):  ");
int n = sc.nextInt();

if(n>=10) {
	switch(n) {
		case 0: System.out.print("Không"); break;
		case 1: System.out.print("Một"); break;
		case 2: System.out.print("Hai"); break;
		case 3: System.out.print("Ba"); break;
		case 4: System.out.print("Bốn"); break;
		case 5: System.out.print("Năm"); break;
		case 6: System.out.print("Sáu"); break;
		case 7: System.out.print("Bảy"); break;
		case 8: System.out.print("Tám"); break;
		case 9: System.out.print("Chín"); break;
		case 10: System.out.print("Mười"); break;
	}	
}
else if(10<n && n<10000) {
	int a=n/1000;
	int b=n/100;
	int c=n/10;
	int d=n%10;
	String ngan, tram, chuc, donvi;
	switch(d) {
	case 0: donvi=" ";break;
	case 1: donvi="mốt";break;
	case 2: donvi="hai";break;
	case 3: donvi="ba";break;
	case 4: donvi="bốn";break;
	case 5: donvi="lăm";break;
	case 6: donvi="sáu";break;
	case 7: donvi="bảy";break;
	case 8: donvi="tám";break;
	case 9: donvi="chín";break;
	}
	switch(c) {
	case 0 : chuc = "không"; break;
	case 1 : chuc = "mười"; break;
	case 2 : chuc = "hai mươi"; break;
	case 3 : chuc = "ba mươi"; break;
	case 4 : chuc = "bốn mươi"; break;
	case 5 : chuc = "năm mươi"; break;
	case 6 : chuc = "sáu mươi"; break;
	case 7 : chuc = "bảy mươi"; break;
	case 8 : chuc = "tám mươi"; break;
	case 9 : chuc = "chín mươi"; break;
	}
	switch(b) {
	case 0 : tram = "không trăm"; break;
	case 1 : tram = "một trăm"; break;
	case 2 : tram = "hai trăm"; break;
	case 3 : tram = "ba trăm"; break;
	case 4 : tram = "bốn trăm"; break;
	case 5 : tram = "năm trăm"; break;
	case 6 : tram = "sáu trăm"; break;
	case 7 : tram = "bảy trăm"; break;
	case 8 : tram = "tám trăm"; break;
	case 9 : tram = "chín trăm"; break;
	}
	switch(a) {
	case 0 : ngan = " "; break;
	case 1 : ngan = "một nghìn"; break;
	case 2 : ngan = "hai nghìn"; break;
	case 3 : ngan = "ba nghìn"; break;
	case 4 : ngan = "bốn nghìn"; break;
	case 5 : ngan = "năm nghìn"; break;
	case 6 : ngan = "sáu nghìn"; break;
	case 7 : ngan = "bảy nghìn"; break;
	case 8 : ngan = "tám nghìn"; break;
	case 9 : ngan = "chín nghìn"; break;
	}
	string kq = ngan.concat(tram.concat(chuc.concat(donvi)));
	System.out.print(kq);
}
	}
}
