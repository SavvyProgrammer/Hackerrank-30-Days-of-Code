import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int base10Number = scanner.nextInt();
        Stack<Integer> remainder = new Stack<>();

        while (base10Number != 0){
            remainder.push(base10Number % 2);
            base10Number = base10Number / 2;
        }

        int consecutive1 = 0;
        while (remainder.pop() != 0){
            consecutive1 += 1;
        }
        System.out.println(consecutive1);
        
//        You can also you a for loop, like the one below or replace the while loop:

//        for (int i = remainder.size() - 1; i >= 0; i--){
//            if (remainder.get(i) == 0){
//                break;
//            }
//            consecutive1 += 1;
//        }
    }
}
