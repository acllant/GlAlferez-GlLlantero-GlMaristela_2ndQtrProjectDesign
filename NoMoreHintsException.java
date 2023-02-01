public class NoMoreHintsException extends Exception{
  
  public NoMoreHintsException (String msg){
     System.out.println("All three hints have been used.");
  }
}