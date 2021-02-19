package Accenturepgms;




public class Ass12 {
    public static void spiral(int size){
        int row=0,col=0;//initializing row and col
        int boundary=size-1;
        int sizeLeft=size-1;
        int flag =1;
        //variables to determine directions//r=right,l=left,d=down,u=upper
        char move='r';
        int matrix[][]=new int[size][size];
        for(int i=1;i<size*size+1;i++){
            matrix[row][col]=i;//assigning the value
            switch(move){//switch case for next value
               
                case'r'://if right go right
                col+=1;
                break;
                
                case'l'://if left go left
                col-=1;
                break;
                
                case'u'://if up go up
                row-=1;
                break;
                
                case'd'://if down go down
                row+=1;
                break;
                
                
                }
                if(i==boundary){//checking if array has reached boundary or not
                    boundary +=sizeLeft;//adding  sizeleft for next boundary
                    if(flag !=2){
                        flag=2;
                    }
                    else{
                        flag=1;
                        sizeLeft -=1;
                    }
                    switch(move){//switch case to change direction
                        
                        case'r'://if right rotate dowm
                        move='d';
                        break;
                        
                        case'd'://if down rotate left
                        move='l';
                        break;
                        
                        case'l'://if left rotate up
                        move='u';
                        break;
                        
                        case'u'://if up rotate right
                        move='r';
                        break;
                    }

            }
            
        }
        for(row=0;row<size;row++){////printing matrix
            for(col=0;col<size;col++){
                int n=matrix[row][col];
                System.out.print((n<10)?(n+" "):(n+" "));
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int size=9;//size is given as 9
        spiral(size);//printing spiral matrix
    }
    
}
