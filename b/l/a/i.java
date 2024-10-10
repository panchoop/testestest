package b.l.a;

import a.a.a.a.a;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;

public abstract class i<E> extends f {
  public final Activity b;
  
  public final Context c;
  
  public final Handler d;
  
  public final int e;
  
  public final k f = new k();
  
  public i(e parame) {
    this.b = (Activity)parame;
    a.h(parame, "context == null");
    this.c = (Context)parame;
    a.h(handler, "handler == null");
    this.d = handler;
    this.e = 0;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */