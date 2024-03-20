import java.util.Scanner;

public class NutritionTracker {
  public static Nutrition[] nutritiontracker(){
    Scanner myObj = new Scanner(System.in);
    // Asks the user for the number of food items they'd like to input, thus telling the for loop how many times to run.
    System.out.print("How many food items would you like to input? ");
    int foodNum = myObj.nextInt();

    Nutrition[] foodArray = new Nutrition[foodNum];

    // the loop that asks the user for input to assign the values to food name, macronutrient values, and serving count of othe food items
    for (int i = 0; i < foodNum; i++) {
      myObj.nextLine();
      System.out.print("Enter Name of Food Item #" + (i + 1) + ": ");
      String foodName = myObj.nextLine();
      System.out.print("Enter Amount of Fat in " + foodName + " (grams): ");
      int fatCount = myObj.nextInt();
      System.out.print("Enter Amount of Carbs in " + foodName + " (grams): ");
      int carbCount = myObj.nextInt();
      System.out.print("Enter Amount of Protein in " + foodName + " (grams): ");
      int proteinCount = myObj.nextInt();
      System.out.print("Enter Amount of Servings: ");
      int servingCount = myObj.nextInt();

  // Sets the array
    foodArray[i] = new Nutrition(foodName, fatCount, carbCount, proteinCount, servingCount);
    }
  return foodArray;
  }
}