package com.metrobus.Bluetooth;

import java.util.List;

import com.example.barcode.R;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {
	List<BluetoothDevice> items;
	public ListAdapter(final Context context, final int itemResId,final List<BluetoothDevice> items) {
		this.items = items;
	}
	public int getCount() {
		// TODO Auto-generated method stub
		return items.size();
	}

	public BluetoothDevice getItem(int arg0) {
		// TODO Auto-generated method stub
		return ((items.size()>0)? items.get(arg0) : null);
	}

	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		View itemView = null;
		 final BluetoothDevice row = this.items.get(arg0);
		 if (arg1 == null) {
			 LayoutInflater inflater = (LayoutInflater) arg2.getContext()
					 .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			 itemView = inflater.inflate(R.layout.list_bluetooth, null);
	        } else {
	            itemView = arg1;
	        }
	        TextView item_name = (TextView) itemView.findViewById(R.id.item_name_bluetooth);
	        item_name.setText("Name: "+ row.getName());
	        return itemView;
	}

}