package org.javaguru.mentor.lesson_10_collections.set.lessoncode;

import org.javaguru.mentor.lesson_8_project_school_dairy.lessoncode.Mark;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        //Set<String> uniqueWords = new TreeSet<>();

        Set<String> uniqueWords = new HashSet<>();

        uniqueWords.add("cat");
        uniqueWords.add("dog");
        uniqueWords.add("cat");

        for (String word : uniqueWords) {
            System.out.println(word);
        }

        System.out.println(uniqueWords.size());

        Set<Mark> uniqueMarks = new TreeSet<Mark>(
                new Comparator<Mark>() {
                    @Override
                    public int compare(Mark o1, Mark o2) {
                        return 0;
                    }
                }
        );


        Map<String, Integer> tabel = new HashMap<>();
        tabel.put("Math", 7);
        tabel.put("Eng", 10);


        Map<String, List<Integer>> markBySubject = new HashMap<>();

        //List<Integer> mathMarks = List.of(2, 4, 7);

        List<Integer> mathMarks = new ArrayList<>();
        mathMarks.add(2);
        mathMarks.add(4);
        mathMarks.add(7);
        markBySubject.put("Math", mathMarks);

        List<Integer> myMathList = markBySubject.get("Math");
        myMathList.add(8);

        List<Integer> engMarks = List.of(10, 4, 7);
        markBySubject.put("Eng", engMarks);


    }

}
