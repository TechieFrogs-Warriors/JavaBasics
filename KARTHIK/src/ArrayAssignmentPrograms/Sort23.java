package ArrayAssignmentPrograms;

import java.util.Arrays;

public class Sort23 {
    public static void main(String[] args) {
        char []ch={'a','z','m','l','w','n'};
        Arrays.sort(ch);
        System.out.println("Sorted Array: ");
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
    }
}
