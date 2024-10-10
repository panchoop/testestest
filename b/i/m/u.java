package b.i.m;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;

public class u {
  public static final u b;
  
  public final h a;
  
  static {
    a a;
    if (Build.VERSION.SDK_INT >= 29) {
      b b = new b();
    } else {
      a = new a();
    } 
    b = (((a.a()).a.a()).a.b()).a.c();
  }
  
  public u(WindowInsets paramWindowInsets) {
    e e;
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      e = new g(this, paramWindowInsets);
    } else {
      f f;
      if (i >= 28) {
        f = new f(this, (WindowInsets)e);
      } else {
        e = new e(this, (WindowInsets)f);
      } 
    } 
    this.a = e;
  }
  
  public u(u paramu) {
    this.a = new h(this);
  }
  
  public static b.i.f.b f(b.i.f.b paramb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int m = Math.max(0, paramb.a - paramInt1);
    int i = Math.max(0, paramb.b - paramInt2);
    int k = Math.max(0, paramb.c - paramInt3);
    int j = Math.max(0, paramb.d - paramInt4);
    return (m == paramInt1 && i == paramInt2 && k == paramInt3 && j == paramInt4) ? paramb : b.i.f.b.a(m, i, k, j);
  }
  
  public static u h(WindowInsets paramWindowInsets) {
    if (paramWindowInsets != null)
      return new u(paramWindowInsets); 
    throw null;
  }
  
  public int a() {
    return (e()).d;
  }
  
  public int b() {
    return (e()).a;
  }
  
  public int c() {
    return (e()).c;
  }
  
  public int d() {
    return (e()).b;
  }
  
  public b.i.f.b e() {
    return this.a.f();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof u))
      return false; 
    paramObject = paramObject;
    return Objects.equals(this.a, ((u)paramObject).a);
  }
  
  public WindowInsets g() {
    h h1 = this.a;
    if (h1 instanceof d) {
      WindowInsets windowInsets = ((d)h1).b;
    } else {
      h1 = null;
    } 
    return (WindowInsets)h1;
  }
  
  public int hashCode() {
    int i;
    h h1 = this.a;
    if (h1 == null) {
      i = 0;
    } else {
      i = h1.hashCode();
    } 
    return i;
  }
  
  public static class a extends c {
    public static Field c;
    
    public static boolean d = false;
    
    public static Constructor<WindowInsets> e;
    
    public static boolean f = false;
    
    public WindowInsets b;
    
    public a() {
      // Byte code:
      //   0: aload_0
      //   1: invokespecial <init> : ()V
      //   4: getstatic b/i/m/u$a.d : Z
      //   7: ifne -> 37
      //   10: ldc android/view/WindowInsets
      //   12: ldc 'CONSUMED'
      //   14: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
      //   17: putstatic b/i/m/u$a.c : Ljava/lang/reflect/Field;
      //   20: goto -> 33
      //   23: astore_1
      //   24: ldc 'WindowInsetsCompat'
      //   26: ldc 'Could not retrieve WindowInsets.CONSUMED field'
      //   28: aload_1
      //   29: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   32: pop
      //   33: iconst_1
      //   34: putstatic b/i/m/u$a.d : Z
      //   37: getstatic b/i/m/u$a.c : Ljava/lang/reflect/Field;
      //   40: astore_1
      //   41: aconst_null
      //   42: astore_2
      //   43: aload_1
      //   44: ifnull -> 82
      //   47: aload_1
      //   48: aconst_null
      //   49: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   52: checkcast android/view/WindowInsets
      //   55: astore_3
      //   56: aload_3
      //   57: ifnull -> 82
      //   60: new android/view/WindowInsets
      //   63: astore_1
      //   64: aload_1
      //   65: aload_3
      //   66: invokespecial <init> : (Landroid/view/WindowInsets;)V
      //   69: goto -> 171
      //   72: astore_1
      //   73: ldc 'WindowInsetsCompat'
      //   75: ldc 'Could not get value from WindowInsets.CONSUMED field'
      //   77: aload_1
      //   78: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   81: pop
      //   82: getstatic b/i/m/u$a.f : Z
      //   85: ifne -> 122
      //   88: ldc android/view/WindowInsets
      //   90: iconst_1
      //   91: anewarray java/lang/Class
      //   94: dup
      //   95: iconst_0
      //   96: ldc android/graphics/Rect
      //   98: aastore
      //   99: invokevirtual getConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
      //   102: putstatic b/i/m/u$a.e : Ljava/lang/reflect/Constructor;
      //   105: goto -> 118
      //   108: astore_1
      //   109: ldc 'WindowInsetsCompat'
      //   111: ldc 'Could not retrieve WindowInsets(Rect) constructor'
      //   113: aload_1
      //   114: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   117: pop
      //   118: iconst_1
      //   119: putstatic b/i/m/u$a.f : Z
      //   122: getstatic b/i/m/u$a.e : Ljava/lang/reflect/Constructor;
      //   125: astore_3
      //   126: aload_2
      //   127: astore_1
      //   128: aload_3
      //   129: ifnull -> 171
      //   132: new android/graphics/Rect
      //   135: astore_1
      //   136: aload_1
      //   137: invokespecial <init> : ()V
      //   140: aload_3
      //   141: iconst_1
      //   142: anewarray java/lang/Object
      //   145: dup
      //   146: iconst_0
      //   147: aload_1
      //   148: aastore
      //   149: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
      //   152: checkcast android/view/WindowInsets
      //   155: astore_1
      //   156: goto -> 171
      //   159: astore_1
      //   160: ldc 'WindowInsetsCompat'
      //   162: ldc 'Could not invoke WindowInsets(Rect) constructor'
      //   164: aload_1
      //   165: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      //   168: pop
      //   169: aload_2
      //   170: astore_1
      //   171: aload_0
      //   172: aload_1
      //   173: putfield b : Landroid/view/WindowInsets;
      //   176: return
      // Exception table:
      //   from	to	target	type
      //   10	20	23	java/lang/ReflectiveOperationException
      //   47	56	72	java/lang/ReflectiveOperationException
      //   60	69	72	java/lang/ReflectiveOperationException
      //   88	105	108	java/lang/ReflectiveOperationException
      //   132	156	159	java/lang/ReflectiveOperationException
    }
    
    public a(u param1u) {
      this.b = param1u.g();
    }
    
    public u a() {
      return u.h(this.b);
    }
    
    public void c(b.i.f.b param1b) {
      WindowInsets windowInsets = this.b;
      if (windowInsets != null)
        this.b = windowInsets.replaceSystemWindowInsets(param1b.a, param1b.b, param1b.c, param1b.d); 
    }
  }
  
  public static class b extends c {
    public final WindowInsets.Builder b;
    
    public b() {
      this.b = new WindowInsets.Builder();
    }
    
    public b(u param1u) {
      WindowInsets windowInsets = param1u.g();
      WindowInsets.Builder builder = new WindowInsets.Builder();
      if (windowInsets != null) {
        this(windowInsets);
      } else {
        this();
      } 
      this.b = builder;
    }
    
    public u a() {
      return u.h(this.b.build());
    }
    
    public void b(b.i.f.b param1b) {
      this.b.setStableInsets(Insets.of(param1b.a, param1b.b, param1b.c, param1b.d));
    }
    
    public void c(b.i.f.b param1b) {
      this.b.setSystemWindowInsets(Insets.of(param1b.a, param1b.b, param1b.c, param1b.d));
    }
  }
  
  public static class c {
    public final u a;
    
    public c() {
      this.a = u1;
    }
    
    public abstract u a();
    
    public void b(b.i.f.b param1b) {}
    
    public abstract void c(b.i.f.b param1b);
  }
  
  public static class d extends h {
    public final WindowInsets b;
    
    public b.i.f.b c = null;
    
    public d(u param1u, WindowInsets param1WindowInsets) {
      super(param1u);
      this.b = param1WindowInsets;
    }
    
    public final b.i.f.b f() {
      if (this.c == null)
        this.c = b.i.f.b.a(this.b.getSystemWindowInsetLeft(), this.b.getSystemWindowInsetTop(), this.b.getSystemWindowInsetRight(), this.b.getSystemWindowInsetBottom()); 
      return this.c;
    }
    
    public u g(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      u.b b1;
      u.a a;
      u u = u.h(this.b);
      if (Build.VERSION.SDK_INT >= 29) {
        b1 = new u.b(u);
      } else {
        a = new u.a((u)b1);
      } 
      a.c(u.f(f(), param1Int1, param1Int2, param1Int3, param1Int4));
      a.b(u.f(e(), param1Int1, param1Int2, param1Int3, param1Int4));
      return a.a();
    }
    
    public boolean i() {
      return this.b.isRound();
    }
  }
  
  public static class e extends d {
    public b.i.f.b d = null;
    
    public e(u param1u, WindowInsets param1WindowInsets) {
      super(param1u, param1WindowInsets);
    }
    
    public u b() {
      return u.h(this.b.consumeStableInsets());
    }
    
    public u c() {
      return u.h(this.b.consumeSystemWindowInsets());
    }
    
    public final b.i.f.b e() {
      if (this.d == null)
        this.d = b.i.f.b.a(this.b.getStableInsetLeft(), this.b.getStableInsetTop(), this.b.getStableInsetRight(), this.b.getStableInsetBottom()); 
      return this.d;
    }
    
    public boolean h() {
      return this.b.isConsumed();
    }
  }
  
  public static class f extends e {
    public f(u param1u, WindowInsets param1WindowInsets) {
      super(param1u, param1WindowInsets);
    }
    
    public u a() {
      return u.h(this.b.consumeDisplayCutout());
    }
    
    public c d() {
      c c;
      DisplayCutout displayCutout = this.b.getDisplayCutout();
      if (displayCutout == null) {
        displayCutout = null;
      } else {
        c = new c(displayCutout);
      } 
      return c;
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof f))
        return false; 
      param1Object = param1Object;
      return Objects.equals(this.b, ((u.d)param1Object).b);
    }
    
    public int hashCode() {
      return this.b.hashCode();
    }
  }
  
  public static class g extends f {
    public g(u param1u, WindowInsets param1WindowInsets) {
      super(param1u, param1WindowInsets);
    }
    
    public u g(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return u.h(this.b.inset(param1Int1, param1Int2, param1Int3, param1Int4));
    }
  }
  
  public static class h {
    public final u a;
    
    public h(u param1u) {
      this.a = param1u;
    }
    
    public u a() {
      return this.a;
    }
    
    public u b() {
      return this.a;
    }
    
    public u c() {
      return this.a;
    }
    
    public c d() {
      return null;
    }
    
    public b.i.f.b e() {
      return b.i.f.b.e;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof h))
        return false; 
      param1Object = param1Object;
      if (i() != param1Object.i() || h() != param1Object.h() || !Objects.equals(f(), param1Object.f()) || !Objects.equals(e(), param1Object.e()) || !Objects.equals(d(), param1Object.d()))
        bool = false; 
      return bool;
    }
    
    public b.i.f.b f() {
      return b.i.f.b.e;
    }
    
    public u g(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return u.b;
    }
    
    public boolean h() {
      return false;
    }
    
    public int hashCode() {
      return Objects.hash(new Object[] { Boolean.valueOf(i()), Boolean.valueOf(h()), f(), e(), d() });
    }
    
    public boolean i() {
      return false;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\\\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */