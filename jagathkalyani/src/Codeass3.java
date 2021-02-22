import java.util.Random;

public class Codeass3 {
    public static void main(String[] args) {
        String alphabet="abcdefghijklmnopqrstuvwxyz";//creatind a string using
        StringBuffer strbld=new StringBuffer();
        Random random1=new Random();
        int length=100;
        for(int i=0;i<length;i++){
            int ind=random1.nextInt(alphabet.length());
            char randomchar=alphabet.charAt(ind);
            strbld.append(randomchar);
        }
        String randomsString=strbld.toString();
        System.out.println("random string is -"+randomsString);
    }
    
}
