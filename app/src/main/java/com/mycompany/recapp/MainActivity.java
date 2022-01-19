package com.mycompany.recapp;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
      public static WeakReference<MainActivity> ctx = null;
	  private List<Name> names = new ArrayList<>();
	  private NamesAdapter adapter;
	  private String[] namesAllaha = {"N1","N2","N3"};
	
	  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		ctx = new WeakReference<MainActivity>(this);
		init();
		adapter = new NamesAdapter(getApplicationContext(), names);
		RecyclerView r =  findViewById(R.id.list);
		r.setAdapter(adapter);
		r.setHasFixedSize(false);
    }
    
	public void init(){
		for(String n : namesAllaha){
			names.add(new Name(n));
		}
	}
}
