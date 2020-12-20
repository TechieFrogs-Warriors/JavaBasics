public class Ifcondition {
    public static void main(String[] args) {
        int age = 30;
        System.out.println("---------if condition---------");
        if (age > 18) {
            System.out.println("he is eligale to vote");
        }
        System.out.println("-------- if-else condition-------- ");
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("print b is greater than c");
        }
        System.out.println("-------- if-else-if ladder condition--------");
        int i = 60;
        int j = 40;
        int k = 50;
        int l = 30;
        if (i > j && i > k && i > l) {
            System.out.println("i is grater then j,k,l");
        } else if (j > i && j > k && j > l) {
            System.out.println("j is greater than i,k,l");
        } else if (k > i && k > j && k > l) {
            System.out.println("k is greater than i,j,l ");
        } else if (l > i && l > j && l > k) {
            System.out.println("l is greater than i,j,k");
        } else {
            System.out.println("i,j,k,l are equal");
        }
        System.out.println("-------Nested if condidtion--------");
        int x = 25;
        int y = 25;
        int z = 25;
        if (x > y) {
            if (x > z) {
                System.out.println("x is greater than y and z");
            }
        }
        if (y > x) {
            if (y > z) {
                System.out.println("y is greater than x and z");
            }
        }
        if (z > x) {
            if (z > y) {
                System.out.println("z is greater than x and y");
            }
        } else {
            System.out.println("x,y,z are equal");
        }
    }

}
