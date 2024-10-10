package c.c.a.a.c.k.k;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

public final class b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
  public static final b f = new b();
  
  public final AtomicBoolean b = new AtomicBoolean();
  
  public final AtomicBoolean c = new AtomicBoolean();
  
  @GuardedBy("sInstance")
  public final ArrayList<a> d = new ArrayList<a>();
  
  @GuardedBy("sInstance")
  public boolean e = false;
  
  public static void b(Application paramApplication) {
    synchronized (f) {
      if (!f.e) {
        paramApplication.registerActivityLifecycleCallbacks(f);
        paramApplication.registerComponentCallbacks((ComponentCallbacks)f);
        f.e = true;
      } 
      return;
    } 
  }
  
  public final void a(a parama) {
    synchronized (f) {
      this.d.add(parama);
      return;
    } 
  }
  
  public final void c(boolean paramBoolean) {
    synchronized (f) {
      ArrayList<a> arrayList = this.d;
      int i = arrayList.size();
      byte b1 = 0;
      while (b1 < i) {
        a a = (a)arrayList.get(b1);
        b1++;
        ((a)a).a(paramBoolean);
      } 
      return;
    } 
  }
  
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle) {
    boolean bool = this.b.compareAndSet(true, false);
    this.c.set(true);
    if (bool)
      c(false); 
  }
  
  public final void onActivityDestroyed(Activity paramActivity) {}
  
  public final void onActivityPaused(Activity paramActivity) {}
  
  public final void onActivityResumed(Activity paramActivity) {
    boolean bool = this.b.compareAndSet(true, false);
    this.c.set(true);
    if (bool)
      c(false); 
  }
  
  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public final void onActivityStarted(Activity paramActivity) {}
  
  public final void onActivityStopped(Activity paramActivity) {}
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public final void onLowMemory() {}
  
  public final void onTrimMemory(int paramInt) {
    if (paramInt == 20 && this.b.compareAndSet(false, true)) {
      this.c.set(true);
      c(true);
    } 
  }
  
  public static interface a {
    void a(boolean param1Boolean);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\k\k\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */