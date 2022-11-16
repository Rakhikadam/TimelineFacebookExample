package com.softhub.timelinefacebook;

import androidx.appcompat.app.AppCompatActivity;

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

public class button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timeline_profile);
        ListView listViewt = findViewById(R.id.list1);
        List<comment>list= new ArrayList<>();
        comment comm = new comment(getResources().getDrawable(R.drawable.comprofile),"AAAAAAAAA","nice pic");
        list.add(comm);
        comment comm1 = new comment(getResources().getDrawable(R.drawable.gabbar),"DDDDDDDD","beautiful photo");
        list.add(comm1);
        CommentAdpter adpter = new CommentAdpter(list);
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
            imageView.setImageDrawable(list.get(position).getProfile());
            TextView textView= XYZ.findViewById(R.id.name1);
            textView.setText(list.get(position).getName());
            TextView textView1 = XYZ.findViewById(R.id.comme);
            textView1.setText(list.get(position).getComments());
            return XYZ ;
        }
    }
}