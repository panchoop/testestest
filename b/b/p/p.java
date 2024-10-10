package b.b.p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

public class p extends PopupWindow {
  public p(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: iload #4
    //   6: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;II)V
    //   9: aload_1
    //   10: aload_2
    //   11: getstatic b/b/j.PopupWindow : [I
    //   14: iload_3
    //   15: iload #4
    //   17: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   20: astore_2
    //   21: aload_2
    //   22: getstatic b/b/j.PopupWindow_overlapAnchor : I
    //   25: invokevirtual hasValue : (I)Z
    //   28: ifeq -> 43
    //   31: aload_0
    //   32: aload_2
    //   33: getstatic b/b/j.PopupWindow_overlapAnchor : I
    //   36: iconst_0
    //   37: invokevirtual getBoolean : (IZ)Z
    //   40: invokestatic q0 : (Landroid/widget/PopupWindow;Z)V
    //   43: getstatic b/b/j.PopupWindow_android_popupBackground : I
    //   46: istore_3
    //   47: aload_2
    //   48: iload_3
    //   49: invokevirtual hasValue : (I)Z
    //   52: ifeq -> 78
    //   55: aload_2
    //   56: iload_3
    //   57: iconst_0
    //   58: invokevirtual getResourceId : (II)I
    //   61: istore #4
    //   63: iload #4
    //   65: ifeq -> 78
    //   68: aload_1
    //   69: iload #4
    //   71: invokestatic b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   74: astore_1
    //   75: goto -> 84
    //   78: aload_2
    //   79: iload_3
    //   80: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   83: astore_1
    //   84: aload_0
    //   85: aload_1
    //   86: invokevirtual setBackgroundDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   89: aload_2
    //   90: invokevirtual recycle : ()V
    //   93: return
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2) {
    super.showAsDropDown(paramView, paramInt1, paramInt2);
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3) {
    super.showAsDropDown(paramView, paramInt1, paramInt2, paramInt3);
  }
  
  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.update(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */