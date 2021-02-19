package Stringprograms;
//check if a word is palindrome or not

public class Strass46 {
    public static boolean checkpalin(String word)
    {
        int n=word.length();
        word = word.toLowerCase();
        for(int i=0;i<n;i++,n--)//loop to check palindrome
        {
            if(word.charAt(i) !=word.charAt(n-1))
            return false;
        }
        return true;
    }
    //to check smallest and longest palindrome word in a given string
    public static void lengthpalindrome(int temp,String words[])
    {
        int count=0;
        String smallest="",longest="";
        for(int i=0;i<temp;i++)
        {
            if(checkpalin(words[i])){
                count++;
                if(count ==1)//initialize smallest and longest when first palindrome word is found
                    smallest=longest=words[i];//compare smallest and longest palindromic word
                 else
                    {
                    if(smallest.length()>words[i].length())//if length of smallest is greaterthan
                    smallest=words[i];// next palindromic word then it store in smallest
                    if(longest.length()>words[i].length())//if length of longest is lessthan
                    longest=words[i];// next palindromic word then it store in longest
                     }

            }
                if(count==0)
                    System.out.println("no palindrome found");
                else
                {
                    System.out.println("smallest palindrome : " + smallest);
                    System.out.println("biggest palindrome : " + longest);
                 }
                

        }
            
    }
    public static void main(String[] args) {
        String string="wow madam is driving racecar";
        String word="";
        String[] words =new String[100];
        int temp=0;
       // string=string + " ";
        for(int i=0;i<string.length();i++){
            if(string.charAt(i) != ' ')//spliting string into words
            {
                word =word+string.charAt(i);
            }
            else{
                words[temp]=word;
                temp++;
                word=" ";
            }
        }
        System.out.println("input string : " + string);
        lengthpalindrome(temp, words);
        
    }
    
    
    
}
