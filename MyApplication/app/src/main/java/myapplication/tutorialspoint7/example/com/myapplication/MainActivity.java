package myapplication.tutorialspoint7.example.com.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;

public class MainActivity extends Activity {

    /** Called when the activity is first created. */
    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // broadcast a custom intent.

    public void broadcastIntent(View view){
        System.out.println("broadcastIntent");
        Intent intent = new Intent("myapplication.tutorialspoint7.example.com.myapplication.CUSTOM_INTENT");
        //intent.setAction("myapplication.tutorialspoint7.example.com.myapplication.CUSTOM_INTENT");
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
        localBroadcastManager.registerReceiver(new MyReceiver(),new IntentFilter("myapplication.tutorialspoint7.example.com.myapplication.CUSTOM_INTENT"));
        localBroadcastManager.sendBroadcast(intent);
    }
}