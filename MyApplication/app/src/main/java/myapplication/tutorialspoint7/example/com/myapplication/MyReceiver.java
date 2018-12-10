package myapplication.tutorialspoint7.example.com.myapplication;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by TutorialsPoint7 on 8/23/2016.
 */
public class MyReceiver extends BroadcastReceiver {



    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("onReceive");
        Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
    }
}