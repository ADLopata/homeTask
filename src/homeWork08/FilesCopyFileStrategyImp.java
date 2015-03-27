package homeWork08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by Персикс on 27.03.2015.
 */
public class FilesCopyFileStrategyImp implements CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
       File sours= new File(s);
        File dest= new File(s1);
        if(dest.exists()) throw new  FileAlreadyPresentsException("File is already present");

        try {
            Files.copy(sours.toPath(), dest.toPath());
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
