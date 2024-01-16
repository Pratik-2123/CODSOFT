import java.util.*;
public class task1{
    public static void main(String args[]) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("The game is to guess the number between 1-100");
        System.out.println("You have 5 chances to guess the correct answer");
        
        int num_of_correct_guess = 0; // this is the variable to store the count that how much time the user have got the correct guess

        int randomNum = random.nextInt(100); // this line gives the random integer value ranges from 1-100

        int i=0;
        while(i<5) {
            int guess = sc.nextInt();

            if(guess == randomNum) {
                
                System.out.println("You have got the right guess");
                num_of_correct_guess++;

            } else if(guess+30 <= randomNum) {
                
                System.out.println("Your guess is too low then the target value");
            
            } else if(guess-30 >= randomNum){
            
                System.out.println("Your guess is too high then the target value");
            
            } else{
                System.out.println("You are close to the answer");
            }
            i++;
        }
    

        System.out.println("The random num was : " + randomNum);
        System.out.println("Your score out of 5 is " + num_of_correct_guess);
    }
}


