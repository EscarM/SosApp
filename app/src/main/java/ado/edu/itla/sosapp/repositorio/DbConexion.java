package ado.edu.itla.sosapp.repositorio;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbConexion extends SQLiteOpenHelper {

    private static String NOMBRE_BASEDATOS="sosapp.db";
    private static int VERSION_BASEDATO=1;

    public DbConexion(Context context) {
        super(context, NOMBRE_BASEDATOS, null, VERSION_BASEDATO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
