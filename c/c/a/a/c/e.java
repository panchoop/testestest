package c.c.a.a.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import c.a.a.a.a;
import c.c.a.a.c.l.f0;
import c.c.a.a.c.l.q;
import c.c.a.a.c.p.a;
import c.c.a.a.c.p.b;
import java.util.Iterator;
import java.util.List;

public class e {
  public static final int a = 12451000;
  
  public static final e b = new e();
  
  public Intent a(Context paramContext, int paramInt, String paramString) {
    if (paramInt != 1 && paramInt != 2)
      return (paramInt != 3) ? null : f0.b("com.google.android.gms"); 
    if (paramContext != null && q.J(paramContext))
      return f0.c(); 
    StringBuilder stringBuilder = a.e("gcore_");
    stringBuilder.append(a);
    stringBuilder.append("-");
    if (!TextUtils.isEmpty(paramString))
      stringBuilder.append(paramString); 
    stringBuilder.append("-");
    if (paramContext != null)
      stringBuilder.append(paramContext.getPackageName()); 
    stringBuilder.append("-");
    if (paramContext != null)
      try {
        a a = b.a(paramContext);
        String str = paramContext.getPackageName();
        stringBuilder.append((a.a.getPackageManager().getPackageInfo(str, 0)).versionCode);
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {} 
    return f0.a("com.google.android.gms", stringBuilder.toString());
  }
  
  public int b(Context paramContext) {
    return c(paramContext, a);
  }
  
  public int c(Context paramContext, int paramInt) {
    paramInt = g.b(paramContext, paramInt);
    boolean bool = true;
    if (paramInt != 18) {
      if (paramInt == 1)
        try {
          List list = paramContext.getPackageManager().getPackageInstaller().getAllSessions();
          Iterator<PackageInstaller.SessionInfo> iterator = list.iterator();
          while (iterator.hasNext()) {
            if ("com.google.android.gms".equals(((PackageInstaller.SessionInfo)iterator.next()).getAppPackageName()))
              // Byte code: goto -> 100 
          } 
          PackageManager packageManager = paramContext.getPackageManager();
          bool = (packageManager.getApplicationInfo("com.google.android.gms", 8192)).enabled;
          if (bool)
            paramInt = 18; 
          return paramInt;
        } catch (Exception exception) {} 
      bool = false;
    } 
    if (bool)
      paramInt = 18; 
    return paramInt;
  }
  
  static {
    int i = g.a;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */