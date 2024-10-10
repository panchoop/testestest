package b.i.m;

import a.a.a.a.a;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public class f {
  public ViewParent a;
  
  public ViewParent b;
  
  public final View c;
  
  public boolean d;
  
  public int[] e;
  
  public f(View paramView) {
    this.c = paramView;
  }
  
  public boolean a(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    if (this.d) {
      ViewParent viewParent = f(0);
      if (viewParent != null)
        return a.d0(viewParent, this.c, paramFloat1, paramFloat2, paramBoolean); 
    } 
    return false;
  }
  
  public boolean b(float paramFloat1, float paramFloat2) {
    if (this.d) {
      ViewParent viewParent = f(0);
      if (viewParent != null)
        return a.e0(viewParent, this.c, paramFloat1, paramFloat2); 
    } 
    return false;
  }
  
  public boolean c(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt3) {
    null = this.d;
    boolean bool = true;
    if (null) {
      ViewParent viewParent = f(paramInt3);
      if (viewParent == null)
        return false; 
      if (paramInt1 != 0 || paramInt2 != 0) {
        byte b1;
        byte b2;
        if (paramArrayOfint2 != null) {
          this.c.getLocationInWindow(paramArrayOfint2);
          b1 = paramArrayOfint2[0];
          b2 = paramArrayOfint2[1];
        } else {
          b1 = 0;
          b2 = 0;
        } 
        int[] arrayOfInt = paramArrayOfint1;
        if (paramArrayOfint1 == null) {
          if (this.e == null)
            this.e = new int[2]; 
          arrayOfInt = this.e;
        } 
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        a.f0(viewParent, this.c, paramInt1, paramInt2, arrayOfInt, paramInt3);
        if (paramArrayOfint2 != null) {
          this.c.getLocationInWindow(paramArrayOfint2);
          paramArrayOfint2[0] = paramArrayOfint2[0] - b1;
          paramArrayOfint2[1] = paramArrayOfint2[1] - b2;
        } 
        null = bool;
        if (arrayOfInt[0] == 0) {
          if (arrayOfInt[1] != 0)
            return bool; 
        } else {
          return null;
        } 
      } else if (paramArrayOfint2 != null) {
        paramArrayOfint2[0] = 0;
        paramArrayOfint2[1] = 0;
      } 
    } 
    return false;
  }
  
  public boolean d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    return e(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint, 0, null);
  }
  
  public final boolean e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint1, int paramInt5, int[] paramArrayOfint2) {
    if (this.d) {
      ViewParent viewParent = f(paramInt5);
      if (viewParent == null)
        return false; 
      if (paramInt1 != 0 || paramInt2 != 0 || paramInt3 != 0 || paramInt4 != 0) {
        byte b1;
        byte b2;
        if (paramArrayOfint1 != null) {
          this.c.getLocationInWindow(paramArrayOfint1);
          b2 = paramArrayOfint1[0];
          b1 = paramArrayOfint1[1];
        } else {
          b2 = 0;
          b1 = 0;
        } 
        if (paramArrayOfint2 == null) {
          if (this.e == null)
            this.e = new int[2]; 
          paramArrayOfint2 = this.e;
          paramArrayOfint2[0] = 0;
          paramArrayOfint2[1] = 0;
        } 
        a.g0(viewParent, this.c, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramArrayOfint2);
        if (paramArrayOfint1 != null) {
          this.c.getLocationInWindow(paramArrayOfint1);
          paramArrayOfint1[0] = paramArrayOfint1[0] - b2;
          paramArrayOfint1[1] = paramArrayOfint1[1] - b1;
        } 
        return true;
      } 
      if (paramArrayOfint1 != null) {
        paramArrayOfint1[0] = 0;
        paramArrayOfint1[1] = 0;
      } 
    } 
    return false;
  }
  
  public final ViewParent f(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? null : this.b) : this.a;
  }
  
  public boolean g(int paramInt) {
    boolean bool;
    if (f(paramInt) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean h(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: invokevirtual f : (I)Landroid/view/ViewParent;
    //   5: ifnull -> 13
    //   8: iconst_1
    //   9: istore_3
    //   10: goto -> 15
    //   13: iconst_0
    //   14: istore_3
    //   15: iload_3
    //   16: ifeq -> 21
    //   19: iconst_1
    //   20: ireturn
    //   21: aload_0
    //   22: getfield d : Z
    //   25: ifeq -> 317
    //   28: aload_0
    //   29: getfield c : Landroid/view/View;
    //   32: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   35: astore #6
    //   37: aload_0
    //   38: getfield c : Landroid/view/View;
    //   41: astore #7
    //   43: aload #6
    //   45: ifnull -> 317
    //   48: aload_0
    //   49: getfield c : Landroid/view/View;
    //   52: astore #8
    //   54: aload #6
    //   56: instanceof b/i/m/g
    //   59: istore #5
    //   61: iload #5
    //   63: ifeq -> 87
    //   66: aload #6
    //   68: checkcast b/i/m/g
    //   71: aload #7
    //   73: aload #8
    //   75: iload_1
    //   76: iload_2
    //   77: invokeinterface o : (Landroid/view/View;Landroid/view/View;II)Z
    //   82: istore #4
    //   84: goto -> 159
    //   87: iload_2
    //   88: ifne -> 156
    //   91: aload #6
    //   93: aload #7
    //   95: aload #8
    //   97: iload_1
    //   98: invokeinterface onStartNestedScroll : (Landroid/view/View;Landroid/view/View;I)Z
    //   103: istore #4
    //   105: goto -> 159
    //   108: astore #8
    //   110: new java/lang/StringBuilder
    //   113: dup
    //   114: invokespecial <init> : ()V
    //   117: astore #9
    //   119: aload #9
    //   121: ldc 'ViewParent '
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: aload #9
    //   129: aload #6
    //   131: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   134: pop
    //   135: aload #9
    //   137: ldc ' does not implement interface method onStartNestedScroll'
    //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: ldc 'ViewParentCompat'
    //   145: aload #9
    //   147: invokevirtual toString : ()Ljava/lang/String;
    //   150: aload #8
    //   152: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   155: pop
    //   156: iconst_0
    //   157: istore #4
    //   159: iload #4
    //   161: ifeq -> 290
    //   164: iload_2
    //   165: ifeq -> 185
    //   168: iload_2
    //   169: iconst_1
    //   170: if_icmpeq -> 176
    //   173: goto -> 191
    //   176: aload_0
    //   177: aload #6
    //   179: putfield b : Landroid/view/ViewParent;
    //   182: goto -> 191
    //   185: aload_0
    //   186: aload #6
    //   188: putfield a : Landroid/view/ViewParent;
    //   191: aload_0
    //   192: getfield c : Landroid/view/View;
    //   195: astore #8
    //   197: iload #5
    //   199: ifeq -> 221
    //   202: aload #6
    //   204: checkcast b/i/m/g
    //   207: aload #7
    //   209: aload #8
    //   211: iload_1
    //   212: iload_2
    //   213: invokeinterface i : (Landroid/view/View;Landroid/view/View;II)V
    //   218: goto -> 288
    //   221: iload_2
    //   222: ifne -> 288
    //   225: aload #6
    //   227: aload #7
    //   229: aload #8
    //   231: iload_1
    //   232: invokeinterface onNestedScrollAccepted : (Landroid/view/View;Landroid/view/View;I)V
    //   237: goto -> 288
    //   240: astore #7
    //   242: new java/lang/StringBuilder
    //   245: dup
    //   246: invokespecial <init> : ()V
    //   249: astore #8
    //   251: aload #8
    //   253: ldc 'ViewParent '
    //   255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: pop
    //   259: aload #8
    //   261: aload #6
    //   263: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   266: pop
    //   267: aload #8
    //   269: ldc ' does not implement interface method onNestedScrollAccepted'
    //   271: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: pop
    //   275: ldc 'ViewParentCompat'
    //   277: aload #8
    //   279: invokevirtual toString : ()Ljava/lang/String;
    //   282: aload #7
    //   284: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   287: pop
    //   288: iconst_1
    //   289: ireturn
    //   290: aload #6
    //   292: instanceof android/view/View
    //   295: ifeq -> 305
    //   298: aload #6
    //   300: checkcast android/view/View
    //   303: astore #7
    //   305: aload #6
    //   307: invokeinterface getParent : ()Landroid/view/ViewParent;
    //   312: astore #6
    //   314: goto -> 43
    //   317: iconst_0
    //   318: ireturn
    // Exception table:
    //   from	to	target	type
    //   91	105	108	java/lang/AbstractMethodError
    //   225	237	240	java/lang/AbstractMethodError
  }
  
  public void i(int paramInt) {
    ViewParent viewParent = f(paramInt);
    if (viewParent != null) {
      View view = this.c;
      if (viewParent instanceof g) {
        ((g)viewParent).m(view, paramInt);
      } else if (paramInt == 0) {
        try {
          viewParent.onStopNestedScroll(view);
        } catch (AbstractMethodError abstractMethodError) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("ViewParent ");
          stringBuilder.append(viewParent);
          stringBuilder.append(" does not implement interface method onStopNestedScroll");
          Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
        } 
      } 
      if (paramInt != 0) {
        if (paramInt == 1)
          this.b = null; 
      } else {
        this.a = null;
      } 
    } 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\m\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */