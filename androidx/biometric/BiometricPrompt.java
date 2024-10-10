package androidx.biometric;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import b.l.a.j;
import b.n.f;
import b.n.n;
import com.app.damnvulnerablebank.SendMoney;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@SuppressLint({"SyntheticAccessor"})
public class BiometricPrompt {
  public b.l.a.e a;
  
  public final Executor b;
  
  public final b c;
  
  public b.d.c d;
  
  public b.d.e e;
  
  public b.d.a f;
  
  public boolean g;
  
  public boolean h;
  
  public final DialogInterface.OnClickListener i = new a(this);
  
  public final f j;
  
  @SuppressLint({"LambdaLast"})
  public BiometricPrompt(b.l.a.e parame, Executor paramExecutor, b paramb) {
    f f1 = new f(this) {
        public final BiometricPrompt a;
        
        @n(b.n.d.a.ON_PAUSE)
        public void onPause() {
          // Byte code:
          //   0: aload_0
          //   1: getfield a : Landroidx/biometric/BiometricPrompt;
          //   4: astore_3
          //   5: aload_3
          //   6: invokevirtual d : ()Lb/l/a/e;
          //   9: astore #4
          //   11: iconst_0
          //   12: istore_2
          //   13: aload #4
          //   15: ifnull -> 33
          //   18: aload_3
          //   19: invokevirtual d : ()Lb/l/a/e;
          //   22: invokevirtual isChangingConfigurations : ()Z
          //   25: ifeq -> 33
          //   28: iconst_1
          //   29: istore_1
          //   30: goto -> 35
          //   33: iconst_0
          //   34: istore_1
          //   35: iload_1
          //   36: ifeq -> 40
          //   39: return
          //   40: invokestatic c : ()Z
          //   43: ifeq -> 117
          //   46: aload_0
          //   47: getfield a : Landroidx/biometric/BiometricPrompt;
          //   50: getfield f : Lb/d/a;
          //   53: astore_3
          //   54: aload_3
          //   55: ifnull -> 117
          //   58: aload_3
          //   59: getfield X : Landroid/os/Bundle;
          //   62: astore_3
          //   63: iload_2
          //   64: istore_1
          //   65: aload_3
          //   66: ifnull -> 83
          //   69: iload_2
          //   70: istore_1
          //   71: aload_3
          //   72: ldc 'allow_device_credential'
          //   74: iconst_0
          //   75: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
          //   78: ifeq -> 83
          //   81: iconst_1
          //   82: istore_1
          //   83: aload_0
          //   84: getfield a : Landroidx/biometric/BiometricPrompt;
          //   87: astore_3
          //   88: iload_1
          //   89: ifeq -> 107
          //   92: aload_3
          //   93: getfield g : Z
          //   96: ifne -> 107
          //   99: aload_3
          //   100: iconst_1
          //   101: putfield g : Z
          //   104: goto -> 155
          //   107: aload_3
          //   108: getfield f : Lb/d/a;
          //   111: invokevirtual Z : ()V
          //   114: goto -> 155
          //   117: aload_0
          //   118: getfield a : Landroidx/biometric/BiometricPrompt;
          //   121: astore #4
          //   123: aload #4
          //   125: getfield d : Lb/d/c;
          //   128: astore_3
          //   129: aload_3
          //   130: ifnull -> 155
          //   133: aload #4
          //   135: getfield e : Lb/d/e;
          //   138: astore #4
          //   140: aload #4
          //   142: ifnull -> 155
          //   145: aload_3
          //   146: invokevirtual c0 : ()V
          //   149: aload #4
          //   151: iconst_0
          //   152: invokevirtual Z : (I)V
          //   155: aload_0
          //   156: getfield a : Landroidx/biometric/BiometricPrompt;
          //   159: ifnull -> 175
          //   162: getstatic b/d/b.j : Lb/d/b;
          //   165: astore_3
          //   166: aload_3
          //   167: ifnull -> 174
          //   170: aload_3
          //   171: invokevirtual b : ()V
          //   174: return
          //   175: aconst_null
          //   176: athrow
        }
        
        @n(b.n.d.a.ON_RESUME)
        public void onResume() {
          // Byte code:
          //   0: aload_0
          //   1: getfield a : Landroidx/biometric/BiometricPrompt;
          //   4: astore_3
          //   5: invokestatic c : ()Z
          //   8: ifeq -> 30
          //   11: aload_0
          //   12: getfield a : Landroidx/biometric/BiometricPrompt;
          //   15: invokestatic a : (Landroidx/biometric/BiometricPrompt;)Lb/l/a/j;
          //   18: ldc 'BiometricFragment'
          //   20: invokevirtual b : (Ljava/lang/String;)Landroidx/fragment/app/Fragment;
          //   23: checkcast b/d/a
          //   26: astore_2
          //   27: goto -> 32
          //   30: aconst_null
          //   31: astore_2
          //   32: aload_3
          //   33: aload_2
          //   34: putfield f : Lb/d/a;
          //   37: invokestatic c : ()Z
          //   40: ifeq -> 76
          //   43: aload_0
          //   44: getfield a : Landroidx/biometric/BiometricPrompt;
          //   47: astore_2
          //   48: aload_2
          //   49: getfield f : Lb/d/a;
          //   52: astore_3
          //   53: aload_3
          //   54: ifnull -> 76
          //   57: aload_3
          //   58: aload_2
          //   59: getfield b : Ljava/util/concurrent/Executor;
          //   62: aload_2
          //   63: getfield i : Landroid/content/DialogInterface$OnClickListener;
          //   66: aload_2
          //   67: getfield c : Landroidx/biometric/BiometricPrompt$b;
          //   70: invokevirtual b0 : (Ljava/util/concurrent/Executor;Landroid/content/DialogInterface$OnClickListener;Landroidx/biometric/BiometricPrompt$b;)V
          //   73: goto -> 198
          //   76: aload_0
          //   77: getfield a : Landroidx/biometric/BiometricPrompt;
          //   80: astore_2
          //   81: aload_2
          //   82: aload_2
          //   83: invokestatic a : (Landroidx/biometric/BiometricPrompt;)Lb/l/a/j;
          //   86: ldc 'FingerprintDialogFragment'
          //   88: invokevirtual b : (Ljava/lang/String;)Landroidx/fragment/app/Fragment;
          //   91: checkcast b/d/c
          //   94: putfield d : Lb/d/c;
          //   97: aload_0
          //   98: getfield a : Landroidx/biometric/BiometricPrompt;
          //   101: astore_2
          //   102: aload_2
          //   103: aload_2
          //   104: invokestatic a : (Landroidx/biometric/BiometricPrompt;)Lb/l/a/j;
          //   107: ldc 'FingerprintHelperFragment'
          //   109: invokevirtual b : (Ljava/lang/String;)Landroidx/fragment/app/Fragment;
          //   112: checkcast b/d/e
          //   115: putfield e : Lb/d/e;
          //   118: aload_0
          //   119: getfield a : Landroidx/biometric/BiometricPrompt;
          //   122: astore_2
          //   123: aload_2
          //   124: getfield d : Lb/d/c;
          //   127: astore_3
          //   128: aload_3
          //   129: ifnull -> 140
          //   132: aload_3
          //   133: aload_2
          //   134: getfield i : Landroid/content/DialogInterface$OnClickListener;
          //   137: putfield q0 : Landroid/content/DialogInterface$OnClickListener;
          //   140: aload_0
          //   141: getfield a : Landroidx/biometric/BiometricPrompt;
          //   144: astore #4
          //   146: aload #4
          //   148: getfield e : Lb/d/e;
          //   151: astore_2
          //   152: aload_2
          //   153: ifnull -> 198
          //   156: aload #4
          //   158: getfield b : Ljava/util/concurrent/Executor;
          //   161: astore #5
          //   163: aload #4
          //   165: getfield c : Landroidx/biometric/BiometricPrompt$b;
          //   168: astore_3
          //   169: aload_2
          //   170: aload #5
          //   172: putfield X : Ljava/util/concurrent/Executor;
          //   175: aload_2
          //   176: aload_3
          //   177: putfield Y : Landroidx/biometric/BiometricPrompt$b;
          //   180: aload #4
          //   182: getfield d : Lb/d/c;
          //   185: astore_3
          //   186: aload_3
          //   187: ifnull -> 198
          //   190: aload_2
          //   191: aload_3
          //   192: getfield h0 : Lb/d/c$c;
          //   195: invokevirtual c0 : (Landroid/os/Handler;)V
          //   198: aload_0
          //   199: getfield a : Landroidx/biometric/BiometricPrompt;
          //   202: astore_3
          //   203: aload_3
          //   204: getfield h : Z
          //   207: ifeq -> 213
          //   210: goto -> 296
          //   213: getstatic b/d/b.j : Lb/d/b;
          //   216: astore_2
          //   217: aload_2
          //   218: ifnull -> 296
          //   221: aload_2
          //   222: getfield h : I
          //   225: istore_1
          //   226: iload_1
          //   227: iconst_1
          //   228: if_icmpeq -> 272
          //   231: iload_1
          //   232: iconst_2
          //   233: if_icmpeq -> 239
          //   236: goto -> 296
          //   239: aload_3
          //   240: invokevirtual d : ()Lb/l/a/e;
          //   243: ifnull -> 257
          //   246: aload_3
          //   247: invokevirtual d : ()Lb/l/a/e;
          //   250: getstatic b/d/n.generic_error_user_canceled : I
          //   253: invokevirtual getString : (I)Ljava/lang/String;
          //   256: pop
          //   257: aload_3
          //   258: getfield c : Landroidx/biometric/BiometricPrompt$b;
          //   261: checkcast com/app/damnvulnerablebank/SendMoney$a
          //   264: ifnull -> 270
          //   267: goto -> 287
          //   270: aconst_null
          //   271: athrow
          //   272: aload_3
          //   273: getfield c : Landroidx/biometric/BiometricPrompt$b;
          //   276: new androidx/biometric/BiometricPrompt$c
          //   279: dup
          //   280: aconst_null
          //   281: invokespecial <init> : (Landroidx/biometric/BiometricPrompt$d;)V
          //   284: invokevirtual a : (Landroidx/biometric/BiometricPrompt$c;)V
          //   287: aload_2
          //   288: iconst_0
          //   289: putfield i : I
          //   292: aload_2
          //   293: invokevirtual b : ()V
          //   296: aload_0
          //   297: getfield a : Landroidx/biometric/BiometricPrompt;
          //   300: iconst_0
          //   301: invokevirtual e : (Z)V
          //   304: return
        }
      };
    this.j = f1;
    if (paramExecutor != null) {
      if (paramb != null) {
        this.a = parame;
        this.c = paramb;
        this.b = paramExecutor;
        ((ComponentActivity)parame).c.a(f1);
        return;
      } 
      throw new IllegalArgumentException("AuthenticationCallback must not be null");
    } 
    throw new IllegalArgumentException("Executor must not be null");
  }
  
  public static j a(BiometricPrompt paramBiometricPrompt) {
    b.l.a.e e1 = paramBiometricPrompt.a;
    if (e1 != null)
      return e1.m(); 
    throw null;
  }
  
  public static boolean c() {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 28) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void b(e parame) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getfield a : Landroid/os/Bundle;
    //   5: ldc 'handling_device_credential_result'
    //   7: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   10: putfield h : Z
    //   13: aload_0
    //   14: invokevirtual d : ()Lb/l/a/e;
    //   17: astore #5
    //   19: aload_1
    //   20: getfield a : Landroid/os/Bundle;
    //   23: ldc 'allow_device_credential'
    //   25: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   28: ifeq -> 265
    //   31: getstatic android/os/Build$VERSION.SDK_INT : I
    //   34: bipush #28
    //   36: if_icmpgt -> 265
    //   39: aload_0
    //   40: getfield h : Z
    //   43: ifne -> 123
    //   46: aload_0
    //   47: invokevirtual d : ()Lb/l/a/e;
    //   50: astore_3
    //   51: aload_3
    //   52: ifnull -> 112
    //   55: aload_3
    //   56: invokevirtual isFinishing : ()Z
    //   59: ifeq -> 65
    //   62: goto -> 112
    //   65: aload_0
    //   66: iconst_1
    //   67: invokevirtual e : (Z)V
    //   70: aload_1
    //   71: getfield a : Landroid/os/Bundle;
    //   74: astore #4
    //   76: aload #4
    //   78: ldc 'handling_device_credential_result'
    //   80: iconst_1
    //   81: invokevirtual putBoolean : (Ljava/lang/String;Z)V
    //   84: new android/content/Intent
    //   87: dup
    //   88: aload_3
    //   89: ldc androidx/biometric/DeviceCredentialHandlerActivity
    //   91: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   94: astore_1
    //   95: aload_1
    //   96: ldc 'prompt_info_bundle'
    //   98: aload #4
    //   100: invokevirtual putExtra : (Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    //   103: pop
    //   104: aload_3
    //   105: aload_1
    //   106: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   109: goto -> 763
    //   112: ldc 'BiometricPromptCompat'
    //   114: ldc 'Failed to start handler activity. Parent activity was null or finishing.'
    //   116: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   119: pop
    //   120: goto -> 763
    //   123: aload #5
    //   125: ifnonnull -> 134
    //   128: ldc 'Failed to authenticate with device credential. Activity was null.'
    //   130: astore_1
    //   131: goto -> 145
    //   134: getstatic b/d/b.j : Lb/d/b;
    //   137: astore_3
    //   138: aload_3
    //   139: ifnonnull -> 155
    //   142: ldc 'Failed to authenticate with device credential. Bridge was null.'
    //   144: astore_1
    //   145: ldc 'BiometricPromptCompat'
    //   147: aload_1
    //   148: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   151: pop
    //   152: goto -> 763
    //   155: aload_3
    //   156: getfield g : Z
    //   159: ifne -> 265
    //   162: getstatic android/os/Build$VERSION.SDK_INT : I
    //   165: bipush #29
    //   167: if_icmplt -> 187
    //   170: aload #5
    //   172: ldc android/hardware/biometrics/BiometricManager
    //   174: invokevirtual getSystemService : (Ljava/lang/Class;)Ljava/lang/Object;
    //   177: checkcast android/hardware/biometrics/BiometricManager
    //   180: astore_3
    //   181: aconst_null
    //   182: astore #4
    //   184: goto -> 200
    //   187: new b/i/g/a/b
    //   190: dup
    //   191: aload #5
    //   193: invokespecial <init> : (Landroid/content/Context;)V
    //   196: astore #4
    //   198: aconst_null
    //   199: astore_3
    //   200: getstatic android/os/Build$VERSION.SDK_INT : I
    //   203: bipush #29
    //   205: if_icmplt -> 216
    //   208: aload_3
    //   209: invokevirtual canAuthenticate : ()I
    //   212: istore_2
    //   213: goto -> 246
    //   216: aload #4
    //   218: invokevirtual c : ()Z
    //   221: ifne -> 230
    //   224: bipush #12
    //   226: istore_2
    //   227: goto -> 246
    //   230: aload #4
    //   232: invokevirtual b : ()Z
    //   235: ifne -> 244
    //   238: bipush #11
    //   240: istore_2
    //   241: goto -> 246
    //   244: iconst_0
    //   245: istore_2
    //   246: iload_2
    //   247: ifeq -> 265
    //   250: ldc 'BiometricPromptCompat'
    //   252: aload #5
    //   254: aload_1
    //   255: getfield a : Landroid/os/Bundle;
    //   258: aconst_null
    //   259: invokestatic T : (Ljava/lang/String;Lb/l/a/e;Landroid/os/Bundle;Ljava/lang/Runnable;)V
    //   262: goto -> 763
    //   265: aload_0
    //   266: getfield a : Lb/l/a/e;
    //   269: astore_3
    //   270: aload_3
    //   271: ifnull -> 764
    //   274: aload_3
    //   275: invokevirtual m : ()Lb/l/a/j;
    //   278: astore #4
    //   280: aload #4
    //   282: invokevirtual c : ()Z
    //   285: ifeq -> 299
    //   288: ldc 'BiometricPromptCompat'
    //   290: ldc 'Not launching prompt. authenticate() called after onSaveInstanceState()'
    //   292: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   295: pop
    //   296: goto -> 763
    //   299: aload_1
    //   300: getfield a : Landroid/os/Bundle;
    //   303: astore_1
    //   304: aload_0
    //   305: iconst_0
    //   306: putfield g : Z
    //   309: invokestatic c : ()Z
    //   312: ifeq -> 446
    //   315: aload #4
    //   317: ldc 'BiometricFragment'
    //   319: invokevirtual b : (Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    //   322: checkcast b/d/a
    //   325: astore_3
    //   326: aload_3
    //   327: ifnull -> 338
    //   330: aload_0
    //   331: aload_3
    //   332: putfield f : Lb/d/a;
    //   335: goto -> 349
    //   338: aload_0
    //   339: new b/d/a
    //   342: dup
    //   343: invokespecial <init> : ()V
    //   346: putfield f : Lb/d/a;
    //   349: aload_0
    //   350: getfield f : Lb/d/a;
    //   353: aload_0
    //   354: getfield b : Ljava/util/concurrent/Executor;
    //   357: aload_0
    //   358: getfield i : Landroid/content/DialogInterface$OnClickListener;
    //   361: aload_0
    //   362: getfield c : Landroidx/biometric/BiometricPrompt$b;
    //   365: invokevirtual b0 : (Ljava/util/concurrent/Executor;Landroid/content/DialogInterface$OnClickListener;Landroidx/biometric/BiometricPrompt$b;)V
    //   368: aload_0
    //   369: getfield f : Lb/d/a;
    //   372: astore #5
    //   374: aload #5
    //   376: aconst_null
    //   377: putfield b0 : Landroidx/biometric/BiometricPrompt$d;
    //   380: aload #5
    //   382: aload_1
    //   383: putfield X : Landroid/os/Bundle;
    //   386: aload_3
    //   387: ifnonnull -> 417
    //   390: new b/l/a/a
    //   393: dup
    //   394: aload #4
    //   396: checkcast b/l/a/k
    //   399: invokespecial <init> : (Lb/l/a/k;)V
    //   402: astore_1
    //   403: aload_1
    //   404: aload_0
    //   405: getfield f : Lb/d/a;
    //   408: ldc 'BiometricFragment'
    //   410: invokevirtual b : (Landroidx/fragment/app/Fragment;Ljava/lang/String;)Lb/l/a/r;
    //   413: pop
    //   414: goto -> 743
    //   417: aload #5
    //   419: getfield A : Z
    //   422: ifeq -> 748
    //   425: new b/l/a/a
    //   428: dup
    //   429: aload #4
    //   431: checkcast b/l/a/k
    //   434: invokespecial <init> : (Lb/l/a/k;)V
    //   437: astore_1
    //   438: aload_0
    //   439: getfield f : Lb/d/a;
    //   442: astore_3
    //   443: goto -> 737
    //   446: aload #4
    //   448: ldc 'FingerprintDialogFragment'
    //   450: invokevirtual b : (Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    //   453: checkcast b/d/c
    //   456: astore_3
    //   457: aload_3
    //   458: ifnull -> 469
    //   461: aload_0
    //   462: aload_3
    //   463: putfield d : Lb/d/c;
    //   466: goto -> 480
    //   469: aload_0
    //   470: new b/d/c
    //   473: dup
    //   474: invokespecial <init> : ()V
    //   477: putfield d : Lb/d/c;
    //   480: aload_0
    //   481: getfield d : Lb/d/c;
    //   484: astore #6
    //   486: aload #6
    //   488: aload_0
    //   489: getfield i : Landroid/content/DialogInterface$OnClickListener;
    //   492: putfield q0 : Landroid/content/DialogInterface$OnClickListener;
    //   495: aload #6
    //   497: aload_1
    //   498: putfield i0 : Landroid/os/Bundle;
    //   501: aload #5
    //   503: ifnull -> 571
    //   506: aload #5
    //   508: getstatic android/os/Build.MODEL : Ljava/lang/String;
    //   511: invokestatic y0 : (Landroid/content/Context;Ljava/lang/String;)Z
    //   514: ifne -> 571
    //   517: aload_0
    //   518: getfield d : Lb/d/c;
    //   521: astore_1
    //   522: aload_3
    //   523: ifnonnull -> 537
    //   526: aload_1
    //   527: aload #4
    //   529: ldc 'FingerprintDialogFragment'
    //   531: invokevirtual b0 : (Lb/l/a/j;Ljava/lang/String;)V
    //   534: goto -> 571
    //   537: aload_1
    //   538: getfield A : Z
    //   541: ifeq -> 571
    //   544: new b/l/a/a
    //   547: dup
    //   548: aload #4
    //   550: checkcast b/l/a/k
    //   553: invokespecial <init> : (Lb/l/a/k;)V
    //   556: astore_1
    //   557: aload_1
    //   558: aload_0
    //   559: getfield d : Lb/d/c;
    //   562: invokevirtual d : (Landroidx/fragment/app/Fragment;)Lb/l/a/r;
    //   565: pop
    //   566: aload_1
    //   567: invokevirtual e : ()I
    //   570: pop
    //   571: aload #4
    //   573: ldc_w 'FingerprintHelperFragment'
    //   576: invokevirtual b : (Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    //   579: checkcast b/d/e
    //   582: astore_3
    //   583: aload_3
    //   584: ifnull -> 595
    //   587: aload_0
    //   588: aload_3
    //   589: putfield e : Lb/d/e;
    //   592: goto -> 606
    //   595: aload_0
    //   596: new b/d/e
    //   599: dup
    //   600: invokespecial <init> : ()V
    //   603: putfield e : Lb/d/e;
    //   606: aload_0
    //   607: getfield e : Lb/d/e;
    //   610: astore_1
    //   611: aload_0
    //   612: getfield b : Ljava/util/concurrent/Executor;
    //   615: astore #5
    //   617: aload_0
    //   618: getfield c : Landroidx/biometric/BiometricPrompt$b;
    //   621: astore #6
    //   623: aload_1
    //   624: aload #5
    //   626: putfield X : Ljava/util/concurrent/Executor;
    //   629: aload_1
    //   630: aload #6
    //   632: putfield Y : Landroidx/biometric/BiometricPrompt$b;
    //   635: aload_0
    //   636: getfield d : Lb/d/c;
    //   639: getfield h0 : Lb/d/c$c;
    //   642: astore #5
    //   644: aload_1
    //   645: aload #5
    //   647: invokevirtual c0 : (Landroid/os/Handler;)V
    //   650: aload_0
    //   651: getfield e : Lb/d/e;
    //   654: aconst_null
    //   655: putfield b0 : Landroidx/biometric/BiometricPrompt$d;
    //   658: aload #5
    //   660: aload #5
    //   662: bipush #6
    //   664: invokevirtual obtainMessage : (I)Landroid/os/Message;
    //   667: ldc2_w 500
    //   670: invokevirtual sendMessageDelayed : (Landroid/os/Message;J)Z
    //   673: pop
    //   674: aload_3
    //   675: ifnonnull -> 706
    //   678: new b/l/a/a
    //   681: dup
    //   682: aload #4
    //   684: checkcast b/l/a/k
    //   687: invokespecial <init> : (Lb/l/a/k;)V
    //   690: astore_1
    //   691: aload_1
    //   692: aload_0
    //   693: getfield e : Lb/d/e;
    //   696: ldc_w 'FingerprintHelperFragment'
    //   699: invokevirtual b : (Landroidx/fragment/app/Fragment;Ljava/lang/String;)Lb/l/a/r;
    //   702: pop
    //   703: goto -> 743
    //   706: aload_0
    //   707: getfield e : Lb/d/e;
    //   710: getfield A : Z
    //   713: ifeq -> 748
    //   716: new b/l/a/a
    //   719: dup
    //   720: aload #4
    //   722: checkcast b/l/a/k
    //   725: invokespecial <init> : (Lb/l/a/k;)V
    //   728: astore_1
    //   729: aload_0
    //   730: getfield e : Lb/d/e;
    //   733: astore_3
    //   734: goto -> 443
    //   737: aload_1
    //   738: aload_3
    //   739: invokevirtual d : (Landroidx/fragment/app/Fragment;)Lb/l/a/r;
    //   742: pop
    //   743: aload_1
    //   744: invokevirtual e : ()I
    //   747: pop
    //   748: aload #4
    //   750: checkcast b/l/a/k
    //   753: astore_1
    //   754: aload_1
    //   755: invokevirtual P : ()Z
    //   758: pop
    //   759: aload_1
    //   760: invokevirtual U : ()V
    //   763: return
    //   764: aconst_null
    //   765: athrow
  }
  
  public final b.l.a.e d() {
    b.l.a.e e1 = this.a;
    if (e1 != null)
      return e1; 
    throw null;
  }
  
  public final void e(boolean paramBoolean) {
    // Byte code:
    //   0: getstatic android/os/Build$VERSION.SDK_INT : I
    //   3: bipush #29
    //   5: if_icmplt -> 9
    //   8: return
    //   9: invokestatic a : ()Lb/d/b;
    //   12: astore_2
    //   13: aload_0
    //   14: getfield h : Z
    //   17: ifeq -> 77
    //   20: invokestatic c : ()Z
    //   23: ifeq -> 43
    //   26: aload_0
    //   27: getfield f : Lb/d/a;
    //   30: astore_3
    //   31: aload_3
    //   32: ifnull -> 43
    //   35: aload_2
    //   36: aload_3
    //   37: putfield b : Lb/d/a;
    //   40: goto -> 119
    //   43: aload_0
    //   44: getfield d : Lb/d/c;
    //   47: astore #4
    //   49: aload #4
    //   51: ifnull -> 119
    //   54: aload_0
    //   55: getfield e : Lb/d/e;
    //   58: astore_3
    //   59: aload_3
    //   60: ifnull -> 119
    //   63: aload_2
    //   64: aload #4
    //   66: putfield c : Lb/d/c;
    //   69: aload_2
    //   70: aload_3
    //   71: putfield d : Lb/d/e;
    //   74: goto -> 119
    //   77: aload_0
    //   78: invokevirtual d : ()Lb/l/a/e;
    //   81: astore_3
    //   82: aload_3
    //   83: ifnull -> 119
    //   86: aload_2
    //   87: aload_3
    //   88: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   91: aload_3
    //   92: invokevirtual getComponentName : ()Landroid/content/ComponentName;
    //   95: iconst_0
    //   96: invokevirtual getActivityInfo : (Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    //   99: invokevirtual getThemeResource : ()I
    //   102: putfield a : I
    //   105: goto -> 119
    //   108: astore_3
    //   109: ldc 'BiometricPromptCompat'
    //   111: ldc_w 'Failed to register client theme to bridge'
    //   114: aload_3
    //   115: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   118: pop
    //   119: aload_0
    //   120: getfield b : Ljava/util/concurrent/Executor;
    //   123: astore #4
    //   125: aload_0
    //   126: getfield i : Landroid/content/DialogInterface$OnClickListener;
    //   129: astore #5
    //   131: aload_0
    //   132: getfield c : Landroidx/biometric/BiometricPrompt$b;
    //   135: astore_3
    //   136: aload_2
    //   137: aload #4
    //   139: putfield e : Ljava/util/concurrent/Executor;
    //   142: aload_2
    //   143: aload_3
    //   144: putfield f : Landroidx/biometric/BiometricPrompt$b;
    //   147: aload_2
    //   148: getfield b : Lb/d/a;
    //   151: astore #6
    //   153: aload #6
    //   155: ifnull -> 189
    //   158: getstatic android/os/Build$VERSION.SDK_INT : I
    //   161: bipush #28
    //   163: if_icmplt -> 189
    //   166: aload #6
    //   168: aload #4
    //   170: putfield Y : Ljava/util/concurrent/Executor;
    //   173: aload #6
    //   175: aload #5
    //   177: putfield Z : Landroid/content/DialogInterface$OnClickListener;
    //   180: aload #6
    //   182: aload_3
    //   183: putfield a0 : Landroidx/biometric/BiometricPrompt$b;
    //   186: goto -> 241
    //   189: aload_2
    //   190: getfield c : Lb/d/c;
    //   193: astore #6
    //   195: aload #6
    //   197: ifnull -> 241
    //   200: aload_2
    //   201: getfield d : Lb/d/e;
    //   204: astore #7
    //   206: aload #7
    //   208: ifnull -> 241
    //   211: aload #6
    //   213: aload #5
    //   215: putfield q0 : Landroid/content/DialogInterface$OnClickListener;
    //   218: aload #7
    //   220: aload #4
    //   222: putfield X : Ljava/util/concurrent/Executor;
    //   225: aload #7
    //   227: aload_3
    //   228: putfield Y : Landroidx/biometric/BiometricPrompt$b;
    //   231: aload #7
    //   233: aload #6
    //   235: getfield h0 : Lb/d/c$c;
    //   238: invokevirtual c0 : (Landroid/os/Handler;)V
    //   241: iload_1
    //   242: ifeq -> 250
    //   245: aload_2
    //   246: iconst_2
    //   247: putfield i : I
    //   250: return
    // Exception table:
    //   from	to	target	type
    //   86	105	108	android/content/pm/PackageManager$NameNotFoundException
  }
  
  public class a implements DialogInterface.OnClickListener {
    public final BiometricPrompt b;
    
    public a(BiometricPrompt this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      this.b.b.execute(new a(this));
    }
    
    public class a implements Runnable {
      public final BiometricPrompt.a b;
      
      public a(BiometricPrompt.a this$0) {}
      
      public void run() {
        if (BiometricPrompt.c()) {
          BiometricPrompt biometricPrompt1 = this.b.b;
          b.d.a a1 = biometricPrompt1.f;
          if (a1 != null) {
            CharSequence charSequence = a1.c0;
            if ((SendMoney.a)biometricPrompt1.c != null) {
              this.b.b.f.a0();
            } else {
              throw null;
            } 
            return;
          } 
        } 
        BiometricPrompt biometricPrompt = this.b.b;
        b.d.c c = biometricPrompt.d;
        if (c != null && biometricPrompt.e != null) {
          c.i0.getCharSequence("negative_text");
          if ((SendMoney.a)this.b.b.c != null) {
            this.b.b.e.Z(2);
          } else {
            throw null;
          } 
        } else {
          Log.e("BiometricPromptCompat", "Negative button callback not run. Fragment was null.");
        } 
      }
    }
  }
  
  public class a implements Runnable {
    public final BiometricPrompt.a b;
    
    public a(BiometricPrompt this$0) {}
    
    public void run() {
      if (BiometricPrompt.c()) {
        BiometricPrompt biometricPrompt1 = this.b.b;
        b.d.a a1 = biometricPrompt1.f;
        if (a1 != null) {
          CharSequence charSequence = a1.c0;
          if ((SendMoney.a)biometricPrompt1.c != null) {
            this.b.b.f.a0();
          } else {
            throw null;
          } 
          return;
        } 
      } 
      BiometricPrompt biometricPrompt = this.b.b;
      b.d.c c = biometricPrompt.d;
      if (c != null && biometricPrompt.e != null) {
        c.i0.getCharSequence("negative_text");
        if ((SendMoney.a)this.b.b.c != null) {
          this.b.b.e.Z(2);
        } else {
          throw null;
        } 
      } else {
        Log.e("BiometricPromptCompat", "Negative button callback not run. Fragment was null.");
      } 
    }
  }
  
  public static abstract class b {
    public abstract void a(BiometricPrompt.c param1c);
  }
  
  public static class c {
    public c(BiometricPrompt.d param1d) {}
  }
  
  public static class d {
    public final Signature a;
    
    public final Cipher b;
    
    public final Mac c;
    
    public d(Signature param1Signature) {
      this.a = param1Signature;
      this.b = null;
      this.c = null;
    }
    
    public d(Cipher param1Cipher) {
      this.b = param1Cipher;
      this.a = null;
      this.c = null;
    }
    
    public d(Mac param1Mac) {
      this.c = param1Mac;
      this.b = null;
      this.a = null;
    }
  }
  
  public static class e {
    public Bundle a;
    
    public e(Bundle param1Bundle) {
      this.a = param1Bundle;
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\biometric\BiometricPrompt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */