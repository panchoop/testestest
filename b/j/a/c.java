package b.j.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {
  public int j;
  
  public int k;
  
  public LayoutInflater l;
  
  @Deprecated
  public c(Context paramContext, int paramInt, Cursor paramCursor, boolean paramBoolean) {
    super(paramContext, null, paramBoolean);
    this.k = paramInt;
    this.j = paramInt;
    this.l = (LayoutInflater)paramContext.getSystemService("layout_inflater");
  }
  
  public View d(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup) {
    return this.l.inflate(this.j, paramViewGroup, false);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\j\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */