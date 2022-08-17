package com.example.recyclerview_with_cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycler and Card View Demo");

        rcv = (RecyclerView) findViewById(R.id.recview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(dataqueue());
        rcv.setAdapter(adapter);

    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("Github");
        ob1.setDesc("Create your repo.");
        ob1.setImgname(R.drawable.github);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("Linkdin");
        ob2.setDesc("Finding new job");
        ob2.setImgname(R.drawable.linkdin);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("FaceBook");
        ob2.setDesc("Finding new people");
        ob3.setImgname(R.drawable.facebook);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("Instagram ");
        ob4.setImgname(R.drawable.instagram);
        ob2.setDesc("Stay connected with people");
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setHeader("Streckoverflow");
        ob5.setDesc("Write your code with skill");
        ob5.setImgname(R.drawable.ic_code);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setHeader("Medium");
        ob6.setDesc("Learn and write article");
        ob6.setImgname(R.drawable.medium);
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setHeader("Github");
        ob7.setDesc("Create your repo.");
        ob7.setImgname(R.drawable.github);
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setHeader("Linkdin");
        ob8.setDesc("Finding new job");
        ob8.setImgname(R.drawable.linkdin);
        holder.add(ob8);

        Model ob9=new Model();
        ob9.setHeader("FaceBook");
        ob9.setDesc("Finding new people");
        ob9.setImgname(R.drawable.facebook);
        holder.add(ob9);

        Model ob10=new Model();
        ob10.setHeader("Instagram ");
        ob10.setImgname(R.drawable.instagram);
        ob10.setDesc("Stay connected with people");
        holder.add(ob10);

        Model ob11=new Model();
        ob11.setHeader("Streckoverflow");
        ob11.setDesc("Write your code with skill");
        ob11.setImgname(R.drawable.ic_code);
        holder.add(ob11);

        Model ob12=new Model();
        ob12.setHeader("Medium");
        ob12.setDesc("Learn and write article");
        ob12.setImgname(R.drawable.medium);
        holder.add(ob12);


        return holder;
    }


}
