package b.g.b;

import java.util.ArrayList;

public class b implements d.a {
  public g a = null;
  
  public float b = 0.0F;
  
  public boolean c;
  
  public ArrayList<g> d = new ArrayList<g>();
  
  public a e;
  
  public boolean f = false;
  
  public b() {}
  
  public b(c paramc) {
    this.e = new a(this, paramc);
  }
  
  public void a(g paramg) {
    // Byte code:
    //   0: aload_1
    //   1: getfield e : I
    //   4: istore_3
    //   5: iload_3
    //   6: iconst_1
    //   7: if_icmpne -> 13
    //   10: goto -> 57
    //   13: iload_3
    //   14: iconst_2
    //   15: if_icmpne -> 24
    //   18: ldc 1000.0
    //   20: fstore_2
    //   21: goto -> 59
    //   24: iload_3
    //   25: iconst_3
    //   26: if_icmpne -> 35
    //   29: ldc 1000000.0
    //   31: fstore_2
    //   32: goto -> 59
    //   35: iload_3
    //   36: iconst_4
    //   37: if_icmpne -> 46
    //   40: ldc 1.0E9
    //   42: fstore_2
    //   43: goto -> 59
    //   46: iload_3
    //   47: iconst_5
    //   48: if_icmpne -> 57
    //   51: ldc 1.0E12
    //   53: fstore_2
    //   54: goto -> 59
    //   57: fconst_1
    //   58: fstore_2
    //   59: aload_0
    //   60: getfield e : Lb/g/b/b$a;
    //   63: aload_1
    //   64: fload_2
    //   65: invokeinterface j : (Lb/g/b/g;F)V
    //   70: return
  }
  
  public g b(d paramd, boolean[] paramArrayOfboolean) {
    return i(paramArrayOfboolean, null);
  }
  
  public b c(d paramd, int paramInt) {
    this.e.j(paramd.k(paramInt, "ep"), 1.0F);
    this.e.j(paramd.k(paramInt, "em"), -1.0F);
    return this;
  }
  
  public void clear() {
    this.e.clear();
    this.a = null;
    this.b = 0.0F;
  }
  
  public b d(g paramg1, g paramg2, g paramg3, g paramg4, float paramFloat) {
    this.e.j(paramg1, -1.0F);
    this.e.j(paramg2, 1.0F);
    this.e.j(paramg3, paramFloat);
    this.e.j(paramg4, -paramFloat);
    return this;
  }
  
  public b e(g paramg1, g paramg2, g paramg3, int paramInt) {
    int i = 0;
    int j = 0;
    if (paramInt != 0) {
      i = j;
      j = paramInt;
      if (paramInt < 0) {
        j = paramInt * -1;
        i = 1;
      } 
      this.b = j;
    } 
    if (i == 0) {
      this.e.j(paramg1, -1.0F);
      this.e.j(paramg2, 1.0F);
      this.e.j(paramg3, 1.0F);
    } else {
      this.e.j(paramg1, 1.0F);
      this.e.j(paramg2, -1.0F);
      this.e.j(paramg3, -1.0F);
    } 
    return this;
  }
  
  public b f(g paramg1, g paramg2, g paramg3, int paramInt) {
    int i = 0;
    int j = 0;
    if (paramInt != 0) {
      i = j;
      j = paramInt;
      if (paramInt < 0) {
        j = paramInt * -1;
        i = 1;
      } 
      this.b = j;
    } 
    if (i == 0) {
      this.e.j(paramg1, -1.0F);
      this.e.j(paramg2, 1.0F);
      this.e.j(paramg3, -1.0F);
    } else {
      this.e.j(paramg1, 1.0F);
      this.e.j(paramg2, -1.0F);
      this.e.j(paramg3, 1.0F);
    } 
    return this;
  }
  
  public b g(g paramg1, g paramg2, g paramg3, g paramg4, float paramFloat) {
    this.e.j(paramg3, 0.5F);
    this.e.j(paramg4, 0.5F);
    this.e.j(paramg1, -0.5F);
    this.e.j(paramg2, -0.5F);
    this.b = -paramFloat;
    return this;
  }
  
  public final boolean h(g paramg) {
    int i = paramg.m;
    boolean bool = true;
    if (i > 1)
      bool = false; 
    return bool;
  }
  
