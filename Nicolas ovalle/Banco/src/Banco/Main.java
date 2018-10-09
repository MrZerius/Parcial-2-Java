package Banco;

import java.util.Scanner;

import Banco.Cheque_Ahorro;


public class Main {

	public static void main(String[] args) {
		
		
		int opcion;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seleccione una Opcion");
		System.out.println("1: Menu ");
		opcion = teclado.nextInt();
		switch(opcion)
		{ 
		case 1: Cheque_Ahorro c = new Cheque_Ahorro();
		break;
		
	//	case 2: saldo s= new saldo();
	//	break;
		
		default : System.out.println("La opcion seleccionada es incorrecta");
		}
	}

public void main() {
		
		
		int opcion;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seleccione una Opcion");
		System.out.println("1: Menu ");
		opcion = teclado.nextInt();
		switch(opcion)
		{ 
		case 1: Cheque_Ahorro c = new Cheque_Ahorro();
		break;
		
		
	//	case 2: saldo s = new saldo();
		}
	}
}

	


