package c.c.a.b.u;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import c.c.a.a.c.l.q;
import java.util.Calendar;

public class p extends BaseAdapter {
  public static final int f = q.F().getMaximum(4);
  
  public final o b;
  
  public final d<?> c;
  
  public c d;
  
  public final a e;
  
  public p(o paramo, d<?> paramd, a parama) {
    this.b = paramo;
    this.c = paramd;
    this.e = parama;
  }
  
  public int a() {
    return this.b.f();
  }
  
  public Long b(int paramInt) {
    if (paramInt < this.b.f() || paramInt > c())
      return null; 
    o o1 = this.b;
    int i = o1.f();
    Calendar calendar = q.B(o1.b);
    calendar.set(5, paramInt - i + 1);
    return Long.valueOf(calendar.getTimeInMillis());
  }
  
  public int c() {
    return this.b.f() + this.b.g - 1;
  }
  
  public int getCount() {
    int i = this.b.g;
    return a() + i;
  }
  
  public long getItemId(int paramInt) {
    return (paramInt / this.b.f);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    // Byte code:
    //   0: aload_3
    //   1: invokevirtual getContext : ()Landroid/content/Context;
    //   4: astore #10
    //   6: aload_0
    //   7: getfield d : Lc/c/a/b/u/c;
    //   10: ifnonnull -> 26
    //   13: aload_0
    //   14: new c/c/a/b/u/c
    //   17: dup
    //   18: aload #10
    //   20: invokespecial <init> : (Landroid/content/Context;)V
    //   23: putfield d : Lc/c/a/b/u/c;
    //   26: aload_2
    //   27: checkcast android/widget/TextView
    //   30: astore #10
    //   32: aload_2
    //   33: ifnonnull -> 56
    //   36: aload_3
    //   37: invokevirtual getContext : ()Landroid/content/Context;
    //   40: invokestatic from : (Landroid/content/Context;)Landroid/view/LayoutInflater;
    //   43: getstatic c/c/a/b/h.mtrl_calendar_day : I
    //   46: aload_3
    //   47: iconst_0
    //   48: invokevirtual inflate : (ILandroid/view/ViewGroup;Z)Landroid/view/View;
    //   51: checkcast android/widget/TextView
    //   54: astore #10
    //   56: iload_1
    //   57: aload_0
    //   58: invokevirtual a : ()I
    //   61: isub
    //   62: istore #4
    //   64: iload #4
    //   66: iflt -> 388
    //   69: aload_0
    //   70: getfield b : Lc/c/a/b/u/o;
    //   73: astore_2
    //   74: iload #4
    //   76: aload_2
    //   77: getfield g : I
    //   80: if_icmplt -> 86
    //   83: goto -> 388
    //   86: iinc #4, 1
    //   89: aload #10
    //   91: aload_2
    //   92: invokevirtual setTag : (Ljava/lang/Object;)V
    //   95: aload #10
    //   97: iload #4
    //   99: invokestatic valueOf : (I)Ljava/lang/String;
    //   102: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   105: aload_0
    //   106: getfield b : Lc/c/a/b/u/o;
    //   109: getfield b : Ljava/util/Calendar;
    //   112: invokestatic B : (Ljava/util/Calendar;)Ljava/util/Calendar;
    //   115: astore_2
    //   116: aload_2
    //   117: iconst_5
    //   118: iload #4
    //   120: invokevirtual set : (II)V
    //   123: aload_2
    //   124: invokevirtual getTimeInMillis : ()J
    //   127: lstore #6
    //   129: aload_0
    //   130: getfield b : Lc/c/a/b/u/o;
    //   133: getfield e : I
    //   136: istore #5
    //   138: invokestatic E : ()Ljava/util/Calendar;
    //   141: astore_2
    //   142: aload_2
    //   143: iconst_5
    //   144: iconst_1
    //   145: invokevirtual set : (II)V
    //   148: aload_2
    //   149: invokestatic B : (Ljava/util/Calendar;)Ljava/util/Calendar;
    //   152: astore_2
    //   153: aload_2
    //   154: iconst_2
    //   155: invokevirtual get : (I)I
    //   158: pop
    //   159: aload_2
    //   160: iconst_1
    //   161: invokevirtual get : (I)I
    //   164: istore #4
    //   166: aload_2
    //   167: bipush #7
    //   169: invokevirtual getMaximum : (I)I
    //   172: pop
    //   173: aload_2
    //   174: iconst_5
    //   175: invokevirtual getActualMaximum : (I)I
    //   178: pop
    //   179: new java/text/SimpleDateFormat
    //   182: dup
    //   183: ldc 'MMMM, yyyy'
    //   185: invokestatic getDefault : ()Ljava/util/Locale;
    //   188: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
    //   191: astore_3
    //   192: aload_3
    //   193: invokestatic D : ()Ljava/util/TimeZone;
    //   196: invokevirtual setTimeZone : (Ljava/util/TimeZone;)V
    //   199: aload_3
    //   200: aload_2
    //   201: invokevirtual getTime : ()Ljava/util/Date;
    //   204: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   207: pop
    //   208: aload_2
    //   209: invokevirtual getTimeInMillis : ()J
    //   212: pop2
    //   213: iload #5
    //   215: iload #4
    //   217: if_icmpne -> 295
    //   220: invokestatic getDefault : ()Ljava/util/Locale;
    //   223: astore_2
    //   224: getstatic android/os/Build$VERSION.SDK_INT : I
    //   227: bipush #24
    //   229: if_icmplt -> 265
    //   232: ldc 'MMMEd'
    //   234: aload_2
    //   235: invokestatic getInstanceForSkeleton : (Ljava/lang/String;Ljava/util/Locale;)Landroid/icu/text/DateFormat;
    //   238: astore_2
    //   239: aload_2
    //   240: ldc 'UTC'
    //   242: invokestatic getTimeZone : (Ljava/lang/String;)Landroid/icu/util/TimeZone;
    //   245: invokevirtual setTimeZone : (Landroid/icu/util/TimeZone;)V
    //   248: aload_2
    //   249: new java/util/Date
    //   252: dup
    //   253: lload #6
    //   255: invokespecial <init> : (J)V
    //   258: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   261: astore_2
    //   262: goto -> 367
    //   265: iconst_0
    //   266: aload_2
    //   267: invokestatic getDateInstance : (ILjava/util/Locale;)Ljava/text/DateFormat;
    //   270: astore_2
    //   271: aload_2
    //   272: invokestatic D : ()Ljava/util/TimeZone;
    //   275: invokevirtual setTimeZone : (Ljava/util/TimeZone;)V
    //   278: aload_2
    //   279: new java/util/Date
    //   282: dup
    //   283: lload #6
    //   285: invokespecial <init> : (J)V
    //   288: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   291: astore_2
    //   292: goto -> 367
    //   295: invokestatic getDefault : ()Ljava/util/Locale;
    //   298: astore_2
    //   299: getstatic android/os/Build$VERSION.SDK_INT : I
    //   302: bipush #24
    //   304: if_icmplt -> 340
    //   307: ldc 'yMMMEd'
    //   309: aload_2
    //   310: invokestatic getInstanceForSkeleton : (Ljava/lang/String;Ljava/util/Locale;)Landroid/icu/text/DateFormat;
    //   313: astore_2
    //   314: aload_2
    //   315: ldc 'UTC'
    //   317: invokestatic getTimeZone : (Ljava/lang/String;)Landroid/icu/util/TimeZone;
    //   320: invokevirtual setTimeZone : (Landroid/icu/util/TimeZone;)V
    //   323: aload_2
    //   324: new java/util/Date
    //   327: dup
    //   328: lload #6
    //   330: invokespecial <init> : (J)V
    //   333: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   336: astore_2
    //   337: goto -> 367
    //   340: iconst_0
    //   341: aload_2
    //   342: invokestatic getDateInstance : (ILjava/util/Locale;)Ljava/text/DateFormat;
    //   345: astore_2
    //   346: aload_2
    //   347: invokestatic D : ()Ljava/util/TimeZone;
    //   350: invokevirtual setTimeZone : (Ljava/util/TimeZone;)V
    //   353: aload_2
    //   354: new java/util/Date
    //   357: dup
    //   358: lload #6
    //   360: invokespecial <init> : (J)V
    //   363: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   366: astore_2
    //   367: aload #10
    //   369: aload_2
    //   370: invokevirtual setContentDescription : (Ljava/lang/CharSequence;)V
    //   373: aload #10
    //   375: iconst_0
    //   376: invokevirtual setVisibility : (I)V
    //   379: aload #10
    //   381: iconst_1
    //   382: invokevirtual setEnabled : (Z)V
    //   385: goto -> 401
    //   388: aload #10
    //   390: bipush #8
    //   392: invokevirtual setVisibility : (I)V
    //   395: aload #10
    //   397: iconst_0
    //   398: invokevirtual setEnabled : (Z)V
    //   401: aload_0
    //   402: iload_1
    //   403: invokevirtual b : (I)Ljava/lang/Long;
    //   406: astore_2
    //   407: aload_2
    //   408: ifnonnull -> 414
    //   411: goto -> 598
    //   414: aload_0
    //   415: getfield e : Lc/c/a/b/u/a;
    //   418: getfield e : Lc/c/a/b/u/a$b;
    //   421: aload_2
    //   422: invokevirtual longValue : ()J
    //   425: invokeinterface g : (J)Z
    //   430: ifeq -> 578
    //   433: aload #10
    //   435: iconst_1
    //   436: invokevirtual setEnabled : (Z)V
    //   439: aload_0
    //   440: getfield c : Lc/c/a/b/u/d;
    //   443: invokeinterface e : ()Ljava/util/Collection;
    //   448: invokeinterface iterator : ()Ljava/util/Iterator;
    //   453: astore_3
    //   454: aload_3
    //   455: invokeinterface hasNext : ()Z
    //   460: ifeq -> 542
    //   463: aload_3
    //   464: invokeinterface next : ()Ljava/lang/Object;
    //   469: checkcast java/lang/Long
    //   472: invokevirtual longValue : ()J
    //   475: lstore #6
    //   477: aload_2
    //   478: invokevirtual longValue : ()J
    //   481: lstore #8
    //   483: invokestatic F : ()Ljava/util/Calendar;
    //   486: astore #11
    //   488: aload #11
    //   490: lload #8
    //   492: invokevirtual setTimeInMillis : (J)V
    //   495: aload #11
    //   497: invokestatic B : (Ljava/util/Calendar;)Ljava/util/Calendar;
    //   500: invokevirtual getTimeInMillis : ()J
    //   503: lstore #8
    //   505: invokestatic F : ()Ljava/util/Calendar;
    //   508: astore #11
    //   510: aload #11
    //   512: lload #6
    //   514: invokevirtual setTimeInMillis : (J)V
    //   517: lload #8
    //   519: aload #11
    //   521: invokestatic B : (Ljava/util/Calendar;)Ljava/util/Calendar;
    //   524: invokevirtual getTimeInMillis : ()J
    //   527: lcmp
    //   528: ifne -> 454
    //   531: aload_0
    //   532: getfield d : Lc/c/a/b/u/c;
    //   535: getfield b : Lc/c/a/b/u/b;
    //   538: astore_2
    //   539: goto -> 592
    //   542: invokestatic E : ()Ljava/util/Calendar;
    //   545: invokevirtual getTimeInMillis : ()J
    //   548: aload_2
    //   549: invokevirtual longValue : ()J
    //   552: lcmp
    //   553: ifne -> 567
    //   556: aload_0
    //   557: getfield d : Lc/c/a/b/u/c;
    //   560: getfield c : Lc/c/a/b/u/b;
    //   563: astore_2
    //   564: goto -> 592
    //   567: aload_0
    //   568: getfield d : Lc/c/a/b/u/c;
    //   571: getfield a : Lc/c/a/b/u/b;
    //   574: astore_2
    //   575: goto -> 592
    //   578: aload #10
    //   580: iconst_0
    //   581: invokevirtual setEnabled : (Z)V
    //   584: aload_0
    //   585: getfield d : Lc/c/a/b/u/c;
    //   588: getfield g : Lc/c/a/b/u/b;
    //   591: astore_2
    //   592: aload_2
    //   593: aload #10
    //   595: invokevirtual b : (Landroid/widget/TextView;)V
    //   598: aload #10
    //   600: areturn
  }
  
  public boolean hasStableIds() {
    return true;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\\\u\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */