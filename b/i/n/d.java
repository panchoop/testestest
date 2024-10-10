package b.i.n;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class d implements ActionMode.Callback {
  public final ActionMode.Callback a;
  
  public final TextView b;
  
  public Class<?> c;
  
  public Method d;
  
  public boolean e;
  
  public boolean f;
  
  public d(ActionMode.Callback paramCallback, TextView paramTextView) {
    this.a = paramCallback;
    this.b = paramTextView;
    this.f = false;
  }
  
  public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem) {
    return this.a.onActionItemClicked(paramActionMode, paramMenuItem);
  }
  
  public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu) {
    return this.a.onCreateActionMode(paramActionMode, paramMenu);
  }
  
  public void onDestroyActionMode(ActionMode paramActionMode) {
    this.a.onDestroyActionMode(paramActionMode);
  }
  
  public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu) {
    Context context = this.b.getContext();
    PackageManager packageManager = context.getPackageManager();
    if (!this.f) {
      this.f = true;
      try {
        Class<?> clazz = Class.forName("com.android.internal.view.menu.MenuBuilder");
        this.c = clazz;
        this.d = clazz.getDeclaredMethod("removeItemAt", new Class[] { int.class });
        this.e = true;
      } catch (ClassNotFoundException|NoSuchMethodException classNotFoundException) {
        this.c = null;
        this.d = null;
        this.e = false;
      } 
    } 
    try {
      Method method;
      if (this.e && this.c.isInstance(paramMenu)) {
        method = this.d;
      } else {
        method = paramMenu.getClass().getDeclaredMethod("removeItemAt", new Class[] { int.class });
      } 
      int i;
      for (i = paramMenu.size(); --i >= 0; i--) {
        MenuItem menuItem = paramMenu.getItem(i);
        if (menuItem.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(menuItem.getIntent().getAction()))
          method.invoke(paramMenu, new Object[] { Integer.valueOf(i) }); 
      } 
      ArrayList<Object> arrayList = new ArrayList();
      if (context instanceof android.app.Activity) {
        Iterator iterator = packageManager.queryIntentActivities((new Intent()).setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0).iterator();
        while (true) {
          while (true)
            break; 
          if (i != 0)
            arrayList.add(SYNTHETIC_LOCAL_VARIABLE_9); 
        } 
      } 
      for (i = 0; i < arrayList.size(); i++) {
        boolean bool;
        ResolveInfo resolveInfo = (ResolveInfo)arrayList.get(i);
        MenuItem menuItem = paramMenu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager));
        TextView textView = this.b;
        Intent intent2 = (new Intent()).setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        if (textView instanceof android.text.Editable && textView.onCheckIsTextEditor() && textView.isEnabled()) {
          bool = true;
        } else {
          bool = false;
        } 
        Intent intent1 = intent2.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", bool ^ true);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        menuItem.setIntent(intent1.setClassName(activityInfo.packageName, activityInfo.name)).setShowAsAction(1);
      } 
    } catch (NoSuchMethodException|IllegalAccessException|java.lang.reflect.InvocationTargetException noSuchMethodException) {}
    return this.a.onPrepareActionMode(paramActionMode, paramMenu);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\n\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */