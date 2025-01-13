package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        int volMem = radio.getVolume();
        radio.increaseVolume();

        long expected = volMem + 1;
        long actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

        radio.setVolume(100);
        radio.increaseVolume();
        expected = 100;
        actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(50);
        int volMem = radio.getVolume();
        radio.decreaseVolume();

        long expected = volMem - 1;
        long actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

        radio.setVolume(0);
        radio.decreaseVolume();
        expected = 0;
        actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNextStation() {
        Radio radio = new Radio();
        radio.setStation(4);
        int stationMem = radio.getStation();
        radio.nextStation();

        long expected = stationMem + 1;
        long actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

        radio.setStation(9);
        radio.nextStation();

        expected = 0;
        actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPrevStation() {
        Radio radio = new Radio();
        radio.setStation(4);
        int stationMem = radio.getStation();
        radio.prevStation();

        long expected = stationMem - 1;
        long actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

        radio.setStation(0);
        radio.prevStation();

        expected = 9;
        actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSetStation() {
        Radio radio = new Radio();
        int targetStation = 5;
        radio.setStation(targetStation);

        long expected = targetStation;
        long actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
        int stationMem = radio.getStation();
        radio.setStation(10);
        expected = stationMem;
        actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
        radio.setStation(-1);
        expected = stationMem;
        actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSetVolume() {
        Radio radio = new Radio();
        int targetVolume = 30;
        radio.setVolume(targetVolume);

        long expected = targetVolume;
        long actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
        int volMem = radio.getVolume();
        radio.setVolume(101);
        expected = volMem;
        actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
        radio.setVolume(-1);
        expected = volMem;
        actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}
