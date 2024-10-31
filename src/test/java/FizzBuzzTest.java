import com.alexmonzon.Fizzbuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("Test si el numero es divisible por 3")
    void test_whenTheNumberIsDivisibleByThree_thenReturnFizz(){
        // Given
            Fizzbuzz fizzbuzz = new Fizzbuzz();
        // When
        String result = fizzbuzz.checkNumber(9);
        // Then
        assertEquals("Fizz", result);
    }
    @Test
    @DisplayName("Test si el numero es divisible por 5")
    void test_whenTheNumberIsDivisibleByFive_thenReturnBuzz(){
        //Give
            Fizzbuzz fizzbuzz = new Fizzbuzz();
        //When
        String result = fizzbuzz.checkNumber(20);
        //Then
        assertEquals("Buzz", result);
    }
    @Test
    @DisplayName("Test si el numero es divisible por 3 y por 5")
    void test_whenTheNumberIsDivisibleByFiveAndThree_thenRetrunFizzBuzz(){
        //Give
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //When
        String result = fizzbuzz.checkNumber(15);
        //Then
        assertEquals("FizzBuzz", result);
    }
    @Test
    @DisplayName("Test si el numero no es divisible ni por 3 ni por 5")
    void test_whenTheNumberIsNotDivisibleByFiveAndThree_thenRetrunNumber(){
        //Give
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        //When
        String result = fizzbuzz.checkNumber(11);
        //Then
        assertEquals("11", result);
    }

}
