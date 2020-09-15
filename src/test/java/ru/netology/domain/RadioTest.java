package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void nextStation() {
        radio.setCurrentStation(2);
        radio.nextStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void prevStation() {
        radio.setCurrentStation(4);
        radio.prevStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void limitValueStation() {
        radio.setCurrentStation(8);
        radio.nextStation();//
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void overLimitValueStation() {
        radio.setCurrentStation(9);
        radio.nextStation();//
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void chooseValidStation() {
        radio.newCurrentStation(7);//
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void chooseNotValidStation() {
        radio.newCurrentStation(-7);//
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextVolume() {
        radio.setCurrentVolume(4);
        radio.nextVolume();//
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void prevVolume() {
        radio.setCurrentVolume(5);
        radio.prevVolume();//
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void overMaxVolume() {
        radio.setCurrentVolume(10);
        radio.nextVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void underMinVolume() {
        radio.setCurrentVolume(0);
        radio.prevVolume();//
        assertEquals(0, radio.getCurrentVolume());
    }
}