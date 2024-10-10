package b.i.n;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import b.i.m.l;

public abstract class a implements View.OnTouchListener {
  public static final int r = ViewConfiguration.getTapTimeout();
  
  public final a b = new a();
  
  public final Interpolator c = (Interpolator)new AccelerateInterpolator();
  
  public final View d;
  
  public Runnable e;
  
  public float[] f = new float[] { 0.0F, 0.0F };
  
  public float[] g = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
  
  public int h;
  
  public int i;
  
  public float[] j = new float[] { 0.0F, 0.0F };
  
  public float[] k = new float[] { 0.0F, 0.0F };
  
  public float[] l = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
  
  public boolean m;
  
  public boolean n;
  
  public boolean o;
  
  public boolean p;
  
  public boolean q;
  
  public a(View paramView) {
    this.d = paramView;
    float f = (Resources.getSystem().getDisplayMetrics()).density;
    int j = (int)(1575.0F * f + 0.5F);
    int i = (int)(f * 315.0F + 0.5F);
    f = j;
    float[] arrayOfFloat = this.l;
    f /= 1000.0F;
    arrayOfFloat[0] = f;
    arrayOfFloat[1] = f;
    f = i;
    arrayOfFloat = this.k;
    f /= 1000.0F;
    arrayOfFloat[0] = f;
    arrayOfFloat[1] = f;
    this.h = 1;
    arrayOfFloat = this.g;
    arrayOfFloat[0] = Float.MAX_VALUE;
    arrayOfFloat[1] = Float.MAX_VALUE;
    arrayOfFloat = this.f;
    arrayOfFloat[0] = 0.2F;
    arrayOfFloat[1] = 0.2F;
    arrayOfFloat = this.j;
    arrayOfFloat[0] = 0.001F;
    arrayOfFloat[1] = 0.001F;
    this.i = r;
    a a1 = this.b;
    a1.a = 500;
    a1.b = 500;
  }
  
  public static float b(float paramFloat1, float paramFloat2, float paramFloat3) {
    return (paramFloat1 > paramFloat3) ? paramFloat3 : ((paramFloat1 < paramFloat2) ? paramFloat2 : paramFloat1);
  }
  
  public final float a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
    float f1 = b(this.f[paramInt] * paramFloat2, 0.0F, this.g[paramInt]);
    float f2 = c(paramFloat1, f1);
    paramFloat1 = c(paramFloat2 - paramFloat1, f1) - f2;
    if (paramFloat1 < 0.0F) {
      paramFloat1 = -this.c.getInterpolation(-paramFloat1);
    } else if (paramFloat1 > 0.0F) {
      paramFloat1 = this.c.getInterpolation(paramFloat1);
    } else {
      paramFloat1 = 0.0F;
      int j = paramFloat1 cmp 0.0F;
    } 
    paramFloat1 = b(paramFloat1, -1.0F, 1.0F);
    int i = paramFloat1 cmp 0.0F;
  }
  
  public final float c(float paramFloat1, float paramFloat2) {
    if (paramFloat2 == 0.0F)
      return 0.0F; 
    int i = this.h;
    if (i != 0 && i != 1) {
      if (i == 2 && paramFloat1 < 0.0F)
        return paramFloat1 / -paramFloat2; 
    } else if (paramFloat1 < paramFloat2) {
      if (paramFloat1 >= 0.0F)
        return 1.0F - paramFloat1 / paramFloat2; 
      if (this.p && this.h == 1)
        return 1.0F; 
    } 
    return 0.0F;
  }
  
  public final void d() {
    boolean bool1 = this.n;
    boolean bool = false;
    if (bool1) {
      this.p = false;
    } else {
      a a1 = this.b;
      if (a1 != null) {
        long l = AnimationUtils.currentAnimationTimeMillis();
        int j = (int)(l - a1.e);
        int i = a1.b;
        if (j <= i)
          if (j < 0) {
            i = bool;
          } else {
            i = j;
          }  
        a1.k = i;
        a1.j = a1.a(l);
        a1.i = l;
        return;
      } 
      throw null;
    } 
  }
  
  public boolean e() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Lb/i/n/a$a;
    //   4: astore #7
    //   6: aload #7
    //   8: getfield d : F
    //   11: fstore_1
    //   12: fload_1
    //   13: fload_1
    //   14: invokestatic abs : (F)F
    //   17: fdiv
    //   18: f2i
    //   19: istore_2
    //   20: aload #7
    //   22: getfield c : F
    //   25: fstore_1
    //   26: fload_1
    //   27: fload_1
    //   28: invokestatic abs : (F)F
    //   31: fdiv
    //   32: f2i
    //   33: istore_3
    //   34: iconst_1
    //   35: istore #6
    //   37: iload_2
    //   38: ifeq -> 145
    //   41: aload_0
    //   42: checkcast b/i/n/c
    //   45: getfield s : Landroid/widget/ListView;
    //   48: astore #7
    //   50: aload #7
    //   52: invokevirtual getCount : ()I
    //   55: istore #5
    //   57: iload #5
    //   59: ifne -> 67
    //   62: iconst_0
    //   63: istore_2
    //   64: goto -> 141
    //   67: aload #7
    //   69: invokevirtual getChildCount : ()I
    //   72: istore_3
    //   73: aload #7
    //   75: invokevirtual getFirstVisiblePosition : ()I
    //   78: istore #4
    //   80: iload_2
    //   81: ifle -> 115
    //   84: iload #4
    //   86: iload_3
    //   87: iadd
    //   88: iload #5
    //   90: if_icmplt -> 139
    //   93: aload #7
    //   95: iload_3
    //   96: iconst_1
    //   97: isub
    //   98: invokevirtual getChildAt : (I)Landroid/view/View;
    //   101: invokevirtual getBottom : ()I
    //   104: aload #7
    //   106: invokevirtual getHeight : ()I
    //   109: if_icmpgt -> 139
    //   112: goto -> 62
    //   115: iload_2
    //   116: ifge -> 62
    //   119: iload #4
    //   121: ifgt -> 139
    //   124: aload #7
    //   126: iconst_0
    //   127: invokevirtual getChildAt : (I)Landroid/view/View;
    //   130: invokevirtual getTop : ()I
    //   133: iflt -> 139
    //   136: goto -> 62
    //   139: iconst_1
    //   140: istore_2
    //   141: iload_2
    //   142: ifne -> 148
    //   145: iconst_0
    //   146: istore #6
    //   148: iload #6
    //   150: ireturn
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield q : Z
    //   4: ifne -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_2
    //   10: invokevirtual getActionMasked : ()I
    //   13: istore #5
    //   15: iload #5
    //   17: ifeq -> 48
    //   20: iload #5
    //   22: iconst_1
    //   23: if_icmpeq -> 41
    //   26: iload #5
    //   28: iconst_2
    //   29: if_icmpeq -> 58
    //   32: iload #5
    //   34: iconst_3
    //   35: if_icmpeq -> 41
    //   38: goto -> 213
    //   41: aload_0
    //   42: invokevirtual d : ()V
    //   45: goto -> 213
    //   48: aload_0
    //   49: iconst_1
    //   50: putfield o : Z
    //   53: aload_0
    //   54: iconst_0
    //   55: putfield m : Z
    //   58: aload_0
    //   59: iconst_0
    //   60: aload_2
    //   61: invokevirtual getX : ()F
    //   64: aload_1
    //   65: invokevirtual getWidth : ()I
    //   68: i2f
    //   69: aload_0
    //   70: getfield d : Landroid/view/View;
    //   73: invokevirtual getWidth : ()I
    //   76: i2f
    //   77: invokevirtual a : (IFFF)F
    //   80: fstore #4
    //   82: aload_0
    //   83: iconst_1
    //   84: aload_2
    //   85: invokevirtual getY : ()F
    //   88: aload_1
    //   89: invokevirtual getHeight : ()I
    //   92: i2f
    //   93: aload_0
    //   94: getfield d : Landroid/view/View;
    //   97: invokevirtual getHeight : ()I
    //   100: i2f
    //   101: invokevirtual a : (IFFF)F
    //   104: fstore_3
    //   105: aload_0
    //   106: getfield b : Lb/i/n/a$a;
    //   109: astore_1
    //   110: aload_1
    //   111: fload #4
    //   113: putfield c : F
    //   116: aload_1
    //   117: fload_3
    //   118: putfield d : F
    //   121: aload_0
    //   122: getfield p : Z
    //   125: ifne -> 213
    //   128: aload_0
    //   129: invokevirtual e : ()Z
    //   132: ifeq -> 213
    //   135: aload_0
    //   136: getfield e : Ljava/lang/Runnable;
    //   139: ifnonnull -> 154
    //   142: aload_0
    //   143: new b/i/n/a$b
    //   146: dup
    //   147: aload_0
    //   148: invokespecial <init> : (Lb/i/n/a;)V
    //   151: putfield e : Ljava/lang/Runnable;
    //   154: aload_0
    //   155: iconst_1
    //   156: putfield p : Z
    //   159: aload_0
    //   160: iconst_1
    //   161: putfield n : Z
    //   164: aload_0
    //   165: getfield m : Z
    //   168: ifne -> 199
    //   171: aload_0
    //   172: getfield i : I
    //   175: istore #5
    //   177: iload #5
    //   179: ifle -> 199
    //   182: aload_0
    //   183: getfield d : Landroid/view/View;
    //   186: aload_0
    //   187: getfield e : Ljava/lang/Runnable;
    //   190: iload #5
    //   192: i2l
    //   193: invokestatic Q : (Landroid/view/View;Ljava/lang/Runnable;J)V
    //   196: goto -> 208
    //   199: aload_0
    //   200: getfield e : Ljava/lang/Runnable;
    //   203: invokeinterface run : ()V
    //   208: aload_0
    //   209: iconst_1
    //   210: putfield m : Z
    //   213: iconst_0
    //   214: ireturn
  }
  
  public static class a {
    public int a;
    
    public int b;
    
    public float c;
    
    public float d;
    
    public long e = Long.MIN_VALUE;
    
    public long f = 0L;
    
    public int g = 0;
    
    public int h = 0;
    
    public long i = -1L;
    
    public float j;
    
    public int k;
    
    public final float a(long param1Long) {
      if (param1Long < this.e)
        return 0.0F; 
      long l = this.i;
      if (l < 0L || param1Long < l)
        return a.b((float)(param1Long - this.e) / this.a, 0.0F, 1.0F) * 0.5F; 
      float f = this.j;
      return a.b((float)(param1Long - l) / this.k, 0.0F, 1.0F) * f + 1.0F - f;
    }
  }
  
  public class b implements Runnable {
    public final a b;
    
    public b(a this$0) {}
    
    public void run() {
      int i;
      a a1 = this.b;
      if (!a1.p)
        return; 
      if (a1.n) {
        a1.n = false;
        a.a a3 = a1.b;
        if (a3 != null) {
          long l = AnimationUtils.currentAnimationTimeMillis();
          a3.e = l;
          a3.i = -1L;
          a3.f = l;
          a3.j = 0.5F;
          a3.g = 0;
          a3.h = 0;
        } else {
          throw null;
        } 
      } 
      a.a a2 = this.b.b;
      if (a2.i > 0L && AnimationUtils.currentAnimationTimeMillis() > a2.i + a2.k) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i || !this.b.e()) {
        this.b.p = false;
        return;
      } 
      a1 = this.b;
      if (a1.o) {
        a1.o = false;
        if (a1 != null) {
          long l = SystemClock.uptimeMillis();
          MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
          a1.d.onTouchEvent(motionEvent);
          motionEvent.recycle();
        } else {
          throw null;
        } 
      } 
      if (a2.f != 0L) {
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        float f = a2.a(l1);
        long l2 = a2.f;
        a2.f = l1;
        f = (float)(l1 - l2) * (f * 4.0F + -4.0F * f * f);
        a2.g = (int)(a2.c * f);
        i = (int)(f * a2.d);
        a2.h = i;
        ((c)this.b).s.scrollListBy(i);
        l.P(this.b.d, this);
        return;
      } 
      throw new RuntimeException("Cannot compute scroll delta before calling start()");
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\n\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */