package com.example.muska.robomania;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Event extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        android.support.v7.app.ActionBar actionBar= getSupportActionBar();
        actionBar.setDefaultDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        Button ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9,ib10,ib11;

        ib1= (Button) findViewById(R.id.Button1);
        ib2= (Button) findViewById(R.id.Button2);
        ib3= (Button) findViewById(R.id.Button3);
        ib4= (Button) findViewById(R.id.Button4);
        ib5= (Button) findViewById(R.id.Button5);
        ib6= (Button) findViewById(R.id.Button6);
        ib7= (Button) findViewById(R.id.Button7);
        ib8= (Button) findViewById(R.id.Button8);
        ib9= (Button) findViewById(R.id.Button9);
        ib10= (Button) findViewById(R.id.Button10);
        ib11= (Button) findViewById(R.id.Button11);

        ib1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Event.this , Robowar.class));

            }
        } );
        ib2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Event.this , Laserstrike.class));

            }
        } );

        ib3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Event.this , BombDiffusion.class));

            }
        } );
        ib4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Event.this , ElectronicChess.class));

            }
        } );
        ib5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Event.this , Sherlocked.class));

            }
        } );
        ib6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Event.this , Tekken.class));

            }
        } );
        ib7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Event.this , CircuitWizard.class));

            }
        } );
        ib8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Event.this , ElectronicArts.class));

            }
        } );
        ib9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Event.this , Turing.class));

            }
        } );
        ib10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Event.this , Reflex.class));

            }
        } );
        ib11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Event.this , NFS.class));

            }
        } );


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
