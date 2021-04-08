package Collections;

import java.util.ArrayList;
import java.util.List;

public class DuplicateValues 
{
    public static void main(String[] args) 
    {
        //creating an arraylist
        List<String> dupNames = new ArrayList<>();

        //Adding string elements into arraylist
        for(int i=0;i<5;i++)
        {
            dupNames.add("aswini");
        }
        //Print the arraylist
        System.out.println(dupNames);
        
    }
    
}
