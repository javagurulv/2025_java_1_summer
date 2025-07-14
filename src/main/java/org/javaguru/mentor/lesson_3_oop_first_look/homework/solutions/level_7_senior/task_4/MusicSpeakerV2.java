package org.javaguru.mentor.lesson_3_oop_first_look.homework.solutions.level_7_senior.task_4;

public class MusicSpeakerV2 {

    private boolean isOn;
    private int volume;

    public MusicSpeakerV2() {
        this.isOn = false;
        this.volume = 0;
    }

    public void on() {
        this.isOn = true;
        this.volume = 0;
    }

    public void on(int newVolume) {
        this.isOn = true;
        if ((newVolume >= 0) && (newVolume <= 10)) {
            this.volume = newVolume;
        } else {
            this.volume = 0;
        }
    }

    public void off() {
        this.isOn = false;
        this.volume = 0;
    }

    public void increaseVolume() {
        if ((this.isOn == true) && (this.volume < 10)) {
            this.volume = this.volume + 1;
        }
    }

    public void decreaseVolume() {
        if ((this.isOn == true) && (this.volume > 0)) {
            this.volume = this.volume - 1;
        }
    }

    public boolean isOn() {
        return this.isOn == true;
    }

    public boolean isOff() {
        return this.isOn == false;
    }

    public int getVolume() {
        return this.volume;
    }

}
