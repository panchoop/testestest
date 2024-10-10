package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.c.a.b.e0.a;
import c.c.a.b.e0.e;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
  public final a j = new a(this);
  
  public boolean B(View paramView) {
    if (this.j != null)
      return paramView instanceof c.c.a.b.e0.d; 
    throw null;
  }
  
  public boolean j(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent) {
    if (this.j != null) {
      int i = paramMotionEvent.getActionMasked();
      if (i != 0) {
        if (i == 1 || i == 3) {
          if (e.c == null)
            e.c = new e(); 
          synchronized (e.c.a) {
          
          } 
        } 
      } else if (paramCoordinatorLayout.j(paramView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
        if (e.c == null)
          e.c = new e(); 
        synchronized (e.c.a) {
        
        } 
      } 
      return super.j(paramCoordinatorLayout, paramView, paramMotionEvent);
    } 
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\google\android\material\snackbar\BaseTransientBottomBar$Behavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */