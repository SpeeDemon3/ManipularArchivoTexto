package ejercicioFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author speedemon -> Antonio Ruiz Benito
 *
 */
public class LeerArchivo {
	
	/**
	 * Fucion para leer un archivo de texto linea a linea
	 */
	public static void leerArchivo() {
		
		// Creo una variable con la ruta absoluta hasta el fichero con el uso de la funcion crearFichero()
		String rutaAbsolutaArchivo = ManipularArchivos.crearFichero();
		
		// Creo un objeto File para gestionar la informacion del archivo pasandole por parametro la
		// la variable que contiene la ruta hasta el archivo
		File archivo = new File(rutaAbsolutaArchivo);
		
		try {
			// Conecto el Stream al archivo
			FileReader fr = new FileReader(archivo);

			// Buffer al que le paso la variable para almacenar lo datos
			BufferedReader br = new BufferedReader(fr);
			
			System.out.println("Mostrando archivo:");
			
			// Leo las lineas del documento con un bucle for
			for(String linea = br.readLine(); linea != null; linea = br.readLine()) {
				System.out.println(linea); // Muestro el texto leido linea a linea
			}
			
			// Cierro el buffer liberando los recursos utilizados
			br.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
