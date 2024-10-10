package b.i.g.a;

import android.hardware.fingerprint.FingerprintManager;
import b.d.e;
import b.d.h;
import b.d.n;

public class a extends FingerprintManager.AuthenticationCallback {
  public final b.a a;
  
  public a(b.a parama) {}
  
  public void onAuthenticationError(int paramInt, CharSequence paramCharSequence) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lb/i/g/a/b$a;
    //   4: checkcast b/d/e$a
    //   7: astore #4
    //   9: aload #4
    //   11: ifnull -> 265
    //   14: iload_1
    //   15: iconst_5
    //   16: if_icmpne -> 33
    //   19: aload #4
    //   21: getfield a : Lb/d/e;
    //   24: getfield d0 : I
    //   27: ifne -> 256
    //   30: goto -> 249
    //   33: iload_1
    //   34: bipush #7
    //   36: if_icmpeq -> 249
    //   39: iload_1
    //   40: bipush #9
    //   42: if_icmpne -> 48
    //   45: goto -> 249
    //   48: aload_2
    //   49: ifnull -> 55
    //   52: goto -> 104
    //   55: new java/lang/StringBuilder
    //   58: dup
    //   59: invokespecial <init> : ()V
    //   62: astore_2
    //   63: aload_2
    //   64: ldc 'Got null string for error message: '
    //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload_2
    //   71: iload_1
    //   72: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: ldc 'FingerprintHelperFrag'
    //   78: aload_2
    //   79: invokevirtual toString : ()Ljava/lang/String;
    //   82: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   85: pop
    //   86: aload #4
    //   88: getfield a : Lb/d/e;
    //   91: getfield c0 : Landroid/content/Context;
    //   94: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   97: getstatic b/d/n.default_error_msg : I
    //   100: invokevirtual getString : (I)Ljava/lang/String;
    //   103: astore_2
    //   104: iload_1
    //   105: tableswitch default -> 176, 1 -> 181, 2 -> 181, 3 -> 181, 4 -> 181, 5 -> 181, 6 -> 176, 7 -> 181, 8 -> 181, 9 -> 181, 10 -> 181, 11 -> 181, 12 -> 181, 13 -> 181, 14 -> 181
    //   176: iconst_1
    //   177: istore_3
    //   178: goto -> 183
    //   181: iconst_0
    //   182: istore_3
    //   183: iload_3
    //   184: ifeq -> 190
    //   187: bipush #8
    //   189: istore_1
    //   190: aload #4
    //   192: getfield a : Lb/d/e;
    //   195: getfield W : Lb/d/e$b;
    //   198: getfield a : Landroid/os/Handler;
    //   201: iconst_2
    //   202: iload_1
    //   203: iconst_0
    //   204: aload_2
    //   205: invokevirtual obtainMessage : (IIILjava/lang/Object;)Landroid/os/Message;
    //   208: invokevirtual sendToTarget : ()V
    //   211: aload #4
    //   213: getfield a : Lb/d/e;
    //   216: getfield Z : Landroid/os/Handler;
    //   219: new b/d/f
    //   222: dup
    //   223: aload #4
    //   225: iload_1
    //   226: aload_2
    //   227: invokespecial <init> : (Lb/d/e$a;ILjava/lang/CharSequence;)V
    //   230: aload #4
    //   232: getfield a : Lb/d/e;
    //   235: invokevirtual k : ()Landroid/content/Context;
    //   238: invokestatic d0 : (Landroid/content/Context;)I
    //   241: i2l
    //   242: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   245: pop
    //   246: goto -> 264
    //   249: aload #4
    //   251: iload_1
    //   252: aload_2
    //   253: invokevirtual a : (ILjava/lang/CharSequence;)V
    //   256: aload #4
    //   258: getfield a : Lb/d/e;
    //   261: invokevirtual a0 : ()V
    //   264: return
    //   265: aconst_null
    //   266: athrow
  }
  
  public void onAuthenticationFailed() {
    e.a a1 = (e.a)this.a;
    e e = a1.a;
    e.b b = e.W;
    String str = e.c0.getResources().getString(n.fingerprint_not_recognized);
    b.a.obtainMessage(1, str).sendToTarget();
    a1.a.X.execute((Runnable)new h(a1));
  }
  
  public void onAuthenticationHelp(int paramInt, CharSequence paramCharSequence) {
    ((e.a)this.a).a.W.a.obtainMessage(1, paramCharSequence).sendToTarget();
  }
  
  public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult paramAuthenticationResult) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lb/i/g/a/b$a;
    //   4: astore_3
    //   5: aload_1
    //   6: invokevirtual getCryptoObject : ()Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;
    //   9: astore_1
    //   10: aconst_null
    //   11: astore_2
    //   12: aload_1
    //   13: ifnonnull -> 19
    //   16: goto -> 85
    //   19: aload_1
    //   20: invokevirtual getCipher : ()Ljavax/crypto/Cipher;
    //   23: ifnull -> 41
    //   26: new b/i/g/a/b$b
    //   29: dup
    //   30: aload_1
    //   31: invokevirtual getCipher : ()Ljavax/crypto/Cipher;
    //   34: invokespecial <init> : (Ljavax/crypto/Cipher;)V
    //   37: astore_1
    //   38: goto -> 87
    //   41: aload_1
    //   42: invokevirtual getSignature : ()Ljava/security/Signature;
    //   45: ifnull -> 63
    //   48: new b/i/g/a/b$b
    //   51: dup
    //   52: aload_1
    //   53: invokevirtual getSignature : ()Ljava/security/Signature;
    //   56: invokespecial <init> : (Ljava/security/Signature;)V
    //   59: astore_1
    //   60: goto -> 87
    //   63: aload_1
    //   64: invokevirtual getMac : ()Ljavax/crypto/Mac;
    //   67: ifnull -> 85
    //   70: new b/i/g/a/b$b
    //   73: dup
    //   74: aload_1
    //   75: invokevirtual getMac : ()Ljavax/crypto/Mac;
    //   78: invokespecial <init> : (Ljavax/crypto/Mac;)V
    //   81: astore_1
    //   82: goto -> 87
    //   85: aconst_null
    //   86: astore_1
    //   87: aload_3
    //   88: checkcast b/d/e$a
    //   91: astore_3
    //   92: aload_3
    //   93: getfield a : Lb/d/e;
    //   96: getfield W : Lb/d/e$b;
    //   99: iconst_5
    //   100: invokevirtual a : (I)V
    //   103: aload_1
    //   104: ifnonnull -> 112
    //   107: aload_2
    //   108: astore_1
    //   109: goto -> 183
    //   112: aload_1
    //   113: getfield b : Ljavax/crypto/Cipher;
    //   116: astore #4
    //   118: aload #4
    //   120: ifnull -> 136
    //   123: new androidx/biometric/BiometricPrompt$d
    //   126: dup
    //   127: aload #4
    //   129: invokespecial <init> : (Ljavax/crypto/Cipher;)V
    //   132: astore_1
    //   133: goto -> 183
    //   136: aload_1
    //   137: getfield a : Ljava/security/Signature;
    //   140: astore #4
    //   142: aload #4
    //   144: ifnull -> 160
    //   147: new androidx/biometric/BiometricPrompt$d
    //   150: dup
    //   151: aload #4
    //   153: invokespecial <init> : (Ljava/security/Signature;)V
    //   156: astore_1
    //   157: goto -> 183
    //   160: aload_1
    //   161: getfield c : Ljavax/crypto/Mac;
    //   164: astore #4
    //   166: aload_2
    //   167: astore_1
    //   168: aload #4
    //   170: ifnull -> 183
    //   173: new androidx/biometric/BiometricPrompt$d
    //   176: dup
    //   177: aload #4
    //   179: invokespecial <init> : (Ljavax/crypto/Mac;)V
    //   182: astore_1
    //   183: new androidx/biometric/BiometricPrompt$c
    //   186: dup
    //   187: aload_1
    //   188: invokespecial <init> : (Landroidx/biometric/BiometricPrompt$d;)V
    //   191: astore_1
    //   192: aload_3
    //   193: getfield a : Lb/d/e;
    //   196: getfield X : Ljava/util/concurrent/Executor;
    //   199: new b/d/g
    //   202: dup
    //   203: aload_3
    //   204: aload_1
    //   205: invokespecial <init> : (Lb/d/e$a;Landroidx/biometric/BiometricPrompt$c;)V
    //   208: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   213: aload_3
    //   214: getfield a : Lb/d/e;
    //   217: invokevirtual a0 : ()V
    //   220: return
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\g\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */