package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCorrectVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(20);

        Assertions.assertEquals(20, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNoVolumeAbove100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(110);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNoVolumeBelow0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-4);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCorrectStationWithoutLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);


        Assertions.assertEquals(5, radio.getCurrentStation());

    }

    @Test
    public void shouldSetNoStationAbove9WithoutLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);


        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNoStationBelowZeroWithoutLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(-4);


        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCorrectStationWithLimit() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(10);


        Assertions.assertEquals(10, radio.getCurrentStation());

    }
    @Test
    public void shouldSetNoStationAboveLimit() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(30);


        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldSetNoStationBelowZeroWithLimit() {
        Radio radio = new Radio(13);

        radio.setCurrentStation(-4);

        Assertions.assertEquals(12, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationWithoutLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);
        radio.nextStation();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationAbove9WithoutLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationWithLimit() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(3);
        radio.nextStation();
        Assertions.assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationAboveLimit() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(14);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStationWithoutLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);
        radio.prevStation();
        Assertions.assertEquals(2, radio.getCurrentStation());
    }
    @Test
    public void shouldSetPrevStationBelowZeroWithoutLimit() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStationWithLimit() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(3);
        radio.prevStation();
        Assertions.assertEquals(2, radio.getCurrentStation());
    }
    @Test
    public void shouldSetPrevStationBelowZeroWithLimit() {
        Radio radio = new Radio(16);

        radio.setCurrentStation(0);
        radio.prevStation();
        Assertions.assertEquals(15, radio.getCurrentStation());
    }
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);
        radio.increaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAbove100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);
        radio.decreaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBelow0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}