package Exercise_Lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_1 {
    public static void main(String[] args) {

        boolean IsContinuing = true;

        while (IsContinuing) {
            System.out.println("========Menu=========");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("0.Exit ");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input Number :");
            int UserInput = scanner.nextInt();

            if (UserInput == 0) {
                IsContinuing = false;

            } else {
                switch (UserInput) {
                    case 1:
                        ArrayList<Integer> arr = new ArrayList<Integer>();
                        arr.add(1);
                        arr.add(5);
                        for (Integer i : arr) {
                            System.out.print(i + " ");
                        }
                    default:
                        System.out.println("");

                    case 2 :


                }

            }

        }
    }
}
