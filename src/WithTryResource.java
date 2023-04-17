import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WithTryResource {
    //данный метод показывает работу копирования файла в блоке try-with-resource
    public void copyWithTryResource() {
        try (FileInputStream fileInputStream = new FileInputStream("COPY_FILE_FROM");
             FileOutputStream fileOutputStream = new FileOutputStream("COPY_FILE_TO")) {

            byte[] buffer = fileInputStream.readAllBytes(); //создаем битовый массив в качестве буфера для считывания данных
            fileOutputStream.write(buffer); //пишем весь считанный буфер в файл

        } catch (IOException e) { //ловим исключения входных/выходных потоков
            e.printStackTrace(); //выводим их в стек
        }
    }
}
