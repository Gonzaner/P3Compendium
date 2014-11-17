package ctec.p3compendium.controller;

import ctec.p3compendium.model.Persona3State;
import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class Arcanas extends Activity
{
	private Persona3State appState;
	private ListView arcanaView;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_arcana);
		appState = (Persona3State)this.getApplication();
		
		arcanaView = (ListView) findViewById(R.id.list);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, appState.charName );
		 arcanaView.setAdapter(adapter);
		
	}
	

}
