public class Player extends Character {
  String nickname;
  int health;

  public Player(String nn, int h){
    this.nickname = nn;
    this.health = h;
  }

    public String getNickName() {
        return nickname;
    }

    public int getHealth() {
        return health;
    }

  public void setName() throws IllegalArgumentException, NoNameException {
      
  }

  public void pickUpItem() {
    
  }

  public void putBackItem() {
    
  }

  public void keepItem() throws ItemNotKeepableException {
    
  }

  public void bringOutItem() throws ItemNotOwnedException {
    
  }
  
}