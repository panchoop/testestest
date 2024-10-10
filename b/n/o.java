package b.n;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class o extends Fragment {
  public a b;
  
  public static void b(Activity paramActivity) {
    FragmentManager fragmentManager = paramActivity.getFragmentManager();
    if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
      fragmentManager.beginTransaction().add(new o(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
      fragmentManager.executePendingTransactions();
    } 
  }
  
  public final void a(d.a parama) {
    Activity activity = getActivity();
    if (activity instanceof i) {
      ((i)activity).a().d(parama);
      return;
    } 
    if (activity instanceof g) {
      d d = ((g)activity).a();
      if (d instanceof h)
        ((h)d).d(parama); 
    } 
  }
  
  public void onActivityCreated(Bundle paramBundle) {
    super.onActivityCreated(paramBundle);
    a a1 = this.b;
    if (a1 != null)
      a1.a(); 
    a(d.a.ON_CREATE);
  }
  
  public void onDestroy() {
    super.onDestroy();
    a(d.a.ON_DESTROY);
    this.b = null;
  }
  
  public void onPause() {
    super.onPause();
    a(d.a.ON_PAUSE);
  }
  
  public void onResume() {
    super.onResume();
    a a1 = this.b;
    if (a1 != null)
      a1.b(); 
    a(d.a.ON_RESUME);
  }
  
  public void onStart() {
    super.onStart();
    a a1 = this.b;
    if (a1 != null)
      a1.c(); 
    a(d.a.ON_START);
  }
  
  public void onStop() {
    super.onStop();
    a(d.a.ON_STOP);
  }
  
  public static interface a {
    void a();
    
    void b();
    
    void c();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\n\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */