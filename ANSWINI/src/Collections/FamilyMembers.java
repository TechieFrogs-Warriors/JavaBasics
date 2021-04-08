package Collections;

import java.util.*;

public class FamilyMembers
{
    public static void main(String[] args) 
    {
        //creating an arraylist
        List<String> names  = new ArrayList<>();

        System.out.println("Family members are: ");
        //Adding names of family members into arraylist
        names.add("answini");
        names.add("bharat");
        names.add("achyuth");
        names.add("vedhansh");

        //printing the family member names using foreach loop
        for(String i:names)
        {
            System.out.println(i);
        }

        
    }
}
