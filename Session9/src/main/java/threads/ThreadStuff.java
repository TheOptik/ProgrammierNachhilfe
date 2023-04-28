package threads;


public class ThreadStuff {

    public static void main(String[] args) {

        Thread threadWithRunnable = new Thread(new MyRunnable());
        threadWithRunnable.start();

        Thread threadWithLambda = new Thread(() -> {
            System.out.println("Hello from lambda!");
        });
        threadWithLambda.start();


        Thread printNumbers = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        });
        printNumbers.start();

        Thread printLetters = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println((char)('a' + (i%26)));
            }
        });
        printLetters.start();

    }

}
