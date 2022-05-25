package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        LengthOfLongestSubsting("abcabcab");
    }

    private static void LengthOfLongestSubsting(String s) {
       String Long_String=null;
       int LongestSubstringLength=0;
       Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
       char[] arr= s.toCharArray();
       for(int i=0;i< arr.length;i++){
           char ch=arr[i];
           if(!map.containsKey(ch)){
               map.put(ch,i);
           }else{
               i=map.get(ch);
               map.clear();
           }
           if(map.size()>LongestSubstringLength){
             LongestSubstringLength= map.size();
             Long_String=  map.keySet().toString();
           }
       }
       System.out.println("The Longest Substring" + Long_String);
       System.out.println("The Longest Substring Length " + LongestSubstringLength);
    }
}
