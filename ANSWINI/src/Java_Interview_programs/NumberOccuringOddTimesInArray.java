package Java_Interview_programs;

//import java.util.HashMap;
//import java.util.Map.Entry;

//Find the number occurring odd number of times in an array
public class NumberOccuringOddTimesInArray 
{
    int getOddTimesElement(int ar[]) 
    {
        int i;
        int result = 0;
        for (i = 0; i < ar.length; i++) 
        {
            // XOR operation
            result = result ^ ar[i];
        }
        return result;
    }

    //Another logic
    /*  int getOddTimesElementHashing(int ar[]) 
    {
        int i;
    
        HashMap<Integer,Integer> elements=new HashMap<Integer,Integer>();
        for (i = 0; i < ar.length; i++) 
        {
            int element=ar[i];
            if(elements.get(element)==null)
            {
                elements.put(element, 1);
    
            }
            else
                elements.put(element, elements.get(element)+1);
        }
        for (Entry<Integer,Integer> entry:elements.entrySet()) 
        { 
            if(entry.getValue()%2==1)
            {
                return entry.getKey();
            }
    
        } 
        return -1;
    } */
  
 
    public static void main(String[] args) 
    {
        NumberOccuringOddTimesInArray occur = new NumberOccuringOddTimesInArray();
        int arr[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        System.out.println("Number which occurs odd number of times is : "+occur.getOddTimesElement(arr));
        //using hashing logic method
        //System.out.println("Number which occurs odd number of times is : "+occur.getOddTimesElementHashing(arr));
    }
}
