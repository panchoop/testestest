package b.l.a;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import b.i.m.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
public abstract class b0 {
  public static void d(List<View> paramList, View paramView) {
    int j = paramList.size();
    if (h(paramList, paramView, j))
      return; 
    paramList.add(paramView);
    for (int i = j; i < paramList.size(); i++) {
      paramView = paramList.get(i);
      if (paramView instanceof ViewGroup) {
        ViewGroup viewGroup = (ViewGroup)paramView;
        int k = viewGroup.getChildCount();
        for (byte b = 0; b < k; b++) {
          View view = viewGroup.getChildAt(b);
          if (!h(paramList, view, j))
            paramList.add(view); 
        } 
      } 
    } 
  }
  
  public static boolean h(List<View> paramList, View paramView, int paramInt) {
    for (byte b = 0; b < paramInt; b++) {
      if (paramList.get(b) == paramView)
        return true; 
    } 
    return false;
  }
  
  public static boolean k(List paramList) {
    return (paramList == null || paramList.isEmpty());
  }
  
  public abstract void a(Object paramObject, View paramView);
  
  public abstract void b(Object paramObject, ArrayList<View> paramArrayList);
  
  public abstract void c(ViewGroup paramViewGroup, Object paramObject);
  
  public abstract boolean e(Object paramObject);
  
  public void f(ArrayList<View> paramArrayList, View paramView) {
    ViewGroup viewGroup;
    if (paramView.getVisibility() == 0) {
      View view = paramView;
      if (paramView instanceof ViewGroup) {
        viewGroup = (ViewGroup)paramView;
        if (viewGroup.isTransitionGroup()) {
          paramArrayList.add(viewGroup);
          return;
        } 
        int i = viewGroup.getChildCount();
        for (byte b = 0; b < i; b++)
          f(paramArrayList, viewGroup.getChildAt(b)); 
        return;
      } 
    } else {
      return;
    } 
    paramArrayList.add(viewGroup);
  }
  
  public abstract Object g(Object paramObject);
  
  public void i(Map<String, View> paramMap, View paramView) {
    if (paramView.getVisibility() == 0) {
      String str = l.x(paramView);
      if (str != null)
        paramMap.put(str, paramView); 
      if (paramView instanceof ViewGroup) {
        ViewGroup viewGroup = (ViewGroup)paramView;
        int i = viewGroup.getChildCount();
        for (byte b = 0; b < i; b++)
          i(paramMap, viewGroup.getChildAt(b)); 
      } 
    } 
  }
  
  public void j(View paramView, Rect paramRect) {
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    int j = arrayOfInt[0];
    int i = arrayOfInt[1];
    int k = arrayOfInt[0];
    int m = paramView.getWidth();
    int n = arrayOfInt[1];
    paramRect.set(j, i, m + k, paramView.getHeight() + n);
  }
  
  public abstract Object l(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public abstract Object m(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public abstract void n(Object paramObject, View paramView);
  
  public abstract void o(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2);
  
  public abstract void p(Object paramObject, View paramView, ArrayList<View> paramArrayList);
  
  public abstract void q(Object paramObject1, Object paramObject2, ArrayList<View> paramArrayList1, Object paramObject3, ArrayList<View> paramArrayList2, Object paramObject4, ArrayList<View> paramArrayList3);
  
  public abstract void r(Object paramObject, Rect paramRect);
  
  public abstract void s(Object paramObject, View paramView);
  
  public abstract void t(Object paramObject, View paramView, ArrayList<View> paramArrayList);
  
  public abstract void u(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2);
  
  public abstract Object v(Object paramObject);
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */