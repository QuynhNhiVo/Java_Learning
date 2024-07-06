package learn;

import java.io.*;

public class _11Streams {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        FileOutputStream outputStream = null;
        try{
            inputStream = new FileInputStream("input.txt");
            outputStream = new FileOutputStream("out.txt");
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        }finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
