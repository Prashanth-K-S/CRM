package www.siteurl.in.crm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //To initializing views
        initViews();

        Thread timerThread = new Thread() {

            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(new Intent(SplashActivity.this,LoginActivity.class));
                }
            }
        };

        timerThread.start();

    }


    //To initialze views
    private void initViews() {

        Toolbar mToolbar = findViewById(R.id.tb_splash);
        setSupportActionBar(mToolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(getString(R.string.trendz_group));
        }
    }


    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
