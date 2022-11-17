package com.softhub.timelinefacebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list);
        List<user>list = new ArrayList<>();
        ArrayList<comment> commentUser1= new ArrayList<>();
        commentUser1.add(new comment(getResources().getDrawable(R.drawable.image),"roshan","nice.."));
        commentUser1.add(new comment(getResources().getDrawable(R.drawable.image),"pankaj","very nice.."));
        commentUser1.add(new comment(getResources().getDrawable(R.drawable.image),"rakhi","very good.."));
        user user1 = new user(getResources().getDrawable(R.drawable.gabbar),"Rakhi kadam","Spend to some time with this eveining",(getResources().getDrawable(R.drawable.image)),"Sam and 42 likes","8 comments",commentUser1);
        list.add(user1);
        ArrayList<comment> commentUser2= new ArrayList<>();
        commentUser2.add(new comment(getResources().getDrawable(R.drawable.image),"abc","nice.."));
        commentUser2.add(new comment(getResources().getDrawable(R.drawable.image),"xyz","very nice.."));
        commentUser2.add(new comment(getResources().getDrawable(R.drawable.image),"pqr","very good.."));

        user user2 = new user(getResources().getDrawable(R.drawable.satus),"AAaBBbCC","Be your own reason for your happiness ",(getResources().getDrawable(R.drawable.image1)),"AAA and 44 likes","9 comments",commentUser2);
        list.add(user2);
        TimelineAdpter adpter = new TimelineAdpter(list);
        listView.setAdapter(adpter);


    }

    class TimelineAdpter extends BaseAdapter{
        List<user>list;

        public TimelineAdpter(List<user> list) {
            this.list=list;
        }


        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View ABC = LayoutInflater.from(MainActivity.this).inflate(R.layout.image,parent,false);
            ImageView imageView = ABC.findViewById(R.id.profileimage);
            imageView.setImageDrawable(list.get(position).getImage());
            ImageView imageView2= ABC.findViewById(R.id.photo);
            imageView2.setImageDrawable(list.get(position).getProfile());
            TextView textView = ABC.findViewById(R.id.name);
            textView.setText(list.get(position).getName());
            TextView textView1 = ABC.findViewById(R.id.status);
            textView1.setText(list.get(position).getStatus());
            TextView textView2 = ABC.findViewById(R.id.test2);
            textView2.setText(list.get(position).getLike_count());
            TextView textView3 = ABC.findViewById(R.id.test5);
            textView3.setText(list.get(position).getComments_count());
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,button.class);
                    ArrayList coom = new ArrayList<comment>();

                    intent.putParcelableArrayListExtra("comments",list.get(position).getComments());
                    startActivity(intent);

                }
            });

            return ABC;
        }
    }
}