public class Character {
  String firstName, lastName, dialog;
  int age;

  public Character(String fn, String ln, int a){
    this.firstName = fn;
    this.lastName = ln;
    this.age = a;
  }

  public String getFirstName() {
      return firstName;
  }

  public String getLastName() {
      return lastName;
  }

  public int getAge() {
      return age;
  }

  public void sayDialog(String dialog){
    System.out.println(dialog);
  }
}