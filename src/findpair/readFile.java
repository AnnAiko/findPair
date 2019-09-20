package findpair;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readFile {

    private String filePath = "text.txt";
    File fileInput = new File(filePath);

    //������ ����
    public String readFile() {
        String sText = "";
        try {
            //������ �����
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String strLine = "";
            //���� ���� ����������
            if (fileInput.exists()) {
                //���� �� ����� ������
                while ((strLine = br.readLine()) != null) {
                    sText += strLine;
                }
                br.close();
            } else {
                System.out.println("����� �� ������");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sText;
    }
}
