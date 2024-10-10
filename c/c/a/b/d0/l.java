package c.c.a.b.d0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import c.c.a.b.c0.a;
import java.util.Iterator;
import java.util.List;

public class l extends m.f {
  public final List b;
  
  public final Matrix c;
  
  public l(m paramm, List paramList, Matrix paramMatrix) {}
  
  public void a(Matrix paramMatrix, a parama, int paramInt, Canvas paramCanvas) {
    Iterator<m.f> iterator = this.b.iterator();
    while (iterator.hasNext())
      ((m.f)iterator.next()).a(this.c, parama, paramInt, paramCanvas); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\d0\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */