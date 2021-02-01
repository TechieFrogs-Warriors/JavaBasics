public class Strings 
{
   
    public static void main(String[] args) 
    {
        String S1 = "Chandra";
        String S2=S1.concat("Kiran");
        String S3="Chandra";
        String S4="Kiran";
        String S5="CHANDRA";
        String S6= new String("Chandra");
        String S7=" ChandraKiran";
        int a=1000;
        String S8 = String.valueOf(a);
        String S9="My name is Chandra";
        String S10=S9.replaceAll("a", "n");
       // char ch[]={'C','H','A','N','D','U'};
       byte[] S11 = S7.getBytes();
       char[] S12=S7.toCharArray();
       String S13= String.join("-", "chandra","kiran");
       String S14=S6.intern();
       String S15=S1.intern();
       
    
       
        
    System.out.println("Concatination "+S2);
    System.out.println("Equals "+S1.equals(S3));
    System.out.println(S1.equals(S4));
    System.out.println(S1.equalsIgnoreCase(S5));
    System.out.println("Operator "+S1==S6);
    System.out.println(S1==S6);
    System.out.println("compare method "+S1.compareTo(S3));
    System.out.println("Concatinate "+S1+S5+S7);
    System.out.println("SubString "+S7.substring(7));
    System.out.println(S7.substring(0, 7));
    System.out.println("Upper Case "+S1.toUpperCase());
    System.out.println("Lower Case "+S5.toLowerCase());
    System.out.println(S7);
    System.out.println("Trim "+S7.trim());
    System.out.println("Character "+S1.charAt(4));
    System.out.println(S3.startsWith("Ch"));
    System.out.println(S3.endsWith("a"));
    System.out.println("Length of the String "+S7.length());
    System.out.println(S8+100);
    System.out.println("Replace "+S10);
    System.out.println(S1.hashCode());
    System.out.println(S2.isEmpty());
    System.out.println(S12);
    System.out.println(S7.indexOf("n"));
    System.out.println(S7.lastIndexOf("a",4));
    System.out.println(S11);
    System.out.println(S13);
    System.out.println(S1==S14);
    System.out.println(S15);
    System.out.println(S1.contains("n"));
    
    
    

 }
    
}
