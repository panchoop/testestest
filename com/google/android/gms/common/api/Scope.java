package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.k.l;
import c.c.a.a.c.l.q;
import c.c.a.a.c.l.u.a;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends a implements ReflectedParcelable {
  public static final Parcelable.Creator<Scope> CREATOR = (Parcelable.Creator<Scope>)new l();
  
  public final int b;
  
  public final String c;
  
  public Scope(int paramInt, String paramString) {
    q.e(paramString, "scopeUri must not be null or empty");
    this.b = paramInt;
    this.c = paramString;
  }
  
  public Scope(String paramString) {
    q.e(paramString, "scopeUri must not be null or empty");
    this.b = 1;
    this.c = paramString;
  }
  
  public final boolean equals(Object paramObject) {
    return (this == paramObject) ? true : (!(paramObject instanceof Scope) ? false : this.c.equals(((Scope)paramObject).c));
  }
  
  public final int hashCode() {
    return this.c.hashCode();
  }
  
  public final String toString() {
    return this.c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = q.a(paramParcel);
    q.d0(paramParcel, 1, this.b);
    q.h0(paramParcel, 2, this.c, false);
    q.C0(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\gms\common\api\Scope.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */