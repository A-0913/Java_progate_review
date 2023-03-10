class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);

    Car car = new Car("フェラーリ", "赤");
    // 4.setOwnerを用いて、carの所有者をperson1にする
    car.setOwner(person1);

    Bicycle bicycle = new Bicycle("ビアンキ", "緑");
    // 5.setOwnerを用いて、bicycleの所有者をperson2にする
    bicycle.setOwner(person2);

    System.out.println("【車の情報】");
    car.printData();
    System.out.println("-----------------");
    System.out.println("【車の所有者の情報】");
    // 6.getOwnerメソッドを用いてcarのownerを取得し、
    // 7.さらにprintDataメソッドを用いてownerの情報を出力する
    car.getOwner().printData();

    System.out.println("=================");
    System.out.println("【自転車の情報】");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.println("【自転車の所有者の情報】");
    // 8.getOwnerメソッドを用いてbicycleのownerを取得し、
    // 9.さらにprintDataメソッドを用いてownerの情報を出力する
    bicycle.getOwner().printData();

  }
}
