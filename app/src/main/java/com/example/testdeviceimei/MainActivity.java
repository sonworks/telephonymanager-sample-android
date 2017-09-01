package com.example.testdeviceimei;

import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        StringBuilder sb = new StringBuilder();
        TelephonyManager manager = (TelephonyManager)getSystemService(TELEPHONY_SERVICE);
        
        Log.d("### ", "### DeviceId : " + manager.getDeviceId());
        sb.append("識別番号:" + manager.getDeviceId()).append("\n");
        sb.append("SERIAL:" + Build.SERIAL).append("\n");

        sb.append("BRAND:" + Build.BRAND).append("\n");
        sb.append("MANUFACTURER:" + Build.MANUFACTURER).append("\n");
        sb.append("DEVICE:" + Build.DEVICE).append("\n");
        sb.append("MODEL:" + Build.MODEL).append("\n");
        sb.append("PRODUCT:" + Build.PRODUCT).append("\n");
        sb.append("FINGERPRINT:" + Build.FINGERPRINT).append("\n");
        sb.append("ID:" + Build.ID).append("\n");
        sb.append("DISPLAY:" + Build.DISPLAY).append("\n");
//        sb.append("BOARD:" + Build.BOARD).append("\n");
//        sb.append("BOOTLOADER:" + Build.BOOTLOADER).append("\n");
//        sb.append("CPU_ABI:" + Build.CPU_ABI).append("\n");
//        sb.append("CPU_ABI2:" + Build.CPU_ABI2).append("\n");
//        sb.append("HARDWARE:" + Build.HARDWARE).append("\n");
//        sb.append("HOST:" + Build.HOST).append("\n");
//        sb.append("RADIO:" + Build.RADIO).append("\n");
//        sb.append("USER:" + Build.USER).append("\n");
        
        Log.d("", "### " + sb.toString().replace("\n", "").replace("\r", ""));
        
        TextView textView = (TextView)findViewById(R.id.hello_textview_id);
        textView.setText(sb.toString());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
