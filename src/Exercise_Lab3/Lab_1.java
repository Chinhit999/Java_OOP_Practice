package Exercise_Lab3;

public class Lab_1 {
    public static void main(String[] args) {
        int[] intarr = {1, 2, 3, 4, 5, 10, 11};
        int demchan = 0;
        int demle = 0;

        for (int i = 0; i < intarr.length; i++) {

            if (intarr[i] % 2 == 0) {
                demchan++;
            } else {
                demle++;
            }
        }
        System.out.println("tong so chan : " + demchan);
        System.out.println("tong so le :" + demle);
    }
}
