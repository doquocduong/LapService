package fubix.prm.lapservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class StartServiceActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_service);

        Button btnStat = findViewById(R.id.btnStart);
        btnStat.setOnClickListener(this);

        Button btnStop = findViewById(R.id.btnStop);
        btnStop.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnStart:
                startService(new Intent(this, MyStartService.class));
                break;
            case R.id.btnStop:
                stopService(new Intent(this, MyStartService.class));

                break;
        }
    }
}
