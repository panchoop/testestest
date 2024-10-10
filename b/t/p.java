package b.t;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class p {
  public static final boolean a;
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 28) {
      bool = true;
    } else {
      bool = false;
    } 
    a = bool;
  }
  
  public static View a(ViewGroup paramViewGroup, View paramView1, View paramView2) {
    boolean bool;
    Matrix matrix = new Matrix();
    matrix.setTranslate(-paramView2.getScrollX(), -paramView2.getScrollY());
    v.a.g(paramView1, matrix);
    v.a.h((View)paramViewGroup, matrix);
    RectF rectF = new RectF(0.0F, 0.0F, paramView1.getWidth(), paramView1.getHeight());
    matrix.mapRect(rectF);
    int n = Math.round(rectF.left);
    int m = Math.round(rectF.top);
    int k = Math.round(rectF.right);
    int i = Math.round(rectF.bottom);
    ImageView imageView = new ImageView(paramView1.getContext());
    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    int j = paramView1.isAttachedToWindow() ^ true;
    if (paramViewGroup == null) {
      bool = false;
    } else {
      bool = paramViewGroup.isAttachedToWindow();
    } 
    paramView2 = null;
    View view = null;
    if (j != 0) {
      if (!bool) {
        view = paramView2;
      } else {
        ViewGroup viewGroup = (ViewGroup)paramView1.getParent();
        int i1 = viewGroup.indexOfChild(paramView1);
        paramViewGroup.getOverlay().add(paramView1);
        int i2 = Math.round(rectF.width());
        int i3 = Math.round(rectF.height());
        paramView2 = view;
      } 
    } else {
      Object object = null;
      boolean bool1 = false;
      int i1 = Math.round(rectF.width());
      int i2 = Math.round(rectF.height());
      paramView2 = view;
    } 
    if (view != null)
      imageView.setImageBitmap((Bitmap)view); 
    imageView.measure(View.MeasureSpec.makeMeasureSpec(k - n, 1073741824), View.MeasureSpec.makeMeasureSpec(i - m, 1073741824));
    imageView.layout(n, m, k, i);
    return (View)imageView;
  }
  
  public static Animator b(Animator paramAnimator1, Animator paramAnimator2) {
    if (paramAnimator1 == null)
      return paramAnimator2; 
    if (paramAnimator2 == null)
      return paramAnimator1; 
    AnimatorSet animatorSet = new AnimatorSet();
    animatorSet.playTogether(new Animator[] { paramAnimator1, paramAnimator2 });
    return (Animator)animatorSet;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */