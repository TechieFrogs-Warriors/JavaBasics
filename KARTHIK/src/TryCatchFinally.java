public class TryCatchFinally {
    public static void main(String[] args) {
        try{
            int a[]={1,2,3};
            System.out.println(a[5]);
        }
        catch(NullPointerException e){
            System.out.println("It is Not Printed.");
        }
        finally{
            System.out.println("Always Finally Block Exicuted");
        }
        System.out.println("Extra Statement.");
    }
}
