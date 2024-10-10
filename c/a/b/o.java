package c.a.b;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class o<T> implements Comparable<o<T>> {
  public final v.a b;
  
  public final int c;
  
  public final String d;
  
  public final int e;
  
  public final Object f;
  
  public q.a g;
  
  public Integer h;
  
  public p i;
  
  public boolean j;
  
  public boolean k;
  
  public boolean l;
  
  public boolean m;
  
  public f n;
  
  public b.a o;
  
  public b p;
  
  public o(int paramInt, String paramString, q.a parama) {
    v.a a1;
    if (v.a.c) {
      a1 = new v.a();
    } else {
      a1 = null;
    } 
    this.b = a1;
    this.f = new Object();
    this.j = true;
    boolean bool = false;
    this.k = false;
    this.l = false;
    this.m = false;
    this.o = null;
    this.c = paramInt;
    this.d = paramString;
    this.g = parama;
    this.n = new f();
    paramInt = bool;
    if (!TextUtils.isEmpty(paramString)) {
      Uri uri = Uri.parse(paramString);
      paramInt = bool;
      if (uri != null) {
        String str = uri.getHost();
        paramInt = bool;
        if (str != null)
          paramInt = str.hashCode(); 
      } 
    } 
    this.e = paramInt;
  }
  
  public void a(String paramString) {
    if (v.a.c)
      this.b.a(paramString, Thread.currentThread().getId()); 
  }
  
  public abstract void b(T paramT);
  
  public void c(String paramString) {
    p p1 = this.i;
    if (p1 != null)
      synchronized (p1.b) {
        p1.b.remove(this);
        synchronized (p1.j) {
          Iterator<p.a> iterator = p1.j.iterator();
          while (iterator.hasNext())
            ((p.a)iterator.next()).a(this); 
        } 
      }  
    if (v.a.c) {
      long l = Thread.currentThread().getId();
      if (Looper.myLooper() != Looper.getMainLooper()) {
        (new Handler(Looper.getMainLooper())).post(new a(this, paramString, l));
        return;
      } 
      this.b.a(paramString, l);
      this.b.b(toString());
    } 
  }
  
  public int compareTo(Object paramObject) {
    paramObject = paramObject;
    if (paramObject != null)
      return this.h.intValue() - ((o)paramObject).h.intValue(); 
    throw null;
  }
  
  public byte[] d() {
    return null;
  }
  
  public String e() {
    return c.a.a.a.a.c("application/x-www-form-urlencoded; charset=", "UTF-8");
  }
  
  public String f() {
    String str2 = this.d;
    int i = this.c;
    String str1 = str2;
    if (i != 0)
      if (i == -1) {
        str1 = str2;
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(i));
        stringBuilder.append('-');
        stringBuilder.append(str2);
        str1 = stringBuilder.toString();
      }  
    return str1;
  }
  
  public Map<String, String> g() {
    return Collections.emptyMap();
  }
  
  @Deprecated
  public byte[] h() {
    return null;
  }
  
  public boolean i() {
    synchronized (this.f) {
      return this.k;
    } 
  }
  
  public void j() {
    synchronized (this.f) {
      b b1 = this.p;
      if (b1 != null)
        ((d.a)b1).b(this); 
      return;
    } 
  }
  
  public void k(q<?> paramq) {
    synchronized (this.f) {
      b b1 = this.p;
      if (b1 != null) {
        null = b1;
        b.a a1 = paramq.b;
        if (a1 != null) {
          boolean bool;
          if (a1.e < System.currentTimeMillis()) {
            bool = true;
          } else {
            bool = false;
          } 
          if (bool) {
            null.b(this);
            return;
          } 
          synchronized (f()) {
            List list = ((d.a)null).a.remove(null);
            if (list != null) {
              if (v.a)
                v.d("Releasing %d waiting requests for cacheKey=%s.", new Object[] { Integer.valueOf(list.size()), null }); 
              for (o<?> o1 : (Iterable<o<?>>)list)
                ((g)((d.a)null).b.e).a(o1, paramq, null); 
            } 
          } 
          return;
        } 
      } else {
        return;
      } 
      null.b(this);
      return;
    } 
  }
  
  public abstract q<T> l(l paraml);
  
  public String toString() {
    String str1;
    StringBuilder stringBuilder1 = c.a.a.a.a.e("0x");
    stringBuilder1.append(Integer.toHexString(this.e));
    String str2 = stringBuilder1.toString();
    StringBuilder stringBuilder2 = new StringBuilder();
    if (i()) {
      str1 = "[X] ";
    } else {
      str1 = "[ ] ";
    } 
    stringBuilder2.append(str1);
    stringBuilder2.append(this.d);
    stringBuilder2.append(" ");
    stringBuilder2.append(str2);
    stringBuilder2.append(" ");
    stringBuilder2.append(c.c);
    stringBuilder2.append(" ");
    stringBuilder2.append(this.h);
    return stringBuilder2.toString();
  }
  
  public class a implements Runnable {
    public final String b;
    
    public final long c;
    
    public final o d;
    
    public a(o this$0, String param1String, long param1Long) {}
    
    public void run() {
      this.d.b.a(this.b, this.c);
      o o1 = this.d;
      o1.b.b(o1.toString());
    }
  }
  
  public static interface b {}
  
  public enum c {
    b, c, d, e;
    
    public static final c[] f;
    
    static {
      c c1 = new c("IMMEDIATE", 3);
      e = c1;
      f = new c[] { b, c, d, c1 };
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */