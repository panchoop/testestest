package c.c.a.b.l;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public class e extends Property<ImageView, Matrix> {
  public final Matrix a = new Matrix();
  
  public e() {
    super(Matrix.class, "imageMatrixProperty");
  }
  
  public Object get(Object paramObject) {
    paramObject = paramObject;
    this.a.set(paramObject.getImageMatrix());
    return this.a;
  }
  
  public void set(Object paramObject1, Object paramObject2) {
    ((ImageView)paramObject1).setImageMatrix((Matrix)paramObject2);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\l\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */