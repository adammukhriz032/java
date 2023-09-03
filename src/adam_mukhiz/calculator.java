package adam_mukhiz;
import java.util.Scanner;
public class calculator {
	public static void main(String args[]) {
		Scanner adam = new Scanner (System.in);
		double nomborpertama,nomborkedua,jawapan;
		System.out.println("nombor pertama: ");
		nomborpertama = adam.nextDouble();
		System.out.println("nombor kedua: ");
		nomborkedua = adam.nextDouble();
		jawapan = nomborpertama / nomborkedua;
		System.out.println(jawapan);
	}
}
