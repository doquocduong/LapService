package fubix.prm.lapservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart = findViewById(R.id.btnStartService);
        btnStart.setOnClickListener(this);

        Button btnStop = findViewById(R.id.btnBoundService);
        btnStop.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnStartService:
                startActivity(new Intent(MainActivity.this, StartServiceActivity.class));
                break;
            case R.id.btnBoundService:
                startActivity(new Intent(MainActivity.this, BoundServiceActivity.class));
                break;
        }
    }
}