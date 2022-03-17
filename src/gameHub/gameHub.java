//Game Hub.
//Un centro de pequeños juegos desarrollados por Diego Calatayud y Javier Egido.
package gameHub;
import games.*;
import java.util.*;

public class gameHub
{
	//Definición de atributos.
	private static Scanner scan = new Scanner(System.in);

	//Definición de constantes de color y fuentes.
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_YELLOW = "\033[1;33m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_CYAN = "\033[0;36m";
	public static final String HIGH_INTENSITY = "\u001B[1m";
	public static final String LOW_INTENSITY = "\u001B[2m";
	public static final String ANSI_RESET = "\u001B[0m";


	//MAIN
	public static void main(String[] args)
	{
		//Muestra el banner del inicio
		bannerInicio();

		//Menú
		menu(args);
	}

	public static void menu(String args[])
	{
		//Definición de variables
		int op=0;

		System.out.print(ANSI_RESET+ANSI_WHITE);

		while(true)
		{
			System.out.println("\n¿A qué te apetece jugar hoy?");
			System.out.print("   1-.Tres En Java\n   2-.Wordle De Hacendado\n   3-.MataVise\n   0-.Salir\n Selecciona una opción: ");
			op = scan.nextInt();
			switch(op)
			{
				case 1:System.out.println("\nIniciando Tres en Java...");cls();tresEnJava.main(args);cls();bannerInicio();break;
				case 2:System.out.println("\nIniciando Wordle...");cls();wordle.main(args);cls();bannerInicio();break;
				case 3:System.out.println("\nIniciando Matavise...");/*mataVise.main(args)*/;break;
				case 0:System.exit(0);break;
				default:System.out.println("\nIntroduce un número valido porfa.");;
			}
		}
	}

	public static void cls()
	{
		System.out.print("\033[H\033[2J");  
		System.out.flush(); 
	}

	public  static void bannerInicio()
	{
		System.out.println(ANSI_WHITE + HIGH_INTENSITY);
		System.out.println(" ██████╗  █████╗ ███╗   ███╗███████╗    ");
		System.out.println("██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ");
		System.out.println("██║  ███╗███████║██╔████╔██║█████╗      ");
		System.out.println("██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ");
		System.out.println("╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ");
		System.out.println(" ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝    ");
		System.out.println("				██╗  ██╗██╗   ██╗██████╗ ");
		System.out.println("				██║  ██║██║   ██║██╔══██╗");
		System.out.println("				███████║██║   ██║██████╔╝");
		System.out.println("				██╔══██║██║   ██║██╔══██╗");
		System.out.println("				██║  ██║╚██████╔╝██████╔╝");
		System.out.println("				╚═╝  ╚═╝ ╚═════╝ ╚═════╝ ");
		System.out.print(ANSI_RESET);

		System.out.println(ANSI_WHITE);
		System.out.println("🎮 ¡Bienvenido a GAME-HUB! 🎮");
		System.out.println("Disfruta de una variada colección de juegos desarrollados en los ratos muertos.");
	}
}
