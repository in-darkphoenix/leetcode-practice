package part1;
// https://leetcode.com/problems/longest-common-prefix/

public class LCPrefix {
    // public String lCPrefix(String[] s) {
    // int l = s.length;
    // String ans = "";
    // for (int idx = 0;; idx++) {
    // int j = 0;
    // while (j + 1 < s.length) {
    // if (s[j].charAt(idx) != s[j + 1].charAt(idx))
    // break;
    // ans += s[idx].charAt(j);
    // j++;
    // }
    // }
    // return null;
    // }

    public String lCPrefixN(String[] strs) {
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0)
                pre = pre.substring(0, pre.length() - 1);
        }
        return pre;
    }

    public static void main(String[] ar) {
        LCPrefix lcp = new LCPrefix();
        String[] srr = { "flower", "flow", "flight" };
        System.out.println(lcp.lCPrefixN(srr));
    }
}
