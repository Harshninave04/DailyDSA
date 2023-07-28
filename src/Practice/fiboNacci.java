package Practice;
import java.util.Scanner;
public class fiboNacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for fibonacci series :");
        int num = sc.nextInt();
        int ans = fibon(num);
    }
    private static int fibon(int num) {
            int start = 0;
            int next = 1;
            int sum = 0;
            System.out.print(start + " " + next + " ");
            for (int i = start; i < num - 1; i++) {
                sum = start + next;
                System.out.print(sum + " ");
                start = next;
                next = sum;
            }
            return sum;
        }
}
