package Assignments;
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the non-veg from the following : 1.Chicken 2.Goat 3.Fish 4.Pawn 5.Bird .");
        int meat=sc.nextInt();

        switch (meat){
            case 1-> System.out.println("Chicken !! What a delicious meal, <3");
            case 2-> System.out.println("Goat !! What a delicious meal, <3");
            case 3-> System.out.println("Fish !! What a delicious meal, <3");
            case 4-> System.out.println("Pawn !! What a delicious meal, <3");
            case 5-> System.out.println("Bird !! What a delicious meal, <3");
            default-> System.out.println("Kabhi non-veg nahi khaya kya bhosdu !!??");

        }
    }





}
