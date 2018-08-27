public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
         try {
            int value = Integer.valueOf(S);
            System.out.print(value);
        }catch (Exception ex){

            System.out.print("Bad String");
        }
    }
}
