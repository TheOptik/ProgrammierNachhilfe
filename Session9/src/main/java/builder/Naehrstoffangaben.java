package builder;

public class Naehrstoffangaben {

    //verpflichtend
    private int portionsgroese;
    private int anzahlPortionen;

    //optional
    private int eiweiss;
    private int fett;
    private int kohlehydrate;
    private int natrium;

    private Naehrstoffangaben(int portionsgroese,
                              int anzahlPortionen,
                              int eiweiss,
                              int fett,
                              int kohlehydrate,
                              int natrium) {
        this.portionsgroese = portionsgroese;
        this.anzahlPortionen = anzahlPortionen;
        this.eiweiss = eiweiss;
        this.fett = fett;
        this.kohlehydrate = kohlehydrate;
        this.natrium = natrium;
    }

    @Override
    public String toString() {
        return "Naehrstoffangaben{" + "portionsgroese=" + portionsgroese + ", anzahlPortionen=" + anzahlPortionen
               + ", eiweiss=" + eiweiss + ", fett=" + fett + ", kohlehydrate=" + kohlehydrate + ", natrium=" + natrium
               + '}';
    }

    public static class NaehrstoffangabenBuilder {

        //Kopie der Felder von Naehrstoffangaben zum späteren aufruf des Konstruktors
        //verpflichtend
        private int portionsgroese;
        private int anzahlPortionen;

        //optional
        private int eiweiss;
        private int fett;
        private int kohlehydrate;
        private int natrium;

        public NaehrstoffangabenBuilder(int portionsgroese, int anzahlPortionen) {
            this.portionsgroese = portionsgroese;
            this.anzahlPortionen = anzahlPortionen;
        }

        public NaehrstoffangabenBuilder withEiweiss(int eiweiss){
            this.eiweiss = eiweiss;
            return this;
        }

        public NaehrstoffangabenBuilder withFett(int fett){
            this.fett = fett;
            return this;
        }

        public NaehrstoffangabenBuilder withKohlehydrate(int kohlehydrate){
            this.kohlehydrate = kohlehydrate;
            return this;
        }

        public NaehrstoffangabenBuilder withNatrium(int natrium){
            this.natrium = natrium;
            return this;
        }

        public Naehrstoffangaben build() {
            return new Naehrstoffangaben(portionsgroese, anzahlPortionen, eiweiss, fett, kohlehydrate, natrium);
        }

    }

}
