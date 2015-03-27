package homeWork08;

import com.sourceit.hometask.io.CopyFileFactory;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;
import java.io.IOException;

/**
 * http://www.journaldev.com/861/4-ways-to-copy-file-in-java
 * howe to do this task
 */
public class Test08  {
    CopyFileFactory copy = new CopyFileFactoryImpl();
             long startTime;
             long elapsedTime;

             String inFile = "C:/Workspace/Copy/123.jpg";

            String outFileSimp = "C:/Workspace/Copy/123Simp.jpg";
            String outFileBuff = "C:/Workspace/Copy/1234Buff.jpg";
            String outFileChannel = "C:/Workspace/Copy/1234Channel.jpg";
             String outFileFile = "C:/Workspace/Copy/1234File.jpg";

                    File inputFile = new File("C:/Workspace/Copy/123.jpg");

           File outputFileSimp = new File("C:/Workspace/Copy/123Simp1.jpg");
            File outputFileBuff = new File("C:/Workspace/Copy/123Buff1.jpg");
            File outputFileChannel = new File("C:/Workspace/Copy/123Chann1.jpg");
            File outputFileFile = new File("C:/Workspace/Copy/123File1.jpg");

                     try {
                   startTime = System.nanoTime();
        try {
            copy.createSimpleCopyFileStrategy().copyFile(inFile, outFileSimp);
        } catch (FileCopyFailedException e1) {
            e1.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
                     System.out.println("Simple - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");

                     startTime = System.nanoTime();
        try {
            copy.createBufferedCopyFileStrategy().copyFile(inFile, outFileBuff);
        } catch (FileCopyFailedException e1) {
            e1.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
                     System.out.println("Buffered - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");

                     startTime = System.nanoTime();
        try {
            copy.createChannelsCopyFileStrategy().copyFile(inFile, outFileChannel);
        } catch (FileCopyFailedException e1) {
            e1.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
                     System.out.println("Channels - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");

                     startTime = System.nanoTime();
        try {
            copy.createFilesCopyFileStrategy().copyFile(inFile, outFileFile);
        } catch (FileCopyFailedException e1) {
            e1.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
                     System.out.println("File - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");

                     System.out.println();

                     startTime = System.nanoTime();
        try {
            copy.createSimpleCopyFileStrategy().copyFile(inputFile, outputFileSimp);
        } catch (FileCopyFailedException e1) {
            e1.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
                     System.out.println("Simple - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");

                     startTime = System.nanoTime();
        try {
            copy.createBufferedCopyFileStrategy().copyFile(inputFile, outputFileBuff);
        } catch (FileCopyFailedException e1) {
            e1.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
                     System.out.println("Buffered - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");

                     startTime = System.nanoTime();
        try {
            copy.createChannelsCopyFileStrategy().copyFile(inputFile, outputFileChannel);
        } catch (FileCopyFailedException e1) {
            e1.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
                     System.out.println("Channels - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");

                     startTime = System.nanoTime();
        try {
            copy.createFilesCopyFileStrategy().copyFile(inputFile, outputFileFile);
        } catch (FileCopyFailedException e1) {
            e1.printStackTrace();
        }
        elapsedTime = System.nanoTime() - startTime;
                     System.out.println("File - Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");


                 } catch
                }


