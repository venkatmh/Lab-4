/*
Lab 4
Mahathi Venkatesh
Date: September 21, 2021
*/
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r = new Random();

    int randomInt = r.nextInt(50) + 1;

    System.out.println("The Random number is: " + randomInt);

    int num = randomInt;
    
    if(randomInt >= 0){
      for(int i = randomInt; i >= 0; i--){ //decrement
        System.out.println(i);
      }
    }
    
    if (num <= 5){
      System.out.println("Ahoy mateys!");
    } else if (num > 25 && num < 42){
      System.out.println("Cannonball!");
    } else{
      System.out.println("Blast off!");
    }
  }
}