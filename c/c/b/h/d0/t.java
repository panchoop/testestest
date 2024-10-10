package c.c.b.h.d0;

import android.content.Intent;
import android.os.Parcel;
import c.c.a.a.c.l.q;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;

public final class t {
  public static final Map<String, String> a;
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    a = (Map)hashMap;
    hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
    a.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
    a.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
    a.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
    a.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
  }
  
  public static void a(Intent paramIntent, Status paramStatus) {
    Parcel parcel = Parcel.obtain();
    paramStatus.writeToParcel(parcel, 0);
    byte[] arrayOfByte = parcel.marshall();
    parcel.recycle();
    paramIntent.putExtra("com.google.firebase.auth.internal.STATUS", arrayOfByte);
  }
  
  public static boolean b(Intent paramIntent) {
    q.f(paramIntent);
    return paramIntent.hasExtra("com.google.firebase.auth.internal.STATUS");
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */