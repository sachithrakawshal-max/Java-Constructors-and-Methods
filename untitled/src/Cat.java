public class Cat {

    int Usage;
    String Name;
    String Color;
    String Health;

    void setHealth(){
        System.out.println("Love....");
    }

    Cat(){
        System.out.println("I'm learning Object Orianted programming");
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        cat1.Usage = 10;
        cat1.Name = "Akon";
        cat1.Color = "Yellow";
        cat1.Health = "Good";

        cat2.Usage = 50;
        cat2.Name = "Bkon";
        cat2.Color = "Black";
        cat2.Health = "Excellent";

        cat3.Usage = 80;
        cat3.Name = "Ckon";
        cat3.Health = "Good";
        cat3.Color = "Green";

        System.out.println("Cat Name: " + cat1.Name);
        System.out.println("Usage: " + cat1.Usage + " kg");
        System.out.println("Color: " + cat1.Color);
        System.out.println("Health: " + cat1.Health);

        System.out.println("Cat Name: " + cat2.Name);
        System.out.println("Usage: " + cat2.Usage + " kg");
        System.out.println("Color: " + cat2.Color);
        System.out.println("Health: " + cat2.Health);

        cat1.setHealth();
    }
}