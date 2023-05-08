import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    public void calculate_legeString_Returns0(){
        //Arrange

        //Act
        int som = StringCalculator.calculate("");

        //Assert
        assertEquals(0, som);
    }

    @Test
    public void calculate_string1_Returns1(){
        //Arrange

        //Act
        int som = StringCalculator.calculate("1");

        //Assert
        assertEquals(1, som);
    }

    @Test
    public void calculate_string2_Returns2(){
        //Arrange

        //Act
        int som = StringCalculator.calculate("2");

        //Assert
        assertEquals(2, som);
    }
}
