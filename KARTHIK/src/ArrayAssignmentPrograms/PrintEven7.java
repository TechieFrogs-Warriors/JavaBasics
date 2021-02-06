package ArrayAssignmentPrograms;

public class PrintEven7 {
    public static void main(String[] args) {
        int a[] ={55,77,24,64,88};  
        System.out.println("Even elements: ");   
        for (int i = 0; i < a.length; i++) { 
            if(i%2==0){
                System.out.print(a[i]+" ");
            }
              
        }  
    }
}
