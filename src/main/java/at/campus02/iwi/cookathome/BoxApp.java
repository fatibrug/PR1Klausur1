package at.campus02.iwi.cookathome;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BoxApp {
    public static void main(String[] args) {

        CookSubscription c1 = new CookSubscription();
        CookSubscription c2 = new CookSubscription();
        CookSubscription c3 = new CookSubscription();

        String box = c1.firstBox(45, false, true, 3);
        System.out.println(box);
        String box1 = c2.firstBox(19, false, false, 5);
        System.out.println(box1);
        String box2 = c3.firstBox(25, true, false, 5);
        System.out.println(box2);

        double[] erg = c1.suggestPrice("Veggie", 20);
        System.out.println(Arrays.toString(erg));
        double[] erg1 = c2.suggestPrice("FishBox", 50);
        System.out.println(Arrays.toString(erg1));
        double[] erg2 = c3.suggestPrice("Vegan", 31);
        System.out.println(Arrays.toString(erg2));
    }
}
