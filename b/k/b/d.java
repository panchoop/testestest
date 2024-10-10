package b.k.b;

import android.graphics.Rect;
import java.util.Comparator;

public class d<T> implements Comparator<T> {
  public final Rect b = new Rect();
  
  public final Rect c = new Rect();
  
  public final boolean d;
  
  public final b<T> e;
  
  public d(boolean paramBoolean, b<T> paramb) {
    this.d = paramBoolean;
    this.e = paramb;
  }
  
  public int compare(T paramT1, T paramT2) {
    Rect rect1 = this.b;
    Rect rect2 = this.c;
    ((a.a)this.e).a(paramT1, rect1);
    ((a.a)this.e).a(paramT2, rect2);
    int j = rect1.top;
    int i = rect2.top;
    byte b1 = -1;
    if (j < i)
      return -1; 
    if (j > i)
      return 1; 
    j = rect1.left;
    i = rect2.left;
    if (j < i) {
      if (this.d)
        b1 = 1; 
      return b1;
    } 
    if (j > i) {
      if (!this.d)
        b1 = 1; 
      return b1;
    } 
    i = rect1.bottom;
    j = rect2.bottom;
    if (i < j)
      return -1; 
    if (i > j)
      return 1; 
    j = rect1.right;
    i = rect2.right;
    if (j < i) {
      if (this.d)
        b1 = 1; 
      return b1;
    } 
    if (j > i) {
      if (!this.d)
        b1 = 1; 
      return b1;
    } 
    return 0;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\k\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */