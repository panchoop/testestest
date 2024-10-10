package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import b.b.k.r;
import b.b.p.f;
import b.b.p.g;
import b.b.p.r;
import b.b.p.z;
import c.c.a.b.r.a;
import c.c.a.b.z.a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

@Keep
public class MaterialComponentsViewInflater extends r {
  public static int floatingToolbarItemBackgroundResId = -1;
  
  public f createButton(Context paramContext, AttributeSet paramAttributeSet) {
    return (f)(shouldInflateAppCompatButton(paramContext, paramAttributeSet) ? new f(paramContext, paramAttributeSet) : new MaterialButton(paramContext, paramAttributeSet));
  }
  
  public g createCheckBox(Context paramContext, AttributeSet paramAttributeSet) {
    return (g)new a(paramContext, paramAttributeSet);
  }
  
  public r createRadioButton(Context paramContext, AttributeSet paramAttributeSet) {
    return (r)new a(paramContext, paramAttributeSet);
  }
  
  public z createTextView(Context paramContext, AttributeSet paramAttributeSet) {
    return (z)new MaterialTextView(paramContext, paramAttributeSet);
  }
  
  public boolean shouldInflateAppCompatButton(Context paramContext, AttributeSet paramAttributeSet) {
    int i = Build.VERSION.SDK_INT;
    if (i != 23 && i != 24 && i != 25)
      return false; 
    if (floatingToolbarItemBackgroundResId == -1)
      floatingToolbarItemBackgroundResId = paramContext.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android"); 
    i = floatingToolbarItemBackgroundResId;
    if (i != 0 && i != -1)
      for (i = 0; i < paramAttributeSet.getAttributeCount(); i++) {
        if (paramAttributeSet.getAttributeNameResource(i) == 16842964) {
          int j = paramAttributeSet.getAttributeListValue(i, null, 0);
          if (floatingToolbarItemBackgroundResId == j)
            return true; 
        } 
      }  
    return false;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\theme\MaterialComponentsViewInflater.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */