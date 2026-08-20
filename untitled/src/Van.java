public class Van {

    int speed;
    String Brand;
    String Color;

    public static void main(String[] args) {

        Van van1 = new Van();
        Van van2 = new Van();
        Van van3 = new Van();

        van1.Color = "Red";
        van1.Brand = "Toyota";
        van1.speed = 150;

        van2.Color = "Yellow";
        van2.Brand = "BMW";
        van2.speed = 180;

        van3.Color = "Black";
        van3.Brand = "Alto";
        van3.speed = 900;

        System.out.println(van1.speed);
    }
}