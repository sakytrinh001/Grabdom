package com.android.dfr.grabcondom.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.android.dfr.grabcondom.R;
import com.android.dfr.grabcondom.adapter.NewArrivalAdapter;

import java.util.ArrayList;

/**
 * Created by MinhThanh on 10/27/16.
 */

public class NewArrival extends Activity{

    private NewArrivalAdapter mAdapter;
    private ArrayList<String> listTitle;
    private ArrayList<Integer> listImg;

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_arrival_layout);
        prepareList();

        mAdapter = new NewArrivalAdapter(this, listTitle, listImg);
        gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(NewArrival.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void prepareList(){
        listTitle = new ArrayList<String>();
        listTitle.add("india");
        listTitle.add("Brazil");
        listTitle.add("Canada");
        listTitle.add("China");
        listTitle.add("France");
        listTitle.add("Germany");
        listTitle.add("Iran");
        listTitle.add("Italy");
        listTitle.add("Japan");
        listTitle.add("Korea");
        listTitle.add("Mexico");
        listTitle.add("Netherlands");
        listTitle.add("Portugal");
        listTitle.add("Russia");
        listTitle.add("Saudi Arabia");
        listTitle.add("Spain");
        listTitle.add("Turkey");
        listTitle.add("United Kingdom");
        listTitle.add("United States");

        listImg = new ArrayList<Integer>();
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
        listImg.add(R.drawable.arrival);
    }
}
