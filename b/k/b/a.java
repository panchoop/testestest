package b.k.b;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import b.f.i;
import b.i.m.a;
import b.i.m.l;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.List;

public abstract class a extends a {
  public static final Rect n = new Rect(2147483647, 2147483647, -2147483648, -2147483648);
  
  public static final b<b.i.m.v.b> o = new a();
  
  public static final c<i<b.i.m.v.b>, b.i.m.v.b> p = new b();
  
  public final Rect d = new Rect();
  
  public final Rect e = new Rect();
  
  public final Rect f = new Rect();
  
  public final int[] g = new int[2];
  
  public final AccessibilityManager h;
  
  public final View i;
  
  public c j;
  
  public int k = Integer.MIN_VALUE;
  
  public int l = Integer.MIN_VALUE;
  
  public int m = Integer.MIN_VALUE;
  
  public a(View paramView) {
    if (paramView != null) {
      this.i = paramView;
      this.h = (AccessibilityManager)paramView.getContext().getSystemService("accessibility");
      paramView.setFocusable(true);
      if (l.p(paramView) == 0)
        paramView.setImportantForAccessibility(1); 
      return;
    } 
    throw new IllegalArgumentException("View may not be null");
  }
  
  public b.i.m.v.c b(View paramView) {
    if (this.j == null)
      this.j = new c(this); 
    return this.j;
  }
  
