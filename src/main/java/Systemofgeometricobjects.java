public class Systemofgeometricobjects {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();


        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle.getArea());

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle.toString());


    }
}
