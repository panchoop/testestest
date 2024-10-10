package b.t;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public abstract class d0 extends i {
  public static final String[] K = new String[] { "android:visibility:visibility", "android:visibility:parent" };
  
  public int J = 3;
  
  public final void I(q paramq) {
    int j = paramq.b.getVisibility();
    paramq.a.put("android:visibility:visibility", Integer.valueOf(j));
    paramq.a.put("android:visibility:parent", paramq.b.getParent());
    int[] arrayOfInt = new int[2];
    paramq.b.getLocationOnScreen(arrayOfInt);
    paramq.a.put("android:visibility:screenLocation", arrayOfInt);
  }
  
  public final b J(q paramq1, q paramq2) {
    // Byte code:
    //   0: new b/t/d0$b
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: aload #5
    //   11: iconst_0
    //   12: putfield a : Z
    //   15: aload #5
    //   17: iconst_0
    //   18: putfield b : Z
    //   21: aload_1
    //   22: ifnull -> 83
    //   25: aload_1
    //   26: getfield a : Ljava/util/Map;
    //   29: ldc 'android:visibility:visibility'
    //   31: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   36: ifeq -> 83
    //   39: aload #5
    //   41: aload_1
    //   42: getfield a : Ljava/util/Map;
    //   45: ldc 'android:visibility:visibility'
    //   47: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   52: checkcast java/lang/Integer
    //   55: invokevirtual intValue : ()I
    //   58: putfield c : I
    //   61: aload #5
    //   63: aload_1
    //   64: getfield a : Ljava/util/Map;
    //   67: ldc 'android:visibility:parent'
    //   69: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   74: checkcast android/view/ViewGroup
    //   77: putfield e : Landroid/view/ViewGroup;
    //   80: goto -> 95
    //   83: aload #5
    //   85: iconst_m1
    //   86: putfield c : I
    //   89: aload #5
    //   91: aconst_null
    //   92: putfield e : Landroid/view/ViewGroup;
    //   95: aload_2
    //   96: ifnull -> 157
    //   99: aload_2
    //   100: getfield a : Ljava/util/Map;
    //   103: ldc 'android:visibility:visibility'
    //   105: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   110: ifeq -> 157
    //   113: aload #5
    //   115: aload_2
    //   116: getfield a : Ljava/util/Map;
    //   119: ldc 'android:visibility:visibility'
    //   121: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   126: checkcast java/lang/Integer
    //   129: invokevirtual intValue : ()I
    //   132: putfield d : I
    //   135: aload #5
    //   137: aload_2
    //   138: getfield a : Ljava/util/Map;
    //   141: ldc 'android:visibility:parent'
    //   143: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   148: checkcast android/view/ViewGroup
    //   151: putfield f : Landroid/view/ViewGroup;
    //   154: goto -> 169
    //   157: aload #5
    //   159: iconst_m1
    //   160: putfield d : I
    //   163: aload #5
    //   165: aconst_null
    //   166: putfield f : Landroid/view/ViewGroup;
    //   169: aload_1
    //   170: ifnull -> 262
    //   173: aload_2
    //   174: ifnull -> 262
    //   177: aload #5
    //   179: getfield c : I
    //   182: aload #5
    //   184: getfield d : I
    //   187: if_icmpne -> 206
    //   190: aload #5
    //   192: getfield e : Landroid/view/ViewGroup;
    //   195: aload #5
    //   197: getfield f : Landroid/view/ViewGroup;
    //   200: if_acmpne -> 206
    //   203: aload #5
    //   205: areturn
    //   206: aload #5
    //   208: getfield c : I
    //   211: istore #4
    //   213: aload #5
    //   215: getfield d : I
    //   218: istore_3
    //   219: iload #4
    //   221: iload_3
    //   222: if_icmpeq -> 240
    //   225: iload #4
    //   227: ifne -> 233
    //   230: goto -> 301
    //   233: iload_3
    //   234: ifne -> 310
    //   237: goto -> 274
    //   240: aload #5
    //   242: getfield f : Landroid/view/ViewGroup;
    //   245: ifnonnull -> 251
    //   248: goto -> 301
    //   251: aload #5
    //   253: getfield e : Landroid/view/ViewGroup;
    //   256: ifnonnull -> 310
    //   259: goto -> 274
    //   262: aload_1
    //   263: ifnonnull -> 289
    //   266: aload #5
    //   268: getfield d : I
    //   271: ifne -> 289
    //   274: aload #5
    //   276: iconst_1
    //   277: putfield b : Z
    //   280: aload #5
    //   282: iconst_1
    //   283: putfield a : Z
    //   286: goto -> 310
    //   289: aload_2
    //   290: ifnonnull -> 310
    //   293: aload #5
    //   295: getfield c : I
    //   298: ifne -> 310
    //   301: aload #5
    //   303: iconst_0
    //   304: putfield b : Z
    //   307: goto -> 280
    //   310: aload #5
    //   312: areturn
  }
  
  public abstract Animator K(ViewGroup paramViewGroup, View paramView, q paramq1, q paramq2);
  
  public void e(q paramq) {
    I(paramq);
  }
  
  public Animator l(ViewGroup paramViewGroup, q paramq1, q paramq2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: aload_3
    //   3: invokevirtual J : (Lb/t/q;Lb/t/q;)Lb/t/d0$b;
    //   6: astore #11
    //   8: aload #11
    //   10: getfield a : Z
    //   13: istore #9
    //   15: aconst_null
    //   16: astore #14
    //   18: aconst_null
    //   19: astore #10
    //   21: aload #14
    //   23: astore #12
    //   25: iload #9
    //   27: ifeq -> 759
    //   30: aload #11
    //   32: getfield e : Landroid/view/ViewGroup;
    //   35: ifnonnull -> 50
    //   38: aload #14
    //   40: astore #12
    //   42: aload #11
    //   44: getfield f : Landroid/view/ViewGroup;
    //   47: ifnull -> 759
    //   50: aload #11
    //   52: getfield b : Z
    //   55: ifeq -> 197
    //   58: aload #10
    //   60: astore_1
    //   61: aload_0
    //   62: getfield J : I
    //   65: iconst_1
    //   66: iand
    //   67: iconst_1
    //   68: if_icmpne -> 195
    //   71: aload_3
    //   72: ifnonnull -> 81
    //   75: aload #10
    //   77: astore_1
    //   78: goto -> 195
    //   81: aload_2
    //   82: ifnonnull -> 124
    //   85: aload_3
    //   86: getfield b : Landroid/view/View;
    //   89: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   92: checkcast android/view/View
    //   95: astore_1
    //   96: aload_0
    //   97: aload_0
    //   98: aload_1
    //   99: iconst_0
    //   100: invokevirtual o : (Landroid/view/View;Z)Lb/t/q;
    //   103: aload_0
    //   104: aload_1
    //   105: iconst_0
    //   106: invokevirtual r : (Landroid/view/View;Z)Lb/t/q;
    //   109: invokevirtual J : (Lb/t/q;Lb/t/q;)Lb/t/d0$b;
    //   112: getfield a : Z
    //   115: ifeq -> 124
    //   118: aload #10
    //   120: astore_1
    //   121: goto -> 195
    //   124: aload_3
    //   125: getfield b : Landroid/view/View;
    //   128: astore_1
    //   129: aload_0
    //   130: checkcast b/t/c
    //   133: astore_3
    //   134: fconst_0
    //   135: fstore #5
    //   137: aload_2
    //   138: ifnull -> 169
    //   141: aload_2
    //   142: getfield a : Ljava/util/Map;
    //   145: ldc 'android:fade:transitionAlpha'
    //   147: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   152: checkcast java/lang/Float
    //   155: astore_2
    //   156: aload_2
    //   157: ifnull -> 169
    //   160: aload_2
    //   161: invokevirtual floatValue : ()F
    //   164: fstore #4
    //   166: goto -> 172
    //   169: fconst_0
    //   170: fstore #4
    //   172: fload #4
    //   174: fconst_1
    //   175: fcmpl
    //   176: ifne -> 186
    //   179: fload #5
    //   181: fstore #4
    //   183: goto -> 186
    //   186: aload_3
    //   187: aload_1
    //   188: fload #4
    //   190: fconst_1
    //   191: invokevirtual L : (Landroid/view/View;FF)Landroid/animation/Animator;
    //   194: astore_1
    //   195: aload_1
    //   196: areturn
    //   197: aload #11
    //   199: getfield d : I
    //   202: istore #7
    //   204: aload_0
    //   205: getfield J : I
    //   208: iconst_2
    //   209: iand
    //   210: iconst_2
    //   211: if_icmpeq -> 221
    //   214: aload #14
    //   216: astore #12
    //   218: goto -> 759
    //   221: aload_2
    //   222: ifnonnull -> 232
    //   225: aload #14
    //   227: astore #12
    //   229: goto -> 759
    //   232: aload_2
    //   233: getfield b : Landroid/view/View;
    //   236: astore #13
    //   238: aload_3
    //   239: ifnull -> 251
    //   242: aload_3
    //   243: getfield b : Landroid/view/View;
    //   246: astore #11
    //   248: goto -> 254
    //   251: aconst_null
    //   252: astore #11
    //   254: aload #13
    //   256: getstatic b/t/f.save_overlay_view : I
    //   259: invokevirtual getTag : (I)Ljava/lang/Object;
    //   262: checkcast android/view/View
    //   265: astore #10
    //   267: aload #10
    //   269: ifnull -> 281
    //   272: aconst_null
    //   273: astore #11
    //   275: iconst_1
    //   276: istore #6
    //   278: goto -> 509
    //   281: aload #11
    //   283: ifnull -> 326
    //   286: aload #11
    //   288: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   291: ifnonnull -> 297
    //   294: goto -> 326
    //   297: iload #7
    //   299: iconst_4
    //   300: if_icmpne -> 306
    //   303: goto -> 313
    //   306: aload #13
    //   308: aload #11
    //   310: if_acmpne -> 340
    //   313: aload #11
    //   315: astore #10
    //   317: iconst_0
    //   318: istore #6
    //   320: aconst_null
    //   321: astore #11
    //   323: goto -> 349
    //   326: aload #11
    //   328: ifnull -> 340
    //   331: aconst_null
    //   332: astore #10
    //   334: iconst_0
    //   335: istore #6
    //   337: goto -> 349
    //   340: aconst_null
    //   341: astore #11
    //   343: aconst_null
    //   344: astore #10
    //   346: iconst_1
    //   347: istore #6
    //   349: aload #11
    //   351: astore #12
    //   353: iload #6
    //   355: ifeq -> 498
    //   358: aload #13
    //   360: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   363: ifnonnull -> 369
    //   366: goto -> 484
    //   369: aload #11
    //   371: astore #12
    //   373: aload #13
    //   375: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   378: instanceof android/view/View
    //   381: ifeq -> 498
    //   384: aload #13
    //   386: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   389: checkcast android/view/View
    //   392: astore #15
    //   394: aload_0
    //   395: aload_0
    //   396: aload #15
    //   398: iconst_1
    //   399: invokevirtual r : (Landroid/view/View;Z)Lb/t/q;
    //   402: aload_0
    //   403: aload #15
    //   405: iconst_1
    //   406: invokevirtual o : (Landroid/view/View;Z)Lb/t/q;
    //   409: invokevirtual J : (Lb/t/q;Lb/t/q;)Lb/t/d0$b;
    //   412: getfield a : Z
    //   415: ifne -> 431
    //   418: aload_1
    //   419: aload #13
    //   421: aload #15
    //   423: invokestatic a : (Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)Landroid/view/View;
    //   426: astore #12
    //   428: goto -> 498
    //   431: aload #15
    //   433: invokevirtual getId : ()I
    //   436: istore #6
    //   438: aload #11
    //   440: astore #12
    //   442: aload #15
    //   444: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   447: ifnonnull -> 498
    //   450: aload #11
    //   452: astore #12
    //   454: iload #6
    //   456: iconst_m1
    //   457: if_icmpeq -> 498
    //   460: aload #11
    //   462: astore #12
    //   464: aload_1
    //   465: iload #6
    //   467: invokevirtual findViewById : (I)Landroid/view/View;
    //   470: ifnull -> 498
    //   473: aload #11
    //   475: astore #12
    //   477: aload_0
    //   478: getfield w : Z
    //   481: ifeq -> 498
    //   484: aload #10
    //   486: astore #11
    //   488: iconst_0
    //   489: istore #6
    //   491: aload #13
    //   493: astore #10
    //   495: goto -> 509
    //   498: iconst_0
    //   499: istore #6
    //   501: aload #10
    //   503: astore #11
    //   505: aload #12
    //   507: astore #10
    //   509: aload #10
    //   511: ifnull -> 674
    //   514: iload #6
    //   516: ifne -> 603
    //   519: aload_2
    //   520: getfield a : Ljava/util/Map;
    //   523: ldc 'android:visibility:screenLocation'
    //   525: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   530: checkcast [I
    //   533: astore #11
    //   535: aload #11
    //   537: iconst_0
    //   538: iaload
    //   539: istore #8
    //   541: aload #11
    //   543: iconst_1
    //   544: iaload
    //   545: istore #7
    //   547: iconst_2
    //   548: newarray int
    //   550: astore #11
    //   552: aload_1
    //   553: aload #11
    //   555: invokevirtual getLocationOnScreen : ([I)V
    //   558: aload #10
    //   560: iload #8
    //   562: aload #11
    //   564: iconst_0
    //   565: iaload
    //   566: isub
    //   567: aload #10
    //   569: invokevirtual getLeft : ()I
    //   572: isub
    //   573: invokevirtual offsetLeftAndRight : (I)V
    //   576: aload #10
    //   578: iload #7
    //   580: aload #11
    //   582: iconst_1
    //   583: iaload
    //   584: isub
    //   585: aload #10
    //   587: invokevirtual getTop : ()I
    //   590: isub
    //   591: invokevirtual offsetTopAndBottom : (I)V
    //   594: aload_1
    //   595: invokevirtual getOverlay : ()Landroid/view/ViewGroupOverlay;
    //   598: aload #10
    //   600: invokevirtual add : (Landroid/view/View;)V
    //   603: aload_0
    //   604: aload_1
    //   605: aload #10
    //   607: aload_2
    //   608: aload_3
    //   609: invokevirtual K : (Landroid/view/ViewGroup;Landroid/view/View;Lb/t/q;Lb/t/q;)Landroid/animation/Animator;
    //   612: astore_2
    //   613: aload_2
    //   614: astore #12
    //   616: iload #6
    //   618: ifne -> 759
    //   621: aload_2
    //   622: ifnonnull -> 640
    //   625: aload_1
    //   626: invokevirtual getOverlay : ()Landroid/view/ViewGroupOverlay;
    //   629: aload #10
    //   631: invokevirtual remove : (Landroid/view/View;)V
    //   634: aload_2
    //   635: astore #12
    //   637: goto -> 759
    //   640: aload #13
    //   642: getstatic b/t/f.save_overlay_view : I
    //   645: aload #10
    //   647: invokevirtual setTag : (ILjava/lang/Object;)V
    //   650: aload_0
    //   651: new b/t/c0
    //   654: dup
    //   655: aload_0
    //   656: aload_1
    //   657: aload #10
    //   659: aload #13
    //   661: invokespecial <init> : (Lb/t/d0;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    //   664: invokevirtual a : (Lb/t/i$d;)Lb/t/i;
    //   667: pop
    //   668: aload_2
    //   669: astore #12
    //   671: goto -> 759
    //   674: aload #14
    //   676: astore #12
    //   678: aload #11
    //   680: ifnull -> 759
    //   683: aload #11
    //   685: invokevirtual getVisibility : ()I
    //   688: istore #6
    //   690: getstatic b/t/v.a : Lb/t/b0;
    //   693: aload #11
    //   695: iconst_0
    //   696: invokevirtual f : (Landroid/view/View;I)V
    //   699: aload_0
    //   700: aload_1
    //   701: aload #11
    //   703: aload_2
    //   704: aload_3
    //   705: invokevirtual K : (Landroid/view/ViewGroup;Landroid/view/View;Lb/t/q;Lb/t/q;)Landroid/animation/Animator;
    //   708: astore #12
    //   710: aload #12
    //   712: ifnull -> 749
    //   715: new b/t/d0$a
    //   718: dup
    //   719: aload #11
    //   721: iload #7
    //   723: iconst_1
    //   724: invokespecial <init> : (Landroid/view/View;IZ)V
    //   727: astore_1
    //   728: aload #12
    //   730: aload_1
    //   731: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   734: aload #12
    //   736: aload_1
    //   737: invokevirtual addPauseListener : (Landroid/animation/Animator$AnimatorPauseListener;)V
    //   740: aload_0
    //   741: aload_1
    //   742: invokevirtual a : (Lb/t/i$d;)Lb/t/i;
    //   745: pop
    //   746: goto -> 759
    //   749: getstatic b/t/v.a : Lb/t/b0;
    //   752: aload #11
    //   754: iload #6
    //   756: invokevirtual f : (Landroid/view/View;I)V
    //   759: aload #12
    //   761: areturn
  }
  
  public String[] q() {
    return K;
  }
  
  public boolean s(q paramq1, q paramq2) {
    boolean bool = false;
    if (paramq1 == null && paramq2 == null)
      return false; 
    if (paramq1 != null && paramq2 != null && paramq2.a.containsKey("android:visibility:visibility") != paramq1.a.containsKey("android:visibility:visibility"))
      return false; 
    b b = J(paramq1, paramq2);
    null = bool;
    if (b.a) {
      if (b.c != 0) {
        null = bool;
        return (b.d == 0) ? true : null;
      } 
    } else {
      return null;
    } 
    return true;
  }
  
  public static class a extends AnimatorListenerAdapter implements i.d {
    public final View a;
    
    public final int b;
    
    public final ViewGroup c;
    
    public final boolean d;
    
    public boolean e;
    
    public boolean f = false;
    
    public a(View param1View, int param1Int, boolean param1Boolean) {
      this.a = param1View;
      this.b = param1Int;
      this.c = (ViewGroup)param1View.getParent();
      this.d = param1Boolean;
      g(true);
    }
    
    public void a(i param1i) {}
    
    public void b(i param1i) {}
    
    public void c(i param1i) {
      f();
      param1i.w(this);
    }
    
    public void d(i param1i) {
      g(false);
    }
    
    public void e(i param1i) {
      g(true);
    }
    
    public final void f() {
      if (!this.f) {
        View view = this.a;
        int i = this.b;
        v.a.f(view, i);
        ViewGroup viewGroup = this.c;
        if (viewGroup != null)
          viewGroup.invalidate(); 
      } 
      g(false);
    }
    
    public final void g(boolean param1Boolean) {
      if (this.d && this.e != param1Boolean) {
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
          this.e = param1Boolean;
          s.a(viewGroup, param1Boolean);
        } 
      } 
    }
    
    public void onAnimationCancel(Animator param1Animator) {
      this.f = true;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      f();
    }
    
    public void onAnimationPause(Animator param1Animator) {
      if (!this.f) {
        View view = this.a;
        int i = this.b;
        v.a.f(view, i);
      } 
    }
    
    public void onAnimationRepeat(Animator param1Animator) {}
    
    public void onAnimationResume(Animator param1Animator) {
      if (!this.f) {
        View view = this.a;
        v.a.f(view, 0);
      } 
    }
    
    public void onAnimationStart(Animator param1Animator) {}
  }
  
  public static class b {
    public boolean a;
    
    public boolean b;
    
    public int c;
    
    public int d;
    
    public ViewGroup e;
    
    public ViewGroup f;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */