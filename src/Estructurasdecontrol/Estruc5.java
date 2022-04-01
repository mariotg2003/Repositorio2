package Estructurasdecontrol;

import java.util.*;
public class Estruc5 {
    public static void main(String[] args) {
        
        String frase;
        
        int contador1=0, contador2;
        
        Scanner teclado=new Scanner (System.in);
        teclado.useDelimiter("\n");
        
        
        System.out.println("Escribe una frase: ");
        frase=teclado.next();
        
        System.out.println("Introduce el número de veces que quieres que aparezca por pantalla: ");
        contador2=teclado.nextInt();
        
        while(contador2>contador1){
            
            if (contador1%2 != 0){
                
                System.out.println(frase.toUpperCase());
                contador1++;
                
            }else{
                
                System.out.println(frase.toLowerCase());
                contador1++;
                
            }
            
        }
        
        
        
        
    }
}
