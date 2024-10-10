package b.g.b.i;

import b.g.b.g;
import java.util.HashSet;

public class c {
  public HashSet<c> a = null;
  
  public final d b;
  
  public final a c;
  
  public c d;
  
  public int e = 0;
  
  public int f = -1;
  
  public g g;
  
  public c(d paramd, a parama) {
    this.b = paramd;
    this.c = parama;
  }
  
  public boolean a(c paramc, int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 10
    //   4: aload_0
    //   5: invokevirtual e : ()V
    //   8: iconst_1
    //   9: ireturn
    //   10: iload #4
    //   12: ifne -> 304
    //   15: getstatic b/g/b/i/c$a.j : Lb/g/b/i/c$a;
    //   18: astore #10
    //   20: getstatic b/g/b/i/c$a.i : Lb/g/b/i/c$a;
    //   23: astore #7
    //   25: getstatic b/g/b/i/c$a.g : Lb/g/b/i/c$a;
    //   28: astore #8
    //   30: aload_1
    //   31: getfield c : Lb/g/b/i/c$a;
    //   34: astore #9
    //   36: aload_0
    //   37: getfield c : Lb/g/b/i/c$a;
    //   40: astore #11
    //   42: aload #9
    //   44: aload #11
    //   46: if_acmpne -> 79
    //   49: aload #11
    //   51: aload #8
    //   53: if_acmpne -> 172
    //   56: aload_1
    //   57: getfield b : Lb/g/b/i/d;
    //   60: getfield w : Z
    //   63: ifeq -> 178
    //   66: aload_0
    //   67: getfield b : Lb/g/b/i/d;
    //   70: getfield w : Z
    //   73: ifne -> 172
    //   76: goto -> 178
    //   79: aload #11
    //   81: invokevirtual ordinal : ()I
    //   84: tableswitch default -> 136, 0 -> 178, 1 -> 240, 2 -> 184, 3 -> 240, 4 -> 184, 5 -> 178, 6 -> 151, 7 -> 178, 8 -> 178
    //   136: new java/lang/AssertionError
    //   139: dup
    //   140: aload_0
    //   141: getfield c : Lb/g/b/i/c$a;
    //   144: invokevirtual name : ()Ljava/lang/String;
    //   147: invokespecial <init> : (Ljava/lang/Object;)V
    //   150: athrow
    //   151: aload #9
    //   153: aload #8
    //   155: if_acmpeq -> 178
    //   158: aload #9
    //   160: aload #7
    //   162: if_acmpeq -> 178
    //   165: aload #9
    //   167: aload #10
    //   169: if_acmpeq -> 178
    //   172: iconst_1
    //   173: istore #5
    //   175: goto -> 297
    //   178: iconst_0
    //   179: istore #5
    //   181: goto -> 297
    //   184: aload #9
    //   186: getstatic b/g/b/i/c$a.d : Lb/g/b/i/c$a;
    //   189: if_acmpeq -> 209
    //   192: aload #9
    //   194: getstatic b/g/b/i/c$a.f : Lb/g/b/i/c$a;
    //   197: if_acmpne -> 203
    //   200: goto -> 209
    //   203: iconst_0
    //   204: istore #5
    //   206: goto -> 212
    //   209: iconst_1
    //   210: istore #5
    //   212: aload_1
    //   213: getfield b : Lb/g/b/i/d;
    //   216: instanceof b/g/b/i/f
    //   219: ifeq -> 237
    //   222: iload #5
    //   224: ifne -> 172
    //   227: aload #9
    //   229: aload #10
    //   231: if_acmpne -> 178
    //   234: goto -> 172
    //   237: goto -> 297
    //   240: aload #9
    //   242: getstatic b/g/b/i/c$a.c : Lb/g/b/i/c$a;
    //   245: if_acmpeq -> 265
    //   248: aload #9
    //   250: getstatic b/g/b/i/c$a.e : Lb/g/b/i/c$a;
    //   253: if_acmpne -> 259
    //   256: goto -> 265
    //   259: iconst_0
    //   260: istore #6
    //   262: goto -> 268
    //   265: iconst_1
    //   266: istore #6
    //   268: iload #6
    //   270: istore #5
    //   272: aload_1
    //   273: getfield b : Lb/g/b/i/d;
    //   276: instanceof b/g/b/i/f
    //   279: ifeq -> 297
    //   282: iload #6
    //   284: ifne -> 172
    //   287: aload #9
    //   289: aload #7
    //   291: if_acmpne -> 178
    //   294: goto -> 172
    //   297: iload #5
    //   299: ifne -> 304
    //   302: iconst_0
    //   303: ireturn
    //   304: aload_0
    //   305: aload_1
    //   306: putfield d : Lb/g/b/i/c;
    //   309: aload_1
    //   310: getfield a : Ljava/util/HashSet;
    //   313: ifnonnull -> 327
    //   316: aload_1
    //   317: new java/util/HashSet
    //   320: dup
    //   321: invokespecial <init> : ()V
    //   324: putfield a : Ljava/util/HashSet;
    //   327: aload_0
    //   328: getfield d : Lb/g/b/i/c;
    //   331: getfield a : Ljava/util/HashSet;
    //   334: aload_0
    //   335: invokevirtual add : (Ljava/lang/Object;)Z
    //   338: pop
    //   339: iload_2
    //   340: ifle -> 351
    //   343: aload_0
    //   344: iload_2
    //   345: putfield e : I
    //   348: goto -> 356
    //   351: aload_0
    //   352: iconst_0
    //   353: putfield e : I
    //   356: aload_0
    //   357: iload_3
    //   358: putfield f : I
    //   361: iconst_1
    //   362: ireturn
  }
  
  public int b() {
    if (this.b.X == 8)
      return 0; 
    int i = this.f;
    if (i > -1) {
      c c1 = this.d;
      if (c1 != null && c1.b.X == 8)
        return i; 
    } 
    return this.e;
  }
  
  public boolean c() {
    HashSet<c> hashSet = this.a;
    if (hashSet == null)
      return false; 
    for (c c1 : hashSet) {
      switch (c1.c.ordinal()) {
        default:
          throw new AssertionError(c1.c.name());
        case 4:
          c1 = c1.b.z;
          break;
        case 3:
          c1 = c1.b.y;
          break;
        case 2:
          c1 = c1.b.B;
          break;
        case 1:
          c1 = c1.b.A;
          break;
        case 0:
        case 5:
        case 6:
        case 7:
        case 8:
          c1 = null;
          break;
      } 
      if (c1.d())
        return true; 
    } 
    return false;
  }
  
  public boolean d() {
    boolean bool;
    if (this.d != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void e() {
    c c1 = this.d;
    if (c1 != null) {
      HashSet<c> hashSet = c1.a;
      if (hashSet != null)
        hashSet.remove(this); 
    } 
    this.d = null;
    this.e = 0;
    this.f = -1;
  }
  
  public void f() {
    g g1 = this.g;
    if (g1 == null) {
      this.g = new g(g.a.b);
    } else {
      g1.c();
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b.Y);
    stringBuilder.append(":");
    stringBuilder.append(this.c.toString());
    return stringBuilder.toString();
  }
  
  public enum a {
    b, c, d, e, f, g, h, i, j;
    
    public static final a[] k;
    
    static {
      a a1 = new a("CENTER_Y", 8);
      j = a1;
      k = new a[] { b, c, d, e, f, g, h, i, a1 };
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */