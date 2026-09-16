import java.util.*;
public class Main {
    public static void main(String[] args){
        double rand=Math.random();
        int min=0;
        int max=3; //just a random commit...
        Scanner ts=new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors game built in Java.");
        System.out.println("Enter X anytime to exit from the game.");
        int score=0;
        while(true){

            System.out.println("Rock(r) Paper(p) or Scissors(s)?");
            char inp =Character.toLowerCase(ts.next().charAt(0));

            if (inp=='x') break;
            if (inp !='r' && inp!='p' && inp!='s'){
                System.out.println("Invalid input, try again.");
                continue;
            }

            int randNum=(int)(Math.random()*3)+1;
            int mine=(inp =='r')?1:(inp =='p')?2:3; //1=rock, 2=paper, 3=scissors;

            if (mine==randNum){
                System.out.println("Tie!");
            }else if((mine ==1 && randNum==3)||(mine==3&&randNum==2||mine==2&&randNum==1)){
                score++;
                System.out.println("You win this round! +1XP");
            }else{
                System.out.println("You lose this round!!");
            }

        }

        System.out.println("Well played! Your Score is: "+score+"XP");


    }
}
