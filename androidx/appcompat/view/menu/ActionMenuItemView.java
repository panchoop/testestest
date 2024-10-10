package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import b.b.j;
import b.b.o.i.g;
import b.b.o.i.i;
import b.b.o.i.k;
import b.b.o.i.n;
import b.b.o.i.p;
import b.b.p.c;
import b.b.p.h0;
import b.b.p.z;

public class ActionMenuItemView extends z implements n.a, View.OnClickListener, ActionMenuView.a {
  public i f;
  
  public CharSequence g;
  
  public Drawable h;
  
  public g.b i;
  
  public h0 j;
  
  public b k;
  
  public boolean l;
  
  public boolean m;
  
  public int n;
  
  public int o;
  
  public int p;
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 0);
    Resources resources = paramContext.getResources();
    this.l = f();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.ActionMenuItemView, 0, 0);
    this.n = typedArray.getDimensionPixelSize(j.ActionMenuItemView_android_minWidth, 0);
    typedArray.recycle();
    this.p = (int)((resources.getDisplayMetrics()).density * 32.0F + 0.5F);
    setOnClickListener(this);
    this.o = -1;
    setSaveEnabled(false);
  }
  
  public boolean a() {
    boolean bool;
    if (d() && this.f.getIcon() == null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean b() {
    return d();
  }
  
  public boolean c() {
    return true;
  }
  
  public boolean d() {
    return TextUtils.isEmpty(getText()) ^ true;
  }
  
  public void e(i parami, int paramInt) {
    CharSequence charSequence;
    this.f = parami;
    setIcon(parami.getIcon());
    if (super.c()) {
      charSequence = parami.getTitleCondensed();
    } else {
      charSequence = parami.e;
    } 
    setTitle(charSequence);
    setId(parami.a);
    if (parami.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    } 
    setVisibility(paramInt);
    setEnabled(parami.isEnabled());
    if (parami.hasSubMenu() && this.j == null)
      this.j = new a(this); 
  }
  
  public final boolean f() {
    Configuration configuration = getContext().getResources().getConfiguration();
    int j = configuration.screenWidthDp;
    int k = configuration.screenHeightDp;
    return (j >= 480 || (j >= 640 && k >= 480) || configuration.orientation == 2);
  }
  
  public final void g() {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Ljava/lang/CharSequence;
    //   4: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   7: istore_3
    //   8: iconst_1
    //   9: istore_2
    //   10: iload_2
    //   11: istore_1
    //   12: aload_0
    //   13: getfield h : Landroid/graphics/drawable/Drawable;
    //   16: ifnull -> 66
    //   19: aload_0
    //   20: getfield f : Lb/b/o/i/i;
    //   23: getfield y : I
    //   26: iconst_4
    //   27: iand
    //   28: iconst_4
    //   29: if_icmpne -> 37
    //   32: iconst_1
    //   33: istore_1
    //   34: goto -> 39
    //   37: iconst_0
    //   38: istore_1
    //   39: iload_1
    //   40: ifeq -> 64
    //   43: iload_2
    //   44: istore_1
    //   45: aload_0
    //   46: getfield l : Z
    //   49: ifne -> 66
    //   52: aload_0
    //   53: getfield m : Z
    //   56: ifeq -> 64
    //   59: iload_2
    //   60: istore_1
    //   61: goto -> 66
    //   64: iconst_0
    //   65: istore_1
    //   66: iload_3
    //   67: iconst_1
    //   68: ixor
    //   69: iload_1
    //   70: iand
    //   71: istore_1
    //   72: aconst_null
    //   73: astore #5
    //   75: iload_1
    //   76: ifeq -> 88
    //   79: aload_0
    //   80: getfield g : Ljava/lang/CharSequence;
    //   83: astore #4
    //   85: goto -> 91
    //   88: aconst_null
    //   89: astore #4
    //   91: aload_0
    //   92: aload #4
    //   94: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   97: aload_0
    //   98: getfield f : Lb/b/o/i/i;
    //   101: getfield q : Ljava/lang/CharSequence;
    //   104: astore #6
    //   106: aload #6
    //   108: astore #4
    //   110: aload #6
    //   112: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   115: ifeq -> 137
    //   118: iload_1
    //   119: ifeq -> 128
    //   122: aconst_null
    //   123: astore #4
    //   125: goto -> 137
    //   128: aload_0
    //   129: getfield f : Lb/b/o/i/i;
    //   132: getfield e : Ljava/lang/CharSequence;
    //   135: astore #4
    //   137: aload_0
    //   138: aload #4
    //   140: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   143: aload_0
    //   144: getfield f : Lb/b/o/i/i;
    //   147: getfield r : Ljava/lang/CharSequence;
    //   150: astore #4
    //   152: aload #4
    //   154: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   157: ifeq -> 189
    //   160: iload_1
    //   161: ifeq -> 171
    //   164: aload #5
    //   166: astore #4
    //   168: goto -> 180
    //   171: aload_0
    //   172: getfield f : Lb/b/o/i/i;
    //   175: getfield e : Ljava/lang/CharSequence;
    //   178: astore #4
    //   180: aload_0
    //   181: aload #4
    //   183: invokestatic w0 : (Landroid/view/View;Ljava/lang/CharSequence;)V
    //   186: goto -> 195
    //   189: aload_0
    //   190: aload #4
    //   192: invokestatic w0 : (Landroid/view/View;Ljava/lang/CharSequence;)V
    //   195: return
  }
  
  public i getItemData() {
    return this.f;
  }
  
  public void onClick(View paramView) {
    g.b b1 = this.i;
    if (b1 != null)
      b1.b(this.f); 
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    this.l = f();
    g();
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    boolean bool = d();
    if (bool) {
      int m = this.o;
      if (m >= 0)
        super.setPadding(m, getPaddingTop(), getPaddingRight(), getPaddingBottom()); 
    } 
    super.onMeasure(paramInt1, paramInt2);
    int j = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int k = getMeasuredWidth();
    if (j == Integer.MIN_VALUE) {
      paramInt1 = Math.min(paramInt1, this.n);
    } else {
      paramInt1 = this.n;
    } 
    if (j != 1073741824 && this.n > 0 && k < paramInt1)
      super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2); 
    if (!bool && this.h != null)
      super.setPadding((getMeasuredWidth() - this.h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom()); 
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    super.onRestoreInstanceState(null);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (this.f.hasSubMenu()) {
      h0 h01 = this.j;
      if (h01 != null && h01.onTouch((View)this, paramMotionEvent))
        return true; 
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setCheckable(boolean paramBoolean) {}
  
  public void setChecked(boolean paramBoolean) {}
  
  public void setExpandedFormat(boolean paramBoolean) {
    if (this.m != paramBoolean) {
      this.m = paramBoolean;
      i i1 = this.f;
      if (i1 != null)
        i1.n.p(); 
    } 
  }
  
  public void setIcon(Drawable paramDrawable) {
    this.h = paramDrawable;
    if (paramDrawable != null) {
      int n = paramDrawable.getIntrinsicWidth();
      int i1 = paramDrawable.getIntrinsicHeight();
      int m = this.p;
      int k = n;
      int j = i1;
      if (n > m) {
        float f = m / n;
        j = (int)(i1 * f);
        k = m;
      } 
      i1 = this.p;
      n = k;
      m = j;
      if (j > i1) {
        float f = i1 / j;
        n = (int)(k * f);
        m = i1;
      } 
      paramDrawable.setBounds(0, 0, n, m);
    } 
    setCompoundDrawables(paramDrawable, null, null, null);
    g();
  }
  
  public void setItemInvoker(g.b paramb) {
    this.i = paramb;
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.o = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setPopupCallback(b paramb) {
    this.k = paramb;
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.g = paramCharSequence;
    g();
  }
  
  public class a extends h0 {
    public final ActionMenuItemView k;
    
    public a(ActionMenuItemView this$0) {
      super((View)this$0);
    }
    
    public p b() {
      ActionMenuItemView.b b = this.k.k;
      k k2 = null;
      k k1 = k2;
      if (b != null) {
        c.a a1 = ((c.b)b).a.v;
        k1 = k2;
        if (a1 != null)
          k1 = a1.a(); 
      } 
      return (p)k1;
    }
    
    public boolean c() {
      ActionMenuItemView actionMenuItemView = this.k;
      g.b b = actionMenuItemView.i;
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (b != null) {
        bool1 = bool2;
        if (b.b(actionMenuItemView.f)) {
          p p = b();
          bool1 = bool2;
          if (p != null) {
            bool1 = bool2;
            if (p.a())
              bool1 = true; 
          } 
        } 
      } 
      return bool1;
    }
  }
  
  public static abstract class b {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\appcompat\view\menu\ActionMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */