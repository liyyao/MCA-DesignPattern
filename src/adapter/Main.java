package adapter;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:/study/msb-mca/目标.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null && !line.equals("")) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
