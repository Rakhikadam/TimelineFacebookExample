package com.softhub.timelinefacebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

public class button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timeline_profile);
        Intent data =getIntent();

        ArrayList<comment> coom = data.getParcelableArrayListExtra("comments");
        ListView listViewt = findViewById(R.id.list1);


        CommentAdpter adpter = new CommentAdpter(coom);
        listViewt.setAdapter(adpter);

    }
    class CommentAdpter extends BaseAdapter{
        List<comment> list;

        public CommentAdpter(List<comment> list) {
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
            View XYZ = LayoutInflater.from(button.this).inflate(R.layout.comment,parent,false);
            ImageView imageView = XYZ.findViewById(R.id.profile);
            Glide.with(button.this).load(list.get(position).getProfile()).into(imageView);
            TextView textView= XYZ.findViewById(R.id.name1);
            textView.setText(list.get(position).getName());
            TextView textView1 = XYZ.findViewById(R.id.comme);
            textView1.setText(list.get(position).getComments());
            return XYZ ;
        }
    }
}