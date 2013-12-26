package com.metrobus.Bluetooth;

import java.util.ArrayList;

import com.example.barcode.R;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;
import android.app.ListActivity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class BluetoothActionsActivity extends ListActivity {
	BluetoothAdapter bt_adapter;
	ListView list;
	ArrayList<BluetoothDevice> list_paired_devices =   new ArrayList<BluetoothDevice>();
	
	private final BroadcastReceiver discover_devices = new BroadcastReceiver() {
	    public void onReceive(Context context, Intent intent) {
	        String action = intent.getAction();
	        if (BluetoothDevice.ACTION_FOUND.equals(action)) {
	            // Get the BluetoothDevice object from the Intent
	            BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
	            list_paired_devices.add(device);
	            ListAdapter list_adapter = new ListAdapter(getApplicationContext(),R.layout.list_bluetooth, list_paired_devices);
				list.setAdapter(list_adapter);
	        }
	    }
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Toast.makeText(this, "Hey2", Toast.LENGTH_SHORT).show();
		list = getListView();
		bt_adapter = BluetoothAdapter.getDefaultAdapter();
		
        if (bt_adapter == null) {
        	Toast.makeText(this, "Device does not support Bluetooth", Toast.LENGTH_SHORT).show();
        	finish();
        }
        else{
        	//Toast.makeText(this, "Device supports Bluetooth", Toast.LENGTH_SHORT).show();
        	if (bt_adapter.isEnabled()) {
        		registerReceiver(discover_devices, new IntentFilter(BluetoothDevice.ACTION_FOUND)); 
        		bt_adapter.startDiscovery();   
    	    }
    		 else{
    			 Toast.makeText(this, "No paired device found!", Toast.LENGTH_SHORT).show();
    		 }
        }
     }
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		unregisterReceiver(discover_devices);
		super.onDestroy();
	}
	public boolean onCreateOptionsMenu(Menu menu) {
	 	MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu_bluetooth, menu);
		return true;
    }

    public boolean onMenuItemSelected(int featureId, MenuItem item) {
    	switch (item.getItemId()) {
	        case R.id.action_settings:
	        	list_paired_devices.clear();
	        	bt_adapter.startDiscovery();   
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
    	}
    }
		
}