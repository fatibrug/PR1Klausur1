package at.campus02.iwi.hiking;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HikingApp {
    public static void main(String[] args) {
        Hiking a = new Hiking();
        a.print();


        System.out.println(a.energyNeededInRow(7));
        System.out.println(a.totalNrObstacles('L'));
        System.out.println(Arrays.toString(a.countObstaclesPerRow(6)));
        System.out.println(a.ableToFinishHiking(2));
    }
}
