package org.javaguru.mentor.lesson_3_oop_first_look.homework.solutions.level_7_senior.task_4;

public class MusicSpeaker {

    private String model;
    private int volume;
    private boolean isOn;

    // isOn = true
    // isOn = false

    public MusicSpeaker(String model) {
        this.model = model;
        this.volume = 0;
        this.isOn = false;
    }

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
        this.volume = 0;
    }

    // && - AND - И
    public void increaseVolume() {
        if ((this.isOn == true) && (this.volume < 10)) {  // <, <=, >, >=, ==, !=
            this.volume = this.volume + 1;
        }
    }

    public String getModel() {
        return this.model;
    }

    public int getVolume() {
        return this.volume;
    }

    public boolean isOn() {
        return this.isOn;
    }
}
