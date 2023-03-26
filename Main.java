package ejercicioFile;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		
		/*
		 * Crea un programa que pida tres frases distintas al usuario, las guarde en un archivo de
		 * nombre “ejemplo.txt”. Finalmente ha de leer y mostrar por consola el contenido de “ejemplo.txt”
		 */
		
		// Creo la clase Scanner para interactuar con el usuario y recoger sus valores
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Rellene el archivo:");
		
		// Pido la primera frase
		System.out.println("Introduca la primera frase:");
		// Leo y guardo la primera clase usando el metodo nextLine();
		String frase1 = sc.nextLine();
		
		// Pido la segunda frase
		System.out.println("Introduce la segunda clase:");
		// Leo y guardo la segunda frase
		String frase2 = sc.nextLine();
		
		// Pido la tercera frase
		System.out.println("Introduce la tercera frase:");
		// Leo y guardo la tercera frase
		String frase3 = sc.nextLine();
		
		// Invoco al metodo escribirFichero() pasando por parametros las 3 variables que contienen el 
		// texto introducido por el usuario
		ManipularArchivos.escribirFichero(frase1, frase2, frase3);
		
		// Muestro el contenido del archivo por consola con el metodo leerArchivo()
		LeerArchivo.leerArchivo();
	}
	
	
	
	
	
	
	
	
	
	
}
