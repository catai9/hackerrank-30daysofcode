// Problem: https://www.hackerrank.com/challenges/30-binary-numbers/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //current counter
        int consecutive = 0;
        int maxConsecutive = 0;

        int prev = 0;
        int curr = 0;

        while(n > 0){
            curr =n%2;
            n = n/2;
            if(curr == prev && curr == 1){
                consecutive++;
            }
            else if (curr == 1)
                consecutive = 1;
            else
                consecutive = 0;
            maxConsecutive = Math.max(maxConsecutive, consecutive);
            prev = curr;
        }
        System.out.print(maxConsecutive);

        scanner.close();
    }
}
