package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void testSetCurrentWaveWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentWave(5);
        assertEquals(5, radio.getCurrentWave());
    }

    @Test
    public void testSetCurrentWaveBelowRange() {
        Radio radio = new Radio();
        radio.setCurrentWave(-1);
        assertEquals(0, radio.getCurrentWave());
    }

    @Test
    public void testSetCurrentWaveAboveRange() {
        Radio radio = new Radio();
        radio.setCurrentWave(10);
        assertEquals(9, radio.getCurrentWave());
    }

    @Test
    public void testNextWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentWave(5);
        radio.next();
        assertEquals(6, radio.getCurrentWave());
    }

    @Test
    public void testNextAtMaxValue() {
        Radio radio = new Radio();
        radio.setCurrentWave(9);
        radio.next();
        assertEquals(0, radio.getCurrentWave());
    }

    @Test
    public void testPrevWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentWave(5);
        radio.prev();
        assertEquals(4, radio.getCurrentWave());
    }

    @Test
    public void testPrevAtMinValue() {
        Radio radio = new Radio();
        radio.setCurrentWave(0);
        radio.prev();
        assertEquals(9, radio.getCurrentWave());
    }

    @Test
    public void testSetCurrentVolumeWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void testSetCurrentVolumeBelowRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testSetCurrentVolumeAboveRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void testIncreaseVolumeWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void testIncreaseVolumeAtMaxValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolumeWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolumeAtMinValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}