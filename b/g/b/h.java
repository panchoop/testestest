package b.g.b;

import c.a.a.a.a;

public class h implements b.a {
  public int a = 16;
  
  public int b = 16;
  
  public int[] c = new int[16];
  
  public int[] d = new int[16];
  
  public int[] e = new int[16];
  
  public float[] f = new float[16];
  
  public int[] g = new int[16];
  
  public int[] h = new int[16];
  
  public int i = 0;
  
  public int j = -1;
  
  public final b k;
  
  public final c l;
  
  public h(b paramb, c paramc) {
    this.k = paramb;
    this.l = paramc;
    clear();
  }
  
  public float a(int paramInt) {
    int j = this.i;
    int i = this.j;
    for (byte b1 = 0; b1 < j; b1++) {
      if (b1 == paramInt)
        return this.f[i]; 
      i = this.h[i];
      if (i == -1)
        break; 
    } 
    return 0.0F;
  }
  
  public float b(g paramg, boolean paramBoolean) {
    int j = n(paramg);
    if (j == -1)
      return 0.0F; 
    int k = paramg.c;
    int m = k % this.b;
    int[] arrayOfInt1 = this.c;
    int i = arrayOfInt1[m];
    if (i != -1) {
      int n = i;
      if (this.e[i] == k) {
        int[] arrayOfInt = this.d;
        arrayOfInt1[m] = arrayOfInt[i];
        arrayOfInt[i] = -1;
      } else {
        while (true) {
          arrayOfInt1 = this.d;
          if (arrayOfInt1[n] != -1 && this.e[arrayOfInt1[n]] != k) {
            n = arrayOfInt1[n];
            continue;
          } 
          break;
        } 
        arrayOfInt1 = this.d;
        i = arrayOfInt1[n];
        if (i != -1 && this.e[i] == k) {
          arrayOfInt1[n] = arrayOfInt1[i];
          arrayOfInt1[i] = -1;
        } 
      } 
    } 
    float f = this.f[j];
    if (this.j == j)
      this.j = this.h[j]; 
    this.e[j] = -1;
    arrayOfInt1 = this.g;
    if (arrayOfInt1[j] != -1) {
      int[] arrayOfInt = this.h;
      arrayOfInt[arrayOfInt1[j]] = arrayOfInt[j];
    } 
    int[] arrayOfInt2 = this.h;
    if (arrayOfInt2[j] != -1) {
      arrayOfInt1 = this.g;
      arrayOfInt1[arrayOfInt2[j]] = arrayOfInt1[j];
    } 
    this.i--;
    paramg.m--;
    if (paramBoolean)
      paramg.b(this.k); 
    return f;
  }
  
  public void c(g paramg, float paramFloat, boolean paramBoolean) {
    if (paramFloat > -0.001F && paramFloat < 0.001F)
      return; 
    int i = n(paramg);
    if (i == -1) {
      j(paramg, paramFloat);
    } else {
      float[] arrayOfFloat = this.f;
      arrayOfFloat[i] = arrayOfFloat[i] + paramFloat;
      if (arrayOfFloat[i] > -0.001F && arrayOfFloat[i] < 0.001F) {
        arrayOfFloat[i] = 0.0F;
        b(paramg, paramBoolean);
      } 
    } 
  }
  
  public void clear() {
    int i = this.i;
    byte b1;
    for (b1 = 0; b1 < i; b1++) {
      g g = d(b1);
      if (g != null)
        g.b(this.k); 
    } 
    for (b1 = 0; b1 < this.a; b1++) {
      this.e[b1] = -1;
      this.d[b1] = -1;
    } 
    for (b1 = 0; b1 < this.b; b1++)
      this.c[b1] = -1; 
    this.i = 0;
    this.j = -1;
  }
  
  public g d(int paramInt) {
    int j = this.i;
    if (j == 0)
      return null; 
    int i = this.j;
    for (byte b1 = 0; b1 < j; b1++) {
      if (b1 == paramInt && i != -1)
        return this.l.d[this.e[i]]; 
      i = this.h[i];
      if (i == -1)
        break; 
    } 
    return null;
  }
  
