import java.util.*;
import java.util.HashSet;
class Alternating {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        HashSet<Character> HS=new HashSet<>();
        for(int i=0;i<a.length();i++){
            HS.add(a.charAt(i));
        }
        if(HS.size()==2)
          System.out.print("Yes");
        else
            System.out.print("No");
    }
}
