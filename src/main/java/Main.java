// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
public static void main(String[] args) {
  Nutrition[] foodArray = NutritionTracker.nutritiontracker();
  // Sets the total as a double and equal to zero
  double total = 0.00;
  // the for loop that declares the syntax for the return to the user
  for (int i = 0; i < foodArray.length; i++) {
    System.out.println("Nutritional Information per serving of " + foodArray[i].getfoodName() + ": ");
    int fatPerServing = foodArray[i].getFatCount() / foodArray[i].getServingCount();
    foodArray[i].setFatCount(fatPerServing);
    int carbsPerServing = foodArray[i].getCarbCount() / foodArray[i].getServingCount();
    foodArray[i].setCarbCount(carbsPerServing);
    int proteinPerServing = foodArray[i].getProteinCount() / foodArray[i].getServingCount();
    foodArray[i].setProteinCount(proteinPerServing);
    System.out.println("Fat: " + foodArray[i].getFatCount());
    System.out.println("Carbohydrates: " + foodArray[i].getCarbCount());
    System.out.println("Protein: " + foodArray[i].getProteinCount());
    
    double caloriesPerServing = (fatPerServing * 9) + (carbsPerServing * 4) + (proteinPerServing * 4);
    double totalCalories = caloriesPerServing * foodArray[i].getServingCount();
    total += totalCalories;
}
  // Finally, it prints the Totals at the end to display to the user
  System.out.println("Total Calories: " + total);
}
}