package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class InterpretationTest {

    private static Stream<Arguments> inputsAndResults() {

        return Stream.of(
                Arguments.of(-2.5, "Below Average"),
                Arguments.of(-2.1, "Below Average"),
                Arguments.of(-2.0, "Near Average"),
                Arguments.of(-1.9, "Near Average"),
                Arguments.of(-0.1, "Near Average"),
                Arguments.of(0.0, "Exactly Average"),
                Arguments.of(0.1, "Near Average"),
                Arguments.of(1.9, "Near Average"),
                Arguments.of(2.0, "Near Average"),
                Arguments.of(2.1, "Above Average"),
                Arguments.of(2.5, "Above Average")
        );
    }

    @ParameterizedTest
    @DisplayName("parameterized unit test")
    @MethodSource("inputsAndResults")
    void StandardDeviation_interpretStandardDeviation_ReceiveStdDevValue_ReturnLabel(double stdDev, String expectedLabel){
        // Act
        String actualLabel = Interpretation.interpretStandardDeviation(stdDev);
        // Assert
        assertEquals(expectedLabel, actualLabel);
    }

}