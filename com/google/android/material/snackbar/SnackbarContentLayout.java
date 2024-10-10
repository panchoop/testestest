package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.i.m.l;
import c.c.a.b.f;
import c.c.a.b.k;

public class SnackbarContentLayout extends LinearLayout {
  public TextView b;
  
  public Button c;
  
  public int d;
  
  public int e;
  
  public SnackbarContentLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, k.SnackbarLayout);
    this.d = typedArray.getDimensionPixelSize(k.SnackbarLayout_android_maxWidth, -1);
    this.e = typedArray.getDimensionPixelSize(k.SnackbarLayout_maxActionInlineWidth, -1);
    typedArray.recycle();
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3) {
    boolean bool1;
    int i = getOrientation();
    boolean bool2 = true;
    if (paramInt1 != i) {
      setOrientation(paramInt1);
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (this.b.getPaddingTop() != paramInt2 || this.b.getPaddingBottom() != paramInt3) {
      TextView textView = this.b;
      if (l.G((View)textView)) {
        textView.setPaddingRelative(textView.getPaddingStart(), paramInt2, textView.getPaddingEnd(), paramInt3);
        bool1 = bool2;
      } else {
        textView.setPadding(textView.getPaddingLeft(), paramInt2, textView.getPaddingRight(), paramInt3);
        bool1 = bool2;
      } 
    } 
    return bool1;
  }
  
  public Button getActionView() {
    return this.c;
  }
  
  public TextView getMessageView() {
    return this.b;
  }
  
  public void onFinishInflate() {
    super.onFinishInflate();
    this.b = (TextView)findViewById(f.snackbar_text);
    this.c = (Button)findViewById(f.snackbar_action);
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: invokespecial onMeasure : (II)V
    //   6: iload_1
    //   7: istore_3
    //   8: aload_0
    //   9: getfield d : I
    //   12: ifle -> 50
    //   15: aload_0
    //   16: invokevirtual getMeasuredWidth : ()I
    //   19: istore #4
    //   21: aload_0
    //   22: getfield d : I
    //   25: istore #5
    //   27: iload_1
    //   28: istore_3
    //   29: iload #4
    //   31: iload #5
    //   33: if_icmple -> 50
    //   36: iload #5
    //   38: ldc 1073741824
    //   40: invokestatic makeMeasureSpec : (II)I
    //   43: istore_3
    //   44: aload_0
    //   45: iload_3
    //   46: iload_2
    //   47: invokespecial onMeasure : (II)V
    //   50: aload_0
    //   51: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   54: getstatic c/c/a/b/d.design_snackbar_padding_vertical_2lines : I
    //   57: invokevirtual getDimensionPixelSize : (I)I
    //   60: istore #4
    //   62: aload_0
    //   63: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   66: getstatic c/c/a/b/d.design_snackbar_padding_vertical : I
    //   69: invokevirtual getDimensionPixelSize : (I)I
    //   72: istore #6
    //   74: aload_0
    //   75: getfield b : Landroid/widget/TextView;
    //   78: invokevirtual getLayout : ()Landroid/text/Layout;
    //   81: invokevirtual getLineCount : ()I
    //   84: istore_1
    //   85: iconst_0
    //   86: istore #5
    //   88: iload_1
    //   89: iconst_1
    //   90: if_icmple -> 98
    //   93: iconst_1
    //   94: istore_1
    //   95: goto -> 100
    //   98: iconst_0
    //   99: istore_1
    //   100: iload_1
    //   101: ifeq -> 146
    //   104: aload_0
    //   105: getfield e : I
    //   108: ifle -> 146
    //   111: aload_0
    //   112: getfield c : Landroid/widget/Button;
    //   115: invokevirtual getMeasuredWidth : ()I
    //   118: aload_0
    //   119: getfield e : I
    //   122: if_icmple -> 146
    //   125: iload #5
    //   127: istore_1
    //   128: aload_0
    //   129: iconst_1
    //   130: iload #4
    //   132: iload #4
    //   134: iload #6
    //   136: isub
    //   137: invokevirtual a : (III)Z
    //   140: ifeq -> 174
    //   143: goto -> 172
    //   146: iload_1
    //   147: ifeq -> 153
    //   150: goto -> 157
    //   153: iload #6
    //   155: istore #4
    //   157: iload #5
    //   159: istore_1
    //   160: aload_0
    //   161: iconst_0
    //   162: iload #4
    //   164: iload #4
    //   166: invokevirtual a : (III)Z
    //   169: ifeq -> 174
    //   172: iconst_1
    //   173: istore_1
    //   174: iload_1
    //   175: ifeq -> 184
    //   178: aload_0
    //   179: iload_3
    //   180: iload_2
    //   181: invokespecial onMeasure : (II)V
    //   184: return
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\snackbar\SnackbarContentLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */