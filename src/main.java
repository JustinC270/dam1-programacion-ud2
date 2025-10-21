import utilidades.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        // ================================
        // EJERCICIO 1: Uso de atributos
        // ================================
        // 1. Intenta acceder directamente al atributo saldo:
        //    System.out.println(cuenta.saldo);
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
        

        // ================================
        // EJERCICIO 2: Métodos públicos
        // ================================
        // 1. Ingresa 100€ usando depositar().
        cuenta.depositar(100);
        // 2. Retira 30€ usando retirar().
        cuenta.retirar(30);
        // 3. Imprime el saldo con getSaldo().
        System.out.println("Saldo actual: " + cuenta.getSaldo() + "€");
        // Tu código aquí ↓
        

        // ================================
        // EJERCICIO 3: Métodos privados
        // ================================
        // 1. Intenta llamar al método registrarOperacion("Hackeo", 9999).
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
        

        // ================================
        // EJERCICIO 4: Libre
        // ================================
        // Puedes hacer pruebas adicionales con los métodos disponibles
        // para asegurarte de que comprendes la diferencia entre public y private.
        cuenta.depositar(50);
        cuenta.retirar(10);
        System.out.println("Saldo final: " + cuenta.getSaldo() + "€");
    }   
}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿por qué no puedo acceder al saldo directamente?
// Respuesta: ....................................................

// Ejercicio 2: ¿por qué sí puedo usar los métodos depositar(), retirar() y getSaldo()?
// Respuesta: ....................................................

// Ejercicio 3: ¿qué significa el error al intentar llamar a registrarOperacion()?
// Respuesta: ....................................................

// Ejercicio 4: 
// - ¿Qué ventajas tiene que saldo sea private?
// - ¿Qué pasaría si saldo fuera public?
// - ¿Por qué registrarOperacion es private en lugar de public?
// Respuesta: ....................................................
