package b.j.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class a extends BaseAdapter implements Filterable, b.a {
  public boolean b;
  
  public boolean c;
  
  public Cursor d;
  
  public Context e;
  
  public int f;
  
  public a g;
  
  public DataSetObserver h;
  
  public b i;
  
  public a(Context paramContext, Cursor paramCursor, boolean paramBoolean) {
    int i;
    byte b1;
    boolean bool = true;
    if (paramBoolean) {
      i = 1;
    } else {
      i = 2;
    } 
    if ((i & 0x1) == 1) {
      i |= 0x2;
      this.c = true;
    } else {
      this.c = false;
    } 
    if (paramCursor != null) {
      paramBoolean = bool;
    } else {
      paramBoolean = false;
    } 
    this.d = paramCursor;
    this.b = paramBoolean;
    this.e = paramContext;
    if (paramBoolean) {
      b1 = paramCursor.getColumnIndexOrThrow("_id");
    } else {
      b1 = -1;
    } 
    this.f = b1;
    if ((i & 0x2) == 2) {
      this.g = new a(this);
      b b2 = new b(this);
    } else {
      paramContext = null;
      this.g = null;
    } 
    this.h = (DataSetObserver)paramContext;
    if (paramBoolean) {
      a a1 = this.g;
      if (a1 != null)
        paramCursor.registerContentObserver(a1); 
      DataSetObserver dataSetObserver = this.h;
      if (dataSetObserver != null)
        paramCursor.registerDataSetObserver(dataSetObserver); 
    } 
  }
  
  public abstract void a(View paramView, Context paramContext, Cursor paramCursor);
  
  public void b(Cursor paramCursor) {
    Cursor cursor = this.d;
    if (paramCursor == cursor) {
      paramCursor = null;
    } else {
      if (cursor != null) {
        a a1 = this.g;
        if (a1 != null)
          cursor.unregisterContentObserver(a1); 
        DataSetObserver dataSetObserver = this.h;
        if (dataSetObserver != null)
          cursor.unregisterDataSetObserver(dataSetObserver); 
      } 
      this.d = paramCursor;
      if (paramCursor != null) {
        a a1 = this.g;
        if (a1 != null)
          paramCursor.registerContentObserver(a1); 
        DataSetObserver dataSetObserver = this.h;
        if (dataSetObserver != null)
          paramCursor.registerDataSetObserver(dataSetObserver); 
        this.f = paramCursor.getColumnIndexOrThrow("_id");
        this.b = true;
        notifyDataSetChanged();
        paramCursor = cursor;
      } else {
        this.f = -1;
        this.b = false;
        notifyDataSetInvalidated();
        paramCursor = cursor;
      } 
    } 
    if (paramCursor != null)
      paramCursor.close(); 
  }
  
  public abstract CharSequence c(Cursor paramCursor);
  
  public abstract View d(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  public int getCount() {
    if (this.b) {
      Cursor cursor = this.d;
      if (cursor != null)
        return cursor.getCount(); 
    } 
    return 0;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    if (this.b) {
      this.d.moveToPosition(paramInt);
      View view = paramView;
      if (paramView == null) {
        c c = (c)this;
        view = c.l.inflate(c.k, paramViewGroup, false);
      } 
      a(view, this.e, this.d);
      return view;
    } 
    return null;
  }
  
  public Filter getFilter() {
    if (this.i == null)
      this.i = new b(this); 
    return this.i;
  }
  
  public Object getItem(int paramInt) {
    if (this.b) {
      Cursor cursor = this.d;
      if (cursor != null) {
        cursor.moveToPosition(paramInt);
        return this.d;
      } 
    } 
    return null;
  }
  
  public long getItemId(int paramInt) {
    if (this.b) {
      Cursor cursor = this.d;
      if (cursor != null && cursor.moveToPosition(paramInt))
        return this.d.getLong(this.f); 
    } 
    return 0L;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    if (this.b) {
      if (this.d.moveToPosition(paramInt)) {
        View view = paramView;
        if (paramView == null)
          view = d(this.e, this.d, paramViewGroup); 
        a(view, this.e, this.d);
        return view;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("couldn't move cursor to position ");
      stringBuilder.append(paramInt);
      throw new IllegalStateException(stringBuilder.toString());
    } 
    throw new IllegalStateException("this should only be called when the cursor is valid");
  }
  
  public class a extends ContentObserver {
    public final a a;
    
    public a(a this$0) {
      super(new Handler());
    }
    
    public boolean deliverSelfNotifications() {
      return true;
    }
    
    public void onChange(boolean param1Boolean) {
      a a1 = this.a;
      if (a1.c) {
        Cursor cursor = a1.d;
        if (cursor != null && !cursor.isClosed())
          a1.b = a1.d.requery(); 
      } 
    }
  }
  
  public class b extends DataSetObserver {
    public final a a;
    
    public b(a this$0) {}
    
    public void onChanged() {
      a a1 = this.a;
      a1.b = true;
      a1.notifyDataSetChanged();
    }
    
    public void onInvalidated() {
      a a1 = this.a;
      a1.b = false;
      a1.notifyDataSetInvalidated();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\j\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */