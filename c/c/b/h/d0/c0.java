package c.c.b.h.d0;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.c.l.q;
import c.c.a.a.f.c.a1;
import c.c.b.b;
import c.c.b.h.b0;
import c.c.b.h.g0;
import c.c.b.h.o;
import c.c.b.h.s;
import c.c.b.h.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class c0 extends o {
  public static final Parcelable.Creator<c0> CREATOR = new b0();
  
  public a1 b;
  
  public z c;
  
  public String d;
  
  public String e;
  
  public List<z> f;
  
  public List<String> g;
  
  public String h;
  
  public Boolean i;
  
  public e0 j;
  
  public boolean k;
  
  public g0 l;
  
  public m m;
  
  public c0(a1 parama1, z paramz, String paramString1, String paramString2, List<z> paramList, List<String> paramList1, String paramString3, Boolean paramBoolean, e0 parame0, boolean paramBoolean1, g0 paramg0, m paramm) {
    this.b = parama1;
    this.c = paramz;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramList;
    this.g = paramList1;
    this.h = paramString3;
    this.i = paramBoolean;
    this.j = parame0;
    this.k = paramBoolean1;
    this.l = paramg0;
    this.m = paramm;
  }
  
  public c0(b paramb, List<? extends b0> paramList) {
    q.f(paramb);
    paramb.a();
    this.d = paramb.b;
    this.e = "com.google.firebase.auth.internal.DefaultFirebaseUser";
    this.h = "2";
    j(paramList);
  }
  
  public String c() {
    return this.c.c;
  }
  
  public String h() {
    a1 a11 = this.b;
    String str2 = null;
    String str1 = str2;
    if (a11 != null) {
      String str = a11.c;
      str1 = str2;
      if (str != null) {
        Map map = (Map)(i.a(str)).a.get("firebase");
        str1 = str2;
        if (map != null)
          str1 = (String)map.get("tenant"); 
      } 
    } 
    return str1;
  }
  
  public boolean i() {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : Ljava/lang/Boolean;
    //   4: astore #4
    //   6: aload #4
    //   8: ifnull -> 19
    //   11: aload #4
    //   13: invokevirtual booleanValue : ()Z
    //   16: ifeq -> 134
    //   19: aload_0
    //   20: getfield b : Lc/c/a/a/f/c/a1;
    //   23: astore #4
    //   25: aload #4
    //   27: ifnull -> 81
    //   30: aload #4
    //   32: getfield c : Ljava/lang/String;
    //   35: invokestatic a : (Ljava/lang/String;)Lc/c/b/h/p;
    //   38: getfield a : Ljava/util/Map;
    //   41: ldc 'firebase'
    //   43: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   48: checkcast java/util/Map
    //   51: astore #4
    //   53: aload #4
    //   55: ifnull -> 75
    //   58: aload #4
    //   60: ldc 'sign_in_provider'
    //   62: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   67: checkcast java/lang/String
    //   70: astore #4
    //   72: goto -> 85
    //   75: aconst_null
    //   76: astore #4
    //   78: goto -> 85
    //   81: ldc ''
    //   83: astore #4
    //   85: aload_0
    //   86: getfield f : Ljava/util/List;
    //   89: invokeinterface size : ()I
    //   94: istore_1
    //   95: iconst_1
    //   96: istore_3
    //   97: iload_1
    //   98: iconst_1
    //   99: if_icmpgt -> 124
    //   102: iload_3
    //   103: istore_2
    //   104: aload #4
    //   106: ifnull -> 126
    //   109: aload #4
    //   111: ldc 'custom'
    //   113: invokevirtual equals : (Ljava/lang/Object;)Z
    //   116: ifne -> 124
    //   119: iload_3
    //   120: istore_2
    //   121: goto -> 126
    //   124: iconst_0
    //   125: istore_2
    //   126: aload_0
    //   127: iload_2
    //   128: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   131: putfield i : Ljava/lang/Boolean;
    //   134: aload_0
    //   135: getfield i : Ljava/lang/Boolean;
    //   138: invokevirtual booleanValue : ()Z
    //   141: ireturn
  }
  
  public final o j(List<? extends b0> paramList) {
    q.f(paramList);
    this.f = new ArrayList<z>(paramList.size());
    this.g = new ArrayList<String>(paramList.size());
    for (byte b = 0; b < paramList.size(); b++) {
      b0 b0 = paramList.get(b);
      if (b0.c().equals("firebase")) {
        this.c = (z)b0;
      } else {
        this.g.add(b0.c());
      } 
      this.f.add((z)b0);
    } 
    if (this.c == null)
      this.c = this.f.get(0); 
    return this;
  }
  
  public final void k(a1 parama1) {
    q.f(parama1);
    this.b = parama1;
  }
  
  public final void l(List<s> paramList) {
    m m1;
    if (paramList == null || paramList.isEmpty()) {
      paramList = null;
    } else {
      ArrayList<y> arrayList = new ArrayList();
      for (s s : paramList) {
        if (s instanceof y)
          arrayList.add((y)s); 
      } 
      m1 = new m(arrayList);
    } 
    this.m = m1;
  }
  
  public final String m() {
    return this.b.i();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = q.a(paramParcel);
    q.g0(paramParcel, 1, (Parcelable)this.b, paramInt, false);
    q.g0(paramParcel, 2, (Parcelable)this.c, paramInt, false);
    q.h0(paramParcel, 3, this.d, false);
    q.h0(paramParcel, 4, this.e, false);
    q.k0(paramParcel, 5, this.f, false);
    q.i0(paramParcel, 6, this.g, false);
    q.h0(paramParcel, 7, this.h, false);
    Boolean bool = Boolean.valueOf(i());
    if (bool != null) {
      q.D0(paramParcel, 8, 4);
      paramParcel.writeInt(bool.booleanValue());
    } 
    q.g0(paramParcel, 9, (Parcelable)this.j, paramInt, false);
    q.c0(paramParcel, 10, this.k);
    q.g0(paramParcel, 11, (Parcelable)this.l, paramInt, false);
    q.g0(paramParcel, 12, (Parcelable)this.m, paramInt, false);
    q.C0(paramParcel, i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\d0\c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */