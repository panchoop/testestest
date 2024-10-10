package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import b.b.a;
import b.b.f;
import b.b.g;
import b.b.h;
import b.b.j;
import b.b.o.i.i;
import b.b.o.i.n;
import b.b.p.x0;
import b.i.m.l;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {
  public i b;
  
  public ImageView c;
  
  public RadioButton d;
  
  public TextView e;
  
  public CheckBox f;
  
  public TextView g;
  
  public ImageView h;
  
  public ImageView i;
  
  public LinearLayout j;
  
  public Drawable k;
  
  public int l;
  
  public Context m;
  
  public boolean n;
  
  public Drawable o;
  
  public boolean p;
  
  public LayoutInflater q;
  
  public boolean r;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    x0 x0 = x0.q(getContext(), paramAttributeSet, j.MenuView, j, 0);
    this.k = x0.g(j.MenuView_android_itemBackground);
    this.l = x0.l(j.MenuView_android_itemTextAppearance, -1);
    this.n = x0.a(j.MenuView_preserveIconSpacing, false);
    this.m = paramContext;
    this.o = x0.g(j.MenuView_subMenuArrow);
    Resources.Theme theme = paramContext.getTheme();
    j = a.dropDownListViewStyle;
    TypedArray typedArray = theme.obtainStyledAttributes(null, new int[] { 16843049 }, j, 0);
    this.p = typedArray.hasValue(0);
    x0.b.recycle();
    typedArray.recycle();
  }
  
  private LayoutInflater getInflater() {
    if (this.q == null)
      this.q = LayoutInflater.from(getContext()); 
    return this.q;
  }
  
  private void setSubMenuArrowVisible(boolean paramBoolean) {
    ImageView imageView = this.h;
    if (imageView != null) {
      byte b;
      if (paramBoolean) {
        b = 0;
      } else {
        b = 8;
      } 
      imageView.setVisibility(b);
    } 
  }
  
  public final void a() {
    CheckBox checkBox = (CheckBox)getInflater().inflate(g.abc_list_menu_item_checkbox, (ViewGroup)this, false);
    this.f = checkBox;
    LinearLayout linearLayout = this.j;
    if (linearLayout != null) {
      linearLayout.addView((View)checkBox, -1);
    } else {
      addView((View)checkBox, -1);
    } 
  }
  
  public void adjustListItemSelectionBounds(Rect paramRect) {
    ImageView imageView = this.i;
    if (imageView != null && imageView.getVisibility() == 0) {
      LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.i.getLayoutParams();
      int j = paramRect.top;
      paramRect.top = this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + j;
    } 
  }
  
  public final void b() {
    RadioButton radioButton = (RadioButton)getInflater().inflate(g.abc_list_menu_item_radio, (ViewGroup)this, false);
    this.d = radioButton;
    LinearLayout linearLayout = this.j;
    if (linearLayout != null) {
      linearLayout.addView((View)radioButton, -1);
    } else {
      addView((View)radioButton, -1);
    } 
  }
  
  public boolean c() {
    return false;
  }
  
  public void d(boolean paramBoolean) {
    byte b;
    if (paramBoolean && this.b.m()) {
      b = 0;
    } else {
      b = 8;
    } 
    if (b == 0) {
      String str;
      TextView textView = this.g;
      i i1 = this.b;
      char c = i1.e();
      if (c == '\000') {
        str = "";
      } else {
        int j;
        Resources resources = ((i)str).n.a.getResources();
        StringBuilder stringBuilder = new StringBuilder();
        if (ViewConfiguration.get(((i)str).n.a).hasPermanentMenuKey())
          stringBuilder.append(resources.getString(h.abc_prepend_shortcut_label)); 
        if (((i)str).n.n()) {
          j = ((i)str).k;
        } else {
          j = ((i)str).i;
        } 
        i.c(stringBuilder, j, 65536, resources.getString(h.abc_menu_meta_shortcut_label));
        i.c(stringBuilder, j, 4096, resources.getString(h.abc_menu_ctrl_shortcut_label));
        i.c(stringBuilder, j, 2, resources.getString(h.abc_menu_alt_shortcut_label));
        i.c(stringBuilder, j, 1, resources.getString(h.abc_menu_shift_shortcut_label));
        i.c(stringBuilder, j, 4, resources.getString(h.abc_menu_sym_shortcut_label));
        i.c(stringBuilder, j, 8, resources.getString(h.abc_menu_function_shortcut_label));
        if (c != '\b') {
          if (c != '\n') {
            if (c != ' ') {
              stringBuilder.append(c);
            } else {
              j = h.abc_menu_space_shortcut_label;
              stringBuilder.append(resources.getString(j));
            } 
          } else {
            j = h.abc_menu_enter_shortcut_label;
            stringBuilder.append(resources.getString(j));
          } 
        } else {
          j = h.abc_menu_delete_shortcut_label;
          stringBuilder.append(resources.getString(j));
        } 
        str = stringBuilder.toString();
      } 
      textView.setText(str);
    } 
    if (this.g.getVisibility() != b)
      this.g.setVisibility(b); 
  }
  
  public void e(i parami, int paramInt) {
    CharSequence charSequence;
    this.b = parami;
    if (parami.isVisible()) {
      paramInt = 0;
    } else {
      paramInt = 8;
    } 
    setVisibility(paramInt);
    if (super.c()) {
      charSequence = parami.getTitleCondensed();
    } else {
      charSequence = parami.e;
    } 
    setTitle(charSequence);
    setCheckable(parami.isCheckable());
    boolean bool = parami.m();
    parami.e();
    d(bool);
    setIcon(parami.getIcon());
    setEnabled(parami.isEnabled());
    setSubMenuArrowVisible(parami.hasSubMenu());
    setContentDescription(parami.q);
  }
  
  public i getItemData() {
    return this.b;
  }
  
  public void onFinishInflate() {
    super.onFinishInflate();
    l.Z((View)this, this.k);
    TextView textView = (TextView)findViewById(f.title);
    this.e = textView;
    int j = this.l;
    if (j != -1)
      textView.setTextAppearance(this.m, j); 
    this.g = (TextView)findViewById(f.shortcut);
    ImageView imageView = (ImageView)findViewById(f.submenuarrow);
    this.h = imageView;
    if (imageView != null)
      imageView.setImageDrawable(this.o); 
    this.i = (ImageView)findViewById(f.group_divider);
    this.j = (LinearLayout)findViewById(f.content);
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    if (this.c != null && this.n) {
      ViewGroup.LayoutParams layoutParams = getLayoutParams();
      LinearLayout.LayoutParams layoutParams1 = (LinearLayout.LayoutParams)this.c.getLayoutParams();
      int j = layoutParams.height;
      if (j > 0 && layoutParams1.width <= 0)
        layoutParams1.width = j; 
    } 
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCheckable(boolean paramBoolean) {
    RadioButton radioButton;
    CheckBox checkBox;
    if (!paramBoolean && this.d == null && this.f == null)
      return; 
    if (this.b.h()) {
      if (this.d == null)
        b(); 
      RadioButton radioButton1 = this.d;
      CheckBox checkBox1 = this.f;
    } else {
      if (this.f == null)
        a(); 
      checkBox = this.f;
      radioButton = this.d;
    } 
    if (paramBoolean) {
      checkBox.setChecked(this.b.isChecked());
      if (checkBox.getVisibility() != 0)
        checkBox.setVisibility(0); 
      if (radioButton != null && radioButton.getVisibility() != 8)
        radioButton.setVisibility(8); 
    } else {
      CheckBox checkBox1 = this.f;
      if (checkBox1 != null)
        checkBox1.setVisibility(8); 
      RadioButton radioButton1 = this.d;
      if (radioButton1 != null)
        radioButton1.setVisibility(8); 
    } 
  }
  
  public void setChecked(boolean paramBoolean) {
    CheckBox checkBox;
    if (this.b.h()) {
      if (this.d == null)
        b(); 
      RadioButton radioButton = this.d;
    } else {
      if (this.f == null)
        a(); 
      checkBox = this.f;
    } 
    checkBox.setChecked(paramBoolean);
  }
  
  public void setForceShowIcon(boolean paramBoolean) {
    this.r = paramBoolean;
    this.n = paramBoolean;
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean) {
    ImageView imageView = this.i;
    if (imageView != null) {
      byte b;
      if (!this.p && paramBoolean) {
        b = 0;
      } else {
        b = 8;
      } 
      imageView.setVisibility(b);
    } 
  }
  
  public void setIcon(Drawable paramDrawable) {
    boolean bool;
    if (this.b.n.s || this.r) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool && !this.n)
      return; 
    if (this.c == null && paramDrawable == null && !this.n)
      return; 
    if (this.c == null) {
      ImageView imageView = (ImageView)getInflater().inflate(g.abc_list_menu_item_icon, (ViewGroup)this, false);
      this.c = imageView;
      LinearLayout linearLayout = this.j;
      if (linearLayout != null) {
        linearLayout.addView((View)imageView, 0);
      } else {
        addView((View)imageView, 0);
      } 
    } 
    if (paramDrawable != null || this.n) {
      ImageView imageView = this.c;
      if (!bool)
        paramDrawable = null; 
      imageView.setImageDrawable(paramDrawable);
      if (this.c.getVisibility() != 0)
        this.c.setVisibility(0); 
      return;
    } 
    this.c.setVisibility(8);
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    TextView textView;
    byte b;
    if (paramCharSequence != null) {
      this.e.setText(paramCharSequence);
      if (this.e.getVisibility() != 0) {
        textView = this.e;
        b = 0;
      } else {
        return;
      } 
    } else {
      int j = this.e.getVisibility();
      b = 8;
      if (j != 8) {
        textView = this.e;
      } else {
        return;
      } 
    } 
    textView.setVisibility(b);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\appcompat\view\menu\ListMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */