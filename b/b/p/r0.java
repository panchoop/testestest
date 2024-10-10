package b.b.p;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import b.b.f;
import b.j.a.c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
public class r0 extends c implements View.OnClickListener {
  public final SearchView m;
  
  public final SearchableInfo n;
  
  public final Context o;
  
  public final WeakHashMap<String, Drawable.ConstantState> p;
  
  public final int q;
  
  public boolean r = false;
  
  public int s = 1;
  
  public ColorStateList t;
  
  public int u = -1;
  
  public int v = -1;
  
  public int w = -1;
  
  public int x = -1;
  
  public int y = -1;
  
  public int z = -1;
  
  public r0(Context paramContext, SearchView paramSearchView, SearchableInfo paramSearchableInfo, WeakHashMap<String, Drawable.ConstantState> paramWeakHashMap) {
    super(paramContext, paramSearchView.getSuggestionRowLayout(), null, true);
    this.m = paramSearchView;
    this.n = paramSearchableInfo;
    this.q = paramSearchView.getSuggestionCommitIconResId();
    this.o = paramContext;
    this.p = paramWeakHashMap;
  }
  
  public static String e(Cursor paramCursor, String paramString) {
    return i(paramCursor, paramCursor.getColumnIndex(paramString));
  }
  
  public static String i(Cursor paramCursor, int paramInt) {
    if (paramInt == -1)
      return null; 
    try {
      return paramCursor.getString(paramInt);
    } catch (Exception exception) {
      Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", exception);
      return null;
    } 
  }
  
  public void a(View paramView, Context paramContext, Cursor paramCursor) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getTag : ()Ljava/lang/Object;
    //   4: checkcast b/b/p/r0$a
    //   7: astore #7
    //   9: aload_0
    //   10: getfield z : I
    //   13: istore #4
    //   15: iload #4
    //   17: iconst_m1
    //   18: if_icmpeq -> 34
    //   21: aload_3
    //   22: iload #4
    //   24: invokeinterface getInt : (I)I
    //   29: istore #4
    //   31: goto -> 37
    //   34: iconst_0
    //   35: istore #4
    //   37: aload #7
    //   39: getfield a : Landroid/widget/TextView;
    //   42: ifnull -> 88
    //   45: aload_3
    //   46: aload_0
    //   47: getfield u : I
    //   50: invokestatic i : (Landroid/database/Cursor;I)Ljava/lang/String;
    //   53: astore_2
    //   54: aload #7
    //   56: getfield a : Landroid/widget/TextView;
    //   59: astore_1
    //   60: aload_1
    //   61: aload_2
    //   62: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   65: aload_2
    //   66: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   69: ifeq -> 79
    //   72: bipush #8
    //   74: istore #5
    //   76: goto -> 82
    //   79: iconst_0
    //   80: istore #5
    //   82: aload_1
    //   83: iload #5
    //   85: invokevirtual setVisibility : (I)V
    //   88: aload #7
    //   90: getfield b : Landroid/widget/TextView;
    //   93: ifnull -> 297
    //   96: aload_3
    //   97: aload_0
    //   98: getfield w : I
    //   101: invokestatic i : (Landroid/database/Cursor;I)Ljava/lang/String;
    //   104: astore_2
    //   105: aload_2
    //   106: ifnull -> 196
    //   109: aload_0
    //   110: getfield t : Landroid/content/res/ColorStateList;
    //   113: ifnonnull -> 158
    //   116: new android/util/TypedValue
    //   119: dup
    //   120: invokespecial <init> : ()V
    //   123: astore_1
    //   124: aload_0
    //   125: getfield e : Landroid/content/Context;
    //   128: invokevirtual getTheme : ()Landroid/content/res/Resources$Theme;
    //   131: getstatic b/b/a.textColorSearchUrl : I
    //   134: aload_1
    //   135: iconst_1
    //   136: invokevirtual resolveAttribute : (ILandroid/util/TypedValue;Z)Z
    //   139: pop
    //   140: aload_0
    //   141: aload_0
    //   142: getfield e : Landroid/content/Context;
    //   145: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   148: aload_1
    //   149: getfield resourceId : I
    //   152: invokevirtual getColorStateList : (I)Landroid/content/res/ColorStateList;
    //   155: putfield t : Landroid/content/res/ColorStateList;
    //   158: new android/text/SpannableString
    //   161: dup
    //   162: aload_2
    //   163: invokespecial <init> : (Ljava/lang/CharSequence;)V
    //   166: astore_1
    //   167: aload_1
    //   168: new android/text/style/TextAppearanceSpan
    //   171: dup
    //   172: aconst_null
    //   173: iconst_0
    //   174: iconst_0
    //   175: aload_0
    //   176: getfield t : Landroid/content/res/ColorStateList;
    //   179: aconst_null
    //   180: invokespecial <init> : (Ljava/lang/String;IILandroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V
    //   183: iconst_0
    //   184: aload_2
    //   185: invokevirtual length : ()I
    //   188: bipush #33
    //   190: invokevirtual setSpan : (Ljava/lang/Object;III)V
    //   193: goto -> 205
    //   196: aload_3
    //   197: aload_0
    //   198: getfield v : I
    //   201: invokestatic i : (Landroid/database/Cursor;I)Ljava/lang/String;
    //   204: astore_1
    //   205: aload_1
    //   206: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   209: ifeq -> 239
    //   212: aload #7
    //   214: getfield a : Landroid/widget/TextView;
    //   217: astore_2
    //   218: aload_2
    //   219: ifnull -> 263
    //   222: aload_2
    //   223: iconst_0
    //   224: invokevirtual setSingleLine : (Z)V
    //   227: aload #7
    //   229: getfield a : Landroid/widget/TextView;
    //   232: iconst_2
    //   233: invokevirtual setMaxLines : (I)V
    //   236: goto -> 263
    //   239: aload #7
    //   241: getfield a : Landroid/widget/TextView;
    //   244: astore_2
    //   245: aload_2
    //   246: ifnull -> 263
    //   249: aload_2
    //   250: iconst_1
    //   251: invokevirtual setSingleLine : (Z)V
    //   254: aload #7
    //   256: getfield a : Landroid/widget/TextView;
    //   259: iconst_1
    //   260: invokevirtual setMaxLines : (I)V
    //   263: aload #7
    //   265: getfield b : Landroid/widget/TextView;
    //   268: astore_2
    //   269: aload_2
    //   270: aload_1
    //   271: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   274: aload_1
    //   275: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   278: ifeq -> 288
    //   281: bipush #8
    //   283: istore #5
    //   285: goto -> 291
    //   288: iconst_0
    //   289: istore #5
    //   291: aload_2
    //   292: iload #5
    //   294: invokevirtual setVisibility : (I)V
    //   297: aload #7
    //   299: getfield c : Landroid/widget/ImageView;
    //   302: astore #8
    //   304: aconst_null
    //   305: astore #6
    //   307: aload #8
    //   309: ifnull -> 614
    //   312: aload_0
    //   313: getfield x : I
    //   316: istore #5
    //   318: iload #5
    //   320: iconst_m1
    //   321: if_icmpne -> 329
    //   324: aconst_null
    //   325: astore_1
    //   326: goto -> 575
    //   329: aload_0
    //   330: aload_3
    //   331: iload #5
    //   333: invokeinterface getString : (I)Ljava/lang/String;
    //   338: invokevirtual g : (Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   341: astore_1
    //   342: aload_1
    //   343: ifnull -> 349
    //   346: goto -> 575
    //   349: aload_0
    //   350: getfield n : Landroid/app/SearchableInfo;
    //   353: invokevirtual getSearchActivity : ()Landroid/content/ComponentName;
    //   356: astore #10
    //   358: aload #10
    //   360: invokevirtual flattenToShortString : ()Ljava/lang/String;
    //   363: astore #9
    //   365: aload_0
    //   366: getfield p : Ljava/util/WeakHashMap;
    //   369: aload #9
    //   371: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   374: ifeq -> 414
    //   377: aload_0
    //   378: getfield p : Ljava/util/WeakHashMap;
    //   381: aload #9
    //   383: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   386: checkcast android/graphics/drawable/Drawable$ConstantState
    //   389: astore_1
    //   390: aload_1
    //   391: ifnonnull -> 399
    //   394: aconst_null
    //   395: astore_1
    //   396: goto -> 557
    //   399: aload_1
    //   400: aload_0
    //   401: getfield o : Landroid/content/Context;
    //   404: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   407: invokevirtual newDrawable : (Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    //   410: astore_1
    //   411: goto -> 557
    //   414: aload_0
    //   415: getfield e : Landroid/content/Context;
    //   418: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   421: astore_1
    //   422: aload_1
    //   423: aload #10
    //   425: sipush #128
    //   428: invokevirtual getActivityInfo : (Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    //   431: astore_2
    //   432: aload_2
    //   433: invokevirtual getIconResource : ()I
    //   436: istore #5
    //   438: iload #5
    //   440: ifne -> 446
    //   443: goto -> 530
    //   446: aload_1
    //   447: aload #10
    //   449: invokevirtual getPackageName : ()Ljava/lang/String;
    //   452: iload #5
    //   454: aload_2
    //   455: getfield applicationInfo : Landroid/content/pm/ApplicationInfo;
    //   458: invokevirtual getDrawable : (Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    //   461: astore_2
    //   462: aload_2
    //   463: astore_1
    //   464: aload_2
    //   465: ifnonnull -> 532
    //   468: new java/lang/StringBuilder
    //   471: dup
    //   472: invokespecial <init> : ()V
    //   475: astore_1
    //   476: aload_1
    //   477: ldc_w 'Invalid icon resource '
    //   480: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   483: pop
    //   484: aload_1
    //   485: iload #5
    //   487: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   490: pop
    //   491: aload_1
    //   492: ldc_w ' for '
    //   495: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   498: pop
    //   499: aload_1
    //   500: aload #10
    //   502: invokevirtual flattenToShortString : ()Ljava/lang/String;
    //   505: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   508: pop
    //   509: aload_1
    //   510: invokevirtual toString : ()Ljava/lang/String;
    //   513: astore_1
    //   514: goto -> 523
    //   517: astore_1
    //   518: aload_1
    //   519: invokevirtual toString : ()Ljava/lang/String;
    //   522: astore_1
    //   523: ldc 'SuggestionsAdapter'
    //   525: aload_1
    //   526: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   529: pop
    //   530: aconst_null
    //   531: astore_1
    //   532: aload_1
    //   533: ifnonnull -> 541
    //   536: aconst_null
    //   537: astore_2
    //   538: goto -> 546
    //   541: aload_1
    //   542: invokevirtual getConstantState : ()Landroid/graphics/drawable/Drawable$ConstantState;
    //   545: astore_2
    //   546: aload_0
    //   547: getfield p : Ljava/util/WeakHashMap;
    //   550: aload #9
    //   552: aload_2
    //   553: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   556: pop
    //   557: aload_1
    //   558: ifnull -> 564
    //   561: goto -> 575
    //   564: aload_0
    //   565: getfield e : Landroid/content/Context;
    //   568: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   571: invokevirtual getDefaultActivityIcon : ()Landroid/graphics/drawable/Drawable;
    //   574: astore_1
    //   575: aload #8
    //   577: aload_1
    //   578: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   581: aload_1
    //   582: ifnonnull -> 594
    //   585: aload #8
    //   587: iconst_4
    //   588: invokevirtual setVisibility : (I)V
    //   591: goto -> 614
    //   594: aload #8
    //   596: iconst_0
    //   597: invokevirtual setVisibility : (I)V
    //   600: aload_1
    //   601: iconst_0
    //   602: iconst_0
    //   603: invokevirtual setVisible : (ZZ)Z
    //   606: pop
    //   607: aload_1
    //   608: iconst_1
    //   609: iconst_0
    //   610: invokevirtual setVisible : (ZZ)Z
    //   613: pop
    //   614: aload #7
    //   616: getfield d : Landroid/widget/ImageView;
    //   619: astore_2
    //   620: aload_2
    //   621: ifnull -> 692
    //   624: aload_0
    //   625: getfield y : I
    //   628: istore #5
    //   630: iload #5
    //   632: iconst_m1
    //   633: if_icmpne -> 642
    //   636: aload #6
    //   638: astore_1
    //   639: goto -> 655
    //   642: aload_0
    //   643: aload_3
    //   644: iload #5
    //   646: invokeinterface getString : (I)Ljava/lang/String;
    //   651: invokevirtual g : (Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   654: astore_1
    //   655: aload_2
    //   656: aload_1
    //   657: invokevirtual setImageDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   660: aload_1
    //   661: ifnonnull -> 673
    //   664: aload_2
    //   665: bipush #8
    //   667: invokevirtual setVisibility : (I)V
    //   670: goto -> 692
    //   673: aload_2
    //   674: iconst_0
    //   675: invokevirtual setVisibility : (I)V
    //   678: aload_1
    //   679: iconst_0
    //   680: iconst_0
    //   681: invokevirtual setVisible : (ZZ)Z
    //   684: pop
    //   685: aload_1
    //   686: iconst_1
    //   687: iconst_0
    //   688: invokevirtual setVisible : (ZZ)Z
    //   691: pop
    //   692: aload_0
    //   693: getfield s : I
    //   696: istore #5
    //   698: iload #5
    //   700: iconst_2
    //   701: if_icmpeq -> 733
    //   704: iload #5
    //   706: iconst_1
    //   707: if_icmpne -> 720
    //   710: iload #4
    //   712: iconst_1
    //   713: iand
    //   714: ifeq -> 720
    //   717: goto -> 733
    //   720: aload #7
    //   722: getfield e : Landroid/widget/ImageView;
    //   725: bipush #8
    //   727: invokevirtual setVisibility : (I)V
    //   730: goto -> 767
    //   733: aload #7
    //   735: getfield e : Landroid/widget/ImageView;
    //   738: iconst_0
    //   739: invokevirtual setVisibility : (I)V
    //   742: aload #7
    //   744: getfield e : Landroid/widget/ImageView;
    //   747: aload #7
    //   749: getfield a : Landroid/widget/TextView;
    //   752: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   755: invokevirtual setTag : (Ljava/lang/Object;)V
    //   758: aload #7
    //   760: getfield e : Landroid/widget/ImageView;
    //   763: aload_0
    //   764: invokevirtual setOnClickListener : (Landroid/view/View$OnClickListener;)V
    //   767: return
    // Exception table:
    //   from	to	target	type
    //   422	432	517	android/content/pm/PackageManager$NameNotFoundException
  }
  
  public void b(Cursor paramCursor) {
    if (this.r) {
      Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
      if (paramCursor != null)
        paramCursor.close(); 
      return;
    } 
    try {
      super.b(paramCursor);
      if (paramCursor != null) {
        this.u = paramCursor.getColumnIndex("suggest_text_1");
        this.v = paramCursor.getColumnIndex("suggest_text_2");
        this.w = paramCursor.getColumnIndex("suggest_text_2_url");
        this.x = paramCursor.getColumnIndex("suggest_icon_1");
        this.y = paramCursor.getColumnIndex("suggest_icon_2");
        this.z = paramCursor.getColumnIndex("suggest_flags");
      } 
    } catch (Exception exception) {
      Log.e("SuggestionsAdapter", "error changing cursor and caching columns", exception);
    } 
  }
  
  public CharSequence c(Cursor paramCursor) {
    if (paramCursor == null)
      return null; 
    String str = i(paramCursor, paramCursor.getColumnIndex("suggest_intent_query"));
    if (str != null)
      return str; 
    if (this.n.shouldRewriteQueryFromData()) {
      str = i(paramCursor, paramCursor.getColumnIndex("suggest_intent_data"));
      if (str != null)
        return str; 
    } 
    if (this.n.shouldRewriteQueryFromText()) {
      String str1 = i(paramCursor, paramCursor.getColumnIndex("suggest_text_1"));
      if (str1 != null)
        return str1; 
    } 
    return null;
  }
  
  public View d(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup) {
    View view = this.l.inflate(this.j, paramViewGroup, false);
    view.setTag(new a(view));
    ((ImageView)view.findViewById(f.edit_query)).setImageResource(this.q);
    return view;
  }
  
  public Drawable f(Uri paramUri) {
    String str = paramUri.getAuthority();
    if (!TextUtils.isEmpty(str))
      try {
        Resources resources = ((b.j.a.a)this).e.getPackageManager().getResourcesForApplication(str);
        List<String> list = paramUri.getPathSegments();
        if (list != null) {
          int i = list.size();
          if (i == 1) {
            try {
              i = Integer.parseInt(list.get(0));
            } catch (NumberFormatException numberFormatException) {
              stringBuilder2 = new StringBuilder();
              stringBuilder2.append("Single path segment is not a resource ID: ");
              stringBuilder2.append(paramUri);
              throw new FileNotFoundException(stringBuilder2.toString());
            } 
          } else if (i == 2) {
            i = resources.getIdentifier(stringBuilder2.get(1), stringBuilder2.get(0), str);
          } else {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("More than two path segments: ");
            stringBuilder2.append(paramUri);
            throw new FileNotFoundException(stringBuilder2.toString());
          } 
          if (i != 0)
            return resources.getDrawable(i); 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("No resource found for: ");
          stringBuilder2.append(paramUri);
          throw new FileNotFoundException(stringBuilder2.toString());
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("No path: ");
        stringBuilder1.append(paramUri);
        throw new FileNotFoundException(stringBuilder1.toString());
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("No package found for authority: ");
        stringBuilder1.append(paramUri);
        throw new FileNotFoundException(stringBuilder1.toString());
      }  
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No authority: ");
    stringBuilder.append(paramUri);
    throw new FileNotFoundException(stringBuilder.toString());
  }
  
  public final Drawable g(String paramString) {
    StringBuilder stringBuilder1 = null;
    StringBuilder stringBuilder3 = null;
    StringBuilder stringBuilder2 = stringBuilder1;
    if (paramString != null) {
      stringBuilder2 = stringBuilder1;
      if (!paramString.isEmpty())
        if ("0".equals(paramString)) {
          stringBuilder2 = stringBuilder1;
        } else {
          try {
            int i = Integer.parseInt(paramString);
            stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append("android.resource://");
            stringBuilder1.append(this.o.getPackageName());
            stringBuilder1.append("/");
            stringBuilder1.append(i);
            String str = stringBuilder1.toString();
            Drawable.ConstantState constantState = this.p.get(str);
            if (constantState == null) {
              constantState = null;
            } else {
              drawable = constantState.newDrawable();
            } 
            if (drawable != null)
              return drawable; 
            Drawable drawable = b.i.e.a.c(this.o, i);
            if (drawable != null)
              this.p.put(str, drawable.getConstantState()); 
            return drawable;
          } catch (NumberFormatException numberFormatException) {
            Drawable drawable;
            StringBuilder stringBuilder;
            Drawable.ConstantState constantState = this.p.get(paramString);
            if (constantState == null) {
              constantState = null;
            } else {
              drawable = constantState.newDrawable();
            } 
            if (drawable != null)
              return drawable; 
            Uri uri = Uri.parse(paramString);
            try {
              boolean bool = "android.resource".equals(uri.getScheme());
              if (bool) {
                try {
                  drawable = f(uri);
                } catch (android.content.res.Resources.NotFoundException notFoundException) {
                  FileNotFoundException fileNotFoundException = new FileNotFoundException();
                  StringBuilder stringBuilder4 = new StringBuilder();
                  this();
                  stringBuilder4.append("Resource does not exist: ");
                  stringBuilder4.append(uri);
                  this(stringBuilder4.toString());
                  throw fileNotFoundException;
                } 
              } else {
                InputStream inputStream = this.o.getContentResolver().openInputStream(uri);
                if (inputStream != null) {
                  try {
                    drawable = Drawable.createFromStream(inputStream, null);
                  } finally {
                    try {
                      iOException.close();
                    } catch (IOException iOException1) {
                      StringBuilder stringBuilder4 = new StringBuilder();
                      this();
                      stringBuilder4.append("Error closing icon stream for ");
                      stringBuilder4.append(uri);
                      Log.e("SuggestionsAdapter", stringBuilder4.toString(), iOException1);
                    } 
                  } 
                } else {
                  FileNotFoundException fileNotFoundException = new FileNotFoundException();
                  StringBuilder stringBuilder4 = new StringBuilder();
                  this();
                  stringBuilder4.append("Failed to open ");
                  stringBuilder4.append(uri);
                  this(stringBuilder4.toString());
                  throw fileNotFoundException;
                } 
              } 
            } catch (FileNotFoundException fileNotFoundException) {
              stringBuilder = new StringBuilder();
              stringBuilder.append("Icon not found: ");
              stringBuilder.append(uri);
              stringBuilder.append(", ");
              stringBuilder.append(fileNotFoundException.getMessage());
              Log.w("SuggestionsAdapter", stringBuilder.toString());
              stringBuilder = stringBuilder3;
            } 
            stringBuilder2 = stringBuilder;
            if (stringBuilder != null) {
              this.p.put(paramString, stringBuilder.getConstantState());
              stringBuilder2 = stringBuilder;
            } 
          } catch (android.content.res.Resources.NotFoundException notFoundException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Icon resource not found: ");
            stringBuilder.append(paramString);
            Log.w("SuggestionsAdapter", stringBuilder.toString());
            return null;
          } 
        }  
    } 
    return (Drawable)stringBuilder2;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    try {
      return super.getDropDownView(paramInt, paramView, paramViewGroup);
    } catch (RuntimeException runtimeException) {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException);
      View view = this.l.inflate(this.k, paramViewGroup, false);
      if (view != null)
        ((a)view.getTag()).a.setText(runtimeException.toString()); 
      return view;
    } 
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    try {
      return super.getView(paramInt, paramView, paramViewGroup);
    } catch (RuntimeException runtimeException) {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException);
      View view = d(((b.j.a.a)this).e, ((b.j.a.a)this).d, paramViewGroup);
      ((a)view.getTag()).a.setText(runtimeException.toString());
      return view;
    } 
  }
  
  public Cursor h(SearchableInfo paramSearchableInfo, String paramString, int paramInt) {
    SearchableInfo searchableInfo = null;
    if (paramSearchableInfo == null)
      return null; 
    String str1 = paramSearchableInfo.getSuggestAuthority();
    if (str1 == null)
      return null; 
    Uri.Builder builder = (new Uri.Builder()).scheme("content").authority(str1).query("").fragment("");
    String str2 = paramSearchableInfo.getSuggestPath();
    if (str2 != null)
      builder.appendEncodedPath(str2); 
    builder.appendPath("search_suggest_query");
    str2 = paramSearchableInfo.getSuggestSelection();
    if (str2 != null) {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = paramString;
    } else {
      builder.appendPath(paramString);
      paramSearchableInfo = searchableInfo;
    } 
    if (paramInt > 0)
      builder.appendQueryParameter("limit", String.valueOf(paramInt)); 
    Uri uri = builder.build();
    return ((b.j.a.a)this).e.getContentResolver().query(uri, null, str2, (String[])paramSearchableInfo, null);
  }
  
  public boolean hasStableIds() {
    return false;
  }
  
  public final void j(Cursor paramCursor) {
    if (paramCursor != null) {
      Bundle bundle = paramCursor.getExtras();
    } else {
      paramCursor = null;
    } 
    if (paramCursor == null || paramCursor.getBoolean("in_progress"));
  }
  
  public void notifyDataSetChanged() {
    super.notifyDataSetChanged();
    j(((b.j.a.a)this).d);
  }
  
  public void notifyDataSetInvalidated() {
    super.notifyDataSetInvalidated();
    j(((b.j.a.a)this).d);
  }
  
  public void onClick(View paramView) {
    Object object = paramView.getTag();
    if (object instanceof CharSequence)
      this.m.z((CharSequence)object); 
  }
  
  public static final class a {
    public final TextView a;
    
    public final TextView b;
    
    public final ImageView c;
    
    public final ImageView d;
    
    public final ImageView e;
    
    public a(View param1View) {
      this.a = (TextView)param1View.findViewById(16908308);
      this.b = (TextView)param1View.findViewById(16908309);
      this.c = (ImageView)param1View.findViewById(16908295);
      this.d = (ImageView)param1View.findViewById(16908296);
      this.e = (ImageView)param1View.findViewById(f.edit_query);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\r0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */