import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        FileInputStream fileInputStream = new FileInputStream("COPY_FILE_FROM"); //создаем входящий поток для считывания
        //байт из указанного в конструкторе файла (данный поток нуждается в обработке и данную обработку мы пробросим на уровень
        //выше (т.е. в методу добавляем throws FileNotFoundException), альтернатива - try-catch-finally, еще лучше try-with_resource

        FileOutputStream fileOutputStream = new FileOutputStream("COPY_FILE_TO"); //создаем исходящий поток для записи байт
        //в указанный в конструкторе файл

        while (fileInputStream.available() > 0) { //в цикле создаем условие - пока есть байты для чтения в указанном файле
            int dataBuffer = fileInputStream.read(); //считываем следующий байт в нашу переменную буферДанных
            fileOutputStream.write(dataBuffer); //сразу же записываем байт из буфера-переменной в указанный файл для записи
        }

        fileInputStream.close(); //освобождаем все выделенные ресурсы, закрыв поток для считывания данных из файла
        fileOutputStream.close(); //освобождаем все выделенные ресурсы, закрыв поток для записи данных в файла
    }
}