package c.c.a.a.g.b;

import android.os.Parcel;
import c.c.a.a.c.a;
import c.c.a.a.c.k.k.b0;
import c.c.a.a.c.k.k.z;
import c.c.a.a.f.a.a;
import c.c.a.a.f.a.b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class g extends a implements d {
  public g() {
    super("com.google.android.gms.signin.internal.ISignInCallbacks");
  }
  
  public boolean C(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    Status status;
    if (paramInt1 != 3) {
      GoogleSignInAccount googleSignInAccount;
      if (paramInt1 != 4 && paramInt1 != 6) {
        l l;
        if (paramInt1 != 7) {
          if (paramInt1 != 8)
            return false; 
          l = (l)b.a(paramParcel1, l.CREATOR);
          z z = (z)this;
          z.b.post((Runnable)new b0(z, l));
        } else {
          Status status1 = (Status)b.a((Parcel)l, Status.CREATOR);
          googleSignInAccount = (GoogleSignInAccount)b.a((Parcel)l, GoogleSignInAccount.CREATOR);
        } 
      } else {
        status = (Status)b.a((Parcel)googleSignInAccount, Status.CREATOR);
      } 
    } else {
      a a1 = (a)b.a((Parcel)status, a.CREATOR);
      c c = (c)b.a((Parcel)status, c.CREATOR);
    } 
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\g\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */