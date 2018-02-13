package e.nazmul.testwithoutdagger;

import java.util.Date;

/**
 * Created by Md. Nazmul Hasan on 2/8/2018.
 */

public class MyExampleImpl implements MyExample{
    private long mDate;

    MyExampleImpl() {
        mDate = new Date().getTime();
    }

    public long getDate() {
        return mDate;
    }
}
