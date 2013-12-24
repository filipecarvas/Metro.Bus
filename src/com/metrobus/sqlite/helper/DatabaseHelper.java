package com.metrobus.sqlite.helper;

import com.metrobus.sqlite.model.Regiao;
import com.metrobus.sqlite.model.Zona;
import com.metrobus.sqlite.model.Percurso;
import com.metrobus.sqlite.model.Horario;
import com.metrobus.sqlite.model.Transporte;
import com.metrobus.sqlite.model.TipoTransporte;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

// Filipe Carvas

public class DatabaseHelper extends SQLiteOpenHelper {
	
	// Logcat tag
	private static final String LOG = "DatabaseHelper";

	// Database Version
	private static final int DATABASE_VERSION = 1;

	// Database Name
	private static final String DATABASE_NAME = "metrobus";
	
	// Table Names
	private static final String TABLE_REGIAO = "regiao";
	private static final String TABLE_ZONA = "zona";
	private static final String TABLE_PERCRUSO = "percurso";
	private static final String TABLE_HORARIO = "horario";
	private static final String TABLE_TRANSPORTE = "transporte";
	private static final String TABLE_TIPOTRANSPORTE = "tipotransporte";

	// Common column names
	private static final String KEY_NOME = "nome";
	
	// Região Table - column names
	private static final String KEY_ID_REGIAO = "id_regiao";
	
	// Zona Table - column names
	private static final String KEY_ID_ZONA = "id_zona";
	private static final String KEY_ZONA_INFO = "ZonaInfo";
	private static final String KEY_LATITUDE = "latitude";
	private static final String KEY_LONGITUDE = "longitude";
		
	// Percurso Table - column names
	private static final String KEY_ID_PERCURSO = "id_percurso";
	private static final String KEY_ORDEM = "ordem";
	private static final String KEY_HORA = "hora";
	
	// Horario Table - column names
	private static final String KEY_ID_HORARIO = "id_horario";
	private static final String KEY_HORARIO = "horario";
	
	// Transporte Table - column names
	private static final String KEY_ID_TRANSPORTE = "id_percurso";
	private static final String KEY_NUMERO_LINHA = "numero_linha";
	private static final String KEY_SENTIDO = "sentido";
	
	// TipoTransporte Table - column names
	private static final String KEY_ID_TIPOTRANSPORTE= "id_TipoTransporte";
	
	// Table Create Statements
	// Região table create statement
	private static final String CREATE_TABLE_REGIAO = "CREATE TABLE "
			+ TABLE_REGIAO + "(" + KEY_ID_REGIAO + " INTEGER PRIMARY KEY," + KEY_NOME
			+ " TEXT" + ")";

	// Zona table create statement
	private static final String CREATE_TABLE_ZONA = "CREATE TABLE "
			+ TABLE_ZONA+ "(" + KEY_ID_ZONA + " INTEGER PRIMARY KEY," + KEY_ID_REGIAO + " INTEGER," 
			+ KEY_ID_TIPOTRANSPORTE + " INTEGER," + KEY_NOME + " TEXT," +  KEY_ZONA_INFO + " TEXT," 
			+ KEY_LATITUDE + " TEXT," + KEY_LONGITUDE + " TEXT" + ")";

	// PERCURSO table create statement
	private static final String CREATE_TABLE_PERCURSO = "CREATE TABLE "
			+ TABLE_PERCRUSO+ "(" + KEY_ID_PERCURSO + " INTEGER PRIMARY KEY," + KEY_ID_TRANSPORTE + " INTEGER," 
			+ KEY_ID_ZONA + " INTEGER," + KEY_ORDEM + " TEXT," + KEY_HORA + " TEXT" + ")";
	
	// Horario table create statement
	private static final String CREATE_TABLE_HORARIO = "CREATE TABLE "
			+ TABLE_HORARIO+ "(" + KEY_ID_HORARIO + " INTEGER PRIMARY KEY," + KEY_ID_ZONA + " INTEGER," 
			+ KEY_ID_TRANSPORTE + " INTEGER,"  + KEY_ID_TIPOTRANSPORTE + " INTEGER," + KEY_HORARIO + " TEXT" + ")";
	
	// Transporte table create statement
	private static final String CREATE_TABLE_TRASNPORTE = "CREATE TABLE "
			+ TABLE_TRANSPORTE+ "(" + KEY_ID_TRANSPORTE + " INTEGER PRIMARY KEY," + KEY_ID_TIPOTRANSPORTE + " INTEGER," 
			+ KEY_NUMERO_LINHA + " TEXT," +  KEY_SENTIDO + " TEXT" + ")";
	
	// TipoTransporte table create statement
	private static final String CREATE_TABLE_TIPOTRANSPORTE = "CREATE TABLE "
			+ TABLE_TIPOTRANSPORTE + "(" + KEY_ID_TIPOTRANSPORTE + " INTEGER PRIMARY KEY," + KEY_NOME
			+ " TEXT" + ")";
	
	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_TABLE_REGIAO);
		db.execSQL(CREATE_TABLE_ZONA);
		db.execSQL(CREATE_TABLE_PERCURSO);
		db.execSQL(CREATE_TABLE_HORARIO);
		db.execSQL(CREATE_TABLE_TRASNPORTE);
		db.execSQL(CREATE_TABLE_TIPOTRANSPORTE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// on upgrade drop older tables
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_REGIAO);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_ZONA);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_PERCRUSO);

		db.execSQL("DROP TABLE IF EXISTS " + TABLE_HORARIO);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_TRANSPORTE);
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_TIPOTRANSPORTE);
		// create new tables
		onCreate(db);
		
	}
	
	//exemplo inserir regiao
	public long InsertRegiao(Regiao regiao) {
		SQLiteDatabase db = this.getWritableDatabase();

		ContentValues values = new ContentValues();
		values.put(KEY_NOME, regiao.getNome());

		// insert row
		long todo_id = db.insert(TABLE_REGIAO, null, values);

		return todo_id;
	}
	
	// closing database
	public void closeDB() {
		SQLiteDatabase db = this.getReadableDatabase();
		if (db != null && db.isOpen())
			db.close();
	}
	


}
