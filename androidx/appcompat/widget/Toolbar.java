package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import b.b.j;
import b.b.o.i.i;
import b.b.o.i.m;
import b.b.o.i.r;
import b.b.p.d0;
import b.b.p.d1;
import b.b.p.l;
import b.b.p.n;
import b.b.p.p0;
import b.b.p.x0;
import b.b.p.z;
import b.b.p.z0;
import b.i.m.l;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
  public ColorStateList A;
  
  public ColorStateList B;
  
  public boolean C;
  
  public boolean D;
  
  public final ArrayList<View> E = new ArrayList<View>();
  
  public final ArrayList<View> F = new ArrayList<View>();
  
  public final int[] G = new int[2];
  
  public f H;
  
  public final ActionMenuView.e I = new a(this);
  
  public z0 J;
  
  public b.b.p.c K;
  
  public d L;
  
  public boolean M;
  
  public final Runnable N = new b(this);
  
  public ActionMenuView b;
  
  public TextView c;
  
  public TextView d;
  
  public ImageButton e;
  
  public ImageView f;
  
  public Drawable g;
  
  public CharSequence h;
  
  public ImageButton i;
  
  public View j;
  
  public Context k;
  
  public int l;
  
  public int m;
  
  public int n;
  
  public int o;
  
  public int p;
  
  public int q;
  
  public int r;
  
  public int s;
  
  public int t;
  
  public p0 u;
  
  public int v;
  
  public int w;
  
  public int x = 8388627;
  
  public CharSequence y;
  
  public CharSequence z;
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.b.a.toolbarStyle);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    x0 x0 = x0.q(getContext(), paramAttributeSet, j.Toolbar, paramInt, 0);
    l.V((View)this, paramContext, j.Toolbar, paramAttributeSet, x0.b, paramInt, 0);
    this.m = x0.l(j.Toolbar_titleTextAppearance, 0);
    this.n = x0.l(j.Toolbar_subtitleTextAppearance, 0);
    int i = j.Toolbar_android_gravity;
    paramInt = this.x;
    this.x = x0.b.getInteger(i, paramInt);
    paramInt = j.Toolbar_buttonGravity;
    this.o = x0.b.getInteger(paramInt, 48);
    i = x0.e(j.Toolbar_titleMargin, 0);
    paramInt = i;
    if (x0.o(j.Toolbar_titleMargins))
      paramInt = x0.e(j.Toolbar_titleMargins, i); 
    this.t = paramInt;
    this.s = paramInt;
    this.r = paramInt;
    this.q = paramInt;
    paramInt = x0.e(j.Toolbar_titleMarginStart, -1);
    if (paramInt >= 0)
      this.q = paramInt; 
    paramInt = x0.e(j.Toolbar_titleMarginEnd, -1);
    if (paramInt >= 0)
      this.r = paramInt; 
    paramInt = x0.e(j.Toolbar_titleMarginTop, -1);
    if (paramInt >= 0)
      this.s = paramInt; 
    paramInt = x0.e(j.Toolbar_titleMarginBottom, -1);
    if (paramInt >= 0)
      this.t = paramInt; 
    this.p = x0.f(j.Toolbar_maxButtonHeight, -1);
    paramInt = x0.e(j.Toolbar_contentInsetStart, -2147483648);
    i = x0.e(j.Toolbar_contentInsetEnd, -2147483648);
    int k = x0.f(j.Toolbar_contentInsetLeft, 0);
    int j = x0.f(j.Toolbar_contentInsetRight, 0);
    d();
    p0 p01 = this.u;
    p01.h = false;
    if (k != Integer.MIN_VALUE) {
      p01.e = k;
      p01.a = k;
    } 
    if (j != Integer.MIN_VALUE) {
      p01.f = j;
      p01.b = j;
    } 
    if (paramInt != Integer.MIN_VALUE || i != Integer.MIN_VALUE)
      this.u.a(paramInt, i); 
    this.v = x0.e(j.Toolbar_contentInsetStartWithNavigation, -2147483648);
    this.w = x0.e(j.Toolbar_contentInsetEndWithActions, -2147483648);
    this.g = x0.g(j.Toolbar_collapseIcon);
    this.h = x0.n(j.Toolbar_collapseContentDescription);
    CharSequence charSequence3 = x0.n(j.Toolbar_title);
    if (!TextUtils.isEmpty(charSequence3))
      setTitle(charSequence3); 
    charSequence3 = x0.n(j.Toolbar_subtitle);
    if (!TextUtils.isEmpty(charSequence3))
      setSubtitle(charSequence3); 
    this.k = getContext();
    setPopupTheme(x0.l(j.Toolbar_popupTheme, 0));
    Drawable drawable2 = x0.g(j.Toolbar_navigationIcon);
    if (drawable2 != null)
      setNavigationIcon(drawable2); 
    CharSequence charSequence2 = x0.n(j.Toolbar_navigationContentDescription);
    if (!TextUtils.isEmpty(charSequence2))
      setNavigationContentDescription(charSequence2); 
    Drawable drawable1 = x0.g(j.Toolbar_logo);
    if (drawable1 != null)
      setLogo(drawable1); 
    CharSequence charSequence1 = x0.n(j.Toolbar_logoDescription);
    if (!TextUtils.isEmpty(charSequence1))
      setLogoDescription(charSequence1); 
    if (x0.o(j.Toolbar_titleTextColor))
      setTitleTextColor(x0.c(j.Toolbar_titleTextColor)); 
    if (x0.o(j.Toolbar_subtitleTextColor))
      setSubtitleTextColor(x0.c(j.Toolbar_subtitleTextColor)); 
    if (x0.o(j.Toolbar_menu)) {
      paramInt = x0.l(j.Toolbar_menu, 0);
      getMenuInflater().inflate(paramInt, getMenu());
    } 
    x0.b.recycle();
  }
  
  private MenuInflater getMenuInflater() {
    return (MenuInflater)new b.b.o.f(getContext());
  }
  
  public final void a(List<View> paramList, int paramInt) {
    int i = l.r((View)this);
    boolean bool = false;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    } 
    int k = getChildCount();
    int j = Gravity.getAbsoluteGravity(paramInt, getLayoutDirection());
    paramList.clear();
    paramInt = bool;
    if (i != 0) {
      for (paramInt = k - 1; paramInt >= 0; paramInt--) {
        View view = getChildAt(paramInt);
        e e1 = (e)view.getLayoutParams();
        if (e1.b == 0 && t(view) && j(e1.a) == j)
          paramList.add(view); 
      } 
    } else {
      while (paramInt < k) {
        View view = getChildAt(paramInt);
        e e1 = (e)view.getLayoutParams();
        if (e1.b == 0 && t(view) && j(e1.a) == j)
          paramList.add(view); 
        paramInt++;
      } 
    } 
  }
  
  public final void b(View paramView, boolean paramBoolean) {
    e e1;
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    if (layoutParams == null) {
      e1 = h();
    } else if (!checkLayoutParams((ViewGroup.LayoutParams)e1)) {
      e1 = i((ViewGroup.LayoutParams)e1);
    } else {
      e1 = e1;
    } 
    e1.b = 1;
    if (paramBoolean && this.j != null) {
      paramView.setLayoutParams((ViewGroup.LayoutParams)e1);
      this.F.add(paramView);
    } else {
      addView(paramView, (ViewGroup.LayoutParams)e1);
    } 
  }
  
  public void c() {
    if (this.i == null) {
      l l = new l(getContext(), null, b.b.a.toolbarNavigationButtonStyle);
      this.i = (ImageButton)l;
      l.setImageDrawable(this.g);
      this.i.setContentDescription(this.h);
      e e1 = h();
      e1.a = 0x800003 | this.o & 0x70;
      e1.b = 2;
      this.i.setLayoutParams((ViewGroup.LayoutParams)e1);
      this.i.setOnClickListener(new c(this));
    } 
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    boolean bool;
    if (super.checkLayoutParams(paramLayoutParams) && paramLayoutParams instanceof e) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final void d() {
    if (this.u == null)
      this.u = new p0(); 
  }
  
  public final void e() {
    f();
    ActionMenuView actionMenuView = this.b;
    if (actionMenuView.q == null) {
      b.b.o.i.g g = (b.b.o.i.g)actionMenuView.getMenu();
      if (this.L == null)
        this.L = new d(this); 
      this.b.setExpandedActionViewsExclusive(true);
      g.b(this.L, this.k);
    } 
  }
  
  public final void f() {
    if (this.b == null) {
      ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
      this.b = actionMenuView;
      actionMenuView.setPopupTheme(this.l);
      this.b.setOnMenuItemClickListener(this.I);
      actionMenuView = this.b;
      actionMenuView.v = null;
      actionMenuView.w = null;
      e e1 = h();
      e1.a = 0x800005 | this.o & 0x70;
      this.b.setLayoutParams((ViewGroup.LayoutParams)e1);
      b((View)this.b, false);
    } 
  }
  
  public final void g() {
    if (this.e == null) {
      this.e = (ImageButton)new l(getContext(), null, b.b.a.toolbarNavigationButtonStyle);
      e e1 = h();
      e1.a = 0x800003 | this.o & 0x70;
      this.e.setLayoutParams((ViewGroup.LayoutParams)e1);
    } 
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new e(getContext(), paramAttributeSet);
  }
  
  public CharSequence getCollapseContentDescription() {
    ImageButton imageButton = this.i;
    if (imageButton != null) {
      CharSequence charSequence = imageButton.getContentDescription();
    } else {
      imageButton = null;
    } 
    return (CharSequence)imageButton;
  }
  
  public Drawable getCollapseIcon() {
    ImageButton imageButton = this.i;
    if (imageButton != null) {
      Drawable drawable = imageButton.getDrawable();
    } else {
      imageButton = null;
    } 
    return (Drawable)imageButton;
  }
  
  public int getContentInsetEnd() {
    boolean bool;
    p0 p01 = this.u;
    if (p01 != null) {
      if (p01.g) {
        bool = p01.a;
      } else {
        bool = p01.b;
      } 
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int getContentInsetEndWithActions() {
    int i = this.w;
    if (i == Integer.MIN_VALUE)
      i = getContentInsetEnd(); 
    return i;
  }
  
  public int getContentInsetLeft() {
    boolean bool;
    p0 p01 = this.u;
    if (p01 != null) {
      bool = p01.a;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int getContentInsetRight() {
    boolean bool;
    p0 p01 = this.u;
    if (p01 != null) {
      bool = p01.b;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int getContentInsetStart() {
    boolean bool;
    p0 p01 = this.u;
    if (p01 != null) {
      if (p01.g) {
        bool = p01.b;
      } else {
        bool = p01.a;
      } 
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int getContentInsetStartWithNavigation() {
    int i = this.v;
    if (i == Integer.MIN_VALUE)
      i = getContentInsetStart(); 
    return i;
  }
  
  public int getCurrentContentInsetEnd() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Landroidx/appcompat/widget/ActionMenuView;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull -> 30
    //   9: aload_2
    //   10: getfield q : Lb/b/o/i/g;
    //   13: astore_2
    //   14: aload_2
    //   15: ifnull -> 30
    //   18: aload_2
    //   19: invokevirtual hasVisibleItems : ()Z
    //   22: ifeq -> 30
    //   25: iconst_1
    //   26: istore_1
    //   27: goto -> 32
    //   30: iconst_0
    //   31: istore_1
    //   32: iload_1
    //   33: ifeq -> 55
    //   36: aload_0
    //   37: invokevirtual getContentInsetEnd : ()I
    //   40: aload_0
    //   41: getfield w : I
    //   44: iconst_0
    //   45: invokestatic max : (II)I
    //   48: invokestatic max : (II)I
    //   51: istore_1
    //   52: goto -> 60
    //   55: aload_0
    //   56: invokevirtual getContentInsetEnd : ()I
    //   59: istore_1
    //   60: iload_1
    //   61: ireturn
  }
  
  public int getCurrentContentInsetLeft() {
    int i;
    if (l.r((View)this) == 1) {
      i = getCurrentContentInsetEnd();
    } else {
      i = getCurrentContentInsetStart();
    } 
    return i;
  }
  
  public int getCurrentContentInsetRight() {
    int i;
    if (l.r((View)this) == 1) {
      i = getCurrentContentInsetStart();
    } else {
      i = getCurrentContentInsetEnd();
    } 
    return i;
  }
  
  public int getCurrentContentInsetStart() {
    int i;
    if (getNavigationIcon() != null) {
      i = Math.max(getContentInsetStart(), Math.max(this.v, 0));
    } else {
      i = getContentInsetStart();
    } 
    return i;
  }
  
  public Drawable getLogo() {
    ImageView imageView = this.f;
    if (imageView != null) {
      Drawable drawable = imageView.getDrawable();
    } else {
      imageView = null;
    } 
    return (Drawable)imageView;
  }
  
  public CharSequence getLogoDescription() {
    ImageView imageView = this.f;
    if (imageView != null) {
      CharSequence charSequence = imageView.getContentDescription();
    } else {
      imageView = null;
    } 
    return (CharSequence)imageView;
  }
  
  public Menu getMenu() {
    e();
    return this.b.getMenu();
  }
  
  public CharSequence getNavigationContentDescription() {
    ImageButton imageButton = this.e;
    if (imageButton != null) {
      CharSequence charSequence = imageButton.getContentDescription();
    } else {
      imageButton = null;
    } 
    return (CharSequence)imageButton;
  }
  
  public Drawable getNavigationIcon() {
    ImageButton imageButton = this.e;
    if (imageButton != null) {
      Drawable drawable = imageButton.getDrawable();
    } else {
      imageButton = null;
    } 
    return (Drawable)imageButton;
  }
  
  public b.b.p.c getOuterActionMenuPresenter() {
    return this.K;
  }
  
  public Drawable getOverflowIcon() {
    e();
    return this.b.getOverflowIcon();
  }
  
  public Context getPopupContext() {
    return this.k;
  }
  
  public int getPopupTheme() {
    return this.l;
  }
  
  public CharSequence getSubtitle() {
    return this.z;
  }
  
  public final TextView getSubtitleTextView() {
    return this.d;
  }
  
  public CharSequence getTitle() {
    return this.y;
  }
  
  public int getTitleMarginBottom() {
    return this.t;
  }
  
  public int getTitleMarginEnd() {
    return this.r;
  }
  
  public int getTitleMarginStart() {
    return this.q;
  }
  
  public int getTitleMarginTop() {
    return this.s;
  }
  
  public final TextView getTitleTextView() {
    return this.c;
  }
  
  public d0 getWrapper() {
    if (this.J == null)
      this.J = new z0(this, true); 
    return (d0)this.J;
  }
  
  public e h() {
    return new e(-2, -2);
  }
  
  public e i(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof e) ? new e((e)paramLayoutParams) : ((paramLayoutParams instanceof b.b.k.a.a) ? new e((b.b.k.a.a)paramLayoutParams) : ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new e((ViewGroup.MarginLayoutParams)paramLayoutParams) : new e(paramLayoutParams)));
  }
  
  public final int j(int paramInt) {
    int i = l.r((View)this);
    int j = Gravity.getAbsoluteGravity(paramInt, i) & 0x7;
    if (j != 1) {
      paramInt = 3;
      if (j != 3 && j != 5) {
        if (i == 1)
          paramInt = 5; 
        return paramInt;
      } 
    } 
    return j;
  }
  
  public final int k(View paramView, int paramInt) {
    e e1 = (e)paramView.getLayoutParams();
    int k = paramView.getMeasuredHeight();
    if (paramInt > 0) {
      paramInt = (k - paramInt) / 2;
    } else {
      paramInt = 0;
    } 
    int j = e1.a & 0x70;
    int i = j;
    if (j != 16) {
      i = j;
      if (j != 48) {
        i = j;
        if (j != 80)
          i = this.x & 0x70; 
      } 
    } 
    if (i != 48) {
      if (i != 80) {
        j = getPaddingTop();
        int n = getPaddingBottom();
        int m = getHeight();
        i = (m - j - n - k) / 2;
        paramInt = ((ViewGroup.MarginLayoutParams)e1).topMargin;
        if (i >= paramInt) {
          m = m - n - k - i - j;
          k = ((ViewGroup.MarginLayoutParams)e1).bottomMargin;
          paramInt = i;
          if (m < k)
            paramInt = Math.max(0, i - k - m); 
        } 
        return j + paramInt;
      } 
      return getHeight() - getPaddingBottom() - k - ((ViewGroup.MarginLayoutParams)e1).bottomMargin - paramInt;
    } 
    return getPaddingTop() - paramInt;
  }
  
  public final int l(View paramView) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
  }
  
  public final int m(View paramView) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
  }
  
  public final boolean n(View paramView) {
    return (paramView.getParent() == this || this.F.contains(paramView));
  }
  
  public boolean o() {
    ActionMenuView actionMenuView = this.b;
    null = true;
    if (actionMenuView != null) {
      boolean bool;
      b.b.p.c c1 = actionMenuView.u;
      if (c1 != null && c1.m()) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool)
        return null; 
    } 
    return false;
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    removeCallbacks(this.N);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9)
      this.D = false; 
    if (!this.D) {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if (i == 9 && !bool)
        this.D = true; 
    } 
    if (i == 10 || i == 3)
      this.D = false; 
    return true;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool;
    if (l.r((View)this) == 1) {
      j = 1;
    } else {
      j = 0;
    } 
    int m = getWidth();
    int i2 = getHeight();
    int i = getPaddingLeft();
    int n = getPaddingRight();
    int i1 = getPaddingTop();
    int i3 = getPaddingBottom();
    int k = m - n;
    int[] arrayOfInt = this.G;
    arrayOfInt[1] = 0;
    arrayOfInt[0] = 0;
    paramInt1 = getMinimumHeight();
    if (paramInt1 >= 0) {
      bool = Math.min(paramInt1, paramInt4 - paramInt2);
    } else {
      bool = false;
    } 
    if (t((View)this.e)) {
      ImageButton imageButton = this.e;
      if (j) {
        paramInt3 = q((View)imageButton, k, arrayOfInt, bool);
        paramInt4 = i;
      } else {
        paramInt4 = p((View)imageButton, i, arrayOfInt, bool);
        paramInt3 = k;
      } 
    } else {
      paramInt4 = i;
      paramInt3 = k;
    } 
    paramInt2 = paramInt4;
    paramInt1 = paramInt3;
    if (t((View)this.i)) {
      ImageButton imageButton = this.i;
      if (j) {
        paramInt1 = q((View)imageButton, paramInt3, arrayOfInt, bool);
        paramInt2 = paramInt4;
      } else {
        paramInt2 = p((View)imageButton, paramInt4, arrayOfInt, bool);
        paramInt1 = paramInt3;
      } 
    } 
    paramInt4 = paramInt2;
    paramInt3 = paramInt1;
    if (t((View)this.b)) {
      ActionMenuView actionMenuView = this.b;
      if (j) {
        paramInt4 = p((View)actionMenuView, paramInt2, arrayOfInt, bool);
        paramInt3 = paramInt1;
      } else {
        paramInt3 = q((View)actionMenuView, paramInt1, arrayOfInt, bool);
        paramInt4 = paramInt2;
      } 
    } 
    paramInt2 = getCurrentContentInsetLeft();
    paramInt1 = getCurrentContentInsetRight();
    arrayOfInt[0] = Math.max(0, paramInt2 - paramInt4);
    arrayOfInt[1] = Math.max(0, paramInt1 - k - paramInt3);
    paramInt2 = Math.max(paramInt4, paramInt2);
    paramInt3 = Math.min(paramInt3, k - paramInt1);
    paramInt4 = paramInt2;
    paramInt1 = paramInt3;
    if (t(this.j)) {
      View view = this.j;
      if (j) {
        paramInt1 = q(view, paramInt3, arrayOfInt, bool);
        paramInt4 = paramInt2;
      } else {
        paramInt4 = p(view, paramInt2, arrayOfInt, bool);
        paramInt1 = paramInt3;
      } 
    } 
    paramInt2 = paramInt4;
    paramInt3 = paramInt1;
    if (t((View)this.f)) {
      ImageView imageView = this.f;
      if (j) {
        paramInt3 = q((View)imageView, paramInt1, arrayOfInt, bool);
        paramInt2 = paramInt4;
      } else {
        paramInt2 = p((View)imageView, paramInt4, arrayOfInt, bool);
        paramInt3 = paramInt1;
      } 
    } 
    paramBoolean = t((View)this.c);
    boolean bool1 = t((View)this.d);
    if (paramBoolean) {
      e e1 = (e)this.c.getLayoutParams();
      paramInt1 = ((ViewGroup.MarginLayoutParams)e1).topMargin;
      paramInt1 = this.c.getMeasuredHeight() + paramInt1 + ((ViewGroup.MarginLayoutParams)e1).bottomMargin + 0;
    } else {
      paramInt1 = 0;
    } 
    if (bool1) {
      e e1 = (e)this.d.getLayoutParams();
      paramInt4 = ((ViewGroup.MarginLayoutParams)e1).topMargin;
      paramInt1 += this.d.getMeasuredHeight() + paramInt4 + ((ViewGroup.MarginLayoutParams)e1).bottomMargin;
    } 
    if (paramBoolean || bool1) {
      TextView textView1;
      TextView textView2;
      if (paramBoolean) {
        textView1 = this.c;
      } else {
        textView1 = this.d;
      } 
      if (bool1) {
        textView2 = this.d;
      } else {
        textView2 = this.c;
      } 
      e e1 = (e)textView1.getLayoutParams();
      e e2 = (e)textView2.getLayoutParams();
      if ((paramBoolean && this.c.getMeasuredWidth() > 0) || (bool1 && this.d.getMeasuredWidth() > 0)) {
        paramInt4 = 1;
      } else {
        paramInt4 = 0;
      } 
      k = this.x & 0x70;
      if (k != 48) {
        if (k != 80) {
          k = (i2 - i1 - i3 - paramInt1) / 2;
          int i4 = ((ViewGroup.MarginLayoutParams)e1).topMargin;
          int i5 = this.s;
          if (k < i4 + i5) {
            paramInt1 = i4 + i5;
          } else {
            i3 = i2 - i3 - paramInt1 - k - i1;
            i2 = ((ViewGroup.MarginLayoutParams)e1).bottomMargin;
            i4 = this.t;
            paramInt1 = k;
            if (i3 < i2 + i4)
              paramInt1 = Math.max(0, k - ((ViewGroup.MarginLayoutParams)e2).bottomMargin + i4 - i3); 
          } 
          paramInt1 = i1 + paramInt1;
        } else {
          paramInt1 = i2 - i3 - ((ViewGroup.MarginLayoutParams)e2).bottomMargin - this.t - paramInt1;
        } 
      } else {
        paramInt1 = getPaddingTop() + ((ViewGroup.MarginLayoutParams)e1).topMargin + this.s;
      } 
      if (j) {
        if (paramInt4 != 0) {
          j = this.q;
        } else {
          j = 0;
        } 
        j -= arrayOfInt[1];
        paramInt3 -= Math.max(0, j);
        arrayOfInt[1] = Math.max(0, -j);
        if (paramBoolean) {
          e1 = (e)this.c.getLayoutParams();
          k = paramInt3 - this.c.getMeasuredWidth();
          j = this.c.getMeasuredHeight() + paramInt1;
          this.c.layout(k, paramInt1, paramInt3, j);
          paramInt1 = k - this.r;
          j += ((ViewGroup.MarginLayoutParams)e1).bottomMargin;
        } else {
          k = paramInt3;
          j = paramInt1;
          paramInt1 = k;
        } 
        if (bool1) {
          j += ((ViewGroup.MarginLayoutParams)this.d.getLayoutParams()).topMargin;
          k = this.d.getMeasuredWidth();
          i1 = this.d.getMeasuredHeight();
          this.d.layout(paramInt3 - k, j, paramInt3, i1 + j);
          j = paramInt3 - this.r;
        } else {
          j = paramInt3;
        } 
        if (paramInt4 != 0)
          paramInt3 = Math.min(paramInt1, j); 
        paramInt1 = paramInt2;
      } else {
        if (paramInt4 != 0) {
          j = this.q;
        } else {
          j = 0;
        } 
        j -= arrayOfInt[0];
        paramInt2 = Math.max(0, j) + paramInt2;
        arrayOfInt[0] = Math.max(0, -j);
        if (paramBoolean) {
          e1 = (e)this.c.getLayoutParams();
          k = this.c.getMeasuredWidth() + paramInt2;
          j = this.c.getMeasuredHeight() + paramInt1;
          this.c.layout(paramInt2, paramInt1, k, j);
          paramInt1 = k + this.r;
          k = j + ((ViewGroup.MarginLayoutParams)e1).bottomMargin;
        } else {
          j = paramInt2;
          k = paramInt1;
          paramInt1 = j;
        } 
        if (bool1) {
          j = k + ((ViewGroup.MarginLayoutParams)this.d.getLayoutParams()).topMargin;
          k = this.d.getMeasuredWidth() + paramInt2;
          i1 = this.d.getMeasuredHeight();
          this.d.layout(paramInt2, j, k, i1 + j);
          j = k + this.r;
        } else {
          j = paramInt2;
        } 
        if (paramInt4 != 0) {
          paramInt1 = Math.max(paramInt1, j);
        } else {
          paramInt1 = paramInt2;
        } 
      } 
    } else {
      paramInt1 = paramInt2;
    } 
    a(this.E, 3);
    paramInt4 = this.E.size();
    for (paramInt2 = 0; paramInt2 < paramInt4; paramInt2++)
      paramInt1 = p(this.E.get(paramInt2), paramInt1, arrayOfInt, bool); 
    a(this.E, 5);
    paramInt4 = this.E.size();
    for (paramInt2 = 0; paramInt2 < paramInt4; paramInt2++)
      paramInt3 = q(this.E.get(paramInt2), paramInt3, arrayOfInt, bool); 
    a(this.E, 1);
    ArrayList<View> arrayList = this.E;
    k = arrayOfInt[0];
    int j = arrayOfInt[1];
    i1 = arrayList.size();
    paramInt4 = 0;
    paramInt2 = 0;
    while (paramInt4 < i1) {
      View view = arrayList.get(paramInt4);
      e e1 = (e)view.getLayoutParams();
      k = ((ViewGroup.MarginLayoutParams)e1).leftMargin - k;
      j = ((ViewGroup.MarginLayoutParams)e1).rightMargin - j;
      i2 = Math.max(0, k);
      i3 = Math.max(0, j);
      k = Math.max(0, -k);
      j = Math.max(0, -j);
      paramInt2 += view.getMeasuredWidth() + i2 + i3;
      paramInt4++;
    } 
    paramInt4 = (m - i - n) / 2 + i - paramInt2 / 2;
    paramInt2 += paramInt4;
    if (paramInt4 >= paramInt1)
      if (paramInt2 > paramInt3) {
        paramInt1 = paramInt4 - paramInt2 - paramInt3;
      } else {
        paramInt1 = paramInt4;
      }  
    paramInt3 = this.E.size();
    paramInt2 = paramInt1;
    for (paramInt1 = 0; paramInt1 < paramInt3; paramInt1++)
      paramInt2 = p(this.E.get(paramInt1), paramInt2, arrayOfInt, bool); 
    this.E.clear();
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    int[] arrayOfInt = this.G;
    boolean bool = d1.b((View)this);
    boolean bool2 = true;
    boolean bool1 = false;
    if (bool) {
      i1 = 1;
      n = 0;
    } else {
      i1 = 0;
      n = 1;
    } 
    if (t((View)this.e)) {
      s((View)this.e, paramInt1, 0, paramInt2, 0, this.p);
      i = this.e.getMeasuredWidth();
      i = l((View)this.e) + i;
      int i4 = this.e.getMeasuredHeight();
      m = Math.max(0, m((View)this.e) + i4);
      k = View.combineMeasuredStates(0, this.e.getMeasuredState());
    } else {
      i = 0;
      m = 0;
      k = 0;
    } 
    int i2 = i;
    int j = m;
    int i = k;
    if (t((View)this.i)) {
      s((View)this.i, paramInt1, 0, paramInt2, 0, this.p);
      i = this.i.getMeasuredWidth();
      i2 = l((View)this.i) + i;
      i = this.i.getMeasuredHeight();
      j = Math.max(m, m((View)this.i) + i);
      i = View.combineMeasuredStates(k, this.i.getMeasuredState());
    } 
    int k = getCurrentContentInsetStart();
    int m = Math.max(k, i2) + 0;
    arrayOfInt[i1] = Math.max(0, k - i2);
    if (t((View)this.b)) {
      s((View)this.b, paramInt1, m, paramInt2, 0, this.p);
      k = this.b.getMeasuredWidth();
      k = l((View)this.b) + k;
      i1 = this.b.getMeasuredHeight();
      j = Math.max(j, m((View)this.b) + i1);
      i = View.combineMeasuredStates(i, this.b.getMeasuredState());
    } else {
      k = 0;
    } 
    int i1 = getCurrentContentInsetEnd();
    i2 = Math.max(i1, k) + m;
    arrayOfInt[n] = Math.max(0, i1 - k);
    i1 = i2;
    m = j;
    k = i;
    if (t(this.j)) {
      i1 = i2 + r(this.j, paramInt1, i2, paramInt2, 0, arrayOfInt);
      k = this.j.getMeasuredHeight();
      m = Math.max(j, m(this.j) + k);
      k = View.combineMeasuredStates(i, this.j.getMeasuredState());
    } 
    int n = i1;
    j = m;
    i = k;
    if (t((View)this.f)) {
      n = i1 + r((View)this.f, paramInt1, i1, paramInt2, 0, arrayOfInt);
      i = this.f.getMeasuredHeight();
      j = Math.max(m, m((View)this.f) + i);
      i = View.combineMeasuredStates(k, this.f.getMeasuredState());
    } 
    int i3 = getChildCount();
    k = 0;
    m = j;
    while (k < i3) {
      View view = getChildAt(k);
      i2 = n;
      i1 = m;
      j = i;
      if (((e)view.getLayoutParams()).b == 0)
        if (!t(view)) {
          i2 = n;
          i1 = m;
          j = i;
        } else {
          i2 = n + r(view, paramInt1, n, paramInt2, 0, arrayOfInt);
          j = view.getMeasuredHeight();
          i1 = Math.max(m, m(view) + j);
          j = View.combineMeasuredStates(i, view.getMeasuredState());
        }  
      k++;
      n = i2;
      m = i1;
      i = j;
    } 
    i1 = this.s + this.t;
    i2 = this.q + this.r;
    if (t((View)this.c)) {
      r((View)this.c, paramInt1, n + i2, paramInt2, i1, arrayOfInt);
      k = this.c.getMeasuredWidth();
      i3 = l((View)this.c);
      j = this.c.getMeasuredHeight();
      int i4 = m((View)this.c);
      i = View.combineMeasuredStates(i, this.c.getMeasuredState());
      j = i4 + j;
      k = i3 + k;
    } else {
      k = 0;
      j = 0;
    } 
    if (t((View)this.d)) {
      k = Math.max(k, r((View)this.d, paramInt1, n + i2, paramInt2, j + i1, arrayOfInt));
      i1 = this.d.getMeasuredHeight();
      j = m((View)this.d) + i1 + j;
      i = View.combineMeasuredStates(i, this.d.getMeasuredState());
    } 
    i2 = Math.max(m, j);
    i3 = getPaddingLeft();
    j = getPaddingRight();
    i1 = getPaddingTop();
    m = getPaddingBottom();
    j = View.resolveSizeAndState(Math.max(j + i3 + n + k, getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & i);
    i = View.resolveSizeAndState(Math.max(m + i1 + i2, getSuggestedMinimumHeight()), paramInt2, i << 16);
    if (this.M) {
      k = getChildCount();
      paramInt2 = 0;
      while (true) {
        paramInt1 = bool2;
        if (paramInt2 < k) {
          View view = getChildAt(paramInt2);
          if (!t(view) || view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            paramInt2++;
            continue;
          } 
        } else {
          break;
        } 
        paramInt1 = 0;
        break;
      } 
      if (paramInt1 != 0) {
        paramInt1 = bool1;
      } else {
        paramInt1 = i;
      } 
      setMeasuredDimension(j, paramInt1);
      return;
    } 
    paramInt1 = 0;
    break;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof g)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    g g = (g)paramParcelable;
    super.onRestoreInstanceState(g.b);
    ActionMenuView actionMenuView = this.b;
    if (actionMenuView != null) {
      b.b.o.i.g g1 = actionMenuView.q;
    } else {
      actionMenuView = null;
    } 
    int i = g.d;
    if (i != 0 && this.L != null && actionMenuView != null) {
      MenuItem menuItem = actionMenuView.findItem(i);
      if (menuItem != null)
        menuItem.expandActionView(); 
    } 
    if (g.e) {
      removeCallbacks(this.N);
      post(this.N);
    } 
  }
  
  public void onRtlPropertiesChanged(int paramInt) {
    super.onRtlPropertiesChanged(paramInt);
    d();
    p0 p01 = this.u;
    boolean bool = true;
    if (paramInt != 1)
      bool = false; 
    if (bool == p01.g)
      return; 
    p01.g = bool;
    if (p01.h) {
      if (bool) {
        paramInt = p01.d;
        if (paramInt == Integer.MIN_VALUE)
          paramInt = p01.e; 
        p01.a = paramInt;
        paramInt = p01.c;
        if (paramInt != Integer.MIN_VALUE) {
          p01.b = paramInt;
          return;
        } 
      } else {
        paramInt = p01.c;
        if (paramInt == Integer.MIN_VALUE)
          paramInt = p01.e; 
        p01.a = paramInt;
        paramInt = p01.d;
        if (paramInt != Integer.MIN_VALUE) {
          p01.b = paramInt;
          return;
        } 
      } 
    } else {
      p01.a = p01.e;
    } 
    paramInt = p01.f;
    p01.b = paramInt;
  }
  
  public Parcelable onSaveInstanceState() {
    g g = new g(super.onSaveInstanceState());
    d d1 = this.L;
    if (d1 != null) {
      i i = d1.c;
      if (i != null)
        g.d = i.a; 
    } 
    g.e = o();
    return (Parcelable)g;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      this.C = false; 
    if (!this.C) {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if (i == 0 && !bool)
        this.C = true; 
    } 
    if (i == 1 || i == 3)
      this.C = false; 
    return true;
  }
  
  public final int p(View paramView, int paramInt1, int[] paramArrayOfint, int paramInt2) {
    e e1 = (e)paramView.getLayoutParams();
    int i = ((ViewGroup.MarginLayoutParams)e1).leftMargin - paramArrayOfint[0];
    paramInt1 = Math.max(0, i) + paramInt1;
    paramArrayOfint[0] = Math.max(0, -i);
    i = k(paramView, paramInt2);
    paramInt2 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, i, paramInt1 + paramInt2, paramView.getMeasuredHeight() + i);
    return paramInt2 + ((ViewGroup.MarginLayoutParams)e1).rightMargin + paramInt1;
  }
  
  public final int q(View paramView, int paramInt1, int[] paramArrayOfint, int paramInt2) {
    e e1 = (e)paramView.getLayoutParams();
    int i = ((ViewGroup.MarginLayoutParams)e1).rightMargin - paramArrayOfint[1];
    paramInt1 -= Math.max(0, i);
    paramArrayOfint[1] = Math.max(0, -i);
    paramInt2 = k(paramView, paramInt2);
    i = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - i, paramInt2, paramInt1, paramView.getMeasuredHeight() + paramInt2);
    return paramInt1 - i + ((ViewGroup.MarginLayoutParams)e1).leftMargin;
  }
  
  public final int r(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int k = marginLayoutParams.leftMargin - paramArrayOfint[0];
    int j = marginLayoutParams.rightMargin - paramArrayOfint[1];
    int i = Math.max(0, k);
    i = Math.max(0, j) + i;
    paramArrayOfint[0] = Math.max(0, -k);
    paramArrayOfint[1] = Math.max(0, -j);
    j = getPaddingLeft();
    paramInt1 = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + j + i + paramInt2, marginLayoutParams.width);
    paramInt2 = getPaddingTop();
    paramView.measure(paramInt1, ViewGroup.getChildMeasureSpec(paramInt3, getPaddingBottom() + paramInt2 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + paramInt4, marginLayoutParams.height));
    return paramView.getMeasuredWidth() + i;
  }
  
  public final void s(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = getPaddingLeft();
    i = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + i + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + paramInt2, marginLayoutParams.width);
    paramInt1 = getPaddingTop();
    paramInt2 = ViewGroup.getChildMeasureSpec(paramInt3, getPaddingBottom() + paramInt1 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + paramInt4, marginLayoutParams.height);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = paramInt2;
    if (paramInt3 != 1073741824) {
      paramInt1 = paramInt2;
      if (paramInt5 >= 0) {
        paramInt1 = paramInt5;
        if (paramInt3 != 0)
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt2), paramInt5); 
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      } 
    } 
    paramView.measure(i, paramInt1);
  }
  
  public void setCollapseContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getContext().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setCollapseContentDescription(charSequence);
  }
  
  public void setCollapseContentDescription(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence))
      c(); 
    ImageButton imageButton = this.i;
    if (imageButton != null)
      imageButton.setContentDescription(paramCharSequence); 
  }
  
  public void setCollapseIcon(int paramInt) {
    setCollapseIcon(b.b.l.a.a.b(getContext(), paramInt));
  }
  
  public void setCollapseIcon(Drawable paramDrawable) {
    if (paramDrawable != null) {
      c();
      this.i.setImageDrawable(paramDrawable);
    } else {
      ImageButton imageButton = this.i;
      if (imageButton != null)
        imageButton.setImageDrawable(this.g); 
    } 
  }
  
  public void setCollapsible(boolean paramBoolean) {
    this.M = paramBoolean;
    requestLayout();
  }
  
  public void setContentInsetEndWithActions(int paramInt) {
    int i = paramInt;
    if (paramInt < 0)
      i = Integer.MIN_VALUE; 
    if (i != this.w) {
      this.w = i;
      if (getNavigationIcon() != null)
        requestLayout(); 
    } 
  }
  
  public void setContentInsetStartWithNavigation(int paramInt) {
    int i = paramInt;
    if (paramInt < 0)
      i = Integer.MIN_VALUE; 
    if (i != this.v) {
      this.v = i;
      if (getNavigationIcon() != null)
        requestLayout(); 
    } 
  }
  
  public void setLogo(int paramInt) {
    setLogo(b.b.l.a.a.b(getContext(), paramInt));
  }
  
  public void setLogo(Drawable paramDrawable) {
    if (paramDrawable != null) {
      if (this.f == null)
        this.f = (ImageView)new n(getContext(), null, 0); 
      if (!n((View)this.f))
        b((View)this.f, true); 
    } else {
      ImageView imageView1 = this.f;
      if (imageView1 != null && n((View)imageView1)) {
        removeView((View)this.f);
        this.F.remove(this.f);
      } 
    } 
    ImageView imageView = this.f;
    if (imageView != null)
      imageView.setImageDrawable(paramDrawable); 
  }
  
  public void setLogoDescription(int paramInt) {
    setLogoDescription(getContext().getText(paramInt));
  }
  
  public void setLogoDescription(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence) && this.f == null)
      this.f = (ImageView)new n(getContext(), null, 0); 
    ImageView imageView = this.f;
    if (imageView != null)
      imageView.setContentDescription(paramCharSequence); 
  }
  
  public void setNavigationContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getContext().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setNavigationContentDescription(charSequence);
  }
  
  public void setNavigationContentDescription(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence))
      g(); 
    ImageButton imageButton = this.e;
    if (imageButton != null)
      imageButton.setContentDescription(paramCharSequence); 
  }
  
  public void setNavigationIcon(int paramInt) {
    setNavigationIcon(b.b.l.a.a.b(getContext(), paramInt));
  }
  
  public void setNavigationIcon(Drawable paramDrawable) {
    if (paramDrawable != null) {
      g();
      if (!n((View)this.e))
        b((View)this.e, true); 
    } else {
      ImageButton imageButton1 = this.e;
      if (imageButton1 != null && n((View)imageButton1)) {
        removeView((View)this.e);
        this.F.remove(this.e);
      } 
    } 
    ImageButton imageButton = this.e;
    if (imageButton != null)
      imageButton.setImageDrawable(paramDrawable); 
  }
  
  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener) {
    g();
    this.e.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuItemClickListener(f paramf) {
    this.H = paramf;
  }
  
  public void setOverflowIcon(Drawable paramDrawable) {
    e();
    this.b.setOverflowIcon(paramDrawable);
  }
  
  public void setPopupTheme(int paramInt) {
    if (this.l != paramInt) {
      this.l = paramInt;
      if (paramInt == 0) {
        this.k = getContext();
      } else {
        this.k = (Context)new ContextThemeWrapper(getContext(), paramInt);
      } 
    } 
  }
  
  public void setSubtitle(int paramInt) {
    setSubtitle(getContext().getText(paramInt));
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      if (this.d == null) {
        Context context = getContext();
        z z = new z(context, null);
        this.d = (TextView)z;
        z.setSingleLine();
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        int i = this.n;
        if (i != 0)
          this.d.setTextAppearance(context, i); 
        ColorStateList colorStateList = this.B;
        if (colorStateList != null)
          this.d.setTextColor(colorStateList); 
      } 
      if (!n((View)this.d))
        b((View)this.d, true); 
    } else {
      TextView textView1 = this.d;
      if (textView1 != null && n((View)textView1)) {
        removeView((View)this.d);
        this.F.remove(this.d);
      } 
    } 
    TextView textView = this.d;
    if (textView != null)
      textView.setText(paramCharSequence); 
    this.z = paramCharSequence;
  }
  
  public void setSubtitleTextColor(int paramInt) {
    setSubtitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setSubtitleTextColor(ColorStateList paramColorStateList) {
    this.B = paramColorStateList;
    TextView textView = this.d;
    if (textView != null)
      textView.setTextColor(paramColorStateList); 
  }
  
  public void setTitle(int paramInt) {
    setTitle(getContext().getText(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      if (this.c == null) {
        Context context = getContext();
        z z = new z(context, null);
        this.c = (TextView)z;
        z.setSingleLine();
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        int i = this.m;
        if (i != 0)
          this.c.setTextAppearance(context, i); 
        ColorStateList colorStateList = this.A;
        if (colorStateList != null)
          this.c.setTextColor(colorStateList); 
      } 
      if (!n((View)this.c))
        b((View)this.c, true); 
    } else {
      TextView textView1 = this.c;
      if (textView1 != null && n((View)textView1)) {
        removeView((View)this.c);
        this.F.remove(this.c);
      } 
    } 
    TextView textView = this.c;
    if (textView != null)
      textView.setText(paramCharSequence); 
    this.y = paramCharSequence;
  }
  
  public void setTitleMarginBottom(int paramInt) {
    this.t = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginEnd(int paramInt) {
    this.r = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginStart(int paramInt) {
    this.q = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginTop(int paramInt) {
    this.s = paramInt;
    requestLayout();
  }
  
  public void setTitleTextColor(int paramInt) {
    setTitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setTitleTextColor(ColorStateList paramColorStateList) {
    this.A = paramColorStateList;
    TextView textView = this.c;
    if (textView != null)
      textView.setTextColor(paramColorStateList); 
  }
  
  public final boolean t(View paramView) {
    boolean bool;
    if (paramView != null && paramView.getParent() == this && paramView.getVisibility() != 8) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean u() {
    ActionMenuView actionMenuView = this.b;
    null = true;
    if (actionMenuView != null) {
      boolean bool;
      b.b.p.c c1 = actionMenuView.u;
      if (c1 != null && c1.n()) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool)
        return null; 
    } 
    return false;
  }
  
  public class a implements ActionMenuView.e {
    public final Toolbar a;
    
    public a(Toolbar this$0) {}
  }
  
  public class b implements Runnable {
    public final Toolbar b;
    
    public b(Toolbar this$0) {}
    
    public void run() {
      this.b.u();
    }
  }
  
  public class c implements View.OnClickListener {
    public final Toolbar b;
    
    public c(Toolbar this$0) {}
    
    public void onClick(View param1View) {
      i i;
      Toolbar.d d = this.b.L;
      if (d == null) {
        d = null;
      } else {
        i = d.c;
      } 
      if (i != null)
        i.collapseActionView(); 
    }
  }
  
  public class d implements m {
    public b.b.o.i.g b;
    
    public i c;
    
    public final Toolbar d;
    
    public d(Toolbar this$0) {}
    
    public void b(b.b.o.i.g param1g, boolean param1Boolean) {}
    
    public boolean c(b.b.o.i.g param1g, i param1i) {
      this.d.c();
      ViewParent viewParent = this.d.i.getParent();
      Toolbar toolbar2 = this.d;
      if (viewParent != toolbar2) {
        if (viewParent instanceof ViewGroup)
          ((ViewGroup)viewParent).removeView((View)toolbar2.i); 
        Toolbar toolbar = this.d;
        toolbar.addView((View)toolbar.i);
      } 
      this.d.j = param1i.getActionView();
      this.c = param1i;
      viewParent = this.d.j.getParent();
      toolbar2 = this.d;
      if (viewParent != toolbar2) {
        if (viewParent instanceof ViewGroup)
          ((ViewGroup)viewParent).removeView(toolbar2.j); 
        Toolbar.e e = this.d.h();
        toolbar2 = this.d;
        e.a = 0x800003 | toolbar2.o & 0x70;
        e.b = 2;
        toolbar2.j.setLayoutParams((ViewGroup.LayoutParams)e);
        Toolbar toolbar = this.d;
        toolbar.addView(toolbar.j);
      } 
      Toolbar toolbar1 = this.d;
      int j = toolbar1.getChildCount();
      while (true) {
        int k = j - 1;
        if (k >= 0) {
          View view1 = toolbar1.getChildAt(k);
          j = k;
          if (((Toolbar.e)view1.getLayoutParams()).b != 2) {
            j = k;
            if (view1 != toolbar1.b) {
              toolbar1.removeViewAt(k);
              toolbar1.F.add(view1);
              j = k;
            } 
          } 
          continue;
        } 
        this.d.requestLayout();
        param1i.C = true;
        param1i.n.q(false);
        View view = this.d.j;
        if (view instanceof b.b.o.b)
          ((b.b.o.b)view).a(); 
        return true;
      } 
    }
    
    public void d(m.a param1a) {}
    
    public boolean f(r param1r) {
      return false;
    }
    
    public boolean g() {
      return false;
    }
    
    public void h(boolean param1Boolean) {
      if (this.c != null) {
        b.b.o.i.g g1 = this.b;
        boolean bool2 = false;
        boolean bool1 = bool2;
        if (g1 != null) {
          int j = g1.size();
          byte b = 0;
          while (true) {
            bool1 = bool2;
            if (b < j) {
              if (this.b.getItem(b) == this.c) {
                bool1 = true;
                break;
              } 
              b++;
              continue;
            } 
            break;
          } 
        } 
        if (!bool1)
          k(this.b, this.c); 
      } 
    }
    
    public void j(Context param1Context, b.b.o.i.g param1g) {
      b.b.o.i.g g1 = this.b;
      if (g1 != null) {
        i i1 = this.c;
        if (i1 != null)
          g1.d(i1); 
      } 
      this.b = param1g;
    }
    
    public boolean k(b.b.o.i.g param1g, i param1i) {
      View view = this.d.j;
      if (view instanceof b.b.o.b)
        ((b.b.o.b)view).f(); 
      Toolbar toolbar = this.d;
      toolbar.removeView(toolbar.j);
      toolbar = this.d;
      toolbar.removeView((View)toolbar.i);
      toolbar = this.d;
      toolbar.j = null;
      int j = toolbar.F.size();
      while (--j >= 0)
        toolbar.addView(toolbar.F.get(j)); 
      toolbar.F.clear();
      this.c = null;
      this.d.requestLayout();
      param1i.C = false;
      param1i.n.q(false);
      return true;
    }
  }
  
  public static class e extends b.b.k.a.a {
    public int b = 0;
    
    public e(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.a = 8388627;
    }
    
    public e(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public e(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public e(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super((ViewGroup.LayoutParams)param1MarginLayoutParams);
      ((ViewGroup.MarginLayoutParams)this).leftMargin = param1MarginLayoutParams.leftMargin;
      ((ViewGroup.MarginLayoutParams)this).topMargin = param1MarginLayoutParams.topMargin;
      ((ViewGroup.MarginLayoutParams)this).rightMargin = param1MarginLayoutParams.rightMargin;
      ((ViewGroup.MarginLayoutParams)this).bottomMargin = param1MarginLayoutParams.bottomMargin;
    }
    
    public e(e param1e) {
      super(param1e);
      this.b = param1e.b;
    }
    
    public e(b.b.k.a.a param1a) {
      super(param1a);
    }
  }
  
  public static interface f {
    boolean onMenuItemClick(MenuItem param1MenuItem);
  }
  
  public static class g extends b.k.a.a {
    public static final Parcelable.Creator<g> CREATOR = (Parcelable.Creator<g>)new a();
    
    public int d;
    
    public boolean e;
    
    public g(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      boolean bool;
      this.d = param1Parcel.readInt();
      if (param1Parcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.e = bool;
    }
    
    public g(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeParcelable(this.b, param1Int);
      param1Parcel.writeInt(this.d);
      param1Parcel.writeInt(this.e);
    }
    
    public class a implements Parcelable.ClassLoaderCreator<g> {
      public Object createFromParcel(Parcel param2Parcel) {
        return new Toolbar.g(param2Parcel, null);
      }
      
      public Object createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new Toolbar.g(param2Parcel, param2ClassLoader);
      }
      
      public Object[] newArray(int param2Int) {
        return (Object[])new Toolbar.g[param2Int];
      }
    }
  }
  
  public class a implements Parcelable.ClassLoaderCreator<g> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new Toolbar.g(param1Parcel, null);
    }
    
    public Object createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new Toolbar.g(param1Parcel, param1ClassLoader);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new Toolbar.g[param1Int];
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\appcompat\widget\Toolbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */