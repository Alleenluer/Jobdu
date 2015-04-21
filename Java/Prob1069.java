
// 题目1069：查找学生信息

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015年04月21日23:14:47
 * @url:http://ac.jobdu.com/problem.php?pid=1069
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prob1069 {

    /*
     * 1069
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String[]> stuMap = new HashMap<String, String[]>();
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            for (int i = 0; i < N; i++) {
                String array[] = new String[4];
                for (int j = 0; j < array.length; j++) {
                    array[j] = scanner.next();
                }
                stuMap.put(array[0], array);
            }
            int M = scanner.nextInt();
            for (int i = 0; i < M; i++) {
                String id = scanner.next();
                String array[] = stuMap.get(id);
                if (array == null) {
                    System.out.println("No Answer!");
                } else {
                    System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3]);
                }
            }
        }
    }
}
/**
 * ***********************************************************
 * Problem: 1069
 * User: wzqwsrf
 * Language: Java
 * Result: Accepted
 * Time:870 ms
 * Memory:41008 kb
 * **************************************************************
 */