package AssignmentPrograms;

public class Program2 {
    public static void main(String[] args) {
        // array input manually
        int arr1[] = { 2, 3, 4, 5, 6, 7 };
        int arr2[] = { 3, 2, 5, 6, 8 };
        // calculating leng of arrays
        int n = arr1.length;
        int m = arr2.length;
        // initilizing the values
        int sum = 0, mul = 0;
        // checking size of two arrays if not eqaul it terminates and says not equal
        if (n != m) {
            System.out.println("Arrays are not in Equal size");
        } else {// if arrays size is eqaul then this else block will be exceuted
            // for adding of two arrays
            for (int i = 0; i < arr1.length; i++) {
                sum += arr1[i] + arr2[i];
            }
            System.out.println("Sum od two arrays is : " + sum);

            // for multiplying of two arrays
            for (int i = 0; i < arr1.length; i++) {
                mul += arr1[i] * arr2[i];
            }
            System.out.println("Product of two arrays is : " + mul);

            // if the sum and product of arrasy are eyal then if condtion is excuted
            if (sum == mul) {
                System.out.println("Two arrays are equal");
            } else {// if the sum and product of arrays are not equal then else block is excuted
                System.out.println("Two arrays are not equal");
            }
        }

    }

}
