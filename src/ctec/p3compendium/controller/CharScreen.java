package ctec.p3compendium.controller;



import ctec.p3compendium.model.Persona3State;

import java.util.Set;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class CharScreen extends Activity
{
	private Persona3State appState;
	private int changeSt;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_char_screen);
		appState = (Persona3State) this.getApplication();
		
	}

	private void personaSetter()
	{
		String [] currentPersona = appState.getPersonas()[appState.getSelectedIndex()];	
		if(currentPersona.equals(appState.getOrpheus()))
		{
			
		}
		
	}
}
