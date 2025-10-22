package org.example.ChapterOne;

public class ChapterOneAnswers {
    public static void main(String[] args) {
        answerOne();
        answerTwo();
        answerThree();
        answerFour();
        answerFive();
        answerSix();
        answerSeven();
        answerEight();
        answerNine();
        answerTen();
        answerEleven();
        answerTwelve();
        answerThirteen();
    }

    private static void answerOne() {
        System.out.println("Welcome to Java");
        System.out.println("Learning Java Now");
        System.out.println("Programming is fun");
    }

    private static void answerTwo() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I love you");
        }
    }

    private static void answerThree() {
        System.out.println("   J");
        System.out.println("J aaa  v  vaaa");
        System.out.println("J  J aa vv  a a");
        System.out.println("J aaaa   v   aaaa");
    }

    private static void answerFour() {
        System.out.println("a\ta^2\ta^3\ta^4");
        for (int i = 1; i < 5; i++) {
            System.out.printf("%d\t%d\t%d\t%d\n", i, i*i, i*i*i, i*i);
        }
    }

    private static void answerFive() {
        System.out.print("((7.5 x 6.5) - (4.5 x 3))/(47.5 - 5.5) is ");
        System.out.println(((7.5 * 6.5) - (4.5 * 3))/(47.5 - 5.5));
    }

    private static void answerSix() {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += i;
        }
        System.out.print("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 is ");
        System.out.println(sum);
    }

    private static void answerSeven() {
        System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11));
        System.out.println(4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13));
    }

    private static void answerEight() {
        float pi = 3.14159f;
        float radius = 6.5f;
        System.out.printf("Perimeter is %3.2f\n", 2 * radius * pi);
        System.out.printf("Area is %3.2f", radius * radius * pi);
    }

    private static void answerNine() {
        float width = 5.3f;
        float height = 8.6f;
        System.out.printf("Area is %3.2f\n", width * height);
        System.out.printf("Perimeter is %3.2f", 2.0 * (width + height));
    }

    private static void answerTen() {
        float distanceInMiles = 15 * 1.6f;
        float timeInHours = 50.5f / 60.0f;
        System.out.printf("Speed in Miles/Hours is %3.2f m/hr\n", distanceInMiles/timeInHours);
    }

    private static void answerEleven() {
        int originalPopulation = 312_032_486;
        float totalSecondsInAYear = 365 * 24 * 3600;
        float births = totalSecondsInAYear / 7;
        float deaths = totalSecondsInAYear / 13;
        float immigrants = totalSecondsInAYear / 45;

        float delta = births - deaths + immigrants;
        int delta1 = (int) (delta);
        int delta2 = (int) (delta * 2);
        int delta3 = (int) (delta * 3);
        int delta4 = (int) (delta * 4);
        int delta5 = (int) (delta * 5);

        System.out.printf("Original: %d\n", originalPopulation);
        System.out.printf("Year 1: %d\n", originalPopulation + delta1);
        System.out.printf("Year 2: %d\n", originalPopulation + delta2);
        System.out.printf("Year 3: %d\n", originalPopulation + delta3);
        System.out.printf("Year 4: %d\n", originalPopulation + delta4);
        System.out.printf("Year 5: %d\n", originalPopulation + delta5);
    }

    private static void answerTwelve() {
        float distanceInKM = 24 * 1.6f;
        float timeInSeconds = 3600 + 40 * 60 + 35;
        float timeInHours = timeInSeconds / 3600;

        float averageSpeedInKMPH = distanceInKM / timeInHours;

        System.out.printf("Average speed is %3.2f\n", averageSpeedInKMPH);
    }

    private static void answerThirteen() {
        float a = 3.4f;
        float b = 50.2f;

        float c = 2.1f;
        float d = 0.55f;

        float e = 44.5f;
        float f = 5.9f;

        System.out.printf("Value of x is %3.2f\n", ((e * d) - (b * f)) / ((a * d) - (b * c)));
        System.out.printf("Value of y is %3.2f\n", ((a * f) - (e * c)) / ((a * d) - (b * c)));
    }
}
