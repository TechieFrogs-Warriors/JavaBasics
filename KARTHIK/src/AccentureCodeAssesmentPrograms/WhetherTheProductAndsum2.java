package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

class Product_Sum{
    public void ProSum(int arr1[],int arr2[]){
        int sum=0,product=1;
        for(int i=0;i<arr1.length;i++){
            sum=arr2[i]+arr1[i];
            product=arr1[i]*arr2[i];
        }
        if(sum==product){
            System.out.println("Product and Sum of the 2 Arrays are Equal.");
        }
        else{
            System.out.println("Product and Sum of the 2 Arrays are Not Equal");
        }
    }
}
public class WhetherTheProductAndsum2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Array length");
        int len=scan.nextInt();
        System.out.println("Enter values to arr1:");
        int arr1[]=new int[len];
        for(int i=0;i<len;i++){//assgning values to array 1
            System.out.println("Enter Value: ");
            arr1[i]=scan.nextInt();
        }
        System.out.println("Enter values to arr2:");
        int arr2[]=new int[len];
        for(int i=0;i<len;i++){// assigning values to arr 2
            System.out.println("Enter Value: ");
            arr2[i]=scan.nextInt();
        }
        Product_Sum obj=new Product_Sum();
        obj.ProSum(arr1, arr2);
        scan.close();
    }
}
