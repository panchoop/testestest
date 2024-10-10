package b.b.p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public class a0 {
  public static final RectF l = new RectF();
  
  public static ConcurrentHashMap<String, Method> m = new ConcurrentHashMap<String, Method>();
  
  public static ConcurrentHashMap<String, Field> n = new ConcurrentHashMap<String, Field>();
  
  public int a;
  
  public boolean b;
  
  public float c;
  
  public float d;
  
  public float e;
  
  public int[] f;
  
  public boolean g;
  
  public TextPaint h;
  
  public final TextView i;
  
  public final Context j;
  
  public final c k;
  
  public a0(TextView paramTextView) {
    c c1;
    this.a = 0;
    this.b = false;
    this.c = -1.0F;
    this.d = -1.0F;
    this.e = -1.0F;
    this.f = new int[0];
    this.g = false;
    this.i = paramTextView;
    this.j = paramTextView.getContext();
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      c1 = new b();
    } else if (i >= 23) {
      c1 = new a();
    } else {
      c1 = new c();
    } 
    this.k = c1;
  }
  
  public static Method d(String paramString) {
    try {
      Method method2 = m.get(paramString);
      Method method1 = method2;
      if (method2 == null) {
        method2 = TextView.class.getDeclaredMethod(paramString, new Class[0]);
        method1 = method2;
        if (method2 != null) {
          method2.setAccessible(true);
          m.put(paramString, method2);
          method1 = method2;
        } 
      } 
      return method1;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to retrieve TextView#");
      stringBuilder.append(paramString);
      stringBuilder.append("() method");
      Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), exception);
      return null;
    } 
  }
  
  public static <T> T e(Object paramObject, String paramString, T paramT) {
    try {
      paramObject = d(paramString).invoke(paramObject, new Object[0]);
      paramT = (T)paramObject;
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("Failed to invoke TextView#");
      stringBuilder.append(paramString);
      stringBuilder.append("() method");
      Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), exception);
    } finally {}
    return paramT;
  }
  
  public void a() {
    int i;
    if (i() && this.a != 0) {
      i = 1;
    } else {
      i = 0;
    } 
    if (!i)
      return; 
    if (this.b) {
      if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0)
        return; 
      if (this.k.b(this.i)) {
        i = 1048576;
      } else {
        i = this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft() - this.i.getTotalPaddingRight();
      } 
      int j = this.i.getHeight() - this.i.getCompoundPaddingBottom() - this.i.getCompoundPaddingTop();
      if (i <= 0 || j <= 0)
        return; 
      synchronized (l) {
        l.setEmpty();
        l.right = i;
        l.bottom = j;
        float f = c(l);
        if (f != this.i.getTextSize())
          f(0, f); 
      } 
    } 
    this.b = true;
  }
  
  public final int[] b(int[] paramArrayOfint) {
    int i = paramArrayOfint.length;
    if (i == 0)
      return paramArrayOfint; 
    Arrays.sort(paramArrayOfint);
    ArrayList<? extends Comparable<? super Integer>> arrayList = new ArrayList();
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++) {
      int j = paramArrayOfint[b];
      if (j > 0 && Collections.binarySearch(arrayList, Integer.valueOf(j)) < 0)
        arrayList.add(Integer.valueOf(j)); 
    } 
    if (i == arrayList.size())
      return paramArrayOfint; 
    i = arrayList.size();
    paramArrayOfint = new int[i];
    for (b = bool; b < i; b++)
      paramArrayOfint[b] = ((Integer)arrayList.get(b)).intValue(); 
    return paramArrayOfint;
  }
  
  public final int c(RectF paramRectF) {
    int i = this.f.length;
    if (i != 0) {
      int k = i - 1;
      i = 1;
      int j = 0;
      while (i <= k) {
        StaticLayout staticLayout;
        int n = (i + k) / 2;
        j = this.f[n];
        CharSequence charSequence2 = this.i.getText();
        TransformationMethod transformationMethod = this.i.getTransformationMethod();
        CharSequence charSequence1 = charSequence2;
        if (transformationMethod != null) {
          CharSequence charSequence = transformationMethod.getTransformation(charSequence2, (View)this.i);
          charSequence1 = charSequence2;
          if (charSequence != null)
            charSequence1 = charSequence; 
        } 
        int m = this.i.getMaxLines();
        TextPaint textPaint = this.h;
        if (textPaint == null) {
          this.h = new TextPaint();
        } else {
          textPaint.reset();
        } 
        this.h.set(this.i.getPaint());
        this.h.setTextSize(j);
        Layout.Alignment alignment = e(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        j = Math.round(paramRectF.right);
        if (Build.VERSION.SDK_INT >= 23) {
          StaticLayout.Builder builder1 = StaticLayout.Builder.obtain(charSequence1, 0, charSequence1.length(), this.h, j);
          StaticLayout.Builder builder2 = builder1.setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
          if (m == -1) {
            j = Integer.MAX_VALUE;
          } else {
            j = m;
          } 
          builder2.setMaxLines(j);
          try {
            this.k.a(builder1, this.i);
          } catch (ClassCastException classCastException) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
          } 
          staticLayout = builder1.build();
        } else {
          float f2 = this.i.getLineSpacingMultiplier();
          float f1 = this.i.getLineSpacingExtra();
          boolean bool = this.i.getIncludeFontPadding();
          staticLayout = new StaticLayout(charSequence1, this.h, j, (Layout.Alignment)classCastException, f2, f1, bool);
        } 
        if ((m != -1 && (staticLayout.getLineCount() > m || staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != charSequence1.length())) || staticLayout.getHeight() > paramRectF.bottom) {
          j = 0;
        } else {
          j = 1;
        } 
        if (j != 0) {
          j = i;
          i = n + 1;
          continue;
        } 
        j = n - 1;
        k = j;
      } 
      return this.f[j];
    } 
    throw new IllegalStateException("No available text sizes to choose from.");
  }
  
  public void f(int paramInt, float paramFloat) {
    Resources resources;
    Context context = this.j;
    if (context == null) {
      resources = Resources.getSystem();
    } else {
      resources = resources.getResources();
    } 
    paramFloat = TypedValue.applyDimension(paramInt, paramFloat, resources.getDisplayMetrics());
    if (paramFloat != this.i.getPaint().getTextSize()) {
      this.i.getPaint().setTextSize(paramFloat);
      boolean bool = this.i.isInLayout();
      if (this.i.getLayout() != null) {
        this.b = false;
        try {
          Method method = d("nullLayouts");
          if (method != null)
            method.invoke(this.i, new Object[0]); 
        } catch (Exception exception) {
          Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", exception);
        } 
        if (!bool) {
          this.i.requestLayout();
        } else {
          this.i.forceLayout();
        } 
        this.i.invalidate();
      } 
    } 
  }
  
  public final boolean g() {
    boolean bool = i();
    byte b = 0;
    if (bool && this.a == 1) {
      if (!this.g || this.f.length == 0) {
        int i = (int)Math.floor(((this.e - this.d) / this.c)) + 1;
        int[] arrayOfInt = new int[i];
        while (b < i) {
          float f = this.d;
          arrayOfInt[b] = Math.round(b * this.c + f);
          b++;
        } 
        this.f = b(arrayOfInt);
      } 
      this.b = true;
    } else {
      this.b = false;
    } 
    return this.b;
  }
  
  public final boolean h() {
    boolean bool;
    int i = this.f.length;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.g = bool;
    if (bool) {
      this.a = 1;
      int[] arrayOfInt = this.f;
      this.d = arrayOfInt[0];
      this.e = arrayOfInt[i - 1];
      this.c = -1.0F;
    } 
    return this.g;
  }
  
  public final boolean i() {
    return this.i instanceof k ^ true;
  }
  
  public final void j(float paramFloat1, float paramFloat2, float paramFloat3) {
    if (paramFloat1 > 0.0F) {
      if (paramFloat2 > paramFloat1) {
        if (paramFloat3 > 0.0F) {
          this.a = 1;
          this.d = paramFloat1;
          this.e = paramFloat2;
          this.c = paramFloat3;
          this.g = false;
          return;
        } 
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("The auto-size step granularity (");
        stringBuilder2.append(paramFloat3);
        stringBuilder2.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(stringBuilder2.toString());
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Maximum auto-size text size (");
      stringBuilder1.append(paramFloat2);
      stringBuilder1.append("px) is less or equal to minimum auto-size text size (");
      stringBuilder1.append(paramFloat1);
      stringBuilder1.append("px)");
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Minimum auto-size text size (");
    stringBuilder.append(paramFloat1);
    stringBuilder.append("px) is less or equal to (0px)");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static class a extends c {
    public void a(StaticLayout.Builder param1Builder, TextView param1TextView) {
      param1Builder.setTextDirection(a0.<TextDirectionHeuristic>e(param1TextView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
  }
  
  public static class b extends a {
    public void a(StaticLayout.Builder param1Builder, TextView param1TextView) {
      param1Builder.setTextDirection(param1TextView.getTextDirectionHeuristic());
    }
    
    public boolean b(TextView param1TextView) {
      return param1TextView.isHorizontallyScrollable();
    }
  }
  
  public static class c {
    public void a(StaticLayout.Builder param1Builder, TextView param1TextView) {}
    
    public boolean b(TextView param1TextView) {
      return ((Boolean)a0.<Boolean>e(param1TextView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */