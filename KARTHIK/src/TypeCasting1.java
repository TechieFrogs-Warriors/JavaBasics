public class TypeCasting1 {
    public static void main(String[] args) {
        //type conversions

        //int to string
        int i=350;
        String str=Integer.toString(i);
        String str6=String.format("%d", i);
        System.out.println("Integer Value:"+(i+10));
        System.out.println("Interger to string value "+(str+10));
        System.out.println("Integer to String using Formate:"+(str6+10));

        //String to int
        String str1 = "20";
        int i1=Integer.parseInt(str1);
        System.out.println("String Value: "+(str1+10));
        System.out.println("String to Integer: "+(i1+10));

        //string to long
        String str2="300";
        long l=Long.parseLong(str2);
        System.out.println("String Value: "+(str2+10));
        System.out.println("Long to string Value: "+(l+10));

        //Long to String
        long l1=300;
        String str3=String.valueOf(l1);
        System.out.println("long value: "+(l+10));
        System.out.println("long to string Value is:"+(str3+10));

        //char to string
        char ch='N';
        String str4=String.valueOf(ch);
        System.out.println("char value:"+(ch+25));
        System.out.println("Strng value of char: "+(str4+25));

        //String to char
        String str5="20";
        char ch1=str5.charAt(0);
        System.out.println("String value: "+(str5+10));
        System.out.println("String to char value:"+(ch1));

        // String str7 = "123.25565";
		// int a =Integer.parseInt(str7);
		// System.out.println(a);//Number Formate Exception

        float a12 = 10.0000f;
	    String temp = Double.toString(a12);//Double.tostring()
	    System.out.println(temp);

    }
}
