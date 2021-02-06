package ArrayAssignmentPrograms;
public class LargestElement9 {
    public static void main(String[] args) {
        int a[] = {12,8,78,14,2};    
        int large= a[0];  
        for (int i=0;i<a.length;i++) {   
           if(a[i] > large)  
               large=a[i];  
        }  
        System.out.println("Large Element: " + large);  
    }
}
