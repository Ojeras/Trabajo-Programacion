import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, mayor=100, menor=0, suma=0, par=0, impar=0;
		
		Scanner sc = new Scanner (System.in);
		
		for (i=0; i < 10; i=i++){
			System.out.println("ingresa un numero");
			i = sc.nextInt();
			suma=i+i;
			if (i % 2==0) {
				par ++;
			}
			if (i% 2 != 0) {
				impar ++;
			}
		}
		for (i=0; i < 10; i=i++) {
			if (mayor < i) {
				mayor = i;
			}
			if (menor > i) {
				menor = i;
			}
		}
	System.out.println("la suma es: "+ suma);
	System.out.print("el mayor es: "+ mayor);
	System.out.println("el menor es: "+ menor);
	System.out.println("Los pares son: "+ par);
	System.out.println("Los impares son: "+impar);
	}

}
