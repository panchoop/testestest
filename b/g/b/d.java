package b.g.b;

import b.g.b.i.c;
import java.util.Arrays;
import java.util.HashMap;

public class d {
  public static int q = 1000;
  
  public static boolean r = true;
  
  public static long s;
  
  public static long t;
  
  public int a;
  
  public HashMap<String, g> b;
  
  public a c;
  
  public int d;
  
  public int e;
  
  public b[] f;
  
  public boolean g;
  
  public boolean h;
  
  public boolean[] i;
  
  public int j;
  
  public int k;
  
  public int l;
  
  public final c m;
  
  public g[] n;
  
  public int o;
  
  public a p;
  
  public d() {
    b b1;
    this.a = 0;
    this.b = null;
    this.d = 32;
    this.e = 32;
    this.f = null;
    this.g = false;
    this.h = false;
    this.i = new boolean[32];
    this.j = 1;
    this.k = 0;
    this.l = 32;
    this.n = new g[q];
    this.o = 0;
    this.f = new b[32];
    s();
    c c1 = new c();
    this.m = c1;
    this.c = new f(c1);
    if (r) {
      b1 = new b(this, this.m);
    } else {
      b1 = new b(this.m);
    } 
    this.p = b1;
  }
  
  public final g a(g.a parama, String paramString) {
    g g1 = this.m.c.a();
    if (g1 == null) {
      g1 = new g(parama);
    } else {
      g1.c();
    } 
    g1.j = parama;
    int j = this.o;
    int i = q;
    if (j >= i) {
      i *= 2;
      q = i;
      this.n = Arrays.<g>copyOf(this.n, i);
    } 
    g[] arrayOfG = this.n;
    i = this.o;
    this.o = i + 1;
    arrayOfG[i] = g1;
    return g1;
  }
  
  public void b(g paramg1, g paramg2, int paramInt1, float paramFloat, g paramg3, g paramg4, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual m : ()Lb/g/b/b;
    //   4: astore #11
    //   6: aload_2
    //   7: aload #5
    //   9: if_acmpne -> 53
    //   12: aload #11
    //   14: getfield e : Lb/g/b/b$a;
    //   17: aload_1
    //   18: fconst_1
    //   19: invokeinterface j : (Lb/g/b/g;F)V
    //   24: aload #11
    //   26: getfield e : Lb/g/b/b$a;
    //   29: aload #6
    //   31: fconst_1
    //   32: invokeinterface j : (Lb/g/b/g;F)V
    //   37: aload #11
    //   39: getfield e : Lb/g/b/b$a;
    //   42: aload_2
    //   43: ldc -2.0
    //   45: invokeinterface j : (Lb/g/b/g;F)V
    //   50: goto -> 327
    //   53: fload #4
    //   55: ldc 0.5
    //   57: fcmpl
    //   58: ifne -> 131
    //   61: aload #11
    //   63: getfield e : Lb/g/b/b$a;
    //   66: aload_1
    //   67: fconst_1
    //   68: invokeinterface j : (Lb/g/b/g;F)V
    //   73: aload #11
    //   75: getfield e : Lb/g/b/b$a;
    //   78: aload_2
    //   79: ldc -1.0
    //   81: invokeinterface j : (Lb/g/b/g;F)V
    //   86: aload #11
    //   88: getfield e : Lb/g/b/b$a;
    //   91: aload #5
    //   93: ldc -1.0
    //   95: invokeinterface j : (Lb/g/b/g;F)V
    //   100: aload #11
    //   102: getfield e : Lb/g/b/b$a;
    //   105: aload #6
    //   107: fconst_1
    //   108: invokeinterface j : (Lb/g/b/g;F)V
    //   113: iload_3
    //   114: ifgt -> 122
    //   117: iload #7
    //   119: ifle -> 327
    //   122: iload_3
    //   123: ineg
    //   124: iload #7
    //   126: iadd
    //   127: istore_3
    //   128: goto -> 208
    //   131: fload #4
    //   133: fconst_0
    //   134: fcmpg
    //   135: ifgt -> 170
    //   138: aload #11
    //   140: getfield e : Lb/g/b/b$a;
    //   143: aload_1
    //   144: ldc -1.0
    //   146: invokeinterface j : (Lb/g/b/g;F)V
    //   151: aload #11
    //   153: getfield e : Lb/g/b/b$a;
    //   156: aload_2
    //   157: fconst_1
    //   158: invokeinterface j : (Lb/g/b/g;F)V
    //   163: iload_3
    //   164: i2f
    //   165: fstore #4
    //   167: goto -> 212
    //   170: fload #4
    //   172: fconst_1
    //   173: fcmpl
    //   174: iflt -> 222
    //   177: aload #11
    //   179: getfield e : Lb/g/b/b$a;
    //   182: aload #6
    //   184: ldc -1.0
    //   186: invokeinterface j : (Lb/g/b/g;F)V
    //   191: aload #11
    //   193: getfield e : Lb/g/b/b$a;
    //   196: aload #5
    //   198: fconst_1
    //   199: invokeinterface j : (Lb/g/b/g;F)V
    //   204: iload #7
    //   206: ineg
    //   207: istore_3
    //   208: iload_3
    //   209: i2f
    //   210: fstore #4
    //   212: aload #11
    //   214: fload #4
    //   216: putfield b : F
    //   219: goto -> 327
    //   222: aload #11
    //   224: getfield e : Lb/g/b/b$a;
    //   227: astore #12
    //   229: fconst_1
    //   230: fload #4
    //   232: fsub
    //   233: fstore #9
    //   235: aload #12
    //   237: aload_1
    //   238: fload #9
    //   240: fconst_1
    //   241: fmul
    //   242: invokeinterface j : (Lb/g/b/g;F)V
    //   247: aload #11
    //   249: getfield e : Lb/g/b/b$a;
    //   252: aload_2
    //   253: fload #9
    //   255: ldc -1.0
    //   257: fmul
    //   258: invokeinterface j : (Lb/g/b/g;F)V
    //   263: aload #11
    //   265: getfield e : Lb/g/b/b$a;
    //   268: aload #5
    //   270: ldc -1.0
    //   272: fload #4
    //   274: fmul
    //   275: invokeinterface j : (Lb/g/b/g;F)V
    //   280: aload #11
    //   282: getfield e : Lb/g/b/b$a;
    //   285: aload #6
    //   287: fconst_1
    //   288: fload #4
    //   290: fmul
    //   291: invokeinterface j : (Lb/g/b/g;F)V
    //   296: iload_3
    //   297: ifgt -> 305
    //   300: iload #7
    //   302: ifle -> 327
    //   305: iload_3
    //   306: ineg
    //   307: i2f
    //   308: fstore #10
    //   310: aload #11
    //   312: iload #7
    //   314: i2f
    //   315: fload #4
    //   317: fmul
    //   318: fload #10
    //   320: fload #9
    //   322: fmul
    //   323: fadd
    //   324: putfield b : F
    //   327: iload #8
    //   329: bipush #8
    //   331: if_icmpeq -> 343
    //   334: aload #11
    //   336: aload_0
    //   337: iload #8
    //   339: invokevirtual c : (Lb/g/b/d;I)Lb/g/b/b;
    //   342: pop
    //   343: aload_0
    //   344: aload #11
    //   346: invokevirtual c : (Lb/g/b/b;)V
    //   349: return
  }
  
  public void c(b paramb) {
    // Byte code:
    //   0: getstatic b/g/b/g$a.b : Lb/g/b/g$a;
    //   3: astore #20
    //   5: aload_0
    //   6: getfield k : I
    //   9: istore #7
    //   11: iconst_1
    //   12: istore #9
    //   14: iload #7
    //   16: iconst_1
    //   17: iadd
    //   18: aload_0
    //   19: getfield l : I
    //   22: if_icmpge -> 38
    //   25: aload_0
    //   26: getfield j : I
    //   29: iconst_1
    //   30: iadd
    //   31: aload_0
    //   32: getfield e : I
    //   35: if_icmplt -> 42
    //   38: aload_0
    //   39: invokevirtual p : ()V
    //   42: aload_1
    //   43: getfield f : Z
    //   46: ifne -> 1075
    //   49: aload_0
    //   50: getfield f : [Lb/g/b/b;
    //   53: arraylength
    //   54: ifne -> 60
    //   57: goto -> 228
    //   60: iconst_0
    //   61: istore #7
    //   63: iload #7
    //   65: ifne -> 228
    //   68: aload_1
    //   69: getfield e : Lb/g/b/b$a;
    //   72: invokeinterface k : ()I
    //   77: istore #10
    //   79: iconst_0
    //   80: istore #8
    //   82: iload #8
    //   84: iload #10
    //   86: if_icmpge -> 135
    //   89: aload_1
    //   90: getfield e : Lb/g/b/b$a;
    //   93: iload #8
    //   95: invokeinterface d : (I)Lb/g/b/g;
    //   100: astore #15
    //   102: aload #15
    //   104: getfield d : I
    //   107: iconst_m1
    //   108: if_icmpne -> 119
    //   111: aload #15
    //   113: getfield g : Z
    //   116: ifeq -> 129
    //   119: aload_1
    //   120: getfield d : Ljava/util/ArrayList;
    //   123: aload #15
    //   125: invokevirtual add : (Ljava/lang/Object;)Z
    //   128: pop
    //   129: iinc #8, 1
    //   132: goto -> 82
    //   135: aload_1
    //   136: getfield d : Ljava/util/ArrayList;
    //   139: invokevirtual size : ()I
    //   142: ifle -> 222
    //   145: aload_1
    //   146: getfield d : Ljava/util/ArrayList;
    //   149: invokevirtual iterator : ()Ljava/util/Iterator;
    //   152: astore #16
    //   154: aload #16
    //   156: invokeinterface hasNext : ()Z
    //   161: ifeq -> 212
    //   164: aload #16
    //   166: invokeinterface next : ()Ljava/lang/Object;
    //   171: checkcast b/g/b/g
    //   174: astore #15
    //   176: aload #15
    //   178: getfield g : Z
    //   181: ifeq -> 194
    //   184: aload_1
    //   185: aload #15
    //   187: iconst_1
    //   188: invokevirtual k : (Lb/g/b/g;Z)V
    //   191: goto -> 154
    //   194: aload_1
    //   195: aload_0
    //   196: getfield f : [Lb/g/b/b;
    //   199: aload #15
    //   201: getfield d : I
    //   204: aaload
    //   205: iconst_1
    //   206: invokevirtual l : (Lb/g/b/b;Z)V
    //   209: goto -> 154
    //   212: aload_1
    //   213: getfield d : Ljava/util/ArrayList;
    //   216: invokevirtual clear : ()V
    //   219: goto -> 63
    //   222: iconst_1
    //   223: istore #7
    //   225: goto -> 63
    //   228: aload_1
    //   229: getfield a : Lb/g/b/g;
    //   232: ifnonnull -> 262
    //   235: aload_1
    //   236: getfield b : F
    //   239: fconst_0
    //   240: fcmpl
    //   241: ifne -> 262
    //   244: aload_1
    //   245: getfield e : Lb/g/b/b$a;
    //   248: invokeinterface k : ()I
    //   253: ifne -> 262
    //   256: iconst_1
    //   257: istore #7
    //   259: goto -> 265
    //   262: iconst_0
    //   263: istore #7
    //   265: iload #7
    //   267: ifeq -> 271
    //   270: return
    //   271: aload_1
    //   272: getfield b : F
    //   275: fstore_2
    //   276: fload_2
    //   277: fconst_0
    //   278: fcmpg
    //   279: ifge -> 299
    //   282: aload_1
    //   283: fload_2
    //   284: ldc -1.0
    //   286: fmul
    //   287: putfield b : F
    //   290: aload_1
    //   291: getfield e : Lb/g/b/b$a;
    //   294: invokeinterface i : ()V
    //   299: aload_1
    //   300: getfield e : Lb/g/b/b$a;
    //   303: invokeinterface k : ()I
    //   308: istore #8
    //   310: iconst_0
    //   311: istore #7
    //   313: aconst_null
    //   314: astore #17
    //   316: aconst_null
    //   317: astore #16
    //   319: fconst_0
    //   320: fstore #6
    //   322: iconst_0
    //   323: istore #14
    //   325: fconst_0
    //   326: fstore #5
    //   328: iconst_0
    //   329: istore #13
    //   331: iload #7
    //   333: iload #8
    //   335: if_icmpge -> 712
    //   338: aload_1
    //   339: getfield e : Lb/g/b/b$a;
    //   342: iload #7
    //   344: invokeinterface a : (I)F
    //   349: fstore_2
    //   350: aload_1
    //   351: getfield e : Lb/g/b/b$a;
    //   354: iload #7
    //   356: invokeinterface d : (I)Lb/g/b/g;
    //   361: astore #15
    //   363: aload #15
    //   365: getfield j : Lb/g/b/g$a;
    //   368: aload #20
    //   370: if_acmpne -> 501
    //   373: aload #17
    //   375: ifnonnull -> 381
    //   378: goto -> 388
    //   381: fload #6
    //   383: fload_2
    //   384: fcmpl
    //   385: ifle -> 417
    //   388: aload_1
    //   389: aload #15
    //   391: invokevirtual h : (Lb/g/b/g;)Z
    //   394: istore #11
    //   396: aload #15
    //   398: astore #18
    //   400: aload #16
    //   402: astore #19
    //   404: fload_2
    //   405: fstore_3
    //   406: fload #5
    //   408: fstore #4
    //   410: iload #13
    //   412: istore #12
    //   414: goto -> 683
    //   417: aload #17
    //   419: astore #18
    //   421: aload #16
    //   423: astore #19
    //   425: fload #6
    //   427: fstore_3
    //   428: iload #14
    //   430: istore #11
    //   432: fload #5
    //   434: fstore #4
    //   436: iload #13
    //   438: istore #12
    //   440: iload #14
    //   442: ifne -> 683
    //   445: aload #17
    //   447: astore #18
    //   449: aload #16
    //   451: astore #19
    //   453: fload #6
    //   455: fstore_3
    //   456: iload #14
    //   458: istore #11
    //   460: fload #5
    //   462: fstore #4
    //   464: iload #13
    //   466: istore #12
    //   468: aload_1
    //   469: aload #15
    //   471: invokevirtual h : (Lb/g/b/g;)Z
    //   474: ifeq -> 683
    //   477: iconst_1
    //   478: istore #11
    //   480: aload #15
    //   482: astore #18
    //   484: aload #16
    //   486: astore #19
    //   488: fload_2
    //   489: fstore_3
    //   490: fload #5
    //   492: fstore #4
    //   494: iload #13
    //   496: istore #12
    //   498: goto -> 683
    //   501: aload #17
    //   503: astore #18
    //   505: aload #16
    //   507: astore #19
    //   509: fload #6
    //   511: fstore_3
    //   512: iload #14
    //   514: istore #11
    //   516: fload #5
    //   518: fstore #4
    //   520: iload #13
    //   522: istore #12
    //   524: aload #17
    //   526: ifnonnull -> 683
    //   529: aload #17
    //   531: astore #18
    //   533: aload #16
    //   535: astore #19
    //   537: fload #6
    //   539: fstore_3
    //   540: iload #14
    //   542: istore #11
    //   544: fload #5
    //   546: fstore #4
    //   548: iload #13
    //   550: istore #12
    //   552: fload_2
    //   553: fconst_0
    //   554: fcmpg
    //   555: ifge -> 683
    //   558: aload #16
    //   560: ifnonnull -> 566
    //   563: goto -> 573
    //   566: fload #5
    //   568: fload_2
    //   569: fcmpl
    //   570: ifle -> 602
    //   573: aload_1
    //   574: aload #15
    //   576: invokevirtual h : (Lb/g/b/g;)Z
    //   579: istore #12
    //   581: aload #17
    //   583: astore #18
    //   585: aload #15
    //   587: astore #19
    //   589: fload #6
    //   591: fstore_3
    //   592: iload #14
    //   594: istore #11
    //   596: fload_2
    //   597: fstore #4
    //   599: goto -> 683
    //   602: aload #17
    //   604: astore #18
    //   606: aload #16
    //   608: astore #19
    //   610: fload #6
    //   612: fstore_3
    //   613: iload #14
    //   615: istore #11
    //   617: fload #5
    //   619: fstore #4
    //   621: iload #13
    //   623: istore #12
    //   625: iload #13
    //   627: ifne -> 683
    //   630: aload #17
    //   632: astore #18
    //   634: aload #16
    //   636: astore #19
    //   638: fload #6
    //   640: fstore_3
    //   641: iload #14
    //   643: istore #11
    //   645: fload #5
    //   647: fstore #4
    //   649: iload #13
    //   651: istore #12
    //   653: aload_1
    //   654: aload #15
    //   656: invokevirtual h : (Lb/g/b/g;)Z
    //   659: ifeq -> 683
    //   662: iconst_1
    //   663: istore #12
    //   665: fload_2
    //   666: fstore #4
    //   668: iload #14
    //   670: istore #11
    //   672: fload #6
    //   674: fstore_3
    //   675: aload #15
    //   677: astore #19
    //   679: aload #17
    //   681: astore #18
    //   683: iinc #7, 1
    //   686: aload #18
    //   688: astore #17
    //   690: aload #19
    //   692: astore #16
    //   694: fload_3
    //   695: fstore #6
    //   697: iload #11
    //   699: istore #14
    //   701: fload #4
    //   703: fstore #5
    //   705: iload #12
    //   707: istore #13
    //   709: goto -> 331
    //   712: aload #17
    //   714: ifnull -> 724
    //   717: aload #17
    //   719: astore #16
    //   721: goto -> 724
    //   724: aload #16
    //   726: ifnonnull -> 735
    //   729: iconst_1
    //   730: istore #7
    //   732: goto -> 744
    //   735: aload_1
    //   736: aload #16
    //   738: invokevirtual j : (Lb/g/b/g;)V
    //   741: iconst_0
    //   742: istore #7
    //   744: aload_1
    //   745: getfield e : Lb/g/b/b$a;
    //   748: invokeinterface k : ()I
    //   753: ifne -> 761
    //   756: aload_1
    //   757: iconst_1
    //   758: putfield f : Z
    //   761: iload #7
    //   763: ifeq -> 1019
    //   766: aload_0
    //   767: getfield j : I
    //   770: iconst_1
    //   771: iadd
    //   772: aload_0
    //   773: getfield e : I
    //   776: if_icmplt -> 783
    //   779: aload_0
    //   780: invokevirtual p : ()V
    //   783: aload_0
    //   784: getstatic b/g/b/g$a.d : Lb/g/b/g$a;
    //   787: aconst_null
    //   788: invokevirtual a : (Lb/g/b/g$a;Ljava/lang/String;)Lb/g/b/g;
    //   791: astore #17
    //   793: aload_0
    //   794: getfield a : I
    //   797: iconst_1
    //   798: iadd
    //   799: istore #7
    //   801: aload_0
    //   802: iload #7
    //   804: putfield a : I
    //   807: aload_0
    //   808: aload_0
    //   809: getfield j : I
    //   812: iconst_1
    //   813: iadd
    //   814: putfield j : I
    //   817: aload #17
    //   819: iload #7
    //   821: putfield c : I
    //   824: aload_0
    //   825: getfield m : Lb/g/b/c;
    //   828: getfield d : [Lb/g/b/g;
    //   831: iload #7
    //   833: aload #17
    //   835: aastore
    //   836: aload_1
    //   837: aload #17
    //   839: putfield a : Lb/g/b/g;
    //   842: aload_0
    //   843: aload_1
    //   844: invokevirtual i : (Lb/g/b/b;)V
    //   847: aload_0
    //   848: getfield p : Lb/g/b/d$a;
    //   851: checkcast b/g/b/b
    //   854: astore #15
    //   856: aload #15
    //   858: ifnull -> 1017
    //   861: aload #15
    //   863: aconst_null
    //   864: putfield a : Lb/g/b/g;
    //   867: aload #15
    //   869: getfield e : Lb/g/b/b$a;
    //   872: invokeinterface clear : ()V
    //   877: iconst_0
    //   878: istore #7
    //   880: iload #7
    //   882: aload_1
    //   883: getfield e : Lb/g/b/b$a;
    //   886: invokeinterface k : ()I
    //   891: if_icmpge -> 939
    //   894: aload_1
    //   895: getfield e : Lb/g/b/b$a;
    //   898: iload #7
    //   900: invokeinterface d : (I)Lb/g/b/g;
    //   905: astore #16
    //   907: aload_1
    //   908: getfield e : Lb/g/b/b$a;
    //   911: iload #7
    //   913: invokeinterface a : (I)F
    //   918: fstore_2
    //   919: aload #15
    //   921: getfield e : Lb/g/b/b$a;
    //   924: aload #16
    //   926: fload_2
    //   927: iconst_1
    //   928: invokeinterface c : (Lb/g/b/g;FZ)V
    //   933: iinc #7, 1
    //   936: goto -> 880
    //   939: aload_0
    //   940: aload_0
    //   941: getfield p : Lb/g/b/d$a;
    //   944: invokevirtual r : (Lb/g/b/d$a;)I
    //   947: pop
    //   948: aload #17
    //   950: getfield d : I
    //   953: iconst_m1
    //   954: if_icmpne -> 1011
    //   957: aload_1
    //   958: getfield a : Lb/g/b/g;
    //   961: aload #17
    //   963: if_acmpne -> 986
    //   966: aload_1
    //   967: aconst_null
    //   968: aload #17
    //   970: invokevirtual i : ([ZLb/g/b/g;)Lb/g/b/g;
    //   973: astore #15
    //   975: aload #15
    //   977: ifnull -> 986
    //   980: aload_1
    //   981: aload #15
    //   983: invokevirtual j : (Lb/g/b/g;)V
    //   986: aload_1
    //   987: getfield f : Z
    //   990: ifne -> 1001
    //   993: aload_1
    //   994: getfield a : Lb/g/b/g;
    //   997: aload_1
    //   998: invokevirtual e : (Lb/g/b/b;)V
    //   1001: aload_0
    //   1002: aload_0
    //   1003: getfield k : I
    //   1006: iconst_1
    //   1007: isub
    //   1008: putfield k : I
    //   1011: iconst_1
    //   1012: istore #7
    //   1014: goto -> 1022
    //   1017: aconst_null
    //   1018: athrow
    //   1019: iconst_0
    //   1020: istore #7
    //   1022: aload_1
    //   1023: getfield a : Lb/g/b/g;
    //   1026: astore #15
    //   1028: aload #15
    //   1030: ifnull -> 1063
    //   1033: iload #9
    //   1035: istore #8
    //   1037: aload #15
    //   1039: getfield j : Lb/g/b/g$a;
    //   1042: aload #20
    //   1044: if_acmpeq -> 1066
    //   1047: aload_1
    //   1048: getfield b : F
    //   1051: fconst_0
    //   1052: fcmpg
    //   1053: iflt -> 1063
    //   1056: iload #9
    //   1058: istore #8
    //   1060: goto -> 1066
    //   1063: iconst_0
    //   1064: istore #8
    //   1066: iload #8
    //   1068: ifne -> 1072
    //   1071: return
    //   1072: goto -> 1078
    //   1075: iconst_0
    //   1076: istore #7
    //   1078: iload #7
    //   1080: ifne -> 1088
    //   1083: aload_0
    //   1084: aload_1
    //   1085: invokevirtual i : (Lb/g/b/b;)V
    //   1088: return
  }
  
  public b d(g paramg1, g paramg2, int paramInt1, int paramInt2) {
    if (paramInt2 == 8 && paramg2.g && paramg1.d == -1) {
      paramg1.d(this, paramg2.f + paramInt1);
      return null;
    } 
    b b1 = m();
    int i = 0;
    int j = 0;
    if (paramInt1 != 0) {
      i = j;
      j = paramInt1;
      if (paramInt1 < 0) {
        j = paramInt1 * -1;
        i = 1;
      } 
      b1.b = j;
    } 
    if (i == 0) {
      b1.e.j(paramg1, -1.0F);
      b1.e.j(paramg2, 1.0F);
    } else {
      b1.e.j(paramg1, 1.0F);
      b1.e.j(paramg2, -1.0F);
    } 
    if (paramInt2 != 8)
      b1.c(this, paramInt2); 
    c(b1);
    return b1;
  }
  
  public void e(g paramg, int paramInt) {
    b b1;
    int i = paramg.d;
    if (i == -1) {
      paramg.d(this, paramInt);
      return;
    } 
    if (i != -1) {
      b.a a1;
      b b2 = this.f[i];
      if (!b2.f)
        if (b2.e.k() == 0) {
          b2.f = true;
        } else {
          float f;
          b b3 = m();
          if (paramInt < 0) {
            b3.b = (paramInt * -1);
            a1 = b3.e;
            f = 1.0F;
          } else {
            b3.b = paramInt;
            a1 = b3.e;
            f = -1.0F;
          } 
          a1.j(paramg, f);
          b1 = b3;
          c(b1);
        }  
      ((b)a1).b = paramInt;
    } else {
      b b2 = m();
      b2.a = (g)b1;
      float f = paramInt;
      ((g)b1).f = f;
      b2.b = f;
      b2.f = true;
      b1 = b2;
      c(b1);
    } 
  }
  
  public void f(g paramg1, g paramg2, int paramInt1, int paramInt2) {
    b b1 = m();
    g g1 = n();
    g1.e = 0;
    b1.e(paramg1, paramg2, g1, paramInt1);
    if (paramInt2 != 8) {
      paramInt1 = (int)(b1.e.e(g1) * -1.0F);
      paramg1 = k(paramInt2, null);
      b1.e.j(paramg1, paramInt1);
    } 
    c(b1);
  }
  
  public void g(g paramg1, g paramg2, int paramInt1, int paramInt2) {
    b b1 = m();
    g g1 = n();
    g1.e = 0;
    b1.f(paramg1, paramg2, g1, paramInt1);
    if (paramInt2 != 8) {
      paramInt1 = (int)(b1.e.e(g1) * -1.0F);
      paramg1 = k(paramInt2, null);
      b1.e.j(paramg1, paramInt1);
    } 
    c(b1);
  }
  
  public void h(g paramg1, g paramg2, g paramg3, g paramg4, float paramFloat, int paramInt) {
    b b1 = m();
    b1.d(paramg1, paramg2, paramg3, paramg4, paramFloat);
    if (paramInt != 8)
      b1.c(this, paramInt); 
    c(b1);
  }
  
  public final void i(b paramb) {
    // Byte code:
    //   0: getstatic b/g/b/d.r : Z
    //   3: ifeq -> 38
    //   6: aload_0
    //   7: getfield f : [Lb/g/b/b;
    //   10: astore_3
    //   11: aload_0
    //   12: getfield k : I
    //   15: istore_2
    //   16: aload_3
    //   17: iload_2
    //   18: aaload
    //   19: ifnull -> 74
    //   22: aload_0
    //   23: getfield m : Lb/g/b/c;
    //   26: getfield a : Lb/g/b/e;
    //   29: astore #4
    //   31: aload_3
    //   32: iload_2
    //   33: aaload
    //   34: astore_3
    //   35: goto -> 67
    //   38: aload_0
    //   39: getfield f : [Lb/g/b/b;
    //   42: astore_3
    //   43: aload_0
    //   44: getfield k : I
    //   47: istore_2
    //   48: aload_3
    //   49: iload_2
    //   50: aaload
    //   51: ifnull -> 74
    //   54: aload_0
    //   55: getfield m : Lb/g/b/c;
    //   58: getfield b : Lb/g/b/e;
    //   61: astore #4
    //   63: aload_3
    //   64: iload_2
    //   65: aaload
    //   66: astore_3
    //   67: aload #4
    //   69: aload_3
    //   70: invokevirtual b : (Ljava/lang/Object;)Z
    //   73: pop
    //   74: aload_0
    //   75: getfield f : [Lb/g/b/b;
    //   78: astore_3
    //   79: aload_0
    //   80: getfield k : I
    //   83: istore_2
    //   84: aload_3
    //   85: iload_2
    //   86: aload_1
    //   87: aastore
    //   88: aload_1
    //   89: getfield a : Lb/g/b/g;
    //   92: astore_3
    //   93: aload_3
    //   94: iload_2
    //   95: putfield d : I
    //   98: aload_0
    //   99: iload_2
    //   100: iconst_1
    //   101: iadd
    //   102: putfield k : I
    //   105: aload_3
    //   106: aload_1
    //   107: invokevirtual e : (Lb/g/b/b;)V
    //   110: return
  }
  
  public final void j() {
    for (byte b1 = 0; b1 < this.k; b1++) {
      b b2 = this.f[b1];
      b2.a.f = b2.b;
    } 
  }
  
  public g k(int paramInt, String paramString) {
    if (this.j + 1 >= this.e)
      p(); 
    g g1 = a(g.a.e, paramString);
    int i = this.a + 1;
    this.a = i;
    this.j++;
    g1.c = i;
    g1.e = paramInt;
    this.m.d[i] = g1;
    this.c.a(g1);
    return g1;
  }
  
  public g l(Object paramObject) {
    g g1 = null;
    if (paramObject == null)
      return null; 
    if (this.j + 1 >= this.e)
      p(); 
    if (paramObject instanceof c) {
      c c1 = (c)paramObject;
      g1 = c1.g;
      paramObject = g1;
      if (g1 == null) {
        c1.f();
        paramObject = c1.g;
      } 
      int j = ((g)paramObject).c;
      if (j != -1 && j <= this.a) {
        Object object = paramObject;
        if (this.m.d[j] == null) {
          if (((g)paramObject).c != -1)
            paramObject.c(); 
          j = this.a + 1;
          this.a = j;
          this.j++;
          ((g)paramObject).c = j;
          ((g)paramObject).j = g.a.b;
          this.m.d[j] = (g)paramObject;
          return (g)paramObject;
        } 
        return (g)object;
      } 
    } else {
      return g1;
    } 
    if (((g)paramObject).c != -1)
      paramObject.c(); 
    int i = this.a + 1;
    this.a = i;
    this.j++;
    ((g)paramObject).c = i;
    ((g)paramObject).j = g.a.b;
    this.m.d[i] = (g)paramObject;
    return (g)paramObject;
  }
  
  public b m() {
    b b1;
    if (r) {
      b b2 = this.m.a.a();
      b1 = b2;
      if (b2 == null) {
        b1 = new b(this, this.m);
        t++;
        g.n++;
        return b1;
      } 
    } else {
      b b2 = this.m.b.a();
      b1 = b2;
      if (b2 == null) {
        b1 = new b(this.m);
        s++;
        g.n++;
        return b1;
      } 
    } 
    b1.a = null;
    b1.e.clear();
    b1.b = 0.0F;
    b1.f = false;
    g.n++;
    return b1;
  }
  
  public g n() {
    if (this.j + 1 >= this.e)
      p(); 
    g g1 = a(g.a.d, null);
    int i = this.a + 1;
    this.a = i;
    this.j++;
    g1.c = i;
    this.m.d[i] = g1;
    return g1;
  }
  
  public int o(Object paramObject) {
    paramObject = ((c)paramObject).g;
    return (paramObject != null) ? (int)(((g)paramObject).f + 0.5F) : 0;
  }
  
  public final void p() {
    int i = this.d * 2;
    this.d = i;
    this.f = Arrays.<b>copyOf(this.f, i);
    c c1 = this.m;
    c1.d = Arrays.<g>copyOf(c1.d, this.d);
    i = this.d;
    this.i = new boolean[i];
    this.e = i;
    this.l = i;
  }
  
  public void q(a parama) {
    g.a a1 = g.a.b;
    int i = 0;
    while (true) {
      if (i < this.k) {
        b[] arrayOfB = this.f;
        if ((arrayOfB[i]).a.j != a1 && (arrayOfB[i]).b < 0.0F) {
          i = 1;
          break;
        } 
        i++;
        continue;
      } 
      i = 0;
      break;
    } 
    if (i != 0) {
      boolean bool = false;
      for (i = 0; !bool; i = k) {
        int k = i + 1;
        float f = Float.MAX_VALUE;
        byte b2 = 0;
        int j = -1;
        i = -1;
        byte b1;
        for (b1 = 0; b2 < this.k; b1 = b3) {
          float f1;
          int m;
          byte b3;
          int n;
          b b4 = this.f[b2];
          if (b4.a.j == a1) {
            f1 = f;
            n = j;
            m = i;
            b3 = b1;
          } else if (b4.f) {
            f1 = f;
            n = j;
            m = i;
            b3 = b1;
          } else {
            f1 = f;
            n = j;
            m = i;
            b3 = b1;
            if (b4.b < 0.0F) {
              Object object;
              byte b5 = 1;
              while (true) {
                f1 = f;
                Object object1 = object;
                m = i;
                b3 = b1;
                if (b5 < this.j) {
                  g g1 = this.m.d[b5];
                  float f2 = b4.e.e(g1);
                  if (f2 <= 0.0F) {
                    f1 = f;
                    Object object2 = object;
                    int i1 = i;
                    b3 = b1;
                    continue;
                  } 
                  b3 = 0;
                  m = i;
                  i = b3;
                  while (true) {
                    f1 = f;
                    Object object2 = object;
                    n = m;
                    b3 = b1;
                    i++;
                    b1 = b3;
                  } 
                  continue;
                } 
                break;
                b5++;
                f = f1;
                object = SYNTHETIC_LOCAL_VARIABLE_14;
                i = n;
                b1 = b3;
              } 
            } 
          } 
          b2++;
          f = f1;
          j = n;
          i = m;
        } 
        if (j != -1) {
          b b3 = this.f[j];
          b3.a.d = -1;
          b3.j(this.m.d[i]);
          g g1 = b3.a;
          g1.d = j;
          g1.e(b3);
        } else {
          bool = true;
        } 
        if (k > this.j / 2)
          bool = true; 
      } 
    } 
    r(parama);
    j();
  }
  
  public final int r(a parama) {
    int i;
    for (i = 0; i < this.j; i++)
      this.i[i] = false; 
    boolean bool = false;
    for (i = 0; !bool; i = j) {
      int j = i + 1;
      if (j >= this.j * 2)
        return j; 
      g g1 = ((b)parama).a;
      if (g1 != null)
        this.i[g1.c] = true; 
      g1 = parama.b(this, this.i);
      if (g1 != null) {
        boolean[] arrayOfBoolean = this.i;
        i = g1.c;
        if (arrayOfBoolean[i])
          return j; 
        arrayOfBoolean[i] = true;
      } 
      if (g1 != null) {
        float f = Float.MAX_VALUE;
        i = 0;
        int k;
        for (k = -1; i < this.k; k = m) {
          float f1;
          int m;
          b b1 = this.f[i];
          if (b1.a.j == g.a.b) {
            f1 = f;
            m = k;
          } else if (b1.f) {
            f1 = f;
            m = k;
          } else {
            f1 = f;
            m = k;
            if (b1.e.g(g1)) {
              float f2 = b1.e.e(g1);
              f1 = f;
              m = k;
              if (f2 < 0.0F) {
                f2 = -b1.b / f2;
                f1 = f;
                m = k;
                if (f2 < f) {
                  m = i;
                  f1 = f2;
                } 
              } 
            } 
          } 
          i++;
          f = f1;
        } 
        i = j;
        if (k > -1) {
          b b1 = this.f[k];
          b1.a.d = -1;
          b1.j(g1);
          g1 = b1.a;
          g1.d = k;
          g1.e(b1);
          i = j;
        } 
        continue;
      } 
      bool = true;
    } 
    return i;
  }
  
  public final void s() {
    boolean bool = r;
    byte b1 = 0;
    byte b2 = 0;
    if (bool) {
      b1 = b2;
      while (true) {
        b[] arrayOfB = this.f;
        if (b1 < arrayOfB.length) {
          b b3 = arrayOfB[b1];
          if (b3 != null)
            this.m.a.b(b3); 
          this.f[b1] = null;
          b1++;
          continue;
        } 
        break;
      } 
    } else {
      while (true) {
        b[] arrayOfB = this.f;
        if (b1 < arrayOfB.length) {
          b b3 = arrayOfB[b1];
          if (b3 != null)
            this.m.b.b(b3); 
          this.f[b1] = null;
          b1++;
          continue;
        } 
        break;
      } 
    } 
  }
  
  public void t() {
    int i = 0;
    while (true) {
      g g1;
      c c1 = this.m;
      g[] arrayOfG1 = c1.d;
      if (i < arrayOfG1.length) {
        g1 = arrayOfG1[i];
        if (g1 != null)
          g1.c(); 
        i++;
        continue;
      } 
      e<g> e = ((c)g1).c;
      g[] arrayOfG2 = this.n;
      int j = this.o;
      if (e != null) {
        b b1;
        i = j;
        if (j > arrayOfG2.length)
          i = arrayOfG2.length; 
        for (j = 0; j < i; j++) {
          g1 = arrayOfG2[j];
          int k = e.b;
          Object[] arrayOfObject = e.a;
          if (k < arrayOfObject.length) {
            arrayOfObject[k] = g1;
            e.b = k + 1;
          } 
        } 
        this.o = 0;
        Arrays.fill((Object[])this.m.d, (Object)null);
        HashMap<String, g> hashMap = this.b;
        if (hashMap != null)
          hashMap.clear(); 
        this.a = 0;
        this.c.clear();
        this.j = 1;
        for (i = 0; i < this.k; i++)
          (this.f[i]).c = false; 
        s();
        this.k = 0;
        if (r) {
          b1 = new b(this, this.m);
        } else {
          b1 = new b(this.m);
        } 
        this.p = b1;
        return;
      } 
      throw null;
    } 
  }
  
  public static interface a {
    void a(g param1g);
    
    g b(d param1d, boolean[] param1ArrayOfboolean);
    
    void clear();
  }
  
  public class b extends b {
    public b(d this$0, c param1c) {
      this.e = new h(this, param1c);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */