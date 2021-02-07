package ArrayAssignmentPrograms;

public class IdentityMatrix27 {
    public static void main(String[] args) {
        
        int a[][]={{1,0,0},{0,1,0},{0,0,1}};
        boolean flag=true;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(i==j&&a[i][j]!=1){
                    flag=false;
                    break;
                }
                if(i!=j&&a[i][j]!=0){    
                    flag=false;    
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Given matrix is an identity matrix"); 
        }   
        else {
            System.out.println("Given matrix is not an identity matrix");
        }  
        

    }
    
}
