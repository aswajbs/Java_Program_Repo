import java.util.Scanner;

public class Array_Forward_Reverse_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int[] arr=new int[sc.nextInt()];
        // Accept the Input from User
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(i==0){
                System.out.println("Forward print of Array from Index 0 to Size-1");
            }
            System.out.print(arr[i]+" ");// Print Array in Forward direction: index 0-n-1
        }
        System.out.println();
        System.out.println("Reversed Array of Array from Index Size-1 to 0: ");
       // Print Array in reverse direction: index n-1 to 0
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