  public void c(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.a.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void d(View paramView, b.i.m.v.b paramb) {
    this.a.onInitializeAccessibilityNodeInfo(paramView, paramb.a);
    Chip.b b1 = (Chip.b)this;
    boolean bool = b1.q.g();
    paramb.a.setCheckable(bool);
    bool = b1.q.isClickable();
    paramb.a.setClickable(bool);
    if (b1.q.g() || b1.q.isClickable()) {
      String str;
      if (b1.q.g()) {
        str = "android.widget.CompoundButton";
      } else {
        str = "android.widget.Button";
      } 
      paramb.a.setClassName(str);
    } else {
      paramb.a.setClassName("android.view.View");
    } 
    CharSequence charSequence = b1.q.getText();
    if (Build.VERSION.SDK_INT >= 23) {
      paramb.a.setText(charSequence);
    } else {
      paramb.a.setContentDescription(charSequence);
    } 
  }
  
  public final boolean j(int paramInt) {
    if (this.k == paramInt) {
      this.k = Integer.MIN_VALUE;
      this.i.invalidate();
      s(paramInt, 65536);
      return true;
    } 
    return false;
  }
  
  public final boolean k(int paramInt) {
    if (this.l != paramInt)
      return false; 
    this.l = Integer.MIN_VALUE;
    Chip.b b1 = (Chip.b)this;
    if (paramInt == 1) {
      Chip chip = b1.q;
      chip.m = false;
      chip.refreshDrawableState();
    } 
    s(paramInt, 8);
    return true;
  }
  
  public final b.i.m.v.b l(int paramInt) {
    b.i.m.v.b b1 = new b.i.m.v.b(AccessibilityNodeInfo.obtain());
    b1.a.setEnabled(true);
    b1.a.setFocusable(true);
    b1.a.setClassName("android.view.View");
    Rect rect = n;
    b1.a.setBoundsInParent(rect);
    rect = n;
    b1.a.setBoundsInScreen(rect);
    View view = this.i;
    b1.b = -1;
    b1.a.setParent(view);
    q(paramInt, b1);
    if (b1.g() != null || b1.e() != null) {
      Rect rect1 = this.e;
      b1.a.getBoundsInParent(rect1);
      if (!this.e.equals(n)) {
        int i = b1.a.getActions();
        if ((i & 0x40) == 0) {
          char c1 = '';
          if ((i & 0x80) == 0) {
            boolean bool;
            AccessibilityNodeInfo accessibilityNodeInfo;
            String str = this.i.getContext().getPackageName();
            b1.a.setPackageName(str);
            View view1 = this.i;
            b1.c = paramInt;
            b1.a.setSource(view1, paramInt);
            int j = this.k;
            i = 0;
            if (j == paramInt) {
              b1.a.setAccessibilityFocused(true);
              accessibilityNodeInfo = b1.a;
            } else {
              b1.a.setAccessibilityFocused(false);
              accessibilityNodeInfo = b1.a;
              c1 = '@';
            } 
            accessibilityNodeInfo.addAction(c1);
            if (this.l == paramInt) {
              bool = true;
            } else {
              bool = false;
            } 
            if (bool) {
              b1.a.addAction(2);
            } else if (b1.a.isFocusable()) {
              b1.a.addAction(1);
            } 
            b1.a.setFocused(bool);
            this.i.getLocationOnScreen(this.g);
            Rect rect2 = this.d;
            b1.a.getBoundsInScreen(rect2);
            if (this.d.equals(n)) {
              rect2 = this.d;
              b1.a.getBoundsInParent(rect2);
              if (b1.b != -1) {
                b.i.m.v.b b2 = new b.i.m.v.b(AccessibilityNodeInfo.obtain());
                for (paramInt = b1.b; paramInt != -1; paramInt = b2.b) {
                  View view2 = this.i;
                  b2.b = -1;
                  b2.a.setParent(view2, -1);
                  Rect rect3 = n;
                  b2.a.setBoundsInParent(rect3);
                  q(paramInt, b2);
                  rect3 = this.e;
                  b2.a.getBoundsInParent(rect3);
                  rect3 = this.d;
                  Rect rect4 = this.e;
                  rect3.offset(rect4.left, rect4.top);
                } 
                b2.a.recycle();
              } 
              this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
            } 
            if (this.i.getLocalVisibleRect(this.f)) {
              this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
              if (this.d.intersect(this.f)) {
                rect2 = this.d;
                b1.a.setBoundsInScreen(rect2);
                rect2 = this.d;
                paramInt = i;
                if (rect2 != null)
                  if (rect2.isEmpty()) {
                    paramInt = i;
                  } else if (this.i.getWindowVisibility() != 0) {
                    paramInt = i;
                  } else {
                    View view2 = this.i;
                    while (true) {
                      View view3;
                      ViewParent viewParent = view2.getParent();
                      if (viewParent instanceof View) {
                        View view4 = (View)viewParent;
                        paramInt = i;
                        if (view4.getAlpha() > 0.0F) {
                          view3 = view4;
                          if (view4.getVisibility() != 0) {
                            paramInt = i;
                            break;
                          } 
                          continue;
                        } 
                        break;
                      } 
                      paramInt = i;
                      if (view3 != null)
                        paramInt = 1; 
                      break;
                    } 
                  }  
                if (paramInt != 0)
                  b1.a.setVisibleToUser(true); 
              } 
            } 
            return b1;
          } 
          throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } 
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
      } 
      throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    } 
    throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
  }
  
  public abstract void m(List<Integer> paramList);
  
  public final boolean n(int paramInt, Rect paramRect) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #12
    //   9: aload_0
    //   10: aload #12
    //   12: invokevirtual m : (Ljava/util/List;)V
    //   15: new b/f/i
    //   18: dup
    //   19: bipush #10
    //   21: invokespecial <init> : (I)V
    //   24: astore #14
    //   26: iconst_0
    //   27: istore #5
    //   29: iconst_0
    //   30: istore_3
    //   31: iload_3
    //   32: aload #12
    //   34: invokevirtual size : ()I
    //   37: if_icmpge -> 57
    //   40: aload #14
    //   42: iload_3
    //   43: aload_0
    //   44: iload_3
    //   45: invokevirtual l : (I)Lb/i/m/v/b;
    //   48: invokevirtual g : (ILjava/lang/Object;)V
    //   51: iinc #3, 1
    //   54: goto -> 31
    //   57: aload_0
    //   58: getfield l : I
    //   61: istore_3
    //   62: iload_3
    //   63: ldc -2147483648
    //   65: if_icmpne -> 74
    //   68: aconst_null
    //   69: astore #12
    //   71: goto -> 85
    //   74: aload #14
    //   76: iload_3
    //   77: invokevirtual d : (I)Ljava/lang/Object;
    //   80: checkcast b/i/m/v/b
    //   83: astore #12
    //   85: iconst_m1
    //   86: istore #6
    //   88: iload_1
    //   89: iconst_1
    //   90: if_icmpeq -> 646
    //   93: iload_1
    //   94: iconst_2
    //   95: if_icmpeq -> 646
    //   98: iload_1
    //   99: bipush #17
    //   101: if_icmpeq -> 137
    //   104: iload_1
    //   105: bipush #33
    //   107: if_icmpeq -> 137
    //   110: iload_1
    //   111: bipush #66
    //   113: if_icmpeq -> 137
    //   116: iload_1
    //   117: sipush #130
    //   120: if_icmpne -> 126
    //   123: goto -> 137
    //   126: new java/lang/IllegalArgumentException
    //   129: dup
    //   130: ldc_w 'direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.'
    //   133: invokespecial <init> : (Ljava/lang/String;)V
    //   136: athrow
    //   137: new android/graphics/Rect
    //   140: dup
    //   141: invokespecial <init> : ()V
    //   144: astore #15
    //   146: aload_0
    //   147: getfield l : I
    //   150: istore_3
    //   151: iload_3
    //   152: ldc -2147483648
    //   154: if_icmpeq -> 173
    //   157: aload_0
    //   158: iload_3
    //   159: invokevirtual o : (I)Lb/i/m/v/b;
    //   162: getfield a : Landroid/view/accessibility/AccessibilityNodeInfo;
    //   165: aload #15
    //   167: invokevirtual getBoundsInParent : (Landroid/graphics/Rect;)V
    //   170: goto -> 287
    //   173: aload_2
    //   174: ifnull -> 186
    //   177: aload #15
    //   179: aload_2
    //   180: invokevirtual set : (Landroid/graphics/Rect;)V
    //   183: goto -> 287
    //   186: aload_0
    //   187: getfield i : Landroid/view/View;
    //   190: astore_2
    //   191: aload_2
    //   192: invokevirtual getWidth : ()I
    //   195: istore #4
    //   197: aload_2
    //   198: invokevirtual getHeight : ()I
    //   201: istore_3
    //   202: iload_1
    //   203: bipush #17
    //   205: if_icmpeq -> 276
    //   208: iload_1
    //   209: bipush #33
    //   211: if_icmpeq -> 263
    //   214: iload_1
    //   215: bipush #66
    //   217: if_icmpeq -> 251
    //   220: iload_1
    //   221: sipush #130
    //   224: if_icmpne -> 240
    //   227: aload #15
    //   229: iconst_0
    //   230: iconst_m1
    //   231: iload #4
    //   233: iconst_m1
    //   234: invokevirtual set : (IIII)V
    //   237: goto -> 287
    //   240: new java/lang/IllegalArgumentException
    //   243: dup
    //   244: ldc_w 'direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.'
    //   247: invokespecial <init> : (Ljava/lang/String;)V
    //   250: athrow
    //   251: aload #15
    //   253: iconst_m1
    //   254: iconst_0
    //   255: iconst_m1
    //   256: iload_3
    //   257: invokevirtual set : (IIII)V
    //   260: goto -> 287
    //   263: aload #15
    //   265: iconst_0
    //   266: iload_3
    //   267: iload #4
    //   269: iload_3
    //   270: invokevirtual set : (IIII)V
    //   273: goto -> 287
    //   276: aload #15
    //   278: iload #4
    //   280: iconst_0
    //   281: iload #4
    //   283: iload_3
    //   284: invokevirtual set : (IIII)V
    //   287: getstatic b/k/b/a.p : Lb/k/b/c;
    //   290: astore_2
    //   291: getstatic b/k/b/a.o : Lb/k/b/b;
    //   294: astore #16
    //   296: new android/graphics/Rect
    //   299: dup
    //   300: aload #15
    //   302: invokespecial <init> : (Landroid/graphics/Rect;)V
    //   305: astore #17
    //   307: iload_1
    //   308: bipush #17
    //   310: if_icmpeq -> 385
    //   313: iload_1
    //   314: bipush #33
    //   316: if_icmpeq -> 367
    //   319: iload_1
    //   320: bipush #66
    //   322: if_icmpeq -> 355
    //   325: iload_1
    //   326: sipush #130
    //   329: if_icmpne -> 344
    //   332: aload #15
    //   334: invokevirtual height : ()I
    //   337: iconst_1
    //   338: iadd
    //   339: ineg
    //   340: istore_3
    //   341: goto -> 375
    //   344: new java/lang/IllegalArgumentException
    //   347: dup
    //   348: ldc_w 'direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.'
    //   351: invokespecial <init> : (Ljava/lang/String;)V
    //   354: athrow
    //   355: aload #15
    //   357: invokevirtual width : ()I
    //   360: iconst_1
    //   361: iadd
    //   362: ineg
    //   363: istore_3
    //   364: goto -> 393
    //   367: aload #15
    //   369: invokevirtual height : ()I
    //   372: iconst_1
    //   373: iadd
    //   374: istore_3
    //   375: aload #17
    //   377: iconst_0
    //   378: iload_3
    //   379: invokevirtual offset : (II)V
    //   382: goto -> 400
    //   385: aload #15
    //   387: invokevirtual width : ()I
    //   390: iconst_1
    //   391: iadd
    //   392: istore_3
    //   393: aload #17
    //   395: iload_3
    //   396: iconst_0
    //   397: invokevirtual offset : (II)V
    //   400: aload_2
    //   401: checkcast b/k/b/a$b
    //   404: ifnull -> 644
    //   407: aload #14
    //   409: invokevirtual i : ()I
    //   412: istore #7
    //   414: new android/graphics/Rect
    //   417: dup
    //   418: invokespecial <init> : ()V
    //   421: astore #18
    //   423: iconst_0
    //   424: istore_3
    //   425: aconst_null
    //   426: astore_2
    //   427: aload_2
    //   428: astore #13
    //   430: iload_3
    //   431: iload #7
    //   433: if_icmpge -> 869
    //   436: aload #14
    //   438: getfield b : Z
    //   441: ifeq -> 449
    //   444: aload #14
    //   446: invokevirtual c : ()V
    //   449: aload #14
    //   451: getfield d : [Ljava/lang/Object;
    //   454: iload_3
    //   455: aaload
    //   456: checkcast b/i/m/v/b
    //   459: astore #13
    //   461: aload #13
    //   463: aload #12
    //   465: if_acmpne -> 471
    //   468: goto -> 638
    //   471: aload #16
    //   473: checkcast b/k/b/a$a
    //   476: aload #13
    //   478: aload #18
    //   480: invokevirtual a : (Ljava/lang/Object;Landroid/graphics/Rect;)V
    //   483: aload #15
    //   485: aload #18
    //   487: iload_1
    //   488: invokestatic O : (Landroid/graphics/Rect;Landroid/graphics/Rect;I)Z
    //   491: ifne -> 497
    //   494: goto -> 620
    //   497: aload #15
    //   499: aload #17
    //   501: iload_1
    //   502: invokestatic O : (Landroid/graphics/Rect;Landroid/graphics/Rect;I)Z
    //   505: ifne -> 511
    //   508: goto -> 614
    //   511: iload_1
    //   512: aload #15
    //   514: aload #18
    //   516: aload #17
    //   518: invokestatic b : (ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)Z
    //   521: ifeq -> 527
    //   524: goto -> 614
    //   527: iload_1
    //   528: aload #15
    //   530: aload #17
    //   532: aload #18
    //   534: invokestatic b : (ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)Z
    //   537: ifeq -> 543
    //   540: goto -> 620
    //   543: iload_1
    //   544: aload #15
    //   546: aload #18
    //   548: invokestatic W : (ILandroid/graphics/Rect;Landroid/graphics/Rect;)I
    //   551: istore #4
    //   553: iload_1
    //   554: aload #15
    //   556: aload #18
    //   558: invokestatic X : (ILandroid/graphics/Rect;Landroid/graphics/Rect;)I
    //   561: istore #8
    //   563: iload_1
    //   564: aload #15
    //   566: aload #17
    //   568: invokestatic W : (ILandroid/graphics/Rect;Landroid/graphics/Rect;)I
    //   571: istore #10
    //   573: iload_1
    //   574: aload #15
    //   576: aload #17
    //   578: invokestatic X : (ILandroid/graphics/Rect;Landroid/graphics/Rect;)I
    //   581: istore #9
    //   583: iload #8
    //   585: iload #8
    //   587: imul
    //   588: iload #4
    //   590: bipush #13
    //   592: imul
    //   593: iload #4
    //   595: imul
    //   596: iadd
    //   597: iload #9
    //   599: iload #9
    //   601: imul
    //   602: iload #10
    //   604: bipush #13
    //   606: imul
    //   607: iload #10
    //   609: imul
    //   610: iadd
    //   611: if_icmpge -> 620
    //   614: iconst_1
    //   615: istore #4
    //   617: goto -> 623
    //   620: iconst_0
    //   621: istore #4
    //   623: iload #4
    //   625: ifeq -> 638
    //   628: aload #17
    //   630: aload #18
    //   632: invokevirtual set : (Landroid/graphics/Rect;)V
    //   635: aload #13
    //   637: astore_2
    //   638: iinc #3, 1
    //   641: goto -> 427
    //   644: aconst_null
    //   645: athrow
    //   646: aload_0
    //   647: getfield i : Landroid/view/View;
    //   650: invokestatic r : (Landroid/view/View;)I
    //   653: iconst_1
    //   654: if_icmpne -> 663
    //   657: iconst_1
    //   658: istore #11
    //   660: goto -> 666
    //   663: iconst_0
    //   664: istore #11
    //   666: getstatic b/k/b/a.p : Lb/k/b/c;
    //   669: astore #13
    //   671: getstatic b/k/b/a.o : Lb/k/b/b;
    //   674: astore_2
    //   675: aload #13
    //   677: checkcast b/k/b/a$b
    //   680: ifnull -> 947
    //   683: aload #14
    //   685: invokevirtual i : ()I
    //   688: istore #4
    //   690: new java/util/ArrayList
    //   693: dup
    //   694: iload #4
    //   696: invokespecial <init> : (I)V
    //   699: astore #13
    //   701: iconst_0
    //   702: istore_3
    //   703: iload_3
    //   704: iload #4
    //   706: if_icmpge -> 744
    //   709: aload #14
    //   711: getfield b : Z
    //   714: ifeq -> 722
    //   717: aload #14
    //   719: invokevirtual c : ()V
    //   722: aload #13
    //   724: aload #14
    //   726: getfield d : [Ljava/lang/Object;
    //   729: iload_3
    //   730: aaload
    //   731: checkcast b/i/m/v/b
    //   734: invokevirtual add : (Ljava/lang/Object;)Z
    //   737: pop
    //   738: iinc #3, 1
    //   741: goto -> 703
    //   744: aload #13
    //   746: new b/k/b/d
    //   749: dup
    //   750: iload #11
    //   752: aload_2
    //   753: invokespecial <init> : (ZLb/k/b/b;)V
    //   756: invokestatic sort : (Ljava/util/List;Ljava/util/Comparator;)V
    //   759: iload_1
    //   760: iconst_1
    //   761: if_icmpeq -> 827
    //   764: iload_1
    //   765: iconst_2
    //   766: if_icmpne -> 816
    //   769: aload #13
    //   771: invokevirtual size : ()I
    //   774: istore_3
    //   775: aload #12
    //   777: ifnonnull -> 785
    //   780: iconst_m1
    //   781: istore_1
    //   782: goto -> 793
    //   785: aload #13
    //   787: aload #12
    //   789: invokevirtual lastIndexOf : (Ljava/lang/Object;)I
    //   792: istore_1
    //   793: iinc #1, 1
    //   796: iload_1
    //   797: iload_3
    //   798: if_icmpge -> 811
    //   801: aload #13
    //   803: iload_1
    //   804: invokevirtual get : (I)Ljava/lang/Object;
    //   807: astore_2
    //   808: goto -> 863
    //   811: aconst_null
    //   812: astore_2
    //   813: goto -> 863
    //   816: new java/lang/IllegalArgumentException
    //   819: dup
    //   820: ldc_w 'direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.'
    //   823: invokespecial <init> : (Ljava/lang/String;)V
    //   826: athrow
    //   827: aload #13
    //   829: invokevirtual size : ()I
    //   832: istore_1
    //   833: aload #12
    //   835: ifnonnull -> 841
    //   838: goto -> 849
    //   841: aload #13
    //   843: aload #12
    //   845: invokevirtual indexOf : (Ljava/lang/Object;)I
    //   848: istore_1
    //   849: iinc #1, -1
    //   852: iload_1
    //   853: iflt -> 811
    //   856: aload #13
    //   858: iload_1
    //   859: invokevirtual get : (I)Ljava/lang/Object;
    //   862: astore_2
    //   863: aload_2
    //   864: checkcast b/i/m/v/b
    //   867: astore #13
    //   869: aload #13
    //   871: ifnonnull -> 880
    //   874: ldc -2147483648
    //   876: istore_1
    //   877: goto -> 941
    //   880: iload #5
    //   882: istore_1
    //   883: aload #14
    //   885: getfield b : Z
    //   888: ifeq -> 899
    //   891: aload #14
    //   893: invokevirtual c : ()V
    //   896: iload #5
    //   898: istore_1
    //   899: iload #6
    //   901: istore_3
    //   902: iload_1
    //   903: aload #14
    //   905: getfield e : I
    //   908: if_icmpge -> 934
    //   911: aload #14
    //   913: getfield d : [Ljava/lang/Object;
    //   916: iload_1
    //   917: aaload
    //   918: aload #13
    //   920: if_acmpne -> 928
    //   923: iload_1
    //   924: istore_3
    //   925: goto -> 934
    //   928: iinc #1, 1
    //   931: goto -> 899
    //   934: aload #14
    //   936: iload_3
    //   937: invokevirtual f : (I)I
    //   940: istore_1
    //   941: aload_0
    //   942: iload_1
    //   943: invokevirtual r : (I)Z
    //   946: ireturn
    //   947: aconst_null
    //   948: athrow
  }
  
  public b.i.m.v.b o(int paramInt) {
    if (paramInt == -1) {
      b.i.m.v.b b1 = new b.i.m.v.b(AccessibilityNodeInfo.obtain(this.i));
      l.M(this.i, b1);
      ArrayList<Integer> arrayList = new ArrayList();
      m(arrayList);
      if (b1.a.getChildCount() <= 0 || arrayList.size() <= 0) {
        paramInt = 0;
        int i = arrayList.size();
        while (paramInt < i) {
          View view = this.i;
          int j = ((Integer)arrayList.get(paramInt)).intValue();
          b1.a.addChild(view, j);
          paramInt++;
        } 
        return b1;
      } 
      throw new RuntimeException("Views cannot have both real and virtual children");
    } 
    return l(paramInt);
  }
  
  public abstract boolean p(int paramInt1, int paramInt2, Bundle paramBundle);
  
  public abstract void q(int paramInt, b.i.m.v.b paramb);
  
  public final boolean r(int paramInt) {
    if (!this.i.isFocused() && !this.i.requestFocus())
      return false; 
    int i = this.l;
    if (i == paramInt)
      return false; 
    if (i != Integer.MIN_VALUE)
      k(i); 
    this.l = paramInt;
    Chip.b b1 = (Chip.b)this;
    if (paramInt == 1) {
      Chip chip = b1.q;
      chip.m = true;
      chip.refreshDrawableState();
    } 
    s(paramInt, 8);
    return true;
  }
  
  public final boolean s(int paramInt1, int paramInt2) {
    if (paramInt1 == Integer.MIN_VALUE || !this.h.isEnabled())
      return false; 
    ViewParent viewParent = this.i.getParent();
    if (viewParent == null)
      return false; 
    if (paramInt1 != -1) {
      AccessibilityEvent accessibilityEvent1 = AccessibilityEvent.obtain(paramInt2);
      b.i.m.v.b b1 = o(paramInt1);
      accessibilityEvent1.getText().add(b1.g());
      accessibilityEvent1.setContentDescription(b1.e());
      accessibilityEvent1.setScrollable(b1.a.isScrollable());
      accessibilityEvent1.setPassword(b1.a.isPassword());
      accessibilityEvent1.setEnabled(b1.a.isEnabled());
      accessibilityEvent1.setChecked(b1.a.isChecked());
      if (!accessibilityEvent1.getText().isEmpty() || accessibilityEvent1.getContentDescription() != null) {
        accessibilityEvent1.setClassName(b1.a.getClassName());
        accessibilityEvent1.setSource(this.i, paramInt1);
        accessibilityEvent1.setPackageName(this.i.getContext().getPackageName());
        return viewParent.requestSendAccessibilityEvent(this.i, accessibilityEvent1);
      } 
      throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    } 
    AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain(paramInt2);
    this.i.onInitializeAccessibilityEvent(accessibilityEvent);
    return viewParent.requestSendAccessibilityEvent(this.i, accessibilityEvent);
  }
  
