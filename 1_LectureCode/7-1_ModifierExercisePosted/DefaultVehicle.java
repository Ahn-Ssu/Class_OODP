class DefaultVehicle { // final accessor로 클래스를 만들면 상속이 불가능함 
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}
