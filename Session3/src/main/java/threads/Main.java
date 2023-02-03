package threads;

public class Main {

    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();

        Thread t1 = new Thread(runnable);

        t1.start();


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("Hello from anonymous runnable");
            }
        });

        t2.start();


        Thread t3 = new Thread(()-> System.out.println("Hello from lambda as runnable"));

        t3.start();


        DownloadThread downloadThread = new DownloadThread("");
        downloadThread.start();



    }


}
