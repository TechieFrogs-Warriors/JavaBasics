package ArrayAssignmentPrograms;

public class SparceMatrix28 {
    public static void main(String[] args) {
        int a[][]={{0,2,4},{0,0,5},{1,0,0}};
        int count=0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==0){
                    count++;
                }
            }
        }
        if(count>((a.length*a[0].length)/2)){
            System.out.println("Given Matrix is Sparce Matrix.");
        }
        else{
            System.out.println("Not a Sparce Matrix.");
        }
    }
}
