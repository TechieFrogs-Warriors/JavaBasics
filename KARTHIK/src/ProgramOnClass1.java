public class ProgramOnClass1 {
    public static void main(String[] args) {
        Pattern patternObj=new Pattern();
        if(patternObj.s.equals("karthik")){
            System.out.println("Strings are Same: "+patternObj.s);
        }
        else if (patternObj.i%2==0) {
            System.out.println("Even Number: "+patternObj.i);    
            }
    }
    
}
