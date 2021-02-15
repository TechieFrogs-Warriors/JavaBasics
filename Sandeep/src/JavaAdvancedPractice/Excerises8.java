package JavaAdvancedPractice;

public class Excerises8 {
    public static void main(String[] args) {
        String str1 = "the quick brown fox";
        String str2 = "queen";

        System.out.println("Given String : " + str1);
        System.out.println("Given Mask String : " + str2);

        // char arr1[] = str1.toCharArray();
        // char arr2[]=str2.toCharArray();
        char mas[] = new char[256];

        for (int i = 0; i < str2.length(); i++) {
            mas[str2.charAt(i)]++;
        }
        System.out.println("After removing values is ----");
        for (int i = 0; i < str1.length(); i++) {
            if (mas[str1.charAt(i)] == 0) {
                System.out.print(str1.charAt(i));
            }
        }
    }

}
