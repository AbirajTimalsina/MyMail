package com.abiraj.mymail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<Mails> mailsList = new ArrayList<>();
        mailsList.add(new Mails("Sam","Weekend Adventure","lets go fishing with john and others.We wil...","10:42am",R.drawable.s));
        mailsList.add(new Mails("Facebook","James you have new notifaction","A lot has happened in facbook since..","16:00pm",R.drawable.f));
        mailsList.add(new Mails("Google+","Top Sugested Google+ pages for you ","Top Sugested Google+ pages for you","18:44pm",R.drawable.g));
        mailsList.add(new Mails("Twitter","Follow T-mobile,Samsung Mobile U","James some people you may know",":00pm",R.drawable.t));
        mailsList.add(new Mails("Pinterest","Pins you'll love!","Have you seen this pins yet?Pinterest","09:04pm",R.drawable.p));
        mailsList.add(new Mails("Josh","Going Lunch","Nearby hotels for you","01:04pm",R.drawable.j));

        MailsAdapter mailsAdapter = new MailsAdapter(this,mailsList);
        recyclerView.setAdapter(mailsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
