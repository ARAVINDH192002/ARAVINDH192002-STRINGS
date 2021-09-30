import java.util.*;
class Single_file {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String email=sc.nextLine();
        String[] a={ "com", "in", "net", "org"};
        boolean flag=true;
        for(int i=0;i<4;i++){
            if(email.contains(a[i])){
                System.out.print(email+"\nValid email address");
                flag=false;
                break;
            }
        }
        if(flag)
          System.out.print(email+"\nInvalid email address");
    }
}
