import com.easy.TwoSum;
import com.easy.ValidParentheses;

import java.util.Arrays;
import java.util.Scanner;
import  java.lang.String;

public class Main {

    public static void main(String[] args) {
        // write your code here

        TwoSum ts = new TwoSum();
        int[] nums = new int[]{1, 5, 6, 7, 8, 8};
        int[] ans = ts.twoSum(nums, 16);

        System.out.println(Arrays.toString(ans));


        // String c = "'(', '{', '[',']', '}', ')' ";
        Scanner scan = new Scanner(System.in);
        String c;
        System.out.println("enter the braces");
        c = scan.nextLine();
        if (isValid(c))

            System.out.print("balanced");
        else
            System.out.print("not balanced");

    }
}