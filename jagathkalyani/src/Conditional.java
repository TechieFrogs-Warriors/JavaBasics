public class Conditional {
    public static void main(String[] args) {
        int x=1;
        int a=3;
     if (a == 1)
        x+=5;
        else if (a==2)
        x+=10;
        else if (a==3)
        x+=16;
        else if (a==4)
        x+=34;
        System.out.println("value of x= " +x);
        int warriors =45;
        if (warriors <= 18)
        System.out.println("warrior is 18 or younger");
        else if (warriors > 18 && warriors <40 )
        System.out.println("warriors is 19 and 39");
        else if (warriors ==45 || warriors ==50)
        System.out.println("warriors is either 45 or 50");
        else 
        System.out.println("warriors is older than 40");
        
    }
    
}

    
