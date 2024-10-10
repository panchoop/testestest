package b.b.p;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import b.i.f.k.b;

public class q {
  public static final int[] c = new int[] { 16843067, 16843068 };
  
  public final ProgressBar a;
  
  public Bitmap b;
  
  public q(ProgressBar paramProgressBar) {
    this.a = paramProgressBar;
  }
  
  public void a(AttributeSet paramAttributeSet, int paramInt) {
    x0 x0 = x0.q(this.a.getContext(), paramAttributeSet, c, paramInt, 0);
    Drawable drawable2 = x0.h(0);
    if (drawable2 != null) {
      AnimationDrawable animationDrawable;
      ProgressBar progressBar = this.a;
      Drawable drawable = drawable2;
      if (drawable2 instanceof AnimationDrawable) {
        AnimationDrawable animationDrawable1 = (AnimationDrawable)drawable2;
        int i = animationDrawable1.getNumberOfFrames();
        animationDrawable = new AnimationDrawable();
        animationDrawable.setOneShot(animationDrawable1.isOneShot());
        for (paramInt = 0; paramInt < i; paramInt++) {
          drawable2 = b(animationDrawable1.getFrame(paramInt), true);
          drawable2.setLevel(10000);
          animationDrawable.addFrame(drawable2, animationDrawable1.getDuration(paramInt));
        } 
        animationDrawable.setLevel(10000);
      } 
      progressBar.setIndeterminateDrawable((Drawable)animationDrawable);
    } 
    Drawable drawable1 = x0.h(1);
    if (drawable1 != null)
      this.a.setProgressDrawable(b(drawable1, false)); 
    x0.b.recycle();
  }
  
  public final Drawable b(Drawable paramDrawable, boolean paramBoolean) {
    ClipDrawable clipDrawable;
    if (paramDrawable instanceof b) {
      b b = (b)paramDrawable;
      Drawable drawable = b.a();
      if (drawable != null)
        b.b(b(drawable, paramBoolean)); 
    } else {
      LayerDrawable layerDrawable;
      if (paramDrawable instanceof LayerDrawable) {
        layerDrawable = (LayerDrawable)paramDrawable;
        int i = layerDrawable.getNumberOfLayers();
        Drawable[] arrayOfDrawable = new Drawable[i];
        boolean bool = false;
        byte b;
        for (b = 0; b < i; b++) {
          int j = layerDrawable.getId(b);
          Drawable drawable = layerDrawable.getDrawable(b);
          if (j == 16908301 || j == 16908303) {
            paramBoolean = true;
          } else {
            paramBoolean = false;
          } 
          arrayOfDrawable[b] = b(drawable, paramBoolean);
        } 
        LayerDrawable layerDrawable1 = new LayerDrawable(arrayOfDrawable);
        for (b = bool; b < i; b++)
          layerDrawable1.setId(b, layerDrawable.getId(b)); 
        return (Drawable)layerDrawable1;
      } 
      if (layerDrawable instanceof BitmapDrawable) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable)layerDrawable;
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (this.b == null)
          this.b = bitmap; 
        ShapeDrawable shapeDrawable2 = new ShapeDrawable((Shape)new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null));
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
        shapeDrawable2.getPaint().setShader((Shader)bitmapShader);
        shapeDrawable2.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
        ShapeDrawable shapeDrawable1 = shapeDrawable2;
        if (paramBoolean)
          clipDrawable = new ClipDrawable((Drawable)shapeDrawable2, 3, 1); 
        return (Drawable)clipDrawable;
      } 
    } 
    return (Drawable)clipDrawable;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */