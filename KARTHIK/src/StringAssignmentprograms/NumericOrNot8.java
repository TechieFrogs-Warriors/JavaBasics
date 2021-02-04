package StringAssignmentprograms;
//Java Program to Check if a String is Numeric (exceptions)
public class NumericOrNot8 {
    public static void main(String[] args) {
        String str1="12345.25";
        boolean Numaric= true;
        char[] ch=str1.toCharArray();
        for(int i=0;i<=ch.length;i++){
            if(Character.isDigit(ch[i])){
                Numaric = false;
            }
            else{
                Numaric=true;
            }
        }
        if (Numaric==false){
            System.out.println("it is Numeric");
        }
    }
    
}
