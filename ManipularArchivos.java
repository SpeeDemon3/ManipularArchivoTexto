package ejercicioFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase con funciones para la creacion de un directorio
 * y manipulacion de un archivo de texto
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class ManipularArchivos {
	
	/**
	 * Funcion que comprueba si existe un directorio llamado "carpetaEjemplo" y si no existe lo crea
	 * @return -> Una variable de tipo File que contiene la ruta absoluta hasta el directorio
	 */
	public static File crearDirectorio() {
		
		// Obtengo la ruta absoluta hasta el proyecto
		String rutaProyecto = System.getProperty("user.dir");
		
		// Obtengo el separador que utiliza el sistema
		String separador = File.separator;
		
		// Creo la ruta hasta la carpetaEjemplo
		String rutaDirectorio = rutaProyecto + separador + "carpetaEjemplo";
		
		// Creo la carpeta si no existe
		File carpeta = new File(rutaDirectorio);
		
		if (!carpeta.exists()) { // Compruebo si exite el directorio con exists()
			carpeta.mkdir(); // Sin no exite se creara con mkdir
		}
		
		return carpeta;
	}
	

	/**
	 * Funcion que permite crear un archivo de texto llamado ejemplo y retorna la ruta absoluta hasta el documento
	 * @return -> Ruta absoluta hasta el documento
	 */
	public static String crearFichero() {
		
		// Asigno la ruta al directorio 
		File carpeta = crearDirectorio();
		
		// Obtengo la ruta absoluta del sistema del usuario
		String rutaProyecto = System.getProperty("user.dir");
		
		// Obtengo el separador que utiliza el sistema del usuario
		String separador = File.separator;
		
		// Creo la ruta absoluta hasta el documento
		String rutaAbsolutaArchivo = carpeta + separador + "ejemplo.txt";
		
		// Creo un objeto de tipo File al que le paso la ruta absoluta hasta el archivo
		File archivo = new File(rutaAbsolutaArchivo);
		
		// Controlando la excepcion que pueda ocurrir
		try {
			// Creo el archivo con createNewFile() 
			archivo.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return rutaAbsolutaArchivo; // Retorno la ruta absoluta hasta el archivo
		
	}
	
	/**
	 * Funcion para escribir sobre el fichero "ejemplo.txt"
	 * @param frase1 -> String con la primera linea
	 * @param frase2 -> String con la segunda linea
	 * @param frase3 -> String con la tercera linea
	 */
	public static void escribirFichero(String frase1, String frase2, String frase3) {
		
		// Genero un salto de linea del sistema operativo en el que 
		// se este ejecutado utilizando getProperty("line.separator)
		String saltoLinea = System.getProperty("line.separator");
	
		// Obetengo la ruta absoluta hasta el archivo
		String rutaAbsolutaArchivo = crearFichero();
		
		// Obtengo la ruta absoluta hasta el documento recibiendolo
		// de la funcion rutaAbsolutaArchivo() y lo guardo en una variable de tipo File
		File documento = new File(rutaAbsolutaArchivo);
		
		try {
			
			// Conecto el Stream al documento
			FileWriter fw = new FileWriter(documento);
			
			// Buffer para almacenar datos hacia el stream
			BufferedWriter bw = new BufferedWriter(fw);
			
			// Escribo la primera frase en el buffer y genero un salto de linea
			bw.write(frase1 + saltoLinea);
			
			// Escribo la segunda frase en el buffer y genero un salto de linea
			bw.write(frase2 + saltoLinea);
			
			// Escribo la tercera frase en el buffer y Genero un salto de linea
			bw.write(frase3);
			
			// Aseguro que se vacie el buffer y quede todo escrito
			bw.flush();
			
			// Cierro el buffer liberando recursos utilizados
			bw.close();
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
}
