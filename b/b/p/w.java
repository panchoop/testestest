package b.b.p;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import b.b.k.g;
import b.i.m.l;

public class w extends Spinner {
  public static final int[] j = new int[] { 16843505 };
  
  public final e b;
  
  public final Context c;
  
  public h0 d;
  
  public SpinnerAdapter e;
  
  public final boolean f;
  
  public f g;
  
  public int h;
  
  public final Rect i;
  
  public w(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   7: aload_0
    //   8: new android/graphics/Rect
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: putfield i : Landroid/graphics/Rect;
    //   18: aload_0
    //   19: aload_0
    //   20: invokevirtual getContext : ()Landroid/content/Context;
    //   23: invokestatic a : (Landroid/view/View;Landroid/content/Context;)V
    //   26: aload_1
    //   27: aload_2
    //   28: getstatic b/b/j.Spinner : [I
    //   31: iload_3
    //   32: iconst_0
    //   33: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   36: astore #9
    //   38: aload_0
    //   39: new b/b/p/e
    //   42: dup
    //   43: aload_0
    //   44: invokespecial <init> : (Landroid/view/View;)V
    //   47: putfield b : Lb/b/p/e;
    //   50: aload #9
    //   52: getstatic b/b/j.Spinner_popupTheme : I
    //   55: iconst_0
    //   56: invokevirtual getResourceId : (II)I
    //   59: istore #4
    //   61: iload #4
    //   63: ifeq -> 83
    //   66: aload_0
    //   67: new b/b/o/c
    //   70: dup
    //   71: aload_1
    //   72: iload #4
    //   74: invokespecial <init> : (Landroid/content/Context;I)V
    //   77: putfield c : Landroid/content/Context;
    //   80: goto -> 88
    //   83: aload_0
    //   84: aload_1
    //   85: putfield c : Landroid/content/Context;
    //   88: aconst_null
    //   89: astore #7
    //   91: iconst_m1
    //   92: istore #5
    //   94: aload_1
    //   95: aload_2
    //   96: getstatic b/b/p/w.j : [I
    //   99: iload_3
    //   100: iconst_0
    //   101: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   104: astore #6
    //   106: aload #6
    //   108: astore #7
    //   110: iload #5
    //   112: istore #4
    //   114: aload #6
    //   116: astore #8
    //   118: aload #6
    //   120: iconst_0
    //   121: invokevirtual hasValue : (I)Z
    //   124: ifeq -> 202
    //   127: aload #6
    //   129: astore #7
    //   131: aload #6
    //   133: iconst_0
    //   134: iconst_0
    //   135: invokevirtual getInt : (II)I
    //   138: istore #4
    //   140: aload #6
    //   142: astore #8
    //   144: goto -> 202
    //   147: astore_1
    //   148: aload #7
    //   150: astore_2
    //   151: goto -> 439
    //   154: astore #8
    //   156: goto -> 171
    //   159: astore_1
    //   160: aload #7
    //   162: astore_2
    //   163: goto -> 439
    //   166: astore #8
    //   168: aconst_null
    //   169: astore #6
    //   171: aload #6
    //   173: astore #7
    //   175: ldc 'AppCompatSpinner'
    //   177: ldc 'Could not read android:spinnerMode'
    //   179: aload #8
    //   181: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   184: pop
    //   185: iload #5
    //   187: istore #4
    //   189: aload #6
    //   191: ifnull -> 207
    //   194: aload #6
    //   196: astore #8
    //   198: iload #5
    //   200: istore #4
    //   202: aload #8
    //   204: invokevirtual recycle : ()V
    //   207: iload #4
    //   209: ifeq -> 331
    //   212: iload #4
    //   214: iconst_1
    //   215: if_icmpeq -> 221
    //   218: goto -> 360
    //   221: new b/b/p/w$d
    //   224: dup
    //   225: aload_0
    //   226: aload_0
    //   227: getfield c : Landroid/content/Context;
    //   230: aload_2
    //   231: iload_3
    //   232: invokespecial <init> : (Lb/b/p/w;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    //   235: astore #6
    //   237: aload_0
    //   238: getfield c : Landroid/content/Context;
    //   241: aload_2
    //   242: getstatic b/b/j.Spinner : [I
    //   245: iload_3
    //   246: iconst_0
    //   247: invokestatic q : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Lb/b/p/x0;
    //   250: astore #7
    //   252: aload_0
    //   253: aload #7
    //   255: getstatic b/b/j.Spinner_android_dropDownWidth : I
    //   258: bipush #-2
    //   260: invokevirtual k : (II)I
    //   263: putfield h : I
    //   266: aload #7
    //   268: getstatic b/b/j.Spinner_android_popupBackground : I
    //   271: invokevirtual g : (I)Landroid/graphics/drawable/Drawable;
    //   274: astore #8
    //   276: aload #6
    //   278: getfield C : Landroid/widget/PopupWindow;
    //   281: aload #8
    //   283: invokevirtual setBackgroundDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   286: aload #6
    //   288: aload #9
    //   290: getstatic b/b/j.Spinner_android_prompt : I
    //   293: invokevirtual getString : (I)Ljava/lang/String;
    //   296: putfield G : Ljava/lang/CharSequence;
    //   299: aload #7
    //   301: getfield b : Landroid/content/res/TypedArray;
    //   304: invokevirtual recycle : ()V
    //   307: aload_0
    //   308: aload #6
    //   310: putfield g : Lb/b/p/w$f;
    //   313: aload_0
    //   314: new b/b/p/v
    //   317: dup
    //   318: aload_0
    //   319: aload_0
    //   320: aload #6
    //   322: invokespecial <init> : (Lb/b/p/w;Landroid/view/View;Lb/b/p/w$d;)V
    //   325: putfield d : Lb/b/p/h0;
    //   328: goto -> 360
    //   331: new b/b/p/w$b
    //   334: dup
    //   335: aload_0
    //   336: invokespecial <init> : (Lb/b/p/w;)V
    //   339: astore #6
    //   341: aload_0
    //   342: aload #6
    //   344: putfield g : Lb/b/p/w$f;
    //   347: aload #6
    //   349: aload #9
    //   351: getstatic b/b/j.Spinner_android_prompt : I
    //   354: invokevirtual getString : (I)Ljava/lang/String;
    //   357: invokevirtual h : (Ljava/lang/CharSequence;)V
    //   360: aload #9
    //   362: getstatic b/b/j.Spinner_android_entries : I
    //   365: invokevirtual getTextArray : (I)[Ljava/lang/CharSequence;
    //   368: astore #6
    //   370: aload #6
    //   372: ifnull -> 400
    //   375: new android/widget/ArrayAdapter
    //   378: dup
    //   379: aload_1
    //   380: ldc 17367048
    //   382: aload #6
    //   384: invokespecial <init> : (Landroid/content/Context;I[Ljava/lang/Object;)V
    //   387: astore_1
    //   388: aload_1
    //   389: getstatic b/b/g.support_simple_spinner_dropdown_item : I
    //   392: invokevirtual setDropDownViewResource : (I)V
    //   395: aload_0
    //   396: aload_1
    //   397: invokevirtual setAdapter : (Landroid/widget/SpinnerAdapter;)V
    //   400: aload #9
    //   402: invokevirtual recycle : ()V
    //   405: aload_0
    //   406: iconst_1
    //   407: putfield f : Z
    //   410: aload_0
    //   411: getfield e : Landroid/widget/SpinnerAdapter;
    //   414: astore_1
    //   415: aload_1
    //   416: ifnull -> 429
    //   419: aload_0
    //   420: aload_1
    //   421: invokevirtual setAdapter : (Landroid/widget/SpinnerAdapter;)V
    //   424: aload_0
    //   425: aconst_null
    //   426: putfield e : Landroid/widget/SpinnerAdapter;
    //   429: aload_0
    //   430: getfield b : Lb/b/p/e;
    //   433: aload_2
    //   434: iload_3
    //   435: invokevirtual d : (Landroid/util/AttributeSet;I)V
    //   438: return
    //   439: aload_2
    //   440: ifnull -> 447
    //   443: aload_2
    //   444: invokevirtual recycle : ()V
    //   447: aload_1
    //   448: athrow
    // Exception table:
    //   from	to	target	type
    //   94	106	166	java/lang/Exception
    //   94	106	159	finally
    //   118	127	154	java/lang/Exception
    //   118	127	147	finally
    //   131	140	154	java/lang/Exception
    //   131	140	147	finally
    //   175	185	147	finally
  }
  
