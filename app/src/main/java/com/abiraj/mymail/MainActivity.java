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
        mailsList.add(new Mails("Sam","jdshfkjdshf","jksdfsdf","10:45",R.drawable.s));
        mailsList.add(new Mails("Facebook","you have one notifacrion","open it","10:45",R.drawable.f));
        mailsList.add(new Mails("Google","top suggested","top suggested google+","11:06",R.drawable.g));
        mailsList.add(new Mails("Twitter","you have one twit","one twit","02:04",R.drawable.t));
        mailsList.add(new Mails("Pinterest","pins you'll love","have you seen this pins yet?","03:04",R.drawable.p));
        mailsList.add(new Mails("Josh","Going Lunch","Nearby hotels for you","01:04pm",R.drawable.j));

        MailsAdapter mailsAdapter = new MailsAdapter(this,mailsList);
        recyclerView.setAdapter(mailsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
