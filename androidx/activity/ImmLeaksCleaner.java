package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import b.n.d;
import b.n.e;
import b.n.g;
import java.lang.reflect.Field;

public final class ImmLeaksCleaner implements e {
  public static int b;
  
  public static Field c;
  
  public static Field d;
  
  public static Field e;
  
  public Activity a;
  
  public ImmLeaksCleaner(Activity paramActivity) {
    this.a = paramActivity;
  }
  
  public void g(g paramg, d.a parama) {
    if (parama != d.a.ON_DESTROY)
      return; 
    if (b == 0)
      try {
        b = 2;
        Field field = InputMethodManager.class.getDeclaredField("mServedView");
        d = field;
        field.setAccessible(true);
        field = InputMethodManager.class.getDeclaredField("mNextServedView");
        e = field;
        field.setAccessible(true);
        field = InputMethodManager.class.getDeclaredField("mH");
        c = field;
        field.setAccessible(true);
        b = 1;
      } catch (NoSuchFieldException noSuchFieldException) {} 
    if (b == 1) {
      InputMethodManager inputMethodManager = (InputMethodManager)this.a.getSystemService("input_method");
      try {
        Object object = c.get(inputMethodManager);
        if (object == null)
          return; 
        /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        try {
          View view = (View)d.get(inputMethodManager);
          if (view == null) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            return;
          } 
          if (view.isAttachedToWindow()) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            return;
          } 
          try {
            e.set(inputMethodManager, (Object)null);
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            inputMethodManager.isActive();
          } catch (IllegalAccessException illegalAccessException) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            return;
          } 
        } catch (IllegalAccessException illegalAccessException) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return;
        } catch (ClassCastException classCastException) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return;
        } finally {}
      } catch (IllegalAccessException illegalAccessException) {}
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\activity\ImmLeaksCleaner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */