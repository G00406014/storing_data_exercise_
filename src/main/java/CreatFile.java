import java.io.*;


public class CreatFile {
    public static void main(String[] args){

        {
            File myFile = new File( "myFile.txt");
            System.out.println("myfile is located at" + myFile.getAbsolutePath());
        }
    }

}

