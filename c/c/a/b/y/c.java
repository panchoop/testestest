package c.c.a.b.y;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import b.i.k.d;
import b.i.m.l;
import c.c.a.b.a0.a;
import c.c.a.b.l.a;

public final class c {
  public static final Paint Q;
  
  public Bitmap A;
  
  public Paint B;
  
  public float C;
  
  public float D;
  
  public float E;
  
  public float F;
  
  public int[] G;
  
  public boolean H;
  
  public final TextPaint I;
  
  public final TextPaint J;
  
  public TimeInterpolator K;
  
  public TimeInterpolator L;
  
  public float M;
  
  public float N;
  
  public float O;
  
  public ColorStateList P;
  
  public final View a;
  
  public boolean b;
  
  public float c;
  
  public final Rect d;
  
  public final Rect e;
  
  public final RectF f;
  
  public int g = 16;
  
  public int h = 16;
  
  public float i = 15.0F;
  
  public float j = 15.0F;
  
  public ColorStateList k;
  
  public ColorStateList l;
  
  public float m;
  
  public float n;
  
  public float o;
  
  public float p;
  
  public float q;
  
  public float r;
  
  public Typeface s;
  
  public Typeface t;
  
  public Typeface u;
  
  public a v;
  
  public CharSequence w;
  
  public CharSequence x;
  
  public boolean y;
  
  public boolean z;
  
  static {
    if (false)
      throw new NullPointerException(); 
  }
  
  public c(View paramView) {
    this.a = paramView;
    this.I = new TextPaint(129);
    this.J = new TextPaint((Paint)this.I);
    this.e = new Rect();
    this.d = new Rect();
    this.f = new RectF();
  }
  
  public static int a(int paramInt1, int paramInt2, float paramFloat) {
    float f8 = 1.0F - paramFloat;
    float f5 = Color.alpha(paramInt1);
    float f1 = Color.alpha(paramInt2);
    float f2 = Color.red(paramInt1);
    float f3 = Color.red(paramInt2);
    float f7 = Color.green(paramInt1);
    float f6 = Color.green(paramInt2);
    float f4 = Color.blue(paramInt1);
    float f9 = Color.blue(paramInt2);
    return Color.argb((int)(f1 * paramFloat + f5 * f8), (int)(f3 * paramFloat + f2 * f8), (int)(f6 * paramFloat + f7 * f8), (int)(f9 * paramFloat + f4 * f8));
  }
  
  public static float i(float paramFloat1, float paramFloat2, float paramFloat3, TimeInterpolator paramTimeInterpolator) {
    float f = paramFloat3;
    if (paramTimeInterpolator != null)
      f = paramTimeInterpolator.getInterpolation(paramFloat3); 
    return a.a(paramFloat1, paramFloat2, f);
  }
  
  public static boolean l(Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool;
    if (paramRect.left == paramInt1 && paramRect.top == paramInt2 && paramRect.right == paramInt3 && paramRect.bottom == paramInt4) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public float b() {
    if (this.w == null)
      return 0.0F; 
    TextPaint textPaint = this.J;
    textPaint.setTextSize(this.j);
    textPaint.setTypeface(this.s);
    textPaint = this.J;
    CharSequence charSequence = this.w;
    return textPaint.measureText(charSequence, 0, charSequence.length());
  }
  
  public final boolean c(CharSequence paramCharSequence) {
    b.i.k.c c1;
    int j = l.r(this.a);
    int i = 1;
    if (j != 1)
      i = 0; 
    if (i) {
      c1 = d.d;
    } else {
      c1 = d.c;
    } 
    i = paramCharSequence.length();
    return ((d.c)c1).b(paramCharSequence, 0, i);
  }
  
  public final void d(float paramFloat) {
    int i;
    TextPaint textPaint;
    this.f.left = i(this.d.left, this.e.left, paramFloat, this.K);
    this.f.top = i(this.m, this.n, paramFloat, this.K);
    this.f.right = i(this.d.right, this.e.right, paramFloat, this.K);
    this.f.bottom = i(this.d.bottom, this.e.bottom, paramFloat, this.K);
    this.q = i(this.o, this.p, paramFloat, this.K);
    this.r = i(this.m, this.n, paramFloat, this.K);
    o(i(this.i, this.j, paramFloat, this.L));
    ColorStateList colorStateList1 = this.l;
    ColorStateList colorStateList2 = this.k;
    if (colorStateList1 != colorStateList2) {
      textPaint = this.I;
      i = a(h(colorStateList2), g(), paramFloat);
    } else {
      textPaint = this.I;
      i = g();
    } 
    textPaint.setColor(i);
    this.I.setShadowLayer(i(0.0F, this.M, paramFloat, null), i(0.0F, this.N, paramFloat, null), i(0.0F, this.O, paramFloat, null), a(h(null), h(this.P), paramFloat));
    l.O(this.a);
  }
  
  public final void e(float paramFloat) {
    boolean bool1;
    if (this.w == null)
      return; 
    float f2 = this.e.width();
    float f3 = this.d.width();
    float f1 = Math.abs(paramFloat - this.j);
    boolean bool3 = true;
    if (f1 < 0.001F) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool1) {
      f1 = this.j;
      this.E = 1.0F;
      Typeface typeface1 = this.u;
      Typeface typeface2 = this.s;
      if (typeface1 != typeface2) {
        this.u = typeface2;
        bool1 = true;
        paramFloat = f2;
      } else {
        bool1 = false;
        paramFloat = f2;
      } 
    } else {
      boolean bool;
      f1 = this.i;
      Typeface typeface1 = this.u;
      Typeface typeface2 = this.t;
      if (typeface1 != typeface2) {
        this.u = typeface2;
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (Math.abs(paramFloat - this.i) < 0.001F) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        this.E = 1.0F;
      } else {
        this.E = paramFloat / this.i;
      } 
      paramFloat = this.j / this.i;
      if (f3 * paramFloat > f2) {
        paramFloat = Math.min(f2 / paramFloat, f3);
      } else {
        paramFloat = f3;
      } 
    } 
    boolean bool2 = bool1;
    if (paramFloat > 0.0F) {
      if (this.F != f1 || this.H || bool1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      this.F = f1;
      this.H = false;
      bool2 = bool1;
    } 
    if (this.x == null || bool2) {
      this.I.setTextSize(this.F);
      this.I.setTypeface(this.u);
      TextPaint textPaint = this.I;
      if (this.E == 1.0F)
        bool3 = false; 
      textPaint.setLinearText(bool3);
      CharSequence charSequence = TextUtils.ellipsize(this.w, this.I, paramFloat, TextUtils.TruncateAt.END);
      if (!TextUtils.equals(charSequence, this.x)) {
        this.x = charSequence;
        this.y = c(charSequence);
      } 
    } 
  }
  
  public float f() {
    TextPaint textPaint = this.J;
    textPaint.setTextSize(this.j);
    textPaint.setTypeface(this.s);
    return -this.J.ascent();
  }
  
  public int g() {
    return h(this.l);
  }
  
  public final int h(ColorStateList paramColorStateList) {
    if (paramColorStateList == null)
      return 0; 
    int[] arrayOfInt = this.G;
    return (arrayOfInt != null) ? paramColorStateList.getColorForState(arrayOfInt, 0) : paramColorStateList.getDefaultColor();
  }
  
  public void j() {
    boolean bool;
    if (this.e.width() > 0 && this.e.height() > 0 && this.d.width() > 0 && this.d.height() > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.b = bool;
  }
  
  public void k() {
    if (this.a.getHeight() > 0 && this.a.getWidth() > 0) {
      float f3 = this.F;
      e(this.j);
      CharSequence charSequence = this.x;
      float f2 = 0.0F;
      if (charSequence != null) {
        f1 = this.I.measureText(charSequence, 0, charSequence.length());
      } else {
        f1 = 0.0F;
      } 
      int i = Gravity.getAbsoluteGravity(this.h, this.y);
      int j = i & 0x70;
      if (j != 48) {
        if (j != 80) {
          float f5 = (this.I.descent() - this.I.ascent()) / 2.0F;
          float f4 = this.I.descent();
          this.n = this.e.centerY() + f5 - f4;
        } else {
          float f = this.e.bottom;
          this.n = f;
        } 
      } else {
        float f = this.e.top - this.I.ascent();
        this.n = f;
      } 
      i &= 0x800007;
      if (i != 1) {
        if (i != 5) {
          this.p = this.e.left;
        } else {
          float f5 = this.e.right;
          float f4 = f1;
          f1 = f5;
          this.p = f1 - f4;
        } 
      } else {
        float f5 = this.e.centerX();
        float f4 = f1 / 2.0F;
        f1 = f5;
        this.p = f1 - f4;
      } 
      e(this.i);
      charSequence = this.x;
      float f1 = f2;
      if (charSequence != null)
        f1 = this.I.measureText(charSequence, 0, charSequence.length()); 
      i = Gravity.getAbsoluteGravity(this.g, this.y);
      j = i & 0x70;
      if (j != 48) {
        if (j != 80) {
          f2 = (this.I.descent() - this.I.ascent()) / 2.0F;
          float f = this.I.descent();
          this.m = this.d.centerY() + f2 - f;
        } else {
          float f = this.d.bottom;
          this.m = f;
        } 
      } else {
        float f = this.d.top - this.I.ascent();
        this.m = f;
      } 
      i &= 0x800007;
      if (i != 1) {
        if (i != 5) {
          f1 = this.d.left;
        } else {
          float f = this.d.right;
          f1 = f - f1;
        } 
      } else {
        float f = this.d.centerX();
        f1 /= 2.0F;
        f1 = f - f1;
      } 
      this.o = f1;
      Bitmap bitmap = this.A;
      if (bitmap != null) {
        bitmap.recycle();
        this.A = null;
      } 
      o(f3);
      d(this.c);
    } 
  }
  
  public void m(ColorStateList paramColorStateList) {
    if (this.l != paramColorStateList) {
      this.l = paramColorStateList;
      k();
    } 
  }
  
  public void n(float paramFloat) {
    float f;
    if (paramFloat < 0.0F) {
      f = 0.0F;
    } else {
      f = paramFloat;
      if (paramFloat > 1.0F)
        f = 1.0F; 
    } 
    if (f != this.c) {
      this.c = f;
      d(f);
    } 
  }
  
  public final void o(float paramFloat) {
    e(paramFloat);
    this.z = false;
    if (false && this.A == null && !this.d.isEmpty() && !TextUtils.isEmpty(this.x)) {
      d(0.0F);
      this.C = this.I.ascent();
      this.D = this.I.descent();
      TextPaint textPaint = this.I;
      CharSequence charSequence = this.x;
      int j = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
      int i = Math.round(this.D - this.C);
      if (j > 0 && i > 0) {
        this.A = Bitmap.createBitmap(j, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.A);
        charSequence = this.x;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0F, i - this.I.descent(), (Paint)this.I);
        if (this.B == null)
          this.B = new Paint(3); 
      } 
    } 
    l.O(this.a);
  }
  
  public void p(Typeface paramTypeface) {
    boolean bool1;
    a a1 = this.v;
    boolean bool2 = true;
    if (a1 != null)
      a1.c = true; 
    if (this.s != paramTypeface) {
      this.s = paramTypeface;
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (this.t != paramTypeface) {
      this.t = paramTypeface;
    } else {
      bool2 = false;
    } 
    if (bool1 || bool2)
      k(); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\y\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */