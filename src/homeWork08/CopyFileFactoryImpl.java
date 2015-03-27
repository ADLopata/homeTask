package homeWork08;

import com.sourceit.hometask.io.CopyFileFactory;
import com.sourceit.hometask.io.CopyFileStrategy;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Персикс on 27.03.2015.
 */
public class CopyFileFactoryImpl  implements CopyFileFactory {


    @Override
    public CopyFileStrategy createSimpleCopyFileStrategy() {

        return new CopyFileStrategy1() ;
    }

    @Override
    public CopyFileStrategy createBufferedCopyFileStrategy() {
        return new BufferedCopyFileStratIm();
    }

    @Override
    public CopyFileStrategy createChannelsCopyFileStrategy() {
        return new ChannelsCopyFileStrategyImp();
    }

    @Override
    public CopyFileStrategy createFilesCopyFileStrategy() {
        return new FilesCopyFileStrategyImp();
    }
}
