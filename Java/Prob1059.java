
// 题目1059：abc

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月19日21:49:22
 * @url:http://ac.jobdu.com/problem.php?pid=1059
 */

public class Prob1059 {
    /*
     * 1059
     */
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    String abc = (i + "") + (j + "") + k;
                    String bcc = (j + "") + (k + "") + k;
                    if (Integer.parseInt(abc) + Integer.parseInt(bcc) == 532) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}

/**
 * ***********************************************************
 * Problem: 1059
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:70 ms
 * Memory:14752 kb
 * **************************************************************
 */