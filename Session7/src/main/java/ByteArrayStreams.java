import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteArrayStreams {



    public static void main(String[] args) throws Exception {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write('b');
        byteArrayOutputStream.close();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

        int lastByte = byteArrayInputStream.read();
        while(lastByte != -1) {

            System.out.println(lastByte);
            lastByte = byteArrayInputStream.read();

        }


    }



}
