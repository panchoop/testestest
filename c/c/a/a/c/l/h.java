package c.c.a.a.c.l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Message;
import java.util.Arrays;

public abstract class h {
  public static final Object a = new Object();
  
  public static h b;
  
  public final void a(String paramString1, String paramString2, int paramInt, ServiceConnection paramServiceConnection, String paramString3) {
    null = new a(paramString1, paramString2, paramInt);
    d0 d0 = (d0)this;
    q.g(paramServiceConnection, "ServiceConnection must not be null");
    synchronized (d0.c) {
      e0 e0 = d0.c.get(null);
      if (e0 != null) {
        Message message;
        if (e0.a.contains(paramServiceConnection)) {
          c.c.a.a.c.n.a a = e0.g.f;
          e0.a.remove(paramServiceConnection);
          if (e0.a.isEmpty()) {
            message = d0.e.obtainMessage(0, null);
            d0.e.sendMessageDelayed(message, d0.g);
          } 
          return;
        } 
        IllegalStateException illegalStateException1 = new IllegalStateException();
        str = String.valueOf(message);
        paramInt = str.length();
        StringBuilder stringBuilder1 = new StringBuilder();
        this(paramInt + 76);
        stringBuilder1.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
        stringBuilder1.append(str);
        this(stringBuilder1.toString());
        throw illegalStateException1;
      } 
      IllegalStateException illegalStateException = new IllegalStateException();
      String str = String.valueOf(str);
      paramInt = str.length();
      StringBuilder stringBuilder = new StringBuilder();
      this(paramInt + 50);
      stringBuilder.append("Nonexistent connection status for service config: ");
      stringBuilder.append(str);
      this(stringBuilder.toString());
      throw illegalStateException;
    } 
  }
  
  public abstract boolean b(a parama, ServiceConnection paramServiceConnection, String paramString);
  
  public static final class a {
    public final String a;
    
    public final String b;
    
    public final ComponentName c;
    
    public final int d;
    
    public a(String param1String1, String param1String2, int param1Int) {
      q.d(param1String1);
      this.a = param1String1;
      q.d(param1String2);
      this.b = param1String2;
      this.c = null;
      this.d = param1Int;
    }
    
    public final Intent a() {
      Intent intent;
      if (this.a != null) {
        intent = (new Intent(this.a)).setPackage(this.b);
      } else {
        intent = (new Intent()).setComponent(this.c);
      } 
      return intent;
    }
    
    public final boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof a))
        return false; 
      param1Object = param1Object;
      return (a.a.a.a.a.y(this.a, ((a)param1Object).a) && a.a.a.a.a.y(this.b, ((a)param1Object).b) && a.a.a.a.a.y(this.c, ((a)param1Object).c) && this.d == ((a)param1Object).d);
    }
    
    public final int hashCode() {
      return Arrays.hashCode(new Object[] { this.a, this.b, this.c, Integer.valueOf(this.d) });
    }
    
    public final String toString() {
      String str2 = this.a;
      String str1 = str2;
      if (str2 == null)
        str1 = this.c.flattenToString(); 
      return str1;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */