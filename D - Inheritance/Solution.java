import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
	int id = scanner.nextInt();
        int numOfScores = scanner.nextInt();
        int[] scores = new int[numOfScores];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        Student student = new Student(firstName, lastName, 1234, scores);
        student.printPerson();
        System.out.println("Grade: " + student.calculate());

    }
}
