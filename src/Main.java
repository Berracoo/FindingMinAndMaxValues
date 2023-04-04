import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("How many number will you enter ? ");
        int n = src.nextInt();
        System.out.println("*******************************");
        int numbers = 0;
        // max value and min value methods temporarily hold the largest the max and smallest the min.
        int largest = Integer.MAX_VALUE;
        int smallest = Integer.MIN_VALUE;


        for(int  i = 1; i <= n; i++){
            System.out.print("Enter the" + " " + i + "." + "number : ");
             numbers = src.nextInt();
             if(numbers > largest){
                 largest = numbers;
             }
             if (numbers < smallest){
                 smallest = numbers;
             }
        }
        System.out.println("The largest number is : " + largest +"\n" +
                "The smallest number is : " + smallest);





    }
}