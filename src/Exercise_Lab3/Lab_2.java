package Exercise_Lab3;

public class Lab_2 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int min = intArr[0];
        int max = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < min) {
                min = intArr[i];
            } else {
                max = intArr[i];
            }
        }
        System.out.println("so nho nhat :" + min);
        System.out.println("so lon nhat :" + max);
    }
}
