package hu.unideb.inf.mobilsz12.gaborcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button gomb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gomb1= (Button)findViewById(R.id.button1);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.gabor);
        gomb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            mp.start();
            }
        });

    }
}