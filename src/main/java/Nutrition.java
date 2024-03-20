public class Nutrition {
  private String foodName;
  private int fatCount;
  private int carbCount;
  private int proteinCount;
  private int servingCount;

  public Nutrition(String foodName, int fatCount, int carbCount, int proteinCount, int servingCount) {
    this.foodName = foodName;
    this.fatCount = fatCount;
    this.carbCount = carbCount;
    this.proteinCount = proteinCount;
    this.servingCount = servingCount;
  }

  // Getters and Setters to store the information from the user input
  public void setFoodName(String foodName) {
      this.foodName = foodName;
  }

  public void setFatCount(int fatCount) {
    this.fatCount = fatCount;
  }

  public void setCarbCount(int carbCount) {
    this.carbCount = carbCount;
  }
  
  public void setProteinCount(int proteinCount) {
    this.proteinCount = proteinCount;
  }

  public void setServingCount(int servingCount) {
    this.servingCount = servingCount;
  }

  public String getfoodName() {
    return this.foodName;
  }

  public int getCarbCount() {
    return this.carbCount;
  }

  public int getFatCount() {
    return this.fatCount;
  }

  public int getProteinCount() {
    return this.proteinCount;
  }

  public int getServingCount() {
    return this.servingCount;
  }
}