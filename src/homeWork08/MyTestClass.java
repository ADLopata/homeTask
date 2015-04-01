package homeWork08;

import com.sourceit.hometask.io.CopyFileFactory;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;

/**
 * Created by Персикс on 01.04.2015.
 */
public class MyTestClass {
    public static void main(String[] args) {
        CopyFileFactory copy = new CopyFileFactoryImpl();

       File inputFactor= new File("D:/java/cat/imeges.jpg");

        File buffered = new File("D:/java/cat/buffered.jpg");
        File channels = new File("D:/java/cat/channels.jpg");
        File fileStr = new File("D:/java/cat/fileStr.jpg");
        File copyFile = new File("D:/java/cat/copyFile.jpg");

        String inp="D:/java/cat/imeges.jpg";
        String buf ="D:/java/cat/buffered.jpg";
        String channel ="D:/java/cat/channels.jpg";
        String fileStra= "D:/java/cat/fileStr.jpg";
        String copyFil= "D:/java/cat/copyFile.jpg";

        long start= System.nanoTime();
        long result= System.nanoTime()-start;
        try {
            copy.createBufferedCopyFileStrategy().copyFile(inp,buf);
            System.out.println("Result time for Buffered:"+ result/10000 + "ms");

            copy.createChannelsCopyFileStrategy().copyFile(inp,channel);
            System.out.println("Result time for Channel copy: "+ result/10000+ "ms");

            copy.createFilesCopyFileStrategy().copyFile(inp, fileStra);
            System.out.println("Result time for File copy Strategy: "+ result/10000+ "ms");

            copy.createSimpleCopyFileStrategy().copyFile(inp,copyFil);
            System.out.println("Result time for File copy Strategy simple: "+ result/10000+ "ms");


            copy.createBufferedCopyFileStrategy().copyFile(inputFactor,buffered);
            System.out.println("Result time for Buffered:"+ result/10000 + "ms");

            copy.createChannelsCopyFileStrategy().copyFile(inputFactor,channels);
            System.out.println("Result time for Channel copy: "+ result/10000+ "ms");

            copy.createFilesCopyFileStrategy().copyFile(inputFactor, fileStr);
            System.out.println("Result time for File copy Strategy: "+ result/10000+ "ms");

            copy.createSimpleCopyFileStrategy().copyFile(inputFactor,copyFile);
            System.out.println("Result time for File copy Strategy simple: "+ result/10000+ "ms");




        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
    }
}