  public float e(g paramg) {
    int i = n(paramg);
    return (i != -1) ? this.f[i] : 0.0F;
  }
  
  public float f(b paramb, boolean paramBoolean) {
    float f = e(paramb.a);
    b(paramb.a, paramBoolean);
    h h1 = (h)paramb.e;
    int j = h1.i;
    int i = 0;
    byte b1 = 0;
    while (i < j) {
      int[] arrayOfInt = h1.e;
      int k = i;
      if (arrayOfInt[b1] != -1) {
        float f1 = h1.f[b1];
        c(this.l.d[arrayOfInt[b1]], f1 * f, paramBoolean);
        k = i + 1;
      } 
      b1++;
      i = k;
    } 
    return f;
  }
  
  public boolean g(g paramg) {
    boolean bool;
    if (n(paramg) != -1) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void h(float paramFloat) {
    int j = this.i;
    int i = this.j;
    for (byte b1 = 0; b1 < j; b1++) {
      float[] arrayOfFloat = this.f;
      arrayOfFloat[i] = arrayOfFloat[i] / paramFloat;
      i = this.h[i];
      if (i == -1)
        break; 
    } 
  }
  
  public void i() {
    int j = this.i;
    int i = this.j;
    for (byte b1 = 0; b1 < j; b1++) {
      float[] arrayOfFloat = this.f;
      arrayOfFloat[i] = arrayOfFloat[i] * -1.0F;
      i = this.h[i];
      if (i == -1)
        break; 
    } 
  }
  
  public void j(g paramg, float paramFloat) {
    // Byte code:
    //   0: fload_2
    //   1: ldc -0.001
    //   3: fcmpl
    //   4: ifle -> 22
    //   7: fload_2
    //   8: ldc 0.001
    //   10: fcmpg
    //   11: ifge -> 22
    //   14: aload_0
    //   15: aload_1
    //   16: iconst_1
    //   17: invokevirtual b : (Lb/g/b/g;Z)F
    //   20: pop
    //   21: return
    //   22: aload_0
    //   23: getfield i : I
    //   26: istore_3
    //   27: iconst_0
    //   28: istore #8
    //   30: iload_3
    //   31: ifne -> 55
    //   34: aload_0
    //   35: iconst_0
    //   36: aload_1
    //   37: fload_2
    //   38: invokevirtual m : (ILb/g/b/g;F)V
    //   41: aload_0
    //   42: aload_1
    //   43: iconst_0
    //   44: invokevirtual l : (Lb/g/b/g;I)V
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield j : I
    //   52: goto -> 469
    //   55: aload_0
    //   56: aload_1
    //   57: invokevirtual n : (Lb/g/b/g;)I
    //   60: istore_3
    //   61: iload_3
    //   62: iconst_m1
    //   63: if_icmpeq -> 76
    //   66: aload_0
    //   67: getfield f : [F
    //   70: iload_3
    //   71: fload_2
    //   72: fastore
    //   73: goto -> 469
    //   76: aload_0
    //   77: getfield i : I
    //   80: istore_3
    //   81: aload_0
    //   82: getfield a : I
    //   85: istore #4
    //   87: iload_3
    //   88: iconst_1
    //   89: iadd
    //   90: iload #4
    //   92: if_icmplt -> 203
    //   95: iload #4
    //   97: iconst_2
    //   98: imul
    //   99: istore #4
    //   101: aload_0
    //   102: aload_0
    //   103: getfield e : [I
    //   106: iload #4
    //   108: invokestatic copyOf : ([II)[I
    //   111: putfield e : [I
    //   114: aload_0
    //   115: aload_0
    //   116: getfield f : [F
    //   119: iload #4
    //   121: invokestatic copyOf : ([FI)[F
    //   124: putfield f : [F
    //   127: aload_0
    //   128: aload_0
    //   129: getfield g : [I
    //   132: iload #4
    //   134: invokestatic copyOf : ([II)[I
    //   137: putfield g : [I
    //   140: aload_0
    //   141: aload_0
    //   142: getfield h : [I
    //   145: iload #4
    //   147: invokestatic copyOf : ([II)[I
    //   150: putfield h : [I
    //   153: aload_0
    //   154: aload_0
    //   155: getfield d : [I
    //   158: iload #4
    //   160: invokestatic copyOf : ([II)[I
    //   163: putfield d : [I
    //   166: aload_0
    //   167: getfield a : I
    //   170: istore_3
    //   171: iload_3
    //   172: iload #4
    //   174: if_icmpge -> 197
    //   177: aload_0
    //   178: getfield e : [I
    //   181: iload_3
    //   182: iconst_m1
    //   183: iastore
    //   184: aload_0
    //   185: getfield d : [I
    //   188: iload_3
    //   189: iconst_m1
    //   190: iastore
    //   191: iinc #3, 1
    //   194: goto -> 171
    //   197: aload_0
    //   198: iload #4
    //   200: putfield a : I
    //   203: aload_0
    //   204: getfield i : I
    //   207: istore #9
    //   209: aload_0
    //   210: getfield j : I
    //   213: istore_3
    //   214: iconst_0
    //   215: istore #6
    //   217: iconst_m1
    //   218: istore #4
    //   220: iload #8
    //   222: istore #5
    //   224: iload #4
    //   226: istore #7
    //   228: iload #6
    //   230: iload #9
    //   232: if_icmpge -> 309
    //   235: aload_0
    //   236: getfield e : [I
    //   239: astore #10
    //   241: aload #10
    //   243: iload_3
    //   244: iaload
    //   245: istore #7
    //   247: aload_1
    //   248: getfield c : I
    //   251: istore #5
    //   253: iload #7
    //   255: iload #5
    //   257: if_icmpne -> 268
    //   260: aload_0
    //   261: getfield f : [F
    //   264: iload_3
    //   265: fload_2
    //   266: fastore
    //   267: return
    //   268: aload #10
    //   270: iload_3
    //   271: iaload
    //   272: iload #5
    //   274: if_icmpge -> 280
    //   277: iload_3
    //   278: istore #4
    //   280: aload_0
    //   281: getfield h : [I
    //   284: iload_3
    //   285: iaload
    //   286: istore_3
    //   287: iload_3
    //   288: iconst_m1
    //   289: if_icmpne -> 303
    //   292: iload #8
    //   294: istore #5
    //   296: iload #4
    //   298: istore #7
    //   300: goto -> 309
    //   303: iinc #6, 1
    //   306: goto -> 220
    //   309: iload #5
    //   311: aload_0
    //   312: getfield a : I
    //   315: if_icmpge -> 338
    //   318: aload_0
    //   319: getfield e : [I
    //   322: iload #5
    //   324: iaload
    //   325: iconst_m1
    //   326: if_icmpne -> 332
    //   329: goto -> 341
    //   332: iinc #5, 1
    //   335: goto -> 309
    //   338: iconst_m1
    //   339: istore #5
    //   341: aload_0
    //   342: iload #5
    //   344: aload_1
    //   345: fload_2
    //   346: invokevirtual m : (ILb/g/b/g;F)V
    //   349: aload_0
    //   350: getfield g : [I
    //   353: astore #10
    //   355: iload #7
    //   357: iconst_m1
    //   358: if_icmpeq -> 394
    //   361: aload #10
    //   363: iload #5
    //   365: iload #7
    //   367: iastore
    //   368: aload_0
    //   369: getfield h : [I
    //   372: astore #10
    //   374: aload #10
    //   376: iload #5
    //   378: aload #10
    //   380: iload #7
    //   382: iaload
    //   383: iastore
    //   384: aload #10
    //   386: iload #7
    //   388: iload #5
    //   390: iastore
    //   391: goto -> 435
    //   394: aload #10
    //   396: iload #5
    //   398: iconst_m1
    //   399: iastore
    //   400: aload_0
    //   401: getfield i : I
    //   404: ifle -> 427
    //   407: aload_0
    //   408: getfield h : [I
    //   411: iload #5
    //   413: aload_0
    //   414: getfield j : I
    //   417: iastore
    //   418: aload_0
    //   419: iload #5
    //   421: putfield j : I
    //   424: goto -> 435
    //   427: aload_0
    //   428: getfield h : [I
    //   431: iload #5
    //   433: iconst_m1
    //   434: iastore
    //   435: aload_0
    //   436: getfield h : [I
    //   439: astore #10
    //   441: aload #10
    //   443: iload #5
    //   445: iaload
    //   446: iconst_m1
    //   447: if_icmpeq -> 462
    //   450: aload_0
    //   451: getfield g : [I
    //   454: aload #10
    //   456: iload #5
    //   458: iaload
    //   459: iload #5
    //   461: iastore
    //   462: aload_0
    //   463: aload_1
    //   464: iload #5
    //   466: invokevirtual l : (Lb/g/b/g;I)V
    //   469: return
  }
  
  public int k() {
    return this.i;
  }
  
  public final void l(g paramg, int paramInt) {
    int k = paramg.c % this.b;
    int[] arrayOfInt = this.c;
    int j = arrayOfInt[k];
    int i = j;
    if (j == -1) {
      arrayOfInt[k] = paramInt;
    } else {
      while (true) {
        arrayOfInt = this.d;
        if (arrayOfInt[i] != -1) {
          i = arrayOfInt[i];
          continue;
        } 
        arrayOfInt[i] = paramInt;
        this.d[paramInt] = -1;
        return;
      } 
    } 
    this.d[paramInt] = -1;
  }
  
  public final void m(int paramInt, g paramg, float paramFloat) {
    this.e[paramInt] = paramg.c;
    this.f[paramInt] = paramFloat;
    this.g[paramInt] = -1;
    this.h[paramInt] = -1;
    paramg.a(this.k);
    paramg.m++;
    this.i++;
  }
  
  public int n(g paramg) {
    if (this.i == 0)
      return -1; 
    int k = paramg.c;
    int i = this.b;
    int j = this.c[k % i];
    if (j == -1)
      return -1; 
    i = j;
    if (this.e[j] == k)
      return j; 
    while (true) {
      int[] arrayOfInt1 = this.d;
      if (arrayOfInt1[i] != -1 && this.e[arrayOfInt1[i]] != k) {
        i = arrayOfInt1[i];
        continue;
      } 
      break;
    } 
    int[] arrayOfInt = this.d;
    return (arrayOfInt[i] == -1) ? -1 : ((this.e[arrayOfInt[i]] == k) ? arrayOfInt[i] : -1);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(hashCode());
    stringBuilder.append(" { ");
    String str = stringBuilder.toString();
    int i = this.i;
    for (byte b1 = 0; b1 < i; b1++) {
      g g = d(b1);
      if (g != null) {
        StringBuilder stringBuilder1;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(g);
        stringBuilder2.append(" = ");
        stringBuilder2.append(a(b1));
        stringBuilder2.append(" ");
        str = stringBuilder2.toString();
        int j = n(g);
        String str1 = a.c(str, "[p: ");
        if (this.g[j] != -1) {
          stringBuilder1 = a.e(str1);
          stringBuilder1.append(this.l.d[this.e[this.g[j]]]);
        } else {
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append(str1);
          stringBuilder1.append("none");
        } 
        str = a.c(stringBuilder1.toString(), ", n: ");
        if (this.h[j] != -1) {
          StringBuilder stringBuilder3 = a.e(str);
          stringBuilder3.append(this.l.d[this.e[this.h[j]]]);
          str = stringBuilder3.toString();
        } else {
          str = a.c(str, "none");
        } 
        str = a.c(str, "]");
      } 
    } 
    return a.c(str, " }");
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */