package ru.netology.service;

public class Radio {
    private int maxStationNumber;
    private int currentStation;
    private int currentVolume;

    public Radio() {
        this.maxStationNumber = 10;
        this.currentStation = 0;
        this.currentVolume = 5;
    }

    public Radio(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
        this.currentStation = 0;
        this.currentVolume = 5;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public void setMaxStationNumber(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < maxStationNumber) {
            currentStation = station;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void nextStation() {
        currentStation = (currentStation + 1) % maxStationNumber;
    }

    public void prevStation() {
        currentStation = (currentStation - 1 + maxStationNumber) % maxStationNumber;
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            currentVolume = volume;
        }
    }
}