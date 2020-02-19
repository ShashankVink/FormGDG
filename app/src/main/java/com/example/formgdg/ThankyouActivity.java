package com.example.formgdg;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ThankyouActivity extends AppCompatActivity {

    TextView thankyouTv;
    ArrayList<Feedback> fbList;
    FeedbackAdapter fadapter;
    RecyclerView feedbackRCV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_layout);

        thankyouTv = (TextView)findViewById(R.id.thankyouTV);
        fbList = new ArrayList<Feedback>();
        String name = getIntent().getStringExtra("name");
        Feedback fb = (Feedback) getIntent().getSerializableExtra("feedback");
        fbList.add(fb);
        fadapter = new FeedbackAdapter(this, fbList);
        feedbackRCV = (RecyclerView)findViewById(R.id.feedbackRecyclerView);
        feedbackRCV.setAdapter(fadapter);
        fadapter.notifyDataSetChanged();
        feedbackRCV.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        thankyouTv.setText(thankyouTv.getText()+" "+name);

    }

    public  void setFbList(ArrayList<Feedback> fbList){ fbList = fbList;}
}
