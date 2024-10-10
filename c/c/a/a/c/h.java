package c.c.a.a.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
public class h {
  public static h a;
  
  public h(Context paramContext) {
    paramContext.getApplicationContext();
  }
  
  public static t a(PackageInfo paramPackageInfo, t... paramVarArgs) {
    Signature[] arrayOfSignature2 = paramPackageInfo.signatures;
    if (arrayOfSignature2 == null)
      return null; 
    if (arrayOfSignature2.length != 1) {
      Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
      return null;
    } 
    Signature[] arrayOfSignature1 = paramPackageInfo.signatures;
    byte b = 0;
    u u = new u(arrayOfSignature1[0].toByteArray());
    while (b < paramVarArgs.length) {
      if (paramVarArgs[b].equals(u))
        return paramVarArgs[b]; 
      b++;
    } 
    return null;
  }
  
  public static boolean b(PackageInfo paramPackageInfo, boolean paramBoolean) {
    if (paramPackageInfo != null && paramPackageInfo.signatures != null) {
      t t;
      if (paramBoolean) {
        t = a(paramPackageInfo, w.a);
      } else {
        t = a((PackageInfo)t, new t[] { w.a[0] });
      } 
      if (t != null)
        return true; 
    } 
    return false;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */