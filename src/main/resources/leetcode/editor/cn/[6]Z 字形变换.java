//将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。 
//
// 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下： 
//
// L   C   I   R
//E T O E S I I G
//E   D   H   N
// 
//
// 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。 
//
// 请你实现这个将字符串进行指定行数变换的函数： 
//
// string convert(string s, int numRows); 
//
// 示例 1: 
//
// 输入: s = "LEETCODEISHIRING", numRows = 3
//输出: "LCIRETOESIIGEDHN"
// 
//
// 示例 2: 
//
// 输入: s = "LEETCODEISHIRING", numRows = 4
//输出: "LDREOEIIECIHNTSG"
//解释:
//
//L     D     R
//E   O E   I I
//E C   I H   N
//T     S     G 
// Related Topics 字符串 
// 👍 904 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convert(String s, int numRows) {
        if (numRows < 2){
            return s;
        }
        char[] chars = s.toCharArray();
        StringBuilder buffer = new StringBuilder();
        int step = numRows * 2 - 2, lLength, rLength, count, oddCount;
        // 逐行
        for (int index = 1; index <= numRows; index++) {
            lLength = 2 * (index - 1);
            rLength = step - 2 * (index - 1);
            if (index == numRows || index == 1) {
                lLength = step;
                rLength = step;
            }
            count = index - 1;
            oddCount = 0;
            while (count < chars.length) {
                buffer.append(chars[count]);
                // 奇数lLength / 偶数rLength
                count = count + (++oddCount % 2 == 0 ? lLength : rLength);
            }
        }
        return buffer.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
