

public class ForLoopLabel {
    public static void main(String[] args) 
    {
        ABC :
        for(int a=1;a<=10;a++)
        {
            if(a==7)
            continue ABC;
            System.out.println("IAM ANSWINI");//Executes until condition is True
        } 
        
    }
    
}
