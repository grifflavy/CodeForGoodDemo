package CodeForGoodDemo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class anagram{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a word: ");
        String word1 = input.nextLine();
        System.out.print("Please input a possible anagram: ");
        String word2 = input.nextLine();
        Map<Character, Integer> hash1 = new HashMap();
        Map<Character, Integer> hash2 = new HashMap();
        if(word1.length() !=  word2.length()){
            System.out.println("This isn't an anagram");
        }
        for(int i =0; i < word1.length(); i++){
            if(hash1.containsKey(word1.charAt(i))){
                int temp = hash1.get(word1.charAt(i));
                hash1.replace(word1.charAt(i), temp++);
            }
            else{
                hash1.put(word1.charAt(i), 1);
            }
            if(hash2.containsKey(word2.charAt(i))){
                int temp = hash2.get(word1.charAt(i));
                hash2.replace(word2.charAt(i), temp++);
            }
            else{
                hash2.put(word2.charAt(i), 1);
            }
        }
        if(hash1.equals(hash2)){
            System.out.println("This is a anagram");
        }
        else{
            System.out.println("This is not a anagram");
        }
          input.close();
    }
}