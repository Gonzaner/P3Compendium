package ctec.p3compendium.controller;

import ctec.p3compendium.model.Persona3State;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

/**
 * @author Gray
 * @version 1.2 11/21/14
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

		/**
		 * The string that is show on the list of the start screen. Choice from
		 * here will lead you to the Arcanas screen hopefully passed with the
		 * correct intent to display needed personas.
		 * 
		 */

		Trump = new String[]

		{ "Fool", "Magician", "Priestess", "Empress", "Emperor", "Heirophant", "Lovers", "Chariot", "Justice", "Hermit", "Fortune", "Strength", "Hanged", "Death", "Temperance", "Devil", "Tower", "Star", "Moon", "Sun", "Judgment" };

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, Trump);
		listView.setAdapter(adapter);

	}

	/**
	 * The listener for the list, it is being coded to be able to pass the right
	 * informaion.
	 */

	private void setupListeners()
	{
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
		{

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id)
			{

				appState.setSelectedIndex(position);
				Intent transferIntent = new Intent(view.getContext(), Arcanas.class);
				startActivityForResult(transferIntent, 0);

			}
		});
	}

}
