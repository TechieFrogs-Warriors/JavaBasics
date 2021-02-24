package WiproPrograms;

import java.util.Scanner;

//program to find unique words in a string
public class UniqueWords 
{
    public static void main(String[] args) 
    {
        //Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();

        //calling method that finds unique word count
        int count = cal_NoOf_UniqueWords(str);
        System.out.println("Total number of unique words in are : " + count);
        sc.close();
        
    }

    // method to calculate the number of unique words
    public static int cal_NoOf_UniqueWords(String str) 
    {
        String[] words = str.split(" ");//to split words in a string based on space
        boolean[] arr = new boolean[words.length];//to avoid checking the repeated word more than once
        int i,j;
        int count = 0;
        for (i = 0; i < words.length; i++) 
        {
            if (!arr[i]) //checks whether the word is already checked or not. 
            {
                count++;
                for (j = i + 1; j < words.length; j++)
                {
                    if (words[j].compareTo(words[i]) == 0) 
                    {
                        arr[j] = true;
                        count--;
                    }
                }
            }
        }
        return count;
    }
}
