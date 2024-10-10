package b.i.m;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import b.i.b;
import b.i.m.v.b;
import b.i.m.v.c;
import b.i.m.v.d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a {
  public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
  
  public final View.AccessibilityDelegate a;
  
  public final View.AccessibilityDelegate b;
  
  public a() {
    this.a = accessibilityDelegate;
    this.b = new a(this);
  }
  
  public a(View.AccessibilityDelegate paramAccessibilityDelegate) {
    this.a = paramAccessibilityDelegate;
    this.b = new a(this);
  }
  
  public boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    return this.a.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public c b(View paramView) {
    AccessibilityNodeProvider accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(paramView);
    return (accessibilityNodeProvider != null) ? new c(accessibilityNodeProvider) : null;
  }
  
  public void c(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.a.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void d(View paramView, b paramb) {
    this.a.onInitializeAccessibilityNodeInfo(paramView, paramb.a);
  }
  
  public void e(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.a.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public boolean f(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent) {
    return this.a.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public boolean g(View paramView, int paramInt, Bundle paramBundle) {
    List<?> list2 = (List)paramView.getTag(b.tag_accessibility_actions);
    List<?> list1 = list2;
    if (list2 == null)
      list1 = Collections.emptyList(); 
    boolean bool = false;
    byte b = 0;
    while (true) {
      if (b < list1.size()) {
        b.a a1 = (b.a)list1.get(b);
        if (a1.a() == paramInt) {
          if (a1.d != null) {
            Class<d.a> clazz = a1.c;
            if (clazz != null)
              try {
                if ((d.a)clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) == null)
                  throw null; 
              } catch (Exception exception) {
                String str;
                clazz = a1.c;
                if (clazz == null) {
                  str = "null";
                } else {
                  str = str.getName();
                } 
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to execute command with argument class ViewCommandArgument: ");
                stringBuilder.append(str);
                Log.e("A11yActionCompat", stringBuilder.toString(), exception);
              }  
            BottomSheetBehavior.c c = (BottomSheetBehavior.c)a1.d;
            c.b.J(c.a);
            boolean bool3 = true;
            break;
          } 
        } else {
          b++;
          continue;
        } 
      } 
      bool2 = false;
      break;
    } 
    boolean bool1 = bool2;
    if (!bool2)
      bool1 = this.a.performAccessibilityAction(paramView, paramInt, paramBundle); 
    boolean bool2 = bool1;
    if (!bool1) {
      bool2 = bool1;
      if (paramInt == b.accessibility_action_clickable_span) {
        paramInt = paramBundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray)paramView.getTag(b.tag_accessibility_clickable_spans);
        bool1 = bool;
        if (sparseArray != null) {
          WeakReference<ClickableSpan> weakReference = (WeakReference)sparseArray.get(paramInt);
          bool1 = bool;
          if (weakReference != null) {
            ClickableSpan clickableSpan = weakReference.get();
            if (clickableSpan != null) {
              ClickableSpan[] arrayOfClickableSpan = b.d(paramView.createAccessibilityNodeInfo().getText());
              for (paramInt = 0; arrayOfClickableSpan != null && paramInt < arrayOfClickableSpan.length; paramInt++) {
                if (clickableSpan.equals(arrayOfClickableSpan[paramInt])) {
                  paramInt = 1;
                  // Byte code: goto -> 364
                } 
              } 
            } 
            paramInt = 0;
            bool1 = bool;
            if (paramInt != 0) {
              clickableSpan.onClick(paramView);
              bool1 = true;
            } 
          } 
        } 
        bool2 = bool1;
      } 
    } 
    return bool2;
  }
  
  public void h(View paramView, int paramInt) {
    this.a.sendAccessibilityEvent(paramView, paramInt);
  }
  
  public void i(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    this.a.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }
  
  public static final class a extends View.AccessibilityDelegate {
    public final a a;
    
    public a(a param1a) {
      this.a = param1a;
    }
    
    public boolean dispatchPopulateAccessibilityEvent(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      return this.a.a(param1View, param1AccessibilityEvent);
    }
    
    public AccessibilityNodeProvider getAccessibilityNodeProvider(View param1View) {
      c c = this.a.b(param1View);
      if (c != null) {
        AccessibilityNodeProvider accessibilityNodeProvider = (AccessibilityNodeProvider)c.a;
      } else {
        c = null;
      } 
      return (AccessibilityNodeProvider)c;
    }
    
    public void onInitializeAccessibilityEvent(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      this.a.c(param1View, param1AccessibilityEvent);
    }
    
    public void onInitializeAccessibilityNodeInfo(View param1View, AccessibilityNodeInfo param1AccessibilityNodeInfo) {
      b b1 = new b(param1AccessibilityNodeInfo);
      boolean bool = l.H(param1View);
      if (Build.VERSION.SDK_INT >= 28) {
        b1.a.setScreenReaderFocusable(bool);
      } else {
        b1.h(1, bool);
      } 
      Boolean bool1 = (new o(b.tag_accessibility_heading, Boolean.class, 28)).d(param1View);
      if (bool1 == null) {
        bool = false;
      } else {
        bool = bool1.booleanValue();
      } 
      if (Build.VERSION.SDK_INT >= 28) {
        b1.a.setHeading(bool);
      } else {
        b1.h(2, bool);
      } 
      CharSequence charSequence1 = (new n(b.tag_accessibility_pane_title, CharSequence.class, 8, 28)).d(param1View);
      if (Build.VERSION.SDK_INT >= 28) {
        b1.a.setPaneTitle(charSequence1);
      } else {
        b1.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence1);
      } 
      this.a.d(param1View, b1);
      CharSequence charSequence2 = param1AccessibilityNodeInfo.getText();
      if (Build.VERSION.SDK_INT < 26) {
        b1.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        b1.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        b1.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        b1.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SparseArray sparseArray = (SparseArray)param1View.getTag(b.tag_accessibility_clickable_spans);
        if (sparseArray != null) {
          ArrayList<Integer> arrayList = new ArrayList();
          byte b2;
          for (b2 = 0; b2 < sparseArray.size(); b2++) {
            if (((WeakReference)sparseArray.valueAt(b2)).get() == null)
              arrayList.add(Integer.valueOf(b2)); 
          } 
          for (b2 = 0; b2 < arrayList.size(); b2++)
            sparseArray.remove(((Integer)arrayList.get(b2)).intValue()); 
        } 
        ClickableSpan[] arrayOfClickableSpan = b.d(charSequence2);
        if (arrayOfClickableSpan != null && arrayOfClickableSpan.length > 0) {
          b1.f().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", b.accessibility_action_clickable_span);
          sparseArray = (SparseArray)param1View.getTag(b.tag_accessibility_clickable_spans);
          SparseArray sparseArray1 = sparseArray;
          if (sparseArray == null) {
            sparseArray1 = new SparseArray();
            param1View.setTag(b.tag_accessibility_clickable_spans, sparseArray1);
          } 
          for (byte b2 = 0; b2 < arrayOfClickableSpan.length; b2++) {
            ClickableSpan clickableSpan1 = arrayOfClickableSpan[b2];
            int i = 0;
            while (true) {
              if (i < sparseArray1.size()) {
                if (clickableSpan1.equals(((WeakReference<ClickableSpan>)sparseArray1.valueAt(i)).get())) {
                  i = sparseArray1.keyAt(i);
                  break;
                } 
                i++;
                continue;
              } 
              i = b.d;
              b.d = i + 1;
              break;
            } 
            sparseArray1.put(i, new WeakReference<ClickableSpan>(arrayOfClickableSpan[b2]));
            ClickableSpan clickableSpan2 = arrayOfClickableSpan[b2];
            Spanned spanned = (Spanned)charSequence2;
            b1.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
            b1.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
            b1.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
            b1.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
          } 
        } 
      } 
      List<?> list2 = (List)param1View.getTag(b.tag_accessibility_actions);
      List<?> list1 = list2;
      if (list2 == null)
        list1 = Collections.emptyList(); 
      for (byte b = 0; b < list1.size(); b++)
        b1.a((b.a)list1.get(b)); 
    }
    
    public void onPopulateAccessibilityEvent(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      this.a.e(param1View, param1AccessibilityEvent);
    }
    
    public boolean onRequestSendAccessibilityEvent(ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent) {
      return this.a.f(param1ViewGroup, param1View, param1AccessibilityEvent);
    }
    
    public boolean performAccessibilityAction(View param1View, int param1Int, Bundle param1Bundle) {
      return this.a.g(param1View, param1Int, param1Bundle);
    }
    
    public void sendAccessibilityEvent(View param1View, int param1Int) {
      this.a.h(param1View, param1Int);
    }
    
    public void sendAccessibilityEventUnchecked(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      this.a.i(param1View, param1AccessibilityEvent);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\m\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */