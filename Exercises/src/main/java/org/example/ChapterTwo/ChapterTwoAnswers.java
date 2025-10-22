package org.example.ChapterTwo;

import java.util.Scanner;

public class ChapterTwoAnswers {
    public static void main(String[] args) {
        answerOne();
    }

    public static void answerOne() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles: ");
        double miles = scanner.nextDouble();

        System.out.printf("%.2f miles is %.2f kilometers", miles,  miles * 1.6);
    }
}
