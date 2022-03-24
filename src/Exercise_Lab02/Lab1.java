package Exercise_Lab02;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap chieu cao:");
        Float chieucao = scanner.nextFloat();
        System.out.print("nhap can nang :");
        Float cannang = scanner.nextFloat();

        Float BMI =  cannang / (chieucao * 2);
        if(BMI <=18.5){
            System.out.println("thieu can bang ");
        }else if(BMI <=24.9 ){
            System.out.println("binh thuong can bang");
        }else if(BMI <=29.9){
            System.out.println("thua can bang ");
        }else {
            System.out.println("Beo phay");
        }

    }

}
