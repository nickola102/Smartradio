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

    public void shouldSetCurrentStation(String testName, int newNumber, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStation(newNumber);


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
    public void shouldSetNextStation(String testName, int currentNumber, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentNumber);
        radio.setNextStation();

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {

            "'number = lower limit',0,9",
            "'number near lower limit',1,0",
            "'number within range',5,4",
            "'number near upper limit1',8,7",
            "'number = upper limit',9,8",

    })
    public void shouldSetPrevStation(String testName, int currentNumber, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentNumber);
        radio.setPrevStation();

        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource(value = {

            "'level = lower limit',0,0",
            "'level near lower limit',1,1",
            "'level within range',6,6",
            "'level near upper limit1',9,9",
            "'level = upper limit',10,10",
            "'level near upper limit2',11,0",
            "'level = upper range',20,0",
    })

    public void shouldSetCurrentVolume(String testName, int newLevel, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(newLevel);


        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource(value = {

            "'level = lower limit',0,1",
            "'level near lower limit',1,2",
            "'level within range',6,7",
            "'level near upper limit1',9,10",
            "'level = upper limit',10,10",


    })
    public void shouldMakeLouder(String testName, int currentLevel, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentLevel);
        radio.makeLouder();

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {

            "'level = lower limit',0,0",
            "'level near lower limit',1,0",
            "'level within range',6,5",
            "'level near upper limit1',9,8",
            "'level = upper limit',10,9",


    })
    public void shouldMakeQuieter(String testName, int currentLevel, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentLevel);
        radio.makeQuieter();

        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}