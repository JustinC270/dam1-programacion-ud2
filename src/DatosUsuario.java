import java.util.Scanner;

import utilidades.ProcesadorTexto;

public class DatosUsuario {
 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Tu nombre es: " );
         String nombre = sc.nextLine();
         System.out.println("Tu edad: " );
         int edad = sc.nextInt();
         System.out.println("Tu email:"  );
         String correo = sc.nextLine();
         String gmail = sc.nextLine();
         boolean emailValido = ProcesadorTexto.esEmailValido(gmail);
         if(emailValido){
            System.out.println("Tu email es válido");
         }else{
            System.out.println("Tu email NO es válido");
         }
            sc.close();
        }
}


