package b.g.b.i.l;

import b.g.b.i.d;
import c.a.a.a.a;

public class j extends m {
  public static int[] k = new int[2];
  
  public j(d paramd) {
    super(paramd);
    this.h.e = f.a.e;
    this.i.e = f.a.f;
    this.f = 0;
  }
  
  public void a(d paramd) {
    // Byte code:
    //   0: getstatic b/g/b/i/d$a.d : Lb/g/b/i/d$a;
    //   3: astore #13
    //   5: aload_0
    //   6: getfield j : Lb/g/b/i/l/m$a;
    //   9: invokevirtual ordinal : ()I
    //   12: istore #4
    //   14: iload #4
    //   16: iconst_1
    //   17: if_icmpeq -> 54
    //   20: iload #4
    //   22: iconst_2
    //   23: if_icmpeq -> 54
    //   26: iload #4
    //   28: iconst_3
    //   29: if_icmpeq -> 35
    //   32: goto -> 54
    //   35: aload_0
    //   36: getfield b : Lb/g/b/i/d;
    //   39: astore_1
    //   40: aload_0
    //   41: aload_1
    //   42: getfield y : Lb/g/b/i/c;
    //   45: aload_1
    //   46: getfield A : Lb/g/b/i/c;
    //   49: iconst_0
    //   50: invokevirtual l : (Lb/g/b/i/c;Lb/g/b/i/c;I)V
    //   53: return
    //   54: aload_0
    //   55: getfield e : Lb/g/b/i/l/g;
    //   58: astore_1
    //   59: aload_1
    //   60: getfield j : Z
    //   63: ifne -> 1516
    //   66: aload_0
    //   67: getfield d : Lb/g/b/i/d$a;
    //   70: aload #13
    //   72: if_acmpne -> 1516
    //   75: aload_0
    //   76: getfield b : Lb/g/b/i/d;
    //   79: astore #14
    //   81: aload #14
    //   83: getfield j : I
    //   86: istore #4
    //   88: iload #4
    //   90: iconst_2
    //   91: if_icmpeq -> 1460
    //   94: iload #4
    //   96: iconst_3
    //   97: if_icmpeq -> 103
    //   100: goto -> 1516
    //   103: aload #14
    //   105: getfield k : I
    //   108: istore #4
    //   110: iload #4
    //   112: ifeq -> 214
    //   115: iload #4
    //   117: iconst_3
    //   118: if_icmpne -> 124
    //   121: goto -> 214
    //   124: aload #14
    //   126: getfield O : I
    //   129: istore #4
    //   131: iload #4
    //   133: iconst_m1
    //   134: if_icmpeq -> 176
    //   137: iload #4
    //   139: ifeq -> 154
    //   142: iload #4
    //   144: iconst_1
    //   145: if_icmpeq -> 176
    //   148: iconst_0
    //   149: istore #4
    //   151: goto -> 202
    //   154: aload #14
    //   156: getfield e : Lb/g/b/i/l/l;
    //   159: getfield e : Lb/g/b/i/l/g;
    //   162: getfield g : I
    //   165: i2f
    //   166: aload #14
    //   168: getfield N : F
    //   171: fdiv
    //   172: fstore_2
    //   173: goto -> 195
    //   176: aload #14
    //   178: getfield e : Lb/g/b/i/l/l;
    //   181: getfield e : Lb/g/b/i/l/g;
    //   184: getfield g : I
    //   187: i2f
    //   188: aload #14
    //   190: getfield N : F
    //   193: fmul
    //   194: fstore_2
    //   195: fload_2
    //   196: ldc 0.5
    //   198: fadd
    //   199: f2i
    //   200: istore #4
    //   202: aload_0
    //   203: getfield e : Lb/g/b/i/l/g;
    //   206: iload #4
    //   208: invokevirtual c : (I)V
    //   211: goto -> 1516
    //   214: aload_0
    //   215: getfield b : Lb/g/b/i/d;
    //   218: astore #15
    //   220: aload #15
    //   222: getfield e : Lb/g/b/i/l/l;
    //   225: astore #14
    //   227: aload #14
    //   229: getfield h : Lb/g/b/i/l/f;
    //   232: astore_1
    //   233: aload #14
    //   235: getfield i : Lb/g/b/i/l/f;
    //   238: astore #14
    //   240: aload #15
    //   242: getfield y : Lb/g/b/i/c;
    //   245: getfield d : Lb/g/b/i/c;
    //   248: ifnull -> 257
    //   251: iconst_1
    //   252: istore #4
    //   254: goto -> 260
    //   257: iconst_0
    //   258: istore #4
    //   260: aload_0
    //   261: getfield b : Lb/g/b/i/d;
    //   264: getfield z : Lb/g/b/i/c;
    //   267: getfield d : Lb/g/b/i/c;
    //   270: ifnull -> 279
    //   273: iconst_1
    //   274: istore #5
    //   276: goto -> 282
    //   279: iconst_0
    //   280: istore #5
    //   282: aload_0
    //   283: getfield b : Lb/g/b/i/d;
    //   286: getfield A : Lb/g/b/i/c;
    //   289: getfield d : Lb/g/b/i/c;
    //   292: ifnull -> 301
    //   295: iconst_1
    //   296: istore #6
    //   298: goto -> 304
    //   301: iconst_0
    //   302: istore #6
    //   304: aload_0
    //   305: getfield b : Lb/g/b/i/d;
    //   308: getfield B : Lb/g/b/i/c;
    //   311: getfield d : Lb/g/b/i/c;
    //   314: ifnull -> 323
    //   317: iconst_1
    //   318: istore #7
    //   320: goto -> 326
    //   323: iconst_0
    //   324: istore #7
    //   326: aload_0
    //   327: getfield b : Lb/g/b/i/d;
    //   330: astore #15
    //   332: aload #15
    //   334: getfield O : I
    //   337: istore #8
    //   339: iload #4
    //   341: ifeq -> 954
    //   344: iload #5
    //   346: ifeq -> 954
    //   349: iload #6
    //   351: ifeq -> 954
    //   354: iload #7
    //   356: ifeq -> 954
    //   359: aload #15
    //   361: getfield N : F
    //   364: fstore_2
    //   365: aload_1
    //   366: getfield j : Z
    //   369: ifeq -> 552
    //   372: aload #14
    //   374: getfield j : Z
    //   377: ifeq -> 552
    //   380: aload_0
    //   381: getfield h : Lb/g/b/i/l/f;
    //   384: astore #13
    //   386: aload #13
    //   388: getfield c : Z
    //   391: ifeq -> 551
    //   394: aload_0
    //   395: getfield i : Lb/g/b/i/l/f;
    //   398: getfield c : Z
    //   401: ifne -> 407
    //   404: goto -> 551
    //   407: aload #13
    //   409: getfield l : Ljava/util/List;
    //   412: iconst_0
    //   413: invokeinterface get : (I)Ljava/lang/Object;
    //   418: checkcast b/g/b/i/l/f
    //   421: getfield g : I
    //   424: istore #4
    //   426: aload_0
    //   427: getfield h : Lb/g/b/i/l/f;
    //   430: getfield f : I
    //   433: istore #11
    //   435: aload_0
    //   436: getfield i : Lb/g/b/i/l/f;
    //   439: getfield l : Ljava/util/List;
    //   442: iconst_0
    //   443: invokeinterface get : (I)Ljava/lang/Object;
    //   448: checkcast b/g/b/i/l/f
    //   451: getfield g : I
    //   454: istore #5
    //   456: aload_0
    //   457: getfield i : Lb/g/b/i/l/f;
    //   460: getfield f : I
    //   463: istore #9
    //   465: aload_1
    //   466: getfield g : I
    //   469: istore #10
    //   471: aload_1
    //   472: getfield f : I
    //   475: istore #12
    //   477: aload #14
    //   479: getfield g : I
    //   482: istore #7
    //   484: aload #14
    //   486: getfield f : I
    //   489: istore #6
    //   491: aload_0
    //   492: getstatic b/g/b/i/l/j.k : [I
    //   495: iload #4
    //   497: iload #11
    //   499: iadd
    //   500: iload #5
    //   502: iload #9
    //   504: isub
    //   505: iload #10
    //   507: iload #12
    //   509: iadd
    //   510: iload #7
    //   512: iload #6
    //   514: isub
    //   515: fload_2
    //   516: iload #8
    //   518: invokevirtual m : ([IIIIIFI)V
    //   521: aload_0
    //   522: getfield e : Lb/g/b/i/l/g;
    //   525: getstatic b/g/b/i/l/j.k : [I
    //   528: iconst_0
    //   529: iaload
    //   530: invokevirtual c : (I)V
    //   533: aload_0
    //   534: getfield b : Lb/g/b/i/d;
    //   537: getfield e : Lb/g/b/i/l/l;
    //   540: getfield e : Lb/g/b/i/l/g;
    //   543: getstatic b/g/b/i/l/j.k : [I
    //   546: iconst_1
    //   547: iaload
    //   548: invokevirtual c : (I)V
    //   551: return
    //   552: aload_0
    //   553: getfield h : Lb/g/b/i/l/f;
    //   556: astore #15
    //   558: aload #15
    //   560: getfield j : Z
    //   563: ifeq -> 740
    //   566: aload_0
    //   567: getfield i : Lb/g/b/i/l/f;
    //   570: astore #16
    //   572: aload #16
    //   574: getfield j : Z
    //   577: ifeq -> 740
    //   580: aload_1
    //   581: getfield c : Z
    //   584: ifeq -> 739
    //   587: aload #14
    //   589: getfield c : Z
    //   592: ifne -> 598
    //   595: goto -> 739
    //   598: aload #15
    //   600: getfield g : I
    //   603: istore #11
    //   605: aload #15
    //   607: getfield f : I
    //   610: istore #5
    //   612: aload #16
    //   614: getfield g : I
    //   617: istore #9
    //   619: aload #16
    //   621: getfield f : I
    //   624: istore #7
    //   626: aload_1
    //   627: getfield l : Ljava/util/List;
    //   630: iconst_0
    //   631: invokeinterface get : (I)Ljava/lang/Object;
    //   636: checkcast b/g/b/i/l/f
    //   639: getfield g : I
    //   642: istore #4
    //   644: aload_1
    //   645: getfield f : I
    //   648: istore #12
    //   650: aload #14
    //   652: getfield l : Ljava/util/List;
    //   655: iconst_0
    //   656: invokeinterface get : (I)Ljava/lang/Object;
    //   661: checkcast b/g/b/i/l/f
    //   664: getfield g : I
    //   667: istore #10
    //   669: aload #14
    //   671: getfield f : I
    //   674: istore #6
    //   676: aload_0
    //   677: getstatic b/g/b/i/l/j.k : [I
    //   680: iload #11
    //   682: iload #5
    //   684: iadd
    //   685: iload #9
    //   687: iload #7
    //   689: isub
    //   690: iload #4
    //   692: iload #12
    //   694: iadd
    //   695: iload #10
    //   697: iload #6
    //   699: isub
    //   700: fload_2
    //   701: iload #8
    //   703: invokevirtual m : ([IIIIIFI)V
    //   706: aload_0
    //   707: getfield e : Lb/g/b/i/l/g;
    //   710: getstatic b/g/b/i/l/j.k : [I
    //   713: iconst_0
    //   714: iaload
    //   715: invokevirtual c : (I)V
    //   718: aload_0
    //   719: getfield b : Lb/g/b/i/d;
    //   722: getfield e : Lb/g/b/i/l/l;
    //   725: getfield e : Lb/g/b/i/l/g;
    //   728: getstatic b/g/b/i/l/j.k : [I
    //   731: iconst_1
    //   732: iaload
    //   733: invokevirtual c : (I)V
    //   736: goto -> 740
    //   739: return
    //   740: aload_0
    //   741: getfield h : Lb/g/b/i/l/f;
    //   744: astore #15
    //   746: aload #15
    //   748: getfield c : Z
    //   751: ifeq -> 953
    //   754: aload_0
    //   755: getfield i : Lb/g/b/i/l/f;
    //   758: getfield c : Z
    //   761: ifeq -> 953
    //   764: aload_1
    //   765: getfield c : Z
    //   768: ifeq -> 953
    //   771: aload #14
    //   773: getfield c : Z
    //   776: ifne -> 782
    //   779: goto -> 953
    //   782: aload #15
    //   784: getfield l : Ljava/util/List;
    //   787: iconst_0
    //   788: invokeinterface get : (I)Ljava/lang/Object;
    //   793: checkcast b/g/b/i/l/f
    //   796: getfield g : I
    //   799: istore #4
    //   801: aload_0
    //   802: getfield h : Lb/g/b/i/l/f;
    //   805: getfield f : I
    //   808: istore #6
    //   810: aload_0
    //   811: getfield i : Lb/g/b/i/l/f;
    //   814: getfield l : Ljava/util/List;
    //   817: iconst_0
    //   818: invokeinterface get : (I)Ljava/lang/Object;
    //   823: checkcast b/g/b/i/l/f
    //   826: getfield g : I
    //   829: istore #9
    //   831: aload_0
    //   832: getfield i : Lb/g/b/i/l/f;
    //   835: getfield f : I
    //   838: istore #11
    //   840: aload_1
    //   841: getfield l : Ljava/util/List;
    //   844: iconst_0
    //   845: invokeinterface get : (I)Ljava/lang/Object;
    //   850: checkcast b/g/b/i/l/f
    //   853: getfield g : I
    //   856: istore #5
    //   858: aload_1
    //   859: getfield f : I
    //   862: istore #12
    //   864: aload #14
    //   866: getfield l : Ljava/util/List;
    //   869: iconst_0
    //   870: invokeinterface get : (I)Ljava/lang/Object;
    //   875: checkcast b/g/b/i/l/f
    //   878: getfield g : I
    //   881: istore #10
    //   883: aload #14
    //   885: getfield f : I
    //   888: istore #7
    //   890: aload_0
    //   891: getstatic b/g/b/i/l/j.k : [I
    //   894: iload #4
    //   896: iload #6
    //   898: iadd
    //   899: iload #9
    //   901: iload #11
    //   903: isub
    //   904: iload #5
    //   906: iload #12
    //   908: iadd
    //   909: iload #10
    //   911: iload #7
    //   913: isub
    //   914: fload_2
    //   915: iload #8
    //   917: invokevirtual m : ([IIIIIFI)V
    //   920: aload_0
    //   921: getfield e : Lb/g/b/i/l/g;
    //   924: getstatic b/g/b/i/l/j.k : [I
    //   927: iconst_0
    //   928: iaload
    //   929: invokevirtual c : (I)V
    //   932: aload_0
    //   933: getfield b : Lb/g/b/i/d;
    //   936: getfield e : Lb/g/b/i/l/l;
    //   939: getfield e : Lb/g/b/i/l/g;
    //   942: astore_1
    //   943: getstatic b/g/b/i/l/j.k : [I
    //   946: iconst_1
    //   947: iaload
    //   948: istore #4
    //   950: goto -> 1510
    //   953: return
    //   954: iload #4
    //   956: ifeq -> 1216
    //   959: iload #6
    //   961: ifeq -> 1216
    //   964: aload_0
    //   965: getfield h : Lb/g/b/i/l/f;
    //   968: astore_1
    //   969: aload_1
    //   970: getfield c : Z
    //   973: ifeq -> 1215
    //   976: aload_0
    //   977: getfield i : Lb/g/b/i/l/f;
    //   980: getfield c : Z
    //   983: ifne -> 989
    //   986: goto -> 1215
    //   989: aload_0
    //   990: getfield b : Lb/g/b/i/d;
    //   993: getfield N : F
    //   996: fstore_2
    //   997: aload_1
    //   998: getfield l : Ljava/util/List;
    //   1001: iconst_0
    //   1002: invokeinterface get : (I)Ljava/lang/Object;
    //   1007: checkcast b/g/b/i/l/f
    //   1010: getfield g : I
    //   1013: aload_0
    //   1014: getfield h : Lb/g/b/i/l/f;
    //   1017: getfield f : I
    //   1020: iadd
    //   1021: istore #4
    //   1023: aload_0
    //   1024: getfield i : Lb/g/b/i/l/f;
    //   1027: getfield l : Ljava/util/List;
    //   1030: iconst_0
    //   1031: invokeinterface get : (I)Ljava/lang/Object;
    //   1036: checkcast b/g/b/i/l/f
    //   1039: getfield g : I
    //   1042: aload_0
    //   1043: getfield i : Lb/g/b/i/l/f;
    //   1046: getfield f : I
    //   1049: isub
    //   1050: istore #5
    //   1052: iload #8
    //   1054: iconst_m1
    //   1055: if_icmpeq -> 1128
    //   1058: iload #8
    //   1060: ifeq -> 1128
    //   1063: iload #8
    //   1065: iconst_1
    //   1066: if_icmpeq -> 1072
    //   1069: goto -> 1516
    //   1072: aload_0
    //   1073: iload #5
    //   1075: iload #4
    //   1077: isub
    //   1078: iconst_0
    //   1079: invokevirtual g : (II)I
    //   1082: istore #5
    //   1084: iload #5
    //   1086: i2f
    //   1087: fload_2
    //   1088: fdiv
    //   1089: ldc 0.5
    //   1091: fadd
    //   1092: f2i
    //   1093: istore #7
    //   1095: aload_0
    //   1096: iload #7
    //   1098: iconst_1
    //   1099: invokevirtual g : (II)I
    //   1102: istore #6
    //   1104: iload #6
    //   1106: istore #4
    //   1108: iload #7
    //   1110: iload #6
    //   1112: if_icmpeq -> 1188
    //   1115: iload #6
    //   1117: i2f
    //   1118: fload_2
    //   1119: fmul
    //   1120: fstore_2
    //   1121: iload #6
    //   1123: istore #4
    //   1125: goto -> 1181
    //   1128: aload_0
    //   1129: iload #5
    //   1131: iload #4
    //   1133: isub
    //   1134: iconst_0
    //   1135: invokevirtual g : (II)I
    //   1138: istore #5
    //   1140: iload #5
    //   1142: i2f
    //   1143: fload_2
    //   1144: fmul
    //   1145: ldc 0.5
    //   1147: fadd
    //   1148: f2i
    //   1149: istore #7
    //   1151: aload_0
    //   1152: iload #7
    //   1154: iconst_1
    //   1155: invokevirtual g : (II)I
    //   1158: istore #6
    //   1160: iload #6
    //   1162: istore #4
    //   1164: iload #7
    //   1166: iload #6
    //   1168: if_icmpeq -> 1188
    //   1171: iload #6
    //   1173: i2f
    //   1174: fload_2
    //   1175: fdiv
    //   1176: fstore_2
    //   1177: iload #6
    //   1179: istore #4
    //   1181: fload_2
    //   1182: ldc 0.5
    //   1184: fadd
    //   1185: f2i
    //   1186: istore #5
    //   1188: aload_0
    //   1189: getfield e : Lb/g/b/i/l/g;
    //   1192: iload #5
    //   1194: invokevirtual c : (I)V
    //   1197: aload_0
    //   1198: getfield b : Lb/g/b/i/d;
    //   1201: getfield e : Lb/g/b/i/l/l;
    //   1204: getfield e : Lb/g/b/i/l/g;
    //   1207: iload #4
    //   1209: invokevirtual c : (I)V
    //   1212: goto -> 1516
    //   1215: return
    //   1216: iload #5
    //   1218: ifeq -> 1516
    //   1221: iload #7
    //   1223: ifeq -> 1516
    //   1226: aload_1
    //   1227: getfield c : Z
    //   1230: ifeq -> 1459
    //   1233: aload #14
    //   1235: getfield c : Z
    //   1238: ifne -> 1244
    //   1241: goto -> 1459
    //   1244: aload_0
    //   1245: getfield b : Lb/g/b/i/d;
    //   1248: getfield N : F
    //   1251: fstore_2
    //   1252: aload_1
    //   1253: getfield l : Ljava/util/List;
    //   1256: iconst_0
    //   1257: invokeinterface get : (I)Ljava/lang/Object;
    //   1262: checkcast b/g/b/i/l/f
    //   1265: getfield g : I
    //   1268: aload_1
    //   1269: getfield f : I
    //   1272: iadd
    //   1273: istore #5
    //   1275: aload #14
    //   1277: getfield l : Ljava/util/List;
    //   1280: iconst_0
    //   1281: invokeinterface get : (I)Ljava/lang/Object;
    //   1286: checkcast b/g/b/i/l/f
    //   1289: getfield g : I
    //   1292: aload #14
    //   1294: getfield f : I
    //   1297: isub
    //   1298: istore #4
    //   1300: iload #8
    //   1302: iconst_m1
    //   1303: if_icmpeq -> 1376
    //   1306: iload #8
    //   1308: ifeq -> 1320
    //   1311: iload #8
    //   1313: iconst_1
    //   1314: if_icmpeq -> 1376
    //   1317: goto -> 1516
    //   1320: aload_0
    //   1321: iload #4
    //   1323: iload #5
    //   1325: isub
    //   1326: iconst_1
    //   1327: invokevirtual g : (II)I
    //   1330: istore #4
    //   1332: iload #4
    //   1334: i2f
    //   1335: fload_2
    //   1336: fmul
    //   1337: ldc 0.5
    //   1339: fadd
    //   1340: f2i
    //   1341: istore #7
    //   1343: aload_0
    //   1344: iload #7
    //   1346: iconst_0
    //   1347: invokevirtual g : (II)I
    //   1350: istore #6
    //   1352: iload #6
    //   1354: istore #5
    //   1356: iload #7
    //   1358: iload #6
    //   1360: if_icmpeq -> 1436
    //   1363: iload #6
    //   1365: i2f
    //   1366: fload_2
    //   1367: fdiv
    //   1368: fstore_2
    //   1369: iload #6
    //   1371: istore #5
    //   1373: goto -> 1429
    //   1376: aload_0
    //   1377: iload #4
    //   1379: iload #5
    //   1381: isub
    //   1382: iconst_1
    //   1383: invokevirtual g : (II)I
    //   1386: istore #4
    //   1388: iload #4
    //   1390: i2f
    //   1391: fload_2
    //   1392: fdiv
    //   1393: ldc 0.5
    //   1395: fadd
    //   1396: f2i
    //   1397: istore #7
    //   1399: aload_0
    //   1400: iload #7
    //   1402: iconst_0
    //   1403: invokevirtual g : (II)I
    //   1406: istore #6
    //   1408: iload #6
    //   1410: istore #5
    //   1412: iload #7
    //   1414: iload #6
    //   1416: if_icmpeq -> 1436
    //   1419: iload #6
    //   1421: i2f
    //   1422: fload_2
    //   1423: fmul
    //   1424: fstore_2
    //   1425: iload #6
    //   1427: istore #5
    //   1429: fload_2
    //   1430: ldc 0.5
    //   1432: fadd
    //   1433: f2i
    //   1434: istore #4
    //   1436: aload_0
    //   1437: getfield e : Lb/g/b/i/l/g;
    //   1440: iload #5
    //   1442: invokevirtual c : (I)V
    //   1445: aload_0
    //   1446: getfield b : Lb/g/b/i/d;
    //   1449: getfield e : Lb/g/b/i/l/l;
    //   1452: getfield e : Lb/g/b/i/l/g;
    //   1455: astore_1
    //   1456: goto -> 1510
    //   1459: return
    //   1460: aload #14
    //   1462: getfield K : Lb/g/b/i/d;
    //   1465: astore #15
    //   1467: aload #15
    //   1469: ifnull -> 1516
    //   1472: aload #15
    //   1474: getfield d : Lb/g/b/i/l/j;
    //   1477: getfield e : Lb/g/b/i/l/g;
    //   1480: astore #15
    //   1482: aload #15
    //   1484: getfield j : Z
    //   1487: ifeq -> 1516
    //   1490: aload #14
    //   1492: getfield o : F
    //   1495: fstore_2
    //   1496: aload #15
    //   1498: getfield g : I
    //   1501: i2f
    //   1502: fload_2
    //   1503: fmul
    //   1504: ldc 0.5
    //   1506: fadd
    //   1507: f2i
    //   1508: istore #4
    //   1510: aload_1
    //   1511: iload #4
    //   1513: invokevirtual c : (I)V
    //   1516: aload_0
    //   1517: getfield h : Lb/g/b/i/l/f;
    //   1520: astore_1
    //   1521: aload_1
    //   1522: getfield c : Z
    //   1525: ifeq -> 2069
    //   1528: aload_0
    //   1529: getfield i : Lb/g/b/i/l/f;
    //   1532: astore #14
    //   1534: aload #14
    //   1536: getfield c : Z
    //   1539: ifne -> 1545
    //   1542: goto -> 2069
    //   1545: aload_1
    //   1546: getfield j : Z
    //   1549: ifeq -> 1571
    //   1552: aload #14
    //   1554: getfield j : Z
    //   1557: ifeq -> 1571
    //   1560: aload_0
    //   1561: getfield e : Lb/g/b/i/l/g;
    //   1564: getfield j : Z
    //   1567: ifeq -> 1571
    //   1570: return
    //   1571: aload_0
    //   1572: getfield e : Lb/g/b/i/l/g;
    //   1575: getfield j : Z
    //   1578: ifne -> 1710
    //   1581: aload_0
    //   1582: getfield d : Lb/g/b/i/d$a;
    //   1585: aload #13
    //   1587: if_acmpne -> 1710
    //   1590: aload_0
    //   1591: getfield b : Lb/g/b/i/d;
    //   1594: astore_1
    //   1595: aload_1
    //   1596: getfield j : I
    //   1599: ifne -> 1710
    //   1602: aload_1
    //   1603: invokevirtual s : ()Z
    //   1606: ifne -> 1710
    //   1609: aload_0
    //   1610: getfield h : Lb/g/b/i/l/f;
    //   1613: getfield l : Ljava/util/List;
    //   1616: iconst_0
    //   1617: invokeinterface get : (I)Ljava/lang/Object;
    //   1622: checkcast b/g/b/i/l/f
    //   1625: astore #13
    //   1627: aload_0
    //   1628: getfield i : Lb/g/b/i/l/f;
    //   1631: getfield l : Ljava/util/List;
    //   1634: iconst_0
    //   1635: invokeinterface get : (I)Ljava/lang/Object;
    //   1640: checkcast b/g/b/i/l/f
    //   1643: astore_1
    //   1644: aload #13
    //   1646: getfield g : I
    //   1649: istore #4
    //   1651: aload_0
    //   1652: getfield h : Lb/g/b/i/l/f;
    //   1655: astore #13
    //   1657: iload #4
    //   1659: aload #13
    //   1661: getfield f : I
    //   1664: iadd
    //   1665: istore #5
    //   1667: aload_1
    //   1668: getfield g : I
    //   1671: aload_0
    //   1672: getfield i : Lb/g/b/i/l/f;
    //   1675: getfield f : I
    //   1678: iadd
    //   1679: istore #4
    //   1681: aload #13
    //   1683: iload #5
    //   1685: invokevirtual c : (I)V
    //   1688: aload_0
    //   1689: getfield i : Lb/g/b/i/l/f;
    //   1692: iload #4
    //   1694: invokevirtual c : (I)V
    //   1697: aload_0
    //   1698: getfield e : Lb/g/b/i/l/g;
    //   1701: iload #4
    //   1703: iload #5
    //   1705: isub
    //   1706: invokevirtual c : (I)V
    //   1709: return
    //   1710: aload_0
    //   1711: getfield e : Lb/g/b/i/l/g;
    //   1714: getfield j : Z
    //   1717: ifne -> 1897
    //   1720: aload_0
    //   1721: getfield d : Lb/g/b/i/d$a;
    //   1724: aload #13
    //   1726: if_acmpne -> 1897
    //   1729: aload_0
    //   1730: getfield a : I
    //   1733: iconst_1
    //   1734: if_icmpne -> 1897
    //   1737: aload_0
    //   1738: getfield h : Lb/g/b/i/l/f;
    //   1741: getfield l : Ljava/util/List;
    //   1744: invokeinterface size : ()I
    //   1749: ifle -> 1897
    //   1752: aload_0
    //   1753: getfield i : Lb/g/b/i/l/f;
    //   1756: getfield l : Ljava/util/List;
    //   1759: invokeinterface size : ()I
    //   1764: ifle -> 1897
    //   1767: aload_0
    //   1768: getfield h : Lb/g/b/i/l/f;
    //   1771: getfield l : Ljava/util/List;
    //   1774: iconst_0
    //   1775: invokeinterface get : (I)Ljava/lang/Object;
    //   1780: checkcast b/g/b/i/l/f
    //   1783: astore #13
    //   1785: aload_0
    //   1786: getfield i : Lb/g/b/i/l/f;
    //   1789: getfield l : Ljava/util/List;
    //   1792: iconst_0
    //   1793: invokeinterface get : (I)Ljava/lang/Object;
    //   1798: checkcast b/g/b/i/l/f
    //   1801: astore_1
    //   1802: aload #13
    //   1804: getfield g : I
    //   1807: istore #4
    //   1809: aload_0
    //   1810: getfield h : Lb/g/b/i/l/f;
    //   1813: getfield f : I
    //   1816: istore #5
    //   1818: aload_1
    //   1819: getfield g : I
    //   1822: aload_0
    //   1823: getfield i : Lb/g/b/i/l/f;
    //   1826: getfield f : I
    //   1829: iadd
    //   1830: iload #4
    //   1832: iload #5
    //   1834: iadd
    //   1835: isub
    //   1836: aload_0
    //   1837: getfield e : Lb/g/b/i/l/g;
    //   1840: getfield m : I
    //   1843: invokestatic min : (II)I
    //   1846: istore #4
    //   1848: aload_0
    //   1849: getfield b : Lb/g/b/i/d;
    //   1852: astore_1
    //   1853: aload_1
    //   1854: getfield n : I
    //   1857: istore #6
    //   1859: aload_1
    //   1860: getfield m : I
    //   1863: iload #4
    //   1865: invokestatic max : (II)I
    //   1868: istore #5
    //   1870: iload #5
    //   1872: istore #4
    //   1874: iload #6
    //   1876: ifle -> 1888
    //   1879: iload #6
    //   1881: iload #5
    //   1883: invokestatic min : (II)I
    //   1886: istore #4
    //   1888: aload_0
    //   1889: getfield e : Lb/g/b/i/l/g;
    //   1892: iload #4
    //   1894: invokevirtual c : (I)V
    //   1897: aload_0
    //   1898: getfield e : Lb/g/b/i/l/g;
    //   1901: getfield j : Z
    //   1904: ifne -> 1908
    //   1907: return
    //   1908: aload_0
    //   1909: getfield h : Lb/g/b/i/l/f;
    //   1912: getfield l : Ljava/util/List;
    //   1915: iconst_0
    //   1916: invokeinterface get : (I)Ljava/lang/Object;
    //   1921: checkcast b/g/b/i/l/f
    //   1924: astore #13
    //   1926: aload_0
    //   1927: getfield i : Lb/g/b/i/l/f;
    //   1930: getfield l : Ljava/util/List;
    //   1933: iconst_0
    //   1934: invokeinterface get : (I)Ljava/lang/Object;
    //   1939: checkcast b/g/b/i/l/f
    //   1942: astore_1
    //   1943: aload #13
    //   1945: getfield g : I
    //   1948: istore #5
    //   1950: aload_0
    //   1951: getfield h : Lb/g/b/i/l/f;
    //   1954: getfield f : I
    //   1957: istore #7
    //   1959: aload_1
    //   1960: getfield g : I
    //   1963: istore #4
    //   1965: aload_0
    //   1966: getfield i : Lb/g/b/i/l/f;
    //   1969: getfield f : I
    //   1972: istore #6
    //   1974: aload_0
    //   1975: getfield b : Lb/g/b/i/d;
    //   1978: getfield U : F
    //   1981: fstore_2
    //   1982: aload #13
    //   1984: aload_1
    //   1985: if_acmpne -> 1994
    //   1988: ldc 0.5
    //   1990: fstore_2
    //   1991: goto -> 2008
    //   1994: iload #7
    //   1996: iload #5
    //   1998: iadd
    //   1999: istore #5
    //   2001: iload #6
    //   2003: iload #4
    //   2005: iadd
    //   2006: istore #4
    //   2008: aload_0
    //   2009: getfield e : Lb/g/b/i/l/g;
    //   2012: getfield g : I
    //   2015: istore #6
    //   2017: aload_0
    //   2018: getfield h : Lb/g/b/i/l/f;
    //   2021: astore_1
    //   2022: iload #5
    //   2024: i2f
    //   2025: fstore_3
    //   2026: aload_1
    //   2027: iload #4
    //   2029: iload #5
    //   2031: isub
    //   2032: iload #6
    //   2034: isub
    //   2035: i2f
    //   2036: fload_2
    //   2037: fmul
    //   2038: fload_3
    //   2039: ldc 0.5
    //   2041: fadd
    //   2042: fadd
    //   2043: f2i
    //   2044: invokevirtual c : (I)V
    //   2047: aload_0
    //   2048: getfield i : Lb/g/b/i/l/f;
    //   2051: aload_0
    //   2052: getfield h : Lb/g/b/i/l/f;
    //   2055: getfield g : I
    //   2058: aload_0
    //   2059: getfield e : Lb/g/b/i/l/g;
    //   2062: getfield g : I
    //   2065: iadd
    //   2066: invokevirtual c : (I)V
    //   2069: return
  }
  
  public void d() {
    // Byte code:
    //   0: getstatic b/g/b/i/d$a.d : Lb/g/b/i/d$a;
    //   3: astore #4
    //   5: getstatic b/g/b/i/d$a.b : Lb/g/b/i/d$a;
    //   8: astore #6
    //   10: getstatic b/g/b/i/d$a.e : Lb/g/b/i/d$a;
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
    //   35: invokevirtual o : ()I
    //   38: invokevirtual c : (I)V
    //   41: aload_0
    //   42: getfield e : Lb/g/b/i/l/g;
    //   45: getfield j : Z
    //   48: ifne -> 234
    //   51: aload_0
    //   52: getfield b : Lb/g/b/i/d;
    //   55: invokevirtual j : ()Lb/g/b/i/d$a;
    //   58: astore #7
    //   60: aload_0
    //   61: aload #7
    //   63: putfield d : Lb/g/b/i/d$a;
    //   66: aload #7
    //   68: aload #4
    //   70: if_acmpeq -> 331
    //   73: aload #7
    //   75: aload #5
    //   77: if_acmpne -> 208
    //   80: aload_0
    //   81: getfield b : Lb/g/b/i/d;
    //   84: getfield K : Lb/g/b/i/d;
    //   87: astore #7
    //   89: aload #7
    //   91: ifnull -> 104
    //   94: aload #7
    //   96: invokevirtual j : ()Lb/g/b/i/d$a;
    //   99: aload #6
    //   101: if_acmpeq -> 114
    //   104: aload #7
    //   106: invokevirtual j : ()Lb/g/b/i/d$a;
    //   109: aload #5
    //   111: if_acmpne -> 208
    //   114: aload #7
    //   116: invokevirtual o : ()I
    //   119: istore_2
    //   120: aload_0
    //   121: getfield b : Lb/g/b/i/d;
    //   124: getfield y : Lb/g/b/i/c;
    //   127: invokevirtual b : ()I
    //   130: istore_1
    //   131: aload_0
    //   132: getfield b : Lb/g/b/i/d;
    //   135: getfield A : Lb/g/b/i/c;
    //   138: invokevirtual b : ()I
    //   141: istore_3
    //   142: aload_0
    //   143: aload_0
    //   144: getfield h : Lb/g/b/i/l/f;
    //   147: aload #7
    //   149: getfield d : Lb/g/b/i/l/j;
    //   152: getfield h : Lb/g/b/i/l/f;
    //   155: aload_0
    //   156: getfield b : Lb/g/b/i/d;
    //   159: getfield y : Lb/g/b/i/c;
    //   162: invokevirtual b : ()I
    //   165: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   168: aload_0
    //   169: aload_0
    //   170: getfield i : Lb/g/b/i/l/f;
    //   173: aload #7
    //   175: getfield d : Lb/g/b/i/l/j;
    //   178: getfield i : Lb/g/b/i/l/f;
    //   181: aload_0
    //   182: getfield b : Lb/g/b/i/d;
    //   185: getfield A : Lb/g/b/i/c;
    //   188: invokevirtual b : ()I
    //   191: ineg
    //   192: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   195: aload_0
    //   196: getfield e : Lb/g/b/i/l/g;
    //   199: iload_2
    //   200: iload_1
    //   201: isub
    //   202: iload_3
    //   203: isub
    //   204: invokevirtual c : (I)V
    //   207: return
    //   208: aload_0
    //   209: getfield d : Lb/g/b/i/d$a;
    //   212: aload #6
    //   214: if_acmpne -> 331
    //   217: aload_0
    //   218: getfield e : Lb/g/b/i/l/g;
    //   221: aload_0
    //   222: getfield b : Lb/g/b/i/d;
    //   225: invokevirtual o : ()I
    //   228: invokevirtual c : (I)V
    //   231: goto -> 331
    //   234: aload_0
    //   235: getfield d : Lb/g/b/i/d$a;
    //   238: aload #5
    //   240: if_acmpne -> 331
    //   243: aload_0
    //   244: getfield b : Lb/g/b/i/d;
    //   247: getfield K : Lb/g/b/i/d;
    //   250: astore #7
    //   252: aload #7
    //   254: ifnull -> 267
    //   257: aload #7
    //   259: invokevirtual j : ()Lb/g/b/i/d$a;
    //   262: aload #6
    //   264: if_acmpeq -> 277
    //   267: aload #7
    //   269: invokevirtual j : ()Lb/g/b/i/d$a;
    //   272: aload #5
    //   274: if_acmpne -> 331
    //   277: aload_0
    //   278: aload_0
    //   279: getfield h : Lb/g/b/i/l/f;
    //   282: aload #7
    //   284: getfield d : Lb/g/b/i/l/j;
    //   287: getfield h : Lb/g/b/i/l/f;
    //   290: aload_0
    //   291: getfield b : Lb/g/b/i/d;
    //   294: getfield y : Lb/g/b/i/c;
    //   297: invokevirtual b : ()I
    //   300: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   303: aload_0
    //   304: aload_0
    //   305: getfield i : Lb/g/b/i/l/f;
    //   308: aload #7
    //   310: getfield d : Lb/g/b/i/l/j;
    //   313: getfield i : Lb/g/b/i/l/f;
    //   316: aload_0
    //   317: getfield b : Lb/g/b/i/d;
    //   320: getfield A : Lb/g/b/i/c;
    //   323: invokevirtual b : ()I
    //   326: ineg
    //   327: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   330: return
    //   331: aload_0
    //   332: getfield e : Lb/g/b/i/l/g;
    //   335: getfield j : Z
    //   338: ifeq -> 880
    //   341: aload_0
    //   342: getfield b : Lb/g/b/i/d;
    //   345: astore #5
    //   347: aload #5
    //   349: getfield a : Z
    //   352: ifeq -> 880
    //   355: aload #5
    //   357: getfield G : [Lb/g/b/i/c;
    //   360: astore #4
    //   362: aload #4
    //   364: iconst_0
    //   365: aaload
    //   366: getfield d : Lb/g/b/i/c;
    //   369: ifnull -> 591
    //   372: aload #4
    //   374: iconst_1
    //   375: aaload
    //   376: getfield d : Lb/g/b/i/c;
    //   379: ifnull -> 591
    //   382: aload #5
    //   384: invokevirtual s : ()Z
    //   387: ifeq -> 429
    //   390: aload_0
    //   391: getfield h : Lb/g/b/i/l/f;
    //   394: aload_0
    //   395: getfield b : Lb/g/b/i/d;
    //   398: getfield G : [Lb/g/b/i/c;
    //   401: iconst_0
    //   402: aaload
    //   403: invokevirtual b : ()I
    //   406: putfield f : I
    //   409: aload_0
    //   410: getfield i : Lb/g/b/i/l/f;
    //   413: astore #5
    //   415: aload_0
    //   416: getfield b : Lb/g/b/i/d;
    //   419: getfield G : [Lb/g/b/i/c;
    //   422: iconst_1
    //   423: aaload
    //   424: astore #4
    //   426: goto -> 1551
    //   429: aload_0
    //   430: aload_0
    //   431: getfield b : Lb/g/b/i/d;
    //   434: getfield G : [Lb/g/b/i/c;
    //   437: iconst_0
    //   438: aaload
    //   439: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   442: astore #4
    //   444: aload #4
    //   446: ifnull -> 500
    //   449: aload_0
    //   450: getfield h : Lb/g/b/i/l/f;
    //   453: astore #5
    //   455: aload_0
    //   456: getfield b : Lb/g/b/i/d;
    //   459: getfield G : [Lb/g/b/i/c;
    //   462: iconst_0
    //   463: aaload
    //   464: invokevirtual b : ()I
    //   467: istore_1
    //   468: aload #5
    //   470: getfield l : Ljava/util/List;
    //   473: aload #4
    //   475: invokeinterface add : (Ljava/lang/Object;)Z
    //   480: pop
    //   481: aload #5
    //   483: iload_1
    //   484: putfield f : I
    //   487: aload #4
    //   489: getfield k : Ljava/util/List;
    //   492: aload #5
    //   494: invokeinterface add : (Ljava/lang/Object;)Z
    //   499: pop
    //   500: aload_0
    //   501: aload_0
    //   502: getfield b : Lb/g/b/i/d;
    //   505: getfield G : [Lb/g/b/i/c;
    //   508: iconst_1
    //   509: aaload
    //   510: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   513: astore #5
    //   515: aload #5
    //   517: ifnull -> 572
    //   520: aload_0
    //   521: getfield i : Lb/g/b/i/l/f;
    //   524: astore #4
    //   526: aload_0
    //   527: getfield b : Lb/g/b/i/d;
    //   530: getfield G : [Lb/g/b/i/c;
    //   533: iconst_1
    //   534: aaload
    //   535: invokevirtual b : ()I
    //   538: ineg
    //   539: istore_1
    //   540: aload #4
    //   542: getfield l : Ljava/util/List;
    //   545: aload #5
    //   547: invokeinterface add : (Ljava/lang/Object;)Z
    //   552: pop
    //   553: aload #4
    //   555: iload_1
    //   556: putfield f : I
    //   559: aload #5
    //   561: getfield k : Ljava/util/List;
    //   564: aload #4
    //   566: invokeinterface add : (Ljava/lang/Object;)Z
    //   571: pop
    //   572: aload_0
    //   573: getfield h : Lb/g/b/i/l/f;
    //   576: iconst_1
    //   577: putfield b : Z
    //   580: aload_0
    //   581: getfield i : Lb/g/b/i/l/f;
    //   584: iconst_1
    //   585: putfield b : Z
    //   588: goto -> 1906
    //   591: aload_0
    //   592: getfield b : Lb/g/b/i/d;
    //   595: astore #5
    //   597: aload #5
    //   599: getfield G : [Lb/g/b/i/c;
    //   602: astore #4
    //   604: aload #4
    //   606: iconst_0
    //   607: aaload
    //   608: getfield d : Lb/g/b/i/c;
    //   611: ifnull -> 683
    //   614: aload_0
    //   615: aload #4
    //   617: iconst_0
    //   618: aaload
    //   619: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   622: astore #4
    //   624: aload #4
    //   626: ifnull -> 1906
    //   629: aload_0
    //   630: getfield h : Lb/g/b/i/l/f;
    //   633: astore #5
    //   635: aload_0
    //   636: getfield b : Lb/g/b/i/d;
    //   639: getfield G : [Lb/g/b/i/c;
    //   642: iconst_0
    //   643: aaload
    //   644: invokevirtual b : ()I
    //   647: istore_1
    //   648: aload #5
    //   650: getfield l : Ljava/util/List;
    //   653: aload #4
    //   655: invokeinterface add : (Ljava/lang/Object;)Z
    //   660: pop
    //   661: aload #5
    //   663: iload_1
    //   664: putfield f : I
    //   667: aload #4
    //   669: getfield k : Ljava/util/List;
    //   672: aload #5
    //   674: invokeinterface add : (Ljava/lang/Object;)Z
    //   679: pop
    //   680: goto -> 848
    //   683: aload #4
    //   685: iconst_1
    //   686: aaload
    //   687: getfield d : Lb/g/b/i/c;
    //   690: ifnull -> 784
    //   693: aload_0
    //   694: aload #4
    //   696: iconst_1
    //   697: aaload
    //   698: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   701: astore #4
    //   703: aload #4
    //   705: ifnull -> 1906
    //   708: aload_0
    //   709: getfield i : Lb/g/b/i/l/f;
    //   712: astore #5
    //   714: aload_0
    //   715: getfield b : Lb/g/b/i/d;
    //   718: getfield G : [Lb/g/b/i/c;
    //   721: iconst_1
    //   722: aaload
    //   723: invokevirtual b : ()I
    //   726: ineg
    //   727: istore_1
    //   728: aload #5
    //   730: getfield l : Ljava/util/List;
    //   733: aload #4
    //   735: invokeinterface add : (Ljava/lang/Object;)Z
    //   740: pop
    //   741: aload #5
    //   743: iload_1
    //   744: putfield f : I
    //   747: aload #4
    //   749: getfield k : Ljava/util/List;
    //   752: aload #5
    //   754: invokeinterface add : (Ljava/lang/Object;)Z
    //   759: pop
    //   760: aload_0
    //   761: getfield h : Lb/g/b/i/l/f;
    //   764: astore #4
    //   766: aload_0
    //   767: getfield i : Lb/g/b/i/l/f;
    //   770: astore #5
    //   772: aload_0
    //   773: getfield e : Lb/g/b/i/l/g;
    //   776: getfield g : I
    //   779: ineg
    //   780: istore_1
    //   781: goto -> 868
    //   784: aload #5
    //   786: instanceof b/g/b/i/g
    //   789: ifne -> 1906
    //   792: aload #5
    //   794: getfield K : Lb/g/b/i/d;
    //   797: ifnull -> 1906
    //   800: aload #5
    //   802: getstatic b/g/b/i/c$a.h : Lb/g/b/i/c$a;
    //   805: invokevirtual f : (Lb/g/b/i/c$a;)Lb/g/b/i/c;
    //   808: getfield d : Lb/g/b/i/c;
    //   811: ifnonnull -> 1906
    //   814: aload_0
    //   815: getfield b : Lb/g/b/i/d;
    //   818: astore #4
    //   820: aload #4
    //   822: getfield K : Lb/g/b/i/d;
    //   825: getfield d : Lb/g/b/i/l/j;
    //   828: getfield h : Lb/g/b/i/l/f;
    //   831: astore #5
    //   833: aload_0
    //   834: aload_0
    //   835: getfield h : Lb/g/b/i/l/f;
    //   838: aload #5
    //   840: aload #4
    //   842: invokevirtual p : ()I
    //   845: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   848: aload_0
    //   849: getfield i : Lb/g/b/i/l/f;
    //   852: astore #4
    //   854: aload_0
    //   855: getfield h : Lb/g/b/i/l/f;
    //   858: astore #5
    //   860: aload_0
    //   861: getfield e : Lb/g/b/i/l/g;
    //   864: getfield g : I
    //   867: istore_1
    //   868: aload_0
    //   869: aload #4
    //   871: aload #5
    //   873: iload_1
    //   874: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   877: goto -> 1906
    //   880: aload_0
    //   881: getfield d : Lb/g/b/i/d$a;
    //   884: aload #4
    //   886: if_acmpne -> 1474
    //   889: aload_0
    //   890: getfield b : Lb/g/b/i/d;
    //   893: astore #4
    //   895: aload #4
    //   897: getfield j : I
    //   900: istore_1
    //   901: iload_1
    //   902: iconst_2
    //   903: if_icmpeq -> 1367
    //   906: iload_1
    //   907: iconst_3
    //   908: if_icmpeq -> 914
    //   911: goto -> 1474
    //   914: aload #4
    //   916: getfield k : I
    //   919: iconst_3
    //   920: if_icmpne -> 1198
    //   923: aload_0
    //   924: getfield h : Lb/g/b/i/l/f;
    //   927: aload_0
    //   928: putfield a : Lb/g/b/i/l/d;
    //   931: aload_0
    //   932: getfield i : Lb/g/b/i/l/f;
    //   935: aload_0
    //   936: putfield a : Lb/g/b/i/l/d;
    //   939: aload #4
    //   941: getfield e : Lb/g/b/i/l/l;
    //   944: astore #5
    //   946: aload #5
    //   948: getfield h : Lb/g/b/i/l/f;
    //   951: aload_0
    //   952: putfield a : Lb/g/b/i/l/d;
    //   955: aload #5
    //   957: getfield i : Lb/g/b/i/l/f;
    //   960: aload_0
    //   961: putfield a : Lb/g/b/i/l/d;
    //   964: aload_0
    //   965: getfield e : Lb/g/b/i/l/g;
    //   968: aload_0
    //   969: putfield a : Lb/g/b/i/l/d;
    //   972: aload #4
    //   974: invokevirtual t : ()Z
    //   977: ifeq -> 1126
    //   980: aload_0
    //   981: getfield e : Lb/g/b/i/l/g;
    //   984: getfield l : Ljava/util/List;
    //   987: aload_0
    //   988: getfield b : Lb/g/b/i/d;
    //   991: getfield e : Lb/g/b/i/l/l;
    //   994: getfield e : Lb/g/b/i/l/g;
    //   997: invokeinterface add : (Ljava/lang/Object;)Z
    //   1002: pop
    //   1003: aload_0
    //   1004: getfield b : Lb/g/b/i/d;
    //   1007: getfield e : Lb/g/b/i/l/l;
    //   1010: getfield e : Lb/g/b/i/l/g;
    //   1013: getfield k : Ljava/util/List;
    //   1016: aload_0
    //   1017: getfield e : Lb/g/b/i/l/g;
    //   1020: invokeinterface add : (Ljava/lang/Object;)Z
    //   1025: pop
    //   1026: aload_0
    //   1027: getfield b : Lb/g/b/i/d;
    //   1030: getfield e : Lb/g/b/i/l/l;
    //   1033: astore #4
    //   1035: aload #4
    //   1037: getfield e : Lb/g/b/i/l/g;
    //   1040: aload_0
    //   1041: putfield a : Lb/g/b/i/l/d;
    //   1044: aload_0
    //   1045: getfield e : Lb/g/b/i/l/g;
    //   1048: getfield l : Ljava/util/List;
    //   1051: aload #4
    //   1053: getfield h : Lb/g/b/i/l/f;
    //   1056: invokeinterface add : (Ljava/lang/Object;)Z
    //   1061: pop
    //   1062: aload_0
    //   1063: getfield e : Lb/g/b/i/l/g;
    //   1066: getfield l : Ljava/util/List;
    //   1069: aload_0
    //   1070: getfield b : Lb/g/b/i/d;
    //   1073: getfield e : Lb/g/b/i/l/l;
    //   1076: getfield i : Lb/g/b/i/l/f;
    //   1079: invokeinterface add : (Ljava/lang/Object;)Z
    //   1084: pop
    //   1085: aload_0
    //   1086: getfield b : Lb/g/b/i/d;
    //   1089: getfield e : Lb/g/b/i/l/l;
    //   1092: getfield h : Lb/g/b/i/l/f;
    //   1095: getfield k : Ljava/util/List;
    //   1098: aload_0
    //   1099: getfield e : Lb/g/b/i/l/g;
    //   1102: invokeinterface add : (Ljava/lang/Object;)Z
    //   1107: pop
    //   1108: aload_0
    //   1109: getfield b : Lb/g/b/i/d;
    //   1112: getfield e : Lb/g/b/i/l/l;
    //   1115: getfield i : Lb/g/b/i/l/f;
    //   1118: getfield k : Ljava/util/List;
    //   1121: astore #4
    //   1123: goto -> 1358
    //   1126: aload_0
    //   1127: getfield b : Lb/g/b/i/d;
    //   1130: invokevirtual s : ()Z
    //   1133: ifeq -> 1183
    //   1136: aload_0
    //   1137: getfield b : Lb/g/b/i/d;
    //   1140: getfield e : Lb/g/b/i/l/l;
    //   1143: getfield e : Lb/g/b/i/l/g;
    //   1146: getfield l : Ljava/util/List;
    //   1149: aload_0
    //   1150: getfield e : Lb/g/b/i/l/g;
    //   1153: invokeinterface add : (Ljava/lang/Object;)Z
    //   1158: pop
    //   1159: aload_0
    //   1160: getfield e : Lb/g/b/i/l/g;
    //   1163: getfield k : Ljava/util/List;
    //   1166: astore #4
    //   1168: aload_0
    //   1169: getfield b : Lb/g/b/i/d;
    //   1172: getfield e : Lb/g/b/i/l/l;
    //   1175: getfield e : Lb/g/b/i/l/g;
    //   1178: astore #5
    //   1180: goto -> 1464
    //   1183: aload_0
    //   1184: getfield b : Lb/g/b/i/d;
    //   1187: getfield e : Lb/g/b/i/l/l;
    //   1190: getfield e : Lb/g/b/i/l/g;
    //   1193: astore #4
    //   1195: goto -> 1351
    //   1198: aload #4
    //   1200: getfield e : Lb/g/b/i/l/l;
    //   1203: getfield e : Lb/g/b/i/l/g;
    //   1206: astore #4
    //   1208: aload_0
    //   1209: getfield e : Lb/g/b/i/l/g;
    //   1212: getfield l : Ljava/util/List;
    //   1215: aload #4
    //   1217: invokeinterface add : (Ljava/lang/Object;)Z
    //   1222: pop
    //   1223: aload #4
    //   1225: getfield k : Ljava/util/List;
    //   1228: aload_0
    //   1229: getfield e : Lb/g/b/i/l/g;
    //   1232: invokeinterface add : (Ljava/lang/Object;)Z
    //   1237: pop
    //   1238: aload_0
    //   1239: getfield b : Lb/g/b/i/d;
    //   1242: getfield e : Lb/g/b/i/l/l;
    //   1245: getfield h : Lb/g/b/i/l/f;
    //   1248: getfield k : Ljava/util/List;
    //   1251: aload_0
    //   1252: getfield e : Lb/g/b/i/l/g;
    //   1255: invokeinterface add : (Ljava/lang/Object;)Z
    //   1260: pop
    //   1261: aload_0
    //   1262: getfield b : Lb/g/b/i/d;
    //   1265: getfield e : Lb/g/b/i/l/l;
    //   1268: getfield i : Lb/g/b/i/l/f;
    //   1271: getfield k : Ljava/util/List;
    //   1274: aload_0
    //   1275: getfield e : Lb/g/b/i/l/g;
    //   1278: invokeinterface add : (Ljava/lang/Object;)Z
    //   1283: pop
    //   1284: aload_0
    //   1285: getfield e : Lb/g/b/i/l/g;
    //   1288: astore #4
    //   1290: aload #4
    //   1292: iconst_1
    //   1293: putfield b : Z
    //   1296: aload #4
    //   1298: getfield k : Ljava/util/List;
    //   1301: aload_0
    //   1302: getfield h : Lb/g/b/i/l/f;
    //   1305: invokeinterface add : (Ljava/lang/Object;)Z
    //   1310: pop
    //   1311: aload_0
    //   1312: getfield e : Lb/g/b/i/l/g;
    //   1315: getfield k : Ljava/util/List;
    //   1318: aload_0
    //   1319: getfield i : Lb/g/b/i/l/f;
    //   1322: invokeinterface add : (Ljava/lang/Object;)Z
    //   1327: pop
    //   1328: aload_0
    //   1329: getfield h : Lb/g/b/i/l/f;
    //   1332: getfield l : Ljava/util/List;
    //   1335: aload_0
    //   1336: getfield e : Lb/g/b/i/l/g;
    //   1339: invokeinterface add : (Ljava/lang/Object;)Z
    //   1344: pop
    //   1345: aload_0
    //   1346: getfield i : Lb/g/b/i/l/f;
    //   1349: astore #4
    //   1351: aload #4
    //   1353: getfield l : Ljava/util/List;
    //   1356: astore #4
    //   1358: aload_0
    //   1359: getfield e : Lb/g/b/i/l/g;
    //   1362: astore #5
    //   1364: goto -> 1464
    //   1367: aload #4
    //   1369: getfield K : Lb/g/b/i/d;
    //   1372: astore #4
    //   1374: aload #4
    //   1376: ifnonnull -> 1382
    //   1379: goto -> 1474
    //   1382: aload #4
    //   1384: getfield e : Lb/g/b/i/l/l;
    //   1387: getfield e : Lb/g/b/i/l/g;
    //   1390: astore #4
    //   1392: aload_0
    //   1393: getfield e : Lb/g/b/i/l/g;
    //   1396: getfield l : Ljava/util/List;
    //   1399: aload #4
    //   1401: invokeinterface add : (Ljava/lang/Object;)Z
    //   1406: pop
    //   1407: aload #4
    //   1409: getfield k : Ljava/util/List;
    //   1412: aload_0
    //   1413: getfield e : Lb/g/b/i/l/g;
    //   1416: invokeinterface add : (Ljava/lang/Object;)Z
    //   1421: pop
    //   1422: aload_0
    //   1423: getfield e : Lb/g/b/i/l/g;
    //   1426: astore #4
    //   1428: aload #4
    //   1430: iconst_1
    //   1431: putfield b : Z
    //   1434: aload #4
    //   1436: getfield k : Ljava/util/List;
    //   1439: aload_0
    //   1440: getfield h : Lb/g/b/i/l/f;
    //   1443: invokeinterface add : (Ljava/lang/Object;)Z
    //   1448: pop
    //   1449: aload_0
    //   1450: getfield e : Lb/g/b/i/l/g;
    //   1453: getfield k : Ljava/util/List;
    //   1456: astore #4
    //   1458: aload_0
    //   1459: getfield i : Lb/g/b/i/l/f;
    //   1462: astore #5
    //   1464: aload #4
    //   1466: aload #5
    //   1468: invokeinterface add : (Ljava/lang/Object;)Z
    //   1473: pop
    //   1474: aload_0
    //   1475: getfield b : Lb/g/b/i/d;
    //   1478: astore #4
    //   1480: aload #4
    //   1482: getfield G : [Lb/g/b/i/c;
    //   1485: astore #5
    //   1487: aload #5
    //   1489: iconst_0
    //   1490: aaload
    //   1491: getfield d : Lb/g/b/i/c;
    //   1494: ifnull -> 1655
    //   1497: aload #5
    //   1499: iconst_1
    //   1500: aaload
    //   1501: getfield d : Lb/g/b/i/c;
    //   1504: ifnull -> 1655
    //   1507: aload #4
    //   1509: invokevirtual s : ()Z
    //   1512: ifeq -> 1565
    //   1515: aload_0
    //   1516: getfield h : Lb/g/b/i/l/f;
    //   1519: aload_0
    //   1520: getfield b : Lb/g/b/i/d;
    //   1523: getfield G : [Lb/g/b/i/c;
    //   1526: iconst_0
    //   1527: aaload
    //   1528: invokevirtual b : ()I
    //   1531: putfield f : I
    //   1534: aload_0
    //   1535: getfield i : Lb/g/b/i/l/f;
    //   1538: astore #5
    //   1540: aload_0
    //   1541: getfield b : Lb/g/b/i/d;
    //   1544: getfield G : [Lb/g/b/i/c;
    //   1547: iconst_1
    //   1548: aaload
    //   1549: astore #4
    //   1551: aload #5
    //   1553: aload #4
    //   1555: invokevirtual b : ()I
    //   1558: ineg
    //   1559: putfield f : I
    //   1562: goto -> 1906
    //   1565: aload_0
    //   1566: aload_0
    //   1567: getfield b : Lb/g/b/i/d;
    //   1570: getfield G : [Lb/g/b/i/c;
    //   1573: iconst_0
    //   1574: aaload
    //   1575: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   1578: astore #4
    //   1580: aload_0
    //   1581: aload_0
    //   1582: getfield b : Lb/g/b/i/d;
    //   1585: getfield G : [Lb/g/b/i/c;
    //   1588: iconst_1
    //   1589: aaload
    //   1590: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   1593: astore #5
    //   1595: aload #4
    //   1597: getfield k : Ljava/util/List;
    //   1600: aload_0
    //   1601: invokeinterface add : (Ljava/lang/Object;)Z
    //   1606: pop
    //   1607: aload #4
    //   1609: getfield j : Z
    //   1612: ifeq -> 1620
    //   1615: aload_0
    //   1616: aload_0
    //   1617: invokevirtual a : (Lb/g/b/i/l/d;)V
    //   1620: aload #5
    //   1622: getfield k : Ljava/util/List;
    //   1625: aload_0
    //   1626: invokeinterface add : (Ljava/lang/Object;)Z
    //   1631: pop
    //   1632: aload #5
    //   1634: getfield j : Z
    //   1637: ifeq -> 1645
    //   1640: aload_0
    //   1641: aload_0
    //   1642: invokevirtual a : (Lb/g/b/i/l/d;)V
    //   1645: aload_0
    //   1646: getstatic b/g/b/i/l/m$a.e : Lb/g/b/i/l/m$a;
    //   1649: putfield j : Lb/g/b/i/l/m$a;
    //   1652: goto -> 1906
    //   1655: aload_0
    //   1656: getfield b : Lb/g/b/i/d;
    //   1659: astore #4
    //   1661: aload #4
    //   1663: getfield G : [Lb/g/b/i/c;
    //   1666: astore #5
    //   1668: aload #5
    //   1670: iconst_0
    //   1671: aaload
    //   1672: getfield d : Lb/g/b/i/c;
    //   1675: ifnull -> 1747
    //   1678: aload_0
    //   1679: aload #5
    //   1681: iconst_0
    //   1682: aaload
    //   1683: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   1686: astore #4
    //   1688: aload #4
    //   1690: ifnull -> 1906
    //   1693: aload_0
    //   1694: getfield h : Lb/g/b/i/l/f;
    //   1697: astore #5
    //   1699: aload_0
    //   1700: getfield b : Lb/g/b/i/d;
    //   1703: getfield G : [Lb/g/b/i/c;
    //   1706: iconst_0
    //   1707: aaload
    //   1708: invokevirtual b : ()I
    //   1711: istore_1
    //   1712: aload #5
    //   1714: getfield l : Ljava/util/List;
    //   1717: aload #4
    //   1719: invokeinterface add : (Ljava/lang/Object;)Z
    //   1724: pop
    //   1725: aload #5
    //   1727: iload_1
    //   1728: putfield f : I
    //   1731: aload #4
    //   1733: getfield k : Ljava/util/List;
    //   1736: aload #5
    //   1738: invokeinterface add : (Ljava/lang/Object;)Z
    //   1743: pop
    //   1744: goto -> 1889
    //   1747: aload #5
    //   1749: iconst_1
    //   1750: aaload
    //   1751: getfield d : Lb/g/b/i/c;
    //   1754: ifnull -> 1844
    //   1757: aload_0
    //   1758: aload #5
    //   1760: iconst_1
    //   1761: aaload
    //   1762: invokevirtual h : (Lb/g/b/i/c;)Lb/g/b/i/l/f;
    //   1765: astore #4
    //   1767: aload #4
    //   1769: ifnull -> 1906
    //   1772: aload_0
    //   1773: getfield i : Lb/g/b/i/l/f;
    //   1776: astore #5
    //   1778: aload_0
    //   1779: getfield b : Lb/g/b/i/d;
    //   1782: getfield G : [Lb/g/b/i/c;
    //   1785: iconst_1
    //   1786: aaload
    //   1787: invokevirtual b : ()I
    //   1790: ineg
    //   1791: istore_1
    //   1792: aload #5
    //   1794: getfield l : Ljava/util/List;
    //   1797: aload #4
    //   1799: invokeinterface add : (Ljava/lang/Object;)Z
    //   1804: pop
    //   1805: aload #5
    //   1807: iload_1
    //   1808: putfield f : I
    //   1811: aload #4
    //   1813: getfield k : Ljava/util/List;
    //   1816: aload #5
    //   1818: invokeinterface add : (Ljava/lang/Object;)Z
    //   1823: pop
    //   1824: aload_0
    //   1825: aload_0
    //   1826: getfield h : Lb/g/b/i/l/f;
    //   1829: aload_0
    //   1830: getfield i : Lb/g/b/i/l/f;
    //   1833: iconst_m1
    //   1834: aload_0
    //   1835: getfield e : Lb/g/b/i/l/g;
    //   1838: invokevirtual c : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;ILb/g/b/i/l/g;)V
    //   1841: goto -> 1906
    //   1844: aload #4
    //   1846: instanceof b/g/b/i/g
    //   1849: ifne -> 1906
    //   1852: aload #4
    //   1854: getfield K : Lb/g/b/i/d;
    //   1857: astore #5
    //   1859: aload #5
    //   1861: ifnull -> 1906
    //   1864: aload #5
    //   1866: getfield d : Lb/g/b/i/l/j;
    //   1869: getfield h : Lb/g/b/i/l/f;
    //   1872: astore #5
    //   1874: aload_0
    //   1875: aload_0
    //   1876: getfield h : Lb/g/b/i/l/f;
    //   1879: aload #5
    //   1881: aload #4
    //   1883: invokevirtual p : ()I
    //   1886: invokevirtual b : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;I)V
    //   1889: aload_0
    //   1890: aload_0
    //   1891: getfield i : Lb/g/b/i/l/f;
    //   1894: aload_0
    //   1895: getfield h : Lb/g/b/i/l/f;
    //   1898: iconst_1
    //   1899: aload_0
    //   1900: getfield e : Lb/g/b/i/l/g;
    //   1903: invokevirtual c : (Lb/g/b/i/l/f;Lb/g/b/i/l/f;ILb/g/b/i/l/g;)V
    //   1906: return
  }
  
  public void e() {
    f f = this.h;
    if (f.j)
      this.b.P = f.g; 
  }
  
  public void f() {
    this.c = null;
    this.h.b();
    this.i.b();
    this.e.b();
    this.g = false;
  }
  
  public boolean k() {
    return (this.d == d.a.d) ? ((this.b.j == 0)) : true;
  }
  
  public final void m(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    paramInt1 = paramInt2 - paramInt1;
    paramInt2 = paramInt4 - paramInt3;
    if (paramInt5 != -1) {
      if (paramInt5 != 0) {
        if (paramInt5 == 1) {
          paramInt2 = (int)(paramInt1 * paramFloat + 0.5F);
          paramArrayOfint[0] = paramInt1;
          paramArrayOfint[1] = paramInt2;
        } 
      } else {
        paramArrayOfint[0] = (int)(paramInt2 * paramFloat + 0.5F);
        paramArrayOfint[1] = paramInt2;
      } 
    } else {
      paramInt3 = (int)(paramInt2 * paramFloat + 0.5F);
      paramInt4 = (int)(paramInt1 / paramFloat + 0.5F);
      if (paramInt3 <= paramInt1) {
        paramArrayOfint[0] = paramInt3;
        paramArrayOfint[1] = paramInt2;
      } else if (paramInt4 <= paramInt2) {
        paramArrayOfint[0] = paramInt1;
        paramArrayOfint[1] = paramInt4;
      } 
    } 
  }
  
  public void n() {
    this.g = false;
    this.h.b();
    this.h.j = false;
    this.i.b();
    this.i.j = false;
    this.e.j = false;
  }
  
  public String toString() {
    StringBuilder stringBuilder = a.e("HorizontalRun ");
    stringBuilder.append(this.b.Y);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\l\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */