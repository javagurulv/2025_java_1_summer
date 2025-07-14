package org.javaguru.mentor.lesson_6_unit_testing.lessoncode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AverageMarkApp {

    // получить количество студентов
    // получить имена всех студентов
    // получить оценки всех студентов
    // посчитать среднюю оценку
    // вывести среднюю оценку на консоль
    // найти имена всех студентов у которых оценка > средней
    // вывести найденные имена на консоль

    private static List<String> getStudentNamesWithGradeAboveAverage(String[] students,
                                                                     double[] grades,
                                                                     double average) {
        List<String> studentsWithGradeAboveAvg = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            if (grades[i] > average) {
                studentsWithGradeAboveAvg.add(students[i] + ": " + grades[i]);
            }
        }

        return studentsWithGradeAboveAvg;
    }

    private static double calculateAverageGrade(double[] grades) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.length;
        return average;
    }

    private static double[] getStudentGrades(String[] students) {
        Scanner scanner = new Scanner(System.in);

        double[] grades = new double[students.length];

        for (int i = 0; i < students.length; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }

        return grades;
    }

    private static String[] getStudentNames(int studentCount) {
        Scanner scanner = new Scanner(System.in);
        String[] students = new String[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }

        return students;
    }

    private static int getStudentCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int studentCount = Integer.parseInt(scanner.nextLine());
        return studentCount;
    }

    public static void main(String[] args) {
        int studentCount = getStudentCount();

        String[] students = getStudentNames(studentCount);

        double[] grades = getStudentGrades(students);

        double average = calculateAverageGrade(grades);
        System.out.println("Средний балл: " + average);

        System.out.println("Студенты со средним баллом выше среднего:");
        getStudentNamesWithGradeAboveAverage(students, grades, average)
                .forEach(System.out::println);

        System.out.println("Программа завершена.");
    }
}
