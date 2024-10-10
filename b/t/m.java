package b.t;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class m {
  public static i a = new a();
  
  public static ThreadLocal<WeakReference<b.f.a<ViewGroup, ArrayList<i>>>> b = new ThreadLocal<WeakReference<b.f.a<ViewGroup, ArrayList<i>>>>();
  
  public static ArrayList<ViewGroup> c = new ArrayList<ViewGroup>();
  
  public static b.f.a<ViewGroup, ArrayList<i>> a() {
    WeakReference<b.f.a> weakReference1 = (WeakReference)b.get();
    if (weakReference1 != null) {
      b.f.a<ViewGroup, ArrayList<i>> a1 = weakReference1.get();
      if (a1 != null)
        return a1; 
    } 
    b.f.a<ViewGroup, ArrayList<i>> a = new b.f.a();
    WeakReference<b.f.a> weakReference2 = new WeakReference<b.f.a>(a);
    b.set(weakReference2);
    return a;
  }
  
  public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public i b;
    
    public ViewGroup c;
    
    public a(i param1i, ViewGroup param1ViewGroup) {
      this.b = param1i;
      this.c = param1ViewGroup;
    }
    
    public boolean onPreDraw() {
      // Byte code:
      //   0: aload_0
      //   1: getfield c : Landroid/view/ViewGroup;
      //   4: invokevirtual getViewTreeObserver : ()Landroid/view/ViewTreeObserver;
      //   7: aload_0
      //   8: invokevirtual removeOnPreDrawListener : (Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
      //   11: aload_0
      //   12: getfield c : Landroid/view/ViewGroup;
      //   15: aload_0
      //   16: invokevirtual removeOnAttachStateChangeListener : (Landroid/view/View$OnAttachStateChangeListener;)V
      //   19: getstatic b/t/m.c : Ljava/util/ArrayList;
      //   22: aload_0
      //   23: getfield c : Landroid/view/ViewGroup;
      //   26: invokevirtual remove : (Ljava/lang/Object;)Z
      //   29: ifne -> 34
      //   32: iconst_1
      //   33: ireturn
      //   34: invokestatic a : ()Lb/f/a;
      //   37: astore #7
      //   39: aload #7
      //   41: aload_0
      //   42: getfield c : Landroid/view/ViewGroup;
      //   45: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   48: checkcast java/util/ArrayList
      //   51: astore #5
      //   53: aload #5
      //   55: ifnonnull -> 82
      //   58: new java/util/ArrayList
      //   61: dup
      //   62: invokespecial <init> : ()V
      //   65: astore #4
      //   67: aload #7
      //   69: aload_0
      //   70: getfield c : Landroid/view/ViewGroup;
      //   73: aload #4
      //   75: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   78: pop
      //   79: goto -> 116
      //   82: aload #5
      //   84: astore #4
      //   86: aload #5
      //   88: invokevirtual size : ()I
      //   91: ifle -> 116
      //   94: new java/util/ArrayList
      //   97: dup
      //   98: aload #5
      //   100: invokespecial <init> : (Ljava/util/Collection;)V
      //   103: astore #6
      //   105: aload #5
      //   107: astore #4
      //   109: aload #6
      //   111: astore #5
      //   113: goto -> 119
      //   116: aconst_null
      //   117: astore #5
      //   119: aload #4
      //   121: aload_0
      //   122: getfield b : Lb/t/i;
      //   125: invokevirtual add : (Ljava/lang/Object;)Z
      //   128: pop
      //   129: aload_0
      //   130: getfield b : Lb/t/i;
      //   133: new b/t/m$a$a
      //   136: dup
      //   137: aload_0
      //   138: aload #7
      //   140: invokespecial <init> : (Lb/t/m$a;Lb/f/a;)V
      //   143: invokevirtual a : (Lb/t/i$d;)Lb/t/i;
      //   146: pop
      //   147: aload_0
      //   148: getfield b : Lb/t/i;
      //   151: aload_0
      //   152: getfield c : Landroid/view/ViewGroup;
      //   155: iconst_0
      //   156: invokevirtual i : (Landroid/view/ViewGroup;Z)V
      //   159: aload #5
      //   161: ifnull -> 201
      //   164: aload #5
      //   166: invokevirtual iterator : ()Ljava/util/Iterator;
      //   169: astore #4
      //   171: aload #4
      //   173: invokeinterface hasNext : ()Z
      //   178: ifeq -> 201
      //   181: aload #4
      //   183: invokeinterface next : ()Ljava/lang/Object;
      //   188: checkcast b/t/i
      //   191: aload_0
      //   192: getfield c : Landroid/view/ViewGroup;
      //   195: invokevirtual y : (Landroid/view/View;)V
      //   198: goto -> 171
      //   201: aload_0
      //   202: getfield b : Lb/t/i;
      //   205: astore #7
      //   207: aload_0
      //   208: getfield c : Landroid/view/ViewGroup;
      //   211: astore #6
      //   213: aload #7
      //   215: ifnull -> 1383
      //   218: aload #7
      //   220: new java/util/ArrayList
      //   223: dup
      //   224: invokespecial <init> : ()V
      //   227: putfield u : Ljava/util/ArrayList;
      //   230: aload #7
      //   232: new java/util/ArrayList
      //   235: dup
      //   236: invokespecial <init> : ()V
      //   239: putfield v : Ljava/util/ArrayList;
      //   242: aload #7
      //   244: getfield q : Lb/t/r;
      //   247: astore #4
      //   249: aload #7
      //   251: getfield r : Lb/t/r;
      //   254: astore #10
      //   256: new b/f/a
      //   259: dup
      //   260: aload #4
      //   262: getfield a : Lb/f/a;
      //   265: invokespecial <init> : (Lb/f/h;)V
      //   268: astore #9
      //   270: new b/f/a
      //   273: dup
      //   274: aload #10
      //   276: getfield a : Lb/f/a;
      //   279: invokespecial <init> : (Lb/f/h;)V
      //   282: astore #8
      //   284: iconst_0
      //   285: istore_1
      //   286: aload #7
      //   288: getfield t : [I
      //   291: astore #5
      //   293: iload_1
      //   294: aload #5
      //   296: arraylength
      //   297: if_icmpge -> 998
      //   300: aload #5
      //   302: iload_1
      //   303: iaload
      //   304: istore_2
      //   305: iload_2
      //   306: iconst_1
      //   307: if_icmpeq -> 868
      //   310: iload_2
      //   311: iconst_2
      //   312: if_icmpeq -> 696
      //   315: iload_2
      //   316: iconst_3
      //   317: if_icmpeq -> 524
      //   320: iload_2
      //   321: iconst_4
      //   322: if_icmpeq -> 332
      //   325: aload #4
      //   327: astore #5
      //   329: goto -> 517
      //   332: aload #4
      //   334: getfield c : Lb/f/e;
      //   337: astore #11
      //   339: aload #10
      //   341: getfield c : Lb/f/e;
      //   344: astore #12
      //   346: aload #11
      //   348: invokevirtual h : ()I
      //   351: istore_3
      //   352: iconst_0
      //   353: istore_2
      //   354: aload #4
      //   356: astore #5
      //   358: iload_2
      //   359: iload_3
      //   360: if_icmpge -> 329
      //   363: aload #11
      //   365: iload_2
      //   366: invokevirtual i : (I)Ljava/lang/Object;
      //   369: checkcast android/view/View
      //   372: astore #14
      //   374: aload #14
      //   376: ifnull -> 511
      //   379: aload #7
      //   381: aload #14
      //   383: invokevirtual t : (Landroid/view/View;)Z
      //   386: ifeq -> 511
      //   389: aload #11
      //   391: getfield b : Z
      //   394: ifeq -> 402
      //   397: aload #11
      //   399: invokevirtual d : ()V
      //   402: aload #12
      //   404: aload #11
      //   406: getfield c : [J
      //   409: iload_2
      //   410: laload
      //   411: invokevirtual e : (J)Ljava/lang/Object;
      //   414: checkcast android/view/View
      //   417: astore #5
      //   419: aload #5
      //   421: ifnull -> 511
      //   424: aload #7
      //   426: aload #5
      //   428: invokevirtual t : (Landroid/view/View;)Z
      //   431: ifeq -> 511
      //   434: aload #9
      //   436: aload #14
      //   438: aconst_null
      //   439: invokevirtual getOrDefault : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   442: checkcast b/t/q
      //   445: astore #13
      //   447: aload #8
      //   449: aload #5
      //   451: aconst_null
      //   452: invokevirtual getOrDefault : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   455: checkcast b/t/q
      //   458: astore #15
      //   460: aload #13
      //   462: ifnull -> 511
      //   465: aload #15
      //   467: ifnull -> 511
      //   470: aload #7
      //   472: getfield u : Ljava/util/ArrayList;
      //   475: aload #13
      //   477: invokevirtual add : (Ljava/lang/Object;)Z
      //   480: pop
      //   481: aload #7
      //   483: getfield v : Ljava/util/ArrayList;
      //   486: aload #15
      //   488: invokevirtual add : (Ljava/lang/Object;)Z
      //   491: pop
      //   492: aload #9
      //   494: aload #14
      //   496: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
      //   499: pop
      //   500: aload #8
      //   502: aload #5
      //   504: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
      //   507: pop
      //   508: goto -> 511
      //   511: iinc #2, 1
      //   514: goto -> 354
      //   517: aload #5
      //   519: astore #4
      //   521: goto -> 992
      //   524: aload #4
      //   526: astore #5
      //   528: aload #5
      //   530: getfield b : Landroid/util/SparseArray;
      //   533: astore #11
      //   535: aload #10
      //   537: getfield b : Landroid/util/SparseArray;
      //   540: astore #12
      //   542: aload #11
      //   544: invokevirtual size : ()I
      //   547: istore_3
      //   548: iconst_0
      //   549: istore_2
      //   550: aload #5
      //   552: astore #4
      //   554: iload_2
      //   555: iload_3
      //   556: if_icmpge -> 992
      //   559: aload #11
      //   561: iload_2
      //   562: invokevirtual valueAt : (I)Ljava/lang/Object;
      //   565: checkcast android/view/View
      //   568: astore #13
      //   570: aload #13
      //   572: ifnull -> 690
      //   575: aload #7
      //   577: aload #13
      //   579: invokevirtual t : (Landroid/view/View;)Z
      //   582: ifeq -> 690
      //   585: aload #12
      //   587: aload #11
      //   589: iload_2
      //   590: invokevirtual keyAt : (I)I
      //   593: invokevirtual get : (I)Ljava/lang/Object;
      //   596: checkcast android/view/View
      //   599: astore #4
      //   601: aload #4
      //   603: ifnull -> 690
      //   606: aload #7
      //   608: aload #4
      //   610: invokevirtual t : (Landroid/view/View;)Z
      //   613: ifeq -> 690
      //   616: aload #9
      //   618: aload #13
      //   620: aconst_null
      //   621: invokevirtual getOrDefault : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   624: checkcast b/t/q
      //   627: astore #14
      //   629: aload #8
      //   631: aload #4
      //   633: aconst_null
      //   634: invokevirtual getOrDefault : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   637: checkcast b/t/q
      //   640: astore #15
      //   642: aload #14
      //   644: ifnull -> 690
      //   647: aload #15
      //   649: ifnull -> 690
      //   652: aload #7
      //   654: getfield u : Ljava/util/ArrayList;
      //   657: aload #14
      //   659: invokevirtual add : (Ljava/lang/Object;)Z
      //   662: pop
      //   663: aload #7
      //   665: getfield v : Ljava/util/ArrayList;
      //   668: aload #15
      //   670: invokevirtual add : (Ljava/lang/Object;)Z
      //   673: pop
      //   674: aload #9
      //   676: aload #13
      //   678: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
      //   681: pop
      //   682: aload #8
      //   684: aload #4
      //   686: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
      //   689: pop
      //   690: iinc #2, 1
      //   693: goto -> 550
      //   696: aload #4
      //   698: astore #5
      //   700: aload #5
      //   702: getfield d : Lb/f/a;
      //   705: astore #11
      //   707: aload #10
      //   709: getfield d : Lb/f/a;
      //   712: astore #12
      //   714: aload #11
      //   716: getfield d : I
      //   719: istore_3
      //   720: iconst_0
      //   721: istore_2
      //   722: aload #5
      //   724: astore #4
      //   726: iload_2
      //   727: iload_3
      //   728: if_icmpge -> 992
      //   731: aload #11
      //   733: iload_2
      //   734: invokevirtual k : (I)Ljava/lang/Object;
      //   737: checkcast android/view/View
      //   740: astore #4
      //   742: aload #4
      //   744: ifnull -> 862
      //   747: aload #7
      //   749: aload #4
      //   751: invokevirtual t : (Landroid/view/View;)Z
      //   754: ifeq -> 862
      //   757: aload #12
      //   759: aload #11
      //   761: iload_2
      //   762: invokevirtual h : (I)Ljava/lang/Object;
      //   765: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   768: checkcast android/view/View
      //   771: astore #15
      //   773: aload #15
      //   775: ifnull -> 862
      //   778: aload #7
      //   780: aload #15
      //   782: invokevirtual t : (Landroid/view/View;)Z
      //   785: ifeq -> 862
      //   788: aload #9
      //   790: aload #4
      //   792: aconst_null
      //   793: invokevirtual getOrDefault : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   796: checkcast b/t/q
      //   799: astore #14
      //   801: aload #8
      //   803: aload #15
      //   805: aconst_null
      //   806: invokevirtual getOrDefault : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   809: checkcast b/t/q
      //   812: astore #13
      //   814: aload #14
      //   816: ifnull -> 862
      //   819: aload #13
      //   821: ifnull -> 862
      //   824: aload #7
      //   826: getfield u : Ljava/util/ArrayList;
      //   829: aload #14
      //   831: invokevirtual add : (Ljava/lang/Object;)Z
      //   834: pop
      //   835: aload #7
      //   837: getfield v : Ljava/util/ArrayList;
      //   840: aload #13
      //   842: invokevirtual add : (Ljava/lang/Object;)Z
      //   845: pop
      //   846: aload #9
      //   848: aload #4
      //   850: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
      //   853: pop
      //   854: aload #8
      //   856: aload #15
      //   858: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
      //   861: pop
      //   862: iinc #2, 1
      //   865: goto -> 722
      //   868: aload #4
      //   870: astore #5
      //   872: aload #9
      //   874: getfield d : I
      //   877: istore_2
      //   878: iload_2
      //   879: iconst_1
      //   880: isub
      //   881: istore_3
      //   882: aload #5
      //   884: astore #4
      //   886: iload_3
      //   887: iflt -> 992
      //   890: aload #9
      //   892: iload_3
      //   893: invokevirtual h : (I)Ljava/lang/Object;
      //   896: checkcast android/view/View
      //   899: astore #4
      //   901: iload_3
      //   902: istore_2
      //   903: aload #4
      //   905: ifnull -> 878
      //   908: iload_3
      //   909: istore_2
      //   910: aload #7
      //   912: aload #4
      //   914: invokevirtual t : (Landroid/view/View;)Z
      //   917: ifeq -> 878
      //   920: aload #8
      //   922: aload #4
      //   924: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
      //   927: checkcast b/t/q
      //   930: astore #4
      //   932: iload_3
      //   933: istore_2
      //   934: aload #4
      //   936: ifnull -> 878
      //   939: iload_3
      //   940: istore_2
      //   941: aload #7
      //   943: aload #4
      //   945: getfield b : Landroid/view/View;
      //   948: invokevirtual t : (Landroid/view/View;)Z
      //   951: ifeq -> 878
      //   954: aload #9
      //   956: iload_3
      //   957: invokevirtual i : (I)Ljava/lang/Object;
      //   960: checkcast b/t/q
      //   963: astore #11
      //   965: aload #7
      //   967: getfield u : Ljava/util/ArrayList;
      //   970: aload #11
      //   972: invokevirtual add : (Ljava/lang/Object;)Z
      //   975: pop
      //   976: aload #7
      //   978: getfield v : Ljava/util/ArrayList;
      //   981: aload #4
      //   983: invokevirtual add : (Ljava/lang/Object;)Z
      //   986: pop
      //   987: iload_3
      //   988: istore_2
      //   989: goto -> 878
      //   992: iinc #1, 1
      //   995: goto -> 286
      //   998: iconst_0
      //   999: istore_1
      //   1000: iload_1
      //   1001: aload #9
      //   1003: getfield d : I
      //   1006: if_icmpge -> 1060
      //   1009: aload #9
      //   1011: iload_1
      //   1012: invokevirtual k : (I)Ljava/lang/Object;
      //   1015: checkcast b/t/q
      //   1018: astore #4
      //   1020: aload #7
      //   1022: aload #4
      //   1024: getfield b : Landroid/view/View;
      //   1027: invokevirtual t : (Landroid/view/View;)Z
      //   1030: ifeq -> 1054
      //   1033: aload #7
      //   1035: getfield u : Ljava/util/ArrayList;
      //   1038: aload #4
      //   1040: invokevirtual add : (Ljava/lang/Object;)Z
      //   1043: pop
      //   1044: aload #7
      //   1046: getfield v : Ljava/util/ArrayList;
      //   1049: aconst_null
      //   1050: invokevirtual add : (Ljava/lang/Object;)Z
      //   1053: pop
      //   1054: iinc #1, 1
      //   1057: goto -> 1000
      //   1060: iconst_0
      //   1061: istore_1
      //   1062: iload_1
      //   1063: aload #8
      //   1065: getfield d : I
      //   1068: if_icmpge -> 1122
      //   1071: aload #8
      //   1073: iload_1
      //   1074: invokevirtual k : (I)Ljava/lang/Object;
      //   1077: checkcast b/t/q
      //   1080: astore #4
      //   1082: aload #7
      //   1084: aload #4
      //   1086: getfield b : Landroid/view/View;
      //   1089: invokevirtual t : (Landroid/view/View;)Z
      //   1092: ifeq -> 1116
      //   1095: aload #7
      //   1097: getfield v : Ljava/util/ArrayList;
      //   1100: aload #4
      //   1102: invokevirtual add : (Ljava/lang/Object;)Z
      //   1105: pop
      //   1106: aload #7
      //   1108: getfield u : Ljava/util/ArrayList;
      //   1111: aconst_null
      //   1112: invokevirtual add : (Ljava/lang/Object;)Z
      //   1115: pop
      //   1116: iinc #1, 1
      //   1119: goto -> 1062
      //   1122: invokestatic p : ()Lb/f/a;
      //   1125: astore #8
      //   1127: aload #8
      //   1129: getfield d : I
      //   1132: istore_1
      //   1133: aload #6
      //   1135: invokestatic c : (Landroid/view/View;)Lb/t/f0;
      //   1138: astore #10
      //   1140: iinc #1, -1
      //   1143: iload_1
      //   1144: iflt -> 1349
      //   1147: aload #8
      //   1149: iload_1
      //   1150: invokevirtual h : (I)Ljava/lang/Object;
      //   1153: checkcast android/animation/Animator
      //   1156: astore #13
      //   1158: aload #13
      //   1160: ifnull -> 1343
      //   1163: aload #8
      //   1165: aload #13
      //   1167: aconst_null
      //   1168: invokevirtual getOrDefault : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   1171: checkcast b/t/i$b
      //   1174: astore #9
      //   1176: aload #9
      //   1178: ifnull -> 1343
      //   1181: aload #9
      //   1183: getfield a : Landroid/view/View;
      //   1186: ifnull -> 1343
      //   1189: aload #10
      //   1191: aload #9
      //   1193: getfield d : Lb/t/f0;
      //   1196: invokevirtual equals : (Ljava/lang/Object;)Z
      //   1199: ifeq -> 1343
      //   1202: aload #9
      //   1204: getfield c : Lb/t/q;
      //   1207: astore #11
      //   1209: aload #9
      //   1211: getfield a : Landroid/view/View;
      //   1214: astore #14
      //   1216: aload #7
      //   1218: aload #14
      //   1220: iconst_1
      //   1221: invokevirtual r : (Landroid/view/View;Z)Lb/t/q;
      //   1224: astore #12
      //   1226: aload #7
      //   1228: aload #14
      //   1230: iconst_1
      //   1231: invokevirtual o : (Landroid/view/View;Z)Lb/t/q;
      //   1234: astore #5
      //   1236: aload #5
      //   1238: astore #4
      //   1240: aload #12
      //   1242: ifnonnull -> 1272
      //   1245: aload #5
      //   1247: astore #4
      //   1249: aload #5
      //   1251: ifnonnull -> 1272
      //   1254: aload #7
      //   1256: getfield r : Lb/t/r;
      //   1259: getfield a : Lb/f/a;
      //   1262: aload #14
      //   1264: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   1267: checkcast b/t/q
      //   1270: astore #4
      //   1272: aload #12
      //   1274: ifnonnull -> 1282
      //   1277: aload #4
      //   1279: ifnull -> 1302
      //   1282: aload #9
      //   1284: getfield e : Lb/t/i;
      //   1287: aload #11
      //   1289: aload #4
      //   1291: invokevirtual s : (Lb/t/q;Lb/t/q;)Z
      //   1294: ifeq -> 1302
      //   1297: iconst_1
      //   1298: istore_2
      //   1299: goto -> 1304
      //   1302: iconst_0
      //   1303: istore_2
      //   1304: iload_2
      //   1305: ifeq -> 1343
      //   1308: aload #13
      //   1310: invokevirtual isRunning : ()Z
      //   1313: ifne -> 1338
      //   1316: aload #13
      //   1318: invokevirtual isStarted : ()Z
      //   1321: ifeq -> 1327
      //   1324: goto -> 1338
      //   1327: aload #8
      //   1329: aload #13
      //   1331: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
      //   1334: pop
      //   1335: goto -> 1343
      //   1338: aload #13
      //   1340: invokevirtual cancel : ()V
      //   1343: iinc #1, -1
      //   1346: goto -> 1143
      //   1349: aload #7
      //   1351: aload #6
      //   1353: aload #7
      //   1355: getfield q : Lb/t/r;
      //   1358: aload #7
      //   1360: getfield r : Lb/t/r;
      //   1363: aload #7
      //   1365: getfield u : Ljava/util/ArrayList;
      //   1368: aload #7
      //   1370: getfield v : Ljava/util/ArrayList;
      //   1373: invokevirtual m : (Landroid/view/ViewGroup;Lb/t/r;Lb/t/r;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
      //   1376: aload #7
      //   1378: invokevirtual z : ()V
      //   1381: iconst_1
      //   1382: ireturn
      //   1383: aconst_null
      //   1384: athrow
    }
    
    public void onViewAttachedToWindow(View param1View) {}
    
    public void onViewDetachedFromWindow(View param1View) {
      this.c.getViewTreeObserver().removeOnPreDrawListener(this);
      this.c.removeOnAttachStateChangeListener(this);
      m.c.remove(this.c);
      ArrayList arrayList = (ArrayList)m.a().get(this.c);
      if (arrayList != null && arrayList.size() > 0) {
        Iterator<i> iterator = arrayList.iterator();
        while (iterator.hasNext())
          ((i)iterator.next()).y((View)this.c); 
      } 
      this.b.j(true);
    }
    
    public class a extends l {
      public final b.f.a a;
      
      public final m.a b;
      
      public a(m.a this$0, b.f.a param2a) {}
      
      public void c(i param2i) {
        ((ArrayList)this.a.get(this.b.c)).remove(param2i);
        param2i.w(this);
      }
    }
  }
  
  public class a extends l {
    public final b.f.a a;
    
    public final m.a b;
    
    public a(m this$0, b.f.a param1a) {}
    
    public void c(i param1i) {
      ((ArrayList)this.a.get(this.b.c)).remove(param1i);
      param1i.w(this);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */