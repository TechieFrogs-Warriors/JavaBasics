package AdvancedPrograms;

public class StringSort3 {
    public static void main(String[] args) {
        String a[]={"abc","cba","bca","mba","nda","rba","jba"};
        int len=a.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(a[i].compareTo(a[j])>0){
                    String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Sorting Of Strings z-a: ");
        for(int i=0;i<len;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Sorting Of Strings a-z: ");
        for(int i=len-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
