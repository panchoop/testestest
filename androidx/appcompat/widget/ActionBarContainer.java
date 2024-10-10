package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.b.f;
import b.b.j;
import b.b.p.b;
import b.b.p.q0;
import b.i.m.l;

public class ActionBarContainer extends FrameLayout {
  public boolean b;
  
  public View c;
  
  public View d;
  
  public View e;
  
  public Drawable f;
  
  public Drawable g;
  
  public Drawable h;
  
  public boolean i;
  
  public boolean j;
  
  public int k;
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    l.Z((View)this, (Drawable)new b(this));
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.ActionBar);
    this.f = typedArray.getDrawable(j.ActionBar_background);
    this.g = typedArray.getDrawable(j.ActionBar_backgroundStacked);
    this.k = typedArray.getDimensionPixelSize(j.ActionBar_height, -1);
    int i = getId();
    int j = f.split_action_bar;
    boolean bool = true;
    if (i == j) {
      this.i = true;
      this.h = typedArray.getDrawable(j.ActionBar_backgroundSplit);
    } 
    typedArray.recycle();
    if (this.i ? (this.h == null) : (this.f == null && this.g == null))
      bool = false; 
    setWillNotDraw(bool);
  }
  
  public final int a(View paramView) {
    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    return paramView.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
  }
  
  public final boolean b(View paramView) {
    return (paramView == null || paramView.getVisibility() == 8 || paramView.getMeasuredHeight() == 0);
  }
  
  public void drawableStateChanged() {
    super.drawableStateChanged();
    Drawable drawable = this.f;
    if (drawable != null && drawable.isStateful())
      this.f.setState(getDrawableState()); 
    drawable = this.g;
    if (drawable != null && drawable.isStateful())
      this.g.setState(getDrawableState()); 
    drawable = this.h;
    if (drawable != null && drawable.isStateful())
      this.h.setState(getDrawableState()); 
  }
  
  public View getTabContainer() {
    return this.c;
  }
  
  public void jumpDrawablesToCurrentState() {
    super.jumpDrawablesToCurrentState();
    Drawable drawable = this.f;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
    drawable = this.g;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
    drawable = this.h;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
  }
  
  public void onFinishInflate() {
    super.onFinishInflate();
    this.d = findViewById(f.action_bar);
    this.e = findViewById(f.action_context_bar);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    super.onHoverEvent(paramMotionEvent);
    return true;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    return (this.b || super.onInterceptTouchEvent(paramMotionEvent));
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: iload_3
    //   4: iload #4
    //   6: iload #5
    //   8: invokespecial onLayout : (ZIIII)V
    //   11: aload_0
    //   12: getfield c : Landroid/view/View;
    //   15: astore #11
    //   17: iconst_1
    //   18: istore #5
    //   20: iconst_0
    //   21: istore_3
    //   22: aload #11
    //   24: ifnull -> 42
    //   27: aload #11
    //   29: invokevirtual getVisibility : ()I
    //   32: bipush #8
    //   34: if_icmpeq -> 42
    //   37: iconst_1
    //   38: istore_1
    //   39: goto -> 44
    //   42: iconst_0
    //   43: istore_1
    //   44: aload #11
    //   46: ifnull -> 110
    //   49: aload #11
    //   51: invokevirtual getVisibility : ()I
    //   54: bipush #8
    //   56: if_icmpeq -> 110
    //   59: aload_0
    //   60: invokevirtual getMeasuredHeight : ()I
    //   63: istore #8
    //   65: aload #11
    //   67: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   70: checkcast android/widget/FrameLayout$LayoutParams
    //   73: astore #9
    //   75: aload #11
    //   77: invokevirtual getMeasuredHeight : ()I
    //   80: istore #6
    //   82: aload #9
    //   84: getfield bottomMargin : I
    //   87: istore #7
    //   89: aload #11
    //   91: iload_2
    //   92: iload #8
    //   94: iload #6
    //   96: isub
    //   97: iload #7
    //   99: isub
    //   100: iload #4
    //   102: iload #8
    //   104: iload #7
    //   106: isub
    //   107: invokevirtual layout : (IIII)V
    //   110: aload_0
    //   111: getfield i : Z
    //   114: ifeq -> 154
    //   117: aload_0
    //   118: getfield h : Landroid/graphics/drawable/Drawable;
    //   121: astore #9
    //   123: aload #9
    //   125: ifnull -> 149
    //   128: aload #9
    //   130: iconst_0
    //   131: iconst_0
    //   132: aload_0
    //   133: invokevirtual getMeasuredWidth : ()I
    //   136: aload_0
    //   137: invokevirtual getMeasuredHeight : ()I
    //   140: invokevirtual setBounds : (IIII)V
    //   143: iload #5
    //   145: istore_2
    //   146: goto -> 350
    //   149: iconst_0
    //   150: istore_2
    //   151: goto -> 350
    //   154: iload_3
    //   155: istore_2
    //   156: aload_0
    //   157: getfield f : Landroid/graphics/drawable/Drawable;
    //   160: ifnull -> 299
    //   163: aload_0
    //   164: getfield d : Landroid/view/View;
    //   167: invokevirtual getVisibility : ()I
    //   170: ifne -> 227
    //   173: aload_0
    //   174: getfield f : Landroid/graphics/drawable/Drawable;
    //   177: astore #9
    //   179: aload_0
    //   180: getfield d : Landroid/view/View;
    //   183: invokevirtual getLeft : ()I
    //   186: istore_3
    //   187: aload_0
    //   188: getfield d : Landroid/view/View;
    //   191: invokevirtual getTop : ()I
    //   194: istore #4
    //   196: aload_0
    //   197: getfield d : Landroid/view/View;
    //   200: invokevirtual getRight : ()I
    //   203: istore_2
    //   204: aload_0
    //   205: getfield d : Landroid/view/View;
    //   208: astore #10
    //   210: aload #9
    //   212: iload_3
    //   213: iload #4
    //   215: iload_2
    //   216: aload #10
    //   218: invokevirtual getBottom : ()I
    //   221: invokevirtual setBounds : (IIII)V
    //   224: goto -> 297
    //   227: aload_0
    //   228: getfield e : Landroid/view/View;
    //   231: astore #9
    //   233: aload #9
    //   235: ifnull -> 286
    //   238: aload #9
    //   240: invokevirtual getVisibility : ()I
    //   243: ifne -> 286
    //   246: aload_0
    //   247: getfield f : Landroid/graphics/drawable/Drawable;
    //   250: astore #9
    //   252: aload_0
    //   253: getfield e : Landroid/view/View;
    //   256: invokevirtual getLeft : ()I
    //   259: istore_3
    //   260: aload_0
    //   261: getfield e : Landroid/view/View;
    //   264: invokevirtual getTop : ()I
    //   267: istore #4
    //   269: aload_0
    //   270: getfield e : Landroid/view/View;
    //   273: invokevirtual getRight : ()I
    //   276: istore_2
    //   277: aload_0
    //   278: getfield e : Landroid/view/View;
    //   281: astore #10
    //   283: goto -> 210
    //   286: aload_0
    //   287: getfield f : Landroid/graphics/drawable/Drawable;
    //   290: iconst_0
    //   291: iconst_0
    //   292: iconst_0
    //   293: iconst_0
    //   294: invokevirtual setBounds : (IIII)V
    //   297: iconst_1
    //   298: istore_2
    //   299: aload_0
    //   300: iload_1
    //   301: putfield j : Z
    //   304: iload_1
    //   305: ifeq -> 350
    //   308: aload_0
    //   309: getfield g : Landroid/graphics/drawable/Drawable;
    //   312: astore #9
    //   314: aload #9
    //   316: ifnull -> 350
    //   319: aload #9
    //   321: aload #11
    //   323: invokevirtual getLeft : ()I
    //   326: aload #11
    //   328: invokevirtual getTop : ()I
    //   331: aload #11
    //   333: invokevirtual getRight : ()I
    //   336: aload #11
    //   338: invokevirtual getBottom : ()I
    //   341: invokevirtual setBounds : (IIII)V
    //   344: iload #5
    //   346: istore_2
    //   347: goto -> 350
    //   350: iload_2
    //   351: ifeq -> 358
    //   354: aload_0
    //   355: invokevirtual invalidate : ()V
    //   358: return
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_2
    //   1: istore_3
    //   2: aload_0
    //   3: getfield d : Landroid/view/View;
    //   6: ifnonnull -> 48
    //   9: iload_2
    //   10: istore_3
    //   11: iload_2
    //   12: invokestatic getMode : (I)I
    //   15: ldc -2147483648
    //   17: if_icmpne -> 48
    //   20: aload_0
    //   21: getfield k : I
    //   24: istore #4
    //   26: iload_2
    //   27: istore_3
    //   28: iload #4
    //   30: iflt -> 48
    //   33: iload #4
    //   35: iload_2
    //   36: invokestatic getSize : (I)I
    //   39: invokestatic min : (II)I
    //   42: ldc -2147483648
    //   44: invokestatic makeMeasureSpec : (II)I
    //   47: istore_3
    //   48: aload_0
    //   49: iload_1
    //   50: iload_3
    //   51: invokespecial onMeasure : (II)V
    //   54: aload_0
    //   55: getfield d : Landroid/view/View;
    //   58: ifnonnull -> 62
    //   61: return
    //   62: iload_3
    //   63: invokestatic getMode : (I)I
    //   66: istore_2
    //   67: aload_0
    //   68: getfield c : Landroid/view/View;
    //   71: astore #5
    //   73: aload #5
    //   75: ifnull -> 182
    //   78: aload #5
    //   80: invokevirtual getVisibility : ()I
    //   83: bipush #8
    //   85: if_icmpeq -> 182
    //   88: iload_2
    //   89: ldc 1073741824
    //   91: if_icmpeq -> 182
    //   94: aload_0
    //   95: aload_0
    //   96: getfield d : Landroid/view/View;
    //   99: invokevirtual b : (Landroid/view/View;)Z
    //   102: ifne -> 121
    //   105: aload_0
    //   106: getfield d : Landroid/view/View;
    //   109: astore #5
    //   111: aload_0
    //   112: aload #5
    //   114: invokevirtual a : (Landroid/view/View;)I
    //   117: istore_1
    //   118: goto -> 143
    //   121: aload_0
    //   122: aload_0
    //   123: getfield e : Landroid/view/View;
    //   126: invokevirtual b : (Landroid/view/View;)Z
    //   129: ifne -> 141
    //   132: aload_0
    //   133: getfield e : Landroid/view/View;
    //   136: astore #5
    //   138: goto -> 111
    //   141: iconst_0
    //   142: istore_1
    //   143: iload_2
    //   144: ldc -2147483648
    //   146: if_icmpne -> 157
    //   149: iload_3
    //   150: invokestatic getSize : (I)I
    //   153: istore_2
    //   154: goto -> 160
    //   157: ldc 2147483647
    //   159: istore_2
    //   160: aload_0
    //   161: aload_0
    //   162: invokevirtual getMeasuredWidth : ()I
    //   165: aload_0
    //   166: aload_0
    //   167: getfield c : Landroid/view/View;
    //   170: invokevirtual a : (Landroid/view/View;)I
    //   173: iload_1
    //   174: iadd
    //   175: iload_2
    //   176: invokestatic min : (II)I
    //   179: invokevirtual setMeasuredDimension : (II)V
    //   182: return
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setPrimaryBackground(Drawable paramDrawable) {
    Drawable drawable = this.f;
    if (drawable != null) {
      drawable.setCallback(null);
      unscheduleDrawable(this.f);
    } 
    this.f = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback((Drawable.Callback)this);
      View view = this.d;
      if (view != null)
        this.f.setBounds(view.getLeft(), this.d.getTop(), this.d.getRight(), this.d.getBottom()); 
    } 
    boolean bool1 = this.i;
    boolean bool = true;
    if (bool1 ? (this.h == null) : (this.f == null && this.g == null))
      bool = false; 
    setWillNotDraw(bool);
    invalidate();
    invalidateOutline();
  }
  
  public void setSplitBackground(Drawable paramDrawable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Landroid/graphics/drawable/Drawable;
    //   4: astore #4
    //   6: aload #4
    //   8: ifnull -> 25
    //   11: aload #4
    //   13: aconst_null
    //   14: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   17: aload_0
    //   18: aload_0
    //   19: getfield h : Landroid/graphics/drawable/Drawable;
    //   22: invokevirtual unscheduleDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   25: aload_0
    //   26: aload_1
    //   27: putfield h : Landroid/graphics/drawable/Drawable;
    //   30: iconst_0
    //   31: istore_3
    //   32: aload_1
    //   33: ifnull -> 71
    //   36: aload_1
    //   37: aload_0
    //   38: invokevirtual setCallback : (Landroid/graphics/drawable/Drawable$Callback;)V
    //   41: aload_0
    //   42: getfield i : Z
    //   45: ifeq -> 71
    //   48: aload_0
    //   49: getfield h : Landroid/graphics/drawable/Drawable;
    //   52: astore_1
    //   53: aload_1
    //   54: ifnull -> 71
    //   57: aload_1
    //   58: iconst_0
    //   59: iconst_0
    //   60: aload_0
    //   61: invokevirtual getMeasuredWidth : ()I
    //   64: aload_0
    //   65: invokevirtual getMeasuredHeight : ()I
    //   68: invokevirtual setBounds : (IIII)V
    //   71: aload_0
    //   72: getfield i : Z
    //   75: ifeq -> 92
    //   78: iload_3
    //   79: istore_2
    //   80: aload_0
    //   81: getfield h : Landroid/graphics/drawable/Drawable;
    //   84: ifnonnull -> 113
    //   87: iconst_1
    //   88: istore_2
    //   89: goto -> 113
    //   92: iload_3
    //   93: istore_2
    //   94: aload_0
    //   95: getfield f : Landroid/graphics/drawable/Drawable;
    //   98: ifnonnull -> 113
    //   101: iload_3
    //   102: istore_2
    //   103: aload_0
    //   104: getfield g : Landroid/graphics/drawable/Drawable;
    //   107: ifnonnull -> 113
    //   110: goto -> 87
    //   113: aload_0
    //   114: iload_2
    //   115: invokevirtual setWillNotDraw : (Z)V
    //   118: aload_0
    //   119: invokevirtual invalidate : ()V
    //   122: aload_0
    //   123: invokevirtual invalidateOutline : ()V
    //   126: return
  }
  
  public void setStackedBackground(Drawable paramDrawable) {
    Drawable drawable = this.g;
    if (drawable != null) {
      drawable.setCallback(null);
      unscheduleDrawable(this.g);
    } 
    this.g = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback((Drawable.Callback)this);
      if (this.j) {
        paramDrawable = this.g;
        if (paramDrawable != null)
          paramDrawable.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom()); 
      } 
    } 
    boolean bool1 = this.i;
    boolean bool = true;
    if (bool1 ? (this.h == null) : (this.f == null && this.g == null))
      bool = false; 
    setWillNotDraw(bool);
    invalidate();
    invalidateOutline();
  }
  
  public void setTabContainer(q0 paramq0) {
    View view = this.c;
    if (view != null)
      removeView(view); 
    this.c = (View)paramq0;
    if (paramq0 != null) {
      addView((View)paramq0);
      ViewGroup.LayoutParams layoutParams = paramq0.getLayoutParams();
      layoutParams.width = -1;
      layoutParams.height = -2;
      paramq0.setAllowCollapse(false);
    } 
  }
  
  public void setTransitioning(boolean paramBoolean) {
    int i;
    this.b = paramBoolean;
    if (paramBoolean) {
      i = 393216;
    } else {
      i = 262144;
    } 
    setDescendantFocusability(i);
  }
  
  public void setVisibility(int paramInt) {
    boolean bool;
    super.setVisibility(paramInt);
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    Drawable drawable = this.f;
    if (drawable != null)
      drawable.setVisible(bool, false); 
    drawable = this.g;
    if (drawable != null)
      drawable.setVisible(bool, false); 
    drawable = this.h;
    if (drawable != null)
      drawable.setVisible(bool, false); 
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback) {
    return null;
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback, int paramInt) {
    return (paramInt != 0) ? super.startActionModeForChild(paramView, paramCallback, paramInt) : null;
  }
  
  public boolean verifyDrawable(Drawable paramDrawable) {
    boolean bool;
    if ((paramDrawable == this.f && !this.i) || (paramDrawable == this.g && this.j) || (paramDrawable == this.h && this.i) || super.verifyDrawable(paramDrawable)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\appcompat\widget\ActionBarContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */