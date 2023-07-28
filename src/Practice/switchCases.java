package Practice;

import java.time.MonthDay;

public class switchCases {

    public static void cases(int num){
        switch(num){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("INVALID ");
        }
    }

    public static String greet(){
        String greeting = "I'm fine , how are yuu ??";
        return greeting;
    }



    public static void main(String[] args){
        int num = 26;
//        cases(num);
        System.out.println("How are you meri jaan ?? ");
        System.out.println(greet());
    }
}