  public final g i(boolean[] paramArrayOfboolean, g paramg) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Lb/g/b/b$a;
    //   4: invokeinterface k : ()I
    //   9: istore #7
    //   11: aconst_null
    //   12: astore #8
    //   14: iconst_0
    //   15: istore #6
    //   17: fconst_0
    //   18: fstore_3
    //   19: iload #6
    //   21: iload #7
    //   23: if_icmpge -> 165
    //   26: aload_0
    //   27: getfield e : Lb/g/b/b$a;
    //   30: iload #6
    //   32: invokeinterface a : (I)F
    //   37: fstore #5
    //   39: aload #8
    //   41: astore #9
    //   43: fload_3
    //   44: fstore #4
    //   46: fload #5
    //   48: fconst_0
    //   49: fcmpg
    //   50: ifge -> 152
    //   53: aload_0
    //   54: getfield e : Lb/g/b/b$a;
    //   57: iload #6
    //   59: invokeinterface d : (I)Lb/g/b/g;
    //   64: astore #10
    //   66: aload_1
    //   67: ifnull -> 87
    //   70: aload #8
    //   72: astore #9
    //   74: fload_3
    //   75: fstore #4
    //   77: aload_1
    //   78: aload #10
    //   80: getfield c : I
    //   83: baload
    //   84: ifne -> 152
    //   87: aload #8
    //   89: astore #9
    //   91: fload_3
    //   92: fstore #4
    //   94: aload #10
    //   96: aload_2
    //   97: if_acmpeq -> 152
    //   100: aload #10
    //   102: getfield j : Lb/g/b/g$a;
    //   105: astore #11
    //   107: aload #11
    //   109: getstatic b/g/b/g$a.d : Lb/g/b/g$a;
    //   112: if_acmpeq -> 130
    //   115: aload #8
    //   117: astore #9
    //   119: fload_3
    //   120: fstore #4
    //   122: aload #11
    //   124: getstatic b/g/b/g$a.e : Lb/g/b/g$a;
    //   127: if_acmpne -> 152
    //   130: aload #8
    //   132: astore #9
    //   134: fload_3
    //   135: fstore #4
    //   137: fload #5
    //   139: fload_3
    //   140: fcmpg
    //   141: ifge -> 152
    //   144: fload #5
    //   146: fstore #4
    //   148: aload #10
    //   150: astore #9
    //   152: iinc #6, 1
    //   155: aload #9
    //   157: astore #8
    //   159: fload #4
    //   161: fstore_3
    //   162: goto -> 19
    //   165: aload #8
    //   167: areturn
  }
  
  public void j(g paramg) {
    g g1 = this.a;
    if (g1 != null) {
      this.e.j(g1, -1.0F);
      this.a = null;
    } 
    float f = this.e.b(paramg, true) * -1.0F;
    this.a = paramg;
    if (f == 1.0F)
      return; 
    this.b /= f;
    this.e.h(f);
  }
  
  public void k(g paramg, boolean paramBoolean) {
    if (!paramg.g)
      return; 
    float f2 = this.e.e(paramg);
    float f1 = this.b;
    this.b = paramg.f * f2 + f1;
    this.e.b(paramg, paramBoolean);
    if (paramBoolean)
      paramg.b(this); 
  }
  
  public void l(b paramb, boolean paramBoolean) {
    float f1 = this.e.f(paramb, paramBoolean);
    float f2 = this.b;
    this.b = paramb.b * f1 + f2;
    if (paramBoolean)
      paramb.a.b(this); 
  }
  
  public String toString() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lb/g/b/g;
    //   4: ifnonnull -> 14
    //   7: ldc '0'
    //   9: astore #7
    //   11: goto -> 38
    //   14: ldc ''
    //   16: invokestatic e : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: astore #7
    //   21: aload #7
    //   23: aload_0
    //   24: getfield a : Lb/g/b/g;
    //   27: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: aload #7
    //   33: invokevirtual toString : ()Ljava/lang/String;
    //   36: astore #7
    //   38: aload #7
    //   40: ldc ' = '
    //   42: invokestatic c : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   45: astore #7
    //   47: aload_0
    //   48: getfield b : F
    //   51: fstore_1
    //   52: iconst_0
    //   53: istore #4
    //   55: fload_1
    //   56: fconst_0
    //   57: fcmpl
    //   58: ifeq -> 90
    //   61: aload #7
    //   63: invokestatic e : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: astore #7
    //   68: aload #7
    //   70: aload_0
    //   71: getfield b : F
    //   74: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: aload #7
    //   80: invokevirtual toString : ()Ljava/lang/String;
    //   83: astore #7
    //   85: iconst_1
    //   86: istore_3
    //   87: goto -> 92
    //   90: iconst_0
    //   91: istore_3
    //   92: aload_0
    //   93: getfield e : Lb/g/b/b$a;
    //   96: invokeinterface k : ()I
    //   101: istore #5
    //   103: iload #4
    //   105: iload #5
    //   107: if_icmpge -> 326
    //   110: aload_0
    //   111: getfield e : Lb/g/b/b$a;
    //   114: iload #4
    //   116: invokeinterface d : (I)Lb/g/b/g;
    //   121: astore #8
    //   123: aload #8
    //   125: ifnonnull -> 131
    //   128: goto -> 320
    //   131: aload_0
    //   132: getfield e : Lb/g/b/b$a;
    //   135: iload #4
    //   137: invokeinterface a : (I)F
    //   142: fstore_2
    //   143: fload_2
    //   144: fconst_0
    //   145: fcmpl
    //   146: istore #6
    //   148: iload #6
    //   150: ifne -> 156
    //   153: goto -> 320
    //   156: aload #8
    //   158: invokevirtual toString : ()Ljava/lang/String;
    //   161: astore #9
    //   163: iload_3
    //   164: ifne -> 193
    //   167: aload #7
    //   169: astore #8
    //   171: fload_2
    //   172: fstore_1
    //   173: fload_2
    //   174: fconst_0
    //   175: fcmpg
    //   176: ifge -> 249
    //   179: aload #7
    //   181: invokestatic e : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: astore #8
    //   186: ldc '- '
    //   188: astore #7
    //   190: goto -> 229
    //   193: aload #7
    //   195: invokestatic e : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: astore #8
    //   200: iload #6
    //   202: ifle -> 225
    //   205: aload #8
    //   207: ldc ' + '
    //   209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: pop
    //   213: aload #8
    //   215: invokevirtual toString : ()Ljava/lang/String;
    //   218: astore #8
    //   220: fload_2
    //   221: fstore_1
    //   222: goto -> 249
    //   225: ldc ' - '
    //   227: astore #7
    //   229: aload #8
    //   231: aload #7
    //   233: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: pop
    //   237: aload #8
    //   239: invokevirtual toString : ()Ljava/lang/String;
    //   242: astore #8
    //   244: fload_2
    //   245: ldc -1.0
    //   247: fmul
    //   248: fstore_1
    //   249: fload_1
    //   250: fconst_1
    //   251: fcmpl
    //   252: ifne -> 267
    //   255: new java/lang/StringBuilder
    //   258: dup
    //   259: invokespecial <init> : ()V
    //   262: astore #7
    //   264: goto -> 295
    //   267: new java/lang/StringBuilder
    //   270: dup
    //   271: invokespecial <init> : ()V
    //   274: astore #7
    //   276: aload #7
    //   278: aload #8
    //   280: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: pop
    //   284: aload #7
    //   286: fload_1
    //   287: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   290: pop
    //   291: ldc ' '
    //   293: astore #8
    //   295: aload #7
    //   297: aload #8
    //   299: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: pop
    //   303: aload #7
    //   305: aload #9
    //   307: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: pop
    //   311: aload #7
    //   313: invokevirtual toString : ()Ljava/lang/String;
    //   316: astore #7
    //   318: iconst_1
    //   319: istore_3
    //   320: iinc #4, 1
    //   323: goto -> 103
    //   326: aload #7
    //   328: astore #8
    //   330: iload_3
    //   331: ifne -> 343
    //   334: aload #7
    //   336: ldc '0.0'
    //   338: invokestatic c : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   341: astore #8
    //   343: aload #8
    //   345: areturn
  }
  
  public static interface a {
    float a(int param1Int);
    
    float b(g param1g, boolean param1Boolean);
    
    void c(g param1g, float param1Float, boolean param1Boolean);
    
    void clear();
    
    g d(int param1Int);
    
    float e(g param1g);
    
    float f(b param1b, boolean param1Boolean);
    
    boolean g(g param1g);
    
    void h(float param1Float);
    
    void i();
    
    void j(g param1g, float param1Float);
    
    int k();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */