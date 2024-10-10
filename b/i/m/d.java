package b.i.m;

import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class d {
  public static boolean a = false;
  
  public static Method b;
  
  public static boolean c = false;
  
  public static Field d;
  
  public static boolean a(a parama, View paramView, Window.Callback paramCallback, KeyEvent paramKeyEvent) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #4
    //   3: iconst_0
    //   4: istore #6
    //   6: aload_0
    //   7: ifnonnull -> 12
    //   10: iconst_0
    //   11: ireturn
    //   12: getstatic android/os/Build$VERSION.SDK_INT : I
    //   15: bipush #28
    //   17: if_icmplt -> 28
    //   20: aload_0
    //   21: aload_3
    //   22: invokeinterface i : (Landroid/view/KeyEvent;)Z
    //   27: ireturn
    //   28: aload_2
    //   29: instanceof android/app/Activity
    //   32: istore #8
    //   34: aconst_null
    //   35: astore #9
    //   37: aconst_null
    //   38: astore #10
    //   40: iconst_1
    //   41: istore #7
    //   43: iconst_1
    //   44: istore #5
    //   46: iload #8
    //   48: ifeq -> 238
    //   51: aload_2
    //   52: checkcast android/app/Activity
    //   55: astore_1
    //   56: aload_1
    //   57: invokevirtual onUserInteraction : ()V
    //   60: aload_1
    //   61: invokevirtual getWindow : ()Landroid/view/Window;
    //   64: astore_0
    //   65: aload_0
    //   66: bipush #8
    //   68: invokevirtual hasFeature : (I)Z
    //   71: ifeq -> 179
    //   74: aload_1
    //   75: invokevirtual getActionBar : ()Landroid/app/ActionBar;
    //   78: astore_2
    //   79: aload_3
    //   80: invokevirtual getKeyCode : ()I
    //   83: bipush #82
    //   85: if_icmpne -> 179
    //   88: aload_2
    //   89: ifnull -> 179
    //   92: getstatic b/i/m/d.a : Z
    //   95: ifne -> 123
    //   98: aload_2
    //   99: invokevirtual getClass : ()Ljava/lang/Class;
    //   102: ldc 'onMenuKeyEvent'
    //   104: iconst_1
    //   105: anewarray java/lang/Class
    //   108: dup
    //   109: iconst_0
    //   110: ldc android/view/KeyEvent
    //   112: aastore
    //   113: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   116: putstatic b/i/m/d.b : Ljava/lang/reflect/Method;
    //   119: iconst_1
    //   120: putstatic b/i/m/d.a : Z
    //   123: getstatic b/i/m/d.b : Ljava/lang/reflect/Method;
    //   126: astore #9
    //   128: iload #6
    //   130: istore #4
    //   132: aload #9
    //   134: ifnull -> 167
    //   137: aload #9
    //   139: aload_2
    //   140: iconst_1
    //   141: anewarray java/lang/Object
    //   144: dup
    //   145: iconst_0
    //   146: aload_3
    //   147: aastore
    //   148: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   151: checkcast java/lang/Boolean
    //   154: invokevirtual booleanValue : ()Z
    //   157: istore #4
    //   159: goto -> 167
    //   162: astore_2
    //   163: iload #6
    //   165: istore #4
    //   167: iload #4
    //   169: ifeq -> 179
    //   172: iload #5
    //   174: istore #4
    //   176: goto -> 235
    //   179: aload_0
    //   180: aload_3
    //   181: invokevirtual superDispatchKeyEvent : (Landroid/view/KeyEvent;)Z
    //   184: ifeq -> 194
    //   187: iload #5
    //   189: istore #4
    //   191: goto -> 235
    //   194: aload_0
    //   195: invokevirtual getDecorView : ()Landroid/view/View;
    //   198: astore_2
    //   199: aload_2
    //   200: aload_3
    //   201: invokestatic e : (Landroid/view/View;Landroid/view/KeyEvent;)Z
    //   204: ifeq -> 214
    //   207: iload #5
    //   209: istore #4
    //   211: goto -> 235
    //   214: aload #10
    //   216: astore_0
    //   217: aload_2
    //   218: ifnull -> 226
    //   221: aload_2
    //   222: invokevirtual getKeyDispatcherState : ()Landroid/view/KeyEvent$DispatcherState;
    //   225: astore_0
    //   226: aload_3
    //   227: aload_1
    //   228: aload_0
    //   229: aload_1
    //   230: invokevirtual dispatch : (Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z
    //   233: istore #4
    //   235: iload #4
    //   237: ireturn
    //   238: aload_2
    //   239: instanceof android/app/Dialog
    //   242: ifeq -> 389
    //   245: aload_2
    //   246: checkcast android/app/Dialog
    //   249: astore_1
    //   250: getstatic b/i/m/d.c : Z
    //   253: ifne -> 277
    //   256: ldc android/app/Dialog
    //   258: ldc 'mOnKeyListener'
    //   260: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   263: astore_0
    //   264: aload_0
    //   265: putstatic b/i/m/d.d : Ljava/lang/reflect/Field;
    //   268: aload_0
    //   269: iconst_1
    //   270: invokevirtual setAccessible : (Z)V
    //   273: iconst_1
    //   274: putstatic b/i/m/d.c : Z
    //   277: getstatic b/i/m/d.d : Ljava/lang/reflect/Field;
    //   280: astore_0
    //   281: aload_0
    //   282: ifnull -> 297
    //   285: aload_0
    //   286: aload_1
    //   287: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   290: checkcast android/content/DialogInterface$OnKeyListener
    //   293: astore_0
    //   294: goto -> 299
    //   297: aconst_null
    //   298: astore_0
    //   299: aload_0
    //   300: ifnull -> 325
    //   303: aload_0
    //   304: aload_1
    //   305: aload_3
    //   306: invokevirtual getKeyCode : ()I
    //   309: aload_3
    //   310: invokeinterface onKey : (Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    //   315: ifeq -> 325
    //   318: iload #7
    //   320: istore #4
    //   322: goto -> 386
    //   325: aload_1
    //   326: invokevirtual getWindow : ()Landroid/view/Window;
    //   329: astore_0
    //   330: aload_0
    //   331: aload_3
    //   332: invokevirtual superDispatchKeyEvent : (Landroid/view/KeyEvent;)Z
    //   335: ifeq -> 345
    //   338: iload #7
    //   340: istore #4
    //   342: goto -> 386
    //   345: aload_0
    //   346: invokevirtual getDecorView : ()Landroid/view/View;
    //   349: astore_2
    //   350: aload_2
    //   351: aload_3
    //   352: invokestatic e : (Landroid/view/View;Landroid/view/KeyEvent;)Z
    //   355: ifeq -> 365
    //   358: iload #7
    //   360: istore #4
    //   362: goto -> 386
    //   365: aload #9
    //   367: astore_0
    //   368: aload_2
    //   369: ifnull -> 377
    //   372: aload_2
    //   373: invokevirtual getKeyDispatcherState : ()Landroid/view/KeyEvent$DispatcherState;
    //   376: astore_0
    //   377: aload_3
    //   378: aload_1
    //   379: aload_0
    //   380: aload_1
    //   381: invokevirtual dispatch : (Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z
    //   384: istore #4
    //   386: iload #4
    //   388: ireturn
    //   389: aload_1
    //   390: ifnull -> 401
    //   393: aload_1
    //   394: aload_3
    //   395: invokestatic e : (Landroid/view/View;Landroid/view/KeyEvent;)Z
    //   398: ifne -> 411
    //   401: aload_0
    //   402: aload_3
    //   403: invokeinterface i : (Landroid/view/KeyEvent;)Z
    //   408: ifeq -> 414
    //   411: iconst_1
    //   412: istore #4
    //   414: iload #4
    //   416: ireturn
    //   417: astore #9
    //   419: goto -> 119
    //   422: astore_0
    //   423: goto -> 273
    //   426: astore_0
    //   427: goto -> 297
    // Exception table:
    //   from	to	target	type
    //   98	119	417	java/lang/NoSuchMethodException
    //   137	159	162	java/lang/IllegalAccessException
    //   137	159	162	java/lang/reflect/InvocationTargetException
    //   256	273	422	java/lang/NoSuchFieldException
    //   285	294	426	java/lang/IllegalAccessException
  }
  
  public static interface a {
    boolean i(KeyEvent param1KeyEvent);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\m\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */