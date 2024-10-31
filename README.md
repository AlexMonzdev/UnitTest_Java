# FizzBuzz con Pruebas Unitarias en Java

Este proyecto es una implementación básica del clásico ejercicio FizzBuzz en Java, acompañado de pruebas unitarias escritas con JUnit 5 para demostrar el uso de técnicas de unit testing. Este ejemplo fue desarrollado para mostrar habilidades en pruebas de software, asegurando que cada caso de uso del método FizzBuzz esté correctamente cubierto.

## Descripción del Proyecto

El proyecto incluye una clase `Fizzbuzz` con un método `checkNumber(int number)`, que sigue las reglas de FizzBuzz:

- Si el número es divisible por 3, devuelve `"Fizz"`.
- Si el número es divisible por 5, devuelve `"Buzz"`.
- Si el número es divisible por 3 y 5, devuelve `"FizzBuzz"`.
- Si el número no es divisible ni por 3 ni por 5, devuelve el número como una cadena.

### Clase Fizzbuzz

La clase `Fizzbuzz` está contenida en el paquete `com.alexmonzon` y ofrece un método `checkNumber(int number)` para cumplir con la lógica de FizzBuzz. Este método está diseñado para ser lo más simple y eficiente posible, retornando la cadena correspondiente según la divisibilidad del número ingresado.

### Implementación de Unit Testing

Las pruebas unitarias están implementadas en la clase `FizzBuzzTest` y verifican el correcto funcionamiento de cada caso en el método `checkNumber`. Estas pruebas aseguran que los resultados sean los esperados bajo diversas condiciones, siguiendo las buenas prácticas de pruebas unitarias:

- **Pruebas de Valores Divisibles por 3:** Verifican que se devuelva `"Fizz"` cuando el número es divisible por 3.
- **Pruebas de Valores Divisibles por 5:** Verifican que se devuelva `"Buzz"` cuando el número es divisible por 5.
- **Pruebas de Valores Divisibles por 3 y 5:** Verifican que se devuelva `"FizzBuzz"` cuando el número es divisible por ambos 3 y 5.
- **Pruebas de Valores No Divisibles ni por 3 ni por 5:** Aseguran que, en estos casos, se devuelva el número en forma de cadena.

#### Ejemplo de una Prueba Unitaria

El siguiente código muestra un ejemplo de prueba unitaria donde se verifica que el método `checkNumber` devuelva `"Fizz"` cuando el número es divisible por 3.

```java
@Test
@DisplayName("Test si el número es divisible por 3")
void test_whenTheNumberIsDivisibleByThree_thenReturnFizz() {
    // Given
    Fizzbuzz fizzbuzz = new Fizzbuzz();
    
    // When
    String result = fizzbuzz.checkNumber(9);
    
    // Then
    assertEquals("Fizz", result);
}
```

Cada prueba sigue una estructura `Given-When-Then`:

1. **Given**: Preparación del objeto `Fizzbuzz`.
2. **When**: Llamada al método `checkNumber` con el número de prueba.
3. **Then**: Verificación del resultado con el valor esperado usando `assertEquals`.

## Estructura del Proyecto

```
src/
├── main/
│   └── java/
│       └── com/
│           └── alexmonzon/
│               └── Fizzbuzz.java
└── test/
    └── java/
        └── com/
            └── alexmonzon/
                └── FizzBuzzTest.java
```

## Cómo Ejecutar las Pruebas

1. Clona el repositorio y navega al directorio del proyecto.
2. Asegúrate de tener JUnit 5 configurado en tu entorno.
3. Ejecuta las pruebas utilizando tu IDE o el siguiente comando de Maven (si está configurado):

   bash
   mvn test
   
## Conclusión

Este ejercicio demuestra mi habilidad para aplicar unit testing en Java mediante JUnit 5, asegurando la correcta funcionalidad de un método simple en todos los casos posibles. Este tipo de pruebas son fundamentales para garantizar la calidad y confiabilidad del código, especialmente en proyectos más complejos.

```
