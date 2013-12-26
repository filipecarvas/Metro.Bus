package com.metrobus.Bluetooth;

import java.util.ArrayList;

import com.example.barcode.MainActivity;
import com.example.barcode.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.Toast;

public class BluetoothClientActivity extends Activity implements OnClickListener {
	
	private static final int REQUEST_ENABLE_BT = 2;
	
	private Button btSeacrh;
	
	BluetoothAdapter bt_adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bluetooh);
		bt_adapter = BluetoothAdapter.getDefaultAdapter();
		btSeacrh = (Button) findViewById(R.id.search_devices);
		btSeacrh.setOnClickListener(this);
		//Toast.makeText(this, "Hey1", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if (!bt_adapter.isEnabled()) 
		{
    	    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
    	    startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
    	} else
    	{
    		Intent i = new Intent(BluetoothClientActivity.this, com.metrobus.Bluetooth.BluetoothActionsActivity.class);
      		startActivity(i);
    	}
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		switch(requestCode){
	        case REQUEST_ENABLE_BT:
	            // When the request to enable Bluetooth returns
	            if (resultCode == Activity.RESULT_OK) {
	            	Toast.makeText(this, "Bluetooth is now enabled!", Toast.LENGTH_SHORT).show();
	            	Intent i = new Intent(BluetoothClientActivity.this, com.metrobus.Bluetooth.BluetoothActionsActivity.class);
	          		startActivity(i);
	            } else {
	                Toast.makeText(this, "Bluetooth is not enabled!", Toast.LENGTH_SHORT).show();
	                finish();
	            }
			break;
			default:
				super.onActivityResult(requestCode, resultCode, data); 
			break;
		}
	}
}