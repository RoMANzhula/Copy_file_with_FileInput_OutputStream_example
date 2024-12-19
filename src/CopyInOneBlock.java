import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyInOneBlock {
    public void copyAllBytesInOneBlock() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("FromFile"); 
        
        FileOutputStream fileOutputStream = new FileOutputStream("ToFile"); 
        
        byte[] containerForBytes = new byte[1024];

        while (fileInputStream.available() > 0) {
            int counterBytes = fileInputStream.read(containerForBytes);
            fileOutputStream.write(containerForBytes, 0, counterBytes); 
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
