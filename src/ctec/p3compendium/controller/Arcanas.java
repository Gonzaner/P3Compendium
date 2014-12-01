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
		
		arcanaView = (ListView) findViewById(R.id.list);
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
				Intent returnIntent = new Intent();
				setResult(RESULT_OK, returnIntent);
				finish();
				
			}
		});
	}
	private void setupList()
	{
		String [] currentArcana = appState.getArcanas()[appState.getSelectedIndex()];	
		ArrayAdapter arcanaAdapter = new ArrayAdapter<String>(this, R.layout.activity_arcana, currentArcana);
	}
}
