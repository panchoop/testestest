package b.i.k;

import java.util.Locale;

public final class a {
  public static final c d = d.c;
  
  public static final String e = Character.toString('‎');
  
  public static final String f = Character.toString('‏');
  
  public static final a g = new a(false, 2, d);
  
  public static final a h = new a(true, 2, d);
  
  public final boolean a;
  
  public final int b;
  
  public final c c;
  
  public a(boolean paramBoolean, int paramInt, c paramc) {
    this.a = paramBoolean;
    this.b = paramInt;
    this.c = paramc;
  }
  
  public static int a(CharSequence paramCharSequence) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #7
    //   3: new b/i/k/a$a
    //   6: dup
    //   7: aload_0
    //   8: iconst_0
    //   9: invokespecial <init> : (Ljava/lang/CharSequence;Z)V
    //   12: astore_0
    //   13: aload_0
    //   14: iconst_0
    //   15: putfield d : I
    //   18: iconst_0
    //   19: istore #6
    //   21: iconst_0
    //   22: istore_3
    //   23: iconst_0
    //   24: istore_2
    //   25: aload_0
    //   26: getfield d : I
    //   29: istore #4
    //   31: iload #4
    //   33: aload_0
    //   34: getfield c : I
    //   37: if_icmpge -> 495
    //   40: iload #6
    //   42: ifne -> 495
    //   45: aload_0
    //   46: getfield a : Ljava/lang/CharSequence;
    //   49: iload #4
    //   51: invokeinterface charAt : (I)C
    //   56: istore_1
    //   57: aload_0
    //   58: iload_1
    //   59: putfield e : C
    //   62: iload_1
    //   63: invokestatic isHighSurrogate : (C)Z
    //   66: ifeq -> 110
    //   69: aload_0
    //   70: getfield a : Ljava/lang/CharSequence;
    //   73: aload_0
    //   74: getfield d : I
    //   77: invokestatic codePointAt : (Ljava/lang/CharSequence;I)I
    //   80: istore #4
    //   82: aload_0
    //   83: getfield d : I
    //   86: istore #5
    //   88: aload_0
    //   89: iload #4
    //   91: invokestatic charCount : (I)I
    //   94: iload #5
    //   96: iadd
    //   97: putfield d : I
    //   100: iload #4
    //   102: invokestatic getDirectionality : (I)B
    //   105: istore #4
    //   107: goto -> 389
    //   110: aload_0
    //   111: aload_0
    //   112: getfield d : I
    //   115: iconst_1
    //   116: iadd
    //   117: putfield d : I
    //   120: aload_0
    //   121: getfield e : C
    //   124: istore_1
    //   125: iload_1
    //   126: sipush #1792
    //   129: if_icmpge -> 142
    //   132: getstatic b/i/k/a$a.f : [B
    //   135: iload_1
    //   136: baload
    //   137: istore #5
    //   139: goto -> 148
    //   142: iload_1
    //   143: invokestatic getDirectionality : (C)B
    //   146: istore #5
    //   148: iload #5
    //   150: istore #4
    //   152: aload_0
    //   153: getfield b : Z
    //   156: ifeq -> 389
    //   159: aload_0
    //   160: getfield e : C
    //   163: istore #8
    //   165: iload #8
    //   167: bipush #60
    //   169: if_icmpne -> 321
    //   172: aload_0
    //   173: getfield d : I
    //   176: istore #4
    //   178: aload_0
    //   179: getfield d : I
    //   182: istore #5
    //   184: iload #5
    //   186: aload_0
    //   187: getfield c : I
    //   190: if_icmpge -> 302
    //   193: aload_0
    //   194: getfield a : Ljava/lang/CharSequence;
    //   197: astore #9
    //   199: aload_0
    //   200: iload #5
    //   202: iconst_1
    //   203: iadd
    //   204: putfield d : I
    //   207: aload #9
    //   209: iload #5
    //   211: invokeinterface charAt : (I)C
    //   216: istore_1
    //   217: aload_0
    //   218: iload_1
    //   219: putfield e : C
    //   222: iload_1
    //   223: bipush #62
    //   225: if_icmpne -> 231
    //   228: goto -> 385
    //   231: iload_1
    //   232: bipush #34
    //   234: if_icmpeq -> 243
    //   237: iload_1
    //   238: bipush #39
    //   240: if_icmpne -> 178
    //   243: aload_0
    //   244: getfield e : C
    //   247: istore #5
    //   249: aload_0
    //   250: getfield d : I
    //   253: istore #8
    //   255: iload #8
    //   257: aload_0
    //   258: getfield c : I
    //   261: if_icmpge -> 178
    //   264: aload_0
    //   265: getfield a : Ljava/lang/CharSequence;
    //   268: astore #9
    //   270: aload_0
    //   271: iload #8
    //   273: iconst_1
    //   274: iadd
    //   275: putfield d : I
    //   278: aload #9
    //   280: iload #8
    //   282: invokeinterface charAt : (I)C
    //   287: istore_1
    //   288: aload_0
    //   289: iload_1
    //   290: putfield e : C
    //   293: iload_1
    //   294: iload #5
    //   296: if_icmpeq -> 178
    //   299: goto -> 249
    //   302: aload_0
    //   303: iload #4
    //   305: putfield d : I
    //   308: aload_0
    //   309: bipush #60
    //   311: putfield e : C
    //   314: bipush #13
    //   316: istore #4
    //   318: goto -> 389
    //   321: iload #5
    //   323: istore #4
    //   325: iload #8
    //   327: bipush #38
    //   329: if_icmpne -> 389
    //   332: aload_0
    //   333: getfield d : I
    //   336: istore #4
    //   338: iload #4
    //   340: aload_0
    //   341: getfield c : I
    //   344: if_icmpge -> 385
    //   347: aload_0
    //   348: getfield a : Ljava/lang/CharSequence;
    //   351: astore #9
    //   353: aload_0
    //   354: iload #4
    //   356: iconst_1
    //   357: iadd
    //   358: putfield d : I
    //   361: aload #9
    //   363: iload #4
    //   365: invokeinterface charAt : (I)C
    //   370: istore_1
    //   371: aload_0
    //   372: iload_1
    //   373: putfield e : C
    //   376: iload_1
    //   377: bipush #59
    //   379: if_icmpeq -> 385
    //   382: goto -> 332
    //   385: bipush #12
    //   387: istore #4
    //   389: iload #4
    //   391: ifeq -> 482
    //   394: iload #4
    //   396: iconst_1
    //   397: if_icmpeq -> 475
    //   400: iload #4
    //   402: iconst_2
    //   403: if_icmpeq -> 475
    //   406: iload #4
    //   408: bipush #9
    //   410: if_icmpeq -> 25
    //   413: iload #4
    //   415: tableswitch default -> 448, 14 -> 467, 15 -> 467, 16 -> 459, 17 -> 459, 18 -> 451
    //   448: goto -> 489
    //   451: iinc #2, -1
    //   454: iconst_0
    //   455: istore_3
    //   456: goto -> 25
    //   459: iinc #2, 1
    //   462: iconst_1
    //   463: istore_3
    //   464: goto -> 25
    //   467: iinc #2, 1
    //   470: iconst_m1
    //   471: istore_3
    //   472: goto -> 25
    //   475: iload_2
    //   476: ifne -> 489
    //   479: goto -> 584
    //   482: iload_2
    //   483: ifne -> 489
    //   486: goto -> 596
    //   489: iload_2
    //   490: istore #6
    //   492: goto -> 25
    //   495: iload #6
    //   497: ifne -> 506
    //   500: iload #7
    //   502: istore_2
    //   503: goto -> 607
    //   506: iload_2
    //   507: istore #4
    //   509: iload_3
    //   510: ifeq -> 518
    //   513: iload_3
    //   514: istore_2
    //   515: goto -> 607
    //   518: iload #7
    //   520: istore_2
    //   521: aload_0
    //   522: getfield d : I
    //   525: ifle -> 607
    //   528: aload_0
    //   529: invokevirtual a : ()B
    //   532: tableswitch default -> 568, 14 -> 589, 15 -> 589, 16 -> 577, 17 -> 577, 18 -> 571
    //   568: goto -> 518
    //   571: iinc #4, 1
    //   574: goto -> 518
    //   577: iload #6
    //   579: iload #4
    //   581: if_icmpne -> 601
    //   584: iconst_1
    //   585: istore_2
    //   586: goto -> 607
    //   589: iload #6
    //   591: iload #4
    //   593: if_icmpne -> 601
    //   596: iconst_m1
    //   597: istore_2
    //   598: goto -> 607
    //   601: iinc #4, -1
    //   604: goto -> 518
    //   607: iload_2
    //   608: ireturn
  }
  
  public static int b(CharSequence paramCharSequence) {
    byte b2;
    byte b4 = 0;
    a a1 = new a(paramCharSequence, false);
    a1.d = a1.c;
    byte b1 = 0;
    for (byte b3 = 0;; b3 = b1) {
      b2 = b4;
      if (a1.d > 0) {
        b2 = a1.a();
        if (b2 != 0) {
          if (b2 != 1 && b2 != 2) {
            if (b2 != 9) {
              switch (b2) {
                default:
                  if (!b3)
                    break; 
                  continue;
                case 18:
                  b1++;
                  continue;
                case 16:
                case 17:
                
                case 14:
                case 15:
                
              } 
              continue;
            } 
            continue;
          } 
          if (b1 != 0) {
            if (b3 == 0)
              continue; 
            continue;
          } 
        } else {
          if (b1 != 0) {
            if (b3 == 0)
              continue; 
            continue;
          } 
          b2 = -1;
        } 
      } else {
        break;
      } 
      b2 = 1;
      break;
    } 
    return b2;
  }
  
  public static a c() {
    a a1;
    int i = e.a(Locale.getDefault());
    boolean bool = true;
    if (i != 1)
      bool = false; 
    c c1 = d;
    if (c1 == d) {
      if (bool) {
        a1 = h;
      } else {
        a1 = g;
      } 
    } else {
      a1 = new a(bool, 2, (c)a1);
    } 
    return a1;
  }
  
  public static class a {
    public static final byte[] f = new byte[1792];
    
    public final CharSequence a;
    
    public final boolean b;
    
    public final int c;
    
    public int d;
    
    public char e;
    
    static {
      for (byte b = 0; b < '܀'; b++)
        f[b] = Character.getDirectionality(b); 
    }
    
    public a(CharSequence param1CharSequence, boolean param1Boolean) {
      this.a = param1CharSequence;
      this.b = param1Boolean;
      this.c = param1CharSequence.length();
    }
    
    public byte a() {
      // Byte code:
      //   0: aload_0
      //   1: getfield a : Ljava/lang/CharSequence;
      //   4: aload_0
      //   5: getfield d : I
      //   8: iconst_1
      //   9: isub
      //   10: invokeinterface charAt : (I)C
      //   15: istore_3
      //   16: aload_0
      //   17: iload_3
      //   18: putfield e : C
      //   21: iload_3
      //   22: invokestatic isLowSurrogate : (C)Z
      //   25: ifeq -> 61
      //   28: aload_0
      //   29: getfield a : Ljava/lang/CharSequence;
      //   32: aload_0
      //   33: getfield d : I
      //   36: invokestatic codePointBefore : (Ljava/lang/CharSequence;I)I
      //   39: istore #4
      //   41: aload_0
      //   42: aload_0
      //   43: getfield d : I
      //   46: iload #4
      //   48: invokestatic charCount : (I)I
      //   51: isub
      //   52: putfield d : I
      //   55: iload #4
      //   57: invokestatic getDirectionality : (I)B
      //   60: ireturn
      //   61: aload_0
      //   62: aload_0
      //   63: getfield d : I
      //   66: iconst_1
      //   67: isub
      //   68: putfield d : I
      //   71: aload_0
      //   72: getfield e : C
      //   75: istore_3
      //   76: iload_3
      //   77: sipush #1792
      //   80: if_icmpge -> 92
      //   83: getstatic b/i/k/a$a.f : [B
      //   86: iload_3
      //   87: baload
      //   88: istore_1
      //   89: goto -> 97
      //   92: iload_3
      //   93: invokestatic getDirectionality : (C)B
      //   96: istore_1
      //   97: iload_1
      //   98: istore_2
      //   99: aload_0
      //   100: getfield b : Z
      //   103: ifeq -> 356
      //   106: aload_0
      //   107: getfield e : C
      //   110: istore #4
      //   112: iload #4
      //   114: bipush #62
      //   116: if_icmpne -> 267
      //   119: aload_0
      //   120: getfield d : I
      //   123: istore #4
      //   125: aload_0
      //   126: getfield d : I
      //   129: istore #5
      //   131: iload #5
      //   133: ifle -> 252
      //   136: aload_0
      //   137: getfield a : Ljava/lang/CharSequence;
      //   140: astore #7
      //   142: iinc #5, -1
      //   145: aload_0
      //   146: iload #5
      //   148: putfield d : I
      //   151: aload #7
      //   153: iload #5
      //   155: invokeinterface charAt : (I)C
      //   160: istore_3
      //   161: aload_0
      //   162: iload_3
      //   163: putfield e : C
      //   166: iload_3
      //   167: bipush #60
      //   169: if_icmpne -> 175
      //   172: goto -> 329
      //   175: iload_3
      //   176: bipush #62
      //   178: if_icmpne -> 184
      //   181: goto -> 252
      //   184: iload_3
      //   185: bipush #34
      //   187: if_icmpeq -> 196
      //   190: iload_3
      //   191: bipush #39
      //   193: if_icmpne -> 125
      //   196: aload_0
      //   197: getfield e : C
      //   200: istore #5
      //   202: aload_0
      //   203: getfield d : I
      //   206: istore #6
      //   208: iload #6
      //   210: ifle -> 125
      //   213: aload_0
      //   214: getfield a : Ljava/lang/CharSequence;
      //   217: astore #7
      //   219: iinc #6, -1
      //   222: aload_0
      //   223: iload #6
      //   225: putfield d : I
      //   228: aload #7
      //   230: iload #6
      //   232: invokeinterface charAt : (I)C
      //   237: istore_3
      //   238: aload_0
      //   239: iload_3
      //   240: putfield e : C
      //   243: iload_3
      //   244: iload #5
      //   246: if_icmpeq -> 125
      //   249: goto -> 202
      //   252: aload_0
      //   253: iload #4
      //   255: putfield d : I
      //   258: aload_0
      //   259: bipush #62
      //   261: putfield e : C
      //   264: goto -> 353
      //   267: iload_1
      //   268: istore_2
      //   269: iload #4
      //   271: bipush #59
      //   273: if_icmpne -> 356
      //   276: aload_0
      //   277: getfield d : I
      //   280: istore #4
      //   282: aload_0
      //   283: getfield d : I
      //   286: istore #5
      //   288: iload #5
      //   290: ifle -> 341
      //   293: aload_0
      //   294: getfield a : Ljava/lang/CharSequence;
      //   297: astore #7
      //   299: iinc #5, -1
      //   302: aload_0
      //   303: iload #5
      //   305: putfield d : I
      //   308: aload #7
      //   310: iload #5
      //   312: invokeinterface charAt : (I)C
      //   317: istore_3
      //   318: aload_0
      //   319: iload_3
      //   320: putfield e : C
      //   323: iload_3
      //   324: bipush #38
      //   326: if_icmpne -> 335
      //   329: bipush #12
      //   331: istore_2
      //   332: goto -> 356
      //   335: iload_3
      //   336: bipush #59
      //   338: if_icmpne -> 282
      //   341: aload_0
      //   342: iload #4
      //   344: putfield d : I
      //   347: aload_0
      //   348: bipush #59
      //   350: putfield e : C
      //   353: bipush #13
      //   355: istore_2
      //   356: iload_2
      //   357: ireturn
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\k\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */