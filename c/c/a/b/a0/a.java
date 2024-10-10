package c.c.a.b.a0;

import android.graphics.Typeface;
import c.c.a.b.y.b;
import c.c.a.b.y.c;

public final class a extends d {
  public final Typeface a;
  
  public final a b;
  
  public boolean c;
  
  public a(a parama, Typeface paramTypeface) {
    this.a = paramTypeface;
    this.b = parama;
  }
  
  public void a(int paramInt) {
    c(this.a);
  }
  
  public void b(Typeface paramTypeface, boolean paramBoolean) {
    c(paramTypeface);
  }
  
  public final void c(Typeface paramTypeface) {
    if (!this.c) {
      c c = ((b)this.b).a;
      a a1 = c.v;
      boolean bool = true;
      if (a1 != null)
        a1.c = true; 
      if (c.s != paramTypeface) {
        c.s = paramTypeface;
      } else {
        bool = false;
      } 
      if (bool)
        c.k(); 
    } 
  }
  
  public static interface a {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\a0\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */