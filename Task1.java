import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
       int i = Integer.parseInt(scanner.nextLine());
       int sum = 0;
        do {
            sum += i++;

            if (i<0){
                System.out.println("Error! You have entered a negative number!");
                break;

            }
        }while ( i <= 100);
        System.out.println("The sum of the numbers between your number and 100 (inc) is :"+ sum);
    }
}







