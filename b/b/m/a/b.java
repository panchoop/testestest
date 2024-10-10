package b.b.m.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

public class b extends Drawable implements Drawable.Callback {
  public c b;
  
  public Rect c;
  
  public Drawable d;
  
  public Drawable e;
  
  public int f = 255;
  
  public boolean g;
  
  public int h = -1;
  
  public boolean i;
  
  public Runnable j;
  
  public long k;
  
  public long l;
  
  public b m;
  
  public static int d(Resources paramResources, int paramInt) {
    if (paramResources != null)
      paramInt = (paramResources.getDisplayMetrics()).densityDpi; 
    int i = paramInt;
    if (paramInt == 0)
      i = 160; 
    return i;
  }
  
  public void a(boolean paramBoolean) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield g : Z
    //   7: invokestatic uptimeMillis : ()J
    //   10: lstore #4
    //   12: aload_0
    //   13: getfield d : Landroid/graphics/drawable/Drawable;
    //   16: astore #8
    //   18: aload #8
    //   20: ifnull -> 97
    //   23: aload_0
    //   24: getfield k : J
    //   27: lstore #6
    //   29: lload #6
    //   31: lconst_0
    //   32: lcmp
    //   33: ifeq -> 102
    //   36: lload #6
    //   38: lload #4
    //   40: lcmp
    //   41: ifgt -> 56
    //   44: aload #8
    //   46: aload_0
    //   47: getfield f : I
    //   50: invokevirtual setAlpha : (I)V
    //   53: goto -> 97
    //   56: aload #8
    //   58: sipush #255
    //   61: lload #6
    //   63: lload #4
    //   65: lsub
    //   66: ldc2_w 255
    //   69: lmul
    //   70: l2i
    //   71: aload_0
    //   72: getfield b : Lb/b/m/a/b$c;
    //   75: getfield A : I
    //   78: idiv
    //   79: isub
    //   80: aload_0
    //   81: getfield f : I
    //   84: imul
    //   85: sipush #255
    //   88: idiv
    //   89: invokevirtual setAlpha : (I)V
    //   92: iconst_1
    //   93: istore_2
    //   94: goto -> 104
    //   97: aload_0
    //   98: lconst_0
    //   99: putfield k : J
    //   102: iconst_0
    //   103: istore_2
    //   104: aload_0
    //   105: getfield e : Landroid/graphics/drawable/Drawable;
    //   108: astore #8
    //   110: aload #8
    //   112: ifnull -> 189
    //   115: aload_0
    //   116: getfield l : J
    //   119: lstore #6
    //   121: lload #6
    //   123: lconst_0
    //   124: lcmp
    //   125: ifeq -> 194
    //   128: lload #6
    //   130: lload #4
    //   132: lcmp
    //   133: ifgt -> 152
    //   136: aload #8
    //   138: iconst_0
    //   139: iconst_0
    //   140: invokevirtual setVisible : (ZZ)Z
    //   143: pop
    //   144: aload_0
    //   145: aconst_null
    //   146: putfield e : Landroid/graphics/drawable/Drawable;
    //   149: goto -> 189
    //   152: aload #8
    //   154: lload #6
    //   156: lload #4
    //   158: lsub
    //   159: ldc2_w 255
    //   162: lmul
    //   163: l2i
    //   164: aload_0
    //   165: getfield b : Lb/b/m/a/b$c;
    //   168: getfield B : I
    //   171: idiv
    //   172: aload_0
    //   173: getfield f : I
    //   176: imul
    //   177: sipush #255
    //   180: idiv
    //   181: invokevirtual setAlpha : (I)V
    //   184: iload_3
    //   185: istore_2
    //   186: goto -> 194
    //   189: aload_0
    //   190: lconst_0
    //   191: putfield l : J
    //   194: iload_1
    //   195: ifeq -> 216
    //   198: iload_2
    //   199: ifeq -> 216
    //   202: aload_0
    //   203: aload_0
    //   204: getfield j : Ljava/lang/Runnable;
    //   207: lload #4
    //   209: ldc2_w 16
    //   212: ladd
    //   213: invokevirtual scheduleSelf : (Ljava/lang/Runnable;J)V
    //   216: return
  }
  
  public void applyTheme(Resources.Theme paramTheme) {
    c c1 = this.b;
    if (c1 != null) {
      if (paramTheme != null) {
        c1.c();
        int i = c1.h;
        Drawable[] arrayOfDrawable = c1.g;
        for (byte b1 = 0; b1 < i; b1++) {
          if (arrayOfDrawable[b1] != null && arrayOfDrawable[b1].canApplyTheme()) {
            arrayOfDrawable[b1].applyTheme(paramTheme);
            c1.e |= arrayOfDrawable[b1].getChangingConfigurations();
          } 
        } 
        c1.f(paramTheme.getResources());
      } 
      return;
    } 
    throw null;
  }
  
  public abstract c b();
  
  public final void c(Drawable paramDrawable) {
    if (this.m == null)
      this.m = new b(); 
    b b1 = this.m;
    b1.b = paramDrawable.getCallback();
    paramDrawable.setCallback(b1);
    try {
      if (this.b.A <= 0 && this.g)
        paramDrawable.setAlpha(this.f); 
      if (this.b.E) {
        paramDrawable.setColorFilter(this.b.D);
      } else {
        if (this.b.H)
          paramDrawable.setTintList(this.b.F); 
        if (this.b.I)
          paramDrawable.setTintMode(this.b.G); 
      } 
      paramDrawable.setVisible(isVisible(), true);
      paramDrawable.setDither(this.b.x);
      paramDrawable.setState(getState());
      paramDrawable.setLevel(getLevel());
      paramDrawable.setBounds(getBounds());
      if (Build.VERSION.SDK_INT >= 23)
        paramDrawable.setLayoutDirection(getLayoutDirection()); 
      paramDrawable.setAutoMirrored(this.b.C);
      Rect rect = this.c;
      if (rect != null)
        paramDrawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom); 
      return;
    } finally {
      b1 = this.m;
      Drawable.Callback callback = b1.b;
      b1.b = null;
      paramDrawable.setCallback(callback);
    } 
  }
  
  public boolean canApplyTheme() {
    return this.b.canApplyTheme();
  }
  
  public void draw(Canvas paramCanvas) {
    Drawable drawable = this.d;
    if (drawable != null)
      drawable.draw(paramCanvas); 
    drawable = this.e;
    if (drawable != null)
      drawable.draw(paramCanvas); 
  }
  
  public boolean e(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: getfield h : I
    //   5: if_icmpne -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: invokestatic uptimeMillis : ()J
    //   13: lstore_2
    //   14: aload_0
    //   15: getfield b : Lb/b/m/a/b$c;
    //   18: getfield B : I
    //   21: ifle -> 90
    //   24: aload_0
    //   25: getfield e : Landroid/graphics/drawable/Drawable;
    //   28: astore #4
    //   30: aload #4
    //   32: ifnull -> 43
    //   35: aload #4
    //   37: iconst_0
    //   38: iconst_0
    //   39: invokevirtual setVisible : (ZZ)Z
    //   42: pop
    //   43: aload_0
    //   44: getfield d : Landroid/graphics/drawable/Drawable;
    //   47: astore #4
    //   49: aload #4
    //   51: ifnull -> 77
    //   54: aload_0
    //   55: aload #4
    //   57: putfield e : Landroid/graphics/drawable/Drawable;
    //   60: aload_0
    //   61: aload_0
    //   62: getfield b : Lb/b/m/a/b$c;
    //   65: getfield B : I
    //   68: i2l
    //   69: lload_2
    //   70: ladd
    //   71: putfield l : J
    //   74: goto -> 109
    //   77: aload_0
    //   78: aconst_null
    //   79: putfield e : Landroid/graphics/drawable/Drawable;
    //   82: aload_0
    //   83: lconst_0
    //   84: putfield l : J
    //   87: goto -> 109
    //   90: aload_0
    //   91: getfield d : Landroid/graphics/drawable/Drawable;
    //   94: astore #4
    //   96: aload #4
    //   98: ifnull -> 109
    //   101: aload #4
    //   103: iconst_0
    //   104: iconst_0
    //   105: invokevirtual setVisible : (ZZ)Z
    //   108: pop
    //   109: iload_1
    //   110: iflt -> 181
    //   113: aload_0
    //   114: getfield b : Lb/b/m/a/b$c;
    //   117: astore #4
    //   119: iload_1
    //   120: aload #4
    //   122: getfield h : I
    //   125: if_icmpge -> 181
    //   128: aload #4
    //   130: iload_1
    //   131: invokevirtual d : (I)Landroid/graphics/drawable/Drawable;
    //   134: astore #4
    //   136: aload_0
    //   137: aload #4
    //   139: putfield d : Landroid/graphics/drawable/Drawable;
    //   142: aload_0
    //   143: iload_1
    //   144: putfield h : I
    //   147: aload #4
    //   149: ifnull -> 191
    //   152: aload_0
    //   153: getfield b : Lb/b/m/a/b$c;
    //   156: getfield A : I
    //   159: istore_1
    //   160: iload_1
    //   161: ifle -> 172
    //   164: aload_0
    //   165: lload_2
    //   166: iload_1
    //   167: i2l
    //   168: ladd
    //   169: putfield k : J
    //   172: aload_0
    //   173: aload #4
    //   175: invokevirtual c : (Landroid/graphics/drawable/Drawable;)V
    //   178: goto -> 191
    //   181: aload_0
    //   182: aconst_null
    //   183: putfield d : Landroid/graphics/drawable/Drawable;
    //   186: aload_0
    //   187: iconst_m1
    //   188: putfield h : I
    //   191: aload_0
    //   192: getfield k : J
    //   195: lconst_0
    //   196: lcmp
    //   197: ifne -> 209
    //   200: aload_0
    //   201: getfield l : J
    //   204: lconst_0
    //   205: lcmp
    //   206: ifeq -> 246
    //   209: aload_0
    //   210: getfield j : Ljava/lang/Runnable;
    //   213: astore #4
    //   215: aload #4
    //   217: ifnonnull -> 235
    //   220: aload_0
    //   221: new b/b/m/a/b$a
    //   224: dup
    //   225: aload_0
    //   226: invokespecial <init> : (Lb/b/m/a/b;)V
    //   229: putfield j : Ljava/lang/Runnable;
    //   232: goto -> 241
    //   235: aload_0
    //   236: aload #4
    //   238: invokevirtual unscheduleSelf : (Ljava/lang/Runnable;)V
    //   241: aload_0
    //   242: iconst_1
    //   243: invokevirtual a : (Z)V
    //   246: aload_0
    //   247: invokevirtual invalidateSelf : ()V
    //   250: iconst_1
    //   251: ireturn
  }
  
  public void f(c paramc) {
    this.b = paramc;
    int i = this.h;
    if (i >= 0) {
      Drawable drawable = paramc.d(i);
      this.d = drawable;
      if (drawable != null)
        c(drawable); 
    } 
    this.e = null;
  }
  
  public int getAlpha() {
    return this.f;
  }
  
  public int getChangingConfigurations() {
    return super.getChangingConfigurations() | this.b.getChangingConfigurations();
  }
  
  public final Drawable.ConstantState getConstantState() {
    synchronized (this.b) {
      boolean bool2 = null.v;
      boolean bool1 = false;
      if (bool2) {
        bool1 = null.w;
      } else {
        null.c();
        null.v = true;
        int i = null.h;
        Drawable[] arrayOfDrawable = null.g;
        byte b1 = 0;
        while (true) {
          if (b1 < i) {
            if (arrayOfDrawable[b1].getConstantState() == null) {
              null.w = false;
            } else {
              b1++;
              continue;
            } 
          } else {
            null.w = true;
            bool1 = true;
            break;
          } 
        } 
        if (bool1) {
          this.b.d = getChangingConfigurations();
          return this.b;
        } 
        return null;
      } 
    } 
    break;
  }
  
  public Drawable getCurrent() {
    return this.d;
  }
  
  public void getHotspotBounds(Rect paramRect) {
    Rect rect = this.c;
    if (rect != null) {
      paramRect.set(rect);
    } else {
      super.getHotspotBounds(paramRect);
    } 
  }
  
  public int getIntrinsicHeight() {
    byte b1;
    c c1 = this.b;
    if (c1.l) {
      if (!c1.m)
        c1.b(); 
      return c1.o;
    } 
    Drawable drawable = this.d;
    if (drawable != null) {
      b1 = drawable.getIntrinsicHeight();
    } else {
      b1 = -1;
    } 
    return b1;
  }
  
  public int getIntrinsicWidth() {
    byte b1;
    c c1 = this.b;
    if (c1.l) {
      if (!c1.m)
        c1.b(); 
      return c1.n;
    } 
    Drawable drawable = this.d;
    if (drawable != null) {
      b1 = drawable.getIntrinsicWidth();
    } else {
      b1 = -1;
    } 
    return b1;
  }
  
  public int getMinimumHeight() {
    boolean bool;
    c c1 = this.b;
    if (c1.l) {
      if (!c1.m)
        c1.b(); 
      return c1.q;
    } 
    Drawable drawable = this.d;
    if (drawable != null) {
      bool = drawable.getMinimumHeight();
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int getMinimumWidth() {
    boolean bool;
    c c1 = this.b;
    if (c1.l) {
      if (!c1.m)
        c1.b(); 
      return c1.p;
    } 
    Drawable drawable = this.d;
    if (drawable != null) {
      bool = drawable.getMinimumWidth();
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int getOpacity() {
    Drawable drawable = this.d;
    byte b1 = -2;
    int i = b1;
    if (drawable != null)
      if (!drawable.isVisible()) {
        i = b1;
      } else {
        c c1 = this.b;
        if (c1.r) {
          i = c1.s;
        } else {
          c1.c();
          int j = c1.h;
          Drawable[] arrayOfDrawable = c1.g;
          i = b1;
          if (j > 0)
            i = arrayOfDrawable[0].getOpacity(); 
          for (b1 = 1; b1 < j; b1++)
            i = Drawable.resolveOpacity(i, arrayOfDrawable[b1].getOpacity()); 
          c1.s = i;
          c1.r = true;
        } 
      }  
    return i;
  }
  
  public void getOutline(Outline paramOutline) {
    Drawable drawable = this.d;
    if (drawable != null)
      drawable.getOutline(paramOutline); 
  }
  
  public boolean getPadding(Rect paramRect) {
    int i;
    c c1 = this.b;
    boolean bool1 = c1.i;
    Rect rect2 = null;
    Rect rect1 = null;
    boolean bool = true;
    if (bool1) {
      rect1 = rect2;
    } else if (c1.k != null || c1.j) {
      rect1 = c1.k;
    } else {
      c1.c();
      Rect rect = new Rect();
      int j = c1.h;
      Drawable[] arrayOfDrawable = c1.g;
      i = 0;
      while (i < j) {
        Rect rect3 = rect1;
        if (arrayOfDrawable[i].getPadding(rect)) {
          rect2 = rect1;
          if (rect1 == null)
            rect2 = new Rect(0, 0, 0, 0); 
          int k = rect.left;
          if (k > rect2.left)
            rect2.left = k; 
          k = rect.top;
          if (k > rect2.top)
            rect2.top = k; 
          k = rect.right;
          if (k > rect2.right)
            rect2.right = k; 
          k = rect.bottom;
          rect3 = rect2;
          if (k > rect2.bottom) {
            rect2.bottom = k;
            rect3 = rect2;
          } 
        } 
        i++;
        rect1 = rect3;
      } 
      c1.j = true;
      c1.k = rect1;
    } 
    if (rect1 != null) {
      paramRect.set(rect1);
      if ((rect1.left | rect1.top | rect1.bottom | rect1.right) != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
    } else {
      Drawable drawable = this.d;
      if (drawable != null) {
        bool1 = drawable.getPadding(paramRect);
      } else {
        bool1 = super.getPadding(paramRect);
      } 
    } 
    if (this.b.C && a.a.a.a.a.B(this) == 1) {
      i = bool;
    } else {
      i = 0;
    } 
    if (i) {
      i = paramRect.left;
      paramRect.left = paramRect.right;
      paramRect.right = i;
    } 
    return bool1;
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    c c1 = this.b;
    if (c1 != null) {
      c1.r = false;
      c1.t = false;
    } 
    if (paramDrawable == this.d && getCallback() != null)
      getCallback().invalidateDrawable(this); 
  }
  
  public boolean isAutoMirrored() {
    return this.b.C;
  }
  
  public void jumpToCurrentState() {
    boolean bool1;
    Drawable drawable = this.e;
    boolean bool2 = true;
    if (drawable != null) {
      drawable.jumpToCurrentState();
      this.e = null;
      bool1 = true;
    } else {
      bool1 = false;
    } 
    drawable = this.d;
    if (drawable != null) {
      drawable.jumpToCurrentState();
      if (this.g)
        this.d.setAlpha(this.f); 
    } 
    if (this.l != 0L) {
      this.l = 0L;
      bool1 = true;
    } 
    if (this.k != 0L) {
      this.k = 0L;
      bool1 = bool2;
    } 
    if (bool1)
      invalidateSelf(); 
  }
  
  public Drawable mutate() {
    if (!this.i && super.mutate() == this) {
      c c1 = b();
      c1.e();
      f(c1);
      this.i = true;
    } 
    return this;
  }
  
  public void onBoundsChange(Rect paramRect) {
    Drawable drawable = this.e;
    if (drawable != null)
      drawable.setBounds(paramRect); 
    drawable = this.d;
    if (drawable != null)
      drawable.setBounds(paramRect); 
  }
  
  public boolean onLayoutDirectionChanged(int paramInt) {
    c c1 = this.b;
    int i = this.h;
    int j = c1.h;
    Drawable[] arrayOfDrawable = c1.g;
    byte b1 = 0;
    boolean bool;
    for (bool = false; b1 < j; bool = bool1) {
      boolean bool1 = bool;
      if (arrayOfDrawable[b1] != null) {
        boolean bool2;
        if (Build.VERSION.SDK_INT >= 23) {
          bool2 = arrayOfDrawable[b1].setLayoutDirection(paramInt);
        } else {
          bool2 = false;
        } 
        bool1 = bool;
        if (b1 == i)
          bool1 = bool2; 
      } 
      b1++;
    } 
    c1.z = paramInt;
    return bool;
  }
  
  public boolean onLevelChange(int paramInt) {
    Drawable drawable = this.e;
    if (drawable != null)
      return drawable.setLevel(paramInt); 
    drawable = this.d;
    return (drawable != null) ? drawable.setLevel(paramInt) : false;
  }
  
  public boolean onStateChange(int[] paramArrayOfint) {
    Drawable drawable = this.e;
    if (drawable != null)
      return drawable.setState(paramArrayOfint); 
    drawable = this.d;
    return (drawable != null) ? drawable.setState(paramArrayOfint) : false;
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) {
    if (paramDrawable == this.d && getCallback() != null)
      getCallback().scheduleDrawable(this, paramRunnable, paramLong); 
  }
  
  public void setAlpha(int paramInt) {
    if (!this.g || this.f != paramInt) {
      this.g = true;
      this.f = paramInt;
      Drawable drawable = this.d;
      if (drawable != null)
        if (this.k == 0L) {
          drawable.setAlpha(paramInt);
        } else {
          a(false);
        }  
    } 
  }
  
  public void setAutoMirrored(boolean paramBoolean) {
    c c1 = this.b;
    if (c1.C != paramBoolean) {
      c1.C = paramBoolean;
      Drawable drawable = this.d;
      if (drawable != null)
        drawable.setAutoMirrored(paramBoolean); 
    } 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    c c1 = this.b;
    c1.E = true;
    if (c1.D != paramColorFilter) {
      c1.D = paramColorFilter;
      Drawable drawable = this.d;
      if (drawable != null)
        drawable.setColorFilter(paramColorFilter); 
    } 
  }
  
  public void setDither(boolean paramBoolean) {
    c c1 = this.b;
    if (c1.x != paramBoolean) {
      c1.x = paramBoolean;
      Drawable drawable = this.d;
      if (drawable != null)
        drawable.setDither(paramBoolean); 
    } 
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2) {
    Drawable drawable = this.d;
    if (drawable != null)
      drawable.setHotspot(paramFloat1, paramFloat2); 
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Rect rect = this.c;
    if (rect == null) {
      this.c = new Rect(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      rect.set(paramInt1, paramInt2, paramInt3, paramInt4);
    } 
    Drawable drawable = this.d;
    if (drawable != null)
      drawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    c c1 = this.b;
    c1.H = true;
    if (c1.F != paramColorStateList) {
      c1.F = paramColorStateList;
      a.a.a.a.a.u0(this.d, paramColorStateList);
    } 
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    c c1 = this.b;
    c1.I = true;
    if (c1.G != paramMode) {
      c1.G = paramMode;
      a.a.a.a.a.v0(this.d, paramMode);
    } 
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    Drawable drawable = this.e;
    if (drawable != null)
      drawable.setVisible(paramBoolean1, paramBoolean2); 
    drawable = this.d;
    if (drawable != null)
      drawable.setVisible(paramBoolean1, paramBoolean2); 
    return bool;
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) {
    if (paramDrawable == this.d && getCallback() != null)
      getCallback().unscheduleDrawable(this, paramRunnable); 
  }
  
  public class a implements Runnable {
    public final b b;
    
    public a(b this$0) {}
    
    public void run() {
      this.b.a(true);
      this.b.invalidateSelf();
    }
  }
  
  public static class b implements Drawable.Callback {
    public Drawable.Callback b;
    
    public void invalidateDrawable(Drawable param1Drawable) {}
    
    public void scheduleDrawable(Drawable param1Drawable, Runnable param1Runnable, long param1Long) {
      Drawable.Callback callback = this.b;
      if (callback != null)
        callback.scheduleDrawable(param1Drawable, param1Runnable, param1Long); 
    }
    
    public void unscheduleDrawable(Drawable param1Drawable, Runnable param1Runnable) {
      Drawable.Callback callback = this.b;
      if (callback != null)
        callback.unscheduleDrawable(param1Drawable, param1Runnable); 
    }
  }
  
  public static abstract class c extends Drawable.ConstantState {
    public int A;
    
    public int B;
    
    public boolean C;
    
    public ColorFilter D;
    
    public boolean E;
    
    public ColorStateList F;
    
    public PorterDuff.Mode G;
    
    public boolean H;
    
    public boolean I;
    
    public final b a;
    
    public Resources b;
    
    public int c = 160;
    
    public int d;
    
    public int e;
    
    public SparseArray<Drawable.ConstantState> f;
    
    public Drawable[] g;
    
    public int h;
    
    public boolean i;
    
    public boolean j;
    
    public Rect k;
    
    public boolean l;
    
    public boolean m;
    
    public int n;
    
    public int o;
    
    public int p;
    
    public int q;
    
    public boolean r;
    
    public int s;
    
    public boolean t;
    
    public boolean u;
    
    public boolean v;
    
    public boolean w;
    
    public boolean x;
    
    public boolean y;
    
    public int z;
    
    public c(c param1c, b param1b, Resources param1Resources) {
      boolean bool = false;
      this.i = false;
      this.l = false;
      this.x = true;
      this.A = 0;
      this.B = 0;
      this.a = param1b;
      if (param1Resources != null) {
        Resources resources = param1Resources;
      } else if (param1c != null) {
        Resources resources = param1c.b;
      } else {
        param1b = null;
      } 
      this.b = (Resources)param1b;
      if (param1c != null) {
        i = param1c.c;
      } else {
        i = 0;
      } 
      int i = b.d(param1Resources, i);
      this.c = i;
      if (param1c != null) {
        this.d = param1c.d;
        this.e = param1c.e;
        this.v = true;
        this.w = true;
        this.i = param1c.i;
        this.l = param1c.l;
        this.x = param1c.x;
        this.y = param1c.y;
        this.z = param1c.z;
        this.A = param1c.A;
        this.B = param1c.B;
        this.C = param1c.C;
        this.D = param1c.D;
        this.E = param1c.E;
        this.F = param1c.F;
        this.G = param1c.G;
        this.H = param1c.H;
        this.I = param1c.I;
        if (param1c.c == i) {
          if (param1c.j) {
            this.k = new Rect(param1c.k);
            this.j = true;
          } 
          if (param1c.m) {
            this.n = param1c.n;
            this.o = param1c.o;
            this.p = param1c.p;
            this.q = param1c.q;
            this.m = true;
          } 
        } 
        if (param1c.r) {
          this.s = param1c.s;
          this.r = true;
        } 
        if (param1c.t) {
          this.u = param1c.u;
          this.t = true;
        } 
        Drawable[] arrayOfDrawable = param1c.g;
        this.g = new Drawable[arrayOfDrawable.length];
        this.h = param1c.h;
        SparseArray<Drawable.ConstantState> sparseArray = param1c.f;
        if (sparseArray != null) {
          sparseArray = sparseArray.clone();
        } else {
          sparseArray = new SparseArray(this.h);
        } 
        this.f = sparseArray;
        int j = this.h;
        for (i = bool; i < j; i++) {
          if (arrayOfDrawable[i] != null) {
            Drawable.ConstantState constantState = arrayOfDrawable[i].getConstantState();
            if (constantState != null) {
              this.f.put(i, constantState);
            } else {
              this.g[i] = arrayOfDrawable[i];
            } 
          } 
        } 
      } else {
        this.g = new Drawable[10];
        this.h = 0;
      } 
    }
    
    public final int a(Drawable param1Drawable) {
      int i = this.h;
      if (i >= this.g.length) {
        int k = i + 10;
        d.a a = (d.a)this;
        Drawable[] arrayOfDrawable = new Drawable[k];
        System.arraycopy(a.g, 0, arrayOfDrawable, 0, i);
        a.g = arrayOfDrawable;
        int[][] arrayOfInt = new int[k][];
        System.arraycopy(a.J, 0, arrayOfInt, 0, i);
        a.J = arrayOfInt;
      } 
      param1Drawable.mutate();
      param1Drawable.setVisible(false, true);
      param1Drawable.setCallback(this.a);
      this.g[i] = param1Drawable;
      this.h++;
      int j = this.e;
      this.e = param1Drawable.getChangingConfigurations() | j;
      this.r = false;
      this.t = false;
      this.k = null;
      this.j = false;
      this.m = false;
      this.v = false;
      return i;
    }
    
    public void b() {
      this.m = true;
      c();
      int i = this.h;
      Drawable[] arrayOfDrawable = this.g;
      this.o = -1;
      this.n = -1;
      byte b1 = 0;
      this.q = 0;
      this.p = 0;
      while (b1 < i) {
        Drawable drawable = arrayOfDrawable[b1];
        int j = drawable.getIntrinsicWidth();
        if (j > this.n)
          this.n = j; 
        j = drawable.getIntrinsicHeight();
        if (j > this.o)
          this.o = j; 
        j = drawable.getMinimumWidth();
        if (j > this.p)
          this.p = j; 
        j = drawable.getMinimumHeight();
        if (j > this.q)
          this.q = j; 
        b1++;
      } 
    }
    
    public final void c() {
      SparseArray<Drawable.ConstantState> sparseArray = this.f;
      if (sparseArray != null) {
        int i = sparseArray.size();
        for (byte b1 = 0; b1 < i; b1++) {
          int j = this.f.keyAt(b1);
          Drawable.ConstantState constantState = (Drawable.ConstantState)this.f.valueAt(b1);
          Drawable[] arrayOfDrawable = this.g;
          Drawable drawable = constantState.newDrawable(this.b);
          if (Build.VERSION.SDK_INT >= 23)
            drawable.setLayoutDirection(this.z); 
          drawable = drawable.mutate();
          drawable.setCallback(this.a);
          arrayOfDrawable[j] = drawable;
        } 
        this.f = null;
      } 
    }
    
    public boolean canApplyTheme() {
      int i = this.h;
      Drawable[] arrayOfDrawable = this.g;
      for (byte b1 = 0; b1 < i; b1++) {
        Drawable drawable = arrayOfDrawable[b1];
        if (drawable != null) {
          if (drawable.canApplyTheme())
            return true; 
        } else {
          Drawable.ConstantState constantState = (Drawable.ConstantState)this.f.get(b1);
          if (constantState != null && constantState.canApplyTheme())
            return true; 
        } 
      } 
      return false;
    }
    
    public final Drawable d(int param1Int) {
      Drawable drawable = this.g[param1Int];
      if (drawable != null)
        return drawable; 
      SparseArray<Drawable.ConstantState> sparseArray = this.f;
      if (sparseArray != null) {
        int i = sparseArray.indexOfKey(param1Int);
        if (i >= 0) {
          Drawable drawable1 = ((Drawable.ConstantState)this.f.valueAt(i)).newDrawable(this.b);
          if (Build.VERSION.SDK_INT >= 23)
            drawable1.setLayoutDirection(this.z); 
          drawable1 = drawable1.mutate();
          drawable1.setCallback(this.a);
          this.g[param1Int] = drawable1;
          this.f.removeAt(i);
          if (this.f.size() == 0)
            this.f = null; 
          return drawable1;
        } 
      } 
      return null;
    }
    
    public abstract void e();
    
    public final void f(Resources param1Resources) {
      if (param1Resources != null) {
        this.b = param1Resources;
        int i = b.d(param1Resources, this.c);
        int j = this.c;
        this.c = i;
        if (j != i) {
          this.m = false;
          this.j = false;
        } 
      } 
    }
    
    public int getChangingConfigurations() {
      return this.d | this.e;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\m\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */