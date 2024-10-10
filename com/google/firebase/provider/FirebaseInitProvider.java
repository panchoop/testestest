package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import c.c.a.a.c.l.q;
import c.c.b.b;
import c.c.b.f;

public class FirebaseInitProvider extends ContentProvider {
  public void attachInfo(Context paramContext, ProviderInfo paramProviderInfo) {
    q.g(paramProviderInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
    if (!"com.google.firebase.firebaseinitprovider".equals(paramProviderInfo.authority)) {
      super.attachInfo(paramContext, paramProviderInfo);
      return;
    } 
    throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString) {
    return 0;
  }
  
  public String getType(Uri paramUri) {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues) {
    return null;
  }
  
  public boolean onCreate() {
    Context context = getContext();
    synchronized (b.h) {
      if (b.j.containsKey("[DEFAULT]")) {
        b b = b.c();
      } else {
        b b;
        String str;
        f f = f.a(context);
        if (f == null) {
          Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
          f = null;
        } else {
          b = b.g(context, f);
        } 
        if (b == null) {
          str = "FirebaseApp initialization unsuccessful";
        } else {
          str = "FirebaseApp initialization successful";
        } 
        Log.i("FirebaseInitProvider", str);
        return false;
      } 
    } 
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2) {
    return null;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString) {
    return 0;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\firebase\provider\FirebaseInitProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */