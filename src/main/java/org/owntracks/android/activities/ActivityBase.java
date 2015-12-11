package org.owntracks.android.activities;


import android.support.v7.app.AppCompatActivity;
import android.view.View;


import org.owntracks.android.support.SnackbarFactory;

public class ActivityBase extends AppCompatActivity implements SnackbarFactory.SnackbarFactoryDelegate {
    private static final String TAG = "ActivityBase";

    @Override
    public View getSnackbarTargetView() {
        return getWindow().getDecorView().findViewById(android.R.id.content);
    }
}
