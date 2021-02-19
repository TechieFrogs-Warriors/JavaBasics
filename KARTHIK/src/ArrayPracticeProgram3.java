public class ArrayPracticeProgram3 {
    public static void main(String[] args) {
        String[] a=Eq();
        String b="ram";
        int count =0;
        for(int i=0;i<a.length;i++){
            if(b==a[i]){
                count ++;
            }
        }
        System.out.println("String: "+b+" Repeated: "+count+" Times.");
        
    }
    static String[] Eq(){
        return new String[] {"ram","raj","ram"};
    }
    
}
