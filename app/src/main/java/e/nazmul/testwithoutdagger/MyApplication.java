package e.nazmul.testwithoutdagger;

import android.app.Application;

/**
 * Created by Md. Nazmul Hasan on 2/13/2018.
 */

public class MyApplication extends Application {
    private MyComponent mMyComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mMyComponent = createMyComponent();
    }

    MyComponent getMyComponent() {
        return mMyComponent;
    }

    private MyComponent createMyComponent() {
        return DaggerMyComponent
                .builder()
                .myModule(new MyModule())
                .build();
    }
}
