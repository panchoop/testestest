package b.b.m.a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

@SuppressLint({"RestrictedAPI"})
public class d extends b {
  public a n;
  
  public boolean o;
  
  public d(a parama) {}
  
  public d(a parama, Resources paramResources) {
    f(new a(parama, this, paramResources));
    onStateChange(getState());
  }
  
  public void applyTheme(Resources.Theme paramTheme) {
    super.applyTheme(paramTheme);
    onStateChange(getState());
  }
  
  public void f(b.c paramc) {
    super.f(paramc);
    if (paramc instanceof a)
      this.n = (a)paramc; 
  }
  
  public a g() {
    return new a(this.n, this, null);
  }
  
  public boolean isStateful() {
    return true;
  }
  
  public Drawable mutate() {
    if (!this.o) {
      super.mutate();
      this.n.e();
      this.o = true;
    } 
    return this;
  }
  
  public boolean onStateChange(int[] paramArrayOfint) {
    null = super.onStateChange(paramArrayOfint);
    int j = this.n.g(paramArrayOfint);
    int i = j;
    if (j < 0)
      i = this.n.g(StateSet.WILD_CARD); 
    return (e(i) || null);
  }
  
  public static class a extends b.c {
    public int[][] J;
    
    public a(a param1a, d param1d, Resources param1Resources) {
      super(param1a, param1d, param1Resources);
      if (param1a != null) {
        this.J = param1a.J;
      } else {
        this.J = new int[this.g.length][];
      } 
    }
    
    public void e() {
      int[][] arrayOfInt1 = this.J;
      int[][] arrayOfInt2 = new int[arrayOfInt1.length][];
      for (int i = arrayOfInt1.length - 1; i >= 0; i--) {
        arrayOfInt1 = this.J;
        if (arrayOfInt1[i] != null) {
          int[] arrayOfInt = (int[])arrayOfInt1[i].clone();
        } else {
          arrayOfInt1 = null;
        } 
        arrayOfInt2[i] = (int[])arrayOfInt1;
      } 
      this.J = arrayOfInt2;
    }
    
    public int g(int[] param1ArrayOfint) {
      int[][] arrayOfInt = this.J;
      int i = this.h;
      for (byte b = 0; b < i; b++) {
        if (StateSet.stateSetMatches(arrayOfInt[b], param1ArrayOfint))
          return b; 
      } 
      return -1;
    }
    
    public Drawable newDrawable() {
      return new d(this, null);
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      return new d(this, param1Resources);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\m\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */