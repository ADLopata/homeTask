package homeWork08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

/**
 * Created by Персикс on 27.03.2015.
 */
public class BufferedCopyFileStratIm implements CopyFileStrategy{
    @Override
    public void copyFile(String sours, String dest) throws FileAlreadyPresentsException, FileCopyFailedException {

        //какой вариант правильный?

      /*  File d = new File(dest);
        if(d.exists()) throw new FileAlreadyPresentsException("File is already present(class Buffered)");


        byte[] from= sours.getBytes();
        ByteArrayInputStream bytArIn= new ByteArrayInputStream(from);

        BufferedOutputStream out = null;
        try {
            out = new BufferedOutputStream(new FileOutputStream(d));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try ( BufferedInputStream in= new BufferedInputStream(bytArIn)) {
            int count;
          while ((count=in.read(from))>0) {
              out.write(from,0,count);

          }
      } catch (IOException e) {
          e.printStackTrace();
          throw  new FileCopyFailedException("FileCopyFailedException(class Buffered)");
      }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }*/


        final File outFile= new File(dest);
        final File inpFile = new File(sours);
        if (outFile.exists()) throw new FileAlreadyPresentsException("File is already present(class Buffered)");


        try (BufferedInputStream bufIn = new BufferedInputStream(new FileInputStream(inpFile));
              BufferedOutputStream bufOut = new BufferedOutputStream(new FileOutputStream(outFile))) {
            byte [] byt =  new byte[1000];
            int length;
             while (( length= bufIn.read(byt))>0){
                 bufOut.write(byt,0,length);
             }

        } catch (IOException e) {
            e.printStackTrace();
            throw  new FileCopyFailedException("FileCopyFailedException(class Buffered)");
        }
    }

    @Override
    public void copyFile(File BufFile, File BufFile1) throws FileAlreadyPresentsException, FileCopyFailedException {
        if (BufFile.exists()||BufFile1.exists()) throw new FileAlreadyPresentsException("File is already present(class Buffered)"+
        "in second method of class ");

        copyFile(BufFile.getAbsolutePath(), BufFile1.getAbsolutePath());
    }
}
