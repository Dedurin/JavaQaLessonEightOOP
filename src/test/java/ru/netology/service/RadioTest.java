package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class RadioTest {

    @Test
    public void testDefaultRadioCreation() {
        Radio radio = new Radio();
        assertEquals(10, radio.getMaxStationNumber());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void testRadioCreationWithCustomMaxStationNumber() {
        Radio radio = new Radio(15);
        assertEquals(15, radio.getMaxStationNumber());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void testSetMaxStationNumber() {
        Radio radio = new Radio();
        radio.setMaxStationNumber(20);
        assertEquals(20, radio.getMaxStationNumber());
    }

    @Test
    public void testSetCurrentStationWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationBelowRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationAboveRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(12);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testNextStationWithinRange() {
        Radio radio = new Radio();
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void testPrevStationWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void testPrevStationAtMinValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseVolumeWithinRange() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolumeWithinRange() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void testIncreaseVolumeAtMaxValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolumeAtMinValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testSetCurrentVolumeWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void testSetCurrentVolumeAboveRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void testSetCurrentVolumeBelowRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-50);
        assertEquals(5, radio.getCurrentVolume());
    }
}