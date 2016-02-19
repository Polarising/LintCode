/*
 Author:     Yang Deng, yd581@nyu.edu
 Date:       Nov 24, 2015
 Problem:    Two Strings Are Anagrams
 Difficulty: Easy
 Source:     http://www.lintcode.com/en/problem/two-strings-are-anagrams/
 Notes:
 Write a method anagram(s,t) to decide if two strings are anagrams or not.
 Example:
 Given s="abcd", t="dcab", return true.
 Challenge:
 O(n) time, O(1) extra space
*/
public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if(s.length()!=t.length()){
            return false;
        }
        
        //Method 1: There are 128 ASCII CODE
        int[] array1=new int[128];
        int[] array2=new int[128];
        for(int i=0;i<s.length();i++){
            char temp1=s.charAt(i);
            array1[temp1]=array1[temp1]+1;
            char temp2=t.charAt(i);
            array2[temp2]=array2[temp2]+1;
        }
        for(int i=0;i<128;i++){
            if(array1[i]!=array2[i]){
                return false;
            }
        }
        return true;
        
        //Method 2:
        // Map<Character,Integer> map1=new HashMap<Character,Integer>();
        // Map<Character,Integer> map2=new HashMap<Character,Integer>();
        // Set<Character> set=new HashSet<Character>();
        // for(int i=0;i<s.length();i++){
        //     char temp1=s.charAt(i);
        //     if(map1.containsKey(temp1)){
        //         map1.put(temp1,map1.get(temp1)+1);
        //     }else{
        //         map1.put(temp1,1);
        //     }
        //     char temp2=t.charAt(i);
        //     if(map2.containsKey(temp2)){
        //         map2.put(temp2,map2.get(temp2)+1);
        //     }else{
        //         map2.put(temp2,1);
        //     }
        //     set.add(temp2);
        // }
        // for(char c : set){
        //     if(map1.containsKey(c)){
        //         if(map1.get(c)!=map2.get(c)){
        //             return false;
        //         }
        //     }else{
        //         return false;
        //     }
        // }
        // return true;
    }
};
