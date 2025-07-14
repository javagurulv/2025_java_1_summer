package org.javaguru.mentor.lesson_3_oop_first_look.homework.solutions.level_7_senior.task_4;

public class MusicSpeakerV2Application {

    public static void main(String[] args) {
        MusicSpeakerV2 speaker = new MusicSpeakerV2();

        //speaker.on();

        /*for (int i = 1; i <= 10; i++) {
            speaker.increaseVolume();
        }*/

        speaker.on(9);

        System.out.println("Volume = " + speaker.getVolume());

        speaker.off();
        System.out.println("Volume = " + speaker.getVolume());

        speaker.on(5);
        System.out.println("Volume = " + speaker.getVolume());

        speaker.increaseVolume();
        speaker.increaseVolume();
        System.out.println("Volume = " + speaker.getVolume());

    }

}
