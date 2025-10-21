import java.util.Scanner;

import utilidades.ProcesadorTexto;

public class DatosUsuario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tu nombre es: ");
        String nombre = sc.nextLine();
        System.out.println("Tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Tu email:");

        String correo = sc.nextLine();
        boolean emailValido = ProcesadorTexto.esEmailValido(correo);
        if (emailValido) {

            System.out.println("El usuario si puede ser creado porque es válido");
        } else {
            System.out.println("El usuario no puede ser creado porque no es válido");
        }

        sc.close();
    }
}

  
 