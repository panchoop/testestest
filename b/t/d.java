package b.t;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import b.i.m.l;
import b.l.a.b0;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"RestrictedApi"})
public class d extends b0 {
  public static boolean w(i parami) {
    return (!b0.k(parami.f) || !b0.k(parami.h) || !b0.k(parami.i));
  }
  
  public void a(Object paramObject, View paramView) {
    if (paramObject != null)
      ((i)paramObject).b(paramView); 
  }
  
  public void b(Object paramObject, ArrayList<View> paramArrayList) {
    paramObject = paramObject;
    if (paramObject == null)
      return; 
    boolean bool = paramObject instanceof o;
    int j = 0;
    int i = 0;
    if (bool) {
      paramObject = paramObject;
      j = ((o)paramObject).J.size();
      while (i < j) {
        b(paramObject.J(i), paramArrayList);
        i++;
      } 
    } else if (!w((i)paramObject) && b0.k(((i)paramObject).g)) {
      int k = paramArrayList.size();
      for (i = j; i < k; i++)
        paramObject.b(paramArrayList.get(i)); 
    } 
  }
  
  public void c(ViewGroup paramViewGroup, Object paramObject) {
    paramObject = paramObject;
    if (!m.c.contains(paramViewGroup) && l.E((View)paramViewGroup)) {
      m.c.add(paramViewGroup);
      paramObject = paramObject.k();
      ArrayList arrayList = (ArrayList)m.a().getOrDefault(paramViewGroup, null);
      if (arrayList != null && arrayList.size() > 0) {
        Iterator<i> iterator = arrayList.iterator();
        while (iterator.hasNext())
          ((i)iterator.next()).v((View)paramViewGroup); 
      } 
      if (paramObject != null)
        paramObject.i(paramViewGroup, true); 
      if ((h)paramViewGroup.getTag(f.transition_current_scene) == null) {
        paramViewGroup.setTag(f.transition_current_scene, null);
        if (paramObject != null) {
          paramObject = new m.a((i)paramObject, paramViewGroup);
          paramViewGroup.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)paramObject);
          paramViewGroup.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)paramObject);
        } 
      } else {
        throw null;
      } 
    } 
  }
  
  public boolean e(Object paramObject) {
    return paramObject instanceof i;
  }
  
  public Object g(Object paramObject) {
    if (paramObject != null) {
      paramObject = ((i)paramObject).k();
    } else {
      paramObject = null;
    } 
    return paramObject;
  }
  
  public Object l(Object paramObject1, Object paramObject2, Object paramObject3) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    i i = (i)paramObject3;
    if (paramObject1 != null && paramObject2 != null) {
      paramObject3 = new o();
      paramObject3.I((i)paramObject1);
      paramObject3.I((i)paramObject2);
      paramObject3.K(1);
      paramObject1 = paramObject3;
    } else if (paramObject1 == null) {
      if (paramObject2 != null) {
        paramObject1 = paramObject2;
      } else {
        paramObject1 = null;
      } 
    } 
    if (i != null) {
      paramObject2 = new o();
      if (paramObject1 != null)
        paramObject2.I((i)paramObject1); 
      paramObject2.I(i);
      return paramObject2;
    } 
    return paramObject1;
  }
  
  public Object m(Object paramObject1, Object paramObject2, Object paramObject3) {
    o o = new o();
    if (paramObject1 != null)
      o.I((i)paramObject1); 
    if (paramObject2 != null)
      o.I((i)paramObject2); 
    if (paramObject3 != null)
      o.I((i)paramObject3); 
    return o;
  }
  
  public void n(Object paramObject, View paramView) {
    if (paramObject != null)
      ((i)paramObject).x(paramView); 
  }
  
  public void o(Object<View> paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2) {
    i i1 = (i)paramObject;
    boolean bool = i1 instanceof o;
    int j = 0;
    int i = 0;
    if (bool) {
      paramObject = (Object<View>)i1;
      j = ((o)paramObject).J.size();
      while (i < j) {
        o(paramObject.J(i), paramArrayList1, paramArrayList2);
        i++;
      } 
    } else if (!w(i1)) {
      paramObject = (Object<View>)i1.g;
      if (paramObject.size() == paramArrayList1.size() && paramObject.containsAll(paramArrayList1)) {
        if (paramArrayList2 == null) {
          i = 0;
        } else {
          i = paramArrayList2.size();
        } 
        while (j < i) {
          i1.b(paramArrayList2.get(j));
          j++;
        } 
        i = paramArrayList1.size();
        while (--i >= 0)
          i1.x(paramArrayList1.get(i)); 
      } 
    } 
  }
  
  public void p(Object paramObject, View paramView, ArrayList<View> paramArrayList) {
    ((i)paramObject).a(new b(this, paramView, paramArrayList));
  }
  
  public void q(Object paramObject1, Object paramObject2, ArrayList<View> paramArrayList1, Object paramObject3, ArrayList<View> paramArrayList2, Object paramObject4, ArrayList<View> paramArrayList3) {
    ((i)paramObject1).a(new c(this, paramObject2, paramArrayList1, paramObject3, paramArrayList2, paramObject4, paramArrayList3));
  }
  
  public void r(Object paramObject, Rect paramRect) {
    if (paramObject != null)
      ((i)paramObject).B(new d(this, paramRect)); 
  }
  
  public void s(Object paramObject, View paramView) {
    if (paramView != null) {
      i i = (i)paramObject;
      paramObject = new Rect();
      j(paramView, (Rect)paramObject);
      i.B(new a(this, (Rect)paramObject));
    } 
  }
  
  public void t(Object paramObject, View paramView, ArrayList<View> paramArrayList) {
    paramObject = paramObject;
    ArrayList<View> arrayList = ((i)paramObject).g;
    arrayList.clear();
    int i = paramArrayList.size();
    for (byte b = 0; b < i; b++)
      b0.d(arrayList, paramArrayList.get(b)); 
    arrayList.add(paramView);
    paramArrayList.add(paramView);
    b(paramObject, paramArrayList);
  }
  
  public void u(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2) {
    paramObject = paramObject;
    if (paramObject != null) {
      ((i)paramObject).g.clear();
      ((i)paramObject).g.addAll(paramArrayList2);
      o(paramObject, paramArrayList1, paramArrayList2);
    } 
  }
  
  public Object v(Object paramObject) {
    if (paramObject == null)
      return null; 
    o o = new o();
    o.I((i)paramObject);
    return o;
  }
  
  public class a extends i.c {
    public a(d this$0, Rect param1Rect) {}
  }
  
  public class b implements i.d {
    public final View a;
    
    public final ArrayList b;
    
    public b(d this$0, View param1View, ArrayList param1ArrayList) {}
    
    public void a(i param1i) {}
    
    public void b(i param1i) {}
    
    public void c(i param1i) {
      param1i.w(this);
      this.a.setVisibility(8);
      int j = this.b.size();
      for (byte b1 = 0; b1 < j; b1++)
        ((View)this.b.get(b1)).setVisibility(0); 
    }
    
    public void d(i param1i) {}
    
    public void e(i param1i) {}
  }
  
  public class c extends l {
    public final Object a;
    
    public final ArrayList b;
    
    public final Object c;
    
    public final ArrayList d;
    
    public final Object e;
    
    public final ArrayList f;
    
    public final d g;
    
    public c(d this$0, Object param1Object1, ArrayList param1ArrayList1, Object param1Object2, ArrayList param1ArrayList2, Object param1Object3, ArrayList param1ArrayList3) {}
    
    public void a(i param1i) {
      Object object = this.a;
      if (object != null)
        this.g.o(object, this.b, null); 
      object = this.c;
      if (object != null)
        this.g.o(object, this.d, null); 
      object = this.e;
      if (object != null)
        this.g.o(object, this.f, null); 
    }
    
    public void c(i param1i) {
      param1i.w(this);
    }
  }
  
  public class d extends i.c {
    public d(d this$0, Rect param1Rect) {}
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */