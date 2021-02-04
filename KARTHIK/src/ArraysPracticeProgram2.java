public class ArraysPracticeProgram2 {
    public static void main(String[] args) {
        int a[]={3,5,7,9};
        add(a);
        
    }
    static void add(int a[]){
        int j=0;
        for(int i=0;i<a.length;i++){
            j=j+a[i];
        }
        System.out.println("Sum of the Array Value is: "+j);
    }
    
}
