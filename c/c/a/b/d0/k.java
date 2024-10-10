package c.c.a.b.d0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;

public class k {
  public final m[] a = new m[4];
  
  public final Matrix[] b = new Matrix[4];
  
  public final Matrix[] c = new Matrix[4];
  
  public final PointF d = new PointF();
  
  public final m e = new m();
  
  public final float[] f = new float[2];
  
  public final float[] g = new float[2];
  
  public k() {
    for (byte b = 0; b < 4; b++) {
      this.a[b] = new m();
      this.b[b] = new Matrix();
      this.c[b] = new Matrix();
    } 
  }
  
  public void a(j paramj, float paramFloat, RectF paramRectF, a parama, Path paramPath) {
    paramPath.rewind();
    int i = 0;
    while (i < 4) {
      c c;
      d d;
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            c = paramj.f;
          } else {
            c = paramj.e;
          } 
        } else {
          c = paramj.h;
        } 
      } else {
        c = paramj.g;
      } 
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            d = paramj.b;
          } else {
            d = paramj.a;
          } 
        } else {
          d = paramj.d;
        } 
      } else {
        d = paramj.c;
      } 
      m m1 = this.a[i];
      if (d != null) {
        float f1;
        float f2;
        d.a(m1, 90.0F, paramFloat, c.a(paramRectF));
        int n = i + 1;
        float f3 = (n * 90);
        this.b[i].reset();
        PointF pointF1 = this.d;
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              f1 = paramRectF.right;
            } else {
              f1 = paramRectF.left;
            } 
            f2 = paramRectF.top;
          } else {
            f1 = paramRectF.left;
            f2 = paramRectF.bottom;
          } 
        } else {
          f1 = paramRectF.right;
          f2 = paramRectF.bottom;
        } 
        pointF1.set(f1, f2);
        Matrix matrix2 = this.b[i];
        PointF pointF2 = this.d;
        matrix2.setTranslate(pointF2.x, pointF2.y);
        this.b[i].preRotate(f3);
        float[] arrayOfFloat1 = this.f;
        m[] arrayOfM = this.a;
        arrayOfFloat1[0] = (arrayOfM[i]).c;
        arrayOfFloat1[1] = (arrayOfM[i]).d;
        this.b[i].mapPoints(arrayOfFloat1);
        this.c[i].reset();
        Matrix matrix1 = this.c[i];
        float[] arrayOfFloat2 = this.f;
        matrix1.setTranslate(arrayOfFloat2[0], arrayOfFloat2[1]);
        this.c[i].preRotate(f3);
        i = n;
        continue;
      } 
      throw null;
    } 
    for (i = 0; i < 4; i = n) {
      float f2;
      f f;
      float[] arrayOfFloat2 = this.f;
      m[] arrayOfM3 = this.a;
      arrayOfFloat2[0] = (arrayOfM3[i]).a;
      arrayOfFloat2[1] = (arrayOfM3[i]).b;
      this.b[i].mapPoints(arrayOfFloat2);
      arrayOfFloat2 = this.f;
      if (i == 0) {
        paramPath.moveTo(arrayOfFloat2[0], arrayOfFloat2[1]);
      } else {
        paramPath.lineTo(arrayOfFloat2[0], arrayOfFloat2[1]);
      } 
      this.a[i].c(this.b[i], paramPath);
      if (parama != null) {
        m m1 = this.a[i];
        Matrix matrix = this.b[i];
        m.f[] arrayOfF = ((g.a)parama).a.c;
        m1.b(m1.f);
        arrayOfF[i] = new l(m1, new ArrayList<m.f>(m1.h), matrix);
      } 
      int n = i + 1;
      int i1 = n % 4;
      arrayOfFloat2 = this.f;
      arrayOfM3 = this.a;
      arrayOfFloat2[0] = (arrayOfM3[i]).c;
      arrayOfFloat2[1] = (arrayOfM3[i]).d;
      this.b[i].mapPoints(arrayOfFloat2);
      float[] arrayOfFloat3 = this.g;
      m[] arrayOfM2 = this.a;
      arrayOfFloat3[0] = (arrayOfM2[i1]).a;
      arrayOfFloat3[1] = (arrayOfM2[i1]).b;
      this.b[i1].mapPoints(arrayOfFloat3);
      arrayOfFloat3 = this.f;
      float f1 = arrayOfFloat3[0];
      float[] arrayOfFloat1 = this.g;
      float f3 = Math.max((float)Math.hypot((f1 - arrayOfFloat1[0]), (arrayOfFloat3[1] - arrayOfFloat1[1])) - 0.001F, 0.0F);
      arrayOfFloat3 = this.f;
      m[] arrayOfM1 = this.a;
      arrayOfFloat3[0] = (arrayOfM1[i]).c;
      arrayOfFloat3[1] = (arrayOfM1[i]).d;
      this.b[i].mapPoints(arrayOfFloat3);
      if (i != 1 && i != 3) {
        f2 = paramRectF.centerY();
        f1 = this.f[1];
      } else {
        f2 = paramRectF.centerX();
        f1 = this.f[0];
      } 
      f1 = Math.abs(f2 - f1);
      this.e.e(0.0F, 0.0F, 270.0F, 0.0F);
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            f = paramj.j;
          } else {
            f = paramj.i;
          } 
        } else {
          f = paramj.l;
        } 
      } else {
        f = paramj.k;
      } 
      f.a(f3, f1, paramFloat, this.e);
      this.e.c(this.c[i], paramPath);
      if (parama != null) {
        m m1 = this.e;
        Matrix matrix = this.c[i];
        m.f[] arrayOfF = ((g.a)parama).a.d;
        m1.b(m1.f);
        arrayOfF[i] = new l(m1, new ArrayList<m.f>(m1.h), matrix);
      } 
    } 
    paramPath.close();
  }
  
  public static interface a {}
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\d0\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */