package b.g.b.i;

import a.a.a.a.a;
import b.g.b.d;
import b.g.b.i.l.b;
import b.g.b.i.l.e;
import java.util.Arrays;

public class e extends k {
  public b g0 = new b(this);
  
  public e h0 = new e(this);
  
  public b.b i0 = null;
  
  public boolean j0 = false;
  
  public d k0 = new d();
  
  public int l0;
  
  public int m0;
  
  public int n0 = 0;
  
  public int o0 = 0;
  
  public b[] p0 = new b[4];
  
  public b[] q0 = new b[4];
  
  public int r0 = 263;
  
  public boolean s0 = false;
  
  public boolean t0 = false;
  
  public void C(boolean paramBoolean1, boolean paramBoolean2) {
    super.C(paramBoolean1, paramBoolean2);
    int i = this.f0.size();
    for (byte b1 = 0; b1 < i; b1++)
      ((d)this.f0.get(b1)).C(paramBoolean1, paramBoolean2); 
  }
  
  public void E() {
    // Byte code:
    //   0: getstatic b/g/b/i/d$a.b : Lb/g/b/i/d$a;
    //   3: astore #13
    //   5: getstatic b/g/b/i/d$a.c : Lb/g/b/i/d$a;
    //   8: astore #15
    //   10: aload_0
    //   11: iconst_0
    //   12: putfield P : I
    //   15: aload_0
    //   16: iconst_0
    //   17: putfield Q : I
    //   20: iconst_0
    //   21: aload_0
    //   22: invokevirtual o : ()I
    //   25: invokestatic max : (II)I
    //   28: istore #10
    //   30: iconst_0
    //   31: aload_0
    //   32: invokevirtual i : ()I
    //   35: invokestatic max : (II)I
    //   38: istore #9
    //   40: aload_0
    //   41: iconst_0
    //   42: putfield s0 : Z
    //   45: aload_0
    //   46: iconst_0
    //   47: putfield t0 : Z
    //   50: aload_0
    //   51: getfield r0 : I
    //   54: bipush #64
    //   56: iand
    //   57: bipush #64
    //   59: if_icmpne -> 67
    //   62: iconst_1
    //   63: istore_1
    //   64: goto -> 69
    //   67: iconst_0
    //   68: istore_1
    //   69: iload_1
    //   70: ifne -> 106
    //   73: aload_0
    //   74: getfield r0 : I
    //   77: sipush #128
    //   80: iand
    //   81: sipush #128
    //   84: if_icmpne -> 92
    //   87: iconst_1
    //   88: istore_1
    //   89: goto -> 94
    //   92: iconst_0
    //   93: istore_1
    //   94: iload_1
    //   95: ifeq -> 101
    //   98: goto -> 106
    //   101: iconst_0
    //   102: istore_1
    //   103: goto -> 108
    //   106: iconst_1
    //   107: istore_1
    //   108: aload_0
    //   109: getfield k0 : Lb/g/b/d;
    //   112: astore #12
    //   114: aload #12
    //   116: iconst_0
    //   117: putfield g : Z
    //   120: aload #12
    //   122: iconst_0
    //   123: putfield h : Z
    //   126: aload_0
    //   127: getfield r0 : I
    //   130: ifeq -> 143
    //   133: iload_1
    //   134: ifeq -> 143
    //   137: aload #12
    //   139: iconst_1
    //   140: putfield h : Z
    //   143: aload_0
    //   144: getfield J : [Lb/g/b/i/d$a;
    //   147: astore #12
    //   149: aload #12
    //   151: iconst_1
    //   152: aaload
    //   153: astore #14
    //   155: aload #12
    //   157: iconst_0
    //   158: aaload
    //   159: astore #16
    //   161: aload_0
    //   162: getfield f0 : Ljava/util/ArrayList;
    //   165: astore #17
    //   167: aload_0
    //   168: invokevirtual j : ()Lb/g/b/i/d$a;
    //   171: aload #15
    //   173: if_acmpeq -> 193
    //   176: aload_0
    //   177: invokevirtual n : ()Lb/g/b/i/d$a;
    //   180: aload #15
    //   182: if_acmpne -> 188
    //   185: goto -> 193
    //   188: iconst_0
    //   189: istore_2
    //   190: goto -> 195
    //   193: iconst_1
    //   194: istore_2
    //   195: aload_0
    //   196: iconst_0
    //   197: putfield n0 : I
    //   200: aload_0
    //   201: iconst_0
    //   202: putfield o0 : I
    //   205: aload_0
    //   206: getfield f0 : Ljava/util/ArrayList;
    //   209: invokevirtual size : ()I
    //   212: istore #11
    //   214: iconst_0
    //   215: istore_1
    //   216: iload_1
    //   217: iload #11
    //   219: if_icmpge -> 257
    //   222: aload_0
    //   223: getfield f0 : Ljava/util/ArrayList;
    //   226: iload_1
    //   227: invokevirtual get : (I)Ljava/lang/Object;
    //   230: checkcast b/g/b/i/d
    //   233: astore #12
    //   235: aload #12
    //   237: instanceof b/g/b/i/k
    //   240: ifeq -> 251
    //   243: aload #12
    //   245: checkcast b/g/b/i/k
    //   248: invokevirtual E : ()V
    //   251: iinc #1, 1
    //   254: goto -> 216
    //   257: iconst_0
    //   258: istore #5
    //   260: iconst_1
    //   261: istore_3
    //   262: iconst_0
    //   263: istore_1
    //   264: iload_3
    //   265: ifeq -> 1074
    //   268: iload #5
    //   270: iconst_1
    //   271: iadd
    //   272: istore #8
    //   274: aload_0
    //   275: getfield k0 : Lb/g/b/d;
    //   278: invokevirtual t : ()V
    //   281: aload_0
    //   282: iconst_0
    //   283: putfield n0 : I
    //   286: aload_0
    //   287: iconst_0
    //   288: putfield o0 : I
    //   291: aload_0
    //   292: aload_0
    //   293: getfield k0 : Lb/g/b/d;
    //   296: invokevirtual e : (Lb/g/b/d;)V
    //   299: iconst_0
    //   300: istore #4
    //   302: iload #4
    //   304: iload #11
    //   306: if_icmpge -> 334
    //   309: aload_0
    //   310: getfield f0 : Ljava/util/ArrayList;
    //   313: iload #4
    //   315: invokevirtual get : (I)Ljava/lang/Object;
    //   318: checkcast b/g/b/i/d
    //   321: aload_0
    //   322: getfield k0 : Lb/g/b/d;
    //   325: invokevirtual e : (Lb/g/b/d;)V
    //   328: iinc #4, 1
    //   331: goto -> 302
    //   334: aload_0
    //   335: aload_0
    //   336: getfield k0 : Lb/g/b/d;
    //   339: invokevirtual G : (Lb/g/b/d;)Z
    //   342: pop
    //   343: aload_0
    //   344: getfield k0 : Lb/g/b/d;
    //   347: astore #12
    //   349: aload #12
    //   351: getfield g : Z
    //   354: ifne -> 365
    //   357: aload #12
    //   359: getfield h : Z
    //   362: ifeq -> 406
    //   365: iconst_0
    //   366: istore_3
    //   367: iload_3
    //   368: aload #12
    //   370: getfield k : I
    //   373: if_icmpge -> 400
    //   376: aload #12
    //   378: getfield f : [Lb/g/b/b;
    //   381: iload_3
    //   382: aaload
    //   383: getfield f : Z
    //   386: ifne -> 394
    //   389: iconst_0
    //   390: istore_3
    //   391: goto -> 402
    //   394: iinc #3, 1
    //   397: goto -> 367
    //   400: iconst_1
    //   401: istore_3
    //   402: iload_3
    //   403: ifne -> 419
    //   406: aload #12
    //   408: aload #12
    //   410: getfield c : Lb/g/b/d$a;
    //   413: invokevirtual q : (Lb/g/b/d$a;)V
    //   416: goto -> 424
    //   419: aload #12
    //   421: invokevirtual j : ()V
    //   424: iconst_1
    //   425: istore_3
    //   426: goto -> 483
    //   429: astore #12
    //   431: iconst_1
    //   432: istore_3
    //   433: goto -> 438
    //   436: astore #12
    //   438: aload #12
    //   440: invokevirtual printStackTrace : ()V
    //   443: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   446: astore #19
    //   448: new java/lang/StringBuilder
    //   451: dup
    //   452: invokespecial <init> : ()V
    //   455: astore #18
    //   457: aload #18
    //   459: ldc 'EXCEPTION : '
    //   461: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   464: pop
    //   465: aload #18
    //   467: aload #12
    //   469: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   472: pop
    //   473: aload #19
    //   475: aload #18
    //   477: invokevirtual toString : ()Ljava/lang/String;
    //   480: invokevirtual println : (Ljava/lang/String;)V
    //   483: iload_3
    //   484: ifeq -> 544
    //   487: aload_0
    //   488: getfield k0 : Lb/g/b/d;
    //   491: astore #12
    //   493: getstatic b/g/b/i/i.a : [Z
    //   496: iconst_2
    //   497: iconst_0
    //   498: bastore
    //   499: aload_0
    //   500: aload #12
    //   502: invokevirtual D : (Lb/g/b/d;)V
    //   505: aload_0
    //   506: getfield f0 : Ljava/util/ArrayList;
    //   509: invokevirtual size : ()I
    //   512: istore #4
    //   514: iconst_0
    //   515: istore_3
    //   516: iload_3
    //   517: iload #4
    //   519: if_icmpge -> 584
    //   522: aload_0
    //   523: getfield f0 : Ljava/util/ArrayList;
    //   526: iload_3
    //   527: invokevirtual get : (I)Ljava/lang/Object;
    //   530: checkcast b/g/b/i/d
    //   533: aload #12
    //   535: invokevirtual D : (Lb/g/b/d;)V
    //   538: iinc #3, 1
    //   541: goto -> 516
    //   544: aload_0
    //   545: aload_0
    //   546: getfield k0 : Lb/g/b/d;
    //   549: invokevirtual D : (Lb/g/b/d;)V
    //   552: iconst_0
    //   553: istore_3
    //   554: iload_3
    //   555: iload #11
    //   557: if_icmpge -> 584
    //   560: aload_0
    //   561: getfield f0 : Ljava/util/ArrayList;
    //   564: iload_3
    //   565: invokevirtual get : (I)Ljava/lang/Object;
    //   568: checkcast b/g/b/i/d
    //   571: aload_0
    //   572: getfield k0 : Lb/g/b/d;
    //   575: invokevirtual D : (Lb/g/b/d;)V
    //   578: iinc #3, 1
    //   581: goto -> 554
    //   584: iload_2
    //   585: ifeq -> 804
    //   588: iload #8
    //   590: bipush #8
    //   592: if_icmpge -> 804
    //   595: getstatic b/g/b/i/i.a : [Z
    //   598: iconst_2
    //   599: baload
    //   600: ifeq -> 804
    //   603: iconst_0
    //   604: istore #4
    //   606: iconst_0
    //   607: istore #5
    //   609: iconst_0
    //   610: istore_3
    //   611: iload #4
    //   613: iload #11
    //   615: if_icmpge -> 680
    //   618: aload_0
    //   619: getfield f0 : Ljava/util/ArrayList;
    //   622: iload #4
    //   624: invokevirtual get : (I)Ljava/lang/Object;
    //   627: checkcast b/g/b/i/d
    //   630: astore #12
    //   632: aload #12
    //   634: getfield P : I
    //   637: istore #6
    //   639: iload #5
    //   641: aload #12
    //   643: invokevirtual o : ()I
    //   646: iload #6
    //   648: iadd
    //   649: invokestatic max : (II)I
    //   652: istore #5
    //   654: aload #12
    //   656: getfield Q : I
    //   659: istore #6
    //   661: iload_3
    //   662: aload #12
    //   664: invokevirtual i : ()I
    //   667: iload #6
    //   669: iadd
    //   670: invokestatic max : (II)I
    //   673: istore_3
    //   674: iinc #4, 1
    //   677: goto -> 611
    //   680: iload_2
    //   681: istore #6
    //   683: aload_0
    //   684: getfield S : I
    //   687: iload #5
    //   689: invokestatic max : (II)I
    //   692: istore_2
    //   693: aload_0
    //   694: getfield T : I
    //   697: iload_3
    //   698: invokestatic max : (II)I
    //   701: istore #7
    //   703: aload #16
    //   705: aload #15
    //   707: if_acmpne -> 740
    //   710: aload_0
    //   711: invokevirtual o : ()I
    //   714: iload_2
    //   715: if_icmpge -> 740
    //   718: aload_0
    //   719: iload_2
    //   720: invokevirtual B : (I)V
    //   723: aload_0
    //   724: getfield J : [Lb/g/b/i/d$a;
    //   727: iconst_0
    //   728: aload #15
    //   730: aastore
    //   731: iconst_1
    //   732: istore #4
    //   734: iconst_1
    //   735: istore #5
    //   737: goto -> 746
    //   740: iconst_0
    //   741: istore #4
    //   743: iload_1
    //   744: istore #5
    //   746: iload #4
    //   748: istore_2
    //   749: iload #5
    //   751: istore_1
    //   752: iload #6
    //   754: istore_3
    //   755: aload #14
    //   757: aload #15
    //   759: if_acmpne -> 812
    //   762: iload #4
    //   764: istore_2
    //   765: iload #5
    //   767: istore_1
    //   768: iload #6
    //   770: istore_3
    //   771: aload_0
    //   772: invokevirtual i : ()I
    //   775: iload #7
    //   777: if_icmpge -> 812
    //   780: aload_0
    //   781: iload #7
    //   783: invokevirtual w : (I)V
    //   786: aload_0
    //   787: getfield J : [Lb/g/b/i/d$a;
    //   790: iconst_1
    //   791: aload #15
    //   793: aastore
    //   794: iconst_1
    //   795: istore_2
    //   796: iconst_1
    //   797: istore_1
    //   798: iload #6
    //   800: istore_3
    //   801: goto -> 812
    //   804: iconst_0
    //   805: istore #4
    //   807: iload_2
    //   808: istore_3
    //   809: iload #4
    //   811: istore_2
    //   812: aload_0
    //   813: getfield S : I
    //   816: aload_0
    //   817: invokevirtual o : ()I
    //   820: invokestatic max : (II)I
    //   823: istore #5
    //   825: iload_2
    //   826: istore #4
    //   828: iload #5
    //   830: aload_0
    //   831: invokevirtual o : ()I
    //   834: if_icmple -> 856
    //   837: aload_0
    //   838: iload #5
    //   840: invokevirtual B : (I)V
    //   843: aload_0
    //   844: getfield J : [Lb/g/b/i/d$a;
    //   847: iconst_0
    //   848: aload #13
    //   850: aastore
    //   851: iconst_1
    //   852: istore #4
    //   854: iconst_1
    //   855: istore_1
    //   856: aload_0
    //   857: getfield T : I
    //   860: aload_0
    //   861: invokevirtual i : ()I
    //   864: invokestatic max : (II)I
    //   867: istore_2
    //   868: iload_2
    //   869: aload_0
    //   870: invokevirtual i : ()I
    //   873: if_icmple -> 896
    //   876: aload_0
    //   877: iload_2
    //   878: invokevirtual w : (I)V
    //   881: aload_0
    //   882: getfield J : [Lb/g/b/i/d$a;
    //   885: iconst_1
    //   886: aload #13
    //   888: aastore
    //   889: iconst_1
    //   890: istore_1
    //   891: iconst_1
    //   892: istore_2
    //   893: goto -> 901
    //   896: iload_1
    //   897: istore_2
    //   898: iload #4
    //   900: istore_1
    //   901: iload_1
    //   902: istore #6
    //   904: iload_2
    //   905: istore #4
    //   907: iload_2
    //   908: ifne -> 1055
    //   911: iload_1
    //   912: istore #7
    //   914: iload_2
    //   915: istore #5
    //   917: aload_0
    //   918: getfield J : [Lb/g/b/i/d$a;
    //   921: iconst_0
    //   922: aaload
    //   923: aload #15
    //   925: if_acmpne -> 979
    //   928: iload_1
    //   929: istore #7
    //   931: iload_2
    //   932: istore #5
    //   934: iload #10
    //   936: ifle -> 979
    //   939: iload_1
    //   940: istore #7
    //   942: iload_2
    //   943: istore #5
    //   945: aload_0
    //   946: invokevirtual o : ()I
    //   949: iload #10
    //   951: if_icmple -> 979
    //   954: aload_0
    //   955: iconst_1
    //   956: putfield s0 : Z
    //   959: aload_0
    //   960: getfield J : [Lb/g/b/i/d$a;
    //   963: iconst_0
    //   964: aload #13
    //   966: aastore
    //   967: aload_0
    //   968: iload #10
    //   970: invokevirtual B : (I)V
    //   973: iconst_1
    //   974: istore #7
    //   976: iconst_1
    //   977: istore #5
    //   979: iload #7
    //   981: istore #6
    //   983: iload #5
    //   985: istore #4
    //   987: aload_0
    //   988: getfield J : [Lb/g/b/i/d$a;
    //   991: iconst_1
    //   992: aaload
    //   993: aload #15
    //   995: if_acmpne -> 1055
    //   998: iload #7
    //   1000: istore #6
    //   1002: iload #5
    //   1004: istore #4
    //   1006: iload #9
    //   1008: ifle -> 1055
    //   1011: iload #7
    //   1013: istore #6
    //   1015: iload #5
    //   1017: istore #4
    //   1019: aload_0
    //   1020: invokevirtual i : ()I
    //   1023: iload #9
    //   1025: if_icmple -> 1055
    //   1028: aload_0
    //   1029: iconst_1
    //   1030: putfield t0 : Z
    //   1033: aload_0
    //   1034: getfield J : [Lb/g/b/i/d$a;
    //   1037: iconst_1
    //   1038: aload #13
    //   1040: aastore
    //   1041: aload_0
    //   1042: iload #9
    //   1044: invokevirtual w : (I)V
    //   1047: iconst_1
    //   1048: istore #4
    //   1050: iconst_1
    //   1051: istore_1
    //   1052: goto -> 1062
    //   1055: iload #4
    //   1057: istore_1
    //   1058: iload #6
    //   1060: istore #4
    //   1062: iload #8
    //   1064: istore #5
    //   1066: iload_3
    //   1067: istore_2
    //   1068: iload #4
    //   1070: istore_3
    //   1071: goto -> 264
    //   1074: aload_0
    //   1075: aload #17
    //   1077: putfield f0 : Ljava/util/ArrayList;
    //   1080: iload_1
    //   1081: ifeq -> 1102
    //   1084: aload_0
    //   1085: getfield J : [Lb/g/b/i/d$a;
    //   1088: astore #12
    //   1090: aload #12
    //   1092: iconst_0
    //   1093: aload #16
    //   1095: aastore
    //   1096: aload #12
    //   1098: iconst_1
    //   1099: aload #14
    //   1101: aastore
    //   1102: aload_0
    //   1103: aload_0
    //   1104: getfield k0 : Lb/g/b/d;
    //   1107: getfield m : Lb/g/b/c;
    //   1110: invokevirtual v : (Lb/g/b/c;)V
    //   1113: return
    // Exception table:
    //   from	to	target	type
    //   274	299	436	java/lang/Exception
    //   309	328	436	java/lang/Exception
    //   334	343	436	java/lang/Exception
    //   343	365	429	java/lang/Exception
    //   367	389	429	java/lang/Exception
    //   406	416	429	java/lang/Exception
    //   419	424	429	java/lang/Exception
  }
  
  public void F(d paramd, int paramInt) {
    if (paramInt == 0) {
      paramInt = this.n0;
      b[] arrayOfB = this.q0;
      if (paramInt + 1 >= arrayOfB.length)
        this.q0 = Arrays.<b>copyOf(arrayOfB, arrayOfB.length * 2); 
      this.q0[this.n0] = new b(paramd, 0, this.j0);
      this.n0++;
    } else if (paramInt == 1) {
      paramInt = this.o0;
      b[] arrayOfB = this.p0;
      if (paramInt + 1 >= arrayOfB.length)
        this.p0 = Arrays.<b>copyOf(arrayOfB, arrayOfB.length * 2); 
      this.p0[this.o0] = new b(paramd, 1, this.j0);
      this.o0++;
    } 
  }
  
  public boolean G(d paramd) {
    d.a a1 = d.a.b;
    d.a a2 = d.a.c;
    b(paramd);
    int j = this.f0.size();
    byte b1 = 0;
    int i = 0;
    while (b1 < j) {
      d d1 = this.f0.get(b1);
      boolean[] arrayOfBoolean = d1.I;
      arrayOfBoolean[0] = false;
      arrayOfBoolean[1] = false;
      if (d1 instanceof a)
        i = 1; 
      b1++;
    } 
    if (i)
      for (b1 = 0; b1 < j; b1++) {
        d d1 = this.f0.get(b1);
        if (d1 instanceof a) {
          a a = (a)d1;
          for (i = 0; i < a.g0; i++) {
            d1 = a.f0[i];
            int m = a.h0;
            if (m == 0 || m == 1) {
              d1.I[0] = true;
            } else if (m == 2 || m == 3) {
              d1.I[1] = true;
            } 
          } 
        } 
      }  
    b1 = 0;
    while (b1 < j) {
      d d1 = this.f0.get(b1);
      if (d1 != null) {
        if (d1 instanceof j || d1 instanceof f) {
          i = 1;
        } else {
          i = 0;
        } 
        if (i != 0)
          d1.b(paramd); 
        b1++;
        continue;
      } 
      throw null;
    } 
    for (b1 = 0; b1 < j; b1++) {
      d d1 = this.f0.get(b1);
      if (d1 instanceof e) {
        d.a[] arrayOfA = d1.J;
        d.a a3 = arrayOfA[0];
        d.a a4 = arrayOfA[1];
        if (a3 == a2)
          arrayOfA[0] = a1; 
        if (a4 == a2)
          d1.J[1] = a1; 
        d1.b(paramd);
        if (a3 == a2)
          d1.x(a3); 
        if (a4 == a2)
          d1.A(a4); 
      } else {
        d.a a = d.a.e;
        d1.h = -1;
        d1.i = -1;
        if (this.J[0] != a2 && d1.J[0] == a) {
          int m = d1.y.e;
          i = o() - d1.A.e;
          c c = d1.y;
          c.g = paramd.l(c);
          c = d1.A;
          c.g = paramd.l(c);
          paramd.e(d1.y.g, m);
          paramd.e(d1.A.g, i);
          d1.h = 2;
          d1.P = m;
          i -= m;
          d1.L = i;
          m = d1.S;
          if (i < m)
            d1.L = m; 
        } 
        if (this.J[1] != a2 && d1.J[1] == a) {
          int m = d1.z.e;
          i = i() - d1.B.e;
          c c = d1.z;
          c.g = paramd.l(c);
          c = d1.B;
          c.g = paramd.l(c);
          paramd.e(d1.z.g, m);
          paramd.e(d1.B.g, i);
          if (d1.R > 0 || d1.X == 8) {
            c = d1.C;
            c.g = paramd.l(c);
            paramd.e(d1.C.g, d1.R + m);
          } 
          d1.i = 2;
          d1.Q = m;
          i -= m;
          d1.M = i;
          m = d1.T;
          if (i < m)
            d1.M = m; 
        } 
        if (d1 instanceof j || d1 instanceof f) {
          i = 1;
        } else {
          i = 0;
        } 
        if (i == 0)
          d1.b(paramd); 
      } 
    } 
    if (this.n0 > 0)
      a.a(this, paramd, 0); 
    if (this.o0 > 0)
      a.a(this, paramd, 1); 
    return true;
  }
  
  public boolean H(boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h0 : Lb/g/b/i/l/e;
    //   4: astore #10
    //   6: getstatic b/g/b/i/d$a.e : Lb/g/b/i/d$a;
    //   9: astore #13
    //   11: getstatic b/g/b/i/d$a.c : Lb/g/b/i/d$a;
    //   14: astore #8
    //   16: getstatic b/g/b/i/d$a.b : Lb/g/b/i/d$a;
    //   19: astore #12
    //   21: iconst_1
    //   22: istore #7
    //   24: iload_1
    //   25: iconst_1
    //   26: iand
    //   27: istore #4
    //   29: aload #10
    //   31: getfield a : Lb/g/b/i/e;
    //   34: iconst_0
    //   35: invokevirtual h : (I)Lb/g/b/i/d$a;
    //   38: astore #9
    //   40: aload #10
    //   42: getfield a : Lb/g/b/i/e;
    //   45: iconst_1
    //   46: invokevirtual h : (I)Lb/g/b/i/d$a;
    //   49: astore #11
    //   51: aload #10
    //   53: getfield a : Lb/g/b/i/e;
    //   56: invokevirtual p : ()I
    //   59: istore #5
    //   61: aload #10
    //   63: getfield a : Lb/g/b/i/e;
    //   66: invokevirtual q : ()I
    //   69: istore #6
    //   71: iload #4
    //   73: ifeq -> 283
    //   76: aload #9
    //   78: aload #8
    //   80: if_acmpeq -> 90
    //   83: aload #11
    //   85: aload #8
    //   87: if_acmpne -> 283
    //   90: aload #10
    //   92: getfield e : Ljava/util/ArrayList;
    //   95: invokevirtual iterator : ()Ljava/util/Iterator;
    //   98: astore #15
    //   100: iload #4
    //   102: istore_3
    //   103: aload #15
    //   105: invokeinterface hasNext : ()Z
    //   110: ifeq -> 144
    //   113: aload #15
    //   115: invokeinterface next : ()Ljava/lang/Object;
    //   120: checkcast b/g/b/i/l/m
    //   123: astore #14
    //   125: aload #14
    //   127: getfield f : I
    //   130: iload_2
    //   131: if_icmpne -> 100
    //   134: aload #14
    //   136: invokevirtual k : ()Z
    //   139: ifne -> 100
    //   142: iconst_0
    //   143: istore_3
    //   144: iload_2
    //   145: ifne -> 214
    //   148: iload_3
    //   149: ifeq -> 283
    //   152: aload #9
    //   154: aload #8
    //   156: if_acmpne -> 283
    //   159: aload #10
    //   161: getfield a : Lb/g/b/i/e;
    //   164: astore #8
    //   166: aload #8
    //   168: getfield J : [Lb/g/b/i/d$a;
    //   171: iconst_0
    //   172: aload #12
    //   174: aastore
    //   175: aload #8
    //   177: aload #10
    //   179: aload #8
    //   181: iconst_0
    //   182: invokevirtual d : (Lb/g/b/i/e;I)I
    //   185: invokevirtual B : (I)V
    //   188: aload #10
    //   190: getfield a : Lb/g/b/i/e;
    //   193: astore #14
    //   195: aload #14
    //   197: getfield d : Lb/g/b/i/l/j;
    //   200: getfield e : Lb/g/b/i/l/g;
    //   203: astore #8
    //   205: aload #14
    //   207: invokevirtual o : ()I
    //   210: istore_3
    //   211: goto -> 277
    //   214: iload_3
    //   215: ifeq -> 283
    //   218: aload #11
    //   220: aload #8
    //   222: if_acmpne -> 283
    //   225: aload #10
    //   227: getfield a : Lb/g/b/i/e;
    //   230: astore #8
    //   232: aload #8
    //   234: getfield J : [Lb/g/b/i/d$a;
    //   237: iconst_1
    //   238: aload #12
    //   240: aastore
    //   241: aload #8
    //   243: aload #10
    //   245: aload #8
    //   247: iconst_1
    //   248: invokevirtual d : (Lb/g/b/i/e;I)I
    //   251: invokevirtual w : (I)V
    //   254: aload #10
    //   256: getfield a : Lb/g/b/i/e;
    //   259: astore #14
    //   261: aload #14
    //   263: getfield e : Lb/g/b/i/l/l;
    //   266: getfield e : Lb/g/b/i/l/g;
    //   269: astore #8
    //   271: aload #14
    //   273: invokevirtual i : ()I
    //   276: istore_3
    //   277: aload #8
    //   279: iload_3
    //   280: invokevirtual c : (I)V
    //   283: aload #10
    //   285: getfield a : Lb/g/b/i/e;
    //   288: getfield J : [Lb/g/b/i/d$a;
    //   291: astore #8
    //   293: iload_2
    //   294: ifne -> 363
    //   297: aload #8
    //   299: iconst_0
    //   300: aaload
    //   301: aload #12
    //   303: if_acmpeq -> 315
    //   306: aload #8
    //   308: iconst_0
    //   309: aaload
    //   310: aload #13
    //   312: if_acmpne -> 384
    //   315: aload #10
    //   317: getfield a : Lb/g/b/i/e;
    //   320: invokevirtual o : ()I
    //   323: iload #5
    //   325: iadd
    //   326: istore_3
    //   327: aload #10
    //   329: getfield a : Lb/g/b/i/e;
    //   332: getfield d : Lb/g/b/i/l/j;
    //   335: getfield i : Lb/g/b/i/l/f;
    //   338: iload_3
    //   339: invokevirtual c : (I)V
    //   342: aload #10
    //   344: getfield a : Lb/g/b/i/e;
    //   347: getfield d : Lb/g/b/i/l/j;
    //   350: getfield e : Lb/g/b/i/l/g;
    //   353: astore #8
    //   355: iload_3
    //   356: iload #5
    //   358: isub
    //   359: istore_3
    //   360: goto -> 434
    //   363: aload #8
    //   365: iconst_1
    //   366: aaload
    //   367: aload #12
    //   369: if_acmpeq -> 389
    //   372: aload #8
    //   374: iconst_1
    //   375: aaload
    //   376: aload #13
    //   378: if_acmpne -> 384
    //   381: goto -> 389
    //   384: iconst_0
    //   385: istore_3
    //   386: goto -> 442
    //   389: aload #10
    //   391: getfield a : Lb/g/b/i/e;
    //   394: invokevirtual i : ()I
    //   397: iload #6
    //   399: iadd
    //   400: istore_3
    //   401: aload #10
    //   403: getfield a : Lb/g/b/i/e;
    //   406: getfield e : Lb/g/b/i/l/l;
    //   409: getfield i : Lb/g/b/i/l/f;
    //   412: iload_3
    //   413: invokevirtual c : (I)V
    //   416: aload #10
    //   418: getfield a : Lb/g/b/i/e;
    //   421: getfield e : Lb/g/b/i/l/l;
    //   424: getfield e : Lb/g/b/i/l/g;
    //   427: astore #8
    //   429: iload_3
    //   430: iload #6
    //   432: isub
    //   433: istore_3
    //   434: aload #8
    //   436: iload_3
    //   437: invokevirtual c : (I)V
    //   440: iconst_1
    //   441: istore_3
    //   442: aload #10
    //   444: invokevirtual g : ()V
    //   447: aload #10
    //   449: getfield e : Ljava/util/ArrayList;
    //   452: invokevirtual iterator : ()Ljava/util/Iterator;
    //   455: astore #12
    //   457: aload #12
    //   459: invokeinterface hasNext : ()Z
    //   464: ifeq -> 523
    //   467: aload #12
    //   469: invokeinterface next : ()Ljava/lang/Object;
    //   474: checkcast b/g/b/i/l/m
    //   477: astore #8
    //   479: aload #8
    //   481: getfield f : I
    //   484: iload_2
    //   485: if_icmpeq -> 491
    //   488: goto -> 457
    //   491: aload #8
    //   493: getfield b : Lb/g/b/i/d;
    //   496: aload #10
    //   498: getfield a : Lb/g/b/i/e;
    //   501: if_acmpne -> 515
    //   504: aload #8
    //   506: getfield g : Z
    //   509: ifne -> 515
    //   512: goto -> 457
    //   515: aload #8
    //   517: invokevirtual e : ()V
    //   520: goto -> 457
    //   523: aload #10
    //   525: getfield e : Ljava/util/ArrayList;
    //   528: invokevirtual iterator : ()Ljava/util/Iterator;
    //   531: astore #12
    //   533: iload #7
    //   535: istore_1
    //   536: aload #12
    //   538: invokeinterface hasNext : ()Z
    //   543: ifeq -> 639
    //   546: aload #12
    //   548: invokeinterface next : ()Ljava/lang/Object;
    //   553: checkcast b/g/b/i/l/m
    //   556: astore #8
    //   558: aload #8
    //   560: getfield f : I
    //   563: iload_2
    //   564: if_icmpeq -> 570
    //   567: goto -> 533
    //   570: iload_3
    //   571: ifne -> 590
    //   574: aload #8
    //   576: getfield b : Lb/g/b/i/d;
    //   579: aload #10
    //   581: getfield a : Lb/g/b/i/e;
    //   584: if_acmpne -> 590
    //   587: goto -> 533
    //   590: aload #8
    //   592: getfield h : Lb/g/b/i/l/f;
    //   595: getfield j : Z
    //   598: ifne -> 604
    //   601: goto -> 637
    //   604: aload #8
    //   606: getfield i : Lb/g/b/i/l/f;
    //   609: getfield j : Z
    //   612: ifne -> 618
    //   615: goto -> 637
    //   618: aload #8
    //   620: instanceof b/g/b/i/l/c
    //   623: ifne -> 533
    //   626: aload #8
    //   628: getfield e : Lb/g/b/i/l/g;
    //   631: getfield j : Z
    //   634: ifne -> 533
    //   637: iconst_0
    //   638: istore_1
    //   639: aload #10
    //   641: getfield a : Lb/g/b/i/e;
    //   644: aload #9
    //   646: invokevirtual x : (Lb/g/b/i/d$a;)V
    //   649: aload #10
    //   651: getfield a : Lb/g/b/i/e;
    //   654: aload #11
    //   656: invokevirtual A : (Lb/g/b/i/d$a;)V
    //   659: iload_1
    //   660: ireturn
  }
  
  public void I() {
    this.h0.b = true;
  }
  
  public void J(int paramInt) {
    this.r0 = paramInt;
    d.r = i.a(paramInt, 256);
  }
  
  public void u() {
    this.k0.t();
    this.l0 = 0;
    this.m0 = 0;
    super.u();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */