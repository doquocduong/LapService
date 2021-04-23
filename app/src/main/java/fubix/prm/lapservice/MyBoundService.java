package fubix.prm.lapservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import java.util.Calendar;
import java.util.Date;

public class MyBoundService extends Service {
    private final IBinder binder = new LocalBinder();
    public class LocalBinder extends Binder{
        MyBoundService getService(){
            return MyBoundService.this;
        }
    }
    public Date getCurrentDate() {
        return Calendar.getInstance().getTime();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }
}
