package b.r.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class l extends RecyclerView.n implements RecyclerView.s {
  public static final int[] D = new int[] { 16842919 };
  
  public static final int[] E = new int[0];
  
  public int A = 0;
  
  public final Runnable B = new a(this);
  
  public final RecyclerView.t C = new b(this);
  
  public final int a;
  
  public final int b;
  
  public final StateListDrawable c;
  
  public final Drawable d;
  
  public final int e;
  
  public final int f;
  
  public final StateListDrawable g;
  
  public final Drawable h;
  
  public final int i;
  
  public final int j;
  
  public int k;
  
  public int l;
  
  public float m;
  
  public int n;
  
  public int o;
  
  public float p;
  
  public int q = 0;
  
  public int r = 0;
  
  public RecyclerView s;
  
  public boolean t = false;
  
  public boolean u = false;
  
  public int v = 0;
  
  public int w = 0;
  
  public final int[] x = new int[2];
  
  public final int[] y = new int[2];
  
  public final ValueAnimator z = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
  
  public l(RecyclerView paramRecyclerView, StateListDrawable paramStateListDrawable1, Drawable paramDrawable1, StateListDrawable paramStateListDrawable2, Drawable paramDrawable2, int paramInt1, int paramInt2, int paramInt3) {
    this.c = paramStateListDrawable1;
    this.d = paramDrawable1;
    this.g = paramStateListDrawable2;
    this.h = paramDrawable2;
    this.e = Math.max(paramInt1, paramStateListDrawable1.getIntrinsicWidth());
    this.f = Math.max(paramInt1, paramDrawable1.getIntrinsicWidth());
    this.i = Math.max(paramInt1, paramStateListDrawable2.getIntrinsicWidth());
    this.j = Math.max(paramInt1, paramDrawable2.getIntrinsicWidth());
    this.a = paramInt2;
    this.b = paramInt3;
    this.c.setAlpha(255);
    this.d.setAlpha(255);
    this.z.addListener((Animator.AnimatorListener)new c(this));
    this.z.addUpdateListener(new d(this));
    RecyclerView recyclerView = this.s;
    if (recyclerView != paramRecyclerView) {
      if (recyclerView != null) {
        recyclerView.removeItemDecoration(this);
        this.s.removeOnItemTouchListener(this);
        this.s.removeOnScrollListener(this.C);
        f();
      } 
      this.s = paramRecyclerView;
      paramRecyclerView.addItemDecoration(this);
      this.s.addOnItemTouchListener(this);
      this.s.addOnScrollListener(this.C);
    } 
  }
  
  public void a(boolean paramBoolean) {}
  
  public boolean b(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent) {
    int i = this.v;
    null = true;
    if (i == 1) {
      boolean bool1 = h(paramMotionEvent.getX(), paramMotionEvent.getY());
      boolean bool2 = g(paramMotionEvent.getX(), paramMotionEvent.getY());
      if (paramMotionEvent.getAction() == 0 && (bool1 || bool2)) {
        if (bool2) {
          this.w = 1;
          this.p = (int)paramMotionEvent.getX();
        } else if (bool1) {
          this.w = 2;
          this.m = (int)paramMotionEvent.getY();
        } 
        j(2);
        return null;
      } 
    } else if (i == 2) {
      return null;
    } 
    return false;
  }
  
  public void c(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent) {
    if (this.v == 0)
      return; 
    if (paramMotionEvent.getAction() == 0) {
      boolean bool1 = h(paramMotionEvent.getX(), paramMotionEvent.getY());
      boolean bool2 = g(paramMotionEvent.getX(), paramMotionEvent.getY());
      if (bool1 || bool2) {
        if (bool2) {
          this.w = 1;
          this.p = (int)paramMotionEvent.getX();
        } else if (bool1) {
          this.w = 2;
          this.m = (int)paramMotionEvent.getY();
        } 
        j(2);
      } 
    } else if (paramMotionEvent.getAction() == 1 && this.v == 2) {
      this.m = 0.0F;
      this.p = 0.0F;
      j(1);
      this.w = 0;
    } else if (paramMotionEvent.getAction() == 2 && this.v == 2) {
      k();
      if (this.w == 1) {
        float f = paramMotionEvent.getX();
        int[] arrayOfInt = this.y;
        int i = this.b;
        arrayOfInt[0] = i;
        arrayOfInt[1] = this.q - i;
        f = Math.max(arrayOfInt[0], Math.min(arrayOfInt[1], f));
        if (Math.abs(this.o - f) >= 2.0F) {
          i = i(this.p, f, arrayOfInt, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
          if (i != 0)
            this.s.scrollBy(i, 0); 
          this.p = f;
        } 
      } 
      if (this.w == 2) {
        float f = paramMotionEvent.getY();
        int[] arrayOfInt = this.x;
        int i = this.b;
        arrayOfInt[0] = i;
        arrayOfInt[1] = this.r - i;
        f = Math.max(arrayOfInt[0], Math.min(arrayOfInt[1], f));
        if (Math.abs(this.l - f) >= 2.0F) {
          i = i(this.m, f, arrayOfInt, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
          if (i != 0)
            this.s.scrollBy(0, i); 
          this.m = f;
        } 
      } 
    } 
  }
  
  public void e(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.a0 parama0) {
    if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
      this.q = this.s.getWidth();
      this.r = this.s.getHeight();
      j(0);
      return;
    } 
    if (this.A != 0) {
      if (this.t) {
        int j = this.q;
        int i = this.e;
        j -= i;
        int k = this.l;
        int m = this.k;
        k -= m / 2;
        this.c.setBounds(0, 0, i, m);
        this.d.setBounds(0, 0, this.f, this.r);
        m = b.i.m.l.r((View)this.s);
        i = 1;
        if (m != 1)
          i = 0; 
        if (i != 0) {
          this.d.draw(paramCanvas);
          paramCanvas.translate(this.e, k);
          paramCanvas.scale(-1.0F, 1.0F);
          this.c.draw(paramCanvas);
          paramCanvas.scale(1.0F, 1.0F);
          i = this.e;
        } else {
          paramCanvas.translate(j, 0.0F);
          this.d.draw(paramCanvas);
          paramCanvas.translate(0.0F, k);
          this.c.draw(paramCanvas);
          i = j;
        } 
        paramCanvas.translate(-i, -k);
      } 
      if (this.u) {
        int j = this.r;
        int i = this.i;
        int k = j - i;
        int m = this.o;
        j = this.n;
        m -= j / 2;
        this.g.setBounds(0, 0, j, i);
        this.h.setBounds(0, 0, this.q, this.j);
        paramCanvas.translate(0.0F, k);
        this.h.draw(paramCanvas);
        paramCanvas.translate(m, 0.0F);
        this.g.draw(paramCanvas);
        paramCanvas.translate(-m, -k);
      } 
    } 
  }
  
  public final void f() {
    this.s.removeCallbacks(this.B);
  }
  
  public boolean g(float paramFloat1, float paramFloat2) {
    if (paramFloat2 >= (this.r - this.i)) {
      int i = this.o;
      int j = this.n;
      if (paramFloat1 >= (i - j / 2) && paramFloat1 <= (j / 2 + i))
        return true; 
    } 
    return false;
  }
  
  public boolean h(float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield s : Landroidx/recyclerview/widget/RecyclerView;
    //   4: invokestatic r : (Landroid/view/View;)I
    //   7: istore_3
    //   8: iconst_0
    //   9: istore #6
    //   11: iload_3
    //   12: iconst_1
    //   13: if_icmpne -> 21
    //   16: iconst_1
    //   17: istore_3
    //   18: goto -> 23
    //   21: iconst_0
    //   22: istore_3
    //   23: iload_3
    //   24: ifeq -> 46
    //   27: iload #6
    //   29: istore #5
    //   31: fload_1
    //   32: aload_0
    //   33: getfield e : I
    //   36: iconst_2
    //   37: idiv
    //   38: i2f
    //   39: fcmpg
    //   40: ifgt -> 109
    //   43: goto -> 65
    //   46: iload #6
    //   48: istore #5
    //   50: fload_1
    //   51: aload_0
    //   52: getfield q : I
    //   55: aload_0
    //   56: getfield e : I
    //   59: isub
    //   60: i2f
    //   61: fcmpl
    //   62: iflt -> 109
    //   65: aload_0
    //   66: getfield l : I
    //   69: istore_3
    //   70: aload_0
    //   71: getfield k : I
    //   74: iconst_2
    //   75: idiv
    //   76: istore #4
    //   78: iload #6
    //   80: istore #5
    //   82: fload_2
    //   83: iload_3
    //   84: iload #4
    //   86: isub
    //   87: i2f
    //   88: fcmpl
    //   89: iflt -> 109
    //   92: iload #6
    //   94: istore #5
    //   96: fload_2
    //   97: iload #4
    //   99: iload_3
    //   100: iadd
    //   101: i2f
    //   102: fcmpg
    //   103: ifgt -> 109
    //   106: iconst_1
    //   107: istore #5
    //   109: iload #5
    //   111: ireturn
  }
  
  public final int i(float paramFloat1, float paramFloat2, int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramArrayOfint[1] - paramArrayOfint[0];
    if (i == 0)
      return 0; 
    paramFloat1 = (paramFloat2 - paramFloat1) / i;
    paramInt3 = paramInt1 - paramInt3;
    paramInt1 = (int)(paramFloat1 * paramInt3);
    paramInt2 += paramInt1;
    return (paramInt2 < paramInt3 && paramInt2 >= 0) ? paramInt1 : 0;
  }
  
  public void j(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_2
    //   2: if_icmpne -> 28
    //   5: aload_0
    //   6: getfield v : I
    //   9: iconst_2
    //   10: if_icmpeq -> 28
    //   13: aload_0
    //   14: getfield c : Landroid/graphics/drawable/StateListDrawable;
    //   17: getstatic b/r/d/l.D : [I
    //   20: invokevirtual setState : ([I)Z
    //   23: pop
    //   24: aload_0
    //   25: invokevirtual f : ()V
    //   28: iload_1
    //   29: ifne -> 42
    //   32: aload_0
    //   33: getfield s : Landroidx/recyclerview/widget/RecyclerView;
    //   36: invokevirtual invalidate : ()V
    //   39: goto -> 46
    //   42: aload_0
    //   43: invokevirtual k : ()V
    //   46: aload_0
    //   47: getfield v : I
    //   50: iconst_2
    //   51: if_icmpne -> 77
    //   54: iload_1
    //   55: iconst_2
    //   56: if_icmpeq -> 77
    //   59: aload_0
    //   60: getfield c : Landroid/graphics/drawable/StateListDrawable;
    //   63: getstatic b/r/d/l.E : [I
    //   66: invokevirtual setState : ([I)Z
    //   69: pop
    //   70: sipush #1200
    //   73: istore_2
    //   74: goto -> 86
    //   77: iload_1
    //   78: iconst_1
    //   79: if_icmpne -> 104
    //   82: sipush #1500
    //   85: istore_2
    //   86: aload_0
    //   87: invokevirtual f : ()V
    //   90: aload_0
    //   91: getfield s : Landroidx/recyclerview/widget/RecyclerView;
    //   94: aload_0
    //   95: getfield B : Ljava/lang/Runnable;
    //   98: iload_2
    //   99: i2l
    //   100: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   103: pop
    //   104: aload_0
    //   105: iload_1
    //   106: putfield v : I
    //   109: return
  }
  
  public void k() {
    int i = this.A;
    if (i != 0) {
      if (i != 3)
        return; 
      this.z.cancel();
    } 
    this.A = 1;
    ValueAnimator valueAnimator = this.z;
    valueAnimator.setFloatValues(new float[] { ((Float)valueAnimator.getAnimatedValue()).floatValue(), 1.0F });
    this.z.setDuration(500L);
    this.z.setStartDelay(0L);
    this.z.start();
  }
  
  public class a implements Runnable {
    public final l b;
    
    public a(l this$0) {}
    
    public void run() {
      l l1 = this.b;
      int i = l1.A;
      if (i != 1) {
        if (i != 2)
          return; 
      } else {
        l1.z.cancel();
      } 
      l1.A = 3;
      ValueAnimator valueAnimator = l1.z;
      valueAnimator.setFloatValues(new float[] { ((Float)valueAnimator.getAnimatedValue()).floatValue(), 0.0F });
      l1.z.setDuration(500L);
      l1.z.start();
    }
  }
  
  public class b extends RecyclerView.t {
    public final l a;
    
    public b(l this$0) {}
    
    public void b(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {
      boolean bool;
      l l1 = this.a;
      int j = param1RecyclerView.computeHorizontalScrollOffset();
      param1Int2 = param1RecyclerView.computeVerticalScrollOffset();
      int i = l1.s.computeVerticalScrollRange();
      int k = l1.r;
      if (i - k > 0 && k >= l1.a) {
        bool = true;
      } else {
        bool = false;
      } 
      l1.t = bool;
      int m = l1.s.computeHorizontalScrollRange();
      param1Int1 = l1.q;
      if (m - param1Int1 > 0 && param1Int1 >= l1.a) {
        bool = true;
      } else {
        bool = false;
      } 
      l1.u = bool;
      if (!l1.t && !bool) {
        if (l1.v != 0)
          l1.j(0); 
      } else {
        if (l1.t) {
          float f2 = param1Int2;
          float f1 = k;
          l1.l = (int)((f1 / 2.0F + f2) * f1 / i);
          l1.k = Math.min(k, k * k / i);
        } 
        if (l1.u) {
          float f1 = j;
          float f2 = param1Int1;
          l1.o = (int)((f2 / 2.0F + f1) * f2 / m);
          l1.n = Math.min(param1Int1, param1Int1 * param1Int1 / m);
        } 
        param1Int1 = l1.v;
        if (param1Int1 == 0 || param1Int1 == 1)
          l1.j(1); 
      } 
    }
  }
  
  public class c extends AnimatorListenerAdapter {
    public boolean a = false;
    
    public final l b;
    
    public c(l this$0) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a = true;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      if (this.a) {
        this.a = false;
        return;
      } 
      if (((Float)this.b.z.getAnimatedValue()).floatValue() == 0.0F) {
        l l1 = this.b;
        l1.A = 0;
        l1.j(0);
      } else {
        l l1 = this.b;
        l1.A = 2;
        l1.s.invalidate();
      } 
    }
  }
  
  public class d implements ValueAnimator.AnimatorUpdateListener {
    public final l a;
    
    public d(l this$0) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      int i = (int)(((Float)param1ValueAnimator.getAnimatedValue()).floatValue() * 255.0F);
      this.a.c.setAlpha(i);
      this.a.d.setAlpha(i);
      this.a.s.invalidate();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */