package com.metrobus.sqlite.helper;

import java.util.ArrayList;

import com.metrobus.sqlite.model.Regiao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class DatabaseAdapter {
	private DatabaseHelper dbHelper;

	private static final String _ID = "_id";
	private static final String TABLE_REGIAO = "regiao";

	// queries sql
	private static final String SELECT_REGIOES = "SELECT * FROM "
			+ TABLE_REGIAO;

	public DatabaseAdapter(Context context) {
		dbHelper = new DatabaseHelper(context);
	}

	public Regiao getRegiao(int _id) {
		SQLiteDatabase sqliteDB = dbHelper.getReadableDatabase();
		String sql = "SELECT * FROM " + TABLE_REGIAO + " WHERE " + _ID + "="
				+ _id;
		Cursor crsr = sqliteDB.rawQuery(sql, null);
		crsr.moveToFirst();
		Regiao regiao = new Regiao(crsr.getInt(0), crsr.getString(1));
		return regiao;
	}

	public boolean insertRegiao(String regiao) {

		try {
			SQLiteDatabase sqlite = dbHelper.getWritableDatabase();

			ContentValues values = new ContentValues();
			values.put("id_regiao", 100);
			values.put("nome", regiao);
			sqlite.insert(TABLE_REGIAO, null, values);

		} catch (SQLException sqlerror) {
			Log.v("Insert into table error", sqlerror.getMessage());
			return false;
		}
		return true;

	}

	public boolean updateRegiao(int regiaoId, String regiao) {
		try {
			SQLiteDatabase sqlite = dbHelper.getWritableDatabase();
			ContentValues initialValues = new ContentValues();
			initialValues.put(_ID, regiaoId);
			initialValues.put("nome", regiao);
			sqlite.update(TABLE_REGIAO, initialValues, _ID + "=" + regiaoId,
					null);

		} catch (SQLException sqlerror) {
			return false;
		}
		return true;
	}

	public boolean deleteRegiao(int regiaoId) {
		try {
			SQLiteDatabase sqlite = dbHelper.getWritableDatabase();
			sqlite.delete(TABLE_REGIAO, _ID + "=" + regiaoId, null);

		} catch (SQLException sqlerror) {
			return false;
		}
		return true;
	}

	public ArrayList<Regiao> getRegioes() {
		ArrayList<Regiao> people = new ArrayList<Regiao>();
		SQLiteDatabase sqliteDB = dbHelper.getReadableDatabase();
		Cursor crsr = sqliteDB.rawQuery(SELECT_REGIOES, null);
		crsr.moveToFirst();
		for (int i = 0; i < crsr.getCount(); i++) {
			people.add(new Regiao(crsr.getInt(0), crsr.getString(1)));
			crsr.moveToNext();
		}
		return people;
	}

	public ArrayList<Regiao> searchRegiao(String r) {
		ArrayList<Regiao> regiao = new ArrayList<Regiao>();
		SQLiteDatabase sqliteDB = dbHelper.getReadableDatabase();
		Cursor crsr = sqliteDB.rawQuery("SELECT * FROM " + TABLE_REGIAO
				+ " WHERE " + "nome" + " LIKE ?",
				new String[] { "%" + r + "%" });
		crsr.moveToFirst();
		for (int i = 0; i < crsr.getCount(); i++) {
			regiao.add(new Regiao(crsr.getInt(0), crsr.getString(1)));
			crsr.moveToNext();
		}
		return regiao;
	}

}
