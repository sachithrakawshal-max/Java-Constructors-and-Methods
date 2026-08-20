public class Car {

    int speed;
    String brand;
    String color;

    void setspeed(){
        System.out.println("HEllO");
    }

    Car(){
        System.out.println("Object Created");
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.brand = "Toyota";
        car1.color = "Red";
        car1.speed = 120;

        car2.brand = "BMW";
        car2.color = "Black";
        car2.speed = 150;

        car1.setspeed();


        System.out.println(car1.brand);
        System.out.println(car1.color);
        System.out.println(car1.speed);
    }
}
