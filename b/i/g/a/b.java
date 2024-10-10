package b.i.g.a;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
public class b {
  public final Context a;
  
  public b(Context paramContext) {
    this.a = paramContext;
  }
  
  public static FingerprintManager a(Context paramContext) {
    int i = Build.VERSION.SDK_INT;
    return (i == 23 || (i > 23 && paramContext.getPackageManager().hasSystemFeature("android.hardware.fingerprint"))) ? (FingerprintManager)paramContext.getSystemService(FingerprintManager.class) : null;
  }
  
  public boolean b() {
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i >= 23) {
      FingerprintManager fingerprintManager = a(this.a);
      bool1 = bool2;
      if (fingerprintManager != null) {
        bool1 = bool2;
        if (fingerprintManager.hasEnrolledFingerprints())
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  public boolean c() {
    int i = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (i >= 23) {
      FingerprintManager fingerprintManager = a(this.a);
      bool1 = bool2;
      if (fingerprintManager != null) {
        bool1 = bool2;
        if (fingerprintManager.isHardwareDetected())
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  public static abstract class a {}
  
  public static class b {
    public final Signature a;
    
    public final Cipher b;
    
    public final Mac c;
    
    public b(Signature param1Signature) {
      this.a = param1Signature;
      this.b = null;
      this.c = null;
    }
    
    public b(Cipher param1Cipher) {
      this.b = param1Cipher;
      this.a = null;
      this.c = null;
    }
    
    public b(Mac param1Mac) {
      this.c = param1Mac;
      this.b = null;
      this.a = null;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\g\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */