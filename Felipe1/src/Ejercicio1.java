import java.util.Scanner;
import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0, num1 = 0, num2 = 0, suma = 0, resta = 0, mult = 0, div = 0;
		double pot = 0, raiz=0;
		boolean salir = true;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("ingresa una opcion");
			System.out.println("suma---> 1");
			System.out.println("resta---> 2");
			System.out.println("multiplicacion---> 3");
			System.out.println("division---> 4");
			System.out.println("potencia---> 5");
			System.out.println("raiz cuadrada---> 6");
			System.out.println("salir---> 7");
		
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("ingresa el primer numero");
				num1 = sc.nextInt();
				System.out.println("ingresa el segundo numero");
				num2 = sc.nextInt();
				suma = num1 + num2;
				System.out.println("el resultado es: " + suma);
				break;
			case 2:
				System.out.println("ingresa el primer numero");
				num1 = sc.nextInt();
				System.out.println("ingresa el segundo numero");
				num2 = sc.nextInt();
				resta = num1 - num2;
				System.out.println("el resultado es: " + resta);
				break;
			case 3:
				System.out.println("ingresa el primer numero");
				num1 = sc.nextInt();
				System.out.println("ingresa el segundo numero");
				num2 = sc.nextInt();
				mult = num1 * num2;
				System.out.println("el resultado es: " + mult);
				break;
			case 4:
				System.out.println("ingresa el primer numero");
				num1 = sc.nextInt();
				System.out.println("ingresa el segundo numero");
				num2 = sc.nextInt();
				div = num1 / num2;
				System.out.println("el resultado es: " + div);
				break;
			case 5:
				System.out.println("ingresa el primer numero");
				num1 = sc.nextInt();
				System.out.println("ingresa el exponente");
				num2 = sc.nextInt();
				pot = Math.pow(num1, num2);
				System.out.println("el resultado es: " + pot);
				break;
			case 6:
				System.out.println("ingresa el numero que quieras para la raiz cuadrada.");
				num1 = sc.nextInt();
				raiz=Math.sqrt(num1);
				System.out.println("el resultado es: " + raiz);
				break;
			
			case 7:
				System.out.println("gracias por usar la calculadora :3");
				System.out.println("apagando...");
				System.out.println("Apagado.");
				salir = false;
				break;
			}

		} while (salir == true);

	}

}
