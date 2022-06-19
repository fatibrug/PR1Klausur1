package at.campus02.iwi.cookathome;

public class CookSubscription {

    public int age;
    public boolean vegan;
    public boolean veggie;
    public int activPerWeek;


    public String firstBox(int age, boolean vegan, boolean veggie, int activPerWeek) {
        String empfohleneBox = " ";

        if (vegan) {
            empfohleneBox = "Vegan";
        } else if (veggie) {
            empfohleneBox = "Veggie";
        } else if (activPerWeek >= 4 && age <= 60) {
            empfohleneBox = "FishBox";
        } else if (age <= 20 || age >= 60) {
            empfohleneBox = "Veggie";
        } else {
            empfohleneBox = "Vegan";
        }
        return empfohleneBox;
    }

    public double[] suggestPrice(String box, int age) {
        double[] erg = new double[2];

        if (box.equals("FishBox")) {
            if (age <= 25) {
                erg[0] = 39.90;
            } else {
                erg[0] = 49.90;
            }
            erg[1] = 80;
        } else if (box.equals("Veggie")) {
            if (age <= 25 || age >= 60) {
                erg[0] = 19.90;
            } else {
                erg[0] = 29.90;
            }
            erg[1] = 42;
        } else if (box.equals("Vegan")) {
            erg[0] = 15;
            if (age <= 30) {
                erg[1] = 45;
            } else {
                erg[1] = 49.90;
            }



        }return erg;


    }

}







