package ArrayAssignmentPrograms;

import java.util.Scanner;

public class FrequencyOfElements2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter No.values Of a:");
        int n=scan.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter value:");
            a[i]=scan.nextInt();
        }
        
        int count,found;
        for(int i=0;i<a.length;i++){
            count=1;
            found=0;
            for(int j=0;j<a.length;j++) {
                if(j>=i){
                    if(a[i]==a[j]&&i!=j){
                        count++;
                    }
                }
                else if(a[i]==a[j]){
                    found=1;
                    break;
                }
            } 
            if(found!=1){
                System.out.println("frequency of an element: "+a[i]+" is "+count);
            }   
        }
        scan.close();
    }
}
