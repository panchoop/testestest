package b.l.a;

import android.view.View;
import b.i.m.l;
import java.util.ArrayList;
import java.util.Map;

public class a0 implements Runnable {
  public final ArrayList b;
  
  public final Map c;
  
  public a0(b0 paramb0, ArrayList paramArrayList, Map paramMap) {}
  
  public void run() {
    int i = this.b.size();
    for (byte b = 0; b < i; b++) {
      View view = this.b.get(b);
      String str = l.x(view);
      view.setTransitionName((String)this.c.get(str));
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */