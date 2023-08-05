/*
Prob:- Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

       Note that the same word in the dictionary may be reused multiple times in the segmentation.

Example 1:-
   Input: s = "leetcode", wordDict = ["leet","code"]
   Output: true
   Explanation: Return true because "leetcode" can be segmented as "leet code".

Example 2:-
  Input: s = "applepenapple", wordDict = ["apple","pen"]
  Output: true
  Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
                Note that you are allowed to reuse a dictionary word.

Example 3:-
   Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
   Output: false
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SegmentString segmentString = new SegmentString();
      /*  String s = "leetcode";
        List<String> wordDict = new ArrayList<>(Arrays.asList("leet","code"));
        String s = "applepenapple";
        List<String> wordDict = new ArrayList<>(Arrays.asList("apple","pen"));*/
        String s = "catsandog";
        List<String> wordDict = new ArrayList<>(Arrays.asList("cats","dog","sand","and","cat"));

        boolean isSegmented = segmentString.wordBreak(s, wordDict);
        System.out.println(isSegmented);
    }
}