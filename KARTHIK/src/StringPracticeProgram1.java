public class StringPracticeProgram1 {
    public static void main(String[] args) {
        char a[] = { 't', 'e', 's', 't' };
        String str1="program";
        String str2=new String(a);//char to string
        System.out.println(str2.concat(str1));
        System.out.println(str1.length());//length
        int b=str2.length()+str1.length();
        System.out.println(b);//length comparsions
        System.out.println(str1.length()==str2.length());

    }
}
