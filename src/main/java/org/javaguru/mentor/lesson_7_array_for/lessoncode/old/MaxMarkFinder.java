package org.javaguru.mentor.lesson_7_array_for.lessoncode.old;

class MaxMarkFinder {

    public int findMaxMark(int[] marks) {
        int maxMark = marks[0];
        for (int i = 0; i < marks.length; i++) {
            int mark = marks[i];
            if (mark > maxMark) {
                maxMark = mark;
            }
        }
        return maxMark;
    }

}
