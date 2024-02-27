package ru.netology.service;

public class Radio {
    private int currentWave;
    private int currentVolume;

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave >= 0 && newCurrentWave <= 9) {
            currentWave = newCurrentWave;
        } else if (newCurrentWave < 0) {
            currentWave = 0;
        } else currentWave = 9;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void next() {
        if (currentWave < 9) {
            currentWave = currentWave + 1;
        } else currentWave = 0;
    }

    public void prev() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        } else currentWave = 9;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 0 && newCurrentVolume <= 10) {
            currentVolume = newCurrentVolume;
        } else if (newCurrentVolume < 0) {
            currentVolume = 0;
        } else currentVolume = 10;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}