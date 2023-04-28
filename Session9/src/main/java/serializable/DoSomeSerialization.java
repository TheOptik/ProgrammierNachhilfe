package serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DoSomeSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Vector vector = new Vector(2.0, 1.5, 5.0);

        try(FileOutputStream fileStream = new FileOutputStream("vector.txt")) {

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileStream);

            //serialization
            objectOutputStream.writeObject(vector);
            objectOutputStream.flush();
        }

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("vector.txt"));

        //deserialization
        Vector deserializedVector = (Vector) objectInputStream.readObject();

        System.out.println(deserializedVector);

    }

}
