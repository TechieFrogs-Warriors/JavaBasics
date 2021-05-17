package ProgramizExamplePrograms;

public class ConvertCharArrayToString {
    public static void main(String[] args) {
        char[] ch = { 'a', 'b', 'c', 'd' };

        String str = String.valueOf(ch);

        String str1 = new String(ch);

        System.out.println(str + "\n" + str1);
    }
}
