import java.util.Scanner;

public class example3{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert a day number: ");
        int dayNumber = sc.nextInt();
        String dayName = switch (dayNumber) {
          case 1 -> "Monday";
          case 2 -> "Tuesday";  
          case 3 -> "Wednesday";
          case 4 -> "Thursday";
          case 5 -> "Friday";
          case 6 -> "Saturday";
          case 7 -> "Sunday";
          default -> "Invalid Day";
        };
        System.out.println(dayName);
    }
}