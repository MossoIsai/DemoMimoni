package com.autounionapp.isaigarciamoso.demomimoni.delegates;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by isaigarciamoso on 04/02/17.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String NOMBRE_DB = "MIMONIDB";
    private QuerysDB querysDB;

    public  DBHelper(Context context){

        super(context, NOMBRE_DB, null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
       //Ejecucion de los Querys
        querysDB = new QuerysDB();
        querysDB.createTableUsuario();
        querysDB.createTableDepartamento();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }
}
