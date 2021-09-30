import java.util.*;
class Wildcard{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean flag=true;
        if(s1.length()==s2.length())
        {
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)!=s2.charAt(i))
                {
                    if(s1.charAt(i)=='?' ||s2.charAt(i)=='?')
                        continue;
                    else    
                        flag=false;
                }
            }
        }
        else
            flag=false;
        if(flag)
            System.out.print("Yes");
        else 
            System.out.print("No");
        sc.close();
    }
}
