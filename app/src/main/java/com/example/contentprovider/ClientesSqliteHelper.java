package com.example.contentprovider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ClientesSqliteHelper extends SQLiteOpenHelper {

    String cadena = "CREATE TABLE Clientes(_id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, telefono TEXT, email TEXT);";

    public ClientesSqliteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String nombre, telefono, email;
        db.execSQL(cadena);
        for (int i = 0; i <= 15 ; i++)
        {
            nombre = "Cliente" + i; telefono = "900-123-00" + i; email = "email" +i+ "@mail.com";
            db.execSQL("INSERT INTO Clientes (nombre, telefono, email)" + "VALUES ('"+nombre+"', '"+telefono+"','"+email+"');");
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Clientes");
        db.execSQL(cadena);
    }
}
