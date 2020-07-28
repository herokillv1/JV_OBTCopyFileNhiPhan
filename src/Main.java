import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;


        try {
            inputStream = new FileInputStream(new File("txt/file1.txt"));
            outputStream = new FileOutputStream(new File("txt/file2.txt"));



            int lenght;
            byte [] buffer = new byte[1024];

            while ((lenght = inputStream.read(buffer))>0){
                outputStream.write(buffer,0, lenght);
            }


            System.out.println("Đã copy xong");


        } catch (IOException e) {
            System.err.println("File ko tồn tại");
        }finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
