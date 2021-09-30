import java.util.*;
class Camel_case{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String r="";
        String[] a=name.split(" ");
        for(String i:a){
            r+=(i.substring(0,1).toUpperCase())+i.substring(1);
        }
        System.out.print(r);
    }
}
