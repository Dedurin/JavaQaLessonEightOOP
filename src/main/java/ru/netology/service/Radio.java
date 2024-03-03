package ru.netology.service;

public class Radio {
    private int numberOfStations;
    private int currentStation;
    private int currentVolume;

    public Radio() {
        this.numberOfStations = 10;
        this.currentStation = 0;
        this.currentVolume = 50;
    }

    public Radio(int numberOfStations) {
        if (numberOfStations > 0) {
            this.numberOfStations = numberOfStations;
        } else {
            this.numberOfStations = 10;
        }
        this.currentStation = 0;
        this.currentVolume = 50;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < numberOfStations) {
            currentStation = station;
        } else if (station == numberOfStations) {
            currentStation = 0;
        }
    }

    public void next() {
        currentStation = (currentStation + 1) % numberOfStations;
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = numberOfStations - 1;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            currentVolume = volume;
        }
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
}