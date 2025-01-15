package ru.netology;

public class Radio {

    private int maxStations;
    private int station;
    private int volume;

    public Radio(int maxStations, int CurrentStation, int CurrentVolume) {
        this.maxStations = maxStations;
        this.station = CurrentStation;
        this.volume = CurrentVolume;
    }

    public Radio() {
        this(10, 0 ,50);
    }

    public int getStation() {
        return station;
    }

    public void setStation(int param) {
        if (param < 0 | param > (maxStations - 1)) {
            return;
        }
        station = param;
    }

    public void nextStation() {
        if (station >= (maxStations - 1)) {
            station = 0;
        } else {
            station++;
        }
    }

    public void prevStation() {
        if (station <= 0) {
            station = (maxStations - 1);
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
