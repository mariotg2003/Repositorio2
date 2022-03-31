package Estructurasdecontrol;

import java.util.*;
public class Estruc15 {
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        
        
        
        String frase, palabranueva="";
        int contadorpalabra=0, contador=0;
        
        System.out.println("Escribe una frase: ");
        frase=teclado.nextLine();
        
        while(frase.length()>contador){
            
            if (frase.charAt(contador)!=(' ')){
                palabranueva=palabranueva.concat(frase.substring(contador, contador+1));
                contador++;
            }else{
                contadorpalabra++;
                System.out.println(palabranueva);
                palabranueva="";
                contador++;   
            }
                
            if (contador==frase.length()){
                System.out.println(palabranueva);
                contadorpalabra++;
            }
           
            
        }
        
        
        
        System.out.println("Se han encontrado un total de " + contadorpalabra + " palabras en la frase");
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
