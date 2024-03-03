package ru.netology.service;
public class Radio {
    private int currentWave;
    private int currentVolume;
    private int maxStations;
    private static final int MAX_VOLUME = 100;
    private static final int MIN_VOLUME = 0;

    public Radio(int maxStations) {
        this.maxStations = maxStations;
        this.currentWave = 1;
        this.currentVolume = MIN_VOLUME;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave >= 1 && newCurrentWave <= maxStations) {
            currentWave = newCurrentWave;
        } else if (newCurrentWave < 1) {
            currentWave = 1;
        } else {
            currentWave = maxStations;
        }
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void next() {
        currentWave = (currentWave % maxStations) + 1;
    }

    public void prev() {
        currentWave = (currentWave - 2 + maxStations) % maxStations + 1;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= MIN_VOLUME && newCurrentVolume <= MAX_VOLUME) {
            currentVolume = newCurrentVolume;
        } else if (newCurrentVolume < MIN_VOLUME) {
            currentVolume = MIN_VOLUME;
        } else {
            currentVolume = MAX_VOLUME;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < MAX_VOLUME) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > MIN_VOLUME) {
            currentVolume--;
        }
    }
}