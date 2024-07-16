import java.util.Scanner;

public class Extract_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Number: ");
        int n = sc.nextInt();
        int temp = n;
                while(temp != 0) {
                    System.out.print(temp % 10);
                    temp /= 10;
                }

    }
}
