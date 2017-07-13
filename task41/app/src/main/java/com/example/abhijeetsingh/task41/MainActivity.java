package com.example.abhijeetsingh.task41;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.kittinunf.fuel.Fuel;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.Handler;
import com.github.kittinunf.fuel.core.Request;
import com.github.kittinunf.fuel.core.Response;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    private TextView nameText;
    private TextView emailText;
    String s =new String();
    private Button b;
    ArrayList<User> users=new ArrayList<User>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText=(TextView)findViewById(R.id.nameText);
        //emailText=(TextView)findViewById(R.id.emailText);
        b = (Button)findViewById(R.id.mainGoButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fuel.get("https://jsonplaceholder.typicode.com/users").responseString(new Handler<String>() {
                    @Override
                    public void success(Request request, Response response, String s) {


                           Gson g=new Gson();
                           Type type = new TypeToken<ArrayList<User>>() {}.getType();
                           users = g.fromJson(s ,type);
                           for(int j = 0;j<users.size();j++)
                           {
                              User user=users.get(j);
                               nameText.setText("name is:"+user.getName()+" email is"+user.getemailaddress());


                           }




                    }

                    @Override
                    public void failure(Request request, Response response, FuelError fuelError) {

                    }
                });
            }
        });
    }
}
