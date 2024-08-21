package BT3;

import java.util.ArrayList;
import java.util.List;

public class ShortestWordFinder {
    public static void main(String[] args) {
        String sentence = "Học viện Rikkei Academy là nơi để nông dân học code";


        String[] wordsArray = sentence.split(" ");
        List<String> wordList = new ArrayList<>();
        for (String word : wordsArray) {
            wordList.add(word);
        }


        List<String> newList = new ArrayList<>();
        int minLength = wordList.get(0).length();
        for (String word : wordList) {
            if (word.length() < minLength) {
                minLength = word.length();
                newList.clear();
                newList.add(word);
            } else if (word.length() == minLength) {
                newList.add(word);
            }
        }


        System.out.println("Các từ có độ dài ngắn nhất trong câu:");
        for (String word : newList) {
            System.out.println(word);
        }
    }
}
