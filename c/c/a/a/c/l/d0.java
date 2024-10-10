package c.c.a.a.c.l;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import c.c.a.a.c.n.a;
import c.c.a.a.f.b.d;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

public final class d0 extends h implements Handler.Callback {
  @GuardedBy("mConnectionStatus")
  public final HashMap<h.a, e0> c = new HashMap<h.a, e0>();
  
  public final Context d;
  
  public final Handler e;
  
  public final a f;
  
  public final long g;
  
  public final long h;
  
  public d0(Context paramContext) {
    this.d = paramContext.getApplicationContext();
    this.e = (Handler)new d(paramContext.getMainLooper(), this);
    if (a.b == null)
      synchronized (a.a) {
        if (a.b == null) {
          a a1 = new a();
          this();
          a.b = a1;
        } 
      }  
    this.f = a.b;
    this.g = 5000L;
    this.h = 300000L;
  }
  
  public final boolean b(h.a parama, ServiceConnection paramServiceConnection, String paramString) {
    q.g(paramServiceConnection, "ServiceConnection must not be null");
    synchronized (this.c) {
      e0 e01;
      String str;
      e0 e02 = this.c.get(parama);
      if (e02 == null) {
        e02 = new e0();
        this(this, parama);
        a a1 = e02.g.f;
        e02.e.a();
        e02.a.add(paramServiceConnection);
        e02.a(paramString);
        this.c.put(parama, e02);
        e01 = e02;
      } else {
        e0 e0;
        this.e.removeMessages(0, e01);
        if (!e02.a.contains(paramServiceConnection)) {
          a a1 = e02.g.f;
          e02.e.a();
          e02.a.add(paramServiceConnection);
          int j = e02.b;
          if (j != 1) {
            if (j != 2) {
              e0 = e02;
            } else {
              e02.a(paramString);
              e0 = e02;
            } 
          } else {
            paramServiceConnection.onServiceConnected(e02.f, e02.d);
            e0 = e02;
          } 
          return e0.c;
        } 
        IllegalStateException illegalStateException = new IllegalStateException();
        str = String.valueOf(e0);
        int i = str.length();
        StringBuilder stringBuilder = new StringBuilder();
        this(i + 81);
        stringBuilder.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
        stringBuilder.append(str);
        this(stringBuilder.toString());
        throw illegalStateException;
      } 
      return ((e0)str).c;
    } 
  }
  
  public final boolean handleMessage(Message paramMessage) {
    int i = paramMessage.what;
    if (i != 0) {
      if (i != 1)
        return false; 
      synchronized (this.c) {
        h.a a1 = (h.a)paramMessage.obj;
        e0 e0 = this.c.get(a1);
        if (e0 != null && e0.b == 3) {
          String str2 = String.valueOf(a1);
          i = str2.length();
          StringBuilder stringBuilder = new StringBuilder();
          this(i + 47);
          stringBuilder.append("Timeout waiting for ServiceConnection callback ");
          stringBuilder.append(str2);
          String str1 = stringBuilder.toString();
          Exception exception = new Exception();
          this();
          Log.e("GmsClientSupervisor", str1, exception);
          ComponentName componentName2 = e0.f;
          ComponentName componentName1 = componentName2;
          if (componentName2 == null)
            componentName1 = a1.c; 
          componentName2 = componentName1;
          if (componentName1 == null) {
            componentName2 = new ComponentName();
            this(a1.b, "unknown");
          } 
          e0.onServiceDisconnected(componentName2);
        } 
        return true;
      } 
    } 
    synchronized (this.c) {
      h.a a1 = (h.a)paramMessage.obj;
      e0 e0 = this.c.get(a1);
      if (e0 != null && e0.a.isEmpty()) {
        if (e0.c) {
          e0.g.e.removeMessages(1, e0.e);
          d0 d01 = e0.g;
          a a2 = d01.f;
          Context context = d01.d;
          if (a2 != null) {
            context.unbindService(e0);
            e0.c = false;
            e0.b = 2;
          } else {
            throw null;
          } 
        } 
        this.c.remove(a1);
      } 
      return true;
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */