import java.util.Scanner;

public class Prime_number_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        int count=0;
        for(int i=1;i*i<=number;i++){
            if(number%i==0){
               if(number==i*i){
                   count+=1;
               }
               else {
                   count+=2;
               }

            }
        }
        if(count==2){
            System.out.println("Given Number is Prime number");
        }
        else{
            System.out.println("Given Number is Not Prime number");
        }
    }
}
