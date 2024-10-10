package b.r.d;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class o extends RecyclerView.z {
  public final LinearInterpolator i = new LinearInterpolator();
  
  public final DecelerateInterpolator j = new DecelerateInterpolator();
  
  public PointF k;
  
  public final DisplayMetrics l;
  
  public boolean m = false;
  
  public float n;
  
  public int o = 0;
  
  public int p = 0;
  
  public o(Context paramContext) {
    this.l = paramContext.getResources().getDisplayMetrics();
  }
  
  public void c(View paramView, RecyclerView.a0 parama0, RecyclerView.z.a parama) {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Landroid/graphics/PointF;
    //   4: astore_2
    //   5: iconst_0
    //   6: istore #7
    //   8: aload_2
    //   9: ifnull -> 45
    //   12: aload_2
    //   13: getfield x : F
    //   16: fconst_0
    //   17: fcmpl
    //   18: istore #4
    //   20: iload #4
    //   22: ifne -> 28
    //   25: goto -> 45
    //   28: iload #4
    //   30: ifle -> 39
    //   33: iconst_1
    //   34: istore #4
    //   36: goto -> 48
    //   39: iconst_m1
    //   40: istore #4
    //   42: goto -> 48
    //   45: iconst_0
    //   46: istore #4
    //   48: aload_0
    //   49: getfield c : Landroidx/recyclerview/widget/RecyclerView$o;
    //   52: astore_2
    //   53: aload_2
    //   54: ifnull -> 122
    //   57: aload_2
    //   58: invokevirtual e : ()Z
    //   61: ifne -> 67
    //   64: goto -> 122
    //   67: aload_1
    //   68: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   71: checkcast androidx/recyclerview/widget/RecyclerView$p
    //   74: astore #8
    //   76: aload_0
    //   77: aload_2
    //   78: aload_1
    //   79: invokevirtual C : (Landroid/view/View;)I
    //   82: aload #8
    //   84: getfield leftMargin : I
    //   87: isub
    //   88: aload_2
    //   89: aload_1
    //   90: invokevirtual F : (Landroid/view/View;)I
    //   93: aload #8
    //   95: getfield rightMargin : I
    //   98: iadd
    //   99: aload_2
    //   100: invokevirtual M : ()I
    //   103: aload_2
    //   104: getfield q : I
    //   107: aload_2
    //   108: invokevirtual N : ()I
    //   111: isub
    //   112: iload #4
    //   114: invokevirtual e : (IIIII)I
    //   117: istore #5
    //   119: goto -> 125
    //   122: iconst_0
    //   123: istore #5
    //   125: aload_0
    //   126: getfield k : Landroid/graphics/PointF;
    //   129: astore_2
    //   130: aload_2
    //   131: ifnull -> 167
    //   134: aload_2
    //   135: getfield y : F
    //   138: fconst_0
    //   139: fcmpl
    //   140: istore #4
    //   142: iload #4
    //   144: ifne -> 150
    //   147: goto -> 167
    //   150: iload #4
    //   152: ifle -> 161
    //   155: iconst_1
    //   156: istore #4
    //   158: goto -> 170
    //   161: iconst_m1
    //   162: istore #4
    //   164: goto -> 170
    //   167: iconst_0
    //   168: istore #4
    //   170: aload_0
    //   171: getfield c : Landroidx/recyclerview/widget/RecyclerView$o;
    //   174: astore_2
    //   175: iload #7
    //   177: istore #6
    //   179: aload_2
    //   180: ifnull -> 249
    //   183: aload_2
    //   184: invokevirtual f : ()Z
    //   187: ifne -> 197
    //   190: iload #7
    //   192: istore #6
    //   194: goto -> 249
    //   197: aload_1
    //   198: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   201: checkcast androidx/recyclerview/widget/RecyclerView$p
    //   204: astore #8
    //   206: aload_0
    //   207: aload_2
    //   208: aload_1
    //   209: invokevirtual G : (Landroid/view/View;)I
    //   212: aload #8
    //   214: getfield topMargin : I
    //   217: isub
    //   218: aload_2
    //   219: aload_1
    //   220: invokevirtual B : (Landroid/view/View;)I
    //   223: aload #8
    //   225: getfield bottomMargin : I
    //   228: iadd
    //   229: aload_2
    //   230: invokevirtual O : ()I
    //   233: aload_2
    //   234: getfield r : I
    //   237: aload_2
    //   238: invokevirtual L : ()I
    //   241: isub
    //   242: iload #4
    //   244: invokevirtual e : (IIIII)I
    //   247: istore #6
    //   249: aload_0
    //   250: iload #6
    //   252: iload #6
    //   254: imul
    //   255: iload #5
    //   257: iload #5
    //   259: imul
    //   260: iadd
    //   261: i2d
    //   262: invokestatic sqrt : (D)D
    //   265: d2i
    //   266: invokevirtual g : (I)I
    //   269: i2d
    //   270: ldc2_w 0.3356
    //   273: ddiv
    //   274: invokestatic ceil : (D)D
    //   277: d2i
    //   278: istore #4
    //   280: iload #4
    //   282: ifle -> 301
    //   285: aload_3
    //   286: iload #5
    //   288: ineg
    //   289: iload #6
    //   291: ineg
    //   292: iload #4
    //   294: aload_0
    //   295: getfield j : Landroid/view/animation/DecelerateInterpolator;
    //   298: invokevirtual b : (IIILandroid/view/animation/Interpolator;)V
    //   301: return
  }
  
  public int e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 != -1) {
      if (paramInt5 != 0) {
        if (paramInt5 == 1)
          return paramInt4 - paramInt2; 
        throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
      } 
      paramInt1 = paramInt3 - paramInt1;
      if (paramInt1 > 0)
        return paramInt1; 
      paramInt1 = paramInt4 - paramInt2;
      return (paramInt1 < 0) ? paramInt1 : 0;
    } 
    return paramInt3 - paramInt1;
  }
  
  public float f(DisplayMetrics paramDisplayMetrics) {
    return 25.0F / paramDisplayMetrics.densityDpi;
  }
  
  public int g(int paramInt) {
    float f = Math.abs(paramInt);
    if (!this.m) {
      this.n = f(this.l);
      this.m = true;
    } 
    return (int)Math.ceil((f * this.n));
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */