package ArrayAssignmentPrograms;

public class ArrayContainsGivenValue48 {
    public static void main(String[] args) {
        char a[]={'k','b','p','s','o','u','l'};
        char ch='s';
        int count =0;
        for(int i=0;i<a.length;i++){
            if(a[i]==ch){
                count++;
            }
        }
        if(count==1){
            System.out.println("Given Value is Present in the Array.");
        }
        else{
            System.out.println("Not present in the Array.");
        }
    }
}
