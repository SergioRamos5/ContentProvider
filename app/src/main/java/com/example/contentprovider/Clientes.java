package com.example.contentprovider;

import android.net.Uri;
import android.provider.BaseColumns;

public class Clientes implements BaseColumns {
    public static final String COL_NOMBRE = "nombre", COL_TELEFONO = "telefono", COL_EMAIL="email";
    static String uri = "content://com.example.contentprovider/clientes";
    public static Uri CONTENT_URI = Uri.parse(uri);
}
