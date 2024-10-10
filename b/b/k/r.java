package b.b.k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import b.b.j;
import b.b.o.c;
import b.b.p.b0;
import b.b.p.d;
import b.b.p.f;
import b.b.p.g;
import b.b.p.h;
import b.b.p.k;
import b.b.p.l;
import b.b.p.n;
import b.b.p.o;
import b.b.p.s;
import b.b.p.t;
import b.b.p.w;
import b.b.p.z;
import b.f.h;
import b.i.m.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class r {
  public static final String LOG_TAG = "AppCompatViewInflater";
  
  public static final String[] sClassPrefixList;
  
  public static final h<String, Constructor<? extends View>> sConstructorMap;
  
  public static final Class<?>[] sConstructorSignature = new Class[] { Context.class, AttributeSet.class };
  
  public static final int[] sOnClickAttrs = new int[] { 16843375 };
  
  public final Object[] mConstructorArgs = new Object[2];
  
  static {
    sClassPrefixList = new String[] { "android.widget.", "android.view.", "android.webkit." };
    sConstructorMap = new h();
  }
  
  private void checkOnClickListener(View paramView, AttributeSet paramAttributeSet) {
    Context context = paramView.getContext();
    if (context instanceof ContextWrapper && l.A(paramView)) {
      TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, sOnClickAttrs);
      String str = typedArray.getString(0);
      if (str != null)
        paramView.setOnClickListener(new a(paramView, str)); 
      typedArray.recycle();
    } 
  }
  
  private View createViewByPrefix(Context paramContext, String paramString1, String paramString2) {
    Constructor constructor1 = (Constructor)sConstructorMap.getOrDefault(paramString1, null);
    Constructor<View> constructor = constructor1;
    if (constructor1 == null) {
      if (paramString2 != null)
        try {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(paramString2);
          stringBuilder.append(paramString1);
          paramString2 = stringBuilder.toString();
          constructor = Class.forName(paramString2, false, paramContext.getClassLoader()).<View>asSubclass(View.class).getConstructor(sConstructorSignature);
          sConstructorMap.put(paramString1, constructor);
          constructor.setAccessible(true);
          return constructor.newInstance(this.mConstructorArgs);
        } catch (Exception exception) {
          return null;
        }  
      paramString2 = paramString1;
    } else {
      constructor.setAccessible(true);
      return constructor.newInstance(this.mConstructorArgs);
    } 
    constructor = Class.forName(paramString2, false, paramContext.getClassLoader()).<View>asSubclass(View.class).getConstructor(sConstructorSignature);
    sConstructorMap.put(paramString1, constructor);
    constructor.setAccessible(true);
    return constructor.newInstance(this.mConstructorArgs);
  }
  
  private View createViewFromTag(Context paramContext, String paramString, AttributeSet paramAttributeSet) {
    String str = paramString;
    if (paramString.equals("view"))
      str = paramAttributeSet.getAttributeValue(null, "class"); 
    try {
      Object[] arrayOfObject;
      this.mConstructorArgs[0] = paramContext;
      this.mConstructorArgs[1] = paramAttributeSet;
      if (-1 == str.indexOf('.')) {
        for (byte b = 0; b < sClassPrefixList.length; b++) {
          View view = createViewByPrefix(paramContext, str, sClassPrefixList[b]);
          if (view != null)
            return view; 
        } 
        return null;
      } 
      return createViewByPrefix((Context)arrayOfObject, str, null);
    } catch (Exception exception) {
      return null;
    } finally {
      Object[] arrayOfObject = this.mConstructorArgs;
      arrayOfObject[0] = null;
      arrayOfObject[1] = null;
    } 
  }
  
  public static Context themifyContext(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2) {
    int i;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, j.View, 0, 0);
    if (paramBoolean1) {
      i = typedArray.getResourceId(j.View_android_theme, 0);
    } else {
      i = 0;
    } 
    int j = i;
    if (paramBoolean2) {
      j = i;
      if (!i) {
        i = typedArray.getResourceId(j.View_theme, 0);
        j = i;
        if (i != 0) {
          Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
          j = i;
        } 
      } 
    } 
    typedArray.recycle();
    Context context = paramContext;
    if (j != 0) {
      if (paramContext instanceof c) {
        context = paramContext;
        return (Context)((((c)paramContext).a != j) ? new c(paramContext, j) : context);
      } 
    } else {
      return context;
    } 
    return (Context)new c(paramContext, j);
  }
  
  private void verifyNotNull(View paramView, String paramString) {
    if (paramView != null)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getName());
    stringBuilder.append(" asked to inflate view for <");
    stringBuilder.append(paramString);
    stringBuilder.append(">, but returned null");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public d createAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet) {
    return new d(paramContext, paramAttributeSet);
  }
  
  public f createButton(Context paramContext, AttributeSet paramAttributeSet) {
    return new f(paramContext, paramAttributeSet);
  }
  
  public g createCheckBox(Context paramContext, AttributeSet paramAttributeSet) {
    return new g(paramContext, paramAttributeSet);
  }
  
  public h createCheckedTextView(Context paramContext, AttributeSet paramAttributeSet) {
    return new h(paramContext, paramAttributeSet);
  }
  
  public k createEditText(Context paramContext, AttributeSet paramAttributeSet) {
    return new k(paramContext, paramAttributeSet);
  }
  
  public l createImageButton(Context paramContext, AttributeSet paramAttributeSet) {
    return new l(paramContext, paramAttributeSet);
  }
  
  public n createImageView(Context paramContext, AttributeSet paramAttributeSet) {
    return new n(paramContext, paramAttributeSet, 0);
  }
  
  public o createMultiAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet) {
    return new o(paramContext, paramAttributeSet);
  }
  
  public b.b.p.r createRadioButton(Context paramContext, AttributeSet paramAttributeSet) {
    return new b.b.p.r(paramContext, paramAttributeSet, b.b.a.radioButtonStyle);
  }
  
  public s createRatingBar(Context paramContext, AttributeSet paramAttributeSet) {
    return new s(paramContext, paramAttributeSet);
  }
  
  public t createSeekBar(Context paramContext, AttributeSet paramAttributeSet) {
    return new t(paramContext, paramAttributeSet);
  }
  
  public w createSpinner(Context paramContext, AttributeSet paramAttributeSet) {
    return new w(paramContext, paramAttributeSet, b.b.a.spinnerStyle);
  }
  
  public z createTextView(Context paramContext, AttributeSet paramAttributeSet) {
    return new z(paramContext, paramAttributeSet);
  }
  
  public b0 createToggleButton(Context paramContext, AttributeSet paramAttributeSet) {
    return new b0(paramContext, paramAttributeSet);
  }
  
  public View createView(Context paramContext, String paramString, AttributeSet paramAttributeSet) {
    return null;
  }
  
  public final View createView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    // Byte code:
    //   0: iload #5
    //   2: ifeq -> 17
    //   5: aload_1
    //   6: ifnull -> 17
    //   9: aload_1
    //   10: invokevirtual getContext : ()Landroid/content/Context;
    //   13: astore_1
    //   14: goto -> 19
    //   17: aload_3
    //   18: astore_1
    //   19: iload #6
    //   21: ifne -> 32
    //   24: aload_1
    //   25: astore #10
    //   27: iload #7
    //   29: ifeq -> 44
    //   32: aload_1
    //   33: aload #4
    //   35: iload #6
    //   37: iload #7
    //   39: invokestatic themifyContext : (Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Landroid/content/Context;
    //   42: astore #10
    //   44: iload #8
    //   46: ifeq -> 55
    //   49: aload #10
    //   51: invokestatic a : (Landroid/content/Context;)Landroid/content/Context;
    //   54: pop
    //   55: iconst_m1
    //   56: istore #9
    //   58: aload_2
    //   59: invokevirtual hashCode : ()I
    //   62: lookupswitch default -> 184, -1946472170 -> 402, -1455429095 -> 385, -1346021293 -> 368, -938935918 -> 352, -937446323 -> 336, -658531749 -> 319, -339785223 -> 303, 776382189 -> 286, 799298502 -> 269, 1125864064 -> 253, 1413872058 -> 236, 1601505219 -> 219, 1666676343 -> 203, 2001146706 -> 187
    //   184: goto -> 416
    //   187: aload_2
    //   188: ldc_w 'Button'
    //   191: invokevirtual equals : (Ljava/lang/Object;)Z
    //   194: ifeq -> 416
    //   197: iconst_2
    //   198: istore #9
    //   200: goto -> 416
    //   203: aload_2
    //   204: ldc_w 'EditText'
    //   207: invokevirtual equals : (Ljava/lang/Object;)Z
    //   210: ifeq -> 416
    //   213: iconst_3
    //   214: istore #9
    //   216: goto -> 416
    //   219: aload_2
    //   220: ldc_w 'CheckBox'
    //   223: invokevirtual equals : (Ljava/lang/Object;)Z
    //   226: ifeq -> 416
    //   229: bipush #6
    //   231: istore #9
    //   233: goto -> 416
    //   236: aload_2
    //   237: ldc_w 'AutoCompleteTextView'
    //   240: invokevirtual equals : (Ljava/lang/Object;)Z
    //   243: ifeq -> 416
    //   246: bipush #9
    //   248: istore #9
    //   250: goto -> 416
    //   253: aload_2
    //   254: ldc_w 'ImageView'
    //   257: invokevirtual equals : (Ljava/lang/Object;)Z
    //   260: ifeq -> 416
    //   263: iconst_1
    //   264: istore #9
    //   266: goto -> 416
    //   269: aload_2
    //   270: ldc_w 'ToggleButton'
    //   273: invokevirtual equals : (Ljava/lang/Object;)Z
    //   276: ifeq -> 416
    //   279: bipush #13
    //   281: istore #9
    //   283: goto -> 416
    //   286: aload_2
    //   287: ldc_w 'RadioButton'
    //   290: invokevirtual equals : (Ljava/lang/Object;)Z
    //   293: ifeq -> 416
    //   296: bipush #7
    //   298: istore #9
    //   300: goto -> 416
    //   303: aload_2
    //   304: ldc_w 'Spinner'
    //   307: invokevirtual equals : (Ljava/lang/Object;)Z
    //   310: ifeq -> 416
    //   313: iconst_4
    //   314: istore #9
    //   316: goto -> 416
    //   319: aload_2
    //   320: ldc_w 'SeekBar'
    //   323: invokevirtual equals : (Ljava/lang/Object;)Z
    //   326: ifeq -> 416
    //   329: bipush #12
    //   331: istore #9
    //   333: goto -> 416
    //   336: aload_2
    //   337: ldc_w 'ImageButton'
    //   340: invokevirtual equals : (Ljava/lang/Object;)Z
    //   343: ifeq -> 416
    //   346: iconst_5
    //   347: istore #9
    //   349: goto -> 416
    //   352: aload_2
    //   353: ldc_w 'TextView'
    //   356: invokevirtual equals : (Ljava/lang/Object;)Z
    //   359: ifeq -> 416
    //   362: iconst_0
    //   363: istore #9
    //   365: goto -> 416
    //   368: aload_2
    //   369: ldc_w 'MultiAutoCompleteTextView'
    //   372: invokevirtual equals : (Ljava/lang/Object;)Z
    //   375: ifeq -> 416
    //   378: bipush #10
    //   380: istore #9
    //   382: goto -> 416
    //   385: aload_2
    //   386: ldc_w 'CheckedTextView'
    //   389: invokevirtual equals : (Ljava/lang/Object;)Z
    //   392: ifeq -> 416
    //   395: bipush #8
    //   397: istore #9
    //   399: goto -> 416
    //   402: aload_2
    //   403: ldc_w 'RatingBar'
    //   406: invokevirtual equals : (Ljava/lang/Object;)Z
    //   409: ifeq -> 416
    //   412: bipush #11
    //   414: istore #9
    //   416: iload #9
    //   418: tableswitch default -> 488, 0 -> 657, 1 -> 645, 2 -> 633, 3 -> 621, 4 -> 609, 5 -> 597, 6 -> 585, 7 -> 573, 8 -> 561, 9 -> 549, 10 -> 537, 11 -> 525, 12 -> 513, 13 -> 501
    //   488: aload_0
    //   489: aload #10
    //   491: aload_2
    //   492: aload #4
    //   494: invokevirtual createView : (Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    //   497: astore_1
    //   498: goto -> 672
    //   501: aload_0
    //   502: aload #10
    //   504: aload #4
    //   506: invokevirtual createToggleButton : (Landroid/content/Context;Landroid/util/AttributeSet;)Lb/b/p/b0;
    //   509: astore_1
    //   510: goto -> 666
    //   513: aload_0
    //   514: aload #10
    //   516: aload #4
    //   518: invokevirtual createSeekBar : (Landroid/content/Context;Landroid/util/AttributeSet;)Lb/b/p/t;
    //   521: astore_1
    //   522: goto -> 666
    //   525: aload_0
    //   526: aload #10
    //   528: aload #4
    //   530: invokevirtual createRatingBar : (Landroid/content/Context;Landroid/util/AttributeSet;)Lb/b/p/s;
    //   533: astore_1
    //   534: goto -> 666
    //   537: aload_0
    //   538: aload #10
    //   540: aload #4
    //   542: invokevirtual createMultiAutoCompleteTextView : (Landroid/content/Context;Landroid/util/AttributeSet;)Lb/b/p/o;
    //   545: astore_1
    //   546: goto -> 666
    //   549: aload_0
    //   550: aload #10
    //   552: aload #4
    //   554: invokevirtual createAutoCompleteTextView : (Landroid/content/Context;Landroid/util/AttributeSet;)Lb/b/p/d;
    //   557: astore_1
    //   558: goto -> 666
    //   561: aload_0
    //   562: aload #10
    //   564: aload #4
    //   566: invokevirtual createCheckedTextView : (Landroid/content/Context;Landroid/util/AttributeSet;)Lb/b/p/h;
    //   569: astore_1
    //   570: goto -> 666
    //   573: aload_0
    //   574: aload #10
    //   576: aload #4
    //   578: invokevirtual createRadioButton : (Landroid/content/Context;Landroid/util/AttributeSet;)Lb/b/p/r;
    //   581: astore_1
    //   582: goto -> 666
    //   585: aload_0
    //   586: aload #10
    //   588: aload #4
    //   590: invokevirtual createCheckBox : (Landroid/content/Context;Landroid/util/AttributeSet;)Lb/b/p/g;
    //   593: astore_1
    //   594: goto -> 666
    //   597: aload_0
    //   598: aload #10
    //   600: aload #4
    //   602: invokevirtual createImageButton : (Landroid/content/Context;Landroid/util/AttributeSet;)Lb/b/p/l;
    //   605: astore_1
    //   606: goto -> 666
    //   609: aload_0
    //   610: aload #10
    //   612: aload #4
    //   614: invokevirtual createSpinner : (Landroid/content/Context;Landroid/util/AttributeSet;)Lb/b/p/w;
    //   617: astore_1
    //   618: goto -> 666
    //   621: aload_0
    //   622: aload #10
    //   624: aload #4
    //   626: invokevirtual createEditText : (Landroid/content/Context;Landroid/util/AttributeSet;)Lb/b/p/k;
    //   629: astore_1
    //   630: goto -> 666
    //   633: aload_0
    //   634: aload #10
    //   636: aload #4
    //   638: invokevirtual createButton : (Landroid/content/Context;Landroid/util/AttributeSet;)Lb/b/p/f;
    //   641: astore_1
    //   642: goto -> 666
    //   645: aload_0
    //   646: aload #10
    //   648: aload #4
    //   650: invokevirtual createImageView : (Landroid/content/Context;Landroid/util/AttributeSet;)Lb/b/p/n;
    //   653: astore_1
    //   654: goto -> 666
    //   657: aload_0
    //   658: aload #10
    //   660: aload #4
    //   662: invokevirtual createTextView : (Landroid/content/Context;Landroid/util/AttributeSet;)Lb/b/p/z;
    //   665: astore_1
    //   666: aload_0
    //   667: aload_1
    //   668: aload_2
    //   669: invokespecial verifyNotNull : (Landroid/view/View;Ljava/lang/String;)V
    //   672: aload_1
    //   673: astore #11
    //   675: aload_1
    //   676: ifnonnull -> 699
    //   679: aload_1
    //   680: astore #11
    //   682: aload_3
    //   683: aload #10
    //   685: if_acmpeq -> 699
    //   688: aload_0
    //   689: aload #10
    //   691: aload_2
    //   692: aload #4
    //   694: invokespecial createViewFromTag : (Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    //   697: astore #11
    //   699: aload #11
    //   701: ifnull -> 712
    //   704: aload_0
    //   705: aload #11
    //   707: aload #4
    //   709: invokespecial checkOnClickListener : (Landroid/view/View;Landroid/util/AttributeSet;)V
    //   712: aload #11
    //   714: areturn
  }
  
  public static class a implements View.OnClickListener {
    public final View b;
    
    public final String c;
    
    public Method d;
    
    public Context e;
    
    public a(View param1View, String param1String) {
      this.b = param1View;
      this.c = param1String;
    }
    
    public void onClick(View param1View) {
      String str;
      if (this.d == null) {
        for (Context context = this.b.getContext(); context != null; context = null) {
          try {
            if (!context.isRestricted()) {
              Method method = context.getClass().getMethod(this.c, new Class[] { View.class });
              if (method != null) {
                this.d = method;
                this.e = context;
                // Byte code: goto -> 200
              } 
            } 
          } catch (NoSuchMethodException noSuchMethodException) {}
          if (context instanceof ContextWrapper) {
            context = ((ContextWrapper)context).getBaseContext();
            continue;
          } 
        } 
        int i = this.b.getId();
        if (i == -1) {
          str = "";
        } else {
          StringBuilder stringBuilder1 = c.a.a.a.a.e(" with id '");
          stringBuilder1.append(this.b.getContext().getResources().getResourceEntryName(i));
          stringBuilder1.append("'");
          str = stringBuilder1.toString();
        } 
        StringBuilder stringBuilder = c.a.a.a.a.e("Could not find method ");
        stringBuilder.append(this.c);
        stringBuilder.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
        stringBuilder.append(this.b.getClass());
        stringBuilder.append(str);
        throw new IllegalStateException(stringBuilder.toString());
      } 
      try {
        this.d.invoke(this.e, new Object[] { str });
        return;
      } catch (IllegalAccessException illegalAccessException) {
        throw new IllegalStateException("Could not execute non-public method for android:onClick", illegalAccessException);
      } catch (InvocationTargetException invocationTargetException) {
        throw new IllegalStateException("Could not execute method for android:onClick", invocationTargetException);
      } 
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\k\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */