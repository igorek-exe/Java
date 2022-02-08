package program;

public class PrimerOperBreakContinue {
    public static void main(String[] Args){
        int x,y;
        for(x=-10;x<=10;x+=1){
            if(x==0){break;}//break/
            y=1/x;
            System.out.println("x="+x+" y="+y+"\n");
        }
    }
}
