package c.c.a.b.x;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import b.i.m.l;
import c.c.a.a.c.l.q;
import c.c.a.b.d0.j;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;

public class e {
  public static final TimeInterpolator A = c.c.a.b.l.a.c;
  
  public static final int[] B = new int[] { 16842919, 16842910 };
  
  public static final int[] C = new int[] { 16843623, 16842908, 16842910 };
  
  public static final int[] D = new int[] { 16842908, 16842910 };
  
  public static final int[] E = new int[] { 16843623, 16842910 };
  
  public static final int[] F = new int[] { 16842910 };
  
  public static final int[] G = new int[0];
  
  public j a;
  
  public c.c.a.b.d0.g b;
  
  public boolean c;
  
  public boolean d = true;
  
  public float e;
  
  public float f;
  
  public float g;
  
  public final c.c.a.b.y.g h;
  
  public c.c.a.b.l.g i;
  
  public c.c.a.b.l.g j;
  
  public Animator k;
  
  public c.c.a.b.l.g l;
  
  public c.c.a.b.l.g m;
  
  public float n;
  
  public float o = 1.0F;
  
  public int p = 0;
  
  public ArrayList<Animator.AnimatorListener> q;
  
  public ArrayList<Animator.AnimatorListener> r;
  
  public ArrayList<e> s;
  
  public final FloatingActionButton t;
  
  public final c.c.a.b.c0.b u;
  
  public final Rect v = new Rect();
  
  public final RectF w = new RectF();
  
  public final RectF x = new RectF();
  
  public final Matrix y = new Matrix();
  
  public ViewTreeObserver.OnPreDrawListener z;
  
  public e(FloatingActionButton paramFloatingActionButton, c.c.a.b.c0.b paramb) {
    this.t = paramFloatingActionButton;
    this.u = paramb;
    c.c.a.b.y.g g1 = new c.c.a.b.y.g();
    this.h = g1;
    g1.a(B, b(new d(this)));
    this.h.a(C, b(new c(this)));
    this.h.a(D, b(new c(this)));
    this.h.a(E, b(new c(this)));
    this.h.a(F, b(new g(this)));
    this.h.a(G, b(new b(this)));
    this.n = this.t.getRotation();
  }
  
  public final AnimatorSet a(c.c.a.b.l.g paramg, float paramFloat1, float paramFloat2, float paramFloat3) {
    ArrayList<ObjectAnimator> arrayList = new ArrayList();
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(this.t, View.ALPHA, new float[] { paramFloat1 });
    paramg.d("opacity").a((Animator)objectAnimator);
    arrayList.add(objectAnimator);
    objectAnimator = ObjectAnimator.ofFloat(this.t, View.SCALE_X, new float[] { paramFloat2 });
    paramg.d("scale").a((Animator)objectAnimator);
    if (Build.VERSION.SDK_INT == 26)
      objectAnimator.setEvaluator(new f(this)); 
    arrayList.add(objectAnimator);
    objectAnimator = ObjectAnimator.ofFloat(this.t, View.SCALE_Y, new float[] { paramFloat2 });
    paramg.d("scale").a((Animator)objectAnimator);
    if (Build.VERSION.SDK_INT == 26)
      objectAnimator.setEvaluator(new f(this)); 
    arrayList.add(objectAnimator);
    this.y.reset();
    this.t.getDrawable();
    objectAnimator = ObjectAnimator.ofObject(this.t, (Property)new c.c.a.b.l.e(), (TypeEvaluator)new a(this), (Object[])new Matrix[] { new Matrix(this.y) });
    paramg.d("iconScale").a((Animator)objectAnimator);
    arrayList.add(objectAnimator);
    AnimatorSet animatorSet = new AnimatorSet();
    q.N(animatorSet, arrayList);
    return animatorSet;
  }
  
  public final ValueAnimator b(h paramh) {
    ValueAnimator valueAnimator = new ValueAnimator();
    valueAnimator.setInterpolator(A);
    valueAnimator.setDuration(100L);
    valueAnimator.addListener((Animator.AnimatorListener)paramh);
    valueAnimator.addUpdateListener(paramh);
    valueAnimator.setFloatValues(new float[] { 0.0F, 1.0F });
    return valueAnimator;
  }
  
  public abstract float c();
  
  public void d(Rect paramRect) {
    float f;
    boolean bool = this.c;
    int i = 0;
    if (bool)
      i = (0 - this.t.getSizeDimension()) / 2; 
    if (this.d) {
      f = c() + this.g;
    } else {
      f = 0.0F;
    } 
    int k = Math.max(i, (int)Math.ceil(f));
    i = Math.max(i, (int)Math.ceil((f * 1.5F)));
    paramRect.set(k, i, k, i);
  }
  
  public boolean e() {
    int i = this.t.getVisibility();
    boolean bool1 = false;
    boolean bool2 = false;
    if (i == 0) {
      bool1 = bool2;
      if (this.p == 1)
        bool1 = true; 
      return bool1;
    } 
    if (this.p != 2)
      bool1 = true; 
    return bool1;
  }
  
  public boolean f() {
    int i = this.t.getVisibility();
    boolean bool1 = false;
    boolean bool2 = false;
    if (i != 0) {
      bool1 = bool2;
      if (this.p == 2)
        bool1 = true; 
      return bool1;
    } 
    if (this.p != 1)
      bool1 = true; 
    return bool1;
  }
  
  public abstract void g();
  
  public abstract void h();
  
  public abstract void i(int[] paramArrayOfint);
  
  public abstract void j(float paramFloat1, float paramFloat2, float paramFloat3);
  
  public void k() {
    ArrayList<e> arrayList = this.s;
    if (arrayList != null) {
      Iterator<e> iterator = arrayList.iterator();
      while (iterator.hasNext())
        ((e)iterator.next()).a(); 
    } 
  }
  
  public void l() {
    ArrayList<e> arrayList = this.s;
    if (arrayList != null) {
      Iterator<e> iterator = arrayList.iterator();
      while (iterator.hasNext())
        ((e)iterator.next()).b(); 
    } 
  }
  
  public abstract boolean m();
  
  public final void n(float paramFloat) {
    this.o = paramFloat;
    Matrix matrix = this.y;
    matrix.reset();
    this.t.getDrawable();
    this.t.setImageMatrix(matrix);
  }
  
  public abstract void o(ColorStateList paramColorStateList);
  
  public abstract boolean p();
  
  public final boolean q() {
    boolean bool;
    if (l.E((View)this.t) && !this.t.isInEditMode()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final boolean r() {
    return (!this.c || this.t.getSizeDimension() >= 0);
  }
  
  public abstract void s();
  
  public final void t() {
    Rect rect = this.v;
    d(rect);
    a.a.a.a.a.h(null, "Didn't initialize content background");
    if (p()) {
      InsetDrawable insetDrawable = new InsetDrawable(null, rect.left, rect.top, rect.right, rect.bottom);
      FloatingActionButton.b b3 = (FloatingActionButton.b)this.u;
      if (b3 != null) {
        FloatingActionButton.c(b3.a, (Drawable)insetDrawable);
      } else {
        throw null;
      } 
    } else if ((FloatingActionButton.b)this.u == null) {
      throw null;
    } 
    c.c.a.b.c0.b b2 = this.u;
    int i1 = rect.left;
    int i = rect.top;
    int m = rect.right;
    int n = rect.bottom;
    FloatingActionButton.b b1 = (FloatingActionButton.b)b2;
    b1.a.l.set(i1, i, m, n);
    FloatingActionButton floatingActionButton = b1.a;
    int k = floatingActionButton.j;
    floatingActionButton.setPadding(i1 + k, i + k, m + k, n + k);
  }
  
  public class a extends c.c.a.b.l.f {
    public final e d;
    
    public a(e this$0) {}
    
    public Object evaluate(float param1Float, Object param1Object1, Object param1Object2) {
      param1Object1 = param1Object1;
      param1Object2 = param1Object2;
      this.d.o = param1Float;
      param1Object1.getValues(this.a);
      param1Object2.getValues(this.b);
      for (byte b = 0; b < 9; b++) {
        param1Object2 = this.b;
        Object object = param1Object2[b];
        param1Object1 = this.a;
        param1Object2[b] = (object - param1Object1[b]) * param1Float + param1Object1[b];
      } 
      this.c.setValues(this.b);
      return this.c;
    }
  }
  
  public class b extends h {
    public b(e this$0) {
      super(this$0, null);
    }
    
    public float a() {
      return 0.0F;
    }
  }
  
  public class c extends h {
    public final e e;
    
    public c(e this$0) {
      super(this$0, null);
    }
    
    public float a() {
      e e1 = this.e;
      return e1.e + e1.f;
    }
  }
  
  public class d extends h {
    public final e e;
    
    public d(e this$0) {
      super(this$0, null);
    }
    
    public float a() {
      e e1 = this.e;
      return e1.e + e1.g;
    }
  }
  
  public static interface e {
    void a();
    
    void b();
  }
  
  public static interface f {}
  
  public class g extends h {
    public final e e;
    
    public g(e this$0) {
      super(this$0, null);
    }
    
    public float a() {
      return this.e.e;
    }
  }
  
  public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public boolean a;
    
    public float b;
    
    public float c;
    
    public final e d;
    
    public h(e this$0, c param1c) {}
    
    public abstract float a();
    
    public void onAnimationEnd(Animator param1Animator) {
      if (this.d != null) {
        this.a = false;
        return;
      } 
      throw null;
    }
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      if (!this.a) {
        float f;
        c.c.a.b.d0.g g = this.d.b;
        if (g == null) {
          f = 0.0F;
        } else {
          f = g.b.o;
        } 
        this.b = f;
        this.c = a();
        this.a = true;
      } 
      e e1 = this.d;
      param1ValueAnimator.getAnimatedFraction();
      if (e1 != null)
        return; 
      throw null;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\x\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */