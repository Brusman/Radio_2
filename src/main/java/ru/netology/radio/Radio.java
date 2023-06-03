package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            currentStation = 9;
            return;
        }
        if (newCurrentStation > 9) {
            currentStation = 0;
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
