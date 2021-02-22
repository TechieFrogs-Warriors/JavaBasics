package Typecastingpgms;

public class Exintr1 {
    public static void main(String[] args) {
        String str = "1234.34";
	    //int a = Integer.parseInt(str);/////// error : number format exception... bcz str decimal can't convert into int
		float a=Float.parseFloat(str);//// here decimal str is converting into float
	    System.out.println(a); 
        
		
		// int a1 = 10.5;
		// String str1 = Integer.toString(a1);
		// System.out.println(str1);/////error : loss precision


        // float a2 = 10.0f;
		// String temp2 = Integer.toString(a2);
		// System.out.println(temp2);////error : no suitable method found for toString(float)



        

    }
    
}
