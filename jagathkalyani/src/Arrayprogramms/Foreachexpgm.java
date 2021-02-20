package Arrayprogramms;

public class Foreachexpgm   //ex-1
 {
    public static void main(String[] args)
     {
        int[] numbers={3,9,5,-5};//creating an array
           //for each loop
        for(int number :numbers)
        {
            System.out.println(number);
        }
    }  

}
class abc{//ex-2
    public static void main(String[] args) {
        int[] num={3,4,5,-5,0,12};
        int sum=0;
        for(int nu:num){   //iteratingeach elementof array
            sum+=nu;
        }
        System.out.println("sum :"+ sum);
    }
}
 

//////for loop vs for-each loop


class xyz{
    public static void main(String[] args) {
        char[] vowels={'a','e','i','o','u'};
        for(int i=0;i<vowels.length;i++){       //using for loop
           System.out.println(vowels[i]);

        // for(char item: vowels){    //using for-each loop
        //     System.out.println(item);
         }
        
        
    }

}
