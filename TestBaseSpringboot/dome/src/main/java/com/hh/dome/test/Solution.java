package com.hh.dome.test;


class Solution {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String string = longestCommonPrefix(strs);
        System.out.println(string);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        int len = 0;
        for (String string : strs) {
            len = Math.max(len, string.length());
        }

        int[][] arrs = new int[strs.length][len];
        initArr(arrs, strs);
        int num = 0;
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            int temp = arrs[0][i];
            for (int j = 1; j < strs.length; j++) {
                int i1 = arrs[j][i];
                if (i1 != temp) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
            num++;
        }
        String substring = strs[0].substring(0, num);
        return substring;
    }

    private static void initArr(int[][] arrs, String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                arrs[i][j] = strs[i].charAt(j);
            }
        }
    }

}