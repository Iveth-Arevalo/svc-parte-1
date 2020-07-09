
package ClaudiaGarcia;

import java.util.Scanner;

public class BienvenidosNom {
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre=sc.nextLine();
  
        System.out.println("Bienvenido "+nombre);
    }
    
}
