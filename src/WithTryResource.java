import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WithTryResource {
   
    public void copyWithTryResource() {
        try (FileInputStream fileInputStream = new FileInputStream("COPY_FILE_FROM");
             FileOutputStream fileOutputStream = new FileOutputStream("COPY_FILE_TO")) {

            byte[] buffer = fileInputStream.readAllBytes(); 
            fileOutputStream.write(buffer); 

        } catch (IOException e) { 
            e.printStackTrace(); 
        }
    }
}
