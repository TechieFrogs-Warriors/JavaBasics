package Arraysprograms.Excercises;
/*
Firstly, the sum of all the numbers in the array has to be calculated. 
So we traverse through the entire array and add every element to find the sum.sum=sum+input[i];

After this the mean has to be found. The formula for mean is: Mean=Sum/Total Number.
mean=sum/n;

After finding the mean, we find the variance of the numbers. 
The formula to find the variance is Variance= Sum of Square of Difference of mean with individual element/Total Number.
sum+=Math.pow((input[i]-mean),2);    
  mean=sum/(n-1);

Lastly, Standard Deviation is square-root of variance.
deviation=Math.sqrt(mean);
*/

public class Excercises40 {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };

        int sum = 0;
        float mean;

        for (int i = 0; i < arr.length; i++)// for caluclating the sum
        {
            sum += arr[i];
        }

        mean = sum / arr.length;
        // System.out.println("mean : " + mean);

        sum = 0;
        for (int i = 0; i < arr.length; i++)// to find the varience of numbers
        {
            sum += Math.pow(arr[i] - mean, 2);
        }
        mean = sum / (arr.length - 1);
        System.out.println("mean : " + mean);

        double deviation = Math.sqrt(mean);
        System.out.println("Standard Deviation : " + deviation);
    }

}
