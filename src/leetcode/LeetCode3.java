package leetcode;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode3
 * Copyright © : 8/23/2022
 */
public class LeetCode3 {
    public static void main(String[] args) {
        System.out.println(DefendingIp("0.0.0.0.0.0.0"));
    }
  public   static String DefendingIp(String str)
    {
        StringBuilder defangIP = new StringBuilder();
        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(c == '.')
            {
                defangIP.append("[.]");
            }
            else
            {
                defangIP.append(c);
            }
        }
        return defangIP.toString();
    }
}
