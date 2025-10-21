import utilidades.Cancion;
import utilidades.DemoMetodos;

public class TrabajandoConMetodos {
    public static void main(String[] args) {
        DemoMetodos method = new DemoMetodos();

        // ================================
        // EJERCICIO 1: Métodos void
        // ================================
        // 1. Llama al método saludar() de la clase DemoMetodos.
        // Tu código aquí ↓
            method.saludar();

        // ================================
        // EJERCICIO 2: Métodos con retorno
        // ================================
        // 1. Llama al método sumar(5, 3).
        // 2. Guarda el resultado en una variable e imprímelo.
        int resultadoSuma = method.sumar(5,3);
        System.out.println("Resultado de la suma: " + resultadoSuma);
        // 3. Llama al método presentar("Lucía") e imprime el resultado.
        // Tu código aquí ↓
        String mensaje = method.presentar("Lucia");
        System.out.println(mensaje);
        
       

        // ================================
        // EJERCICIO 3: Paso por valor (primitivos)
        // ================================
        // 1. Declara una variable int n = 10.
        int n = 10;
        // 2. Llama a method.incrementar(n).
        method.incrementar(n);
        // 3. Imprime n después de llamar al método.
        System.out.println("Valor de n despues de llamr a incrementar(): " + n);
        // Tu código aquí ↓


        // ================================
        // EJERCICIO 4: Paso por referencia (objetos)
        // ================================
        // 1. Crea un objeto Cancion con título "Original" - Usa el constructor parametrizado
        //  que recibe 2 argumentos: título y artista.
        Cancion cancion = new Cancion("Original", "Carlos");
        // 2. Llama a method.cambiarTitulo(cancion).
        method.cambiarTitulo(cancion);
        // 3. Imprime la canción después.
        System.out.println("Despues de cambiar el título: " + cancion);
        // Tu código aquí ↓

    }
}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿Qué ocurre al llamar a un método void como saludar()?
// Respuesta: ....................................................

// Ejercicio 2: ¿Qué diferencia hay entre un método void y uno con retorno?
// Respuesta: ....................................................

// Ejercicio 3: ¿Ha cambiado la variable n fuera del método incrementar()?
// ¿Por qué?
// Respuesta: ....................................................

// Ejercicio 4: ¿Qué ha ocurrido con el título de la Cancion al usar cambiarTitulo()?
// ¿Por qué es diferente al caso del int?
// Respuesta: ....................................................
