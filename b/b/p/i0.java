package b.b.p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import b.b.j;
import b.i.m.l;

public class i0 extends ViewGroup {
  public boolean b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public float h;
  
  public boolean i;
  
  public int[] j;
  
  public int[] k;
  
  public Drawable l;
  
  public int m;
  
  public int n;
  
  public int o;
  
  public int p;
  
  public i0(Context paramContext) {
    this(paramContext, null);
  }
  
  public i0(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public i0(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: iconst_1
    //   9: putfield b : Z
    //   12: aload_0
    //   13: iconst_m1
    //   14: putfield c : I
    //   17: aload_0
    //   18: iconst_0
    //   19: putfield d : I
    //   22: aload_0
    //   23: ldc 8388659
    //   25: putfield f : I
    //   28: aload_1
    //   29: aload_2
    //   30: getstatic b/b/j.LinearLayoutCompat : [I
    //   33: iload_3
    //   34: iconst_0
    //   35: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   38: astore #6
    //   40: aload_0
    //   41: aload_1
    //   42: getstatic b/b/j.LinearLayoutCompat : [I
    //   45: aload_2
    //   46: aload #6
    //   48: iload_3
    //   49: iconst_0
    //   50: invokestatic V : (Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V
    //   53: aload #6
    //   55: getstatic b/b/j.LinearLayoutCompat_android_orientation : I
    //   58: iconst_m1
    //   59: invokevirtual getInt : (II)I
    //   62: istore_3
    //   63: iload_3
    //   64: iflt -> 72
    //   67: aload_0
    //   68: iload_3
    //   69: invokevirtual setOrientation : (I)V
    //   72: aload #6
    //   74: getstatic b/b/j.LinearLayoutCompat_android_gravity : I
    //   77: iconst_m1
    //   78: invokevirtual getInt : (II)I
    //   81: istore_3
    //   82: iload_3
    //   83: iflt -> 91
    //   86: aload_0
    //   87: iload_3
    //   88: invokevirtual setGravity : (I)V
    //   91: aload #6
    //   93: getstatic b/b/j.LinearLayoutCompat_android_baselineAligned : I
    //   96: iconst_1
    //   97: invokevirtual getBoolean : (IZ)Z
    //   100: istore #5
    //   102: iload #5
    //   104: ifne -> 113
    //   107: aload_0
    //   108: iload #5
    //   110: invokevirtual setBaselineAligned : (Z)V
    //   113: aload_0
    //   114: aload #6
    //   116: getstatic b/b/j.LinearLayoutCompat_android_weightSum : I
    //   119: ldc -1.0
    //   121: invokevirtual getFloat : (IF)F
    //   124: putfield h : F
    //   127: aload_0
    //   128: aload #6
    //   130: getstatic b/b/j.LinearLayoutCompat_android_baselineAlignedChildIndex : I
    //   133: iconst_m1
    //   134: invokevirtual getInt : (II)I
    //   137: putfield c : I
    //   140: aload_0
    //   141: aload #6
    //   143: getstatic b/b/j.LinearLayoutCompat_measureWithLargestChild : I
    //   146: iconst_0
    //   147: invokevirtual getBoolean : (IZ)Z
    //   150: putfield i : Z
    //   153: getstatic b/b/j.LinearLayoutCompat_divider : I
    //   156: istore #4
    //   158: aload #6
    //   160: iload #4
    //   162: invokevirtual hasValue : (I)Z
    //   165: ifeq -> 190
    //   168: aload #6
    //   170: iload #4
    //   172: iconst_0
    //   173: invokevirtual getResourceId : (II)I
    //   176: istore_3
    //   177: iload_3
    //   178: ifeq -> 190
    //   181: aload_1
    //   182: iload_3
    //   183: invokestatic b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   186: astore_1
    //   187: goto -> 198
    //   190: aload #6
    //   192: iload #4
    //   194: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   197: astore_1
    //   198: aload_0
    //   199: aload_1
    //   200: invokevirtual setDividerDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   203: aload_0
    //   204: aload #6
    //   206: getstatic b/b/j.LinearLayoutCompat_showDividers : I
    //   209: iconst_0
    //   210: invokevirtual getInt : (II)I
    //   213: putfield o : I
    //   216: aload_0
    //   217: aload #6
    //   219: getstatic b/b/j.LinearLayoutCompat_dividerPadding : I
    //   222: iconst_0
    //   223: invokevirtual getDimensionPixelSize : (II)I
    //   226: putfield p : I
    //   229: aload #6
    //   231: invokevirtual recycle : ()V
    //   234: return
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof a;
  }
  
  public void g(Canvas paramCanvas, int paramInt) {
    this.l.setBounds(getPaddingLeft() + this.p, paramInt, getWidth() - getPaddingRight() - this.p, this.n + paramInt);
    this.l.draw(paramCanvas);
  }
  
  public int getBaseline() {
    if (this.c < 0)
      return super.getBaseline(); 
    int i = getChildCount();
    int j = this.c;
    if (i > j) {
      View view = getChildAt(j);
      int k = view.getBaseline();
      if (k == -1) {
        if (this.c == 0)
          return -1; 
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
      } 
      j = this.d;
      i = j;
      if (this.e == 1) {
        int m = this.f & 0x70;
        i = j;
        if (m != 48)
          if (m != 16) {
            if (m != 80) {
              i = j;
            } else {
              i = getBottom() - getTop() - getPaddingBottom() - this.g;
            } 
          } else {
            i = j + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - this.g) / 2;
          }  
      } 
      return i + ((a)view.getLayoutParams()).topMargin + k;
    } 
    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
  }
  
  public int getBaselineAlignedChildIndex() {
    return this.c;
  }
  
  public Drawable getDividerDrawable() {
    return this.l;
  }
  
  public int getDividerPadding() {
    return this.p;
  }
  
  public int getDividerWidth() {
    return this.m;
  }
  
  public int getGravity() {
    return this.f;
  }
  
  public int getOrientation() {
    return this.e;
  }
  
  public int getShowDividers() {
    return this.o;
  }
  
  public int getVirtualChildCount() {
    return getChildCount();
  }
  
  public float getWeightSum() {
    return this.h;
  }
  
  public void h(Canvas paramCanvas, int paramInt) {
    this.l.setBounds(paramInt, getPaddingTop() + this.p, this.m + paramInt, getHeight() - getPaddingBottom() - this.p);
    this.l.draw(paramCanvas);
  }
  
  public a i() {
    int i = this.e;
    return (i == 0) ? new a(-2, -2) : ((i == 1) ? new a(-1, -2) : null);
  }
  
  public a j(AttributeSet paramAttributeSet) {
    return new a(getContext(), paramAttributeSet);
  }
  
  public a k(ViewGroup.LayoutParams paramLayoutParams) {
    return new a(paramLayoutParams);
  }
  
  public int l() {
    return 0;
  }
  
  public int m() {
    return 0;
  }
  
  public int n() {
    return 0;
  }
  
  public boolean o(int paramInt) {
    boolean bool3 = false;
    boolean bool2 = false;
    boolean bool1 = false;
    if (paramInt == 0) {
      if ((this.o & 0x1) != 0)
        bool1 = true; 
      return bool1;
    } 
    if (paramInt == getChildCount()) {
      bool1 = bool3;
      if ((this.o & 0x4) != 0)
        bool1 = true; 
      return bool1;
    } 
    bool1 = bool2;
    if ((this.o & 0x2) != 0) {
      paramInt--;
      while (true) {
        bool1 = bool2;
        if (paramInt >= 0) {
          if (getChildAt(paramInt).getVisibility() != 8) {
            bool1 = true;
            break;
          } 
          paramInt--;
          continue;
        } 
        break;
      } 
    } 
    return bool1;
  }
  
