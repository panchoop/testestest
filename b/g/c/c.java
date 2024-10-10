package b.g.c;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import b.g.b.i.d;
import b.g.b.i.g;
import java.util.Arrays;
import java.util.HashMap;

public abstract class c extends View {
  public int[] b = new int[32];
  
  public int c;
  
  public Context d;
  
  public g e;
  
  public boolean f = false;
  
  public String g;
  
  public HashMap<Integer, String> h = new HashMap<Integer, String>();
  
  public c(Context paramContext) {
    super(paramContext);
    this.d = paramContext;
    e(null);
  }
  
  public final void a(String paramString) {
    if (paramString != null && paramString.length() != 0) {
      if (this.d == null)
        return; 
      String str = paramString.trim();
      if (getParent() instanceof ConstraintLayout)
        ConstraintLayout constraintLayout = (ConstraintLayout)getParent(); 
      if (getParent() instanceof ConstraintLayout) {
        ConstraintLayout constraintLayout = (ConstraintLayout)getParent();
      } else {
        paramString = null;
      } 
      boolean bool = isInEditMode();
      int i = 0;
      int j = i;
      if (bool) {
        j = i;
        if (paramString != null) {
          Object object = paramString.c(0, str);
          j = i;
          if (object instanceof Integer)
            j = ((Integer)object).intValue(); 
        } 
      } 
      i = j;
      if (j == 0) {
        i = j;
        if (paramString != null)
          i = d((ConstraintLayout)paramString, str); 
      } 
      j = i;
      if (i == 0)
        try {
          j = j.class.getField(str).getInt(null);
        } catch (Exception exception) {
          j = i;
        }  
      i = j;
      if (j == 0)
        i = this.d.getResources().getIdentifier(str, "id", this.d.getPackageName()); 
      if (i != 0) {
        this.h.put(Integer.valueOf(i), str);
        b(i);
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not find id of \"");
        stringBuilder.append(str);
        stringBuilder.append("\"");
        Log.w("ConstraintHelper", stringBuilder.toString());
      } 
    } 
  }
  
  public final void b(int paramInt) {
    if (paramInt == getId())
      return; 
    int i = this.c;
    int[] arrayOfInt = this.b;
    if (i + 1 > arrayOfInt.length)
      this.b = Arrays.copyOf(arrayOfInt, arrayOfInt.length * 2); 
    arrayOfInt = this.b;
    i = this.c;
    arrayOfInt[i] = paramInt;
    this.c = i + 1;
  }
  
  public void c() {
    ViewParent viewParent = getParent();
    if (viewParent != null && viewParent instanceof ConstraintLayout) {
      ConstraintLayout constraintLayout = (ConstraintLayout)viewParent;
      int i = getVisibility();
      float f = getElevation();
      for (byte b = 0; b < this.c; b++) {
        View view = constraintLayout.d(this.b[b]);
        if (view != null) {
          view.setVisibility(i);
          if (f > 0.0F)
            view.setTranslationZ(view.getTranslationZ() + f); 
        } 
      } 
    } 
  }
  
  public final int d(ConstraintLayout paramConstraintLayout, String paramString) {
    if (paramString != null && paramConstraintLayout != null) {
      Resources resources = this.d.getResources();
      if (resources == null)
        return 0; 
      int i = paramConstraintLayout.getChildCount();
      for (byte b = 0; b < i; b++) {
        View view = paramConstraintLayout.getChildAt(b);
        if (view.getId() != -1) {
          String str = null;
          try {
            String str1 = resources.getResourceEntryName(view.getId());
            str = str1;
          } catch (android.content.res.Resources.NotFoundException notFoundException) {}
          if (paramString.equals(str))
            return view.getId(); 
        } 
      } 
    } 
    return 0;
  }
  
  public void e(AttributeSet paramAttributeSet) {
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, k.ConstraintLayout_Layout);
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == k.ConstraintLayout_Layout_constraint_referenced_ids) {
          String str = typedArray.getString(j);
          this.g = str;
          setIds(str);
        } 
      } 
    } 
  }
  
  public void f() {}
  
  public void g() {}
  
  public int[] getReferencedIds() {
    return Arrays.copyOf(this.b, this.c);
  }
  
  public void h() {}
  
  public void i() {
    if (this.e == null)
      return; 
    ViewGroup.LayoutParams layoutParams = getLayoutParams();
    if (layoutParams instanceof ConstraintLayout.a)
      ((ConstraintLayout.a)layoutParams).m0 = (d)this.e; 
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    String str = this.g;
    if (str != null)
      setIds(str); 
  }
  
  public void onDraw(Canvas paramCanvas) {}
  
  public void onMeasure(int paramInt1, int paramInt2) {
    if (this.f) {
      super.onMeasure(paramInt1, paramInt2);
    } else {
      setMeasuredDimension(0, 0);
    } 
  }
  
  public void setIds(String paramString) {
    this.g = paramString;
    if (paramString == null)
      return; 
    int i = 0;
    this.c = 0;
    while (true) {
      int j = paramString.indexOf(',', i);
      if (j == -1) {
        a(paramString.substring(i));
        return;
      } 
      a(paramString.substring(i, j));
      i = j + 1;
    } 
  }
  
  public void setReferencedIds(int[] paramArrayOfint) {
    this.g = null;
    byte b = 0;
    this.c = 0;
    while (b < paramArrayOfint.length) {
      b(paramArrayOfint[b]);
      b++;
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */