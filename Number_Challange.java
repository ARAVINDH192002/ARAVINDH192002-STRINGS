import java.util.*;
public class Number_Challange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int c1=0,c2=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='1')
              c1++;
            else
              c2++;
        }
        if(c1==1 || c2==1)
          System.out.println("Yes");
        else
          System.out.println("No");
    }
}
