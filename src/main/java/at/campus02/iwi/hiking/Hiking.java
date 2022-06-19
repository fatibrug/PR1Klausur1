package at.campus02.iwi.hiking;

public class Hiking {

    public char[][] environment = {
            {'0', '0', '0', 'H', '0', '0', '0', '0', 'L', '0' },
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0' },
            {'0', '0', '0', '0', '0', 'H', '0', '0', 'H', 'H' },
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0' },
            {'0', '0', '0', '0', '0', '0', '0', '0', '0', 'H' },
            {'0', '0', '0', 'H', 'H', '0', '0', 'L', '0', '0' },
            {'0', '0', '0', '0', '0', '0', '0', '0', 'H', '0' },
            {'L', '0', '0', 'H', '0', '0', '0', '0', '0', '0' },

    };

    public void print() {
        for(int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                System.out.format("%c\t", environment[i][j]);
            }
            System.out.println();
        }
    }

    public int totalNrObstacles(char enemyType){
        int erg = 0;
        for (int i = 0; i < environment.length; i++){
            for (int j = 0; j < environment[i].length; j++){
                if(environment[i][j] == enemyType){
                    erg ++;
                }
            }
        } return erg;
    }

    public int[] countObstaclesPerRow(int row){
        int[] erg = new int[2];
        int anzahlHindernisse = 0;
        int anzahlLoecher = 0;

        for (int i = 0; i < environment[row].length; i++){
            if(environment[row][i] == 'L') {
                anzahlLoecher++;
                erg[0] = anzahlLoecher;
            }
            if(environment[row][i] == 'H') {
                anzahlHindernisse++;

                erg[1] = anzahlHindernisse;
            }
        }
        return erg;
    }

    public int energyNeededInRow(int row){
        int erg = 0;
        int anzahlHindernisse = 0;


        for (int i = 0; i < environment[row].length; i++) {
            if (environment[row][i] == 'H') {
                anzahlHindernisse++;
            }erg = anzahlHindernisse * 2;

            if(environment[row][i] == 'L'){
               erg = -1;
            }
        }return erg;

    }


    public int ableToFinishHiking(int points){

        int erg = 0;
        for (int i = 0; i < environment.length; i++){
            if(points >= energyNeededInRow(i) && energyNeededInRow(i) !=-1){
                erg = erg +1;
            }
        }
       return erg;
    }
}
