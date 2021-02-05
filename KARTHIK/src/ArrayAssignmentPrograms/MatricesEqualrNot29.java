package ArrayAssignmentPrograms;

public class MatricesEqualrNot29 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{2,3,3},{4,4,3}};
        int b[][]={{1,2,3},{2,3,3},{4,4,3}};
        boolean flag=false;

        if(a.length!=b.length || a[0].length!=b[0].length){
            System.out.println("Matrices are Not Same.");
        }
        else{
            for(int i = 0; i<a.length; i++){    
                for(int j = 0; j < a[0].length; j++){    
                  if(a[i][j] == b[i][j]){    
                      flag = true;    
                      break;    
                  }    
                }    
            }    
        }
        if(flag){
            System.out.println("Matrices are same.");
        }
        else{
            System.out.println("Matrices are Not Same.");
        }
    }
}
