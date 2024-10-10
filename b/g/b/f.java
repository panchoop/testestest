package b.g.b;

import java.util.Arrays;
import java.util.Comparator;

public class f extends b {
  public int g = 128;
  
  public g[] h = new g[128];
  
  public g[] i = new g[128];
  
  public int j = 0;
  
  public b k = new b(this, this);
  
  public f(c paramc) {
    super(paramc);
  }
  
  public void a(g paramg) {
    this.k.b = paramg;
    Arrays.fill(paramg.i, 0.0F);
    paramg.i[paramg.e] = 1.0F;
    m(paramg);
  }
  
  public g b(d paramd, boolean[] paramArrayOfboolean) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #5
    //   3: iconst_m1
    //   4: istore #6
    //   6: iload #5
    //   8: aload_0
    //   9: getfield j : I
    //   12: if_icmpge -> 213
    //   15: aload_0
    //   16: getfield h : [Lb/g/b/g;
    //   19: astore #11
    //   21: aload #11
    //   23: iload #5
    //   25: aaload
    //   26: astore #10
    //   28: aload_2
    //   29: aload #10
    //   31: getfield c : I
    //   34: baload
    //   35: ifeq -> 41
    //   38: goto -> 205
    //   41: aload_0
    //   42: getfield k : Lb/g/b/f$b;
    //   45: astore_1
    //   46: aload_1
    //   47: aload #10
    //   49: putfield b : Lb/g/b/g;
    //   52: bipush #8
    //   54: istore #7
    //   56: iconst_1
    //   57: istore #9
    //   59: iconst_1
    //   60: istore #8
    //   62: iload #6
    //   64: iconst_m1
    //   65: if_icmpne -> 129
    //   68: aload_1
    //   69: ifnull -> 127
    //   72: iload #7
    //   74: iflt -> 116
    //   77: aload_1
    //   78: getfield b : Lb/g/b/g;
    //   81: getfield i : [F
    //   84: iload #7
    //   86: faload
    //   87: fstore_3
    //   88: fload_3
    //   89: fconst_0
    //   90: fcmpl
    //   91: ifle -> 97
    //   94: goto -> 116
    //   97: fload_3
    //   98: fconst_0
    //   99: fcmpg
    //   100: ifge -> 110
    //   103: iload #8
    //   105: istore #7
    //   107: goto -> 119
    //   110: iinc #7, -1
    //   113: goto -> 72
    //   116: iconst_0
    //   117: istore #7
    //   119: iload #7
    //   121: ifeq -> 205
    //   124: goto -> 201
    //   127: aconst_null
    //   128: athrow
    //   129: aload #11
    //   131: iload #6
    //   133: aaload
    //   134: astore #10
    //   136: aload_1
    //   137: ifnull -> 211
    //   140: iload #7
    //   142: iflt -> 193
    //   145: aload #10
    //   147: getfield i : [F
    //   150: iload #7
    //   152: faload
    //   153: fstore_3
    //   154: aload_1
    //   155: getfield b : Lb/g/b/g;
    //   158: getfield i : [F
    //   161: iload #7
    //   163: faload
    //   164: fstore #4
    //   166: fload #4
    //   168: fload_3
    //   169: fcmpl
    //   170: ifne -> 179
    //   173: iinc #7, -1
    //   176: goto -> 140
    //   179: fload #4
    //   181: fload_3
    //   182: fcmpg
    //   183: ifge -> 193
    //   186: iload #9
    //   188: istore #7
    //   190: goto -> 196
    //   193: iconst_0
    //   194: istore #7
    //   196: iload #7
    //   198: ifeq -> 205
    //   201: iload #5
    //   203: istore #6
    //   205: iinc #5, 1
    //   208: goto -> 6
    //   211: aconst_null
    //   212: athrow
    //   213: iload #6
    //   215: iconst_m1
    //   216: if_icmpne -> 221
    //   219: aconst_null
    //   220: areturn
    //   221: aload_0
    //   222: getfield h : [Lb/g/b/g;
    //   225: iload #6
    //   227: aaload
    //   228: areturn
  }
  
  public void clear() {
    this.j = 0;
    this.b = 0.0F;
  }
  
  public void l(b paramb, boolean paramBoolean) {
    g g1 = paramb.a;
    if (g1 == null)
      return; 
    b.a a = paramb.e;
    int i = a.k();
    for (byte b1 = 0; b1 < i; b1++) {
      g g2 = a.d(b1);
      float f2 = a.a(b1);
      b b2 = this.k;
      b2.b = g2;
      paramBoolean = g2.a;
      boolean bool2 = true;
      boolean bool1 = true;
      if (paramBoolean) {
        for (byte b3 = 0; b3 < 9; b3++) {
          float[] arrayOfFloat = b2.b.i;
          float f3 = arrayOfFloat[b3];
          arrayOfFloat[b3] = g1.i[b3] * f2 + f3;
          if (Math.abs(arrayOfFloat[b3]) < 1.0E-4F) {
            b2.b.i[b3] = 0.0F;
          } else {
            bool1 = false;
          } 
        } 
        if (bool1)
          b2.c.n(b2.b); 
        bool1 = false;
      } else {
        byte b3 = 0;
        while (true) {
          bool1 = bool2;
          if (b3 < 9) {
            float f3 = g1.i[b3];
            if (f3 != 0.0F) {
              float f4 = f3 * f2;
              f3 = f4;
              if (Math.abs(f4) < 1.0E-4F)
                f3 = 0.0F; 
              b2.b.i[b3] = f3;
            } else {
              b2.b.i[b3] = 0.0F;
            } 
            b3++;
            continue;
          } 
          break;
        } 
      } 
      if (bool1)
        m(g2); 
      float f1 = this.b;
      this.b = paramb.b * f2 + f1;
    } 
    n(g1);
  }
  
  public final void m(g paramg) {
    int i = this.j;
    g[] arrayOfG = this.h;
    if (i + 1 > arrayOfG.length) {
      arrayOfG = Arrays.<g>copyOf(arrayOfG, arrayOfG.length * 2);
      this.h = arrayOfG;
      this.i = Arrays.<g>copyOf(arrayOfG, arrayOfG.length * 2);
    } 
    arrayOfG = this.h;
    i = this.j;
    arrayOfG[i] = paramg;
    this.j = ++i;
    if (i > 1 && (arrayOfG[i - 1]).c > paramg.c) {
      boolean bool = false;
      i = 0;
      while (true) {
        int j = this.j;
        if (i < j) {
          this.i[i] = this.h[i];
          i++;
          continue;
        } 
        Arrays.sort(this.i, 0, j, new a(this));
        for (i = bool; i < this.j; i++)
          this.h[i] = this.i[i]; 
        break;
      } 
    } 
    paramg.a = true;
    paramg.a(this);
  }
  
  public final void n(g paramg) {
    for (int i = 0; i < this.j; i++) {
      if (this.h[i] == paramg)
        while (true) {
          int j = this.j;
          if (i < j - 1) {
            g[] arrayOfG = this.h;
            j = i + 1;
            arrayOfG[i] = arrayOfG[j];
            i = j;
            continue;
          } 
          this.j = j - 1;
          paramg.a = false;
          return;
        }  
    } 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("");
    stringBuilder.append(" goal -> (");
    stringBuilder.append(this.b);
    stringBuilder.append(") : ");
    String str = stringBuilder.toString();
    for (byte b1 = 0; b1 < this.j; b1++) {
      g g1 = this.h[b1];
      this.k.b = g1;
      StringBuilder stringBuilder1 = c.a.a.a.a.e(str);
      stringBuilder1.append(this.k);
      stringBuilder1.append(" ");
      str = stringBuilder1.toString();
    } 
    return str;
  }
  
  public class a implements Comparator<g> {
    public a(f this$0) {}
    
    public int compare(Object param1Object1, Object param1Object2) {
      param1Object1 = param1Object1;
      param1Object2 = param1Object2;
      return ((g)param1Object1).c - ((g)param1Object2).c;
    }
  }
  
  public class b implements Comparable {
    public g b;
    
    public final f c;
    
    public b(f this$0, f param1f1) {}
    
    public int compareTo(Object param1Object) {
      param1Object = param1Object;
      return this.b.c - ((g)param1Object).c;
    }
    
    public String toString() {
      g g1 = this.b;
      String str1 = "[ ";
      String str2 = str1;
      if (g1 != null) {
        byte b1 = 0;
        while (true) {
          str2 = str1;
          if (b1 < 9) {
            StringBuilder stringBuilder1 = c.a.a.a.a.e(str1);
            stringBuilder1.append(this.b.i[b1]);
            stringBuilder1.append(" ");
            String str = stringBuilder1.toString();
            b1++;
            continue;
          } 
          break;
        } 
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str2);
      stringBuilder.append("] ");
      stringBuilder.append(this.b);
      return stringBuilder.toString();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */