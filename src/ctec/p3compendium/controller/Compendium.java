package ctec.p3compendium.controller;

import ctec.p3compendium.model.Persona3State;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
/** 
* @author Gray
* @version 2.0 11/13/14
*/
public class Compendium extends Activity
{
	
	private ListView listView;
	private String[] Trump;
	private Persona3State appState; 
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_compendium);
		
		appState = (Persona3State) this.getApplication();
		
		listView = (ListView) findViewById(R.id.list);
		setupListeners();
		
		
					
		Trump = new String[] 
				
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
		
		
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, Trump);
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
					
					Intent transferIntent = new Intent(view.getContext(), Arcanas.class);
					startActivityForResult(transferIntent, 0);
				}
			});
		 }





	protected void startActivityForResult(Intent transferIntent, String string)
	{
		// TODO Auto-generated method stub
		
	}
	
}
	

