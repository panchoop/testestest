package b.l.a;

import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.util.ArrayList;

public final class a extends r implements k.h {
  public final k r;
  
  public boolean s;
  
  public int t = -1;
  
  public a(k paramk) {
    this.r = paramk;
  }
  
  public static boolean o(r.a parama) {
    Fragment fragment = parama.b;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (fragment != null) {
      bool1 = bool2;
      if (fragment.l) {
        bool1 = bool2;
        if (fragment.G != null) {
          bool1 = bool2;
          if (!fragment.A) {
            bool1 = bool2;
            if (!fragment.z) {
              boolean bool;
              Fragment.b b = fragment.K;
              if (b == null) {
                bool = false;
              } else {
                bool = b.q;
              } 
              bool1 = bool2;
              if (bool)
                bool1 = true; 
            } 
          } 
        } 
      } 
    } 
    return bool1;
  }
  
  public boolean a(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1) {
    boolean bool = k.H;
    paramArrayList.add(this);
    paramArrayList1.add(Boolean.FALSE);
    if (this.h) {
      k k1 = this.r;
      if (k1.i == null)
        k1.i = new ArrayList<a>(); 
      k1.i.add(this);
    } 
    return true;
  }
  
  public int e() {
    return i(true);
  }
  
  public r f(Fragment paramFragment) {
    k k1 = paramFragment.s;
    if (k1 == null || k1 == this.r) {
      c(new r.a(6, paramFragment));
      return this;
    } 
    StringBuilder stringBuilder = c.a.a.a.a.e("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
    stringBuilder.append(paramFragment.toString());
    stringBuilder.append(" is already attached to a FragmentManager.");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public void g(int paramInt1, Fragment paramFragment, String paramString, int paramInt2) {
    super.g(paramInt1, paramFragment, paramString, paramInt2);
    paramFragment.s = this.r;
  }
  
  public void h(int paramInt) {
    if (!this.h)
      return; 
    boolean bool = k.H;
    int i = this.a.size();
    for (byte b = 0; b < i; b++) {
      Fragment fragment = ((r.a)this.a.get(b)).b;
      if (fragment != null) {
        fragment.r += paramInt;
        bool = k.H;
      } 
    } 
  }
  
  public int i(boolean paramBoolean) {
    if (!this.s) {
      boolean bool = k.H;
      this.s = true;
      bool = this.h;
      int i = -1;
      if (bool)
        synchronized (this.r) {
          if (null.n == null || null.n.size() <= 0) {
            if (null.m == null) {
              ArrayList<a> arrayList = new ArrayList();
              this();
              null.m = arrayList;
            } 
            i = null.m.size();
            null.m.add(this);
          } else {
            i = ((Integer)null.n.remove(null.n.size() - 1)).intValue();
            null.m.set(i, this);
          } 
        }  
      this.t = i;
      this.r.N(this, paramBoolean);
      return this.t;
    } 
    throw new IllegalStateException("commit already called");
  }
  
  public void j(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean) {
    if (paramBoolean) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(this.i);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(this.t);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(this.s);
      if (this.f != 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(this.f));
        paramPrintWriter.print(" mTransitionStyle=#");
        paramPrintWriter.println(Integer.toHexString(this.g));
      } 
      if (this.b != 0 || this.c != 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.b));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.c));
      } 
      if (this.d != 0 || this.e != 0) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.d));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.e));
      } 
      if (this.j != 0 || this.k != null) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.j));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.k);
      } 
      if (this.l != 0 || this.m != null) {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.l));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(this.m);
      } 
    } 
    if (!this.a.isEmpty()) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      int i = this.a.size();
      for (byte b = 0; b < i; b++) {
        StringBuilder stringBuilder;
        String str;
        r.a a1 = this.a.get(b);
        switch (a1.a) {
          default:
            stringBuilder = c.a.a.a.a.e("cmd=");
            stringBuilder.append(a1.a);
            str = stringBuilder.toString();
            break;
          case 10:
            str = "OP_SET_MAX_LIFECYCLE";
            break;
          case 9:
            str = "UNSET_PRIMARY_NAV";
            break;
          case 8:
            str = "SET_PRIMARY_NAV";
            break;
          case 7:
            str = "ATTACH";
            break;
          case 6:
            str = "DETACH";
            break;
          case 5:
            str = "SHOW";
            break;
          case 4:
            str = "HIDE";
            break;
          case 3:
            str = "REMOVE";
            break;
          case 2:
            str = "REPLACE";
            break;
          case 1:
            str = "ADD";
            break;
          case 0:
            str = "NULL";
            break;
        } 
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  Op #");
        paramPrintWriter.print(b);
        paramPrintWriter.print(": ");
        paramPrintWriter.print(str);
        paramPrintWriter.print(" ");
        paramPrintWriter.println(a1.b);
        if (paramBoolean) {
          if (a1.c != 0 || a1.d != 0) {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("enterAnim=#");
            paramPrintWriter.print(Integer.toHexString(a1.c));
            paramPrintWriter.print(" exitAnim=#");
            paramPrintWriter.println(Integer.toHexString(a1.d));
          } 
          if (a1.e != 0 || a1.f != 0) {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("popEnterAnim=#");
            paramPrintWriter.print(Integer.toHexString(a1.e));
            paramPrintWriter.print(" popExitAnim=#");
            paramPrintWriter.println(Integer.toHexString(a1.f));
          } 
        } 
      } 
    } 
  }
  
  public void k() {
    int i = this.a.size();
    for (byte b = 0; b < i; b++) {
      StringBuilder stringBuilder;
      r.a a1 = this.a.get(b);
      Fragment fragment = a1.b;
      if (fragment != null) {
        int m = this.f;
        int j = this.g;
        if (fragment.K != null || m != 0 || j != 0) {
          fragment.c();
          Fragment.b b1 = fragment.K;
          b1.e = m;
          b1.f = j;
        } 
      } 
      switch (a1.a) {
        default:
          stringBuilder = c.a.a.a.a.e("Unknown cmd: ");
          stringBuilder.append(a1.a);
          throw new IllegalArgumentException(stringBuilder.toString());
        case 10:
          this.r.o0(fragment, a1.h);
          break;
        case 9:
          this.r.p0(null);
          break;
        case 8:
          this.r.p0(fragment);
          break;
        case 7:
          fragment.V(a1.c);
          this.r.h(fragment);
          break;
        case 6:
          fragment.V(a1.d);
          this.r.l(fragment);
          break;
        case 5:
          fragment.V(a1.c);
          if (this.r != null) {
            if (fragment.z) {
              fragment.z = false;
              fragment.M ^= 0x1;
            } 
            break;
          } 
          throw null;
        case 4:
          fragment.V(a1.d);
          if (this.r != null) {
            if (!fragment.z) {
              fragment.z = true;
              fragment.M ^= 0x1;
            } 
            break;
          } 
          throw null;
        case 3:
          fragment.V(a1.d);
          this.r.g0(fragment);
          break;
        case 1:
          fragment.V(a1.c);
          this.r.f(fragment, false);
          break;
      } 
      if (!this.p && a1.a != 1 && fragment != null)
        this.r.b0(fragment); 
    } 
    if (!this.p) {
      k k1 = this.r;
      k1.c0(k1.p, true);
    } 
  }
  
  public void l(boolean paramBoolean) {
    for (int i = this.a.size() - 1; i >= 0; i--) {
      StringBuilder stringBuilder;
      r.a a1 = this.a.get(i);
      Fragment fragment = a1.b;
      if (fragment != null) {
        int m = k.k0(this.f);
        int j = this.g;
        if (fragment.K != null || m != 0 || j != 0) {
          fragment.c();
          Fragment.b b = fragment.K;
          b.e = m;
          b.f = j;
        } 
      } 
      switch (a1.a) {
        default:
          stringBuilder = c.a.a.a.a.e("Unknown cmd: ");
          stringBuilder.append(a1.a);
          throw new IllegalArgumentException(stringBuilder.toString());
        case 10:
          this.r.o0((Fragment)stringBuilder, a1.g);
          break;
        case 9:
          this.r.p0((Fragment)stringBuilder);
          break;
        case 8:
          this.r.p0(null);
          break;
        case 7:
          stringBuilder.V(a1.f);
          this.r.l((Fragment)stringBuilder);
          break;
        case 6:
          stringBuilder.V(a1.e);
          this.r.h((Fragment)stringBuilder);
          break;
        case 5:
          stringBuilder.V(a1.f);
          if (this.r != null) {
            if (!((Fragment)stringBuilder).z) {
              ((Fragment)stringBuilder).z = true;
              ((Fragment)stringBuilder).M ^= 0x1;
            } 
            break;
          } 
          throw null;
        case 4:
          stringBuilder.V(a1.e);
          if (this.r != null) {
            if (((Fragment)stringBuilder).z) {
              ((Fragment)stringBuilder).z = false;
              ((Fragment)stringBuilder).M ^= 0x1;
            } 
            break;
          } 
          throw null;
        case 3:
          stringBuilder.V(a1.e);
          this.r.f((Fragment)stringBuilder, false);
          break;
        case 1:
          stringBuilder.V(a1.f);
          this.r.g0((Fragment)stringBuilder);
          break;
      } 
      if (!this.p && a1.a != 3 && stringBuilder != null)
        this.r.b0((Fragment)stringBuilder); 
    } 
    if (!this.p && paramBoolean) {
      k k1 = this.r;
      k1.c0(k1.p, true);
    } 
  }
  
  public boolean m(int paramInt) {
    int i = this.a.size();
    for (byte b = 0; b < i; b++) {
      int j;
      Fragment fragment = ((r.a)this.a.get(b)).b;
      if (fragment != null) {
        j = fragment.x;
      } else {
        j = 0;
      } 
      if (j && j == paramInt)
        return true; 
    } 
    return false;
  }
  
  public boolean n(ArrayList<a> paramArrayList, int paramInt1, int paramInt2) {
    if (paramInt2 == paramInt1)
      return false; 
    int j = this.a.size();
    int i = -1;
    byte b = 0;
    while (b < j) {
      int m;
      Fragment fragment = ((r.a)this.a.get(b)).b;
      if (fragment != null) {
        m = fragment.x;
      } else {
        m = 0;
      } 
      int n = i;
      if (m) {
        n = i;
        if (m != i) {
          for (i = paramInt1; i < paramInt2; i++) {
            a a1 = paramArrayList.get(i);
            int i1 = a1.a.size();
            for (n = 0; n < i1; n++) {
              int i2;
              Fragment fragment1 = ((r.a)a1.a.get(n)).b;
              if (fragment1 != null) {
                i2 = fragment1.x;
              } else {
                i2 = 0;
              } 
              if (i2 == m)
                return true; 
            } 
          } 
          n = m;
        } 
      } 
      b++;
      i = n;
    } 
    return false;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("BackStackEntry{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.t >= 0) {
      stringBuilder.append(" #");
      stringBuilder.append(this.t);
    } 
    if (this.i != null) {
      stringBuilder.append(" ");
      stringBuilder.append(this.i);
    } 
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */