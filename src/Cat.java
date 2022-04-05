public class Cat extends Animal{
  
  @Override
  public void makeSound() {
    System.out.println("Miao!");
  }
  
  @Override
  public boolean eatFood() {
    return false;
  }
  
  
}
