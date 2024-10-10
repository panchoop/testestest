package c.c.b.h.c0.a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import c.c.a.a.c.c;
import c.c.a.a.c.k.k.c;
import c.c.a.a.c.k.k.h;
import c.c.a.a.c.l.c;
import c.c.a.a.c.l.g;
import c.c.a.a.c.l.i;
import c.c.a.a.c.l.o;
import c.c.a.a.c.l.q;
import c.c.a.a.c.m.a;
import c.c.a.a.f.c.r0;
import com.google.android.gms.dynamite.DynamiteModule;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class k0 extends g<p0> implements l0 {
  public static a z = new a("FirebaseAuth", new String[] { "FirebaseAuth:" });
  
  public final Context x;
  
  public final t0 y;
  
  public k0(Context paramContext, Looper paramLooper, c paramc, t0 paramt0, c paramc1, h paramh) {
    super(paramContext, paramLooper, 112, paramc, paramc1, paramh);
    q.f(paramContext);
    this.x = paramContext;
    this.y = paramt0;
  }
  
  public final boolean l() {
    return (DynamiteModule.a(this.x, "com.google.firebase.auth") == 0);
  }
  
  public final int o() {
    return 12451000;
  }
  
  public final c[] q() {
    return r0.d;
  }
  
  public final Bundle r() {
    Bundle bundle = new Bundle();
    t0 t01 = this.y;
    if (t01 != null)
      bundle.putString("com.google.firebase.auth.API_KEY", t01.c); 
    o o = o.c;
    String str3 = null;
    String str2 = null;
    if (o != null) {
      String str;
      q.e("firebase-auth", "Please provide a valid libraryName");
      if (o.a.containsKey("firebase-auth")) {
        str = (String)o.a.get("firebase-auth");
      } else {
        Properties properties = new Properties();
        String str4 = str2;
        try {
          InputStream inputStream = o.class.getResourceAsStream(String.format("/%s.properties", new Object[] { "firebase-auth" }));
          if (inputStream != null) {
            str4 = str2;
            properties.load(inputStream);
            str4 = str2;
            str2 = properties.getProperty("version", null);
            str4 = str2;
            i i1 = o.b;
            str4 = str2;
            int i = String.valueOf(str2).length();
            str4 = str2;
            StringBuilder stringBuilder = new StringBuilder();
            str4 = str2;
            this(25 + i);
            str4 = str2;
            stringBuilder.append("firebase-auth");
            str4 = str2;
            stringBuilder.append(" version is ");
            str4 = str2;
            stringBuilder.append(str2);
            str4 = str2;
            str3 = stringBuilder.toString();
            str4 = str2;
            str = str2;
            if (i1.a(2)) {
              str4 = str2;
              str = i1.b;
              if (str == null) {
                str = str3;
              } else {
                str4 = str2;
                str = str.concat(str3);
              } 
              str4 = str2;
              Log.v("LibraryVersion", str);
              str = str2;
            } 
          } else {
            str4 = str2;
            i i = o.b;
            str4 = str2;
            String str5 = "Failed to get app version for libraryName: ".concat("firebase-auth");
            str4 = str2;
            str = str3;
            if (i.a(6)) {
              str4 = str2;
              str = i.b;
              if (str == null) {
                str = str5;
              } else {
                str4 = str2;
                str = str.concat(str5);
              } 
              str4 = str2;
              Log.e("LibraryVersion", str);
              str = str3;
            } 
          } 
        } catch (IOException iOException) {
          i i = o.b;
          str2 = "Failed to get app version for libraryName: ".concat("firebase-auth");
          str = str4;
          if (i.a(6)) {
            str = i.b;
            if (str == null) {
              str = str2;
            } else {
              str = str.concat(str2);
            } 
            Log.e("LibraryVersion", str, iOException);
            str = str4;
          } 
        } 
        str4 = str;
        if (str == null) {
          i i = o.b;
          str = ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used";
          if (i.a(3)) {
            String str5 = i.b;
            if (str5 != null)
              str = str5.concat(".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used"); 
            Log.d("LibraryVersion", str);
          } 
          str4 = "UNKNOWN";
        } 
        o.a.put("firebase-auth", str4);
        str = str4;
      } 
      if (!TextUtils.isEmpty(str)) {
        String str4 = str;
        if (str.equals("UNKNOWN")) {
          str4 = "-1";
          bundle.putString("com.google.firebase.auth.LIBRARY_VERSION", str4);
          return bundle;
        } 
        bundle.putString("com.google.firebase.auth.LIBRARY_VERSION", str4);
        return bundle;
      } 
    } else {
      throw null;
    } 
    String str1 = "-1";
    bundle.putString("com.google.firebase.auth.LIBRARY_VERSION", str1);
    return bundle;
  }
  
  public final String t() {
    return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
  }
  
  public final String u() {
    return "com.google.firebase.auth.api.gms.service.START";
  }
  
  public final String v() {
    if (this.y.b) {
      a a2 = z;
      Log.i(a2.a, a2.a("Preparing to create service connection to fallback implementation", new Object[0]));
      return this.x.getPackageName();
    } 
    a a1 = z;
    Log.i(a1.a, a1.a("Preparing to create service connection to gms implementation", new Object[0]));
    return "com.google.android.gms";
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\c0\a\k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */