package com.editsoft.volleyexamle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();
        String response = bundle.getString("response");
        try {
            JSONObject object = new JSONObject(response);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
