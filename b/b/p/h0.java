package b.b.p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import b.b.o.i.p;

public abstract class h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
  public final float b;
  
  public final int c;
  
  public final int d;
  
  public final View e;
  
  public Runnable f;
  
  public Runnable g;
  
  public boolean h;
  
  public int i;
  
  public final int[] j = new int[2];
  
  public h0(View paramView) {
    this.e = paramView;
    paramView.setLongClickable(true);
    paramView.addOnAttachStateChangeListener(this);
    this.b = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
    int i = ViewConfiguration.getTapTimeout();
    this.c = i;
    this.d = (ViewConfiguration.getLongPressTimeout() + i) / 2;
  }
  
  public final void a() {
    Runnable runnable = this.g;
    if (runnable != null)
      this.e.removeCallbacks(runnable); 
    runnable = this.f;
    if (runnable != null)
      this.e.removeCallbacks(runnable); 
  }
  
  public abstract p b();
  
  public abstract boolean c();
  
  public boolean d() {
    p p = b();
    if (p != null && p.a())
      p.dismiss(); 
    return true;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Z
    //   4: istore #11
    //   6: iconst_0
    //   7: istore #10
    //   9: iload #11
    //   11: ifeq -> 221
    //   14: aload_0
    //   15: getfield e : Landroid/view/View;
    //   18: astore_1
    //   19: aload_0
    //   20: invokevirtual b : ()Lb/b/o/i/p;
    //   23: astore #14
    //   25: aload #14
    //   27: ifnull -> 191
    //   30: aload #14
    //   32: invokeinterface a : ()Z
    //   37: ifne -> 43
    //   40: goto -> 191
    //   43: aload #14
    //   45: invokeinterface e : ()Landroid/widget/ListView;
    //   50: checkcast b/b/p/f0
    //   53: astore #15
    //   55: aload #15
    //   57: ifnull -> 191
    //   60: aload #15
    //   62: invokevirtual isShown : ()Z
    //   65: ifne -> 71
    //   68: goto -> 191
    //   71: aload_2
    //   72: invokestatic obtainNoHistory : (Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
    //   75: astore #14
    //   77: aload_0
    //   78: getfield j : [I
    //   81: astore #16
    //   83: aload_1
    //   84: aload #16
    //   86: invokevirtual getLocationOnScreen : ([I)V
    //   89: aload #14
    //   91: aload #16
    //   93: iconst_0
    //   94: iaload
    //   95: i2f
    //   96: aload #16
    //   98: iconst_1
    //   99: iaload
    //   100: i2f
    //   101: invokevirtual offsetLocation : (FF)V
    //   104: aload_0
    //   105: getfield j : [I
    //   108: astore_1
    //   109: aload #15
    //   111: aload_1
    //   112: invokevirtual getLocationOnScreen : ([I)V
    //   115: aload #14
    //   117: aload_1
    //   118: iconst_0
    //   119: iaload
    //   120: ineg
    //   121: i2f
    //   122: aload_1
    //   123: iconst_1
    //   124: iaload
    //   125: ineg
    //   126: i2f
    //   127: invokevirtual offsetLocation : (FF)V
    //   130: aload #15
    //   132: aload #14
    //   134: aload_0
    //   135: getfield i : I
    //   138: invokevirtual b : (Landroid/view/MotionEvent;I)Z
    //   141: istore #8
    //   143: aload #14
    //   145: invokevirtual recycle : ()V
    //   148: aload_2
    //   149: invokevirtual getActionMasked : ()I
    //   152: istore #7
    //   154: iload #7
    //   156: iconst_1
    //   157: if_icmpeq -> 172
    //   160: iload #7
    //   162: iconst_3
    //   163: if_icmpeq -> 172
    //   166: iconst_1
    //   167: istore #7
    //   169: goto -> 175
    //   172: iconst_0
    //   173: istore #7
    //   175: iload #8
    //   177: ifeq -> 191
    //   180: iload #7
    //   182: ifeq -> 191
    //   185: iconst_1
    //   186: istore #7
    //   188: goto -> 194
    //   191: iconst_0
    //   192: istore #7
    //   194: iload #7
    //   196: ifne -> 215
    //   199: aload_0
    //   200: invokevirtual d : ()Z
    //   203: ifne -> 209
    //   206: goto -> 215
    //   209: iconst_0
    //   210: istore #8
    //   212: goto -> 547
    //   215: iconst_1
    //   216: istore #8
    //   218: goto -> 547
    //   221: aload_0
    //   222: getfield e : Landroid/view/View;
    //   225: astore_1
    //   226: aload_1
    //   227: invokevirtual isEnabled : ()Z
    //   230: ifne -> 239
    //   233: iconst_0
    //   234: istore #7
    //   236: goto -> 483
    //   239: aload_2
    //   240: invokevirtual getActionMasked : ()I
    //   243: istore #7
    //   245: iload #7
    //   247: ifeq -> 405
    //   250: iload #7
    //   252: iconst_1
    //   253: if_icmpeq -> 398
    //   256: iload #7
    //   258: iconst_2
    //   259: if_icmpeq -> 271
    //   262: iload #7
    //   264: iconst_3
    //   265: if_icmpeq -> 398
    //   268: goto -> 233
    //   271: aload_2
    //   272: aload_0
    //   273: getfield i : I
    //   276: invokevirtual findPointerIndex : (I)I
    //   279: istore #7
    //   281: iload #7
    //   283: iflt -> 233
    //   286: aload_2
    //   287: iload #7
    //   289: invokevirtual getX : (I)F
    //   292: fstore #6
    //   294: aload_2
    //   295: iload #7
    //   297: invokevirtual getY : (I)F
    //   300: fstore #4
    //   302: aload_0
    //   303: getfield b : F
    //   306: fstore #5
    //   308: fload #5
    //   310: fneg
    //   311: fstore_3
    //   312: fload #6
    //   314: fload_3
    //   315: fcmpl
    //   316: iflt -> 370
    //   319: fload #4
    //   321: fload_3
    //   322: fcmpl
    //   323: iflt -> 370
    //   326: fload #6
    //   328: aload_1
    //   329: invokevirtual getRight : ()I
    //   332: aload_1
    //   333: invokevirtual getLeft : ()I
    //   336: isub
    //   337: i2f
    //   338: fload #5
    //   340: fadd
    //   341: fcmpg
    //   342: ifge -> 370
    //   345: fload #4
    //   347: aload_1
    //   348: invokevirtual getBottom : ()I
    //   351: aload_1
    //   352: invokevirtual getTop : ()I
    //   355: isub
    //   356: i2f
    //   357: fload #5
    //   359: fadd
    //   360: fcmpg
    //   361: ifge -> 370
    //   364: iconst_1
    //   365: istore #7
    //   367: goto -> 373
    //   370: iconst_0
    //   371: istore #7
    //   373: iload #7
    //   375: ifne -> 233
    //   378: aload_0
    //   379: invokevirtual a : ()V
    //   382: aload_1
    //   383: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   386: iconst_1
    //   387: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   392: iconst_1
    //   393: istore #7
    //   395: goto -> 483
    //   398: aload_0
    //   399: invokevirtual a : ()V
    //   402: goto -> 233
    //   405: aload_0
    //   406: aload_2
    //   407: iconst_0
    //   408: invokevirtual getPointerId : (I)I
    //   411: putfield i : I
    //   414: aload_0
    //   415: getfield f : Ljava/lang/Runnable;
    //   418: ifnonnull -> 433
    //   421: aload_0
    //   422: new b/b/p/h0$a
    //   425: dup
    //   426: aload_0
    //   427: invokespecial <init> : (Lb/b/p/h0;)V
    //   430: putfield f : Ljava/lang/Runnable;
    //   433: aload_1
    //   434: aload_0
    //   435: getfield f : Ljava/lang/Runnable;
    //   438: aload_0
    //   439: getfield c : I
    //   442: i2l
    //   443: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   446: pop
    //   447: aload_0
    //   448: getfield g : Ljava/lang/Runnable;
    //   451: ifnonnull -> 466
    //   454: aload_0
    //   455: new b/b/p/h0$b
    //   458: dup
    //   459: aload_0
    //   460: invokespecial <init> : (Lb/b/p/h0;)V
    //   463: putfield g : Ljava/lang/Runnable;
    //   466: aload_1
    //   467: aload_0
    //   468: getfield g : Ljava/lang/Runnable;
    //   471: aload_0
    //   472: getfield d : I
    //   475: i2l
    //   476: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   479: pop
    //   480: goto -> 233
    //   483: iload #7
    //   485: ifeq -> 501
    //   488: aload_0
    //   489: invokevirtual c : ()Z
    //   492: ifeq -> 501
    //   495: iconst_1
    //   496: istore #9
    //   498: goto -> 504
    //   501: iconst_0
    //   502: istore #9
    //   504: iload #9
    //   506: istore #8
    //   508: iload #9
    //   510: ifeq -> 547
    //   513: invokestatic uptimeMillis : ()J
    //   516: lstore #12
    //   518: lload #12
    //   520: lload #12
    //   522: iconst_3
    //   523: fconst_0
    //   524: fconst_0
    //   525: iconst_0
    //   526: invokestatic obtain : (JJIFFI)Landroid/view/MotionEvent;
    //   529: astore_1
    //   530: aload_0
    //   531: getfield e : Landroid/view/View;
    //   534: aload_1
    //   535: invokevirtual onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   538: pop
    //   539: aload_1
    //   540: invokevirtual recycle : ()V
    //   543: iload #9
    //   545: istore #8
    //   547: aload_0
    //   548: iload #8
    //   550: putfield h : Z
    //   553: iload #8
    //   555: ifne -> 567
    //   558: iload #10
    //   560: istore #8
    //   562: iload #11
    //   564: ifeq -> 570
    //   567: iconst_1
    //   568: istore #8
    //   570: iload #8
    //   572: ireturn
  }
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView) {
    this.h = false;
    this.i = -1;
    Runnable runnable = this.f;
    if (runnable != null)
      this.e.removeCallbacks(runnable); 
  }
  
  public class a implements Runnable {
    public final h0 b;
    
    public a(h0 this$0) {}
    
    public void run() {
      ViewParent viewParent = this.b.e.getParent();
      if (viewParent != null)
        viewParent.requestDisallowInterceptTouchEvent(true); 
    }
  }
  
  public class b implements Runnable {
    public final h0 b;
    
    public b(h0 this$0) {}
    
    public void run() {
      h0 h01 = this.b;
      h01.a();
      View view = h01.e;
      if (view.isEnabled() && !view.isLongClickable() && h01.c()) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long l = SystemClock.uptimeMillis();
        MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        view.onTouchEvent(motionEvent);
        motionEvent.recycle();
        h01.h = true;
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */