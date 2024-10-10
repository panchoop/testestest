package b.b.p;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import b.b.f;
import b.b.g;
import b.b.i;

public class b1 {
  public final Context a;
  
  public final View b;
  
  public final TextView c;
  
  public final WindowManager.LayoutParams d = new WindowManager.LayoutParams();
  
  public final Rect e = new Rect();
  
  public final int[] f = new int[2];
  
  public final int[] g = new int[2];
  
  public b1(Context paramContext) {
    this.a = paramContext;
    View view = LayoutInflater.from(paramContext).inflate(g.abc_tooltip, null);
    this.b = view;
    this.c = (TextView)view.findViewById(f.message);
    this.d.setTitle(b1.class.getSimpleName());
    this.d.packageName = this.a.getPackageName();
    WindowManager.LayoutParams layoutParams = this.d;
    layoutParams.type = 1002;
    layoutParams.width = -2;
    layoutParams.height = -2;
    layoutParams.format = -3;
    layoutParams.windowAnimations = i.Animation_AppCompat_Tooltip;
    layoutParams.flags = 24;
  }
  
  public void a() {
    boolean bool;
    if (this.b.getParent() != null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool)
      return; 
    ((WindowManager)this.a.getSystemService("window")).removeView(this.b);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\b1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */