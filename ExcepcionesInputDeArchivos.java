import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class ExcepcionesInputDeArchivos {
    public static void main(String args[]){
        File archivo = new File("entrada.txt");
        Scanner entrada = null;
        PrintWriter salida = null;
        try{
            entrada = new Scanner(archivo);
            salida = new PrintWriter("salida.txt");
            salida.println("a");
        }catch(FileNotFoundException e){
            System.err.println("error");
        }
        finally{
            if(entrada!=null){
                entrada.close();
            }
            salida.close();
        }
    }
}