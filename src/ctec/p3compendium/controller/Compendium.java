package ctec.p3compendium.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class Compendium extends Activity
{
	
	private ListView listView;
	private String[] values;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_compendium);
		
		
		
		listView = (ListView) findViewById(R.id.list);
		setupListeners();
		
//		setkey("Trump")
//		{
//			setup("Trump","Fool")
//		}
		
					
		values = new String[] 
				
		{ 
                "Fool",
                "Magician",
                "Priestess", 
                "Empress", 
                "Emperor", 
                "Heirophant", 
                "Lovers",
                "Chariot",
                "Justice",
                "Hermit",
                "Fortune",
                "Strength",
                "Hanged",
                "Death",
                "Temperance",
                "Devil",
                "Tower",
                "Star",
                "Moon",
                "Sun",
                "Judgment"
         };
		
		
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);
		 listView.setAdapter(adapter);
		 
		 
		 }
	




	private void setupListeners()
		 {
			listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
			{

				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id)
				{
					Toast.makeText(getBaseContext(), values[position], Toast.LENGTH_LONG).show();
					
				}
			});
		 }
}
	

