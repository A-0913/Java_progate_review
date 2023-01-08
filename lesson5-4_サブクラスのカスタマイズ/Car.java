class Car extends Vehicle {
  // 2.インスタンスフィールドfuelを定義する
  private int fuel = 50;

  // 3.fuelフィールドのゲッターを定義する
  public int getFuel(){
    return this.fuel;
  }

  // 3.インスタンスメソッドchargeを定義する
  public void charge(int litre) {
    System.out.println(litre + "L給油します");
    if (litre <= 0) {
      System.out.println("給油できません");
    } else if (litre + this.fuel >= 100) {
      System.out.println("満タンまで給油します");
      this.fuel = 100;
    } else {
      this.fuel += litre;
    }
    System.out.println("ガソリン量：" + this.fuel + "L");
  }

}
