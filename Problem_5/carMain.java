package Problem_5;

class Car
{
    String owner;
    String brand;
    int serial;
    static int unique=1;

    Car(String owner,String brand)
    {
        this.owner=owner;
        this.brand=brand;
        serial=unique++;
    }

    void start()
    {
        System.out.println(this.owner +" car's start");
    }
    void stop()
    {
        System.out.println(this.owner +" car's stop");
    }

    void checkFuel()
    {
        System.out.println("Fuel is ....");
    }

  void details()
  {
      System.out.println(this.owner+" "+this.brand+" "+this.serial);
  }

}

public class carMain {
    public static void main(String[] args) {

       Car c1=new Car("SHAKIL","Mercedes");
       Car c2=new Car("SALMAN","Ford");

       c1.details();
       c1.start();
       c2.details();
       c2.stop();
    }
}
