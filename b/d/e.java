package b.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.Fragment;
import b.l.a.k;
import com.app.damnvulnerablebank.SendMoney;
import java.util.concurrent.Executor;

@SuppressLint({"SyntheticAccessor"})
public class e extends Fragment {
  public b W;
  
  public Executor X;
  
  public BiometricPrompt.b Y;
  
  public Handler Z;
  
  public boolean a0;
  
  public BiometricPrompt.d b0;
  
  public Context c0;
  
  public int d0;
  
  public b.i.i.a e0;
  
  public final b.i.g.a.b.a f0 = new a(this);
  
  public void A(Bundle paramBundle) {
    super.A(paramBundle);
    X(true);
    this.c0 = k();
  }
  
  public View B(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a0 : Z
    //   4: ifne -> 418
    //   7: aload_0
    //   8: new b/i/i/a
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: putfield e0 : Lb/i/i/a;
    //   18: iconst_0
    //   19: istore #5
    //   21: aload_0
    //   22: iconst_0
    //   23: putfield d0 : I
    //   26: aload_0
    //   27: getfield c0 : Landroid/content/Context;
    //   30: astore_2
    //   31: getstatic android/os/Build$VERSION.SDK_INT : I
    //   34: bipush #23
    //   36: if_icmplt -> 61
    //   39: aload_2
    //   40: invokestatic a : (Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;
    //   43: astore_1
    //   44: aload_1
    //   45: ifnull -> 61
    //   48: aload_1
    //   49: invokevirtual isHardwareDetected : ()Z
    //   52: ifeq -> 61
    //   55: iconst_1
    //   56: istore #4
    //   58: goto -> 64
    //   61: iconst_0
    //   62: istore #4
    //   64: iload #4
    //   66: ifne -> 76
    //   69: bipush #12
    //   71: istore #4
    //   73: goto -> 118
    //   76: getstatic android/os/Build$VERSION.SDK_INT : I
    //   79: bipush #23
    //   81: if_icmplt -> 106
    //   84: aload_2
    //   85: invokestatic a : (Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;
    //   88: astore_1
    //   89: aload_1
    //   90: ifnull -> 106
    //   93: aload_1
    //   94: invokevirtual hasEnrolledFingerprints : ()Z
    //   97: ifeq -> 106
    //   100: iconst_1
    //   101: istore #4
    //   103: goto -> 109
    //   106: iconst_0
    //   107: istore #4
    //   109: iload #4
    //   111: ifne -> 127
    //   114: bipush #11
    //   116: istore #4
    //   118: aload_0
    //   119: iload #4
    //   121: invokevirtual b0 : (I)V
    //   124: iconst_1
    //   125: istore #5
    //   127: iload #5
    //   129: ifeq -> 147
    //   132: aload_0
    //   133: getfield W : Lb/d/e$b;
    //   136: iconst_3
    //   137: invokevirtual a : (I)V
    //   140: aload_0
    //   141: invokevirtual a0 : ()V
    //   144: goto -> 418
    //   147: aload_0
    //   148: getfield b0 : Landroidx/biometric/BiometricPrompt$d;
    //   151: astore_1
    //   152: aload_1
    //   153: ifnonnull -> 159
    //   156: goto -> 222
    //   159: aload_1
    //   160: getfield b : Ljavax/crypto/Cipher;
    //   163: astore_3
    //   164: aload_3
    //   165: ifnull -> 180
    //   168: new b/i/g/a/b$b
    //   171: dup
    //   172: aload_3
    //   173: invokespecial <init> : (Ljavax/crypto/Cipher;)V
    //   176: astore_1
    //   177: goto -> 224
    //   180: aload_1
    //   181: getfield a : Ljava/security/Signature;
    //   184: astore_3
    //   185: aload_3
    //   186: ifnull -> 201
    //   189: new b/i/g/a/b$b
    //   192: dup
    //   193: aload_3
    //   194: invokespecial <init> : (Ljava/security/Signature;)V
    //   197: astore_1
    //   198: goto -> 224
    //   201: aload_1
    //   202: getfield c : Ljavax/crypto/Mac;
    //   205: astore_1
    //   206: aload_1
    //   207: ifnull -> 222
    //   210: new b/i/g/a/b$b
    //   213: dup
    //   214: aload_1
    //   215: invokespecial <init> : (Ljavax/crypto/Mac;)V
    //   218: astore_1
    //   219: goto -> 224
    //   222: aconst_null
    //   223: astore_1
    //   224: aload_0
    //   225: getfield e0 : Lb/i/i/a;
    //   228: astore #7
    //   230: aload_0
    //   231: getfield f0 : Lb/i/g/a/b$a;
    //   234: astore_3
    //   235: getstatic android/os/Build$VERSION.SDK_INT : I
    //   238: bipush #23
    //   240: if_icmplt -> 413
    //   243: aload_2
    //   244: invokestatic a : (Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;
    //   247: astore #6
    //   249: aload #6
    //   251: ifnull -> 413
    //   254: aload #7
    //   256: ifnull -> 319
    //   259: aload #7
    //   261: monitorenter
    //   262: aload #7
    //   264: getfield b : Ljava/lang/Object;
    //   267: ifnonnull -> 296
    //   270: new android/os/CancellationSignal
    //   273: astore_2
    //   274: aload_2
    //   275: invokespecial <init> : ()V
    //   278: aload #7
    //   280: aload_2
    //   281: putfield b : Ljava/lang/Object;
    //   284: aload #7
    //   286: getfield a : Z
    //   289: ifeq -> 296
    //   292: aload_2
    //   293: invokevirtual cancel : ()V
    //   296: aload #7
    //   298: getfield b : Ljava/lang/Object;
    //   301: astore_2
    //   302: aload #7
    //   304: monitorexit
    //   305: aload_2
    //   306: checkcast android/os/CancellationSignal
    //   309: astore_2
    //   310: goto -> 321
    //   313: astore_1
    //   314: aload #7
    //   316: monitorexit
    //   317: aload_1
    //   318: athrow
    //   319: aconst_null
    //   320: astore_2
    //   321: aload_1
    //   322: ifnonnull -> 328
    //   325: goto -> 394
    //   328: aload_1
    //   329: getfield b : Ljavax/crypto/Cipher;
    //   332: ifnull -> 350
    //   335: new android/hardware/fingerprint/FingerprintManager$CryptoObject
    //   338: dup
    //   339: aload_1
    //   340: getfield b : Ljavax/crypto/Cipher;
    //   343: invokespecial <init> : (Ljavax/crypto/Cipher;)V
    //   346: astore_1
    //   347: goto -> 396
    //   350: aload_1
    //   351: getfield a : Ljava/security/Signature;
    //   354: ifnull -> 372
    //   357: new android/hardware/fingerprint/FingerprintManager$CryptoObject
    //   360: dup
    //   361: aload_1
    //   362: getfield a : Ljava/security/Signature;
    //   365: invokespecial <init> : (Ljava/security/Signature;)V
    //   368: astore_1
    //   369: goto -> 347
    //   372: aload_1
    //   373: getfield c : Ljavax/crypto/Mac;
    //   376: ifnull -> 394
    //   379: new android/hardware/fingerprint/FingerprintManager$CryptoObject
    //   382: dup
    //   383: aload_1
    //   384: getfield c : Ljavax/crypto/Mac;
    //   387: invokespecial <init> : (Ljavax/crypto/Mac;)V
    //   390: astore_1
    //   391: goto -> 347
    //   394: aconst_null
    //   395: astore_1
    //   396: aload #6
    //   398: aload_1
    //   399: aload_2
    //   400: iconst_0
    //   401: new b/i/g/a/a
    //   404: dup
    //   405: aload_3
    //   406: invokespecial <init> : (Lb/i/g/a/b$a;)V
    //   409: aconst_null
    //   410: invokevirtual authenticate : (Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;Landroid/os/CancellationSignal;ILandroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;Landroid/os/Handler;)V
    //   413: aload_0
    //   414: iconst_1
    //   415: putfield a0 : Z
    //   418: aconst_null
    //   419: areturn
    // Exception table:
    //   from	to	target	type
    //   262	296	313	finally
    //   296	305	313	finally
    //   314	317	313	finally
  }
  
  public void Z(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: putfield d0 : I
    //   5: iload_1
    //   6: iconst_1
    //   7: if_icmpne -> 16
    //   10: aload_0
    //   11: bipush #10
    //   13: invokevirtual b0 : (I)V
    //   16: aload_0
    //   17: getfield e0 : Lb/i/i/a;
    //   20: astore_2
    //   21: aload_2
    //   22: ifnull -> 102
    //   25: aload_2
    //   26: monitorenter
    //   27: aload_2
    //   28: getfield a : Z
    //   31: ifeq -> 39
    //   34: aload_2
    //   35: monitorexit
    //   36: goto -> 102
    //   39: aload_2
    //   40: iconst_1
    //   41: putfield a : Z
    //   44: aload_2
    //   45: getfield b : Ljava/lang/Object;
    //   48: astore_3
    //   49: aload_2
    //   50: monitorexit
    //   51: aload_3
    //   52: ifnull -> 81
    //   55: aload_3
    //   56: checkcast android/os/CancellationSignal
    //   59: invokevirtual cancel : ()V
    //   62: goto -> 81
    //   65: astore_3
    //   66: aload_2
    //   67: monitorenter
    //   68: aload_2
    //   69: invokevirtual notifyAll : ()V
    //   72: aload_2
    //   73: monitorexit
    //   74: aload_3
    //   75: athrow
    //   76: astore_3
    //   77: aload_2
    //   78: monitorexit
    //   79: aload_3
    //   80: athrow
    //   81: aload_2
    //   82: monitorenter
    //   83: aload_2
    //   84: invokevirtual notifyAll : ()V
    //   87: aload_2
    //   88: monitorexit
    //   89: goto -> 102
    //   92: astore_3
    //   93: aload_2
    //   94: monitorexit
    //   95: aload_3
    //   96: athrow
    //   97: astore_3
    //   98: aload_2
    //   99: monitorexit
    //   100: aload_3
    //   101: athrow
    //   102: aload_0
    //   103: invokevirtual a0 : ()V
    //   106: return
    // Exception table:
    //   from	to	target	type
    //   27	36	97	finally
    //   39	51	97	finally
    //   55	62	65	finally
    //   68	74	76	finally
    //   77	79	76	finally
    //   83	89	92	finally
    //   93	95	92	finally
    //   98	100	97	finally
  }
  
  public final void a0() {
    this.a0 = false;
    b.l.a.e e1 = g();
    k k = this.s;
    if (k != null) {
      b.l.a.a a1 = new b.l.a.a(k);
      a1.f(this);
      a1.e();
    } 
    if (!a.a.a.a.a.Q() && e1 instanceof androidx.biometric.DeviceCredentialHandlerActivity && !e1.isFinishing())
      e1.finish(); 
  }
  
  public final void b0(int paramInt) {
    if (!a.a.a.a.a.Q()) {
      BiometricPrompt.b b1 = this.Y;
      Context context = this.c0;
      if (paramInt != 1) {
        StringBuilder stringBuilder;
        switch (paramInt) {
          default:
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown error code: ");
            stringBuilder.append(paramInt);
            Log.e("FingerprintHelperFrag", stringBuilder.toString());
            paramInt = n.default_error_msg;
            break;
          case 12:
            paramInt = n.fingerprint_error_hw_not_present;
            break;
          case 11:
            paramInt = n.fingerprint_error_no_fingerprints;
            break;
          case 10:
            paramInt = n.fingerprint_error_user_canceled;
            break;
        } 
      } else {
        paramInt = n.fingerprint_error_hw_not_available;
      } 
      context.getString(paramInt);
      if ((SendMoney.a)b1 == null)
        throw null; 
    } 
  }
  
  public void c0(Handler paramHandler) {
    this.Z = paramHandler;
    this.W = new b(paramHandler);
  }
  
  public class a extends b.i.g.a.b.a {
    public final e a;
    
    public a(e this$0) {}
    
    public final void a(int param1Int, CharSequence param1CharSequence) {
      this.a.W.a(3);
      if (!a.a.a.a.a.Q())
        this.a.X.execute(new a(this, param1Int, param1CharSequence)); 
    }
    
    public class a implements Runnable {
      public final int b;
      
      public final CharSequence c;
      
      public final e.a d;
      
      public a(e.a this$0, int param2Int, CharSequence param2CharSequence) {}
      
      public void run() {
        if ((SendMoney.a)this.d.a.Y != null)
          return; 
        throw null;
      }
    }
  }
  
  public class a implements Runnable {
    public final int b;
    
    public final CharSequence c;
    
    public final e.a d;
    
    public a(e this$0, int param1Int, CharSequence param1CharSequence) {}
    
    public void run() {
      if ((SendMoney.a)this.d.a.Y != null)
        return; 
      throw null;
    }
  }
  
  public static class b {
    public final Handler a;
    
    public b(Handler param1Handler) {
      this.a = param1Handler;
    }
    
    public void a(int param1Int) {
      this.a.obtainMessage(param1Int).sendToTarget();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */