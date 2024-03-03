package ru.netology.service;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void testSetRadioStation() {
        Radio radio = new Radio(5);
        radio.setRadioStation(3);
        assertEquals(3, radio.getCurrentRadioStation());
    }

    @Test
    public void testNext() {
        Radio radio = new Radio(3);
        radio.next();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void testPrev() {
        Radio radio = new Radio(4);
        radio.setRadioStation(2);
        radio.prev();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void testVolumeUp() {
        Radio radio = new Radio();
        radio.volumeUp();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void testVolumeDown() {
        Radio radio = new Radio();
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
}
