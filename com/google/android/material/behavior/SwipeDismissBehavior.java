package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.m.l;
import b.k.b.e;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
  public e a;
  
  public b b;
  
  public boolean c;
  
  public float d = 0.0F;
  
  public int e = 2;
  
  public float f = 0.5F;
  
  public float g = 0.0F;
  
  public float h = 0.5F;
  
  public final e.c i = new a(this);
  
  public static float C(float paramFloat1, float paramFloat2, float paramFloat3) {
    return Math.min(Math.max(paramFloat1, paramFloat2), paramFloat3);
  }
  
  public boolean A(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent) {
    e e1 = this.a;
    if (e1 != null) {
      e1.n(paramMotionEvent);
      return true;
    } 
    return false;
  }
  
  public boolean B(View paramView) {
    return true;
  }
  
  public boolean j(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent) {
    boolean bool = this.c;
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      if (i == 1 || i == 3)
        this.c = false; 
    } else {
      bool = paramCoordinatorLayout.j((View)paramV, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      this.c = bool;
    } 
    if (bool) {
      if (this.a == null) {
        e.c c1 = this.i;
        this.a = new e(paramCoordinatorLayout.getContext(), (ViewGroup)paramCoordinatorLayout, c1);
      } 
      return this.a.u(paramMotionEvent);
    } 
    return false;
  }
  
  public class a extends e.c {
    public int a;
    
    public int b = -1;
    
    public final SwipeDismissBehavior c;
    
    public a(SwipeDismissBehavior this$0) {}
    
    public int a(View param1View, int param1Int1, int param1Int2) {
      if (l.r(param1View) == 1) {
        param1Int2 = 1;
      } else {
        param1Int2 = 0;
      } 
      int i = this.c.e;
      if (i == 0) {
        if (param1Int2 != 0) {
          i = this.a - param1View.getWidth();
          param1Int2 = this.a;
        } 
      } else {
        if (i == 1) {
          if (param1Int2 != 0) {
            i = this.a;
            param1Int2 = param1View.getWidth() + i;
            return Math.min(Math.max(i, param1Int1), param1Int2);
          } 
        } else {
          i = this.a - param1View.getWidth();
          param1Int2 = this.a;
          param1Int2 = param1View.getWidth() + param1Int2;
          return Math.min(Math.max(i, param1Int1), param1Int2);
        } 
        i = this.a - param1View.getWidth();
        param1Int2 = this.a;
      } 
      i = this.a;
      param1Int2 = param1View.getWidth() + i;
      return Math.min(Math.max(i, param1Int1), param1Int2);
    }
    
    public int b(View param1View, int param1Int1, int param1Int2) {
      return param1View.getTop();
    }
    
    public int c(View param1View) {
      return param1View.getWidth();
    }
    
    public void e(View param1View, int param1Int) {
      this.b = param1Int;
      this.a = param1View.getLeft();
      ViewParent viewParent = param1View.getParent();
      if (viewParent != null)
        viewParent.requestDisallowInterceptTouchEvent(true); 
    }
    
    public void f(int param1Int) {
      SwipeDismissBehavior.b b = this.c.b;
      if (b != null)
        b.b(param1Int); 
    }
    
    public void g(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      float f1 = this.a;
      f1 = param1View.getWidth() * this.c.g + f1;
      float f2 = this.a;
      f2 = param1View.getWidth() * this.c.h + f2;
      float f3 = param1Int1;
      if (f3 <= f1) {
        param1View.setAlpha(1.0F);
      } else if (f3 >= f2) {
        param1View.setAlpha(0.0F);
      } else {
        param1View.setAlpha(SwipeDismissBehavior.C(0.0F, 1.0F - (f3 - f1) / (f2 - f1), 1.0F));
      } 
    }
    
    public void h(View param1View, float param1Float1, float param1Float2) {
      // Byte code:
      //   0: aload_0
      //   1: iconst_m1
      //   2: putfield b : I
      //   5: aload_1
      //   6: invokevirtual getWidth : ()I
      //   9: istore #5
      //   11: iconst_0
      //   12: istore #8
      //   14: fload_2
      //   15: fconst_0
      //   16: fcmpl
      //   17: istore #6
      //   19: iload #6
      //   21: ifeq -> 123
      //   24: aload_1
      //   25: invokestatic r : (Landroid/view/View;)I
      //   28: iconst_1
      //   29: if_icmpne -> 38
      //   32: iconst_1
      //   33: istore #4
      //   35: goto -> 41
      //   38: iconst_0
      //   39: istore #4
      //   41: aload_0
      //   42: getfield c : Lcom/google/android/material/behavior/SwipeDismissBehavior;
      //   45: getfield e : I
      //   48: istore #7
      //   50: iload #7
      //   52: iconst_2
      //   53: if_icmpne -> 59
      //   56: goto -> 83
      //   59: iload #7
      //   61: ifne -> 95
      //   64: iload #4
      //   66: ifeq -> 78
      //   69: fload_2
      //   70: fconst_0
      //   71: fcmpg
      //   72: ifge -> 89
      //   75: goto -> 83
      //   78: iload #6
      //   80: ifle -> 89
      //   83: iconst_1
      //   84: istore #4
      //   86: goto -> 169
      //   89: iconst_0
      //   90: istore #4
      //   92: goto -> 169
      //   95: iload #7
      //   97: iconst_1
      //   98: if_icmpne -> 89
      //   101: iload #4
      //   103: ifeq -> 114
      //   106: iload #6
      //   108: ifle -> 89
      //   111: goto -> 120
      //   114: fload_2
      //   115: fconst_0
      //   116: fcmpg
      //   117: ifge -> 89
      //   120: goto -> 83
      //   123: aload_1
      //   124: invokevirtual getLeft : ()I
      //   127: istore #7
      //   129: aload_0
      //   130: getfield a : I
      //   133: istore #6
      //   135: aload_1
      //   136: invokevirtual getWidth : ()I
      //   139: i2f
      //   140: aload_0
      //   141: getfield c : Lcom/google/android/material/behavior/SwipeDismissBehavior;
      //   144: getfield f : F
      //   147: fmul
      //   148: invokestatic round : (F)I
      //   151: istore #4
      //   153: iload #7
      //   155: iload #6
      //   157: isub
      //   158: invokestatic abs : (I)I
      //   161: iload #4
      //   163: if_icmplt -> 89
      //   166: goto -> 83
      //   169: iload #4
      //   171: ifeq -> 216
      //   174: aload_1
      //   175: invokevirtual getLeft : ()I
      //   178: istore #4
      //   180: aload_0
      //   181: getfield a : I
      //   184: istore #6
      //   186: iload #4
      //   188: iload #6
      //   190: if_icmpge -> 203
      //   193: iload #6
      //   195: iload #5
      //   197: isub
      //   198: istore #4
      //   200: goto -> 210
      //   203: iload #6
      //   205: iload #5
      //   207: iadd
      //   208: istore #4
      //   210: iconst_1
      //   211: istore #8
      //   213: goto -> 222
      //   216: aload_0
      //   217: getfield a : I
      //   220: istore #4
      //   222: aload_0
      //   223: getfield c : Lcom/google/android/material/behavior/SwipeDismissBehavior;
      //   226: getfield a : Lb/k/b/e;
      //   229: iload #4
      //   231: aload_1
      //   232: invokevirtual getTop : ()I
      //   235: invokevirtual t : (II)Z
      //   238: ifeq -> 262
      //   241: aload_1
      //   242: new com/google/android/material/behavior/SwipeDismissBehavior$c
      //   245: dup
      //   246: aload_0
      //   247: getfield c : Lcom/google/android/material/behavior/SwipeDismissBehavior;
      //   250: aload_1
      //   251: iload #8
      //   253: invokespecial <init> : (Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
      //   256: invokestatic P : (Landroid/view/View;Ljava/lang/Runnable;)V
      //   259: goto -> 289
      //   262: iload #8
      //   264: ifeq -> 289
      //   267: aload_0
      //   268: getfield c : Lcom/google/android/material/behavior/SwipeDismissBehavior;
      //   271: getfield b : Lcom/google/android/material/behavior/SwipeDismissBehavior$b;
      //   274: astore #9
      //   276: aload #9
      //   278: ifnull -> 289
      //   281: aload #9
      //   283: aload_1
      //   284: invokeinterface a : (Landroid/view/View;)V
      //   289: return
    }
    
    public boolean i(View param1View, int param1Int) {
      boolean bool;
      int i = this.b;
      if ((i == -1 || i == param1Int) && this.c.B(param1View)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
  }
  
  public static interface b {
    void a(View param1View);
    
    void b(int param1Int);
  }
  
  public class c implements Runnable {
    public final View b;
    
    public final boolean c;
    
    public final SwipeDismissBehavior d;
    
    public c(SwipeDismissBehavior this$0, View param1View, boolean param1Boolean) {
      this.b = param1View;
      this.c = param1Boolean;
    }
    
    public void run() {
      e e = this.d.a;
      if (e != null && e.i(true)) {
        l.P(this.b, this);
      } else if (this.c) {
        SwipeDismissBehavior.b b = this.d.b;
        if (b != null)
          b.a(this.b); 
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\behavior\SwipeDismissBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */