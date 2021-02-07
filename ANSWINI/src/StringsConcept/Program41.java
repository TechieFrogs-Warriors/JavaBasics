package StringsConcept;

import java.util.Scanner;

public class Program41 
{
    public static void findWords(String n)
    {
        String  words[] = n.split(" ");//dividing string based on space
        int smallestWordLen = Integer.MAX_VALUE;
        int largestWordLen = 0;
        String smallestWord = "";
        String largestWord = "";
        for (int i = 0; i < words.length ; i++) 
        {
            String word = words[i];
            int len = word.length();
            if(len > largestWordLen)
            {
                largestWordLen = len;
                largestWord = word;
            }
            if(len < smallestWordLen) 
            {
                smallestWordLen = len;
                smallestWord = word;
            }
        }
        System.out.println("Smallest Word: " + smallestWord);
        System.out.println("Largest Word: " + largestWord);
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string of words");
        String inp=sc.nextLine();
        findWords(inp);
        sc.close();
    }
    
}
