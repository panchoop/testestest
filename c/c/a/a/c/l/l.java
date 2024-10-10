package c.c.a.a.c.l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import c.c.a.a.f.b.b;
import c.c.a.a.f.b.c;

public interface l extends IInterface {
  public static abstract class a extends b implements l {
    public a() {
      super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
    
    public final boolean c(int param1Int1, Parcel param1Parcel1, Parcel param1Parcel2, int param1Int2) {
      Bundle bundle;
      if (param1Int1 != 1) {
        a0 a0;
        if (param1Int1 != 2) {
          if (param1Int1 != 3)
            return false; 
          param1Int1 = param1Parcel1.readInt();
          IBinder iBinder = param1Parcel1.readStrongBinder();
          a0 = (a0)c.a(param1Parcel1, a0.CREATOR);
          b.i i = (b.i)this;
          q.g(i.a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
          q.f(a0);
          i.a.s = a0;
          i.t(param1Int1, iBinder, a0.b);
        } else {
          a0.readInt();
          bundle = (Bundle)c.a((Parcel)a0, Bundle.CREATOR);
          Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } 
      } else {
        param1Int1 = bundle.readInt();
        IBinder iBinder = bundle.readStrongBinder();
        bundle = (Bundle)c.a((Parcel)bundle, Bundle.CREATOR);
        ((b.i)this).t(param1Int1, iBinder, bundle);
      } 
      param1Parcel2.writeNoException();
      return true;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */