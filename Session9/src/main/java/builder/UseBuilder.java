package builder;

public class UseBuilder {

    public static void main(String[] args) {

        Naehrstoffangaben naehrstoffangabenNurVerpflichtend = new Naehrstoffangaben
                .NaehrstoffangabenBuilder(200,2)
                .build();

        Naehrstoffangaben naehrstoffangabenMitOptionalenFeldern = new Naehrstoffangaben
                .NaehrstoffangabenBuilder(200,2)
                .withEiweiss(22)
                .withFett(7)
                .withNatrium(1)
                .withKohlehydrate(31)
                .build();

        System.out.println(naehrstoffangabenNurVerpflichtend);
        System.out.println(naehrstoffangabenMitOptionalenFeldern);

    }

}
