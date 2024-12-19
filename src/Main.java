import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        FileInputStream fileInputStream = new FileInputStream("COPY_FILE_FROM"); 
        FileOutputStream fileOutputStream = new FileOutputStream("COPY_FILE_TO"); 
        
        while (fileInputStream.available() > 0) { 
            int dataBuffer = fileInputStream.read();
            fileOutputStream.write(dataBuffer);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
