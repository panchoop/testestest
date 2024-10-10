package com.app.damnvulnerablebank;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AlertController;
import b.b.k.g;
import b.b.k.h;
import c.a.b.o;
import c.a.b.p;
import c.a.b.q;
import c.a.b.u;
import c.a.b.w.d;
import c.a.b.w.j;
import c.b.a.e;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends h {
  public static void u(MainActivity paramMainActivity) {
    ((ComponentActivity)paramMainActivity).f.a();
  }
  
  public void healthCheck(View paramView) {
    SharedPreferences.Editor editor = getApplicationContext().getSharedPreferences("apiurl", 0).edit();
    editor.putString("apiurl", ((EditText)findViewById(2131361874)).getText().toString().trim());
    editor.apply();
    findViewById(2131361983);
    Button button = (Button)findViewById(2131361983);
    p p = a.a.a.a.a.Z((Context)this);
    String str = c.a.a.a.a.c(getSharedPreferences("apiurl", 0).getString("apiurl", null), "/api/health/check");
    try {
      JSONObject jSONObject = new JSONObject();
      this();
      jSONObject.put("enc_data", "GmdBWksdEwAZFAlLVEdDX1FKS0JtQU1DHggaBkNXQQFjTkdBTUMJBgMCFQUIFA5MXUFPDxUdBg4PCkNWY05HQU1DFAYaDwgDBlhTTkUSAgwfHQcJBk9rWkkTbRw=");
      String str1 = e.a(jSONObject.get("enc_data").toString());
      jSONObject = new JSONObject();
      this(str1);
      Log.d("DECRYPTING: ", jSONObject.toString());
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
    } 
    p.a((o)new j(0, str, new b(this, button), new c(this, button)));
    ((d)p.e).a();
  }
  
  public void loginPage(View paramView) {
    startActivity(new Intent(getApplicationContext(), BankLogin.class));
  }
  
  public void onBackPressed() {
    g.a a = new g.a((Context)this);
    AlertController.b b1 = a.a;
    b1.f = "Really Exit?";
    b1.h = "Are you sure you want to exit?";
    b1.k = b1.a.getText(17039369);
    a.a.l = null;
    a a1 = new a(this);
    AlertController.b b2 = a.a;
    b2.i = b2.a.getText(17039379);
    a.a.j = a1;
    a.a().show();
  }
  
  public void onCreate(Bundle paramBundle) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial onCreate : (Landroid/os/Bundle;)V
    //   5: aload_0
    //   6: invokevirtual getWindow : ()Landroid/view/Window;
    //   9: sipush #1024
    //   12: sipush #1024
    //   15: invokevirtual setFlags : (II)V
    //   18: aload_0
    //   19: ldc 2131558431
    //   21: invokevirtual setContentView : (I)V
    //   24: aload_0
    //   25: invokevirtual getApplicationInfo : ()Landroid/content/pm/ApplicationInfo;
    //   28: getfield flags : I
    //   31: iconst_2
    //   32: iand
    //   33: ifeq -> 42
    //   36: iconst_1
    //   37: istore #4
    //   39: goto -> 45
    //   42: iconst_0
    //   43: istore #4
    //   45: new com/app/damnvulnerablebank/FridaCheckJNI
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: astore_1
    //   53: invokestatic isDebuggerConnected : ()Z
    //   56: ifeq -> 73
    //   59: aload_0
    //   60: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   63: ldc_w 'Debug from vm'
    //   66: iconst_1
    //   67: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   70: invokevirtual show : ()V
    //   73: getstatic c/b/a/d.a : I
    //   76: ifge -> 845
    //   79: getstatic android/os/Build.PRODUCT : Ljava/lang/String;
    //   82: ldc_w 'sdk'
    //   85: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   88: ifne -> 195
    //   91: getstatic android/os/Build.PRODUCT : Ljava/lang/String;
    //   94: ldc_w 'Andy'
    //   97: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   100: ifne -> 195
    //   103: getstatic android/os/Build.PRODUCT : Ljava/lang/String;
    //   106: ldc_w 'ttVM_Hdragon'
    //   109: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   112: ifne -> 195
    //   115: getstatic android/os/Build.PRODUCT : Ljava/lang/String;
    //   118: ldc_w 'google_sdk'
    //   121: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   124: ifne -> 195
    //   127: getstatic android/os/Build.PRODUCT : Ljava/lang/String;
    //   130: ldc_w 'Droid4X'
    //   133: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   136: ifne -> 195
    //   139: getstatic android/os/Build.PRODUCT : Ljava/lang/String;
    //   142: ldc_w 'nox'
    //   145: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   148: ifne -> 195
    //   151: getstatic android/os/Build.PRODUCT : Ljava/lang/String;
    //   154: ldc_w 'sdk_x86'
    //   157: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   160: ifne -> 195
    //   163: getstatic android/os/Build.PRODUCT : Ljava/lang/String;
    //   166: ldc_w 'sdk_google'
    //   169: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   172: ifne -> 195
    //   175: getstatic android/os/Build.PRODUCT : Ljava/lang/String;
    //   178: ldc_w 'vbox86p'
    //   181: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   184: ifeq -> 190
    //   187: goto -> 195
    //   190: iconst_0
    //   191: istore_3
    //   192: goto -> 197
    //   195: iconst_1
    //   196: istore_3
    //   197: getstatic android/os/Build.MANUFACTURER : Ljava/lang/String;
    //   200: ldc_w 'unknown'
    //   203: invokevirtual equals : (Ljava/lang/Object;)Z
    //   206: ifne -> 271
    //   209: getstatic android/os/Build.MANUFACTURER : Ljava/lang/String;
    //   212: ldc_w 'Genymotion'
    //   215: invokevirtual equals : (Ljava/lang/Object;)Z
    //   218: ifne -> 271
    //   221: getstatic android/os/Build.MANUFACTURER : Ljava/lang/String;
    //   224: ldc_w 'Andy'
    //   227: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   230: ifne -> 271
    //   233: getstatic android/os/Build.MANUFACTURER : Ljava/lang/String;
    //   236: ldc_w 'MIT'
    //   239: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   242: ifne -> 271
    //   245: getstatic android/os/Build.MANUFACTURER : Ljava/lang/String;
    //   248: ldc_w 'nox'
    //   251: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   254: ifne -> 271
    //   257: iload_3
    //   258: istore_2
    //   259: getstatic android/os/Build.MANUFACTURER : Ljava/lang/String;
    //   262: ldc_w 'TiantianVM'
    //   265: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   268: ifeq -> 275
    //   271: iload_3
    //   272: iconst_1
    //   273: iadd
    //   274: istore_2
    //   275: getstatic android/os/Build.BRAND : Ljava/lang/String;
    //   278: ldc_w 'generic'
    //   281: invokevirtual equals : (Ljava/lang/Object;)Z
    //   284: ifne -> 325
    //   287: getstatic android/os/Build.BRAND : Ljava/lang/String;
    //   290: ldc_w 'generic_x86'
    //   293: invokevirtual equals : (Ljava/lang/Object;)Z
    //   296: ifne -> 325
    //   299: getstatic android/os/Build.BRAND : Ljava/lang/String;
    //   302: ldc_w 'TTVM'
    //   305: invokevirtual equals : (Ljava/lang/Object;)Z
    //   308: ifne -> 325
    //   311: iload_2
    //   312: istore_3
    //   313: getstatic android/os/Build.BRAND : Ljava/lang/String;
    //   316: ldc_w 'Andy'
    //   319: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   322: ifeq -> 329
    //   325: iload_2
    //   326: iconst_1
    //   327: iadd
    //   328: istore_3
    //   329: getstatic android/os/Build.DEVICE : Ljava/lang/String;
    //   332: ldc_w 'generic'
    //   335: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   338: ifne -> 427
    //   341: getstatic android/os/Build.DEVICE : Ljava/lang/String;
    //   344: ldc_w 'generic_x86'
    //   347: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   350: ifne -> 427
    //   353: getstatic android/os/Build.DEVICE : Ljava/lang/String;
    //   356: ldc_w 'Andy'
    //   359: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   362: ifne -> 427
    //   365: getstatic android/os/Build.DEVICE : Ljava/lang/String;
    //   368: ldc_w 'ttVM_Hdragon'
    //   371: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   374: ifne -> 427
    //   377: getstatic android/os/Build.DEVICE : Ljava/lang/String;
    //   380: ldc_w 'Droid4X'
    //   383: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   386: ifne -> 427
    //   389: getstatic android/os/Build.DEVICE : Ljava/lang/String;
    //   392: ldc_w 'nox'
    //   395: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   398: ifne -> 427
    //   401: getstatic android/os/Build.DEVICE : Ljava/lang/String;
    //   404: ldc_w 'generic_x86_64'
    //   407: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   410: ifne -> 427
    //   413: iload_3
    //   414: istore_2
    //   415: getstatic android/os/Build.DEVICE : Ljava/lang/String;
    //   418: ldc_w 'vbox86p'
    //   421: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   424: ifeq -> 431
    //   427: iload_3
    //   428: iconst_1
    //   429: iadd
    //   430: istore_2
    //   431: getstatic android/os/Build.MODEL : Ljava/lang/String;
    //   434: ldc_w 'sdk'
    //   437: invokevirtual equals : (Ljava/lang/Object;)Z
    //   440: ifne -> 517
    //   443: getstatic android/os/Build.MODEL : Ljava/lang/String;
    //   446: ldc_w 'google_sdk'
    //   449: invokevirtual equals : (Ljava/lang/Object;)Z
    //   452: ifne -> 517
    //   455: getstatic android/os/Build.MODEL : Ljava/lang/String;
    //   458: ldc_w 'Droid4X'
    //   461: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   464: ifne -> 517
    //   467: getstatic android/os/Build.MODEL : Ljava/lang/String;
    //   470: ldc_w 'TiantianVM'
    //   473: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   476: ifne -> 517
    //   479: getstatic android/os/Build.MODEL : Ljava/lang/String;
    //   482: ldc_w 'Andy'
    //   485: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   488: ifne -> 517
    //   491: getstatic android/os/Build.MODEL : Ljava/lang/String;
    //   494: ldc_w 'Android SDK built for x86_64'
    //   497: invokevirtual equals : (Ljava/lang/Object;)Z
    //   500: ifne -> 517
    //   503: iload_2
    //   504: istore_3
    //   505: getstatic android/os/Build.MODEL : Ljava/lang/String;
    //   508: ldc_w 'Android SDK built for x86'
    //   511: invokevirtual equals : (Ljava/lang/Object;)Z
    //   514: ifeq -> 521
    //   517: iload_2
    //   518: iconst_1
    //   519: iadd
    //   520: istore_3
    //   521: getstatic android/os/Build.HARDWARE : Ljava/lang/String;
    //   524: ldc_w 'goldfish'
    //   527: invokevirtual equals : (Ljava/lang/Object;)Z
    //   530: ifne -> 571
    //   533: getstatic android/os/Build.HARDWARE : Ljava/lang/String;
    //   536: ldc_w 'vbox86'
    //   539: invokevirtual equals : (Ljava/lang/Object;)Z
    //   542: ifne -> 571
    //   545: getstatic android/os/Build.HARDWARE : Ljava/lang/String;
    //   548: ldc_w 'nox'
    //   551: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   554: ifne -> 571
    //   557: iload_3
    //   558: istore_2
    //   559: getstatic android/os/Build.HARDWARE : Ljava/lang/String;
    //   562: ldc_w 'ttVM_x86'
    //   565: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   568: ifeq -> 575
    //   571: iload_3
    //   572: iconst_1
    //   573: iadd
    //   574: istore_2
    //   575: getstatic android/os/Build.FINGERPRINT : Ljava/lang/String;
    //   578: ldc_w 'generic/sdk/generic'
    //   581: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   584: ifne -> 673
    //   587: getstatic android/os/Build.FINGERPRINT : Ljava/lang/String;
    //   590: ldc_w 'generic_x86/sdk_x86/generic_x86'
    //   593: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   596: ifne -> 673
    //   599: getstatic android/os/Build.FINGERPRINT : Ljava/lang/String;
    //   602: ldc_w 'Andy'
    //   605: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   608: ifne -> 673
    //   611: getstatic android/os/Build.FINGERPRINT : Ljava/lang/String;
    //   614: ldc_w 'ttVM_Hdragon'
    //   617: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   620: ifne -> 673
    //   623: getstatic android/os/Build.FINGERPRINT : Ljava/lang/String;
    //   626: ldc_w 'generic_x86_64'
    //   629: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   632: ifne -> 673
    //   635: getstatic android/os/Build.FINGERPRINT : Ljava/lang/String;
    //   638: ldc_w 'generic/google_sdk/generic'
    //   641: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   644: ifne -> 673
    //   647: getstatic android/os/Build.FINGERPRINT : Ljava/lang/String;
    //   650: ldc_w 'vbox86p'
    //   653: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   656: ifne -> 673
    //   659: iload_2
    //   660: istore_3
    //   661: getstatic android/os/Build.FINGERPRINT : Ljava/lang/String;
    //   664: ldc_w 'generic/vbox86p/vbox86p'
    //   667: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   670: ifeq -> 677
    //   673: iload_2
    //   674: iconst_1
    //   675: iadd
    //   676: istore_3
    //   677: sipush #7937
    //   680: invokestatic glGetString : (I)Ljava/lang/String;
    //   683: astore #6
    //   685: iload_3
    //   686: istore_2
    //   687: aload #6
    //   689: ifnull -> 737
    //   692: aload #6
    //   694: ldc_w 'Bluestacks'
    //   697: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   700: ifne -> 720
    //   703: aload #6
    //   705: ldc_w 'Translator'
    //   708: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   711: istore #5
    //   713: iload_3
    //   714: istore_2
    //   715: iload #5
    //   717: ifeq -> 737
    //   720: iload_3
    //   721: bipush #10
    //   723: iadd
    //   724: istore_2
    //   725: goto -> 737
    //   728: astore #6
    //   730: aload #6
    //   732: invokevirtual printStackTrace : ()V
    //   735: iload_3
    //   736: istore_2
    //   737: new java/io/File
    //   740: astore #6
    //   742: new java/lang/StringBuilder
    //   745: astore #7
    //   747: aload #7
    //   749: invokespecial <init> : ()V
    //   752: aload #7
    //   754: invokestatic getExternalStorageDirectory : ()Ljava/io/File;
    //   757: invokevirtual toString : ()Ljava/lang/String;
    //   760: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   763: pop
    //   764: aload #7
    //   766: getstatic java/io/File.separatorChar : C
    //   769: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   772: pop
    //   773: aload #7
    //   775: ldc_w 'windows'
    //   778: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   781: pop
    //   782: aload #7
    //   784: getstatic java/io/File.separatorChar : C
    //   787: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   790: pop
    //   791: aload #7
    //   793: ldc_w 'BstSharedFolder'
    //   796: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   799: pop
    //   800: aload #6
    //   802: aload #7
    //   804: invokevirtual toString : ()Ljava/lang/String;
    //   807: invokespecial <init> : (Ljava/lang/String;)V
    //   810: aload #6
    //   812: invokevirtual exists : ()Z
    //   815: istore #5
    //   817: iload_2
    //   818: istore_3
    //   819: iload #5
    //   821: ifeq -> 841
    //   824: iload_2
    //   825: bipush #10
    //   827: iadd
    //   828: istore_3
    //   829: goto -> 841
    //   832: astore #6
    //   834: aload #6
    //   836: invokevirtual printStackTrace : ()V
    //   839: iload_2
    //   840: istore_3
    //   841: iload_3
    //   842: putstatic c/b/a/d.a : I
    //   845: getstatic c/b/a/d.a : I
    //   848: iconst_3
    //   849: if_icmple -> 857
    //   852: iconst_1
    //   853: istore_2
    //   854: goto -> 859
    //   857: iconst_0
    //   858: istore_2
    //   859: iload_2
    //   860: ifeq -> 877
    //   863: aload_0
    //   864: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   867: ldc_w 'Emulator Detected'
    //   870: iconst_1
    //   871: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   874: invokevirtual show : ()V
    //   877: iload #4
    //   879: ifeq -> 899
    //   882: aload_0
    //   883: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   886: ldc_w 'Debbuger is Running'
    //   889: iconst_0
    //   890: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   893: invokevirtual show : ()V
    //   896: goto -> 899
    //   899: invokestatic R : ()Z
    //   902: ifeq -> 923
    //   905: aload_0
    //   906: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   909: ldc_w 'Phone is Rooted'
    //   912: iconst_0
    //   913: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   916: invokevirtual show : ()V
    //   919: aload_0
    //   920: invokevirtual finish : ()V
    //   923: aload_1
    //   924: invokevirtual fridaCheck : ()I
    //   927: iconst_1
    //   928: if_icmpne -> 962
    //   931: aload_0
    //   932: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   935: ldc_w 'Frida is running'
    //   938: iconst_0
    //   939: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   942: invokevirtual show : ()V
    //   945: ldc_w 'FRIDA CHECK'
    //   948: ldc_w 'FRIDA Server DETECTED'
    //   951: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   954: pop
    //   955: aload_0
    //   956: invokevirtual finish : ()V
    //   959: goto -> 986
    //   962: ldc_w 'FRIDA CHECK'
    //   965: ldc_w 'FRIDA Server NOT RUNNING'
    //   968: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   971: pop
    //   972: aload_0
    //   973: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   976: ldc_w 'Frida is NOT running'
    //   979: iconst_0
    //   980: invokestatic makeText : (Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   983: invokevirtual show : ()V
    //   986: aload_0
    //   987: ldc_w 'jwt'
    //   990: iconst_0
    //   991: invokevirtual getSharedPreferences : (Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   994: ldc_w 'isloggedin'
    //   997: iconst_0
    //   998: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   1003: ifeq -> 1028
    //   1006: aload_0
    //   1007: new android/content/Intent
    //   1010: dup
    //   1011: aload_0
    //   1012: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1015: ldc_w com/app/damnvulnerablebank/Dashboard
    //   1018: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1021: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   1024: aload_0
    //   1025: invokevirtual finish : ()V
    //   1028: return
    // Exception table:
    //   from	to	target	type
    //   677	685	728	java/lang/Exception
    //   692	713	728	java/lang/Exception
    //   737	817	832	java/lang/Exception
  }
  
  public void signupPage(View paramView) {
    startActivity(new Intent(getApplicationContext(), RegisterBank.class));
  }
  
  public class a implements DialogInterface.OnClickListener {
    public final MainActivity b;
    
    public a(MainActivity this$0) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      MainActivity.u(this.b);
      System.exit(0);
    }
  }
  
  public class b implements q.b<String> {
    public final Button a;
    
    public b(MainActivity this$0, Button param1Button) {}
    
    public void a(Object param1Object) {
      param1Object = param1Object;
      this.a.setText("Api is Up");
      this.a.setTextColor(-16711936);
    }
  }
  
  public class c implements q.a {
    public final Button a;
    
    public c(MainActivity this$0, Button param1Button) {}
    
    public void a(u param1u) {
      this.a.setText("Api is Down");
      this.a.setTextColor(-65536);
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\app\damnvulnerablebank\MainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */