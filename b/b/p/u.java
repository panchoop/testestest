package b.b.p;

import a.a.a.a.a;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import b.b.j;
import b.i.m.l;

public class u extends q {
  public final SeekBar d;
  
  public Drawable e;
  
  public ColorStateList f = null;
  
  public PorterDuff.Mode g = null;
  
  public boolean h = false;
  
  public boolean i = false;
  
  public u(SeekBar paramSeekBar) {
    super((ProgressBar)paramSeekBar);
    this.d = paramSeekBar;
  }
  
  public void a(AttributeSet paramAttributeSet, int paramInt) {
    super.a(paramAttributeSet, paramInt);
    x0 x0 = x0.q(this.d.getContext(), paramAttributeSet, j.AppCompatSeekBar, paramInt, 0);
    SeekBar seekBar = this.d;
    l.V((View)seekBar, seekBar.getContext(), j.AppCompatSeekBar, paramAttributeSet, x0.b, paramInt, 0);
    Drawable drawable1 = x0.h(j.AppCompatSeekBar_android_thumb);
    if (drawable1 != null)
      this.d.setThumb(drawable1); 
    Drawable drawable2 = x0.g(j.AppCompatSeekBar_tickMark);
    drawable1 = this.e;
    if (drawable1 != null)
      drawable1.setCallback(null); 
    this.e = drawable2;
    if (drawable2 != null) {
      drawable2.setCallback((Drawable.Callback)this.d);
      a.o0(drawable2, l.r((View)this.d));
      if (drawable2.isStateful())
        drawable2.setState(this.d.getDrawableState()); 
      c();
    } 
    this.d.invalidate();
    if (x0.o(j.AppCompatSeekBar_tickMarkTintMode)) {
      this.g = e0.c(x0.j(j.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
      this.i = true;
    } 
    if (x0.o(j.AppCompatSeekBar_tickMarkTint)) {
      this.f = x0.c(j.AppCompatSeekBar_tickMarkTint);
      this.h = true;
    } 
    x0.b.recycle();
    c();
  }
  
  public final void c() {
    if (this.e != null && (this.h || this.i)) {
      Drawable drawable = a.C0(this.e.mutate());
      this.e = drawable;
      if (this.h)
        drawable.setTintList(this.f); 
      if (this.i)
        this.e.setTintMode(this.g); 
      if (this.e.isStateful())
        this.e.setState(this.d.getDrawableState()); 
    } 
  }
  
  public void d(Canvas paramCanvas) {
    if (this.e != null) {
      int j = this.d.getMax();
      int i = 1;
      if (j > 1) {
        int k = this.e.getIntrinsicWidth();
        int m = this.e.getIntrinsicHeight();
        if (k >= 0) {
          k /= 2;
        } else {
          k = 1;
        } 
        if (m >= 0)
          i = m / 2; 
        this.e.setBounds(-k, -i, k, i);
        float f = (this.d.getWidth() - this.d.getPaddingLeft() - this.d.getPaddingRight()) / j;
        i = paramCanvas.save();
        paramCanvas.translate(this.d.getPaddingLeft(), (this.d.getHeight() / 2));
        for (k = 0; k <= j; k++) {
          this.e.draw(paramCanvas);
          paramCanvas.translate(f, 0.0F);
        } 
        paramCanvas.restoreToCount(i);
      } 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\\\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */