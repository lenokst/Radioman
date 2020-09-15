package ru.netology.domain;

public class Radio {
    private int firstStation = 0;
    private int lastStation = 9;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

//    public int getFirstStation() {
//        return firstStation;
//    }
//
//    public void setFirstStation(int firstStation) {
//        this.firstStation = firstStation;
//    }
//
//    public int getLastStation() {
//
//        return lastStation;
//    }
//
//    public void setLastStation(int lastStation) {
//
//        this.lastStation = lastStation;
//    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

//    public int getMinVolume() {
//
//        return minVolume;
//    }
//
//    public void setMinVolume(int minVolume) {
//
//        this.minVolume = minVolume;
//    }
//
//    public int getMaxVolume() {
//
//        return maxVolume;
//    }
//
//    public void setMaxVolume(int maxVolume) {
//
//        this.maxVolume = maxVolume;
//    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation == lastStation) {
            currentStation = firstStation;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == firstStation) {
            currentStation = lastStation;
        } else {
            currentStation--;
        }
    }

    public void nextVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void prevVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }

    public void newCurrentStation(int newStation) {
        if (newStation > lastStation) {
            return;
        }
        if (newStation < firstStation) {
            return;
        }
        this.currentStation = newStation;
    }
}
