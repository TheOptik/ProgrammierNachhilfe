public class CopyStuff {


    public static void main(String[] args) {


        int a = 1;
        int b = a;

        a = 2;

        System.out.println(a);
        System.out.println(b);















        Mensch m1 = new Mensch("Simon");
        Mensch m2 = m1;

        m1.name = "Olaf";



        System.out.println("m1="+m1.name);
        System.out.println("m2="+m2.name);

    }




}
