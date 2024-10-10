package c.c.a.b.g0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import c.c.a.b.d0.g;
import c.c.a.b.d0.j;

public class g extends g {
  public final Paint x;
  
  public final RectF y;
  
  public int z;
  
  public g() {
    this(null);
  }
  
  public g(j paramj) {
    super(paramj);
    Paint paint = new Paint(1);
    this.x = paint;
    paint.setStyle(Paint.Style.FILL_AND_STROKE);
    this.x.setColor(-1);
    this.x.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    this.y = new RectF();
  }
  
  public void draw(Canvas paramCanvas) {
    Drawable.Callback callback = getCallback();
    if (callback instanceof View) {
      View view = (View)callback;
      if (view.getLayerType() != 2)
        view.setLayerType(2, null); 
    } else {
      this.z = paramCanvas.saveLayer(0.0F, 0.0F, paramCanvas.getWidth(), paramCanvas.getHeight(), null);
    } 
    super.draw(paramCanvas);
    paramCanvas.drawRect(this.y, this.x);
    if (!(getCallback() instanceof View))
      paramCanvas.restoreToCount(this.z); 
  }
  
  public void y(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    RectF rectF = this.y;
    if (paramFloat1 != rectF.left || paramFloat2 != rectF.top || paramFloat3 != rectF.right || paramFloat4 != rectF.bottom) {
      this.y.set(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
      invalidateSelf();
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\g0\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */