import java.util.Scanner;
/**
 * Clase que calcula el número mayor y menor de 
 * tres números introducidos por teclado
 * @author Jose Albaladejo Macia
 * @version 1.0.0
 * @since 20/12/2020
 */
public class Prop03_Ejer01 {
    
    /**
     * Calcula el mayor número
     * @param a Primer número
     * @param b Segundo número
     * @param c Tercer número
     * @return Número mayor
     */
    public static int esMayor(int a, int b, int c){
        int ma=a;
        if(b>ma){
            ma=b;
        }
        if(c>ma){
            ma=c;
        }
        return ma;
    }
    
    /**
     * Calcula el menor número
     * @param a Primer número
     * @param b Segundo número
     * @param c Tercer número
     * @return Número menor
     */
    public static int esMenor(int a, int b, int c){
        int me=a;
        if(b<me){
            me=b;
        }
        if(c<me){
            me=c;
        }
        return me;
    }
    
    /**
     * Pide los tres números y llama a los métodos para
     * después sacar el resultado por pantalla
     * @param args 
     */
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        int mayor=0;
        int menor=0;
        boolean correcto=false;//true si números introducidos son correctos
        String continua="si";//repite el programa mientras se introduzca si
        Scanner lee = new Scanner(System.in);
        
        while(continua.equals("si")){
            
            while(correcto==false){
                System.out.print("Introduce el primer número: ");
                if(lee.hasNextInt()){
                    a=lee.nextInt();
                    correcto=true;
                }
                else{
                    System.out.println("Error. Debes introducir un número entero.");
                    lee.next();
                }
            }
            correcto=false;//reiniciamos para el siguiente dato
            
            while(correcto==false){
                System.out.print("Introduce el segundo número: ");
                if(lee.hasNextInt()){
                    b=lee.nextInt();
                    correcto=true;
                }
                else{
                    System.out.println("Error. Debes introducir un número entero.");
                    lee.next();
                }
            }
            correcto=false;//reiniciamos para el siguiente dato
            
            while(correcto==false){
                System.out.print("Introduce el tercer número: ");
                if(lee.hasNextInt()){
                    c=lee.nextInt();
                    correcto=true;
                }
                else{
                    System.out.println("Error. Debes introducir un número entero.");
                    lee.next();
                }
            }
            correcto=false;//reiniciamos para el siguiente dato

            System.out.println();
            mayor=esMayor(a, b, c);
            menor=esMenor(a, b, c);

            System.out.println("El mayor es: "+mayor);
            System.out.println("El menor es: "+menor);
            System.out.println();
            
            lee.nextLine();
            while(correcto==false){//pide si continuar para repetir el programa
                System.out.print("¿Quieres continuar? (si/no): ");
                if(lee.hasNext()){
                    continua=lee.nextLine().toLowerCase();
                    if(continua.equals("si") || continua.equals("no")){
                        correcto=true;
                    }
                }
                else{
                    System.out.println("Debes escribir si o no.");
                    lee.next();
                }
            }
            correcto=false;
            
            System.out.println();
        }
    }
    
}
