package b.b.k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import b.b.j;

public abstract class a {
  public abstract boolean a();
  
  public abstract void b(boolean paramBoolean);
  
  public abstract int c();
  
  public abstract Context d();
  
  public abstract void e(Configuration paramConfiguration);
  
  public abstract boolean f(int paramInt, KeyEvent paramKeyEvent);
  
  public abstract void g(boolean paramBoolean);
  
  public abstract void h(boolean paramBoolean);
  
  public abstract void i(CharSequence paramCharSequence);
  
  public abstract b.b.o.a j(b.b.o.a.a parama);
  
  public static class a extends ViewGroup.MarginLayoutParams {
    public int a = 0;
    
    public a(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.a = 8388627;
    }
    
    public a(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, j.ActionBarLayout);
      this.a = typedArray.getInt(j.ActionBarLayout_android_layout_gravity, 0);
      typedArray.recycle();
    }
    
    public a(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public a(a param1a) {
      super(param1a);
      this.a = param1a.a;
    }
  }
  
  public static interface b {
    void a(boolean param1Boolean);
  }
  
  @Deprecated
  public static abstract class c {
    public abstract void a();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\k\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */