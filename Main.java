class Main {
  public static void main(String[] args) {
    Player player = new Player("Jake", 100);

    Item bItem1 = new Item("paper");
    Item cItem1 = new Item("flask");
    Item pItem1 = new Item("prism");

    Scientist biologist = new Scientist("Kywee", "Maristela", bItem1);
    Scientist chemist = new Scientist("Marla", "Alferez", cItem1);
    Scientist physicist = new Scientist("Corinne", "Llantero", pItem1);

    try{
        switch(input){
          case a:
              break;
          case b:
              break;
          case c:
              break;
          default:
              System.out.println("Invalid input.");
        }
      }
      catch(GameInProgressException e){
        System.out.println(e.getMessage());
      }
      catch(ItemNotKeepableException e){
        System.out.println(e.getMessage());
      }
      catch(ItemNotOwnedException e){
        System.out.println(e.getMessage());
      }
      catch(NoMoreHintsException e){
        System.out.println(e.getMessage());
      }
      catch(NoNameException e){
        System.out.println(e.getMessage());
      }
  }
}
