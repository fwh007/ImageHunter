package lib.dt.com.imagehunter.Activity;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * 基础Activity
 * Created by Winter on 2015/10/19 0019.
 */
public class BaseActivity extends AppCompatActivity {
    protected <T extends View> T $(int id){
        return (T) findViewById(id);
    }
}
