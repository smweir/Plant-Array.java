public class Flower extends Plant{
   private boolean isAnnual;
   private String color;
   
   
  public Flower(String name, String cost, boolean isAnnual, String color){
      super();
      setPlantName(name);
      setPlantCost(cost);
      this.isAnnual = isAnnual;
      this.color = color;
  }
  public boolean isAnnual() {
      return isAnnual;
    }

  public String getColor() {
      return color;
    }
}