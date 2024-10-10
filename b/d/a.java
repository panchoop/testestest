package b.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
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
public class a extends Fragment {
  public Context W;
  
  public Bundle X;
  
  public Executor Y;
  
  public DialogInterface.OnClickListener Z;
  
  public BiometricPrompt.b a0;
  
  public BiometricPrompt.d b0;
  
  public CharSequence c0;
  
  public boolean d0;
  
  public BiometricPrompt e0;
  
  public CancellationSignal f0;
  
  public boolean g0;
  
  public final Handler h0 = new Handler(Looper.getMainLooper());
  
  public final Executor i0 = new a(this);
  
  public final BiometricPrompt.AuthenticationCallback j0 = new b(this);
  
  public final DialogInterface.OnClickListener k0 = new c(this);
  
  public final DialogInterface.OnClickListener l0 = new d(this);
  
  public void A(Bundle paramBundle) {
    super.A(paramBundle);
    X(true);
  }
  
  public View B(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d0 : Z
    //   4: ifne -> 370
    //   7: aload_0
    //   8: getfield X : Landroid/os/Bundle;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnull -> 370
    //   16: aload_0
    //   17: aload_1
    //   18: ldc 'negative_text'
    //   20: invokevirtual getCharSequence : (Ljava/lang/String;)Ljava/lang/CharSequence;
    //   23: putfield c0 : Ljava/lang/CharSequence;
    //   26: new android/hardware/biometrics/BiometricPrompt$Builder
    //   29: dup
    //   30: aload_0
    //   31: invokevirtual k : ()Landroid/content/Context;
    //   34: invokespecial <init> : (Landroid/content/Context;)V
    //   37: astore #5
    //   39: aload #5
    //   41: aload_0
    //   42: getfield X : Landroid/os/Bundle;
    //   45: ldc 'title'
    //   47: invokevirtual getCharSequence : (Ljava/lang/String;)Ljava/lang/CharSequence;
    //   50: invokevirtual setTitle : (Ljava/lang/CharSequence;)Landroid/hardware/biometrics/BiometricPrompt$Builder;
    //   53: aload_0
    //   54: getfield X : Landroid/os/Bundle;
    //   57: ldc 'subtitle'
    //   59: invokevirtual getCharSequence : (Ljava/lang/String;)Ljava/lang/CharSequence;
    //   62: invokevirtual setSubtitle : (Ljava/lang/CharSequence;)Landroid/hardware/biometrics/BiometricPrompt$Builder;
    //   65: aload_0
    //   66: getfield X : Landroid/os/Bundle;
    //   69: ldc 'description'
    //   71: invokevirtual getCharSequence : (Ljava/lang/String;)Ljava/lang/CharSequence;
    //   74: invokevirtual setDescription : (Ljava/lang/CharSequence;)Landroid/hardware/biometrics/BiometricPrompt$Builder;
    //   77: pop
    //   78: aload_0
    //   79: getfield X : Landroid/os/Bundle;
    //   82: ldc 'allow_device_credential'
    //   84: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   87: istore #4
    //   89: iload #4
    //   91: ifeq -> 128
    //   94: getstatic android/os/Build$VERSION.SDK_INT : I
    //   97: bipush #28
    //   99: if_icmpgt -> 128
    //   102: aload_0
    //   103: getstatic b/d/n.confirm_device_credential_password : I
    //   106: invokevirtual t : (I)Ljava/lang/String;
    //   109: astore_1
    //   110: aload_0
    //   111: aload_1
    //   112: putfield c0 : Ljava/lang/CharSequence;
    //   115: aload_0
    //   116: getfield Y : Ljava/util/concurrent/Executor;
    //   119: astore_2
    //   120: aload_0
    //   121: getfield l0 : Landroid/content/DialogInterface$OnClickListener;
    //   124: astore_3
    //   125: goto -> 153
    //   128: aload_0
    //   129: getfield c0 : Ljava/lang/CharSequence;
    //   132: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   135: ifne -> 162
    //   138: aload_0
    //   139: getfield c0 : Ljava/lang/CharSequence;
    //   142: astore_1
    //   143: aload_0
    //   144: getfield Y : Ljava/util/concurrent/Executor;
    //   147: astore_2
    //   148: aload_0
    //   149: getfield k0 : Landroid/content/DialogInterface$OnClickListener;
    //   152: astore_3
    //   153: aload #5
    //   155: aload_1
    //   156: aload_2
    //   157: aload_3
    //   158: invokevirtual setNegativeButton : (Ljava/lang/CharSequence;Ljava/util/concurrent/Executor;Landroid/content/DialogInterface$OnClickListener;)Landroid/hardware/biometrics/BiometricPrompt$Builder;
    //   161: pop
    //   162: getstatic android/os/Build$VERSION.SDK_INT : I
    //   165: bipush #29
    //   167: if_icmplt -> 194
    //   170: aload #5
    //   172: aload_0
    //   173: getfield X : Landroid/os/Bundle;
    //   176: ldc 'require_confirmation'
    //   178: iconst_1
    //   179: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   182: invokevirtual setConfirmationRequired : (Z)Landroid/hardware/biometrics/BiometricPrompt$Builder;
    //   185: pop
    //   186: aload #5
    //   188: iload #4
    //   190: invokevirtual setDeviceCredentialAllowed : (Z)Landroid/hardware/biometrics/BiometricPrompt$Builder;
    //   193: pop
    //   194: iload #4
    //   196: ifeq -> 223
    //   199: aload_0
    //   200: iconst_0
    //   201: putfield g0 : Z
    //   204: aload_0
    //   205: getfield h0 : Landroid/os/Handler;
    //   208: new b/d/a$e
    //   211: dup
    //   212: aload_0
    //   213: invokespecial <init> : (Lb/d/a;)V
    //   216: ldc2_w 250
    //   219: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   222: pop
    //   223: aload_0
    //   224: aload #5
    //   226: invokevirtual build : ()Landroid/hardware/biometrics/BiometricPrompt;
    //   229: putfield e0 : Landroid/hardware/biometrics/BiometricPrompt;
    //   232: new android/os/CancellationSignal
    //   235: dup
    //   236: invokespecial <init> : ()V
    //   239: astore_2
    //   240: aload_0
    //   241: aload_2
    //   242: putfield f0 : Landroid/os/CancellationSignal;
    //   245: aload_0
    //   246: getfield b0 : Landroidx/biometric/BiometricPrompt$d;
    //   249: astore_1
    //   250: aload_1
    //   251: ifnonnull -> 273
    //   254: aload_0
    //   255: getfield e0 : Landroid/hardware/biometrics/BiometricPrompt;
    //   258: aload_2
    //   259: aload_0
    //   260: getfield i0 : Ljava/util/concurrent/Executor;
    //   263: aload_0
    //   264: getfield j0 : Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;
    //   267: invokevirtual authenticate : (Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;)V
    //   270: goto -> 370
    //   273: aload_0
    //   274: getfield e0 : Landroid/hardware/biometrics/BiometricPrompt;
    //   277: astore_2
    //   278: aload_1
    //   279: ifnonnull -> 285
    //   282: goto -> 351
    //   285: aload_1
    //   286: getfield b : Ljavax/crypto/Cipher;
    //   289: ifnull -> 307
    //   292: new android/hardware/biometrics/BiometricPrompt$CryptoObject
    //   295: dup
    //   296: aload_1
    //   297: getfield b : Ljavax/crypto/Cipher;
    //   300: invokespecial <init> : (Ljavax/crypto/Cipher;)V
    //   303: astore_1
    //   304: goto -> 353
    //   307: aload_1
    //   308: getfield a : Ljava/security/Signature;
    //   311: ifnull -> 329
    //   314: new android/hardware/biometrics/BiometricPrompt$CryptoObject
    //   317: dup
    //   318: aload_1
    //   319: getfield a : Ljava/security/Signature;
    //   322: invokespecial <init> : (Ljava/security/Signature;)V
    //   325: astore_1
    //   326: goto -> 353
    //   329: aload_1
    //   330: getfield c : Ljavax/crypto/Mac;
    //   333: ifnull -> 351
    //   336: new android/hardware/biometrics/BiometricPrompt$CryptoObject
    //   339: dup
    //   340: aload_1
    //   341: getfield c : Ljavax/crypto/Mac;
    //   344: invokespecial <init> : (Ljavax/crypto/Mac;)V
    //   347: astore_1
    //   348: goto -> 353
    //   351: aconst_null
    //   352: astore_1
    //   353: aload_2
    //   354: aload_1
    //   355: aload_0
    //   356: getfield f0 : Landroid/os/CancellationSignal;
    //   359: aload_0
    //   360: getfield i0 : Ljava/util/concurrent/Executor;
    //   363: aload_0
    //   364: getfield j0 : Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;
    //   367: invokevirtual authenticate : (Landroid/hardware/biometrics/BiometricPrompt$CryptoObject;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Landroid/hardware/biometrics/BiometricPrompt$AuthenticationCallback;)V
    //   370: aload_0
    //   371: iconst_1
    //   372: putfield d0 : Z
    //   375: aconst_null
    //   376: areturn
  }
  
