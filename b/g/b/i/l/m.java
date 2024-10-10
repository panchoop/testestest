package b.g.b.i.l;

import b.g.b.i.c;
import b.g.b.i.d;

public abstract class m implements d {
  public int a;
  
  public d b;
  
  public k c;
  
  public d.a d;
  
  public g e = new g(this);
  
  public int f = 0;
  
  public boolean g = false;
  
  public f h = new f(this);
  
  public f i = new f(this);
  
  public a j = a.b;
  
  public m(d paramd) {
    this.b = paramd;
  }
  
  public void a(d paramd) {}
  
  public final void b(f paramf1, f paramf2, int paramInt) {
    paramf1.l.add(paramf2);
    paramf1.f = paramInt;
    paramf2.k.add(paramf1);
  }
  
  public final void c(f paramf1, f paramf2, int paramInt, g paramg) {
    paramf1.l.add(paramf2);
    paramf1.l.add(this.e);
    paramf1.h = paramInt;
    paramf1.i = paramg;
    paramf2.k.add(paramf1);
    paramg.k.add(paramf1);
  }
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void f();
  
  public final int g(int paramInt1, int paramInt2) {
    if (paramInt2 == 0) {
      d d1 = this.b;
      int i = d1.n;
      paramInt2 = Math.max(d1.m, paramInt1);
      if (i > 0)
        paramInt2 = Math.min(i, paramInt1); 
      i = paramInt1;
      if (paramInt2 != paramInt1)
        return paramInt2; 
    } else {
      d d1 = this.b;
      int i = d1.q;
      paramInt2 = Math.max(d1.p, paramInt1);
      if (i > 0)
        paramInt2 = Math.min(i, paramInt1); 
      i = paramInt1;
      if (paramInt2 != paramInt1)
        return paramInt2; 
    } 
    return SYNTHETIC_LOCAL_VARIABLE_3;
  }
  
  public final f h(c paramc) {
    f f1;
    c c1 = paramc.d;
    paramc = null;
    if (c1 == null)
      return null; 
    d d1 = c1.b;
    int i = c1.c.ordinal();
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i != 4) {
            if (i == 5)
              f1 = d1.e.k; 
          } else {
            l l = d1.e;
            f1 = l.i;
          } 
        } else {
          j j = d1.d;
          f1 = j.i;
        } 
      } else {
        l l = d1.e;
        f1 = l.h;
      } 
    } else {
      j j = d1.d;
      f1 = j.h;
    } 
    return f1;
  }
  
  public final f i(c paramc, int paramInt) {
    f f1;
    j j;
    l l;
    c c1 = paramc.d;
    c c2 = null;
    if (c1 == null)
      return null; 
    d d1 = c1.b;
    if (paramInt == 0) {
      j = d1.d;
    } else {
      l = ((d)j).e;
    } 
    paramInt = paramc.d.c.ordinal();
    if (paramInt != 1 && paramInt != 2) {
      if (paramInt != 3 && paramInt != 4) {
        paramc = c2;
      } else {
        f1 = l.i;
      } 
    } else {
      f1 = l.h;
    } 
    return f1;
  }
  
  public long j() {
    g g1 = this.e;
    return g1.j ? g1.g : 0L;
  }
  
  public abstract boolean k();
  
  public void l(c paramc1, c paramc2, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   5: astore #10
    //   7: aload_0
    //   8: aload_2
    //   9: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   12: astore #11
    //   14: aload #10
    //   16: getfield j : Z
    //   19: ifeq -> 563
    //   22: aload #11
    //   24: getfield j : Z
    //   27: ifne -> 33
    //   30: goto -> 563
    //   33: aload #10
    //   35: getfield g : I
    //   38: istore #6
    //   40: aload_1
    //   41: invokevirtual b : ()I
    //   44: iload #6
    //   46: iadd
    //   47: istore #7
    //   49: aload #11
    //   51: getfield g : I
    //   54: aload_2
    //   55: invokevirtual b : ()I
    //   58: isub
    //   59: istore #9
    //   61: iload #9
    //   63: iload #7
    //   65: isub
    //   66: istore #8
    //   68: aload_0
    //   69: getfield e : Lb/g/b/i/l/g;
    //   72: astore #12
    //   74: aload #12
    //   76: getfield j : Z
    //   79: ifne -> 404
    //   82: aload_0
    //   83: getfield d : Lb/g/b/i/d$a;
    //   86: astore_2
    //   87: getstatic b/g/b/i/d$a.d : Lb/g/b/i/d$a;
    //   90: astore_1
    //   91: aload_2
    //   92: aload_1
    //   93: if_acmpne -> 404
    //   96: aload_0
    //   97: getfield a : I
    //   100: istore #6
    //   102: iload #6
    //   104: ifeq -> 380
    //   107: iload #6
    //   109: iconst_1
    //   110: if_icmpeq -> 351
    //   113: iload #6
    //   115: iconst_2
    //   116: if_icmpeq -> 268
    //   119: iload #6
    //   121: iconst_3
    //   122: if_icmpeq -> 128
    //   125: goto -> 404
    //   128: aload_0
    //   129: getfield b : Lb/g/b/i/d;
    //   132: astore_2
    //   133: aload_2
    //   134: getfield d : Lb/g/b/i/l/j;
    //   137: astore #12
    //   139: aload #12
    //   141: getfield d : Lb/g/b/i/d$a;
    //   144: aload_1
    //   145: if_acmpne -> 181
    //   148: aload #12
    //   150: getfield a : I
    //   153: iconst_3
    //   154: if_icmpne -> 181
    //   157: aload_2
    //   158: getfield e : Lb/g/b/i/l/l;
    //   161: astore_2
    //   162: aload_2
    //   163: getfield d : Lb/g/b/i/d$a;
    //   166: aload_1
    //   167: if_acmpne -> 181
    //   170: aload_2
    //   171: getfield a : I
    //   174: iconst_3
    //   175: if_icmpne -> 181
    //   178: goto -> 404
    //   181: aload_0
    //   182: getfield b : Lb/g/b/i/d;
    //   185: astore_1
    //   186: iload_3
    //   187: ifne -> 198
    //   190: aload_1
    //   191: getfield e : Lb/g/b/i/l/l;
    //   194: astore_1
    //   195: goto -> 203
    //   198: aload_1
    //   199: getfield d : Lb/g/b/i/l/j;
    //   202: astore_1
    //   203: aload_1
    //   204: getfield e : Lb/g/b/i/l/g;
    //   207: astore_1
    //   208: aload_1
    //   209: getfield j : Z
    //   212: ifeq -> 404
    //   215: aload_0
    //   216: getfield b : Lb/g/b/i/d;
    //   219: getfield N : F
    //   222: fstore #4
    //   224: iload_3
    //   225: iconst_1
    //   226: if_icmpne -> 246
    //   229: aload_1
    //   230: getfield g : I
    //   233: i2f
    //   234: fload #4
    //   236: fdiv
    //   237: ldc 0.5
    //   239: fadd
    //   240: f2i
    //   241: istore #6
    //   243: goto -> 260
    //   246: fload #4
    //   248: aload_1
    //   249: getfield g : I
    //   252: i2f
    //   253: fmul
    //   254: ldc 0.5
    //   256: fadd
    //   257: f2i
    //   258: istore #6
    //   260: aload_0
    //   261: getfield e : Lb/g/b/i/l/g;
    //   264: astore_1
    //   265: goto -> 398
    //   268: aload_0
    //   269: getfield b : Lb/g/b/i/d;
    //   272: getfield K : Lb/g/b/i/d;
    //   275: astore_1
    //   276: aload_1
    //   277: ifnull -> 404
    //   280: iload_3
    //   281: ifne -> 292
    //   284: aload_1
    //   285: getfield d : Lb/g/b/i/l/j;
    //   288: astore_1
    //   289: goto -> 297
    //   292: aload_1
    //   293: getfield e : Lb/g/b/i/l/l;
    //   296: astore_1
    //   297: aload_1
    //   298: getfield e : Lb/g/b/i/l/g;
    //   301: getfield j : Z
    //   304: ifeq -> 404
    //   307: aload_0
    //   308: getfield b : Lb/g/b/i/d;
    //   311: astore_2
    //   312: iload_3
    //   313: ifne -> 325
    //   316: aload_2
    //   317: getfield o : F
    //   320: fstore #4
    //   322: goto -> 331
    //   325: aload_2
    //   326: getfield r : F
    //   329: fstore #4
    //   331: aload_1
    //   332: getfield e : Lb/g/b/i/l/g;
    //   335: getfield g : I
    //   338: i2f
    //   339: fload #4
    //   341: fmul
    //   342: ldc 0.5
    //   344: fadd
    //   345: f2i
    //   346: istore #6
    //   348: goto -> 384
    //   351: aload_0
    //   352: aload #12
    //   354: getfield m : I
    //   357: iload_3
    //   358: invokevirtual g : (II)I
    //   361: istore #6
    //   363: aload_0
    //   364: getfield e : Lb/g/b/i/l/g;
    //   367: astore_1
    //   368: iload #6
    //   370: iload #8
    //   372: invokestatic min : (II)I
    //   375: istore #6
    //   377: goto -> 398
    //   380: iload #8
    //   382: istore #6
    //   384: aload_0
    //   385: getfield e : Lb/g/b/i/l/g;
    //   388: astore_1
    //   389: aload_0
    //   390: iload #6
    //   392: iload_3
    //   393: invokevirtual g : (II)I
    //   396: istore #6
    //   398: aload_1
    //   399: iload #6
    //   401: invokevirtual c : (I)V
    //   404: aload_0
    //   405: getfield e : Lb/g/b/i/l/g;
    //   408: astore_1
    //   409: aload_1
    //   410: getfield j : Z
    //   413: ifne -> 417
    //   416: return
    //   417: aload_1
    //   418: getfield g : I
    //   421: iload #8
    //   423: if_icmpne -> 445
    //   426: aload_0
    //   427: getfield h : Lb/g/b/i/l/f;
    //   430: iload #7
    //   432: invokevirtual c : (I)V
    //   435: aload_0
    //   436: getfield i : Lb/g/b/i/l/f;
    //   439: iload #9
    //   441: invokevirtual c : (I)V
    //   444: return
    //   445: aload_0
    //   446: getfield b : Lb/g/b/i/d;
    //   449: astore_1
    //   450: iload_3
    //   451: ifne -> 463
    //   454: aload_1
    //   455: getfield U : F
    //   458: fstore #4
    //   460: goto -> 469
    //   463: aload_1
    //   464: getfield V : F
    //   467: fstore #4
    //   469: iload #9
    //   471: istore_3
    //   472: iload #7
    //   474: istore #6
    //   476: aload #10
    //   478: aload #11
    //   480: if_acmpne -> 500
    //   483: aload #10
    //   485: getfield g : I
    //   488: istore #6
    //   490: aload #11
    //   492: getfield g : I
    //   495: istore_3
    //   496: ldc 0.5
    //   498: fstore #4
    //   500: aload_0
    //   501: getfield e : Lb/g/b/i/l/g;
    //   504: getfield g : I
    //   507: istore #7
    //   509: aload_0
    //   510: getfield h : Lb/g/b/i/l/f;
    //   513: astore_1
    //   514: iload #6
    //   516: i2f
    //   517: fstore #5
    //   519: aload_1
    //   520: iload_3
    //   521: iload #6
    //   523: isub
    //   524: iload #7
    //   526: isub
    //   527: i2f
    //   528: fload #4
    //   530: fmul
    //   531: fload #5
    //   533: ldc 0.5
    //   535: fadd
    //   536: fadd
    //   537: f2i
    //   538: invokevirtual c : (I)V
    //   541: aload_0
    //   542: getfield i : Lb/g/b/i/l/f;
    //   545: aload_0
    //   546: getfield h : Lb/g/b/i/l/f;
    //   549: getfield g : I
    //   552: aload_0
    //   553: getfield e : Lb/g/b/i/l/g;
    //   556: getfield g : I
    //   559: iadd
    //   560: invokevirtual c : (I)V
    //   563: return
  }
  
  public enum a {
    b, c, d, e;
    
    public static final a[] f;
    
    static {
      a a1 = new a("CENTER", 3);
      e = a1;
      f = new a[] { b, c, d, a1 };
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\l\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */