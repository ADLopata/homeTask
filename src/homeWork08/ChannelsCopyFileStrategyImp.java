package homeWork08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.*;
import java.nio.channels.FileChannel;

/**
 * Created by Персикс on 27.03.2015.
 */
public class ChannelsCopyFileStrategyImp implements CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        File sours= new File(s);
        File dect= new File(s1);
        if (dect.exists())throw  new FileAlreadyPresentsException("File is already present");

        try {
            FileChannel in= new FileInputStream(sours).getChannel();
            FileChannel out = new FileOutputStream(dect).getChannel();
            out.transferFrom(in,0,in.size());

            in.close();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
            throw new FileCopyFailedException("FileCopyFailedException");
        }
    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
           copyFile(file.getAbsolutePath(),file1.getAbsolutePath());
    }
}
