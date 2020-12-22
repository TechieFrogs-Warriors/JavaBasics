public class forloopprogram {
    public static void main(String[] args) {
        int a,b;
        for (a=1;a<=1;a++){
            for (b=1;b<=3;b++){
        System.out.print(a  +b +" ");
    }
    }
   //for loop
        int c,d;
        me:
        for(c=1;c<=5;c++){
            you:
            for(d=1;d<=c;d++){
        System.out.print(c +" " +d);
        continue me;
         } 
         System.out.println();
        }
        //for loop
        int e,f;
        for(e=1;e<=5;e++){
            for(f=1;f<=5;f++){
                System.out.print("* ");
            }
            System.out.println();

        }

        //labeled for loop
        int g,h;
        ram:
        for (g=1;g<=4;g++){
            raheem:
            for (h=4;h>=g;h--){
                System.out.print(g +" "+h);
                break raheem;
            }
            System.out.println(" ");
        }
        
        //while loop
        int i=10;
        while(i>=1){
            System.out.print(" $");
            i--;
        }

        //while do
        int k=10;
        do{
            System.out.println("***");
            k--;
         }
         while(k>=1);


         //for loop
         int p,s;
         new1:
         for(p=1;p<=3;p++){
             new2:
             for(s=1;s<=3;s++){
             if(p==1 &&s==1){
                 System.out.println("My self ");
             }
             else if(p==1&&s==2)
             System.out.print("karthikraju kandhula. ");
             else if (p==1&&s==3)
             System.out.print("i completed my b-tech ");
             else if (p==2&&s==1)
             System.out.print("A.K.R.G.college of engineerig and technology. ");
             else if (p==2&&s==2)
             System.out.print("where   i got 82% of marks.");
             else if (p==2&&s==3)
             System.out.print("In the stream of electronics and communication engineering.");
             else if (p==3&&s==1)
             System.out.print("and i completed my 12th standered in ");
             else if (p==3&&s==2)
             System.out.print("a.k.r.g juniour college.");
             else if (p==3&&s==3)
             System.out.print("in nallajerla");
            }
            new3:
            for(int l=0;l<=10;l++){
                System.out.println("break statement");

            }
        }
        
            //pattern
            int m,n;
            for(m=0;m<5;m++){
                System.out.print(" ");
            
            for(n=0;n<=m;n++)
                System.out.print(n);
            
            System.out.println();
        }
        //while do
        int q=10;
        do {
            System.out.println("78787878");
            q--;
        }
        while(q>=1);





         }

        

         







        
    }
    
    

