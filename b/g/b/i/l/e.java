package b.g.b.i.l;

import androidx.constraintlayout.widget.ConstraintLayout;
import b.g.b.i.d;
import b.g.b.i.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class e {
  public b.g.b.i.e a;
  
  public boolean b = true;
  
  public boolean c = true;
  
  public b.g.b.i.e d;
  
  public ArrayList<m> e = new ArrayList<m>();
  
  public b.b f;
  
  public b.a g;
  
  public ArrayList<k> h;
  
  public e(b.g.b.i.e parame) {
    new ArrayList();
    this.f = null;
    this.g = new b.a();
    this.h = new ArrayList<k>();
    this.a = parame;
    this.d = parame;
  }
  
  public final void a(f paramf1, int paramInt1, int paramInt2, f paramf2, ArrayList<k> paramArrayList, k paramk) {
    m m = paramf1.d;
    if (m.c == null) {
      b.g.b.i.e e1 = this.a;
      if (m != ((d)e1).d && m != ((d)e1).e) {
        k k1 = paramk;
        if (paramk == null) {
          k1 = new k(m, paramInt2);
          paramArrayList.add(k1);
        } 
        m.c = k1;
        k1.b.add(m);
        for (d d : m.h.k) {
          if (d instanceof f)
            a((f)d, paramInt1, 0, paramf2, paramArrayList, k1); 
        } 
        for (d d : m.i.k) {
          if (d instanceof f)
            a((f)d, paramInt1, 1, paramf2, paramArrayList, k1); 
        } 
        if (paramInt1 == 1 && m instanceof l)
          for (d d : ((l)m).k.k) {
            if (d instanceof f)
              a((f)d, paramInt1, 2, paramf2, paramArrayList, k1); 
          }  
        Iterator<f> iterator = m.h.l.iterator();
        while (iterator.hasNext())
          a(iterator.next(), paramInt1, 0, paramf2, paramArrayList, k1); 
        iterator = m.i.l.iterator();
        while (iterator.hasNext())
          a(iterator.next(), paramInt1, 1, paramf2, paramArrayList, k1); 
        if (paramInt1 == 1 && m instanceof l) {
          Iterator<f> iterator1 = ((l)m).k.l.iterator();
          while (true) {
            if (iterator1.hasNext()) {
              f f1 = iterator1.next();
              try {
                a(f1, paramInt1, 2, paramf2, paramArrayList, k1);
              } finally {}
              continue;
            } 
            return;
          } 
        } 
      } 
    } 
  }
  
  public final boolean b(b.g.b.i.e parame) {
    // Byte code:
    //   0: getstatic b/g/b/i/d$a.e : Lb/g/b/i/d$a;
    //   3: astore #13
    //   5: getstatic b/g/b/i/d$a.d : Lb/g/b/i/d$a;
    //   8: astore #12
    //   10: getstatic b/g/b/i/d$a.c : Lb/g/b/i/d$a;
    //   13: astore #9
    //   15: getstatic b/g/b/i/d$a.b : Lb/g/b/i/d$a;
    //   18: astore #6
    //   20: aload_1
    //   21: getfield f0 : Ljava/util/ArrayList;
    //   24: invokevirtual iterator : ()Ljava/util/Iterator;
    //   27: astore #11
    //   29: aload #11
    //   31: invokeinterface hasNext : ()Z
    //   36: ifeq -> 1252
    //   39: aload #11
    //   41: invokeinterface next : ()Ljava/lang/Object;
    //   46: checkcast b/g/b/i/d
    //   49: astore #14
    //   51: aload #14
    //   53: getfield J : [Lb/g/b/i/d$a;
    //   56: astore #7
    //   58: aload #7
    //   60: iconst_0
    //   61: aaload
    //   62: astore #10
    //   64: aload #7
    //   66: iconst_1
    //   67: aaload
    //   68: astore #7
    //   70: aload #14
    //   72: getfield X : I
    //   75: bipush #8
    //   77: if_icmpne -> 89
    //   80: aload #14
    //   82: iconst_1
    //   83: putfield a : Z
    //   86: goto -> 29
    //   89: aload #14
    //   91: getfield o : F
    //   94: fconst_1
    //   95: fcmpg
    //   96: ifge -> 112
    //   99: aload #10
    //   101: aload #12
    //   103: if_acmpne -> 112
    //   106: aload #14
    //   108: iconst_2
    //   109: putfield j : I
    //   112: aload #14
    //   114: getfield r : F
    //   117: fconst_1
    //   118: fcmpg
    //   119: ifge -> 135
    //   122: aload #7
    //   124: aload #12
    //   126: if_acmpne -> 135
    //   129: aload #14
    //   131: iconst_2
    //   132: putfield k : I
    //   135: aload #14
    //   137: getfield N : F
    //   140: fconst_0
    //   141: fcmpl
    //   142: ifle -> 244
    //   145: aload #10
    //   147: aload #12
    //   149: if_acmpne -> 175
    //   152: aload #7
    //   154: aload #9
    //   156: if_acmpeq -> 166
    //   159: aload #7
    //   161: aload #6
    //   163: if_acmpne -> 175
    //   166: aload #14
    //   168: iconst_3
    //   169: putfield j : I
    //   172: goto -> 244
    //   175: aload #7
    //   177: aload #12
    //   179: if_acmpne -> 205
    //   182: aload #10
    //   184: aload #9
    //   186: if_acmpeq -> 196
    //   189: aload #10
    //   191: aload #6
    //   193: if_acmpne -> 205
    //   196: aload #14
    //   198: iconst_3
    //   199: putfield k : I
    //   202: goto -> 244
    //   205: aload #10
    //   207: aload #12
    //   209: if_acmpne -> 244
    //   212: aload #7
    //   214: aload #12
    //   216: if_acmpne -> 244
    //   219: aload #14
    //   221: getfield j : I
    //   224: ifne -> 233
    //   227: aload #14
    //   229: iconst_3
    //   230: putfield j : I
    //   233: aload #14
    //   235: getfield k : I
    //   238: ifne -> 244
    //   241: goto -> 196
    //   244: aload #10
    //   246: astore #8
    //   248: aload #10
    //   250: aload #12
    //   252: if_acmpne -> 298
    //   255: aload #10
    //   257: astore #8
    //   259: aload #14
    //   261: getfield j : I
    //   264: iconst_1
    //   265: if_icmpne -> 298
    //   268: aload #14
    //   270: getfield y : Lb/g/b/i/c;
    //   273: getfield d : Lb/g/b/i/c;
    //   276: ifnull -> 294
    //   279: aload #10
    //   281: astore #8
    //   283: aload #14
    //   285: getfield A : Lb/g/b/i/c;
    //   288: getfield d : Lb/g/b/i/c;
    //   291: ifnonnull -> 298
    //   294: aload #9
    //   296: astore #8
    //   298: aload #7
    //   300: aload #12
    //   302: if_acmpne -> 343
    //   305: aload #14
    //   307: getfield k : I
    //   310: iconst_1
    //   311: if_icmpne -> 343
    //   314: aload #14
    //   316: getfield z : Lb/g/b/i/c;
    //   319: getfield d : Lb/g/b/i/c;
    //   322: ifnull -> 336
    //   325: aload #14
    //   327: getfield B : Lb/g/b/i/c;
    //   330: getfield d : Lb/g/b/i/c;
    //   333: ifnonnull -> 343
    //   336: aload #9
    //   338: astore #7
    //   340: goto -> 343
    //   343: aload #14
    //   345: getfield d : Lb/g/b/i/l/j;
    //   348: astore #10
    //   350: aload #10
    //   352: aload #8
    //   354: putfield d : Lb/g/b/i/d$a;
    //   357: aload #10
    //   359: aload #14
    //   361: getfield j : I
    //   364: putfield a : I
    //   367: aload #14
    //   369: getfield e : Lb/g/b/i/l/l;
    //   372: astore #10
    //   374: aload #10
    //   376: aload #7
    //   378: putfield d : Lb/g/b/i/d$a;
    //   381: aload #10
    //   383: aload #14
    //   385: getfield k : I
    //   388: putfield a : I
    //   391: aload #8
    //   393: aload #13
    //   395: if_acmpeq -> 412
    //   398: aload #8
    //   400: aload #6
    //   402: if_acmpeq -> 412
    //   405: aload #8
    //   407: aload #9
    //   409: if_acmpne -> 436
    //   412: aload #7
    //   414: aload #13
    //   416: if_acmpeq -> 1106
    //   419: aload #7
    //   421: aload #6
    //   423: if_acmpeq -> 1106
    //   426: aload #7
    //   428: aload #9
    //   430: if_acmpne -> 436
    //   433: goto -> 1106
    //   436: aload #8
    //   438: aload #12
    //   440: if_acmpne -> 714
    //   443: aload #7
    //   445: aload #9
    //   447: if_acmpeq -> 457
    //   450: aload #7
    //   452: aload #6
    //   454: if_acmpne -> 714
    //   457: aload #14
    //   459: getfield j : I
    //   462: istore #4
    //   464: iload #4
    //   466: iconst_3
    //   467: if_icmpne -> 568
    //   470: aload #7
    //   472: aload #9
    //   474: if_acmpne -> 489
    //   477: aload_0
    //   478: aload #14
    //   480: aload #9
    //   482: iconst_0
    //   483: aload #9
    //   485: iconst_0
    //   486: invokevirtual f : (Lb/g/b/i/d;Lb/g/b/i/d$a;ILb/g/b/i/d$a;I)V
    //   489: aload #14
    //   491: invokevirtual i : ()I
    //   494: istore #5
    //   496: iload #5
    //   498: i2f
    //   499: aload #14
    //   501: getfield N : F
    //   504: fmul
    //   505: ldc 0.5
    //   507: fadd
    //   508: f2i
    //   509: istore #4
    //   511: aload #6
    //   513: astore #8
    //   515: aload #6
    //   517: astore #7
    //   519: aload_0
    //   520: aload #14
    //   522: aload #8
    //   524: iload #4
    //   526: aload #7
    //   528: iload #5
    //   530: invokevirtual f : (Lb/g/b/i/d;Lb/g/b/i/d$a;ILb/g/b/i/d$a;I)V
    //   533: aload #14
    //   535: getfield d : Lb/g/b/i/l/j;
    //   538: getfield e : Lb/g/b/i/l/g;
    //   541: aload #14
    //   543: invokevirtual o : ()I
    //   546: invokevirtual c : (I)V
    //   549: aload #14
    //   551: getfield e : Lb/g/b/i/l/l;
    //   554: getfield e : Lb/g/b/i/l/g;
    //   557: aload #14
    //   559: invokevirtual i : ()I
    //   562: invokevirtual c : (I)V
    //   565: goto -> 80
    //   568: iload #4
    //   570: iconst_1
    //   571: if_icmpne -> 613
    //   574: aload_0
    //   575: aload #14
    //   577: aload #9
    //   579: iconst_0
    //   580: aload #7
    //   582: iconst_0
    //   583: invokevirtual f : (Lb/g/b/i/d;Lb/g/b/i/d$a;ILb/g/b/i/d$a;I)V
    //   586: aload #14
    //   588: getfield d : Lb/g/b/i/l/j;
    //   591: getfield e : Lb/g/b/i/l/g;
    //   594: astore #7
    //   596: aload #14
    //   598: invokevirtual o : ()I
    //   601: istore #4
    //   603: aload #7
    //   605: iload #4
    //   607: putfield m : I
    //   610: goto -> 29
    //   613: iload #4
    //   615: iconst_2
    //   616: if_icmpne -> 674
    //   619: aload_1
    //   620: getfield J : [Lb/g/b/i/d$a;
    //   623: astore #10
    //   625: aload #10
    //   627: iconst_0
    //   628: aaload
    //   629: aload #6
    //   631: if_acmpeq -> 643
    //   634: aload #10
    //   636: iconst_0
    //   637: aaload
    //   638: aload #13
    //   640: if_acmpne -> 714
    //   643: aload #14
    //   645: getfield o : F
    //   648: aload_1
    //   649: invokevirtual o : ()I
    //   652: i2f
    //   653: fmul
    //   654: ldc 0.5
    //   656: fadd
    //   657: f2i
    //   658: istore #4
    //   660: aload #14
    //   662: invokevirtual i : ()I
    //   665: istore #5
    //   667: aload #6
    //   669: astore #8
    //   671: goto -> 711
    //   674: aload #14
    //   676: getfield G : [Lb/g/b/i/c;
    //   679: astore #10
    //   681: aload #10
    //   683: iconst_0
    //   684: aaload
    //   685: getfield d : Lb/g/b/i/c;
    //   688: ifnull -> 701
    //   691: aload #10
    //   693: iconst_1
    //   694: aaload
    //   695: getfield d : Lb/g/b/i/c;
    //   698: ifnonnull -> 714
    //   701: iconst_0
    //   702: istore #4
    //   704: iconst_0
    //   705: istore #5
    //   707: aload #9
    //   709: astore #8
    //   711: goto -> 519
    //   714: aload #7
    //   716: aload #12
    //   718: if_acmpne -> 921
    //   721: aload #8
    //   723: aload #9
    //   725: if_acmpeq -> 735
    //   728: aload #8
    //   730: aload #6
    //   732: if_acmpne -> 921
    //   735: aload #14
    //   737: getfield k : I
    //   740: istore #4
    //   742: iload #4
    //   744: iconst_3
    //   745: if_icmpne -> 811
    //   748: aload #8
    //   750: aload #9
    //   752: if_acmpne -> 767
    //   755: aload_0
    //   756: aload #14
    //   758: aload #9
    //   760: iconst_0
    //   761: aload #9
    //   763: iconst_0
    //   764: invokevirtual f : (Lb/g/b/i/d;Lb/g/b/i/d$a;ILb/g/b/i/d$a;I)V
    //   767: aload #14
    //   769: invokevirtual o : ()I
    //   772: istore #4
    //   774: aload #14
    //   776: getfield N : F
    //   779: fstore_3
    //   780: fload_3
    //   781: fstore_2
    //   782: aload #14
    //   784: getfield O : I
    //   787: iconst_m1
    //   788: if_icmpne -> 795
    //   791: fconst_1
    //   792: fload_3
    //   793: fdiv
    //   794: fstore_2
    //   795: iload #4
    //   797: i2f
    //   798: fstore_3
    //   799: fload_3
    //   800: fload_2
    //   801: fmul
    //   802: ldc 0.5
    //   804: fadd
    //   805: f2i
    //   806: istore #5
    //   808: goto -> 511
    //   811: iload #4
    //   813: iconst_1
    //   814: if_icmpne -> 832
    //   817: aload_0
    //   818: aload #14
    //   820: aload #8
    //   822: iconst_0
    //   823: aload #9
    //   825: iconst_0
    //   826: invokevirtual f : (Lb/g/b/i/d;Lb/g/b/i/d$a;ILb/g/b/i/d$a;I)V
    //   829: goto -> 1086
    //   832: iload #4
    //   834: iconst_2
    //   835: if_icmpne -> 891
    //   838: aload_1
    //   839: getfield J : [Lb/g/b/i/d$a;
    //   842: astore #10
    //   844: aload #10
    //   846: iconst_1
    //   847: aaload
    //   848: aload #6
    //   850: if_acmpeq -> 862
    //   853: aload #10
    //   855: iconst_1
    //   856: aaload
    //   857: aload #13
    //   859: if_acmpne -> 921
    //   862: aload #14
    //   864: getfield r : F
    //   867: fstore_2
    //   868: aload #14
    //   870: invokevirtual o : ()I
    //   873: istore #4
    //   875: fload_2
    //   876: aload_1
    //   877: invokevirtual i : ()I
    //   880: i2f
    //   881: fmul
    //   882: ldc 0.5
    //   884: fadd
    //   885: f2i
    //   886: istore #5
    //   888: goto -> 515
    //   891: aload #14
    //   893: getfield G : [Lb/g/b/i/c;
    //   896: astore #10
    //   898: aload #10
    //   900: iconst_2
    //   901: aaload
    //   902: getfield d : Lb/g/b/i/c;
    //   905: ifnull -> 701
    //   908: aload #10
    //   910: iconst_3
    //   911: aaload
    //   912: getfield d : Lb/g/b/i/c;
    //   915: ifnonnull -> 921
    //   918: goto -> 701
    //   921: aload #8
    //   923: aload #12
    //   925: if_acmpne -> 29
    //   928: aload #7
    //   930: aload #12
    //   932: if_acmpne -> 29
    //   935: aload #14
    //   937: getfield j : I
    //   940: istore #4
    //   942: iload #4
    //   944: iconst_1
    //   945: if_icmpeq -> 1058
    //   948: aload #14
    //   950: getfield k : I
    //   953: istore #5
    //   955: iload #5
    //   957: iconst_1
    //   958: if_icmpne -> 964
    //   961: goto -> 1058
    //   964: iload #5
    //   966: iconst_2
    //   967: if_icmpne -> 29
    //   970: iload #4
    //   972: iconst_2
    //   973: if_icmpne -> 29
    //   976: aload_1
    //   977: getfield J : [Lb/g/b/i/d$a;
    //   980: astore #7
    //   982: aload #7
    //   984: iconst_0
    //   985: aaload
    //   986: aload #6
    //   988: if_acmpeq -> 1000
    //   991: aload #7
    //   993: iconst_0
    //   994: aaload
    //   995: aload #6
    //   997: if_acmpne -> 29
    //   1000: aload_1
    //   1001: getfield J : [Lb/g/b/i/d$a;
    //   1004: astore #7
    //   1006: aload #7
    //   1008: iconst_1
    //   1009: aaload
    //   1010: aload #6
    //   1012: if_acmpeq -> 1024
    //   1015: aload #7
    //   1017: iconst_1
    //   1018: aaload
    //   1019: aload #6
    //   1021: if_acmpne -> 29
    //   1024: aload #14
    //   1026: getfield o : F
    //   1029: fstore_2
    //   1030: aload #14
    //   1032: getfield r : F
    //   1035: fstore_3
    //   1036: fload_2
    //   1037: aload_1
    //   1038: invokevirtual o : ()I
    //   1041: i2f
    //   1042: fmul
    //   1043: ldc 0.5
    //   1045: fadd
    //   1046: f2i
    //   1047: istore #4
    //   1049: aload_1
    //   1050: invokevirtual i : ()I
    //   1053: i2f
    //   1054: fstore_2
    //   1055: goto -> 799
    //   1058: aload_0
    //   1059: aload #14
    //   1061: aload #9
    //   1063: iconst_0
    //   1064: aload #9
    //   1066: iconst_0
    //   1067: invokevirtual f : (Lb/g/b/i/d;Lb/g/b/i/d$a;ILb/g/b/i/d$a;I)V
    //   1070: aload #14
    //   1072: getfield d : Lb/g/b/i/l/j;
    //   1075: getfield e : Lb/g/b/i/l/g;
    //   1078: aload #14
    //   1080: invokevirtual o : ()I
    //   1083: putfield m : I
    //   1086: aload #14
    //   1088: getfield e : Lb/g/b/i/l/l;
    //   1091: getfield e : Lb/g/b/i/l/g;
    //   1094: astore #7
    //   1096: aload #14
    //   1098: invokevirtual i : ()I
    //   1101: istore #4
    //   1103: goto -> 603
    //   1106: aload #14
    //   1108: invokevirtual o : ()I
    //   1111: istore #4
    //   1113: aload #8
    //   1115: astore #10
    //   1117: aload #8
    //   1119: aload #13
    //   1121: if_acmpne -> 1152
    //   1124: aload_1
    //   1125: invokevirtual o : ()I
    //   1128: aload #14
    //   1130: getfield y : Lb/g/b/i/c;
    //   1133: getfield e : I
    //   1136: isub
    //   1137: aload #14
    //   1139: getfield A : Lb/g/b/i/c;
    //   1142: getfield e : I
    //   1145: isub
    //   1146: istore #4
    //   1148: aload #6
    //   1150: astore #10
    //   1152: aload #14
    //   1154: invokevirtual i : ()I
    //   1157: istore #5
    //   1159: aload #7
    //   1161: aload #13
    //   1163: if_acmpne -> 1197
    //   1166: aload_1
    //   1167: invokevirtual i : ()I
    //   1170: aload #14
    //   1172: getfield z : Lb/g/b/i/c;
    //   1175: getfield e : I
    //   1178: isub
    //   1179: aload #14
    //   1181: getfield B : Lb/g/b/i/c;
    //   1184: getfield e : I
    //   1187: isub
    //   1188: istore #5
    //   1190: aload #6
    //   1192: astore #7
    //   1194: goto -> 1197
    //   1197: aload_0
    //   1198: aload #14
    //   1200: aload #10
    //   1202: iload #4
    //   1204: aload #7
    //   1206: iload #5
    //   1208: invokevirtual f : (Lb/g/b/i/d;Lb/g/b/i/d$a;ILb/g/b/i/d$a;I)V
    //   1211: aload #14
    //   1213: getfield d : Lb/g/b/i/l/j;
    //   1216: getfield e : Lb/g/b/i/l/g;
    //   1219: aload #14
    //   1221: invokevirtual o : ()I
    //   1224: invokevirtual c : (I)V
    //   1227: aload #14
    //   1229: getfield e : Lb/g/b/i/l/l;
    //   1232: getfield e : Lb/g/b/i/l/g;
    //   1235: aload #14
    //   1237: invokevirtual i : ()I
    //   1240: invokevirtual c : (I)V
    //   1243: aload #14
    //   1245: iconst_1
    //   1246: putfield a : Z
    //   1249: goto -> 29
    //   1252: iconst_0
    //   1253: ireturn
  }
  
  public void c() {
    HashSet<c> hashSet;
    ArrayList<m> arrayList = this.e;
    arrayList.clear();
    ((d)this.d).d.f();
    ((d)this.d).e.f();
    arrayList.add(((d)this.d).d);
    arrayList.add(((d)this.d).e);
    Iterator<d> iterator1 = ((k)this.d).f0.iterator();
    h h = null;
    while (iterator1.hasNext()) {
      i i;
      HashSet<c> hashSet1;
      h h1;
      d d = iterator1.next();
      if (d instanceof b.g.b.i.f) {
        h1 = new h(d);
        h h2 = h;
        h = h1;
      } else {
        if (h1.s()) {
          if (((d)h1).b == null)
            ((d)h1).b = new c((d)h1, 0); 
          h h2 = h;
          if (h == null)
            hashSet1 = new HashSet(); 
          hashSet1.add(((d)h1).b);
          hashSet2 = hashSet1;
        } else {
          arrayList.add(((d)h1).d);
        } 
        if (h1.t()) {
          if (((d)h1).c == null)
            ((d)h1).c = new c((d)h1, 1); 
          hashSet1 = hashSet2;
          if (hashSet2 == null)
            hashSet1 = new HashSet<c>(); 
          hashSet1.add(((d)h1).c);
        } else {
          arrayList.add(((d)h1).e);
          hashSet1 = hashSet2;
        } 
        HashSet<c> hashSet2 = hashSet1;
        if (h1 instanceof b.g.b.i.h) {
          i = new i((d)h1);
        } else {
          continue;
        } 
      } 
      arrayList.add(i);
      hashSet = hashSet1;
    } 
    if (hashSet != null)
      arrayList.addAll((Collection)hashSet); 
    Iterator<m> iterator = arrayList.iterator();
    while (iterator.hasNext())
      ((m)iterator.next()).f(); 
    for (m m : arrayList) {
      if (m.b == this.d)
        continue; 
      m.d();
    } 
    this.h.clear();
    k.c = 0;
    e(((d)this.a).d, 0, this.h);
    e(((d)this.a).e, 1, this.h);
    this.b = false;
  }
  
  public final int d(b.g.b.i.e parame, int paramInt) {
    int i = this.h.size();
    byte b1 = 0;
    long l = 0L;
    while (true) {
      long l1 = 0L;
      if (b1 < i) {
        k k = this.h.get(b1);
        m m = k.a;
        if ((m instanceof c) ? (m.f != paramInt) : ((paramInt == 0) ? !(m instanceof j) : !(m instanceof l))) {
          if (paramInt == 0) {
            m = ((d)parame).d;
          } else {
            m = ((d)parame).e;
          } 
          f f2 = m.h;
          if (paramInt == 0) {
            m = ((d)parame).d;
          } else {
            m = ((d)parame).e;
          } 
          f f1 = m.i;
          boolean bool2 = k.a.h.l.contains(f2);
          boolean bool1 = k.a.i.l.contains(f1);
          long l2 = k.a.j();
          if (bool2 && bool1) {
            l1 = k.b(k.a.h, 0L);
            long l4 = k.a(k.a.i, 0L);
            long l3 = l1 - l2;
            int j = k.a.i.f;
            l1 = l3;
            if (l3 >= -j)
              l1 = l3 + j; 
            l3 = -l4;
            long l5 = k.a.h.f;
            l4 = l3 - l2 - l5;
            l3 = l4;
            if (l4 >= l5)
              l3 = l4 - l5; 
            d d = k.a.b;
            if (d != null) {
              float f3;
              if (paramInt == 0) {
                f3 = d.U;
              } else if (paramInt == 1) {
                f3 = d.V;
              } else {
                f3 = -1.0F;
              } 
              if (f3 > 0.0F) {
                float f = (float)l3 / f3;
                l1 = (long)((float)l1 / (1.0F - f3) + f);
              } else {
                l1 = 0L;
              } 
              float f4 = (float)l1;
              l3 = (long)(f4 * f3 + 0.5F);
              l1 = (long)((1.0F - f3) * f4 + 0.5F);
              m m1 = k.a;
              l1 = m1.h.f + l3 + l2 + l1 - m1.i.f;
            } else {
              throw null;
            } 
          } else {
            long l3;
            if (bool2) {
              f1 = k.a.h;
              l1 = k.b(f1, f1.f);
              l3 = k.a.h.f + l2;
            } else {
              f f;
              m m1 = k.a;
              if (bool1) {
                f = m1.i;
                l1 = k.a(f, f.f);
                l3 = -k.a.i.f + l2;
                l1 = -l1;
              } else {
                l1 = ((m)f).h.f;
                l1 = f.j() + l1 - k.a.i.f;
                l = Math.max(l, l1);
                b1++;
              } 
            } 
            l1 = Math.max(l1, l3);
          } 
        } 
      } else {
        return (int)l;
      } 
      l = Math.max(l, l1);
      b1++;
    } 
  }
  
  public final void e(m paramm, int paramInt, ArrayList<k> paramArrayList) {
    for (d d : paramm.h.k) {
      if (d instanceof f) {
        a((f)d, paramInt, 0, paramm.i, paramArrayList, null);
        continue;
      } 
      if (d instanceof m)
        a(((m)d).h, paramInt, 0, paramm.i, paramArrayList, null); 
    } 
    for (d d : paramm.i.k) {
      if (d instanceof f) {
        a((f)d, paramInt, 1, paramm.h, paramArrayList, null);
        continue;
      } 
      if (d instanceof m)
        a(((m)d).i, paramInt, 1, paramm.h, paramArrayList, null); 
    } 
    if (paramInt == 1)
      for (d d : ((l)paramm).k.k) {
        if (d instanceof f)
          a((f)d, paramInt, 2, null, paramArrayList, null); 
      }  
  }
  
  public final void f(d paramd, d.a parama1, int paramInt1, d.a parama2, int paramInt2) {
    boolean bool;
    b.a a2 = this.g;
    a2.a = parama1;
    a2.b = parama2;
    a2.c = paramInt1;
    a2.d = paramInt2;
    ((ConstraintLayout.b)this.f).a(paramd, a2);
    paramd.B(this.g.e);
    paramd.w(this.g.f);
    b.a a1 = this.g;
    paramd.w = a1.h;
    paramInt1 = a1.g;
    paramd.R = paramInt1;
    if (paramInt1 > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    paramd.w = bool;
  }
  
  public void g() {
    d.a a1 = d.a.b;
    d.a a3 = d.a.d;
    d.a a2 = d.a.c;
    Iterator iterator = ((k)this.a).f0.iterator();
    while (true) {
      while (true)
        break; 
      if (((d)SYNTHETIC_LOCAL_VARIABLE_13).a) {
        g g = ((d)SYNTHETIC_LOCAL_VARIABLE_13).e.l;
        if (g != null)
          g.c(((d)SYNTHETIC_LOCAL_VARIABLE_13).R); 
      } 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\b\i\l\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */