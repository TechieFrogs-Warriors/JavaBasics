package ArrayAssignmentPrograms;

public class OddPosition8 {
    public static void main(String[] args) {
        int a[] = {12,14,18,19,20};  
        System.out.println("Odd Elements: "); 
        for (int i = 0; i < a.length; i++) {
            if(i%2!=0){
                System.out.print(a[i]+" ");
            }
             
        }  
    }
    
}
