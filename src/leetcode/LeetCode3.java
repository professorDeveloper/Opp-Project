package leetcode;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> leetcode
 * Class Name -> LeetCode3
 * Copyright © : 8/23/2022
 */
public class LeetCode3 {
    public static void main(String[] args) {
        System.out.println(DefendingIp("1.2.3.4.5.6"));
    }
  public   static String DefendingIp(String str)
    {
        String defangIP = "";
        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(c == '.')
            {
                defangIP += "[.]";
            }
            else
            {
                defangIP += c;
            }
        }
        return defangIP;
    }
}
