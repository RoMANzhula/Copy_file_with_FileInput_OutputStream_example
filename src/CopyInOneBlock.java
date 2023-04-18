import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyInOneBlock {
    public void copyAllBytesInOneBlock() throws IOException { //метод, который будет читать и записывать байты из файла в
        //файл блоками размерностью равной столько, сколько мы указали в массиве байт (1024)

        FileInputStream fileInputStream = new FileInputStream("FromFile"); //открываем(создаем) поток для последовательного
        // считывания байтов из указанного файла

        FileOutputStream fileOutputStream = new FileOutputStream("ToFile"); //открываем поток для записи байтов в
        //указанный файл

        byte[] containerForBytes = new byte[1024]; //создаем контейнер в виде массива байт для записи данных блоками(частями)

        while (fileInputStream.available() > 0) { //создаем цикл, который будет работать пока в файле будут доступные для чтения байты
            int counterBytes = fileInputStream.read(containerForBytes); //создаем переменную для фиксации количества считанных байтов,
            //при этом байты считываются в очередной блок
            fileOutputStream.write(containerForBytes, 0, counterBytes); //в исходящий поток пишем байты из контейнера байтов,
            //counterBytes выступает в роли контролера, он фиксирует последнюю партию, которая может быть от 1 до 1024
        }

        fileInputStream.close(); //очищаем ресурсы, закрываем поток для ввода данных
        fileOutputStream.close(); //очищаем ресурсы, закрываем поток для вывода данных
    }
}
