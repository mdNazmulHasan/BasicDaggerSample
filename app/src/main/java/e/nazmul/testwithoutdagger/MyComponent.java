package e.nazmul.testwithoutdagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Md. Nazmul Hasan on 2/13/2018.
 */
@Singleton
@Component(modules = MyModule.class)
public interface MyComponent {
    void inject(MainActivity mainActivity);
}
