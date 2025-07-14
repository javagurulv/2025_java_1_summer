package org.javaguru.mentor.lesson_7_array_for.lessoncode.tasks;

import java.util.ArrayList;
import java.util.List;

public class MemoryExample {

    public static void main(String[] args) {

        List<Trader> traders = new ArrayList<>();

        int count = 0;
        while (true) {
            count = count + 1;
            traders.add(new Trader("sdfdss" + count, "asfds" + count));
            if (count % 100000 == 0) {
                System.out.println(count);

                for (int i = 0; i < 100000; i++) {
                    traders.remove(0);
                }

            }
        }

    }


}
