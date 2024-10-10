package com.app.damnvulnerablebank;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.biometric.BiometricPrompt;
import b.b.k.h;
import c.a.b.o;
import c.a.b.p;
import c.a.b.q;
import c.b.a.e;
import c.b.a.n;
import c.b.a.o;
import c.b.a.p;
import org.json.JSONException;
import org.json.JSONObject;

public class SendMoney extends h {
  public Button p;
  
  public TextView q;
  
  public void Biometrics(View paramView) {
    // Byte code:
    //   0: getstatic android/os/Build$VERSION.SDK_INT : I
    //   3: istore_2
    //   4: aconst_null
    //   5: astore_1
    //   6: iload_2
    //   7: bipush #29
    //   9: if_icmplt -> 26
    //   12: aload_0
    //   13: ldc android/hardware/biometrics/BiometricManager
    //   15: invokevirtual getSystemService : (Ljava/lang/Class;)Ljava/lang/Object;
    //   18: checkcast android/hardware/biometrics/BiometricManager
    //   21: astore #5
    //   23: goto -> 38
    //   26: new b/i/g/a/b
    //   29: dup
    //   30: aload_0
    //   31: invokespecial <init> : (Landroid/content/Context;)V
    //   34: astore_1
    //   35: aconst_null
    //   36: astore #5
    //   38: getstatic android/os/Build$VERSION.SDK_INT : I
    //   41: bipush #29
    //   43: if_icmplt -> 55
    //   46: aload #5
    //   48: invokevirtual canAuthenticate : ()I
    //   51: istore_2
    //   52: goto -> 83
    //   55: aload_1
    //   56: invokevirtual c : ()Z
    //   59: ifne -> 68
    //   62: bipush #12
    //   64: istore_2
    //   65: goto -> 83
    //   68: aload_1
    //   69: invokevirtual b : ()Z
    //   72: ifne -> 81
    //   75: bipush #11
    //   77: istore_2
    //   78: goto -> 83
    //   81: iconst_0
    //   82: istore_2
    //   83: iload_2
    //   84: ifeq -> 142
    //   87: iload_2
    //   88: iconst_1
    //   89: if_icmpeq -> 119
    //   92: iload_2
    //   93: bipush #11
    //   95: if_icmpeq -> 113
    //   98: iload_2
    //   99: bipush #12
    //   101: if_icmpeq -> 107
    //   104: goto -> 152
    //   107: ldc 'No fingerprint sensor'
    //   109: astore_1
    //   110: goto -> 122
    //   113: ldc 'Your device don't have any fingerprint, check your security setting'
    //   115: astore_1
    //   116: goto -> 122
    //   119: ldc 'Biometric sensor is not available'
    //   121: astore_1
    //   122: aload_0
    //   123: aload_1
    //   124: iconst_1
    //   125: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   128: invokevirtual show : ()V
    //   131: aload_0
    //   132: getfield p : Landroid/widget/Button;
    //   135: iconst_4
    //   136: invokevirtual setVisibility : (I)V
    //   139: goto -> 152
    //   142: aload_0
    //   143: ldc 'Authenticate to continue'
    //   145: iconst_1
    //   146: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   149: invokevirtual show : ()V
    //   152: new androidx/biometric/BiometricPrompt
    //   155: dup
    //   156: aload_0
    //   157: aload_0
    //   158: invokestatic d : (Landroid/content/Context;)Ljava/util/concurrent/Executor;
    //   161: new com/app/damnvulnerablebank/SendMoney$a
    //   164: dup
    //   165: aload_0
    //   166: invokespecial <init> : (Lcom/app/damnvulnerablebank/SendMoney;)V
    //   169: invokespecial <init> : (Lb/l/a/e;Ljava/util/concurrent/Executor;Landroidx/biometric/BiometricPrompt$b;)V
    //   172: astore #6
    //   174: new android/os/Bundle
    //   177: dup
    //   178: invokespecial <init> : ()V
    //   181: astore_1
    //   182: aload_1
    //   183: ldc 'title'
    //   185: ldc 'Login'
    //   187: invokevirtual putCharSequence : (Ljava/lang/String;Ljava/lang/CharSequence;)V
    //   190: aload_1
    //   191: ldc 'description'
    //   193: ldc 'User fingerprint to Proceed'
    //   195: invokevirtual putCharSequence : (Ljava/lang/String;Ljava/lang/CharSequence;)V
    //   198: aload_1
    //   199: ldc 'allow_device_credential'
    //   201: iconst_1
    //   202: invokevirtual putBoolean : (Ljava/lang/String;Z)V
    //   205: aload_1
    //   206: ldc 'title'
    //   208: invokevirtual getCharSequence : (Ljava/lang/String;)Ljava/lang/CharSequence;
    //   211: astore #7
    //   213: aload_1
    //   214: ldc 'negative_text'
    //   216: invokevirtual getCharSequence : (Ljava/lang/String;)Ljava/lang/CharSequence;
    //   219: astore #5
    //   221: aload_1
    //   222: ldc 'allow_device_credential'
    //   224: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   227: istore #4
    //   229: aload_1
    //   230: ldc 'handling_device_credential_result'
    //   232: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   235: istore_3
    //   236: aload #7
    //   238: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   241: ifne -> 332
    //   244: aload #5
    //   246: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   249: ifeq -> 270
    //   252: iload #4
    //   254: ifeq -> 260
    //   257: goto -> 270
    //   260: new java/lang/IllegalArgumentException
    //   263: dup
    //   264: ldc 'Negative text must be set and non-empty'
    //   266: invokespecial <init> : (Ljava/lang/String;)V
    //   269: athrow
    //   270: aload #5
    //   272: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   275: ifne -> 296
    //   278: iload #4
    //   280: ifne -> 286
    //   283: goto -> 296
    //   286: new java/lang/IllegalArgumentException
    //   289: dup
    //   290: ldc 'Can't have both negative button behavior and device credential enabled'
    //   292: invokespecial <init> : (Ljava/lang/String;)V
    //   295: athrow
    //   296: iload_3
    //   297: ifeq -> 318
    //   300: iload #4
    //   302: ifeq -> 308
    //   305: goto -> 318
    //   308: new java/lang/IllegalArgumentException
    //   311: dup
    //   312: ldc 'Can't be handling device credential result without device credential enabled'
    //   314: invokespecial <init> : (Ljava/lang/String;)V
    //   317: athrow
    //   318: aload #6
    //   320: new androidx/biometric/BiometricPrompt$e
    //   323: dup
    //   324: aload_1
    //   325: invokespecial <init> : (Landroid/os/Bundle;)V
    //   328: invokevirtual b : (Landroidx/biometric/BiometricPrompt$e;)V
    //   331: return
    //   332: new java/lang/IllegalArgumentException
    //   335: dup
    //   336: ldc 'Title must be set and non-empty'
    //   338: invokespecial <init> : (Ljava/lang/String;)V
    //   341: athrow
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2131558439);
    this.q = (TextView)findViewById(2131361843);
    String str = getIntent().getStringExtra("beneficiary_account_number");
    this.q.setText(str);
    this.p = (Button)findViewById(2131362140);
  }
  
  public class a extends BiometricPrompt.b {
    public final SendMoney a;
    
    public a(SendMoney this$0) {}
    
    public void a(BiometricPrompt.c param1c) {
      Toast.makeText(this.a.getApplicationContext(), "Transfer Successful", 1).show();
      SendMoney sendMoney = this.a;
      int i = 0;
      String str1 = sendMoney.getSharedPreferences("jwt", 0).getString("accesstoken", null);
      String str2 = c.a.a.a.a.c(sendMoney.getSharedPreferences("apiurl", 0).getString("apiurl", null), "/api/balance/transfer");
      EditText editText2 = (EditText)sendMoney.findViewById(2131361949);
      EditText editText1 = (EditText)sendMoney.findViewById(2131361950);
      p p = a.a.a.a.a.Z(sendMoney.getApplicationContext());
      JSONObject jSONObject2 = new JSONObject();
      JSONObject jSONObject1 = new JSONObject();
      try {
        boolean bool;
        String str = editText2.getText().toString();
        if (str != "" && editText1.getText().toString() != "") {
          i = Integer.parseInt(editText2.getText().toString());
          bool = Integer.parseInt(editText1.getText().toString());
        } else {
          Toast.makeText(sendMoney.getApplicationContext(), "Invalid Input ", 0).show();
          Intent intent = new Intent();
          this((Context)sendMoney, SendMoney.class);
          sendMoney.startActivity(intent);
          bool = false;
        } 
        jSONObject2.put("to_account", i);
        jSONObject2.put("amount", bool);
        jSONObject1.put("enc_data", e.b(jSONObject2.toString()));
      } catch (JSONException jSONException) {
        jSONException.printStackTrace();
      } 
      p.a((o)new p(sendMoney, 1, str2, jSONObject1, (q.b)new n(sendMoney), (q.a)new o(sendMoney), str1));
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\app\damnvulnerablebank\SendMoney.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */