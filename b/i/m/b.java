package b.i.m;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import b.b.o.i.j;

public abstract class b {
  public a a;
  
  public b(Context paramContext) {}
  
  public boolean a() {
    return true;
  }
  
  public View b(MenuItem paramMenuItem) {
    return ((j.a)this).b.onCreateActionView();
  }
  
  public boolean c() {
    return false;
  }
  
  public void d(a parama) {
    if (this.a != null) {
      StringBuilder stringBuilder = c.a.a.a.a.e("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
      stringBuilder.append(getClass().getSimpleName());
      stringBuilder.append(" instance while it is still in use somewhere else?");
      Log.w("ActionProvider(support)", stringBuilder.toString());
    } 
    this.a = parama;
  }
  
  public static interface a {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\m\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */