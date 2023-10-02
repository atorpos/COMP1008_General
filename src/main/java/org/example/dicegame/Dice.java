package org.example.dicegame;
import java.util.*;

public class Dice {
    private enum Status {CONTINUES, WIN, LOSE};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numberarray = new ArrayList<>();
        Status gamestatus;
        int dice_sum = 0;
        int t_try = 0;
        int final_value []= new int[]{7,11};
        int roll_over_value [] = new int[]{4,5,6,8,9,10};

        System.out.println("Press enter to continue...");
        sc.nextLine();

        dice_sum = gennumber();
        System.out.printf("the gen number is %s%n", dice_sum);

//        switch (dice_sum) {
//            case 7:
//            case 11:
//                System.out.println("You win!");
//                gamestatus = Status.WIN;
//                break;
//            case 2:
//            case 3:
//            case 12:
//                System.out.println("You lose");
//                gamestatus = Status.LOSE;
//                break;
//            default:
//                gamestatus = Status.CONTINUES;
//                break;
//        }

        if(dice_sum == 7 || dice_sum == 11) {
            System.out.printf("You win!");
        } else if (dice_sum == 2 || dice_sum == 3 || dice_sum == 12) {
            System.out.printf("You lose");
        } else {
            second_attamp(dice_sum);
        }
    }

    public static int gennumber() {
            int sum_of_throw = 0;
        for(int i = 0; i < 2; i++){
            Random new_rand = new Random();
            int one_throw = new_rand.nextInt(6) +1;
            sum_of_throw = sum_of_throw +  one_throw;
            System.out.printf("This throw is %s.%n", one_throw);
        }
        return sum_of_throw;
    }

    public static void second_attamp(int point_value) {
        int try_attempt = 0;
        int return_value = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Your point is %d%n", point_value);
        do {
            try_attempt = try_attempt +1;
            System.out.println("Press enter to continue...");
            sc.nextLine();
            return_value = gennumber();
            System.out.printf("The value is %d%n", return_value);
            if(return_value == 7 || return_value > point_value){
                System.out.println("You lose");
                break;
            } else {
                System.out.printf("You win, the try attempt is %d %n", try_attempt);
            }
//            if(return_value == point_value) {
//                System.out.println("You Win");
//                break;
//            }
        } while (point_value != return_value);


    }
}
