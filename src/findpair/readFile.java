package findpair;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readFile {

    private String filePath = "text.txt";
    File fileInput = new File(filePath);

    //Читать файл
    public String readFile() {
        String sText = "";
        try {
            //Чтение файла
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String strLine = "";
            //Если файл существует
            if (fileInput.exists()) {
                //Пока не конец строки
                while ((strLine = br.readLine()) != null) {
                    sText += strLine;
                }
                br.close();
            } else {
                System.out.println("Файла не найден");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sText;
    }
}
