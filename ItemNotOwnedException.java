public class ItemNotOwnedException extends Exception{
  
  public ItemNotOwnedException (String msg){
     System.out.println("Item is not owned.");
  }
}