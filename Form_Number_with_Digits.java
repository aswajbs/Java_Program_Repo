import java.util.Scanner;

public class Form_Number_with_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No. of digits & Array of digits seperated by space: ");
        int[] arr = new int[sc.nextInt()];
        int res=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
           // System.out.println("Enter number " + i + ": "+arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            res+=(int)arr[i]*Math.pow(10,i);
        }
    System.out.println(res);
    }
}
