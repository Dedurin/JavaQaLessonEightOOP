package ru.netology.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {

    @Test
    public void testSetCurrentWave() {
        Radio radio = new Radio(5);
        radio.setCurrentWave(3);
        assertEquals(3, radio.getCurrentWave());

        radio.setCurrentWave(6);
        assertEquals(5, radio.getCurrentWave());

        radio.setCurrentWave(0);
        assertEquals(1, radio.getCurrentWave());
    }

    @Test
    public void testNext() {
        Radio radio = new Radio(5);
        radio.setCurrentWave(3);
        radio.next();
        assertEquals(4, radio.getCurrentWave());

        radio.next();
        assertEquals(5, radio.getCurrentWave());

        radio.next();
        assertEquals(1, radio.getCurrentWave());
    }

    @Test
    public void testPrev() {
        Radio radio = new Radio(5);
        radio.setCurrentWave(3);
        radio.prev();
        assertEquals(2, radio.getCurrentWave());

        radio.prev();
        assertEquals(1, radio.getCurrentWave());

        radio.prev();
        assertEquals(5, radio.getCurrentWave());
    }

    @Test
    public void testSetCurrentVolume() {
        Radio radio = new Radio(5);
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());

        radio.setCurrentVolume(-10);
        assertEquals(0, radio.getCurrentVolume());

        radio.setCurrentVolume(150);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio(5);
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        assertEquals(51, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio(5);
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        assertEquals(49, radio.getCurrentVolume());

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}