package com.example.formgdg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class FeedbackAdapter  extends RecyclerView.Adapter<FeedbackAdapter.FeedBackViewHolder>{

    ArrayList<Feedback> formfeedbackList;
    Context context;

    public FeedbackAdapter(Context context, ArrayList<Feedback>feedbackList){
        formfeedbackList = feedbackList;
        this.context = context;
        Feedback fb = new Feedback("Shashank", "shashank.guptags02@gmail.com" , "Oriental Institute of science and technology", "8840601482", "Shashank0201", "ShashankGupta", "Shashank0201","Shashank0201", "Yes", "Yes", "Yes", "Yes","Yes", 28,true);
        formfeedbackList.add(fb);
    }

    class FeedBackViewHolder extends RecyclerView.ViewHolder {
        TextView name,email, college, mobile, yearofstudy, gender, age, expertise, techno, special, link, facebook, github, resume, VIP, pastexperience, about, nameperson;
        public FeedBackViewHolder(@NonNull View itemView){
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.nameTV);
            email = (TextView)itemView.findViewById(R.id.emailTV);
            college = (TextView)itemView.findViewById(R.id.collegeTV);
            mobile = (TextView)itemView.findViewById(R.id.mobileTV);
            yearofstudy = (TextView)itemView.findViewById(R.id.qualificationTV);
            gender = (TextView)itemView.findViewById(R.id.genderTV);
            age = (TextView)itemView.findViewById(R.id.ageTV);
            expertise = (TextView)itemView.findViewById(R.id.expertiseTV);
            techno = (TextView)itemView.findViewById(R.id.technologiesTV);
            special = (TextView)itemView.findViewById(R.id.specialTV);
            link = (TextView)itemView.findViewById(R.id.linkdinTV);
            facebook = (TextView)itemView.findViewById(R.id.facebookTV);
            github = (TextView)itemView.findViewById(R.id.githubTV);
            resume = (TextView)itemView.findViewById(R.id.resumeTV);
            VIP = (TextView)itemView.findViewById(R.id.vipTV);
            pastexperience = (TextView)itemView.findViewById(R.id.pastexpTV);
            about = (TextView)itemView.findViewById(R.id.aboutTV);
            nameperson = (TextView)itemView.findViewById(R.id.namepersonTV);
        }
    }

    @NonNull
    @Override
    public FeedBackViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent, false);
        return new FeedBackViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FeedBackViewHolder holder, int position) {
        Feedback fb = formfeedbackList.get(position);
        holder.name.setText(fb.name);
        holder.email.setText(fb.email);
        holder.college.setText(fb.college);
        holder.mobile.setText(fb.mobile);
        holder.age.setText(fb.age);
        holder.link.setText(fb.link);
        holder.facebook.setText(fb.facebook);
        holder.github.setText(fb.github);
        holder.resume.setText(fb.resume);
        holder.VIP.setText(fb.VIP);
        holder.pastexperience.setText(fb.pastexp);
        holder.about.setText(fb.about);
        holder.nameperson.setText(fb.nameperson);
    }

    @Override
    public int getItemCount() {return formfeedbackList.size(); }
}

