package ru.netology;

public class Radio {

    private int station;
    private int volume;

    public int getStation() {
        return station;
    }

    public void setStation(int param) {
        if (param < 0 | param > 9) {
            return;
        }
        station = param;
    }

    public void nextStation() {
        if (station >= 9) {
            station = 0;
        } else {
            station++;
        }
    }

    public void prevStation() {
        if (station <= 0) {
            station = 9;
        } else {
            station--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int param) {
        if (param < 0 | param > 100) {
            return;
        }
        volume = param;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume += 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume -= 1;
        }
    }
}
