package com.mycompany.libropoo;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        
    
Scanner sc = new Scanner(System.in);

    String tituloSc = sc.nextLine();
    String autorSc = sc.nextLine();
    int anoPublicacionSc = sc.nextInt();
    String generoSc = sc.next();

    Libro lectura = new Libro(tituloSc, autorSc, anoPublicacionSc, generoSc);

   
   
 
        System.out.println(lectura.mostrarInformacion());
        lectura.marcarLeido();
        System.out.println("el libro ha sido leido");    
        System.out.println(lectura.esAntiguo());


    }
}
