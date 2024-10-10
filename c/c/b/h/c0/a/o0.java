package c.c.b.h.c0.a;

import android.os.Parcel;
import c.a.a.a.a;
import c.c.a.a.c.l.q;
import c.c.a.a.f.c.a;
import c.c.a.a.f.c.a1;
import c.c.a.a.f.c.i0;
import c.c.a.a.f.c.i1;
import c.c.a.a.f.c.t0;
import c.c.a.a.f.c.v0;
import c.c.a.a.f.c.x0;
import c.c.a.a.f.c.z0;
import c.c.b.h.b;
import c.c.b.h.d0.f;
import c.c.b.h.w;
import com.google.android.gms.common.api.Status;

public abstract class o0 extends a implements n0 {
  public o0() {
    super("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
  }
  
  public final boolean c(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    u0 u01;
    t0 t0;
    w0 w03;
    w w1;
    w0 w02;
    String str1;
    w0 w01;
    Status status1;
    a1 a1;
    i1 i1;
    x0 x0;
    z0 z0;
    v0 v01;
    Status status3;
    u0 u07;
    x0 x01;
    w w2;
    y0 y0;
    String str2;
    v0 v0;
    w0 w07;
    u0 u06;
    Status status2;
    u0 u05;
    w0 w06;
    u0 u04;
    w0 w05;
    u0 u03;
    a1 a12;
    w0 w09;
    String str3;
    w0 w08;
    u0 u08;
    String str4;
    boolean bool12 = false;
    boolean bool9 = false;
    boolean bool8 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    boolean bool10 = false;
    boolean bool3 = false;
    boolean bool2 = false;
    boolean bool7 = false;
    boolean bool11 = false;
    boolean bool1 = false;
    switch (paramInt1) {
      default:
        return false;
      case 15:
        v01 = (v0)i0.a(paramParcel1, v0.CREATOR);
        u01 = ((w0)this).a;
        u01.s = v01;
        status3 = q.p0("REQUIRES_SECOND_FACTOR_AUTH");
        u01.v = true;
        u01.g.a(null, status3);
        return true;
      case 14:
        t0 = (t0)i0.a((Parcel)u01, t0.CREATOR);
        ((w0)this).t(t0.b, (b)t0.c, t0.d, t0.e);
        return true;
      case 13:
        w03 = (w0)this;
        if (w03.a.a == 9)
          bool1 = true; 
        a.f(36, "Unexpected response type ", w03.a.a, bool1);
        u0.g(w03.a);
        return true;
      case 12:
        status3 = (Status)i0.a((Parcel)w03, Status.CREATOR);
        w1 = (w)i0.a((Parcel)w03, w.CREATOR);
        w09 = (w0)this;
        bool1 = bool12;
        if (w09.a.a == 2)
          bool1 = true; 
        a.f(36, "Unexpected response type ", w09.a.a, bool1);
        w09.t(status3, (b)w1, null, null);
        return true;
      case 11:
        str3 = w1.readString();
        w02 = (w0)this;
        bool1 = bool9;
        if (w02.a.a == 8)
          bool1 = true; 
        a.f(36, "Unexpected response type ", w02.a.a, bool1);
        u07 = w02.a;
        u07.o = str3;
        u07.v = true;
        x01 = new x0(str3);
        w02.a.i.execute(new z0(w02, x01));
        return true;
      case 10:
        w2 = (w)i0.a((Parcel)w02, w.CREATOR);
        w02 = (w0)this;
        bool1 = bool8;
        if (w02.a.a == 8)
          bool1 = true; 
        a.f(36, "Unexpected response type ", w02.a.a, bool1);
        w02.a.v = true;
        y0 = new y0(w2);
        w02.a.i.execute(new z0(w02, y0));
        return true;
      case 9:
        str2 = w02.readString();
        w02 = (w0)this;
        bool1 = bool4;
        if (w02.a.a == 8)
          bool1 = true; 
        a.f(36, "Unexpected response type ", w02.a.a, bool1);
        w02.a.o = str2;
        v0 = new v0(str2);
        w02.a.i.execute(new z0(w02, v0));
        return true;
      case 8:
        str1 = w02.readString();
        w07 = (w0)this;
        bool1 = bool5;
        if (w07.a.a == 7)
          bool1 = true; 
        a.f(36, "Unexpected response type ", w07.a.a, bool1);
        u06 = w07.a;
        u06.n = str1;
        u0.g(u06);
        return true;
      case 7:
        w01 = (w0)this;
        bool1 = bool6;
        if (w01.a.a == 6)
          bool1 = true; 
        a.f(36, "Unexpected response type ", w01.a.a, bool1);
        u0.g(w01.a);
        return true;
      case 6:
        w01 = (w0)this;
        bool1 = bool10;
        if (w01.a.a == 5)
          bool1 = true; 
        a.f(36, "Unexpected response type ", w01.a.a, bool1);
        u0.g(w01.a);
        return true;
      case 5:
        status2 = (Status)i0.a((Parcel)w01, Status.CREATOR);
        w08 = (w0)this;
        str4 = status2.d;
        status1 = status2;
        if (str4 != null)
          if (str4.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
            status1 = new Status(17081, null);
          } else if (str4.contains("MISSING_MFA_ENROLLMENT_ID")) {
            status1 = new Status(17082, null);
          } else if (str4.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
            status1 = new Status(17083, null);
          } else if (str4.contains("MFA_ENROLLMENT_NOT_FOUND")) {
            status1 = new Status(17084, null);
          } else if (str4.contains("ADMIN_ONLY_OPERATION")) {
            status1 = new Status(17085, null);
          } else if (str4.contains("UNVERIFIED_EMAIL")) {
            status1 = new Status(17086, null);
          } else if (str4.contains("SECOND_FACTOR_EXISTS")) {
            status1 = new Status(17087, null);
          } else if (str4.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
            status1 = new Status(17088, null);
          } else if (str4.contains("UNSUPPORTED_FIRST_FACTOR")) {
            status1 = new Status(17089, null);
          } else {
            status1 = status2;
            if (str4.contains("EMAIL_CHANGE_NEEDS_VERIFICATION"))
              status1 = new Status(17090, null); 
          }  
        u05 = w08.a;
        if (u05.a == 8) {
          u05.v = true;
          a1 = new a1(status1);
          w08.a.i.execute(new z0(w08, a1));
        } else {
          f f = u05.f;
          if (f != null)
            f.b((Status)a1); 
          u0 u0 = w08.a;
          u0.v = true;
          u0.g.a(null, (Status)a1);
        } 
        return true;
      case 4:
        i1 = (i1)i0.a((Parcel)a1, i1.CREATOR);
        w06 = (w0)this;
        bool1 = bool3;
        if (w06.a.a == 4)
          bool1 = true; 
        a.f(36, "Unexpected response type ", w06.a.a, bool1);
        u04 = w06.a;
        u04.m = i1;
        u0.g(u04);
        return true;
      case 3:
        x0 = (x0)i0.a((Parcel)i1, x0.CREATOR);
        w05 = (w0)this;
        bool1 = bool2;
        if (w05.a.a == 3)
          bool1 = true; 
        a.f(36, "Unexpected response type ", w05.a.a, bool1);
        u03 = w05.a;
        u03.l = x0;
        u0.g(u03);
        return true;
      case 2:
        a12 = (a1)i0.a((Parcel)x0, a1.CREATOR);
        z0 = (z0)i0.a((Parcel)x0, z0.CREATOR);
        w08 = (w0)this;
        bool1 = bool7;
        if (w08.a.a == 2)
          bool1 = true; 
        a.f(37, "Unexpected response type: ", w08.a.a, bool1);
        u08 = w08.a;
        u08.j = a12;
        u08.k = z0;
        u0.g(u08);
        return true;
      case 1:
        break;
    } 
    a1 a11 = (a1)i0.a((Parcel)z0, a1.CREATOR);
    w0 w04 = (w0)this;
    bool1 = bool11;
    if (w04.a.a == 1)
      bool1 = true; 
    a.f(37, "Unexpected response type: ", w04.a.a, bool1);
    u0 u02 = w04.a;
    u02.j = a11;
    u0.g(u02);
    return true;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\c0\a\o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */