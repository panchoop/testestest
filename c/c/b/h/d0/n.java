package c.c.b.h.d0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.util.Base64;
import c.c.a.a.f.c.n1;
import com.google.android.gms.common.api.Status;

public final class n {
  public static final c.c.a.a.f.c.n<String> a = c.c.a.a.f.c.n.g("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");
  
  public static final n b = new n();
  
  public static void a(Context paramContext, Status paramStatus) {
    SharedPreferences.Editor editor = paramContext.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
    editor.putInt("statusCode", paramStatus.c);
    editor.putString("statusMessage", paramStatus.d);
    editor.putLong("timestamp", System.currentTimeMillis());
    editor.commit();
  }
  
  public static void b(Context paramContext, n1 paramn1, String paramString1, String paramString2) {
    String str;
    SharedPreferences.Editor editor = paramContext.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
    Parcel parcel = Parcel.obtain();
    paramn1.writeToParcel(parcel, 0);
    byte[] arrayOfByte = parcel.marshall();
    parcel.recycle();
    if (arrayOfByte == null) {
      parcel = null;
    } else {
      str = Base64.encodeToString(arrayOfByte, 10);
    } 
    editor.putString("verifyAssertionRequest", str);
    editor.putString("operation", paramString1);
    editor.putString("tenantId", paramString2);
    editor.putLong("timestamp", System.currentTimeMillis());
    editor.commit();
  }
  
  public static void c(SharedPreferences paramSharedPreferences) {
    SharedPreferences.Editor editor = paramSharedPreferences.edit();
    c.c.a.a.f.c.n<String> n1 = a;
    int i = n1.size();
    byte b = 0;
    while (b < i) {
      paramSharedPreferences = (SharedPreferences)n1.get(b);
      b++;
      editor.remove((String)paramSharedPreferences);
    } 
    editor.commit();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */