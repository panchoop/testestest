package b.i.f;

import a.a.a.a.a;
import android.graphics.Path;
import android.util.Log;

public class c {
  public char a;
  
  public float[] b;
  
  public c(char paramChar, float[] paramArrayOffloat) {
    this.a = paramChar;
    this.b = paramArrayOffloat;
  }
  
  public c(c paramc) {
    this.a = paramc.a;
    float[] arrayOfFloat = paramc.b;
    this.b = a.o(arrayOfFloat, 0, arrayOfFloat.length);
  }
  
  public static void a(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, boolean paramBoolean1, boolean paramBoolean2) {
    double d9 = Math.toRadians(paramFloat7);
    double d17 = Math.cos(d9);
    double d16 = Math.sin(d9);
    double d1 = paramFloat1;
    double d3 = paramFloat2;
    double d2 = d1;
    double d8 = paramFloat5;
    d1 = (d3 * d16 + d1 * d17) / d8;
    double d4 = -paramFloat1;
    double d7 = paramFloat6;
    double d6 = (d3 * d17 + d4 * d16) / d7;
    double d5 = paramFloat3;
    d4 = paramFloat4;
    double d10 = (d4 * d16 + d5 * d17) / d8;
    double d12 = (d4 * d17 + -paramFloat3 * d16) / d7;
    double d13 = d1 - d10;
    double d11 = d6 - d12;
    d5 = (d1 + d10) / 2.0D;
    d4 = (d6 + d12) / 2.0D;
    double d15 = d11 * d11 + d13 * d13;
    if (d15 == 0.0D) {
      Log.w("PathParser", " Points are coincident");
      return;
    } 
    double d14 = 1.0D / d15 - 0.25D;
    if (d14 < 0.0D) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Points are too far apart ");
      stringBuilder.append(d15);
      Log.w("PathParser", stringBuilder.toString());
      float f = (float)(Math.sqrt(d15) / 1.99999D);
      a(paramPath, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5 * f, paramFloat6 * f, paramFloat7, paramBoolean1, paramBoolean2);
      return;
    } 
    d14 = Math.sqrt(d14);
    d13 *= d14;
    d11 = d14 * d11;
    if (paramBoolean1 == paramBoolean2) {
      d5 -= d11;
      d4 += d13;
    } else {
      d5 += d11;
      d4 -= d13;
    } 
    d11 = Math.atan2(d6 - d4, d1 - d5);
    d6 = Math.atan2(d12 - d4, d10 - d5) - d11;
    byte b = 0;
    int i = d6 cmp 0.0D;
    if (i >= 0) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    } 
    d1 = d6;
    if (paramBoolean2 != paramBoolean1)
      if (i > 0) {
        d1 = d6 - 6.283185307179586D;
      } else {
        d1 = d6 + 6.283185307179586D;
      }  
    double d18 = d5 * d8;
    double d19 = d4 * d7;
    d10 = d18 * d17 - d19 * d16;
    i = (int)Math.ceil(Math.abs(d1 * 4.0D / Math.PI));
    d4 = Math.cos(d9);
    double d21 = Math.sin(d9);
    d6 = Math.cos(d11);
    d9 = Math.sin(d11);
    d12 = -d8;
    double d20 = d12 * d4;
    double d22 = d7 * d21;
    d5 = d20 * d9 - d22 * d6;
    d13 = d12 * d21;
    d12 = d7 * d4;
    d7 = d6 * d12 + d9 * d13;
    d14 = d1 / i;
    d6 = d3;
    d9 = d2;
    d1 = d8;
    d3 = d4;
    d4 = d13;
    d2 = d10;
    d8 = d12;
    d10 = d14;
    while (b < i) {
      double d23 = d11 + d10;
      d15 = Math.sin(d23);
      double d24 = Math.cos(d23);
      d13 = d1 * d3 * d24 + d2 - d22 * d15;
      d12 = d8 * d15 + d1 * d21 * d24 + d19 * d17 + d18 * d16;
      d14 = d20 * d15 - d22 * d24;
      d15 = d24 * d8 + d15 * d4;
      d24 = d23 - d11;
      d11 = Math.tan(d24 / 2.0D);
      d24 = Math.sin(d24);
      d11 = (Math.sqrt(d11 * 3.0D * d11 + 4.0D) - 1.0D) * d24 / 3.0D;
      paramPath.rLineTo(0.0F, 0.0F);
      paramPath.cubicTo((float)(d5 * d11 + d9), (float)(d7 * d11 + d6), (float)(d13 - d11 * d14), (float)(d12 - d11 * d15), (float)d13, (float)d12);
      b++;
      d11 = d23;
      d7 = d15;
      d5 = d14;
      d9 = d13;
      d6 = d12;
    } 
  }
  
  public static void b(c[] paramArrayOfc, Path paramPath) {
    // Byte code:
    //   0: bipush #6
    //   2: newarray float
    //   4: astore #22
    //   6: bipush #109
    //   8: istore #13
    //   10: iconst_0
    //   11: istore #12
    //   13: iload #12
    //   15: aload_0
    //   16: arraylength
    //   17: if_icmpge -> 2119
    //   20: aload_0
    //   21: iload #12
    //   23: aaload
    //   24: getfield a : C
    //   27: istore #15
    //   29: aload_0
    //   30: iload #12
    //   32: aaload
    //   33: getfield b : [F
    //   36: astore #21
    //   38: aload #22
    //   40: iconst_0
    //   41: faload
    //   42: fstore_2
    //   43: aload #22
    //   45: iconst_1
    //   46: faload
    //   47: fstore_3
    //   48: aload #22
    //   50: iconst_2
    //   51: faload
    //   52: fstore #4
    //   54: aload #22
    //   56: iconst_3
    //   57: faload
    //   58: fstore #5
    //   60: aload #22
    //   62: iconst_4
    //   63: faload
    //   64: fstore #7
    //   66: aload #22
    //   68: iconst_5
    //   69: faload
    //   70: fstore #6
    //   72: iload #15
    //   74: lookupswitch default -> 196, 65 -> 245, 67 -> 238, 72 -> 232, 81 -> 226, 83 -> 226, 86 -> 232, 90 -> 199, 97 -> 245, 99 -> 238, 104 -> 232, 113 -> 226, 115 -> 226, 118 -> 232, 122 -> 199
    //   196: goto -> 252
    //   199: aload_1
    //   200: invokevirtual close : ()V
    //   203: aload_1
    //   204: fload #7
    //   206: fload #6
    //   208: invokevirtual moveTo : (FF)V
    //   211: fload #7
    //   213: fstore_2
    //   214: fload_2
    //   215: fstore #4
    //   217: fload #6
    //   219: fstore_3
    //   220: fload_3
    //   221: fstore #5
    //   223: goto -> 252
    //   226: iconst_4
    //   227: istore #11
    //   229: goto -> 255
    //   232: iconst_1
    //   233: istore #11
    //   235: goto -> 255
    //   238: bipush #6
    //   240: istore #11
    //   242: goto -> 255
    //   245: bipush #7
    //   247: istore #11
    //   249: goto -> 255
    //   252: iconst_2
    //   253: istore #11
    //   255: fload_3
    //   256: fstore #8
    //   258: iconst_0
    //   259: istore #16
    //   261: iload #12
    //   263: istore #14
    //   265: iload #15
    //   267: istore #12
    //   269: fload_2
    //   270: fstore_3
    //   271: fload #8
    //   273: fstore_2
    //   274: iload #16
    //   276: istore #15
    //   278: iload #13
    //   280: istore #16
    //   282: iload #15
    //   284: aload #21
    //   286: arraylength
    //   287: if_icmpge -> 2067
    //   290: iload #12
    //   292: bipush #65
    //   294: if_icmpeq -> 1911
    //   297: iload #12
    //   299: bipush #67
    //   301: if_icmpeq -> 1792
    //   304: iload #12
    //   306: bipush #72
    //   308: if_icmpeq -> 1767
    //   311: iload #12
    //   313: bipush #81
    //   315: if_icmpeq -> 1682
    //   318: iload #12
    //   320: bipush #86
    //   322: if_icmpeq -> 1657
    //   325: iload #12
    //   327: bipush #97
    //   329: if_icmpeq -> 1518
    //   332: iload #12
    //   334: bipush #99
    //   336: if_icmpeq -> 1379
    //   339: iload #12
    //   341: bipush #104
    //   343: if_icmpeq -> 1352
    //   346: iload #12
    //   348: bipush #113
    //   350: if_icmpeq -> 1244
    //   353: iload #12
    //   355: bipush #118
    //   357: if_icmpeq -> 1213
    //   360: iload #12
    //   362: bipush #76
    //   364: if_icmpeq -> 1170
    //   367: iload #12
    //   369: bipush #77
    //   371: if_icmpeq -> 1095
    //   374: iload #12
    //   376: bipush #83
    //   378: if_icmpeq -> 956
    //   381: iload #12
    //   383: bipush #84
    //   385: if_icmpeq -> 833
    //   388: iload #12
    //   390: bipush #108
    //   392: if_icmpeq -> 785
    //   395: iload #12
    //   397: bipush #109
    //   399: if_icmpeq -> 712
    //   402: iload #12
    //   404: bipush #115
    //   406: if_icmpeq -> 544
    //   409: iload #12
    //   411: bipush #116
    //   413: if_icmpeq -> 419
    //   416: goto -> 541
    //   419: iload #16
    //   421: bipush #113
    //   423: if_icmpeq -> 459
    //   426: iload #16
    //   428: bipush #116
    //   430: if_icmpeq -> 459
    //   433: iload #16
    //   435: bipush #81
    //   437: if_icmpeq -> 459
    //   440: iload #16
    //   442: bipush #84
    //   444: if_icmpne -> 450
    //   447: goto -> 459
    //   450: fconst_0
    //   451: fstore #5
    //   453: fconst_0
    //   454: fstore #4
    //   456: goto -> 471
    //   459: fload_3
    //   460: fload #4
    //   462: fsub
    //   463: fstore #4
    //   465: fload_2
    //   466: fload #5
    //   468: fsub
    //   469: fstore #5
    //   471: iload #15
    //   473: iconst_0
    //   474: iadd
    //   475: istore #16
    //   477: aload #21
    //   479: iload #16
    //   481: faload
    //   482: fstore #8
    //   484: iload #15
    //   486: iconst_1
    //   487: iadd
    //   488: istore #13
    //   490: aload_1
    //   491: fload #4
    //   493: fload #5
    //   495: fload #8
    //   497: aload #21
    //   499: iload #13
    //   501: faload
    //   502: invokevirtual rQuadTo : (FFFF)V
    //   505: fload_3
    //   506: aload #21
    //   508: iload #16
    //   510: faload
    //   511: fadd
    //   512: fstore #9
    //   514: fload_2
    //   515: aload #21
    //   517: iload #13
    //   519: faload
    //   520: fadd
    //   521: fstore #8
    //   523: fload #5
    //   525: fload_2
    //   526: fadd
    //   527: fstore #5
    //   529: fload #4
    //   531: fload_3
    //   532: fadd
    //   533: fstore #4
    //   535: fload #9
    //   537: fstore_3
    //   538: fload #8
    //   540: fstore_2
    //   541: goto -> 1515
    //   544: iload #16
    //   546: bipush #99
    //   548: if_icmpeq -> 584
    //   551: iload #16
    //   553: bipush #115
    //   555: if_icmpeq -> 584
    //   558: iload #16
    //   560: bipush #67
    //   562: if_icmpeq -> 584
    //   565: iload #16
    //   567: bipush #83
    //   569: if_icmpne -> 575
    //   572: goto -> 584
    //   575: fconst_0
    //   576: fstore #5
    //   578: fconst_0
    //   579: fstore #4
    //   581: goto -> 604
    //   584: fload_2
    //   585: fload #5
    //   587: fsub
    //   588: fstore #5
    //   590: fload_3
    //   591: fload #4
    //   593: fsub
    //   594: fstore #8
    //   596: fload #5
    //   598: fstore #4
    //   600: fload #8
    //   602: fstore #5
    //   604: iload #15
    //   606: iconst_0
    //   607: iadd
    //   608: istore #16
    //   610: aload #21
    //   612: iload #16
    //   614: faload
    //   615: fstore #8
    //   617: iload #15
    //   619: iconst_1
    //   620: iadd
    //   621: istore #17
    //   623: aload #21
    //   625: iload #17
    //   627: faload
    //   628: fstore #10
    //   630: iload #15
    //   632: iconst_2
    //   633: iadd
    //   634: istore #13
    //   636: aload #21
    //   638: iload #13
    //   640: faload
    //   641: fstore #9
    //   643: iload #15
    //   645: iconst_3
    //   646: iadd
    //   647: istore #18
    //   649: aload_1
    //   650: fload #5
    //   652: fload #4
    //   654: fload #8
    //   656: fload #10
    //   658: fload #9
    //   660: aload #21
    //   662: iload #18
    //   664: faload
    //   665: invokevirtual rCubicTo : (FFFFFF)V
    //   668: aload #21
    //   670: iload #16
    //   672: faload
    //   673: fload_3
    //   674: fadd
    //   675: fstore #4
    //   677: aload #21
    //   679: iload #17
    //   681: faload
    //   682: fload_2
    //   683: fadd
    //   684: fstore #5
    //   686: fload_3
    //   687: aload #21
    //   689: iload #13
    //   691: faload
    //   692: fadd
    //   693: fstore #9
    //   695: aload #21
    //   697: iload #18
    //   699: faload
    //   700: fstore #8
    //   702: fload #5
    //   704: fstore_3
    //   705: fload #9
    //   707: fstore #5
    //   709: goto -> 1498
    //   712: iload #15
    //   714: iconst_0
    //   715: iadd
    //   716: istore #16
    //   718: fload_3
    //   719: aload #21
    //   721: iload #16
    //   723: faload
    //   724: fadd
    //   725: fstore_3
    //   726: iload #15
    //   728: iconst_1
    //   729: iadd
    //   730: istore #13
    //   732: fload_2
    //   733: aload #21
    //   735: iload #13
    //   737: faload
    //   738: fadd
    //   739: fstore_2
    //   740: iload #15
    //   742: ifle -> 762
    //   745: aload_1
    //   746: aload #21
    //   748: iload #16
    //   750: faload
    //   751: aload #21
    //   753: iload #13
    //   755: faload
    //   756: invokevirtual rLineTo : (FF)V
    //   759: goto -> 1515
    //   762: aload_1
    //   763: aload #21
    //   765: iload #16
    //   767: faload
    //   768: aload #21
    //   770: iload #13
    //   772: faload
    //   773: invokevirtual rMoveTo : (FF)V
    //   776: fload_3
    //   777: fstore #7
    //   779: fload_2
    //   780: fstore #6
    //   782: goto -> 1161
    //   785: iload #15
    //   787: iconst_0
    //   788: iadd
    //   789: istore #16
    //   791: aload #21
    //   793: iload #16
    //   795: faload
    //   796: fstore #8
    //   798: iload #15
    //   800: iconst_1
    //   801: iadd
    //   802: istore #13
    //   804: aload_1
    //   805: fload #8
    //   807: aload #21
    //   809: iload #13
    //   811: faload
    //   812: invokevirtual rLineTo : (FF)V
    //   815: fload_3
    //   816: aload #21
    //   818: iload #16
    //   820: faload
    //   821: fadd
    //   822: fstore_3
    //   823: aload #21
    //   825: iload #13
    //   827: faload
    //   828: fstore #8
    //   830: goto -> 1236
    //   833: iload #16
    //   835: bipush #113
    //   837: if_icmpeq -> 875
    //   840: iload #16
    //   842: bipush #116
    //   844: if_icmpeq -> 875
    //   847: iload #16
    //   849: bipush #81
    //   851: if_icmpeq -> 875
    //   854: iload #16
    //   856: bipush #84
    //   858: if_icmpne -> 864
    //   861: goto -> 875
    //   864: fload_3
    //   865: fstore #4
    //   867: fload_2
    //   868: fstore_3
    //   869: fload #4
    //   871: fstore_2
    //   872: goto -> 895
    //   875: fload_3
    //   876: fconst_2
    //   877: fmul
    //   878: fload #4
    //   880: fsub
    //   881: fstore_3
    //   882: fload_2
    //   883: fconst_2
    //   884: fmul
    //   885: fload #5
    //   887: fsub
    //   888: fstore #4
    //   890: fload_3
    //   891: fstore_2
    //   892: fload #4
    //   894: fstore_3
    //   895: iload #15
    //   897: iconst_0
    //   898: iadd
    //   899: istore #16
    //   901: aload #21
    //   903: iload #16
    //   905: faload
    //   906: fstore #4
    //   908: iload #15
    //   910: iconst_1
    //   911: iadd
    //   912: istore #13
    //   914: aload_1
    //   915: fload_2
    //   916: fload_3
    //   917: fload #4
    //   919: aload #21
    //   921: iload #13
    //   923: faload
    //   924: invokevirtual quadTo : (FFFF)V
    //   927: aload #21
    //   929: iload #16
    //   931: faload
    //   932: fstore #9
    //   934: aload #21
    //   936: iload #13
    //   938: faload
    //   939: fstore #8
    //   941: fload_3
    //   942: fstore #5
    //   944: fload_2
    //   945: fstore #4
    //   947: fload #9
    //   949: fstore_3
    //   950: fload #8
    //   952: fstore_2
    //   953: goto -> 2045
    //   956: iload #16
    //   958: bipush #99
    //   960: if_icmpeq -> 990
    //   963: iload #16
    //   965: bipush #115
    //   967: if_icmpeq -> 990
    //   970: iload #16
    //   972: bipush #67
    //   974: if_icmpeq -> 990
    //   977: iload #16
    //   979: bipush #83
    //   981: if_icmpne -> 987
    //   984: goto -> 990
    //   987: goto -> 1004
    //   990: fload_2
    //   991: fconst_2
    //   992: fmul
    //   993: fload #5
    //   995: fsub
    //   996: fstore_2
    //   997: fload_3
    //   998: fconst_2
    //   999: fmul
    //   1000: fload #4
    //   1002: fsub
    //   1003: fstore_3
    //   1004: iload #15
    //   1006: iconst_0
    //   1007: iadd
    //   1008: istore #17
    //   1010: aload #21
    //   1012: iload #17
    //   1014: faload
    //   1015: fstore #5
    //   1017: iload #15
    //   1019: iconst_1
    //   1020: iadd
    //   1021: istore #16
    //   1023: aload #21
    //   1025: iload #16
    //   1027: faload
    //   1028: fstore #8
    //   1030: iload #15
    //   1032: iconst_2
    //   1033: iadd
    //   1034: istore #18
    //   1036: aload #21
    //   1038: iload #18
    //   1040: faload
    //   1041: fstore #4
    //   1043: iload #15
    //   1045: iconst_3
    //   1046: iadd
    //   1047: istore #13
    //   1049: aload_1
    //   1050: fload_3
    //   1051: fload_2
    //   1052: fload #5
    //   1054: fload #8
    //   1056: fload #4
    //   1058: aload #21
    //   1060: iload #13
    //   1062: faload
    //   1063: invokevirtual cubicTo : (FFFFFF)V
    //   1066: aload #21
    //   1068: iload #17
    //   1070: faload
    //   1071: fstore #4
    //   1073: aload #21
    //   1075: iload #16
    //   1077: faload
    //   1078: fstore #5
    //   1080: aload #21
    //   1082: iload #18
    //   1084: faload
    //   1085: fstore_3
    //   1086: aload #21
    //   1088: iload #13
    //   1090: faload
    //   1091: fstore_2
    //   1092: goto -> 1515
    //   1095: iload #15
    //   1097: iconst_0
    //   1098: iadd
    //   1099: istore #16
    //   1101: aload #21
    //   1103: iload #16
    //   1105: faload
    //   1106: fstore_3
    //   1107: iload #15
    //   1109: iconst_1
    //   1110: iadd
    //   1111: istore #13
    //   1113: aload #21
    //   1115: iload #13
    //   1117: faload
    //   1118: fstore_2
    //   1119: iload #15
    //   1121: ifle -> 1141
    //   1124: aload_1
    //   1125: aload #21
    //   1127: iload #16
    //   1129: faload
    //   1130: aload #21
    //   1132: iload #13
    //   1134: faload
    //   1135: invokevirtual lineTo : (FF)V
    //   1138: goto -> 1515
    //   1141: aload_1
    //   1142: aload #21
    //   1144: iload #16
    //   1146: faload
    //   1147: aload #21
    //   1149: iload #13
    //   1151: faload
    //   1152: invokevirtual moveTo : (FF)V
    //   1155: fload_3
    //   1156: fstore #7
    //   1158: fload_2
    //   1159: fstore #6
    //   1161: fload #7
    //   1163: fstore_3
    //   1164: fload #6
    //   1166: fstore_2
    //   1167: goto -> 1515
    //   1170: iload #15
    //   1172: iconst_0
    //   1173: iadd
    //   1174: istore #13
    //   1176: aload #21
    //   1178: iload #13
    //   1180: faload
    //   1181: fstore_2
    //   1182: iload #15
    //   1184: iconst_1
    //   1185: iadd
    //   1186: istore #16
    //   1188: aload_1
    //   1189: fload_2
    //   1190: aload #21
    //   1192: iload #16
    //   1194: faload
    //   1195: invokevirtual lineTo : (FF)V
    //   1198: aload #21
    //   1200: iload #13
    //   1202: faload
    //   1203: fstore_3
    //   1204: aload #21
    //   1206: iload #16
    //   1208: faload
    //   1209: fstore_2
    //   1210: goto -> 1515
    //   1213: iload #15
    //   1215: iconst_0
    //   1216: iadd
    //   1217: istore #13
    //   1219: aload_1
    //   1220: fconst_0
    //   1221: aload #21
    //   1223: iload #13
    //   1225: faload
    //   1226: invokevirtual rLineTo : (FF)V
    //   1229: aload #21
    //   1231: iload #13
    //   1233: faload
    //   1234: fstore #8
    //   1236: fload_2
    //   1237: fload #8
    //   1239: fadd
    //   1240: fstore_2
    //   1241: goto -> 1515
    //   1244: iload #15
    //   1246: iconst_0
    //   1247: iadd
    //   1248: istore #18
    //   1250: aload #21
    //   1252: iload #18
    //   1254: faload
    //   1255: fstore #8
    //   1257: iload #15
    //   1259: iconst_1
    //   1260: iadd
    //   1261: istore #17
    //   1263: aload #21
    //   1265: iload #17
    //   1267: faload
    //   1268: fstore #4
    //   1270: iload #15
    //   1272: iconst_2
    //   1273: iadd
    //   1274: istore #16
    //   1276: aload #21
    //   1278: iload #16
    //   1280: faload
    //   1281: fstore #5
    //   1283: iload #15
    //   1285: iconst_3
    //   1286: iadd
    //   1287: istore #13
    //   1289: aload_1
    //   1290: fload #8
    //   1292: fload #4
    //   1294: fload #5
    //   1296: aload #21
    //   1298: iload #13
    //   1300: faload
    //   1301: invokevirtual rQuadTo : (FFFF)V
    //   1304: aload #21
    //   1306: iload #18
    //   1308: faload
    //   1309: fload_3
    //   1310: fadd
    //   1311: fstore #4
    //   1313: aload #21
    //   1315: iload #17
    //   1317: faload
    //   1318: fload_2
    //   1319: fadd
    //   1320: fstore #5
    //   1322: aload #21
    //   1324: iload #16
    //   1326: faload
    //   1327: fstore #9
    //   1329: aload #21
    //   1331: iload #13
    //   1333: faload
    //   1334: fstore #8
    //   1336: fload_3
    //   1337: fload #9
    //   1339: fadd
    //   1340: fstore #9
    //   1342: fload #5
    //   1344: fstore_3
    //   1345: fload #9
    //   1347: fstore #5
    //   1349: goto -> 1498
    //   1352: iload #15
    //   1354: iconst_0
    //   1355: iadd
    //   1356: istore #13
    //   1358: aload_1
    //   1359: aload #21
    //   1361: iload #13
    //   1363: faload
    //   1364: fconst_0
    //   1365: invokevirtual rLineTo : (FF)V
    //   1368: fload_3
    //   1369: aload #21
    //   1371: iload #13
    //   1373: faload
    //   1374: fadd
    //   1375: fstore_3
    //   1376: goto -> 1515
    //   1379: aload #21
    //   1381: iload #15
    //   1383: iconst_0
    //   1384: iadd
    //   1385: faload
    //   1386: fstore #5
    //   1388: aload #21
    //   1390: iload #15
    //   1392: iconst_1
    //   1393: iadd
    //   1394: faload
    //   1395: fstore #10
    //   1397: iload #15
    //   1399: iconst_2
    //   1400: iadd
    //   1401: istore #16
    //   1403: aload #21
    //   1405: iload #16
    //   1407: faload
    //   1408: fstore #4
    //   1410: iload #15
    //   1412: iconst_3
    //   1413: iadd
    //   1414: istore #13
    //   1416: aload #21
    //   1418: iload #13
    //   1420: faload
    //   1421: fstore #9
    //   1423: iload #15
    //   1425: iconst_4
    //   1426: iadd
    //   1427: istore #18
    //   1429: aload #21
    //   1431: iload #18
    //   1433: faload
    //   1434: fstore #8
    //   1436: iload #15
    //   1438: iconst_5
    //   1439: iadd
    //   1440: istore #17
    //   1442: aload_1
    //   1443: fload #5
    //   1445: fload #10
    //   1447: fload #4
    //   1449: fload #9
    //   1451: fload #8
    //   1453: aload #21
    //   1455: iload #17
    //   1457: faload
    //   1458: invokevirtual rCubicTo : (FFFFFF)V
    //   1461: aload #21
    //   1463: iload #16
    //   1465: faload
    //   1466: fload_3
    //   1467: fadd
    //   1468: fstore #4
    //   1470: aload #21
    //   1472: iload #13
    //   1474: faload
    //   1475: fload_2
    //   1476: fadd
    //   1477: fstore #9
    //   1479: fload_3
    //   1480: aload #21
    //   1482: iload #18
    //   1484: faload
    //   1485: fadd
    //   1486: fstore #5
    //   1488: aload #21
    //   1490: iload #17
    //   1492: faload
    //   1493: fstore #8
    //   1495: fload #9
    //   1497: fstore_3
    //   1498: fload_2
    //   1499: fload #8
    //   1501: fadd
    //   1502: fstore #8
    //   1504: fload_3
    //   1505: fstore_2
    //   1506: fload #5
    //   1508: fstore_3
    //   1509: fload_2
    //   1510: fstore #5
    //   1512: fload #8
    //   1514: fstore_2
    //   1515: goto -> 2045
    //   1518: iload #15
    //   1520: iconst_5
    //   1521: iadd
    //   1522: istore #13
    //   1524: aload #21
    //   1526: iload #13
    //   1528: faload
    //   1529: fstore #9
    //   1531: iload #15
    //   1533: bipush #6
    //   1535: iadd
    //   1536: istore #16
    //   1538: aload #21
    //   1540: iload #16
    //   1542: faload
    //   1543: fstore #8
    //   1545: aload #21
    //   1547: iload #15
    //   1549: iconst_0
    //   1550: iadd
    //   1551: faload
    //   1552: fstore #10
    //   1554: aload #21
    //   1556: iload #15
    //   1558: iconst_1
    //   1559: iadd
    //   1560: faload
    //   1561: fstore #4
    //   1563: aload #21
    //   1565: iload #15
    //   1567: iconst_2
    //   1568: iadd
    //   1569: faload
    //   1570: fstore #5
    //   1572: aload #21
    //   1574: iload #15
    //   1576: iconst_3
    //   1577: iadd
    //   1578: faload
    //   1579: fconst_0
    //   1580: fcmpl
    //   1581: ifeq -> 1590
    //   1584: iconst_1
    //   1585: istore #19
    //   1587: goto -> 1593
    //   1590: iconst_0
    //   1591: istore #19
    //   1593: aload #21
    //   1595: iload #15
    //   1597: iconst_4
    //   1598: iadd
    //   1599: faload
    //   1600: fconst_0
    //   1601: fcmpl
    //   1602: ifeq -> 1611
    //   1605: iconst_1
    //   1606: istore #20
    //   1608: goto -> 1614
    //   1611: iconst_0
    //   1612: istore #20
    //   1614: aload_1
    //   1615: fload_3
    //   1616: fload_2
    //   1617: fload #9
    //   1619: fload_3
    //   1620: fadd
    //   1621: fload #8
    //   1623: fload_2
    //   1624: fadd
    //   1625: fload #10
    //   1627: fload #4
    //   1629: fload #5
    //   1631: iload #19
    //   1633: iload #20
    //   1635: invokestatic a : (Landroid/graphics/Path;FFFFFFFZZ)V
    //   1638: fload_3
    //   1639: aload #21
    //   1641: iload #13
    //   1643: faload
    //   1644: fadd
    //   1645: fstore_3
    //   1646: fload_2
    //   1647: aload #21
    //   1649: iload #16
    //   1651: faload
    //   1652: fadd
    //   1653: fstore_2
    //   1654: goto -> 2039
    //   1657: iload #15
    //   1659: iconst_0
    //   1660: iadd
    //   1661: istore #13
    //   1663: aload_1
    //   1664: fload_3
    //   1665: aload #21
    //   1667: iload #13
    //   1669: faload
    //   1670: invokevirtual lineTo : (FF)V
    //   1673: aload #21
    //   1675: iload #13
    //   1677: faload
    //   1678: fstore_2
    //   1679: goto -> 2045
    //   1682: iload #15
    //   1684: iconst_0
    //   1685: iadd
    //   1686: istore #13
    //   1688: aload #21
    //   1690: iload #13
    //   1692: faload
    //   1693: fstore #4
    //   1695: iload #15
    //   1697: iconst_1
    //   1698: iadd
    //   1699: istore #17
    //   1701: aload #21
    //   1703: iload #17
    //   1705: faload
    //   1706: fstore_3
    //   1707: iload #15
    //   1709: iconst_2
    //   1710: iadd
    //   1711: istore #18
    //   1713: aload #21
    //   1715: iload #18
    //   1717: faload
    //   1718: fstore_2
    //   1719: iload #15
    //   1721: iconst_3
    //   1722: iadd
    //   1723: istore #16
    //   1725: aload_1
    //   1726: fload #4
    //   1728: fload_3
    //   1729: fload_2
    //   1730: aload #21
    //   1732: iload #16
    //   1734: faload
    //   1735: invokevirtual quadTo : (FFFF)V
    //   1738: aload #21
    //   1740: iload #13
    //   1742: faload
    //   1743: fstore #5
    //   1745: aload #21
    //   1747: iload #17
    //   1749: faload
    //   1750: fstore #4
    //   1752: aload #21
    //   1754: iload #18
    //   1756: faload
    //   1757: fstore_3
    //   1758: aload #21
    //   1760: iload #16
    //   1762: faload
    //   1763: fstore_2
    //   1764: goto -> 1896
    //   1767: iload #15
    //   1769: iconst_0
    //   1770: iadd
    //   1771: istore #13
    //   1773: aload_1
    //   1774: aload #21
    //   1776: iload #13
    //   1778: faload
    //   1779: fload_2
    //   1780: invokevirtual lineTo : (FF)V
    //   1783: aload #21
    //   1785: iload #13
    //   1787: faload
    //   1788: fstore_3
    //   1789: goto -> 2045
    //   1792: aload #21
    //   1794: iload #15
    //   1796: iconst_0
    //   1797: iadd
    //   1798: faload
    //   1799: fstore #5
    //   1801: aload #21
    //   1803: iload #15
    //   1805: iconst_1
    //   1806: iadd
    //   1807: faload
    //   1808: fstore_2
    //   1809: iload #15
    //   1811: iconst_2
    //   1812: iadd
    //   1813: istore #17
    //   1815: aload #21
    //   1817: iload #17
    //   1819: faload
    //   1820: fstore_3
    //   1821: iload #15
    //   1823: iconst_3
    //   1824: iadd
    //   1825: istore #13
    //   1827: aload #21
    //   1829: iload #13
    //   1831: faload
    //   1832: fstore #4
    //   1834: iload #15
    //   1836: iconst_4
    //   1837: iadd
    //   1838: istore #18
    //   1840: aload #21
    //   1842: iload #18
    //   1844: faload
    //   1845: fstore #8
    //   1847: iload #15
    //   1849: iconst_5
    //   1850: iadd
    //   1851: istore #16
    //   1853: aload_1
    //   1854: fload #5
    //   1856: fload_2
    //   1857: fload_3
    //   1858: fload #4
    //   1860: fload #8
    //   1862: aload #21
    //   1864: iload #16
    //   1866: faload
    //   1867: invokevirtual cubicTo : (FFFFFF)V
    //   1870: aload #21
    //   1872: iload #18
    //   1874: faload
    //   1875: fstore_3
    //   1876: aload #21
    //   1878: iload #16
    //   1880: faload
    //   1881: fstore_2
    //   1882: aload #21
    //   1884: iload #17
    //   1886: faload
    //   1887: fstore #5
    //   1889: aload #21
    //   1891: iload #13
    //   1893: faload
    //   1894: fstore #4
    //   1896: fload #5
    //   1898: fstore #8
    //   1900: fload #4
    //   1902: fstore #5
    //   1904: fload #8
    //   1906: fstore #4
    //   1908: goto -> 2045
    //   1911: iload #15
    //   1913: iconst_5
    //   1914: iadd
    //   1915: istore #13
    //   1917: aload #21
    //   1919: iload #13
    //   1921: faload
    //   1922: fstore #8
    //   1924: iload #15
    //   1926: bipush #6
    //   1928: iadd
    //   1929: istore #16
    //   1931: aload #21
    //   1933: iload #16
    //   1935: faload
    //   1936: fstore #5
    //   1938: aload #21
    //   1940: iload #15
    //   1942: iconst_0
    //   1943: iadd
    //   1944: faload
    //   1945: fstore #10
    //   1947: aload #21
    //   1949: iload #15
    //   1951: iconst_1
    //   1952: iadd
    //   1953: faload
    //   1954: fstore #4
    //   1956: aload #21
    //   1958: iload #15
    //   1960: iconst_2
    //   1961: iadd
    //   1962: faload
    //   1963: fstore #9
    //   1965: aload #21
    //   1967: iload #15
    //   1969: iconst_3
    //   1970: iadd
    //   1971: faload
    //   1972: fconst_0
    //   1973: fcmpl
    //   1974: ifeq -> 1983
    //   1977: iconst_1
    //   1978: istore #19
    //   1980: goto -> 1986
    //   1983: iconst_0
    //   1984: istore #19
    //   1986: aload #21
    //   1988: iload #15
    //   1990: iconst_4
    //   1991: iadd
    //   1992: faload
    //   1993: fconst_0
    //   1994: fcmpl
    //   1995: ifeq -> 2004
    //   1998: iconst_1
    //   1999: istore #20
    //   2001: goto -> 2007
    //   2004: iconst_0
    //   2005: istore #20
    //   2007: aload_1
    //   2008: fload_3
    //   2009: fload_2
    //   2010: fload #8
    //   2012: fload #5
    //   2014: fload #10
    //   2016: fload #4
    //   2018: fload #9
    //   2020: iload #19
    //   2022: iload #20
    //   2024: invokestatic a : (Landroid/graphics/Path;FFFFFFFZZ)V
    //   2027: aload #21
    //   2029: iload #13
    //   2031: faload
    //   2032: fstore_3
    //   2033: aload #21
    //   2035: iload #16
    //   2037: faload
    //   2038: fstore_2
    //   2039: fload_2
    //   2040: fstore #5
    //   2042: fload_3
    //   2043: fstore #4
    //   2045: iload #15
    //   2047: iload #11
    //   2049: iadd
    //   2050: istore #15
    //   2052: iload #12
    //   2054: istore #13
    //   2056: iload #12
    //   2058: istore #16
    //   2060: iload #13
    //   2062: istore #12
    //   2064: goto -> 282
    //   2067: aload #22
    //   2069: iconst_0
    //   2070: fload_3
    //   2071: fastore
    //   2072: aload #22
    //   2074: iconst_1
    //   2075: fload_2
    //   2076: fastore
    //   2077: aload #22
    //   2079: iconst_2
    //   2080: fload #4
    //   2082: fastore
    //   2083: aload #22
    //   2085: iconst_3
    //   2086: fload #5
    //   2088: fastore
    //   2089: aload #22
    //   2091: iconst_4
    //   2092: fload #7
    //   2094: fastore
    //   2095: aload #22
    //   2097: iconst_5
    //   2098: fload #6
    //   2100: fastore
    //   2101: aload_0
    //   2102: iload #14
    //   2104: aaload
    //   2105: getfield a : C
    //   2108: istore #13
    //   2110: iload #14
    //   2112: iconst_1
    //   2113: iadd
    //   2114: istore #12
    //   2116: goto -> 13
    //   2119: return
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\f\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */