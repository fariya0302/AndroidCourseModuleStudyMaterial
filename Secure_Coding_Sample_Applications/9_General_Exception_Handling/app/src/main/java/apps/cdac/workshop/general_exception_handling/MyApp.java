package apps.cdac.workshop.general_exception_handling;

import android.app.Application;
import android.content.Context;

public class MyApp extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        MemoryCleanerOnCrash.init();
    }
}


