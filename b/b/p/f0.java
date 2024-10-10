package b.b.p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import b.b.m.a.c;
import b.i.m.q;
import b.i.n.c;
import java.lang.reflect.Field;

public class f0 extends ListView {
  public final Rect b = new Rect();
  
  public int c = 0;
  
  public int d = 0;
  
  public int e = 0;
  
  public int f = 0;
  
  public int g;
  
  public Field h;
  
  public a i;
  
  public boolean j;
  
  public boolean k;
  
  public boolean l;
  
  public q m;
  
  public c n;
  
  public b o;
  
  public f0(Context paramContext, boolean paramBoolean) {
    super(paramContext, null, b.b.a.dropDownListViewStyle);
    this.k = paramBoolean;
    setCacheColorHint(0);
    try {
      Field field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      this.h = field;
      field.setAccessible(true);
    } catch (NoSuchFieldException noSuchFieldException) {
      noSuchFieldException.printStackTrace();
    } 
  }
  
  private void setSelectorEnabled(boolean paramBoolean) {
    a a1 = this.i;
    if (a1 != null)
      a1.c = paramBoolean; 
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3) {
    int i = getListPaddingTop();
    int j = getListPaddingBottom();
    int k = getDividerHeight();
    Drawable drawable = getDivider();
    ListAdapter listAdapter = getAdapter();
    j = i + j;
    if (listAdapter == null)
      return j; 
    if (k <= 0 || drawable == null)
      k = 0; 
    int n = listAdapter.getCount();
    drawable = null;
    byte b1 = 0;
    int m = 0;
    for (i = 0; b1 < n; i = i2) {
      int i2 = listAdapter.getItemViewType(b1);
      int i1 = m;
      if (i2 != m) {
        drawable = null;
        i1 = i2;
      } 
      View view2 = listAdapter.getView(b1, (View)drawable, (ViewGroup)this);
      ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
      ViewGroup.LayoutParams layoutParams1 = layoutParams2;
      if (layoutParams2 == null) {
        layoutParams1 = generateDefaultLayoutParams();
        view2.setLayoutParams(layoutParams1);
      } 
      m = layoutParams1.height;
      if (m > 0) {
        m = View.MeasureSpec.makeMeasureSpec(m, 1073741824);
      } else {
        m = View.MeasureSpec.makeMeasureSpec(0, 0);
      } 
      view2.measure(paramInt1, m);
      view2.forceLayout();
      m = j;
      if (b1 > 0)
        m = j + k; 
      j = m + view2.getMeasuredHeight();
      if (j >= paramInt2) {
        paramInt1 = paramInt2;
        if (paramInt3 >= 0) {
          paramInt1 = paramInt2;
          if (b1 > paramInt3) {
            paramInt1 = paramInt2;
            if (i > 0) {
              paramInt1 = paramInt2;
              if (j != paramInt2)
                paramInt1 = i; 
            } 
          } 
        } 
        return paramInt1;
      } 
      i2 = i;
      if (paramInt3 >= 0) {
        i2 = i;
        if (b1 >= paramInt3)
          i2 = j; 
      } 
      b1++;
      m = i1;
      View view1 = view2;
    } 
    return j;
  }
  
  public boolean b(MotionEvent paramMotionEvent, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore #8
    //   6: iconst_1
    //   7: istore #7
    //   9: iload #8
    //   11: iconst_1
    //   12: if_icmpeq -> 36
    //   15: iload #8
    //   17: iconst_2
    //   18: if_icmpeq -> 30
    //   21: iload #8
    //   23: iconst_3
    //   24: if_icmpeq -> 51
    //   27: goto -> 545
    //   30: iconst_1
    //   31: istore #11
    //   33: goto -> 39
    //   36: iconst_0
    //   37: istore #11
    //   39: aload_1
    //   40: iload_2
    //   41: invokevirtual findPointerIndex : (I)I
    //   44: istore #9
    //   46: iload #9
    //   48: ifge -> 57
    //   51: iconst_0
    //   52: istore #11
    //   54: goto -> 548
    //   57: aload_1
    //   58: iload #9
    //   60: invokevirtual getX : (I)F
    //   63: f2i
    //   64: istore_2
    //   65: aload_1
    //   66: iload #9
    //   68: invokevirtual getY : (I)F
    //   71: f2i
    //   72: istore #10
    //   74: aload_0
    //   75: iload_2
    //   76: iload #10
    //   78: invokevirtual pointToPosition : (II)I
    //   81: istore #9
    //   83: iload #9
    //   85: iconst_m1
    //   86: if_icmpne -> 95
    //   89: iload #7
    //   91: istore_2
    //   92: goto -> 550
    //   95: aload_0
    //   96: iload #9
    //   98: aload_0
    //   99: invokevirtual getFirstVisiblePosition : ()I
    //   102: isub
    //   103: invokevirtual getChildAt : (I)Landroid/view/View;
    //   106: astore #13
    //   108: iload_2
    //   109: i2f
    //   110: fstore_3
    //   111: iload #10
    //   113: i2f
    //   114: fstore #4
    //   116: aload_0
    //   117: iconst_1
    //   118: putfield l : Z
    //   121: aload_0
    //   122: fload_3
    //   123: fload #4
    //   125: invokevirtual drawableHotspotChanged : (FF)V
    //   128: aload_0
    //   129: invokevirtual isPressed : ()Z
    //   132: ifne -> 140
    //   135: aload_0
    //   136: iconst_1
    //   137: invokevirtual setPressed : (Z)V
    //   140: aload_0
    //   141: invokevirtual layoutChildren : ()V
    //   144: aload_0
    //   145: getfield g : I
    //   148: istore_2
    //   149: iload_2
    //   150: iconst_m1
    //   151: if_icmpeq -> 192
    //   154: aload_0
    //   155: iload_2
    //   156: aload_0
    //   157: invokevirtual getFirstVisiblePosition : ()I
    //   160: isub
    //   161: invokevirtual getChildAt : (I)Landroid/view/View;
    //   164: astore #14
    //   166: aload #14
    //   168: ifnull -> 192
    //   171: aload #14
    //   173: aload #13
    //   175: if_acmpeq -> 192
    //   178: aload #14
    //   180: invokevirtual isPressed : ()Z
    //   183: ifeq -> 192
    //   186: aload #14
    //   188: iconst_0
    //   189: invokevirtual setPressed : (Z)V
    //   192: aload_0
    //   193: iload #9
    //   195: putfield g : I
    //   198: aload #13
    //   200: fload_3
    //   201: aload #13
    //   203: invokevirtual getLeft : ()I
    //   206: i2f
    //   207: fsub
    //   208: fload #4
    //   210: aload #13
    //   212: invokevirtual getTop : ()I
    //   215: i2f
    //   216: fsub
    //   217: invokevirtual drawableHotspotChanged : (FF)V
    //   220: aload #13
    //   222: invokevirtual isPressed : ()Z
    //   225: ifne -> 234
    //   228: aload #13
    //   230: iconst_1
    //   231: invokevirtual setPressed : (Z)V
    //   234: aload_0
    //   235: invokevirtual getSelector : ()Landroid/graphics/drawable/Drawable;
    //   238: astore #14
    //   240: aload #14
    //   242: ifnull -> 256
    //   245: iload #9
    //   247: iconst_m1
    //   248: if_icmpeq -> 256
    //   251: iconst_1
    //   252: istore_2
    //   253: goto -> 258
    //   256: iconst_0
    //   257: istore_2
    //   258: iload_2
    //   259: ifeq -> 270
    //   262: aload #14
    //   264: iconst_0
    //   265: iconst_0
    //   266: invokevirtual setVisible : (ZZ)Z
    //   269: pop
    //   270: aload_0
    //   271: getfield b : Landroid/graphics/Rect;
    //   274: astore #15
    //   276: aload #15
    //   278: aload #13
    //   280: invokevirtual getLeft : ()I
    //   283: aload #13
    //   285: invokevirtual getTop : ()I
    //   288: aload #13
    //   290: invokevirtual getRight : ()I
    //   293: aload #13
    //   295: invokevirtual getBottom : ()I
    //   298: invokevirtual set : (IIII)V
    //   301: aload #15
    //   303: aload #15
    //   305: getfield left : I
    //   308: aload_0
    //   309: getfield c : I
    //   312: isub
    //   313: putfield left : I
    //   316: aload #15
    //   318: aload #15
    //   320: getfield top : I
    //   323: aload_0
    //   324: getfield d : I
    //   327: isub
    //   328: putfield top : I
    //   331: aload #15
    //   333: aload #15
    //   335: getfield right : I
    //   338: aload_0
    //   339: getfield e : I
    //   342: iadd
    //   343: putfield right : I
    //   346: aload #15
    //   348: aload #15
    //   350: getfield bottom : I
    //   353: aload_0
    //   354: getfield f : I
    //   357: iadd
    //   358: putfield bottom : I
    //   361: aload_0
    //   362: getfield h : Ljava/lang/reflect/Field;
    //   365: aload_0
    //   366: invokevirtual getBoolean : (Ljava/lang/Object;)Z
    //   369: istore #11
    //   371: aload #13
    //   373: invokevirtual isEnabled : ()Z
    //   376: iload #11
    //   378: if_icmpeq -> 432
    //   381: aload_0
    //   382: getfield h : Ljava/lang/reflect/Field;
    //   385: astore #15
    //   387: iload #11
    //   389: ifne -> 398
    //   392: iconst_1
    //   393: istore #11
    //   395: goto -> 401
    //   398: iconst_0
    //   399: istore #11
    //   401: aload #15
    //   403: aload_0
    //   404: iload #11
    //   406: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   409: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   412: iload #9
    //   414: iconst_m1
    //   415: if_icmpeq -> 432
    //   418: aload_0
    //   419: invokevirtual refreshDrawableState : ()V
    //   422: goto -> 432
    //   425: astore #15
    //   427: aload #15
    //   429: invokevirtual printStackTrace : ()V
    //   432: iload_2
    //   433: ifeq -> 490
    //   436: aload_0
    //   437: getfield b : Landroid/graphics/Rect;
    //   440: astore #15
    //   442: aload #15
    //   444: invokevirtual exactCenterX : ()F
    //   447: fstore #5
    //   449: aload #15
    //   451: invokevirtual exactCenterY : ()F
    //   454: fstore #6
    //   456: aload_0
    //   457: invokevirtual getVisibility : ()I
    //   460: ifne -> 469
    //   463: iconst_1
    //   464: istore #11
    //   466: goto -> 472
    //   469: iconst_0
    //   470: istore #11
    //   472: aload #14
    //   474: iload #11
    //   476: iconst_0
    //   477: invokevirtual setVisible : (ZZ)Z
    //   480: pop
    //   481: aload #14
    //   483: fload #5
    //   485: fload #6
    //   487: invokevirtual setHotspot : (FF)V
    //   490: aload_0
    //   491: invokevirtual getSelector : ()Landroid/graphics/drawable/Drawable;
    //   494: astore #14
    //   496: aload #14
    //   498: ifnull -> 515
    //   501: iload #9
    //   503: iconst_m1
    //   504: if_icmpeq -> 515
    //   507: aload #14
    //   509: fload_3
    //   510: fload #4
    //   512: invokevirtual setHotspot : (FF)V
    //   515: aload_0
    //   516: iconst_0
    //   517: invokespecial setSelectorEnabled : (Z)V
    //   520: aload_0
    //   521: invokevirtual refreshDrawableState : ()V
    //   524: iload #8
    //   526: iconst_1
    //   527: if_icmpne -> 545
    //   530: aload_0
    //   531: aload #13
    //   533: iload #9
    //   535: aload_0
    //   536: iload #9
    //   538: invokevirtual getItemIdAtPosition : (I)J
    //   541: invokevirtual performItemClick : (Landroid/view/View;IJ)Z
    //   544: pop
    //   545: iconst_1
    //   546: istore #11
    //   548: iconst_0
    //   549: istore_2
    //   550: iload #11
    //   552: ifeq -> 559
    //   555: iload_2
    //   556: ifeq -> 620
    //   559: aload_0
    //   560: iconst_0
    //   561: putfield l : Z
    //   564: aload_0
    //   565: iconst_0
    //   566: invokevirtual setPressed : (Z)V
    //   569: aload_0
    //   570: invokevirtual drawableStateChanged : ()V
    //   573: aload_0
    //   574: aload_0
    //   575: getfield g : I
    //   578: aload_0
    //   579: invokevirtual getFirstVisiblePosition : ()I
    //   582: isub
    //   583: invokevirtual getChildAt : (I)Landroid/view/View;
    //   586: astore #13
    //   588: aload #13
    //   590: ifnull -> 599
    //   593: aload #13
    //   595: iconst_0
    //   596: invokevirtual setPressed : (Z)V
    //   599: aload_0
    //   600: getfield m : Lb/i/m/q;
    //   603: astore #13
    //   605: aload #13
    //   607: ifnull -> 620
    //   610: aload #13
    //   612: invokevirtual b : ()V
    //   615: aload_0
    //   616: aconst_null
    //   617: putfield m : Lb/i/m/q;
    //   620: iload #11
    //   622: ifeq -> 674
    //   625: aload_0
    //   626: getfield n : Lb/i/n/c;
    //   629: ifnonnull -> 644
    //   632: aload_0
    //   633: new b/i/n/c
    //   636: dup
    //   637: aload_0
    //   638: invokespecial <init> : (Landroid/widget/ListView;)V
    //   641: putfield n : Lb/i/n/c;
    //   644: aload_0
    //   645: getfield n : Lb/i/n/c;
    //   648: astore #13
    //   650: aload #13
    //   652: getfield q : Z
    //   655: istore #12
    //   657: aload #13
    //   659: iconst_1
    //   660: putfield q : Z
    //   663: aload #13
    //   665: aload_0
    //   666: aload_1
    //   667: invokevirtual onTouch : (Landroid/view/View;Landroid/view/MotionEvent;)Z
    //   670: pop
    //   671: goto -> 699
    //   674: aload_0
    //   675: getfield n : Lb/i/n/c;
    //   678: astore_1
    //   679: aload_1
    //   680: ifnull -> 699
    //   683: aload_1
    //   684: getfield q : Z
    //   687: ifeq -> 694
    //   690: aload_1
    //   691: invokevirtual d : ()V
    //   694: aload_1
    //   695: iconst_0
    //   696: putfield q : Z
    //   699: iload #11
    //   701: ireturn
    // Exception table:
    //   from	to	target	type
    //   361	387	425	java/lang/IllegalAccessException
    //   401	412	425	java/lang/IllegalAccessException
    //   418	422	425	java/lang/IllegalAccessException
  }
  
