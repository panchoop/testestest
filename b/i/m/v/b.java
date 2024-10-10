package b.i.m.v;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b {
  public static int d;
  
  public final AccessibilityNodeInfo a;
  
  public int b = -1;
  
  public int c = -1;
  
  public b(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    this.a = paramAccessibilityNodeInfo;
  }
  
  public static String c(int paramInt) {
    if (paramInt != 1) {
      if (paramInt != 2) {
        switch (paramInt) {
          default:
            switch (paramInt) {
              default:
                switch (paramInt) {
                  default:
                    return "ACTION_UNKNOWN";
                  case 16908361:
                    return "ACTION_PAGE_RIGHT";
                  case 16908360:
                    return "ACTION_PAGE_LEFT";
                  case 16908359:
                    return "ACTION_PAGE_DOWN";
                  case 16908358:
                    return "ACTION_PAGE_UP";
                  case 16908357:
                    return "ACTION_HIDE_TOOLTIP";
                  case 16908356:
                    break;
                } 
                return "ACTION_SHOW_TOOLTIP";
              case 16908349:
                return "ACTION_SET_PROGRESS";
              case 16908348:
                return "ACTION_CONTEXT_CLICK";
              case 16908347:
                return "ACTION_SCROLL_RIGHT";
              case 16908346:
                return "ACTION_SCROLL_DOWN";
              case 16908345:
                return "ACTION_SCROLL_LEFT";
              case 16908344:
                return "ACTION_SCROLL_UP";
              case 16908343:
                return "ACTION_SCROLL_TO_POSITION";
              case 16908342:
                break;
            } 
            return "ACTION_SHOW_ON_SCREEN";
          case 16908354:
            return "ACTION_MOVE_WINDOW";
          case 2097152:
            return "ACTION_SET_TEXT";
          case 524288:
            return "ACTION_COLLAPSE";
          case 262144:
            return "ACTION_EXPAND";
          case 131072:
            return "ACTION_SET_SELECTION";
          case 65536:
            return "ACTION_CUT";
          case 32768:
            return "ACTION_PASTE";
          case 16384:
            return "ACTION_COPY";
          case 8192:
            return "ACTION_SCROLL_BACKWARD";
          case 4096:
            return "ACTION_SCROLL_FORWARD";
          case 2048:
            return "ACTION_PREVIOUS_HTML_ELEMENT";
          case 1024:
            return "ACTION_NEXT_HTML_ELEMENT";
          case 512:
            return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
          case 256:
            return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
          case 128:
            return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
          case 64:
            return "ACTION_ACCESSIBILITY_FOCUS";
          case 32:
            return "ACTION_LONG_CLICK";
          case 16:
            return "ACTION_CLICK";
          case 8:
            return "ACTION_CLEAR_SELECTION";
          case 4:
            break;
        } 
        return "ACTION_SELECT";
      } 
      return "ACTION_CLEAR_FOCUS";
    } 
    return "ACTION_FOCUS";
  }
  
  public static ClickableSpan[] d(CharSequence paramCharSequence) {
    return (paramCharSequence instanceof Spanned) ? (ClickableSpan[])((Spanned)paramCharSequence).getSpans(0, paramCharSequence.length(), ClickableSpan.class) : null;
  }
  
  public void a(a parama) {
    this.a.addAction((AccessibilityNodeInfo.AccessibilityAction)parama.a);
  }
  
  public final List<Integer> b(String paramString) {
    ArrayList<Integer> arrayList2 = this.a.getExtras().getIntegerArrayList(paramString);
    ArrayList<Integer> arrayList1 = arrayList2;
    if (arrayList2 == null) {
      arrayList1 = new ArrayList();
      this.a.getExtras().putIntegerArrayList(paramString, arrayList1);
    } 
    return arrayList1;
  }
  
  public CharSequence e() {
    return this.a.getContentDescription();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (!(paramObject instanceof b))
      return false; 
    paramObject = paramObject;
    AccessibilityNodeInfo accessibilityNodeInfo = this.a;
    if (accessibilityNodeInfo == null) {
      if (((b)paramObject).a != null)
        return false; 
    } else if (!accessibilityNodeInfo.equals(((b)paramObject).a)) {
      return false;
    } 
    return (this.c != ((b)paramObject).c) ? false : (!(this.b != ((b)paramObject).b));
  }
  
  public Bundle f() {
    return this.a.getExtras();
  }
  
  public CharSequence g() {
    if ((b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty() ^ true) != 0) {
      List<Integer> list1 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
      List<Integer> list4 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
      List<Integer> list3 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
      List<Integer> list2 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
      CharSequence charSequence = this.a.getText();
      int i = this.a.getText().length();
      byte b1 = 0;
      SpannableString spannableString = new SpannableString(TextUtils.substring(charSequence, 0, i));
      while (b1 < list1.size()) {
        spannableString.setSpan(new a(((Integer)list2.get(b1)).intValue(), this, f().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer)list1.get(b1)).intValue(), ((Integer)list4.get(b1)).intValue(), ((Integer)list3.get(b1)).intValue());
        b1++;
      } 
      return (CharSequence)spannableString;
    } 
    return this.a.getText();
  }
  
  public final void h(int paramInt, boolean paramBoolean) {
    Bundle bundle = f();
    if (bundle != null) {
      boolean bool;
      int i = bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
      if (paramBoolean) {
        bool = paramInt;
      } else {
        bool = false;
      } 
      bundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", bool | i & (paramInt ^ 0xFFFFFFFF));
    } 
  }
  
  public int hashCode() {
    int i;
    AccessibilityNodeInfo accessibilityNodeInfo = this.a;
    if (accessibilityNodeInfo == null) {
      i = 0;
    } else {
      i = accessibilityNodeInfo.hashCode();
    } 
    return i;
  }
  
  public void i(Object paramObject) {
    AccessibilityNodeInfo accessibilityNodeInfo = this.a;
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = ((b)paramObject).a;
    } 
    accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)paramObject);
  }
  
  public void j(Object paramObject) {
    this.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)((c)paramObject).a);
  }
  
  public void k(CharSequence paramCharSequence) {
    if (Build.VERSION.SDK_INT >= 26) {
      this.a.setHintText(paramCharSequence);
    } else {
      this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", paramCharSequence);
    } 
  }
  
  public String toString() {
    byte b1;
    List<?> list;
    StringBuilder stringBuilder3 = new StringBuilder();
    stringBuilder3.append(super.toString());
    Rect rect = new Rect();
    this.a.getBoundsInParent(rect);
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("; boundsInParent: ");
    stringBuilder2.append(rect);
    stringBuilder3.append(stringBuilder2.toString());
    this.a.getBoundsInScreen(rect);
    stringBuilder2 = new StringBuilder();
    stringBuilder2.append("; boundsInScreen: ");
    stringBuilder2.append(rect);
    stringBuilder3.append(stringBuilder2.toString());
    stringBuilder3.append("; packageName: ");
    stringBuilder3.append(this.a.getPackageName());
    stringBuilder3.append("; className: ");
    stringBuilder3.append(this.a.getClassName());
    stringBuilder3.append("; text: ");
    stringBuilder3.append(g());
    stringBuilder3.append("; contentDescription: ");
    stringBuilder3.append(e());
    stringBuilder3.append("; viewId: ");
    stringBuilder3.append(this.a.getViewIdResourceName());
    stringBuilder3.append("; checkable: ");
    stringBuilder3.append(this.a.isCheckable());
    stringBuilder3.append("; checked: ");
    stringBuilder3.append(this.a.isChecked());
    stringBuilder3.append("; focusable: ");
    stringBuilder3.append(this.a.isFocusable());
    stringBuilder3.append("; focused: ");
    stringBuilder3.append(this.a.isFocused());
    stringBuilder3.append("; selected: ");
    stringBuilder3.append(this.a.isSelected());
    stringBuilder3.append("; clickable: ");
    stringBuilder3.append(this.a.isClickable());
    stringBuilder3.append("; longClickable: ");
    stringBuilder3.append(this.a.isLongClickable());
    stringBuilder3.append("; enabled: ");
    stringBuilder3.append(this.a.isEnabled());
    stringBuilder3.append("; password: ");
    stringBuilder3.append(this.a.isPassword());
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("; scrollable: ");
    stringBuilder1.append(this.a.isScrollable());
    stringBuilder3.append(stringBuilder1.toString());
    stringBuilder3.append("; [");
    List list1 = this.a.getActionList();
    byte b2 = 0;
    if (list1 != null) {
      ArrayList<a> arrayList = new ArrayList();
      int i = list1.size();
      byte b3 = 0;
      while (true) {
        b1 = b2;
        list = arrayList;
        if (b3 < i) {
          arrayList.add(new a(list1.get(b3), 0, null, null, null));
          b3++;
          continue;
        } 
        break;
      } 
    } else {
      list = Collections.emptyList();
      b1 = b2;
    } 
    while (b1 < list.size()) {
      a a = (a)list.get(b1);
      String str2 = c(a.a());
      String str1 = str2;
      if (str2.equals("ACTION_UNKNOWN")) {
        str1 = str2;
        if (((AccessibilityNodeInfo.AccessibilityAction)a.a).getLabel() != null)
          str1 = ((AccessibilityNodeInfo.AccessibilityAction)a.a).getLabel().toString(); 
      } 
      stringBuilder3.append(str1);
      if (b1 != list.size() - 1)
        stringBuilder3.append(", "); 
      b1++;
    } 
    stringBuilder3.append("]");
    return stringBuilder3.toString();
  }
  
  public static class a {
    public static final a e = new a(16, null);
    
    public static final a f = new a(4096, null);
    
    public static final a g = new a(8192, null);
    
    public static final a h = new a(262144, null);
    
    public static final a i = new a(524288, null);
    
    public static final a j = new a(1048576, null);
    
    public static final a k;
    
    public static final a l;
    
    public final Object a;
    
    public final int b;
    
    public final Class<? extends d.a> c;
    
    public final d d;
    
    static {
      new AccessibilityNodeInfo.AccessibilityAction(2097152, null);
      if (Build.VERSION.SDK_INT >= 23) {
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
      } else {
        accessibilityAction = null;
      } 
      if (accessibilityAction == null)
        new AccessibilityNodeInfo.AccessibilityAction(16908342, null); 
      if (Build.VERSION.SDK_INT >= 23) {
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
      } else {
        accessibilityAction = null;
      } 
      if (accessibilityAction == null)
        new AccessibilityNodeInfo.AccessibilityAction(16908343, null); 
      if (Build.VERSION.SDK_INT >= 23) {
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
      } else {
        accessibilityAction = null;
      } 
      k = new a(accessibilityAction, 16908344, null, null, null);
      if (Build.VERSION.SDK_INT >= 23) {
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
      } else {
        accessibilityAction = null;
      } 
      if (accessibilityAction == null)
        new AccessibilityNodeInfo.AccessibilityAction(16908345, null); 
      if (Build.VERSION.SDK_INT >= 23) {
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
      } else {
        accessibilityAction = null;
      } 
      l = new a(accessibilityAction, 16908346, null, null, null);
      if (Build.VERSION.SDK_INT >= 23) {
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
      } else {
        accessibilityAction = null;
      } 
      if (accessibilityAction == null)
        new AccessibilityNodeInfo.AccessibilityAction(16908347, null); 
      if (Build.VERSION.SDK_INT >= 29) {
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
      } else {
        accessibilityAction = null;
      } 
      if (accessibilityAction == null)
        new AccessibilityNodeInfo.AccessibilityAction(16908358, null); 
      if (Build.VERSION.SDK_INT >= 29) {
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
      } else {
        accessibilityAction = null;
      } 
      if (accessibilityAction == null)
        new AccessibilityNodeInfo.AccessibilityAction(16908359, null); 
      if (Build.VERSION.SDK_INT >= 29) {
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
      } else {
        accessibilityAction = null;
      } 
      if (accessibilityAction == null)
        new AccessibilityNodeInfo.AccessibilityAction(16908360, null); 
      if (Build.VERSION.SDK_INT >= 29) {
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
      } else {
        accessibilityAction = null;
      } 
      if (accessibilityAction == null)
        new AccessibilityNodeInfo.AccessibilityAction(16908361, null); 
      if (Build.VERSION.SDK_INT >= 23) {
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
      } else {
        accessibilityAction = null;
      } 
      if (accessibilityAction == null)
        new AccessibilityNodeInfo.AccessibilityAction(16908348, null); 
      if (Build.VERSION.SDK_INT >= 24) {
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
      } else {
        accessibilityAction = null;
      } 
      if (accessibilityAction == null)
        new AccessibilityNodeInfo.AccessibilityAction(16908349, null); 
      if (Build.VERSION.SDK_INT >= 26) {
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
      } else {
        accessibilityAction = null;
      } 
      if (accessibilityAction == null)
        new AccessibilityNodeInfo.AccessibilityAction(16908354, null); 
      if (Build.VERSION.SDK_INT >= 28) {
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
      } else {
        accessibilityAction = null;
      } 
      if (accessibilityAction == null)
        new AccessibilityNodeInfo.AccessibilityAction(16908356, null); 
      if (Build.VERSION.SDK_INT >= 28) {
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
      } else {
        accessibilityAction = null;
      } 
      if (accessibilityAction == null)
        new AccessibilityNodeInfo.AccessibilityAction(16908357, null); 
    }
    
    public a(int param1Int, CharSequence param1CharSequence) {
      this(null, param1Int, null, null, null);
    }
    
    public a(Object param1Object, int param1Int, CharSequence param1CharSequence, d param1d, Class<? extends d.a> param1Class) {
      this.b = param1Int;
      this.d = param1d;
      Object object = param1Object;
      if (param1Object == null)
        object = new AccessibilityNodeInfo.AccessibilityAction(param1Int, param1CharSequence); 
      this.a = object;
      this.c = param1Class;
    }
    
    public int a() {
      return ((AccessibilityNodeInfo.AccessibilityAction)this.a).getId();
    }
    
    public boolean equals(Object param1Object) {
      if (param1Object == null)
        return false; 
      if (!(param1Object instanceof a))
        return false; 
      a a1 = (a)param1Object;
      param1Object = this.a;
      Object object = a1.a;
      if (param1Object == null) {
        if (object != null)
          return false; 
      } else if (!param1Object.equals(object)) {
        return false;
      } 
      return true;
    }
    
    public int hashCode() {
      boolean bool;
      Object object = this.a;
      if (object != null) {
        bool = object.hashCode();
      } else {
        bool = false;
      } 
      return bool;
    }
    
    static {
      AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
      new AccessibilityNodeInfo.AccessibilityAction(1, null);
      new AccessibilityNodeInfo.AccessibilityAction(2, null);
      new AccessibilityNodeInfo.AccessibilityAction(4, null);
      new AccessibilityNodeInfo.AccessibilityAction(8, null);
    }
    
    static {
      new AccessibilityNodeInfo.AccessibilityAction(32, null);
      new AccessibilityNodeInfo.AccessibilityAction(64, null);
      new AccessibilityNodeInfo.AccessibilityAction(128, null);
      new AccessibilityNodeInfo.AccessibilityAction(256, null);
      new AccessibilityNodeInfo.AccessibilityAction(512, null);
      new AccessibilityNodeInfo.AccessibilityAction(1024, null);
      new AccessibilityNodeInfo.AccessibilityAction(2048, null);
    }
    
    static {
      new AccessibilityNodeInfo.AccessibilityAction(16384, null);
      new AccessibilityNodeInfo.AccessibilityAction(32768, null);
      new AccessibilityNodeInfo.AccessibilityAction(65536, null);
      new AccessibilityNodeInfo.AccessibilityAction(131072, null);
    }
  }
  
  public static class b {
    public final Object a;
    
    public b(Object param1Object) {
      this.a = param1Object;
    }
  }
  
  public static class c {
    public final Object a;
    
    public c(Object param1Object) {
      this.a = param1Object;
    }
    
    public static c a(int param1Int1, int param1Int2, int param1Int3, int param1Int4, boolean param1Boolean1, boolean param1Boolean2) {
      return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(param1Int1, param1Int2, param1Int3, param1Int4, param1Boolean1, param1Boolean2));
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\m\v\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */