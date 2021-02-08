package ArrayAssignmentPrograms;

public class SmallestElement10 {
    public static void main(String[] args) {
        int a[] = {12,8,6,14,10};    
        int small= a[0]; 
        for (int i=0;i<a.length;i++) {    
           if(a[i] <small)  
               small = a[i];  
        }  
        System.out.println("Small Element: " + small);  
    }
}
