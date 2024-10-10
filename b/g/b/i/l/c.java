package b.g.b.i.l;

import b.g.b.i.d;
import c.a.a.a.a;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends m {
  public ArrayList<m> k;
  
  public int l;
  
  public c(d paramd, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (Lb/g/b/i/d;)V
    //   5: aload_0
    //   6: new java/util/ArrayList
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: putfield k : Ljava/util/ArrayList;
    //   16: aload_0
    //   17: iload_2
    //   18: putfield f : I
    //   21: aload_0
    //   22: getfield b : Lb/g/b/i/d;
    //   25: astore_1
    //   26: aload_1
    //   27: aload_0
    //   28: getfield f : I
    //   31: invokevirtual l : (I)Lb/g/b/i/d;
    //   34: astore_3
    //   35: aload_3
    //   36: ifnull -> 44
    //   39: aload_3
    //   40: astore_1
    //   41: goto -> 26
    //   44: aload_0
    //   45: aload_1
    //   46: putfield b : Lb/g/b/i/d;
    //   49: aload_0
    //   50: getfield k : Ljava/util/ArrayList;
    //   53: astore_3
    //   54: aload_0
    //   55: getfield f : I
    //   58: istore_2
    //   59: iload_2
    //   60: ifne -> 75
    //   63: aload_0
    //   64: astore #6
    //   66: aload_1
    //   67: astore #5
    //   69: aload_3
    //   70: astore #4
    //   72: goto -> 155
    //   75: iload_2
    //   76: iconst_1
    //   77: if_icmpne -> 92
    //   80: aload_0
    //   81: astore #6
    //   83: aload_1
    //   84: astore #5
    //   86: aload_3
    //   87: astore #4
    //   89: goto -> 189
    //   92: aload_0
    //   93: astore #7
    //   95: aload_3
    //   96: astore #4
    //   98: aload_1
    //   99: astore_3
    //   100: aconst_null
    //   101: astore_1
    //   102: aload_3
    //   103: astore #5
    //   105: aload_1
    //   106: astore_3
    //   107: aload #7
    //   109: astore_1
    //   110: aload #4
    //   112: aload_3
    //   113: invokevirtual add : (Ljava/lang/Object;)Z
    //   116: pop
    //   117: aload #5
    //   119: aload_1
    //   120: getfield f : I
    //   123: invokevirtual k : (I)Lb/g/b/i/d;
    //   126: astore #5
    //   128: aload #5
    //   130: ifnull -> 201
    //   133: aload_1
    //   134: getfield k : Ljava/util/ArrayList;
    //   137: astore #6
    //   139: aload_1
    //   140: getfield f : I
    //   143: istore_2
    //   144: iload_2
    //   145: ifne -> 167
    //   148: aload #6
    //   150: astore #4
    //   152: aload_1
    //   153: astore #6
    //   155: aload #5
    //   157: getfield d : Lb/g/b/i/l/j;
    //   160: astore_3
    //   161: aload #6
    //   163: astore_1
    //   164: goto -> 110
    //   167: aload_1
    //   168: astore #7
    //   170: aload #5
    //   172: astore_3
    //   173: aload #6
    //   175: astore #4
    //   177: iload_2
    //   178: iconst_1
    //   179: if_icmpne -> 100
    //   182: aload #6
    //   184: astore #4
    //   186: aload_1
    //   187: astore #6
    //   189: aload #5
    //   191: getfield e : Lb/g/b/i/l/l;
    //   194: astore_3
    //   195: aload #6
    //   197: astore_1
    //   198: goto -> 110
    //   201: aload_1
    //   202: getfield k : Ljava/util/ArrayList;
    //   205: invokevirtual iterator : ()Ljava/util/Iterator;
    //   208: astore #4
    //   210: aload #4
    //   212: invokeinterface hasNext : ()Z
    //   217: ifeq -> 267
    //   220: aload #4
    //   222: invokeinterface next : ()Ljava/lang/Object;
    //   227: checkcast b/g/b/i/l/m
    //   230: astore_3
    //   231: aload_1
    //   232: getfield f : I
    //   235: istore_2
    //   236: iload_2
    //   237: ifne -> 251
    //   240: aload_3
    //   241: getfield b : Lb/g/b/i/d;
    //   244: aload_1
    //   245: putfield b : Lb/g/b/i/l/c;
    //   248: goto -> 210
    //   251: iload_2
    //   252: iconst_1
    //   253: if_icmpne -> 210
    //   256: aload_3
    //   257: getfield b : Lb/g/b/i/d;
    //   260: aload_1
    //   261: putfield c : Lb/g/b/i/l/c;
    //   264: goto -> 210
    //   267: aload_1
    //   268: getfield f : I
    //   271: ifne -> 295
    //   274: aload_1
    //   275: getfield b : Lb/g/b/i/d;
    //   278: getfield K : Lb/g/b/i/d;
    //   281: checkcast b/g/b/i/e
    //   284: getfield j0 : Z
    //   287: ifeq -> 295
    //   290: iconst_1
    //   291: istore_2
    //   292: goto -> 297
    //   295: iconst_0
    //   296: istore_2
    //   297: iload_2
    //   298: ifeq -> 337
    //   301: aload_1
    //   302: getfield k : Ljava/util/ArrayList;
    //   305: invokevirtual size : ()I
    //   308: iconst_1
    //   309: if_icmple -> 337
    //   312: aload_1
    //   313: getfield k : Ljava/util/ArrayList;
    //   316: astore_3
    //   317: aload_1
    //   318: aload_3
    //   319: aload_3
    //   320: invokevirtual size : ()I
    //   323: iconst_1
    //   324: isub
    //   325: invokevirtual get : (I)Ljava/lang/Object;
    //   328: checkcast b/g/b/i/l/m
    //   331: getfield b : Lb/g/b/i/d;
    //   334: putfield b : Lb/g/b/i/d;
    //   337: aload_1
    //   338: getfield f : I
    //   341: ifne -> 355
    //   344: aload_1
    //   345: getfield b : Lb/g/b/i/d;
    //   348: getfield a0 : I
    //   351: istore_2
    //   352: goto -> 363
    //   355: aload_1
    //   356: getfield b : Lb/g/b/i/d;
    //   359: getfield b0 : I
    //   362: istore_2
    //   363: aload_1
    //   364: iload_2
    //   365: putfield l : I
    //   368: return
  }
  
  public void a(d paramd) {
    // Byte code:
    //   0: getstatic b/g/b/i/d$a.d : Lb/g/b/i/d$a;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield h : Lb/g/b/i/l/f;
    //   8: getfield j : Z
    //   11: ifeq -> 2566
    //   14: aload_0
    //   15: getfield i : Lb/g/b/i/l/f;
    //   18: getfield j : Z
    //   21: ifne -> 27
    //   24: goto -> 2566
    //   27: aload_0
    //   28: getfield b : Lb/g/b/i/d;
    //   31: getfield K : Lb/g/b/i/d;
    //   34: astore #22
    //   36: aload #22
    //   38: ifnull -> 62
    //   41: aload #22
    //   43: instanceof b/g/b/i/e
    //   46: ifeq -> 62
    //   49: aload #22
    //   51: checkcast b/g/b/i/e
    //   54: getfield j0 : Z
    //   57: istore #21
    //   59: goto -> 65
    //   62: iconst_0
    //   63: istore #21
    //   65: aload_0
    //   66: getfield i : Lb/g/b/i/l/f;
    //   69: getfield g : I
    //   72: aload_0
    //   73: getfield h : Lb/g/b/i/l/f;
    //   76: getfield g : I
    //   79: isub
    //   80: istore #20
    //   82: aload_0
    //   83: getfield k : Ljava/util/ArrayList;
    //   86: invokevirtual size : ()I
    //   89: istore #19
    //   91: iconst_0
    //   92: istore #5
    //   94: iconst_m1
    //   95: istore #6
    //   97: iload #5
    //   99: iload #19
    //   101: if_icmpge -> 137
    //   104: iload #5
    //   106: istore #13
    //   108: aload_0
    //   109: getfield k : Ljava/util/ArrayList;
    //   112: iload #5
    //   114: invokevirtual get : (I)Ljava/lang/Object;
    //   117: checkcast b/g/b/i/l/m
    //   120: getfield b : Lb/g/b/i/d;
    //   123: getfield X : I
    //   126: bipush #8
    //   128: if_icmpne -> 140
    //   131: iinc #5, 1
    //   134: goto -> 94
    //   137: iconst_m1
    //   138: istore #13
    //   140: iload #19
    //   142: iconst_1
    //   143: isub
    //   144: istore #18
    //   146: iload #18
    //   148: istore #5
    //   150: iload #6
    //   152: istore #14
    //   154: iload #5
    //   156: iflt -> 192
    //   159: aload_0
    //   160: getfield k : Ljava/util/ArrayList;
    //   163: iload #5
    //   165: invokevirtual get : (I)Ljava/lang/Object;
    //   168: checkcast b/g/b/i/l/m
    //   171: getfield b : Lb/g/b/i/d;
    //   174: getfield X : I
    //   177: bipush #8
    //   179: if_icmpne -> 188
    //   182: iinc #5, -1
    //   185: goto -> 150
    //   188: iload #5
    //   190: istore #14
    //   192: iconst_0
    //   193: istore #9
    //   195: iload #9
    //   197: iconst_2
    //   198: if_icmpge -> 666
    //   201: iconst_0
    //   202: istore #10
    //   204: iconst_0
    //   205: istore #7
    //   207: iconst_0
    //   208: istore #5
    //   210: iconst_0
    //   211: istore #6
    //   213: fconst_0
    //   214: fstore_2
    //   215: iload #10
    //   217: iload #19
    //   219: if_icmpge -> 634
    //   222: aload_0
    //   223: getfield k : Ljava/util/ArrayList;
    //   226: iload #10
    //   228: invokevirtual get : (I)Ljava/lang/Object;
    //   231: checkcast b/g/b/i/l/m
    //   234: astore #22
    //   236: aload #22
    //   238: getfield b : Lb/g/b/i/d;
    //   241: getfield X : I
    //   244: bipush #8
    //   246: if_icmpne -> 260
    //   249: iload #7
    //   251: istore #8
    //   253: iload #5
    //   255: istore #11
    //   257: goto -> 620
    //   260: iload #6
    //   262: iconst_1
    //   263: iadd
    //   264: istore #16
    //   266: iload #7
    //   268: istore #6
    //   270: iload #10
    //   272: ifle -> 299
    //   275: iload #7
    //   277: istore #6
    //   279: iload #10
    //   281: iload #13
    //   283: if_icmplt -> 299
    //   286: iload #7
    //   288: aload #22
    //   290: getfield h : Lb/g/b/i/l/f;
    //   293: getfield f : I
    //   296: iadd
    //   297: istore #6
    //   299: aload #22
    //   301: getfield e : Lb/g/b/i/l/g;
    //   304: getfield g : I
    //   307: istore #11
    //   309: aload #22
    //   311: getfield d : Lb/g/b/i/d$a;
    //   314: aload_1
    //   315: if_acmpeq -> 324
    //   318: iconst_1
    //   319: istore #8
    //   321: goto -> 327
    //   324: iconst_0
    //   325: istore #8
    //   327: iload #8
    //   329: ifeq -> 407
    //   332: aload_0
    //   333: getfield f : I
    //   336: ifne -> 357
    //   339: aload #22
    //   341: getfield b : Lb/g/b/i/d;
    //   344: getfield d : Lb/g/b/i/l/j;
    //   347: getfield e : Lb/g/b/i/l/g;
    //   350: getfield j : Z
    //   353: ifne -> 357
    //   356: return
    //   357: iload #8
    //   359: istore #15
    //   361: iload #11
    //   363: istore #12
    //   365: iload #5
    //   367: istore #7
    //   369: aload_0
    //   370: getfield f : I
    //   373: iconst_1
    //   374: if_icmpne -> 486
    //   377: iload #8
    //   379: istore #15
    //   381: iload #11
    //   383: istore #12
    //   385: iload #5
    //   387: istore #7
    //   389: aload #22
    //   391: getfield b : Lb/g/b/i/d;
    //   394: getfield e : Lb/g/b/i/l/l;
    //   397: getfield e : Lb/g/b/i/l/g;
    //   400: getfield j : Z
    //   403: ifne -> 486
    //   406: return
    //   407: aload #22
    //   409: getfield a : I
    //   412: iconst_1
    //   413: if_icmpne -> 448
    //   416: iload #9
    //   418: ifne -> 448
    //   421: aload #22
    //   423: getfield e : Lb/g/b/i/l/g;
    //   426: getfield m : I
    //   429: istore #7
    //   431: iload #5
    //   433: iconst_1
    //   434: iadd
    //   435: istore #8
    //   437: iload #7
    //   439: istore #5
    //   441: iload #8
    //   443: istore #7
    //   445: goto -> 479
    //   448: iload #8
    //   450: istore #15
    //   452: iload #11
    //   454: istore #12
    //   456: iload #5
    //   458: istore #7
    //   460: aload #22
    //   462: getfield e : Lb/g/b/i/l/g;
    //   465: getfield j : Z
    //   468: ifeq -> 486
    //   471: iload #5
    //   473: istore #7
    //   475: iload #11
    //   477: istore #5
    //   479: iconst_1
    //   480: istore #15
    //   482: iload #5
    //   484: istore #12
    //   486: iload #15
    //   488: ifne -> 545
    //   491: iload #7
    //   493: iconst_1
    //   494: iadd
    //   495: istore #8
    //   497: aload #22
    //   499: getfield b : Lb/g/b/i/d;
    //   502: getfield c0 : [F
    //   505: aload_0
    //   506: getfield f : I
    //   509: faload
    //   510: fstore #4
    //   512: iload #6
    //   514: istore #5
    //   516: iload #8
    //   518: istore #7
    //   520: fload_2
    //   521: fstore_3
    //   522: fload #4
    //   524: fconst_0
    //   525: fcmpl
    //   526: iflt -> 554
    //   529: fload_2
    //   530: fload #4
    //   532: fadd
    //   533: fstore_3
    //   534: iload #6
    //   536: istore #5
    //   538: iload #8
    //   540: istore #7
    //   542: goto -> 554
    //   545: iload #6
    //   547: iload #12
    //   549: iadd
    //   550: istore #5
    //   552: fload_2
    //   553: fstore_3
    //   554: iload #5
    //   556: istore #8
    //   558: iload #7
    //   560: istore #11
    //   562: iload #16
    //   564: istore #6
    //   566: fload_3
    //   567: fstore_2
    //   568: iload #10
    //   570: iload #18
    //   572: if_icmpge -> 620
    //   575: iload #5
    //   577: istore #8
    //   579: iload #7
    //   581: istore #11
    //   583: iload #16
    //   585: istore #6
    //   587: fload_3
    //   588: fstore_2
    //   589: iload #10
    //   591: iload #14
    //   593: if_icmpge -> 620
    //   596: iload #5
    //   598: aload #22
    //   600: getfield i : Lb/g/b/i/l/f;
    //   603: getfield f : I
    //   606: ineg
    //   607: iadd
    //   608: istore #8
    //   610: fload_3
    //   611: fstore_2
    //   612: iload #16
    //   614: istore #6
    //   616: iload #7
    //   618: istore #11
    //   620: iinc #10, 1
    //   623: iload #8
    //   625: istore #7
    //   627: iload #11
    //   629: istore #5
    //   631: goto -> 215
    //   634: iload #7
    //   636: iload #20
    //   638: if_icmplt -> 655
    //   641: iload #5
    //   643: ifne -> 649
    //   646: goto -> 655
    //   649: iinc #9, 1
    //   652: goto -> 195
    //   655: iload #6
    //   657: istore #15
    //   659: iload #5
    //   661: istore #6
    //   663: goto -> 677
    //   666: iconst_0
    //   667: istore #6
    //   669: iconst_0
    //   670: istore #15
    //   672: iconst_0
    //   673: istore #7
    //   675: fconst_0
    //   676: fstore_2
    //   677: aload_0
    //   678: getfield h : Lb/g/b/i/l/f;
    //   681: getfield g : I
    //   684: istore #8
    //   686: iload #21
    //   688: ifeq -> 700
    //   691: aload_0
    //   692: getfield i : Lb/g/b/i/l/f;
    //   695: getfield g : I
    //   698: istore #8
    //   700: iload #8
    //   702: istore #5
    //   704: iload #7
    //   706: iload #20
    //   708: if_icmple -> 747
    //   711: iload #7
    //   713: iload #20
    //   715: isub
    //   716: i2f
    //   717: fconst_2
    //   718: fdiv
    //   719: ldc 0.5
    //   721: fadd
    //   722: f2i
    //   723: istore #5
    //   725: iload #21
    //   727: ifeq -> 740
    //   730: iload #8
    //   732: iload #5
    //   734: iadd
    //   735: istore #5
    //   737: goto -> 747
    //   740: iload #8
    //   742: iload #5
    //   744: isub
    //   745: istore #5
    //   747: iload #6
    //   749: ifle -> 1307
    //   752: iload #20
    //   754: iload #7
    //   756: isub
    //   757: i2f
    //   758: fstore_3
    //   759: fload_3
    //   760: iload #6
    //   762: i2f
    //   763: fdiv
    //   764: ldc 0.5
    //   766: fadd
    //   767: f2i
    //   768: istore #9
    //   770: iconst_0
    //   771: istore #16
    //   773: iconst_0
    //   774: istore #8
    //   776: iload #5
    //   778: istore #10
    //   780: iload #16
    //   782: iload #19
    //   784: if_icmpge -> 1105
    //   787: aload_0
    //   788: getfield k : Ljava/util/ArrayList;
    //   791: iload #16
    //   793: invokevirtual get : (I)Ljava/lang/Object;
    //   796: checkcast b/g/b/i/l/m
    //   799: astore #22
    //   801: aload #22
    //   803: getfield b : Lb/g/b/i/d;
    //   806: astore #23
    //   808: aload #23
    //   810: getfield X : I
    //   813: bipush #8
    //   815: if_icmpne -> 821
    //   818: goto -> 1099
    //   821: aload #22
    //   823: getfield d : Lb/g/b/i/d$a;
    //   826: aload_1
    //   827: if_acmpne -> 1099
    //   830: aload #22
    //   832: getfield e : Lb/g/b/i/l/g;
    //   835: getfield j : Z
    //   838: ifne -> 1099
    //   841: fload_2
    //   842: fconst_0
    //   843: fcmpl
    //   844: ifle -> 870
    //   847: aload #23
    //   849: getfield c0 : [F
    //   852: aload_0
    //   853: getfield f : I
    //   856: faload
    //   857: fload_3
    //   858: fmul
    //   859: fload_2
    //   860: fdiv
    //   861: ldc 0.5
    //   863: fadd
    //   864: f2i
    //   865: istore #5
    //   867: goto -> 874
    //   870: iload #9
    //   872: istore #5
    //   874: aload_0
    //   875: getfield f : I
    //   878: ifne -> 978
    //   881: aload #22
    //   883: getfield b : Lb/g/b/i/d;
    //   886: astore #23
    //   888: aload #23
    //   890: getfield n : I
    //   893: istore #17
    //   895: aload #23
    //   897: getfield m : I
    //   900: istore #12
    //   902: aload #22
    //   904: getfield a : I
    //   907: iconst_1
    //   908: if_icmpne -> 929
    //   911: iload #5
    //   913: aload #22
    //   915: getfield e : Lb/g/b/i/l/g;
    //   918: getfield m : I
    //   921: invokestatic min : (II)I
    //   924: istore #11
    //   926: goto -> 933
    //   929: iload #5
    //   931: istore #11
    //   933: iload #12
    //   935: iload #11
    //   937: invokestatic max : (II)I
    //   940: istore #12
    //   942: iload #12
    //   944: istore #11
    //   946: iload #17
    //   948: ifle -> 960
    //   951: iload #17
    //   953: iload #12
    //   955: invokestatic min : (II)I
    //   958: istore #11
    //   960: iload #5
    //   962: istore #17
    //   964: iload #8
    //   966: istore #12
    //   968: iload #11
    //   970: iload #5
    //   972: if_icmpeq -> 1082
    //   975: goto -> 1072
    //   978: aload #22
    //   980: getfield b : Lb/g/b/i/d;
    //   983: astore #23
    //   985: aload #23
    //   987: getfield q : I
    //   990: istore #17
    //   992: aload #23
    //   994: getfield p : I
    //   997: istore #12
    //   999: aload #22
    //   1001: getfield a : I
    //   1004: iconst_1
    //   1005: if_icmpne -> 1026
    //   1008: iload #5
    //   1010: aload #22
    //   1012: getfield e : Lb/g/b/i/l/g;
    //   1015: getfield m : I
    //   1018: invokestatic min : (II)I
    //   1021: istore #11
    //   1023: goto -> 1030
    //   1026: iload #5
    //   1028: istore #11
    //   1030: iload #12
    //   1032: iload #11
    //   1034: invokestatic max : (II)I
    //   1037: istore #12
    //   1039: iload #12
    //   1041: istore #11
    //   1043: iload #17
    //   1045: ifle -> 1057
    //   1048: iload #17
    //   1050: iload #12
    //   1052: invokestatic min : (II)I
    //   1055: istore #11
    //   1057: iload #5
    //   1059: istore #17
    //   1061: iload #8
    //   1063: istore #12
    //   1065: iload #11
    //   1067: iload #5
    //   1069: if_icmpeq -> 1082
    //   1072: iload #8
    //   1074: iconst_1
    //   1075: iadd
    //   1076: istore #12
    //   1078: iload #11
    //   1080: istore #17
    //   1082: aload #22
    //   1084: getfield e : Lb/g/b/i/l/g;
    //   1087: iload #17
    //   1089: invokevirtual c : (I)V
    //   1092: iload #12
    //   1094: istore #8
    //   1096: goto -> 1099
    //   1099: iinc #16, 1
    //   1102: goto -> 780
    //   1105: iload #8
    //   1107: ifle -> 1255
    //   1110: iload #6
    //   1112: iload #8
    //   1114: isub
    //   1115: istore #9
    //   1117: iconst_0
    //   1118: istore #6
    //   1120: iconst_0
    //   1121: istore #5
    //   1123: iload #6
    //   1125: iload #19
    //   1127: if_icmpge -> 1248
    //   1130: aload_0
    //   1131: getfield k : Ljava/util/ArrayList;
    //   1134: iload #6
    //   1136: invokevirtual get : (I)Ljava/lang/Object;
    //   1139: checkcast b/g/b/i/l/m
    //   1142: astore #22
    //   1144: aload #22
    //   1146: getfield b : Lb/g/b/i/d;
    //   1149: getfield X : I
    //   1152: bipush #8
    //   1154: if_icmpne -> 1160
    //   1157: goto -> 1242
    //   1160: iload #5
    //   1162: istore #7
    //   1164: iload #6
    //   1166: ifle -> 1193
    //   1169: iload #5
    //   1171: istore #7
    //   1173: iload #6
    //   1175: iload #13
    //   1177: if_icmplt -> 1193
    //   1180: iload #5
    //   1182: aload #22
    //   1184: getfield h : Lb/g/b/i/l/f;
    //   1187: getfield f : I
    //   1190: iadd
    //   1191: istore #7
    //   1193: iload #7
    //   1195: aload #22
    //   1197: getfield e : Lb/g/b/i/l/g;
    //   1200: getfield g : I
    //   1203: iadd
    //   1204: istore #7
    //   1206: iload #7
    //   1208: istore #5
    //   1210: iload #6
    //   1212: iload #18
    //   1214: if_icmpge -> 1242
    //   1217: iload #7
    //   1219: istore #5
    //   1221: iload #6
    //   1223: iload #14
    //   1225: if_icmpge -> 1242
    //   1228: iload #7
    //   1230: aload #22
    //   1232: getfield i : Lb/g/b/i/l/f;
    //   1235: getfield f : I
    //   1238: ineg
    //   1239: iadd
    //   1240: istore #5
    //   1242: iinc #6, 1
    //   1245: goto -> 1123
    //   1248: iload #9
    //   1250: istore #6
    //   1252: goto -> 1259
    //   1255: iload #7
    //   1257: istore #5
    //   1259: aload_0
    //   1260: getfield l : I
    //   1263: iconst_2
    //   1264: if_icmpne -> 1292
    //   1267: iload #8
    //   1269: ifne -> 1292
    //   1272: aload_0
    //   1273: iconst_0
    //   1274: putfield l : I
    //   1277: iload #6
    //   1279: istore #7
    //   1281: iload #5
    //   1283: istore #8
    //   1285: iload #10
    //   1287: istore #5
    //   1289: goto -> 1315
    //   1292: iload #6
    //   1294: istore #7
    //   1296: iload #5
    //   1298: istore #8
    //   1300: iload #10
    //   1302: istore #5
    //   1304: goto -> 1315
    //   1307: iload #7
    //   1309: istore #8
    //   1311: iload #6
    //   1313: istore #7
    //   1315: iload #8
    //   1317: iload #20
    //   1319: if_icmple -> 1327
    //   1322: aload_0
    //   1323: iconst_2
    //   1324: putfield l : I
    //   1327: iload #15
    //   1329: ifle -> 1349
    //   1332: iload #7
    //   1334: ifne -> 1349
    //   1337: iload #13
    //   1339: iload #14
    //   1341: if_icmpne -> 1349
    //   1344: aload_0
    //   1345: iconst_2
    //   1346: putfield l : I
    //   1349: aload_0
    //   1350: getfield l : I
    //   1353: istore #6
    //   1355: iload #6
    //   1357: iconst_1
    //   1358: if_icmpne -> 1785
    //   1361: iload #15
    //   1363: iconst_1
    //   1364: if_icmple -> 1382
    //   1367: iload #20
    //   1369: iload #8
    //   1371: isub
    //   1372: iload #15
    //   1374: iconst_1
    //   1375: isub
    //   1376: idiv
    //   1377: istore #6
    //   1379: goto -> 1403
    //   1382: iload #15
    //   1384: iconst_1
    //   1385: if_icmpne -> 1400
    //   1388: iload #20
    //   1390: iload #8
    //   1392: isub
    //   1393: iconst_2
    //   1394: idiv
    //   1395: istore #6
    //   1397: goto -> 1403
    //   1400: iconst_0
    //   1401: istore #6
    //   1403: iload #6
    //   1405: istore #8
    //   1407: iload #7
    //   1409: ifle -> 1415
    //   1412: iconst_0
    //   1413: istore #8
    //   1415: iconst_0
    //   1416: istore #6
    //   1418: iload #5
    //   1420: istore #7
    //   1422: iload #6
    //   1424: iload #19
    //   1426: if_icmpge -> 2566
    //   1429: iload #21
    //   1431: ifeq -> 1446
    //   1434: iload #19
    //   1436: iload #6
    //   1438: iconst_1
    //   1439: iadd
    //   1440: isub
    //   1441: istore #5
    //   1443: goto -> 1450
    //   1446: iload #6
    //   1448: istore #5
    //   1450: aload_0
    //   1451: getfield k : Ljava/util/ArrayList;
    //   1454: iload #5
    //   1456: invokevirtual get : (I)Ljava/lang/Object;
    //   1459: checkcast b/g/b/i/l/m
    //   1462: astore #23
    //   1464: aload #23
    //   1466: getfield b : Lb/g/b/i/d;
    //   1469: getfield X : I
    //   1472: bipush #8
    //   1474: if_icmpne -> 1504
    //   1477: aload #23
    //   1479: getfield h : Lb/g/b/i/l/f;
    //   1482: iload #7
    //   1484: invokevirtual c : (I)V
    //   1487: aload #23
    //   1489: getfield i : Lb/g/b/i/l/f;
    //   1492: iload #7
    //   1494: invokevirtual c : (I)V
    //   1497: iload #7
    //   1499: istore #5
    //   1501: goto -> 1775
    //   1504: iload #7
    //   1506: istore #5
    //   1508: iload #6
    //   1510: ifle -> 1535
    //   1513: iload #21
    //   1515: ifeq -> 1528
    //   1518: iload #7
    //   1520: iload #8
    //   1522: isub
    //   1523: istore #5
    //   1525: goto -> 1535
    //   1528: iload #7
    //   1530: iload #8
    //   1532: iadd
    //   1533: istore #5
    //   1535: iload #5
    //   1537: istore #7
    //   1539: iload #6
    //   1541: ifle -> 1587
    //   1544: iload #5
    //   1546: istore #7
    //   1548: iload #6
    //   1550: iload #13
    //   1552: if_icmplt -> 1587
    //   1555: aload #23
    //   1557: getfield h : Lb/g/b/i/l/f;
    //   1560: getfield f : I
    //   1563: istore #7
    //   1565: iload #21
    //   1567: ifeq -> 1580
    //   1570: iload #5
    //   1572: iload #7
    //   1574: isub
    //   1575: istore #7
    //   1577: goto -> 1587
    //   1580: iload #5
    //   1582: iload #7
    //   1584: iadd
    //   1585: istore #7
    //   1587: iload #21
    //   1589: ifeq -> 1602
    //   1592: aload #23
    //   1594: getfield i : Lb/g/b/i/l/f;
    //   1597: astore #22
    //   1599: goto -> 1609
    //   1602: aload #23
    //   1604: getfield h : Lb/g/b/i/l/f;
    //   1607: astore #22
    //   1609: aload #22
    //   1611: iload #7
    //   1613: invokevirtual c : (I)V
    //   1616: aload #23
    //   1618: getfield e : Lb/g/b/i/l/g;
    //   1621: astore #22
    //   1623: aload #22
    //   1625: getfield g : I
    //   1628: istore #9
    //   1630: iload #9
    //   1632: istore #5
    //   1634: aload #23
    //   1636: getfield d : Lb/g/b/i/d$a;
    //   1639: aload_1
    //   1640: if_acmpne -> 1663
    //   1643: iload #9
    //   1645: istore #5
    //   1647: aload #23
    //   1649: getfield a : I
    //   1652: iconst_1
    //   1653: if_icmpne -> 1663
    //   1656: aload #22
    //   1658: getfield m : I
    //   1661: istore #5
    //   1663: iload #21
    //   1665: ifeq -> 1678
    //   1668: iload #7
    //   1670: iload #5
    //   1672: isub
    //   1673: istore #7
    //   1675: goto -> 1685
    //   1678: iload #7
    //   1680: iload #5
    //   1682: iadd
    //   1683: istore #7
    //   1685: iload #21
    //   1687: ifeq -> 1700
    //   1690: aload #23
    //   1692: getfield h : Lb/g/b/i/l/f;
    //   1695: astore #22
    //   1697: goto -> 1707
    //   1700: aload #23
    //   1702: getfield i : Lb/g/b/i/l/f;
    //   1705: astore #22
    //   1707: aload #22
    //   1709: iload #7
    //   1711: invokevirtual c : (I)V
    //   1714: aload #23
    //   1716: iconst_1
    //   1717: putfield g : Z
    //   1720: iload #7
    //   1722: istore #5
    //   1724: iload #6
    //   1726: iload #18
    //   1728: if_icmpge -> 1775
    //   1731: iload #7
    //   1733: istore #5
    //   1735: iload #6
    //   1737: iload #14
    //   1739: if_icmpge -> 1775
    //   1742: aload #23
    //   1744: getfield i : Lb/g/b/i/l/f;
    //   1747: getfield f : I
    //   1750: ineg
    //   1751: istore #5
    //   1753: iload #21
    //   1755: ifeq -> 1768
    //   1758: iload #7
    //   1760: iload #5
    //   1762: isub
    //   1763: istore #5
    //   1765: goto -> 1775
    //   1768: iload #7
    //   1770: iload #5
    //   1772: iadd
    //   1773: istore #5
    //   1775: iinc #6, 1
    //   1778: iload #5
    //   1780: istore #7
    //   1782: goto -> 1422
    //   1785: iload #6
    //   1787: ifne -> 2158
    //   1790: iload #20
    //   1792: iload #8
    //   1794: isub
    //   1795: iload #15
    //   1797: iconst_1
    //   1798: iadd
    //   1799: idiv
    //   1800: istore #8
    //   1802: iload #7
    //   1804: ifle -> 1810
    //   1807: iconst_0
    //   1808: istore #8
    //   1810: iconst_0
    //   1811: istore #6
    //   1813: iload #6
    //   1815: iload #19
    //   1817: if_icmpge -> 2566
    //   1820: iload #21
    //   1822: ifeq -> 1837
    //   1825: iload #19
    //   1827: iload #6
    //   1829: iconst_1
    //   1830: iadd
    //   1831: isub
    //   1832: istore #7
    //   1834: goto -> 1841
    //   1837: iload #6
    //   1839: istore #7
    //   1841: aload_0
    //   1842: getfield k : Ljava/util/ArrayList;
    //   1845: iload #7
    //   1847: invokevirtual get : (I)Ljava/lang/Object;
    //   1850: checkcast b/g/b/i/l/m
    //   1853: astore #23
    //   1855: aload #23
    //   1857: getfield b : Lb/g/b/i/d;
    //   1860: getfield X : I
    //   1863: bipush #8
    //   1865: if_icmpne -> 1891
    //   1868: aload #23
    //   1870: getfield h : Lb/g/b/i/l/f;
    //   1873: iload #5
    //   1875: invokevirtual c : (I)V
    //   1878: aload #23
    //   1880: getfield i : Lb/g/b/i/l/f;
    //   1883: iload #5
    //   1885: invokevirtual c : (I)V
    //   1888: goto -> 2152
    //   1891: iload #21
    //   1893: ifeq -> 1906
    //   1896: iload #5
    //   1898: iload #8
    //   1900: isub
    //   1901: istore #7
    //   1903: goto -> 1913
    //   1906: iload #5
    //   1908: iload #8
    //   1910: iadd
    //   1911: istore #7
    //   1913: iload #7
    //   1915: istore #5
    //   1917: iload #6
    //   1919: ifle -> 1965
    //   1922: iload #7
    //   1924: istore #5
    //   1926: iload #6
    //   1928: iload #13
    //   1930: if_icmplt -> 1965
    //   1933: aload #23
    //   1935: getfield h : Lb/g/b/i/l/f;
    //   1938: getfield f : I
    //   1941: istore #5
    //   1943: iload #21
    //   1945: ifeq -> 1958
    //   1948: iload #7
    //   1950: iload #5
    //   1952: isub
    //   1953: istore #5
    //   1955: goto -> 1965
    //   1958: iload #7
    //   1960: iload #5
    //   1962: iadd
    //   1963: istore #5
    //   1965: iload #21
    //   1967: ifeq -> 1980
    //   1970: aload #23
    //   1972: getfield i : Lb/g/b/i/l/f;
    //   1975: astore #22
    //   1977: goto -> 1987
    //   1980: aload #23
    //   1982: getfield h : Lb/g/b/i/l/f;
    //   1985: astore #22
    //   1987: aload #22
    //   1989: iload #5
    //   1991: invokevirtual c : (I)V
    //   1994: aload #23
    //   1996: getfield e : Lb/g/b/i/l/g;
    //   1999: astore #22
    //   2001: aload #22
    //   2003: getfield g : I
    //   2006: istore #9
    //   2008: iload #9
    //   2010: istore #7
    //   2012: aload #23
    //   2014: getfield d : Lb/g/b/i/d$a;
    //   2017: aload_1
    //   2018: if_acmpne -> 2046
    //   2021: iload #9
    //   2023: istore #7
    //   2025: aload #23
    //   2027: getfield a : I
    //   2030: iconst_1
    //   2031: if_icmpne -> 2046
    //   2034: iload #9
    //   2036: aload #22
    //   2038: getfield m : I
    //   2041: invokestatic min : (II)I
    //   2044: istore #7
    //   2046: iload #21
    //   2048: ifeq -> 2061
    //   2051: iload #5
    //   2053: iload #7
    //   2055: isub
    //   2056: istore #7
    //   2058: goto -> 2068
    //   2061: iload #5
    //   2063: iload #7
    //   2065: iadd
    //   2066: istore #7
    //   2068: iload #21
    //   2070: ifeq -> 2083
    //   2073: aload #23
    //   2075: getfield h : Lb/g/b/i/l/f;
    //   2078: astore #22
    //   2080: goto -> 2090
    //   2083: aload #23
    //   2085: getfield i : Lb/g/b/i/l/f;
    //   2088: astore #22
    //   2090: aload #22
    //   2092: iload #7
    //   2094: invokevirtual c : (I)V
    //   2097: iload #7
    //   2099: istore #5
    //   2101: iload #6
    //   2103: iload #18
    //   2105: if_icmpge -> 2152
    //   2108: iload #7
    //   2110: istore #5
    //   2112: iload #6
    //   2114: iload #14
    //   2116: if_icmpge -> 2152
    //   2119: aload #23
    //   2121: getfield i : Lb/g/b/i/l/f;
    //   2124: getfield f : I
    //   2127: ineg
    //   2128: istore #5
    //   2130: iload #21
    //   2132: ifeq -> 2145
    //   2135: iload #7
    //   2137: iload #5
    //   2139: isub
    //   2140: istore #5
    //   2142: goto -> 2152
    //   2145: iload #7
    //   2147: iload #5
    //   2149: iadd
    //   2150: istore #5
    //   2152: iinc #6, 1
    //   2155: goto -> 1813
    //   2158: iload #6
    //   2160: iconst_2
    //   2161: if_icmpne -> 2566
    //   2164: aload_0
    //   2165: getfield f : I
    //   2168: ifne -> 2182
    //   2171: aload_0
    //   2172: getfield b : Lb/g/b/i/d;
    //   2175: getfield U : F
    //   2178: fstore_2
    //   2179: goto -> 2190
    //   2182: aload_0
    //   2183: getfield b : Lb/g/b/i/d;
    //   2186: getfield V : F
    //   2189: fstore_2
    //   2190: fload_2
    //   2191: fstore_3
    //   2192: iload #21
    //   2194: ifeq -> 2201
    //   2197: fconst_1
    //   2198: fload_2
    //   2199: fsub
    //   2200: fstore_3
    //   2201: iload #20
    //   2203: iload #8
    //   2205: isub
    //   2206: i2f
    //   2207: fload_3
    //   2208: fmul
    //   2209: ldc 0.5
    //   2211: fadd
    //   2212: f2i
    //   2213: istore #6
    //   2215: iload #6
    //   2217: iflt -> 2225
    //   2220: iload #7
    //   2222: ifle -> 2228
    //   2225: iconst_0
    //   2226: istore #6
    //   2228: iload #21
    //   2230: ifeq -> 2243
    //   2233: iload #5
    //   2235: iload #6
    //   2237: isub
    //   2238: istore #5
    //   2240: goto -> 2250
    //   2243: iload #5
    //   2245: iload #6
    //   2247: iadd
    //   2248: istore #5
    //   2250: iconst_0
    //   2251: istore #6
    //   2253: iload #6
    //   2255: iload #19
    //   2257: if_icmpge -> 2566
    //   2260: iload #21
    //   2262: ifeq -> 2277
    //   2265: iload #19
    //   2267: iload #6
    //   2269: iconst_1
    //   2270: iadd
    //   2271: isub
    //   2272: istore #7
    //   2274: goto -> 2281
    //   2277: iload #6
    //   2279: istore #7
    //   2281: aload_0
    //   2282: getfield k : Ljava/util/ArrayList;
    //   2285: iload #7
    //   2287: invokevirtual get : (I)Ljava/lang/Object;
    //   2290: checkcast b/g/b/i/l/m
    //   2293: astore #23
    //   2295: aload #23
    //   2297: getfield b : Lb/g/b/i/d;
    //   2300: getfield X : I
    //   2303: bipush #8
    //   2305: if_icmpne -> 2331
    //   2308: aload #23
    //   2310: getfield h : Lb/g/b/i/l/f;
    //   2313: iload #5
    //   2315: invokevirtual c : (I)V
    //   2318: aload #23
    //   2320: getfield i : Lb/g/b/i/l/f;
    //   2323: iload #5
    //   2325: invokevirtual c : (I)V
    //   2328: goto -> 2560
    //   2331: iload #5
    //   2333: istore #7
    //   2335: iload #6
    //   2337: ifle -> 2383
    //   2340: iload #5
    //   2342: istore #7
    //   2344: iload #6
    //   2346: iload #13
    //   2348: if_icmplt -> 2383
    //   2351: aload #23
    //   2353: getfield h : Lb/g/b/i/l/f;
    //   2356: getfield f : I
    //   2359: istore #7
    //   2361: iload #21
    //   2363: ifeq -> 2376
    //   2366: iload #5
    //   2368: iload #7
    //   2370: isub
    //   2371: istore #7
    //   2373: goto -> 2383
    //   2376: iload #5
    //   2378: iload #7
    //   2380: iadd
    //   2381: istore #7
    //   2383: iload #21
    //   2385: ifeq -> 2398
    //   2388: aload #23
    //   2390: getfield i : Lb/g/b/i/l/f;
    //   2393: astore #22
    //   2395: goto -> 2405
    //   2398: aload #23
    //   2400: getfield h : Lb/g/b/i/l/f;
    //   2403: astore #22
    //   2405: aload #22
    //   2407: iload #7
    //   2409: invokevirtual c : (I)V
    //   2412: aload #23
    //   2414: getfield e : Lb/g/b/i/l/g;
    //   2417: astore #22
    //   2419: aload #22
    //   2421: getfield g : I
    //   2424: istore #5
    //   2426: aload #23
    //   2428: getfield d : Lb/g/b/i/d$a;
    //   2431: aload_1
    //   2432: if_acmpne -> 2454
    //   2435: aload #23
    //   2437: getfield a : I
    //   2440: iconst_1
    //   2441: if_icmpne -> 2454
    //   2444: aload #22
    //   2446: getfield m : I
    //   2449: istore #5
    //   2451: goto -> 2454
    //   2454: iload #21
    //   2456: ifeq -> 2469
    //   2459: iload #7
    //   2461: iload #5
    //   2463: isub
    //   2464: istore #7
    //   2466: goto -> 2476
    //   2469: iload #7
    //   2471: iload #5
    //   2473: iadd
    //   2474: istore #7
    //   2476: iload #21
    //   2478: ifeq -> 2491
    //   2481: aload #23
    //   2483: getfield h : Lb/g/b/i/l/f;
    //   2486: astore #22
    //   2488: goto -> 2498
    //   2491: aload #23
    //   2493: getfield i : Lb/g/b/i/l/f;
    //   2496: astore #22
    //   2498: aload #22
    //   2500: iload #7
    //   2502: invokevirtual c : (I)V
    //   2505: iload #7
    //   2507: istore #5
    //   2509: iload #6
    //   2511: iload #18
    //   2513: if_icmpge -> 2560
    //   2516: iload #7
    //   2518: istore #5
    //   2520: iload #6
    //   2522: iload #14
    //   2524: if_icmpge -> 2560
    //   2527: aload #23
    //   2529: getfield i : Lb/g/b/i/l/f;
    //   2532: getfield f : I
    //   2535: ineg
    //   2536: istore #5
    //   2538: iload #21
    //   2540: ifeq -> 2553
    //   2543: iload #7
    //   2545: iload #5
    //   2547: isub
    //   2548: istore #5
    //   2550: goto -> 2560
    //   2553: iload #7
    //   2555: iload #5
    //   2557: iadd
    //   2558: istore #5
    //   2560: iinc #6, 1
    //   2563: goto -> 2253
    //   2566: return
  }
  
  public void d() {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Ljava/util/ArrayList;
    //   4: invokevirtual iterator : ()Ljava/util/Iterator;
    //   7: astore_2
    //   8: aload_2
    //   9: invokeinterface hasNext : ()Z
    //   14: ifeq -> 32
    //   17: aload_2
    //   18: invokeinterface next : ()Ljava/lang/Object;
    //   23: checkcast b/g/b/i/l/m
    //   26: invokevirtual d : ()V
    //   29: goto -> 8
    //   32: aload_0
    //   33: getfield k : Ljava/util/ArrayList;
    //   36: invokevirtual size : ()I
    //   39: istore_1
    //   40: iload_1
    //   41: iconst_1
    //   42: if_icmpge -> 46
    //   45: return
    //   46: aload_0
    //   47: getfield k : Ljava/util/ArrayList;
    //   50: iconst_0
    //   51: invokevirtual get : (I)Ljava/lang/Object;
    //   54: checkcast b/g/b/i/l/m
    //   57: getfield b : Lb/g/b/i/d;
    //   60: astore_3
    //   61: aload_0
    //   62: getfield k : Ljava/util/ArrayList;
    //   65: iload_1
    //   66: iconst_1
    //   67: isub
    //   68: invokevirtual get : (I)Ljava/lang/Object;
    //   71: checkcast b/g/b/i/l/m
    //   74: getfield b : Lb/g/b/i/d;
    //   77: astore_2
    //   78: aload_0
    //   79: getfield f : I
    //   82: ifne -> 241
    //   85: aload_3
    //   86: getfield y : Lb/g/b/i/c;
    //   89: astore #4
    //   91: aload_2
    //   92: getfield A : Lb/g/b/i/c;
    //   95: astore_3
    //   96: aload_0
    //   97: aload #4
    //   99: iconst_0
    //   100: invokevirtual i : (Lb/g/b/i/c;I)Lb/g/b/i/l/f;
    //   103: astore_2
    //   104: aload #4
    //   106: invokevirtual b : ()I
    //   109: istore_1
    //   110: aload_0
    //   111: invokevirtual m : ()Lb/g/b/i/d;
    //   114: astore #4
    //   116: aload #4
    //   118: ifnull -> 130
    //   121: aload #4
    //   123: getfield y : Lb/g/b/i/c;
    //   126: invokevirtual b : ()I
    //   129: istore_1
    //   130: aload_2
    //   131: ifnull -> 170
    //   134: aload_0
    //   135: getfield h : Lb/g/b/i/l/f;
    //   138: astore #4
    //   140: aload #4
    //   142: getfield l : Ljava/util/List;
    //   145: aload_2
    //   146: invokeinterface add : (Ljava/lang/Object;)Z
    //   151: pop
    //   152: aload #4
    //   154: iload_1
    //   155: putfield f : I
    //   158: aload_2
    //   159: getfield k : Ljava/util/List;
    //   162: aload #4
    //   164: invokeinterface add : (Ljava/lang/Object;)Z
    //   169: pop
    //   170: aload_0
    //   171: aload_3
    //   172: iconst_0
    //   173: invokevirtual i : (Lb/g/b/i/c;I)Lb/g/b/i/l/f;
    //   176: astore_2
    //   177: aload_3
    //   178: invokevirtual b : ()I
    //   181: istore_1
    //   182: aload_0
    //   183: invokevirtual n : ()Lb/g/b/i/d;
    //   186: astore_3
    //   187: aload_3
    //   188: ifnull -> 199
    //   191: aload_3
    //   192: getfield A : Lb/g/b/i/c;
    //   195: invokevirtual b : ()I
    //   198: istore_1
    //   199: aload_2
    //   200: ifnull -> 362
    //   203: aload_0
    //   204: getfield i : Lb/g/b/i/l/f;
    //   207: astore_3
    //   208: iload_1
    //   209: ineg
    //   210: istore_1
    //   211: aload_3
    //   212: getfield l : Ljava/util/List;
    //   215: aload_2
    //   216: invokeinterface add : (Ljava/lang/Object;)Z
    //   221: pop
    //   222: aload_3
    //   223: iload_1
    //   224: putfield f : I
    //   227: aload_2
    //   228: getfield k : Ljava/util/List;
    //   231: aload_3
    //   232: invokeinterface add : (Ljava/lang/Object;)Z
    //   237: pop
    //   238: goto -> 362
    //   241: aload_3
    //   242: getfield z : Lb/g/b/i/c;
    //   245: astore #4
    //   247: aload_2
    //   248: getfield B : Lb/g/b/i/c;
    //   251: astore_3
    //   252: aload_0
    //   253: aload #4
    //   255: iconst_1
    //   256: invokevirtual i : (Lb/g/b/i/c;I)Lb/g/b/i/l/f;
    //   259: astore_2
    //   260: aload #4
    //   262: invokevirtual b : ()I
    //   265: istore_1
    //   266: aload_0
    //   267: invokevirtual m : ()Lb/g/b/i/d;
    //   270: astore #4
    //   272: aload #4
    //   274: ifnull -> 286
    //   277: aload #4
    //   279: getfield z : Lb/g/b/i/c;
    //   282: invokevirtual b : ()I
    //   285: istore_1
    //   286: aload_2
    //   287: ifnull -> 326
    //   290: aload_0
    //   291: getfield h : Lb/g/b/i/l/f;
    //   294: astore #4
    //   296: aload #4
    //   298: getfield l : Ljava/util/List;
    //   301: aload_2
    //   302: invokeinterface add : (Ljava/lang/Object;)Z
    //   307: pop
    //   308: aload #4
    //   310: iload_1
    //   311: putfield f : I
    //   314: aload_2
    //   315: getfield k : Ljava/util/List;
    //   318: aload #4
    //   320: invokeinterface add : (Ljava/lang/Object;)Z
    //   325: pop
    //   326: aload_0
    //   327: aload_3
    //   328: iconst_1
    //   329: invokevirtual i : (Lb/g/b/i/c;I)Lb/g/b/i/l/f;
    //   332: astore_2
    //   333: aload_3
    //   334: invokevirtual b : ()I
    //   337: istore_1
    //   338: aload_0
    //   339: invokevirtual n : ()Lb/g/b/i/d;
    //   342: astore_3
    //   343: aload_3
    //   344: ifnull -> 355
    //   347: aload_3
    //   348: getfield B : Lb/g/b/i/c;
    //   351: invokevirtual b : ()I
    //   354: istore_1
    //   355: aload_2
    //   356: ifnull -> 362
    //   359: goto -> 203
    //   362: aload_0
    //   363: getfield h : Lb/g/b/i/l/f;
    //   366: aload_0
    //   367: putfield a : Lb/g/b/i/l/d;
    //   370: aload_0
    //   371: getfield i : Lb/g/b/i/l/f;
    //   374: aload_0
    //   375: putfield a : Lb/g/b/i/l/d;
    //   378: return
  }
  
  public void e() {
    for (byte b = 0; b < this.k.size(); b++)
      ((m)this.k.get(b)).e(); 
  }
  
  public void f() {
    this.c = null;
    Iterator<m> iterator = this.k.iterator();
    while (iterator.hasNext())
      ((m)iterator.next()).f(); 
  }
  
  public long j() {
    int i = this.k.size();
    long l = 0L;
    for (byte b = 0; b < i; b++) {
      m m1 = this.k.get(b);
      long l2 = m1.h.f;
      long l1 = m1.j();
      l = m1.i.f + l1 + l + l2;
    } 
    return l;
  }
  
  public boolean k() {
    int i = this.k.size();
    for (byte b = 0; b < i; b++) {
      if (!((m)this.k.get(b)).k())
        return false; 
    } 
    return true;
  }
  
  public final d m() {
    for (byte b = 0; b < this.k.size(); b++) {
      d d = ((m)this.k.get(b)).b;
      if (d.X != 8)
        return d; 
    } 
    return null;
  }
  
  public final d n() {
    for (int i = this.k.size() - 1; i >= 0; i--) {
      d d = ((m)this.k.get(i)).b;
      if (d.X != 8)
        return d; 
    } 
    return null;
  }
  
  public String toString() {
    StringBuilder stringBuilder = a.e("ChainRun ");
    if (this.f == 0) {
      str = "horizontal : ";
    } else {
      str = "vertical : ";
    } 
    stringBuilder.append(str);
    String str = stringBuilder.toString();
    for (m m1 : this.k) {
      String str1 = a.c(str, "<");
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str1);
      stringBuilder1.append(m1);
      str = a.c(stringBuilder1.toString(), "> ");
    } 
    return str;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\l\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */