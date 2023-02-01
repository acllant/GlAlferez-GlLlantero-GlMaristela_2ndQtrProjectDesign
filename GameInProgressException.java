public class GameInProgressException extends Exception{
  
  public GameInProgressException (String msg){
     System.out.println("Game is currently in progress.");
  }
}