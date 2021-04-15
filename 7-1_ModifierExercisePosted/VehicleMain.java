class VehicleMain extends DefaultVehicle { //Error
  private String modelName = "Mustang";
  public static void main(String[] args) {
    VehicleMain myFastCar = new VehicleMain();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}
