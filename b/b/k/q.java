package b.b.k;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import b.i.m.d;

public class q extends Dialog implements i {
  public j b;
  
  public final d.a c = new a(this);
  
  public q(Context paramContext, int paramInt) {
    super(paramContext, k);
    j j1 = a();
    int k = paramInt;
    if (paramInt == 0) {
      TypedValue typedValue = new TypedValue();
      paramContext.getTheme().resolveAttribute(b.b.a.dialogTheme, typedValue, true);
      k = typedValue.resourceId;
    } 
    ((k)j1).O = k;
    j1.h(null);
  }
  
  public j a() {
    if (this.b == null)
      this.b = j.e(this, this); 
    return this.b;
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    a().c(paramView, paramLayoutParams);
  }
  
  public void b(b.b.o.a parama) {}
  
  public boolean c(KeyEvent paramKeyEvent) {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void dismiss() {
    super.dismiss();
    a().i();
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    View view = getWindow().getDecorView();
    return d.a(this.c, view, (Window.Callback)this, paramKeyEvent);
  }
  
  public <T extends View> T findViewById(int paramInt) {
    k k = (k)a();
    k.z();
    return (T)k.f.findViewById(paramInt);
  }
  
  public void g(b.b.o.a parama) {}
  
  public b.b.o.a h(b.b.o.a.a parama) {
    return null;
  }
  
  public void invalidateOptionsMenu() {
    a().g();
  }
  
  public void onCreate(Bundle paramBundle) {
    a().f();
    super.onCreate(paramBundle);
    a().h(paramBundle);
  }
  
  public void onStop() {
    super.onStop();
    k k = (k)a();
    k.L = false;
    k.F();
    a a1 = k.i;
    if (a1 != null)
      a1.h(false); 
  }
  
  public void setContentView(int paramInt) {
    a().l(paramInt);
  }
  
  public void setContentView(View paramView) {
    a().m(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    a().n(paramView, paramLayoutParams);
  }
  
  public void setTitle(int paramInt) {
    super.setTitle(paramInt);
    a().o(getContext().getString(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    super.setTitle(paramCharSequence);
    a().o(paramCharSequence);
  }
  
  public class a implements d.a {
    public final q b;
    
    public a(q this$0) {}
    
    public boolean i(KeyEvent param1KeyEvent) {
      return this.b.c(param1KeyEvent);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\k\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */