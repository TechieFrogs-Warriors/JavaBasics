public class ArrayMultidimenPractice1 {
   public static void main(String[] args) {
      //Addition of 2-D array
      System.out.println("Addition of 2-D Arrays: ");
      int [][] a={{3,4,5,6},{4,5,6,7}};
      int [][] b={{5,6,7,8},{5,6,4,7}};
      int [][] c=new int[a.length][a.length+2];
      for(int i=0;i<a.length;i++){
          for(int j=0;j<a[i].length;j++){
              c[i][j]=a[i][j]+b[i][j];
              System.out.print(c[i][j]+" ");
            }
          System.out.println();
        }
    } 
}
