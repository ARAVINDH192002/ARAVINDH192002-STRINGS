import java.util.*;
class Casper {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        boolean f=true;
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<n-1;i++){
            if((arr[i].equals(arr[i+1])&&arr[i].equals("cookie")) || (arr[n-1].equals("cookie")))
              {System.out.print("No");
              f=false;
              break;
            } 
        }
        if(f==true){
            System.out.print("Yes");
        }
    }
}
