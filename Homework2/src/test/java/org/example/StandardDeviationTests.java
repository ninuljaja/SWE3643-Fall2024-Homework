package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StandardDeviationTests {
    @Test
    @DisplayName("Compute mean receives Null Value List - Throw Exception")
    void StandardDeviation_ComputeMean_ReceiveNullValueList_ThrowException() {
        // Arrange
        int[] values = null;
        // Act
        Exception exception = assertThrows(Exception.class, () -> {
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
        Exception exception = assertThrows(Exception.class, () -> {
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
        Exception exception = assertThrows(Exception.class, () -> {
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
        Exception exception = assertThrows(Exception.class, () -> {
            StandardDeviation.computeSquareOfDifferences(values, 0);
        });
        String expectedMessage = "values parameter cannot be null or empty";
        String actualMessage = exception.getMessage();

        // Assert

        assertTrue(actualMessage.contains(expectedMessage));
    }
    
}