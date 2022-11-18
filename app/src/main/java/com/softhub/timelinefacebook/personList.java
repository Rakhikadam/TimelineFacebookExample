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

public class personList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person);
        ListView listView = findViewById(R.id.list4);
        Intent intent = getIntent();
        List<requestfrnd>list1 = new ArrayList<>();
        requestfrnd frnd1 = new requestfrnd("AAAAAAAAA","https://cdn-icons-png.flaticon.com/512/3135/3135715.png","20 mutual friends");
        list1.add(frnd1);
        requestfrnd frnd2 = new requestfrnd("BBBBBBBBBB","https://cdn-icons-png.flaticon.com/512/3135/3135715.png","10 mutual friends");
        list1.add(frnd2);
        requestfrnd frnd3 = new requestfrnd("CCCCCCCCCC","https://cdn-icons-png.flaticon.com/512/3135/3135715.png","40 mutual friends");
        list1.add(frnd3);
        PersonAdpter adpter = new PersonAdpter(list1);
        listView.setAdapter(adpter);

    }
    class  PersonAdpter extends BaseAdapter{
        List<requestfrnd>list1;

        public PersonAdpter(List<requestfrnd> list1) {
            this.list1=list1;
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
            View PQR = LayoutInflater.from(personList.this).inflate(R.layout.activity_person_list,parent,false);
            ImageView image = PQR.findViewById(R.id.friendimg);
            Glide.with(personList.this).load(list1.get(position).getImage()).into(image);
            TextView name = PQR.findViewById(R.id.name);
            name.setText(list1.get(position).getName());
            TextView textView = PQR.findViewById(R.id.mutual);
            textView.setText(list1.get(position).getMutual_friends());



            return PQR;
        }
    }
}