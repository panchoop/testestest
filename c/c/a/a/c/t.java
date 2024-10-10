package c.c.a.a.c;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c.c.a.a.c.l.h0;
import c.c.a.a.c.l.q;
import c.c.a.a.d.a;
import c.c.a.a.d.b;
import c.c.a.a.f.b.b;
import c.c.a.a.f.b.c;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class t extends b implements h0 {
  public int a;
  
  public t(byte[] paramArrayOfbyte) {
    super("com.google.android.gms.common.internal.ICertData");
    boolean bool;
    if (paramArrayOfbyte.length == 25) {
      bool = true;
    } else {
      bool = false;
    } 
    q.b(bool);
    this.a = Arrays.hashCode(paramArrayOfbyte);
  }
  
  public static byte[] y(String paramString) {
    try {
      return paramString.getBytes("ISO-8859-1");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new AssertionError(unsupportedEncodingException);
    } 
  }
  
  public final a b() {
    return (a)new b(t());
  }
  
  public final boolean c(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    boolean bool = true;
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        bool = false;
      } else {
        paramInt1 = super.w();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
      } 
    } else {
      a a = super.b();
      paramParcel2.writeNoException();
      c.b(paramParcel2, (IInterface)a);
    } 
    return bool;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject != null && paramObject instanceof h0)
      try {
        paramObject = paramObject;
        if (paramObject.w() != this.a)
          return false; 
        paramObject = paramObject.b();
        if (paramObject == null)
          return false; 
        paramObject = b.t((a)paramObject);
        return Arrays.equals(t(), (byte[])paramObject);
      } catch (RemoteException remoteException) {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)remoteException);
      }  
    return false;
  }
  
  public int hashCode() {
    return this.a;
  }
  
  public abstract byte[] t();
  
  public final int w() {
    return this.a;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */