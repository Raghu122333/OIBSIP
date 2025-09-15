import java.util.*;
public class Numguess {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Random random=new Random();
       boolean playagain;
       System.out.println("NUMBER GUSSING GAME");
       System.out.println("CHOOSE A NUMBER BETWEEN(1-100)");
       do{
           int attempts=0;
           boolean correct=false;
           int min=1;
           int max=100; 
           int target=random.nextInt(min,max+1);
           while(!correct&&attempts<=10){
               attempts++;
               System.out.println("ENTER YOUR GUESS: ");
               int guess=sc.nextInt();
               if(guess>100||guess<1){
                System.out.println("INVALID INPUT GUESS A NUMBER BETWEEN(1-100)");
                continue;
               }
                if(guess>target){
                 System.out.println("YOUR GUESS IS TOO HIGH: ");
                }
                else if(guess<target){
                 System.out.println("YOUR GUESS IS TOO LOW: ");
                }
                else{
                 System.out.println("CORRECT! YOU HAVE GUESSED IN "+attempts+" ATTEMPTS" );
                 System.out.println("THE TARGET IS "+target);
                 correct=true;
                }
            }
            if(!correct){
                System.out.println("GAME OVER! THE TARGET IS "+target);

            }
            System.out.println("DO YOU WANT TO PLAY AGAIN(YES/NO): ");
            sc.nextLine();
            String answer=sc.nextLine().toLowerCase();
            playagain=answer.equals("yes");

       }
       while(playagain);

       sc.close();
    }
}