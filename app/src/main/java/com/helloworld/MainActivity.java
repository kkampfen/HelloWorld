package com.helloworld;

//import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import java.lang.String;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button button1, button2;
    TextView label1, label2;
    int count1 = 0, count2 = 0;
    String times = " time";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        label1 = (TextView) findViewById(R.id.label1);
        label2 = (TextView) findViewById(R.id.label2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

        label1.setTextColor(Color.BLUE);
        label2.setTextColor(Color.BLUE);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.button1) {
            count1++;
            if (count1 > 1) {
                times = " times";
            }
            label1.setText("Top button");
            label2.setText("pushed " + count1 + times);
        }
        else if (v.getId() == R.id.button2){
            count2++;
            if (count2 > 1){
                times = " times";
            }
            label1.setText("Bottom button");
            label2.setText("pushed " + count2 + times);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
