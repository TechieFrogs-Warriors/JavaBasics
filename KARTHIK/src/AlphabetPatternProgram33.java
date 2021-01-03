public class AlphabetPatternProgram33 {
    public static void main(String[] args) {
        String s="JAVA";
        int n=s.length();
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=i*2-1;k>=1;k--){
                System.out.print(s.charAt(i-1));
            }
            System.out.println();
        }
    }
}
