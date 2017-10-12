package practica_gero;
import java.util.*;
import java.util.Scanner;
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Apuesta;
		int combinacion4;
		int i = 8;
		Apuesta = new int[i];
		
		Scanner sc = new Scanner(System.in);
		
		for (i=0;i<4;i++) {
			System.out.println("ingresa apuesta");
			Apuesta[i]=sc.nextInt();
			
		}
		combinacion4=(int) (Math.random() * Apuesta[i]);
		System.out.println(combinacion4);
		
		
	}

}