  public int a(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable) {
    int k = 0;
    if (paramSpinnerAdapter == null)
      return 0; 
    int m = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int i = Math.max(0, getSelectedItemPosition());
    int n = Math.min(paramSpinnerAdapter.getCount(), i + 15);
    int j = Math.max(0, i - 15 - n - i);
    View view = null;
    i = 0;
    while (j < n) {
      int i3 = paramSpinnerAdapter.getItemViewType(j);
      int i2 = k;
      if (i3 != k) {
        view = null;
        i2 = i3;
      } 
      view = paramSpinnerAdapter.getView(j, view, (ViewGroup)this);
      if (view.getLayoutParams() == null)
        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2)); 
      view.measure(m, i1);
      i = Math.max(i, view.getMeasuredWidth());
      j++;
      k = i2;
    } 
    j = i;
    if (paramDrawable != null) {
      paramDrawable.getPadding(this.i);
      Rect rect = this.i;
      j = i + rect.left + rect.right;
    } 
    return j;
  }
  
  public void b() {
    this.g.f(getTextDirection(), getTextAlignment());
  }
  
  public void drawableStateChanged() {
    super.drawableStateChanged();
    e e1 = this.b;
    if (e1 != null)
      e1.a(); 
  }
  
  public int getDropDownHorizontalOffset() {
    f f1 = this.g;
    return (f1 != null) ? f1.d() : super.getDropDownHorizontalOffset();
  }
  
  public int getDropDownVerticalOffset() {
    f f1 = this.g;
    return (f1 != null) ? f1.j() : super.getDropDownVerticalOffset();
  }
  
  public int getDropDownWidth() {
    return (this.g != null) ? this.h : super.getDropDownWidth();
  }
  
  public final f getInternalPopup() {
    return this.g;
  }
  
  public Drawable getPopupBackground() {
    f f1 = this.g;
    return (f1 != null) ? f1.n() : super.getPopupBackground();
  }
  
  public Context getPopupContext() {
    return this.c;
  }
  
  public CharSequence getPrompt() {
    CharSequence charSequence;
    f f1 = this.g;
    if (f1 != null) {
      charSequence = f1.b();
    } else {
      charSequence = super.getPrompt();
    } 
    return charSequence;
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    e e1 = this.b;
    if (e1 != null) {
      ColorStateList colorStateList = e1.b();
    } else {
      e1 = null;
    } 
    return (ColorStateList)e1;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    e e1 = this.b;
    if (e1 != null) {
      PorterDuff.Mode mode = e1.c();
    } else {
      e1 = null;
    } 
    return (PorterDuff.Mode)e1;
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    f f1 = this.g;
    if (f1 != null && f1.a())
      this.g.dismiss(); 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (this.g != null && View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE)
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight()); 
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    e e1 = (e)paramParcelable;
    super.onRestoreInstanceState(e1.getSuperState());
    if (e1.b) {
      ViewTreeObserver viewTreeObserver = getViewTreeObserver();
      if (viewTreeObserver != null)
        viewTreeObserver.addOnGlobalLayoutListener(new a(this)); 
    } 
  }
  
  public Parcelable onSaveInstanceState() {
    boolean bool;
    e e1 = new e(super.onSaveInstanceState());
    f f1 = this.g;
    if (f1 != null && f1.a()) {
      bool = true;
    } else {
      bool = false;
    } 
    e1.b = bool;
    return (Parcelable)e1;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    h0 h01 = this.d;
    return (h01 != null && h01.onTouch((View)this, paramMotionEvent)) ? true : super.onTouchEvent(paramMotionEvent);
  }
  
  public boolean performClick() {
    f f1 = this.g;
    if (f1 != null) {
      if (!f1.a())
        b(); 
      return true;
    } 
    return super.performClick();
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter) {
    if (!this.f) {
      this.e = paramSpinnerAdapter;
      return;
    } 
    super.setAdapter(paramSpinnerAdapter);
    if (this.g != null) {
      Context context2 = this.c;
      Context context1 = context2;
      if (context2 == null)
        context1 = getContext(); 
      this.g.o(new c(paramSpinnerAdapter, context1.getTheme()));
    } 
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    e e1 = this.b;
    if (e1 != null)
      e1.e(); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    e e1 = this.b;
    if (e1 != null)
      e1.f(paramInt); 
  }
  
  public void setDropDownHorizontalOffset(int paramInt) {
    f f1 = this.g;
    if (f1 != null) {
      f1.p(paramInt);
      this.g.c(paramInt);
    } else {
      super.setDropDownHorizontalOffset(paramInt);
    } 
  }
  
  public void setDropDownVerticalOffset(int paramInt) {
    f f1 = this.g;
    if (f1 != null) {
      f1.m(paramInt);
    } else {
      super.setDropDownVerticalOffset(paramInt);
    } 
  }
  
  public void setDropDownWidth(int paramInt) {
    if (this.g != null) {
      this.h = paramInt;
    } else {
      super.setDropDownWidth(paramInt);
    } 
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable) {
    f f1 = this.g;
    if (f1 != null) {
      f1.l(paramDrawable);
    } else {
      super.setPopupBackgroundDrawable(paramDrawable);
    } 
  }
  
  public void setPopupBackgroundResource(int paramInt) {
    setPopupBackgroundDrawable(b.b.l.a.a.b(getPopupContext(), paramInt));
  }
  
  public void setPrompt(CharSequence paramCharSequence) {
    f f1 = this.g;
    if (f1 != null) {
      f1.h(paramCharSequence);
    } else {
      super.setPrompt(paramCharSequence);
    } 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    e e1 = this.b;
    if (e1 != null)
      e1.h(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    e e1 = this.b;
    if (e1 != null)
      e1.i(paramMode); 
  }
  
  public class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final w b;
    
    public a(w this$0) {}
    
    public void onGlobalLayout() {
      if (!this.b.getInternalPopup().a())
        this.b.b(); 
      ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
      if (viewTreeObserver != null)
        viewTreeObserver.removeOnGlobalLayoutListener(this); 
    }
  }
  
  public class b implements f, DialogInterface.OnClickListener {
    public g b;
    
    public ListAdapter c;
    
    public CharSequence d;
    
    public final w e;
    
    public b(w this$0) {}
    
    public boolean a() {
      boolean bool;
      g g1 = this.b;
      if (g1 != null) {
        bool = g1.isShowing();
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public CharSequence b() {
      return this.d;
    }
    
    public void c(int param1Int) {
      Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }
    
    public int d() {
      return 0;
    }
    
    public void dismiss() {
      g g1 = this.b;
      if (g1 != null) {
        g1.dismiss();
        this.b = null;
      } 
    }
    
    public void f(int param1Int1, int param1Int2) {
      if (this.c == null)
        return; 
      g.a a = new g.a(this.e.getPopupContext());
      CharSequence charSequence = this.d;
      if (charSequence != null)
        a.a.f = charSequence; 
      ListAdapter listAdapter = this.c;
      int i = this.e.getSelectedItemPosition();
      AlertController.b b1 = a.a;
      b1.q = listAdapter;
      b1.r = this;
      b1.w = i;
      b1.v = true;
      g g1 = a.a();
      this.b = g1;
      ListView listView = g1.d.g;
      listView.setTextDirection(param1Int1);
      listView.setTextAlignment(param1Int2);
      this.b.show();
    }
    
    public void h(CharSequence param1CharSequence) {
      this.d = param1CharSequence;
    }
    
    public int j() {
      return 0;
    }
    
    public void l(Drawable param1Drawable) {
      Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
    
    public void m(int param1Int) {
      Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }
    
    public Drawable n() {
      return null;
    }
    
    public void o(ListAdapter param1ListAdapter) {
      this.c = param1ListAdapter;
    }
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      this.e.setSelection(param1Int);
      if (this.e.getOnItemClickListener() != null)
        this.e.performItemClick(null, param1Int, this.c.getItemId(param1Int)); 
      g g1 = this.b;
      if (g1 != null) {
        g1.dismiss();
        this.b = null;
      } 
    }
    
    public void p(int param1Int) {
      Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
  }
  
  public static class c implements ListAdapter, SpinnerAdapter {
    public SpinnerAdapter b;
    
    public ListAdapter c;
    
    public c(SpinnerAdapter param1SpinnerAdapter, Resources.Theme param1Theme) {
      this.b = param1SpinnerAdapter;
      if (param1SpinnerAdapter instanceof ListAdapter)
        this.c = (ListAdapter)param1SpinnerAdapter; 
      if (param1Theme != null) {
        ThemedSpinnerAdapter themedSpinnerAdapter;
        if (Build.VERSION.SDK_INT >= 23 && param1SpinnerAdapter instanceof ThemedSpinnerAdapter) {
          themedSpinnerAdapter = (ThemedSpinnerAdapter)param1SpinnerAdapter;
          if (themedSpinnerAdapter.getDropDownViewTheme() != param1Theme)
            themedSpinnerAdapter.setDropDownViewTheme(param1Theme); 
        } else if (themedSpinnerAdapter instanceof t0) {
          t0 t0 = (t0)themedSpinnerAdapter;
          if (t0.getDropDownViewTheme() == null)
            t0.setDropDownViewTheme(param1Theme); 
        } 
      } 
    }
    
    public boolean areAllItemsEnabled() {
      ListAdapter listAdapter = this.c;
      return (listAdapter != null) ? listAdapter.areAllItemsEnabled() : true;
    }
    
    public int getCount() {
      int i;
      SpinnerAdapter spinnerAdapter = this.b;
      if (spinnerAdapter == null) {
        i = 0;
      } else {
        i = spinnerAdapter.getCount();
      } 
      return i;
    }
    
    public View getDropDownView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      SpinnerAdapter spinnerAdapter = this.b;
      if (spinnerAdapter == null) {
        param1View = null;
      } else {
        param1View = spinnerAdapter.getDropDownView(param1Int, param1View, param1ViewGroup);
      } 
      return param1View;
    }
    
    public Object getItem(int param1Int) {
      Object object = this.b;
      if (object == null) {
        object = null;
      } else {
        object = object.getItem(param1Int);
      } 
      return object;
    }
    
    public long getItemId(int param1Int) {
      long l;
      SpinnerAdapter spinnerAdapter = this.b;
      if (spinnerAdapter == null) {
        l = -1L;
      } else {
        l = spinnerAdapter.getItemId(param1Int);
      } 
      return l;
    }
    
    public int getItemViewType(int param1Int) {
      return 0;
    }
    
    public View getView(int param1Int, View param1View, ViewGroup param1ViewGroup) {
      SpinnerAdapter spinnerAdapter = this.b;
      if (spinnerAdapter == null) {
        param1View = null;
      } else {
        param1View = spinnerAdapter.getDropDownView(param1Int, param1View, param1ViewGroup);
      } 
      return param1View;
    }
    
    public int getViewTypeCount() {
      return 1;
    }
    
    public boolean hasStableIds() {
      boolean bool;
      SpinnerAdapter spinnerAdapter = this.b;
      if (spinnerAdapter != null && spinnerAdapter.hasStableIds()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean isEmpty() {
      boolean bool;
      if (getCount() == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean isEnabled(int param1Int) {
      ListAdapter listAdapter = this.c;
      return (listAdapter != null) ? listAdapter.isEnabled(param1Int) : true;
    }
    
    public void registerDataSetObserver(DataSetObserver param1DataSetObserver) {
      SpinnerAdapter spinnerAdapter = this.b;
      if (spinnerAdapter != null)
        spinnerAdapter.registerDataSetObserver(param1DataSetObserver); 
    }
    
    public void unregisterDataSetObserver(DataSetObserver param1DataSetObserver) {
      SpinnerAdapter spinnerAdapter = this.b;
      if (spinnerAdapter != null)
        spinnerAdapter.unregisterDataSetObserver(param1DataSetObserver); 
    }
  }
  
  public class d extends k0 implements f {
    public CharSequence G;
    
    public ListAdapter H;
    
    public final Rect I = new Rect();
    
    public int J;
    
    public final w K;
    
    public d(w this$0, Context param1Context, AttributeSet param1AttributeSet, int param1Int) {
      super(param1Context, param1AttributeSet, param1Int, 0);
      this.s = (View)this$0;
      s(true);
      this.q = 0;
      this.t = new a(this, this$0);
    }
    
    public CharSequence b() {
      return this.G;
    }
    
    public void f(int param1Int1, int param1Int2) {
      boolean bool = a();
      u();
      this.C.setInputMethodMode(2);
      i();
      f0 f0 = this.d;
      f0.setChoiceMode(1);
      f0.setTextDirection(param1Int1);
      f0.setTextAlignment(param1Int2);
      param1Int1 = this.K.getSelectedItemPosition();
      f0 = this.d;
      if (a() && f0 != null) {
        f0.setListSelectionHidden(false);
        f0.setSelection(param1Int1);
        if (f0.getChoiceMode() != 0)
          f0.setItemChecked(param1Int1, true); 
      } 
      if (bool)
        return; 
      ViewTreeObserver viewTreeObserver = this.K.getViewTreeObserver();
      if (viewTreeObserver != null) {
        b b = new b(this);
        viewTreeObserver.addOnGlobalLayoutListener(b);
        c c = new c(this, b);
        this.C.setOnDismissListener(c);
      } 
    }
    
    public void h(CharSequence param1CharSequence) {
      this.G = param1CharSequence;
    }
    
    public void o(ListAdapter param1ListAdapter) {
      super.o(param1ListAdapter);
      this.H = param1ListAdapter;
    }
    
    public void p(int param1Int) {
      this.J = param1Int;
    }
    
    public void u() {
      // Byte code:
      //   0: aload_0
      //   1: invokevirtual n : ()Landroid/graphics/drawable/Drawable;
      //   4: astore #8
      //   6: iconst_0
      //   7: istore_1
      //   8: aload #8
      //   10: ifnull -> 65
      //   13: aload #8
      //   15: aload_0
      //   16: getfield K : Lb/b/p/w;
      //   19: getfield i : Landroid/graphics/Rect;
      //   22: invokevirtual getPadding : (Landroid/graphics/Rect;)Z
      //   25: pop
      //   26: aload_0
      //   27: getfield K : Lb/b/p/w;
      //   30: invokestatic b : (Landroid/view/View;)Z
      //   33: ifeq -> 50
      //   36: aload_0
      //   37: getfield K : Lb/b/p/w;
      //   40: getfield i : Landroid/graphics/Rect;
      //   43: getfield right : I
      //   46: istore_1
      //   47: goto -> 62
      //   50: aload_0
      //   51: getfield K : Lb/b/p/w;
      //   54: getfield i : Landroid/graphics/Rect;
      //   57: getfield left : I
      //   60: ineg
      //   61: istore_1
      //   62: goto -> 86
      //   65: aload_0
      //   66: getfield K : Lb/b/p/w;
      //   69: getfield i : Landroid/graphics/Rect;
      //   72: astore #8
      //   74: aload #8
      //   76: iconst_0
      //   77: putfield right : I
      //   80: aload #8
      //   82: iconst_0
      //   83: putfield left : I
      //   86: aload_0
      //   87: getfield K : Lb/b/p/w;
      //   90: invokevirtual getPaddingLeft : ()I
      //   93: istore #6
      //   95: aload_0
      //   96: getfield K : Lb/b/p/w;
      //   99: invokevirtual getPaddingRight : ()I
      //   102: istore #7
      //   104: aload_0
      //   105: getfield K : Lb/b/p/w;
      //   108: invokevirtual getWidth : ()I
      //   111: istore #5
      //   113: aload_0
      //   114: getfield K : Lb/b/p/w;
      //   117: astore #8
      //   119: aload #8
      //   121: getfield h : I
      //   124: istore_2
      //   125: iload_2
      //   126: bipush #-2
      //   128: if_icmpne -> 216
      //   131: aload #8
      //   133: aload_0
      //   134: getfield H : Landroid/widget/ListAdapter;
      //   137: checkcast android/widget/SpinnerAdapter
      //   140: aload_0
      //   141: invokevirtual n : ()Landroid/graphics/drawable/Drawable;
      //   144: invokevirtual a : (Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
      //   147: istore_3
      //   148: aload_0
      //   149: getfield K : Lb/b/p/w;
      //   152: invokevirtual getContext : ()Landroid/content/Context;
      //   155: invokevirtual getResources : ()Landroid/content/res/Resources;
      //   158: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
      //   161: getfield widthPixels : I
      //   164: istore_2
      //   165: aload_0
      //   166: getfield K : Lb/b/p/w;
      //   169: getfield i : Landroid/graphics/Rect;
      //   172: astore #8
      //   174: iload_2
      //   175: aload #8
      //   177: getfield left : I
      //   180: isub
      //   181: aload #8
      //   183: getfield right : I
      //   186: isub
      //   187: istore #4
      //   189: iload_3
      //   190: istore_2
      //   191: iload_3
      //   192: iload #4
      //   194: if_icmple -> 200
      //   197: iload #4
      //   199: istore_2
      //   200: iload_2
      //   201: iload #5
      //   203: iload #6
      //   205: isub
      //   206: iload #7
      //   208: isub
      //   209: invokestatic max : (II)I
      //   212: istore_2
      //   213: goto -> 230
      //   216: iload_2
      //   217: iconst_m1
      //   218: if_icmpne -> 238
      //   221: iload #5
      //   223: iload #6
      //   225: isub
      //   226: iload #7
      //   228: isub
      //   229: istore_2
      //   230: aload_0
      //   231: iload_2
      //   232: invokevirtual r : (I)V
      //   235: goto -> 243
      //   238: aload_0
      //   239: iload_2
      //   240: invokevirtual r : (I)V
      //   243: aload_0
      //   244: getfield K : Lb/b/p/w;
      //   247: invokestatic b : (Landroid/view/View;)Z
      //   250: ifeq -> 274
      //   253: iload #5
      //   255: iload #7
      //   257: isub
      //   258: aload_0
      //   259: getfield f : I
      //   262: isub
      //   263: aload_0
      //   264: getfield J : I
      //   267: isub
      //   268: iload_1
      //   269: iadd
      //   270: istore_1
      //   271: goto -> 284
      //   274: iload #6
      //   276: aload_0
      //   277: getfield J : I
      //   280: iadd
      //   281: iload_1
      //   282: iadd
      //   283: istore_1
      //   284: aload_0
      //   285: iload_1
      //   286: putfield g : I
      //   289: return
    }
    
    public class a implements AdapterView.OnItemClickListener {
      public final w.d b;
      
      public a(w.d this$0, w param2w) {}
      
      public void onItemClick(AdapterView<?> param2AdapterView, View param2View, int param2Int, long param2Long) {
        this.b.K.setSelection(param2Int);
        if (this.b.K.getOnItemClickListener() != null) {
          w.d d1 = this.b;
          d1.K.performItemClick(param2View, param2Int, d1.H.getItemId(param2Int));
        } 
        this.b.dismiss();
      }
    }
    
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
      public final w.d b;
      
      public b(w.d this$0) {}
      
      public void onGlobalLayout() {
        w.d d1 = this.b;
        w w = d1.K;
        if (d1 != null) {
          boolean bool;
          if (l.D((View)w) && w.getGlobalVisibleRect(d1.I)) {
            bool = true;
          } else {
            bool = false;
          } 
          if (!bool) {
            this.b.dismiss();
          } else {
            this.b.u();
            w.d.t(this.b);
          } 
          return;
        } 
        throw null;
      }
    }
    
    public class c implements PopupWindow.OnDismissListener {
      public final ViewTreeObserver.OnGlobalLayoutListener b;
      
      public final w.d c;
      
      public c(w.d this$0, ViewTreeObserver.OnGlobalLayoutListener param2OnGlobalLayoutListener) {}
      
      public void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.c.K.getViewTreeObserver();
        if (viewTreeObserver != null)
          viewTreeObserver.removeGlobalOnLayoutListener(this.b); 
      }
    }
  }
  
  public class a implements AdapterView.OnItemClickListener {
    public final w.d b;
    
    public a(w this$0, w param1w) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      this.b.K.setSelection(param1Int);
      if (this.b.K.getOnItemClickListener() != null) {
        w.d d1 = this.b;
        d1.K.performItemClick(param1View, param1Int, d1.H.getItemId(param1Int));
      } 
      this.b.dismiss();
    }
  }
  
  public class b implements ViewTreeObserver.OnGlobalLayoutListener {
    public final w.d b;
    
    public b(w this$0) {}
    
    public void onGlobalLayout() {
      w.d d1 = this.b;
      w w = d1.K;
      if (d1 != null) {
        boolean bool;
        if (l.D((View)w) && w.getGlobalVisibleRect(d1.I)) {
          bool = true;
        } else {
          bool = false;
        } 
        if (!bool) {
          this.b.dismiss();
        } else {
          this.b.u();
          w.d.t(this.b);
        } 
        return;
      } 
      throw null;
    }
  }
  
  public class c implements PopupWindow.OnDismissListener {
    public final ViewTreeObserver.OnGlobalLayoutListener b;
    
    public final w.d c;
    
    public c(w this$0, ViewTreeObserver.OnGlobalLayoutListener param1OnGlobalLayoutListener) {}
    
    public void onDismiss() {
      ViewTreeObserver viewTreeObserver = this.c.K.getViewTreeObserver();
      if (viewTreeObserver != null)
        viewTreeObserver.removeGlobalOnLayoutListener(this.b); 
    }
  }
  
  public static class e extends View.BaseSavedState {
    public static final Parcelable.Creator<e> CREATOR = new a();
    
    public boolean b;
    
    public e(Parcel param1Parcel) {
      super(param1Parcel);
      boolean bool;
      if (param1Parcel.readByte() != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.b = bool;
    }
    
    public e(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeByte((byte)this.b);
    }
    
    public class a implements Parcelable.Creator<e> {
      public Object createFromParcel(Parcel param2Parcel) {
        return new w.e(param2Parcel);
      }
      
      public Object[] newArray(int param2Int) {
        return (Object[])new w.e[param2Int];
      }
    }
  }
  
  public class a implements Parcelable.Creator<e> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new w.e(param1Parcel);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new w.e[param1Int];
    }
  }
  
  public static interface f {
    boolean a();
    
    CharSequence b();
    
    void c(int param1Int);
    
    int d();
    
    void dismiss();
    
    void f(int param1Int1, int param1Int2);
    
    void h(CharSequence param1CharSequence);
    
    int j();
    
    void l(Drawable param1Drawable);
    
    void m(int param1Int);
    
    Drawable n();
    
    void o(ListAdapter param1ListAdapter);
    
    void p(int param1Int);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\p\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */