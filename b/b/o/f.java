package b.b.o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import b.b.o.i.i;
import b.b.o.i.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class f extends MenuInflater {
  public static final Class<?>[] e;
  
  public static final Class<?>[] f;
  
  public final Object[] a;
  
  public final Object[] b;
  
  public Context c;
  
  public Object d;
  
  static {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Context.class;
    e = arrayOfClass;
    f = arrayOfClass;
  }
  
  public f(Context paramContext) {
    super(paramContext);
    this.c = paramContext;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    this.a = arrayOfObject;
    this.b = arrayOfObject;
  }
  
  public final Object a(Object paramObject) {
    if (paramObject instanceof android.app.Activity)
      return paramObject; 
    Object object = paramObject;
    if (paramObject instanceof ContextWrapper)
      object = a(((ContextWrapper)paramObject).getBaseContext()); 
    return object;
  }
  
  public final void b(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu) {
    // Byte code:
    //   0: new b/b/o/f$b
    //   3: dup
    //   4: aload_0
    //   5: aload_3
    //   6: invokespecial <init> : (Lb/b/o/f;Landroid/view/Menu;)V
    //   9: astore #10
    //   11: aload_1
    //   12: invokeinterface getEventType : ()I
    //   17: istore #5
    //   19: iload #5
    //   21: iconst_2
    //   22: if_icmpne -> 66
    //   25: aload_1
    //   26: invokeinterface getName : ()Ljava/lang/String;
    //   31: astore_3
    //   32: aload_3
    //   33: ldc 'menu'
    //   35: invokevirtual equals : (Ljava/lang/Object;)Z
    //   38: ifeq -> 52
    //   41: aload_1
    //   42: invokeinterface next : ()I
    //   47: istore #5
    //   49: goto -> 80
    //   52: new java/lang/RuntimeException
    //   55: dup
    //   56: ldc 'Expecting menu, got '
    //   58: aload_3
    //   59: invokestatic c : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   62: invokespecial <init> : (Ljava/lang/String;)V
    //   65: athrow
    //   66: aload_1
    //   67: invokeinterface next : ()I
    //   72: istore #5
    //   74: iload #5
    //   76: iconst_1
    //   77: if_icmpne -> 1103
    //   80: iconst_0
    //   81: istore #6
    //   83: iconst_0
    //   84: istore #7
    //   86: aconst_null
    //   87: astore_3
    //   88: iload #5
    //   90: istore #8
    //   92: iload #6
    //   94: ifne -> 1102
    //   97: iload #8
    //   99: iconst_1
    //   100: if_icmpeq -> 1091
    //   103: iload #8
    //   105: iconst_2
    //   106: if_icmpeq -> 314
    //   109: iload #8
    //   111: iconst_3
    //   112: if_icmpeq -> 118
    //   115: goto -> 1035
    //   118: aload_1
    //   119: invokeinterface getName : ()Ljava/lang/String;
    //   124: astore #9
    //   126: iload #7
    //   128: ifeq -> 148
    //   131: aload #9
    //   133: aload_3
    //   134: invokevirtual equals : (Ljava/lang/Object;)Z
    //   137: ifeq -> 148
    //   140: aconst_null
    //   141: astore_3
    //   142: iconst_0
    //   143: istore #5
    //   145: goto -> 1076
    //   148: aload #9
    //   150: ldc 'group'
    //   152: invokevirtual equals : (Ljava/lang/Object;)Z
    //   155: ifeq -> 197
    //   158: aload #10
    //   160: iconst_0
    //   161: putfield b : I
    //   164: aload #10
    //   166: iconst_0
    //   167: putfield c : I
    //   170: aload #10
    //   172: iconst_0
    //   173: putfield d : I
    //   176: aload #10
    //   178: iconst_0
    //   179: putfield e : I
    //   182: aload #10
    //   184: iconst_1
    //   185: putfield f : Z
    //   188: aload #10
    //   190: iconst_1
    //   191: putfield g : Z
    //   194: goto -> 1035
    //   197: aload #9
    //   199: ldc 'item'
    //   201: invokevirtual equals : (Ljava/lang/Object;)Z
    //   204: ifeq -> 294
    //   207: aload #10
    //   209: getfield h : Z
    //   212: ifne -> 1035
    //   215: aload #10
    //   217: getfield A : Lb/i/m/b;
    //   220: astore #9
    //   222: aload #9
    //   224: ifnull -> 250
    //   227: aload #9
    //   229: checkcast b/b/o/i/j$a
    //   232: getfield b : Landroid/view/ActionProvider;
    //   235: invokevirtual hasSubMenu : ()Z
    //   238: ifeq -> 250
    //   241: aload #10
    //   243: invokevirtual a : ()Landroid/view/SubMenu;
    //   246: pop
    //   247: goto -> 1035
    //   250: aload #10
    //   252: iconst_1
    //   253: putfield h : Z
    //   256: aload #10
    //   258: aload #10
    //   260: getfield a : Landroid/view/Menu;
    //   263: aload #10
    //   265: getfield b : I
    //   268: aload #10
    //   270: getfield i : I
    //   273: aload #10
    //   275: getfield j : I
    //   278: aload #10
    //   280: getfield k : Ljava/lang/CharSequence;
    //   283: invokeinterface add : (IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
    //   288: invokevirtual c : (Landroid/view/MenuItem;)V
    //   291: goto -> 1035
    //   294: aload #9
    //   296: ldc 'menu'
    //   298: invokevirtual equals : (Ljava/lang/Object;)Z
    //   301: ifeq -> 1035
    //   304: iconst_1
    //   305: istore #6
    //   307: iload #7
    //   309: istore #5
    //   311: goto -> 1076
    //   314: iload #7
    //   316: ifeq -> 322
    //   319: goto -> 1035
    //   322: aload_1
    //   323: invokeinterface getName : ()Ljava/lang/String;
    //   328: astore #9
    //   330: aload #9
    //   332: ldc 'group'
    //   334: invokevirtual equals : (Ljava/lang/Object;)Z
    //   337: ifeq -> 449
    //   340: aload #10
    //   342: getfield F : Lb/b/o/f;
    //   345: getfield c : Landroid/content/Context;
    //   348: aload_2
    //   349: getstatic b/b/j.MenuGroup : [I
    //   352: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   355: astore #9
    //   357: aload #10
    //   359: aload #9
    //   361: getstatic b/b/j.MenuGroup_android_id : I
    //   364: iconst_0
    //   365: invokevirtual getResourceId : (II)I
    //   368: putfield b : I
    //   371: aload #10
    //   373: aload #9
    //   375: getstatic b/b/j.MenuGroup_android_menuCategory : I
    //   378: iconst_0
    //   379: invokevirtual getInt : (II)I
    //   382: putfield c : I
    //   385: aload #10
    //   387: aload #9
    //   389: getstatic b/b/j.MenuGroup_android_orderInCategory : I
    //   392: iconst_0
    //   393: invokevirtual getInt : (II)I
    //   396: putfield d : I
    //   399: aload #10
    //   401: aload #9
    //   403: getstatic b/b/j.MenuGroup_android_checkableBehavior : I
    //   406: iconst_0
    //   407: invokevirtual getInt : (II)I
    //   410: putfield e : I
    //   413: aload #10
    //   415: aload #9
    //   417: getstatic b/b/j.MenuGroup_android_visible : I
    //   420: iconst_1
    //   421: invokevirtual getBoolean : (IZ)Z
    //   424: putfield f : Z
    //   427: aload #10
    //   429: aload #9
    //   431: getstatic b/b/j.MenuGroup_android_enabled : I
    //   434: iconst_1
    //   435: invokevirtual getBoolean : (IZ)Z
    //   438: putfield g : Z
    //   441: aload #9
    //   443: invokevirtual recycle : ()V
    //   446: goto -> 1035
    //   449: aload #9
    //   451: ldc 'item'
    //   453: invokevirtual equals : (Ljava/lang/Object;)Z
    //   456: ifeq -> 1042
    //   459: aload #10
    //   461: getfield F : Lb/b/o/f;
    //   464: getfield c : Landroid/content/Context;
    //   467: aload_2
    //   468: getstatic b/b/j.MenuItem : [I
    //   471: invokestatic p : (Landroid/content/Context;Landroid/util/AttributeSet;[I)Lb/b/p/x0;
    //   474: astore #9
    //   476: aload #10
    //   478: aload #9
    //   480: getstatic b/b/j.MenuItem_android_id : I
    //   483: iconst_0
    //   484: invokevirtual l : (II)I
    //   487: putfield i : I
    //   490: aload #10
    //   492: aload #9
    //   494: getstatic b/b/j.MenuItem_android_menuCategory : I
    //   497: aload #10
    //   499: getfield c : I
    //   502: invokevirtual j : (II)I
    //   505: ldc -65536
    //   507: iand
    //   508: aload #9
    //   510: getstatic b/b/j.MenuItem_android_orderInCategory : I
    //   513: aload #10
    //   515: getfield d : I
    //   518: invokevirtual j : (II)I
    //   521: ldc 65535
    //   523: iand
    //   524: ior
    //   525: putfield j : I
    //   528: aload #10
    //   530: aload #9
    //   532: getstatic b/b/j.MenuItem_android_title : I
    //   535: invokevirtual n : (I)Ljava/lang/CharSequence;
    //   538: putfield k : Ljava/lang/CharSequence;
    //   541: aload #10
    //   543: aload #9
    //   545: getstatic b/b/j.MenuItem_android_titleCondensed : I
    //   548: invokevirtual n : (I)Ljava/lang/CharSequence;
    //   551: putfield l : Ljava/lang/CharSequence;
    //   554: aload #10
    //   556: aload #9
    //   558: getstatic b/b/j.MenuItem_android_icon : I
    //   561: iconst_0
    //   562: invokevirtual l : (II)I
    //   565: putfield m : I
    //   568: aload #9
    //   570: getstatic b/b/j.MenuItem_android_alphabeticShortcut : I
    //   573: invokevirtual m : (I)Ljava/lang/String;
    //   576: astore #11
    //   578: aload #11
    //   580: ifnonnull -> 589
    //   583: iconst_0
    //   584: istore #4
    //   586: goto -> 597
    //   589: aload #11
    //   591: iconst_0
    //   592: invokevirtual charAt : (I)C
    //   595: istore #4
    //   597: aload #10
    //   599: iload #4
    //   601: putfield n : C
    //   604: aload #10
    //   606: aload #9
    //   608: getstatic b/b/j.MenuItem_alphabeticModifiers : I
    //   611: sipush #4096
    //   614: invokevirtual j : (II)I
    //   617: putfield o : I
    //   620: aload #9
    //   622: getstatic b/b/j.MenuItem_android_numericShortcut : I
    //   625: invokevirtual m : (I)Ljava/lang/String;
    //   628: astore #11
    //   630: aload #11
    //   632: ifnonnull -> 641
    //   635: iconst_0
    //   636: istore #4
    //   638: goto -> 649
    //   641: aload #11
    //   643: iconst_0
    //   644: invokevirtual charAt : (I)C
    //   647: istore #4
    //   649: aload #10
    //   651: iload #4
    //   653: putfield p : C
    //   656: aload #10
    //   658: aload #9
    //   660: getstatic b/b/j.MenuItem_numericModifiers : I
    //   663: sipush #4096
    //   666: invokevirtual j : (II)I
    //   669: putfield q : I
    //   672: aload #9
    //   674: getstatic b/b/j.MenuItem_android_checkable : I
    //   677: invokevirtual o : (I)Z
    //   680: ifeq -> 697
    //   683: aload #9
    //   685: getstatic b/b/j.MenuItem_android_checkable : I
    //   688: iconst_0
    //   689: invokevirtual a : (IZ)Z
    //   692: istore #5
    //   694: goto -> 704
    //   697: aload #10
    //   699: getfield e : I
    //   702: istore #5
    //   704: aload #10
    //   706: iload #5
    //   708: putfield r : I
    //   711: aload #10
    //   713: aload #9
    //   715: getstatic b/b/j.MenuItem_android_checked : I
    //   718: iconst_0
    //   719: invokevirtual a : (IZ)Z
    //   722: putfield s : Z
    //   725: aload #10
    //   727: aload #9
    //   729: getstatic b/b/j.MenuItem_android_visible : I
    //   732: aload #10
    //   734: getfield f : Z
    //   737: invokevirtual a : (IZ)Z
    //   740: putfield t : Z
    //   743: aload #10
    //   745: aload #9
    //   747: getstatic b/b/j.MenuItem_android_enabled : I
    //   750: aload #10
    //   752: getfield g : Z
    //   755: invokevirtual a : (IZ)Z
    //   758: putfield u : Z
    //   761: aload #10
    //   763: aload #9
    //   765: getstatic b/b/j.MenuItem_showAsAction : I
    //   768: iconst_m1
    //   769: invokevirtual j : (II)I
    //   772: putfield v : I
    //   775: aload #10
    //   777: aload #9
    //   779: getstatic b/b/j.MenuItem_android_onClick : I
    //   782: invokevirtual m : (I)Ljava/lang/String;
    //   785: putfield z : Ljava/lang/String;
    //   788: aload #10
    //   790: aload #9
    //   792: getstatic b/b/j.MenuItem_actionLayout : I
    //   795: iconst_0
    //   796: invokevirtual l : (II)I
    //   799: putfield w : I
    //   802: aload #10
    //   804: aload #9
    //   806: getstatic b/b/j.MenuItem_actionViewClass : I
    //   809: invokevirtual m : (I)Ljava/lang/String;
    //   812: putfield x : Ljava/lang/String;
    //   815: aload #9
    //   817: getstatic b/b/j.MenuItem_actionProviderClass : I
    //   820: invokevirtual m : (I)Ljava/lang/String;
    //   823: astore #11
    //   825: aload #10
    //   827: aload #11
    //   829: putfield y : Ljava/lang/String;
    //   832: aload #11
    //   834: ifnull -> 843
    //   837: iconst_1
    //   838: istore #5
    //   840: goto -> 846
    //   843: iconst_0
    //   844: istore #5
    //   846: iload #5
    //   848: ifeq -> 899
    //   851: aload #10
    //   853: getfield w : I
    //   856: ifne -> 899
    //   859: aload #10
    //   861: getfield x : Ljava/lang/String;
    //   864: ifnonnull -> 899
    //   867: aload #10
    //   869: aload #10
    //   871: aload #10
    //   873: getfield y : Ljava/lang/String;
    //   876: getstatic b/b/o/f.f : [Ljava/lang/Class;
    //   879: aload #10
    //   881: getfield F : Lb/b/o/f;
    //   884: getfield b : [Ljava/lang/Object;
    //   887: invokevirtual b : (Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   890: checkcast b/i/m/b
    //   893: putfield A : Lb/i/m/b;
    //   896: goto -> 920
    //   899: iload #5
    //   901: ifeq -> 914
    //   904: ldc_w 'SupportMenuInflater'
    //   907: ldc_w 'Ignoring attribute 'actionProviderClass'. Action view already specified.'
    //   910: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   913: pop
    //   914: aload #10
    //   916: aconst_null
    //   917: putfield A : Lb/i/m/b;
    //   920: aload #10
    //   922: aload #9
    //   924: getstatic b/b/j.MenuItem_contentDescription : I
    //   927: invokevirtual n : (I)Ljava/lang/CharSequence;
    //   930: putfield B : Ljava/lang/CharSequence;
    //   933: aload #10
    //   935: aload #9
    //   937: getstatic b/b/j.MenuItem_tooltipText : I
    //   940: invokevirtual n : (I)Ljava/lang/CharSequence;
    //   943: putfield C : Ljava/lang/CharSequence;
    //   946: aload #9
    //   948: getstatic b/b/j.MenuItem_iconTintMode : I
    //   951: invokevirtual o : (I)Z
    //   954: ifeq -> 982
    //   957: aload #10
    //   959: aload #9
    //   961: getstatic b/b/j.MenuItem_iconTintMode : I
    //   964: iconst_m1
    //   965: invokevirtual j : (II)I
    //   968: aload #10
    //   970: getfield E : Landroid/graphics/PorterDuff$Mode;
    //   973: invokestatic c : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    //   976: putfield E : Landroid/graphics/PorterDuff$Mode;
    //   979: goto -> 988
    //   982: aload #10
    //   984: aconst_null
    //   985: putfield E : Landroid/graphics/PorterDuff$Mode;
    //   988: aload #9
    //   990: getstatic b/b/j.MenuItem_iconTint : I
    //   993: invokevirtual o : (I)Z
    //   996: ifeq -> 1015
    //   999: aload #10
    //   1001: aload #9
    //   1003: getstatic b/b/j.MenuItem_iconTint : I
    //   1006: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   1009: putfield D : Landroid/content/res/ColorStateList;
    //   1012: goto -> 1021
    //   1015: aload #10
    //   1017: aconst_null
    //   1018: putfield D : Landroid/content/res/ColorStateList;
    //   1021: aload #9
    //   1023: getfield b : Landroid/content/res/TypedArray;
    //   1026: invokevirtual recycle : ()V
    //   1029: aload #10
    //   1031: iconst_0
    //   1032: putfield h : Z
    //   1035: iload #7
    //   1037: istore #5
    //   1039: goto -> 1076
    //   1042: aload #9
    //   1044: ldc 'menu'
    //   1046: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1049: ifeq -> 1070
    //   1052: aload_0
    //   1053: aload_1
    //   1054: aload_2
    //   1055: aload #10
    //   1057: invokevirtual a : ()Landroid/view/SubMenu;
    //   1060: invokevirtual b : (Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    //   1063: iload #7
    //   1065: istore #5
    //   1067: goto -> 1076
    //   1070: iconst_1
    //   1071: istore #5
    //   1073: aload #9
    //   1075: astore_3
    //   1076: aload_1
    //   1077: invokeinterface next : ()I
    //   1082: istore #8
    //   1084: iload #5
    //   1086: istore #7
    //   1088: goto -> 92
    //   1091: new java/lang/RuntimeException
    //   1094: dup
    //   1095: ldc_w 'Unexpected end of document'
    //   1098: invokespecial <init> : (Ljava/lang/String;)V
    //   1101: athrow
    //   1102: return
    //   1103: goto -> 19
  }
  
  public void inflate(int paramInt, Menu paramMenu) {
    InflateException inflateException1;
    InflateException inflateException2;
    if (!(paramMenu instanceof b.i.h.a.a)) {
      super.inflate(paramInt, paramMenu);
      return;
    } 
    XmlResourceParser xmlResourceParser2 = null;
    XmlResourceParser xmlResourceParser3 = null;
    XmlResourceParser xmlResourceParser1 = null;
    try {
      XmlResourceParser xmlResourceParser = this.c.getResources().getLayout(paramInt);
      xmlResourceParser1 = xmlResourceParser;
      xmlResourceParser2 = xmlResourceParser;
      xmlResourceParser3 = xmlResourceParser;
      b((XmlPullParser)xmlResourceParser, Xml.asAttributeSet((XmlPullParser)xmlResourceParser), paramMenu);
      xmlResourceParser.close();
      return;
    } catch (XmlPullParserException xmlPullParserException) {
      xmlResourceParser1 = xmlResourceParser3;
      inflateException2 = new InflateException();
      xmlResourceParser1 = xmlResourceParser3;
      this("Error inflating menu XML", (Throwable)xmlPullParserException);
      xmlResourceParser1 = xmlResourceParser3;
      throw inflateException2;
    } catch (IOException iOException) {
      inflateException1 = inflateException2;
      InflateException inflateException = new InflateException();
      inflateException1 = inflateException2;
      this("Error inflating menu XML", iOException);
      inflateException1 = inflateException2;
      throw inflateException;
    } finally {}
    if (inflateException1 != null)
      inflateException1.close(); 
    throw paramMenu;
  }
  
  public static class a implements MenuItem.OnMenuItemClickListener {
    public static final Class<?>[] c = new Class[] { MenuItem.class };
    
    public Object a;
    
    public Method b;
    
    public a(Object param1Object, String param1String) {
      this.a = param1Object;
      Class<?> clazz = param1Object.getClass();
      try {
        this.b = clazz.getMethod(param1String, c);
        return;
      } catch (Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Couldn't resolve menu item onClick handler ");
        stringBuilder.append(param1String);
        stringBuilder.append(" in class ");
        stringBuilder.append(clazz.getName());
        InflateException inflateException = new InflateException(stringBuilder.toString());
        inflateException.initCause(exception);
        throw inflateException;
      } 
    }
    
    public boolean onMenuItemClick(MenuItem param1MenuItem) {
      try {
        if (this.b.getReturnType() == boolean.class)
          return ((Boolean)this.b.invoke(this.a, new Object[] { param1MenuItem })).booleanValue(); 
        this.b.invoke(this.a, new Object[] { param1MenuItem });
        return true;
      } catch (Exception exception) {
        throw new RuntimeException(exception);
      } 
    }
  }
  
  public class b {
    public b.i.m.b A;
    
    public CharSequence B;
    
    public CharSequence C;
    
    public ColorStateList D = null;
    
    public PorterDuff.Mode E = null;
    
    public final f F;
    
    public Menu a;
    
    public int b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    public boolean f;
    
    public boolean g;
    
    public boolean h;
    
    public int i;
    
    public int j;
    
    public CharSequence k;
    
    public CharSequence l;
    
    public int m;
    
    public char n;
    
    public int o;
    
    public char p;
    
    public int q;
    
    public int r;
    
    public boolean s;
    
    public boolean t;
    
    public boolean u;
    
    public int v;
    
    public int w;
    
    public String x;
    
    public String y;
    
    public String z;
    
    public b(f this$0, Menu param1Menu) {
      this.a = param1Menu;
      this.b = 0;
      this.c = 0;
      this.d = 0;
      this.e = 0;
      this.f = true;
      this.g = true;
    }
    
    public SubMenu a() {
      this.h = true;
      SubMenu subMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
      c(subMenu.getItem());
      return subMenu;
    }
    
    public final <T> T b(String param1String, Class<?>[] param1ArrayOfClass, Object[] param1ArrayOfObject) {
      try {
        null = Class.forName(param1String, false, this.F.c.getClassLoader()).getConstructor(param1ArrayOfClass);
        null.setAccessible(true);
        return (T)null.newInstance(param1ArrayOfObject);
      } catch (Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot instantiate class: ");
        stringBuilder.append(param1String);
        Log.w("SupportMenuInflater", stringBuilder.toString(), exception);
        return null;
      } 
    }
    
    public final void c(MenuItem param1MenuItem) {
      MenuItem menuItem = param1MenuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
      int j = this.r;
      int i = 0;
      if (j >= 1) {
        bool = true;
      } else {
        bool = false;
      } 
      menuItem.setCheckable(bool).setTitleCondensed(this.l).setIcon(this.m);
      j = this.v;
      if (j >= 0)
        param1MenuItem.setShowAsAction(j); 
      if (this.z != null)
        if (!this.F.c.isRestricted()) {
          f f1 = this.F;
          if (f1.d == null)
            f1.d = f1.a(f1.c); 
          param1MenuItem.setOnMenuItemClickListener(new f.a(f1.d, this.z));
        } else {
          throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
        }  
      if (this.r >= 2)
        if (param1MenuItem instanceof i) {
          i i1 = (i)param1MenuItem;
          i1.x = i1.x & 0xFFFFFFFB | 0x4;
        } else if (param1MenuItem instanceof j) {
          j j1 = (j)param1MenuItem;
          try {
            if (j1.e == null)
              j1.e = j1.d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] { boolean.class }); 
            j1.e.invoke(j1.d, new Object[] { Boolean.TRUE });
          } catch (Exception exception) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception);
          } 
        }  
      String str = this.x;
      if (str != null) {
        param1MenuItem.setActionView(b(str, f.e, this.F.a));
        i = 1;
      } 
      j = this.w;
      if (j > 0)
        if (!i) {
          param1MenuItem.setActionView(j);
        } else {
          Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
        }  
      b.i.m.b b1 = this.A;
      if (b1 != null)
        if (param1MenuItem instanceof b.i.h.a.b) {
          ((b.i.h.a.b)param1MenuItem).b(b1);
        } else {
          Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        }  
      CharSequence charSequence = this.B;
      boolean bool = param1MenuItem instanceof b.i.h.a.b;
      if (bool) {
        ((b.i.h.a.b)param1MenuItem).setContentDescription(charSequence);
      } else if (Build.VERSION.SDK_INT >= 26) {
        param1MenuItem.setContentDescription(charSequence);
      } 
      charSequence = this.C;
      if (bool) {
        ((b.i.h.a.b)param1MenuItem).setTooltipText(charSequence);
      } else if (Build.VERSION.SDK_INT >= 26) {
        param1MenuItem.setTooltipText(charSequence);
      } 
      char c = this.n;
      i = this.o;
      if (bool) {
        ((b.i.h.a.b)param1MenuItem).setAlphabeticShortcut(c, i);
      } else if (Build.VERSION.SDK_INT >= 26) {
        param1MenuItem.setAlphabeticShortcut(c, i);
      } 
      c = this.p;
      i = this.q;
      if (bool) {
        ((b.i.h.a.b)param1MenuItem).setNumericShortcut(c, i);
      } else if (Build.VERSION.SDK_INT >= 26) {
        param1MenuItem.setNumericShortcut(c, i);
      } 
      PorterDuff.Mode mode = this.E;
      if (mode != null)
        if (bool) {
          ((b.i.h.a.b)param1MenuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
          param1MenuItem.setIconTintMode(mode);
        }  
      ColorStateList colorStateList = this.D;
      if (colorStateList != null)
        if (bool) {
          ((b.i.h.a.b)param1MenuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
          param1MenuItem.setIconTintList(colorStateList);
        }  
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */