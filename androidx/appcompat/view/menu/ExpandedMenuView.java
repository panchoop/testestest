package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import b.b.o.i.g;
import b.b.o.i.i;
import b.b.o.i.n;

public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {
  public static final int[] c = new int[] { 16842964, 16843049 };
  
  public g b;
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: invokespecial <init> : (Landroid/content/Context;Landroid/util/AttributeSet;)V
    //   6: aload_0
    //   7: aload_0
    //   8: invokevirtual setOnItemClickListener : (Landroid/widget/AdapterView$OnItemClickListener;)V
    //   11: aload_1
    //   12: aload_2
    //   13: getstatic androidx/appcompat/view/menu/ExpandedMenuView.c : [I
    //   16: ldc 16842868
    //   18: iconst_0
    //   19: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   22: astore #4
    //   24: aload #4
    //   26: iconst_0
    //   27: invokevirtual hasValue : (I)Z
    //   30: ifeq -> 75
    //   33: aload #4
    //   35: iconst_0
    //   36: invokevirtual hasValue : (I)Z
    //   39: ifeq -> 63
    //   42: aload #4
    //   44: iconst_0
    //   45: iconst_0
    //   46: invokevirtual getResourceId : (II)I
    //   49: istore_3
    //   50: iload_3
    //   51: ifeq -> 63
    //   54: aload_1
    //   55: iload_3
    //   56: invokestatic b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   59: astore_2
    //   60: goto -> 70
    //   63: aload #4
    //   65: iconst_0
    //   66: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   69: astore_2
    //   70: aload_0
    //   71: aload_2
    //   72: invokevirtual setBackgroundDrawable : (Landroid/graphics/drawable/Drawable;)V
    //   75: aload #4
    //   77: iconst_1
    //   78: invokevirtual hasValue : (I)Z
    //   81: ifeq -> 126
    //   84: aload #4
    //   86: iconst_1
    //   87: invokevirtual hasValue : (I)Z
    //   90: ifeq -> 114
    //   93: aload #4
    //   95: iconst_1
    //   96: iconst_0
    //   97: invokevirtual getResourceId : (II)I
    //   100: istore_3
    //   101: iload_3
    //   102: ifeq -> 114
    //   105: aload_1
    //   106: iload_3
    //   107: invokestatic b : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   110: astore_1
    //   111: goto -> 121
    //   114: aload #4
    //   116: iconst_1
    //   117: invokevirtual getDrawable : (I)Landroid/graphics/drawable/Drawable;
    //   120: astore_1
    //   121: aload_0
    //   122: aload_1
    //   123: invokevirtual setDivider : (Landroid/graphics/drawable/Drawable;)V
    //   126: aload #4
    //   128: invokevirtual recycle : ()V
    //   131: return
  }
  
  public boolean b(i parami) {
    return this.b.s((MenuItem)parami, null, 0);
  }
  
  public void d(g paramg) {
    this.b = paramg;
  }
  
  public int getWindowAnimations() {
    return 0;
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    b((i)getAdapter().getItem(paramInt));
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\appcompat\view\menu\ExpandedMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */