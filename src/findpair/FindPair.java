package findpair;

public class FindPair {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        readFile read = new readFile();
        String sText = read.readFile();
        System.out.println("��������� ���� � �������");
        //�������� ������ ����, ����������� ������ � ��������� � ������ �������
        String[] sWords = sText.toLowerCase().split("\\s+");
        int iLengthWords = sWords.length; 
        //��������� ��� �����
        for (int i = 0; i < iLengthWords - 1; i++) {
            int iLengthWord = sWords[i].length()-1;
            if (sWords[i].charAt(iLengthWord) == sWords[i + 1].charAt(0)) {
                System.out.println(sWords[i] + " " + sWords[i + 1]);
            }
        }
    }
}
