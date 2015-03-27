package homeWork08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.*;


    public class CopyFileStrategy1 implements CopyFileStrategy {
        @Override
        public void copyFile(String sours, String dest) throws FileAlreadyPresentsException, FileCopyFailedException {
           final File outFil = new File(dest);
            if(outFil.exists()) throw new  FileAlreadyPresentsException("File is already present");
           
            
            try (FileInputStream in = new FileInputStream(sours);
                 FileOutputStream out = new FileOutputStream(outFil)) {

                int read;
                for (; (read = in.read()) != -1; ) {
                    out.write(read);
                }
            }   catch (IOException e) {
                e.printStackTrace();
                throw new FileCopyFailedException("FileCopyFailedException");

        }
        }

        @Override
        public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
             if (file.exists()||file1.exists())throw new FileAlreadyPresentsException("in method"+
             "copy file (file,file) : exception");
            try {

                copyFile(file.getAbsolutePath(), file1.getAbsolutePath());
            }catch (FileCopyFailedException er){
                er.printStackTrace();
                throw  new FileCopyFailedException("FileCopyFailedException in file");
            }
    }
}
