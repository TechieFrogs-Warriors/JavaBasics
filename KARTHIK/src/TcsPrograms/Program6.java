package TcsPrograms;

import java.util.Scanner;

public class Program6 {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int stops=vallidation(scan);
       int path[]=new int[stops];
       String busStops[]= new String[stops+1];//to store stop names
       System.out.println("Enter the array elements ");
       for(int i=0;i<path.length;i++){
           path[i]=scan.nextInt();//path meters
        }
        System.out.println("Enter the array elements");
        for(int i=0;i<busStops.length;i++){
            busStops[i]=scan.nextLine();///to get index
        }
        float fare=0,sum=0;
        int start=0,end=0;
        String source=StringInputValidation(scan);
        String destination=StringInputValidation(scan);
        //to get index
        for(int i=0;i<busStops.length;i++){
            if(busStops[i].equals(source)){
                start=i; 
            }
            if(busStops[i].equals(destination)){
                end=i;
            }
        }
        //two inputs are equal 
        if(start==end){
            System.out.println("INVALID INPUT");
        }
        else{
            if(start==busStops.length-1){//if starting point is end
                for(int j=0;j<end;j++){
                sum=sum+path[j];
            }
            fare=sum/200;
            System.out.println((float)Math.ceil(fare));
        }
        else{
            //if starting is greater then end position
            for(int i=start;i<path.length;i++){
                sum=sum+path[i];//upto end sum path length
            }
            for(int j=0;j<end;j++){
                sum=sum+path[j];//start to end point path length
            }
            fare =(float)Math.ceil(sum/200);
            System.out.println(fare);
        }
    }
}
// int vallidation
public static int vallidation(Scanner scan){
    int num;
    do{
        System.out.println("Enter the valid number");
        while(!scan.hasNext()){
            System.out.println("Entered number  is not valid .Please enter valid number");
            scan.next();
        }
        num=scan.nextInt();
    }
    while(num<=0);
    return num;
}
//string validation
public static String StringInputValidation(Scanner scan){
    String str;
    do{
        System.out.println("Enter valid number");
        while(!scan.hasNext("[A-Za-z]*")){
            System.out.println("Entered string is invalid.Please enter valid String");
            scan.next();
        }
        str=scan.nextLine();
    }
    while(str==" ");
    return str;
    }
}
