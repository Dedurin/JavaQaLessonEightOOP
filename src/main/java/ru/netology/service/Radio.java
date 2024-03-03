package ru.netology.service;
public class Radio {
    private int currentWave;
    private int currentVolume;
    private int maxWave;

    public Radio() {
        this.maxWave = 10;
        this.currentWave = 0;
    }

    public Radio(int maxWave) {
        this.maxWave = maxWave;
        this.currentWave = maxWave;
    }

    public void setCurrentWave(int wave) {
        if (wave >= 0 && wave < maxWave) {
            currentWave = wave;
        } else {
            currentWave = 0;
        }
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void next() {
        currentWave = (currentWave + 1) % maxWave;
    }

    public void prev() {
        currentWave = (currentWave - 1 + maxWave) % maxWave;
    }
    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            currentVolume = volume;
        } else if (volume < 0) {
            currentVolume = 0;
        } else {
            currentVolume = 100;
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
}