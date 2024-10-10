package a.a.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.biometric.DeviceCredentialHandlerActivity;
import androidx.recyclerview.widget.RecyclerView;
import b.b.p.a1;
import b.b.p.e1;
import b.d.b;
import b.d.i;
import b.g.b.d;
import b.g.b.i.e;
import b.i.c;
import b.i.e.b.b;
import b.i.e.b.c;
import b.i.e.b.d;
import b.i.e.b.e;
import b.i.e.b.g;
import b.i.f.c;
import b.i.f.k.b;
import b.i.f.k.d;
import b.i.k.b;
import b.i.m.g;
import b.i.m.h;
import b.i.n.d;
import b.l.a.e;
import b.r.d.t;
import c.a.b.b;
import c.a.b.d;
import c.a.b.i;
import c.a.b.j;
import c.a.b.l;
import c.a.b.p;
import c.a.b.v;
import c.a.b.w.b;
import c.a.b.w.d;
import c.a.b.w.f;
import c.c.a.a.c.l.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class a {
  public static Field a;
  
  public static boolean b;
  
  public static Class<?> c;
  
  public static boolean d;
  
  public static Field e;
  
  public static boolean f;
  
  public static Field g;
  
  public static boolean h;
  
  public static Method i;
  
  public static boolean j;
  
  public static Method k;
  
  public static boolean l;
  
  public static Field m;
  
  public static boolean n;
  
  public static Method o;
  
  public static boolean p;
  
  public static Field q;
  
  public static boolean r;
  
  public static Drawable A(CompoundButton paramCompoundButton) {
    if (Build.VERSION.SDK_INT >= 23)
      return paramCompoundButton.getButtonDrawable(); 
    if (!n) {
      try {
        Field field1 = CompoundButton.class.getDeclaredField("mButtonDrawable");
        m = field1;
        field1.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {
        Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", noSuchFieldException);
      } 
      n = true;
    } 
    Field field = m;
    if (field != null)
      try {
        return (Drawable)field.get(paramCompoundButton);
      } catch (IllegalAccessException illegalAccessException) {
        Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", illegalAccessException);
        m = null;
      }  
    return null;
  }
  
  public static List<byte[]> A0(String[] paramArrayOfString) {
    ArrayList<byte[]> arrayList = new ArrayList();
    int i = paramArrayOfString.length;
    for (byte b = 0; b < i; b++)
      arrayList.add(Base64.decode(paramArrayOfString[b], 0)); 
    return (List<byte[]>)arrayList;
  }
  
  public static int B(Drawable paramDrawable) {
    if (Build.VERSION.SDK_INT >= 23)
      return paramDrawable.getLayoutDirection(); 
    if (!l) {
      try {
        Method method1 = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
        k = method1;
        method1.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", noSuchMethodException);
      } 
      l = true;
    } 
    Method method = k;
    if (method != null)
      try {
        return ((Integer)method.invoke(paramDrawable, new Object[0])).intValue();
      } catch (Exception exception) {
        Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", exception);
        k = null;
      }  
    return 0;
  }
  
  public static p B0(Object paramObject) {
    return new p(paramObject, null);
  }
  
  public static int C(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2) {
    return !N(paramXmlPullParser, paramString) ? paramInt2 : paramTypedArray.getColor(paramInt1, paramInt2);
  }
  
  public static Drawable C0(Drawable paramDrawable) {
    return (Drawable)((Build.VERSION.SDK_INT >= 23) ? paramDrawable : (!(paramDrawable instanceof b.i.f.k.a) ? new d(paramDrawable) : paramDrawable));
  }
  
  public static b.i.e.b.a D(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme, String paramString, int paramInt1, int paramInt2) {
    if (N(paramXmlPullParser, paramString)) {
      TypedValue typedValue = new TypedValue();
      paramTypedArray.getValue(paramInt1, typedValue);
      int i = typedValue.type;
      if (i >= 28 && i <= 31)
        return new b.i.e.b.a(null, null, typedValue.data); 
      Resources resources = paramTypedArray.getResources();
      paramInt1 = paramTypedArray.getResourceId(paramInt1, 0);
      try {
        b.i.e.b.a a1 = b.i.e.b.a.a(resources, paramInt1, paramTheme);
      } catch (Exception exception) {
        Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", exception);
        exception = null;
      } 
      if (exception != null)
        return (b.i.e.b.a)exception; 
    } 
    return new b.i.e.b.a(null, null, paramInt2);
  }
  
  public static ActionMode.Callback D0(TextView paramTextView, ActionMode.Callback paramCallback) {
    int i = Build.VERSION.SDK_INT;
    return (ActionMode.Callback)((i < 26 || i > 27 || paramCallback instanceof d) ? paramCallback : new d(paramCallback, paramTextView));
  }
  
  public static float E(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, float paramFloat) {
    return !N(paramXmlPullParser, paramString) ? paramFloat : paramTypedArray.getFloat(paramInt, paramFloat);
  }
  
  public static int F(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2) {
    return !N(paramXmlPullParser, paramString) ? paramInt2 : paramTypedArray.getInt(paramInt1, paramInt2);
  }
  
  public static String G(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt) {
    return !N(paramXmlPullParser, paramString) ? null : paramTypedArray.getString(paramInt);
  }
  
  public static PropertyValuesHolder H(TypedArray paramTypedArray, int paramInt1, int paramInt2, int paramInt3, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: invokevirtual peekValue : (I)Landroid/util/TypedValue;
    //   5: astore #12
    //   7: aload #12
    //   9: ifnull -> 18
    //   12: iconst_1
    //   13: istore #8
    //   15: goto -> 21
    //   18: iconst_0
    //   19: istore #8
    //   21: iload #8
    //   23: ifeq -> 36
    //   26: aload #12
    //   28: getfield type : I
    //   31: istore #10
    //   33: goto -> 39
    //   36: iconst_0
    //   37: istore #10
    //   39: aload_0
    //   40: iload_3
    //   41: invokevirtual peekValue : (I)Landroid/util/TypedValue;
    //   44: astore #12
    //   46: aload #12
    //   48: ifnull -> 57
    //   51: iconst_1
    //   52: istore #9
    //   54: goto -> 60
    //   57: iconst_0
    //   58: istore #9
    //   60: iload #9
    //   62: ifeq -> 75
    //   65: aload #12
    //   67: getfield type : I
    //   70: istore #11
    //   72: goto -> 78
    //   75: iconst_0
    //   76: istore #11
    //   78: iload_1
    //   79: istore #7
    //   81: iload_1
    //   82: iconst_4
    //   83: if_icmpne -> 121
    //   86: iload #8
    //   88: ifeq -> 99
    //   91: iload #10
    //   93: invokestatic P : (I)Z
    //   96: ifne -> 112
    //   99: iload #9
    //   101: ifeq -> 118
    //   104: iload #11
    //   106: invokestatic P : (I)Z
    //   109: ifeq -> 118
    //   112: iconst_3
    //   113: istore #7
    //   115: goto -> 121
    //   118: iconst_0
    //   119: istore #7
    //   121: iload #7
    //   123: ifne -> 131
    //   126: iconst_1
    //   127: istore_1
    //   128: goto -> 133
    //   131: iconst_0
    //   132: istore_1
    //   133: aconst_null
    //   134: astore #12
    //   136: aconst_null
    //   137: astore #14
    //   139: iload #7
    //   141: iconst_2
    //   142: if_icmpne -> 340
    //   145: aload_0
    //   146: iload_2
    //   147: invokevirtual getString : (I)Ljava/lang/String;
    //   150: astore #13
    //   152: aload_0
    //   153: iload_3
    //   154: invokevirtual getString : (I)Ljava/lang/String;
    //   157: astore #14
    //   159: aload #13
    //   161: invokestatic v : (Ljava/lang/String;)[Lb/i/f/c;
    //   164: astore #16
    //   166: aload #14
    //   168: invokestatic v : (Ljava/lang/String;)[Lb/i/f/c;
    //   171: astore #15
    //   173: aload #16
    //   175: ifnonnull -> 186
    //   178: aload #12
    //   180: astore_0
    //   181: aload #15
    //   183: ifnull -> 725
    //   186: aload #16
    //   188: ifnull -> 307
    //   191: new b/u/a/a/c
    //   194: dup
    //   195: invokespecial <init> : ()V
    //   198: astore_0
    //   199: aload #15
    //   201: ifnull -> 288
    //   204: aload #16
    //   206: aload #15
    //   208: invokestatic e : ([Lb/i/f/c;[Lb/i/f/c;)Z
    //   211: ifeq -> 238
    //   214: aload #4
    //   216: aload_0
    //   217: iconst_2
    //   218: anewarray java/lang/Object
    //   221: dup
    //   222: iconst_0
    //   223: aload #16
    //   225: aastore
    //   226: dup
    //   227: iconst_1
    //   228: aload #15
    //   230: aastore
    //   231: invokestatic ofObject : (Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;
    //   234: astore_0
    //   235: goto -> 304
    //   238: new java/lang/StringBuilder
    //   241: dup
    //   242: invokespecial <init> : ()V
    //   245: astore_0
    //   246: aload_0
    //   247: ldc_w ' Can't morph from '
    //   250: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: pop
    //   254: aload_0
    //   255: aload #13
    //   257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: pop
    //   261: aload_0
    //   262: ldc_w ' to '
    //   265: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: pop
    //   269: aload_0
    //   270: aload #14
    //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: pop
    //   276: new android/view/InflateException
    //   279: dup
    //   280: aload_0
    //   281: invokevirtual toString : ()Ljava/lang/String;
    //   284: invokespecial <init> : (Ljava/lang/String;)V
    //   287: athrow
    //   288: aload #4
    //   290: aload_0
    //   291: iconst_1
    //   292: anewarray java/lang/Object
    //   295: dup
    //   296: iconst_0
    //   297: aload #16
    //   299: aastore
    //   300: invokestatic ofObject : (Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;
    //   303: astore_0
    //   304: goto -> 725
    //   307: aload #12
    //   309: astore_0
    //   310: aload #15
    //   312: ifnull -> 725
    //   315: aload #4
    //   317: new b/u/a/a/c
    //   320: dup
    //   321: invokespecial <init> : ()V
    //   324: iconst_1
    //   325: anewarray java/lang/Object
    //   328: dup
    //   329: iconst_0
    //   330: aload #15
    //   332: aastore
    //   333: invokestatic ofObject : (Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;
    //   336: astore_0
    //   337: goto -> 725
    //   340: iload #7
    //   342: iconst_3
    //   343: if_icmpne -> 354
    //   346: getstatic b/u/a/a/d.a : Lb/u/a/a/d;
    //   349: astore #13
    //   351: goto -> 357
    //   354: aconst_null
    //   355: astore #13
    //   357: iload_1
    //   358: ifeq -> 502
    //   361: iload #8
    //   363: ifeq -> 460
    //   366: iload #10
    //   368: iconst_5
    //   369: if_icmpne -> 383
    //   372: aload_0
    //   373: iload_2
    //   374: fconst_0
    //   375: invokevirtual getDimension : (IF)F
    //   378: fstore #5
    //   380: goto -> 391
    //   383: aload_0
    //   384: iload_2
    //   385: fconst_0
    //   386: invokevirtual getFloat : (IF)F
    //   389: fstore #5
    //   391: iload #9
    //   393: ifeq -> 443
    //   396: iload #11
    //   398: iconst_5
    //   399: if_icmpne -> 413
    //   402: aload_0
    //   403: iload_3
    //   404: fconst_0
    //   405: invokevirtual getDimension : (IF)F
    //   408: fstore #6
    //   410: goto -> 421
    //   413: aload_0
    //   414: iload_3
    //   415: fconst_0
    //   416: invokevirtual getFloat : (IF)F
    //   419: fstore #6
    //   421: aload #4
    //   423: iconst_2
    //   424: newarray float
    //   426: dup
    //   427: iconst_0
    //   428: fload #5
    //   430: fastore
    //   431: dup
    //   432: iconst_1
    //   433: fload #6
    //   435: fastore
    //   436: invokestatic ofFloat : (Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;
    //   439: astore_0
    //   440: goto -> 696
    //   443: aload #4
    //   445: iconst_1
    //   446: newarray float
    //   448: dup
    //   449: iconst_0
    //   450: fload #5
    //   452: fastore
    //   453: invokestatic ofFloat : (Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;
    //   456: astore_0
    //   457: goto -> 696
    //   460: iload #11
    //   462: iconst_5
    //   463: if_icmpne -> 477
    //   466: aload_0
    //   467: iload_3
    //   468: fconst_0
    //   469: invokevirtual getDimension : (IF)F
    //   472: fstore #5
    //   474: goto -> 485
    //   477: aload_0
    //   478: iload_3
    //   479: fconst_0
    //   480: invokevirtual getFloat : (IF)F
    //   483: fstore #5
    //   485: aload #4
    //   487: iconst_1
    //   488: newarray float
    //   490: dup
    //   491: iconst_0
    //   492: fload #5
    //   494: fastore
    //   495: invokestatic ofFloat : (Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;
    //   498: astore_0
    //   499: goto -> 696
    //   502: iload #8
    //   504: ifeq -> 632
    //   507: iload #10
    //   509: iconst_5
    //   510: if_icmpne -> 524
    //   513: aload_0
    //   514: iload_2
    //   515: fconst_0
    //   516: invokevirtual getDimension : (IF)F
    //   519: f2i
    //   520: istore_1
    //   521: goto -> 549
    //   524: iload #10
    //   526: invokestatic P : (I)Z
    //   529: ifeq -> 542
    //   532: aload_0
    //   533: iload_2
    //   534: iconst_0
    //   535: invokevirtual getColor : (II)I
    //   538: istore_1
    //   539: goto -> 549
    //   542: aload_0
    //   543: iload_2
    //   544: iconst_0
    //   545: invokevirtual getInt : (II)I
    //   548: istore_1
    //   549: iload #9
    //   551: ifeq -> 616
    //   554: iload #11
    //   556: iconst_5
    //   557: if_icmpne -> 571
    //   560: aload_0
    //   561: iload_3
    //   562: fconst_0
    //   563: invokevirtual getDimension : (IF)F
    //   566: f2i
    //   567: istore_2
    //   568: goto -> 596
    //   571: iload #11
    //   573: invokestatic P : (I)Z
    //   576: ifeq -> 589
    //   579: aload_0
    //   580: iload_3
    //   581: iconst_0
    //   582: invokevirtual getColor : (II)I
    //   585: istore_2
    //   586: goto -> 596
    //   589: aload_0
    //   590: iload_3
    //   591: iconst_0
    //   592: invokevirtual getInt : (II)I
    //   595: istore_2
    //   596: aload #4
    //   598: iconst_2
    //   599: newarray int
    //   601: dup
    //   602: iconst_0
    //   603: iload_1
    //   604: iastore
    //   605: dup
    //   606: iconst_1
    //   607: iload_2
    //   608: iastore
    //   609: invokestatic ofInt : (Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;
    //   612: astore_0
    //   613: goto -> 696
    //   616: aload #4
    //   618: iconst_1
    //   619: newarray int
    //   621: dup
    //   622: iconst_0
    //   623: iload_1
    //   624: iastore
    //   625: invokestatic ofInt : (Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;
    //   628: astore_0
    //   629: goto -> 696
    //   632: aload #14
    //   634: astore #12
    //   636: iload #9
    //   638: ifeq -> 699
    //   641: iload #11
    //   643: iconst_5
    //   644: if_icmpne -> 658
    //   647: aload_0
    //   648: iload_3
    //   649: fconst_0
    //   650: invokevirtual getDimension : (IF)F
    //   653: f2i
    //   654: istore_1
    //   655: goto -> 683
    //   658: iload #11
    //   660: invokestatic P : (I)Z
    //   663: ifeq -> 676
    //   666: aload_0
    //   667: iload_3
    //   668: iconst_0
    //   669: invokevirtual getColor : (II)I
    //   672: istore_1
    //   673: goto -> 683
    //   676: aload_0
    //   677: iload_3
    //   678: iconst_0
    //   679: invokevirtual getInt : (II)I
    //   682: istore_1
    //   683: aload #4
    //   685: iconst_1
    //   686: newarray int
    //   688: dup
    //   689: iconst_0
    //   690: iload_1
    //   691: iastore
    //   692: invokestatic ofInt : (Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;
    //   695: astore_0
    //   696: aload_0
    //   697: astore #12
    //   699: aload #12
    //   701: astore_0
    //   702: aload #12
    //   704: ifnull -> 725
    //   707: aload #12
    //   709: astore_0
    //   710: aload #13
    //   712: ifnull -> 725
    //   715: aload #12
    //   717: aload #13
    //   719: invokevirtual setEvaluator : (Landroid/animation/TypeEvaluator;)V
    //   722: aload #12
    //   724: astore_0
    //   725: aload_0
    //   726: areturn
  }
  
  public static Intent I(Activity paramActivity) {
    Intent intent = paramActivity.getParentActivityIntent();
    if (intent != null)
      return intent; 
    try {
      String str = K((Context)paramActivity, paramActivity.getComponentName());
      if (str == null)
        return null; 
      ComponentName componentName = new ComponentName((Context)paramActivity, str);
      try {
        Intent intent1;
        if (K((Context)paramActivity, componentName) == null) {
          intent1 = Intent.makeMainActivity(componentName);
        } else {
          intent1 = new Intent();
          this();
          intent1 = intent1.setComponent(componentName);
        } 
        return intent1;
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("getParentActivityIntent: bad parentActivityName '");
        stringBuilder.append(str);
        stringBuilder.append("' in manifest");
        Log.e("NavUtils", stringBuilder.toString());
        return null;
      } 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      throw new IllegalArgumentException(nameNotFoundException);
    } 
  }
  
  public static Intent J(Context paramContext, ComponentName paramComponentName) {
    Intent intent;
    String str = K(paramContext, paramComponentName);
    if (str == null)
      return null; 
    paramComponentName = new ComponentName(paramComponentName.getPackageName(), str);
    if (K(paramContext, paramComponentName) == null) {
      intent = Intent.makeMainActivity(paramComponentName);
    } else {
      intent = (new Intent()).setComponent(paramComponentName);
    } 
    return intent;
  }
  
  public static String K(Context paramContext, ComponentName paramComponentName) {
    PackageManager packageManager = paramContext.getPackageManager();
    int i = Build.VERSION.SDK_INT;
    i = 640;
    int j = Build.VERSION.SDK_INT;
    if (j >= 29) {
      i = 269222528;
    } else if (j >= 24) {
      i = 787072;
    } 
    ActivityInfo activityInfo = packageManager.getActivityInfo(paramComponentName, i);
    String str2 = activityInfo.parentActivityName;
    if (str2 != null)
      return str2; 
    Bundle bundle = activityInfo.metaData;
    if (bundle == null)
      return null; 
    str2 = bundle.getString("android.support.PARENT_ACTIVITY");
    if (str2 == null)
      return null; 
    String str1 = str2;
    if (str2.charAt(0) == '.') {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramContext.getPackageName());
      stringBuilder.append(str2);
      str1 = stringBuilder.toString();
    } 
    return str1;
  }
  
  public static File L(Context paramContext) {
    File file = paramContext.getCacheDir();
    if (file == null)
      return null; 
    StringBuilder stringBuilder = c.a.a.a.a.e(".font");
    stringBuilder.append(Process.myPid());
    stringBuilder.append("-");
    stringBuilder.append(Process.myTid());
    stringBuilder.append("-");
    String str = stringBuilder.toString();
    byte b = 0;
    while (true) {
      if (b < 100) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str);
        stringBuilder1.append(b);
        File file1 = new File(file, stringBuilder1.toString());
        try {
          boolean bool = file1.createNewFile();
          if (bool)
            return file1; 
        } catch (IOException iOException) {}
        b++;
        continue;
      } 
      return null;
    } 
  }
  
  public static b.a M(TextView paramTextView) {
    int j;
    if (Build.VERSION.SDK_INT >= 28)
      return new b.a(paramTextView.getTextMetricsParams()); 
    TextPaint textPaint = new TextPaint((Paint)paramTextView.getPaint());
    int i = Build.VERSION.SDK_INT;
    byte b = 0;
    if (i >= 23) {
      j = 1;
      i = 1;
    } else {
      j = 0;
      i = 0;
    } 
    TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    if (Build.VERSION.SDK_INT >= 23) {
      j = paramTextView.getBreakStrategy();
      i = paramTextView.getHyphenationFrequency();
    } 
    if (paramTextView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod);
    if (Build.VERSION.SDK_INT >= 28 && (paramTextView.getInputType() & 0xF) == 3) {
      b = Character.getDirectionality(DecimalFormatSymbols.getInstance(paramTextView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
      if (b == 1 || b == 2);
    } 
    if (paramTextView.getLayoutDirection() == 1)
      b = 1; 
    switch (paramTextView.getTextDirection()) {
      case 3:
        textDirectionHeuristic1 = TextDirectionHeuristics.LTR;
        return new b.a(textPaint, textDirectionHeuristic1, j, i);
      default:
        if (b != 0);
        break;
      case 7:
        textDirectionHeuristic1 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        return new b.a(textPaint, textDirectionHeuristic1, j, i);
      case 5:
        textDirectionHeuristic1 = TextDirectionHeuristics.LOCALE;
        return new b.a(textPaint, textDirectionHeuristic1, j, i);
      case 4:
        textDirectionHeuristic1 = TextDirectionHeuristics.RTL;
        return new b.a(textPaint, textDirectionHeuristic1, j, i);
      case 2:
        textDirectionHeuristic1 = TextDirectionHeuristics.ANYRTL_LTR;
        return new b.a(textPaint, textDirectionHeuristic1, j, i);
      case 6:
        break;
    } 
    TextDirectionHeuristic textDirectionHeuristic1 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    return new b.a(textPaint, textDirectionHeuristic1, j, i);
  }
  
  public static boolean N(XmlPullParser paramXmlPullParser, String paramString) {
    boolean bool;
    if (paramXmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", paramString) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean O(Rect paramRect1, Rect paramRect2, int paramInt) {
    boolean bool3 = true;
    boolean bool1 = true;
    boolean bool4 = true;
    boolean bool2 = true;
    if (paramInt != 17) {
      if (paramInt != 33) {
        if (paramInt != 66) {
          if (paramInt == 130) {
            paramInt = paramRect1.top;
            int m = paramRect2.top;
            if ((paramInt < m || paramRect1.bottom <= m) && paramRect1.bottom < paramRect2.bottom) {
              bool1 = bool2;
            } else {
              bool1 = false;
            } 
            return bool1;
          } 
          throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } 
        paramInt = paramRect1.left;
        int k = paramRect2.left;
        if ((paramInt < k || paramRect1.right <= k) && paramRect1.right < paramRect2.right) {
          bool1 = bool3;
        } else {
          bool1 = false;
        } 
        return bool1;
      } 
      int j = paramRect1.bottom;
      paramInt = paramRect2.bottom;
      if ((j <= paramInt && paramRect1.top < paramInt) || paramRect1.top <= paramRect2.top)
        bool1 = false; 
      return bool1;
    } 
    int i = paramRect1.right;
    paramInt = paramRect2.right;
    if ((i > paramInt || paramRect1.left >= paramInt) && paramRect1.left > paramRect2.left) {
      bool1 = bool4;
    } else {
      bool1 = false;
    } 
    return bool1;
  }
  
  public static boolean P(int paramInt) {
    boolean bool;
    if (paramInt >= 28 && paramInt <= 31) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean Q() {
    boolean bool;
    b b = b.j;
    if (b != null && b.g) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean R() {
    // Byte code:
    //   0: getstatic android/os/Build.TAGS : Ljava/lang/String;
    //   3: astore_3
    //   4: iconst_1
    //   5: istore_2
    //   6: aload_3
    //   7: ifnull -> 25
    //   10: aload_3
    //   11: ldc_w 'test-keys'
    //   14: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   17: ifeq -> 25
    //   20: iconst_1
    //   21: istore_0
    //   22: goto -> 27
    //   25: iconst_0
    //   26: istore_0
    //   27: iload_2
    //   28: istore_1
    //   29: iload_0
    //   30: ifne -> 257
    //   33: iconst_0
    //   34: istore_0
    //   35: iload_0
    //   36: bipush #10
    //   38: if_icmpge -> 136
    //   41: new java/io/File
    //   44: dup
    //   45: bipush #10
    //   47: anewarray java/lang/String
    //   50: dup
    //   51: iconst_0
    //   52: ldc_w '/system/app/Superuser.apk'
    //   55: aastore
    //   56: dup
    //   57: iconst_1
    //   58: ldc_w '/sbin/su'
    //   61: aastore
    //   62: dup
    //   63: iconst_2
    //   64: ldc_w '/system/bin/su'
    //   67: aastore
    //   68: dup
    //   69: iconst_3
    //   70: ldc_w '/system/xbin/su'
    //   73: aastore
    //   74: dup
    //   75: iconst_4
    //   76: ldc_w '/data/local/xbin/su'
    //   79: aastore
    //   80: dup
    //   81: iconst_5
    //   82: ldc_w '/data/local/bin/su'
    //   85: aastore
    //   86: dup
    //   87: bipush #6
    //   89: ldc_w '/system/sd/xbin/su'
    //   92: aastore
    //   93: dup
    //   94: bipush #7
    //   96: ldc_w '/system/bin/failsafe/su'
    //   99: aastore
    //   100: dup
    //   101: bipush #8
    //   103: ldc_w '/data/local/su'
    //   106: aastore
    //   107: dup
    //   108: bipush #9
    //   110: ldc_w '/su/bin/su'
    //   113: aastore
    //   114: iload_0
    //   115: aaload
    //   116: invokespecial <init> : (Ljava/lang/String;)V
    //   119: invokevirtual exists : ()Z
    //   122: ifeq -> 130
    //   125: iconst_1
    //   126: istore_0
    //   127: goto -> 138
    //   130: iinc #0, 1
    //   133: goto -> 35
    //   136: iconst_0
    //   137: istore_0
    //   138: iload_2
    //   139: istore_1
    //   140: iload_0
    //   141: ifne -> 257
    //   144: aconst_null
    //   145: astore_3
    //   146: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   149: iconst_2
    //   150: anewarray java/lang/String
    //   153: dup
    //   154: iconst_0
    //   155: ldc_w '/system/xbin/which'
    //   158: aastore
    //   159: dup
    //   160: iconst_1
    //   161: ldc_w 'su'
    //   164: aastore
    //   165: invokevirtual exec : ([Ljava/lang/String;)Ljava/lang/Process;
    //   168: astore #4
    //   170: aload #4
    //   172: astore_3
    //   173: new java/io/BufferedReader
    //   176: astore #5
    //   178: aload #4
    //   180: astore_3
    //   181: new java/io/InputStreamReader
    //   184: astore #6
    //   186: aload #4
    //   188: astore_3
    //   189: aload #6
    //   191: aload #4
    //   193: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   196: invokespecial <init> : (Ljava/io/InputStream;)V
    //   199: aload #4
    //   201: astore_3
    //   202: aload #5
    //   204: aload #6
    //   206: invokespecial <init> : (Ljava/io/Reader;)V
    //   209: aload #4
    //   211: astore_3
    //   212: aload #5
    //   214: invokevirtual readLine : ()Ljava/lang/String;
    //   217: astore #5
    //   219: aload #4
    //   221: invokevirtual destroy : ()V
    //   224: aload #5
    //   226: ifnull -> 244
    //   229: iconst_1
    //   230: istore_0
    //   231: goto -> 246
    //   234: astore #4
    //   236: aload_3
    //   237: ifnull -> 244
    //   240: aload_3
    //   241: invokevirtual destroy : ()V
    //   244: iconst_0
    //   245: istore_0
    //   246: iload_0
    //   247: ifeq -> 255
    //   250: iload_2
    //   251: istore_1
    //   252: goto -> 257
    //   255: iconst_0
    //   256: istore_1
    //   257: iload_1
    //   258: ireturn
    // Exception table:
    //   from	to	target	type
    //   146	170	234	finally
    //   173	178	234	finally
    //   181	186	234	finally
    //   189	199	234	finally
    //   202	209	234	finally
    //   212	219	234	finally
  }
  
  public static boolean S(Context paramContext, String paramString, int paramInt) {
    if (paramString == null)
      return false; 
    String[] arrayOfString = paramContext.getResources().getStringArray(paramInt);
    int i = arrayOfString.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      if (paramString.startsWith(arrayOfString[paramInt]))
        return true; 
    } 
    return false;
  }
  
  public static void T(String paramString, e parame, Bundle paramBundle, Runnable paramRunnable) {
    Object object2;
    if (!(parame instanceof DeviceCredentialHandlerActivity)) {
      Log.e(paramString, "Failed to check device credential. Parent handler not found.");
      return;
    } 
    DeviceCredentialHandlerActivity deviceCredentialHandlerActivity = (DeviceCredentialHandlerActivity)parame;
    if (Build.VERSION.SDK_INT >= 23) {
      object1 = deviceCredentialHandlerActivity.getSystemService(KeyguardManager.class);
    } else {
      Object object = deviceCredentialHandlerActivity.getSystemService("keyguard");
      object1 = object;
      if (!(object instanceof KeyguardManager)) {
        Log.e(paramString, "Failed to check device credential. KeyguardManager not found.");
        deviceCredentialHandlerActivity.u(0);
        return;
      } 
    } 
    KeyguardManager keyguardManager = (KeyguardManager)object1;
    if (keyguardManager == null) {
      Log.e(paramString, "Failed to check device credential. KeyguardManager was null.");
      deviceCredentialHandlerActivity.u(0);
      return;
    } 
    CharSequence charSequence = null;
    if (paramBundle != null) {
      object1 = paramBundle.getCharSequence("title");
      charSequence = paramBundle.getCharSequence("subtitle");
      object2 = object1;
      object1 = charSequence;
    } else {
      object1 = null;
      object2 = charSequence;
    } 
    Object object1 = keyguardManager.createConfirmDeviceCredentialIntent((CharSequence)object2, (CharSequence)object1);
    if (object1 == null) {
      Log.e(paramString, "Failed to check device credential. Got null intent from Keyguard.");
      deviceCredentialHandlerActivity.u(0);
      return;
    } 
    b b = b.a();
    b.g = true;
    b.i = 2;
    if (paramRunnable != null)
      paramRunnable.run(); 
    object1.setFlags(134742016);
    deviceCredentialHandlerActivity.startActivityForResult((Intent)object1, 0);
  }
  
  public static ValueAnimator U(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, ValueAnimator paramValueAnimator, float paramFloat, XmlPullParser paramXmlPullParser) {
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: aload_3
    //   3: getstatic b/u/a/a/a.g : [I
    //   6: invokestatic a0 : (Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   9: astore #18
    //   11: aload_1
    //   12: aload_2
    //   13: aload_3
    //   14: getstatic b/u/a/a/a.k : [I
    //   17: invokestatic a0 : (Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   20: astore #19
    //   22: aload #4
    //   24: ifnonnull -> 38
    //   27: new android/animation/ValueAnimator
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: astore_1
    //   35: goto -> 41
    //   38: aload #4
    //   40: astore_1
    //   41: aload #18
    //   43: aload #6
    //   45: ldc_w 'duration'
    //   48: iconst_1
    //   49: sipush #300
    //   52: invokestatic F : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
    //   55: i2l
    //   56: lstore #14
    //   58: iconst_0
    //   59: istore #13
    //   61: aload #18
    //   63: aload #6
    //   65: ldc_w 'startOffset'
    //   68: iconst_2
    //   69: iconst_0
    //   70: invokestatic F : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
    //   73: i2l
    //   74: lstore #16
    //   76: aload #18
    //   78: aload #6
    //   80: ldc_w 'valueType'
    //   83: bipush #7
    //   85: iconst_4
    //   86: invokestatic F : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
    //   89: istore #10
    //   91: aload #6
    //   93: ldc_w 'valueFrom'
    //   96: invokestatic N : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
    //   99: ifeq -> 263
    //   102: aload #6
    //   104: ldc_w 'valueTo'
    //   107: invokestatic N : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
    //   110: ifeq -> 263
    //   113: iload #10
    //   115: istore #9
    //   117: iload #10
    //   119: iconst_4
    //   120: if_icmpne -> 233
    //   123: aload #18
    //   125: iconst_5
    //   126: invokevirtual peekValue : (I)Landroid/util/TypedValue;
    //   129: astore_2
    //   130: aload_2
    //   131: ifnull -> 140
    //   134: iconst_1
    //   135: istore #9
    //   137: goto -> 143
    //   140: iconst_0
    //   141: istore #9
    //   143: iload #9
    //   145: ifeq -> 157
    //   148: aload_2
    //   149: getfield type : I
    //   152: istore #10
    //   154: goto -> 160
    //   157: iconst_0
    //   158: istore #10
    //   160: aload #18
    //   162: bipush #6
    //   164: invokevirtual peekValue : (I)Landroid/util/TypedValue;
    //   167: astore_2
    //   168: aload_2
    //   169: ifnull -> 178
    //   172: iconst_1
    //   173: istore #11
    //   175: goto -> 181
    //   178: iconst_0
    //   179: istore #11
    //   181: iload #11
    //   183: ifeq -> 195
    //   186: aload_2
    //   187: getfield type : I
    //   190: istore #12
    //   192: goto -> 198
    //   195: iconst_0
    //   196: istore #12
    //   198: iload #9
    //   200: ifeq -> 211
    //   203: iload #10
    //   205: invokestatic P : (I)Z
    //   208: ifne -> 224
    //   211: iload #11
    //   213: ifeq -> 230
    //   216: iload #12
    //   218: invokestatic P : (I)Z
    //   221: ifeq -> 230
    //   224: iconst_3
    //   225: istore #9
    //   227: goto -> 233
    //   230: iconst_0
    //   231: istore #9
    //   233: aload #18
    //   235: iload #9
    //   237: iconst_5
    //   238: bipush #6
    //   240: ldc_w ''
    //   243: invokestatic H : (Landroid/content/res/TypedArray;IIILjava/lang/String;)Landroid/animation/PropertyValuesHolder;
    //   246: astore_2
    //   247: aload_2
    //   248: ifnull -> 263
    //   251: aload_1
    //   252: iconst_1
    //   253: anewarray android/animation/PropertyValuesHolder
    //   256: dup
    //   257: iconst_0
    //   258: aload_2
    //   259: aastore
    //   260: invokevirtual setValues : ([Landroid/animation/PropertyValuesHolder;)V
    //   263: aload_1
    //   264: lload #14
    //   266: invokevirtual setDuration : (J)Landroid/animation/ValueAnimator;
    //   269: pop
    //   270: aload_1
    //   271: lload #16
    //   273: invokevirtual setStartDelay : (J)V
    //   276: aload_1
    //   277: aload #18
    //   279: aload #6
    //   281: ldc_w 'repeatCount'
    //   284: iconst_3
    //   285: iconst_0
    //   286: invokestatic F : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
    //   289: invokevirtual setRepeatCount : (I)V
    //   292: aload_1
    //   293: aload #18
    //   295: aload #6
    //   297: ldc_w 'repeatMode'
    //   300: iconst_4
    //   301: iconst_1
    //   302: invokestatic F : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
    //   305: invokevirtual setRepeatMode : (I)V
    //   308: aload #19
    //   310: ifnull -> 778
    //   313: aload_1
    //   314: checkcast android/animation/ObjectAnimator
    //   317: astore #4
    //   319: aload #19
    //   321: aload #6
    //   323: ldc_w 'pathData'
    //   326: iconst_1
    //   327: invokestatic G : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;
    //   330: astore_3
    //   331: aload_3
    //   332: ifnull -> 759
    //   335: aload #19
    //   337: aload #6
    //   339: ldc_w 'propertyXName'
    //   342: iconst_2
    //   343: invokestatic G : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;
    //   346: astore_2
    //   347: aload #19
    //   349: aload #6
    //   351: ldc_w 'propertyYName'
    //   354: iconst_3
    //   355: invokestatic G : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;
    //   358: astore #20
    //   360: aload_2
    //   361: ifnonnull -> 410
    //   364: aload #20
    //   366: ifnull -> 372
    //   369: goto -> 410
    //   372: new java/lang/StringBuilder
    //   375: dup
    //   376: invokespecial <init> : ()V
    //   379: astore_0
    //   380: aload_0
    //   381: aload #19
    //   383: invokevirtual getPositionDescription : ()Ljava/lang/String;
    //   386: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   389: pop
    //   390: aload_0
    //   391: ldc_w ' propertyXName or propertyYName is needed for PathData'
    //   394: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: pop
    //   398: new android/view/InflateException
    //   401: dup
    //   402: aload_0
    //   403: invokevirtual toString : ()Ljava/lang/String;
    //   406: invokespecial <init> : (Ljava/lang/String;)V
    //   409: athrow
    //   410: aload_3
    //   411: invokestatic w : (Ljava/lang/String;)Landroid/graphics/Path;
    //   414: astore #21
    //   416: new android/graphics/PathMeasure
    //   419: dup
    //   420: aload #21
    //   422: iconst_0
    //   423: invokespecial <init> : (Landroid/graphics/Path;Z)V
    //   426: astore_3
    //   427: new java/util/ArrayList
    //   430: dup
    //   431: invokespecial <init> : ()V
    //   434: astore #22
    //   436: aload #22
    //   438: fconst_0
    //   439: invokestatic valueOf : (F)Ljava/lang/Float;
    //   442: invokevirtual add : (Ljava/lang/Object;)Z
    //   445: pop
    //   446: fconst_0
    //   447: fstore #7
    //   449: fload #7
    //   451: aload_3
    //   452: invokevirtual getLength : ()F
    //   455: fadd
    //   456: fstore #8
    //   458: aload #22
    //   460: fload #8
    //   462: invokestatic valueOf : (F)Ljava/lang/Float;
    //   465: invokevirtual add : (Ljava/lang/Object;)Z
    //   468: pop
    //   469: fload #8
    //   471: fstore #7
    //   473: aload_3
    //   474: invokevirtual nextContour : ()Z
    //   477: ifne -> 449
    //   480: new android/graphics/PathMeasure
    //   483: dup
    //   484: aload #21
    //   486: iconst_0
    //   487: invokespecial <init> : (Landroid/graphics/Path;Z)V
    //   490: astore #24
    //   492: bipush #100
    //   494: fload #8
    //   496: ldc_w 0.5
    //   499: fload #5
    //   501: fmul
    //   502: fdiv
    //   503: f2i
    //   504: iconst_1
    //   505: iadd
    //   506: invokestatic min : (II)I
    //   509: istore #9
    //   511: iload #9
    //   513: newarray float
    //   515: astore #25
    //   517: iload #9
    //   519: newarray float
    //   521: astore #21
    //   523: iconst_2
    //   524: newarray float
    //   526: astore #23
    //   528: fload #8
    //   530: iload #9
    //   532: iconst_1
    //   533: isub
    //   534: i2f
    //   535: fdiv
    //   536: fstore #7
    //   538: iconst_0
    //   539: istore #12
    //   541: fconst_0
    //   542: fstore #5
    //   544: iload #13
    //   546: istore #10
    //   548: aconst_null
    //   549: astore_3
    //   550: iload #10
    //   552: iload #9
    //   554: if_icmpge -> 670
    //   557: aload #24
    //   559: fload #5
    //   561: aload #22
    //   563: iload #12
    //   565: invokevirtual get : (I)Ljava/lang/Object;
    //   568: checkcast java/lang/Float
    //   571: invokevirtual floatValue : ()F
    //   574: fsub
    //   575: aload #23
    //   577: aconst_null
    //   578: invokevirtual getPosTan : (F[F[F)Z
    //   581: pop
    //   582: aload #25
    //   584: iload #10
    //   586: aload #23
    //   588: iconst_0
    //   589: faload
    //   590: fastore
    //   591: aload #21
    //   593: iload #10
    //   595: aload #23
    //   597: iconst_1
    //   598: faload
    //   599: fastore
    //   600: fload #5
    //   602: fload #7
    //   604: fadd
    //   605: fstore #5
    //   607: iload #12
    //   609: iconst_1
    //   610: iadd
    //   611: istore #13
    //   613: iload #12
    //   615: istore #11
    //   617: iload #13
    //   619: aload #22
    //   621: invokevirtual size : ()I
    //   624: if_icmpge -> 660
    //   627: iload #12
    //   629: istore #11
    //   631: fload #5
    //   633: aload #22
    //   635: iload #13
    //   637: invokevirtual get : (I)Ljava/lang/Object;
    //   640: checkcast java/lang/Float
    //   643: invokevirtual floatValue : ()F
    //   646: fcmpl
    //   647: ifle -> 660
    //   650: aload #24
    //   652: invokevirtual nextContour : ()Z
    //   655: pop
    //   656: iload #13
    //   658: istore #11
    //   660: iinc #10, 1
    //   663: iload #11
    //   665: istore #12
    //   667: goto -> 548
    //   670: aload_2
    //   671: ifnull -> 684
    //   674: aload_2
    //   675: aload #25
    //   677: invokestatic ofFloat : (Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;
    //   680: astore_2
    //   681: goto -> 686
    //   684: aconst_null
    //   685: astore_2
    //   686: aload #20
    //   688: ifnull -> 699
    //   691: aload #20
    //   693: aload #21
    //   695: invokestatic ofFloat : (Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;
    //   698: astore_3
    //   699: aload_2
    //   700: ifnonnull -> 719
    //   703: aload #4
    //   705: iconst_1
    //   706: anewarray android/animation/PropertyValuesHolder
    //   709: dup
    //   710: iconst_0
    //   711: aload_3
    //   712: aastore
    //   713: invokevirtual setValues : ([Landroid/animation/PropertyValuesHolder;)V
    //   716: goto -> 778
    //   719: aload_3
    //   720: ifnonnull -> 739
    //   723: aload #4
    //   725: iconst_1
    //   726: anewarray android/animation/PropertyValuesHolder
    //   729: dup
    //   730: iconst_0
    //   731: aload_2
    //   732: aastore
    //   733: invokevirtual setValues : ([Landroid/animation/PropertyValuesHolder;)V
    //   736: goto -> 778
    //   739: aload #4
    //   741: iconst_2
    //   742: anewarray android/animation/PropertyValuesHolder
    //   745: dup
    //   746: iconst_0
    //   747: aload_2
    //   748: aastore
    //   749: dup
    //   750: iconst_1
    //   751: aload_3
    //   752: aastore
    //   753: invokevirtual setValues : ([Landroid/animation/PropertyValuesHolder;)V
    //   756: goto -> 778
    //   759: aload #4
    //   761: aload #19
    //   763: aload #6
    //   765: ldc_w 'propertyName'
    //   768: iconst_0
    //   769: invokestatic G : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;
    //   772: invokevirtual setPropertyName : (Ljava/lang/String;)V
    //   775: goto -> 778
    //   778: iconst_0
    //   779: istore #9
    //   781: aload #6
    //   783: ldc_w 'interpolator'
    //   786: invokestatic N : (Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
    //   789: ifne -> 795
    //   792: goto -> 804
    //   795: aload #18
    //   797: iconst_0
    //   798: iconst_0
    //   799: invokevirtual getResourceId : (II)I
    //   802: istore #9
    //   804: iload #9
    //   806: ifle -> 822
    //   809: aload_1
    //   810: aload_0
    //   811: iload #9
    //   813: invokestatic loadInterpolator : (Landroid/content/Context;I)Landroid/view/animation/Interpolator;
    //   816: invokevirtual setInterpolator : (Landroid/animation/TimeInterpolator;)V
    //   819: goto -> 822
    //   822: aload #18
    //   824: invokevirtual recycle : ()V
    //   827: aload #19
    //   829: ifnull -> 837
    //   832: aload #19
    //   834: invokevirtual recycle : ()V
    //   837: aload_1
    //   838: areturn
  }
  
  public static Typeface V(Context paramContext, int paramInt1, TypedValue paramTypedValue, int paramInt2, g paramg, Handler paramHandler, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   4: astore #8
    //   6: aload #8
    //   8: iload_1
    //   9: aload_2
    //   10: iconst_1
    //   11: invokevirtual getValue : (ILandroid/util/TypedValue;Z)V
    //   14: aload_2
    //   15: getfield string : Ljava/lang/CharSequence;
    //   18: astore #9
    //   20: aload #9
    //   22: ifnull -> 362
    //   25: aload #9
    //   27: invokeinterface toString : ()Ljava/lang/String;
    //   32: astore #10
    //   34: aload #10
    //   36: ldc_w 'res/'
    //   39: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   42: istore #7
    //   44: aconst_null
    //   45: astore #9
    //   47: iload #7
    //   49: ifne -> 63
    //   52: aload #9
    //   54: astore_0
    //   55: aload #4
    //   57: ifnull -> 312
    //   60: goto -> 300
    //   63: getstatic b/i/f/d.b : Lb/f/f;
    //   66: aload #8
    //   68: iload_1
    //   69: iload_3
    //   70: invokestatic d : (Landroid/content/res/Resources;II)Ljava/lang/String;
    //   73: invokevirtual a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   76: checkcast android/graphics/Typeface
    //   79: astore_2
    //   80: aload_2
    //   81: ifnull -> 104
    //   84: aload_2
    //   85: astore_0
    //   86: aload #4
    //   88: ifnull -> 101
    //   91: aload #4
    //   93: aload_2
    //   94: aload #5
    //   96: invokevirtual b : (Landroid/graphics/Typeface;Landroid/os/Handler;)V
    //   99: aload_2
    //   100: astore_0
    //   101: goto -> 312
    //   104: aload #10
    //   106: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   109: ldc_w '.xml'
    //   112: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   115: ifeq -> 186
    //   118: aload #8
    //   120: iload_1
    //   121: invokevirtual getXml : (I)Landroid/content/res/XmlResourceParser;
    //   124: aload #8
    //   126: invokestatic h0 : (Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources;)Lb/i/e/b/b;
    //   129: astore_2
    //   130: aload_2
    //   131: ifnonnull -> 167
    //   134: ldc_w 'ResourcesCompat'
    //   137: ldc_w 'Failed to find font-family tag'
    //   140: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   143: pop
    //   144: aload #9
    //   146: astore_0
    //   147: aload #4
    //   149: ifnull -> 312
    //   152: aload #4
    //   154: bipush #-3
    //   156: aload #5
    //   158: invokevirtual a : (ILandroid/os/Handler;)V
    //   161: aload #9
    //   163: astore_0
    //   164: goto -> 312
    //   167: aload_0
    //   168: aload_2
    //   169: aload #8
    //   171: iload_1
    //   172: iload_3
    //   173: aload #4
    //   175: aload #5
    //   177: iload #6
    //   179: invokestatic b : (Landroid/content/Context;Lb/i/e/b/b;Landroid/content/res/Resources;IILb/i/e/b/g;Landroid/os/Handler;Z)Landroid/graphics/Typeface;
    //   182: astore_0
    //   183: goto -> 312
    //   186: aload_0
    //   187: aload #8
    //   189: iload_1
    //   190: aload #10
    //   192: iload_3
    //   193: invokestatic c : (Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    //   196: astore_2
    //   197: aload_2
    //   198: astore_0
    //   199: aload #4
    //   201: ifnull -> 101
    //   204: aload_2
    //   205: ifnull -> 221
    //   208: aload #4
    //   210: aload_2
    //   211: aload #5
    //   213: invokevirtual b : (Landroid/graphics/Typeface;Landroid/os/Handler;)V
    //   216: aload_2
    //   217: astore_0
    //   218: goto -> 101
    //   221: aload #4
    //   223: bipush #-3
    //   225: aload #5
    //   227: invokevirtual a : (ILandroid/os/Handler;)V
    //   230: aload_2
    //   231: astore_0
    //   232: goto -> 101
    //   235: astore_2
    //   236: new java/lang/StringBuilder
    //   239: dup
    //   240: invokespecial <init> : ()V
    //   243: astore_0
    //   244: ldc_w 'Failed to read xml resource '
    //   247: astore #8
    //   249: goto -> 266
    //   252: astore_2
    //   253: new java/lang/StringBuilder
    //   256: dup
    //   257: invokespecial <init> : ()V
    //   260: astore_0
    //   261: ldc_w 'Failed to parse xml resource '
    //   264: astore #8
    //   266: aload_0
    //   267: aload #8
    //   269: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   272: pop
    //   273: aload_0
    //   274: aload #10
    //   276: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: pop
    //   280: ldc_w 'ResourcesCompat'
    //   283: aload_0
    //   284: invokevirtual toString : ()Ljava/lang/String;
    //   287: aload_2
    //   288: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   291: pop
    //   292: aload #9
    //   294: astore_0
    //   295: aload #4
    //   297: ifnull -> 312
    //   300: aload #4
    //   302: bipush #-3
    //   304: aload #5
    //   306: invokevirtual a : (ILandroid/os/Handler;)V
    //   309: aload #9
    //   311: astore_0
    //   312: aload_0
    //   313: ifnonnull -> 360
    //   316: aload #4
    //   318: ifnull -> 324
    //   321: goto -> 360
    //   324: ldc_w 'Font resource ID #0x'
    //   327: invokestatic e : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: astore_0
    //   331: aload_0
    //   332: iload_1
    //   333: invokestatic toHexString : (I)Ljava/lang/String;
    //   336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: pop
    //   340: aload_0
    //   341: ldc_w ' could not be retrieved.'
    //   344: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   347: pop
    //   348: new android/content/res/Resources$NotFoundException
    //   351: dup
    //   352: aload_0
    //   353: invokevirtual toString : ()Ljava/lang/String;
    //   356: invokespecial <init> : (Ljava/lang/String;)V
    //   359: athrow
    //   360: aload_0
    //   361: areturn
    //   362: ldc_w 'Resource "'
    //   365: invokestatic e : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: astore_0
    //   369: aload_0
    //   370: aload #8
    //   372: iload_1
    //   373: invokevirtual getResourceName : (I)Ljava/lang/String;
    //   376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   379: pop
    //   380: aload_0
    //   381: ldc_w '" ('
    //   384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: pop
    //   388: aload_0
    //   389: iload_1
    //   390: invokestatic toHexString : (I)Ljava/lang/String;
    //   393: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: pop
    //   397: aload_0
    //   398: ldc_w ') is not a Font: '
    //   401: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   404: pop
    //   405: aload_0
    //   406: aload_2
    //   407: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   410: pop
    //   411: new android/content/res/Resources$NotFoundException
    //   414: dup
    //   415: aload_0
    //   416: invokevirtual toString : ()Ljava/lang/String;
    //   419: invokespecial <init> : (Ljava/lang/String;)V
    //   422: athrow
    // Exception table:
    //   from	to	target	type
    //   104	130	252	org/xmlpull/v1/XmlPullParserException
    //   104	130	235	java/io/IOException
    //   134	144	252	org/xmlpull/v1/XmlPullParserException
    //   134	144	235	java/io/IOException
    //   152	161	252	org/xmlpull/v1/XmlPullParserException
    //   152	161	235	java/io/IOException
    //   167	183	252	org/xmlpull/v1/XmlPullParserException
    //   167	183	235	java/io/IOException
    //   186	197	252	org/xmlpull/v1/XmlPullParserException
    //   186	197	235	java/io/IOException
    //   208	216	252	org/xmlpull/v1/XmlPullParserException
    //   208	216	235	java/io/IOException
    //   221	230	252	org/xmlpull/v1/XmlPullParserException
    //   221	230	235	java/io/IOException
  }
  
  public static int W(int paramInt, Rect paramRect1, Rect paramRect2) {
    int i;
    if (paramInt != 17) {
      if (paramInt != 33) {
        if (paramInt != 66) {
          if (paramInt == 130) {
            paramInt = paramRect2.top;
            i = paramRect1.bottom;
          } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
          } 
        } else {
          paramInt = paramRect2.left;
          i = paramRect1.right;
        } 
      } else {
        paramInt = paramRect1.top;
        i = paramRect2.bottom;
      } 
    } else {
      paramInt = paramRect1.left;
      i = paramRect2.right;
    } 
    return Math.max(0, paramInt - i);
  }
  
  public static int X(int paramInt, Rect paramRect1, Rect paramRect2) {
    // Byte code:
    //   0: iload_0
    //   1: bipush #17
    //   3: if_icmpeq -> 67
    //   6: iload_0
    //   7: bipush #33
    //   9: if_icmpeq -> 39
    //   12: iload_0
    //   13: bipush #66
    //   15: if_icmpeq -> 67
    //   18: iload_0
    //   19: sipush #130
    //   22: if_icmpne -> 28
    //   25: goto -> 39
    //   28: new java/lang/IllegalArgumentException
    //   31: dup
    //   32: ldc_w 'direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.'
    //   35: invokespecial <init> : (Ljava/lang/String;)V
    //   38: athrow
    //   39: aload_1
    //   40: getfield left : I
    //   43: istore_0
    //   44: aload_1
    //   45: invokevirtual width : ()I
    //   48: iconst_2
    //   49: idiv
    //   50: iload_0
    //   51: iadd
    //   52: istore_0
    //   53: aload_2
    //   54: getfield left : I
    //   57: istore #4
    //   59: aload_2
    //   60: invokevirtual width : ()I
    //   63: istore_3
    //   64: goto -> 92
    //   67: aload_1
    //   68: getfield top : I
    //   71: istore_0
    //   72: aload_1
    //   73: invokevirtual height : ()I
    //   76: iconst_2
    //   77: idiv
    //   78: iload_0
    //   79: iadd
    //   80: istore_0
    //   81: aload_2
    //   82: getfield top : I
    //   85: istore #4
    //   87: aload_2
    //   88: invokevirtual height : ()I
    //   91: istore_3
    //   92: iload_0
    //   93: iload_3
    //   94: iconst_2
    //   95: idiv
    //   96: iload #4
    //   98: iadd
    //   99: isub
    //   100: invokestatic abs : (I)I
    //   103: ireturn
  }
  
  public static ByteBuffer Y(Context paramContext, CancellationSignal paramCancellationSignal, Uri paramUri) {
    ContentResolver contentResolver = paramContext.getContentResolver();
    try {
      ParcelFileDescriptor parcelFileDescriptor = contentResolver.openFileDescriptor(paramUri, "r", paramCancellationSignal);
      if (parcelFileDescriptor == null) {
        if (parcelFileDescriptor != null)
          parcelFileDescriptor.close(); 
        return null;
      } 
      try {
        FileInputStream fileInputStream = new FileInputStream();
        this(parcelFileDescriptor.getFileDescriptor());
      } finally {
        try {
          parcelFileDescriptor.close();
        } finally {
          parcelFileDescriptor = null;
        } 
      } 
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public static p Z(Context paramContext) {
    b b1 = new b((c.a.b.w.a)new f());
    p p = new p((b)new d(new File(paramContext.getCacheDir(), "volley")), (i)b1);
    d d2 = p.i;
    if (d2 != null) {
      d2.f = true;
      d2.interrupt();
    } 
    j[] arrayOfJ = p.h;
    int i = arrayOfJ.length;
    boolean bool = false;
    byte b;
    for (b = 0; b < i; b++) {
      j j = arrayOfJ[b];
      if (j != null) {
        j.f = true;
        j.interrupt();
      } 
    } 
    d d1 = new d(p.c, p.d, p.e, p.g);
    p.i = d1;
    d1.start();
    for (b = bool; b < p.h.length; b++) {
      j j = new j(p.d, p.f, p.e, p.g);
      p.h[b] = j;
      j.start();
    } 
    return p;
  }
  
  public static void a(e parame, d paramd, int paramInt) {
    // Byte code:
    //   0: getstatic b/g/b/i/d$a.d : Lb/g/b/i/d$a;
    //   3: astore #20
    //   5: iload_2
    //   6: ifne -> 27
    //   9: aload_0
    //   10: getfield n0 : I
    //   13: istore #10
    //   15: aload_0
    //   16: getfield q0 : [Lb/g/b/i/b;
    //   19: astore #22
    //   21: iconst_0
    //   22: istore #13
    //   24: goto -> 42
    //   27: aload_0
    //   28: getfield o0 : I
    //   31: istore #10
    //   33: aload_0
    //   34: getfield p0 : [Lb/g/b/i/b;
    //   37: astore #22
    //   39: iconst_2
    //   40: istore #13
    //   42: iconst_0
    //   43: istore #7
    //   45: iload #7
    //   47: iload #10
    //   49: if_icmpge -> 3907
    //   52: aload #22
    //   54: iload #7
    //   56: aaload
    //   57: astore #25
    //   59: aload #25
    //   61: getfield t : Z
    //   64: istore #19
    //   66: aconst_null
    //   67: astore #31
    //   69: iload #19
    //   71: ifne -> 909
    //   74: aload #25
    //   76: getfield o : I
    //   79: iconst_2
    //   80: imul
    //   81: istore #11
    //   83: aload #25
    //   85: getfield a : Lb/g/b/i/d;
    //   88: astore #21
    //   90: aload #21
    //   92: astore #23
    //   94: iconst_0
    //   95: istore #9
    //   97: iload #9
    //   99: ifne -> 764
    //   102: aload #25
    //   104: aload #25
    //   106: getfield i : I
    //   109: iconst_1
    //   110: iadd
    //   111: putfield i : I
    //   114: aload #21
    //   116: getfield e0 : [Lb/g/b/i/d;
    //   119: astore #24
    //   121: aload #25
    //   123: getfield o : I
    //   126: istore #8
    //   128: aload #24
    //   130: iload #8
    //   132: aconst_null
    //   133: aastore
    //   134: aload #21
    //   136: getfield d0 : [Lb/g/b/i/d;
    //   139: iload #8
    //   141: aconst_null
    //   142: aastore
    //   143: aload #21
    //   145: getfield X : I
    //   148: bipush #8
    //   150: if_icmpeq -> 650
    //   153: aload #25
    //   155: aload #25
    //   157: getfield l : I
    //   160: iconst_1
    //   161: iadd
    //   162: putfield l : I
    //   165: aload #21
    //   167: iload #8
    //   169: invokevirtual h : (I)Lb/g/b/i/d$a;
    //   172: aload #20
    //   174: if_acmpeq -> 235
    //   177: aload #25
    //   179: getfield m : I
    //   182: istore #12
    //   184: aload #25
    //   186: getfield o : I
    //   189: istore #8
    //   191: iload #8
    //   193: ifne -> 206
    //   196: aload #21
    //   198: invokevirtual o : ()I
    //   201: istore #8
    //   203: goto -> 225
    //   206: iload #8
    //   208: iconst_1
    //   209: if_icmpne -> 222
    //   212: aload #21
    //   214: invokevirtual i : ()I
    //   217: istore #8
    //   219: goto -> 225
    //   222: iconst_0
    //   223: istore #8
    //   225: aload #25
    //   227: iload #12
    //   229: iload #8
    //   231: iadd
    //   232: putfield m : I
    //   235: aload #25
    //   237: getfield m : I
    //   240: istore #8
    //   242: aload #21
    //   244: getfield G : [Lb/g/b/i/c;
    //   247: iload #11
    //   249: aaload
    //   250: invokevirtual b : ()I
    //   253: iload #8
    //   255: iadd
    //   256: istore #12
    //   258: aload #25
    //   260: iload #12
    //   262: putfield m : I
    //   265: aload #21
    //   267: getfield G : [Lb/g/b/i/c;
    //   270: astore #24
    //   272: iload #11
    //   274: iconst_1
    //   275: iadd
    //   276: istore #8
    //   278: aload #25
    //   280: aload #24
    //   282: iload #8
    //   284: aaload
    //   285: invokevirtual b : ()I
    //   288: iload #12
    //   290: iadd
    //   291: putfield m : I
    //   294: aload #25
    //   296: getfield n : I
    //   299: istore #12
    //   301: aload #21
    //   303: getfield G : [Lb/g/b/i/c;
    //   306: iload #11
    //   308: aaload
    //   309: invokevirtual b : ()I
    //   312: iload #12
    //   314: iadd
    //   315: istore #12
    //   317: aload #25
    //   319: iload #12
    //   321: putfield n : I
    //   324: aload #25
    //   326: aload #21
    //   328: getfield G : [Lb/g/b/i/c;
    //   331: iload #8
    //   333: aaload
    //   334: invokevirtual b : ()I
    //   337: iload #12
    //   339: iadd
    //   340: putfield n : I
    //   343: aload #25
    //   345: getfield b : Lb/g/b/i/d;
    //   348: ifnonnull -> 358
    //   351: aload #25
    //   353: aload #21
    //   355: putfield b : Lb/g/b/i/d;
    //   358: aload #25
    //   360: aload #21
    //   362: putfield d : Lb/g/b/i/d;
    //   365: aload #21
    //   367: getfield J : [Lb/g/b/i/d$a;
    //   370: astore #24
    //   372: aload #25
    //   374: getfield o : I
    //   377: istore #8
    //   379: aload #24
    //   381: iload #8
    //   383: aaload
    //   384: aload #20
    //   386: if_acmpne -> 650
    //   389: aload #21
    //   391: getfield l : [I
    //   394: astore #24
    //   396: aload #24
    //   398: iload #8
    //   400: iaload
    //   401: ifeq -> 422
    //   404: aload #24
    //   406: iload #8
    //   408: iaload
    //   409: iconst_3
    //   410: if_icmpeq -> 422
    //   413: aload #24
    //   415: iload #8
    //   417: iaload
    //   418: iconst_2
    //   419: if_icmpne -> 643
    //   422: aload #25
    //   424: aload #25
    //   426: getfield j : I
    //   429: iconst_1
    //   430: iadd
    //   431: putfield j : I
    //   434: aload #21
    //   436: getfield c0 : [F
    //   439: astore #24
    //   441: aload #25
    //   443: getfield o : I
    //   446: istore #8
    //   448: aload #24
    //   450: iload #8
    //   452: faload
    //   453: fstore_3
    //   454: fload_3
    //   455: fconst_0
    //   456: fcmpl
    //   457: ifle -> 476
    //   460: aload #25
    //   462: aload #25
    //   464: getfield k : F
    //   467: aload #24
    //   469: iload #8
    //   471: faload
    //   472: fadd
    //   473: putfield k : F
    //   476: aload #25
    //   478: getfield o : I
    //   481: istore #8
    //   483: aload #21
    //   485: getfield X : I
    //   488: bipush #8
    //   490: if_icmpeq -> 536
    //   493: aload #21
    //   495: getfield J : [Lb/g/b/i/d$a;
    //   498: iload #8
    //   500: aaload
    //   501: aload #20
    //   503: if_acmpne -> 536
    //   506: aload #21
    //   508: getfield l : [I
    //   511: astore #24
    //   513: aload #24
    //   515: iload #8
    //   517: iaload
    //   518: ifeq -> 530
    //   521: aload #24
    //   523: iload #8
    //   525: iaload
    //   526: iconst_3
    //   527: if_icmpne -> 536
    //   530: iconst_1
    //   531: istore #8
    //   533: goto -> 539
    //   536: iconst_0
    //   537: istore #8
    //   539: iload #8
    //   541: ifeq -> 596
    //   544: fload_3
    //   545: fconst_0
    //   546: fcmpg
    //   547: ifge -> 559
    //   550: aload #25
    //   552: iconst_1
    //   553: putfield q : Z
    //   556: goto -> 565
    //   559: aload #25
    //   561: iconst_1
    //   562: putfield r : Z
    //   565: aload #25
    //   567: getfield h : Ljava/util/ArrayList;
    //   570: ifnonnull -> 585
    //   573: aload #25
    //   575: new java/util/ArrayList
    //   578: dup
    //   579: invokespecial <init> : ()V
    //   582: putfield h : Ljava/util/ArrayList;
    //   585: aload #25
    //   587: getfield h : Ljava/util/ArrayList;
    //   590: aload #21
    //   592: invokevirtual add : (Ljava/lang/Object;)Z
    //   595: pop
    //   596: aload #25
    //   598: getfield f : Lb/g/b/i/d;
    //   601: ifnonnull -> 611
    //   604: aload #25
    //   606: aload #21
    //   608: putfield f : Lb/g/b/i/d;
    //   611: aload #25
    //   613: getfield g : Lb/g/b/i/d;
    //   616: astore #24
    //   618: aload #24
    //   620: ifnull -> 636
    //   623: aload #24
    //   625: getfield d0 : [Lb/g/b/i/d;
    //   628: aload #25
    //   630: getfield o : I
    //   633: aload #21
    //   635: aastore
    //   636: aload #25
    //   638: aload #21
    //   640: putfield g : Lb/g/b/i/d;
    //   643: aload #25
    //   645: getfield o : I
    //   648: istore #8
    //   650: aload #23
    //   652: aload #21
    //   654: if_acmpeq -> 670
    //   657: aload #23
    //   659: getfield e0 : [Lb/g/b/i/d;
    //   662: aload #25
    //   664: getfield o : I
    //   667: aload #21
    //   669: aastore
    //   670: aload #21
    //   672: getfield G : [Lb/g/b/i/c;
    //   675: iload #11
    //   677: iconst_1
    //   678: iadd
    //   679: aaload
    //   680: getfield d : Lb/g/b/i/c;
    //   683: astore #23
    //   685: aload #23
    //   687: ifnull -> 731
    //   690: aload #23
    //   692: getfield b : Lb/g/b/i/d;
    //   695: astore #23
    //   697: aload #23
    //   699: getfield G : [Lb/g/b/i/c;
    //   702: astore #24
    //   704: aload #24
    //   706: iload #11
    //   708: aaload
    //   709: getfield d : Lb/g/b/i/c;
    //   712: ifnull -> 731
    //   715: aload #24
    //   717: iload #11
    //   719: aaload
    //   720: getfield d : Lb/g/b/i/c;
    //   723: getfield b : Lb/g/b/i/d;
    //   726: aload #21
    //   728: if_acmpeq -> 734
    //   731: aconst_null
    //   732: astore #23
    //   734: aload #23
    //   736: ifnull -> 742
    //   739: goto -> 749
    //   742: aload #21
    //   744: astore #23
    //   746: iconst_1
    //   747: istore #9
    //   749: aload #21
    //   751: astore #24
    //   753: aload #23
    //   755: astore #21
    //   757: aload #24
    //   759: astore #23
    //   761: goto -> 97
    //   764: aload #25
    //   766: getfield b : Lb/g/b/i/d;
    //   769: astore #23
    //   771: aload #23
    //   773: ifnull -> 798
    //   776: aload #25
    //   778: aload #25
    //   780: getfield m : I
    //   783: aload #23
    //   785: getfield G : [Lb/g/b/i/c;
    //   788: iload #11
    //   790: aaload
    //   791: invokevirtual b : ()I
    //   794: isub
    //   795: putfield m : I
    //   798: aload #25
    //   800: getfield d : Lb/g/b/i/d;
    //   803: astore #23
    //   805: aload #23
    //   807: ifnull -> 834
    //   810: aload #25
    //   812: aload #25
    //   814: getfield m : I
    //   817: aload #23
    //   819: getfield G : [Lb/g/b/i/c;
    //   822: iload #11
    //   824: iconst_1
    //   825: iadd
    //   826: aaload
    //   827: invokevirtual b : ()I
    //   830: isub
    //   831: putfield m : I
    //   834: aload #25
    //   836: aload #21
    //   838: putfield c : Lb/g/b/i/d;
    //   841: aload #25
    //   843: getfield o : I
    //   846: ifne -> 867
    //   849: aload #25
    //   851: getfield p : Z
    //   854: ifeq -> 867
    //   857: aload #25
    //   859: aload #21
    //   861: putfield e : Lb/g/b/i/d;
    //   864: goto -> 877
    //   867: aload #25
    //   869: aload #25
    //   871: getfield a : Lb/g/b/i/d;
    //   874: putfield e : Lb/g/b/i/d;
    //   877: aload #25
    //   879: getfield r : Z
    //   882: ifeq -> 899
    //   885: aload #25
    //   887: getfield q : Z
    //   890: ifeq -> 899
    //   893: iconst_1
    //   894: istore #19
    //   896: goto -> 902
    //   899: iconst_0
    //   900: istore #19
    //   902: aload #25
    //   904: iload #19
    //   906: putfield s : Z
    //   909: aload #25
    //   911: iconst_1
    //   912: putfield t : Z
    //   915: aload #25
    //   917: getfield a : Lb/g/b/i/d;
    //   920: astore #28
    //   922: aload #25
    //   924: getfield c : Lb/g/b/i/d;
    //   927: astore #33
    //   929: aload #25
    //   931: getfield b : Lb/g/b/i/d;
    //   934: astore #27
    //   936: aload #25
    //   938: getfield d : Lb/g/b/i/d;
    //   941: astore #32
    //   943: aload #25
    //   945: getfield e : Lb/g/b/i/d;
    //   948: astore #24
    //   950: aload #25
    //   952: getfield k : F
    //   955: fstore #4
    //   957: aload_0
    //   958: getfield J : [Lb/g/b/i/d$a;
    //   961: iload_2
    //   962: aaload
    //   963: getstatic b/g/b/i/d$a.c : Lb/g/b/i/d$a;
    //   966: if_acmpne -> 975
    //   969: iconst_1
    //   970: istore #14
    //   972: goto -> 978
    //   975: iconst_0
    //   976: istore #14
    //   978: iload_2
    //   979: ifne -> 1044
    //   982: aload #24
    //   984: getfield a0 : I
    //   987: ifne -> 996
    //   990: iconst_1
    //   991: istore #8
    //   993: goto -> 999
    //   996: iconst_0
    //   997: istore #8
    //   999: aload #24
    //   1001: getfield a0 : I
    //   1004: iconst_1
    //   1005: if_icmpne -> 1014
    //   1008: iconst_1
    //   1009: istore #9
    //   1011: goto -> 1017
    //   1014: iconst_0
    //   1015: istore #9
    //   1017: aload #24
    //   1019: getfield a0 : I
    //   1022: iconst_2
    //   1023: if_icmpne -> 1033
    //   1026: iload #8
    //   1028: istore #12
    //   1030: goto -> 1104
    //   1033: iload #9
    //   1035: istore #11
    //   1037: iload #8
    //   1039: istore #9
    //   1041: goto -> 1114
    //   1044: aload #24
    //   1046: getfield b0 : I
    //   1049: ifne -> 1058
    //   1052: iconst_1
    //   1053: istore #12
    //   1055: goto -> 1061
    //   1058: iconst_0
    //   1059: istore #12
    //   1061: aload #24
    //   1063: getfield b0 : I
    //   1066: iconst_1
    //   1067: if_icmpne -> 1076
    //   1070: iconst_1
    //   1071: istore #8
    //   1073: goto -> 1079
    //   1076: iconst_0
    //   1077: istore #8
    //   1079: aload #24
    //   1081: getfield b0 : I
    //   1084: istore #15
    //   1086: iload #8
    //   1088: istore #11
    //   1090: iload #12
    //   1092: istore #9
    //   1094: iload #15
    //   1096: iconst_2
    //   1097: if_icmpne -> 1114
    //   1100: iload #8
    //   1102: istore #9
    //   1104: iconst_1
    //   1105: istore #15
    //   1107: iload #9
    //   1109: istore #11
    //   1111: goto -> 1121
    //   1114: iconst_0
    //   1115: istore #15
    //   1117: iload #9
    //   1119: istore #12
    //   1121: aload #28
    //   1123: astore #23
    //   1125: iconst_0
    //   1126: istore #9
    //   1128: aload #22
    //   1130: astore #21
    //   1132: iload #10
    //   1134: istore #8
    //   1136: iload #9
    //   1138: ifne -> 1535
    //   1141: aload #23
    //   1143: getfield G : [Lb/g/b/i/c;
    //   1146: iload #13
    //   1148: aaload
    //   1149: astore #22
    //   1151: iload #15
    //   1153: ifeq -> 1162
    //   1156: iconst_1
    //   1157: istore #10
    //   1159: goto -> 1165
    //   1162: iconst_4
    //   1163: istore #10
    //   1165: aload #22
    //   1167: invokevirtual b : ()I
    //   1170: istore #18
    //   1172: aload #23
    //   1174: getfield J : [Lb/g/b/i/d$a;
    //   1177: iload_2
    //   1178: aaload
    //   1179: aload #20
    //   1181: if_acmpne -> 1200
    //   1184: aload #23
    //   1186: getfield l : [I
    //   1189: iload_2
    //   1190: iaload
    //   1191: ifne -> 1200
    //   1194: iconst_1
    //   1195: istore #17
    //   1197: goto -> 1203
    //   1200: iconst_0
    //   1201: istore #17
    //   1203: aload #22
    //   1205: getfield d : Lb/g/b/i/c;
    //   1208: astore #26
    //   1210: iload #18
    //   1212: istore #16
    //   1214: aload #26
    //   1216: ifnull -> 1240
    //   1219: iload #18
    //   1221: istore #16
    //   1223: aload #23
    //   1225: aload #28
    //   1227: if_acmpeq -> 1240
    //   1230: aload #26
    //   1232: invokevirtual b : ()I
    //   1235: iload #18
    //   1237: iadd
    //   1238: istore #16
    //   1240: iload #15
    //   1242: ifeq -> 1265
    //   1245: aload #23
    //   1247: aload #28
    //   1249: if_acmpeq -> 1265
    //   1252: aload #23
    //   1254: aload #27
    //   1256: if_acmpeq -> 1265
    //   1259: iconst_5
    //   1260: istore #10
    //   1262: goto -> 1265
    //   1265: aload #22
    //   1267: getfield d : Lb/g/b/i/c;
    //   1270: astore #26
    //   1272: aload #26
    //   1274: ifnull -> 1364
    //   1277: aload #23
    //   1279: aload #27
    //   1281: if_acmpne -> 1305
    //   1284: aload_1
    //   1285: aload #22
    //   1287: getfield g : Lb/g/b/g;
    //   1290: aload #26
    //   1292: getfield g : Lb/g/b/g;
    //   1295: iload #16
    //   1297: bipush #6
    //   1299: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   1302: goto -> 1323
    //   1305: aload_1
    //   1306: aload #22
    //   1308: getfield g : Lb/g/b/g;
    //   1311: aload #26
    //   1313: getfield g : Lb/g/b/g;
    //   1316: iload #16
    //   1318: bipush #8
    //   1320: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   1323: iload #17
    //   1325: ifeq -> 1339
    //   1328: iload #15
    //   1330: ifne -> 1339
    //   1333: iconst_5
    //   1334: istore #10
    //   1336: goto -> 1339
    //   1339: aload_1
    //   1340: aload #22
    //   1342: getfield g : Lb/g/b/g;
    //   1345: aload #22
    //   1347: getfield d : Lb/g/b/i/c;
    //   1350: getfield g : Lb/g/b/g;
    //   1353: iload #16
    //   1355: iload #10
    //   1357: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   1360: pop
    //   1361: goto -> 1364
    //   1364: iload #14
    //   1366: ifeq -> 1453
    //   1369: aload #23
    //   1371: getfield X : I
    //   1374: bipush #8
    //   1376: if_icmpeq -> 1425
    //   1379: aload #23
    //   1381: getfield J : [Lb/g/b/i/d$a;
    //   1384: iload_2
    //   1385: aaload
    //   1386: aload #20
    //   1388: if_acmpne -> 1425
    //   1391: aload #23
    //   1393: getfield G : [Lb/g/b/i/c;
    //   1396: astore #22
    //   1398: aload_1
    //   1399: aload #22
    //   1401: iload #13
    //   1403: iconst_1
    //   1404: iadd
    //   1405: aaload
    //   1406: getfield g : Lb/g/b/g;
    //   1409: aload #22
    //   1411: iload #13
    //   1413: aaload
    //   1414: getfield g : Lb/g/b/g;
    //   1417: iconst_0
    //   1418: iconst_5
    //   1419: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   1422: goto -> 1425
    //   1425: aload_1
    //   1426: aload #23
    //   1428: getfield G : [Lb/g/b/i/c;
    //   1431: iload #13
    //   1433: aaload
    //   1434: getfield g : Lb/g/b/g;
    //   1437: aload_0
    //   1438: getfield G : [Lb/g/b/i/c;
    //   1441: iload #13
    //   1443: aaload
    //   1444: getfield g : Lb/g/b/g;
    //   1447: iconst_0
    //   1448: bipush #8
    //   1450: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   1453: aload #23
    //   1455: getfield G : [Lb/g/b/i/c;
    //   1458: iload #13
    //   1460: iconst_1
    //   1461: iadd
    //   1462: aaload
    //   1463: getfield d : Lb/g/b/i/c;
    //   1466: astore #22
    //   1468: aload #22
    //   1470: ifnull -> 1514
    //   1473: aload #22
    //   1475: getfield b : Lb/g/b/i/d;
    //   1478: astore #22
    //   1480: aload #22
    //   1482: getfield G : [Lb/g/b/i/c;
    //   1485: astore #26
    //   1487: aload #26
    //   1489: iload #13
    //   1491: aaload
    //   1492: getfield d : Lb/g/b/i/c;
    //   1495: ifnull -> 1514
    //   1498: aload #26
    //   1500: iload #13
    //   1502: aaload
    //   1503: getfield d : Lb/g/b/i/c;
    //   1506: getfield b : Lb/g/b/i/d;
    //   1509: aload #23
    //   1511: if_acmpeq -> 1517
    //   1514: aconst_null
    //   1515: astore #22
    //   1517: aload #22
    //   1519: ifnull -> 1529
    //   1522: aload #22
    //   1524: astore #23
    //   1526: goto -> 1532
    //   1529: iconst_1
    //   1530: istore #9
    //   1532: goto -> 1136
    //   1535: aload #32
    //   1537: ifnull -> 1736
    //   1540: aload #33
    //   1542: getfield G : [Lb/g/b/i/c;
    //   1545: astore #22
    //   1547: iload #13
    //   1549: iconst_1
    //   1550: iadd
    //   1551: istore #10
    //   1553: aload #22
    //   1555: iload #10
    //   1557: aaload
    //   1558: getfield d : Lb/g/b/i/c;
    //   1561: ifnull -> 1736
    //   1564: aload #32
    //   1566: getfield G : [Lb/g/b/i/c;
    //   1569: iload #10
    //   1571: aaload
    //   1572: astore #22
    //   1574: aload #32
    //   1576: getfield J : [Lb/g/b/i/d$a;
    //   1579: iload_2
    //   1580: aaload
    //   1581: aload #20
    //   1583: if_acmpne -> 1602
    //   1586: aload #32
    //   1588: getfield l : [I
    //   1591: iload_2
    //   1592: iaload
    //   1593: ifne -> 1602
    //   1596: iconst_1
    //   1597: istore #9
    //   1599: goto -> 1605
    //   1602: iconst_0
    //   1603: istore #9
    //   1605: iload #9
    //   1607: ifeq -> 1656
    //   1610: iload #15
    //   1612: ifne -> 1656
    //   1615: aload #22
    //   1617: getfield d : Lb/g/b/i/c;
    //   1620: astore #23
    //   1622: aload #23
    //   1624: getfield b : Lb/g/b/i/d;
    //   1627: aload_0
    //   1628: if_acmpne -> 1656
    //   1631: aload_1
    //   1632: aload #22
    //   1634: getfield g : Lb/g/b/g;
    //   1637: aload #23
    //   1639: getfield g : Lb/g/b/g;
    //   1642: aload #22
    //   1644: invokevirtual b : ()I
    //   1647: ineg
    //   1648: iconst_5
    //   1649: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   1652: pop
    //   1653: goto -> 1702
    //   1656: iload #15
    //   1658: ifeq -> 1702
    //   1661: aload #22
    //   1663: getfield d : Lb/g/b/i/c;
    //   1666: astore #23
    //   1668: aload #23
    //   1670: getfield b : Lb/g/b/i/d;
    //   1673: aload_0
    //   1674: if_acmpne -> 1702
    //   1677: aload_1
    //   1678: aload #22
    //   1680: getfield g : Lb/g/b/g;
    //   1683: aload #23
    //   1685: getfield g : Lb/g/b/g;
    //   1688: aload #22
    //   1690: invokevirtual b : ()I
    //   1693: ineg
    //   1694: iconst_4
    //   1695: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   1698: pop
    //   1699: goto -> 1702
    //   1702: aload_1
    //   1703: aload #22
    //   1705: getfield g : Lb/g/b/g;
    //   1708: aload #33
    //   1710: getfield G : [Lb/g/b/i/c;
    //   1713: iload #10
    //   1715: aaload
    //   1716: getfield d : Lb/g/b/i/c;
    //   1719: getfield g : Lb/g/b/g;
    //   1722: aload #22
    //   1724: invokevirtual b : ()I
    //   1727: ineg
    //   1728: bipush #6
    //   1730: invokevirtual g : (Lb/g/b/g;Lb/g/b/g;II)V
    //   1733: goto -> 1736
    //   1736: iload #14
    //   1738: ifeq -> 1794
    //   1741: aload_0
    //   1742: getfield G : [Lb/g/b/i/c;
    //   1745: astore #22
    //   1747: iload #13
    //   1749: iconst_1
    //   1750: iadd
    //   1751: istore #9
    //   1753: aload #22
    //   1755: iload #9
    //   1757: aaload
    //   1758: getfield g : Lb/g/b/g;
    //   1761: astore #23
    //   1763: aload #33
    //   1765: getfield G : [Lb/g/b/i/c;
    //   1768: astore #22
    //   1770: aload_1
    //   1771: aload #23
    //   1773: aload #22
    //   1775: iload #9
    //   1777: aaload
    //   1778: getfield g : Lb/g/b/g;
    //   1781: aload #22
    //   1783: iload #9
    //   1785: aaload
    //   1786: invokevirtual b : ()I
    //   1789: bipush #8
    //   1791: invokevirtual f : (Lb/g/b/g;Lb/g/b/g;II)V
    //   1794: aload #25
    //   1796: getfield h : Ljava/util/ArrayList;
    //   1799: astore #26
    //   1801: aload #25
    //   1803: astore #30
    //   1805: aload #20
    //   1807: astore #22
    //   1809: aload #26
    //   1811: ifnull -> 2351
    //   1814: aload #26
    //   1816: invokevirtual size : ()I
    //   1819: istore #9
    //   1821: aload #25
    //   1823: astore #30
    //   1825: aload #20
    //   1827: astore #22
    //   1829: iload #9
    //   1831: iconst_1
    //   1832: if_icmple -> 2351
    //   1835: aload #25
    //   1837: getfield q : Z
    //   1840: ifeq -> 1862
    //   1843: aload #25
    //   1845: getfield s : Z
    //   1848: ifne -> 1862
    //   1851: aload #25
    //   1853: getfield j : I
    //   1856: i2f
    //   1857: fstore #4
    //   1859: goto -> 1862
    //   1862: aconst_null
    //   1863: astore #29
    //   1865: fconst_0
    //   1866: fstore #5
    //   1868: iconst_0
    //   1869: istore #10
    //   1871: aload #25
    //   1873: astore #23
    //   1875: aload #23
    //   1877: astore #30
    //   1879: aload #20
    //   1881: astore #22
    //   1883: iload #10
    //   1885: iload #9
    //   1887: if_icmpge -> 2351
    //   1890: aload #26
    //   1892: iload #10
    //   1894: invokevirtual get : (I)Ljava/lang/Object;
    //   1897: checkcast b/g/b/i/d
    //   1900: astore #25
    //   1902: aload #25
    //   1904: getfield c0 : [F
    //   1907: iload_2
    //   1908: faload
    //   1909: fstore #6
    //   1911: fload #6
    //   1913: fstore_3
    //   1914: fload #6
    //   1916: fconst_0
    //   1917: fcmpg
    //   1918: ifge -> 1966
    //   1921: aload #23
    //   1923: getfield s : Z
    //   1926: ifeq -> 1964
    //   1929: aload #25
    //   1931: getfield G : [Lb/g/b/i/c;
    //   1934: astore #25
    //   1936: aload #25
    //   1938: iload #13
    //   1940: iconst_1
    //   1941: iadd
    //   1942: aaload
    //   1943: getfield g : Lb/g/b/g;
    //   1946: astore #22
    //   1948: aload #25
    //   1950: iload #13
    //   1952: aaload
    //   1953: getfield g : Lb/g/b/g;
    //   1956: astore #25
    //   1958: iconst_4
    //   1959: istore #14
    //   1961: goto -> 2009
    //   1964: fconst_1
    //   1965: fstore_3
    //   1966: fload_3
    //   1967: fconst_0
    //   1968: fcmpl
    //   1969: istore #16
    //   1971: iload #16
    //   1973: ifne -> 2024
    //   1976: aload #25
    //   1978: getfield G : [Lb/g/b/i/c;
    //   1981: astore #25
    //   1983: aload #25
    //   1985: iload #13
    //   1987: iconst_1
    //   1988: iadd
    //   1989: aaload
    //   1990: getfield g : Lb/g/b/g;
    //   1993: astore #22
    //   1995: aload #25
    //   1997: iload #13
    //   1999: aaload
    //   2000: getfield g : Lb/g/b/g;
    //   2003: astore #25
    //   2005: bipush #8
    //   2007: istore #14
    //   2009: aload_1
    //   2010: aload #22
    //   2012: aload #25
    //   2014: iconst_0
    //   2015: iload #14
    //   2017: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   2020: pop
    //   2021: goto -> 2345
    //   2024: aload #29
    //   2026: ifnull -> 2338
    //   2029: aload #29
    //   2031: getfield G : [Lb/g/b/i/c;
    //   2034: astore #29
    //   2036: aload #29
    //   2038: iload #13
    //   2040: aaload
    //   2041: getfield g : Lb/g/b/g;
    //   2044: astore #22
    //   2046: iload #13
    //   2048: iconst_1
    //   2049: iadd
    //   2050: istore #14
    //   2052: aload #29
    //   2054: iload #14
    //   2056: aaload
    //   2057: getfield g : Lb/g/b/g;
    //   2060: astore #34
    //   2062: aload #25
    //   2064: getfield G : [Lb/g/b/i/c;
    //   2067: astore #30
    //   2069: aload #30
    //   2071: iload #13
    //   2073: aaload
    //   2074: getfield g : Lb/g/b/g;
    //   2077: astore #29
    //   2079: aload #30
    //   2081: iload #14
    //   2083: aaload
    //   2084: getfield g : Lb/g/b/g;
    //   2087: astore #35
    //   2089: aload_1
    //   2090: invokevirtual m : ()Lb/g/b/b;
    //   2093: astore #30
    //   2095: aload #30
    //   2097: fconst_0
    //   2098: putfield b : F
    //   2101: ldc_w -1.0
    //   2104: fstore #6
    //   2106: fload #4
    //   2108: fconst_0
    //   2109: fcmpl
    //   2110: ifeq -> 2266
    //   2113: fload #5
    //   2115: fload_3
    //   2116: fcmpl
    //   2117: ifne -> 2123
    //   2120: goto -> 2266
    //   2123: fload #5
    //   2125: fconst_0
    //   2126: fcmpl
    //   2127: ifne -> 2161
    //   2130: aload #30
    //   2132: getfield e : Lb/g/b/b$a;
    //   2135: aload #22
    //   2137: fconst_1
    //   2138: invokeinterface j : (Lb/g/b/g;F)V
    //   2143: aload #30
    //   2145: getfield e : Lb/g/b/b$a;
    //   2148: aload #34
    //   2150: ldc_w -1.0
    //   2153: invokeinterface j : (Lb/g/b/g;F)V
    //   2158: goto -> 2329
    //   2161: iload #16
    //   2163: ifne -> 2197
    //   2166: aload #30
    //   2168: getfield e : Lb/g/b/b$a;
    //   2171: aload #29
    //   2173: fconst_1
    //   2174: invokeinterface j : (Lb/g/b/g;F)V
    //   2179: aload #30
    //   2181: getfield e : Lb/g/b/b$a;
    //   2184: aload #35
    //   2186: ldc_w -1.0
    //   2189: invokeinterface j : (Lb/g/b/g;F)V
    //   2194: goto -> 2329
    //   2197: fload #5
    //   2199: fload #4
    //   2201: fdiv
    //   2202: fload_3
    //   2203: fload #4
    //   2205: fdiv
    //   2206: fdiv
    //   2207: fstore #5
    //   2209: aload #30
    //   2211: getfield e : Lb/g/b/b$a;
    //   2214: aload #22
    //   2216: fconst_1
    //   2217: invokeinterface j : (Lb/g/b/g;F)V
    //   2222: aload #30
    //   2224: getfield e : Lb/g/b/b$a;
    //   2227: aload #34
    //   2229: ldc_w -1.0
    //   2232: invokeinterface j : (Lb/g/b/g;F)V
    //   2237: aload #30
    //   2239: getfield e : Lb/g/b/b$a;
    //   2242: aload #35
    //   2244: fload #5
    //   2246: invokeinterface j : (Lb/g/b/g;F)V
    //   2251: aload #30
    //   2253: getfield e : Lb/g/b/b$a;
    //   2256: astore #22
    //   2258: fload #5
    //   2260: fneg
    //   2261: fstore #5
    //   2263: goto -> 2318
    //   2266: aload #30
    //   2268: getfield e : Lb/g/b/b$a;
    //   2271: aload #22
    //   2273: fconst_1
    //   2274: invokeinterface j : (Lb/g/b/g;F)V
    //   2279: aload #30
    //   2281: getfield e : Lb/g/b/b$a;
    //   2284: aload #34
    //   2286: ldc_w -1.0
    //   2289: invokeinterface j : (Lb/g/b/g;F)V
    //   2294: aload #30
    //   2296: getfield e : Lb/g/b/b$a;
    //   2299: aload #35
    //   2301: fconst_1
    //   2302: invokeinterface j : (Lb/g/b/g;F)V
    //   2307: aload #30
    //   2309: getfield e : Lb/g/b/b$a;
    //   2312: astore #22
    //   2314: fload #6
    //   2316: fstore #5
    //   2318: aload #22
    //   2320: aload #29
    //   2322: fload #5
    //   2324: invokeinterface j : (Lb/g/b/g;F)V
    //   2329: aload_1
    //   2330: aload #30
    //   2332: invokevirtual c : (Lb/g/b/b;)V
    //   2335: goto -> 2338
    //   2338: aload #25
    //   2340: astore #29
    //   2342: fload_3
    //   2343: fstore #5
    //   2345: iinc #10, 1
    //   2348: goto -> 1875
    //   2351: aload #27
    //   2353: ifnull -> 2550
    //   2356: aload #27
    //   2358: aload #32
    //   2360: if_acmpeq -> 2368
    //   2363: iload #15
    //   2365: ifeq -> 2550
    //   2368: aload #28
    //   2370: getfield G : [Lb/g/b/i/c;
    //   2373: iload #13
    //   2375: aaload
    //   2376: astore #20
    //   2378: aload #33
    //   2380: getfield G : [Lb/g/b/i/c;
    //   2383: astore #23
    //   2385: iload #13
    //   2387: iconst_1
    //   2388: iadd
    //   2389: istore #9
    //   2391: aload #23
    //   2393: iload #9
    //   2395: aaload
    //   2396: astore #23
    //   2398: aload #20
    //   2400: getfield d : Lb/g/b/i/c;
    //   2403: astore #20
    //   2405: aload #20
    //   2407: ifnull -> 2420
    //   2410: aload #20
    //   2412: getfield g : Lb/g/b/g;
    //   2415: astore #20
    //   2417: goto -> 2423
    //   2420: aconst_null
    //   2421: astore #20
    //   2423: aload #23
    //   2425: getfield d : Lb/g/b/i/c;
    //   2428: astore #23
    //   2430: aload #23
    //   2432: ifnull -> 2445
    //   2435: aload #23
    //   2437: getfield g : Lb/g/b/g;
    //   2440: astore #23
    //   2442: goto -> 2448
    //   2445: aconst_null
    //   2446: astore #23
    //   2448: aload #27
    //   2450: getfield G : [Lb/g/b/i/c;
    //   2453: iload #13
    //   2455: aaload
    //   2456: astore #26
    //   2458: aload #32
    //   2460: getfield G : [Lb/g/b/i/c;
    //   2463: iload #9
    //   2465: aaload
    //   2466: astore #25
    //   2468: aload #20
    //   2470: ifnull -> 2547
    //   2473: aload #23
    //   2475: ifnull -> 2547
    //   2478: iload_2
    //   2479: ifne -> 2491
    //   2482: aload #24
    //   2484: getfield U : F
    //   2487: fstore_3
    //   2488: goto -> 2497
    //   2491: aload #24
    //   2493: getfield V : F
    //   2496: fstore_3
    //   2497: aload #26
    //   2499: invokevirtual b : ()I
    //   2502: istore #9
    //   2504: aload #25
    //   2506: invokevirtual b : ()I
    //   2509: istore #10
    //   2511: aload #26
    //   2513: getfield g : Lb/g/b/g;
    //   2516: astore #24
    //   2518: aload #25
    //   2520: getfield g : Lb/g/b/g;
    //   2523: astore #25
    //   2525: aload_1
    //   2526: aload #24
    //   2528: aload #20
    //   2530: iload #9
    //   2532: fload_3
    //   2533: aload #23
    //   2535: aload #25
    //   2537: iload #10
    //   2539: bipush #7
    //   2541: invokevirtual b : (Lb/g/b/g;Lb/g/b/g;IFLb/g/b/g;Lb/g/b/g;II)V
    //   2544: goto -> 3071
    //   2547: goto -> 3071
    //   2550: iload #12
    //   2552: ifeq -> 3078
    //   2555: aload #27
    //   2557: ifnull -> 3078
    //   2560: aload #30
    //   2562: getfield j : I
    //   2565: istore #9
    //   2567: iload #9
    //   2569: ifle -> 2588
    //   2572: aload #30
    //   2574: getfield i : I
    //   2577: iload #9
    //   2579: if_icmpne -> 2588
    //   2582: iconst_1
    //   2583: istore #10
    //   2585: goto -> 2591
    //   2588: iconst_0
    //   2589: istore #10
    //   2591: aload #27
    //   2593: astore #24
    //   2595: aload #24
    //   2597: astore #20
    //   2599: iload #7
    //   2601: istore #9
    //   2603: iload #9
    //   2605: istore #7
    //   2607: aload #20
    //   2609: ifnull -> 3071
    //   2612: aload #20
    //   2614: getfield e0 : [Lb/g/b/i/d;
    //   2617: iload_2
    //   2618: aaload
    //   2619: astore #23
    //   2621: aload #23
    //   2623: ifnull -> 2648
    //   2626: aload #23
    //   2628: getfield X : I
    //   2631: bipush #8
    //   2633: if_icmpne -> 2648
    //   2636: aload #23
    //   2638: getfield e0 : [Lb/g/b/i/d;
    //   2641: iload_2
    //   2642: aaload
    //   2643: astore #23
    //   2645: goto -> 2621
    //   2648: aload #23
    //   2650: ifnonnull -> 2666
    //   2653: aload #20
    //   2655: aload #32
    //   2657: if_acmpne -> 2663
    //   2660: goto -> 2666
    //   2663: goto -> 3050
    //   2666: aload #20
    //   2668: getfield G : [Lb/g/b/i/c;
    //   2671: iload #13
    //   2673: aaload
    //   2674: astore #29
    //   2676: aload #29
    //   2678: getfield g : Lb/g/b/g;
    //   2681: astore #34
    //   2683: aload #29
    //   2685: getfield d : Lb/g/b/i/c;
    //   2688: astore #25
    //   2690: aload #25
    //   2692: ifnull -> 2705
    //   2695: aload #25
    //   2697: getfield g : Lb/g/b/g;
    //   2700: astore #26
    //   2702: goto -> 2708
    //   2705: aconst_null
    //   2706: astore #26
    //   2708: aload #24
    //   2710: aload #20
    //   2712: if_acmpeq -> 2730
    //   2715: aload #24
    //   2717: getfield G : [Lb/g/b/i/c;
    //   2720: iload #13
    //   2722: iconst_1
    //   2723: iadd
    //   2724: aaload
    //   2725: astore #25
    //   2727: goto -> 2780
    //   2730: aload #26
    //   2732: astore #25
    //   2734: aload #20
    //   2736: aload #27
    //   2738: if_acmpne -> 2793
    //   2741: aload #26
    //   2743: astore #25
    //   2745: aload #24
    //   2747: aload #20
    //   2749: if_acmpne -> 2793
    //   2752: aload #28
    //   2754: getfield G : [Lb/g/b/i/c;
    //   2757: astore #25
    //   2759: aload #25
    //   2761: iload #13
    //   2763: aaload
    //   2764: getfield d : Lb/g/b/i/c;
    //   2767: ifnull -> 2790
    //   2770: aload #25
    //   2772: iload #13
    //   2774: aaload
    //   2775: getfield d : Lb/g/b/i/c;
    //   2778: astore #25
    //   2780: aload #25
    //   2782: getfield g : Lb/g/b/g;
    //   2785: astore #25
    //   2787: goto -> 2793
    //   2790: aconst_null
    //   2791: astore #25
    //   2793: aload #29
    //   2795: invokevirtual b : ()I
    //   2798: istore #15
    //   2800: aload #20
    //   2802: getfield G : [Lb/g/b/i/c;
    //   2805: astore #26
    //   2807: iload #13
    //   2809: iconst_1
    //   2810: iadd
    //   2811: istore #16
    //   2813: aload #26
    //   2815: iload #16
    //   2817: aaload
    //   2818: invokevirtual b : ()I
    //   2821: istore #14
    //   2823: aload #23
    //   2825: ifnull -> 2858
    //   2828: aload #23
    //   2830: getfield G : [Lb/g/b/i/c;
    //   2833: iload #13
    //   2835: aaload
    //   2836: astore #29
    //   2838: aload #29
    //   2840: getfield g : Lb/g/b/g;
    //   2843: astore #26
    //   2845: aload #20
    //   2847: getfield G : [Lb/g/b/i/c;
    //   2850: iload #16
    //   2852: aaload
    //   2853: astore #30
    //   2855: goto -> 2899
    //   2858: aload #33
    //   2860: getfield G : [Lb/g/b/i/c;
    //   2863: iload #16
    //   2865: aaload
    //   2866: getfield d : Lb/g/b/i/c;
    //   2869: astore #29
    //   2871: aload #29
    //   2873: ifnull -> 2886
    //   2876: aload #29
    //   2878: getfield g : Lb/g/b/g;
    //   2881: astore #26
    //   2883: goto -> 2889
    //   2886: aconst_null
    //   2887: astore #26
    //   2889: aload #20
    //   2891: getfield G : [Lb/g/b/i/c;
    //   2894: iload #16
    //   2896: aaload
    //   2897: astore #30
    //   2899: aload #30
    //   2901: getfield g : Lb/g/b/g;
    //   2904: astore #30
    //   2906: iload #14
    //   2908: istore #7
    //   2910: aload #29
    //   2912: ifnull -> 2925
    //   2915: iload #14
    //   2917: aload #29
    //   2919: invokevirtual b : ()I
    //   2922: iadd
    //   2923: istore #7
    //   2925: iload #7
    //   2927: istore #14
    //   2929: iload #15
    //   2931: istore #7
    //   2933: aload #24
    //   2935: ifnull -> 2954
    //   2938: iload #15
    //   2940: aload #24
    //   2942: getfield G : [Lb/g/b/i/c;
    //   2945: iload #16
    //   2947: aaload
    //   2948: invokevirtual b : ()I
    //   2951: iadd
    //   2952: istore #7
    //   2954: aload #34
    //   2956: ifnull -> 2663
    //   2959: aload #25
    //   2961: ifnull -> 2663
    //   2964: aload #26
    //   2966: ifnull -> 2663
    //   2969: aload #30
    //   2971: ifnull -> 2663
    //   2974: aload #20
    //   2976: aload #27
    //   2978: if_acmpne -> 2994
    //   2981: aload #27
    //   2983: getfield G : [Lb/g/b/i/c;
    //   2986: iload #13
    //   2988: aaload
    //   2989: invokevirtual b : ()I
    //   2992: istore #7
    //   2994: aload #20
    //   2996: aload #32
    //   2998: if_acmpne -> 3014
    //   3001: aload #32
    //   3003: getfield G : [Lb/g/b/i/c;
    //   3006: iload #16
    //   3008: aaload
    //   3009: invokevirtual b : ()I
    //   3012: istore #14
    //   3014: iload #10
    //   3016: ifeq -> 3026
    //   3019: bipush #8
    //   3021: istore #15
    //   3023: goto -> 3029
    //   3026: iconst_5
    //   3027: istore #15
    //   3029: aload_1
    //   3030: aload #34
    //   3032: aload #25
    //   3034: iload #7
    //   3036: ldc_w 0.5
    //   3039: aload #26
    //   3041: aload #30
    //   3043: iload #14
    //   3045: iload #15
    //   3047: invokevirtual b : (Lb/g/b/g;Lb/g/b/g;IFLb/g/b/g;Lb/g/b/g;II)V
    //   3050: aload #20
    //   3052: getfield X : I
    //   3055: bipush #8
    //   3057: if_icmpeq -> 3064
    //   3060: aload #20
    //   3062: astore #24
    //   3064: aload #23
    //   3066: astore #20
    //   3068: goto -> 2603
    //   3071: iload #7
    //   3073: istore #9
    //   3075: goto -> 3661
    //   3078: iload #7
    //   3080: istore #9
    //   3082: iload #11
    //   3084: ifeq -> 3661
    //   3087: iload #7
    //   3089: istore #9
    //   3091: aload #27
    //   3093: ifnull -> 3661
    //   3096: aload #30
    //   3098: getfield j : I
    //   3101: istore #9
    //   3103: iload #9
    //   3105: ifle -> 3124
    //   3108: aload #30
    //   3110: getfield i : I
    //   3113: iload #9
    //   3115: if_icmpne -> 3124
    //   3118: iconst_1
    //   3119: istore #9
    //   3121: goto -> 3127
    //   3124: iconst_0
    //   3125: istore #9
    //   3127: aload #27
    //   3129: astore #23
    //   3131: aload #23
    //   3133: astore #24
    //   3135: aload #24
    //   3137: ifnull -> 3480
    //   3140: aload #24
    //   3142: getfield e0 : [Lb/g/b/i/d;
    //   3145: iload_2
    //   3146: aaload
    //   3147: astore #20
    //   3149: aload #20
    //   3151: ifnull -> 3176
    //   3154: aload #20
    //   3156: getfield X : I
    //   3159: bipush #8
    //   3161: if_icmpne -> 3176
    //   3164: aload #20
    //   3166: getfield e0 : [Lb/g/b/i/d;
    //   3169: iload_2
    //   3170: aaload
    //   3171: astore #20
    //   3173: goto -> 3149
    //   3176: aload #24
    //   3178: aload #27
    //   3180: if_acmpeq -> 3452
    //   3183: aload #24
    //   3185: aload #32
    //   3187: if_acmpeq -> 3452
    //   3190: aload #20
    //   3192: ifnull -> 3452
    //   3195: aload #20
    //   3197: aload #32
    //   3199: if_acmpne -> 3208
    //   3202: aconst_null
    //   3203: astore #20
    //   3205: goto -> 3208
    //   3208: aload #24
    //   3210: getfield G : [Lb/g/b/i/c;
    //   3213: iload #13
    //   3215: aaload
    //   3216: astore #25
    //   3218: aload #25
    //   3220: getfield g : Lb/g/b/g;
    //   3223: astore #30
    //   3225: aload #23
    //   3227: getfield G : [Lb/g/b/i/c;
    //   3230: astore #26
    //   3232: iload #13
    //   3234: iconst_1
    //   3235: iadd
    //   3236: istore #14
    //   3238: aload #26
    //   3240: iload #14
    //   3242: aaload
    //   3243: getfield g : Lb/g/b/g;
    //   3246: astore #34
    //   3248: aload #25
    //   3250: invokevirtual b : ()I
    //   3253: istore #15
    //   3255: aload #24
    //   3257: getfield G : [Lb/g/b/i/c;
    //   3260: iload #14
    //   3262: aaload
    //   3263: invokevirtual b : ()I
    //   3266: istore #10
    //   3268: aload #20
    //   3270: ifnull -> 3311
    //   3273: aload #20
    //   3275: getfield G : [Lb/g/b/i/c;
    //   3278: iload #13
    //   3280: aaload
    //   3281: astore #25
    //   3283: aload #25
    //   3285: getfield g : Lb/g/b/g;
    //   3288: astore #26
    //   3290: aload #25
    //   3292: getfield d : Lb/g/b/i/c;
    //   3295: astore #29
    //   3297: aload #29
    //   3299: ifnull -> 3305
    //   3302: goto -> 3349
    //   3305: aconst_null
    //   3306: astore #29
    //   3308: goto -> 3356
    //   3311: aload #32
    //   3313: getfield G : [Lb/g/b/i/c;
    //   3316: iload #13
    //   3318: aaload
    //   3319: astore #25
    //   3321: aload #25
    //   3323: ifnull -> 3336
    //   3326: aload #25
    //   3328: getfield g : Lb/g/b/g;
    //   3331: astore #26
    //   3333: goto -> 3339
    //   3336: aconst_null
    //   3337: astore #26
    //   3339: aload #24
    //   3341: getfield G : [Lb/g/b/i/c;
    //   3344: iload #14
    //   3346: aaload
    //   3347: astore #29
    //   3349: aload #29
    //   3351: getfield g : Lb/g/b/g;
    //   3354: astore #29
    //   3356: aload #25
    //   3358: ifnull -> 3374
    //   3361: aload #25
    //   3363: invokevirtual b : ()I
    //   3366: iload #10
    //   3368: iadd
    //   3369: istore #10
    //   3371: goto -> 3374
    //   3374: aload #23
    //   3376: getfield G : [Lb/g/b/i/c;
    //   3379: iload #14
    //   3381: aaload
    //   3382: invokevirtual b : ()I
    //   3385: istore #16
    //   3387: iload #9
    //   3389: ifeq -> 3399
    //   3392: bipush #8
    //   3394: istore #14
    //   3396: goto -> 3402
    //   3399: iconst_4
    //   3400: istore #14
    //   3402: aload #30
    //   3404: ifnull -> 3449
    //   3407: aload #34
    //   3409: ifnull -> 3449
    //   3412: aload #26
    //   3414: ifnull -> 3449
    //   3417: aload #29
    //   3419: ifnull -> 3449
    //   3422: aload_1
    //   3423: aload #30
    //   3425: aload #34
    //   3427: iload #16
    //   3429: iload #15
    //   3431: iadd
    //   3432: ldc_w 0.5
    //   3435: aload #26
    //   3437: aload #29
    //   3439: iload #10
    //   3441: iload #14
    //   3443: invokevirtual b : (Lb/g/b/g;Lb/g/b/g;IFLb/g/b/g;Lb/g/b/g;II)V
    //   3446: goto -> 3449
    //   3449: goto -> 3452
    //   3452: aload #24
    //   3454: getfield X : I
    //   3457: bipush #8
    //   3459: if_icmpeq -> 3465
    //   3462: goto -> 3469
    //   3465: aload #23
    //   3467: astore #24
    //   3469: aload #24
    //   3471: astore #23
    //   3473: aload #20
    //   3475: astore #24
    //   3477: goto -> 3135
    //   3480: aload #27
    //   3482: getfield G : [Lb/g/b/i/c;
    //   3485: iload #13
    //   3487: aaload
    //   3488: astore #20
    //   3490: aload #28
    //   3492: getfield G : [Lb/g/b/i/c;
    //   3495: iload #13
    //   3497: aaload
    //   3498: getfield d : Lb/g/b/i/c;
    //   3501: astore #23
    //   3503: aload #32
    //   3505: getfield G : [Lb/g/b/i/c;
    //   3508: astore #24
    //   3510: iload #13
    //   3512: iconst_1
    //   3513: iadd
    //   3514: istore #9
    //   3516: aload #24
    //   3518: iload #9
    //   3520: aaload
    //   3521: astore #24
    //   3523: aload #33
    //   3525: getfield G : [Lb/g/b/i/c;
    //   3528: iload #9
    //   3530: aaload
    //   3531: getfield d : Lb/g/b/i/c;
    //   3534: astore #25
    //   3536: aload #23
    //   3538: ifnull -> 3615
    //   3541: aload #27
    //   3543: aload #32
    //   3545: if_acmpeq -> 3572
    //   3548: aload_1
    //   3549: aload #20
    //   3551: getfield g : Lb/g/b/g;
    //   3554: aload #23
    //   3556: getfield g : Lb/g/b/g;
    //   3559: aload #20
    //   3561: invokevirtual b : ()I
    //   3564: iconst_5
    //   3565: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   3568: pop
    //   3569: goto -> 3615
    //   3572: aload #25
    //   3574: ifnull -> 3615
    //   3577: aload_1
    //   3578: aload #20
    //   3580: getfield g : Lb/g/b/g;
    //   3583: aload #23
    //   3585: getfield g : Lb/g/b/g;
    //   3588: aload #20
    //   3590: invokevirtual b : ()I
    //   3593: ldc_w 0.5
    //   3596: aload #24
    //   3598: getfield g : Lb/g/b/g;
    //   3601: aload #25
    //   3603: getfield g : Lb/g/b/g;
    //   3606: aload #24
    //   3608: invokevirtual b : ()I
    //   3611: iconst_5
    //   3612: invokevirtual b : (Lb/g/b/g;Lb/g/b/g;IFLb/g/b/g;Lb/g/b/g;II)V
    //   3615: iload #7
    //   3617: istore #9
    //   3619: aload #25
    //   3621: ifnull -> 3661
    //   3624: iload #7
    //   3626: istore #9
    //   3628: aload #27
    //   3630: aload #32
    //   3632: if_acmpeq -> 3661
    //   3635: aload_1
    //   3636: aload #24
    //   3638: getfield g : Lb/g/b/g;
    //   3641: aload #25
    //   3643: getfield g : Lb/g/b/g;
    //   3646: aload #24
    //   3648: invokevirtual b : ()I
    //   3651: ineg
    //   3652: iconst_5
    //   3653: invokevirtual d : (Lb/g/b/g;Lb/g/b/g;II)Lb/g/b/b;
    //   3656: pop
    //   3657: iload #7
    //   3659: istore #9
    //   3661: iload #12
    //   3663: ifne -> 3671
    //   3666: iload #11
    //   3668: ifeq -> 3886
    //   3671: aload #27
    //   3673: ifnull -> 3886
    //   3676: aload #27
    //   3678: aload #32
    //   3680: if_acmpeq -> 3886
    //   3683: aload #27
    //   3685: getfield G : [Lb/g/b/i/c;
    //   3688: iload #13
    //   3690: aaload
    //   3691: astore #25
    //   3693: aload #32
    //   3695: getfield G : [Lb/g/b/i/c;
    //   3698: astore #20
    //   3700: iload #13
    //   3702: iconst_1
    //   3703: iadd
    //   3704: istore #10
    //   3706: aload #20
    //   3708: iload #10
    //   3710: aaload
    //   3711: astore #24
    //   3713: aload #25
    //   3715: getfield d : Lb/g/b/i/c;
    //   3718: astore #20
    //   3720: aload #20
    //   3722: ifnull -> 3735
    //   3725: aload #20
    //   3727: getfield g : Lb/g/b/g;
    //   3730: astore #23
    //   3732: goto -> 3738
    //   3735: aconst_null
    //   3736: astore #23
    //   3738: aload #24
    //   3740: getfield d : Lb/g/b/i/c;
    //   3743: astore #20
    //   3745: aload #20
    //   3747: ifnull -> 3760
    //   3750: aload #20
    //   3752: getfield g : Lb/g/b/g;
    //   3755: astore #20
    //   3757: goto -> 3763
    //   3760: aconst_null
    //   3761: astore #20
    //   3763: aload #33
    //   3765: aload #32
    //   3767: if_acmpeq -> 3802
    //   3770: aload #33
    //   3772: getfield G : [Lb/g/b/i/c;
    //   3775: iload #10
    //   3777: aaload
    //   3778: getfield d : Lb/g/b/i/c;
    //   3781: astore #26
    //   3783: aload #31
    //   3785: astore #20
    //   3787: aload #26
    //   3789: ifnull -> 3799
    //   3792: aload #26
    //   3794: getfield g : Lb/g/b/g;
    //   3797: astore #20
    //   3799: goto -> 3802
    //   3802: aload #27
    //   3804: aload #32
    //   3806: if_acmpne -> 3830
    //   3809: aload #27
    //   3811: getfield G : [Lb/g/b/i/c;
    //   3814: astore #24
    //   3816: aload #24
    //   3818: iload #13
    //   3820: aaload
    //   3821: astore #25
    //   3823: aload #24
    //   3825: iload #10
    //   3827: aaload
    //   3828: astore #24
    //   3830: aload #23
    //   3832: ifnull -> 3886
    //   3835: aload #20
    //   3837: ifnull -> 3886
    //   3840: aload #25
    //   3842: invokevirtual b : ()I
    //   3845: istore #7
    //   3847: aload #32
    //   3849: getfield G : [Lb/g/b/i/c;
    //   3852: iload #10
    //   3854: aaload
    //   3855: invokevirtual b : ()I
    //   3858: istore #10
    //   3860: aload_1
    //   3861: aload #25
    //   3863: getfield g : Lb/g/b/g;
    //   3866: aload #23
    //   3868: iload #7
    //   3870: ldc_w 0.5
    //   3873: aload #20
    //   3875: aload #24
    //   3877: getfield g : Lb/g/b/g;
    //   3880: iload #10
    //   3882: iconst_5
    //   3883: invokevirtual b : (Lb/g/b/g;Lb/g/b/g;IFLb/g/b/g;Lb/g/b/g;II)V
    //   3886: iload #9
    //   3888: iconst_1
    //   3889: iadd
    //   3890: istore #7
    //   3892: aload #22
    //   3894: astore #20
    //   3896: iload #8
    //   3898: istore #10
    //   3900: aload #21
    //   3902: astore #22
    //   3904: goto -> 45
    //   3907: return
  }
  
  public static TypedArray a0(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfint) {
    return (paramTheme == null) ? paramResources.obtainAttributes(paramAttributeSet, paramArrayOfint) : paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfint, 0, 0);
  }
  
  public static boolean b(int paramInt, Rect paramRect1, Rect paramRect2, Rect paramRect3) {
    // Byte code:
    //   0: iload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokestatic c : (ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z
    //   6: istore #7
    //   8: iload_0
    //   9: aload_1
    //   10: aload_3
    //   11: invokestatic c : (ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z
    //   14: istore #8
    //   16: iconst_0
    //   17: istore #6
    //   19: iload #8
    //   21: ifne -> 270
    //   24: iload #7
    //   26: ifne -> 32
    //   29: goto -> 270
    //   32: iload_0
    //   33: bipush #17
    //   35: if_icmpeq -> 110
    //   38: iload_0
    //   39: bipush #33
    //   41: if_icmpeq -> 96
    //   44: iload_0
    //   45: bipush #66
    //   47: if_icmpeq -> 82
    //   50: iload_0
    //   51: sipush #130
    //   54: if_icmpne -> 71
    //   57: aload_1
    //   58: getfield bottom : I
    //   61: aload_3
    //   62: getfield top : I
    //   65: if_icmpgt -> 127
    //   68: goto -> 121
    //   71: new java/lang/IllegalArgumentException
    //   74: dup
    //   75: ldc_w 'direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.'
    //   78: invokespecial <init> : (Ljava/lang/String;)V
    //   81: athrow
    //   82: aload_1
    //   83: getfield right : I
    //   86: aload_3
    //   87: getfield left : I
    //   90: if_icmpgt -> 127
    //   93: goto -> 121
    //   96: aload_1
    //   97: getfield top : I
    //   100: aload_3
    //   101: getfield bottom : I
    //   104: if_icmplt -> 127
    //   107: goto -> 121
    //   110: aload_1
    //   111: getfield left : I
    //   114: aload_3
    //   115: getfield right : I
    //   118: if_icmplt -> 127
    //   121: iconst_1
    //   122: istore #4
    //   124: goto -> 130
    //   127: iconst_0
    //   128: istore #4
    //   130: iload #4
    //   132: ifne -> 137
    //   135: iconst_1
    //   136: ireturn
    //   137: iload_0
    //   138: bipush #17
    //   140: if_icmpeq -> 268
    //   143: iload_0
    //   144: bipush #66
    //   146: if_icmpne -> 152
    //   149: goto -> 268
    //   152: iload_0
    //   153: aload_1
    //   154: aload_2
    //   155: invokestatic W : (ILandroid/graphics/Rect;Landroid/graphics/Rect;)I
    //   158: istore #5
    //   160: iload_0
    //   161: bipush #17
    //   163: if_icmpeq -> 238
    //   166: iload_0
    //   167: bipush #33
    //   169: if_icmpeq -> 224
    //   172: iload_0
    //   173: bipush #66
    //   175: if_icmpeq -> 210
    //   178: iload_0
    //   179: sipush #130
    //   182: if_icmpne -> 199
    //   185: aload_3
    //   186: getfield bottom : I
    //   189: istore_0
    //   190: aload_1
    //   191: getfield bottom : I
    //   194: istore #4
    //   196: goto -> 249
    //   199: new java/lang/IllegalArgumentException
    //   202: dup
    //   203: ldc_w 'direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.'
    //   206: invokespecial <init> : (Ljava/lang/String;)V
    //   209: athrow
    //   210: aload_3
    //   211: getfield right : I
    //   214: istore_0
    //   215: aload_1
    //   216: getfield right : I
    //   219: istore #4
    //   221: goto -> 249
    //   224: aload_1
    //   225: getfield top : I
    //   228: istore_0
    //   229: aload_3
    //   230: getfield top : I
    //   233: istore #4
    //   235: goto -> 249
    //   238: aload_1
    //   239: getfield left : I
    //   242: istore_0
    //   243: aload_3
    //   244: getfield left : I
    //   247: istore #4
    //   249: iload #5
    //   251: iconst_1
    //   252: iload_0
    //   253: iload #4
    //   255: isub
    //   256: invokestatic max : (II)I
    //   259: if_icmpge -> 265
    //   262: iconst_1
    //   263: istore #6
    //   265: iload #6
    //   267: ireturn
    //   268: iconst_1
    //   269: ireturn
    //   270: iconst_0
    //   271: ireturn
  }
  
  public static <T> ObjectAnimator b0(T paramT, Property<T, PointF> paramProperty, Path paramPath) {
    return ObjectAnimator.ofObject(paramT, paramProperty, null, paramPath);
  }
  
  public static boolean c(int paramInt, Rect paramRect1, Rect paramRect2) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_1
    //   3: istore #4
    //   5: iload_0
    //   6: bipush #17
    //   8: if_icmpeq -> 76
    //   11: iload_0
    //   12: bipush #33
    //   14: if_icmpeq -> 44
    //   17: iload_0
    //   18: bipush #66
    //   20: if_icmpeq -> 76
    //   23: iload_0
    //   24: sipush #130
    //   27: if_icmpne -> 33
    //   30: goto -> 44
    //   33: new java/lang/IllegalArgumentException
    //   36: dup
    //   37: ldc_w 'direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.'
    //   40: invokespecial <init> : (Ljava/lang/String;)V
    //   43: athrow
    //   44: aload_2
    //   45: getfield right : I
    //   48: aload_1
    //   49: getfield left : I
    //   52: if_icmplt -> 72
    //   55: aload_2
    //   56: getfield left : I
    //   59: aload_1
    //   60: getfield right : I
    //   63: if_icmpgt -> 72
    //   66: iload #4
    //   68: istore_3
    //   69: goto -> 74
    //   72: iconst_0
    //   73: istore_3
    //   74: iload_3
    //   75: ireturn
    //   76: aload_2
    //   77: getfield bottom : I
    //   80: aload_1
    //   81: getfield top : I
    //   84: if_icmplt -> 101
    //   87: aload_2
    //   88: getfield top : I
    //   91: aload_1
    //   92: getfield bottom : I
    //   95: if_icmpgt -> 101
    //   98: goto -> 103
    //   101: iconst_0
    //   102: istore_3
    //   103: iload_3
    //   104: ireturn
  }
  
  public static InputConnection c0(InputConnection paramInputConnection, EditorInfo paramEditorInfo, View paramView) {
    if (paramInputConnection != null && paramEditorInfo.hintText == null)
      for (ViewParent viewParent = paramView.getParent(); viewParent instanceof View; viewParent = viewParent.getParent()) {
        if (viewParent instanceof e1) {
          paramEditorInfo.hintText = ((e1)viewParent).a();
          break;
        } 
      }  
    return paramInputConnection;
  }
  
  public static void d(Object paramObject, StringBuilder paramStringBuilder) {
    if (paramObject == null) {
      paramObject = "null";
    } else {
      String str2 = paramObject.getClass().getSimpleName();
      String str1 = str2;
      if (str2.length() <= 0) {
        str2 = paramObject.getClass().getName();
        int i = str2.lastIndexOf('.');
        str1 = str2;
        if (i > 0)
          str1 = str2.substring(i + 1); 
      } 
      paramStringBuilder.append(str1);
      paramStringBuilder.append('{');
      paramObject = Integer.toHexString(System.identityHashCode(paramObject));
    } 
    paramStringBuilder.append((String)paramObject);
  }
  
  public static boolean d0(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    try {
      return paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
    } catch (AbstractMethodError abstractMethodError) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ViewParent ");
      stringBuilder.append(paramViewParent);
      stringBuilder.append(" does not implement interface method onNestedFling");
      Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
      return false;
    } 
  }
  
  public static boolean e(c[] paramArrayOfc1, c[] paramArrayOfc2) {
    if (paramArrayOfc1 == null || paramArrayOfc2 == null)
      return false; 
    if (paramArrayOfc1.length != paramArrayOfc2.length)
      return false; 
    for (byte b = 0; b < paramArrayOfc1.length; b++) {
      if ((paramArrayOfc1[b]).a != (paramArrayOfc2[b]).a || (paramArrayOfc1[b]).b.length != (paramArrayOfc2[b]).b.length)
        return false; 
    } 
    return true;
  }
  
  public static boolean e0(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2) {
    try {
      return paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);
    } catch (AbstractMethodError abstractMethodError) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ViewParent ");
      stringBuilder.append(paramViewParent);
      stringBuilder.append(" does not implement interface method onNestedPreFling");
      Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
      return false;
    } 
  }
  
  public static int f(int paramInt) {
    if (paramInt >= 0)
      return paramInt; 
    throw new IllegalArgumentException();
  }
  
  public static void f0(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    if (paramViewParent instanceof g) {
      ((g)paramViewParent).n(paramView, paramInt1, paramInt2, paramArrayOfint, paramInt3);
    } else if (paramInt3 == 0) {
      try {
        paramViewParent.onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfint);
      } catch (AbstractMethodError abstractMethodError) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ViewParent ");
        stringBuilder.append(paramViewParent);
        stringBuilder.append(" does not implement interface method onNestedPreScroll");
        Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
      } 
    } 
  }
  
  public static <T> T g(T paramT) {
    if (paramT != null)
      return paramT; 
    throw null;
  }
  
  public static void g0(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {
    if (paramViewParent instanceof h) {
      ((h)paramViewParent).k(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramArrayOfint);
    } else {
      paramArrayOfint[0] = paramArrayOfint[0] + paramInt3;
      paramArrayOfint[1] = paramArrayOfint[1] + paramInt4;
      if (paramViewParent instanceof g) {
        ((g)paramViewParent).l(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
      } else if (paramInt5 == 0) {
        try {
          paramViewParent.onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
        } catch (AbstractMethodError abstractMethodError) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("ViewParent ");
          stringBuilder.append(paramViewParent);
          stringBuilder.append(" does not implement interface method onNestedScroll");
          Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
        } 
      } 
    } 
  }
  
  public static <T> T h(T paramT, Object paramObject) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(String.valueOf(paramObject));
  }
  
  public static b h0(XmlPullParser paramXmlPullParser, Resources paramResources) {
    int i;
    while (true) {
      i = paramXmlPullParser.next();
      if (i != 2 && i != 1)
        continue; 
      break;
    } 
    if (i == 2) {
      c c;
      e e1;
      e e2 = null;
      paramXmlPullParser.require(2, null, "font-family");
      if (paramXmlPullParser.getName().equals("font-family")) {
        TypedArray typedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlPullParser), c.FontFamily);
        String str3 = typedArray.getString(c.FontFamily_fontProviderAuthority);
        String str1 = typedArray.getString(c.FontFamily_fontProviderPackage);
        String str2 = typedArray.getString(c.FontFamily_fontProviderQuery);
        int k = typedArray.getResourceId(c.FontFamily_fontProviderCerts, 0);
        i = typedArray.getInteger(c.FontFamily_fontProviderFetchStrategy, 1);
        int j = typedArray.getInteger(c.FontFamily_fontProviderFetchTimeout, 500);
        typedArray.recycle();
        if (str3 != null && str1 != null && str2 != null) {
          while (paramXmlPullParser.next() != 3)
            z0(paramXmlPullParser); 
          e1 = new e(new b.i.j.a(str3, str1, str2, l0(paramResources, k)), i, j);
        } else {
          ArrayList<d> arrayList = new ArrayList();
          while (e1.next() != 3) {
            if (e1.getEventType() != 2)
              continue; 
            if (e1.getName().equals("font")) {
              boolean bool;
              typedArray = paramResources.obtainAttributes(Xml.asAttributeSet((XmlPullParser)e1), c.FontFamilyFont);
              if (typedArray.hasValue(c.FontFamilyFont_fontWeight)) {
                i = c.FontFamilyFont_fontWeight;
              } else {
                i = c.FontFamilyFont_android_fontWeight;
              } 
              k = typedArray.getInt(i, 400);
              if (typedArray.hasValue(c.FontFamilyFont_fontStyle)) {
                i = c.FontFamilyFont_fontStyle;
              } else {
                i = c.FontFamilyFont_android_fontStyle;
              } 
              if (1 == typedArray.getInt(i, 0)) {
                bool = true;
              } else {
                bool = false;
              } 
              if (typedArray.hasValue(c.FontFamilyFont_ttcIndex)) {
                i = c.FontFamilyFont_ttcIndex;
              } else {
                i = c.FontFamilyFont_android_ttcIndex;
              } 
              if (typedArray.hasValue(c.FontFamilyFont_fontVariationSettings)) {
                j = c.FontFamilyFont_fontVariationSettings;
              } else {
                j = c.FontFamilyFont_android_fontVariationSettings;
              } 
              str1 = typedArray.getString(j);
              j = typedArray.getInt(i, 0);
              if (typedArray.hasValue(c.FontFamilyFont_font)) {
                i = c.FontFamilyFont_font;
              } else {
                i = c.FontFamilyFont_android_font;
              } 
              int m = typedArray.getResourceId(i, 0);
              str3 = typedArray.getString(i);
              typedArray.recycle();
              while (e1.next() != 3)
                z0((XmlPullParser)e1); 
              arrayList.add(new d(str3, k, bool, str1, j, m));
              continue;
            } 
            z0((XmlPullParser)e1);
          } 
          if (arrayList.isEmpty()) {
            e1 = e2;
          } else {
            c = new c(arrayList.<d>toArray(new d[arrayList.size()]));
          } 
        } 
      } else {
        z0((XmlPullParser)c);
        e1 = e2;
      } 
      return (b)e1;
    } 
    throw new XmlPullParserException("No start tag found");
  }
  
  public static int i(Context paramContext, String paramString) {
    int i = Process.myPid();
    int j = Process.myUid();
    String str = paramContext.getPackageName();
    int k = paramContext.checkPermission(paramString, i, j);
    i = 0;
    if (k == -1)
      return -1; 
    if (Build.VERSION.SDK_INT >= 23) {
      paramString = AppOpsManager.permissionToOp(paramString);
    } else {
      paramString = null;
    } 
    if (paramString != null) {
      String str1 = str;
      if (str == null) {
        String[] arrayOfString = paramContext.getPackageManager().getPackagesForUid(j);
        if (arrayOfString == null || arrayOfString.length <= 0)
          return -1; 
        str1 = arrayOfString[0];
      } 
      if (Build.VERSION.SDK_INT >= 23) {
        j = ((AppOpsManager)paramContext.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(paramString, str1);
      } else {
        j = 1;
      } 
      if (j != 0)
        i = -2; 
    } 
    return i;
  }
  
  public static b.a i0(l paraml) {
    // Byte code:
    //   0: invokestatic currentTimeMillis : ()J
    //   3: lstore #13
    //   5: aload_0
    //   6: getfield b : Ljava/util/Map;
    //   9: astore #15
    //   11: aload #15
    //   13: ldc_w 'Date'
    //   16: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   21: checkcast java/lang/String
    //   24: astore #16
    //   26: aload #16
    //   28: ifnull -> 41
    //   31: aload #16
    //   33: invokestatic k0 : (Ljava/lang/String;)J
    //   36: lstore #7
    //   38: goto -> 44
    //   41: lconst_0
    //   42: lstore #7
    //   44: aload #15
    //   46: ldc_w 'Cache-Control'
    //   49: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   54: checkcast java/lang/String
    //   57: astore #16
    //   59: iconst_0
    //   60: istore_1
    //   61: iconst_0
    //   62: istore_2
    //   63: aload #16
    //   65: ifnull -> 244
    //   68: aload #16
    //   70: ldc_w ','
    //   73: iconst_0
    //   74: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   77: astore #16
    //   79: iconst_0
    //   80: istore_1
    //   81: lconst_0
    //   82: lstore #5
    //   84: lconst_0
    //   85: lstore_3
    //   86: iload_2
    //   87: aload #16
    //   89: arraylength
    //   90: if_icmpge -> 239
    //   93: aload #16
    //   95: iload_2
    //   96: aaload
    //   97: invokevirtual trim : ()Ljava/lang/String;
    //   100: astore #17
    //   102: aload #17
    //   104: ldc_w 'no-cache'
    //   107: invokevirtual equals : (Ljava/lang/Object;)Z
    //   110: ifne -> 237
    //   113: aload #17
    //   115: ldc_w 'no-store'
    //   118: invokevirtual equals : (Ljava/lang/Object;)Z
    //   121: ifeq -> 127
    //   124: goto -> 237
    //   127: aload #17
    //   129: ldc_w 'max-age='
    //   132: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   135: ifeq -> 156
    //   138: aload #17
    //   140: bipush #8
    //   142: invokevirtual substring : (I)Ljava/lang/String;
    //   145: invokestatic parseLong : (Ljava/lang/String;)J
    //   148: lstore #9
    //   150: lload_3
    //   151: lstore #11
    //   153: goto -> 224
    //   156: aload #17
    //   158: ldc_w 'stale-while-revalidate='
    //   161: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   164: ifeq -> 186
    //   167: aload #17
    //   169: bipush #23
    //   171: invokevirtual substring : (I)Ljava/lang/String;
    //   174: invokestatic parseLong : (Ljava/lang/String;)J
    //   177: lstore #11
    //   179: lload #5
    //   181: lstore #9
    //   183: goto -> 224
    //   186: aload #17
    //   188: ldc_w 'must-revalidate'
    //   191: invokevirtual equals : (Ljava/lang/Object;)Z
    //   194: ifne -> 215
    //   197: lload #5
    //   199: lstore #9
    //   201: lload_3
    //   202: lstore #11
    //   204: aload #17
    //   206: ldc_w 'proxy-revalidate'
    //   209: invokevirtual equals : (Ljava/lang/Object;)Z
    //   212: ifeq -> 224
    //   215: iconst_1
    //   216: istore_1
    //   217: lload_3
    //   218: lstore #11
    //   220: lload #5
    //   222: lstore #9
    //   224: iinc #2, 1
    //   227: lload #9
    //   229: lstore #5
    //   231: lload #11
    //   233: lstore_3
    //   234: goto -> 86
    //   237: aconst_null
    //   238: areturn
    //   239: iconst_1
    //   240: istore_2
    //   241: goto -> 251
    //   244: iconst_0
    //   245: istore_2
    //   246: lconst_0
    //   247: lstore #5
    //   249: lconst_0
    //   250: lstore_3
    //   251: aload #15
    //   253: ldc_w 'Expires'
    //   256: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   261: checkcast java/lang/String
    //   264: astore #16
    //   266: aload #16
    //   268: ifnull -> 281
    //   271: aload #16
    //   273: invokestatic k0 : (Ljava/lang/String;)J
    //   276: lstore #11
    //   278: goto -> 284
    //   281: lconst_0
    //   282: lstore #11
    //   284: aload #15
    //   286: ldc_w 'Last-Modified'
    //   289: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   294: checkcast java/lang/String
    //   297: astore #16
    //   299: aload #16
    //   301: ifnull -> 314
    //   304: aload #16
    //   306: invokestatic k0 : (Ljava/lang/String;)J
    //   309: lstore #9
    //   311: goto -> 317
    //   314: lconst_0
    //   315: lstore #9
    //   317: aload #15
    //   319: ldc_w 'ETag'
    //   322: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   327: checkcast java/lang/String
    //   330: astore #16
    //   332: iload_2
    //   333: ifeq -> 384
    //   336: lload #13
    //   338: lload #5
    //   340: ldc2_w 1000
    //   343: lmul
    //   344: ladd
    //   345: lstore #5
    //   347: iload_1
    //   348: ifeq -> 357
    //   351: lload #5
    //   353: lstore_3
    //   354: goto -> 371
    //   357: lload_3
    //   358: invokestatic signum : (J)I
    //   361: pop
    //   362: lload_3
    //   363: ldc2_w 1000
    //   366: lmul
    //   367: lload #5
    //   369: ladd
    //   370: lstore_3
    //   371: lload_3
    //   372: lstore #11
    //   374: lload #5
    //   376: lstore_3
    //   377: lload #11
    //   379: lstore #5
    //   381: goto -> 419
    //   384: lconst_0
    //   385: lstore #5
    //   387: lload #7
    //   389: lconst_0
    //   390: lcmp
    //   391: ifle -> 417
    //   394: lload #11
    //   396: lload #7
    //   398: lcmp
    //   399: iflt -> 417
    //   402: lload #13
    //   404: lload #11
    //   406: lload #7
    //   408: lsub
    //   409: ladd
    //   410: lstore_3
    //   411: lload_3
    //   412: lstore #5
    //   414: goto -> 419
    //   417: lconst_0
    //   418: lstore_3
    //   419: new c/a/b/b$a
    //   422: dup
    //   423: invokespecial <init> : ()V
    //   426: astore #17
    //   428: aload #17
    //   430: aload_0
    //   431: getfield a : [B
    //   434: putfield a : [B
    //   437: aload #17
    //   439: aload #16
    //   441: putfield b : Ljava/lang/String;
    //   444: aload #17
    //   446: lload_3
    //   447: putfield f : J
    //   450: aload #17
    //   452: lload #5
    //   454: putfield e : J
    //   457: aload #17
    //   459: lload #7
    //   461: putfield c : J
    //   464: aload #17
    //   466: lload #9
    //   468: putfield d : J
    //   471: aload #17
    //   473: aload #15
    //   475: putfield g : Ljava/util/Map;
    //   478: aload #17
    //   480: aload_0
    //   481: getfield c : Ljava/util/List;
    //   484: putfield h : Ljava/util/List;
    //   487: aload #17
    //   489: areturn
    //   490: astore #17
    //   492: lload #5
    //   494: lstore #9
    //   496: lload_3
    //   497: lstore #11
    //   499: goto -> 224
    // Exception table:
    //   from	to	target	type
    //   138	150	490	java/lang/Exception
    //   167	179	490	java/lang/Exception
  }
  
  public static int j(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 < paramInt2) ? paramInt2 : ((paramInt1 > paramInt3) ? paramInt3 : paramInt1);
  }
  
  public static String j0(Map<String, String> paramMap, String paramString) {
    String str = paramMap.get("Content-Type");
    if (str != null) {
      String[] arrayOfString = str.split(";", 0);
      for (byte b = 1; b < arrayOfString.length; b++) {
        String[] arrayOfString1 = arrayOfString[b].trim().split("=", 0);
        if (arrayOfString1.length == 2 && arrayOfString1[0].equals("charset"))
          return arrayOfString1[1]; 
      } 
    } 
    return paramString;
  }
  
  public static void k(Drawable paramDrawable) {
    int i = Build.VERSION.SDK_INT;
    paramDrawable.clearColorFilter();
    if (i < 23) {
      if (paramDrawable instanceof InsetDrawable) {
        paramDrawable = ((InsetDrawable)paramDrawable).getDrawable();
      } else if (paramDrawable instanceof b) {
        paramDrawable = ((b)paramDrawable).a();
      } else {
        if (paramDrawable instanceof DrawableContainer) {
          DrawableContainer.DrawableContainerState drawableContainerState = (DrawableContainer.DrawableContainerState)((DrawableContainer)paramDrawable).getConstantState();
          if (drawableContainerState != null) {
            i = 0;
            int j = drawableContainerState.getChildCount();
            while (i < j) {
              paramDrawable = drawableContainerState.getChild(i);
              if (paramDrawable != null)
                k(paramDrawable); 
              i++;
            } 
          } 
        } 
        return;
      } 
      k(paramDrawable);
    } 
  }
  
  public static long k0(String paramString) {
    try {
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
      this("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
      simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
      return simpleDateFormat.parse(paramString).getTime();
    } catch (ParseException parseException) {
      Log.e("Volley", v.a("Unable to parse dateStr: %s, falling back to 0", new Object[] { paramString }), parseException);
      return 0L;
    } 
  }
  
  public static int l(RecyclerView.a0 parama0, t paramt, View paramView1, View paramView2, RecyclerView.o paramo, boolean paramBoolean) {
    if (paramo.y() == 0 || parama0.b() == 0 || paramView1 == null || paramView2 == null)
      return 0; 
    if (!paramBoolean)
      return Math.abs(paramo.P(paramView1) - paramo.P(paramView2)) + 1; 
    int i = paramt.b(paramView2);
    int j = paramt.e(paramView1);
    return Math.min(paramt.l(), i - j);
  }
  
  public static List<List<byte[]>> l0(Resources paramResources, int paramInt) {
    if (paramInt == 0)
      return Collections.emptyList(); 
    TypedArray typedArray = paramResources.obtainTypedArray(paramInt);
    try {
      List<?> list;
      if (typedArray.length() == 0) {
        list = Collections.emptyList();
        return (List)list;
      } 
      ArrayList<List<byte[]>> arrayList = new ArrayList();
      this();
      if (typedArray.getType(0) == 1) {
        for (paramInt = 0; paramInt < typedArray.length(); paramInt++) {
          int i = typedArray.getResourceId(paramInt, 0);
          if (i != 0)
            arrayList.add(A0(list.getStringArray(i))); 
        } 
      } else {
        arrayList.add(A0(list.getStringArray(paramInt)));
      } 
      return arrayList;
    } finally {
      typedArray.recycle();
    } 
  }
  
  public static int m(RecyclerView.a0 parama0, t paramt, View paramView1, View paramView2, RecyclerView.o paramo, boolean paramBoolean1, boolean paramBoolean2) {
    if (paramo.y() == 0 || parama0.b() == 0 || paramView1 == null || paramView2 == null)
      return 0; 
    int i = Math.min(paramo.P(paramView1), paramo.P(paramView2));
    int j = Math.max(paramo.P(paramView1), paramo.P(paramView2));
    if (paramBoolean2) {
      i = Math.max(0, parama0.b() - j - 1);
    } else {
      i = Math.max(0, i);
    } 
    if (!paramBoolean1)
      return i; 
    j = Math.abs(paramt.b(paramView2) - paramt.e(paramView1));
    int k = Math.abs(paramo.P(paramView1) - paramo.P(paramView2));
    float f = j / (k + 1);
    return Math.round(i * f + (paramt.k() - paramt.e(paramView1)));
  }
  
  public static void m0(TextView paramTextView, int paramInt) {
    int i;
    f(paramInt);
    if (Build.VERSION.SDK_INT >= 28) {
      paramTextView.setFirstBaselineToTopHeight(paramInt);
      return;
    } 
    Paint.FontMetricsInt fontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
    if (paramTextView.getIncludeFontPadding()) {
      i = fontMetricsInt.top;
    } else {
      i = fontMetricsInt.ascent;
    } 
    if (paramInt > Math.abs(i))
      paramTextView.setPadding(paramTextView.getPaddingLeft(), paramInt + i, paramTextView.getPaddingRight(), paramTextView.getPaddingBottom()); 
  }
  
  public static int n(RecyclerView.a0 parama0, t paramt, View paramView1, View paramView2, RecyclerView.o paramo, boolean paramBoolean) {
    if (paramo.y() == 0 || parama0.b() == 0 || paramView1 == null || paramView2 == null)
      return 0; 
    if (!paramBoolean)
      return parama0.b(); 
    int i = paramt.b(paramView2);
    int j = paramt.e(paramView1);
    int k = Math.abs(paramo.P(paramView1) - paramo.P(paramView2));
    return (int)((i - j) / (k + 1) * parama0.b());
  }
  
  public static void n0(TextView paramTextView, int paramInt) {
    int i;
    f(paramInt);
    Paint.FontMetricsInt fontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
    if (paramTextView.getIncludeFontPadding()) {
      i = fontMetricsInt.bottom;
    } else {
      i = fontMetricsInt.descent;
    } 
    if (paramInt > Math.abs(i))
      paramTextView.setPadding(paramTextView.getPaddingLeft(), paramTextView.getPaddingTop(), paramTextView.getPaddingRight(), paramInt - i); 
  }
  
  public static float[] o(float[] paramArrayOffloat, int paramInt1, int paramInt2) {
    if (paramInt1 <= paramInt2) {
      int i = paramArrayOffloat.length;
      if (paramInt1 >= 0 && paramInt1 <= i) {
        paramInt2 -= paramInt1;
        i = Math.min(paramInt2, i - paramInt1);
        float[] arrayOfFloat = new float[paramInt2];
        System.arraycopy(paramArrayOffloat, paramInt1, arrayOfFloat, 0, i);
        return arrayOfFloat;
      } 
      throw new ArrayIndexOutOfBoundsException();
    } 
    throw new IllegalArgumentException();
  }
  
  public static boolean o0(Drawable paramDrawable, int paramInt) {
    if (Build.VERSION.SDK_INT >= 23)
      return paramDrawable.setLayoutDirection(paramInt); 
    if (!j) {
      try {
        Method method1 = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[] { int.class });
        i = method1;
        method1.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", noSuchMethodException);
      } 
      j = true;
    } 
    Method method = i;
    if (method != null)
      try {
        method.invoke(paramDrawable, new Object[] { Integer.valueOf(paramInt) });
        return true;
      } catch (Exception exception) {
        Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", exception);
        i = null;
      }  
    return false;
  }
  
  public static boolean p(File paramFile, Resources paramResources, int paramInt) {
    try {
      InputStream inputStream = paramResources.openRawResource(paramInt);
    } finally {
      paramFile = null;
    } 
    if (paramResources != null)
      try {
        paramResources.close();
      } catch (IOException iOException) {} 
    throw paramFile;
  }
  
  public static void p0(TextView paramTextView, int paramInt) {
    f(paramInt);
    int i = paramTextView.getPaint().getFontMetricsInt(null);
    if (paramInt != i)
      paramTextView.setLineSpacing((paramInt - i), 1.0F); 
  }
  
  public static boolean q(File paramFile, InputStream paramInputStream) {
    // Byte code:
    //   0: invokestatic allowThreadDiskWrites : ()Landroid/os/StrictMode$ThreadPolicy;
    //   3: astore #7
    //   5: aconst_null
    //   6: astore #5
    //   8: aconst_null
    //   9: astore #6
    //   11: aload #6
    //   13: astore_3
    //   14: new java/io/FileOutputStream
    //   17: astore #4
    //   19: aload #6
    //   21: astore_3
    //   22: aload #4
    //   24: aload_0
    //   25: iconst_0
    //   26: invokespecial <init> : (Ljava/io/File;Z)V
    //   29: sipush #1024
    //   32: newarray byte
    //   34: astore_0
    //   35: aload_1
    //   36: aload_0
    //   37: invokevirtual read : ([B)I
    //   40: istore_2
    //   41: iload_2
    //   42: iconst_m1
    //   43: if_icmpeq -> 57
    //   46: aload #4
    //   48: aload_0
    //   49: iconst_0
    //   50: iload_2
    //   51: invokevirtual write : ([BII)V
    //   54: goto -> 35
    //   57: aload #4
    //   59: invokevirtual close : ()V
    //   62: aload #7
    //   64: invokestatic setThreadPolicy : (Landroid/os/StrictMode$ThreadPolicy;)V
    //   67: iconst_1
    //   68: ireturn
    //   69: astore_0
    //   70: aload #4
    //   72: astore_3
    //   73: goto -> 159
    //   76: astore_1
    //   77: aload #4
    //   79: astore_0
    //   80: goto -> 91
    //   83: astore_0
    //   84: goto -> 159
    //   87: astore_1
    //   88: aload #5
    //   90: astore_0
    //   91: aload_0
    //   92: astore_3
    //   93: new java/lang/StringBuilder
    //   96: astore #4
    //   98: aload_0
    //   99: astore_3
    //   100: aload #4
    //   102: invokespecial <init> : ()V
    //   105: aload_0
    //   106: astore_3
    //   107: aload #4
    //   109: ldc_w 'Error copying resource contents to temp file: '
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload_0
    //   117: astore_3
    //   118: aload #4
    //   120: aload_1
    //   121: invokevirtual getMessage : ()Ljava/lang/String;
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: aload_0
    //   129: astore_3
    //   130: ldc_w 'TypefaceCompatUtil'
    //   133: aload #4
    //   135: invokevirtual toString : ()Ljava/lang/String;
    //   138: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   141: pop
    //   142: aload_0
    //   143: ifnull -> 152
    //   146: aload_0
    //   147: invokeinterface close : ()V
    //   152: aload #7
    //   154: invokestatic setThreadPolicy : (Landroid/os/StrictMode$ThreadPolicy;)V
    //   157: iconst_0
    //   158: ireturn
    //   159: aload_3
    //   160: ifnull -> 169
    //   163: aload_3
    //   164: invokeinterface close : ()V
    //   169: aload #7
    //   171: invokestatic setThreadPolicy : (Landroid/os/StrictMode$ThreadPolicy;)V
    //   174: aload_0
    //   175: athrow
    //   176: astore_0
    //   177: goto -> 62
    //   180: astore_0
    //   181: goto -> 152
    //   184: astore_1
    //   185: goto -> 169
    // Exception table:
    //   from	to	target	type
    //   14	19	87	java/io/IOException
    //   14	19	83	finally
    //   22	29	87	java/io/IOException
    //   22	29	83	finally
    //   29	35	76	java/io/IOException
    //   29	35	69	finally
    //   35	41	76	java/io/IOException
    //   35	41	69	finally
    //   46	54	76	java/io/IOException
    //   46	54	69	finally
    //   57	62	176	java/io/IOException
    //   93	98	83	finally
    //   100	105	83	finally
    //   107	116	83	finally
    //   118	128	83	finally
    //   130	142	83	finally
    //   146	152	180	java/io/IOException
    //   163	169	184	java/io/IOException
  }
  
  public static void q0(PopupWindow paramPopupWindow, boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 23) {
      paramPopupWindow.setOverlapAnchor(paramBoolean);
    } else {
      if (!r) {
        try {
          Field field1 = PopupWindow.class.getDeclaredField("mOverlapAnchor");
          q = field1;
          field1.setAccessible(true);
        } catch (NoSuchFieldException noSuchFieldException) {
          Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", noSuchFieldException);
        } 
        r = true;
      } 
      Field field = q;
      if (field != null)
        try {
          field.set(paramPopupWindow, Boolean.valueOf(paramBoolean));
        } catch (IllegalAccessException illegalAccessException) {
          Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", illegalAccessException);
        }  
    } 
  }
  
  public static Animator r(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, AnimatorSet paramAnimatorSet, int paramInt, float paramFloat) {
    int i = paramXmlPullParser.getDepth();
    Object object2 = null;
    Object object1;
    for (object1 = null;; object1 = SYNTHETIC_LOCAL_VARIABLE_19) {
      int m = paramXmlPullParser.next();
      int k = 3;
      int j = 0;
      if ((m != 3 || paramXmlPullParser.getDepth() > i) && m != 1) {
        Object object3;
        if (m != 2)
          continue; 
        String str = paramXmlPullParser.getName();
        if (str.equals("objectAnimator")) {
          object3 = new ObjectAnimator();
          U(paramContext, paramResources, paramTheme, paramAttributeSet, (ValueAnimator)object3, paramFloat, paramXmlPullParser);
        } else if (str.equals("animator")) {
          object3 = U(paramContext, paramResources, paramTheme, paramAttributeSet, null, paramFloat, paramXmlPullParser);
        } else {
          TypedArray<PropertyValuesHolder> typedArray;
          if (str.equals("set")) {
            object3 = new AnimatorSet();
            typedArray = a0(paramResources, paramTheme, paramAttributeSet, b.u.a.a.a.h);
            r(paramContext, paramResources, paramTheme, paramXmlPullParser, paramAttributeSet, (AnimatorSet)object3, F(typedArray, paramXmlPullParser, "ordering", 0, 0), paramFloat);
            typedArray.recycle();
          } else {
            object3 = "propertyValuesHolder";
            if (typedArray.equals("propertyValuesHolder")) {
              AttributeSet attributeSet = Xml.asAttributeSet(paramXmlPullParser);
              typedArray = null;
              j = k;
              while (true) {
                k = paramXmlPullParser.getEventType();
                paramXmlPullParser.next();
              } 
              if (typedArray != null) {
                k = typedArray.size();
                PropertyValuesHolder[] arrayOfPropertyValuesHolder = new PropertyValuesHolder[k];
                j = 0;
                while (true) {
                  PropertyValuesHolder[] arrayOfPropertyValuesHolder1 = arrayOfPropertyValuesHolder;
                  if (j < k) {
                    arrayOfPropertyValuesHolder[j] = typedArray.get(j);
                    j++;
                    continue;
                  } 
                  break;
                } 
              } else {
                object3 = null;
              } 
              if (object3 != null && object2 instanceof ValueAnimator)
                ((ValueAnimator)object2).setValues((PropertyValuesHolder[])object3); 
              j = 1;
              object3 = object2;
            } else {
              StringBuilder stringBuilder = c.a.a.a.a.e("Unknown animator name: ");
              stringBuilder.append(paramXmlPullParser.getName());
              throw new RuntimeException(stringBuilder.toString());
            } 
          } 
        } 
        Object object4 = object1;
        if (paramAnimatorSet != null) {
          object4 = object1;
          if (j == 0) {
            object4 = object1;
            if (object1 == null)
              object4 = new ArrayList(); 
            object4.add(object3);
          } 
        } 
        continue;
      } 
      break;
      object2 = SYNTHETIC_LOCAL_VARIABLE_18;
    } 
    if (paramAnimatorSet != null && object1 != null) {
      Animator[] arrayOfAnimator = new Animator[object1.size()];
      Iterator<Animator> iterator = object1.iterator();
      for (i = 0; iterator.hasNext(); i++)
        arrayOfAnimator[i] = iterator.next(); 
      if (paramInt == 0) {
        paramAnimatorSet.playTogether(arrayOfAnimator);
      } else {
        paramAnimatorSet.playSequentially(arrayOfAnimator);
      } 
    } 
    return (Animator)object2;
  }
  
  public static void r0(TextView paramTextView, b paramb) {
    if (Build.VERSION.SDK_INT >= 29) {
      if (paramb != null) {
        paramTextView.setText(null);
      } else {
        throw null;
      } 
    } else {
      b.a a1 = M(paramTextView);
      if (paramb != null) {
        if (a1.a(null)) {
          paramTextView.setText((CharSequence)paramb);
          return;
        } 
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
      } 
      throw null;
    } 
  }
  
  public static ColorStateList s(Resources paramResources, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme) {
    int i;
    AttributeSet attributeSet = Xml.asAttributeSet(paramXmlPullParser);
    while (true) {
      i = paramXmlPullParser.next();
      if (i != 2 && i != 1)
        continue; 
      break;
    } 
    if (i == 2)
      return t(paramResources, paramXmlPullParser, attributeSet, paramTheme); 
    throw new XmlPullParserException("No start tag found");
  }
  
  public static void s0(TextView paramTextView, int paramInt) {
    if (Build.VERSION.SDK_INT >= 23) {
      paramTextView.setTextAppearance(paramInt);
    } else {
      paramTextView.setTextAppearance(paramTextView.getContext(), paramInt);
    } 
  }
  
  public static ColorStateList t(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface getName : ()Ljava/lang/String;
    //   6: astore #13
    //   8: aload #13
    //   10: ldc_w 'selector'
    //   13: invokevirtual equals : (Ljava/lang/Object;)Z
    //   16: ifeq -> 564
    //   19: aload_1
    //   20: invokeinterface getDepth : ()I
    //   25: iconst_1
    //   26: iadd
    //   27: istore #10
    //   29: bipush #20
    //   31: anewarray [I
    //   34: astore #13
    //   36: bipush #20
    //   38: newarray int
    //   40: astore #14
    //   42: iconst_0
    //   43: istore #5
    //   45: aload_1
    //   46: invokeinterface next : ()I
    //   51: istore #6
    //   53: iload #6
    //   55: iconst_1
    //   56: if_icmpeq -> 523
    //   59: aload_1
    //   60: invokeinterface getDepth : ()I
    //   65: istore #7
    //   67: iload #7
    //   69: iload #10
    //   71: if_icmpge -> 80
    //   74: iload #6
    //   76: iconst_3
    //   77: if_icmpeq -> 523
    //   80: iload #6
    //   82: iconst_2
    //   83: if_icmpne -> 520
    //   86: iload #7
    //   88: iload #10
    //   90: if_icmpgt -> 520
    //   93: aload_1
    //   94: invokeinterface getName : ()Ljava/lang/String;
    //   99: ldc_w 'item'
    //   102: invokevirtual equals : (Ljava/lang/Object;)Z
    //   105: ifne -> 111
    //   108: goto -> 520
    //   111: getstatic b/i/c.ColorStateListItem : [I
    //   114: astore #15
    //   116: aload_3
    //   117: ifnonnull -> 132
    //   120: aload_0
    //   121: aload_2
    //   122: aload #15
    //   124: invokevirtual obtainAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   127: astore #15
    //   129: goto -> 143
    //   132: aload_3
    //   133: aload_2
    //   134: aload #15
    //   136: iconst_0
    //   137: iconst_0
    //   138: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   141: astore #15
    //   143: aload #15
    //   145: getstatic b/i/c.ColorStateListItem_android_color : I
    //   148: ldc_w -65281
    //   151: invokevirtual getColor : (II)I
    //   154: istore #11
    //   156: fconst_1
    //   157: fstore #4
    //   159: aload #15
    //   161: getstatic b/i/c.ColorStateListItem_android_alpha : I
    //   164: invokevirtual hasValue : (I)Z
    //   167: ifeq -> 178
    //   170: getstatic b/i/c.ColorStateListItem_android_alpha : I
    //   173: istore #6
    //   175: goto -> 194
    //   178: aload #15
    //   180: getstatic b/i/c.ColorStateListItem_alpha : I
    //   183: invokevirtual hasValue : (I)Z
    //   186: ifeq -> 204
    //   189: getstatic b/i/c.ColorStateListItem_alpha : I
    //   192: istore #6
    //   194: aload #15
    //   196: iload #6
    //   198: fconst_1
    //   199: invokevirtual getFloat : (IF)F
    //   202: fstore #4
    //   204: aload #15
    //   206: invokevirtual recycle : ()V
    //   209: aload_2
    //   210: invokeinterface getAttributeCount : ()I
    //   215: istore #12
    //   217: iload #12
    //   219: newarray int
    //   221: astore #15
    //   223: iconst_0
    //   224: istore #7
    //   226: iconst_0
    //   227: istore #6
    //   229: iload #7
    //   231: iload #12
    //   233: if_icmpge -> 329
    //   236: aload_2
    //   237: iload #7
    //   239: invokeinterface getAttributeNameResource : (I)I
    //   244: istore #9
    //   246: iload #6
    //   248: istore #8
    //   250: iload #9
    //   252: ldc_w 16843173
    //   255: if_icmpeq -> 319
    //   258: iload #6
    //   260: istore #8
    //   262: iload #9
    //   264: ldc_w 16843551
    //   267: if_icmpeq -> 319
    //   270: iload #6
    //   272: istore #8
    //   274: iload #9
    //   276: getstatic b/i/a.alpha : I
    //   279: if_icmpeq -> 319
    //   282: aload_2
    //   283: iload #7
    //   285: iconst_0
    //   286: invokeinterface getAttributeBooleanValue : (IZ)Z
    //   291: ifeq -> 301
    //   294: iload #9
    //   296: istore #8
    //   298: goto -> 306
    //   301: iload #9
    //   303: ineg
    //   304: istore #8
    //   306: aload #15
    //   308: iload #6
    //   310: iload #8
    //   312: iastore
    //   313: iload #6
    //   315: iconst_1
    //   316: iadd
    //   317: istore #8
    //   319: iinc #7, 1
    //   322: iload #8
    //   324: istore #6
    //   326: goto -> 229
    //   329: aload #15
    //   331: iload #6
    //   333: invokestatic trimStateSet : ([II)[I
    //   336: astore #16
    //   338: iload #11
    //   340: invokestatic alpha : (I)I
    //   343: i2f
    //   344: fload #4
    //   346: fmul
    //   347: invokestatic round : (F)I
    //   350: istore #9
    //   352: iload #5
    //   354: iconst_1
    //   355: iadd
    //   356: istore #7
    //   358: aload #14
    //   360: arraylength
    //   361: istore #6
    //   363: bipush #8
    //   365: istore #8
    //   367: aload #14
    //   369: astore #15
    //   371: iload #7
    //   373: iload #6
    //   375: if_icmple -> 414
    //   378: iload #5
    //   380: iconst_4
    //   381: if_icmpgt -> 391
    //   384: bipush #8
    //   386: istore #6
    //   388: goto -> 397
    //   391: iload #5
    //   393: iconst_2
    //   394: imul
    //   395: istore #6
    //   397: iload #6
    //   399: newarray int
    //   401: astore #15
    //   403: aload #14
    //   405: iconst_0
    //   406: aload #15
    //   408: iconst_0
    //   409: iload #5
    //   411: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   414: aload #15
    //   416: iload #5
    //   418: iload #9
    //   420: bipush #24
    //   422: ishl
    //   423: iload #11
    //   425: ldc_w 16777215
    //   428: iand
    //   429: ior
    //   430: iastore
    //   431: aload #13
    //   433: astore #14
    //   435: iload #7
    //   437: aload #13
    //   439: arraylength
    //   440: if_icmple -> 495
    //   443: aload #13
    //   445: invokevirtual getClass : ()Ljava/lang/Class;
    //   448: invokevirtual getComponentType : ()Ljava/lang/Class;
    //   451: astore #14
    //   453: iload #5
    //   455: iconst_4
    //   456: if_icmpgt -> 466
    //   459: iload #8
    //   461: istore #6
    //   463: goto -> 472
    //   466: iload #5
    //   468: iconst_2
    //   469: imul
    //   470: istore #6
    //   472: aload #14
    //   474: iload #6
    //   476: invokestatic newInstance : (Ljava/lang/Class;I)Ljava/lang/Object;
    //   479: checkcast [Ljava/lang/Object;
    //   482: astore #14
    //   484: aload #13
    //   486: iconst_0
    //   487: aload #14
    //   489: iconst_0
    //   490: iload #5
    //   492: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   495: aload #14
    //   497: iload #5
    //   499: aload #16
    //   501: aastore
    //   502: aload #14
    //   504: checkcast [[I
    //   507: astore #13
    //   509: iload #7
    //   511: istore #5
    //   513: aload #15
    //   515: astore #14
    //   517: goto -> 520
    //   520: goto -> 45
    //   523: iload #5
    //   525: newarray int
    //   527: astore_0
    //   528: iload #5
    //   530: anewarray [I
    //   533: astore_1
    //   534: aload #14
    //   536: iconst_0
    //   537: aload_0
    //   538: iconst_0
    //   539: iload #5
    //   541: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   544: aload #13
    //   546: iconst_0
    //   547: aload_1
    //   548: iconst_0
    //   549: iload #5
    //   551: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   554: new android/content/res/ColorStateList
    //   557: dup
    //   558: aload_1
    //   559: aload_0
    //   560: invokespecial <init> : ([[I[I)V
    //   563: areturn
    //   564: new java/lang/StringBuilder
    //   567: dup
    //   568: invokespecial <init> : ()V
    //   571: astore_0
    //   572: aload_0
    //   573: aload_1
    //   574: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   579: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   582: pop
    //   583: aload_0
    //   584: ldc_w ': invalid color state list tag '
    //   587: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   590: pop
    //   591: aload_0
    //   592: aload #13
    //   594: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   597: pop
    //   598: new org/xmlpull/v1/XmlPullParserException
    //   601: dup
    //   602: aload_0
    //   603: invokevirtual toString : ()Ljava/lang/String;
    //   606: invokespecial <init> : (Ljava/lang/String;)V
    //   609: athrow
  }
  
  public static void t0(Drawable paramDrawable, int paramInt) {
    paramDrawable.setTint(paramInt);
  }
  
  public static Keyframe u(Keyframe paramKeyframe, float paramFloat) {
    if (paramKeyframe.getType() == float.class) {
      paramKeyframe = Keyframe.ofFloat(paramFloat);
    } else if (paramKeyframe.getType() == int.class) {
      paramKeyframe = Keyframe.ofInt(paramFloat);
    } else {
      paramKeyframe = Keyframe.ofObject(paramFloat);
    } 
    return paramKeyframe;
  }
  
  public static void u0(Drawable paramDrawable, ColorStateList paramColorStateList) {
    paramDrawable.setTintList(paramColorStateList);
  }
  
  public static c[] v(String paramString) {
    StringBuilder stringBuilder;
    if (paramString == null)
      return null; 
    ArrayList<c> arrayList = new ArrayList();
    byte b = 1;
    int i = 0;
    while (b < paramString.length()) {
      while (b < paramString.length()) {
        char c = paramString.charAt(b);
        if (((c - 90) * (c - 65) <= 0 || (c - 122) * (c - 97) <= 0) && c != 'e' && c != 'E')
          break; 
        b++;
      } 
      String str = paramString.substring(i, b).trim();
      if (str.length() > 0) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
          float[] arrayOfFloat = new float[0];
        } else {
          try {
            float[] arrayOfFloat = new float[str.length()];
            int k = str.length();
            byte b1 = 1;
            int j;
            for (j = 0; b1 < k; j = i) {
              int n;
              byte b2 = b1;
              int m = 0;
              i = 0;
              boolean bool1 = false;
              boolean bool2 = false;
              while (true) {
                n = i;
                if (b2 < str.length()) {
                  n = str.charAt(b2);
                  int i1 = i;
                  if (n != 32) {
                    boolean bool;
                    if (n != 69 && n != 101) {
                      i1 = i;
                      switch (n) {
                        default:
                          n = m;
                          i1 = i;
                          bool = bool1;
                          break;
                        case '.':
                          if (!bool1) {
                            bool = true;
                            n = m;
                            i1 = i;
                            break;
                          } 
                          i1 = 1;
                        case '-':
                          n = m;
                          i1 = i;
                          bool = bool1;
                        case ',':
                          n = 1;
                          bool = bool1;
                          break;
                      } 
                    } else {
                      bool2 = true;
                      if (m) {
                        n = i;
                        break;
                      } 
                    } 
                    bool2 = false;
                    bool1 = bool;
                    i = i1;
                    m = n;
                  } else {
                  
                  } 
                } else {
                  break;
                } 
                if (m != 0) {
                  n = i;
                  break;
                } 
                b2++;
              } 
              i = j;
              if (b1 < b2) {
                arrayOfFloat[j] = Float.parseFloat(str.substring(b1, b2));
                i = j + 1;
              } 
              if (n == 0)
                b2++; 
              b1 = b2;
            } 
            arrayOfFloat = o(arrayOfFloat, 0, j);
          } catch (NumberFormatException numberFormatException) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("error in parsing \"");
            stringBuilder.append(str);
            stringBuilder.append("\"");
            throw new RuntimeException(stringBuilder.toString(), numberFormatException);
          } 
        } 
        arrayList.add(new c(str.charAt(0), (float[])numberFormatException));
      } 
      i = b;
      b++;
    } 
    if (b - i == 1 && i < stringBuilder.length())
      arrayList.add(new c(stringBuilder.charAt(i), new float[0])); 
    return arrayList.<c>toArray(new c[arrayList.size()]);
  }
  
  public static void v0(Drawable paramDrawable, PorterDuff.Mode paramMode) {
    paramDrawable.setTintMode(paramMode);
  }
  
  public static Path w(String paramString) {
    Path path = new Path();
    c[] arrayOfC = v(paramString);
    if (arrayOfC != null)
      try {
        c.b(arrayOfC, path);
        return path;
      } catch (RuntimeException runtimeException) {
        throw new RuntimeException(c.a.a.a.a.c("Error in parsing ", paramString), runtimeException);
      }  
    return null;
  }
  
  public static void w0(View paramView, CharSequence paramCharSequence) {
    if (Build.VERSION.SDK_INT >= 26) {
      paramView.setTooltipText(paramCharSequence);
    } else {
      a1 a11;
      a1 a12 = a1.k;
      if (a12 != null && a12.b == paramView)
        a1.c(null); 
      if (TextUtils.isEmpty(paramCharSequence)) {
        a11 = a1.l;
        if (a11 != null && a11.b == paramView)
          a11.b(); 
        paramView.setOnLongClickListener(null);
        paramView.setLongClickable(false);
        paramView.setOnHoverListener(null);
      } else {
        new a1(paramView, (CharSequence)a11);
      } 
    } 
  }
  
  public static c[] x(c[] paramArrayOfc) {
    if (paramArrayOfc == null)
      return null; 
    c[] arrayOfC = new c[paramArrayOfc.length];
    for (byte b = 0; b < paramArrayOfc.length; b++)
      arrayOfC[b] = new c(paramArrayOfc[b]); 
    return arrayOfC;
  }
  
  public static void x0(PopupWindow paramPopupWindow, int paramInt) {
    if (Build.VERSION.SDK_INT >= 23) {
      paramPopupWindow.setWindowLayoutType(paramInt);
      return;
    } 
    if (!p) {
      try {
        Method method1 = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[] { int.class });
        o = method1;
        method1.setAccessible(true);
      } catch (Exception exception) {}
      p = true;
    } 
    Method method = o;
    if (method != null)
      try {
        method.invoke(paramPopupWindow, new Object[] { Integer.valueOf(paramInt) });
      } catch (Exception exception) {} 
  }
  
  public static boolean y(Object paramObject1, Object paramObject2) {
    return (paramObject1 == paramObject2 || (paramObject1 != null && paramObject1.equals(paramObject2)));
  }
  
  public static boolean y0(Context paramContext, String paramString) {
    return (Build.VERSION.SDK_INT != 28) ? false : S(paramContext, paramString, i.hide_fingerprint_instantly_prefixes);
  }
  
  public static void z(Object paramObject) {
    Class<?> clazz1;
    if (!d) {
      try {
        c = Class.forName("android.content.res.ThemedResourceCache");
      } catch (ClassNotFoundException classNotFoundException) {
        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", classNotFoundException);
      } 
      d = true;
    } 
    Class<?> clazz2 = c;
    if (clazz2 == null)
      return; 
    if (!f) {
      try {
        Field field1 = clazz2.getDeclaredField("mUnthemedEntries");
        e = field1;
        field1.setAccessible(true);
      } catch (NoSuchFieldException noSuchFieldException) {
        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", noSuchFieldException);
      } 
      f = true;
    } 
    Field field = e;
    if (field == null)
      return; 
    clazz2 = null;
    try {
      paramObject = field.get(paramObject);
    } catch (IllegalAccessException illegalAccessException) {
      Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", illegalAccessException);
      clazz1 = clazz2;
    } 
    if (clazz1 != null)
      clazz1.clear(); 
  }
  
  public static void z0(XmlPullParser paramXmlPullParser) {
    for (byte b = 1; b; b++) {
      int i = paramXmlPullParser.next();
      if (i != 2) {
        if (i != 3)
          continue; 
        b--;
        continue;
      } 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\a\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */