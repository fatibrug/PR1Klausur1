package at.campus02.iwi.music;

public class Album {

       public int nrSongs;
       public double shortestSong;
       public double longestSong;


        public double averageSongLenght() {
           return  (longestSong + shortestSong) /2;
        }

            public double totalLength(){
                return nrSongs * averageSongLenght();
            }


            public boolean fitsOnMedium(int minutes) {
            double total = totalLength();
            double totalSec = (double) minutes * 60;
                if (total <= totalSec) {
                    return true;
                }
                return false;
            }
}
