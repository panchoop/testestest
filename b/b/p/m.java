package b.b.p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import b.b.j;
import b.b.l.a.a;
import b.i.m.l;

public class m {
  public final ImageView a;
  
  public v0 b;
  
  public v0 c;
  
  public m(ImageView paramImageView) {
    this.a = paramImageView;
  }
  
  public void a() {
    Drawable drawable = this.a.getDrawable();
    if (drawable != null)
      e0.b(drawable); 
    if (drawable != null) {
      int i = Build.VERSION.SDK_INT;
      boolean bool = true;
      if (i <= 21 && i == 21) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i != 0) {
        if (this.c == null)
          this.c = new v0(); 
        v0 v02 = this.c;
        v02.a = null;
        v02.d = false;
        v02.b = null;
        v02.c = false;
        ColorStateList colorStateList = this.a.getImageTintList();
        if (colorStateList != null) {
          v02.d = true;
          v02.a = colorStateList;
        } 
        PorterDuff.Mode mode = this.a.getImageTintMode();
        if (mode != null) {
          v02.c = true;
          v02.b = mode;
        } 
        if (v02.d || v02.c) {
          j.f(drawable, v02, this.a.getDrawableState());
          i = bool;
        } else {
          i = 0;
        } 
        if (i != 0)
          return; 
      } 
      v0 v01 = this.b;
      if (v01 != null)
        j.f(drawable, v01, this.a.getDrawableState()); 
    } 
  }
  
  public void b(AttributeSet paramAttributeSet, int paramInt) {
    x0 x0 = x0.q(this.a.getContext(), paramAttributeSet, j.AppCompatImageView, paramInt, 0);
    ImageView imageView = this.a;
    l.V((View)imageView, imageView.getContext(), j.AppCompatImageView, paramAttributeSet, x0.b, paramInt, 0);
    try {
      Drawable drawable2 = this.a.getDrawable();
      Drawable drawable1 = drawable2;
      if (drawable2 == null) {
        paramInt = x0.l(j.AppCompatImageView_srcCompat, -1);
        drawable1 = drawable2;
        if (paramInt != -1) {
          drawable2 = a.b(this.a.getContext(), paramInt);
          drawable1 = drawable2;
          if (drawable2 != null) {
            this.a.setImageDrawable(drawable2);
            drawable1 = drawable2;
          } 
        } 
      } 
      if (drawable1 != null)
        e0.b(drawable1); 
      if (x0.o(j.AppCompatImageView_tint)) {
        ImageView imageView1 = this.a;
        imageView1.setImageTintList(x0.c(j.AppCompatImageView_tint));
        if (Build.VERSION.SDK_INT == 21) {
          drawable2 = imageView1.getDrawable();
          if (drawable2 != null && imageView1.getImageTintList() != null) {
            if (drawable2.isStateful())
              drawable2.setState(imageView1.getDrawableState()); 
            imageView1.setImageDrawable(drawable2);
          } 
        } 
      } 
    } finally {}
    if (x0.o(j.AppCompatImageView_tintMode)) {
      ImageView imageView1 = this.a;
      imageView1.setImageTintMode(e0.c(x0.j(j.AppCompatImageView_tintMode, -1), null));
      if (Build.VERSION.SDK_INT == 21) {
        Drawable drawable = imageView1.getDrawable();
        if (drawable != null && imageView1.getImageTintList() != null) {
          if (drawable.isStateful())
            drawable.setState(imageView1.getDrawableState()); 
          imageView1.setImageDrawable(drawable);
        } 
      } 
    } 
    x0.b.recycle();
  }
  
  public void c(int paramInt) {
    if (paramInt != 0) {
      Drawable drawable = a.b(this.a.getContext(), paramInt);
      if (drawable != null)
        e0.b(drawable); 
      this.a.setImageDrawable(drawable);
    } else {
      this.a.setImageDrawable(null);
    } 
    a();
  }
  
  public void d(ColorStateList paramColorStateList) {
    if (this.b == null)
      this.b = new v0(); 
    v0 v01 = this.b;
    v01.a = paramColorStateList;
    v01.d = true;
    a();
  }
  
  public void e(PorterDuff.Mode paramMode) {
    if (this.b == null)
      this.b = new v0(); 
    v0 v01 = this.b;
    v01.b = paramMode;
    v01.c = true;
    a();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */