
import java.util.Scanner;
import java.util.Random;
public class ForLoop {








    public static void main(String[] args) {

        Random rand = new Random();
        String userWord;
        Scanner keyboard = new Scanner(System.in);



        for (int i = 0; i<25; i++ ) {
            System.out.println(i + ": For loops are fun!");
        }


        int total=0;

        for (int i = 33; i<66; i=i+2){
            total=total+i;
        }
        System.out.println(total);



        for (int i = 1; i<11; i++){
            System.out.println(i*9);
        }


        boolean isNotPrime=false;


        for (double i = Math.floor(Math.sqrt(107)); i>1; i--){
            if (107%i==0){
                isNotPrime=true;
            }



        }

        if (isNotPrime){
            System.out.println("That's not a prime number.");
        }
        else
        {
            System.out.println("It's a prime number!");

        }



        for (int i = 25; i>4; i--){
            System.out.println(i);
        }



        for (int i = 0; i<10; i++){
            System.out.println("Please enter a word of your choice.");
            userWord = keyboard.nextLine();
            System.out.println("The length of " + userWord + " is " + userWord.length());
        }





        int randNum = 0;

        for (int i = 0; i<15; i++){
            randNum = rand.nextInt(21 - 10 )+10;
            System.out.println(randNum);



        }



        for (int i=120; i<161; i++){
            System.out.println(Math.sqrt(i));
        }


    }
}


