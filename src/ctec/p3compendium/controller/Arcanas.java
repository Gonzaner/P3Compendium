package ctec.p3compendium.controller;

import ctec.p3compendium.model.Persona3State;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class Arcanas extends Activity
{
	private Persona3State appState;
	private ListView arcanaView;
	private Button returnButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_arcana);
		appState = (Persona3State) this.getApplication();
		
		arcanaView = (ListView) findViewById(R.id.listView1);
		setupList();
		returnButton =(Button) findViewById(R.id.returnButton);
		

	}
	private void setupListeners()
	{
		returnButton.setOnClickListener (new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				Intent returnIntent = new Intent(v.getContext(), Compendium.class);
				startActivityForResult(returnIntent, 0);
				
				
			}
		});
	}
	private void setupList()
	{
		String [] currentArcana = appState.getArcanas()[appState.getSelectedIndex()];	
		
		ArrayAdapter<String> arcanaAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, currentArcana);
		arcanaView.setAdapter(arcanaAdapter); 
	}
}
