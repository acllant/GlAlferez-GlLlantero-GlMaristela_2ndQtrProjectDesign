public class Item {
  String name, description;
  Boolean keepable;

  public Item (String i){
    this.name = i;
  }

  public String getItemName() {
      return name;
  }

  public String getItemDescription() {
      return description;
  }

  public Boolean getItemKeepability() {
      return keepable;
  }
}