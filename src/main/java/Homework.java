import java.util.Arrays;
import java.util.List;


public class Homework {
    public static void main(String[] args) {
    Orange orange = new Orange();
    Apple apple = new Apple();
    Box<Orange> orangeBox1 = new Box();
    Box<Orange> orangeBox2 = new Box();
    Box<Apple> appleBox = new Box();
            orangeBox1.add(new Orange());
            orangeBox1.add(new Orange());
            orangeBox1.add(new Orange());

            for (int i = 0; i < 4; i++) {
        orangeBox2.add(new Orange());
    }
            for (int i = 0; i < 6; i++) {
        appleBox.add(new Apple());
    }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

    Float orange1Weight = orangeBox1.getWeight();
    Float orange2Weight = orangeBox2.getWeight();
    Float appleWeight = appleBox.getWeight();
        System.out.println(orange1Weight);
        System.out.println(orange2Weight);
        System.out.println(appleWeight);

        System.out.println(orangeBox1.compare(appleBox));
        System.out.println( orangeBox2.compare(appleBox));

            orangeBox1.moveAt(orangeBox2);


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
}

}