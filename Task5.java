import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String inputString;
        Scanner in = new Scanner(System.in);

        System.out.println("Please input a word:");
        inputString = in.nextLine();

        int length  = inputString.length();
        int i, begin, end, middle;

        begin  = 0;
        end    = length - 1;
        middle = (begin + end)/2;

        for (i = begin; i <= middle; i++) {
            if (inputString.charAt(begin) == inputString.charAt(end)) {
                begin++;
                end--;
            }
            else
                break;
        }
        if (i == middle + 1)
            System.out.println("You have entered Palindrome.");
        else
            System.out.println("The word you entered is not a palindrome.");
    }
    }

