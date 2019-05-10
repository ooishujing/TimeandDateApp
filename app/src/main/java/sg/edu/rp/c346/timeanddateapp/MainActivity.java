package sg.edu.rp.c346.timeanddateapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnResetAll;
    TextView tvDisplay;
    // they type follow by I named it. after that "alt + enter "





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        btnResetAll = findViewById(R.id.buttonResetAll);
        tvDisplay = findViewById(R.id.textViewDisply);

        // refering to the id name at the activity.main

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time = String.format("Time is %d:%d" , tp.getCurrentHour(),tp.getCurrentMinute() );
                tvDisplay.setText(time);
            }

        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = String.format("Date is %d/%d/%d",dp.getDayOfMonth(), (dp.getMonth()+1),dp.getYear());
                tvDisplay.setText(date);
            }
        });

        btnResetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dp.updateDate(2019,0, 1 );
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);

            }
        });

    }


}
