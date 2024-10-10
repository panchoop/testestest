package b.g.b.i.l;

import b.g.b.i.d;
import c.a.a.a.a;

public class l extends m {
  public f k;
  
  public g l;
  
  public l(d paramd) {
    super(paramd);
    f f1 = new f(this);
    this.k = f1;
    this.l = null;
    this.h.e = f.a.g;
    this.i.e = f.a.h;
    f1.e = f.a.i;
    this.f = 1;
  }
  
  public void a(d paramd) {
    // Byte code:
    //   0: getstatic b/g/b/i/d$a.d : Lb/g/b/i/d$a;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield j : Lb/g/b/i/l/m$a;
    //   8: invokevirtual ordinal : ()I
    //   11: istore #4
    //   13: iload #4
    //   15: iconst_1
    //   16: if_icmpeq -> 53
    //   19: iload #4
    //   21: iconst_2
    //   22: if_icmpeq -> 53
    //   25: iload #4
    //   27: iconst_3
    //   28: if_icmpeq -> 34
    //   31: goto -> 53
    //   34: aload_0
    //   35: getfield b : Lb/g/b/i/d;
    //   38: astore_1
    //   39: aload_0
    //   40: aload_1
    //   41: getfield z : Lb/g/b/i/c;
    //   44: aload_1
    //   45: getfield B : Lb/g/b/i/c;
    //   48: iconst_1
    //   49: invokevirtual l : (Lb/g/b/i/c;Lb/g/b/i/c;I)V
    //   52: return
    //   53: aload_0
    //   54: getfield e : Lb/g/b/i/l/g;
    //   57: astore #9
    //   59: aload #9
    //   61: getfield c : Z
    //   64: ifeq -> 260
    //   67: aload #9
    //   69: getfield j : Z
    //   72: ifne -> 260
    //   75: aload_0
    //   76: getfield d : Lb/g/b/i/d$a;
    //   79: aload_1
    //   80: if_acmpne -> 260
    //   83: aload_0
    //   84: getfield b : Lb/g/b/i/d;
    //   87: astore #8
    //   89: aload #8
    //   91: getfield k : I
    //   94: istore #4
    //   96: iload #4
    //   98: iconst_2
    //   99: if_icmpeq -> 207
    //   102: iload #4
    //   104: iconst_3
    //   105: if_icmpeq -> 111
    //   108: goto -> 260
    //   111: aload #8
    //   113: getfield d : Lb/g/b/i/l/j;
    //   116: getfield e : Lb/g/b/i/l/g;
    //   119: astore #9
    //   121: aload #9
    //   123: getfield j : Z
    //   126: ifeq -> 260
    //   129: aload #8
    //   131: getfield O : I
    //   134: istore #4
    //   136: iload #4
    //   138: iconst_m1
    //   139: if_icmpeq -> 175
    //   142: iload #4
    //   144: ifeq -> 159
    //   147: iload #4
    //   149: iconst_1
    //   150: if_icmpeq -> 175
    //   153: iconst_0
    //   154: istore #4
    //   156: goto -> 195
    //   159: aload #9
    //   161: getfield g : I
    //   164: i2f
    //   165: aload #8
    //   167: getfield N : F
    //   170: fmul
    //   171: fstore_2
    //   172: goto -> 188
    //   175: aload #9
    //   177: getfield g : I
    //   180: i2f
    //   181: aload #8
    //   183: getfield N : F
    //   186: fdiv
    //   187: fstore_2
    //   188: fload_2
    //   189: ldc 0.5
    //   191: fadd
    //   192: f2i
    //   193: istore #4
    //   195: aload_0
    //   196: getfield e : Lb/g/b/i/l/g;
    //   199: iload #4
    //   201: invokevirtual c : (I)V
    //   204: goto -> 260
    //   207: aload #8
    //   209: getfield K : Lb/g/b/i/d;
    //   212: astore #10
    //   214: aload #10
    //   216: ifnull -> 260
    //   219: aload #10
    //   221: getfield e : Lb/g/b/i/l/l;
    //   224: getfield e : Lb/g/b/i/l/g;
    //   227: astore #10
    //   229: aload #10
    //   231: getfield j : Z
    //   234: ifeq -> 260
    //   237: aload #8
    //   239: getfield r : F
    //   242: fstore_2
    //   243: aload #9
    //   245: aload #10
    //   247: getfield g : I
    //   250: i2f
    //   251: fload_2
    //   252: fmul
    //   253: ldc 0.5
    //   255: fadd
    //   256: f2i
    //   257: invokevirtual c : (I)V
    //   260: aload_0
    //   261: getfield h : Lb/g/b/i/l/f;
    //   264: astore #8
    //   266: aload #8
    //   268: getfield c : Z
    //   271: ifeq -> 821
    //   274: aload_0
    //   275: getfield i : Lb/g/b/i/l/f;
    //   278: astore #9
    //   280: aload #9
    //   282: getfield c : Z
    //   285: ifne -> 291
    //   288: goto -> 821
    //   291: aload #8
    //   293: getfield j : Z
    //   296: ifeq -> 318
    //   299: aload #9
    //   301: getfield j : Z
    //   304: ifeq -> 318
    //   307: aload_0
    //   308: getfield e : Lb/g/b/i/l/g;
    //   311: getfield j : Z
    //   314: ifeq -> 318
    //   317: return
    //   318: aload_0
    //   319: getfield e : Lb/g/b/i/l/g;
    //   322: getfield j : Z
    //   325: ifne -> 459
    //   328: aload_0
    //   329: getfield d : Lb/g/b/i/d$a;
    //   332: aload_1
    //   333: if_acmpne -> 459
    //   336: aload_0
    //   337: getfield b : Lb/g/b/i/d;
    //   340: astore #8
    //   342: aload #8
    //   344: getfield j : I
    //   347: ifne -> 459
    //   350: aload #8
    //   352: invokevirtual t : ()Z
    //   355: ifne -> 459
    //   358: aload_0
    //   359: getfield h : Lb/g/b/i/l/f;
    //   362: getfield l : Ljava/util/List;
    //   365: iconst_0
    //   366: invokeinterface get : (I)Ljava/lang/Object;
    //   371: checkcast b/g/b/i/l/f
    //   374: astore #8
    //   376: aload_0
    //   377: getfield i : Lb/g/b/i/l/f;
    //   380: getfield l : Ljava/util/List;
    //   383: iconst_0
    //   384: invokeinterface get : (I)Ljava/lang/Object;
    //   389: checkcast b/g/b/i/l/f
    //   392: astore_1
    //   393: aload #8
    //   395: getfield g : I
    //   398: istore #4
    //   400: aload_0
    //   401: getfield h : Lb/g/b/i/l/f;
    //   404: astore #8
    //   406: iload #4
    //   408: aload #8
    //   410: getfield f : I
    //   413: iadd
    //   414: istore #5
    //   416: aload_1
    //   417: getfield g : I
    //   420: aload_0
    //   421: getfield i : Lb/g/b/i/l/f;
    //   424: getfield f : I
    //   427: iadd
    //   428: istore #4
    //   430: aload #8
    //   432: iload #5
    //   434: invokevirtual c : (I)V
    //   437: aload_0
    //   438: getfield i : Lb/g/b/i/l/f;
    //   441: iload #4
    //   443: invokevirtual c : (I)V
    //   446: aload_0
    //   447: getfield e : Lb/g/b/i/l/g;
    //   450: iload #4
    //   452: iload #5
    //   454: isub
    //   455: invokevirtual c : (I)V
    //   458: return
    //   459: aload_0
    //   460: getfield e : Lb/g/b/i/l/g;
    //   463: getfield j : Z
    //   466: ifne -> 619
    //   469: aload_0
    //   470: getfield d : Lb/g/b/i/d$a;
    //   473: aload_1
    //   474: if_acmpne -> 619
    //   477: aload_0
    //   478: getfield a : I
    //   481: iconst_1
    //   482: if_icmpne -> 619
    //   485: aload_0
    //   486: getfield h : Lb/g/b/i/l/f;
    //   489: getfield l : Ljava/util/List;
    //   492: invokeinterface size : ()I
    //   497: ifle -> 619
    //   500: aload_0
    //   501: getfield i : Lb/g/b/i/l/f;
    //   504: getfield l : Ljava/util/List;
    //   507: invokeinterface size : ()I
    //   512: ifle -> 619
    //   515: aload_0
    //   516: getfield h : Lb/g/b/i/l/f;
    //   519: getfield l : Ljava/util/List;
    //   522: iconst_0
    //   523: invokeinterface get : (I)Ljava/lang/Object;
    //   528: checkcast b/g/b/i/l/f
    //   531: astore_1
    //   532: aload_0
    //   533: getfield i : Lb/g/b/i/l/f;
    //   536: getfield l : Ljava/util/List;
    //   539: iconst_0
    //   540: invokeinterface get : (I)Ljava/lang/Object;
    //   545: checkcast b/g/b/i/l/f
    //   548: astore #8
    //   550: aload_1
    //   551: getfield g : I
    //   554: istore #5
    //   556: aload_0
    //   557: getfield h : Lb/g/b/i/l/f;
    //   560: getfield f : I
    //   563: istore #4
    //   565: aload #8
    //   567: getfield g : I
    //   570: aload_0
    //   571: getfield i : Lb/g/b/i/l/f;
    //   574: getfield f : I
    //   577: iadd
    //   578: iload #5
    //   580: iload #4
    //   582: iadd
    //   583: isub
    //   584: istore #5
    //   586: aload_0
    //   587: getfield e : Lb/g/b/i/l/g;
    //   590: astore_1
    //   591: aload_1
    //   592: getfield m : I
    //   595: istore #4
    //   597: iload #5
    //   599: iload #4
    //   601: if_icmpge -> 613
    //   604: aload_1
    //   605: iload #5
    //   607: invokevirtual c : (I)V
    //   610: goto -> 619
    //   613: aload_1
    //   614: iload #4
    //   616: invokevirtual c : (I)V
    //   619: aload_0
    //   620: getfield e : Lb/g/b/i/l/g;
    //   623: getfield j : Z
    //   626: ifne -> 630
    //   629: return
    //   630: aload_0
    //   631: getfield h : Lb/g/b/i/l/f;
    //   634: getfield l : Ljava/util/List;
    //   637: invokeinterface size : ()I
    //   642: ifle -> 821
    //   645: aload_0
    //   646: getfield i : Lb/g/b/i/l/f;
    //   649: getfield l : Ljava/util/List;
    //   652: invokeinterface size : ()I
    //   657: ifle -> 821
    //   660: aload_0
    //   661: getfield h : Lb/g/b/i/l/f;
    //   664: getfield l : Ljava/util/List;
    //   667: iconst_0
    //   668: invokeinterface get : (I)Ljava/lang/Object;
    //   673: checkcast b/g/b/i/l/f
    //   676: astore_1
    //   677: aload_0
    //   678: getfield i : Lb/g/b/i/l/f;
    //   681: getfield l : Ljava/util/List;
    //   684: iconst_0
    //   685: invokeinterface get : (I)Ljava/lang/Object;
    //   690: checkcast b/g/b/i/l/f
    //   693: astore #8
    //   695: aload_1
    //   696: getfield g : I
    //   699: istore #5
    //   701: aload_0
    //   702: getfield h : Lb/g/b/i/l/f;
    //   705: getfield f : I
    //   708: istore #7
    //   710: aload #8
    //   712: getfield g : I
    //   715: istore #4
    //   717: aload_0
    //   718: getfield i : Lb/g/b/i/l/f;
    //   721: getfield f : I
    //   724: istore #6
    //   726: aload_0
    //   727: getfield b : Lb/g/b/i/d;
    //   730: getfield V : F
    //   733: fstore_2
    //   734: aload_1
    //   735: aload #8
    //   737: if_acmpne -> 746
    //   740: ldc 0.5
    //   742: fstore_2
    //   743: goto -> 760
    //   746: iload #7
    //   748: iload #5
    //   750: iadd
    //   751: istore #5
    //   753: iload #6
    //   755: iload #4
    //   757: iadd
    //   758: istore #4
    //   760: aload_0
    //   761: getfield e : Lb/g/b/i/l/g;
    //   764: getfield g : I
    //   767: istore #6
    //   769: aload_0
    //   770: getfield h : Lb/g/b/i/l/f;
    //   773: astore_1
    //   774: iload #5
    //   776: i2f
    //   777: fstore_3
    //   778: aload_1
    //   779: iload #4
    //   781: iload #5
    //   783: isub
    //   784: iload #6
    //   786: isub
    //   787: i2f
    //   788: fload_2
    //   789: fmul
    //   790: fload_3
    //   791: ldc 0.5
    //   793: fadd
    //   794: fadd
    //   795: f2i
    //   796: invokevirtual c : (I)V
    //   799: aload_0
    //   800: getfield i : Lb/g/b/i/l/f;
    //   803: aload_0
    //   804: getfield h : Lb/g/b/i/l/f;
    //   807: getfield g : I
    //   810: aload_0
    //   811: getfield e : Lb/g/b/i/l/g;
    //   814: getfield g : I
    //   817: iadd
    //   818: invokevirtual c : (I)V
    //   821: return
  }
  
  public void d() {
    // Byte code:
    //   0: getstatic b/g/b/i/d$a.e : Lb/g/b/i/d$a;
    //   3: astore #6
    //   5: getstatic b/g/b/i/d$a.b : Lb/g/b/i/d$a;
    //   8: astore #4
    //   10: getstatic b/g/b/i/d$a.d : Lb/g/b/i/d$a;
    //   13: astore #5
    //   15: aload_0
    //   16: getfield b : Lb/g/b/i/d;
    //   19: astore #7
    //   21: aload #7
    //   23: getfield a : Z
    //   26: ifeq -> 41
    //   29: aload_0
    //   30: getfield e : Lb/g/b/i/l/g;
    //   33: aload #7
    //   35: invokevirtual i : ()I
    //   38: invokevirtual c : (I)V
    //   41: aload_0
    //   42: getfield e : Lb/g/b/i/l/g;
    //   45: getfield j : Z
    //   48: ifne -> 248
    //   51: aload_0
    //   52: aload_0
    //   53: getfield b : Lb/g/b/i/d;
    //   56: invokevirtual n : ()Lb/g/b/i/d$a;
    //   59: putfield d : Lb/g/b/i/d$a;
    //   62: aload_0
    //   63: getfield b : Lb/g/b/i/d;
    //   66: getfield w : Z
    //   69: ifeq -> 84
    //   72: aload_0
    //   73: new b/g/b/i/l/a
    //   76: dup
    //   77: aload_0
    //   78: invokespecial <init> : (Lb/g/b/i/l/m;)V
    //   81: putfield l : Lb/g/b/i/l/g;
    //   84: aload_0
    //   85: getfield d : Lb/g/b/i/d$a;
    //   88: astore #7
    //   90: aload #7
    //   92: aload #5
    //   94: if_acmpeq -> 335
    //   97: aload #7
    //   99: aload #6
    //   101: if_acmpne -> 222
    //   104: aload_0
    //   105: getfield b : Lb/g/b/i/d;
    //   108: getfield K : Lb/g/b/i/d;
    //   111: astore #6
    //   113: aload #6
    //   115: ifnull -> 222
    //   118: aload #6
    //   120: invokevirtual n : ()Lb/g/b/i/d$a;
    //   123: aload #4
    //   125: if_acmpne -> 222
    //   128: aload #6
    //   130: invokevirtual i : ()I
    //   133: istore_1
    //   134: aload_0
    //   135: getfield b : Lb/g/b/i/d;
    //   138: getfield z : Lb/g/b/i/c;
    //   141: invokevirtual b : ()I
    //   144: istore_3
    //   145: aload_0
    //   146: getfield b : Lb/g/b/i/d;
    //   149: getfield B : Lb/g/b/i/c;
    //   152: invokevirtual b : ()I
    //   155: istore_2
    //   156: aload_0
    //   157: aload_0
    //   158: getfield h : Lb/g/b/i/l/f;
    //   161: aload #6
    //   163: getfield e : Lb/g/b/i/l/l;
    //   166: getfield h : Lb/g/b/i/l/f;
    //   169: aload_0
    //   170: getfield b : Lb/g/b/i/d;
    //   173: getfield z : Lb/g/b/i/c;
    //   176: invokevirtual b : ()I
    //   179: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   182: aload_0
    //   183: aload_0
    //   184: getfield i : Lb/g/b/i/l/f;
    //   187: aload #6
    //   189: getfield e : Lb/g/b/i/l/l;
    //   192: getfield i : Lb/g/b/i/l/f;
    //   195: aload_0
    //   196: getfield b : Lb/g/b/i/d;
    //   199: getfield B : Lb/g/b/i/c;
    //   202: invokevirtual b : ()I
    //   205: ineg
    //   206: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   209: aload_0
    //   210: getfield e : Lb/g/b/i/l/g;
    //   213: iload_1
    //   214: iload_3
    //   215: isub
    //   216: iload_2
    //   217: isub
    //   218: invokevirtual c : (I)V
    //   221: return
    //   222: aload_0
    //   223: getfield d : Lb/g/b/i/d$a;
    //   226: aload #4
    //   228: if_acmpne -> 335
    //   231: aload_0
    //   232: getfield e : Lb/g/b/i/l/g;
    //   235: aload_0
    //   236: getfield b : Lb/g/b/i/d;
    //   239: invokevirtual i : ()I
    //   242: invokevirtual c : (I)V
    //   245: goto -> 335
    //   248: aload_0
    //   249: getfield d : Lb/g/b/i/d$a;
    //   252: aload #6
    //   254: if_acmpne -> 335
    //   257: aload_0
    //   258: getfield b : Lb/g/b/i/d;
    //   261: getfield K : Lb/g/b/i/d;
    //   264: astore #6
    //   266: aload #6
    //   268: ifnull -> 335
    //   271: aload #6
    //   273: invokevirtual n : ()Lb/g/b/i/d$a;
    //   276: aload #4
    //   278: if_acmpne -> 335
    //   281: aload_0
    //   282: aload_0
    //   283: getfield h : Lb/g/b/i/l/f;
    //   286: aload #6
    //   288: getfield e : Lb/g/b/i/l/l;
    //   291: getfield h : Lb/g/b/i/l/f;
    //   294: aload_0
    //   295: getfield b : Lb/g/b/i/d;
    //   298: getfield z : Lb/g/b/i/c;
    //   301: invokevirtual b : ()I
    //   304: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   307: aload_0
    //   308: aload_0
    //   309: getfield i : Lb/g/b/i/l/f;
    //   312: aload #6
    //   314: getfield e : Lb/g/b/i/l/l;
    //   317: getfield i : Lb/g/b/i/l/f;
    //   320: aload_0
    //   321: getfield b : Lb/g/b/i/d;
    //   324: getfield B : Lb/g/b/i/c;
    //   327: invokevirtual b : ()I
    //   330: ineg
    //   331: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   334: return
    //   335: aload_0
    //   336: getfield e : Lb/g/b/i/l/g;
    //   339: getfield j : Z
    //   342: ifeq -> 1117
    //   345: aload_0
    //   346: getfield b : Lb/g/b/i/d;
    //   349: astore #4
    //   351: aload #4
    //   353: getfield a : Z
    //   356: ifeq -> 1117
    //   359: aload #4
    //   361: getfield G : [Lb/g/b/i/c;
    //   364: astore #5
    //   366: aload #5
    //   368: iconst_2
    //   369: aaload
    //   370: getfield d : Lb/g/b/i/c;
    //   373: ifnull -> 637
    //   376: aload #5
    //   378: iconst_3
    //   379: aaload
    //   380: getfield d : Lb/g/b/i/c;
    //   383: ifnull -> 637
    //   386: aload #4
    //   388: invokevirtual t : ()Z
    //   391: ifeq -> 436
    //   394: aload_0
    //   395: getfield h : Lb/g/b/i/l/f;
    //   398: aload_0
    //   399: getfield b : Lb/g/b/i/d;
    //   402: getfield G : [Lb/g/b/i/c;
    //   405: iconst_2
    //   406: aaload
    //   407: invokevirtual b : ()I
    //   410: putfield f : I
    //   413: aload_0
    //   414: getfield i : Lb/g/b/i/l/f;
    //   417: aload_0
    //   418: getfield b : Lb/g/b/i/d;
    //   421: getfield G : [Lb/g/b/i/c;
    //   424: iconst_3
    //   425: aaload
    //   426: invokevirtual b : ()I
    //   429: ineg
    //   430: putfield f : I
    //   433: goto -> 595
    //   436: aload_0
    //   437: aload_0
    //   438: getfield b : Lb/g/b/i/d;
    //   441: getfield G : [Lb/g/b/i/c;
    //   444: iconst_2
    //   445: aaload
    //   446: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   449: astore #5
    //   451: aload #5
    //   453: ifnull -> 507
    //   456: aload_0
    //   457: getfield h : Lb/g/b/i/l/f;
    //   460: astore #4
    //   462: aload_0
    //   463: getfield b : Lb/g/b/i/d;
    //   466: getfield G : [Lb/g/b/i/c;
    //   469: iconst_2
    //   470: aaload
    //   471: invokevirtual b : ()I
    //   474: istore_1
    //   475: aload #4
    //   477: getfield l : Ljava/util/List;
    //   480: aload #5
    //   482: invokeinterface add : (Ljava/lang/Object;)Z
    //   487: pop
    //   488: aload #4
    //   490: iload_1
    //   491: putfield f : I
    //   494: aload #5
    //   496: getfield k : Ljava/util/List;
    //   499: aload #4
    //   501: invokeinterface add : (Ljava/lang/Object;)Z
    //   506: pop
    //   507: aload_0
    //   508: aload_0
    //   509: getfield b : Lb/g/b/i/d;
    //   512: getfield G : [Lb/g/b/i/c;
    //   515: iconst_3
    //   516: aaload
    //   517: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   520: astore #5
    //   522: aload #5
    //   524: ifnull -> 579
    //   527: aload_0
    //   528: getfield i : Lb/g/b/i/l/f;
    //   531: astore #4
    //   533: aload_0
    //   534: getfield b : Lb/g/b/i/d;
    //   537: getfield G : [Lb/g/b/i/c;
    //   540: iconst_3
    //   541: aaload
    //   542: invokevirtual b : ()I
    //   545: ineg
    //   546: istore_1
    //   547: aload #4
    //   549: getfield l : Ljava/util/List;
    //   552: aload #5
    //   554: invokeinterface add : (Ljava/lang/Object;)Z
    //   559: pop
    //   560: aload #4
    //   562: iload_1
    //   563: putfield f : I
    //   566: aload #5
    //   568: getfield k : Ljava/util/List;
    //   571: aload #4
    //   573: invokeinterface add : (Ljava/lang/Object;)Z
    //   578: pop
    //   579: aload_0
    //   580: getfield h : Lb/g/b/i/l/f;
    //   583: iconst_1
    //   584: putfield b : Z
    //   587: aload_0
    //   588: getfield i : Lb/g/b/i/l/f;
    //   591: iconst_1
    //   592: putfield b : Z
    //   595: aload_0
    //   596: getfield b : Lb/g/b/i/d;
    //   599: astore #4
    //   601: aload #4
    //   603: getfield w : Z
    //   606: ifeq -> 2162
    //   609: aload_0
    //   610: getfield k : Lb/g/b/i/l/f;
    //   613: astore #5
    //   615: aload_0
    //   616: getfield h : Lb/g/b/i/l/f;
    //   619: astore #6
    //   621: aload_0
    //   622: aload #5
    //   624: aload #6
    //   626: aload #4
    //   628: getfield R : I
    //   631: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   634: goto -> 2162
    //   637: aload_0
    //   638: getfield b : Lb/g/b/i/d;
    //   641: astore #4
    //   643: aload #4
    //   645: getfield G : [Lb/g/b/i/c;
    //   648: astore #5
    //   650: aload #5
    //   652: iconst_2
    //   653: aaload
    //   654: getfield d : Lb/g/b/i/c;
    //   657: ifnull -> 774
    //   660: aload_0
    //   661: aload #5
    //   663: iconst_2
    //   664: aaload
    //   665: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   668: astore #4
    //   670: aload #4
    //   672: ifnull -> 2162
    //   675: aload_0
    //   676: getfield h : Lb/g/b/i/l/f;
    //   679: astore #5
    //   681: aload_0
    //   682: getfield b : Lb/g/b/i/d;
    //   685: getfield G : [Lb/g/b/i/c;
    //   688: iconst_2
    //   689: aaload
    //   690: invokevirtual b : ()I
    //   693: istore_1
    //   694: aload #5
    //   696: getfield l : Ljava/util/List;
    //   699: aload #4
    //   701: invokeinterface add : (Ljava/lang/Object;)Z
    //   706: pop
    //   707: aload #5
    //   709: iload_1
    //   710: putfield f : I
    //   713: aload #4
    //   715: getfield k : Ljava/util/List;
    //   718: aload #5
    //   720: invokeinterface add : (Ljava/lang/Object;)Z
    //   725: pop
    //   726: aload_0
    //   727: aload_0
    //   728: getfield i : Lb/g/b/i/l/f;
    //   731: aload_0
    //   732: getfield h : Lb/g/b/i/l/f;
    //   735: aload_0
    //   736: getfield e : Lb/g/b/i/l/g;
    //   739: getfield g : I
    //   742: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   745: aload_0
    //   746: getfield b : Lb/g/b/i/d;
    //   749: astore #4
    //   751: aload #4
    //   753: getfield w : Z
    //   756: ifeq -> 2162
    //   759: aload_0
    //   760: getfield k : Lb/g/b/i/l/f;
    //   763: astore #5
    //   765: aload_0
    //   766: getfield h : Lb/g/b/i/l/f;
    //   769: astore #6
    //   771: goto -> 621
    //   774: aload #5
    //   776: iconst_3
    //   777: aaload
    //   778: getfield d : Lb/g/b/i/c;
    //   781: ifnull -> 900
    //   784: aload_0
    //   785: aload #5
    //   787: iconst_3
    //   788: aaload
    //   789: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   792: astore #5
    //   794: aload #5
    //   796: ifnull -> 871
    //   799: aload_0
    //   800: getfield i : Lb/g/b/i/l/f;
    //   803: astore #4
    //   805: aload_0
    //   806: getfield b : Lb/g/b/i/d;
    //   809: getfield G : [Lb/g/b/i/c;
    //   812: iconst_3
    //   813: aaload
    //   814: invokevirtual b : ()I
    //   817: ineg
    //   818: istore_1
    //   819: aload #4
    //   821: getfield l : Ljava/util/List;
    //   824: aload #5
    //   826: invokeinterface add : (Ljava/lang/Object;)Z
    //   831: pop
    //   832: aload #4
    //   834: iload_1
    //   835: putfield f : I
    //   838: aload #5
    //   840: getfield k : Ljava/util/List;
    //   843: aload #4
    //   845: invokeinterface add : (Ljava/lang/Object;)Z
    //   850: pop
    //   851: aload_0
    //   852: aload_0
    //   853: getfield h : Lb/g/b/i/l/f;
    //   856: aload_0
    //   857: getfield i : Lb/g/b/i/l/f;
    //   860: aload_0
    //   861: getfield e : Lb/g/b/i/l/g;
    //   864: getfield g : I
    //   867: ineg
    //   868: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   871: aload_0
    //   872: getfield b : Lb/g/b/i/d;
    //   875: astore #4
    //   877: aload #4
    //   879: getfield w : Z
    //   882: ifeq -> 2162
    //   885: aload_0
    //   886: getfield k : Lb/g/b/i/l/f;
    //   889: astore #5
    //   891: aload_0
    //   892: getfield h : Lb/g/b/i/l/f;
    //   895: astore #6
    //   897: goto -> 621
    //   900: aload #5
    //   902: iconst_4
    //   903: aaload
    //   904: getfield d : Lb/g/b/i/c;
    //   907: ifnull -> 1005
    //   910: aload_0
    //   911: aload #5
    //   913: iconst_4
    //   914: aaload
    //   915: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   918: astore #4
    //   920: aload #4
    //   922: ifnull -> 2162
    //   925: aload_0
    //   926: getfield k : Lb/g/b/i/l/f;
    //   929: astore #5
    //   931: aload #5
    //   933: getfield l : Ljava/util/List;
    //   936: aload #4
    //   938: invokeinterface add : (Ljava/lang/Object;)Z
    //   943: pop
    //   944: aload #5
    //   946: iconst_0
    //   947: putfield f : I
    //   950: aload #4
    //   952: getfield k : Ljava/util/List;
    //   955: aload #5
    //   957: invokeinterface add : (Ljava/lang/Object;)Z
    //   962: pop
    //   963: aload_0
    //   964: aload_0
    //   965: getfield h : Lb/g/b/i/l/f;
    //   968: aload_0
    //   969: getfield k : Lb/g/b/i/l/f;
    //   972: aload_0
    //   973: getfield b : Lb/g/b/i/d;
    //   976: getfield R : I
    //   979: ineg
    //   980: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   983: aload_0
    //   984: aload_0
    //   985: getfield i : Lb/g/b/i/l/f;
    //   988: aload_0
    //   989: getfield h : Lb/g/b/i/l/f;
    //   992: aload_0
    //   993: getfield e : Lb/g/b/i/l/g;
    //   996: getfield g : I
    //   999: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   1002: goto -> 2162
    //   1005: aload #4
    //   1007: instanceof b/g/b/i/g
    //   1010: ifne -> 2162
    //   1013: aload #4
    //   1015: getfield K : Lb/g/b/i/d;
    //   1018: ifnull -> 2162
    //   1021: aload #4
    //   1023: getstatic b/g/b/i/c$a.h : Lb/g/b/i/c$a;
    //   1026: invokevirtual f : (Lb/g/b/i/c$a;)Lb/g/b/i/c;
    //   1029: getfield d : Lb/g/b/i/c;
    //   1032: ifnonnull -> 2162
    //   1035: aload_0
    //   1036: getfield b : Lb/g/b/i/d;
    //   1039: astore #5
    //   1041: aload #5
    //   1043: getfield K : Lb/g/b/i/d;
    //   1046: getfield e : Lb/g/b/i/l/l;
    //   1049: getfield h : Lb/g/b/i/l/f;
    //   1052: astore #4
    //   1054: aload_0
    //   1055: aload_0
    //   1056: getfield h : Lb/g/b/i/l/f;
    //   1059: aload #4
    //   1061: aload #5
    //   1063: invokevirtual q : ()I
    //   1066: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   1069: aload_0
    //   1070: aload_0
    //   1071: getfield i : Lb/g/b/i/l/f;
    //   1074: aload_0
    //   1075: getfield h : Lb/g/b/i/l/f;
    //   1078: aload_0
    //   1079: getfield e : Lb/g/b/i/l/g;
    //   1082: getfield g : I
    //   1085: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   1088: aload_0
    //   1089: getfield b : Lb/g/b/i/d;
    //   1092: astore #4
    //   1094: aload #4
    //   1096: getfield w : Z
    //   1099: ifeq -> 2162
    //   1102: aload_0
    //   1103: getfield k : Lb/g/b/i/l/f;
    //   1106: astore #5
    //   1108: aload_0
    //   1109: getfield h : Lb/g/b/i/l/f;
    //   1112: astore #6
    //   1114: goto -> 621
    //   1117: aload_0
    //   1118: getfield e : Lb/g/b/i/l/g;
    //   1121: astore #4
    //   1123: aload #4
    //   1125: getfield j : Z
    //   1128: ifne -> 1330
    //   1131: aload_0
    //   1132: getfield d : Lb/g/b/i/d$a;
    //   1135: aload #5
    //   1137: if_acmpne -> 1330
    //   1140: aload_0
    //   1141: getfield b : Lb/g/b/i/d;
    //   1144: astore #6
    //   1146: aload #6
    //   1148: getfield k : I
    //   1151: istore_1
    //   1152: iload_1
    //   1153: iconst_2
    //   1154: if_icmpeq -> 1226
    //   1157: iload_1
    //   1158: iconst_3
    //   1159: if_icmpeq -> 1165
    //   1162: goto -> 1361
    //   1165: aload #6
    //   1167: invokevirtual t : ()Z
    //   1170: ifne -> 1361
    //   1173: aload_0
    //   1174: getfield b : Lb/g/b/i/d;
    //   1177: astore #4
    //   1179: aload #4
    //   1181: getfield j : I
    //   1184: iconst_3
    //   1185: if_icmpne -> 1191
    //   1188: goto -> 1361
    //   1191: aload #4
    //   1193: getfield d : Lb/g/b/i/l/j;
    //   1196: getfield e : Lb/g/b/i/l/g;
    //   1199: astore #4
    //   1201: aload_0
    //   1202: getfield e : Lb/g/b/i/l/g;
    //   1205: getfield l : Ljava/util/List;
    //   1208: aload #4
    //   1210: invokeinterface add : (Ljava/lang/Object;)Z
    //   1215: pop
    //   1216: aload #4
    //   1218: getfield k : Ljava/util/List;
    //   1221: astore #4
    //   1223: goto -> 1271
    //   1226: aload #6
    //   1228: getfield K : Lb/g/b/i/d;
    //   1231: astore #6
    //   1233: aload #6
    //   1235: ifnonnull -> 1241
    //   1238: goto -> 1361
    //   1241: aload #6
    //   1243: getfield e : Lb/g/b/i/l/l;
    //   1246: getfield e : Lb/g/b/i/l/g;
    //   1249: astore #6
    //   1251: aload #4
    //   1253: getfield l : Ljava/util/List;
    //   1256: aload #6
    //   1258: invokeinterface add : (Ljava/lang/Object;)Z
    //   1263: pop
    //   1264: aload #6
    //   1266: getfield k : Ljava/util/List;
    //   1269: astore #4
    //   1271: aload #4
    //   1273: aload_0
    //   1274: getfield e : Lb/g/b/i/l/g;
    //   1277: invokeinterface add : (Ljava/lang/Object;)Z
    //   1282: pop
    //   1283: aload_0
    //   1284: getfield e : Lb/g/b/i/l/g;
    //   1287: astore #4
    //   1289: aload #4
    //   1291: iconst_1
    //   1292: putfield b : Z
    //   1295: aload #4
    //   1297: getfield k : Ljava/util/List;
    //   1300: aload_0
    //   1301: getfield h : Lb/g/b/i/l/f;
    //   1304: invokeinterface add : (Ljava/lang/Object;)Z
    //   1309: pop
    //   1310: aload_0
    //   1311: getfield e : Lb/g/b/i/l/g;
    //   1314: getfield k : Ljava/util/List;
    //   1317: aload_0
    //   1318: getfield i : Lb/g/b/i/l/f;
    //   1321: invokeinterface add : (Ljava/lang/Object;)Z
    //   1326: pop
    //   1327: goto -> 1361
    //   1330: aload_0
    //   1331: getfield e : Lb/g/b/i/l/g;
    //   1334: astore #4
    //   1336: aload #4
    //   1338: getfield k : Ljava/util/List;
    //   1341: aload_0
    //   1342: invokeinterface add : (Ljava/lang/Object;)Z
    //   1347: pop
    //   1348: aload #4
    //   1350: getfield j : Z
    //   1353: ifeq -> 1361
    //   1356: aload_0
    //   1357: aload_0
    //   1358: invokevirtual a : (Lb/g/b/i/l/d;)V
    //   1361: aload_0
    //   1362: getfield b : Lb/g/b/i/d;
    //   1365: astore #6
    //   1367: aload #6
    //   1369: getfield G : [Lb/g/b/i/c;
    //   1372: astore #4
    //   1374: aload #4
    //   1376: iconst_2
    //   1377: aaload
    //   1378: getfield d : Lb/g/b/i/c;
    //   1381: ifnull -> 1573
    //   1384: aload #4
    //   1386: iconst_3
    //   1387: aaload
    //   1388: getfield d : Lb/g/b/i/c;
    //   1391: ifnull -> 1573
    //   1394: aload #6
    //   1396: invokevirtual t : ()Z
    //   1399: ifeq -> 1444
    //   1402: aload_0
    //   1403: getfield h : Lb/g/b/i/l/f;
    //   1406: aload_0
    //   1407: getfield b : Lb/g/b/i/d;
    //   1410: getfield G : [Lb/g/b/i/c;
    //   1413: iconst_2
    //   1414: aaload
    //   1415: invokevirtual b : ()I
    //   1418: putfield f : I
    //   1421: aload_0
    //   1422: getfield i : Lb/g/b/i/l/f;
    //   1425: aload_0
    //   1426: getfield b : Lb/g/b/i/d;
    //   1429: getfield G : [Lb/g/b/i/c;
    //   1432: iconst_3
    //   1433: aaload
    //   1434: invokevirtual b : ()I
    //   1437: ineg
    //   1438: putfield f : I
    //   1441: goto -> 1531
    //   1444: aload_0
    //   1445: aload_0
    //   1446: getfield b : Lb/g/b/i/d;
    //   1449: getfield G : [Lb/g/b/i/c;
    //   1452: iconst_2
    //   1453: aaload
    //   1454: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   1457: astore #5
    //   1459: aload_0
    //   1460: aload_0
    //   1461: getfield b : Lb/g/b/i/d;
    //   1464: getfield G : [Lb/g/b/i/c;
    //   1467: iconst_3
    //   1468: aaload
    //   1469: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   1472: astore #4
    //   1474: aload #5
    //   1476: getfield k : Ljava/util/List;
    //   1479: aload_0
    //   1480: invokeinterface add : (Ljava/lang/Object;)Z
    //   1485: pop
    //   1486: aload #5
    //   1488: getfield j : Z
    //   1491: ifeq -> 1499
    //   1494: aload_0
    //   1495: aload_0
    //   1496: invokevirtual a : (Lb/g/b/i/l/d;)V
    //   1499: aload #4
    //   1501: getfield k : Ljava/util/List;
    //   1504: aload_0
    //   1505: invokeinterface add : (Ljava/lang/Object;)Z
    //   1510: pop
    //   1511: aload #4
    //   1513: getfield j : Z
    //   1516: ifeq -> 1524
    //   1519: aload_0
    //   1520: aload_0
    //   1521: invokevirtual a : (Lb/g/b/i/l/d;)V
    //   1524: aload_0
    //   1525: getstatic b/g/b/i/l/m$a.e : Lb/g/b/i/l/m$a;
    //   1528: putfield j : Lb/g/b/i/l/m$a;
    //   1531: aload_0
    //   1532: getfield b : Lb/g/b/i/d;
    //   1535: getfield w : Z
    //   1538: ifeq -> 2139
    //   1541: aload_0
    //   1542: getfield k : Lb/g/b/i/l/f;
    //   1545: astore #5
    //   1547: aload_0
    //   1548: getfield h : Lb/g/b/i/l/f;
    //   1551: astore #6
    //   1553: aload_0
    //   1554: getfield l : Lb/g/b/i/l/g;
    //   1557: astore #4
    //   1559: aload_0
    //   1560: aload #5
    //   1562: aload #6
    //   1564: iconst_1
    //   1565: aload #4
    //   1567: invokevirtual c : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;ILb/g/b/i/l/g;)V
    //   1570: goto -> 2139
    //   1573: aload_0
    //   1574: getfield b : Lb/g/b/i/d;
    //   1577: astore #4
    //   1579: aload #4
    //   1581: getfield G : [Lb/g/b/i/c;
    //   1584: astore #6
    //   1586: aload #6
    //   1588: iconst_2
    //   1589: aaload
    //   1590: getfield d : Lb/g/b/i/c;
    //   1593: ifnull -> 1751
    //   1596: aload_0
    //   1597: aload #6
    //   1599: iconst_2
    //   1600: aaload
    //   1601: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   1604: astore #4
    //   1606: aload #4
    //   1608: ifnull -> 2139
    //   1611: aload_0
    //   1612: getfield h : Lb/g/b/i/l/f;
    //   1615: astore #6
    //   1617: aload_0
    //   1618: getfield b : Lb/g/b/i/d;
    //   1621: getfield G : [Lb/g/b/i/c;
    //   1624: iconst_2
    //   1625: aaload
    //   1626: invokevirtual b : ()I
    //   1629: istore_1
    //   1630: aload #6
    //   1632: getfield l : Ljava/util/List;
    //   1635: aload #4
    //   1637: invokeinterface add : (Ljava/lang/Object;)Z
    //   1642: pop
    //   1643: aload #6
    //   1645: iload_1
    //   1646: putfield f : I
    //   1649: aload #4
    //   1651: getfield k : Ljava/util/List;
    //   1654: aload #6
    //   1656: invokeinterface add : (Ljava/lang/Object;)Z
    //   1661: pop
    //   1662: aload_0
    //   1663: aload_0
    //   1664: getfield i : Lb/g/b/i/l/f;
    //   1667: aload_0
    //   1668: getfield h : Lb/g/b/i/l/f;
    //   1671: iconst_1
    //   1672: aload_0
    //   1673: getfield e : Lb/g/b/i/l/g;
    //   1676: invokevirtual c : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;ILb/g/b/i/l/g;)V
    //   1679: aload_0
    //   1680: getfield b : Lb/g/b/i/d;
    //   1683: getfield w : Z
    //   1686: ifeq -> 1706
    //   1689: aload_0
    //   1690: aload_0
    //   1691: getfield k : Lb/g/b/i/l/f;
    //   1694: aload_0
    //   1695: getfield h : Lb/g/b/i/l/f;
    //   1698: iconst_1
    //   1699: aload_0
    //   1700: getfield l : Lb/g/b/i/l/g;
    //   1703: invokevirtual c : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;ILb/g/b/i/l/g;)V
    //   1706: aload_0
    //   1707: getfield d : Lb/g/b/i/d$a;
    //   1710: aload #5
    //   1712: if_acmpne -> 2139
    //   1715: aload_0
    //   1716: getfield b : Lb/g/b/i/d;
    //   1719: astore #4
    //   1721: aload #4
    //   1723: getfield N : F
    //   1726: fconst_0
    //   1727: fcmpl
    //   1728: ifle -> 2139
    //   1731: aload #4
    //   1733: getfield d : Lb/g/b/i/l/j;
    //   1736: astore #4
    //   1738: aload #4
    //   1740: getfield d : Lb/g/b/i/d$a;
    //   1743: aload #5
    //   1745: if_acmpne -> 2139
    //   1748: goto -> 2090
    //   1751: aload #6
    //   1753: iconst_3
    //   1754: aaload
    //   1755: getfield d : Lb/g/b/i/c;
    //   1758: ifnull -> 1858
    //   1761: aload_0
    //   1762: aload #6
    //   1764: iconst_3
    //   1765: aaload
    //   1766: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   1769: astore #4
    //   1771: aload #4
    //   1773: ifnull -> 2139
    //   1776: aload_0
    //   1777: getfield i : Lb/g/b/i/l/f;
    //   1780: astore #5
    //   1782: aload_0
    //   1783: getfield b : Lb/g/b/i/d;
    //   1786: getfield G : [Lb/g/b/i/c;
    //   1789: iconst_3
    //   1790: aaload
    //   1791: invokevirtual b : ()I
    //   1794: ineg
    //   1795: istore_1
    //   1796: aload #5
    //   1798: getfield l : Ljava/util/List;
    //   1801: aload #4
    //   1803: invokeinterface add : (Ljava/lang/Object;)Z
    //   1808: pop
    //   1809: aload #5
    //   1811: iload_1
    //   1812: putfield f : I
    //   1815: aload #4
    //   1817: getfield k : Ljava/util/List;
    //   1820: aload #5
    //   1822: invokeinterface add : (Ljava/lang/Object;)Z
    //   1827: pop
    //   1828: aload_0
    //   1829: aload_0
    //   1830: getfield h : Lb/g/b/i/l/f;
    //   1833: aload_0
    //   1834: getfield i : Lb/g/b/i/l/f;
    //   1837: iconst_m1
    //   1838: aload_0
    //   1839: getfield e : Lb/g/b/i/l/g;
    //   1842: invokevirtual c : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;ILb/g/b/i/l/g;)V
    //   1845: aload_0
    //   1846: getfield b : Lb/g/b/i/d;
    //   1849: getfield w : Z
    //   1852: ifeq -> 2139
    //   1855: goto -> 1541
    //   1858: aload #6
    //   1860: iconst_4
    //   1861: aaload
    //   1862: getfield d : Lb/g/b/i/c;
    //   1865: ifnull -> 1959
    //   1868: aload_0
    //   1869: aload #6
    //   1871: iconst_4
    //   1872: aaload
    //   1873: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   1876: astore #4
    //   1878: aload #4
    //   1880: ifnull -> 2139
    //   1883: aload_0
    //   1884: getfield k : Lb/g/b/i/l/f;
    //   1887: astore #5
    //   1889: aload #5
    //   1891: getfield l : Ljava/util/List;
    //   1894: aload #4
    //   1896: invokeinterface add : (Ljava/lang/Object;)Z
    //   1901: pop
    //   1902: aload #5
    //   1904: iconst_0
    //   1905: putfield f : I
    //   1908: aload #4
    //   1910: getfield k : Ljava/util/List;
    //   1913: aload #5
    //   1915: invokeinterface add : (Ljava/lang/Object;)Z
    //   1920: pop
    //   1921: aload_0
    //   1922: aload_0
    //   1923: getfield h : Lb/g/b/i/l/f;
    //   1926: aload_0
    //   1927: getfield k : Lb/g/b/i/l/f;
    //   1930: iconst_m1
    //   1931: aload_0
    //   1932: getfield l : Lb/g/b/i/l/g;
    //   1935: invokevirtual c : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;ILb/g/b/i/l/g;)V
    //   1938: aload_0
    //   1939: getfield i : Lb/g/b/i/l/f;
    //   1942: astore #5
    //   1944: aload_0
    //   1945: getfield h : Lb/g/b/i/l/f;
    //   1948: astore #6
    //   1950: aload_0
    //   1951: getfield e : Lb/g/b/i/l/g;
    //   1954: astore #4
    //   1956: goto -> 1559
    //   1959: aload #4
    //   1961: instanceof b/g/b/i/g
    //   1964: ifne -> 2139
    //   1967: aload #4
    //   1969: getfield K : Lb/g/b/i/d;
    //   1972: astore #6
    //   1974: aload #6
    //   1976: ifnull -> 2139
    //   1979: aload #6
    //   1981: getfield e : Lb/g/b/i/l/l;
    //   1984: getfield h : Lb/g/b/i/l/f;
    //   1987: astore #6
    //   1989: aload_0
    //   1990: aload_0
    //   1991: getfield h : Lb/g/b/i/l/f;
    //   1994: aload #6
    //   1996: aload #4
    //   1998: invokevirtual q : ()I
    //   2001: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   2004: aload_0
    //   2005: aload_0
    //   2006: getfield i : Lb/g/b/i/l/f;
    //   2009: aload_0
    //   2010: getfield h : Lb/g/b/i/l/f;
    //   2013: iconst_1
    //   2014: aload_0
    //   2015: getfield e : Lb/g/b/i/l/g;
    //   2018: invokevirtual c : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;ILb/g/b/i/l/g;)V
    //   2021: aload_0
    //   2022: getfield b : Lb/g/b/i/d;
    //   2025: getfield w : Z
    //   2028: ifeq -> 2048
    //   2031: aload_0
    //   2032: aload_0
    //   2033: getfield k : Lb/g/b/i/l/f;
    //   2036: aload_0
    //   2037: getfield h : Lb/g/b/i/l/f;
    //   2040: iconst_1
    //   2041: aload_0
    //   2042: getfield l : Lb/g/b/i/l/g;
    //   2045: invokevirtual c : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;ILb/g/b/i/l/g;)V
    //   2048: aload_0
    //   2049: getfield d : Lb/g/b/i/d$a;
    //   2052: aload #5
    //   2054: if_acmpne -> 2139
    //   2057: aload_0
    //   2058: getfield b : Lb/g/b/i/d;
    //   2061: astore #4
    //   2063: aload #4
    //   2065: getfield N : F
    //   2068: fconst_0
    //   2069: fcmpl
    //   2070: ifle -> 2139
    //   2073: aload #4
    //   2075: getfield d : Lb/g/b/i/l/j;
    //   2078: astore #4
    //   2080: aload #4
    //   2082: getfield d : Lb/g/b/i/d$a;
    //   2085: aload #5
    //   2087: if_acmpne -> 2139
    //   2090: aload #4
    //   2092: getfield e : Lb/g/b/i/l/g;
    //   2095: getfield k : Ljava/util/List;
    //   2098: aload_0
    //   2099: getfield e : Lb/g/b/i/l/g;
    //   2102: invokeinterface add : (Ljava/lang/Object;)Z
    //   2107: pop
    //   2108: aload_0
    //   2109: getfield e : Lb/g/b/i/l/g;
    //   2112: getfield l : Ljava/util/List;
    //   2115: aload_0
    //   2116: getfield b : Lb/g/b/i/d;
    //   2119: getfield d : Lb/g/b/i/l/j;
    //   2122: getfield e : Lb/g/b/i/l/g;
    //   2125: invokeinterface add : (Ljava/lang/Object;)Z
    //   2130: pop
    //   2131: aload_0
    //   2132: getfield e : Lb/g/b/i/l/g;
    //   2135: aload_0
    //   2136: putfield a : Lb/g/b/i/l/d;
    //   2139: aload_0
    //   2140: getfield e : Lb/g/b/i/l/g;
    //   2143: getfield l : Ljava/util/List;
    //   2146: invokeinterface size : ()I
    //   2151: ifne -> 2162
    //   2154: aload_0
    //   2155: getfield e : Lb/g/b/i/l/g;
    //   2158: iconst_1
    //   2159: putfield c : Z
    //   2162: return
  }
  
  public void e() {
    f f1 = this.h;
    if (f1.j)
      this.b.Q = f1.g; 
  }
  
  public void f() {
    this.c = null;
    this.h.b();
    this.i.b();
    this.k.b();
    this.e.b();
    this.g = false;
  }
  
  public boolean k() {
    return (this.d == d.a.d) ? ((this.b.k == 0)) : true;
  }
  
  public void m() {
    this.g = false;
    this.h.b();
    this.h.j = false;
    this.i.b();
    this.i.j = false;
    this.k.b();
    this.k.j = false;
    this.e.j = false;
  }
  
  public String toString() {
    StringBuilder stringBuilder = a.e("VerticalRun ");
    stringBuilder.append(this.b.Y);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\l\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */