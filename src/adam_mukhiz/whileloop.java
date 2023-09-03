package adam_mukhiz;
import java.util.Scanner;
public class whileloop {
	public static void main (String args[]) {
		Scanner adam = new Scanner(System.in);
		int total = 1000;
		int harga;
		int average;
		int hari = 0;
		while (hari <= 30) {
			harga = input.nextInt();
			total = total + harga;
			hari++;
		}
		average = total / 30;
		System.out.println("keuntungan saya sehari ialah " + average);			
	} 
}
