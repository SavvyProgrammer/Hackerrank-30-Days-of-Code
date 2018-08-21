import java.util.Scanner;
class Solution{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);

    }

}
class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {

        this.elements = elements;

    }
    
    public void computeDifference() {
        int max = Integer.MIN_VALUE;
        int n = elements.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, Math.abs(elements[i] - elements[j]));
            }
        }
        maximumDifference = max;

    }
}



