package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class StandardDeviationTests {
    @Test
    @DisplayName("computeMean receives Null Value List - Throw Exception")
    void StandardDeviation_ComputeMean_ReceiveNullValueList_ThrowException() {
        // Arrange
        int[] values = null;
        // Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StandardDeviation.computeMean(values);
        });
        String expectedMessage = "values parameter cannot be null or empty";
        String actualMessage = exception.getMessage();

        // Assert

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("Compute mean receives Empty Value List - Throw Exception")
    void StandardDeviation_ComputeMean_ReceiveEmptyValueList_ThrowException() {
        // Arrange
        int[] values = {};
        // Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StandardDeviation.computeMean(values);
        });
        String expectedMessage = "values parameter cannot be null or empty";
        String actualMessage = exception.getMessage();

        // Assert

        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    @DisplayName("computeSquareOfDifferences receives Null Value List - Throw Exception")
    void StandardDeviation_computeSquareOfDifferences_ReceiveNullValueList_ThrowException() {
        // Arrange
        int[] values = null;
        // Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StandardDeviation.computeSquareOfDifferences(values, 0);
        });
        String expectedMessage = "values parameter cannot be null or empty";
        String actualMessage = exception.getMessage();

        // Assert

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("ComputeSquareOfDifferences receives Empty Value List - Throw Exception")
    void StandardDeviation_computeSquareOfDifferences_ReceiveEmptyValueList_ThrowException() {
        // Arrange
        int[] values = {};
        // Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StandardDeviation.computeSquareOfDifferences(values, 0);
        });
        String expectedMessage = "values parameter cannot be null or empty";
        String actualMessage = exception.getMessage();

        // Assert

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("computeStandardDeviation receives Null Value List - Throw Exception")
    void StandardDeviation_computeStandardDeviation_ReceiveNullValueList_ThrowException() {
        // Arrange
        int[] values = null;
        // Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StandardDeviation.computeStandardDeviation(values, false);
        });
        String expectedMessage = "values parameter cannot be null or empty";
        String actualMessage = exception.getMessage();

        // Assert

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName("computeStandardDeviation receives Empty Value List - Throw Exception")
    void StandardDeviation_computeStandardDeviation_ReceiveEmptyValueList_ThrowException() {
        // Arrange
        int[] values = {};
        // Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StandardDeviation.computeStandardDeviation(values, false);
        });
        String expectedMessage = "values parameter cannot be null or empty";
        String actualMessage = exception.getMessage();

        // Assert

        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    @DisplayName("computeSampleStandardDeviation receives one value - Throw Exception")
    void StandardDeviation_computeSampleStandardDeviation_ReceiveOneValue_ThrowException() {
        // Arrange
        int[] values = {1};
        // Act
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StandardDeviation.computeSampleStandardDeviation(values);
        });
        String expectedMessage = "numValues is too low (sample must be >= 1, population must be >= 2)";
        String actualMessage = exception.getMessage();

        // Assert

        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    @DisplayName("computePopulationStandardDeviation receives one value - std dev should be 0")
    void StandardDeviation_computePopulationStandardDeviation_ReceiveOneValue_ThrowException() {
        // Arrange
        int[] values = {1};
        // Act
        double result = StandardDeviation.computePopulationStandardDeviation(values);


        // Assert

        assertEquals(0.0, result);
    }

    @Test
    @DisplayName("computeSampleStandardDeviation receives valid values - returns std dev")
    void StandardDeviation_computeSampleStandardDeviation_ReceiveValidValues_ThrowException() {
        // Arrange
        int[] values = {1,2,3,4,5};
        // Act
        double result = StandardDeviation.computeSampleStandardDeviation(values);


        // Assert

        assertEquals(1.58113883, result, 0.00000001);
    }

    @Test
    @DisplayName("computePopulationStandardDeviation receives valid values - returns std dev")
    void StandardDeviation_computePopulationStandardDeviation_ReceiveValidValues_ThrowException() {
        // Arrange
        int[] values = {1,2,3,4,5};
        // Act
        double result = StandardDeviation.computePopulationStandardDeviation(values);


        // Assert

        assertEquals(1.414213562, result, 0.000000001);
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(outContent));
    }
    @Test
    @DisplayName("test main method")
    void StandardDeviation_testMainMethod() {
        String expectedOutput = "Sample StdDev = 1.5811388300841898" + System.lineSeparator() +
                "Population StdDev = 2.9832867780352594" + System.lineSeparator();

        StandardDeviation.main(new String[] {});

        assertEquals(expectedOutput, outContent.toString());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    
}