package Exercises;

import java.util.Scanner;

/**
 * Created by jsr on 5/12/17.
 */
public class ConsoleExercises {
    public static void main(String[] args) {
        System.out.println("Please enter value");

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        System.out.println(number);



//        below erases "Enter" from above
        input.nextLine();

        System.out.println("Please enter 3 words");

        String color = input.nextLine();

        System.out.println(color);

        String color2 = input.nextLine();

        System.out.println(color2);

        String color3 = input.nextLine();
        System.out.println(color3);

        System.out.println("Please enter a sentence");

        String sentence = input.nextLine();
        System.out.println(sentence);





        System.out.println("Please enter width of room");
        int width = input.nextInt();
        System.out.println(width);

        System.out.println("Please enter room length");
        int length = input.nextInt();
        System.out.println(length);

//        System.out.println(length * width);

        System.out.println(2 * length + 2 * width);


    }
}
