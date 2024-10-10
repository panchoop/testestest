package c.c.a.a.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;

public final class f extends g {
  public static Resources d(Context paramContext) {
    try {
      Resources resources = paramContext.getPackageManager().getResourcesForApplication("com.google.android.gms");
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      nameNotFoundException = null;
    } 
    return (Resources)nameNotFoundException;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */