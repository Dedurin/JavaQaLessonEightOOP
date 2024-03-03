package ru.netology.service;

public class Radio {
    private int currentRadioStation;
    private int quantityRadioStation = 10;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {

    }

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setRadioStation(int newNumberCurrentRadio) {
        if (newNumberCurrentRadio >= 0 && newNumberCurrentRadio < quantityRadioStation) {
            currentRadioStation = newNumberCurrentRadio;
        }
    }

    public void next() {
        if (currentRadioStation == quantityRadioStation - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = quantityRadioStation - 1;
        } else {
            currentRadioStation--;
        }
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}