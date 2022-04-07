import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int fact = 1;
        do {
            fact = fact * n;
            n--;
            if (n<1){
                System.out.println("Error! You have entered a negative number!");

            }
        }while ( n > 1);
        System.out.println(fact);

    }
}
