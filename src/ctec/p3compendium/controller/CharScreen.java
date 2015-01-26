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
	private TextView personaNameShow, personaStShow, personaMaShow, personaEnShow,personaAgShow, personaLuShow,
	personaInheritShow, personaResistsShow, personaBlockShow, personaAbsorbsShow, personaRefelctsShow, personaWeakShow,
	skill1,skill2,skill3,skill4,skill5,skill6,skill7,cost1,cost2,cost3,cost4,cost5,cost6,cost7,effect1,effect2,effect3,
	effect4,effect5,effect6,effect7,skillLevel1,skillLevel2,skillLevel3,skillLevel4,skillLevel5,skillLevel6,skillLevel7,
	fusionSpellShow,fusionSpellCostShow,fusionSpellEffectShow,fusionSpellPersonasShow;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_char_screen);
		appState = (Persona3State) this.getApplication();
		personaNameShow = (TextView) findViewById(R.id.personaNameShow);
		personaStShow = (TextView) findViewById(R.id.personaStShow);
		personaMaShow = (TextView) findViewById(R.id.personaMaShow);
		personaEnShow = (TextView) findViewById (R.id.personaEnShow);
		personaAgShow = (TextView) findViewById(R.id.personaAgShow);
		personaLuShow = (TextView) findViewById(R.id.personaLuShow);
		personaInheritShow = (TextView) findViewById(R.id.personaInheritShow);
		personaResistsShow = (TextView) findViewById(R.id.personaResistsShow);
		personaBlockShow = (TextView) findViewById(R.id.personaBlockShow);
		personaAbsorbsShow = (TextView) findViewById(R.id.personaAbsorbsShow);
		personaRefelctsShow = (TextView) findViewById(R.id.personaReflectsShow);
		personaWeakShow = (TextView) findViewById(R.id.personaWeakShow);
		skill1 = (TextView) findViewById(R.id.skill1);
		skill2 = (TextView) findViewById(R.id.skill2);
		skill3 = (TextView) findViewById(R.id.skill3);
		skill4 = (TextView) findViewById(R.id.skill4);
		skill5 = (TextView) findViewById(R.id.skill5);
		skill6 = (TextView) findViewById(R.id.skill6);
		skill7 = (TextView) findViewById(R.id.skill7);
		cost1 = (TextView) findViewById(R.id.cost1);
		cost2 = (TextView) findViewById(R.id.cost2);
		cost3 = (TextView) findViewById(R.id.cost3);
		cost4 = (TextView) findViewById(R.id.cost4);
		cost5 = (TextView) findViewById(R.id.cost5);
		cost6 = (TextView) findViewById(R.id.cost6);
		cost7 = (TextView) findViewById(R.id.cost7);
		effect1 = (TextView) findViewById(R.id.effect1);
		effect2 = (TextView) findViewById(R.id.effect2);
		effect3 = (TextView) findViewById(R.id.effect3);
		effect4 = (TextView) findViewById(R.id.effect4);
		effect5 = (TextView) findViewById(R.id.effect5);
		effect6 = (TextView) findViewById(R.id.effect6);
		effect7 = (TextView) findViewById(R.id.effect7);
		skillLevel1 = (TextView) findViewById(R.id.skillLevel1);
		skillLevel2 = (TextView) findViewById(R.id.skillLevel2);
		skillLevel3 = (TextView) findViewById(R.id.skillLevel3);
		skillLevel4 = (TextView) findViewById(R.id.skillLevel4);
		skillLevel5 = (TextView) findViewById(R.id.skillLevel5);
		skillLevel6 = (TextView) findViewById(R.id.skillLevel6);
		skillLevel7 = (TextView) findViewById(R.id.skillLevel7);
		fusionSpellShow = (TextView) findViewById(R.id.fusionSpellShow);
		fusionSpellCostShow = (TextView) findViewById(R.id.fusionSpellCostShow);
		fusionSpellEffectShow = (TextView) findViewById(R.id.fusionSpellEffectShow);
		fusionSpellPersonasShow = (TextView) findViewById(R.id.fusionSpellPersonasShow);
		
	}

	private void personaSetter()
	{
		String [] currentPersona = appState.getPersonas()[appState.getSelectedIndex()];	
		personaNameShow.setText(currentPersona [0]);
		personaStShow.setText(currentPersona [1]);
		personaMaShow.setText(currentPersona [2]);
		personaEnShow.setText(currentPersona [3]);
		personaAgShow.setText(currentPersona [4]);
		personaLuShow.setText(currentPersona [5]);
		personaInheritShow.setText(currentPersona [6]);
		personaResistsShow.setText(currentPersona [7]);
		personaBlockShow.setText(currentPersona [8]);
		personaAbsorbsShow.setText(currentPersona [9]);
		personaRefelctsShow.setText(currentPersona [10]);
		personaWeakShow.setText(currentPersona [11]);
		skill1.setText(currentPersona [12]);
		skill2.setText(currentPersona [13]);
		skill3.setText(currentPersona [14]);
		skill4.setText(currentPersona [15]);
		skill5.setText(currentPersona [16]);
		skill6.setText(currentPersona [17]);
		skill7.setText(currentPersona [18]);
		cost1.setText(currentPersona [19]);
		cost2.setText(currentPersona [20]);
		cost3.setText(currentPersona [21]);
		cost4.setText(currentPersona [22]);
		cost5.setText(currentPersona [23]);
		cost6.setText(currentPersona [24]);
		cost7.setText(currentPersona [25]);
		effect1.setText(currentPersona [26]);
		effect2.setText(currentPersona [27]);
		effect3.setText(currentPersona [28]);
		effect4.setText(currentPersona [29]);
		effect5.setText(currentPersona [30]);
		effect6.setText(currentPersona [31]);
		effect7.setText(currentPersona [32]);
		skillLevel1.setText(currentPersona [33]); 
		skillLevel2.setText(currentPersona [34]);
		skillLevel3.setText(currentPersona [35]);
		skillLevel4.setText(currentPersona [36]);
		skillLevel5.setText(currentPersona [37]);
		skillLevel6.setText(currentPersona [38]);
		skillLevel7.setText(currentPersona [39]);
		fusionSpellShow.setText(currentPersona[40]); 
		fusionSpellCostShow.setText(currentPersona[41]); 
		fusionSpellEffectShow.setText(currentPersona[42]); 
		fusionSpellPersonasShow.setText(currentPersona[43]); 
	}
}
