package JavaAdvanceTask4;

import java.util.Scanner;

public class Week extends Exception {
    public static void main(String[] args) {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        try {
            {
                System.out.println(String.valueOf(weekDays[a]));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid day position.Please enter a value between 0 and 6");
        }
    }


}

