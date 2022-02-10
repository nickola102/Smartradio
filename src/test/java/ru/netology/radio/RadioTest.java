package ru.netology.radio;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @ParameterizedTest
    @CsvSource(value = {

            "'number = lower limit',0,0",
            "'number near lower limit',1,1",
            "'number within range',5,5",
            "'number near upper limit1',8,8",
            "'number = upper limit',9,9",
            "'number near upper limit2',10,0",
            "'number upper range',15,0"
    })

    public void shouldSetCurrentStation(String testName, int newStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStation(newStation);


        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource(value = {

            "'number = lower limit',0,1",
            "'number near lower limit',1,2",
            "'number within range',5,6",
            "'number near upper limit1',8,9",
            "'number = upper limit',9,0",

    })
    public void shouldSetNextStation(String testName, int newStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(newStation);
        radio.setNextStation();

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
}