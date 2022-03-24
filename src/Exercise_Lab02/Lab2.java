package Exercise_Lab02;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter your number :");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println(" day la so chan ");
        }else {
            System.out.println("day la so le ");
        }
    }
}