  public void onDraw(Canvas paramCanvas) {
    if (this.l == null)
      return; 
    int k = this.e;
    int i = 0;
    int j = 0;
    if (k == 1) {
      k = getVirtualChildCount();
      for (i = j; i < k; i++) {
        View view = getChildAt(i);
        if (view != null && view.getVisibility() != 8 && o(i)) {
          a a = (a)view.getLayoutParams();
          g(paramCanvas, view.getTop() - a.topMargin - this.n);
        } 
      } 
      if (o(k)) {
        View view = getChildAt(k - 1);
        if (view == null) {
          i = getHeight() - getPaddingBottom() - this.n;
        } else {
          a a = (a)view.getLayoutParams();
          i = view.getBottom() + a.bottomMargin;
        } 
        g(paramCanvas, i);
      } 
    } else {
      k = getVirtualChildCount();
      boolean bool = d1.b((View)this);
      while (i < k) {
        View view = getChildAt(i);
        if (view != null && view.getVisibility() != 8 && o(i)) {
          a a = (a)view.getLayoutParams();
          if (bool) {
            j = view.getRight() + a.rightMargin;
          } else {
            j = view.getLeft() - a.leftMargin - this.m;
          } 
          h(paramCanvas, j);
        } 
        i++;
      } 
      if (o(k)) {
        View view = getChildAt(k - 1);
        if (view == null) {
          if (bool) {
            i = getPaddingLeft();
          } else {
            i = getWidth();
            j = getPaddingRight();
            i = i - j - this.m;
          } 
        } else {
          a a = (a)view.getLayoutParams();
          if (bool) {
            i = view.getLeft();
            j = a.leftMargin;
          } else {
            i = view.getRight() + a.rightMargin;
            h(paramCanvas, i);
          } 
          i = i - j - this.m;
        } 
      } else {
        return;
      } 
      h(paramCanvas, i);
    } 
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.e == 1) {
      int i = getPaddingLeft();
      int n = paramInt3 - paramInt1;
      int k = getPaddingRight();
      int j = getPaddingRight();
      int m = getVirtualChildCount();
      int i1 = this.f;
      paramInt1 = i1 & 0x70;
      if (paramInt1 != 16) {
        if (paramInt1 != 80) {
          paramInt2 = getPaddingTop();
        } else {
          paramInt2 = getPaddingTop() + paramInt4 - paramInt2 - this.g;
        } 
      } else {
        paramInt2 = getPaddingTop() + (paramInt4 - paramInt2 - this.g) / 2;
      } 
      paramInt1 = 0;
      while (paramInt1 < m) {
        View view = getChildAt(paramInt1);
        if (view == null) {
          paramInt2 = q() + paramInt2;
        } else {
          paramInt3 = paramInt2;
          paramInt4 = paramInt1;
          if (view.getVisibility() != 8) {
            int i3 = view.getMeasuredWidth();
            int i2 = view.getMeasuredHeight();
            a a = (a)view.getLayoutParams();
            paramInt4 = a.b;
            paramInt3 = paramInt4;
            if (paramInt4 < 0)
              paramInt3 = 0x800007 & i1; 
            paramInt3 = Gravity.getAbsoluteGravity(paramInt3, l.r((View)this)) & 0x7;
            if (paramInt3 != 1) {
              if (paramInt3 != 5) {
                paramInt3 = a.leftMargin + i;
              } else {
                paramInt3 = n - k - i3;
                paramInt3 -= a.rightMargin;
              } 
            } else {
              paramInt3 = (n - i - j - i3) / 2 + i + a.leftMargin;
              paramInt3 -= a.rightMargin;
            } 
            paramInt4 = paramInt2;
            if (o(paramInt1))
              paramInt4 = paramInt2 + this.n; 
            paramInt2 = paramInt4 + a.topMargin;
            paramInt4 = m() + paramInt2;
            view.layout(paramInt3, paramInt4, i3 + paramInt3, i2 + paramInt4);
            paramInt3 = a.bottomMargin;
            paramInt2 = n() + i2 + paramInt3 + paramInt2;
            paramInt1 = l() + paramInt1;
          } else {
            continue;
          } 
        } 
        paramInt4 = paramInt1;
        paramInt3 = paramInt2;
        continue;
        paramInt1 = paramInt4 + 1;
        paramInt2 = paramInt3;
      } 
    } else {
      byte b1;
      byte b2;
      boolean bool = d1.b((View)this);
      int j = getPaddingTop();
      int k = paramInt4 - paramInt2;
      int m = getPaddingBottom();
      int n = getPaddingBottom();
      int i = getVirtualChildCount();
      paramInt2 = this.f;
      paramInt4 = paramInt2 & 0x70;
      paramBoolean = this.b;
      int[] arrayOfInt2 = this.j;
      int[] arrayOfInt1 = this.k;
      paramInt2 = Gravity.getAbsoluteGravity(0x800007 & paramInt2, getLayoutDirection());
      if (paramInt2 != 1) {
        if (paramInt2 != 5) {
          paramInt3 = getPaddingLeft();
        } else {
          paramInt3 = getPaddingLeft() + paramInt3 - paramInt1 - this.g;
        } 
      } else {
        paramInt3 = getPaddingLeft() + (paramInt3 - paramInt1 - this.g) / 2;
      } 
      if (bool) {
        b2 = i - 1;
        paramInt2 = 0;
        b1 = -1;
      } else {
        paramInt2 = 0;
        b1 = 1;
        b2 = 0;
      } 
      while (paramInt2 < i) {
        int i1 = b1 * paramInt2 + b2;
        View view = getChildAt(i1);
        if (view == null) {
          paramInt1 = q() + paramInt3;
        } else {
          paramInt1 = paramInt3;
          if (view.getVisibility() != 8) {
            int i4 = view.getMeasuredWidth();
            int i5 = view.getMeasuredHeight();
            a a = (a)view.getLayoutParams();
            if (paramBoolean && a.height != -1) {
              i2 = view.getBaseline();
            } else {
              i2 = -1;
            } 
            int i3 = a.b;
            paramInt1 = i3;
            if (i3 < 0)
              paramInt1 = paramInt4; 
            paramInt1 &= 0x70;
            if (paramInt1 != 16) {
              if (paramInt1 != 48) {
                if (paramInt1 != 80) {
                  paramInt1 = j;
                } else {
                  i3 = k - m - i5 - a.bottomMargin;
                  paramInt1 = i3;
                  if (i2 != -1) {
                    paramInt1 = view.getMeasuredHeight();
                    paramInt1 = i3 - arrayOfInt1[2] - paramInt1 - i2;
                  } 
                } 
              } else {
                i3 = a.topMargin + j;
                paramInt1 = i3;
                if (i2 != -1)
                  paramInt1 = arrayOfInt2[1] - i2 + i3; 
              } 
            } else {
              paramInt1 = (k - j - n - i5) / 2 + j + a.topMargin - a.bottomMargin;
            } 
            int i2 = paramInt3;
            if (o(i1))
              i2 = paramInt3 + this.m; 
            paramInt3 = i2 + a.leftMargin;
            i2 = m() + paramInt3;
            view.layout(i2, paramInt1, i4 + i2, i5 + paramInt1);
            paramInt1 = a.rightMargin;
            paramInt3 += n() + i4 + paramInt1;
            paramInt2 = l() + paramInt2;
            continue;
          } 
        } 
        paramInt3 = paramInt1;
        continue;
        paramInt2++;
      } 
    } 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : I
    //   4: iconst_1
    //   5: if_icmpne -> 1672
    //   8: aload_0
    //   9: iconst_0
    //   10: putfield g : I
    //   13: aload_0
    //   14: invokevirtual getVirtualChildCount : ()I
    //   17: istore #18
    //   19: iload_1
    //   20: invokestatic getMode : (I)I
    //   23: istore #6
    //   25: iload_2
    //   26: invokestatic getMode : (I)I
    //   29: istore #13
    //   31: aload_0
    //   32: getfield c : I
    //   35: istore #19
    //   37: aload_0
    //   38: getfield i : Z
    //   41: istore #25
    //   43: iconst_0
    //   44: istore #16
    //   46: iconst_0
    //   47: istore #12
    //   49: iconst_0
    //   50: istore #8
    //   52: iconst_0
    //   53: istore #9
    //   55: iconst_0
    //   56: istore #10
    //   58: fconst_0
    //   59: fstore_3
    //   60: iconst_0
    //   61: istore #15
    //   63: iconst_1
    //   64: istore #7
    //   66: iconst_0
    //   67: istore #11
    //   69: iconst_0
    //   70: istore #14
    //   72: iload #16
    //   74: iload #18
    //   76: if_icmpge -> 629
    //   79: aload_0
    //   80: iload #16
    //   82: invokevirtual getChildAt : (I)Landroid/view/View;
    //   85: astore #27
    //   87: aload #27
    //   89: ifnonnull -> 112
    //   92: aload_0
    //   93: getfield g : I
    //   96: istore #17
    //   98: aload_0
    //   99: aload_0
    //   100: invokevirtual q : ()I
    //   103: iload #17
    //   105: iadd
    //   106: putfield g : I
    //   109: goto -> 131
    //   112: aload #27
    //   114: invokevirtual getVisibility : ()I
    //   117: bipush #8
    //   119: if_icmpne -> 138
    //   122: iload #16
    //   124: aload_0
    //   125: invokevirtual l : ()I
    //   128: iadd
    //   129: istore #16
    //   131: iload #6
    //   133: istore #17
    //   135: goto -> 623
    //   138: aload_0
    //   139: iload #16
    //   141: invokevirtual o : (I)Z
    //   144: ifeq -> 160
    //   147: aload_0
    //   148: aload_0
    //   149: getfield g : I
    //   152: aload_0
    //   153: getfield n : I
    //   156: iadd
    //   157: putfield g : I
    //   160: aload #27
    //   162: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   165: checkcast b/b/p/i0$a
    //   168: astore #28
    //   170: aload #28
    //   172: getfield a : F
    //   175: fstore #4
    //   177: fload_3
    //   178: fload #4
    //   180: fadd
    //   181: fstore_3
    //   182: iload #13
    //   184: ldc_w 1073741824
    //   187: if_icmpne -> 240
    //   190: aload #28
    //   192: getfield height : I
    //   195: ifne -> 240
    //   198: fload #4
    //   200: fconst_0
    //   201: fcmpl
    //   202: ifle -> 240
    //   205: aload_0
    //   206: getfield g : I
    //   209: istore #15
    //   211: aload_0
    //   212: iload #15
    //   214: aload #28
    //   216: getfield topMargin : I
    //   219: iload #15
    //   221: iadd
    //   222: aload #28
    //   224: getfield bottomMargin : I
    //   227: iadd
    //   228: invokestatic max : (II)I
    //   231: putfield g : I
    //   234: iconst_1
    //   235: istore #15
    //   237: goto -> 394
    //   240: aload #28
    //   242: getfield height : I
    //   245: ifne -> 271
    //   248: aload #28
    //   250: getfield a : F
    //   253: fconst_0
    //   254: fcmpl
    //   255: ifle -> 271
    //   258: aload #28
    //   260: bipush #-2
    //   262: putfield height : I
    //   265: iconst_0
    //   266: istore #17
    //   268: goto -> 276
    //   271: ldc_w -2147483648
    //   274: istore #17
    //   276: fload_3
    //   277: fconst_0
    //   278: fcmpl
    //   279: ifne -> 291
    //   282: aload_0
    //   283: getfield g : I
    //   286: istore #20
    //   288: goto -> 294
    //   291: iconst_0
    //   292: istore #20
    //   294: aload_0
    //   295: aload #27
    //   297: iload_1
    //   298: iconst_0
    //   299: iload_2
    //   300: iload #20
    //   302: invokevirtual p : (Landroid/view/View;IIII)V
    //   305: iload #17
    //   307: ldc_w -2147483648
    //   310: if_icmpeq -> 320
    //   313: aload #28
    //   315: iload #17
    //   317: putfield height : I
    //   320: aload #27
    //   322: invokevirtual getMeasuredHeight : ()I
    //   325: istore #20
    //   327: aload_0
    //   328: getfield g : I
    //   331: istore #21
    //   333: aload #28
    //   335: getfield topMargin : I
    //   338: istore #22
    //   340: aload #28
    //   342: getfield bottomMargin : I
    //   345: istore #17
    //   347: aload_0
    //   348: iload #21
    //   350: aload_0
    //   351: invokevirtual n : ()I
    //   354: iload #21
    //   356: iload #20
    //   358: iadd
    //   359: iload #22
    //   361: iadd
    //   362: iload #17
    //   364: iadd
    //   365: iadd
    //   366: invokestatic max : (II)I
    //   369: putfield g : I
    //   372: iload #8
    //   374: istore #17
    //   376: iload #25
    //   378: ifeq -> 390
    //   381: iload #20
    //   383: iload #8
    //   385: invokestatic max : (II)I
    //   388: istore #17
    //   390: iload #17
    //   392: istore #8
    //   394: iload #19
    //   396: iflt -> 416
    //   399: iload #19
    //   401: iload #16
    //   403: iconst_1
    //   404: iadd
    //   405: if_icmpne -> 416
    //   408: aload_0
    //   409: aload_0
    //   410: getfield g : I
    //   413: putfield d : I
    //   416: iload #16
    //   418: iload #19
    //   420: if_icmpge -> 447
    //   423: aload #28
    //   425: getfield a : F
    //   428: fconst_0
    //   429: fcmpl
    //   430: ifgt -> 436
    //   433: goto -> 447
    //   436: new java/lang/RuntimeException
    //   439: dup
    //   440: ldc_w 'A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.'
    //   443: invokespecial <init> : (Ljava/lang/String;)V
    //   446: athrow
    //   447: iload #6
    //   449: istore #17
    //   451: iload #17
    //   453: ldc_w 1073741824
    //   456: if_icmpeq -> 477
    //   459: aload #28
    //   461: getfield width : I
    //   464: iconst_m1
    //   465: if_icmpne -> 477
    //   468: iconst_1
    //   469: istore #17
    //   471: iconst_1
    //   472: istore #11
    //   474: goto -> 480
    //   477: iconst_0
    //   478: istore #17
    //   480: aload #28
    //   482: getfield leftMargin : I
    //   485: aload #28
    //   487: getfield rightMargin : I
    //   490: iadd
    //   491: istore #20
    //   493: aload #27
    //   495: invokevirtual getMeasuredWidth : ()I
    //   498: iload #20
    //   500: iadd
    //   501: istore #21
    //   503: iload #10
    //   505: iload #21
    //   507: invokestatic max : (II)I
    //   510: istore #22
    //   512: iload #14
    //   514: aload #27
    //   516: invokevirtual getMeasuredState : ()I
    //   519: invokestatic combineMeasuredStates : (II)I
    //   522: istore #14
    //   524: iload #7
    //   526: ifeq -> 544
    //   529: aload #28
    //   531: getfield width : I
    //   534: iconst_m1
    //   535: if_icmpne -> 544
    //   538: iconst_1
    //   539: istore #7
    //   541: goto -> 547
    //   544: iconst_0
    //   545: istore #7
    //   547: aload #28
    //   549: getfield a : F
    //   552: fconst_0
    //   553: fcmpl
    //   554: ifle -> 581
    //   557: iload #17
    //   559: ifeq -> 565
    //   562: goto -> 569
    //   565: iload #21
    //   567: istore #20
    //   569: iload #12
    //   571: iload #20
    //   573: invokestatic max : (II)I
    //   576: istore #10
    //   578: goto -> 606
    //   581: iload #17
    //   583: ifeq -> 589
    //   586: goto -> 593
    //   589: iload #21
    //   591: istore #20
    //   593: iload #9
    //   595: iload #20
    //   597: invokestatic max : (II)I
    //   600: istore #9
    //   602: iload #12
    //   604: istore #10
    //   606: iload #16
    //   608: aload_0
    //   609: invokevirtual l : ()I
    //   612: iadd
    //   613: istore #16
    //   615: iload #10
    //   617: istore #12
    //   619: iload #22
    //   621: istore #10
    //   623: iinc #16, 1
    //   626: goto -> 72
    //   629: iload #9
    //   631: istore #17
    //   633: aload_0
    //   634: getfield g : I
    //   637: ifle -> 662
    //   640: aload_0
    //   641: iload #18
    //   643: invokevirtual o : (I)Z
    //   646: ifeq -> 662
    //   649: aload_0
    //   650: aload_0
    //   651: getfield g : I
    //   654: aload_0
    //   655: getfield n : I
    //   658: iadd
    //   659: putfield g : I
    //   662: iload #25
    //   664: ifeq -> 811
    //   667: iload #13
    //   669: ldc_w -2147483648
    //   672: if_icmpeq -> 680
    //   675: iload #13
    //   677: ifne -> 811
    //   680: aload_0
    //   681: iconst_0
    //   682: putfield g : I
    //   685: iconst_0
    //   686: istore #9
    //   688: iload #9
    //   690: iload #18
    //   692: if_icmpge -> 811
    //   695: aload_0
    //   696: iload #9
    //   698: invokevirtual getChildAt : (I)Landroid/view/View;
    //   701: astore #27
    //   703: aload #27
    //   705: ifnonnull -> 728
    //   708: aload_0
    //   709: getfield g : I
    //   712: istore #16
    //   714: aload_0
    //   715: aload_0
    //   716: invokevirtual q : ()I
    //   719: iload #16
    //   721: iadd
    //   722: putfield g : I
    //   725: goto -> 805
    //   728: aload #27
    //   730: invokevirtual getVisibility : ()I
    //   733: bipush #8
    //   735: if_icmpne -> 750
    //   738: iload #9
    //   740: aload_0
    //   741: invokevirtual l : ()I
    //   744: iadd
    //   745: istore #9
    //   747: goto -> 805
    //   750: aload #27
    //   752: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   755: checkcast b/b/p/i0$a
    //   758: astore #27
    //   760: aload_0
    //   761: getfield g : I
    //   764: istore #20
    //   766: aload #27
    //   768: getfield topMargin : I
    //   771: istore #16
    //   773: aload #27
    //   775: getfield bottomMargin : I
    //   778: istore #19
    //   780: aload_0
    //   781: iload #20
    //   783: aload_0
    //   784: invokevirtual n : ()I
    //   787: iload #20
    //   789: iload #8
    //   791: iadd
    //   792: iload #16
    //   794: iadd
    //   795: iload #19
    //   797: iadd
    //   798: iadd
    //   799: invokestatic max : (II)I
    //   802: putfield g : I
    //   805: iinc #9, 1
    //   808: goto -> 688
    //   811: aload_0
    //   812: getfield g : I
    //   815: istore #9
    //   817: aload_0
    //   818: invokevirtual getPaddingTop : ()I
    //   821: istore #16
    //   823: aload_0
    //   824: invokevirtual getPaddingBottom : ()I
    //   827: iload #16
    //   829: iadd
    //   830: iload #9
    //   832: iadd
    //   833: istore #9
    //   835: aload_0
    //   836: iload #9
    //   838: putfield g : I
    //   841: iload #9
    //   843: aload_0
    //   844: invokevirtual getSuggestedMinimumHeight : ()I
    //   847: invokestatic max : (II)I
    //   850: iload_2
    //   851: iconst_0
    //   852: invokestatic resolveSizeAndState : (III)I
    //   855: istore #19
    //   857: ldc_w 16777215
    //   860: iload #19
    //   862: iand
    //   863: aload_0
    //   864: getfield g : I
    //   867: isub
    //   868: istore #9
    //   870: iload #15
    //   872: ifne -> 1044
    //   875: iload #9
    //   877: ifeq -> 889
    //   880: fload_3
    //   881: fconst_0
    //   882: fcmpl
    //   883: ifle -> 889
    //   886: goto -> 1044
    //   889: iload #17
    //   891: iload #12
    //   893: invokestatic max : (II)I
    //   896: istore #17
    //   898: iload #17
    //   900: istore #9
    //   902: iload #10
    //   904: istore #12
    //   906: iload #14
    //   908: istore #15
    //   910: iload #7
    //   912: istore #16
    //   914: iload #25
    //   916: ifeq -> 1041
    //   919: iload #17
    //   921: istore #9
    //   923: iload #10
    //   925: istore #12
    //   927: iload #14
    //   929: istore #15
    //   931: iload #7
    //   933: istore #16
    //   935: iload #13
    //   937: ldc_w 1073741824
    //   940: if_icmpeq -> 1041
    //   943: iconst_0
    //   944: istore #13
    //   946: iload #17
    //   948: istore #9
    //   950: iload #10
    //   952: istore #12
    //   954: iload #14
    //   956: istore #15
    //   958: iload #7
    //   960: istore #16
    //   962: iload #13
    //   964: iload #18
    //   966: if_icmpge -> 1041
    //   969: aload_0
    //   970: iload #13
    //   972: invokevirtual getChildAt : (I)Landroid/view/View;
    //   975: astore #27
    //   977: aload #27
    //   979: ifnull -> 1035
    //   982: aload #27
    //   984: invokevirtual getVisibility : ()I
    //   987: bipush #8
    //   989: if_icmpne -> 995
    //   992: goto -> 1035
    //   995: aload #27
    //   997: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1000: checkcast b/b/p/i0$a
    //   1003: getfield a : F
    //   1006: fconst_0
    //   1007: fcmpl
    //   1008: ifle -> 1035
    //   1011: aload #27
    //   1013: aload #27
    //   1015: invokevirtual getMeasuredWidth : ()I
    //   1018: ldc_w 1073741824
    //   1021: invokestatic makeMeasureSpec : (II)I
    //   1024: iload #8
    //   1026: ldc_w 1073741824
    //   1029: invokestatic makeMeasureSpec : (II)I
    //   1032: invokevirtual measure : (II)V
    //   1035: iinc #13, 1
    //   1038: goto -> 946
    //   1041: goto -> 1515
    //   1044: aload_0
    //   1045: getfield h : F
    //   1048: fstore #4
    //   1050: fload #4
    //   1052: fconst_0
    //   1053: fcmpl
    //   1054: ifle -> 1060
    //   1057: fload #4
    //   1059: fstore_3
    //   1060: aload_0
    //   1061: iconst_0
    //   1062: putfield g : I
    //   1065: iconst_0
    //   1066: istore #16
    //   1068: iload #7
    //   1070: istore #8
    //   1072: iload #14
    //   1074: istore #7
    //   1076: iload #9
    //   1078: istore #14
    //   1080: iload #13
    //   1082: istore #15
    //   1084: iload #17
    //   1086: istore #9
    //   1088: iload #16
    //   1090: iload #18
    //   1092: if_icmpge -> 1474
    //   1095: aload_0
    //   1096: iload #16
    //   1098: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1101: astore #27
    //   1103: aload #27
    //   1105: invokevirtual getVisibility : ()I
    //   1108: bipush #8
    //   1110: if_icmpne -> 1116
    //   1113: goto -> 1468
    //   1116: aload #27
    //   1118: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1121: checkcast b/b/p/i0$a
    //   1124: astore #28
    //   1126: aload #28
    //   1128: getfield a : F
    //   1131: fstore #5
    //   1133: iload #14
    //   1135: istore #13
    //   1137: iload #7
    //   1139: istore #12
    //   1141: fload_3
    //   1142: fstore #4
    //   1144: fload #5
    //   1146: fconst_0
    //   1147: fcmpl
    //   1148: ifle -> 1295
    //   1151: iload #14
    //   1153: i2f
    //   1154: fload #5
    //   1156: fmul
    //   1157: fload_3
    //   1158: fdiv
    //   1159: f2i
    //   1160: istore #13
    //   1162: fload_3
    //   1163: fload #5
    //   1165: fsub
    //   1166: fstore #4
    //   1168: aload_0
    //   1169: invokevirtual getPaddingLeft : ()I
    //   1172: istore #12
    //   1174: iload_1
    //   1175: aload_0
    //   1176: invokevirtual getPaddingRight : ()I
    //   1179: iload #12
    //   1181: iadd
    //   1182: aload #28
    //   1184: getfield leftMargin : I
    //   1187: iadd
    //   1188: aload #28
    //   1190: getfield rightMargin : I
    //   1193: iadd
    //   1194: aload #28
    //   1196: getfield width : I
    //   1199: invokestatic getChildMeasureSpec : (III)I
    //   1202: istore #20
    //   1204: aload #28
    //   1206: getfield height : I
    //   1209: ifne -> 1235
    //   1212: iload #15
    //   1214: ldc_w 1073741824
    //   1217: if_icmpeq -> 1223
    //   1220: goto -> 1235
    //   1223: iload #13
    //   1225: ifle -> 1254
    //   1228: iload #13
    //   1230: istore #12
    //   1232: goto -> 1257
    //   1235: aload #27
    //   1237: invokevirtual getMeasuredHeight : ()I
    //   1240: iload #13
    //   1242: iadd
    //   1243: istore #17
    //   1245: iload #17
    //   1247: istore #12
    //   1249: iload #17
    //   1251: ifge -> 1257
    //   1254: iconst_0
    //   1255: istore #12
    //   1257: aload #27
    //   1259: iload #20
    //   1261: iload #12
    //   1263: ldc_w 1073741824
    //   1266: invokestatic makeMeasureSpec : (II)I
    //   1269: invokevirtual measure : (II)V
    //   1272: iload #7
    //   1274: aload #27
    //   1276: invokevirtual getMeasuredState : ()I
    //   1279: sipush #-256
    //   1282: iand
    //   1283: invokestatic combineMeasuredStates : (II)I
    //   1286: istore #12
    //   1288: iload #14
    //   1290: iload #13
    //   1292: isub
    //   1293: istore #13
    //   1295: aload #28
    //   1297: getfield leftMargin : I
    //   1300: aload #28
    //   1302: getfield rightMargin : I
    //   1305: iadd
    //   1306: istore #14
    //   1308: aload #27
    //   1310: invokevirtual getMeasuredWidth : ()I
    //   1313: iload #14
    //   1315: iadd
    //   1316: istore #17
    //   1318: iload #10
    //   1320: iload #17
    //   1322: invokestatic max : (II)I
    //   1325: istore #10
    //   1327: iload #6
    //   1329: ldc_w 1073741824
    //   1332: if_icmpeq -> 1350
    //   1335: aload #28
    //   1337: getfield width : I
    //   1340: iconst_m1
    //   1341: if_icmpne -> 1350
    //   1344: iconst_1
    //   1345: istore #7
    //   1347: goto -> 1353
    //   1350: iconst_0
    //   1351: istore #7
    //   1353: iload #7
    //   1355: ifeq -> 1365
    //   1358: iload #14
    //   1360: istore #7
    //   1362: goto -> 1369
    //   1365: iload #17
    //   1367: istore #7
    //   1369: iload #9
    //   1371: iload #7
    //   1373: invokestatic max : (II)I
    //   1376: istore #9
    //   1378: iload #8
    //   1380: ifeq -> 1398
    //   1383: aload #28
    //   1385: getfield width : I
    //   1388: iconst_m1
    //   1389: if_icmpne -> 1398
    //   1392: iconst_1
    //   1393: istore #7
    //   1395: goto -> 1401
    //   1398: iconst_0
    //   1399: istore #7
    //   1401: aload_0
    //   1402: getfield g : I
    //   1405: istore #17
    //   1407: aload #27
    //   1409: invokevirtual getMeasuredHeight : ()I
    //   1412: istore #8
    //   1414: aload #28
    //   1416: getfield topMargin : I
    //   1419: istore #14
    //   1421: aload #28
    //   1423: getfield bottomMargin : I
    //   1426: istore #20
    //   1428: aload_0
    //   1429: iload #17
    //   1431: aload_0
    //   1432: invokevirtual n : ()I
    //   1435: iload #8
    //   1437: iload #17
    //   1439: iadd
    //   1440: iload #14
    //   1442: iadd
    //   1443: iload #20
    //   1445: iadd
    //   1446: iadd
    //   1447: invokestatic max : (II)I
    //   1450: putfield g : I
    //   1453: iload #7
    //   1455: istore #8
    //   1457: fload #4
    //   1459: fstore_3
    //   1460: iload #12
    //   1462: istore #7
    //   1464: iload #13
    //   1466: istore #14
    //   1468: iinc #16, 1
    //   1471: goto -> 1088
    //   1474: aload_0
    //   1475: getfield g : I
    //   1478: istore #12
    //   1480: aload_0
    //   1481: invokevirtual getPaddingTop : ()I
    //   1484: istore #13
    //   1486: aload_0
    //   1487: aload_0
    //   1488: invokevirtual getPaddingBottom : ()I
    //   1491: iload #13
    //   1493: iadd
    //   1494: iload #12
    //   1496: iadd
    //   1497: putfield g : I
    //   1500: iload #10
    //   1502: istore #12
    //   1504: iload #7
    //   1506: istore #15
    //   1508: iload #8
    //   1510: istore #16
    //   1512: goto -> 1041
    //   1515: iload #16
    //   1517: ifne -> 1531
    //   1520: iload #6
    //   1522: ldc_w 1073741824
    //   1525: if_icmpeq -> 1531
    //   1528: goto -> 1535
    //   1531: iload #12
    //   1533: istore #9
    //   1535: aload_0
    //   1536: invokevirtual getPaddingLeft : ()I
    //   1539: istore #6
    //   1541: aload_0
    //   1542: aload_0
    //   1543: invokevirtual getPaddingRight : ()I
    //   1546: iload #6
    //   1548: iadd
    //   1549: iload #9
    //   1551: iadd
    //   1552: aload_0
    //   1553: invokevirtual getSuggestedMinimumWidth : ()I
    //   1556: invokestatic max : (II)I
    //   1559: iload_1
    //   1560: iload #15
    //   1562: invokestatic resolveSizeAndState : (III)I
    //   1565: iload #19
    //   1567: invokevirtual setMeasuredDimension : (II)V
    //   1570: iload #11
    //   1572: ifeq -> 4021
    //   1575: aload_0
    //   1576: invokevirtual getMeasuredWidth : ()I
    //   1579: ldc_w 1073741824
    //   1582: invokestatic makeMeasureSpec : (II)I
    //   1585: istore #6
    //   1587: iconst_0
    //   1588: istore_1
    //   1589: iload_1
    //   1590: iload #18
    //   1592: if_icmpge -> 4021
    //   1595: aload_0
    //   1596: iload_1
    //   1597: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1600: astore #28
    //   1602: aload #28
    //   1604: invokevirtual getVisibility : ()I
    //   1607: bipush #8
    //   1609: if_icmpeq -> 1666
    //   1612: aload #28
    //   1614: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1617: checkcast b/b/p/i0$a
    //   1620: astore #27
    //   1622: aload #27
    //   1624: getfield width : I
    //   1627: iconst_m1
    //   1628: if_icmpne -> 1666
    //   1631: aload #27
    //   1633: getfield height : I
    //   1636: istore #7
    //   1638: aload #27
    //   1640: aload #28
    //   1642: invokevirtual getMeasuredHeight : ()I
    //   1645: putfield height : I
    //   1648: aload_0
    //   1649: aload #28
    //   1651: iload #6
    //   1653: iconst_0
    //   1654: iload_2
    //   1655: iconst_0
    //   1656: invokevirtual measureChildWithMargins : (Landroid/view/View;IIII)V
    //   1659: aload #27
    //   1661: iload #7
    //   1663: putfield height : I
    //   1666: iinc #1, 1
    //   1669: goto -> 1589
    //   1672: aload_0
    //   1673: iconst_0
    //   1674: putfield g : I
    //   1677: aload_0
    //   1678: invokevirtual getVirtualChildCount : ()I
    //   1681: istore #17
    //   1683: iload_1
    //   1684: invokestatic getMode : (I)I
    //   1687: istore #23
    //   1689: iload_2
    //   1690: invokestatic getMode : (I)I
    //   1693: istore #22
    //   1695: aload_0
    //   1696: getfield j : [I
    //   1699: ifnull -> 1709
    //   1702: aload_0
    //   1703: getfield k : [I
    //   1706: ifnonnull -> 1723
    //   1709: aload_0
    //   1710: iconst_4
    //   1711: newarray int
    //   1713: putfield j : [I
    //   1716: aload_0
    //   1717: iconst_4
    //   1718: newarray int
    //   1720: putfield k : [I
    //   1723: aload_0
    //   1724: getfield j : [I
    //   1727: astore #28
    //   1729: aload_0
    //   1730: getfield k : [I
    //   1733: astore #27
    //   1735: aload #28
    //   1737: iconst_3
    //   1738: iconst_m1
    //   1739: iastore
    //   1740: aload #28
    //   1742: iconst_2
    //   1743: iconst_m1
    //   1744: iastore
    //   1745: aload #28
    //   1747: iconst_1
    //   1748: iconst_m1
    //   1749: iastore
    //   1750: aload #28
    //   1752: iconst_0
    //   1753: iconst_m1
    //   1754: iastore
    //   1755: aload #27
    //   1757: iconst_3
    //   1758: iconst_m1
    //   1759: iastore
    //   1760: aload #27
    //   1762: iconst_2
    //   1763: iconst_m1
    //   1764: iastore
    //   1765: aload #27
    //   1767: iconst_1
    //   1768: iconst_m1
    //   1769: iastore
    //   1770: aload #27
    //   1772: iconst_0
    //   1773: iconst_m1
    //   1774: iastore
    //   1775: aload_0
    //   1776: getfield b : Z
    //   1779: istore #25
    //   1781: aload_0
    //   1782: getfield i : Z
    //   1785: istore #26
    //   1787: iload #23
    //   1789: ldc_w 1073741824
    //   1792: if_icmpne -> 1801
    //   1795: iconst_1
    //   1796: istore #16
    //   1798: goto -> 1804
    //   1801: iconst_0
    //   1802: istore #16
    //   1804: iconst_0
    //   1805: istore #9
    //   1807: fconst_0
    //   1808: fstore_3
    //   1809: iconst_0
    //   1810: istore #7
    //   1812: iconst_0
    //   1813: istore #6
    //   1815: iconst_0
    //   1816: istore #11
    //   1818: iconst_0
    //   1819: istore #10
    //   1821: iconst_0
    //   1822: istore #14
    //   1824: iconst_0
    //   1825: istore #13
    //   1827: iconst_1
    //   1828: istore #8
    //   1830: iconst_0
    //   1831: istore #12
    //   1833: iload #6
    //   1835: iload #17
    //   1837: if_icmpge -> 2578
    //   1840: aload_0
    //   1841: iload #6
    //   1843: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1846: astore #29
    //   1848: aload #29
    //   1850: ifnonnull -> 1877
    //   1853: aload_0
    //   1854: getfield g : I
    //   1857: istore #15
    //   1859: aload_0
    //   1860: aload_0
    //   1861: invokevirtual q : ()I
    //   1864: iload #15
    //   1866: iadd
    //   1867: putfield g : I
    //   1870: iload #6
    //   1872: istore #15
    //   1874: goto -> 1900
    //   1877: aload #29
    //   1879: invokevirtual getVisibility : ()I
    //   1882: istore #15
    //   1884: iload #15
    //   1886: bipush #8
    //   1888: if_icmpne -> 1911
    //   1891: iload #6
    //   1893: aload_0
    //   1894: invokevirtual l : ()I
    //   1897: iadd
    //   1898: istore #15
    //   1900: iload #7
    //   1902: istore #6
    //   1904: iload #9
    //   1906: istore #7
    //   1908: goto -> 2560
    //   1911: aload_0
    //   1912: iload #6
    //   1914: invokevirtual o : (I)Z
    //   1917: ifeq -> 1933
    //   1920: aload_0
    //   1921: aload_0
    //   1922: getfield g : I
    //   1925: aload_0
    //   1926: getfield m : I
    //   1929: iadd
    //   1930: putfield g : I
    //   1933: aload #29
    //   1935: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1938: checkcast b/b/p/i0$a
    //   1941: astore #30
    //   1943: aload #30
    //   1945: getfield a : F
    //   1948: fstore #4
    //   1950: fload_3
    //   1951: fload #4
    //   1953: fadd
    //   1954: fstore_3
    //   1955: iload #23
    //   1957: ldc_w 1073741824
    //   1960: if_icmpne -> 2081
    //   1963: aload #30
    //   1965: getfield width : I
    //   1968: ifne -> 2081
    //   1971: fload #4
    //   1973: fconst_0
    //   1974: fcmpl
    //   1975: ifle -> 2081
    //   1978: iload #16
    //   1980: ifeq -> 2010
    //   1983: aload_0
    //   1984: getfield g : I
    //   1987: istore #15
    //   1989: aload_0
    //   1990: aload #30
    //   1992: getfield leftMargin : I
    //   1995: aload #30
    //   1997: getfield rightMargin : I
    //   2000: iadd
    //   2001: iload #15
    //   2003: iadd
    //   2004: putfield g : I
    //   2007: goto -> 2039
    //   2010: aload_0
    //   2011: getfield g : I
    //   2014: istore #15
    //   2016: aload_0
    //   2017: iload #15
    //   2019: aload #30
    //   2021: getfield leftMargin : I
    //   2024: iload #15
    //   2026: iadd
    //   2027: aload #30
    //   2029: getfield rightMargin : I
    //   2032: iadd
    //   2033: invokestatic max : (II)I
    //   2036: putfield g : I
    //   2039: iload #25
    //   2041: ifeq -> 2071
    //   2044: iconst_0
    //   2045: iconst_0
    //   2046: invokestatic makeMeasureSpec : (II)I
    //   2049: istore #15
    //   2051: aload #29
    //   2053: iload #15
    //   2055: iload #15
    //   2057: invokevirtual measure : (II)V
    //   2060: iload #6
    //   2062: istore #15
    //   2064: iload #11
    //   2066: istore #15
    //   2068: goto -> 2280
    //   2071: iload #6
    //   2073: istore #13
    //   2075: iconst_1
    //   2076: istore #13
    //   2078: goto -> 2288
    //   2081: aload #30
    //   2083: getfield width : I
    //   2086: ifne -> 2112
    //   2089: aload #30
    //   2091: getfield a : F
    //   2094: fconst_0
    //   2095: fcmpl
    //   2096: ifle -> 2112
    //   2099: aload #30
    //   2101: bipush #-2
    //   2103: putfield width : I
    //   2106: iconst_0
    //   2107: istore #15
    //   2109: goto -> 2117
    //   2112: ldc_w -2147483648
    //   2115: istore #15
    //   2117: fload_3
    //   2118: fconst_0
    //   2119: fcmpl
    //   2120: ifne -> 2132
    //   2123: aload_0
    //   2124: getfield g : I
    //   2127: istore #18
    //   2129: goto -> 2135
    //   2132: iconst_0
    //   2133: istore #18
    //   2135: iload #6
    //   2137: istore #19
    //   2139: aload_0
    //   2140: aload #29
    //   2142: iload_1
    //   2143: iload #18
    //   2145: iload_2
    //   2146: iconst_0
    //   2147: invokevirtual p : (Landroid/view/View;IIII)V
    //   2150: iload #15
    //   2152: ldc_w -2147483648
    //   2155: if_icmpeq -> 2168
    //   2158: aload #30
    //   2160: iload #15
    //   2162: putfield width : I
    //   2165: goto -> 2168
    //   2168: aload #29
    //   2170: invokevirtual getMeasuredWidth : ()I
    //   2173: istore #18
    //   2175: aload_0
    //   2176: getfield g : I
    //   2179: istore #15
    //   2181: iload #16
    //   2183: ifeq -> 2223
    //   2186: aload #30
    //   2188: getfield leftMargin : I
    //   2191: istore #20
    //   2193: aload #30
    //   2195: getfield rightMargin : I
    //   2198: istore #19
    //   2200: aload_0
    //   2201: aload_0
    //   2202: invokevirtual n : ()I
    //   2205: iload #20
    //   2207: iload #18
    //   2209: iadd
    //   2210: iload #19
    //   2212: iadd
    //   2213: iadd
    //   2214: iload #15
    //   2216: iadd
    //   2217: putfield g : I
    //   2220: goto -> 2262
    //   2223: aload #30
    //   2225: getfield leftMargin : I
    //   2228: istore #19
    //   2230: aload #30
    //   2232: getfield rightMargin : I
    //   2235: istore #20
    //   2237: aload_0
    //   2238: iload #15
    //   2240: aload_0
    //   2241: invokevirtual n : ()I
    //   2244: iload #15
    //   2246: iload #18
    //   2248: iadd
    //   2249: iload #19
    //   2251: iadd
    //   2252: iload #20
    //   2254: iadd
    //   2255: iadd
    //   2256: invokestatic max : (II)I
    //   2259: putfield g : I
    //   2262: iload #11
    //   2264: istore #15
    //   2266: iload #26
    //   2268: ifeq -> 2280
    //   2271: iload #18
    //   2273: iload #11
    //   2275: invokestatic max : (II)I
    //   2278: istore #15
    //   2280: iload #6
    //   2282: istore #11
    //   2284: iload #15
    //   2286: istore #11
    //   2288: iload #6
    //   2290: istore #20
    //   2292: iload #7
    //   2294: istore #15
    //   2296: iload #22
    //   2298: ldc_w 1073741824
    //   2301: if_icmpeq -> 2322
    //   2304: aload #30
    //   2306: getfield height : I
    //   2309: iconst_m1
    //   2310: if_icmpne -> 2322
    //   2313: iconst_1
    //   2314: istore #7
    //   2316: iconst_1
    //   2317: istore #12
    //   2319: goto -> 2325
    //   2322: iconst_0
    //   2323: istore #7
    //   2325: aload #30
    //   2327: getfield topMargin : I
    //   2330: aload #30
    //   2332: getfield bottomMargin : I
    //   2335: iadd
    //   2336: istore #18
    //   2338: aload #29
    //   2340: invokevirtual getMeasuredHeight : ()I
    //   2343: iload #18
    //   2345: iadd
    //   2346: istore #19
    //   2348: iload #10
    //   2350: aload #29
    //   2352: invokevirtual getMeasuredState : ()I
    //   2355: invokestatic combineMeasuredStates : (II)I
    //   2358: istore #10
    //   2360: iload #25
    //   2362: ifeq -> 2450
    //   2365: aload #29
    //   2367: invokevirtual getBaseline : ()I
    //   2370: istore #24
    //   2372: iload #24
    //   2374: iconst_m1
    //   2375: if_icmpeq -> 2450
    //   2378: aload #30
    //   2380: getfield b : I
    //   2383: istore #21
    //   2385: iload #21
    //   2387: istore #6
    //   2389: iload #21
    //   2391: ifge -> 2400
    //   2394: aload_0
    //   2395: getfield f : I
    //   2398: istore #6
    //   2400: iload #6
    //   2402: bipush #112
    //   2404: iand
    //   2405: iconst_4
    //   2406: ishr
    //   2407: bipush #-2
    //   2409: iand
    //   2410: iconst_1
    //   2411: ishr
    //   2412: istore #6
    //   2414: aload #28
    //   2416: iload #6
    //   2418: aload #28
    //   2420: iload #6
    //   2422: iaload
    //   2423: iload #24
    //   2425: invokestatic max : (II)I
    //   2428: iastore
    //   2429: aload #27
    //   2431: iload #6
    //   2433: aload #27
    //   2435: iload #6
    //   2437: iaload
    //   2438: iload #19
    //   2440: iload #24
    //   2442: isub
    //   2443: invokestatic max : (II)I
    //   2446: iastore
    //   2447: goto -> 2450
    //   2450: iload #14
    //   2452: iload #19
    //   2454: invokestatic max : (II)I
    //   2457: istore #14
    //   2459: iload #8
    //   2461: ifeq -> 2479
    //   2464: aload #30
    //   2466: getfield height : I
    //   2469: iconst_m1
    //   2470: if_icmpne -> 2479
    //   2473: iconst_1
    //   2474: istore #6
    //   2476: goto -> 2482
    //   2479: iconst_0
    //   2480: istore #6
    //   2482: aload #30
    //   2484: getfield a : F
    //   2487: fconst_0
    //   2488: fcmpl
    //   2489: ifle -> 2517
    //   2492: iload #7
    //   2494: ifeq -> 2501
    //   2497: iload #18
    //   2499: istore #19
    //   2501: iload #9
    //   2503: iload #19
    //   2505: invokestatic max : (II)I
    //   2508: istore #7
    //   2510: iload #15
    //   2512: istore #8
    //   2514: goto -> 2539
    //   2517: iload #7
    //   2519: ifeq -> 2526
    //   2522: iload #18
    //   2524: istore #19
    //   2526: iload #15
    //   2528: iload #19
    //   2530: invokestatic max : (II)I
    //   2533: istore #8
    //   2535: iload #9
    //   2537: istore #7
    //   2539: aload_0
    //   2540: invokevirtual l : ()I
    //   2543: iload #20
    //   2545: iadd
    //   2546: istore #15
    //   2548: iload #6
    //   2550: istore #9
    //   2552: iload #8
    //   2554: istore #6
    //   2556: iload #9
    //   2558: istore #8
    //   2560: iinc #15, 1
    //   2563: iload #7
    //   2565: istore #9
    //   2567: iload #6
    //   2569: istore #7
    //   2571: iload #15
    //   2573: istore #6
    //   2575: goto -> 1833
    //   2578: aload_0
    //   2579: getfield g : I
    //   2582: ifle -> 2607
    //   2585: aload_0
    //   2586: iload #17
    //   2588: invokevirtual o : (I)Z
    //   2591: ifeq -> 2607
    //   2594: aload_0
    //   2595: aload_0
    //   2596: getfield g : I
    //   2599: aload_0
    //   2600: getfield m : I
    //   2603: iadd
    //   2604: putfield g : I
    //   2607: aload #28
    //   2609: iconst_1
    //   2610: iaload
    //   2611: iconst_m1
    //   2612: if_icmpne -> 2645
    //   2615: aload #28
    //   2617: iconst_0
    //   2618: iaload
    //   2619: iconst_m1
    //   2620: if_icmpne -> 2645
    //   2623: aload #28
    //   2625: iconst_2
    //   2626: iaload
    //   2627: iconst_m1
    //   2628: if_icmpne -> 2645
    //   2631: aload #28
    //   2633: iconst_3
    //   2634: iaload
    //   2635: iconst_m1
    //   2636: if_icmpeq -> 2642
    //   2639: goto -> 2645
    //   2642: goto -> 2707
    //   2645: aload #28
    //   2647: iconst_3
    //   2648: iaload
    //   2649: aload #28
    //   2651: iconst_0
    //   2652: iaload
    //   2653: aload #28
    //   2655: iconst_1
    //   2656: iaload
    //   2657: aload #28
    //   2659: iconst_2
    //   2660: iaload
    //   2661: invokestatic max : (II)I
    //   2664: invokestatic max : (II)I
    //   2667: invokestatic max : (II)I
    //   2670: istore #6
    //   2672: iload #14
    //   2674: aload #27
    //   2676: iconst_3
    //   2677: iaload
    //   2678: aload #27
    //   2680: iconst_0
    //   2681: iaload
    //   2682: aload #27
    //   2684: iconst_1
    //   2685: iaload
    //   2686: aload #27
    //   2688: iconst_2
    //   2689: iaload
    //   2690: invokestatic max : (II)I
    //   2693: invokestatic max : (II)I
    //   2696: invokestatic max : (II)I
    //   2699: iload #6
    //   2701: iadd
    //   2702: invokestatic max : (II)I
    //   2705: istore #14
    //   2707: iload #26
    //   2709: ifeq -> 2900
    //   2712: iload #23
    //   2714: ldc_w -2147483648
    //   2717: if_icmpeq -> 2725
    //   2720: iload #23
    //   2722: ifne -> 2900
    //   2725: aload_0
    //   2726: iconst_0
    //   2727: putfield g : I
    //   2730: iconst_0
    //   2731: istore #6
    //   2733: iload #6
    //   2735: iload #17
    //   2737: if_icmpge -> 2900
    //   2740: aload_0
    //   2741: iload #6
    //   2743: invokevirtual getChildAt : (I)Landroid/view/View;
    //   2746: astore #29
    //   2748: aload #29
    //   2750: ifnonnull -> 2773
    //   2753: aload_0
    //   2754: getfield g : I
    //   2757: istore #15
    //   2759: aload_0
    //   2760: aload_0
    //   2761: invokevirtual q : ()I
    //   2764: iload #15
    //   2766: iadd
    //   2767: putfield g : I
    //   2770: goto -> 2894
    //   2773: aload #29
    //   2775: invokevirtual getVisibility : ()I
    //   2778: bipush #8
    //   2780: if_icmpne -> 2795
    //   2783: iload #6
    //   2785: aload_0
    //   2786: invokevirtual l : ()I
    //   2789: iadd
    //   2790: istore #6
    //   2792: goto -> 2894
    //   2795: aload #29
    //   2797: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   2800: checkcast b/b/p/i0$a
    //   2803: astore #29
    //   2805: aload_0
    //   2806: getfield g : I
    //   2809: istore #15
    //   2811: iload #16
    //   2813: ifeq -> 2851
    //   2816: aload #29
    //   2818: getfield leftMargin : I
    //   2821: istore #18
    //   2823: aload #29
    //   2825: getfield rightMargin : I
    //   2828: istore #19
    //   2830: aload_0
    //   2831: invokevirtual n : ()I
    //   2834: iload #18
    //   2836: iload #11
    //   2838: iadd
    //   2839: iload #19
    //   2841: iadd
    //   2842: iadd
    //   2843: iload #15
    //   2845: iadd
    //   2846: istore #15
    //   2848: goto -> 2888
    //   2851: aload #29
    //   2853: getfield leftMargin : I
    //   2856: istore #18
    //   2858: aload #29
    //   2860: getfield rightMargin : I
    //   2863: istore #19
    //   2865: iload #15
    //   2867: aload_0
    //   2868: invokevirtual n : ()I
    //   2871: iload #15
    //   2873: iload #11
    //   2875: iadd
    //   2876: iload #18
    //   2878: iadd
    //   2879: iload #19
    //   2881: iadd
    //   2882: iadd
    //   2883: invokestatic max : (II)I
    //   2886: istore #15
    //   2888: aload_0
    //   2889: iload #15
    //   2891: putfield g : I
    //   2894: iinc #6, 1
    //   2897: goto -> 2733
    //   2900: aload_0
    //   2901: getfield g : I
    //   2904: istore #15
    //   2906: aload_0
    //   2907: invokevirtual getPaddingLeft : ()I
    //   2910: istore #6
    //   2912: aload_0
    //   2913: invokevirtual getPaddingRight : ()I
    //   2916: iload #6
    //   2918: iadd
    //   2919: iload #15
    //   2921: iadd
    //   2922: istore #6
    //   2924: aload_0
    //   2925: iload #6
    //   2927: putfield g : I
    //   2930: iload #6
    //   2932: aload_0
    //   2933: invokevirtual getSuggestedMinimumWidth : ()I
    //   2936: invokestatic max : (II)I
    //   2939: iload_1
    //   2940: iconst_0
    //   2941: invokestatic resolveSizeAndState : (III)I
    //   2944: istore #19
    //   2946: ldc_w 16777215
    //   2949: iload #19
    //   2951: iand
    //   2952: aload_0
    //   2953: getfield g : I
    //   2956: isub
    //   2957: istore #6
    //   2959: iload #13
    //   2961: ifne -> 3093
    //   2964: iload #6
    //   2966: ifeq -> 2978
    //   2969: fload_3
    //   2970: fconst_0
    //   2971: fcmpl
    //   2972: ifle -> 2978
    //   2975: goto -> 3093
    //   2978: iload #7
    //   2980: iload #9
    //   2982: invokestatic max : (II)I
    //   2985: istore #7
    //   2987: iload #26
    //   2989: ifeq -> 3082
    //   2992: iload #23
    //   2994: ldc_w 1073741824
    //   2997: if_icmpeq -> 3082
    //   3000: iconst_0
    //   3001: istore #6
    //   3003: iload #6
    //   3005: iload #17
    //   3007: if_icmpge -> 3082
    //   3010: aload_0
    //   3011: iload #6
    //   3013: invokevirtual getChildAt : (I)Landroid/view/View;
    //   3016: astore #27
    //   3018: aload #27
    //   3020: ifnull -> 3076
    //   3023: aload #27
    //   3025: invokevirtual getVisibility : ()I
    //   3028: bipush #8
    //   3030: if_icmpne -> 3036
    //   3033: goto -> 3076
    //   3036: aload #27
    //   3038: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   3041: checkcast b/b/p/i0$a
    //   3044: getfield a : F
    //   3047: fconst_0
    //   3048: fcmpl
    //   3049: ifle -> 3076
    //   3052: aload #27
    //   3054: iload #11
    //   3056: ldc_w 1073741824
    //   3059: invokestatic makeMeasureSpec : (II)I
    //   3062: aload #27
    //   3064: invokevirtual getMeasuredHeight : ()I
    //   3067: ldc_w 1073741824
    //   3070: invokestatic makeMeasureSpec : (II)I
    //   3073: invokevirtual measure : (II)V
    //   3076: iinc #6, 1
    //   3079: goto -> 3003
    //   3082: iload #10
    //   3084: istore #6
    //   3086: iload #17
    //   3088: istore #10
    //   3090: goto -> 3851
    //   3093: aload_0
    //   3094: getfield h : F
    //   3097: fstore #4
    //   3099: fload #4
    //   3101: fconst_0
    //   3102: fcmpl
    //   3103: ifle -> 3109
    //   3106: fload #4
    //   3108: fstore_3
    //   3109: aload #28
    //   3111: iconst_3
    //   3112: iconst_m1
    //   3113: iastore
    //   3114: aload #28
    //   3116: iconst_2
    //   3117: iconst_m1
    //   3118: iastore
    //   3119: aload #28
    //   3121: iconst_1
    //   3122: iconst_m1
    //   3123: iastore
    //   3124: aload #28
    //   3126: iconst_0
    //   3127: iconst_m1
    //   3128: iastore
    //   3129: aload #27
    //   3131: iconst_3
    //   3132: iconst_m1
    //   3133: iastore
    //   3134: aload #27
    //   3136: iconst_2
    //   3137: iconst_m1
    //   3138: iastore
    //   3139: aload #27
    //   3141: iconst_1
    //   3142: iconst_m1
    //   3143: iastore
    //   3144: aload #27
    //   3146: iconst_0
    //   3147: iconst_m1
    //   3148: iastore
    //   3149: aload_0
    //   3150: iconst_0
    //   3151: putfield g : I
    //   3154: iload #6
    //   3156: istore #9
    //   3158: iload #10
    //   3160: istore #6
    //   3162: iconst_m1
    //   3163: istore #11
    //   3165: iconst_0
    //   3166: istore #14
    //   3168: iload #17
    //   3170: istore #10
    //   3172: iload #14
    //   3174: iload #10
    //   3176: if_icmpge -> 3721
    //   3179: aload_0
    //   3180: iload #14
    //   3182: invokevirtual getChildAt : (I)Landroid/view/View;
    //   3185: astore #30
    //   3187: aload #30
    //   3189: ifnull -> 3699
    //   3192: aload #30
    //   3194: invokevirtual getVisibility : ()I
    //   3197: bipush #8
    //   3199: if_icmpne -> 3205
    //   3202: goto -> 3699
    //   3205: aload #30
    //   3207: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   3210: checkcast b/b/p/i0$a
    //   3213: astore #29
    //   3215: aload #29
    //   3217: getfield a : F
    //   3220: fstore #4
    //   3222: fload #4
    //   3224: fconst_0
    //   3225: fcmpl
    //   3226: ifle -> 3375
    //   3229: iload #9
    //   3231: i2f
    //   3232: fload #4
    //   3234: fmul
    //   3235: fload_3
    //   3236: fdiv
    //   3237: f2i
    //   3238: istore #15
    //   3240: aload_0
    //   3241: invokevirtual getPaddingTop : ()I
    //   3244: istore #13
    //   3246: iload_2
    //   3247: aload_0
    //   3248: invokevirtual getPaddingBottom : ()I
    //   3251: iload #13
    //   3253: iadd
    //   3254: aload #29
    //   3256: getfield topMargin : I
    //   3259: iadd
    //   3260: aload #29
    //   3262: getfield bottomMargin : I
    //   3265: iadd
    //   3266: aload #29
    //   3268: getfield height : I
    //   3271: invokestatic getChildMeasureSpec : (III)I
    //   3274: istore #18
    //   3276: aload #29
    //   3278: getfield width : I
    //   3281: ifne -> 3307
    //   3284: iload #23
    //   3286: ldc_w 1073741824
    //   3289: if_icmpeq -> 3295
    //   3292: goto -> 3307
    //   3295: iload #15
    //   3297: ifle -> 3326
    //   3300: iload #15
    //   3302: istore #13
    //   3304: goto -> 3329
    //   3307: aload #30
    //   3309: invokevirtual getMeasuredWidth : ()I
    //   3312: iload #15
    //   3314: iadd
    //   3315: istore #17
    //   3317: iload #17
    //   3319: istore #13
    //   3321: iload #17
    //   3323: ifge -> 3329
    //   3326: iconst_0
    //   3327: istore #13
    //   3329: aload #30
    //   3331: iload #13
    //   3333: ldc_w 1073741824
    //   3336: invokestatic makeMeasureSpec : (II)I
    //   3339: iload #18
    //   3341: invokevirtual measure : (II)V
    //   3344: iload #6
    //   3346: aload #30
    //   3348: invokevirtual getMeasuredState : ()I
    //   3351: ldc_w -16777216
    //   3354: iand
    //   3355: invokestatic combineMeasuredStates : (II)I
    //   3358: istore #6
    //   3360: fload_3
    //   3361: fload #4
    //   3363: fsub
    //   3364: fstore_3
    //   3365: iload #9
    //   3367: iload #15
    //   3369: isub
    //   3370: istore #9
    //   3372: goto -> 3375
    //   3375: iload #16
    //   3377: ifeq -> 3428
    //   3380: aload_0
    //   3381: getfield g : I
    //   3384: istore #15
    //   3386: aload #30
    //   3388: invokevirtual getMeasuredWidth : ()I
    //   3391: istore #17
    //   3393: aload #29
    //   3395: getfield leftMargin : I
    //   3398: istore #18
    //   3400: aload #29
    //   3402: getfield rightMargin : I
    //   3405: istore #13
    //   3407: aload_0
    //   3408: invokevirtual n : ()I
    //   3411: iload #17
    //   3413: iload #18
    //   3415: iadd
    //   3416: iload #13
    //   3418: iadd
    //   3419: iadd
    //   3420: iload #15
    //   3422: iadd
    //   3423: istore #13
    //   3425: goto -> 3478
    //   3428: aload_0
    //   3429: getfield g : I
    //   3432: istore #17
    //   3434: aload #30
    //   3436: invokevirtual getMeasuredWidth : ()I
    //   3439: istore #13
    //   3441: aload #29
    //   3443: getfield leftMargin : I
    //   3446: istore #18
    //   3448: aload #29
    //   3450: getfield rightMargin : I
    //   3453: istore #15
    //   3455: iload #17
    //   3457: aload_0
    //   3458: invokevirtual n : ()I
    //   3461: iload #13
    //   3463: iload #17
    //   3465: iadd
    //   3466: iload #18
    //   3468: iadd
    //   3469: iload #15
    //   3471: iadd
    //   3472: iadd
    //   3473: invokestatic max : (II)I
    //   3476: istore #13
    //   3478: aload_0
    //   3479: iload #13
    //   3481: putfield g : I
    //   3484: iload #22
    //   3486: ldc_w 1073741824
    //   3489: if_icmpeq -> 3507
    //   3492: aload #29
    //   3494: getfield height : I
    //   3497: iconst_m1
    //   3498: if_icmpne -> 3507
    //   3501: iconst_1
    //   3502: istore #13
    //   3504: goto -> 3510
    //   3507: iconst_0
    //   3508: istore #13
    //   3510: aload #29
    //   3512: getfield topMargin : I
    //   3515: aload #29
    //   3517: getfield bottomMargin : I
    //   3520: iadd
    //   3521: istore #18
    //   3523: aload #30
    //   3525: invokevirtual getMeasuredHeight : ()I
    //   3528: iload #18
    //   3530: iadd
    //   3531: istore #17
    //   3533: iload #11
    //   3535: iload #17
    //   3537: invokestatic max : (II)I
    //   3540: istore #15
    //   3542: iload #13
    //   3544: ifeq -> 3554
    //   3547: iload #18
    //   3549: istore #11
    //   3551: goto -> 3558
    //   3554: iload #17
    //   3556: istore #11
    //   3558: iload #7
    //   3560: iload #11
    //   3562: invokestatic max : (II)I
    //   3565: istore #11
    //   3567: iload #8
    //   3569: ifeq -> 3587
    //   3572: aload #29
    //   3574: getfield height : I
    //   3577: iconst_m1
    //   3578: if_icmpne -> 3587
    //   3581: iconst_1
    //   3582: istore #7
    //   3584: goto -> 3590
    //   3587: iconst_0
    //   3588: istore #7
    //   3590: iload #25
    //   3592: ifeq -> 3680
    //   3595: aload #30
    //   3597: invokevirtual getBaseline : ()I
    //   3600: istore #18
    //   3602: iload #18
    //   3604: iconst_m1
    //   3605: if_icmpeq -> 3680
    //   3608: aload #29
    //   3610: getfield b : I
    //   3613: istore #13
    //   3615: iload #13
    //   3617: istore #8
    //   3619: iload #13
    //   3621: ifge -> 3630
    //   3624: aload_0
    //   3625: getfield f : I
    //   3628: istore #8
    //   3630: iload #8
    //   3632: bipush #112
    //   3634: iand
    //   3635: iconst_4
    //   3636: ishr
    //   3637: bipush #-2
    //   3639: iand
    //   3640: iconst_1
    //   3641: ishr
    //   3642: istore #8
    //   3644: aload #28
    //   3646: iload #8
    //   3648: aload #28
    //   3650: iload #8
    //   3652: iaload
    //   3653: iload #18
    //   3655: invokestatic max : (II)I
    //   3658: iastore
    //   3659: aload #27
    //   3661: iload #8
    //   3663: aload #27
    //   3665: iload #8
    //   3667: iaload
    //   3668: iload #17
    //   3670: iload #18
    //   3672: isub
    //   3673: invokestatic max : (II)I
    //   3676: iastore
    //   3677: goto -> 3680
    //   3680: iload #7
    //   3682: istore #13
    //   3684: iload #9
    //   3686: istore #8
    //   3688: iload #11
    //   3690: istore #7
    //   3692: iload #15
    //   3694: istore #11
    //   3696: goto -> 3707
    //   3699: iload #8
    //   3701: istore #13
    //   3703: iload #9
    //   3705: istore #8
    //   3707: iinc #14, 1
    //   3710: iload #8
    //   3712: istore #9
    //   3714: iload #13
    //   3716: istore #8
    //   3718: goto -> 3172
    //   3721: aload_0
    //   3722: getfield g : I
    //   3725: istore #9
    //   3727: aload_0
    //   3728: invokevirtual getPaddingLeft : ()I
    //   3731: istore #13
    //   3733: aload_0
    //   3734: aload_0
    //   3735: invokevirtual getPaddingRight : ()I
    //   3738: iload #13
    //   3740: iadd
    //   3741: iload #9
    //   3743: iadd
    //   3744: putfield g : I
    //   3747: aload #28
    //   3749: iconst_1
    //   3750: iaload
    //   3751: iconst_m1
    //   3752: if_icmpne -> 3789
    //   3755: aload #28
    //   3757: iconst_0
    //   3758: iaload
    //   3759: iconst_m1
    //   3760: if_icmpne -> 3789
    //   3763: aload #28
    //   3765: iconst_2
    //   3766: iaload
    //   3767: iconst_m1
    //   3768: if_icmpne -> 3789
    //   3771: aload #28
    //   3773: iconst_3
    //   3774: iaload
    //   3775: iconst_m1
    //   3776: if_icmpeq -> 3782
    //   3779: goto -> 3789
    //   3782: iload #11
    //   3784: istore #14
    //   3786: goto -> 3090
    //   3789: aload #28
    //   3791: iconst_3
    //   3792: iaload
    //   3793: aload #28
    //   3795: iconst_0
    //   3796: iaload
    //   3797: aload #28
    //   3799: iconst_1
    //   3800: iaload
    //   3801: aload #28
    //   3803: iconst_2
    //   3804: iaload
    //   3805: invokestatic max : (II)I
    //   3808: invokestatic max : (II)I
    //   3811: invokestatic max : (II)I
    //   3814: istore #9
    //   3816: iload #11
    //   3818: aload #27
    //   3820: iconst_3
    //   3821: iaload
    //   3822: aload #27
    //   3824: iconst_0
    //   3825: iaload
    //   3826: aload #27
    //   3828: iconst_1
    //   3829: iaload
    //   3830: aload #27
    //   3832: iconst_2
    //   3833: iaload
    //   3834: invokestatic max : (II)I
    //   3837: invokestatic max : (II)I
    //   3840: invokestatic max : (II)I
    //   3843: iload #9
    //   3845: iadd
    //   3846: invokestatic max : (II)I
    //   3849: istore #14
    //   3851: iload #8
    //   3853: ifne -> 3867
    //   3856: iload #22
    //   3858: ldc_w 1073741824
    //   3861: if_icmpeq -> 3867
    //   3864: goto -> 3871
    //   3867: iload #14
    //   3869: istore #7
    //   3871: aload_0
    //   3872: invokevirtual getPaddingTop : ()I
    //   3875: istore #8
    //   3877: aload_0
    //   3878: ldc_w -16777216
    //   3881: iload #6
    //   3883: iand
    //   3884: iload #19
    //   3886: ior
    //   3887: aload_0
    //   3888: invokevirtual getPaddingBottom : ()I
    //   3891: iload #8
    //   3893: iadd
    //   3894: iload #7
    //   3896: iadd
    //   3897: aload_0
    //   3898: invokevirtual getSuggestedMinimumHeight : ()I
    //   3901: invokestatic max : (II)I
    //   3904: iload_2
    //   3905: iload #6
    //   3907: bipush #16
    //   3909: ishl
    //   3910: invokestatic resolveSizeAndState : (III)I
    //   3913: invokevirtual setMeasuredDimension : (II)V
    //   3916: iload #12
    //   3918: ifeq -> 4021
    //   3921: aload_0
    //   3922: invokevirtual getMeasuredHeight : ()I
    //   3925: ldc_w 1073741824
    //   3928: invokestatic makeMeasureSpec : (II)I
    //   3931: istore #6
    //   3933: iconst_0
    //   3934: istore_2
    //   3935: iload_2
    //   3936: iload #10
    //   3938: if_icmpge -> 4021
    //   3941: aload_0
    //   3942: iload_2
    //   3943: invokevirtual getChildAt : (I)Landroid/view/View;
    //   3946: astore #28
    //   3948: aload #28
    //   3950: invokevirtual getVisibility : ()I
    //   3953: bipush #8
    //   3955: if_icmpeq -> 4015
    //   3958: aload #28
    //   3960: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   3963: checkcast b/b/p/i0$a
    //   3966: astore #27
    //   3968: aload #27
    //   3970: getfield height : I
    //   3973: iconst_m1
    //   3974: if_icmpne -> 4015
    //   3977: aload #27
    //   3979: getfield width : I
    //   3982: istore #7
    //   3984: aload #27
    //   3986: aload #28
    //   3988: invokevirtual getMeasuredWidth : ()I
    //   3991: putfield width : I
    //   3994: aload_0
    //   3995: aload #28
    //   3997: iload_1
    //   3998: iconst_0
    //   3999: iload #6
    //   4001: iconst_0
    //   4002: invokevirtual measureChildWithMargins : (Landroid/view/View;IIII)V
    //   4005: aload #27
    //   4007: iload #7
    //   4009: putfield width : I
    //   4012: goto -> 4015
    //   4015: iinc #2, 1
    //   4018: goto -> 3935
    //   4021: return
  }
  
  public void p(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public int q() {
    return 0;
  }
  
  public void setBaselineAligned(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public void setBaselineAlignedChildIndex(int paramInt) {
    if (paramInt >= 0 && paramInt < getChildCount()) {
      this.c = paramInt;
      return;
    } 
    StringBuilder stringBuilder = c.a.a.a.a.e("base aligned child index out of range (0, ");
    stringBuilder.append(getChildCount());
    stringBuilder.append(")");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void setDividerDrawable(Drawable paramDrawable) {
    if (paramDrawable == this.l)
      return; 
    this.l = paramDrawable;
    boolean bool = false;
    if (paramDrawable != null) {
      this.m = paramDrawable.getIntrinsicWidth();
      this.n = paramDrawable.getIntrinsicHeight();
    } else {
      this.m = 0;
      this.n = 0;
    } 
    if (paramDrawable == null)
      bool = true; 
    setWillNotDraw(bool);
    requestLayout();
  }
  
  public void setDividerPadding(int paramInt) {
    this.p = paramInt;
  }
  
  public void setGravity(int paramInt) {
    if (this.f != paramInt) {
      int i = paramInt;
      if ((0x800007 & paramInt) == 0)
        i = paramInt | 0x800003; 
      paramInt = i;
      if ((i & 0x70) == 0)
        paramInt = i | 0x30; 
      this.f = paramInt;
      requestLayout();
    } 
  }
  
  public void setHorizontalGravity(int paramInt) {
    paramInt &= 0x800007;
    int i = this.f;
    if ((0x800007 & i) != paramInt) {
      this.f = paramInt | 0xFF7FFFF8 & i;
      requestLayout();
    } 
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean) {
    this.i = paramBoolean;
  }
  
  public void setOrientation(int paramInt) {
    if (this.e != paramInt) {
      this.e = paramInt;
      requestLayout();
    } 
  }
  
  public void setShowDividers(int paramInt) {
    if (paramInt != this.o)
      requestLayout(); 
    this.o = paramInt;
  }
  
  public void setVerticalGravity(int paramInt) {
    paramInt &= 0x70;
    int i = this.f;
    if ((i & 0x70) != paramInt) {
      this.f = paramInt | i & 0xFFFFFF8F;
      requestLayout();
    } 
  }
  
  public void setWeightSum(float paramFloat) {
    this.h = Math.max(0.0F, paramFloat);
  }
  
  public boolean shouldDelayChildPressedState() {
    return false;
  }
  
  public static class a extends ViewGroup.MarginLayoutParams {
    public float a;
    
    public int b = -1;
    
    public a(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.a = 0.0F;
    }
    
    public a(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, j.LinearLayoutCompat_Layout);
      this.a = typedArray.getFloat(j.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
      this.b = typedArray.getInt(j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
      typedArray.recycle();
    }
    
    public a(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */