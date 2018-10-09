package Banco;

import java.util.Scanner;

public class Cheque_Ahorro {

	
	private static Scanner teclado;
	private static int cont=1;
	private static int opcion,n,x,num;
	private static int [] cuenta = new int[30];
	 private static String [] nombre = new String[30];
	 private static int [] saldo = new int[12];
	 private static int [] deposito = new int[12];
	 private static int [] retiro = new int[12]; 
	
	 static Main m = new Main();

	
	 
	public Cheque_Ahorro() {
		nombre[0] = "";

		int cuenta[] = new int[n];
		int saldo[] = new int[n];
		int deposito[] = new int[n];
		int retiro[] = new int[n];
		n=1;
		Cheque_Ahorro.menu_principal();
		
	
	}

	
	
	//menu 
		public static void menu_principal(){
			
		teclado = new Scanner(System.in);
		System.out.println("Menu Usuario: ");
		System.out.println("1.Crear Usuario ");
		System.out.println("2.Consultar Usuario ");
		System.out.println("3.Editar Saldo ");
		System.out.println("4.Regresar ");
		
		System.out.println("Opcion: ");
		opcion = teclado.nextInt();
		
		
		//funciones
		switch(opcion) {
		case 1:
			crear_usuario();
			break;
			
				
			
		case 2:
			consultar_usuarios();
			break;
			
			
		case 3:
			saldo();
			break;
			
		case 4:
				m.main();
			break;
			
		default : System.out.println("La opcion seleccionada es incorrecta");
			
		}
		
		}

		
	
		public static void crear_usuario() {
			teclado = new Scanner(System.in);
			System.out.println("Cuantos usuarios desea registrar ");
			num = teclado.nextInt();
			System.out.println("\n");
			for(n=1;n<=num;n++){
				teclado.nextLine();
				System.out.println(n+" Digite la cuenta: ");
				cuenta[n] = teclado.nextInt();
				System.out.println("\n");
				System.out.println(n+" Digite el Nombre: ");
				nombre[n] = teclado.next();
				System.out.println("\n");
				System.out.println(n+" Digite el saldo con el que se abrira la cuenta: ");
				saldo[n] = teclado.nextInt();
				System.out.println("\n");
			
			}
			
			Cheque_Ahorro.menu_principal();
			
		}
		
		public static void consultar_usuarios(){
			
			for(n=cont;n<cont+num;n++){
				teclado.nextLine();
				System.out.println("cliente numero:  "+(n));
				System.out.println("cuenta: "+cuenta[n]);
				System.out.println("Nombre: "+nombre[n]);
				System.out.println("saldo: "+saldo[n]);
				
				System.out.println("\n");
			}
			
			Cheque_Ahorro.menu_principal();
			
		}
		
		public static void saldo() {
			
			int deposito;
			int retiro;
			int saldo1 = 0;
			
			System.out.println("Seleccione una opcion ");
			System.out.println("1. Agregar saldo ");
			System.out.println("2. Retirar saldo ");
			System.out.println("Opcion: ");
			opcion = teclado.nextInt();
			
			switch(opcion) {
			
			case 1: 
				System.out.println("Digite la cantidad depositada ");
				deposito = teclado.nextInt();
				System.out.println("\n");
				
				saldo[n] = saldo1;
				saldo[n] = saldo1 + deposito;
			break;
			
			case 2: 
				System.out.println("Digite la cantidad extraida ");
				retiro = teclado.nextInt();
				System.out.println("\n");
				
				saldo[n] = saldo1;
				saldo[n] = saldo1 - retiro;
			
			}
		
		
		Cheque_Ahorro.menu_principal();
		
		}

}
