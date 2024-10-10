package b.b.o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import b.b.i;

public class c extends ContextWrapper {
  public int a;
  
  public Resources.Theme b;
  
  public LayoutInflater c;
  
  public Configuration d;
  
  public Resources e;
  
  public c() {
    super(null);
  }
  
  public c(Context paramContext, int paramInt) {
    super(paramContext);
    this.a = paramInt;
  }
  
  public void a(Configuration paramConfiguration) {
    if (this.e == null) {
      if (this.d == null) {
        this.d = new Configuration(paramConfiguration);
        return;
      } 
      throw new IllegalStateException("Override configuration has already been set");
    } 
    throw new IllegalStateException("getResources() or getAssets() has already been called");
  }
  
  public void attachBaseContext(Context paramContext) {
    super.attachBaseContext(paramContext);
  }
  
  public final void b() {
    boolean bool;
    if (this.b == null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      this.b = getResources().newTheme();
      Resources.Theme theme = getBaseContext().getTheme();
      if (theme != null)
        this.b.setTo(theme); 
    } 
    this.b.applyStyle(this.a, true);
  }
  
  public AssetManager getAssets() {
    return getResources().getAssets();
  }
  
  public Resources getResources() {
    if (this.e == null) {
      Resources resources;
      Configuration configuration = this.d;
      if (configuration == null) {
        resources = super.getResources();
      } else {
        resources = createConfigurationContext((Configuration)resources).getResources();
      } 
      this.e = resources;
    } 
    return this.e;
  }
  
  public Object getSystemService(String paramString) {
    if ("layout_inflater".equals(paramString)) {
      if (this.c == null)
        this.c = LayoutInflater.from(getBaseContext()).cloneInContext((Context)this); 
      return this.c;
    } 
    return getBaseContext().getSystemService(paramString);
  }
  
  public Resources.Theme getTheme() {
    Resources.Theme theme = this.b;
    if (theme != null)
      return theme; 
    if (this.a == 0)
      this.a = i.Theme_AppCompat_Light; 
    b();
    return this.b;
  }
  
  public void setTheme(int paramInt) {
    if (this.a != paramInt) {
      this.a = paramInt;
      b();
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */