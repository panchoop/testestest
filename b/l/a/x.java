package b.l.a;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class x extends b0 {
  public static boolean w(Transition paramTransition) {
    return (!b0.k(paramTransition.getTargetIds()) || !b0.k(paramTransition.getTargetNames()) || !b0.k(paramTransition.getTargetTypes()));
  }
  
  public void a(Object paramObject, View paramView) {
    if (paramObject != null)
      ((Transition)paramObject).addTarget(paramView); 
  }
  
  public void b(Object paramObject, ArrayList<View> paramArrayList) {
    paramObject = paramObject;
    if (paramObject == null)
      return; 
    boolean bool = paramObject instanceof TransitionSet;
    int j = 0;
    int i = 0;
    if (bool) {
      paramObject = paramObject;
      j = paramObject.getTransitionCount();
      while (i < j) {
        b(paramObject.getTransitionAt(i), paramArrayList);
        i++;
      } 
    } else if (!w((Transition)paramObject) && b0.k(paramObject.getTargets())) {
      int k = paramArrayList.size();
      for (i = j; i < k; i++)
        paramObject.addTarget(paramArrayList.get(i)); 
    } 
  }
  
  public void c(ViewGroup paramViewGroup, Object paramObject) {
    TransitionManager.beginDelayedTransition(paramViewGroup, (Transition)paramObject);
  }
  
  public boolean e(Object paramObject) {
    return paramObject instanceof Transition;
  }
  
  public Object g(Object paramObject) {
    if (paramObject != null) {
      paramObject = ((Transition)paramObject).clone();
    } else {
      paramObject = null;
    } 
    return paramObject;
  }
  
  public Object l(Object paramObject1, Object paramObject2, Object paramObject3) {
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    paramObject3 = paramObject3;
    if (paramObject1 != null && paramObject2 != null) {
      paramObject1 = (new TransitionSet()).addTransition((Transition)paramObject1).addTransition((Transition)paramObject2).setOrdering(1);
    } else if (paramObject1 == null) {
      if (paramObject2 != null) {
        paramObject1 = paramObject2;
      } else {
        paramObject1 = null;
      } 
    } 
    if (paramObject3 != null) {
      paramObject2 = new TransitionSet();
      if (paramObject1 != null)
        paramObject2.addTransition((Transition)paramObject1); 
      paramObject2.addTransition((Transition)paramObject3);
      return paramObject2;
    } 
    return paramObject1;
  }
  
  public Object m(Object paramObject1, Object paramObject2, Object paramObject3) {
    TransitionSet transitionSet = new TransitionSet();
    if (paramObject1 != null)
      transitionSet.addTransition((Transition)paramObject1); 
    if (paramObject2 != null)
      transitionSet.addTransition((Transition)paramObject2); 
    if (paramObject3 != null)
      transitionSet.addTransition((Transition)paramObject3); 
    return transitionSet;
  }
  
  public void n(Object paramObject, View paramView) {
    if (paramObject != null)
      ((Transition)paramObject).removeTarget(paramView); 
  }
  
  public void o(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2) {
    Transition transition = (Transition)paramObject;
    boolean bool = transition instanceof TransitionSet;
    int j = 0;
    int i = 0;
    if (bool) {
      paramObject = transition;
      j = paramObject.getTransitionCount();
      while (i < j) {
        o(paramObject.getTransitionAt(i), paramArrayList1, paramArrayList2);
        i++;
      } 
    } else if (!w(transition)) {
      paramObject = transition.getTargets();
      if (paramObject != null && paramObject.size() == paramArrayList1.size() && paramObject.containsAll(paramArrayList1)) {
        if (paramArrayList2 == null) {
          i = 0;
        } else {
          i = paramArrayList2.size();
        } 
        while (j < i) {
          transition.addTarget(paramArrayList2.get(j));
          j++;
        } 
        for (i = paramArrayList1.size() - 1; i >= 0; i--)
          transition.removeTarget(paramArrayList1.get(i)); 
      } 
    } 
  }
  
  public void p(Object paramObject, View paramView, ArrayList<View> paramArrayList) {
    ((Transition)paramObject).addListener(new b(this, paramView, paramArrayList));
  }
  
  public void q(Object paramObject1, Object paramObject2, ArrayList<View> paramArrayList1, Object paramObject3, ArrayList<View> paramArrayList2, Object paramObject4, ArrayList<View> paramArrayList3) {
    ((Transition)paramObject1).addListener(new c(this, paramObject2, paramArrayList1, paramObject3, paramArrayList2, paramObject4, paramArrayList3));
  }
  
  public void r(Object paramObject, Rect paramRect) {
    if (paramObject != null)
      ((Transition)paramObject).setEpicenterCallback(new d(this, paramRect)); 
  }
  
  public void s(Object paramObject, View paramView) {
    if (paramView != null) {
      paramObject = paramObject;
      Rect rect = new Rect();
      j(paramView, rect);
      paramObject.setEpicenterCallback(new a(this, rect));
    } 
  }
  
  public void t(Object paramObject, View paramView, ArrayList<View> paramArrayList) {
    paramObject = paramObject;
    List<View> list = paramObject.getTargets();
    list.clear();
    int i = paramArrayList.size();
    for (byte b = 0; b < i; b++)
      b0.d(list, paramArrayList.get(b)); 
    list.add(paramView);
    paramArrayList.add(paramView);
    b(paramObject, paramArrayList);
  }
  
  public void u(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2) {
    paramObject = paramObject;
    if (paramObject != null) {
      paramObject.getTargets().clear();
      paramObject.getTargets().addAll(paramArrayList2);
      o(paramObject, paramArrayList1, paramArrayList2);
    } 
  }
  
  public Object v(Object paramObject) {
    if (paramObject == null)
      return null; 
    TransitionSet transitionSet = new TransitionSet();
    transitionSet.addTransition((Transition)paramObject);
    return transitionSet;
  }
  
  public class a extends Transition.EpicenterCallback {
    public final Rect a;
    
    public a(x this$0, Rect param1Rect) {}
    
    public Rect onGetEpicenter(Transition param1Transition) {
      return this.a;
    }
  }
  
  public class b implements Transition.TransitionListener {
    public final View a;
    
    public final ArrayList b;
    
    public b(x this$0, View param1View, ArrayList param1ArrayList) {}
    
    public void onTransitionCancel(Transition param1Transition) {}
    
    public void onTransitionEnd(Transition param1Transition) {
      param1Transition.removeListener(this);
      this.a.setVisibility(8);
      int i = this.b.size();
      for (byte b1 = 0; b1 < i; b1++)
        ((View)this.b.get(b1)).setVisibility(0); 
    }
    
    public void onTransitionPause(Transition param1Transition) {}
    
    public void onTransitionResume(Transition param1Transition) {}
    
    public void onTransitionStart(Transition param1Transition) {}
  }
  
  public class c implements Transition.TransitionListener {
    public final Object a;
    
    public final ArrayList b;
    
    public final Object c;
    
    public final ArrayList d;
    
    public final Object e;
    
    public final ArrayList f;
    
    public final x g;
    
    public c(x this$0, Object param1Object1, ArrayList param1ArrayList1, Object param1Object2, ArrayList param1ArrayList2, Object param1Object3, ArrayList param1ArrayList3) {}
    
    public void onTransitionCancel(Transition param1Transition) {}
    
    public void onTransitionEnd(Transition param1Transition) {
      param1Transition.removeListener(this);
    }
    
    public void onTransitionPause(Transition param1Transition) {}
    
    public void onTransitionResume(Transition param1Transition) {}
    
    public void onTransitionStart(Transition param1Transition) {
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
  }
  
  public class d extends Transition.EpicenterCallback {
    public final Rect a;
    
    public d(x this$0, Rect param1Rect) {}
    
    public Rect onGetEpicenter(Transition param1Transition) {
      Rect rect = this.a;
      return (rect == null || rect.isEmpty()) ? null : this.a;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\l\a\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */