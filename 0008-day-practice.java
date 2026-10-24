/*给你一个字符串 s ，将该字符串中的大写字母转换成相同的小写字母，返回新的字符串。

 

示例 1：

输入：s = "Hello"
输出："hello"
示例 2：

输入：s = "here"
输出："here"
示例 3：

输入：s = "LOVELY"
输出："lovely"
 

提示：

1 <= s.length <= 100
s 由 ASCII 字符集中的可打印字符组成*/
//a97-A65，Z90-z122
class Solution {
    public String toLowerCase(String s) {
        char [] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char S = s.charAt(i);
            if(65<=S && S<=90 ){
                arr[i] = (char)(S+32);
            }else{
                arr[i]=S;
            }
        }
        return new String(arr);
    }
}
