package com.example.barcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//features
		Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {

				//start - QR Code
				Intent i = new Intent(MainActivity.this, QRCodeActivity.class);
				startActivity(i);
			}
		});

		Button button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				
				// Bluetooth
				Intent i = new Intent(MainActivity.this, com.metrobus.Bluetooth.BluetoothClientActivity.class);
				startActivity(i);
			}
		});
		
		Button button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {

				//resource 2
				//Intent i = new Intent(MainActivity.this, QRCodeActivity.class);
				//startActivity(i);
			}
		});
		
	}
}