import java.util.Scanner;

public class example2{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word to modify and command in the format: command_word");
        String input = sc.nextLine();
        String upper = new String("upper");
        String lower = new String("lower");
        if (input.startsWith(upper)){
            String upperInput = input.substring(6).toUpperCase();
            System.out.println(upperInput);
        }
        else if (input.startsWith(lower)){
            String lowerInput = input.substring(6).toLowerCase();
            System.out.println(lowerInput);
        }
        else {
            System.out.println("Invalid command");
        }
    } 
}