  public final void t(int paramInt) {
    int i = this.m;
    if (i == paramInt)
      return; 
    this.m = paramInt;
    s(paramInt, 128);
    s(i, 256);
  }
  
  public static final class a implements b<b.i.m.v.b> {
    public void a(Object param1Object, Rect param1Rect) {
      ((b.i.m.v.b)param1Object).a.getBoundsInParent(param1Rect);
    }
  }
  
  public static final class b implements c<i<b.i.m.v.b>, b.i.m.v.b> {}
  
  public class c extends b.i.m.v.c {
    public final a b;
    
    public c(a this$0) {}
    
    public b.i.m.v.b a(int param1Int) {
      return new b.i.m.v.b(AccessibilityNodeInfo.obtain((this.b.o(param1Int)).a));
    }
    
    public b.i.m.v.b b(int param1Int) {
      if (param1Int == 2) {
        param1Int = this.b.k;
      } else {
        param1Int = this.b.l;
      } 
      return (param1Int == Integer.MIN_VALUE) ? null : new b.i.m.v.b(AccessibilityNodeInfo.obtain((this.b.o(param1Int)).a));
    }
    
    public boolean c(int param1Int1, int param1Int2, Bundle param1Bundle) {
      boolean bool;
      a a1 = this.b;
      if (param1Int1 != -1) {
        bool = true;
        if (param1Int2 != 1) {
          if (param1Int2 != 2) {
            if (param1Int2 != 64) {
              if (param1Int2 != 128) {
                bool = a1.p(param1Int1, param1Int2, param1Bundle);
              } else {
                bool = a1.j(param1Int1);
              } 
            } else {
              if (a1.h.isEnabled() && a1.h.isTouchExplorationEnabled()) {
                param1Int2 = a1.k;
                if (param1Int2 != param1Int1) {
                  if (param1Int2 != Integer.MIN_VALUE)
                    a1.j(param1Int2); 
                  a1.k = param1Int1;
                  a1.i.invalidate();
                  a1.s(param1Int1, 32768);
                  return bool;
                } 
              } 
              bool = false;
            } 
          } else {
            bool = a1.k(param1Int1);
          } 
        } else {
          bool = a1.r(param1Int1);
        } 
      } else {
        bool = l.N(a1.i, param1Int2, param1Bundle);
      } 
      return bool;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\k\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */