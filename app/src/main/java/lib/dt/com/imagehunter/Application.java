package lib.dt.com.imagehunter;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Administrator on 2015/10/26 0026.
 */
public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Fresco.initialize(this);
    }
}
