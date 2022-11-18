package com.softhub.timelinefacebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class Notification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        ListView listView4 = findViewById(R.id.listNF);
        Intent intent = getIntent();
        List<mynotification>list=new ArrayList<>();
        mynotification person= new mynotification("https://upload.wikimedia.org/wikipedia/commons/3/3e/Tree_736885.jpg","AAa accept your friend request","1 hour ago");
        list.add(person);
        mynotification person2= new mynotification("https://cdn-icons-png.flaticon.com/512/3135/3135715.png","Rakhi send you a friend request","5 hour ago");
        list.add(person2);
        mynotification person3= new mynotification("https://cdn.vectorstock.com/i/1000x1000/30/97/flat-business-man-user-profile-avatar-icon-vector-4333097.webp","DDDD commented on your post and her birthday today","2 hour ago");
        list.add(person3);
        NewAdpter adpter= new NewAdpter(list);
        listView4.setAdapter(adpter);





    }
    class NewAdpter extends BaseAdapter{
        List<mynotification>list;

        public NewAdpter(List<mynotification> list) {
            this.list = list;
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
            View ABC = LayoutInflater.from(Notification.this).inflate(R.layout.notification_msg,parent,false);
            ImageView imageView = ABC.findViewById(R.id.nfprofile1);
            Glide.with(Notification.this).load(list.get(position).getPrfile()).into(imageView);

            TextView textView = ABC.findViewById(R.id.msg);
            textView.setText(list.get(position).getMsg());
            TextView textView1 = ABC.findViewById(R.id.time1);
            textView1.setText(list.get(position).getTime());


            return ABC;
        }
    }

}