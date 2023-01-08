class Main {
  public static void main(String[] args) {
    Car car = new Car();
    // 1.setNameメソッドを用いて、carの名前を「フェラーリ」にする
    car.setName("フェラーリ");

    // 2.setColorメソッドを用いて、carの色を「赤」にする
    car.setColor("赤");

    Bicycle bicycle = new Bicycle();
    // 3.setNameメソッドを用いて、bicycleの名前を「ビアンキ」にする
    bicycle.setName("ビアンキ");

    // 4.setColorメソッドを用いて、bicycleの色を「緑」にする
    bicycle.setColor("緑");

    System.out.println("【車の情報】");
    car.printData();

    System.out.println("=================");
    System.out.println("【自転車の情報】");
    bicycle.printData();
  }
}
