package WiproAdvanced_Programs;

import java.util.Scanner;

import TCS_Programs.Validation;

public class RotateAndCompare 
{
    public static void main(String[] args) 
    {
        //Reading user input and validating that input
        Scanner sc = new Scanner(System.in);

        //Take two strings
        String str1 = Validation.stringValidation(sc);
        String str2 = Validation.stringValidation(sc);

        //How many times to rotate
        int R = Validation.integerValidation(sc);

        //calling method to check whether both strings are same after rotating 2 times
        boolean same = isRotated(str1,str2,R);

        //printing final result
        System.out.println(same);
        
    }

    //method that implements logic to check whether both strings are same after rotating 2 times
    public static boolean isRotated(String str1,String  str2,int R) 
    {
        //convert two strings into character arrays
        char[] firstStr = str1.toCharArray();
        char[] secondStr = str2.toCharArray();
        char[] firstTemp = firstStr;
        boolean flag = false;

        int i,j,k,l;
        if(flag==false)
        {
           //Left Rotation
            for(i=0;i<R;i++)
            {
                char temp = firstStr[0]; // placing first element in temporary variable
                for(k=0;k<firstStr.length-1;k++)
                {
                    firstStr[k] = firstStr[k+1]; //placing next position element to first position
                
                }
                firstStr[firstStr.length-1] = temp; //placing temporary value at the last of the array
            }
            for(i=0;i<str1.length();i++)
            {
                
                if(firstStr[i]==(secondStr[i]))
                {
                    flag = true;
                }
                else
                flag = false;
                
            }

        }
        if(flag!=true)
        {
           //Right Rotation
            for(j=0;j<R;j++)
            {
                char temp2 = firstTemp[firstTemp.length-1]; // placing first element in temporary variable
                for(l=firstTemp.length-1;l>0;l--)
                {
                    firstTemp[l] = firstTemp[l-1]; //placing next position element to first position
                    
                }
                firstTemp[0] = temp2; //placing temporary value at the last of the array
            }
            for(i=0;i<str1.length();i++)
            {
                
                if(firstTemp[i]==(secondStr[i]))
                {
                    flag = true;
                }
                else
                flag = false;
                
            }
            
        }
       
        return flag;
    }

}
