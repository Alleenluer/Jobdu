
// 题目1018：统计同成绩学生人数

/* @author:wangzq
 * @email:wangzhenqing1008@163.com
 * @date:2014年07月16日18:58:46
 * @url：http://ac.jobdu.com/problem.php?pid=1018
 * 本题目技巧在于数组的巧妙使用。
 * 将数据具体内容当做另外一个数组下标，统计同成绩人数。
 * 解题思路参考http://blog.csdn.net/u013027996/article/details/17186375
 */

#include <stdio.h>
#include <string.h>
const int maxn = 1002;
const int maxm = 102;
int array[maxn];
int numArr[maxm];
int i;
int n;

int main(){
    while(scanf("%d",&n) != EOF){
        if(n == 0){
            break;
        }
        memset(numArr, 0 , sizeof(numArr));
        for(i = 0 ; i < n ; i++){
            scanf("%d",&array[i]);
            numArr[array[i]]++;
        }
        int score;
        scanf("%d",&score);
        printf("%d\n", numArr[score]);
    }
    return 0;
}
/**************************************************************
 Problem: 1018
 User: wangzhenqing
 Language: C++
 Result: Accepted
 Time:10 ms
 Memory:1024 kb
 ****************************************************************/