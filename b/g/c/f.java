package b.g.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public class f extends ViewGroup {
  public e b;
  
  public ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return (ViewGroup.LayoutParams)new a(-2, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new a(getContext(), paramAttributeSet);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (ViewGroup.LayoutParams)new ConstraintLayout.a(paramLayoutParams);
  }
  
  public e getConstraintSet() {
    if (this.b == null)
      this.b = new e(); 
    e e1 = this.b;
    if (e1 != null) {
      int i = getChildCount();
      e1.c.clear();
      byte b = 0;
      while (b < i) {
        View view = getChildAt(b);
        a a = (a)view.getLayoutParams();
        int j = view.getId();
        if (!e1.b || j != -1) {
          if (!e1.c.containsKey(Integer.valueOf(j)))
            e1.c.put(Integer.valueOf(j), new e.a()); 
          e.a a1 = e1.c.get(Integer.valueOf(j));
          if (view instanceof c) {
            c c = (c)view;
            a1.c(j, a);
            if (c instanceof a) {
              e.b b1 = a1.d;
              b1.d0 = 1;
              c = c;
              b1.b0 = c.getType();
              a1.d.e0 = c.getReferencedIds();
              a1.d.c0 = c.getMargin();
            } 
          } 
          a1.c(j, a);
          b++;
          continue;
        } 
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
      } 
      return this.b;
    } 
    throw null;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public static class a extends ConstraintLayout.a {
    public float n0 = 1.0F;
    
    public boolean o0;
    
    public float p0;
    
    public float q0;
    
    public float r0;
    
    public float s0;
    
    public float t0;
    
    public float u0;
    
    public float v0;
    
    public float w0;
    
    public float x0;
    
    public float y0;
    
    public float z0;
    
    public a(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.o0 = false;
      this.p0 = 0.0F;
      this.q0 = 0.0F;
      this.r0 = 0.0F;
      this.s0 = 0.0F;
      this.t0 = 1.0F;
      this.u0 = 1.0F;
      this.v0 = 0.0F;
      this.w0 = 0.0F;
      this.x0 = 0.0F;
      this.y0 = 0.0F;
      this.z0 = 0.0F;
    }
    
    public a(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      byte b = 0;
      this.o0 = false;
      this.p0 = 0.0F;
      this.q0 = 0.0F;
      this.r0 = 0.0F;
      this.s0 = 0.0F;
      this.t0 = 1.0F;
      this.u0 = 1.0F;
      this.v0 = 0.0F;
      this.w0 = 0.0F;
      this.x0 = 0.0F;
      this.y0 = 0.0F;
      this.z0 = 0.0F;
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, k.ConstraintSet);
      int i = typedArray.getIndexCount();
      while (b < i) {
        int j = typedArray.getIndex(b);
        if (j == k.ConstraintSet_android_alpha) {
          this.n0 = typedArray.getFloat(j, this.n0);
        } else if (j == k.ConstraintSet_android_elevation) {
          this.p0 = typedArray.getFloat(j, this.p0);
          this.o0 = true;
        } else if (j == k.ConstraintSet_android_rotationX) {
          this.r0 = typedArray.getFloat(j, this.r0);
        } else if (j == k.ConstraintSet_android_rotationY) {
          this.s0 = typedArray.getFloat(j, this.s0);
        } else if (j == k.ConstraintSet_android_rotation) {
          this.q0 = typedArray.getFloat(j, this.q0);
        } else if (j == k.ConstraintSet_android_scaleX) {
          this.t0 = typedArray.getFloat(j, this.t0);
        } else if (j == k.ConstraintSet_android_scaleY) {
          this.u0 = typedArray.getFloat(j, this.u0);
        } else if (j == k.ConstraintSet_android_transformPivotX) {
          this.v0 = typedArray.getFloat(j, this.v0);
        } else if (j == k.ConstraintSet_android_transformPivotY) {
          this.w0 = typedArray.getFloat(j, this.w0);
        } else if (j == k.ConstraintSet_android_translationX) {
          this.x0 = typedArray.getFloat(j, this.x0);
        } else if (j == k.ConstraintSet_android_translationY) {
          this.y0 = typedArray.getFloat(j, this.y0);
        } else if (j == k.ConstraintSet_android_translationZ) {
          this.z0 = typedArray.getFloat(j, this.z0);
        } 
        b++;
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */