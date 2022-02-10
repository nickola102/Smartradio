package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;

    }

    public void setNextStation() {

        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void setPrevStation() {

        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void makeLouder() {

        if (currentVolume == 10) {
            currentVolume = currentVolume;
        } else {
            currentVolume++;
        }
    }

    public void makeQuieter() {

        if (currentVolume == 0) {
            currentVolume = currentVolume;
        } else {
            currentVolume--;
        }
    }
}
