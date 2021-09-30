import java.util.*;
class contains {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s2.trim();
        if(s1.contains(s2)){
            System.out.print("String is found in the sentence");
        }
        else
          System.out.print("String is not found in the sentence");
    }
}
