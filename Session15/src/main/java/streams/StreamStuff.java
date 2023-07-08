package streams;


import java.io.*;

public class StreamStuff {


    public static void main(String[] args) throws Exception {

        String firstValue = "Hallo :)";
        Integer secondValue = 5;
        Boolean thirdValue = false;

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("out.txt"))){
            outputStream.writeObject(firstValue);
            outputStream.writeObject(secondValue);
            outputStream.writeObject(thirdValue);

            outputStream.flush();
        }

        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("out.txt"))){
            while (true) {
                System.out.println(inputStream.readObject());
            }
        }catch (EOFException e){
            //this is fine
        }

    }

}
