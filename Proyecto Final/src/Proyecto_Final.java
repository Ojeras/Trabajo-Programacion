import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Proyecto_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables

		int[] Apuesta;
		int bolilla_extra;
		int[]combinacion1,combinacion2,combinacion3,combinacion4;
		boolean cuatro_bolillas_extra = false;
		int i = 8;
		int aciertos=0;
		int n = 0;
		int random = 0;
		Apuesta = new int[i];
		combinacion1=new int[i];
		combinacion2=new int[i];
		combinacion3=new int[i];
		combinacion4=new int[i];
		int valorsimple=20,valorrevancha=30,valormultiple1=0,valormultiple2=0,valormultiple3=0,valormultiple4=0;
		int combinacion=0;
		int apuesta_simple, apuesta_multiple,solo_5_oro, oro_revancha, opcion,opcion2=0,opcion3=0;
		//HOLA
		// inicialisiacion de Random y Scanner

		Random rnd = new Random();
		Random bolilla=new Random();
		Random comb1=new Random();
		Random comb2=new Random();
		Random comb3=new Random();
		Random comb4=new Random();
		Scanner sc = new Scanner(System.in);

		//opciones
		System.out.println("ingresa una opcion");
		System.out.println("apuesta simple -----> 1");
		System.out.println("apuesta multiple -----> 2");
		opcion=sc.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("ingresa una opcion");
			System.out.println("solo 5 de oro -----> 1");
			System.out.println("5 de oro y revancha ------> 2");
			opcion2=sc.nextInt();
			switch (opcion2) {
			case 1:
				System.out.println("elegiste solo 5 de oro");
				for (i = 0; i < 5; i++) {
					System.out.println("ingresa tu apuesta");
					Apuesta[i] = sc.nextInt();
				}
				System.out.println("el valor de la apusta es de: "+valorsimple);
				break;
			case 2:
				System.out.println("elegiste 5 de oro y revancha");
				System.out.println("esta apuesta sirve para los dos pozos");
				for (i = 0; i < 5; i++) {
					System.out.println("ingresa tu apuesta");
					Apuesta[i] = sc.nextInt();
				}
				System.out.println("el valor de la apuesta es de: "+valorrevancha);
			}
				break;
		case 2:
			System.out.println("elegiste la apuesta multiple");
			System.out.println("elige cuantos numeros quieres");
			System.out.println("6 numeros -----> 1");
			System.out.println("7 numeros-----> 2");
			System.out.println("8 numeros----->3");
			System.out.println("4 numeros----->4");
			opcion3=sc.nextInt();
			switch (opcion3) {
			case 1:
				System.out.println("elige 6 numeros");
				System.out.println("con estos numeros se conformaran 6 combinaciones de 5 numeros cada una");
				for (i = 0; i < 6; i++) {
					System.out.println("ingresa tu apuesta");
					Apuesta[i] = sc.nextInt();
				}
				for (i=0;i<6;i++) {
					combinacion1[i]=(int) (Math.random() * i);
				}
				System.out.println(combinacion1[i]);
				valormultiple1=valorsimple*6;
				System.out.println("el valor es de:"+valormultiple1);
				break;
			case 2:
				System.out.println("elige 7 numeros");
				System.out.println("con estos numeros se conformaran 21 combinaciones de 5 numeros cada una");
				for (i = 0; i < 7; i++) {
					System.out.println("ingresa tu apuesta");
					Apuesta[i] = sc.nextInt();
					
				}
				for (i=0;i<21;i++) {
					combinacion2[i]=(int) (Math.random() * i);
				}
				System.out.println(combinacion2);
				valormultiple2=valorsimple*21;
				System.out.println("el valor es de: "+valormultiple2);
				break;
			case 3:
				System.out.println("elige 8 numeros");
				System.out.println("con estos numeros se conformaran 56 combinaciones de 5 numeros cada una");
				for (i = 0; i < 8; i++) {
					System.out.println("ingresa tu apuesta");
					Apuesta[i] = sc.nextInt();
				
				}
				for (i=0;i<56;i++) {
					combinacion3[i]=(int) (Math.random() * i);
				}
				System.out.println(combinacion3);
				valormultiple3=valorsimple*56;
				System.out.println("el valor es de: "+valormultiple3);
				break;
			case 4:
				System.out.println("elige 4 numeros");
				System.out.println("con estos numeros se conformaran 4 combinaciones de 5 numeros cada una");
				for (i = 0; i < 4; i++) {
					System.out.println("ingresa tu apuesta");
					Apuesta[i] = sc.nextInt();
					
				}
				for (i=0;i<4;i++) {
					combinacion4[i]=(int) (Math.random() * Apuesta[i]);
					System.out.println(combinacion4);
				}
				
				valormultiple4=valorsimple*4;
				System.out.println("el valor es de:"+valormultiple4);
				break;
			}
			
				
		}
		
		
		// Estructura For

		
		
		for (i = 0; i < 5; i++) {
			random = (int) (Math.random() * 48) + 1;
			System.out.println(random);
		}
		System.out.print("bolilla extra: ");
		bolilla_extra=(int)(Math.random()*48);
		System.out.println(bolilla_extra);
		// Estructura if

		if (Apuesta[0] == random) {
			System.out.println("no ganaste nada");
		}
		else if (Apuesta[0] == random && Apuesta[1]==random) {
			aciertos=2;
			System.out.println("ganaste $30");
			System.out.println("acertaste: "+aciertos+ "numeros");
		}
		else if (Apuesta[0] == random && Apuesta[1]==random && Apuesta[2]==random) {
			aciertos=3;
			System.out.println("ganaste $200");
			System.out.println("acertaste: "+aciertos+ "numeros");
		}
		else if (Apuesta[0] == random && Apuesta[1]==random && Apuesta[2]==random && Apuesta[3]==random ) {
			aciertos=4;
			System.out.println("ganaste $4000");
			System.out.println("acertaste: "+aciertos+ "numeros");
		}
		else if (Apuesta[0] == random && Apuesta[1]==random && Apuesta[2]==random && Apuesta[3]==random && Apuesta[3]==bolilla_extra || Apuesta[2]==bolilla_extra || Apuesta[1]==bolilla_extra || Apuesta[0]==bolilla_extra) {
			aciertos=4;
			System.out.println("ganaste el pozo de Plata");
			System.out.println("acertaste: "+aciertos+ "numeros y la bolilla extra");
		}
		else if (Apuesta[0] == random && Apuesta[1]==random && Apuesta[2]==random && Apuesta[3]==random && Apuesta[4]==random) {
			aciertos=5;
			System.out.println("ganaste el pozo de Oro!");
			System.out.println("acertaste: "+aciertos+ "numeros");
		}
		else {
			System.out.println("no acertaste ninguno");
		}
		
	}
}
