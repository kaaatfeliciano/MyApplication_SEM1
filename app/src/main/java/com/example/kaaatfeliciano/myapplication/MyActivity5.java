package com.example.kaaatfeliciano.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;

import com.example.kaaatfeliciano.myapplication.R;

public class MyActivity5 extends ActionBarActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);


        button= (Button) findViewById(R.id.IS); //<< initialize here
        // set OnClickListener for Button here
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity5.this, MyActivity6.class));
            }
        });

        button= (Button) findViewById(R.id.IT); //<< initialize here
        // set OnClickListener for Button here
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity5.this, MyActivity7.class));
            }
        });

        button= (Button) findViewById(R.id.CS); //<< initialize here
        // set OnClickListener for Button here
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity5.this, MyActivity8.class));
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_activity5, menu);
        return true;
    }

    public void MyActivity6(View view){
        Intent OpenMyActivity5 = new Intent(MyActivity5.this, MyActivity6.class);
        startActivity(OpenMyActivity5);
    }

    public void MyActivity7(View view){
        Intent OpenMyActivity5 = new Intent(MyActivity5.this, MyActivity7.class);
        startActivity(OpenMyActivity5);
    }

    public void MyActivity8(View view){
        Intent OpenMyActivity5 = new Intent(MyActivity5.this, MyActivity8.class);
        startActivity(OpenMyActivity5);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_my, container, false);
            return rootView;
        }
    }
}
