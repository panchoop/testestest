package c.a.b.w;

import android.util.Log;
import c.a.b.o;
import c.a.b.q;
import c.a.b.v;
import java.io.UnsupportedEncodingException;

public abstract class h<T> extends o<T> {
  public static final String t = String.format("application/json; charset=%s", new Object[] { "utf-8" });
  
  public final Object q = new Object();
  
  public q.b<T> r;
  
  public final String s;
  
  public h(int paramInt, String paramString1, String paramString2, q.b<T> paramb, q.a parama) {
    super(paramInt, paramString1, parama);
    this.r = paramb;
    this.s = paramString2;
  }
  
  public void b(T paramT) {
    synchronized (this.q) {
      q.b<T> b1 = this.r;
      if (b1 != null)
        b1.a(paramT); 
      return;
    } 
  }
  
  public byte[] d() {
    byte[] arrayOfByte = null;
    try {
      if (this.s != null)
        arrayOfByte = this.s.getBytes("utf-8"); 
      return arrayOfByte;
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      Log.wtf("Volley", v.a("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] { this.s, "utf-8" }));
      return null;
    } 
  }
  
  public String e() {
    return t;
  }
  
  @Deprecated
  public byte[] h() {
    return d();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\a\b\w\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */