package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.b.f;
import b.b.g;
import b.b.p.a;
import b.b.p.c;
import b.b.p.d1;

public class ActionBarContextView extends a {
  public CharSequence j;
  
  public CharSequence k;
  
  public View l;
  
  public View m;
  
  public LinearLayout n;
  
  public TextView o;
  
  public TextView p;
  
  public int q;
  
  public int r;
  
  public boolean s;
  
  public int t;
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet) {
    // Byte code:
    //   0: getstatic b/b/a.actionModeStyle : I
    //   3: istore_3
    //   4: aload_0
    //   5: aload_1
    //   6: aload_2
    //   7: iload_3
    //   8: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   11: aload_1
    //   12: aload_2
    //   13: getstatic b/b/j.ActionMode : [I
    //   16: iload_3
    //   17: iconst_0
    //   18: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   21: astore_2
    //   22: getstatic b/b/j.ActionMode_background : I
    //   25: istore #4
    //   27: aload_2
    //   28: iload #4
    //   30: invokevirtual hasValue : (I)Z
    //   33: ifeq -> 57
    //   36: aload_2
    //   37: iload #4
    //   39: iconst_0
    //   40: invokevirtual getResourceId : (II)I
    //   43: istore_3
    //   44: iload_3
    //   45: ifeq -> 57
    //   48: aload_1
    //   49: iload_3
    //   50: invokestatic b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   53: astore_1
    //   54: goto -> 64
    //   57: aload_2
    //   58: iload #4
    //   60: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   63: astore_1
    //   64: aload_0
    //   65: aload_1
    //   66: invokestatic Z : (Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    //   69: aload_0
    //   70: aload_2
    //   71: getstatic b/b/j.ActionMode_titleTextStyle : I
    //   74: iconst_0
    //   75: invokevirtual getResourceId : (II)I
    //   78: putfield q : I
    //   81: aload_0
    //   82: aload_2
    //   83: getstatic b/b/j.ActionMode_subtitleTextStyle : I
    //   86: iconst_0
    //   87: invokevirtual getResourceId : (II)I
    //   90: putfield r : I
    //   93: aload_0
    //   94: aload_2
    //   95: getstatic b/b/j.ActionMode_height : I
    //   98: iconst_0
    //   99: invokevirtual getLayoutDimension : (II)I
    //   102: putfield f : I
    //   105: aload_0
    //   106: aload_2
    //   107: getstatic b/b/j.ActionMode_closeItemLayout : I
    //   110: getstatic b/b/g.abc_action_mode_close_item_material : I
    //   113: invokevirtual getResourceId : (II)I
    //   116: putfield t : I
    //   119: aload_2
    //   120: invokevirtual recycle : ()V
    //   123: return
  }
  
  public void f(b.b.o.a parama) {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : Landroid/view/View;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnonnull -> 34
    //   9: aload_0
    //   10: invokevirtual getContext : ()Landroid/content/Context;
    //   13: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   16: aload_0
    //   17: getfield t : I
    //   20: aload_0
    //   21: iconst_0
    //   22: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   25: astore_2
    //   26: aload_0
    //   27: aload_2
    //   28: putfield l : Landroid/view/View;
    //   31: goto -> 46
    //   34: aload_2
    //   35: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   38: ifnonnull -> 51
    //   41: aload_0
    //   42: getfield l : Landroid/view/View;
    //   45: astore_2
    //   46: aload_0
    //   47: aload_2
    //   48: invokevirtual addView : (Landroid/view/View;)V
    //   51: aload_0
    //   52: getfield l : Landroid/view/View;
    //   55: getstatic b/b/f.action_mode_close_button : I
    //   58: invokevirtual findViewById : (I)Landroid/view/View;
    //   61: new androidx/appcompat/widget/ActionBarContextView$a
    //   64: dup
    //   65: aload_0
    //   66: aload_1
    //   67: invokespecial <init> : (Landroidx/appcompat/widget/ActionBarContextView;Lb/b/o/a;)V
    //   70: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   73: aload_1
    //   74: invokevirtual e : ()Landroid/view/Menu;
    //   77: checkcast b/b/o/i/g
    //   80: astore_2
    //   81: aload_0
    //   82: getfield e : Lb/b/p/c;
    //   85: astore_1
    //   86: aload_1
    //   87: ifnull -> 95
    //   90: aload_1
    //   91: invokevirtual e : ()Z
    //   94: pop
    //   95: new b/b/p/c
    //   98: dup
    //   99: aload_0
    //   100: invokevirtual getContext : ()Landroid/content/Context;
    //   103: invokespecial <init> : (Landroid/content/Context;)V
    //   106: astore_1
    //   107: aload_0
    //   108: aload_1
    //   109: putfield e : Lb/b/p/c;
    //   112: aload_1
    //   113: iconst_1
    //   114: putfield m : Z
    //   117: aload_1
    //   118: iconst_1
    //   119: putfield n : Z
    //   122: new android/view/ViewGroup$LayoutParams
    //   125: dup
    //   126: bipush #-2
    //   128: iconst_m1
    //   129: invokespecial <init> : (II)V
    //   132: astore_1
    //   133: aload_2
    //   134: aload_0
    //   135: getfield e : Lb/b/p/c;
    //   138: aload_0
    //   139: getfield c : Landroid/content/Context;
    //   142: invokevirtual b : (Lb/b/o/i/m;Landroid/content/Context;)V
    //   145: aload_0
    //   146: getfield e : Lb/b/p/c;
    //   149: astore_3
    //   150: aload_3
    //   151: getfield i : Lb/b/o/i/n;
    //   154: astore_2
    //   155: aload_2
    //   156: ifnonnull -> 199
    //   159: aload_3
    //   160: getfield e : Landroid/view/LayoutInflater;
    //   163: aload_3
    //   164: getfield g : I
    //   167: aload_0
    //   168: iconst_0
    //   169: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   172: checkcast b/b/o/i/n
    //   175: astore #4
    //   177: aload_3
    //   178: aload #4
    //   180: putfield i : Lb/b/o/i/n;
    //   183: aload #4
    //   185: aload_3
    //   186: getfield d : Lb/b/o/i/g;
    //   189: invokeinterface d : (Lb/b/o/i/g;)V
    //   194: aload_3
    //   195: iconst_1
    //   196: invokevirtual h : (Z)V
    //   199: aload_3
    //   200: getfield i : Lb/b/o/i/n;
    //   203: astore #4
    //   205: aload_2
    //   206: aload #4
    //   208: if_acmpeq -> 220
    //   211: aload #4
    //   213: checkcast androidx/appcompat/widget/ActionMenuView
    //   216: aload_3
    //   217: invokevirtual setPresenter : (Lb/b/p/c;)V
    //   220: aload #4
    //   222: checkcast androidx/appcompat/widget/ActionMenuView
    //   225: astore_2
    //   226: aload_0
    //   227: aload_2
    //   228: putfield d : Landroidx/appcompat/widget/ActionMenuView;
    //   231: aload_2
    //   232: aconst_null
    //   233: invokestatic Z : (Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
    //   236: aload_0
    //   237: aload_0
    //   238: getfield d : Landroidx/appcompat/widget/ActionMenuView;
    //   241: aload_1
    //   242: invokevirtual addView : (Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    //   245: return
  }
  
  public final void g() {
    if (this.n == null) {
      LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, (ViewGroup)this);
      LinearLayout linearLayout1 = (LinearLayout)getChildAt(getChildCount() - 1);
      this.n = linearLayout1;
      this.o = (TextView)linearLayout1.findViewById(f.action_bar_title);
      this.p = (TextView)this.n.findViewById(f.action_bar_subtitle);
      if (this.q != 0)
        this.o.setTextAppearance(getContext(), this.q); 
      if (this.r != 0)
        this.p.setTextAppearance(getContext(), this.r); 
    } 
    this.o.setText(this.j);
    this.p.setText(this.k);
    boolean bool1 = TextUtils.isEmpty(this.j);
    int i = TextUtils.isEmpty(this.k) ^ true;
    TextView textView = this.p;
    boolean bool = false;
    if (i != 0) {
      b = 0;
    } else {
      b = 8;
    } 
    textView.setVisibility(b);
    LinearLayout linearLayout = this.n;
    byte b = bool;
    if ((bool1 ^ true) == 0)
      if (i != 0) {
        b = bool;
      } else {
        b = 8;
      }  
    linearLayout.setVisibility(b);
    if (this.n.getParent() == null)
      addView((View)this.n); 
  }
  
  public ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(-1, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  public CharSequence getSubtitle() {
    return this.k;
  }
  
  public CharSequence getTitle() {
    return this.j;
  }
  
  public void h() {
    removeAllViews();
    this.m = null;
    this.d = null;
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    c c = this.e;
    if (c != null) {
      c.i();
      this.e.l();
    } 
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    if (paramAccessibilityEvent.getEventType() == 32) {
      paramAccessibilityEvent.setSource((View)this);
      paramAccessibilityEvent.setClassName(ActionBarContextView.class.getName());
      paramAccessibilityEvent.setPackageName(getContext().getPackageName());
      paramAccessibilityEvent.setContentDescription(this.j);
    } else {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    } 
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i;
    paramBoolean = d1.b((View)this);
    if (paramBoolean) {
      i = paramInt3 - paramInt1 - getPaddingRight();
    } else {
      i = getPaddingLeft();
    } 
    int j = getPaddingTop();
    int k = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    View view2 = this.l;
    paramInt2 = i;
    if (view2 != null) {
      paramInt2 = i;
      if (view2.getVisibility() != 8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.l.getLayoutParams();
        if (paramBoolean) {
          paramInt4 = marginLayoutParams.rightMargin;
        } else {
          paramInt4 = marginLayoutParams.leftMargin;
        } 
        if (paramBoolean) {
          paramInt2 = marginLayoutParams.leftMargin;
        } else {
          paramInt2 = marginLayoutParams.rightMargin;
        } 
        if (paramBoolean) {
          paramInt4 = i - paramInt4;
        } else {
          paramInt4 = i + paramInt4;
        } 
        paramInt4 += d(this.l, paramInt4, j, k, paramBoolean);
        if (paramBoolean) {
          paramInt2 = paramInt4 - paramInt2;
        } else {
          paramInt2 = paramInt4 + paramInt2;
        } 
      } 
    } 
    LinearLayout linearLayout = this.n;
    paramInt4 = paramInt2;
    if (linearLayout != null) {
      paramInt4 = paramInt2;
      if (this.m == null) {
        paramInt4 = paramInt2;
        if (linearLayout.getVisibility() != 8)
          paramInt4 = paramInt2 + d((View)this.n, paramInt2, j, k, paramBoolean); 
      } 
    } 
    View view1 = this.m;
    if (view1 != null)
      d(view1, paramInt4, j, k, paramBoolean); 
    if (paramBoolean) {
      paramInt1 = getPaddingLeft();
    } else {
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
    } 
    ActionMenuView actionMenuView = this.d;
    if (actionMenuView != null)
      d((View)actionMenuView, paramInt1, j, k, paramBoolean ^ true); 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = 1073741824;
    if (i == 1073741824) {
      if (View.MeasureSpec.getMode(paramInt2) != 0) {
        int n = View.MeasureSpec.getSize(paramInt1);
        i = this.f;
        if (i <= 0)
          i = View.MeasureSpec.getSize(paramInt2); 
        paramInt1 = getPaddingTop();
        int i1 = getPaddingBottom() + paramInt1;
        paramInt1 = n - getPaddingLeft() - getPaddingRight();
        int m = i - i1;
        int k = View.MeasureSpec.makeMeasureSpec(m, -2147483648);
        View view2 = this.l;
        boolean bool = false;
        paramInt2 = paramInt1;
        if (view2 != null) {
          paramInt1 = c(view2, paramInt1, k, 0);
          ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.l.getLayoutParams();
          paramInt2 = paramInt1 - marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        } 
        ActionMenuView actionMenuView = this.d;
        paramInt1 = paramInt2;
        if (actionMenuView != null) {
          paramInt1 = paramInt2;
          if (actionMenuView.getParent() == this)
            paramInt1 = c((View)this.d, paramInt2, k, 0); 
        } 
        LinearLayout linearLayout = this.n;
        paramInt2 = paramInt1;
        if (linearLayout != null) {
          paramInt2 = paramInt1;
          if (this.m == null)
            if (this.s) {
              paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
              this.n.measure(paramInt2, k);
              int i2 = this.n.getMeasuredWidth();
              if (i2 <= paramInt1) {
                k = 1;
              } else {
                k = 0;
              } 
              paramInt2 = paramInt1;
              if (k != 0)
                paramInt2 = paramInt1 - i2; 
              linearLayout = this.n;
              if (k != 0) {
                paramInt1 = 0;
              } else {
                paramInt1 = 8;
              } 
              linearLayout.setVisibility(paramInt1);
            } else {
              paramInt2 = c((View)linearLayout, paramInt1, k, 0);
            }  
        } 
        View view1 = this.m;
        if (view1 != null) {
          ViewGroup.LayoutParams layoutParams = view1.getLayoutParams();
          if (layoutParams.width != -2) {
            paramInt1 = 1073741824;
          } else {
            paramInt1 = Integer.MIN_VALUE;
          } 
          int i2 = layoutParams.width;
          k = paramInt2;
          if (i2 >= 0)
            k = Math.min(i2, paramInt2); 
          if (layoutParams.height != -2) {
            paramInt2 = j;
          } else {
            paramInt2 = Integer.MIN_VALUE;
          } 
          i2 = layoutParams.height;
          j = m;
          if (i2 >= 0)
            j = Math.min(i2, m); 
          this.m.measure(View.MeasureSpec.makeMeasureSpec(k, paramInt1), View.MeasureSpec.makeMeasureSpec(j, paramInt2));
        } 
        if (this.f <= 0) {
          j = getChildCount();
          paramInt1 = 0;
          paramInt2 = bool;
          while (true) {
            i = paramInt1;
            if (paramInt2 < j) {
              k = getChildAt(paramInt2).getMeasuredHeight() + i1;
              i = paramInt1;
              if (k > paramInt1)
                i = k; 
              paramInt2++;
              paramInt1 = i;
              continue;
            } 
            break;
          } 
        } 
        setMeasuredDimension(n, i);
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(ActionBarContextView.class.getSimpleName());
      stringBuilder1.append(" can only be used with android:layout_height=\"wrap_content\"");
      throw new IllegalStateException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(ActionBarContextView.class.getSimpleName());
    stringBuilder.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public void setContentHeight(int paramInt) {
    this.f = paramInt;
  }
  
  public void setCustomView(View paramView) {
    View view = this.m;
    if (view != null)
      removeView(view); 
    this.m = paramView;
    if (paramView != null) {
      LinearLayout linearLayout = this.n;
      if (linearLayout != null) {
        removeView((View)linearLayout);
        this.n = null;
      } 
    } 
    if (paramView != null)
      addView(paramView); 
    requestLayout();
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {
    this.k = paramCharSequence;
    g();
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.j = paramCharSequence;
    g();
  }
  
  public void setTitleOptional(boolean paramBoolean) {
    if (paramBoolean != this.s)
      requestLayout(); 
    this.s = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState() {
    return false;
  }
  
  public class a implements View.OnClickListener {
    public final b.b.o.a b;
    
    public a(ActionBarContextView this$0, b.b.o.a param1a) {}
    
    public void onClick(View param1View) {
      this.b.c();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\appcompat\widget\ActionBarContextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */