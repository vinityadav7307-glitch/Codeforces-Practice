// Problem Statement  (Atcoder Prefix and Suffix)
// You are given two strings 
// S and 
// T consisting of lowercase English letters. The lengths of 
// S and 
// T are 
// N and 
// M, respectively. (The constraints guarantee that 
// N≤M.)

// S is said to be a prefix of 
// T when the first 
// N characters of 
// T coincide 
// S.
// S is said to be a suffix of 
// T when the last 
// N characters of 
// T coincide 
// S.

// If 
// S is both a prefix and a suffix of 
// T, print 
// 0;
// If 
// S is a prefix of 
// T but not a suffix, print 
// 1;
// If 
// S is a suffix of 
// T but not a prefix, print 
// 2;
// If 
// S is neither a prefix nor a suffix of 
// T, print 
// 3.

// Constraints
// 1≤N≤M≤100
// S is a string of length 
// N consisting of lowercase English letters.
// T is a string of length 
// M consisting of lowercase English letters.


import java.util.*;

public class PrefixAndSuffix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        String S = sc.next();
        String T = sc.next();

        boolean isPrefix = T.startsWith(S);
        boolean isSuffix = T.endsWith(S);

        if (isPrefix && isSuffix) {
            System.out.println(0);
        } else if (isPrefix) {
            System.out.println(1);
        } else if (isSuffix) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
        sc.close();
    }
}