package ctec.p3compendium.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class CharScreen extends Activity
{

	private int [][] stats;
	private String[] charName;
	private String charType;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_char_screen);
		charType = getIntent().getExtras().getString("type");
		
		charName = new String[]
				
				{
					"Orpheus",
					"Legion",
					"Ose",
					"Black Frost",
					"Decarabia",
					"Loki",
					"Susano-o"
				};
		
		stats = new int [][]
				{ 
					{1,2,2,2,2,2},	
					{12,11,9,11,4,8},
					{22,20,13,15,14,11},
					{34,23,25,25,26,26},
					{44,25,35,25,26,28},
					{55,40,42,29,41,20},
					{76,57,51,53,49,53}
				};
		//* where we initialize all the text views, pics.
		
	}
}
