package c.c.a.b.v;

import android.content.Context;
import c.c.a.a.c.l.q;
import c.c.a.b.b;

public class a {
  public final boolean a;
  
  public final int b;
  
  public final int c;
  
  public final float d;
  
  public a(Context paramContext) {
    this.a = q.V(paramContext, b.elevationOverlayEnabled, false);
    this.b = q.x(paramContext, b.elevationOverlayColor, 0);
    this.c = q.x(paramContext, b.colorSurface, 0);
    this.d = (paramContext.getResources().getDisplayMetrics()).density;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\v\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */