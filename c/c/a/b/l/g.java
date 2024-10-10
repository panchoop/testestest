package c.c.a.b.l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import b.f.h;
import c.a.a.a.a;
import java.util.ArrayList;
import java.util.List;

public class g {
  public final h<String, h> a = new h();
  
  public final h<String, PropertyValuesHolder[]> b = new h();
  
  public static g a(Context paramContext, TypedArray paramTypedArray, int paramInt) {
    if (paramTypedArray.hasValue(paramInt)) {
      paramInt = paramTypedArray.getResourceId(paramInt, 0);
      if (paramInt != 0)
        return b(paramContext, paramInt); 
    } 
    return null;
  }
  
  public static g b(Context paramContext, int paramInt) {
    try {
      Animator animator = AnimatorInflater.loadAnimator(paramContext, paramInt);
      if (animator instanceof AnimatorSet)
        return c(((AnimatorSet)animator).getChildAnimations()); 
      if (animator != null) {
        ArrayList<Animator> arrayList = new ArrayList();
        this();
        arrayList.add(animator);
        return c(arrayList);
      } 
      return null;
    } catch (Exception exception) {
      StringBuilder stringBuilder = a.e("Can't load animation resource ID #0x");
      stringBuilder.append(Integer.toHexString(paramInt));
      Log.w("MotionSpec", stringBuilder.toString(), exception);
      return null;
    } 
  }
  
  public static g c(List<Animator> paramList) {
    g g1 = new g();
    int i = paramList.size();
    byte b = 0;
    while (b < i) {
      h h1;
      Animator animator = paramList.get(b);
      if (animator instanceof ObjectAnimator) {
        TimeInterpolator timeInterpolator1;
        ObjectAnimator objectAnimator = (ObjectAnimator)animator;
        String str1 = objectAnimator.getPropertyName();
        PropertyValuesHolder[] arrayOfPropertyValuesHolder = objectAnimator.getValues();
        g1.b.put(str1, arrayOfPropertyValuesHolder);
        String str2 = objectAnimator.getPropertyName();
        long l2 = objectAnimator.getStartDelay();
        long l1 = objectAnimator.getDuration();
        TimeInterpolator timeInterpolator2 = objectAnimator.getInterpolator();
        if (timeInterpolator2 instanceof android.view.animation.AccelerateDecelerateInterpolator || timeInterpolator2 == null) {
          timeInterpolator1 = a.b;
        } else if (timeInterpolator2 instanceof android.view.animation.AccelerateInterpolator) {
          timeInterpolator1 = a.c;
        } else {
          timeInterpolator1 = timeInterpolator2;
          if (timeInterpolator2 instanceof android.view.animation.DecelerateInterpolator)
            timeInterpolator1 = a.d; 
        } 
        h1 = new h(l2, l1, timeInterpolator1);
        h1.d = objectAnimator.getRepeatCount();
        h1.e = objectAnimator.getRepeatMode();
        g1.a.put(str2, h1);
        b++;
        continue;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Animator must be an ObjectAnimator: ");
      stringBuilder.append(h1);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    return g1;
  }
  
  public h d(String paramString) {
    boolean bool;
    if (this.a.getOrDefault(paramString, null) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      return (h)this.a.getOrDefault(paramString, null); 
    throw new IllegalArgumentException();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof g))
      return false; 
    paramObject = paramObject;
    return this.a.equals(((g)paramObject).a);
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append('\n');
    stringBuilder.append(g.class.getName());
    stringBuilder.append('{');
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" timings: ");
    stringBuilder.append(this.a);
    stringBuilder.append("}\n");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\l\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */