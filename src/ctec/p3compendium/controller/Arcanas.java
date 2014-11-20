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
	private String[] arcana;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_arcana);
		appState = (Persona3State) this.getApplication();

		arcanaView = (ListView) findViewById(R.id.list);

		arcanaView.setAdapter(null);
		
		/**
		 * arcana = new String []
		 * 
		 * {
		 * 
		 * };
		 */

	}
}
