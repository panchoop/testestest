package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import b.b.o.b;
import b.b.p.d1;
import b.b.p.i0;
import b.b.p.r0;
import b.b.p.x0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends i0 implements b {
  public static final n r0;
  
  public Rect A = new Rect();
  
  public Rect B = new Rect();
  
  public int[] C = new int[2];
  
  public int[] D = new int[2];
  
  public final ImageView E;
  
  public final Drawable F;
  
  public final int G;
  
  public final int H;
  
  public final Intent I;
  
  public final Intent J;
  
  public final CharSequence K;
  
  public l L;
  
  public k M;
  
  public View.OnFocusChangeListener N;
  
  public m O;
  
  public View.OnClickListener P;
  
  public boolean Q;
  
  public boolean R;
  
  public b.j.a.a S;
  
  public boolean T;
  
  public CharSequence U;
  
  public boolean V;
  
  public boolean W;
  
  public int a0;
  
  public boolean b0;
  
  public CharSequence c0;
  
  public CharSequence d0;
  
  public boolean e0;
  
  public int f0;
  
  public SearchableInfo g0;
  
  public Bundle h0;
  
  public final Runnable i0 = new b(this);
  
  public Runnable j0 = new c(this);
  
  public final WeakHashMap<String, Drawable.ConstantState> k0 = new WeakHashMap<String, Drawable.ConstantState>();
  
  public final View.OnClickListener l0 = new f(this);
  
  public View.OnKeyListener m0 = new g(this);
  
  public final TextView.OnEditorActionListener n0 = new h(this);
  
  public final AdapterView.OnItemClickListener o0 = new i(this);
  
  public final AdapterView.OnItemSelectedListener p0 = new j(this);
  
  public final SearchAutoComplete q;
  
  public TextWatcher q0 = new a(this);
  
  public final View r;
  
  public final View s;
  
  public final View t;
  
  public final ImageView u;
  
  public final ImageView v;
  
  public final ImageView w;
  
  public final ImageView x;
  
  public final View y;
  
  public p z;
  
  static {
    n n1;
    if (Build.VERSION.SDK_INT < 29) {
      n1 = new n();
    } else {
      n1 = null;
    } 
    r0 = n1;
  }
  
  public SearchView(Context paramContext) {
    this(paramContext, null);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, b.b.a.searchViewStyle);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    x0 x0 = new x0(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, b.b.j.SearchView, paramInt, 0));
    LayoutInflater.from(paramContext).inflate(x0.l(b.b.j.SearchView_layout, b.b.g.abc_search_view), (ViewGroup)this, true);
    SearchAutoComplete searchAutoComplete = (SearchAutoComplete)findViewById(b.b.f.search_src_text);
    this.q = searchAutoComplete;
    searchAutoComplete.setSearchView(this);
    this.r = findViewById(b.b.f.search_edit_frame);
    this.s = findViewById(b.b.f.search_plate);
    this.t = findViewById(b.b.f.submit_area);
    this.u = (ImageView)findViewById(b.b.f.search_button);
    this.v = (ImageView)findViewById(b.b.f.search_go_btn);
    this.w = (ImageView)findViewById(b.b.f.search_close_btn);
    this.x = (ImageView)findViewById(b.b.f.search_voice_btn);
    this.E = (ImageView)findViewById(b.b.f.search_mag_icon);
    b.i.m.l.Z(this.s, x0.g(b.b.j.SearchView_queryBackground));
    this.t.setBackground(x0.g(b.b.j.SearchView_submitBackground));
    this.u.setImageDrawable(x0.g(b.b.j.SearchView_searchIcon));
    this.v.setImageDrawable(x0.g(b.b.j.SearchView_goIcon));
    this.w.setImageDrawable(x0.g(b.b.j.SearchView_closeIcon));
    this.x.setImageDrawable(x0.g(b.b.j.SearchView_voiceIcon));
    this.E.setImageDrawable(x0.g(b.b.j.SearchView_searchIcon));
    this.F = x0.g(b.b.j.SearchView_searchHintIcon);
    a.a.a.a.a.w0((View)this.u, getResources().getString(b.b.h.abc_searchview_description_search));
    this.G = x0.l(b.b.j.SearchView_suggestionRowLayout, b.b.g.abc_search_dropdown_item_icons_2line);
    this.H = x0.l(b.b.j.SearchView_commitIcon, 0);
    this.u.setOnClickListener(this.l0);
    this.w.setOnClickListener(this.l0);
    this.v.setOnClickListener(this.l0);
    this.x.setOnClickListener(this.l0);
    this.q.setOnClickListener(this.l0);
    this.q.addTextChangedListener(this.q0);
    this.q.setOnEditorActionListener(this.n0);
    this.q.setOnItemClickListener(this.o0);
    this.q.setOnItemSelectedListener(this.p0);
    this.q.setOnKeyListener(this.m0);
    this.q.setOnFocusChangeListener(new d(this));
    setIconifiedByDefault(x0.a(b.b.j.SearchView_iconifiedByDefault, true));
    paramInt = x0.f(b.b.j.SearchView_android_maxWidth, -1);
    if (paramInt != -1)
      setMaxWidth(paramInt); 
    this.K = x0.n(b.b.j.SearchView_defaultQueryHint);
    this.U = x0.n(b.b.j.SearchView_queryHint);
    paramInt = x0.j(b.b.j.SearchView_android_imeOptions, -1);
    if (paramInt != -1)
      setImeOptions(paramInt); 
    paramInt = x0.j(b.b.j.SearchView_android_inputType, -1);
    if (paramInt != -1)
      setInputType(paramInt); 
    setFocusable(x0.a(b.b.j.SearchView_android_focusable, true));
    x0.b.recycle();
    Intent intent = new Intent("android.speech.action.WEB_SEARCH");
    this.I = intent;
    intent.addFlags(268435456);
    this.I.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    this.J = intent;
    intent.addFlags(268435456);
    View view = findViewById(this.q.getDropDownAnchor());
    this.y = view;
    if (view != null)
      view.addOnLayoutChangeListener(new e(this)); 
    I(this.Q);
    F();
  }
  
  private int getPreferredHeight() {
    return getContext().getResources().getDimensionPixelSize(b.b.d.abc_search_view_preferred_height);
  }
  
  private int getPreferredWidth() {
    return getContext().getResources().getDimensionPixelSize(b.b.d.abc_search_view_preferred_width);
  }
  
  private void setQuery(CharSequence paramCharSequence) {
    int i;
    this.q.setText(paramCharSequence);
    SearchAutoComplete searchAutoComplete = this.q;
    if (TextUtils.isEmpty(paramCharSequence)) {
      i = 0;
    } else {
      i = paramCharSequence.length();
    } 
    searchAutoComplete.setSelection(i);
  }
  
  public static boolean u(Context paramContext) {
    boolean bool;
    if ((paramContext.getResources().getConfiguration()).orientation == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void A() {
    I(false);
    this.q.requestFocus();
    this.q.setImeVisibility(true);
    View.OnClickListener onClickListener = this.P;
    if (onClickListener != null)
      onClickListener.onClick((View)this); 
  }
  
  public void B() {
    Editable editable = this.q.getText();
    if (editable != null && TextUtils.getTrimmedLength((CharSequence)editable) > 0) {
      l l1 = this.L;
      if (l1 == null || !l1.a(editable.toString())) {
        if (this.g0 != null)
          v(0, null, editable.toString()); 
        this.q.setImeVisibility(false);
        this.q.dismissDropDown();
      } 
    } 
  }
  
  public boolean C(int paramInt, KeyEvent paramKeyEvent) {
    if (this.g0 == null)
      return false; 
    if (this.S == null)
      return false; 
    if (paramKeyEvent.getAction() == 0 && paramKeyEvent.hasNoModifiers()) {
      if (paramInt == 66 || paramInt == 84 || paramInt == 61)
        return x(this.q.getListSelection()); 
      if (paramInt == 21 || paramInt == 22) {
        if (paramInt == 21) {
          paramInt = 0;
        } else {
          paramInt = this.q.length();
        } 
        this.q.setSelection(paramInt);
        this.q.setListSelection(0);
        this.q.clearListSelection();
        this.q.a();
        return true;
      } 
      if (paramInt == 19 && this.q.getListSelection() == 0)
        return false; 
    } 
    return false;
  }
  
  public final void D() {
    boolean bool = TextUtils.isEmpty((CharSequence)this.q.getText());
    byte b3 = 1;
    int i = bool ^ true;
    byte b2 = 0;
    byte b1 = b3;
    if (i == 0)
      if (this.Q && !this.e0) {
        b1 = b3;
      } else {
        b1 = 0;
      }  
    ImageView imageView = this.w;
    if (b1) {
      b1 = b2;
    } else {
      b1 = 8;
    } 
    imageView.setVisibility(b1);
    Drawable drawable = this.w.getDrawable();
    if (drawable != null) {
      int[] arrayOfInt;
      if (i != 0) {
        arrayOfInt = ViewGroup.ENABLED_STATE_SET;
      } else {
        arrayOfInt = ViewGroup.EMPTY_STATE_SET;
      } 
      drawable.setState(arrayOfInt);
    } 
  }
  
  public void E() {
    int[] arrayOfInt;
    if (this.q.hasFocus()) {
      arrayOfInt = ViewGroup.FOCUSED_STATE_SET;
    } else {
      arrayOfInt = ViewGroup.EMPTY_STATE_SET;
    } 
    Drawable drawable = this.s.getBackground();
    if (drawable != null)
      drawable.setState(arrayOfInt); 
    drawable = this.t.getBackground();
    if (drawable != null)
      drawable.setState(arrayOfInt); 
    invalidate();
  }
  
  public final void F() {
    SpannableStringBuilder spannableStringBuilder;
    CharSequence charSequence2 = getQueryHint();
    SearchAutoComplete searchAutoComplete = this.q;
    CharSequence charSequence1 = charSequence2;
    if (charSequence2 == null)
      charSequence1 = ""; 
    charSequence2 = charSequence1;
    if (this.Q)
      if (this.F == null) {
        charSequence2 = charSequence1;
      } else {
        int i = (int)(this.q.getTextSize() * 1.25D);
        this.F.setBounds(0, 0, i, i);
        spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 1, 2, 33);
        spannableStringBuilder.append(charSequence1);
      }  
    searchAutoComplete.setHint((CharSequence)spannableStringBuilder);
  }
  
  public final void G() {
    // Byte code:
    //   0: aload_0
    //   1: getfield T : Z
    //   4: istore_3
    //   5: iconst_0
    //   6: istore_2
    //   7: iload_3
    //   8: ifne -> 18
    //   11: aload_0
    //   12: getfield b0 : Z
    //   15: ifeq -> 30
    //   18: aload_0
    //   19: getfield R : Z
    //   22: ifne -> 30
    //   25: iconst_1
    //   26: istore_1
    //   27: goto -> 32
    //   30: iconst_0
    //   31: istore_1
    //   32: iload_1
    //   33: ifeq -> 63
    //   36: iload_2
    //   37: istore_1
    //   38: aload_0
    //   39: getfield v : Landroid/widget/ImageView;
    //   42: invokevirtual getVisibility : ()I
    //   45: ifeq -> 66
    //   48: aload_0
    //   49: getfield x : Landroid/widget/ImageView;
    //   52: invokevirtual getVisibility : ()I
    //   55: ifne -> 63
    //   58: iload_2
    //   59: istore_1
    //   60: goto -> 66
    //   63: bipush #8
    //   65: istore_1
    //   66: aload_0
    //   67: getfield t : Landroid/view/View;
    //   70: iload_1
    //   71: invokevirtual setVisibility : (I)V
    //   74: return
  }
  
  public final void H(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield T : Z
    //   4: istore #4
    //   6: iconst_0
    //   7: istore_3
    //   8: iload #4
    //   10: ifeq -> 68
    //   13: iload #4
    //   15: ifne -> 25
    //   18: aload_0
    //   19: getfield b0 : Z
    //   22: ifeq -> 37
    //   25: aload_0
    //   26: getfield R : Z
    //   29: ifne -> 37
    //   32: iconst_1
    //   33: istore_2
    //   34: goto -> 39
    //   37: iconst_0
    //   38: istore_2
    //   39: iload_2
    //   40: ifeq -> 68
    //   43: aload_0
    //   44: invokevirtual hasFocus : ()Z
    //   47: ifeq -> 68
    //   50: iload_3
    //   51: istore_2
    //   52: iload_1
    //   53: ifne -> 71
    //   56: aload_0
    //   57: getfield b0 : Z
    //   60: ifne -> 68
    //   63: iload_3
    //   64: istore_2
    //   65: goto -> 71
    //   68: bipush #8
    //   70: istore_2
    //   71: aload_0
    //   72: getfield v : Landroid/widget/ImageView;
    //   75: iload_2
    //   76: invokevirtual setVisibility : (I)V
    //   79: return
  }
  
  public final void I(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield R : Z
    //   5: iconst_0
    //   6: istore_3
    //   7: iload_1
    //   8: ifeq -> 16
    //   11: iconst_0
    //   12: istore_2
    //   13: goto -> 19
    //   16: bipush #8
    //   18: istore_2
    //   19: aload_0
    //   20: getfield q : Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
    //   23: invokevirtual getText : ()Landroid/text/Editable;
    //   26: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   29: iconst_1
    //   30: ixor
    //   31: istore #4
    //   33: aload_0
    //   34: getfield u : Landroid/widget/ImageView;
    //   37: iload_2
    //   38: invokevirtual setVisibility : (I)V
    //   41: aload_0
    //   42: iload #4
    //   44: invokevirtual H : (Z)V
    //   47: aload_0
    //   48: getfield r : Landroid/view/View;
    //   51: astore #5
    //   53: iload_1
    //   54: ifeq -> 63
    //   57: bipush #8
    //   59: istore_2
    //   60: goto -> 65
    //   63: iconst_0
    //   64: istore_2
    //   65: aload #5
    //   67: iload_2
    //   68: invokevirtual setVisibility : (I)V
    //   71: aload_0
    //   72: getfield E : Landroid/widget/ImageView;
    //   75: invokevirtual getDrawable : ()Landroid/graphics/drawable/Drawable;
    //   78: ifnull -> 90
    //   81: iload_3
    //   82: istore_2
    //   83: aload_0
    //   84: getfield Q : Z
    //   87: ifeq -> 93
    //   90: bipush #8
    //   92: istore_2
    //   93: aload_0
    //   94: getfield E : Landroid/widget/ImageView;
    //   97: iload_2
    //   98: invokevirtual setVisibility : (I)V
    //   101: aload_0
    //   102: invokevirtual D : ()V
    //   105: aload_0
    //   106: iload #4
    //   108: iconst_1
    //   109: ixor
    //   110: invokevirtual J : (Z)V
    //   113: aload_0
    //   114: invokevirtual G : ()V
    //   117: return
  }
  
  public final void J(boolean paramBoolean) {
    boolean bool = this.b0;
    byte b2 = 8;
    byte b1 = b2;
    if (bool) {
      b1 = b2;
      if (!this.R) {
        b1 = b2;
        if (paramBoolean) {
          this.v.setVisibility(8);
          b1 = 0;
        } 
      } 
    } 
    this.x.setVisibility(b1);
  }
  
  public void a() {
    if (this.e0)
      return; 
    this.e0 = true;
    int i = this.q.getImeOptions();
    this.f0 = i;
    this.q.setImeOptions(i | 0x2000000);
    this.q.setText("");
    setIconified(false);
  }
  
  public void clearFocus() {
    this.W = true;
    super.clearFocus();
    this.q.clearFocus();
    this.q.setImeVisibility(false);
    this.W = false;
  }
  
  public void f() {
    this.q.setText("");
    SearchAutoComplete searchAutoComplete = this.q;
    searchAutoComplete.setSelection(searchAutoComplete.length());
    this.d0 = "";
    clearFocus();
    I(true);
    this.q.setImeOptions(this.f0);
    this.e0 = false;
  }
  
  public int getImeOptions() {
    return this.q.getImeOptions();
  }
  
  public int getInputType() {
    return this.q.getInputType();
  }
  
  public int getMaxWidth() {
    return this.a0;
  }
  
  public CharSequence getQuery() {
    return (CharSequence)this.q.getText();
  }
  
  public CharSequence getQueryHint() {
    CharSequence charSequence = this.U;
    if (charSequence == null) {
      SearchableInfo searchableInfo = this.g0;
      if (searchableInfo != null && searchableInfo.getHintId() != 0) {
        CharSequence charSequence1 = getContext().getText(this.g0.getHintId());
      } else {
        charSequence = this.K;
      } 
    } 
    return charSequence;
  }
  
  public int getSuggestionCommitIconResId() {
    return this.H;
  }
  
  public int getSuggestionRowLayout() {
    return this.G;
  }
  
  public b.j.a.a getSuggestionsAdapter() {
    return this.S;
  }
  
  public void onDetachedFromWindow() {
    removeCallbacks(this.i0);
    post(this.j0);
    super.onDetachedFromWindow();
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean) {
      SearchAutoComplete searchAutoComplete = this.q;
      Rect rect1 = this.A;
      searchAutoComplete.getLocationInWindow(this.C);
      getLocationInWindow(this.D);
      int[] arrayOfInt2 = this.C;
      paramInt1 = arrayOfInt2[1];
      int[] arrayOfInt1 = this.D;
      paramInt3 = paramInt1 - arrayOfInt1[1];
      paramInt1 = arrayOfInt2[0] - arrayOfInt1[0];
      rect1.set(paramInt1, paramInt3, searchAutoComplete.getWidth() + paramInt1, searchAutoComplete.getHeight() + paramInt3);
      Rect rect2 = this.B;
      rect1 = this.A;
      rect2.set(rect1.left, 0, rect1.right, paramInt4 - paramInt2);
      p p1 = this.z;
      if (p1 == null) {
        p1 = new p(this.B, this.A, (View)this.q);
        this.z = p1;
        setTouchDelegate(p1);
      } else {
        p1.a(this.B, this.A);
      } 
    } 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield R : Z
    //   4: ifeq -> 14
    //   7: aload_0
    //   8: iload_1
    //   9: iload_2
    //   10: invokespecial onMeasure : (II)V
    //   13: return
    //   14: iload_1
    //   15: invokestatic getMode : (I)I
    //   18: istore #4
    //   20: iload_1
    //   21: invokestatic getSize : (I)I
    //   24: istore_3
    //   25: iload #4
    //   27: ldc_w -2147483648
    //   30: if_icmpeq -> 90
    //   33: iload #4
    //   35: ifeq -> 70
    //   38: iload #4
    //   40: ldc_w 1073741824
    //   43: if_icmpeq -> 51
    //   46: iload_3
    //   47: istore_1
    //   48: goto -> 113
    //   51: aload_0
    //   52: getfield a0 : I
    //   55: istore #4
    //   57: iload_3
    //   58: istore_1
    //   59: iload #4
    //   61: ifle -> 113
    //   64: iload #4
    //   66: istore_1
    //   67: goto -> 99
    //   70: aload_0
    //   71: getfield a0 : I
    //   74: istore_1
    //   75: iload_1
    //   76: ifle -> 82
    //   79: goto -> 113
    //   82: aload_0
    //   83: invokespecial getPreferredWidth : ()I
    //   86: istore_1
    //   87: goto -> 113
    //   90: aload_0
    //   91: getfield a0 : I
    //   94: istore_1
    //   95: iload_1
    //   96: ifle -> 102
    //   99: goto -> 107
    //   102: aload_0
    //   103: invokespecial getPreferredWidth : ()I
    //   106: istore_1
    //   107: iload_1
    //   108: iload_3
    //   109: invokestatic min : (II)I
    //   112: istore_1
    //   113: iload_2
    //   114: invokestatic getMode : (I)I
    //   117: istore_3
    //   118: iload_2
    //   119: invokestatic getSize : (I)I
    //   122: istore_2
    //   123: iload_3
    //   124: ldc_w -2147483648
    //   127: if_icmpeq -> 145
    //   130: iload_3
    //   131: ifeq -> 137
    //   134: goto -> 154
    //   137: aload_0
    //   138: invokespecial getPreferredHeight : ()I
    //   141: istore_2
    //   142: goto -> 154
    //   145: aload_0
    //   146: invokespecial getPreferredHeight : ()I
    //   149: iload_2
    //   150: invokestatic min : (II)I
    //   153: istore_2
    //   154: aload_0
    //   155: iload_1
    //   156: ldc_w 1073741824
    //   159: invokestatic makeMeasureSpec : (II)I
    //   162: iload_2
    //   163: ldc_w 1073741824
    //   166: invokestatic makeMeasureSpec : (II)I
    //   169: invokespecial onMeasure : (II)V
    //   172: return
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof o)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    o o = (o)paramParcelable;
    super.onRestoreInstanceState(o.b);
    I(o.d);
    requestLayout();
  }
  
  public Parcelable onSaveInstanceState() {
    o o = new o(super.onSaveInstanceState());
    o.d = this.R;
    return (Parcelable)o;
  }
  
  public void onWindowFocusChanged(boolean paramBoolean) {
    super.onWindowFocusChanged(paramBoolean);
    post(this.i0);
  }
  
  public final Intent r(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4) {
    Intent intent = new Intent(paramString1);
    intent.addFlags(268435456);
    if (paramUri != null)
      intent.setData(paramUri); 
    intent.putExtra("user_query", this.d0);
    if (paramString3 != null)
      intent.putExtra("query", paramString3); 
    if (paramString2 != null)
      intent.putExtra("intent_extra_data_key", paramString2); 
    Bundle bundle = this.h0;
    if (bundle != null)
      intent.putExtra("app_data", bundle); 
    if (paramInt != 0) {
      intent.putExtra("action_key", paramInt);
      intent.putExtra("action_msg", paramString4);
    } 
    intent.setComponent(this.g0.getSearchActivity());
    return intent;
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect) {
    if (this.W)
      return false; 
    if (!isFocusable())
      return false; 
    if (!this.R) {
      boolean bool = this.q.requestFocus(paramInt, paramRect);
      if (bool)
        I(false); 
      return bool;
    } 
    return super.requestFocus(paramInt, paramRect);
  }
  
  public final Intent s(Intent paramIntent, SearchableInfo paramSearchableInfo) {
    String str1;
    ComponentName componentName = paramSearchableInfo.getSearchActivity();
    Intent intent1 = new Intent("android.intent.action.SEARCH");
    intent1.setComponent(componentName);
    PendingIntent pendingIntent = PendingIntent.getActivity(getContext(), 0, intent1, 1073741824);
    Bundle bundle2 = new Bundle();
    Bundle bundle1 = this.h0;
    if (bundle1 != null)
      bundle2.putParcelable("app_data", (Parcelable)bundle1); 
    Intent intent2 = new Intent(paramIntent);
    int i = 1;
    Resources resources = getResources();
    if (paramSearchableInfo.getVoiceLanguageModeId() != 0) {
      str1 = resources.getString(paramSearchableInfo.getVoiceLanguageModeId());
    } else {
      str1 = "free_form";
    } 
    int j = paramSearchableInfo.getVoicePromptTextId();
    String str2 = null;
    if (j != 0) {
      String str = resources.getString(paramSearchableInfo.getVoicePromptTextId());
    } else {
      bundle1 = null;
    } 
    if (paramSearchableInfo.getVoiceLanguageId() != 0) {
      String str = resources.getString(paramSearchableInfo.getVoiceLanguageId());
    } else {
      resources = null;
    } 
    if (paramSearchableInfo.getVoiceMaxResults() != 0)
      i = paramSearchableInfo.getVoiceMaxResults(); 
    intent2.putExtra("android.speech.extra.LANGUAGE_MODEL", str1);
    intent2.putExtra("android.speech.extra.PROMPT", (String)bundle1);
    intent2.putExtra("android.speech.extra.LANGUAGE", (String)resources);
    intent2.putExtra("android.speech.extra.MAX_RESULTS", i);
    if (componentName == null) {
      str1 = str2;
    } else {
      str1 = componentName.flattenToShortString();
    } 
    intent2.putExtra("calling_package", str1);
    intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", (Parcelable)pendingIntent);
    intent2.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle2);
    return intent2;
  }
  
  public void setAppSearchData(Bundle paramBundle) {
    this.h0 = paramBundle;
  }
  
  public void setIconified(boolean paramBoolean) {
    if (paramBoolean) {
      w();
    } else {
      A();
    } 
  }
  
  public void setIconifiedByDefault(boolean paramBoolean) {
    if (this.Q == paramBoolean)
      return; 
    this.Q = paramBoolean;
    I(paramBoolean);
    F();
  }
  
  public void setImeOptions(int paramInt) {
    this.q.setImeOptions(paramInt);
  }
  
  public void setInputType(int paramInt) {
    this.q.setInputType(paramInt);
  }
  
  public void setMaxWidth(int paramInt) {
    this.a0 = paramInt;
    requestLayout();
  }
  
  public void setOnCloseListener(k paramk) {
    this.M = paramk;
  }
  
  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener) {
    this.N = paramOnFocusChangeListener;
  }
  
  public void setOnQueryTextListener(l paraml) {
    this.L = paraml;
  }
  
  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener) {
    this.P = paramOnClickListener;
  }
  
  public void setOnSuggestionListener(m paramm) {
    this.O = paramm;
  }
  
  public void setQueryHint(CharSequence paramCharSequence) {
    this.U = paramCharSequence;
    F();
  }
  
  public void setQueryRefinementEnabled(boolean paramBoolean) {
    this.V = paramBoolean;
    b.j.a.a a1 = this.S;
    if (a1 instanceof r0) {
      boolean bool;
      r0 r0 = (r0)a1;
      if (paramBoolean) {
        bool = true;
      } else {
        bool = true;
      } 
      r0.s = bool;
    } 
  }
  
  public void setSearchableInfo(SearchableInfo paramSearchableInfo) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield g0 : Landroid/app/SearchableInfo;
    //   5: iconst_1
    //   6: istore #4
    //   8: aconst_null
    //   9: astore #5
    //   11: aload_1
    //   12: ifnull -> 183
    //   15: aload_0
    //   16: getfield q : Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
    //   19: aload_1
    //   20: invokevirtual getSuggestThreshold : ()I
    //   23: invokevirtual setThreshold : (I)V
    //   26: aload_0
    //   27: getfield q : Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
    //   30: aload_0
    //   31: getfield g0 : Landroid/app/SearchableInfo;
    //   34: invokevirtual getImeOptions : ()I
    //   37: invokevirtual setImeOptions : (I)V
    //   40: aload_0
    //   41: getfield g0 : Landroid/app/SearchableInfo;
    //   44: invokevirtual getInputType : ()I
    //   47: istore_3
    //   48: iload_3
    //   49: istore_2
    //   50: iload_3
    //   51: bipush #15
    //   53: iand
    //   54: iconst_1
    //   55: if_icmpne -> 86
    //   58: iload_3
    //   59: ldc_w -65537
    //   62: iand
    //   63: istore_3
    //   64: iload_3
    //   65: istore_2
    //   66: aload_0
    //   67: getfield g0 : Landroid/app/SearchableInfo;
    //   70: invokevirtual getSuggestAuthority : ()Ljava/lang/String;
    //   73: ifnull -> 86
    //   76: iload_3
    //   77: ldc_w 65536
    //   80: ior
    //   81: ldc_w 524288
    //   84: ior
    //   85: istore_2
    //   86: aload_0
    //   87: getfield q : Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
    //   90: iload_2
    //   91: invokevirtual setInputType : (I)V
    //   94: aload_0
    //   95: getfield S : Lb/j/a/a;
    //   98: astore_1
    //   99: aload_1
    //   100: ifnull -> 108
    //   103: aload_1
    //   104: aconst_null
    //   105: invokevirtual b : (Landroid/database/Cursor;)V
    //   108: aload_0
    //   109: getfield g0 : Landroid/app/SearchableInfo;
    //   112: invokevirtual getSuggestAuthority : ()Ljava/lang/String;
    //   115: ifnull -> 179
    //   118: new b/b/p/r0
    //   121: dup
    //   122: aload_0
    //   123: invokevirtual getContext : ()Landroid/content/Context;
    //   126: aload_0
    //   127: aload_0
    //   128: getfield g0 : Landroid/app/SearchableInfo;
    //   131: aload_0
    //   132: getfield k0 : Ljava/util/WeakHashMap;
    //   135: invokespecial <init> : (Landroid/content/Context;Landroidx/appcompat/widget/SearchView;Landroid/app/SearchableInfo;Ljava/util/WeakHashMap;)V
    //   138: astore_1
    //   139: aload_0
    //   140: aload_1
    //   141: putfield S : Lb/j/a/a;
    //   144: aload_0
    //   145: getfield q : Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
    //   148: aload_1
    //   149: invokevirtual setAdapter : (Landroid/widget/ListAdapter;)V
    //   152: aload_0
    //   153: getfield S : Lb/j/a/a;
    //   156: checkcast b/b/p/r0
    //   159: astore_1
    //   160: aload_0
    //   161: getfield V : Z
    //   164: ifeq -> 172
    //   167: iconst_2
    //   168: istore_2
    //   169: goto -> 174
    //   172: iconst_1
    //   173: istore_2
    //   174: aload_1
    //   175: iload_2
    //   176: putfield s : I
    //   179: aload_0
    //   180: invokevirtual F : ()V
    //   183: aload_0
    //   184: getfield g0 : Landroid/app/SearchableInfo;
    //   187: astore_1
    //   188: aload_1
    //   189: ifnull -> 259
    //   192: aload_1
    //   193: invokevirtual getVoiceSearchEnabled : ()Z
    //   196: ifeq -> 259
    //   199: aload_0
    //   200: getfield g0 : Landroid/app/SearchableInfo;
    //   203: invokevirtual getVoiceSearchLaunchWebSearch : ()Z
    //   206: ifeq -> 217
    //   209: aload_0
    //   210: getfield I : Landroid/content/Intent;
    //   213: astore_1
    //   214: goto -> 235
    //   217: aload #5
    //   219: astore_1
    //   220: aload_0
    //   221: getfield g0 : Landroid/app/SearchableInfo;
    //   224: invokevirtual getVoiceSearchLaunchRecognizer : ()Z
    //   227: ifeq -> 235
    //   230: aload_0
    //   231: getfield J : Landroid/content/Intent;
    //   234: astore_1
    //   235: aload_1
    //   236: ifnull -> 259
    //   239: aload_0
    //   240: invokevirtual getContext : ()Landroid/content/Context;
    //   243: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   246: aload_1
    //   247: ldc_w 65536
    //   250: invokevirtual resolveActivity : (Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
    //   253: ifnull -> 259
    //   256: goto -> 262
    //   259: iconst_0
    //   260: istore #4
    //   262: aload_0
    //   263: iload #4
    //   265: putfield b0 : Z
    //   268: iload #4
    //   270: ifeq -> 283
    //   273: aload_0
    //   274: getfield q : Landroidx/appcompat/widget/SearchView$SearchAutoComplete;
    //   277: ldc_w 'nm'
    //   280: invokevirtual setPrivateImeOptions : (Ljava/lang/String;)V
    //   283: aload_0
    //   284: aload_0
    //   285: getfield R : Z
    //   288: invokevirtual I : (Z)V
    //   291: return
  }
  
  public void setSubmitButtonEnabled(boolean paramBoolean) {
    this.T = paramBoolean;
    I(this.R);
  }
  
  public void setSuggestionsAdapter(b.j.a.a parama) {
    this.S = parama;
    this.q.setAdapter((ListAdapter)parama);
  }
  
  public void t() {
    if (Build.VERSION.SDK_INT >= 29) {
      this.q.refreshAutoCompleteResults();
    } else {
      n n1 = r0;
      SearchAutoComplete searchAutoComplete = this.q;
      if (n1 != null) {
        n.a();
        Method method = n1.a;
        if (method != null)
          try {
            method.invoke(searchAutoComplete, new Object[0]);
          } catch (Exception exception) {} 
        n n2 = r0;
        searchAutoComplete = this.q;
        if (n2 != null) {
          n.a();
          Method method1 = n2.b;
          if (method1 != null)
            try {
              method1.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception exception) {} 
          return;
        } 
        throw null;
      } 
      throw null;
    } 
  }
  
  public void v(int paramInt, String paramString1, String paramString2) {
    Intent intent = r("android.intent.action.SEARCH", null, null, paramString2, paramInt, null);
    getContext().startActivity(intent);
  }
  
  public void w() {
    if (TextUtils.isEmpty((CharSequence)this.q.getText())) {
      if (this.Q) {
        k k1 = this.M;
        if (k1 == null || !k1.a()) {
          clearFocus();
          I(true);
        } 
      } 
    } else {
      this.q.setText("");
      this.q.requestFocus();
      this.q.setImeVisibility(true);
    } 
  }
  
  public boolean x(int paramInt) {
    m m1 = this.O;
    if (m1 == null || !m1.b(paramInt)) {
      Cursor cursor = this.S.d;
      if (cursor != null && cursor.moveToPosition(paramInt)) {
        RuntimeException runtimeException2 = null;
        try {
          Uri uri;
          String str2 = r0.e(cursor, "suggest_intent_action");
          String str1 = str2;
          if (str2 == null)
            str1 = this.g0.getSuggestIntentAction(); 
          str2 = str1;
          if (str1 == null)
            str2 = "android.intent.action.SEARCH"; 
          String str3 = r0.i(cursor, cursor.getColumnIndex("suggest_intent_data"));
          str1 = str3;
          if (str3 == null)
            str1 = this.g0.getSuggestIntentData(); 
          str3 = str1;
          if (str1 != null) {
            String str = r0.i(cursor, cursor.getColumnIndex("suggest_intent_data_id"));
            str3 = str1;
            if (str != null) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append(str1);
              stringBuilder.append("/");
              stringBuilder.append(Uri.encode(str));
              str3 = stringBuilder.toString();
            } 
          } 
          if (str3 == null) {
            str1 = null;
          } else {
            uri = Uri.parse(str3);
          } 
          str3 = r0.i(cursor, cursor.getColumnIndex("suggest_intent_query"));
          Intent intent = r(str2, uri, r0.i(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), str3, 0, null);
        } catch (RuntimeException runtimeException1) {
          try {
            paramInt = cursor.getPosition();
          } catch (RuntimeException runtimeException) {
            paramInt = -1;
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Search suggestions cursor at row ");
          stringBuilder.append(paramInt);
          stringBuilder.append(" returned exception.");
          Log.w("SearchView", stringBuilder.toString(), runtimeException1);
          runtimeException1 = runtimeException2;
        } 
        if (runtimeException1 != null)
          try {
            getContext().startActivity((Intent)runtimeException1);
          } catch (RuntimeException runtimeException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed launch activity: ");
            stringBuilder.append(runtimeException1);
            Log.e("SearchView", stringBuilder.toString(), runtimeException);
          }  
      } 
      this.q.setImeVisibility(false);
      this.q.dismissDropDown();
      return true;
    } 
    return false;
  }
  
  public boolean y(int paramInt) {
    m m1 = this.O;
    if (m1 == null || !m1.a(paramInt)) {
      Editable editable = this.q.getText();
      Cursor cursor = this.S.d;
      if (cursor != null) {
        if (cursor.moveToPosition(paramInt)) {
          CharSequence charSequence = this.S.c(cursor);
          if (charSequence != null) {
            setQuery(charSequence);
            return true;
          } 
        } 
        setQuery((CharSequence)editable);
      } 
      return true;
    } 
    return false;
  }
  
  public void z(CharSequence paramCharSequence) {
    setQuery(paramCharSequence);
  }
  
  public static class SearchAutoComplete extends b.b.p.d {
    public int e = getThreshold();
    
    public SearchView f;
    
    public boolean g;
    
    public final Runnable h = new a(this);
    
    public SearchAutoComplete(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet, b.b.a.autoCompleteTextViewStyle);
    }
    
    private int getSearchViewTextMinWidthDp() {
      Configuration configuration = getResources().getConfiguration();
      int j = configuration.screenWidthDp;
      int i = configuration.screenHeightDp;
      return (j >= 960 && i >= 720 && configuration.orientation == 2) ? 256 : ((j >= 600 || (j >= 640 && i >= 480)) ? 192 : 160);
    }
    
    public void a() {
      if (Build.VERSION.SDK_INT >= 29) {
        setInputMethodMode(1);
        if (enoughToFilter())
          showDropDown(); 
      } else {
        SearchView.n n = SearchView.r0;
        if (n != null) {
          SearchView.n.a();
          Method method = n.c;
          if (method != null)
            try {
              method.invoke(this, new Object[] { Boolean.TRUE });
            } catch (Exception exception) {} 
          return;
        } 
        throw null;
      } 
    }
    
    public boolean enoughToFilter() {
      return (this.e <= 0 || super.enoughToFilter());
    }
    
    public InputConnection onCreateInputConnection(EditorInfo param1EditorInfo) {
      InputConnection inputConnection = super.onCreateInputConnection(param1EditorInfo);
      if (this.g) {
        removeCallbacks(this.h);
        post(this.h);
      } 
      return inputConnection;
    }
    
    public void onFinishInflate() {
      super.onFinishInflate();
      DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
      setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), displayMetrics));
    }
    
    public void onFocusChanged(boolean param1Boolean, int param1Int, Rect param1Rect) {
      super.onFocusChanged(param1Boolean, param1Int, param1Rect);
      SearchView searchView = this.f;
      searchView.I(searchView.R);
      searchView.post(searchView.i0);
      if (searchView.q.hasFocus())
        searchView.t(); 
    }
    
    public boolean onKeyPreIme(int param1Int, KeyEvent param1KeyEvent) {
      if (param1Int == 4) {
        if (param1KeyEvent.getAction() == 0 && param1KeyEvent.getRepeatCount() == 0) {
          KeyEvent.DispatcherState dispatcherState = getKeyDispatcherState();
          if (dispatcherState != null)
            dispatcherState.startTracking(param1KeyEvent, this); 
          return true;
        } 
        if (param1KeyEvent.getAction() == 1) {
          KeyEvent.DispatcherState dispatcherState = getKeyDispatcherState();
          if (dispatcherState != null)
            dispatcherState.handleUpEvent(param1KeyEvent); 
          if (param1KeyEvent.isTracking() && !param1KeyEvent.isCanceled()) {
            this.f.clearFocus();
            setImeVisibility(false);
            return true;
          } 
        } 
      } 
      return super.onKeyPreIme(param1Int, param1KeyEvent);
    }
    
    public void onWindowFocusChanged(boolean param1Boolean) {
      super.onWindowFocusChanged(param1Boolean);
      if (param1Boolean && this.f.hasFocus() && getVisibility() == 0) {
        this.g = true;
        if (SearchView.u(getContext()))
          a(); 
      } 
    }
    
    public void performCompletion() {}
    
    public void replaceText(CharSequence param1CharSequence) {}
    
    public void setImeVisibility(boolean param1Boolean) {
      InputMethodManager inputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (!param1Boolean) {
        this.g = false;
        removeCallbacks(this.h);
        inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        return;
      } 
      if (inputMethodManager.isActive((View)this)) {
        this.g = false;
        removeCallbacks(this.h);
        inputMethodManager.showSoftInput((View)this, 0);
        return;
      } 
      this.g = true;
    }
    
    public void setSearchView(SearchView param1SearchView) {
      this.f = param1SearchView;
    }
    
    public void setThreshold(int param1Int) {
      super.setThreshold(param1Int);
      this.e = param1Int;
    }
    
    public class a implements Runnable {
      public final SearchView.SearchAutoComplete b;
      
      public a(SearchView.SearchAutoComplete this$0) {}
      
      public void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.b;
        if (searchAutoComplete.g) {
          ((InputMethodManager)searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput((View)searchAutoComplete, 0);
          searchAutoComplete.g = false;
        } 
      }
    }
  }
  
  public class a implements Runnable {
    public final SearchView.SearchAutoComplete b;
    
    public a(SearchView this$0) {}
    
    public void run() {
      SearchView.SearchAutoComplete searchAutoComplete = this.b;
      if (searchAutoComplete.g) {
        ((InputMethodManager)searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput((View)searchAutoComplete, 0);
        searchAutoComplete.g = false;
      } 
    }
  }
  
  public class a implements TextWatcher {
    public final SearchView b;
    
    public a(SearchView this$0) {}
    
    public void afterTextChanged(Editable param1Editable) {}
    
    public void beforeTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {}
    
    public void onTextChanged(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3) {
      SearchView searchView = this.b;
      Editable editable = searchView.q.getText();
      searchView.d0 = (CharSequence)editable;
      int i = TextUtils.isEmpty((CharSequence)editable) ^ true;
      searchView.H(i);
      searchView.J(i ^ 0x1);
      searchView.D();
      searchView.G();
      if (searchView.L != null && !TextUtils.equals(param1CharSequence, searchView.c0))
        searchView.L.b(param1CharSequence.toString()); 
      searchView.c0 = param1CharSequence.toString();
    }
  }
  
  public class b implements Runnable {
    public final SearchView b;
    
    public b(SearchView this$0) {}
    
    public void run() {
      this.b.E();
    }
  }
  
  public class c implements Runnable {
    public final SearchView b;
    
    public c(SearchView this$0) {}
    
    public void run() {
      b.j.a.a a = this.b.S;
      if (a instanceof r0)
        a.b(null); 
    }
  }
  
  public class d implements View.OnFocusChangeListener {
    public final SearchView b;
    
    public d(SearchView this$0) {}
    
    public void onFocusChange(View param1View, boolean param1Boolean) {
      SearchView searchView = this.b;
      View.OnFocusChangeListener onFocusChangeListener = searchView.N;
      if (onFocusChangeListener != null)
        onFocusChangeListener.onFocusChange((View)searchView, param1Boolean); 
    }
  }
  
  public class e implements View.OnLayoutChangeListener {
    public final SearchView a;
    
    public e(SearchView this$0) {}
    
    public void onLayoutChange(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8) {
      SearchView searchView = this.a;
      if (searchView.y.getWidth() > 1) {
        Resources resources = searchView.getContext().getResources();
        param1Int3 = searchView.s.getPaddingLeft();
        Rect rect = new Rect();
        boolean bool = d1.b((View)searchView);
        if (searchView.Q) {
          param1Int1 = resources.getDimensionPixelSize(b.b.d.abc_dropdownitem_icon_width);
          param1Int1 = resources.getDimensionPixelSize(b.b.d.abc_dropdownitem_text_padding_left) + param1Int1;
        } else {
          param1Int1 = 0;
        } 
        searchView.q.getDropDownBackground().getPadding(rect);
        if (bool) {
          param1Int2 = -rect.left;
        } else {
          param1Int2 = param1Int3 - rect.left + param1Int1;
        } 
        searchView.q.setDropDownHorizontalOffset(param1Int2);
        param1Int5 = searchView.y.getWidth();
        param1Int2 = rect.left;
        param1Int4 = rect.right;
        searchView.q.setDropDownWidth(param1Int5 + param1Int2 + param1Int4 + param1Int1 - param1Int3);
      } 
    }
  }
  
  public class f implements View.OnClickListener {
    public final SearchView b;
    
    public f(SearchView this$0) {}
    
    public void onClick(View param1View) {
      SearchView searchView = this.b;
      if (param1View == searchView.u) {
        searchView.A();
      } else if (param1View == searchView.w) {
        searchView.w();
      } else if (param1View == searchView.v) {
        searchView.B();
      } else if (param1View == searchView.x) {
        SearchableInfo searchableInfo = searchView.g0;
        if (searchableInfo != null)
          try {
            String str;
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
              Intent intent2 = searchView.I;
              Intent intent1 = new Intent();
              this(intent2);
              ComponentName componentName = searchableInfo.getSearchActivity();
              if (componentName == null) {
                componentName = null;
              } else {
                str = componentName.flattenToShortString();
              } 
              intent1.putExtra("calling_package", str);
              searchView.getContext().startActivity(intent1);
            } else if (str.getVoiceSearchLaunchRecognizer()) {
              Intent intent = searchView.s(searchView.J, (SearchableInfo)str);
              searchView.getContext().startActivity(intent);
            } 
          } catch (ActivityNotFoundException activityNotFoundException) {
            Log.w("SearchView", "Could not find voice search activity");
          }  
      } else if (activityNotFoundException == searchView.q) {
        searchView.t();
      } 
    }
  }
  
  public class g implements View.OnKeyListener {
    public final SearchView b;
    
    public g(SearchView this$0) {}
    
    public boolean onKey(View param1View, int param1Int, KeyEvent param1KeyEvent) {
      boolean bool;
      SearchView searchView = this.b;
      if (searchView.g0 == null)
        return false; 
      if (searchView.q.isPopupShowing() && this.b.q.getListSelection() != -1)
        return this.b.C(param1Int, param1KeyEvent); 
      if (TextUtils.getTrimmedLength((CharSequence)this.b.q.getText()) == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      if (!bool && param1KeyEvent.hasNoModifiers() && param1KeyEvent.getAction() == 1 && param1Int == 66) {
        param1View.cancelLongPress();
        SearchView searchView1 = this.b;
        searchView1.v(0, null, searchView1.q.getText().toString());
        return true;
      } 
      return false;
    }
  }
  
  public class h implements TextView.OnEditorActionListener {
    public final SearchView a;
    
    public h(SearchView this$0) {}
    
    public boolean onEditorAction(TextView param1TextView, int param1Int, KeyEvent param1KeyEvent) {
      this.a.B();
      return true;
    }
  }
  
  public class i implements AdapterView.OnItemClickListener {
    public final SearchView b;
    
    public i(SearchView this$0) {}
    
    public void onItemClick(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      this.b.x(param1Int);
    }
  }
  
  public class j implements AdapterView.OnItemSelectedListener {
    public final SearchView b;
    
    public j(SearchView this$0) {}
    
    public void onItemSelected(AdapterView<?> param1AdapterView, View param1View, int param1Int, long param1Long) {
      this.b.y(param1Int);
    }
    
    public void onNothingSelected(AdapterView<?> param1AdapterView) {}
  }
  
  public static interface k {
    boolean a();
  }
  
  public static interface l {
    boolean a(String param1String);
    
    boolean b(String param1String);
  }
  
  public static interface m {
    boolean a(int param1Int);
    
    boolean b(int param1Int);
  }
  
  public static class n {
    public Method a = null;
    
    public Method b = null;
    
    public Method c = null;
    
    @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
    public n() {
      a();
      try {
        Method method = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
        this.a = method;
        method.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
      try {
        Method method = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
        this.b = method;
        method.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
      try {
        Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { boolean.class });
        this.c = method;
        method.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {}
    }
    
    public static void a() {
      if (Build.VERSION.SDK_INT < 29)
        return; 
      throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
  }
  
  public static class o extends b.k.a.a {
    public static final Parcelable.Creator<o> CREATOR = (Parcelable.Creator<o>)new a();
    
    public boolean d;
    
    public o(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      this.d = ((Boolean)param1Parcel.readValue(null)).booleanValue();
    }
    
    public o(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public String toString() {
      StringBuilder stringBuilder = c.a.a.a.a.e("SearchView.SavedState{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" isIconified=");
      stringBuilder.append(this.d);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeParcelable(this.b, param1Int);
      param1Parcel.writeValue(Boolean.valueOf(this.d));
    }
    
    public class a implements Parcelable.ClassLoaderCreator<o> {
      public Object createFromParcel(Parcel param2Parcel) {
        return new SearchView.o(param2Parcel, null);
      }
      
      public Object createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new SearchView.o(param2Parcel, param2ClassLoader);
      }
      
      public Object[] newArray(int param2Int) {
        return (Object[])new SearchView.o[param2Int];
      }
    }
  }
  
  public class a implements Parcelable.ClassLoaderCreator<o> {
    public Object createFromParcel(Parcel param1Parcel) {
      return new SearchView.o(param1Parcel, null);
    }
    
    public Object createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new SearchView.o(param1Parcel, param1ClassLoader);
    }
    
    public Object[] newArray(int param1Int) {
      return (Object[])new SearchView.o[param1Int];
    }
  }
  
  public static class p extends TouchDelegate {
    public final View a;
    
    public final Rect b;
    
    public final Rect c;
    
    public final Rect d;
    
    public final int e;
    
    public boolean f;
    
    public p(Rect param1Rect1, Rect param1Rect2, View param1View) {
      super(param1Rect1, param1View);
      this.e = ViewConfiguration.get(param1View.getContext()).getScaledTouchSlop();
      this.b = new Rect();
      this.d = new Rect();
      this.c = new Rect();
      a(param1Rect1, param1Rect2);
      this.a = param1View;
    }
    
    public void a(Rect param1Rect1, Rect param1Rect2) {
      this.b.set(param1Rect1);
      this.d.set(param1Rect1);
      param1Rect1 = this.d;
      int i = this.e;
      param1Rect1.inset(-i, -i);
      this.c.set(param1Rect2);
    }
    
    public boolean onTouchEvent(MotionEvent param1MotionEvent) {
      // Byte code:
      //   0: aload_1
      //   1: invokevirtual getX : ()F
      //   4: f2i
      //   5: istore #5
      //   7: aload_1
      //   8: invokevirtual getY : ()F
      //   11: f2i
      //   12: istore #4
      //   14: aload_1
      //   15: invokevirtual getAction : ()I
      //   18: istore_3
      //   19: iconst_1
      //   20: istore #6
      //   22: iconst_0
      //   23: istore #8
      //   25: iload_3
      //   26: ifeq -> 108
      //   29: iload_3
      //   30: iconst_1
      //   31: if_icmpeq -> 61
      //   34: iload_3
      //   35: iconst_2
      //   36: if_icmpeq -> 61
      //   39: iload_3
      //   40: iconst_3
      //   41: if_icmpeq -> 47
      //   44: goto -> 130
      //   47: aload_0
      //   48: getfield f : Z
      //   51: istore #6
      //   53: aload_0
      //   54: iconst_0
      //   55: putfield f : Z
      //   58: goto -> 103
      //   61: aload_0
      //   62: getfield f : Z
      //   65: istore #7
      //   67: iload #7
      //   69: istore #6
      //   71: iload #7
      //   73: ifeq -> 103
      //   76: iload #7
      //   78: istore #6
      //   80: aload_0
      //   81: getfield d : Landroid/graphics/Rect;
      //   84: iload #5
      //   86: iload #4
      //   88: invokevirtual contains : (II)Z
      //   91: ifne -> 103
      //   94: iload #7
      //   96: istore #6
      //   98: iconst_0
      //   99: istore_3
      //   100: goto -> 135
      //   103: iconst_1
      //   104: istore_3
      //   105: goto -> 135
      //   108: aload_0
      //   109: getfield b : Landroid/graphics/Rect;
      //   112: iload #5
      //   114: iload #4
      //   116: invokevirtual contains : (II)Z
      //   119: ifeq -> 130
      //   122: aload_0
      //   123: iconst_1
      //   124: putfield f : Z
      //   127: goto -> 103
      //   130: iconst_1
      //   131: istore_3
      //   132: iconst_0
      //   133: istore #6
      //   135: iload #8
      //   137: istore #7
      //   139: iload #6
      //   141: ifeq -> 228
      //   144: iload_3
      //   145: ifeq -> 186
      //   148: aload_0
      //   149: getfield c : Landroid/graphics/Rect;
      //   152: iload #5
      //   154: iload #4
      //   156: invokevirtual contains : (II)Z
      //   159: ifne -> 186
      //   162: aload_0
      //   163: getfield a : Landroid/view/View;
      //   166: invokevirtual getWidth : ()I
      //   169: iconst_2
      //   170: idiv
      //   171: i2f
      //   172: fstore_2
      //   173: aload_0
      //   174: getfield a : Landroid/view/View;
      //   177: invokevirtual getHeight : ()I
      //   180: iconst_2
      //   181: idiv
      //   182: istore_3
      //   183: goto -> 211
      //   186: aload_0
      //   187: getfield c : Landroid/graphics/Rect;
      //   190: astore #9
      //   192: iload #5
      //   194: aload #9
      //   196: getfield left : I
      //   199: isub
      //   200: i2f
      //   201: fstore_2
      //   202: iload #4
      //   204: aload #9
      //   206: getfield top : I
      //   209: isub
      //   210: istore_3
      //   211: aload_1
      //   212: fload_2
      //   213: iload_3
      //   214: i2f
      //   215: invokevirtual setLocation : (FF)V
      //   218: aload_0
      //   219: getfield a : Landroid/view/View;
      //   222: aload_1
      //   223: invokevirtual dispatchTouchEvent : (Landroid/view/MotionEvent;)Z
      //   226: istore #7
      //   228: iload #7
      //   230: ireturn
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\appcompat\widget\SearchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */