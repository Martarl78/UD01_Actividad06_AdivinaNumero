fun main() {
    // Número aleatorio entre 1 y 100 (no se muestra al usuario)
    val numeroSecreto = (1..100).random()

    // Contador de intentos
    var intentos = 0
    var acertado = false

    println("=== ADIVINA EL NÚMERO ===")
    println("He pensado un número entre 1 y 100. ¡Intenta adivinarlo!")

    // El programa no termina hasta acertar
    while (!acertado) {
        // Fase 3: entrada de datos
        print("Introduce un número entre 1 y 100: ")
        val entrada = readLine()
        val numero = entrada?.trim()?.toIntOrNull()

        // Validaciones (no numérico, negativo, fuera de rango)
        if (numero == null) {
            println("Error: debes introducir un número entero válido.")
        } else if (numero < 1 || numero > 100) {
            println("Error: el número debe estar entre 1 y 100.")
        } else {
            // Solo los intentos válidos cuentan
            intentos++

            // Comparación del intento
            when {
                numero < numeroSecreto -> println("El número secreto es mayor.")
                numero > numeroSecreto -> println("El número secreto es menor.")
                else -> {
                    println("¡Correcto! Has adivinado el número.")
                    acertado = true
                }
            }
        }
    }

    // Mensaje del final
    if (intentos == 1) {
        println("Has adivinado el número en 1 intento.")
    } else {
        println("Has adivinado el número en $intentos intentos.")
    }
}