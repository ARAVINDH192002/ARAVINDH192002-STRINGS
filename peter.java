 import java.util.Scanner;
 class oops{
     static public void main(String[] r){
       Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         int won=0;
         int lost=0;
         for(char i:s.toCharArray()){
            if(i=='0'){
                 lost++;
             }
             else{
                 won++;
                 }
         }
         if(won>=(s.length()-won)){
             System.out.println("Win");
         }
        
         if(won<11){
             System.out.println("Lose");
         }
     }
}
