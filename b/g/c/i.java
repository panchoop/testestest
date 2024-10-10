package b.g.c;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import b.g.b.i.d;

public class i extends View {
  public int b;
  
  public View c;
  
  public int d;
  
  public void a() {
    d.a a = d.a.b;
    if (this.c == null)
      return; 
    ConstraintLayout.a a1 = (ConstraintLayout.a)getLayoutParams();
    ConstraintLayout.a a2 = (ConstraintLayout.a)this.c.getLayoutParams();
    a2.m0.X = 0;
    if (a1.m0.j() != a)
      a1.m0.B(a2.m0.o()); 
    if (a1.m0.n() != a)
      a1.m0.w(a2.m0.i()); 
    a2.m0.X = 8;
  }
  
  public View getContent() {
    return this.c;
  }
  
  public int getEmptyVisibility() {
    return this.d;
  }
  
  public void onDraw(Canvas paramCanvas) {
    if (isInEditMode()) {
      paramCanvas.drawRGB(223, 223, 223);
      Paint paint = new Paint();
      paint.setARGB(255, 210, 210, 210);
      paint.setTextAlign(Paint.Align.CENTER);
      paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
      Rect rect = new Rect();
      paramCanvas.getClipBounds(rect);
      paint.setTextSize(rect.height());
      int k = rect.height();
      int j = rect.width();
      paint.setTextAlign(Paint.Align.LEFT);
      paint.getTextBounds("?", 0, 1, rect);
      float f3 = j / 2.0F;
      float f1 = rect.width() / 2.0F;
      float f2 = rect.left;
      float f4 = k / 2.0F;
      paramCanvas.drawText("?", f3 - f1 - f2, rect.height() / 2.0F + f4 - rect.bottom, paint);
    } 
  }
  
  public void setContentId(int paramInt) {
    if (this.b == paramInt)
      return; 
    View view = this.c;
    if (view != null) {
      view.setVisibility(0);
      ((ConstraintLayout.a)this.c.getLayoutParams()).a0 = false;
      this.c = null;
    } 
    this.b = paramInt;
    if (paramInt != -1) {
      view = ((View)getParent()).findViewById(paramInt);
      if (view != null)
        view.setVisibility(8); 
    } 
  }
  
  public void setEmptyVisibility(int paramInt) {
    this.d = paramInt;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */