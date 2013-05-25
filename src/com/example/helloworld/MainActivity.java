package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
//import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	public void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
//		setContentView( R.layout.activity_main );
		TextView txView = new TextView(this);
		txView.setText("Hello Android!!");
		setContentView(txView);
	}

//	@Override
//	public boolean onCreateOptionsMenu( Menu menu ) {
//		getMenuInflater().inflate( R.menu.activity_main, menu );
//		return true;
//	}
}