  public void Z() {
    if (Build.VERSION.SDK_INT >= 29) {
      Bundle bundle = this.X;
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bundle != null) {
        bool1 = bool2;
        if (bundle.getBoolean("allow_device_credential", false))
          bool1 = true; 
      } 
      if (bool1 && !this.g0) {
        Log.w("BiometricFragment", "Ignoring fast cancel signal");
        return;
      } 
    } 
    CancellationSignal cancellationSignal = this.f0;
    if (cancellationSignal != null)
      cancellationSignal.cancel(); 
    a0();
  }
  
  public void a0() {
    this.d0 = false;
    b.l.a.e e = g();
    k k = this.s;
    if (k != null) {
      b.l.a.a a1 = new b.l.a.a(k);
      a1.f(this);
      a1.e();
    } 
    if (e instanceof androidx.biometric.DeviceCredentialHandlerActivity && !e.isFinishing())
      e.finish(); 
  }
  
  public void b0(Executor paramExecutor, DialogInterface.OnClickListener paramOnClickListener, BiometricPrompt.b paramb) {
    this.Y = paramExecutor;
    this.Z = paramOnClickListener;
    this.a0 = paramb;
  }
  
  public void z(Context paramContext) {
    super.z(paramContext);
    this.W = paramContext;
  }
  
  public class a implements Executor {
    public final a a;
    
    public a(a this$0) {}
    
    public void execute(Runnable param1Runnable) {
      this.a.h0.post(param1Runnable);
    }
  }
  
  public class b extends BiometricPrompt.AuthenticationCallback {
    public final a a;
    
    public b(a this$0) {}
    
    public void onAuthenticationError(int param1Int, CharSequence param1CharSequence) {
      if (!a.a.a.a.a.Q()) {
        this.a.Y.execute(new a(this, param1CharSequence, param1Int));
        this.a.a0();
      } 
    }
    
    public void onAuthenticationFailed() {
      this.a.Y.execute(new c(this));
    }
    
    public void onAuthenticationHelp(int param1Int, CharSequence param1CharSequence) {}
    
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult param1AuthenticationResult) {
      BiometricPrompt.AuthenticationResult authenticationResult = null;
      BiometricPrompt.c c = new BiometricPrompt.c();
      if (param1AuthenticationResult != null) {
        BiometricPrompt.d d;
        BiometricPrompt.CryptoObject cryptoObject = param1AuthenticationResult.getCryptoObject();
        if (cryptoObject == null) {
          param1AuthenticationResult = authenticationResult;
        } else if (cryptoObject.getCipher() != null) {
          d = new BiometricPrompt.d(cryptoObject.getCipher());
        } else if (cryptoObject.getSignature() != null) {
          d = new BiometricPrompt.d(cryptoObject.getSignature());
        } else {
          param1AuthenticationResult = authenticationResult;
          if (cryptoObject.getMac() != null)
            d = new BiometricPrompt.d(cryptoObject.getMac()); 
        } 
        this(d);
      } else {
        this(null);
      } 
      this.a.Y.execute(new b(this, c));
      this.a.a0();
    }
    
    public class a implements Runnable {
      public final CharSequence b;
      
      public final int c;
      
      public final a.b d;
      
      public a(a.b this$0, CharSequence param2CharSequence, int param2Int) {}
      
      public void run() {
        if (this.b == null)
          this.d.a.W.getString(n.default_error_msg); 
        if ((SendMoney.a)this.d.a.a0 != null)
          return; 
        throw null;
      }
    }
    
    public class b implements Runnable {
      public final BiometricPrompt.c b;
      
      public final a.b c;
      
      public b(a.b this$0, BiometricPrompt.c param2c) {}
      
      public void run() {
        this.c.a.a0.a(this.b);
      }
    }
    
    public class c implements Runnable {
      public final a.b b;
      
      public c(a.b this$0) {}
      
      public void run() {
        if ((SendMoney.a)this.b.a.a0 != null)
          return; 
        throw null;
      }
    }
  }
  
  public class a implements Runnable {
    public final CharSequence b;
    
    public final int c;
    
    public final a.b d;
    
    public a(a this$0, CharSequence param1CharSequence, int param1Int) {}
    
    public void run() {
      if (this.b == null)
        this.d.a.W.getString(n.default_error_msg); 
      if ((SendMoney.a)this.d.a.a0 != null)
        return; 
      throw null;
    }
  }
  
  public class b implements Runnable {
    public final BiometricPrompt.c b;
    
    public final a.b c;
    
    public b(a this$0, BiometricPrompt.c param1c) {}
    
    public void run() {
      this.c.a.a0.a(this.b);
    }
  }
  
  public class c implements Runnable {
    public final a.b b;
    
    public c(a this$0) {}
    
    public void run() {
      if ((SendMoney.a)this.b.a.a0 != null)
        return; 
      throw null;
    }
  }
  
  public class c implements DialogInterface.OnClickListener {
    public final a b;
    
    public c(a this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      this.b.Z.onClick(param1DialogInterface, param1Int);
    }
  }
  
  public class d implements DialogInterface.OnClickListener {
    public final a b;
    
    public d(a this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      if (param1Int == -2)
        a.a.a.a.a.T("BiometricFragment", this.b.g(), this.b.X, null); 
    }
  }
  
  public class e implements Runnable {
    public final a b;
    
    public e(a this$0) {}
    
    public void run() {
      this.b.g0 = true;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */