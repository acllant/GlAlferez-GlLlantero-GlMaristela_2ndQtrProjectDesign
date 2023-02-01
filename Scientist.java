public class Scientist extends Character{
  Item item;

  public Scientist (String fn, String ln, Item i){
    this.firstName = fn;
    this.lastName = ln;
    this.item = i;
  }

  public Item getScientistItem() {
      return item;
  }

  public void giveHint() throws NoMoreHintsException {
    
  }

}