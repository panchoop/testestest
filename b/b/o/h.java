package b.b.o;

import android.view.ActionMode;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

public class h implements Window.Callback {
  public final Window.Callback b;
  
  public h(Window.Callback paramCallback) {
    if (paramCallback != null) {
      this.b = paramCallback;
      return;
    } 
    throw new IllegalArgumentException("Window callback may not be null");
  }
  
  public boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent) {
    return this.b.dispatchGenericMotionEvent(paramMotionEvent);
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    return this.b.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent) {
    return this.b.dispatchTouchEvent(paramMotionEvent);
  }
  
  public boolean dispatchTrackballEvent(MotionEvent paramMotionEvent) {
    return this.b.dispatchTrackballEvent(paramMotionEvent);
  }
  
  public void onActionModeFinished(ActionMode paramActionMode) {
    this.b.onActionModeFinished(paramActionMode);
  }
  
  public void onActionModeStarted(ActionMode paramActionMode) {
    this.b.onActionModeStarted(paramActionMode);
  }
  
  public void onAttachedToWindow() {
    this.b.onAttachedToWindow();
  }
  
  public View onCreatePanelView(int paramInt) {
    return this.b.onCreatePanelView(paramInt);
  }
  
  public void onDetachedFromWindow() {
    this.b.onDetachedFromWindow();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem) {
    return this.b.onMenuItemSelected(paramInt, paramMenuItem);
  }
  
  public void onPointerCaptureChanged(boolean paramBoolean) {
    this.b.onPointerCaptureChanged(paramBoolean);
  }
  
  public boolean onSearchRequested() {
    return this.b.onSearchRequested();
  }
  
  public boolean onSearchRequested(SearchEvent paramSearchEvent) {
    return this.b.onSearchRequested(paramSearchEvent);
  }
  
  public void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams) {
    this.b.onWindowAttributesChanged(paramLayoutParams);
  }
  
  public void onWindowFocusChanged(boolean paramBoolean) {
    this.b.onWindowFocusChanged(paramBoolean);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */