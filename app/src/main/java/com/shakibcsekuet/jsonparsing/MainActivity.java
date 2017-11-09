package com.shakibcsekuet.jsonparsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    String t1 = "";
    String t2 = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.showdata);
        fetchingData();


    }

    void fetchingData(){


        String myURL = "http://mrubel.com/tuntuninews/api/gettingnews.php";

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, myURL, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsarr=response.getJSONArray("contacts");
                            JSONObject jsobj=jsarr.getJSONObject(0);
                            t1=t1+jsobj.getString("name");


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        tv.setText(t1);


                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO Auto-generated method stub

                    }
                });












    }