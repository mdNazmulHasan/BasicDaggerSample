package e.nazmul.testwithoutdagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Md. Nazmul Hasan on 2/13/2018.
 */

@Module
public class MyModule {
    @Provides
    @Singleton
    static MyExample provideMyExample() {
        return new MyExampleImpl();
    }
}
