package com.apple.developer.test2;
public class Inversion {
    protected String reverse(String s) {
        char[] ch = s.toCharArray();
        char[] ch1 = new char[ch.length];
        int count = ch.length - 1;
        for (char c : ch) {//ASCII表中大写字母的值为[65,90],小写字母为[97,122]
            int in = c;//获取ASCII值
//            if (in >= 65 && in <= 90) {//大写字母
//                String str = String.valueOf(c);//转换为字符串
//                String str1 = str.toLowerCase();//转换为小写字符串
//                char[] c1 = str1.toCharArray();//转换为字符数组
//                c = c1[0];
//            }
//            if (in >= 97 && in <= 122) {
//                String str = String.valueOf(c);//转换为字符串
//                String str1 = str.toUpperCase();//转换为小写字符串
//                char[] c1 = str1.toCharArray();//转换为字符数组
//                c = c1[0];
//            }
            //以上写法是为了练习技巧，实际操作中可以使用以下方法直奔目的
            if (in >= 65 && in <= 90) {
                in ^= ' ';
            } else {
                if (in >= 97 && in <= 122) {
                    in ^= ' ';
                }
            }
            c = (char) in;
            ch1[count] = c;
            count--;
        }
        return String.valueOf(ch1);
    }
}
