
// 题目1538：GrassLand密码

/**
 * @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2015-06-30 11:01:56
 * @url:http://ac.jobdu.com/problem.php?pid=1538
 */

import java.util.HashMap;
#include <stdio.h>
#include <string.h>

const int maxn = 10002;
char input[maxn];
int num[26] = {2, 2, 2,
        3, 3, 3,
        4, 4, 4,
        5, 5, 5,
        6, 6, 6,
        7, 7, 7, 7,
        8, 8, 8,
        9, 9, 9, 9};

int main() {
    while (scanf("%s", input) != EOF) {
        int len = strlen(input);
        for (int i = 0; i < len; i++) {
            printf("%d", num[input[i] - 'a']);
        }
        printf("\n");
    }
    return 0;
}

/**************************************************************
Problem: 1538
User: wangzhenqing
Language: C++
Result: Accepted
Time:50 ms
Memory:1032 kb
****************************************************************/


                        

