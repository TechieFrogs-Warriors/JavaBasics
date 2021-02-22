package WiproPrograms;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = vallidation(scan);
        //create an array
        int arr[]=new int[num];
        System.out.println("Enter prices:");
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter value: ");//assign values to an array
            arr[i]=scan.nextInt();
        }
        //sum of the prices
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        //cheaking perfect cube or not
        int cube = p_Cube(sum);
        if(sum==cube){
            System.out.println("yes");
        }
        else{
            int difference=cube-sum;
            System.out.println("amount:"+difference);
        }
    }
    //vallidation part
    public static int vallidation(Scanner scan){
        int num;
        do{
            System.out.println("Enter Number of values:");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer only.");
                scan.next();
            }
            num=scan.nextInt();
        }
        while(num<0);
        return num;
    }
    //perfect cube
    public static int p_Cube(int cube){
        int p_cube = (int)Math.round(Math.cbrt(cube))+1;
        int cb = p_cube * p_cube * p_cube;
        if(cube == cb){
            return 0;
        }
        else
        return cb;
    }
}
