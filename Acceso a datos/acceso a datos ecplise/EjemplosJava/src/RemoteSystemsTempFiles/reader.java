package RemoteSystemsTempFiles;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public static void escribeFichero(FileWriter fw) throws IOException{
    //Escribimos en el fichero
    fw.write("Esto es una prueba");
}

public static void leeFichero(FileReader fr) throws IOException{
    //Leemos el fichero y lo mostramos por pantalla
    int valor=fr.read();
    while(valor!=-1){
        System.out.print((char)valor);
        valor=fr.read();
    }
}

public class reader {
	public static void main(String[] args) {
        try(FileReader fr=new FileReader("fichero1.txt");
            FileWriter fw=new FileWriter("fichero1.txt")){
            escribeFichero(fw);
            //Guardamos los cambios del fichero
            fw.flush();
            leeFichero(fr);
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
    }
}