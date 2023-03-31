import java.io.FileInputStream;

public class LesePositionenAusDatei {

    public static void main(String[] args) throws Exception {

        lesePositionenAusDatei("byteInput.txt", new int[] { 3, 8, 10 });

    }

    public static void lesePositionenAusDatei(String dateiName, int[] positionen) throws Exception {

        try(FileInputStream fileInputStream = new FileInputStream(dateiName)) {

            int gelesenesByte;
            int position = 0;
            while ((gelesenesByte = fileInputStream.read()) != -1) {

                if (istEintragInArrayEnthalten(position, positionen)) {
                    System.out.println(gelesenesByte + "=" + ((char) gelesenesByte) + " an position " + position);
                }

                position++;
            }

        }
    }

    private static boolean istEintragInArrayEnthalten(int position, int[] positionen) {
        for(int i=0;i<positionen.length;i++){
            if(position == positionen[i]){
                return true;
            }
        }

        return false;
    }

}
