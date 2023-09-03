package adam_mukhiz;
import java.util.Scanner;
public class calculator2 {
	public static void main (String args[]) {
		Scanner adam = new Scanner (System.in);
		int nomborpertama,nomborkedua,jawapan;
		System.out.println("nombor pertama: ");
		nomborpertama = adam.nextInt();
		System.out.println("nombor kedua: ");
		nomborkedua = adam.nextInt();
		jawapan = nomborpertama + nomborkedua;
		System.out.println(jawapan);
		
		
	}
}
