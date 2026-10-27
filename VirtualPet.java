import java.util.Scanner;

public class VirtualPet {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int happiness = 5;
      int hunger = 5;
      int energy = 5;
      
      int choice = 0;
      
      System.out.println("Welcome to Virtual Pet Simulator!");
      System.out.println("Your pet's name is Elias.");
         while(happiness < 15 && hunger < 10 && energy > 0 && choice != 5){
         
         System.out.println("What would you like to do?");
         System.out.println("1. Feed");
         System.out.println("2. Play");
         System.out.println("3. Sleep");
         System.out.println("4. Bath");
         System.out.println("5. Quit");
         
         choice = input.nextInt();
         
       if(choice == 1){
           System.out.println("Elias loves to eat right out of your hand");
           happiness = (happiness += 1);
           hunger = (hunger -= 1);
           System.out.println("Elias' hunger level is " + hunger);
           System.out.println("Elias' happiness level is " + happiness);
           System.out.println("Elias' energy level is " + energy);
         }else if(choice == 2){
           System.out.println("Elias plays your game");
           happiness = (happiness += 3);
           hunger = (hunger += 2);
           energy = (energy -= 2);
           System.out.println("Elias' hunger level is " + hunger);
           System.out.println("Elias' happiness level is " + happiness);
           System.out.println("Elias' energy level is " + energy);
         }else if(choice == 3){
           System.out.println("Elias passed out");
           happiness = (happiness -= 1);
           hunger = (hunger += 1);
           energy = (energy -= 3);
           System.out.println("Elias' hunger level is " + hunger);
           System.out.println("Elias' happiness level is " + happiness);
           System.out.println("Elias' energy level is " + energy);
         }else if(choice == 4){
           System.out.println("Elias is cleaned for the first time this year!");
           happiness = (happiness += 2);
           hunger = (hunger += 1);
           energy = (energy -= 1);
           System.out.println("Elias' hunger level is " + hunger);
           System.out.println("Elias' happiness level is " + happiness);
           System.out.println("Elias' energy level is " + energy);
         }else if(choice == 5){
           System.out.println("You quit the game. Elias is not pleased.");
         }else {
         System.out.println("Invalid option, try again");
         }
         
         }
         
         if(hunger >= 10){
           System.out.println("Don't worry, games with Elias are never fun anyway");
           System.out.println("You lost because Elias got too hungry");
         }
         
         if(energy <= 0){
           System.out.println("Don't worry, games with Elias are never fun anyway");
           System.out.println("You lost because Elias got too tired");
         }
         
         if (happiness >= 15){
         System.out.println("You won the Virtual Pet Simulator!");
         }
         

         
         // TODO 3:
         // Create an if / else if / else statement
         // to handle the player's choice.
         //
         // Update the three statistics according
         // to the table in the instructions.
         //
         // Print a funny message for each action.


      // TODO 4:
      // After the loop, determine WHY the game ended.
      //
      // Did the pet become happy enough?
      // Did it get too hungry?
      // Did it run out of energy?
      // Did the player quit?
      //
      // Print the appropriate ending message.
      input.close();
   }
}