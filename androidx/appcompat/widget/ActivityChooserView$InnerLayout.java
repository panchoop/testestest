package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ActivityChooserView$InnerLayout extends LinearLayout {
  public static final int[] b = new int[] { 16842964 };
  
  public ActivityChooserView$InnerLayout(Context paramContext, AttributeSet paramAttributeSet) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   6: aload_1
    //   7: aload_2
    //   8: getstatic androidx/appcompat/widget/ActivityChooserView$InnerLayout.b : [I
    //   11: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   14: astore_2
    //   15: aload_2
    //   16: iconst_0
    //   17: invokevirtual hasValue : (I)Z
    //   20: ifeq -> 43
    //   23: aload_2
    //   24: iconst_0
    //   25: iconst_0
    //   26: invokevirtual getResourceId : (II)I
    //   29: istore_3
    //   30: iload_3
    //   31: ifeq -> 43
    //   34: aload_1
    //   35: iload_3
    //   36: invokestatic b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   39: astore_1
    //   40: goto -> 49
    //   43: aload_2
    //   44: iconst_0
    //   45: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   48: astore_1
    //   49: aload_0
    //   50: aload_1
    //   51: invokevirtual setBackgroundDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   54: aload_2
    //   55: invokevirtual recycle : ()V
    //   58: return
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\appcompat\widget\ActivityChooserView$InnerLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */