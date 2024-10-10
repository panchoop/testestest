package c.c.a.b.y;

import android.graphics.Typeface;
import android.text.TextPaint;
import c.c.a.b.a0.d;
import java.lang.ref.WeakReference;

public class h {
  public final TextPaint a = new TextPaint(1);
  
  public final d b = new a(this);
  
  public float c;
  
  public boolean d = true;
  
  public WeakReference<b> e = new WeakReference<b>(null);
  
  public c.c.a.b.a0.b f;
  
  public h(b paramb) {
    this.e = new WeakReference<b>(paramb);
  }
  
  public float a(String paramString) {
    float f;
    if (!this.d)
      return this.c; 
    if (paramString == null) {
      f = 0.0F;
    } else {
      f = this.a.measureText(paramString, 0, paramString.length());
    } 
    this.c = f;
    this.d = false;
    return f;
  }
  
  public class a extends d {
    public final h a;
    
    public a(h this$0) {}
    
    public void a(int param1Int) {
      h h1 = this.a;
      h1.d = true;
      h.b b = h1.e.get();
      if (b != null)
        b.a(); 
    }
    
    public void b(Typeface param1Typeface, boolean param1Boolean) {
      if (param1Boolean)
        return; 
      h h1 = this.a;
      h1.d = true;
      h.b b = h1.e.get();
      if (b != null)
        b.a(); 
    }
  }
  
  public static interface b {
    void a();
    
    int[] getState();
    
    boolean onStateChange(int[] param1ArrayOfint);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\y\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */