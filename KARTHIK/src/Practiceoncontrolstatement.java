import javax.lang.model.util.ElementScanner14;

public class Practiceoncontrolstatement {
    public static void main(String[] args) {
        int a=10;
        String name="is equal";
        if(--a==9)
        {
            System.out.println(name);
        }
        else {
            System.out.println("not equal");
        }

        //switch statement
        int b = 100;
        String water;
        switch (b){
            case 10:
            water="cool";
            break;
            case 30:
            water="normal";
            case 60:
            water="boiling";
            break;
            case 100:
            water="vapour state";
            break;
            default:
            water="unknown";
            break;
           
        }
        System.out.println("WATER STATE: " +water );
        
        
        

        
        //if else
        int c = 35;
        if (c>0){
            System.out.println("number is positive");

        }
        else{
            System.out.println("number is negtive");
        }

        //else if
        int d=1;
        int e=5;
        float f = 0.2478f;
        if(d<e){
            System.out.println("result :"+(d/e));
        if(e>1)
            System.out.println("result :" +(e-f));
            else 
            System.out.println("no values");
        
        
            }
            //switch
            int g = 3;
            if(g<10){
            switch(3){
                case 0:
                int p=0;
                System.out.println("monday");
                System.out.println(p);
                break;
                case 1:
                System.out.println("tuesday");
                break;
                case 2:
                System.out.println("wednesday");
                break;
                case 3:
                System.out.println("thursday");
                break;
                case 4:
                System.out.println("friday");
                break;
                case 5:
                System.out.println("saturday");
                break;
                case 6:
                System.out.println("sunday");
                break;
                default:
                System.out.println("error");
                break;}
            
                
            }
            //switch
            String month="JANUARY";
            switch(month){
                case "JANUARY":
                System.out.println("month has 31 days");
                break;
                default:
                System.out.println("no month has found");
                break;
            }

        //if else
        String new1="karthik";
        String new2="kandhula";
        String new3="karthik";
        if (new1==new2)
        System.out.println("same string:  " +(25/52*25)+new1);
        else if(new1==new3)
        System.out.println("same string: " +(6/8*96)+new2 +new1);
        else if (new2==new3)
        System.out.println("same string:"  +(2/89/78)+new3);
        else 
        System.out.println("not same: "+new1 +new2 +new3);

        //square or not
        int length=4;
        int breadth=6;
        if(length==breadth)
        System.out.println("it is a square shape");
        else 
        System.out.println("it is not asquare");

        //else if ladder
        int sides=6;
        int height=10;
        int angle=60;
        int width=2;
        if ((sides==4 && height>10) & (angle==90 && width==2))
        System.out.println("it is square shape");
        else if ((sides==6 && height==10) & (angle<90 && width==2))
        System.out.println("it is hexogon shape");
        else if ((sides==8 && height>10) & (angle<90 && width==2))
        System.out.println("it is octogon shape");
        else 
        System.out.println("it is in othershape");

        //nested if
        char you ='b';
        char me='k';
        if (you=='b' & me=='k'){
        if ( you ==++b || me!=you)
        System.out.println("hello kbps");
        else 
        System.out.println("only kbps");
        }

        int i=17;
        int j=12;
        if (i>j)
        System.out.println("i is grater");
        else
        System.out.println("i is smaller");

        
      
          
      



    }
     }
    

        

        

        
    
    

