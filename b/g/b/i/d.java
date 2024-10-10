package b.g.b.i;

import b.g.b.c;
import b.g.b.g;
import b.g.b.i.l.c;
import b.g.b.i.l.j;
import b.g.b.i.l.l;
import java.util.ArrayList;

public class d {
  public c A = new c(this, c.a.e);
  
  public c B = new c(this, c.a.f);
  
  public c C = new c(this, c.a.g);
  
  public c D = new c(this, c.a.i);
  
  public c E = new c(this, c.a.j);
  
  public c F;
  
  public c[] G;
  
  public ArrayList<c> H;
  
  public boolean[] I;
  
  public a[] J;
  
  public d K;
  
  public int L;
  
  public int M;
  
  public float N;
  
  public int O;
  
  public int P;
  
  public int Q;
  
  public int R;
  
  public int S;
  
  public int T;
  
  public float U;
  
  public float V;
  
  public Object W;
  
  public int X;
  
  public String Y;
  
  public String Z;
  
  public boolean a = false;
  
  public int a0;
  
  public c b;
  
  public int b0;
  
  public c c;
  
  public float[] c0;
  
  public j d = new j(this);
  
  public d[] d0;
  
  public l e = new l(this);
  
  public d[] e0;
  
  public boolean[] f = new boolean[] { true, true };
  
  public int[] g = new int[] { 0, 0, 0, 0 };
  
  public int h = -1;
  
  public int i = -1;
  
  public int j = 0;
  
  public int k = 0;
  
  public int[] l = new int[2];
  
  public int m = 0;
  
  public int n = 0;
  
  public float o = 1.0F;
  
  public int p = 0;
  
  public int q = 0;
  
  public float r = 1.0F;
  
  public int s = -1;
  
  public float t = 1.0F;
  
  public int[] u = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
  
  public float v = 0.0F;
  
  public boolean w = false;
  
  public boolean x;
  
  public c y = new c(this, c.a.c);
  
  public c z = new c(this, c.a.d);
  
  public d() {
    c c1 = new c(this, c.a.h);
    this.F = c1;
    this.G = new c[] { this.y, this.A, this.z, this.B, this.C, c1 };
    ArrayList<c> arrayList = new ArrayList();
    this.H = arrayList;
    this.I = new boolean[2];
    a a1 = a.b;
    this.J = new a[] { a1, a1 };
    this.K = null;
    this.L = 0;
    this.M = 0;
    this.N = 0.0F;
    this.O = -1;
    this.P = 0;
    this.Q = 0;
    this.R = 0;
    this.U = 0.5F;
    this.V = 0.5F;
    this.X = 0;
    this.Y = null;
    this.Z = null;
    this.a0 = 0;
    this.b0 = 0;
    this.c0 = new float[] { -1.0F, -1.0F };
    this.d0 = new d[] { null, null };
    this.e0 = new d[] { null, null };
    arrayList.add(this.y);
    this.H.add(this.z);
    this.H.add(this.A);
    this.H.add(this.B);
    this.H.add(this.D);
    this.H.add(this.E);
    this.H.add(this.F);
    this.H.add(this.C);
  }
  
  public void A(a parama) {
    this.J[1] = parama;
  }
  
  public void B(int paramInt) {
    this.L = paramInt;
    int i = this.S;
    if (paramInt < i)
      this.L = i; 
  }
  
  public void C(boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: getstatic b/g/b/i/d$a.b : Lb/g/b/i/d$a;
    //   3: astore #12
    //   5: aload_0
    //   6: getfield d : Lb/g/b/i/l/j;
    //   9: astore #10
    //   11: iload_1
    //   12: aload #10
    //   14: getfield g : Z
    //   17: iand
    //   18: istore #9
    //   20: aload_0
    //   21: getfield e : Lb/g/b/i/l/l;
    //   24: astore #11
    //   26: iload_2
    //   27: aload #11
    //   29: getfield g : Z
    //   32: iand
    //   33: istore #8
    //   35: aload #10
    //   37: getfield h : Lb/g/b/i/l/f;
    //   40: getfield g : I
    //   43: istore_3
    //   44: aload #11
    //   46: getfield h : Lb/g/b/i/l/f;
    //   49: getfield g : I
    //   52: istore #4
    //   54: aload #10
    //   56: getfield i : Lb/g/b/i/l/f;
    //   59: getfield g : I
    //   62: istore #6
    //   64: aload #11
    //   66: getfield i : Lb/g/b/i/l/f;
    //   69: getfield g : I
    //   72: istore #7
    //   74: iload #6
    //   76: iload_3
    //   77: isub
    //   78: iflt -> 147
    //   81: iload #7
    //   83: iload #4
    //   85: isub
    //   86: iflt -> 147
    //   89: iload_3
    //   90: ldc -2147483648
    //   92: if_icmpeq -> 147
    //   95: iload_3
    //   96: ldc 2147483647
    //   98: if_icmpeq -> 147
    //   101: iload #4
    //   103: ldc -2147483648
    //   105: if_icmpeq -> 147
    //   108: iload #4
    //   110: ldc 2147483647
    //   112: if_icmpeq -> 147
    //   115: iload #6
    //   117: ldc -2147483648
    //   119: if_icmpeq -> 147
    //   122: iload #6
    //   124: ldc 2147483647
    //   126: if_icmpeq -> 147
    //   129: iload #7
    //   131: ldc -2147483648
    //   133: if_icmpeq -> 147
    //   136: iload #7
    //   138: istore #5
    //   140: iload #7
    //   142: ldc 2147483647
    //   144: if_icmpne -> 158
    //   147: iconst_0
    //   148: istore #6
    //   150: iconst_0
    //   151: istore #5
    //   153: iconst_0
    //   154: istore_3
    //   155: iconst_0
    //   156: istore #4
    //   158: iload #6
    //   160: iload_3
    //   161: isub
    //   162: istore #6
    //   164: iload #5
    //   166: iload #4
    //   168: isub
    //   169: istore #5
    //   171: iload #9
    //   173: ifeq -> 181
    //   176: aload_0
    //   177: iload_3
    //   178: putfield P : I
    //   181: iload #8
    //   183: ifeq -> 192
    //   186: aload_0
    //   187: iload #4
    //   189: putfield Q : I
    //   192: aload_0
    //   193: getfield X : I
    //   196: bipush #8
    //   198: if_icmpne -> 212
    //   201: aload_0
    //   202: iconst_0
    //   203: putfield L : I
    //   206: aload_0
    //   207: iconst_0
    //   208: putfield M : I
    //   211: return
    //   212: iload #9
    //   214: ifeq -> 273
    //   217: iload #6
    //   219: istore_3
    //   220: aload_0
    //   221: getfield J : [Lb/g/b/i/d$a;
    //   224: iconst_0
    //   225: aaload
    //   226: aload #12
    //   228: if_acmpne -> 250
    //   231: aload_0
    //   232: getfield L : I
    //   235: istore #4
    //   237: iload #6
    //   239: istore_3
    //   240: iload #6
    //   242: iload #4
    //   244: if_icmpge -> 250
    //   247: iload #4
    //   249: istore_3
    //   250: aload_0
    //   251: iload_3
    //   252: putfield L : I
    //   255: aload_0
    //   256: getfield S : I
    //   259: istore #4
    //   261: iload_3
    //   262: iload #4
    //   264: if_icmpge -> 273
    //   267: aload_0
    //   268: iload #4
    //   270: putfield L : I
    //   273: iload #8
    //   275: ifeq -> 334
    //   278: iload #5
    //   280: istore_3
    //   281: aload_0
    //   282: getfield J : [Lb/g/b/i/d$a;
    //   285: iconst_1
    //   286: aaload
    //   287: aload #12
    //   289: if_acmpne -> 311
    //   292: aload_0
    //   293: getfield M : I
    //   296: istore #4
    //   298: iload #5
    //   300: istore_3
    //   301: iload #5
    //   303: iload #4
    //   305: if_icmpge -> 311
    //   308: iload #4
    //   310: istore_3
    //   311: aload_0
    //   312: iload_3
    //   313: putfield M : I
    //   316: aload_0
    //   317: getfield T : I
    //   320: istore #4
    //   322: iload_3
    //   323: iload #4
    //   325: if_icmpge -> 334
    //   328: aload_0
    //   329: iload #4
    //   331: putfield M : I
    //   334: return
  }
  
  public void D(b.g.b.d paramd) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield y : Lb/g/b/i/c;
    //   5: invokevirtual o : (Ljava/lang/Object;)I
    //   8: istore_3
    //   9: aload_1
    //   10: aload_0
    //   11: getfield z : Lb/g/b/i/c;
    //   14: invokevirtual o : (Ljava/lang/Object;)I
    //   17: istore #7
    //   19: aload_1
    //   20: aload_0
    //   21: getfield A : Lb/g/b/i/c;
    //   24: invokevirtual o : (Ljava/lang/Object;)I
    //   27: istore #5
    //   29: aload_1
    //   30: aload_0
    //   31: getfield B : Lb/g/b/i/c;
    //   34: invokevirtual o : (Ljava/lang/Object;)I
    //   37: istore #6
    //   39: aload_0
    //   40: getfield d : Lb/g/b/i/l/j;
    //   43: astore #8
    //   45: aload #8
    //   47: getfield h : Lb/g/b/i/l/f;
    //   50: astore_1
    //   51: iload_3
    //   52: istore #4
    //   54: iload #5
    //   56: istore_2
    //   57: aload_1
    //   58: getfield j : Z
    //   61: ifeq -> 97
    //   64: aload #8
    //   66: getfield i : Lb/g/b/i/l/f;
    //   69: astore #8
    //   71: iload_3
    //   72: istore #4
    //   74: iload #5
    //   76: istore_2
    //   77: aload #8
    //   79: getfield j : Z
    //   82: ifeq -> 97
    //   85: aload_1
    //   86: getfield g : I
    //   89: istore #4
    //   91: aload #8
    //   93: getfield g : I
    //   96: istore_2
    //   97: aload_0
    //   98: getfield e : Lb/g/b/i/l/l;
    //   101: astore #8
    //   103: aload #8
    //   105: getfield h : Lb/g/b/i/l/f;
    //   108: astore_1
    //   109: iload #7
    //   111: istore #5
    //   113: iload #6
    //   115: istore_3
    //   116: aload_1
    //   117: getfield j : Z
    //   120: ifeq -> 157
    //   123: aload #8
    //   125: getfield i : Lb/g/b/i/l/f;
    //   128: astore #8
    //   130: iload #7
    //   132: istore #5
    //   134: iload #6
    //   136: istore_3
    //   137: aload #8
    //   139: getfield j : Z
    //   142: ifeq -> 157
    //   145: aload_1
    //   146: getfield g : I
    //   149: istore #5
    //   151: aload #8
    //   153: getfield g : I
    //   156: istore_3
    //   157: iload_2
    //   158: iload #4
    //   160: isub
    //   161: iflt -> 228
    //   164: iload_3
    //   165: iload #5
    //   167: isub
    //   168: iflt -> 228
    //   171: iload #4
    //   173: ldc -2147483648
    //   175: if_icmpeq -> 228
    //   178: iload #4
    //   180: ldc 2147483647
    //   182: if_icmpeq -> 228
    //   185: iload #5
    //   187: ldc -2147483648
    //   189: if_icmpeq -> 228
    //   192: iload #5
    //   194: ldc 2147483647
    //   196: if_icmpeq -> 228
    //   199: iload_2
    //   200: ldc -2147483648
    //   202: if_icmpeq -> 228
    //   205: iload_2
    //   206: ldc 2147483647
    //   208: if_icmpeq -> 228
    //   211: iload_3
    //   212: ldc -2147483648
    //   214: if_icmpeq -> 228
    //   217: iload_2
    //   218: istore #6
    //   220: iload_3
    //   221: istore_2
    //   222: iload_3
    //   223: ldc 2147483647
    //   225: if_icmpne -> 239
    //   228: iconst_0
    //   229: istore_2
    //   230: iconst_0
    //   231: istore #4
    //   233: iconst_0
    //   234: istore #5
    //   236: iconst_0
    //   237: istore #6
    //   239: getstatic b/g/b/i/d$a.b : Lb/g/b/i/d$a;
    //   242: astore_1
    //   243: iload #6
    //   245: iload #4
    //   247: isub
    //   248: istore_3
    //   249: iload_2
    //   250: iload #5
    //   252: isub
    //   253: istore #6
    //   255: aload_0
    //   256: iload #4
    //   258: putfield P : I
    //   261: aload_0
    //   262: iload #5
    //   264: putfield Q : I
    //   267: aload_0
    //   268: getfield X : I
    //   271: bipush #8
    //   273: if_icmpne -> 289
    //   276: aload_0
    //   277: iconst_0
    //   278: putfield L : I
    //   281: aload_0
    //   282: iconst_0
    //   283: putfield M : I
    //   286: goto -> 395
    //   289: iload_3
    //   290: istore_2
    //   291: aload_0
    //   292: getfield J : [Lb/g/b/i/d$a;
    //   295: iconst_0
    //   296: aaload
    //   297: aload_1
    //   298: if_acmpne -> 318
    //   301: aload_0
    //   302: getfield L : I
    //   305: istore #4
    //   307: iload_3
    //   308: istore_2
    //   309: iload_3
    //   310: iload #4
    //   312: if_icmpge -> 318
    //   315: iload #4
    //   317: istore_2
    //   318: iload #6
    //   320: istore_3
    //   321: aload_0
    //   322: getfield J : [Lb/g/b/i/d$a;
    //   325: iconst_1
    //   326: aaload
    //   327: aload_1
    //   328: if_acmpne -> 350
    //   331: aload_0
    //   332: getfield M : I
    //   335: istore #4
    //   337: iload #6
    //   339: istore_3
    //   340: iload #6
    //   342: iload #4
    //   344: if_icmpge -> 350
    //   347: iload #4
    //   349: istore_3
    //   350: aload_0
    //   351: iload_2
    //   352: putfield L : I
    //   355: aload_0
    //   356: iload_3
    //   357: putfield M : I
    //   360: aload_0
    //   361: getfield T : I
    //   364: istore_2
    //   365: iload_3
    //   366: iload_2
    //   367: if_icmpge -> 375
    //   370: aload_0
    //   371: iload_2
    //   372: putfield M : I
    //   375: aload_0
    //   376: getfield L : I
    //   379: istore_3
    //   380: aload_0
    //   381: getfield S : I
    //   384: istore_2
    //   385: iload_3
    //   386: iload_2
    //   387: if_icmpge -> 395
    //   390: aload_0
    //   391: iload_2
    //   392: putfield L : I
    //   395: return
  }
  
  public void b(b.g.b.d paramd) {
    // Byte code:
    //   0: getstatic b/g/b/i/d$a.c : Lb/g/b/i/d$a;
    //   3: astore #33
    //   5: getstatic b/g/b/i/d$a.d : Lb/g/b/i/d$a;
    //   8: astore #29
    //   10: aload_1
    //   11: aload_0
    //   12: getfield y : Lb/g/b/i/c;
    //   15: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   18: astore #28
    //   20: aload_1
    //   21: aload_0
    //   22: getfield A : Lb/g/b/i/c;
    //   25: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   28: astore #25
    //   30: aload_1
    //   31: aload_0
    //   32: getfield z : Lb/g/b/i/c;
    //   35: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   38: astore #26
    //   40: aload_1
    //   41: aload_0
    //   42: getfield B : Lb/g/b/i/c;
    //   45: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   48: astore #27
    //   50: aload_1
    //   51: aload_0
    //   52: getfield C : Lb/g/b/i/c;
    //   55: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   58: astore #32
    //   60: aload_0
    //   61: getfield d : Lb/g/b/i/l/j;
    //   64: astore #31
    //   66: aload #31
    //   68: getfield h : Lb/g/b/i/l/f;
    //   71: astore #30
    //   73: aload #30
    //   75: getfield j : Z
    //   78: ifeq -> 347
    //   81: aload #31
    //   83: getfield i : Lb/g/b/i/l/f;
    //   86: getfield j : Z
    //   89: ifeq -> 347
    //   92: aload_0
    //   93: getfield e : Lb/g/b/i/l/l;
    //   96: astore #31
    //   98: aload #31
    //   100: getfield h : Lb/g/b/i/l/f;
    //   103: getfield j : Z
    //   106: ifeq -> 347
    //   109: aload #31
    //   111: getfield i : Lb/g/b/i/l/f;
    //   114: getfield j : Z
    //   117: ifeq -> 347
    //   120: aload_1
    //   121: aload #28
    //   123: aload #30
    //   125: getfield g : I
    //   128: invokevirtual e : (Lb/g/b/g;I)V
    //   131: aload_1
    //   132: aload #25
    //   134: aload_0
    //   135: getfield d : Lb/g/b/i/l/j;
    //   138: getfield i : Lb/g/b/i/l/f;
    //   141: getfield g : I
    //   144: invokevirtual e : (Lb/g/b/g;I)V
    //   147: aload_1
    //   148: aload #26
    //   150: aload_0
    //   151: getfield e : Lb/g/b/i/l/l;
    //   154: getfield h : Lb/g/b/i/l/f;
    //   157: getfield g : I
    //   160: invokevirtual e : (Lb/g/b/g;I)V
    //   163: aload_1
    //   164: aload #27
    //   166: aload_0
    //   167: getfield e : Lb/g/b/i/l/l;
    //   170: getfield i : Lb/g/b/i/l/f;
    //   173: getfield g : I
    //   176: invokevirtual e : (Lb/g/b/g;I)V
    //   179: aload_1
    //   180: aload #32
    //   182: aload_0
    //   183: getfield e : Lb/g/b/i/l/l;
    //   186: getfield k : Lb/g/b/i/l/f;
    //   189: getfield g : I
    //   192: invokevirtual e : (Lb/g/b/g;I)V
    //   195: aload_0
    //   196: getfield K : Lb/g/b/i/d;
    //   199: astore #26
    //   201: aload #26
    //   203: ifnull -> 346
    //   206: aload #26
    //   208: ifnull -> 229
    //   211: aload #26
    //   213: getfield J : [Lb/g/b/i/d$a;
    //   216: iconst_0
    //   217: aaload
    //   218: aload #33
    //   220: if_acmpne -> 229
    //   223: iconst_1
    //   224: istore #9
    //   226: goto -> 232
    //   229: iconst_0
    //   230: istore #9
    //   232: aload_0
    //   233: getfield K : Lb/g/b/i/d;
    //   236: astore #26
    //   238: aload #26
    //   240: ifnull -> 261
    //   243: aload #26
    //   245: getfield J : [Lb/g/b/i/d$a;
    //   248: iconst_1
    //   249: aaload
    //   250: aload #33
    //   252: if_acmpne -> 261
    //   255: iconst_1
    //   256: istore #10
    //   258: goto -> 264
    //   261: iconst_0
    //   262: istore #10
    //   264: iload #9
    //   266: ifeq -> 305
    //   269: aload_0
    //   270: getfield f : [Z
    //   273: iconst_0
    //   274: baload
    //   275: ifeq -> 305
    //   278: aload_0
    //   279: invokevirtual s : ()Z
    //   282: ifne -> 305
    //   285: aload_1
    //   286: aload_1
    //   287: aload_0
    //   288: getfield K : Lb/g/b/i/d;
    //   291: getfield A : Lb/g/b/i/c;
    //   294: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   297: aload #25
    //   299: iconst_0
    //   300: bipush #8
    //   302: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   305: iload #10
    //   307: ifeq -> 346
    //   310: aload_0
    //   311: getfield f : [Z
    //   314: iconst_1
    //   315: baload
    //   316: ifeq -> 346
    //   319: aload_0
    //   320: invokevirtual t : ()Z
    //   323: ifne -> 346
    //   326: aload_1
    //   327: aload_1
    //   328: aload_0
    //   329: getfield K : Lb/g/b/i/d;
    //   332: getfield B : Lb/g/b/i/c;
    //   335: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   338: aload #27
    //   340: iconst_0
    //   341: bipush #8
    //   343: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   346: return
    //   347: aload_0
    //   348: getfield K : Lb/g/b/i/d;
    //   351: astore #30
    //   353: aload #30
    //   355: ifnull -> 626
    //   358: aload #30
    //   360: ifnull -> 381
    //   363: aload #30
    //   365: getfield J : [Lb/g/b/i/d$a;
    //   368: iconst_0
    //   369: aaload
    //   370: aload #33
    //   372: if_acmpne -> 381
    //   375: iconst_1
    //   376: istore #16
    //   378: goto -> 384
    //   381: iconst_0
    //   382: istore #16
    //   384: aload_0
    //   385: getfield K : Lb/g/b/i/d;
    //   388: astore #30
    //   390: aload #30
    //   392: ifnull -> 413
    //   395: aload #30
    //   397: getfield J : [Lb/g/b/i/d$a;
    //   400: iconst_1
    //   401: aaload
    //   402: aload #33
    //   404: if_acmpne -> 413
    //   407: iconst_1
    //   408: istore #17
    //   410: goto -> 416
    //   413: iconst_0
    //   414: istore #17
    //   416: aload_0
    //   417: iconst_0
    //   418: invokevirtual r : (I)Z
    //   421: ifeq -> 442
    //   424: aload_0
    //   425: getfield K : Lb/g/b/i/d;
    //   428: checkcast b/g/b/i/e
    //   431: aload_0
    //   432: iconst_0
    //   433: invokevirtual F : (Lb/g/b/i/d;I)V
    //   436: iconst_1
    //   437: istore #18
    //   439: goto -> 448
    //   442: aload_0
    //   443: invokevirtual s : ()Z
    //   446: istore #18
    //   448: aload_0
    //   449: iconst_1
    //   450: invokevirtual r : (I)Z
    //   453: ifeq -> 474
    //   456: aload_0
    //   457: getfield K : Lb/g/b/i/d;
    //   460: checkcast b/g/b/i/e
    //   463: aload_0
    //   464: iconst_1
    //   465: invokevirtual F : (Lb/g/b/i/d;I)V
    //   468: iconst_1
    //   469: istore #19
    //   471: goto -> 480
    //   474: aload_0
    //   475: invokevirtual t : ()Z
    //   478: istore #19
    //   480: iload #18
    //   482: ifne -> 538
    //   485: iload #16
    //   487: ifeq -> 538
    //   490: aload_0
    //   491: getfield X : I
    //   494: bipush #8
    //   496: if_icmpeq -> 538
    //   499: aload_0
    //   500: getfield y : Lb/g/b/i/c;
    //   503: getfield d : Lb/g/b/i/c;
    //   506: ifnonnull -> 538
    //   509: aload_0
    //   510: getfield A : Lb/g/b/i/c;
    //   513: getfield d : Lb/g/b/i/c;
    //   516: ifnonnull -> 538
    //   519: aload_1
    //   520: aload_1
    //   521: aload_0
    //   522: getfield K : Lb/g/b/i/d;
    //   525: getfield A : Lb/g/b/i/c;
    //   528: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   531: aload #25
    //   533: iconst_0
    //   534: iconst_1
    //   535: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   538: iload #19
    //   540: ifne -> 603
    //   543: iload #17
    //   545: ifeq -> 603
    //   548: aload_0
    //   549: getfield X : I
    //   552: bipush #8
    //   554: if_icmpeq -> 603
    //   557: aload_0
    //   558: getfield z : Lb/g/b/i/c;
    //   561: getfield d : Lb/g/b/i/c;
    //   564: ifnonnull -> 603
    //   567: aload_0
    //   568: getfield B : Lb/g/b/i/c;
    //   571: getfield d : Lb/g/b/i/c;
    //   574: ifnonnull -> 603
    //   577: aload_0
    //   578: getfield C : Lb/g/b/i/c;
    //   581: ifnonnull -> 603
    //   584: aload_1
    //   585: aload_1
    //   586: aload_0
    //   587: getfield K : Lb/g/b/i/d;
    //   590: getfield B : Lb/g/b/i/c;
    //   593: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   596: aload #27
    //   598: iconst_0
    //   599: iconst_1
    //   600: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   603: iload #18
    //   605: istore #20
    //   607: iload #19
    //   609: istore #18
    //   611: iload #17
    //   613: istore #19
    //   615: iload #16
    //   617: istore #17
    //   619: iload #20
    //   621: istore #16
    //   623: goto -> 638
    //   626: iconst_0
    //   627: istore #19
    //   629: iconst_0
    //   630: istore #17
    //   632: iconst_0
    //   633: istore #18
    //   635: iconst_0
    //   636: istore #16
    //   638: aload_0
    //   639: getfield L : I
    //   642: istore #10
    //   644: aload_0
    //   645: getfield S : I
    //   648: istore #11
    //   650: iload #10
    //   652: istore #9
    //   654: iload #10
    //   656: iload #11
    //   658: if_icmpge -> 665
    //   661: iload #11
    //   663: istore #9
    //   665: aload_0
    //   666: getfield M : I
    //   669: istore #11
    //   671: aload_0
    //   672: getfield T : I
    //   675: istore #12
    //   677: iload #11
    //   679: istore #10
    //   681: iload #11
    //   683: iload #12
    //   685: if_icmpge -> 692
    //   688: iload #12
    //   690: istore #10
    //   692: aload_0
    //   693: getfield J : [Lb/g/b/i/d$a;
    //   696: iconst_0
    //   697: aaload
    //   698: aload #29
    //   700: if_acmpeq -> 709
    //   703: iconst_1
    //   704: istore #13
    //   706: goto -> 712
    //   709: iconst_0
    //   710: istore #13
    //   712: aload_0
    //   713: getfield J : [Lb/g/b/i/d$a;
    //   716: iconst_1
    //   717: aaload
    //   718: aload #29
    //   720: if_acmpeq -> 729
    //   723: iconst_1
    //   724: istore #15
    //   726: goto -> 732
    //   729: iconst_0
    //   730: istore #15
    //   732: aload_0
    //   733: aload_0
    //   734: getfield O : I
    //   737: putfield s : I
    //   740: aload_0
    //   741: getfield N : F
    //   744: fstore #8
    //   746: aload_0
    //   747: fload #8
    //   749: putfield t : F
    //   752: aload_0
    //   753: getfield j : I
    //   756: istore #12
    //   758: aload_0
    //   759: getfield k : I
    //   762: istore #14
    //   764: fload #8
    //   766: fconst_0
    //   767: fcmpl
    //   768: ifle -> 1377
    //   771: aload_0
    //   772: getfield X : I
    //   775: bipush #8
    //   777: if_icmpeq -> 1377
    //   780: iload #12
    //   782: istore #11
    //   784: aload_0
    //   785: getfield J : [Lb/g/b/i/d$a;
    //   788: iconst_0
    //   789: aaload
    //   790: aload #29
    //   792: if_acmpne -> 807
    //   795: iload #12
    //   797: istore #11
    //   799: iload #12
    //   801: ifne -> 807
    //   804: iconst_3
    //   805: istore #11
    //   807: iload #14
    //   809: istore #12
    //   811: aload_0
    //   812: getfield J : [Lb/g/b/i/d$a;
    //   815: iconst_1
    //   816: aaload
    //   817: aload #29
    //   819: if_acmpne -> 834
    //   822: iload #14
    //   824: istore #12
    //   826: iload #14
    //   828: ifne -> 834
    //   831: iconst_3
    //   832: istore #12
    //   834: aload_0
    //   835: getfield J : [Lb/g/b/i/d$a;
    //   838: astore #30
    //   840: aload #30
    //   842: iconst_0
    //   843: aaload
    //   844: aload #29
    //   846: if_acmpne -> 1182
    //   849: aload #30
    //   851: iconst_1
    //   852: aaload
    //   853: aload #29
    //   855: if_acmpne -> 1182
    //   858: iload #11
    //   860: iconst_3
    //   861: if_icmpne -> 1182
    //   864: iload #12
    //   866: iconst_3
    //   867: if_icmpne -> 1182
    //   870: aload_0
    //   871: getfield s : I
    //   874: iconst_m1
    //   875: if_icmpne -> 929
    //   878: iload #13
    //   880: ifeq -> 896
    //   883: iload #15
    //   885: ifne -> 896
    //   888: aload_0
    //   889: iconst_0
    //   890: putfield s : I
    //   893: goto -> 929
    //   896: iload #13
    //   898: ifne -> 929
    //   901: iload #15
    //   903: ifeq -> 929
    //   906: aload_0
    //   907: iconst_1
    //   908: putfield s : I
    //   911: aload_0
    //   912: getfield O : I
    //   915: iconst_m1
    //   916: if_icmpne -> 929
    //   919: aload_0
    //   920: fconst_1
    //   921: aload_0
    //   922: getfield t : F
    //   925: fdiv
    //   926: putfield t : F
    //   929: aload_0
    //   930: getfield s : I
    //   933: ifne -> 968
    //   936: aload_0
    //   937: getfield z : Lb/g/b/i/c;
    //   940: invokevirtual d : ()Z
    //   943: ifeq -> 956
    //   946: aload_0
    //   947: getfield B : Lb/g/b/i/c;
    //   950: invokevirtual d : ()Z
    //   953: ifne -> 968
    //   956: iconst_1
    //   957: istore #13
    //   959: aload_0
    //   960: iload #13
    //   962: putfield s : I
    //   965: goto -> 1002
    //   968: aload_0
    //   969: getfield s : I
    //   972: iconst_1
    //   973: if_icmpne -> 1002
    //   976: aload_0
    //   977: getfield y : Lb/g/b/i/c;
    //   980: invokevirtual d : ()Z
    //   983: ifeq -> 996
    //   986: aload_0
    //   987: getfield A : Lb/g/b/i/c;
    //   990: invokevirtual d : ()Z
    //   993: ifne -> 1002
    //   996: iconst_0
    //   997: istore #13
    //   999: goto -> 959
    //   1002: aload_0
    //   1003: getfield s : I
    //   1006: iconst_m1
    //   1007: if_icmpne -> 1118
    //   1010: aload_0
    //   1011: getfield z : Lb/g/b/i/c;
    //   1014: invokevirtual d : ()Z
    //   1017: ifeq -> 1050
    //   1020: aload_0
    //   1021: getfield B : Lb/g/b/i/c;
    //   1024: invokevirtual d : ()Z
    //   1027: ifeq -> 1050
    //   1030: aload_0
    //   1031: getfield y : Lb/g/b/i/c;
    //   1034: invokevirtual d : ()Z
    //   1037: ifeq -> 1050
    //   1040: aload_0
    //   1041: getfield A : Lb/g/b/i/c;
    //   1044: invokevirtual d : ()Z
    //   1047: ifne -> 1118
    //   1050: aload_0
    //   1051: getfield z : Lb/g/b/i/c;
    //   1054: invokevirtual d : ()Z
    //   1057: ifeq -> 1082
    //   1060: aload_0
    //   1061: getfield B : Lb/g/b/i/c;
    //   1064: invokevirtual d : ()Z
    //   1067: ifeq -> 1082
    //   1070: iconst_0
    //   1071: istore #13
    //   1073: aload_0
    //   1074: iload #13
    //   1076: putfield s : I
    //   1079: goto -> 1118
    //   1082: aload_0
    //   1083: getfield y : Lb/g/b/i/c;
    //   1086: invokevirtual d : ()Z
    //   1089: ifeq -> 1118
    //   1092: aload_0
    //   1093: getfield A : Lb/g/b/i/c;
    //   1096: invokevirtual d : ()Z
    //   1099: ifeq -> 1118
    //   1102: aload_0
    //   1103: fconst_1
    //   1104: aload_0
    //   1105: getfield t : F
    //   1108: fdiv
    //   1109: putfield t : F
    //   1112: iconst_1
    //   1113: istore #13
    //   1115: goto -> 1073
    //   1118: aload_0
    //   1119: getfield s : I
    //   1122: iconst_m1
    //   1123: if_icmpne -> 1355
    //   1126: aload_0
    //   1127: getfield m : I
    //   1130: ifle -> 1152
    //   1133: aload_0
    //   1134: getfield p : I
    //   1137: ifne -> 1152
    //   1140: iconst_0
    //   1141: istore #13
    //   1143: aload_0
    //   1144: iload #13
    //   1146: putfield s : I
    //   1149: goto -> 1355
    //   1152: aload_0
    //   1153: getfield m : I
    //   1156: ifne -> 1355
    //   1159: aload_0
    //   1160: getfield p : I
    //   1163: ifle -> 1355
    //   1166: aload_0
    //   1167: fconst_1
    //   1168: aload_0
    //   1169: getfield t : F
    //   1172: fdiv
    //   1173: putfield t : F
    //   1176: iconst_1
    //   1177: istore #13
    //   1179: goto -> 1143
    //   1182: aload_0
    //   1183: getfield J : [Lb/g/b/i/d$a;
    //   1186: astore #30
    //   1188: aload #30
    //   1190: iconst_0
    //   1191: aaload
    //   1192: aload #29
    //   1194: if_acmpne -> 1258
    //   1197: iload #11
    //   1199: iconst_3
    //   1200: if_icmpne -> 1258
    //   1203: aload_0
    //   1204: iconst_0
    //   1205: putfield s : I
    //   1208: aload_0
    //   1209: getfield t : F
    //   1212: aload_0
    //   1213: getfield M : I
    //   1216: i2f
    //   1217: fmul
    //   1218: f2i
    //   1219: istore #13
    //   1221: aload #30
    //   1223: iconst_1
    //   1224: aaload
    //   1225: astore #30
    //   1227: iload #10
    //   1229: istore #9
    //   1231: aload #30
    //   1233: aload #29
    //   1235: if_acmpeq -> 1251
    //   1238: iload #13
    //   1240: istore #10
    //   1242: iconst_0
    //   1243: istore #11
    //   1245: iconst_4
    //   1246: istore #13
    //   1248: goto -> 1408
    //   1251: iload #13
    //   1253: istore #10
    //   1255: goto -> 1367
    //   1258: aload_0
    //   1259: getfield J : [Lb/g/b/i/d$a;
    //   1262: iconst_1
    //   1263: aaload
    //   1264: aload #29
    //   1266: if_acmpne -> 1355
    //   1269: iload #12
    //   1271: iconst_3
    //   1272: if_icmpne -> 1355
    //   1275: aload_0
    //   1276: iconst_1
    //   1277: putfield s : I
    //   1280: aload_0
    //   1281: getfield O : I
    //   1284: iconst_m1
    //   1285: if_icmpne -> 1298
    //   1288: aload_0
    //   1289: fconst_1
    //   1290: aload_0
    //   1291: getfield t : F
    //   1294: fdiv
    //   1295: putfield t : F
    //   1298: aload_0
    //   1299: getfield t : F
    //   1302: aload_0
    //   1303: getfield L : I
    //   1306: i2f
    //   1307: fmul
    //   1308: f2i
    //   1309: istore #13
    //   1311: iload #13
    //   1313: istore #10
    //   1315: aload_0
    //   1316: getfield J : [Lb/g/b/i/d$a;
    //   1319: iconst_0
    //   1320: aaload
    //   1321: aload #29
    //   1323: if_acmpeq -> 1355
    //   1326: iload #13
    //   1328: istore #12
    //   1330: iload #11
    //   1332: istore #13
    //   1334: iconst_0
    //   1335: istore #11
    //   1337: iconst_4
    //   1338: istore #14
    //   1340: iload #9
    //   1342: istore #10
    //   1344: iload #12
    //   1346: istore #9
    //   1348: iload #14
    //   1350: istore #12
    //   1352: goto -> 1408
    //   1355: iload #10
    //   1357: istore #13
    //   1359: iload #9
    //   1361: istore #10
    //   1363: iload #13
    //   1365: istore #9
    //   1367: iload #11
    //   1369: istore #13
    //   1371: iconst_1
    //   1372: istore #11
    //   1374: goto -> 1408
    //   1377: iload #14
    //   1379: istore #11
    //   1381: iload #9
    //   1383: istore #14
    //   1385: iconst_0
    //   1386: istore #9
    //   1388: iload #12
    //   1390: istore #13
    //   1392: iload #11
    //   1394: istore #12
    //   1396: iload #9
    //   1398: istore #11
    //   1400: iload #10
    //   1402: istore #9
    //   1404: iload #14
    //   1406: istore #10
    //   1408: aload_0
    //   1409: getfield l : [I
    //   1412: astore #29
    //   1414: aload #29
    //   1416: iconst_0
    //   1417: iload #13
    //   1419: iastore
    //   1420: aload #29
    //   1422: iconst_1
    //   1423: iload #12
    //   1425: iastore
    //   1426: iload #11
    //   1428: ifeq -> 1454
    //   1431: aload_0
    //   1432: getfield s : I
    //   1435: istore #14
    //   1437: iload #14
    //   1439: ifeq -> 1448
    //   1442: iload #14
    //   1444: iconst_m1
    //   1445: if_icmpne -> 1454
    //   1448: iconst_1
    //   1449: istore #20
    //   1451: goto -> 1457
    //   1454: iconst_0
    //   1455: istore #20
    //   1457: aload_0
    //   1458: getfield J : [Lb/g/b/i/d$a;
    //   1461: iconst_0
    //   1462: aaload
    //   1463: aload #33
    //   1465: if_acmpne -> 1481
    //   1468: aload_0
    //   1469: instanceof b/g/b/i/e
    //   1472: ifeq -> 1481
    //   1475: iconst_1
    //   1476: istore #21
    //   1478: goto -> 1484
    //   1481: iconst_0
    //   1482: istore #21
    //   1484: iload #21
    //   1486: ifeq -> 1495
    //   1489: iconst_0
    //   1490: istore #10
    //   1492: goto -> 1495
    //   1495: aload_0
    //   1496: getfield F : Lb/g/b/i/c;
    //   1499: invokevirtual d : ()Z
    //   1502: iconst_1
    //   1503: ixor
    //   1504: istore #22
    //   1506: aload_0
    //   1507: getfield I : [Z
    //   1510: astore #29
    //   1512: aload #29
    //   1514: iconst_0
    //   1515: baload
    //   1516: istore #24
    //   1518: aload #29
    //   1520: iconst_1
    //   1521: baload
    //   1522: istore #23
    //   1524: aload_0
    //   1525: getfield h : I
    //   1528: istore #14
    //   1530: aconst_null
    //   1531: astore #31
    //   1533: iload #14
    //   1535: iconst_2
    //   1536: if_icmpeq -> 1793
    //   1539: aload_0
    //   1540: getfield d : Lb/g/b/i/l/j;
    //   1543: astore #29
    //   1545: aload #29
    //   1547: getfield h : Lb/g/b/i/l/f;
    //   1550: astore #30
    //   1552: aload #30
    //   1554: getfield j : Z
    //   1557: ifeq -> 1652
    //   1560: aload #29
    //   1562: getfield i : Lb/g/b/i/l/f;
    //   1565: getfield j : Z
    //   1568: ifne -> 1574
    //   1571: goto -> 1652
    //   1574: aload_1
    //   1575: aload #28
    //   1577: aload #30
    //   1579: getfield g : I
    //   1582: invokevirtual e : (Lb/g/b/g;I)V
    //   1585: aload_1
    //   1586: aload #25
    //   1588: aload_0
    //   1589: getfield d : Lb/g/b/i/l/j;
    //   1592: getfield i : Lb/g/b/i/l/f;
    //   1595: getfield g : I
    //   1598: invokevirtual e : (Lb/g/b/g;I)V
    //   1601: aload_0
    //   1602: getfield K : Lb/g/b/i/d;
    //   1605: ifnull -> 1649
    //   1608: iload #17
    //   1610: ifeq -> 1649
    //   1613: aload_0
    //   1614: getfield f : [Z
    //   1617: iconst_0
    //   1618: baload
    //   1619: ifeq -> 1649
    //   1622: aload_0
    //   1623: invokevirtual s : ()Z
    //   1626: ifne -> 1649
    //   1629: aload_1
    //   1630: aload_1
    //   1631: aload_0
    //   1632: getfield K : Lb/g/b/i/d;
    //   1635: getfield A : Lb/g/b/i/c;
    //   1638: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   1641: aload #25
    //   1643: iconst_0
    //   1644: bipush #8
    //   1646: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   1649: goto -> 1793
    //   1652: aload_0
    //   1653: getfield K : Lb/g/b/i/d;
    //   1656: astore #29
    //   1658: aload #29
    //   1660: ifnull -> 1677
    //   1663: aload_1
    //   1664: aload #29
    //   1666: getfield A : Lb/g/b/i/c;
    //   1669: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   1672: astore #29
    //   1674: goto -> 1680
    //   1677: aconst_null
    //   1678: astore #29
    //   1680: aload_0
    //   1681: getfield K : Lb/g/b/i/d;
    //   1684: astore #30
    //   1686: aload #30
    //   1688: ifnull -> 1705
    //   1691: aload_1
    //   1692: aload #30
    //   1694: getfield y : Lb/g/b/i/c;
    //   1697: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   1700: astore #30
    //   1702: goto -> 1708
    //   1705: aconst_null
    //   1706: astore #30
    //   1708: aload_0
    //   1709: aload_1
    //   1710: iconst_1
    //   1711: iload #17
    //   1713: iload #19
    //   1715: aload_0
    //   1716: getfield f : [Z
    //   1719: iconst_0
    //   1720: baload
    //   1721: aload #30
    //   1723: aload #29
    //   1725: aload_0
    //   1726: getfield J : [Lb/g/b/i/d$a;
    //   1729: iconst_0
    //   1730: aaload
    //   1731: iload #21
    //   1733: aload_0
    //   1734: getfield y : Lb/g/b/i/c;
    //   1737: aload_0
    //   1738: getfield A : Lb/g/b/i/c;
    //   1741: aload_0
    //   1742: getfield P : I
    //   1745: iload #10
    //   1747: aload_0
    //   1748: getfield S : I
    //   1751: aload_0
    //   1752: getfield u : [I
    //   1755: iconst_0
    //   1756: iaload
    //   1757: aload_0
    //   1758: getfield U : F
    //   1761: iload #20
    //   1763: iload #16
    //   1765: iload #18
    //   1767: iload #24
    //   1769: iload #13
    //   1771: iload #12
    //   1773: aload_0
    //   1774: getfield m : I
    //   1777: aload_0
    //   1778: getfield n : I
    //   1781: aload_0
    //   1782: getfield o : F
    //   1785: iload #22
    //   1787: invokevirtual d : (Lb/g/b/d;ZZZZLb/g/b/g;Lb/g/b/g;Lb/g/b/i/d$a;ZLb/g/b/i/c;Lb/g/b/i/c;IIIIFZZZZIIIIFZ)V
    //   1790: goto -> 1793
    //   1793: aload_0
    //   1794: getfield e : Lb/g/b/i/l/l;
    //   1797: astore #30
    //   1799: aload #30
    //   1801: getfield h : Lb/g/b/i/l/f;
    //   1804: astore #29
    //   1806: aload #29
    //   1808: getfield j : Z
    //   1811: ifeq -> 1936
    //   1814: aload #30
    //   1816: getfield i : Lb/g/b/i/l/f;
    //   1819: getfield j : Z
    //   1822: ifeq -> 1936
    //   1825: aload #29
    //   1827: getfield g : I
    //   1830: istore #10
    //   1832: aload_1
    //   1833: aload #26
    //   1835: iload #10
    //   1837: invokevirtual e : (Lb/g/b/g;I)V
    //   1840: aload_0
    //   1841: getfield e : Lb/g/b/i/l/l;
    //   1844: getfield i : Lb/g/b/i/l/f;
    //   1847: getfield g : I
    //   1850: istore #10
    //   1852: aload_1
    //   1853: aload #27
    //   1855: iload #10
    //   1857: invokevirtual e : (Lb/g/b/g;I)V
    //   1860: aload_1
    //   1861: aload #32
    //   1863: aload_0
    //   1864: getfield e : Lb/g/b/i/l/l;
    //   1867: getfield k : Lb/g/b/i/l/f;
    //   1870: getfield g : I
    //   1873: invokevirtual e : (Lb/g/b/g;I)V
    //   1876: aload_0
    //   1877: getfield K : Lb/g/b/i/d;
    //   1880: astore #29
    //   1882: aload #29
    //   1884: ifnull -> 1930
    //   1887: iload #18
    //   1889: ifne -> 1930
    //   1892: iload #19
    //   1894: ifeq -> 1930
    //   1897: aload_0
    //   1898: getfield f : [Z
    //   1901: iconst_1
    //   1902: baload
    //   1903: ifeq -> 1927
    //   1906: aload_1
    //   1907: aload_1
    //   1908: aload #29
    //   1910: getfield B : Lb/g/b/i/c;
    //   1913: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   1916: aload #27
    //   1918: iconst_0
    //   1919: bipush #8
    //   1921: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   1924: goto -> 1930
    //   1927: goto -> 1930
    //   1930: iconst_0
    //   1931: istore #10
    //   1933: goto -> 1939
    //   1936: iconst_1
    //   1937: istore #10
    //   1939: aload_0
    //   1940: getfield i : I
    //   1943: iconst_2
    //   1944: if_icmpne -> 1953
    //   1947: iconst_0
    //   1948: istore #10
    //   1950: goto -> 1953
    //   1953: iload #10
    //   1955: ifeq -> 2273
    //   1958: aload_0
    //   1959: getfield J : [Lb/g/b/i/d$a;
    //   1962: iconst_1
    //   1963: aaload
    //   1964: aload #33
    //   1966: if_acmpne -> 1982
    //   1969: aload_0
    //   1970: instanceof b/g/b/i/e
    //   1973: ifeq -> 1982
    //   1976: iconst_1
    //   1977: istore #20
    //   1979: goto -> 1985
    //   1982: iconst_0
    //   1983: istore #20
    //   1985: iload #20
    //   1987: ifeq -> 1993
    //   1990: iconst_0
    //   1991: istore #9
    //   1993: iload #11
    //   1995: ifeq -> 2022
    //   1998: aload_0
    //   1999: getfield s : I
    //   2002: istore #10
    //   2004: iload #10
    //   2006: iconst_1
    //   2007: if_icmpeq -> 2016
    //   2010: iload #10
    //   2012: iconst_m1
    //   2013: if_icmpne -> 2022
    //   2016: iconst_1
    //   2017: istore #21
    //   2019: goto -> 2025
    //   2022: iconst_0
    //   2023: istore #21
    //   2025: aload_0
    //   2026: getfield K : Lb/g/b/i/d;
    //   2029: astore #29
    //   2031: aload #29
    //   2033: ifnull -> 2050
    //   2036: aload_1
    //   2037: aload #29
    //   2039: getfield B : Lb/g/b/i/c;
    //   2042: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   2045: astore #29
    //   2047: goto -> 2053
    //   2050: aconst_null
    //   2051: astore #29
    //   2053: aload_0
    //   2054: getfield K : Lb/g/b/i/d;
    //   2057: astore #33
    //   2059: aload #31
    //   2061: astore #30
    //   2063: aload #33
    //   2065: ifnull -> 2079
    //   2068: aload_1
    //   2069: aload #33
    //   2071: getfield z : Lb/g/b/i/c;
    //   2074: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   2077: astore #30
    //   2079: aload_0
    //   2080: getfield R : I
    //   2083: ifgt -> 2095
    //   2086: aload_0
    //   2087: getfield X : I
    //   2090: bipush #8
    //   2092: if_icmpne -> 2188
    //   2095: aload_1
    //   2096: aload #32
    //   2098: aload #26
    //   2100: aload_0
    //   2101: getfield R : I
    //   2104: bipush #8
    //   2106: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   2109: pop
    //   2110: aload_0
    //   2111: getfield C : Lb/g/b/i/c;
    //   2114: getfield d : Lb/g/b/i/c;
    //   2117: astore #31
    //   2119: aload #31
    //   2121: ifnull -> 2167
    //   2124: aload_1
    //   2125: aload #32
    //   2127: aload_1
    //   2128: aload #31
    //   2130: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   2133: iconst_0
    //   2134: bipush #8
    //   2136: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   2139: pop
    //   2140: iload #19
    //   2142: ifeq -> 2161
    //   2145: aload_1
    //   2146: aload #29
    //   2148: aload_1
    //   2149: aload_0
    //   2150: getfield B : Lb/g/b/i/c;
    //   2153: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   2156: iconst_0
    //   2157: iconst_5
    //   2158: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   2161: iconst_0
    //   2162: istore #22
    //   2164: goto -> 2188
    //   2167: aload_0
    //   2168: getfield X : I
    //   2171: bipush #8
    //   2173: if_icmpne -> 2188
    //   2176: aload_1
    //   2177: aload #32
    //   2179: aload #26
    //   2181: iconst_0
    //   2182: bipush #8
    //   2184: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   2187: pop
    //   2188: aload_0
    //   2189: aload_1
    //   2190: iconst_0
    //   2191: iload #19
    //   2193: iload #17
    //   2195: aload_0
    //   2196: getfield f : [Z
    //   2199: iconst_1
    //   2200: baload
    //   2201: aload #30
    //   2203: aload #29
    //   2205: aload_0
    //   2206: getfield J : [Lb/g/b/i/d$a;
    //   2209: iconst_1
    //   2210: aaload
    //   2211: iload #20
    //   2213: aload_0
    //   2214: getfield z : Lb/g/b/i/c;
    //   2217: aload_0
    //   2218: getfield B : Lb/g/b/i/c;
    //   2221: aload_0
    //   2222: getfield Q : I
    //   2225: iload #9
    //   2227: aload_0
    //   2228: getfield T : I
    //   2231: aload_0
    //   2232: getfield u : [I
    //   2235: iconst_1
    //   2236: iaload
    //   2237: aload_0
    //   2238: getfield V : F
    //   2241: iload #21
    //   2243: iload #18
    //   2245: iload #16
    //   2247: iload #23
    //   2249: iload #12
    //   2251: iload #13
    //   2253: aload_0
    //   2254: getfield p : I
    //   2257: aload_0
    //   2258: getfield q : I
    //   2261: aload_0
    //   2262: getfield r : F
    //   2265: iload #22
    //   2267: invokevirtual d : (Lb/g/b/d;ZZZZLb/g/b/g;Lb/g/b/g;Lb/g/b/i/d$a;ZLb/g/b/i/c;Lb/g/b/i/c;IIIIFZZZZIIIIFZ)V
    //   2270: goto -> 2273
    //   2273: iload #11
    //   2275: ifeq -> 2342
    //   2278: aload_0
    //   2279: getfield s : I
    //   2282: istore #9
    //   2284: aload_0
    //   2285: getfield t : F
    //   2288: fstore #8
    //   2290: iload #9
    //   2292: iconst_1
    //   2293: if_icmpne -> 2315
    //   2296: aload #27
    //   2298: astore #29
    //   2300: aload #26
    //   2302: astore #30
    //   2304: aload #25
    //   2306: astore #27
    //   2308: aload #28
    //   2310: astore #26
    //   2312: goto -> 2323
    //   2315: aload #28
    //   2317: astore #30
    //   2319: aload #25
    //   2321: astore #29
    //   2323: aload_1
    //   2324: aload #29
    //   2326: aload #30
    //   2328: aload #27
    //   2330: aload #26
    //   2332: fload #8
    //   2334: bipush #8
    //   2336: invokevirtual h : (Lb/g/b/g;Lb/g/b/g;Lb/g/b/g;Lb/g/b/g;FI)V
    //   2339: goto -> 2342
    //   2342: aload_0
    //   2343: getfield F : Lb/g/b/i/c;
    //   2346: invokevirtual d : ()Z
    //   2349: ifeq -> 2589
    //   2352: aload_0
    //   2353: getfield F : Lb/g/b/i/c;
    //   2356: getfield d : Lb/g/b/i/c;
    //   2359: getfield b : Lb/g/b/i/d;
    //   2362: astore #33
    //   2364: aload_0
    //   2365: getfield v : F
    //   2368: ldc_w 90.0
    //   2371: fadd
    //   2372: f2d
    //   2373: invokestatic toRadians : (D)D
    //   2376: d2f
    //   2377: fstore #8
    //   2379: aload_0
    //   2380: getfield F : Lb/g/b/i/c;
    //   2383: invokevirtual b : ()I
    //   2386: istore #9
    //   2388: getstatic b/g/b/i/c$a.f : Lb/g/b/i/c$a;
    //   2391: astore #30
    //   2393: getstatic b/g/b/i/c$a.e : Lb/g/b/i/c$a;
    //   2396: astore #32
    //   2398: getstatic b/g/b/i/c$a.d : Lb/g/b/i/c$a;
    //   2401: astore #31
    //   2403: getstatic b/g/b/i/c$a.c : Lb/g/b/i/c$a;
    //   2406: astore #27
    //   2408: aload_1
    //   2409: aload_0
    //   2410: aload #27
    //   2412: invokevirtual f : (Lb/g/b/i/c$a;)Lb/g/b/i/c;
    //   2415: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   2418: astore #26
    //   2420: aload_1
    //   2421: aload_0
    //   2422: aload #31
    //   2424: invokevirtual f : (Lb/g/b/i/c$a;)Lb/g/b/i/c;
    //   2427: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   2430: astore #29
    //   2432: aload_1
    //   2433: aload_0
    //   2434: aload #32
    //   2436: invokevirtual f : (Lb/g/b/i/c$a;)Lb/g/b/i/c;
    //   2439: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   2442: astore #25
    //   2444: aload_1
    //   2445: aload_0
    //   2446: aload #30
    //   2448: invokevirtual f : (Lb/g/b/i/c$a;)Lb/g/b/i/c;
    //   2451: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   2454: astore #28
    //   2456: aload_1
    //   2457: aload #33
    //   2459: aload #27
    //   2461: invokevirtual f : (Lb/g/b/i/c$a;)Lb/g/b/i/c;
    //   2464: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   2467: astore #27
    //   2469: aload_1
    //   2470: aload #33
    //   2472: aload #31
    //   2474: invokevirtual f : (Lb/g/b/i/c$a;)Lb/g/b/i/c;
    //   2477: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   2480: astore #31
    //   2482: aload_1
    //   2483: aload #33
    //   2485: aload #32
    //   2487: invokevirtual f : (Lb/g/b/i/c$a;)Lb/g/b/i/c;
    //   2490: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   2493: astore #32
    //   2495: aload_1
    //   2496: aload #33
    //   2498: aload #30
    //   2500: invokevirtual f : (Lb/g/b/i/c$a;)Lb/g/b/i/c;
    //   2503: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   2506: astore #33
    //   2508: aload_1
    //   2509: invokevirtual m : ()Lb/g/b/b;
    //   2512: astore #30
    //   2514: fload #8
    //   2516: f2d
    //   2517: dstore_2
    //   2518: dload_2
    //   2519: invokestatic sin : (D)D
    //   2522: dstore #6
    //   2524: iload #9
    //   2526: i2d
    //   2527: dstore #4
    //   2529: aload #30
    //   2531: aload #29
    //   2533: aload #28
    //   2535: aload #31
    //   2537: aload #33
    //   2539: dload #6
    //   2541: dload #4
    //   2543: dmul
    //   2544: d2f
    //   2545: invokevirtual g : (Lb/g/b/g;Lb/g/b/g;Lb/g/b/g;Lb/g/b/g;F)Lb/g/b/b;
    //   2548: pop
    //   2549: aload_1
    //   2550: aload #30
    //   2552: invokevirtual c : (Lb/g/b/b;)V
    //   2555: aload_1
    //   2556: invokevirtual m : ()Lb/g/b/b;
    //   2559: astore #28
    //   2561: aload #28
    //   2563: aload #26
    //   2565: aload #25
    //   2567: aload #27
    //   2569: aload #32
    //   2571: dload_2
    //   2572: invokestatic cos : (D)D
    //   2575: dload #4
    //   2577: dmul
    //   2578: d2f
    //   2579: invokevirtual g : (Lb/g/b/g;Lb/g/b/g;Lb/g/b/g;Lb/g/b/g;F)Lb/g/b/b;
    //   2582: pop
    //   2583: aload_1
    //   2584: aload #28
    //   2586: invokevirtual c : (Lb/g/b/b;)V
    //   2589: return
  }
  
  public boolean c() {
    boolean bool;
    if (this.X != 8) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final void d(b.g.b.d paramd, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, g paramg1, g paramg2, a parama, boolean paramBoolean5, c paramc1, c paramc2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, int paramInt5, int paramInt6, int paramInt7, int paramInt8, float paramFloat2, boolean paramBoolean10) {
    // Byte code:
    //   0: getstatic b/g/b/i/c$a.f : Lb/g/b/i/c$a;
    //   3: astore #35
    //   5: getstatic b/g/b/i/c$a.d : Lb/g/b/i/c$a;
    //   8: astore #39
    //   10: aload_1
    //   11: aload #10
    //   13: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   16: astore #38
    //   18: aload_1
    //   19: aload #11
    //   21: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   24: astore #34
    //   26: aload_1
    //   27: aload #10
    //   29: getfield d : Lb/g/b/i/c;
    //   32: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   35: astore #37
    //   37: aload_1
    //   38: aload #11
    //   40: getfield d : Lb/g/b/i/c;
    //   43: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   46: astore #36
    //   48: aload #10
    //   50: invokevirtual d : ()Z
    //   53: istore #31
    //   55: aload #11
    //   57: invokevirtual d : ()Z
    //   60: istore #32
    //   62: aload_0
    //   63: getfield F : Lb/g/b/i/c;
    //   66: invokevirtual d : ()Z
    //   69: istore #33
    //   71: iload #32
    //   73: ifeq -> 85
    //   76: iload #31
    //   78: iconst_1
    //   79: iadd
    //   80: istore #27
    //   82: goto -> 89
    //   85: iload #31
    //   87: istore #27
    //   89: iload #27
    //   91: istore #30
    //   93: iload #33
    //   95: ifeq -> 104
    //   98: iload #27
    //   100: iconst_1
    //   101: iadd
    //   102: istore #30
    //   104: iload #17
    //   106: ifeq -> 115
    //   109: iconst_3
    //   110: istore #28
    //   112: goto -> 119
    //   115: iload #21
    //   117: istore #28
    //   119: aload #8
    //   121: invokevirtual ordinal : ()I
    //   124: istore #21
    //   126: iload #21
    //   128: ifeq -> 161
    //   131: iload #21
    //   133: iconst_1
    //   134: if_icmpeq -> 161
    //   137: iload #21
    //   139: iconst_2
    //   140: if_icmpeq -> 146
    //   143: goto -> 161
    //   146: iload #28
    //   148: iconst_4
    //   149: if_icmpne -> 155
    //   152: goto -> 161
    //   155: iconst_1
    //   156: istore #21
    //   158: goto -> 164
    //   161: iconst_0
    //   162: istore #21
    //   164: aload_0
    //   165: getfield X : I
    //   168: istore #27
    //   170: iload #27
    //   172: bipush #8
    //   174: if_icmpne -> 186
    //   177: iconst_0
    //   178: istore #21
    //   180: iconst_0
    //   181: istore #27
    //   183: goto -> 194
    //   186: iload #21
    //   188: istore #27
    //   190: iload #13
    //   192: istore #21
    //   194: iload #26
    //   196: ifeq -> 254
    //   199: iload #31
    //   201: ifne -> 225
    //   204: iload #32
    //   206: ifne -> 225
    //   209: iload #33
    //   211: ifne -> 225
    //   214: aload_1
    //   215: aload #38
    //   217: iload #12
    //   219: invokevirtual e : (Lb/g/b/g;I)V
    //   222: goto -> 254
    //   225: iload #31
    //   227: ifeq -> 254
    //   230: iload #32
    //   232: ifne -> 254
    //   235: aload_1
    //   236: aload #38
    //   238: aload #37
    //   240: aload #10
    //   242: invokevirtual b : ()I
    //   245: bipush #8
    //   247: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   250: pop
    //   251: goto -> 254
    //   254: iload #27
    //   256: ifne -> 338
    //   259: iload #9
    //   261: ifeq -> 314
    //   264: aload_1
    //   265: aload #34
    //   267: aload #38
    //   269: iconst_0
    //   270: iconst_3
    //   271: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   274: pop
    //   275: iload #14
    //   277: ifle -> 292
    //   280: aload_1
    //   281: aload #34
    //   283: aload #38
    //   285: iload #14
    //   287: bipush #8
    //   289: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   292: iload #15
    //   294: ldc 2147483647
    //   296: if_icmpge -> 327
    //   299: aload_1
    //   300: aload #34
    //   302: aload #38
    //   304: iload #15
    //   306: bipush #8
    //   308: invokevirtual g : (Lb/g/b/g;Lb/g/b/g;II)V
    //   311: goto -> 327
    //   314: aload_1
    //   315: aload #34
    //   317: aload #38
    //   319: iload #21
    //   321: bipush #8
    //   323: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   326: pop
    //   327: iload #23
    //   329: istore #12
    //   331: iload #24
    //   333: istore #13
    //   335: goto -> 599
    //   338: iload #30
    //   340: iconst_2
    //   341: if_icmpeq -> 411
    //   344: iload #17
    //   346: ifne -> 411
    //   349: iload #28
    //   351: iconst_1
    //   352: if_icmpeq -> 360
    //   355: iload #28
    //   357: ifne -> 411
    //   360: iload #23
    //   362: iload #21
    //   364: invokestatic max : (II)I
    //   367: istore #13
    //   369: iload #13
    //   371: istore #12
    //   373: iload #24
    //   375: ifle -> 387
    //   378: iload #24
    //   380: iload #13
    //   382: invokestatic min : (II)I
    //   385: istore #12
    //   387: aload_1
    //   388: aload #34
    //   390: aload #38
    //   392: iload #12
    //   394: bipush #8
    //   396: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   399: pop
    //   400: iload #23
    //   402: istore #12
    //   404: iload #24
    //   406: istore #13
    //   408: goto -> 733
    //   411: iload #23
    //   413: istore #12
    //   415: iload #23
    //   417: bipush #-2
    //   419: if_icmpne -> 426
    //   422: iload #21
    //   424: istore #12
    //   426: iload #24
    //   428: istore #13
    //   430: iload #24
    //   432: bipush #-2
    //   434: if_icmpne -> 441
    //   437: iload #21
    //   439: istore #13
    //   441: iload #21
    //   443: istore #23
    //   445: iload #21
    //   447: ifle -> 463
    //   450: iload #21
    //   452: istore #23
    //   454: iload #28
    //   456: iconst_1
    //   457: if_icmpeq -> 463
    //   460: iconst_0
    //   461: istore #23
    //   463: iload #23
    //   465: istore #15
    //   467: iload #12
    //   469: ifle -> 493
    //   472: aload_1
    //   473: aload #34
    //   475: aload #38
    //   477: iload #12
    //   479: bipush #8
    //   481: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   484: iload #23
    //   486: iload #12
    //   488: invokestatic max : (II)I
    //   491: istore #15
    //   493: iload #13
    //   495: ifle -> 549
    //   498: iload_3
    //   499: ifeq -> 514
    //   502: iload #28
    //   504: iconst_1
    //   505: if_icmpne -> 514
    //   508: iconst_0
    //   509: istore #21
    //   511: goto -> 517
    //   514: iconst_1
    //   515: istore #21
    //   517: iload #21
    //   519: ifeq -> 537
    //   522: aload_1
    //   523: aload #34
    //   525: aload #38
    //   527: iload #13
    //   529: bipush #8
    //   531: invokevirtual g : (Lb/g/b/g;Lb/g/b/g;II)V
    //   534: goto -> 537
    //   537: iload #15
    //   539: iload #13
    //   541: invokestatic min : (II)I
    //   544: istore #15
    //   546: goto -> 549
    //   549: iload #28
    //   551: iconst_1
    //   552: if_icmpne -> 610
    //   555: iload_3
    //   556: ifeq -> 575
    //   559: aload_1
    //   560: aload #34
    //   562: aload #38
    //   564: iload #15
    //   566: bipush #8
    //   568: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   571: pop
    //   572: goto -> 599
    //   575: aload_1
    //   576: aload #34
    //   578: aload #38
    //   580: iload #15
    //   582: iconst_5
    //   583: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   586: pop
    //   587: aload_1
    //   588: aload #34
    //   590: aload #38
    //   592: iload #15
    //   594: bipush #8
    //   596: invokevirtual g : (Lb/g/b/g;Lb/g/b/g;II)V
    //   599: iload #12
    //   601: istore #24
    //   603: iload #27
    //   605: istore #29
    //   607: goto -> 754
    //   610: iload #28
    //   612: iconst_2
    //   613: if_icmpne -> 743
    //   616: aload #10
    //   618: getfield c : Lb/g/b/i/c$a;
    //   621: astore #8
    //   623: aload #8
    //   625: aload #39
    //   627: if_acmpeq -> 671
    //   630: aload #8
    //   632: aload #35
    //   634: if_acmpne -> 640
    //   637: goto -> 671
    //   640: aload_1
    //   641: aload_0
    //   642: getfield K : Lb/g/b/i/d;
    //   645: getstatic b/g/b/i/c$a.c : Lb/g/b/i/c$a;
    //   648: invokevirtual f : (Lb/g/b/i/c$a;)Lb/g/b/i/c;
    //   651: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   654: astore #8
    //   656: aload_0
    //   657: getfield K : Lb/g/b/i/d;
    //   660: getstatic b/g/b/i/c$a.e : Lb/g/b/i/c$a;
    //   663: invokevirtual f : (Lb/g/b/i/c$a;)Lb/g/b/i/c;
    //   666: astore #35
    //   668: goto -> 697
    //   671: aload_1
    //   672: aload_0
    //   673: getfield K : Lb/g/b/i/d;
    //   676: aload #39
    //   678: invokevirtual f : (Lb/g/b/i/c$a;)Lb/g/b/i/c;
    //   681: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   684: astore #8
    //   686: aload_0
    //   687: getfield K : Lb/g/b/i/d;
    //   690: aload #35
    //   692: invokevirtual f : (Lb/g/b/i/c$a;)Lb/g/b/i/c;
    //   695: astore #35
    //   697: aload_1
    //   698: aload #35
    //   700: invokevirtual l : (Ljava/lang/Object;)Lb/g/b/g;
    //   703: astore #39
    //   705: aload_1
    //   706: invokevirtual m : ()Lb/g/b/b;
    //   709: astore #35
    //   711: aload #35
    //   713: aload #34
    //   715: aload #38
    //   717: aload #39
    //   719: aload #8
    //   721: fload #25
    //   723: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;Lb/g/b/g;Lb/g/b/g;F)Lb/g/b/b;
    //   726: pop
    //   727: aload_1
    //   728: aload #35
    //   730: invokevirtual c : (Lb/g/b/b;)V
    //   733: iconst_0
    //   734: istore #29
    //   736: iload #12
    //   738: istore #24
    //   740: goto -> 754
    //   743: iconst_1
    //   744: istore #5
    //   746: iload #27
    //   748: istore #29
    //   750: iload #12
    //   752: istore #24
    //   754: iload #26
    //   756: ifeq -> 1874
    //   759: iload #18
    //   761: ifeq -> 767
    //   764: goto -> 1874
    //   767: iload #31
    //   769: ifne -> 785
    //   772: iload #32
    //   774: ifne -> 785
    //   777: iload #33
    //   779: ifne -> 785
    //   782: goto -> 795
    //   785: iload #31
    //   787: ifeq -> 806
    //   790: iload #32
    //   792: ifne -> 806
    //   795: aload #34
    //   797: astore #6
    //   799: aload #34
    //   801: astore #6
    //   803: goto -> 1825
    //   806: iload #31
    //   808: ifne -> 850
    //   811: iload #32
    //   813: ifeq -> 850
    //   816: aload_1
    //   817: aload #34
    //   819: aload #36
    //   821: aload #11
    //   823: invokevirtual b : ()I
    //   826: ineg
    //   827: bipush #8
    //   829: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   832: pop
    //   833: iload_3
    //   834: ifeq -> 1818
    //   837: aload_1
    //   838: aload #38
    //   840: aload #6
    //   842: iconst_0
    //   843: iconst_5
    //   844: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   847: goto -> 1818
    //   850: iload #31
    //   852: ifeq -> 1818
    //   855: iload #32
    //   857: ifeq -> 1818
    //   860: aload #10
    //   862: getfield d : Lb/g/b/i/c;
    //   865: getfield b : Lb/g/b/i/d;
    //   868: astore #35
    //   870: aload #11
    //   872: getfield d : Lb/g/b/i/c;
    //   875: getfield b : Lb/g/b/i/d;
    //   878: astore #39
    //   880: aload_0
    //   881: getfield K : Lb/g/b/i/d;
    //   884: astore #40
    //   886: bipush #6
    //   888: istore #30
    //   890: iload #29
    //   892: ifeq -> 1257
    //   895: iload #28
    //   897: ifne -> 1006
    //   900: iload #13
    //   902: ifne -> 927
    //   905: iload #24
    //   907: ifne -> 927
    //   910: iconst_0
    //   911: istore #13
    //   913: iconst_1
    //   914: istore #12
    //   916: bipush #8
    //   918: istore #21
    //   920: bipush #8
    //   922: istore #22
    //   924: goto -> 939
    //   927: iconst_1
    //   928: istore #13
    //   930: iconst_0
    //   931: istore #12
    //   933: iconst_5
    //   934: istore #21
    //   936: iconst_5
    //   937: istore #22
    //   939: aload #35
    //   941: instanceof b/g/b/i/a
    //   944: ifne -> 988
    //   947: aload #39
    //   949: instanceof b/g/b/i/a
    //   952: ifeq -> 958
    //   955: goto -> 988
    //   958: bipush #6
    //   960: istore #15
    //   962: iconst_0
    //   963: istore #31
    //   965: iload #13
    //   967: istore #27
    //   969: iload #12
    //   971: istore #23
    //   973: iload #21
    //   975: istore #12
    //   977: iload #22
    //   979: istore #13
    //   981: iload #31
    //   983: istore #22
    //   985: goto -> 1296
    //   988: iconst_0
    //   989: istore #22
    //   991: iload #21
    //   993: istore #23
    //   995: iload #13
    //   997: istore #15
    //   999: iload #12
    //   1001: istore #21
    //   1003: goto -> 1273
    //   1006: iload #28
    //   1008: iconst_1
    //   1009: if_icmpne -> 1028
    //   1012: bipush #8
    //   1014: istore #23
    //   1016: iconst_0
    //   1017: istore #21
    //   1019: iconst_1
    //   1020: istore #15
    //   1022: iconst_1
    //   1023: istore #22
    //   1025: goto -> 1273
    //   1028: iload #28
    //   1030: iconst_3
    //   1031: if_icmpne -> 1248
    //   1034: aload_0
    //   1035: getfield s : I
    //   1038: iconst_m1
    //   1039: if_icmpne -> 1082
    //   1042: iload #19
    //   1044: ifeq -> 1063
    //   1047: iload_3
    //   1048: ifeq -> 1057
    //   1051: iconst_5
    //   1052: istore #12
    //   1054: goto -> 1067
    //   1057: iconst_4
    //   1058: istore #12
    //   1060: goto -> 1067
    //   1063: bipush #8
    //   1065: istore #12
    //   1067: bipush #8
    //   1069: istore #13
    //   1071: iload #12
    //   1073: istore #15
    //   1075: iload #13
    //   1077: istore #12
    //   1079: goto -> 1163
    //   1082: iload #17
    //   1084: ifeq -> 1151
    //   1087: iload #22
    //   1089: iconst_2
    //   1090: if_icmpeq -> 1108
    //   1093: iload #22
    //   1095: iconst_1
    //   1096: if_icmpne -> 1102
    //   1099: goto -> 1108
    //   1102: iconst_0
    //   1103: istore #12
    //   1105: goto -> 1111
    //   1108: iconst_1
    //   1109: istore #12
    //   1111: iload #12
    //   1113: ifne -> 1126
    //   1116: bipush #8
    //   1118: istore #13
    //   1120: iconst_5
    //   1121: istore #12
    //   1123: goto -> 1132
    //   1126: iconst_5
    //   1127: istore #13
    //   1129: iconst_4
    //   1130: istore #12
    //   1132: iload #13
    //   1134: istore #21
    //   1136: iload #12
    //   1138: istore #13
    //   1140: bipush #6
    //   1142: istore #15
    //   1144: iload #21
    //   1146: istore #12
    //   1148: goto -> 1166
    //   1151: iload #13
    //   1153: ifle -> 1178
    //   1156: bipush #6
    //   1158: istore #15
    //   1160: iconst_5
    //   1161: istore #12
    //   1163: iconst_5
    //   1164: istore #13
    //   1166: iconst_1
    //   1167: istore #23
    //   1169: iconst_1
    //   1170: istore #27
    //   1172: iconst_1
    //   1173: istore #22
    //   1175: goto -> 1296
    //   1178: iload #13
    //   1180: ifne -> 1236
    //   1183: iload #24
    //   1185: ifne -> 1236
    //   1188: iload #19
    //   1190: ifne -> 1207
    //   1193: bipush #6
    //   1195: istore #15
    //   1197: iconst_5
    //   1198: istore #12
    //   1200: bipush #8
    //   1202: istore #13
    //   1204: goto -> 1166
    //   1207: aload #35
    //   1209: aload #40
    //   1211: if_acmpeq -> 1227
    //   1214: aload #39
    //   1216: aload #40
    //   1218: if_acmpeq -> 1227
    //   1221: iconst_4
    //   1222: istore #23
    //   1224: goto -> 1230
    //   1227: iconst_5
    //   1228: istore #23
    //   1230: iconst_1
    //   1231: istore #21
    //   1233: goto -> 1019
    //   1236: iconst_1
    //   1237: istore #12
    //   1239: iconst_1
    //   1240: istore #15
    //   1242: iconst_1
    //   1243: istore #21
    //   1245: goto -> 1266
    //   1248: iconst_0
    //   1249: istore #12
    //   1251: iconst_0
    //   1252: istore #15
    //   1254: goto -> 1263
    //   1257: iconst_1
    //   1258: istore #12
    //   1260: iconst_1
    //   1261: istore #15
    //   1263: iconst_0
    //   1264: istore #21
    //   1266: iconst_5
    //   1267: istore #23
    //   1269: iload #12
    //   1271: istore #22
    //   1273: iload #23
    //   1275: istore #12
    //   1277: bipush #6
    //   1279: istore #31
    //   1281: iconst_4
    //   1282: istore #13
    //   1284: iload #21
    //   1286: istore #23
    //   1288: iload #15
    //   1290: istore #27
    //   1292: iload #31
    //   1294: istore #15
    //   1296: iload #22
    //   1298: ifeq -> 1324
    //   1301: aload #37
    //   1303: aload #36
    //   1305: if_acmpne -> 1324
    //   1308: aload #35
    //   1310: aload #40
    //   1312: if_acmpeq -> 1324
    //   1315: iconst_0
    //   1316: istore #21
    //   1318: iconst_0
    //   1319: istore #22
    //   1321: goto -> 1327
    //   1324: iconst_1
    //   1325: istore #21
    //   1327: iload #27
    //   1329: ifeq -> 1376
    //   1332: aload_0
    //   1333: getfield X : I
    //   1336: bipush #8
    //   1338: if_icmpne -> 1347
    //   1341: iconst_4
    //   1342: istore #15
    //   1344: goto -> 1347
    //   1347: aload_1
    //   1348: aload #38
    //   1350: aload #37
    //   1352: aload #10
    //   1354: invokevirtual b : ()I
    //   1357: fload #16
    //   1359: aload #36
    //   1361: aload #34
    //   1363: aload #11
    //   1365: invokevirtual b : ()I
    //   1368: iload #15
    //   1370: invokevirtual b : (Lb/g/b/g;Lb/g/b/g;IFLb/g/b/g;Lb/g/b/g;II)V
    //   1373: goto -> 1376
    //   1376: aload_0
    //   1377: getfield X : I
    //   1380: bipush #8
    //   1382: if_icmpne -> 1386
    //   1385: return
    //   1386: iload #22
    //   1388: ifeq -> 1464
    //   1391: iload_3
    //   1392: ifeq -> 1430
    //   1395: aload #37
    //   1397: aload #36
    //   1399: if_acmpeq -> 1430
    //   1402: iload #29
    //   1404: ifne -> 1430
    //   1407: aload #35
    //   1409: instanceof b/g/b/i/a
    //   1412: ifne -> 1423
    //   1415: aload #39
    //   1417: instanceof b/g/b/i/a
    //   1420: ifeq -> 1430
    //   1423: bipush #6
    //   1425: istore #12
    //   1427: goto -> 1430
    //   1430: aload_1
    //   1431: aload #38
    //   1433: aload #37
    //   1435: aload #10
    //   1437: invokevirtual b : ()I
    //   1440: iload #12
    //   1442: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   1445: aload_1
    //   1446: aload #34
    //   1448: aload #36
    //   1450: aload #11
    //   1452: invokevirtual b : ()I
    //   1455: ineg
    //   1456: iload #12
    //   1458: invokevirtual g : (Lb/g/b/g;Lb/g/b/g;II)V
    //   1461: goto -> 1464
    //   1464: aload #34
    //   1466: astore #8
    //   1468: iload_3
    //   1469: ifeq -> 1507
    //   1472: iload #20
    //   1474: ifeq -> 1507
    //   1477: aload #35
    //   1479: instanceof b/g/b/i/a
    //   1482: ifne -> 1507
    //   1485: aload #39
    //   1487: instanceof b/g/b/i/a
    //   1490: ifne -> 1507
    //   1493: bipush #6
    //   1495: istore #15
    //   1497: bipush #6
    //   1499: istore #12
    //   1501: iconst_1
    //   1502: istore #13
    //   1504: goto -> 1519
    //   1507: iload #12
    //   1509: istore #15
    //   1511: iload #13
    //   1513: istore #12
    //   1515: iload #21
    //   1517: istore #13
    //   1519: iload #13
    //   1521: ifeq -> 1722
    //   1524: iload #23
    //   1526: ifeq -> 1629
    //   1529: iload #19
    //   1531: ifeq -> 1539
    //   1534: iload #4
    //   1536: ifeq -> 1629
    //   1539: iload #30
    //   1541: istore #13
    //   1543: aload #35
    //   1545: aload #40
    //   1547: if_acmpeq -> 1568
    //   1550: aload #39
    //   1552: aload #40
    //   1554: if_acmpne -> 1564
    //   1557: iload #30
    //   1559: istore #13
    //   1561: goto -> 1568
    //   1564: iload #12
    //   1566: istore #13
    //   1568: aload #35
    //   1570: instanceof b/g/b/i/f
    //   1573: ifne -> 1584
    //   1576: aload #39
    //   1578: instanceof b/g/b/i/f
    //   1581: ifeq -> 1587
    //   1584: iconst_5
    //   1585: istore #13
    //   1587: aload #35
    //   1589: instanceof b/g/b/i/a
    //   1592: ifne -> 1603
    //   1595: aload #39
    //   1597: instanceof b/g/b/i/a
    //   1600: ifeq -> 1606
    //   1603: iconst_5
    //   1604: istore #13
    //   1606: iload #19
    //   1608: ifeq -> 1617
    //   1611: iconst_5
    //   1612: istore #13
    //   1614: goto -> 1617
    //   1617: iload #13
    //   1619: iload #12
    //   1621: invokestatic max : (II)I
    //   1624: istore #12
    //   1626: goto -> 1629
    //   1629: iload #12
    //   1631: istore #13
    //   1633: iload #13
    //   1635: istore #12
    //   1637: iload_3
    //   1638: ifeq -> 1689
    //   1641: iload #15
    //   1643: iload #13
    //   1645: invokestatic min : (II)I
    //   1648: istore #13
    //   1650: iload #13
    //   1652: istore #12
    //   1654: iload #17
    //   1656: ifeq -> 1689
    //   1659: iload #13
    //   1661: istore #12
    //   1663: iload #19
    //   1665: ifne -> 1689
    //   1668: aload #35
    //   1670: aload #40
    //   1672: if_acmpeq -> 1686
    //   1675: iload #13
    //   1677: istore #12
    //   1679: aload #39
    //   1681: aload #40
    //   1683: if_acmpne -> 1689
    //   1686: iconst_4
    //   1687: istore #12
    //   1689: aload_1
    //   1690: aload #38
    //   1692: aload #37
    //   1694: aload #10
    //   1696: invokevirtual b : ()I
    //   1699: iload #12
    //   1701: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   1704: pop
    //   1705: aload_1
    //   1706: aload #8
    //   1708: aload #36
    //   1710: aload #11
    //   1712: invokevirtual b : ()I
    //   1715: ineg
    //   1716: iload #12
    //   1718: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   1721: pop
    //   1722: iload_3
    //   1723: ifeq -> 1764
    //   1726: aload #6
    //   1728: aload #37
    //   1730: if_acmpne -> 1743
    //   1733: aload #10
    //   1735: invokevirtual b : ()I
    //   1738: istore #12
    //   1740: goto -> 1746
    //   1743: iconst_0
    //   1744: istore #12
    //   1746: aload #37
    //   1748: aload #6
    //   1750: if_acmpeq -> 1764
    //   1753: aload_1
    //   1754: aload #38
    //   1756: aload #6
    //   1758: iload #12
    //   1760: iconst_5
    //   1761: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   1764: iload_3
    //   1765: ifeq -> 799
    //   1768: iload #29
    //   1770: ifeq -> 799
    //   1773: iload #14
    //   1775: ifne -> 799
    //   1778: iload #24
    //   1780: ifne -> 799
    //   1783: iload #29
    //   1785: ifeq -> 1801
    //   1788: iload #28
    //   1790: iconst_3
    //   1791: if_icmpne -> 1801
    //   1794: bipush #8
    //   1796: istore #12
    //   1798: goto -> 1804
    //   1801: iconst_5
    //   1802: istore #12
    //   1804: aload_1
    //   1805: aload #8
    //   1807: aload #38
    //   1809: iconst_0
    //   1810: iload #12
    //   1812: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   1815: goto -> 1825
    //   1818: aload #34
    //   1820: astore #6
    //   1822: goto -> 799
    //   1825: iload_3
    //   1826: ifeq -> 1873
    //   1829: iload #5
    //   1831: ifeq -> 1873
    //   1834: aload #11
    //   1836: getfield d : Lb/g/b/i/c;
    //   1839: ifnull -> 1852
    //   1842: aload #11
    //   1844: invokevirtual b : ()I
    //   1847: istore #12
    //   1849: goto -> 1855
    //   1852: iconst_0
    //   1853: istore #12
    //   1855: aload #36
    //   1857: aload #7
    //   1859: if_acmpeq -> 1873
    //   1862: aload_1
    //   1863: aload #7
    //   1865: aload #34
    //   1867: iload #12
    //   1869: iconst_5
    //   1870: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   1873: return
    //   1874: iload #30
    //   1876: iconst_2
    //   1877: if_icmpge -> 2028
    //   1880: iload_3
    //   1881: ifeq -> 2028
    //   1884: iload #5
    //   1886: ifeq -> 2028
    //   1889: aload_1
    //   1890: aload #38
    //   1892: aload #6
    //   1894: iconst_0
    //   1895: bipush #8
    //   1897: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   1900: iload_2
    //   1901: ifne -> 1923
    //   1904: aload_0
    //   1905: getfield C : Lb/g/b/i/c;
    //   1908: getfield d : Lb/g/b/i/c;
    //   1911: ifnonnull -> 1917
    //   1914: goto -> 1923
    //   1917: iconst_0
    //   1918: istore #13
    //   1920: goto -> 1926
    //   1923: iconst_1
    //   1924: istore #13
    //   1926: iload #13
    //   1928: istore #12
    //   1930: iload_2
    //   1931: ifne -> 2012
    //   1934: aload_0
    //   1935: getfield C : Lb/g/b/i/c;
    //   1938: getfield d : Lb/g/b/i/c;
    //   1941: astore #6
    //   1943: iload #13
    //   1945: istore #12
    //   1947: aload #6
    //   1949: ifnull -> 2012
    //   1952: aload #6
    //   1954: getfield b : Lb/g/b/i/d;
    //   1957: astore #6
    //   1959: aload #6
    //   1961: getfield N : F
    //   1964: fconst_0
    //   1965: fcmpl
    //   1966: ifeq -> 2009
    //   1969: aload #6
    //   1971: getfield J : [Lb/g/b/i/d$a;
    //   1974: astore #8
    //   1976: aload #8
    //   1978: iconst_0
    //   1979: aaload
    //   1980: astore #6
    //   1982: getstatic b/g/b/i/d$a.d : Lb/g/b/i/d$a;
    //   1985: astore #10
    //   1987: aload #6
    //   1989: aload #10
    //   1991: if_acmpne -> 2009
    //   1994: aload #8
    //   1996: iconst_1
    //   1997: aaload
    //   1998: aload #10
    //   2000: if_acmpne -> 2009
    //   2003: iconst_1
    //   2004: istore #12
    //   2006: goto -> 2012
    //   2009: iconst_0
    //   2010: istore #12
    //   2012: iload #12
    //   2014: ifeq -> 2028
    //   2017: aload_1
    //   2018: aload #7
    //   2020: aload #34
    //   2022: iconst_0
    //   2023: bipush #8
    //   2025: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   2028: return
  }
  
  public void e(b.g.b.d paramd) {
    paramd.l(this.y);
    paramd.l(this.z);
    paramd.l(this.A);
    paramd.l(this.B);
    if (this.R > 0)
      paramd.l(this.C); 
  }
  
  public c f(c.a parama) {
    switch (parama.ordinal()) {
      default:
        throw new AssertionError(parama.name());
      case 0:
        return null;
      case 8:
        return this.E;
      case 7:
        return this.D;
      case 6:
        return this.F;
      case 5:
        return this.C;
      case 4:
        return this.B;
      case 3:
        return this.A;
      case 2:
        return this.z;
      case 1:
        break;
    } 
    return this.y;
  }
  
  public int g() {
    return q() + this.M;
  }
  
  public a h(int paramInt) {
    return (paramInt == 0) ? j() : ((paramInt == 1) ? n() : null);
  }
  
  public int i() {
    return (this.X == 8) ? 0 : this.M;
  }
  
  public a j() {
    return this.J[0];
  }
  
  public d k(int paramInt) {
    if (paramInt == 0) {
      c c1 = this.A;
      c c2 = c1.d;
      if (c2 != null && c2.d == c1)
        return c2.b; 
    } else if (paramInt == 1) {
      c c2 = this.B;
      c c1 = c2.d;
      if (c1 != null && c1.d == c2)
        return c1.b; 
    } 
    return null;
  }
  
  public d l(int paramInt) {
    if (paramInt == 0) {
      c c1 = this.y;
      c c2 = c1.d;
      if (c2 != null && c2.d == c1)
        return c2.b; 
    } else if (paramInt == 1) {
      c c2 = this.z;
      c c1 = c2.d;
      if (c1 != null && c1.d == c2)
        return c1.b; 
    } 
    return null;
  }
  
  public int m() {
    return p() + this.L;
  }
  
  public a n() {
    return this.J[1];
  }
  
  public int o() {
    return (this.X == 8) ? 0 : this.L;
  }
  
  public int p() {
    d d1 = this.K;
    return (d1 != null && d1 instanceof e) ? (((e)d1).l0 + this.P) : this.P;
  }
  
  public int q() {
    d d1 = this.K;
    return (d1 != null && d1 instanceof e) ? (((e)d1).m0 + this.Q) : this.Q;
  }
  
  public final boolean r(int paramInt) {
    paramInt *= 2;
    c[] arrayOfC = this.G;
    c c1 = (arrayOfC[paramInt]).d;
    null = true;
    if (c1 != null && (arrayOfC[paramInt]).d.d != arrayOfC[paramInt])
      if ((arrayOfC[++paramInt]).d != null && (arrayOfC[paramInt]).d.d == arrayOfC[paramInt])
        return null;  
    return false;
  }
  
  public boolean s() {
    c c2 = this.y;
    c c1 = c2.d;
    if (c1 == null || c1.d != c2) {
      c1 = this.A;
      c2 = c1.d;
      if (c2 == null || c2.d != c1)
        return false; 
    } 
    return true;
  }
  
  public boolean t() {
    c c1 = this.z;
    c c2 = c1.d;
    if (c2 == null || c2.d != c1) {
      c1 = this.B;
      c2 = c1.d;
      if (c2 == null || c2.d != c1)
        return false; 
    } 
    return true;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    String str1 = this.Z;
    String str2 = "";
    if (str1 != null) {
      StringBuilder stringBuilder1 = c.a.a.a.a.e("type: ");
      stringBuilder1.append(this.Z);
      stringBuilder1.append(" ");
      String str = stringBuilder1.toString();
    } else {
      str1 = "";
    } 
    stringBuilder.append(str1);
    str1 = str2;
    if (this.Y != null) {
      StringBuilder stringBuilder1 = c.a.a.a.a.e("id: ");
      stringBuilder1.append(this.Y);
      stringBuilder1.append(" ");
      str1 = stringBuilder1.toString();
    } 
    stringBuilder.append(str1);
    stringBuilder.append("(");
    stringBuilder.append(this.P);
    stringBuilder.append(", ");
    stringBuilder.append(this.Q);
    stringBuilder.append(") - (");
    stringBuilder.append(this.L);
    stringBuilder.append(" x ");
    stringBuilder.append(this.M);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public void u() {
    this.y.e();
    this.z.e();
    this.A.e();
    this.B.e();
    this.C.e();
    this.D.e();
    this.E.e();
    this.F.e();
    this.K = null;
    this.v = 0.0F;
    this.L = 0;
    this.M = 0;
    this.N = 0.0F;
    this.O = -1;
    this.P = 0;
    this.Q = 0;
    this.R = 0;
    this.S = 0;
    this.T = 0;
    this.U = 0.5F;
    this.V = 0.5F;
    a[] arrayOfA = this.J;
    a a1 = a.b;
    arrayOfA[0] = a1;
    arrayOfA[1] = a1;
    this.W = null;
    this.X = 0;
    this.Z = null;
    this.a0 = 0;
    this.b0 = 0;
    float[] arrayOfFloat = this.c0;
    arrayOfFloat[0] = -1.0F;
    arrayOfFloat[1] = -1.0F;
    this.h = -1;
    this.i = -1;
    int[] arrayOfInt = this.u;
    arrayOfInt[0] = Integer.MAX_VALUE;
    arrayOfInt[1] = Integer.MAX_VALUE;
    this.j = 0;
    this.k = 0;
    this.o = 1.0F;
    this.r = 1.0F;
    this.n = Integer.MAX_VALUE;
    this.q = Integer.MAX_VALUE;
    this.m = 0;
    this.p = 0;
    this.s = -1;
    this.t = 1.0F;
    boolean[] arrayOfBoolean = this.f;
    arrayOfBoolean[0] = true;
    arrayOfBoolean[1] = true;
    arrayOfBoolean = this.I;
    arrayOfBoolean[0] = false;
    arrayOfBoolean[1] = false;
  }
  
  public void v(c paramc) {
    this.y.f();
    this.z.f();
    this.A.f();
    this.B.f();
    this.C.f();
    this.F.f();
    this.D.f();
    this.E.f();
  }
  
  public void w(int paramInt) {
    this.M = paramInt;
    int i = this.T;
    if (paramInt < i)
      this.M = i; 
  }
  
  public void x(a parama) {
    this.J[0] = parama;
  }
  
  public void y(int paramInt) {
    int i = paramInt;
    if (paramInt < 0)
      i = 0; 
    this.T = i;
  }
  
  public void z(int paramInt) {
    int i = paramInt;
    if (paramInt < 0)
      i = 0; 
    this.S = i;
  }
  
  public enum a {
    b, c, d, e;
    
    public static final a[] f;
    
    static {
      a a1 = new a("MATCH_PARENT", 3);
      e = a1;
      f = new a[] { b, c, d, a1 };
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */