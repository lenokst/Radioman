package ru.netology.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int firstStation = 0;
    private int lastStation = 10;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;


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
