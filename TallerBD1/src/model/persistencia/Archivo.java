package model.persistencia;

import java.io.*;

public class Archivo {
	
	/*
	 * Ese Object se caracteriza por ser extremadamente amplio en su definicion.
	 */
	
	public void escribir(Object obj) throws IOException{
		File archivo = new File("Data/Datos.cps");
		FileOutputStream salida = new FileOutputStream(archivo);
        ObjectOutputStream salidaobjeto = new ObjectOutputStream(salida);
        salidaobjeto.writeObject(obj);
        salida.close();
	}
	
	/*
	 * 
	 */
	public Object leerarchivo()throws IOException, ClassNotFoundException {
		Object obj = null;
        File archivo = new File("Data/Datos.cps");
        FileInputStream entrada = new FileInputStream(archivo);
        try {
            ObjectInputStream entradaobjeto = new ObjectInputStream(entrada);
            obj = entradaobjeto.readObject();
        } catch (EOFException e) {
            entrada.close();
        }
        return obj;
	}
}
