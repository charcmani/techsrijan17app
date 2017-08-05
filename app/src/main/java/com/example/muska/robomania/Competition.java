package com.example.muska.robomania;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

public class Competition extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competition);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvAllUser1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AllUser2Adapter allUser2Adapter = new AllUser2Adapter(getUserInformation(), this);
        recyclerView.setAdapter(allUser2Adapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Toast.makeText(Competition.this,
                " Click to explore !!", Toast.LENGTH_SHORT).show();
    }

    public List<User> getUserInformation() {

        List<User> userList = new ArrayList<>();
        userList.add(new User(R.drawable.robowar,
                "Robowar"));
        userList.add(new User(R.drawable.tekken,
                "Tekken"));
        userList.add(new User(R.drawable.nfs,
                "NFS"));
        userList.add(new User(R.drawable.bomb,
                "Bomb Diffusion"));
        userList.add(new User(R.drawable.laserstrike,
                "Laser Strike"));
        userList.add(new User(R.drawable.chess,
                "Electronic Chess"));
        userList.add(new User(R.drawable.sherlocked,
                "Sherlocked"));
        userList.add(new User(R.drawable.turing,
                "Turing"));
        userList.add(new User(R.drawable.circuitwiz,
                "Circuit Wizard"));
        userList.add(new User(R.drawable.reflex,
                "Reflex"));
        userList.add(new User(R.drawable.eartnew,
                "Electronic Arts"));

        return userList;
    }


    public class User {
        private int imageResourceId;
        private String eventName;

        public int getImageResourceId() {
            return imageResourceId;
        }

        public String getEventName() {
            return eventName;
        }


        public User(int imageResourceId, String eventName) {
            this.imageResourceId = imageResourceId;
            this.eventName = eventName;
        }
    }
}
