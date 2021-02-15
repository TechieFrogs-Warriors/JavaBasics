package AdvancedPrograms;

public class IndexValues7 {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog.";

        char ch[]=str.toCharArray();

        for(int i=0;i<str.length();i++){
            System.out.println("Index Value Of: "+ch[i]+" is: "+i);
        }
    }
}
