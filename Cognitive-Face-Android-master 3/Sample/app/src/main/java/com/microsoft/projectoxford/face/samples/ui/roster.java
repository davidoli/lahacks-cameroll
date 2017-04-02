/**
 * Created by dianlin on 4/1/17.
 */
package com.microsoft.projectoxford.face.samples.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.microsoft.projectoxford.face.samples.R;
public class roster extends AppCompatActivity {

    ImageButton Take_Attendance;
    ImageButton History;
    ImageButton mainpage;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roster);

        Take_Attendance = (ImageButton)findViewById(R.id.take_attendance);
        History = (ImageButton)findViewById(R.id.history);
        mainpage = (ImageButton)findViewById(R.id.mainpage);

        Take_Attendance .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivityIntent = new Intent(getApplication(), take_attendance.class);
                mainActivityIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(mainActivityIntent);
            }
        });
        History .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivityIntent = new Intent(getApplication(), history.class);
                mainActivityIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(mainActivityIntent);
            }
        });
        mainpage .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivityIntent = new Intent(getApplication(), mainpage.class);
                mainActivityIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(mainActivityIntent);
            }
        });
    }
}