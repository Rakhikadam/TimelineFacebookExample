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

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import Image.video;

public class videoList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_list);
        ListView listView1 = findViewById(R.id.videolist);
        ArrayList<video>list1 = new ArrayList<>();
        video video1 = new video("https://upload.wikimedia.org/wikipedia/commons/3/3e/Tree_736885.jpg");
        list1.add(video1);
        video video2 = new video("https://upload.wikimedia.org/wikipedia/commons/3/3e/Tree_736885.jpg");
        list1.add(video2);
        VideoAdpter adpter = new VideoAdpter(list1);
        listView1.setAdapter(adpter);


    }

    class VideoAdpter extends BaseAdapter{
        List<video>list1;

        public VideoAdpter(List<video> list1) {
            this.list1 = list1;
        }

        @Override
        public int getCount() {
            return list1.size();

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
            View ABC = LayoutInflater.from(videoList.this).inflate(R.layout.video,parent,false);
               ImageView imageView = ABC.findViewById(R.id.video);
            Glide.with(videoList.this).load(list1.get(position).getImage());



            return ABC;
        }
    }



}