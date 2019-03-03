package com.example.vp.alexa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Content extends AppCompatActivity {
    ImageView info;
    //FIXME: Add advertising

    String[] listViewText = new String[]{
            "Main", "Sounds", "Music", "Bluetooth", "Timers and Alarm", "Calculator", "Translator", "News", "Radio", "Television", "History", "Geography","Books","Dictionaries","Physics and chemistry","Lists","Weather","Calendar","Sport","Places and routes","Films","Kitchen","Skills apps","Shopping at Amazon","Smart House","Calls","Secret commands"
    };

    int[] listViewImage = new int[]{
            R.drawable.main, R.drawable.sounds,R.drawable.music, R.drawable.bluetooth, R.drawable.timer_alarm, R.drawable.calculator, R.drawable.translator, R.drawable.news, R.drawable.radio, R.drawable.tv, R.drawable.history, R.drawable.geography, R.drawable.books, R.drawable.dictionary,R.drawable.phisics,R.drawable.lists, R.drawable.weather, R.drawable.calendar,R.drawable.sport, R.drawable.places_routes,R.drawable.films,R.drawable.kitchen,R.drawable.app,R.drawable.shoppping_amazon, R.drawable.smart_house, R.drawable.calls,R.drawable.secret
    };

    int [] listArrow = new int[]{
            R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow, R.drawable.arrow
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        List<HashMap<String, String>> arrayList = new ArrayList<>();

        for (int i = 0; i < listArrow.length; i++){
            HashMap<String, String> hm = new HashMap<>();
            hm.put("list_view_title", listViewText[i]);
            hm.put("list_view_image", Integer.toString(listViewImage[i]));
            hm.put("arrow_image", Integer.toString(listArrow[i]));
            arrayList.add(hm);
        }
        String [] from = {"list_view_image", "list_view_title","arrow_image"};
        int [] to = {R.id.list_view_image, R.id.list_view_title, R.id.arrow_image};
        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), arrayList, R.layout.my_list,from,to);
        ListView androidListView = (ListView) findViewById(R.id.list_view);
        androidListView.setAdapter(simpleAdapter);
        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 :
                        break;
                }
            }
        });
        info = (ImageView) findViewById(R.id.btn_info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Info.class));

            }
        });
    }



}
