package ProgramizExamplePrograms;

public class ConvertCharToString {
    public static void main(String[] args) {
        char ch = 'a';

        String str = Character.toString(ch);

        // str=String.valueOf(ch);//Another way to convert

        System.out.println("The String is :: " + str);
    }

}
