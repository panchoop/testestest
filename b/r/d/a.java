package b.r.d;

import androidx.recyclerview.widget.RecyclerView;
import b.i.l.c;
import java.util.ArrayList;
import java.util.List;

public class a implements q.a {
  public c<b> a = new c(30);
  
  public final ArrayList<b> b = new ArrayList<b>();
  
  public final ArrayList<b> c = new ArrayList<b>();
  
  public final a d;
  
  public final boolean e;
  
  public final q f;
  
  public int g = 0;
  
  public a(a parama) {
    this.d = parama;
    this.e = false;
    this.f = new q(this);
  }
  
  public final boolean a(int paramInt) {
    int i = this.c.size();
    for (byte b = 0; b < i; b++) {
      b b1 = this.c.get(b);
      int j = b1.a;
      if (j == 8) {
        if (f(b1.d, b + 1) == paramInt)
          return true; 
      } else if (j == 1) {
        int k = b1.b;
        int m = b1.d;
        for (j = k; j < m + k; j++) {
          if (f(j, b + 1) == paramInt)
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  public void b() {
    int i = this.c.size();
    for (byte b = 0; b < i; b++) {
      a a1 = this.d;
      b b1 = this.c.get(b);
      ((RecyclerView.f)a1).a(b1);
    } 
    l(this.c);
    this.g = 0;
  }
  
  public void c() {
    b();
    int i = this.b.size();
    for (byte b = 0; b < i; b++) {
      Object object = this.b.get(b);
      int j = ((b)object).a;
      if (j != 1) {
        if (j != 2) {
          if (j != 4) {
            if (j == 8) {
              ((RecyclerView.f)this.d).a((b)object);
              a a1 = this.d;
              int k = ((b)object).b;
              j = ((b)object).d;
              object = a1;
              ((RecyclerView.f)object).a.offsetPositionRecordsForMove(k, j);
              ((RecyclerView.f)object).a.mItemsAddedOrRemoved = true;
            } 
          } else {
            ((RecyclerView.f)this.d).a((b)object);
            a a1 = this.d;
            int k = ((b)object).b;
            j = ((b)object).d;
            object = ((b)object).c;
            ((RecyclerView.f)a1).c(k, j, object);
          } 
        } else {
          ((RecyclerView.f)this.d).a((b)object);
          a a1 = this.d;
          int k = ((b)object).b;
          j = ((b)object).d;
          object = a1;
          ((RecyclerView.f)object).a.offsetPositionRecordsForRemove(k, j, true);
          object = ((RecyclerView.f)object).a;
          ((RecyclerView)object).mItemsAddedOrRemoved = true;
          object = ((RecyclerView)object).mState;
          ((RecyclerView.a0)object).c += j;
        } 
      } else {
        ((RecyclerView.f)this.d).a((b)object);
        a a1 = this.d;
        int k = ((b)object).b;
        j = ((b)object).d;
        object = a1;
        ((RecyclerView.f)object).a.offsetPositionRecordsForInsert(k, j);
        ((RecyclerView.f)object).a.mItemsAddedOrRemoved = true;
      } 
    } 
    l(this.b);
    this.g = 0;
  }
  
  public final void d(b paramb) {
    int i = paramb.a;
    if (i != 1 && i != 8) {
      byte b1;
      int k = m(paramb.b, i);
      i = paramb.b;
      int j = paramb.a;
      if (j != 2) {
        if (j == 4) {
          b1 = 1;
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("op should be remove or update.");
          stringBuilder.append(paramb);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        b1 = 0;
      } 
      byte b2 = 1;
      j = 1;
      while (b2 < paramb.d) {
        int n = m(b1 * b2 + paramb.b, paramb.a);
        int m = paramb.a;
        if ((m != 2) ? (m == 4 && n == k + 1) : (n == k)) {
          m = 1;
        } else {
          m = 0;
        } 
        if (m != 0) {
          j++;
        } else {
          b b3 = h(paramb.a, k, j, paramb.c);
          e(b3, i);
          if (!this.e) {
            b3.c = null;
            this.a.b(b3);
          } 
          k = i;
          if (paramb.a == 4)
            k = i + j; 
          m = n;
          j = 1;
          i = k;
          k = m;
        } 
        b2++;
      } 
      Object object = paramb.c;
      if (!this.e) {
        paramb.c = null;
        this.a.b(paramb);
      } 
      if (j > 0) {
        paramb = h(paramb.a, k, j, object);
        e(paramb, i);
        if (!this.e) {
          paramb.c = null;
          this.a.b(paramb);
        } 
      } 
      return;
    } 
    throw new IllegalArgumentException("should not dispatch add or move for pre layout");
  }
  
  public void e(b paramb, int paramInt) {
    Object object;
    ((RecyclerView.f)this.d).a(paramb);
    int i = paramb.a;
    if (i != 2) {
      if (i == 4) {
        a a1 = this.d;
        i = paramb.d;
        object = paramb.c;
        RecyclerView.f f = (RecyclerView.f)a1;
        f.a.viewRangeUpdate(paramInt, i, object);
        f.a.mItemsChanged = true;
      } else {
        throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
      } 
    } else {
      a a1 = this.d;
      i = ((b)object).d;
      object = a1;
      ((RecyclerView.f)object).a.offsetPositionRecordsForRemove(paramInt, i, true);
      object = ((RecyclerView.f)object).a;
      ((RecyclerView)object).mItemsAddedOrRemoved = true;
      object = ((RecyclerView)object).mState;
      ((RecyclerView.a0)object).c += i;
    } 
  }
  
  public int f(int paramInt1, int paramInt2) {
    int j = this.c.size();
    int i = paramInt2;
    for (paramInt2 = paramInt1; i < j; paramInt2 = paramInt1) {
      b b = this.c.get(i);
      int k = b.a;
      if (k == 8) {
        paramInt1 = b.b;
        if (paramInt1 == paramInt2) {
          paramInt1 = b.d;
        } else {
          int m = paramInt2;
          if (paramInt1 < paramInt2)
            m = paramInt2 - 1; 
          paramInt1 = m;
          if (b.d <= m)
            paramInt1 = m + 1; 
        } 
      } else {
        int m = b.b;
        paramInt1 = paramInt2;
        if (m <= paramInt2)
          if (k == 2) {
            paramInt1 = b.d;
            if (paramInt2 < m + paramInt1)
              return -1; 
            paramInt1 = paramInt2 - paramInt1;
          } else {
            paramInt1 = paramInt2;
            if (k == 1)
              paramInt1 = paramInt2 + b.d; 
          }  
      } 
      i++;
    } 
    return paramInt2;
  }
  
  public boolean g() {
    boolean bool;
    if (this.b.size() > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public b h(int paramInt1, int paramInt2, int paramInt3, Object paramObject) {
    b b = (b)this.a.a();
    if (b == null) {
      paramObject = new b(paramInt1, paramInt2, paramInt3, paramObject);
    } else {
      b.a = paramInt1;
      b.b = paramInt2;
      b.d = paramInt3;
      b.c = paramObject;
      paramObject = b;
    } 
    return (b)paramObject;
  }
  
  public final void i(b paramb) {
    Object object;
    this.c.add(paramb);
    int i = paramb.a;
    if (i != 1) {
      if (i != 2) {
        if (i != 4) {
          if (i == 8) {
            a a1 = this.d;
            i = paramb.b;
            int j = paramb.d;
            object = a1;
            ((RecyclerView.f)object).a.offsetPositionRecordsForMove(i, j);
            ((RecyclerView.f)object).a.mItemsAddedOrRemoved = true;
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown update op type for ");
            stringBuilder.append(object);
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
        } else {
          a a1 = this.d;
          int j = ((b)object).b;
          i = ((b)object).d;
          object = ((b)object).c;
          ((RecyclerView.f)a1).c(j, i, object);
        } 
      } else {
        a a1 = this.d;
        i = ((b)object).b;
        int j = ((b)object).d;
        object = a1;
        ((RecyclerView.f)object).a.offsetPositionRecordsForRemove(i, j, false);
        ((RecyclerView.f)object).a.mItemsAddedOrRemoved = true;
      } 
    } else {
      a a1 = this.d;
      i = ((b)object).b;
      int j = ((b)object).d;
      object = a1;
      ((RecyclerView.f)object).a.offsetPositionRecordsForInsert(i, j);
      ((RecyclerView.f)object).a.mItemsAddedOrRemoved = true;
    } 
  }
  
  public void j() {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Lb/r/d/q;
    //   4: astore #15
    //   6: aload_0
    //   7: getfield b : Ljava/util/ArrayList;
    //   10: astore #14
    //   12: aload #15
    //   14: ifnull -> 1789
    //   17: aload #14
    //   19: invokeinterface size : ()I
    //   24: iconst_1
    //   25: isub
    //   26: istore_1
    //   27: iconst_0
    //   28: istore_2
    //   29: iload_1
    //   30: iflt -> 73
    //   33: aload #14
    //   35: iload_1
    //   36: invokeinterface get : (I)Ljava/lang/Object;
    //   41: checkcast b/r/d/a$b
    //   44: getfield a : I
    //   47: bipush #8
    //   49: if_icmpne -> 63
    //   52: iload_2
    //   53: istore_3
    //   54: iload_2
    //   55: ifeq -> 65
    //   58: iload_1
    //   59: istore_3
    //   60: goto -> 75
    //   63: iconst_1
    //   64: istore_3
    //   65: iinc #1, -1
    //   68: iload_3
    //   69: istore_2
    //   70: goto -> 29
    //   73: iconst_m1
    //   74: istore_3
    //   75: iload_3
    //   76: iconst_m1
    //   77: if_icmpeq -> 1232
    //   80: iload_3
    //   81: iconst_1
    //   82: iadd
    //   83: istore #4
    //   85: aload #14
    //   87: iload_3
    //   88: invokeinterface get : (I)Ljava/lang/Object;
    //   93: checkcast b/r/d/a$b
    //   96: astore #17
    //   98: aload #14
    //   100: iload #4
    //   102: invokeinterface get : (I)Ljava/lang/Object;
    //   107: checkcast b/r/d/a$b
    //   110: astore #16
    //   112: aload #16
    //   114: getfield a : I
    //   117: istore_1
    //   118: iload_1
    //   119: iconst_1
    //   120: if_icmpeq -> 1093
    //   123: iload_1
    //   124: iconst_2
    //   125: if_icmpeq -> 434
    //   128: iload_1
    //   129: iconst_4
    //   130: if_icmpeq -> 136
    //   133: goto -> 17
    //   136: aload #17
    //   138: getfield d : I
    //   141: istore #5
    //   143: aload #16
    //   145: getfield b : I
    //   148: istore_1
    //   149: iload #5
    //   151: iload_1
    //   152: if_icmpge -> 166
    //   155: aload #16
    //   157: iload_1
    //   158: iconst_1
    //   159: isub
    //   160: putfield b : I
    //   163: goto -> 226
    //   166: aload #16
    //   168: getfield d : I
    //   171: istore_2
    //   172: iload #5
    //   174: iload_1
    //   175: iload_2
    //   176: iadd
    //   177: if_icmpge -> 226
    //   180: aload #16
    //   182: iload_2
    //   183: iconst_1
    //   184: isub
    //   185: putfield d : I
    //   188: aload #15
    //   190: getfield a : Lb/r/d/q$a;
    //   193: astore #13
    //   195: aload #17
    //   197: getfield b : I
    //   200: istore_1
    //   201: aload #16
    //   203: getfield c : Ljava/lang/Object;
    //   206: astore #12
    //   208: aload #13
    //   210: checkcast b/r/d/a
    //   213: iconst_4
    //   214: iload_1
    //   215: iconst_1
    //   216: aload #12
    //   218: invokevirtual h : (IIILjava/lang/Object;)Lb/r/d/a$b;
    //   221: astore #12
    //   223: goto -> 229
    //   226: aconst_null
    //   227: astore #12
    //   229: aload #17
    //   231: getfield b : I
    //   234: istore_1
    //   235: aload #16
    //   237: getfield b : I
    //   240: istore_2
    //   241: iload_1
    //   242: iload_2
    //   243: if_icmpgt -> 257
    //   246: aload #16
    //   248: iload_2
    //   249: iconst_1
    //   250: iadd
    //   251: putfield b : I
    //   254: goto -> 320
    //   257: iload_2
    //   258: aload #16
    //   260: getfield d : I
    //   263: iadd
    //   264: istore_2
    //   265: iload_1
    //   266: iload_2
    //   267: if_icmpge -> 320
    //   270: iload_2
    //   271: iload_1
    //   272: isub
    //   273: istore_2
    //   274: aload #15
    //   276: getfield a : Lb/r/d/q$a;
    //   279: astore #18
    //   281: aload #16
    //   283: getfield c : Ljava/lang/Object;
    //   286: astore #13
    //   288: aload #18
    //   290: checkcast b/r/d/a
    //   293: iconst_4
    //   294: iload_1
    //   295: iconst_1
    //   296: iadd
    //   297: iload_2
    //   298: aload #13
    //   300: invokevirtual h : (IIILjava/lang/Object;)Lb/r/d/a$b;
    //   303: astore #13
    //   305: aload #16
    //   307: aload #16
    //   309: getfield d : I
    //   312: iload_2
    //   313: isub
    //   314: putfield d : I
    //   317: goto -> 323
    //   320: aconst_null
    //   321: astore #13
    //   323: aload #14
    //   325: iload #4
    //   327: aload #17
    //   329: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   334: pop
    //   335: aload #16
    //   337: getfield d : I
    //   340: ifle -> 357
    //   343: aload #14
    //   345: iload_3
    //   346: aload #16
    //   348: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   353: pop
    //   354: goto -> 401
    //   357: aload #14
    //   359: iload_3
    //   360: invokeinterface remove : (I)Ljava/lang/Object;
    //   365: pop
    //   366: aload #15
    //   368: getfield a : Lb/r/d/q$a;
    //   371: checkcast b/r/d/a
    //   374: astore #17
    //   376: aload #17
    //   378: getfield e : Z
    //   381: ifne -> 401
    //   384: aload #16
    //   386: aconst_null
    //   387: putfield c : Ljava/lang/Object;
    //   390: aload #17
    //   392: getfield a : Lb/i/l/c;
    //   395: aload #16
    //   397: invokevirtual b : (Ljava/lang/Object;)Z
    //   400: pop
    //   401: aload #12
    //   403: ifnull -> 416
    //   406: aload #14
    //   408: iload_3
    //   409: aload #12
    //   411: invokeinterface add : (ILjava/lang/Object;)V
    //   416: aload #13
    //   418: ifnull -> 17
    //   421: aload #14
    //   423: iload_3
    //   424: aload #13
    //   426: invokeinterface add : (ILjava/lang/Object;)V
    //   431: goto -> 17
    //   434: aload #17
    //   436: getfield b : I
    //   439: istore_2
    //   440: aload #17
    //   442: getfield d : I
    //   445: istore_1
    //   446: aload #16
    //   448: getfield b : I
    //   451: istore #5
    //   453: iload_2
    //   454: iload_1
    //   455: if_icmpge -> 487
    //   458: iload #5
    //   460: iload_2
    //   461: if_icmpne -> 480
    //   464: aload #16
    //   466: getfield d : I
    //   469: iload_1
    //   470: iload_2
    //   471: isub
    //   472: if_icmpne -> 480
    //   475: iconst_0
    //   476: istore_1
    //   477: goto -> 508
    //   480: iconst_0
    //   481: istore_1
    //   482: iconst_0
    //   483: istore_2
    //   484: goto -> 519
    //   487: iload #5
    //   489: iload_1
    //   490: iconst_1
    //   491: iadd
    //   492: if_icmpne -> 515
    //   495: aload #16
    //   497: getfield d : I
    //   500: iload_2
    //   501: iload_1
    //   502: isub
    //   503: if_icmpne -> 515
    //   506: iconst_1
    //   507: istore_1
    //   508: iload_1
    //   509: istore_2
    //   510: iconst_1
    //   511: istore_1
    //   512: goto -> 519
    //   515: iconst_0
    //   516: istore_1
    //   517: iconst_1
    //   518: istore_2
    //   519: aload #17
    //   521: getfield d : I
    //   524: istore #7
    //   526: aload #16
    //   528: getfield b : I
    //   531: istore #6
    //   533: iload #7
    //   535: iload #6
    //   537: if_icmpge -> 552
    //   540: aload #16
    //   542: iload #6
    //   544: iconst_1
    //   545: isub
    //   546: putfield b : I
    //   549: goto -> 646
    //   552: aload #16
    //   554: getfield d : I
    //   557: istore #5
    //   559: iload #7
    //   561: iload #6
    //   563: iload #5
    //   565: iadd
    //   566: if_icmpge -> 646
    //   569: aload #16
    //   571: iload #5
    //   573: iconst_1
    //   574: isub
    //   575: putfield d : I
    //   578: aload #17
    //   580: iconst_2
    //   581: putfield a : I
    //   584: aload #17
    //   586: iconst_1
    //   587: putfield d : I
    //   590: aload #16
    //   592: getfield d : I
    //   595: ifne -> 17
    //   598: aload #14
    //   600: iload #4
    //   602: invokeinterface remove : (I)Ljava/lang/Object;
    //   607: pop
    //   608: aload #15
    //   610: getfield a : Lb/r/d/q$a;
    //   613: checkcast b/r/d/a
    //   616: astore #12
    //   618: aload #12
    //   620: getfield e : Z
    //   623: ifne -> 17
    //   626: aload #16
    //   628: aconst_null
    //   629: putfield c : Ljava/lang/Object;
    //   632: aload #12
    //   634: getfield a : Lb/i/l/c;
    //   637: aload #16
    //   639: invokevirtual b : (Ljava/lang/Object;)Z
    //   642: pop
    //   643: goto -> 17
    //   646: aload #17
    //   648: getfield b : I
    //   651: istore #5
    //   653: aload #16
    //   655: getfield b : I
    //   658: istore #6
    //   660: iload #5
    //   662: iload #6
    //   664: if_icmpgt -> 679
    //   667: aload #16
    //   669: iload #6
    //   671: iconst_1
    //   672: iadd
    //   673: putfield b : I
    //   676: goto -> 739
    //   679: iload #6
    //   681: aload #16
    //   683: getfield d : I
    //   686: iadd
    //   687: istore #6
    //   689: iload #5
    //   691: iload #6
    //   693: if_icmpge -> 739
    //   696: aload #15
    //   698: getfield a : Lb/r/d/q$a;
    //   701: checkcast b/r/d/a
    //   704: iconst_2
    //   705: iload #5
    //   707: iconst_1
    //   708: iadd
    //   709: iload #6
    //   711: iload #5
    //   713: isub
    //   714: aconst_null
    //   715: invokevirtual h : (IIILjava/lang/Object;)Lb/r/d/a$b;
    //   718: astore #12
    //   720: aload #16
    //   722: aload #17
    //   724: getfield b : I
    //   727: aload #16
    //   729: getfield b : I
    //   732: isub
    //   733: putfield d : I
    //   736: goto -> 742
    //   739: aconst_null
    //   740: astore #12
    //   742: iload_1
    //   743: ifeq -> 805
    //   746: aload #14
    //   748: iload_3
    //   749: aload #16
    //   751: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   756: pop
    //   757: aload #14
    //   759: iload #4
    //   761: invokeinterface remove : (I)Ljava/lang/Object;
    //   766: pop
    //   767: aload #15
    //   769: getfield a : Lb/r/d/q$a;
    //   772: checkcast b/r/d/a
    //   775: astore #12
    //   777: aload #12
    //   779: getfield e : Z
    //   782: ifne -> 17
    //   785: aload #17
    //   787: aconst_null
    //   788: putfield c : Ljava/lang/Object;
    //   791: aload #12
    //   793: getfield a : Lb/i/l/c;
    //   796: aload #17
    //   798: invokevirtual b : (Ljava/lang/Object;)Z
    //   801: pop
    //   802: goto -> 17
    //   805: iload_2
    //   806: ifeq -> 913
    //   809: aload #12
    //   811: ifnull -> 868
    //   814: aload #17
    //   816: getfield b : I
    //   819: istore_1
    //   820: iload_1
    //   821: aload #12
    //   823: getfield b : I
    //   826: if_icmple -> 841
    //   829: aload #17
    //   831: iload_1
    //   832: aload #12
    //   834: getfield d : I
    //   837: isub
    //   838: putfield b : I
    //   841: aload #17
    //   843: getfield d : I
    //   846: istore_1
    //   847: iload_1
    //   848: aload #12
    //   850: getfield b : I
    //   853: if_icmple -> 868
    //   856: aload #17
    //   858: iload_1
    //   859: aload #12
    //   861: getfield d : I
    //   864: isub
    //   865: putfield d : I
    //   868: aload #17
    //   870: getfield b : I
    //   873: istore_1
    //   874: iload_1
    //   875: aload #16
    //   877: getfield b : I
    //   880: if_icmple -> 895
    //   883: aload #17
    //   885: iload_1
    //   886: aload #16
    //   888: getfield d : I
    //   891: isub
    //   892: putfield b : I
    //   895: aload #17
    //   897: getfield d : I
    //   900: istore_1
    //   901: iload_1
    //   902: aload #16
    //   904: getfield b : I
    //   907: if_icmple -> 1026
    //   910: goto -> 1014
    //   913: aload #12
    //   915: ifnull -> 972
    //   918: aload #17
    //   920: getfield b : I
    //   923: istore_1
    //   924: iload_1
    //   925: aload #12
    //   927: getfield b : I
    //   930: if_icmplt -> 945
    //   933: aload #17
    //   935: iload_1
    //   936: aload #12
    //   938: getfield d : I
    //   941: isub
    //   942: putfield b : I
    //   945: aload #17
    //   947: getfield d : I
    //   950: istore_1
    //   951: iload_1
    //   952: aload #12
    //   954: getfield b : I
    //   957: if_icmplt -> 972
    //   960: aload #17
    //   962: iload_1
    //   963: aload #12
    //   965: getfield d : I
    //   968: isub
    //   969: putfield d : I
    //   972: aload #17
    //   974: getfield b : I
    //   977: istore_1
    //   978: iload_1
    //   979: aload #16
    //   981: getfield b : I
    //   984: if_icmplt -> 999
    //   987: aload #17
    //   989: iload_1
    //   990: aload #16
    //   992: getfield d : I
    //   995: isub
    //   996: putfield b : I
    //   999: aload #17
    //   1001: getfield d : I
    //   1004: istore_1
    //   1005: iload_1
    //   1006: aload #16
    //   1008: getfield b : I
    //   1011: if_icmplt -> 1026
    //   1014: aload #17
    //   1016: iload_1
    //   1017: aload #16
    //   1019: getfield d : I
    //   1022: isub
    //   1023: putfield d : I
    //   1026: aload #14
    //   1028: iload_3
    //   1029: aload #16
    //   1031: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   1036: pop
    //   1037: aload #17
    //   1039: getfield b : I
    //   1042: aload #17
    //   1044: getfield d : I
    //   1047: if_icmpeq -> 1065
    //   1050: aload #14
    //   1052: iload #4
    //   1054: aload #17
    //   1056: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   1061: pop
    //   1062: goto -> 1075
    //   1065: aload #14
    //   1067: iload #4
    //   1069: invokeinterface remove : (I)Ljava/lang/Object;
    //   1074: pop
    //   1075: aload #12
    //   1077: ifnull -> 17
    //   1080: aload #14
    //   1082: iload_3
    //   1083: aload #12
    //   1085: invokeinterface add : (ILjava/lang/Object;)V
    //   1090: goto -> 17
    //   1093: aload #17
    //   1095: getfield d : I
    //   1098: aload #16
    //   1100: getfield b : I
    //   1103: if_icmpge -> 1111
    //   1106: iconst_m1
    //   1107: istore_1
    //   1108: goto -> 1113
    //   1111: iconst_0
    //   1112: istore_1
    //   1113: iload_1
    //   1114: istore_2
    //   1115: aload #17
    //   1117: getfield b : I
    //   1120: aload #16
    //   1122: getfield b : I
    //   1125: if_icmpge -> 1132
    //   1128: iload_1
    //   1129: iconst_1
    //   1130: iadd
    //   1131: istore_2
    //   1132: aload #16
    //   1134: getfield b : I
    //   1137: istore #5
    //   1139: aload #17
    //   1141: getfield b : I
    //   1144: istore_1
    //   1145: iload #5
    //   1147: iload_1
    //   1148: if_icmpgt -> 1163
    //   1151: aload #17
    //   1153: iload_1
    //   1154: aload #16
    //   1156: getfield d : I
    //   1159: iadd
    //   1160: putfield b : I
    //   1163: aload #16
    //   1165: getfield b : I
    //   1168: istore #5
    //   1170: aload #17
    //   1172: getfield d : I
    //   1175: istore_1
    //   1176: iload #5
    //   1178: iload_1
    //   1179: if_icmpgt -> 1194
    //   1182: aload #17
    //   1184: iload_1
    //   1185: aload #16
    //   1187: getfield d : I
    //   1190: iadd
    //   1191: putfield d : I
    //   1194: aload #16
    //   1196: aload #16
    //   1198: getfield b : I
    //   1201: iload_2
    //   1202: iadd
    //   1203: putfield b : I
    //   1206: aload #14
    //   1208: iload_3
    //   1209: aload #16
    //   1211: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   1216: pop
    //   1217: aload #14
    //   1219: iload #4
    //   1221: aload #17
    //   1223: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   1228: pop
    //   1229: goto -> 17
    //   1232: aload_0
    //   1233: getfield b : Ljava/util/ArrayList;
    //   1236: invokevirtual size : ()I
    //   1239: istore #10
    //   1241: iconst_0
    //   1242: istore #7
    //   1244: iload #7
    //   1246: iload #10
    //   1248: if_icmpge -> 1781
    //   1251: aload_0
    //   1252: getfield b : Ljava/util/ArrayList;
    //   1255: iload #7
    //   1257: invokevirtual get : (I)Ljava/lang/Object;
    //   1260: checkcast b/r/d/a$b
    //   1263: astore #12
    //   1265: aload #12
    //   1267: getfield a : I
    //   1270: istore_1
    //   1271: iload_1
    //   1272: iconst_1
    //   1273: if_icmpeq -> 1769
    //   1276: iload_1
    //   1277: iconst_2
    //   1278: if_icmpeq -> 1543
    //   1281: iload_1
    //   1282: iconst_4
    //   1283: if_icmpeq -> 1304
    //   1286: iload_1
    //   1287: bipush #8
    //   1289: if_icmpeq -> 1295
    //   1292: goto -> 1775
    //   1295: aload_0
    //   1296: aload #12
    //   1298: invokevirtual i : (Lb/r/d/a$b;)V
    //   1301: goto -> 1775
    //   1304: aload #12
    //   1306: getfield b : I
    //   1309: istore #8
    //   1311: aload #12
    //   1313: getfield d : I
    //   1316: istore #11
    //   1318: iload #8
    //   1320: istore_1
    //   1321: iconst_0
    //   1322: istore_2
    //   1323: iconst_m1
    //   1324: istore #9
    //   1326: iload #8
    //   1328: istore_3
    //   1329: iload_3
    //   1330: iload #11
    //   1332: iload #8
    //   1334: iadd
    //   1335: if_icmpge -> 1466
    //   1338: aload_0
    //   1339: getfield d : Lb/r/d/a$a;
    //   1342: checkcast androidx/recyclerview/widget/RecyclerView$f
    //   1345: iload_3
    //   1346: invokevirtual b : (I)Landroidx/recyclerview/widget/RecyclerView$d0;
    //   1349: ifnonnull -> 1412
    //   1352: aload_0
    //   1353: iload_3
    //   1354: invokevirtual a : (I)Z
    //   1357: ifeq -> 1363
    //   1360: goto -> 1412
    //   1363: iload_1
    //   1364: istore #5
    //   1366: iload_2
    //   1367: istore #4
    //   1369: iload #9
    //   1371: iconst_1
    //   1372: if_icmpne -> 1397
    //   1375: aload_0
    //   1376: aload_0
    //   1377: iconst_4
    //   1378: iload_1
    //   1379: iload_2
    //   1380: aload #12
    //   1382: getfield c : Ljava/lang/Object;
    //   1385: invokevirtual h : (IIILjava/lang/Object;)Lb/r/d/a$b;
    //   1388: invokevirtual i : (Lb/r/d/a$b;)V
    //   1391: iload_3
    //   1392: istore #5
    //   1394: iconst_0
    //   1395: istore #4
    //   1397: iconst_0
    //   1398: istore_2
    //   1399: iload #5
    //   1401: istore_1
    //   1402: iload #4
    //   1404: istore #6
    //   1406: iload_2
    //   1407: istore #4
    //   1409: goto -> 1451
    //   1412: iload_1
    //   1413: istore #5
    //   1415: iload_2
    //   1416: istore #6
    //   1418: iload #9
    //   1420: ifne -> 1445
    //   1423: aload_0
    //   1424: aload_0
    //   1425: iconst_4
    //   1426: iload_1
    //   1427: iload_2
    //   1428: aload #12
    //   1430: getfield c : Ljava/lang/Object;
    //   1433: invokevirtual h : (IIILjava/lang/Object;)Lb/r/d/a$b;
    //   1436: invokevirtual d : (Lb/r/d/a$b;)V
    //   1439: iload_3
    //   1440: istore #5
    //   1442: iconst_0
    //   1443: istore #6
    //   1445: iconst_1
    //   1446: istore #4
    //   1448: iload #5
    //   1450: istore_1
    //   1451: iload #6
    //   1453: iconst_1
    //   1454: iadd
    //   1455: istore_2
    //   1456: iinc #3, 1
    //   1459: iload #4
    //   1461: istore #9
    //   1463: goto -> 1329
    //   1466: aload #12
    //   1468: astore #13
    //   1470: iload_2
    //   1471: aload #12
    //   1473: getfield d : I
    //   1476: if_icmpeq -> 1520
    //   1479: aload #12
    //   1481: getfield c : Ljava/lang/Object;
    //   1484: astore #13
    //   1486: aload_0
    //   1487: getfield e : Z
    //   1490: ifne -> 1509
    //   1493: aload #12
    //   1495: aconst_null
    //   1496: putfield c : Ljava/lang/Object;
    //   1499: aload_0
    //   1500: getfield a : Lb/i/l/c;
    //   1503: aload #12
    //   1505: invokevirtual b : (Ljava/lang/Object;)Z
    //   1508: pop
    //   1509: aload_0
    //   1510: iconst_4
    //   1511: iload_1
    //   1512: iload_2
    //   1513: aload #13
    //   1515: invokevirtual h : (IIILjava/lang/Object;)Lb/r/d/a$b;
    //   1518: astore #13
    //   1520: iload #9
    //   1522: ifne -> 1534
    //   1525: aload_0
    //   1526: aload #13
    //   1528: invokevirtual d : (Lb/r/d/a$b;)V
    //   1531: goto -> 1775
    //   1534: aload_0
    //   1535: aload #13
    //   1537: invokevirtual i : (Lb/r/d/a$b;)V
    //   1540: goto -> 1775
    //   1543: aload #12
    //   1545: getfield b : I
    //   1548: istore #6
    //   1550: aload #12
    //   1552: getfield d : I
    //   1555: iload #6
    //   1557: iadd
    //   1558: istore #4
    //   1560: iload #6
    //   1562: istore_1
    //   1563: iconst_0
    //   1564: istore #5
    //   1566: iconst_m1
    //   1567: istore_2
    //   1568: iload_1
    //   1569: iload #4
    //   1571: if_icmpge -> 1698
    //   1574: aload_0
    //   1575: getfield d : Lb/r/d/a$a;
    //   1578: checkcast androidx/recyclerview/widget/RecyclerView$f
    //   1581: iload_1
    //   1582: invokevirtual b : (I)Landroidx/recyclerview/widget/RecyclerView$d0;
    //   1585: ifnonnull -> 1636
    //   1588: aload_0
    //   1589: iload_1
    //   1590: invokevirtual a : (I)Z
    //   1593: ifeq -> 1599
    //   1596: goto -> 1636
    //   1599: iload_2
    //   1600: iconst_1
    //   1601: if_icmpne -> 1623
    //   1604: aload_0
    //   1605: aload_0
    //   1606: iconst_2
    //   1607: iload #6
    //   1609: iload #5
    //   1611: aconst_null
    //   1612: invokevirtual h : (IIILjava/lang/Object;)Lb/r/d/a$b;
    //   1615: invokevirtual i : (Lb/r/d/a$b;)V
    //   1618: iconst_1
    //   1619: istore_2
    //   1620: goto -> 1625
    //   1623: iconst_0
    //   1624: istore_2
    //   1625: iconst_0
    //   1626: istore #8
    //   1628: iload_2
    //   1629: istore_3
    //   1630: iload #8
    //   1632: istore_2
    //   1633: goto -> 1663
    //   1636: iload_2
    //   1637: ifne -> 1659
    //   1640: aload_0
    //   1641: aload_0
    //   1642: iconst_2
    //   1643: iload #6
    //   1645: iload #5
    //   1647: aconst_null
    //   1648: invokevirtual h : (IIILjava/lang/Object;)Lb/r/d/a$b;
    //   1651: invokevirtual d : (Lb/r/d/a$b;)V
    //   1654: iconst_1
    //   1655: istore_3
    //   1656: goto -> 1661
    //   1659: iconst_0
    //   1660: istore_3
    //   1661: iconst_1
    //   1662: istore_2
    //   1663: iload_3
    //   1664: ifeq -> 1684
    //   1667: iload_1
    //   1668: iload #5
    //   1670: isub
    //   1671: istore_1
    //   1672: iload #4
    //   1674: iload #5
    //   1676: isub
    //   1677: istore #4
    //   1679: iconst_1
    //   1680: istore_3
    //   1681: goto -> 1689
    //   1684: iload #5
    //   1686: iconst_1
    //   1687: iadd
    //   1688: istore_3
    //   1689: iinc #1, 1
    //   1692: iload_3
    //   1693: istore #5
    //   1695: goto -> 1568
    //   1698: aload #12
    //   1700: astore #13
    //   1702: iload #5
    //   1704: aload #12
    //   1706: getfield d : I
    //   1709: if_icmpeq -> 1747
    //   1712: aload_0
    //   1713: getfield e : Z
    //   1716: ifne -> 1735
    //   1719: aload #12
    //   1721: aconst_null
    //   1722: putfield c : Ljava/lang/Object;
    //   1725: aload_0
    //   1726: getfield a : Lb/i/l/c;
    //   1729: aload #12
    //   1731: invokevirtual b : (Ljava/lang/Object;)Z
    //   1734: pop
    //   1735: aload_0
    //   1736: iconst_2
    //   1737: iload #6
    //   1739: iload #5
    //   1741: aconst_null
    //   1742: invokevirtual h : (IIILjava/lang/Object;)Lb/r/d/a$b;
    //   1745: astore #13
    //   1747: iload_2
    //   1748: ifne -> 1760
    //   1751: aload_0
    //   1752: aload #13
    //   1754: invokevirtual d : (Lb/r/d/a$b;)V
    //   1757: goto -> 1775
    //   1760: aload_0
    //   1761: aload #13
    //   1763: invokevirtual i : (Lb/r/d/a$b;)V
    //   1766: goto -> 1775
    //   1769: aload_0
    //   1770: aload #12
    //   1772: invokevirtual i : (Lb/r/d/a$b;)V
    //   1775: iinc #7, 1
    //   1778: goto -> 1244
    //   1781: aload_0
    //   1782: getfield b : Ljava/util/ArrayList;
    //   1785: invokevirtual clear : ()V
    //   1788: return
    //   1789: aconst_null
    //   1790: athrow
  }
  
  public void k(b paramb) {
    if (!this.e) {
      paramb.c = null;
      this.a.b(paramb);
    } 
  }
  
  public void l(List<b> paramList) {
    int i = paramList.size();
    for (byte b = 0; b < i; b++)
      k(paramList.get(b)); 
    paramList.clear();
  }
  
  public final int m(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/util/ArrayList;
    //   4: invokevirtual size : ()I
    //   7: iconst_1
    //   8: isub
    //   9: istore #4
    //   11: iload_1
    //   12: istore_3
    //   13: iload #4
    //   15: iflt -> 350
    //   18: aload_0
    //   19: getfield c : Ljava/util/ArrayList;
    //   22: iload #4
    //   24: invokevirtual get : (I)Ljava/lang/Object;
    //   27: checkcast b/r/d/a$b
    //   30: astore #7
    //   32: aload #7
    //   34: getfield a : I
    //   37: istore #5
    //   39: iload #5
    //   41: bipush #8
    //   43: if_icmpne -> 257
    //   46: aload #7
    //   48: getfield b : I
    //   51: istore #5
    //   53: aload #7
    //   55: getfield d : I
    //   58: istore_1
    //   59: iload #5
    //   61: iload_1
    //   62: if_icmpge -> 71
    //   65: iload_1
    //   66: istore #6
    //   68: goto -> 78
    //   71: iload #5
    //   73: istore #6
    //   75: iload_1
    //   76: istore #5
    //   78: iload_3
    //   79: iload #5
    //   81: if_icmplt -> 182
    //   84: iload_3
    //   85: iload #6
    //   87: if_icmpgt -> 182
    //   90: aload #7
    //   92: getfield b : I
    //   95: istore_1
    //   96: iload #5
    //   98: iload_1
    //   99: if_icmpne -> 147
    //   102: iload_2
    //   103: iconst_1
    //   104: if_icmpne -> 124
    //   107: aload #7
    //   109: getfield d : I
    //   112: iconst_1
    //   113: iadd
    //   114: istore_1
    //   115: aload #7
    //   117: iload_1
    //   118: putfield d : I
    //   121: goto -> 140
    //   124: iload_2
    //   125: iconst_2
    //   126: if_icmpne -> 140
    //   129: aload #7
    //   131: getfield d : I
    //   134: iconst_1
    //   135: isub
    //   136: istore_1
    //   137: goto -> 115
    //   140: iload_3
    //   141: iconst_1
    //   142: iadd
    //   143: istore_1
    //   144: goto -> 342
    //   147: iload_2
    //   148: iconst_1
    //   149: if_icmpne -> 164
    //   152: iinc #1, 1
    //   155: aload #7
    //   157: iload_1
    //   158: putfield b : I
    //   161: goto -> 175
    //   164: iload_2
    //   165: iconst_2
    //   166: if_icmpne -> 175
    //   169: iinc #1, -1
    //   172: goto -> 155
    //   175: iload_3
    //   176: iconst_1
    //   177: isub
    //   178: istore_1
    //   179: goto -> 342
    //   182: aload #7
    //   184: getfield b : I
    //   187: istore #5
    //   189: iload_3
    //   190: istore_1
    //   191: iload_3
    //   192: iload #5
    //   194: if_icmpge -> 342
    //   197: iload_2
    //   198: iconst_1
    //   199: if_icmpne -> 230
    //   202: aload #7
    //   204: iload #5
    //   206: iconst_1
    //   207: iadd
    //   208: putfield b : I
    //   211: aload #7
    //   213: getfield d : I
    //   216: iconst_1
    //   217: iadd
    //   218: istore_1
    //   219: aload #7
    //   221: iload_1
    //   222: putfield d : I
    //   225: iload_3
    //   226: istore_1
    //   227: goto -> 342
    //   230: iload_3
    //   231: istore_1
    //   232: iload_2
    //   233: iconst_2
    //   234: if_icmpne -> 342
    //   237: aload #7
    //   239: iload #5
    //   241: iconst_1
    //   242: isub
    //   243: putfield b : I
    //   246: aload #7
    //   248: getfield d : I
    //   251: iconst_1
    //   252: isub
    //   253: istore_1
    //   254: goto -> 219
    //   257: aload #7
    //   259: getfield b : I
    //   262: istore #6
    //   264: iload #6
    //   266: iload_3
    //   267: if_icmpgt -> 306
    //   270: iload #5
    //   272: iconst_1
    //   273: if_icmpne -> 287
    //   276: iload_3
    //   277: aload #7
    //   279: getfield d : I
    //   282: isub
    //   283: istore_1
    //   284: goto -> 342
    //   287: iload_3
    //   288: istore_1
    //   289: iload #5
    //   291: iconst_2
    //   292: if_icmpne -> 342
    //   295: iload_3
    //   296: aload #7
    //   298: getfield d : I
    //   301: iadd
    //   302: istore_1
    //   303: goto -> 342
    //   306: iload_2
    //   307: iconst_1
    //   308: if_icmpne -> 327
    //   311: iload #6
    //   313: iconst_1
    //   314: iadd
    //   315: istore_1
    //   316: aload #7
    //   318: iload_1
    //   319: putfield b : I
    //   322: iload_3
    //   323: istore_1
    //   324: goto -> 342
    //   327: iload_3
    //   328: istore_1
    //   329: iload_2
    //   330: iconst_2
    //   331: if_icmpne -> 342
    //   334: iload #6
    //   336: iconst_1
    //   337: isub
    //   338: istore_1
    //   339: goto -> 316
    //   342: iinc #4, -1
    //   345: iload_1
    //   346: istore_3
    //   347: goto -> 13
    //   350: aload_0
    //   351: getfield c : Ljava/util/ArrayList;
    //   354: invokevirtual size : ()I
    //   357: iconst_1
    //   358: isub
    //   359: istore_1
    //   360: iload_1
    //   361: iflt -> 474
    //   364: aload_0
    //   365: getfield c : Ljava/util/ArrayList;
    //   368: iload_1
    //   369: invokevirtual get : (I)Ljava/lang/Object;
    //   372: checkcast b/r/d/a$b
    //   375: astore #7
    //   377: aload #7
    //   379: getfield a : I
    //   382: bipush #8
    //   384: if_icmpne -> 441
    //   387: aload #7
    //   389: getfield d : I
    //   392: istore_2
    //   393: iload_2
    //   394: aload #7
    //   396: getfield b : I
    //   399: if_icmpeq -> 406
    //   402: iload_2
    //   403: ifge -> 468
    //   406: aload_0
    //   407: getfield c : Ljava/util/ArrayList;
    //   410: iload_1
    //   411: invokevirtual remove : (I)Ljava/lang/Object;
    //   414: pop
    //   415: aload_0
    //   416: getfield e : Z
    //   419: ifne -> 468
    //   422: aload #7
    //   424: aconst_null
    //   425: putfield c : Ljava/lang/Object;
    //   428: aload_0
    //   429: getfield a : Lb/i/l/c;
    //   432: aload #7
    //   434: invokevirtual b : (Ljava/lang/Object;)Z
    //   437: pop
    //   438: goto -> 468
    //   441: aload #7
    //   443: getfield d : I
    //   446: ifgt -> 468
    //   449: aload_0
    //   450: getfield c : Ljava/util/ArrayList;
    //   453: iload_1
    //   454: invokevirtual remove : (I)Ljava/lang/Object;
    //   457: pop
    //   458: aload_0
    //   459: getfield e : Z
    //   462: ifne -> 468
    //   465: goto -> 422
    //   468: iinc #1, -1
    //   471: goto -> 360
    //   474: iload_3
    //   475: ireturn
  }
  
  public static interface a {}
  
  public static class b {
    public int a;
    
    public int b;
    
    public Object c;
    
    public int d;
    
    public b(int param1Int1, int param1Int2, int param1Int3, Object param1Object) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.d = param1Int3;
      this.c = param1Object;
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object == null || b.class != param1Object.getClass())
        return false; 
      b b1 = (b)param1Object;
      int i = this.a;
      if (i != b1.a)
        return false; 
      if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == b1.b && this.b == b1.d)
        return true; 
      if (this.d != b1.d)
        return false; 
      if (this.b != b1.b)
        return false; 
      param1Object = this.c;
      Object object = b1.c;
      if (param1Object != null) {
        if (!param1Object.equals(object))
          return false; 
      } else if (object != null) {
        return false;
      } 
      return true;
    }
    
    public int hashCode() {
      return (this.a * 31 + this.b) * 31 + this.d;
    }
    
    public String toString() {
      String str;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append("[");
      int i = this.a;
      if (i != 1) {
        if (i != 2) {
          if (i != 4) {
            if (i != 8) {
              str = "??";
            } else {
              str = "mv";
            } 
          } else {
            str = "up";
          } 
        } else {
          str = "rm";
        } 
      } else {
        str = "add";
      } 
      stringBuilder.append(str);
      stringBuilder.append(",s:");
      stringBuilder.append(this.b);
      stringBuilder.append("c:");
      stringBuilder.append(this.d);
      stringBuilder.append(",p:");
      stringBuilder.append(this.c);
      stringBuilder.append("]");
      return stringBuilder.toString();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\r\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */