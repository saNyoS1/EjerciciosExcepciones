import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio1{
    public static void main(String args[]){
        Scanner teclado= new Scanner(System.in);
        int a,b;
        try{
            System.out.println("Ingresa un numero: ");
            a=teclado.nextInt();
            System.out.println("Ingresa otro numero: ");
            b=teclado.nextInt();
            System.out.println(a+"/"+b+"="+(a/b));
        }catch (ArithmeticException e){
            System.out.println("error: "+e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("error");
        }
        teclado.close();
    }
}