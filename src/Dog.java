public class Dog extends Animal {
  
  @Override
  public void makeSound() {
    System.out.println("Woof Woof!");
  }
  
  @Override
  public boolean eatFood() {
    return false;
  }
  
  @Override
  public boolean mood() {
    System.out.println("happy");
    return true;
  }
  
  
}