  public final void c() {
    Drawable drawable = getSelector();
    if (drawable != null && this.l && isPressed())
      drawable.setState(getDrawableState()); 
  }
  
  public void dispatchDraw(Canvas paramCanvas) {
    if (!this.b.isEmpty()) {
      Drawable drawable = getSelector();
      if (drawable != null) {
        drawable.setBounds(this.b);
        drawable.draw(paramCanvas);
      } 
    } 
    super.dispatchDraw(paramCanvas);
  }
  
  public void drawableStateChanged() {
    if (this.o != null)
      return; 
    super.drawableStateChanged();
    setSelectorEnabled(true);
    c();
  }
  
  public boolean hasFocus() {
    return (this.k || super.hasFocus());
  }
  
  public boolean hasWindowFocus() {
    return (this.k || super.hasWindowFocus());
  }
  
  public boolean isFocused() {
    return (this.k || super.isFocused());
  }
  
  public boolean isInTouchMode() {
    boolean bool;
    if ((this.k && this.j) || super.isInTouchMode()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void onDetachedFromWindow() {
    this.o = null;
    super.onDetachedFromWindow();
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    if (Build.VERSION.SDK_INT < 26)
      return super.onHoverEvent(paramMotionEvent); 
    int i = paramMotionEvent.getActionMasked();
    if (i == 10 && this.o == null) {
      b b1 = new b(this);
      this.o = b1;
      b1.b.post(b1);
    } 
    boolean bool = super.onHoverEvent(paramMotionEvent);
    if (i == 9 || i == 7) {
      i = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      if (i != -1 && i != getSelectedItemPosition()) {
        View view = getChildAt(i - getFirstVisiblePosition());
        if (view.isEnabled())
          setSelectionFromTop(i, view.getTop() - getTop()); 
        c();
      } 
      return bool;
    } 
    setSelection(-1);
    return bool;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getAction() == 0)
      this.g = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()); 
    b b1 = this.o;
    if (b1 != null) {
      f0 f01 = b1.b;
      f01.o = null;
      f01.removeCallbacks(b1);
    } 
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setListSelectionHidden(boolean paramBoolean) {
    this.j = paramBoolean;
  }
  
  public void setSelector(Drawable paramDrawable) {
    a a1;
    if (paramDrawable != null) {
      a1 = new a(paramDrawable);
    } else {
      a1 = null;
    } 
    this.i = a1;
    super.setSelector((Drawable)a1);
    Rect rect = new Rect();
    if (paramDrawable != null)
      paramDrawable.getPadding(rect); 
    this.c = rect.left;
    this.d = rect.top;
    this.e = rect.right;
    this.f = rect.bottom;
  }
  
  public static class a extends c {
    public boolean c = true;
    
    public a(Drawable param1Drawable) {
      super(param1Drawable);
    }
    
    public void draw(Canvas param1Canvas) {
      if (this.c)
        this.b.draw(param1Canvas); 
    }
    
    public void setHotspot(float param1Float1, float param1Float2) {
      if (this.c)
        this.b.setHotspot(param1Float1, param1Float2); 
    }
    
    public void setHotspotBounds(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      if (this.c)
        this.b.setHotspotBounds(param1Int1, param1Int2, param1Int3, param1Int4); 
    }
    
    public boolean setState(int[] param1ArrayOfint) {
      return this.c ? this.b.setState(param1ArrayOfint) : false;
    }
    
    public boolean setVisible(boolean param1Boolean1, boolean param1Boolean2) {
      return this.c ? super.setVisible(param1Boolean1, param1Boolean2) : false;
    }
  }
  
  public class b implements Runnable {
    public final f0 b;
    
    public b(f0 this$0) {}
    
    public void run() {
      f0 f01 = this.b;
      f01.o = null;
      f01.drawableStateChanged();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */