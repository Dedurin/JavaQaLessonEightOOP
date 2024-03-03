package ru.netology.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


    public class RadioTest {

        @Test
        public void testGetNumberOfStations() {
            Radio radio = new Radio();
            assertEquals(10, radio.getNumberOfStations());
        }

        @Test
        public void testGetCurrentStation() {
            Radio radio = new Radio();
            assertEquals(0, radio.getCurrentStation());
        }

        @Test
        public void testSetCurrentStationWithinRange() {
            Radio radio = new Radio();
            radio.setCurrentStation(5);
            assertEquals(5, radio.getCurrentStation());
        }

        @Test
        public void testSetCurrentStationOutOfRange() {
            Radio radio = new Radio();
            radio.setCurrentStation(15);
            assertEquals(0, radio.getCurrentStation());
        }

        @Test
        public void testNext() {
            Radio radio = new Radio();
            radio.next();
            assertEquals(1, radio.getCurrentStation());
        }

        @Test
        public void testPrev() {
            Radio radio = new Radio();
            radio.prev();
            assertEquals(9, radio.getCurrentStation());
        }

        @Test
        public void testGetCurrentVolume() {
            Radio radio = new Radio();
            assertEquals(50, radio.getCurrentVolume());
        }

        @Test
        public void testSetCurrentVolumeWithinRange() {
            Radio radio = new Radio();
            radio.setCurrentVolume(75);
            assertEquals(75, radio.getCurrentVolume());
        }

        @Test
        public void testSetCurrentVolumeOutOfRange() {
            Radio radio = new Radio();
            radio.setCurrentVolume(150);
            assertEquals(50, radio.getCurrentVolume());
        }

        @Test
        public void testIncreaseVolume() {
            Radio radio = new Radio();
            radio.increaseVolume();
            assertEquals(51, radio.getCurrentVolume());
        }

        @Test
        public void testDecreaseVolume() {
            Radio radio = new Radio();
            radio.decreaseVolume();
            assertEquals(49, radio.getCurrentVolume());
        }
    }