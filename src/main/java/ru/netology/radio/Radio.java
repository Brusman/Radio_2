package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStation;
    private int minStation = 0;
    private int numberOfStation = 10;


    public Radio() {

    }
    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
        int maxStation = numberOfStation - 1;
    }

    public void setNumberOfStation(int newNumberOfStation) {
        numberOfStation = newNumberOfStation;
    }

    public int getNumberOfStation() {
        return numberOfStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            currentStation = minStation + numberOfStation -1;
            return;
        }
        if (newCurrentStation > numberOfStation - 1) {
            currentStation = minStation;
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = 0;
            return;
        }
        if (newCurrentVolume > 100) {
            currentVolume = 100;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void nextStation() {
        setCurrentStation(currentStation + 1);
    }

    public void prevStation() {
        setCurrentStation(currentStation - 1);
    }

    public void increaseVolume() {
        setCurrentVolume(currentVolume + 1);
    }

    public void decreaseVolume() {
        setCurrentVolume(currentVolume - 1);
    }
}

