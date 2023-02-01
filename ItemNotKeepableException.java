public class ItemNotKeepableException extends Exception{
  
  public ItemNotKeepableException (String msg){
     System.out.println("Item cannot be kept.");
  }
}