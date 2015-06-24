package com.example.listviewtest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	/*private String[] data = {"apple","banana","orange","waterme","pear",
			"grape","pineapple","strawberry","cherry","mango"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, 
				android.R.layout.simple_list_item_1, data);
		ListView listview = (ListView)findViewById(R.id.list_view);
		listview.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}*/
	
	private List<Fruit> fruitList = new ArrayList<Fruit>() ;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initFruits();
		FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
		ListView listview = (ListView) findViewById(R.id.list_view);
		listview.setAdapter(adapter);
	}
	
	private void initFruits(){
		Fruit apple = new Fruit("Apple", R.drawable.apple_pic);
		fruitList.add(apple);
		Fruit banana = new Fruit("Banana",R.drawable.banana_pic);
		fruitList.add(banana);
		Fruit orange = new Fruit("Orange",R.drawable.orange_pic);
		fruitList.add(orange);
		Fruit watermelon = new Fruit("Watermelon",R.drawable.watermelon_pic);
		fruitList.add(watermelon);
		Fruit pear = new Fruit("Pear", R.drawable.pear_pic);
		fruitList.add(pear);
		Fruit grape = new Fruit("Grape", R.drawable.grape_pic);
		fruitList.add(grape);
		Fruit pineapple = new Fruit("Pineapple", R.drawable.pineapple_pic);
		fruitList.add(pineapple);
		Fruit strawberry = new Fruit("Strawberry", R.drawable.strawberry_pic);
		fruitList.add(strawberry);
		Fruit cherry = new Fruit("Cherry", R.drawable.cherry_pic);
		fruitList.add(cherry);
		Fruit mango = new Fruit("Mango", R.drawable.mango_pic);
		fruitList.add(mango);

	}
}
