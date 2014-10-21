package ctec.p3compendium.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Compendium extends Activity
{
	private ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_compendium);
		
		listView = (ListView) findViewById(R.id.list);
		String[] values = new String[] { "Android List View", 
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android", 
                "Android Example", 
                "List View Source Code", 
                "List View Array Adapter", 
                "Android Example List View" 
               };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);
		 listView.setAdapter(adapter);
		 listView.setOnItemClickListener(new OnItemClickListener()
		 {
			 @Override
			 public void onItemClick(AdapterView<?>parent, View view,
				int position, long id)
				{
				 int itemPosition = position;
				 String itemValue = (String) listView.getItemAtPosition(position);
				 
				 Toast.makeText(getApplicationContext(),
	                      "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
	                      .show();
				 
				}			 
		 });		 
	}
}
