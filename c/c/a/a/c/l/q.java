package c.c.a.a.c.l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewParent;
import b.b.l.a.a;
import b.b.p.x0;
import b.i.f.a;
import b.i.m.l;
import c.c.a.a.c.l.u.b;
import c.c.a.a.c.l.u.c;
import c.c.a.a.f.c.b1;
import c.c.a.a.f.c.n;
import c.c.a.a.f.c.n1;
import c.c.a.a.h.d;
import c.c.a.a.h.t;
import c.c.a.b.d0.d;
import c.c.a.b.d0.e;
import c.c.a.b.d0.g;
import c.c.a.b.d0.i;
import c.c.a.b.t.c;
import c.c.a.b.v.a;
import c.c.b.h.a0;
import c.c.b.h.b;
import c.c.b.h.d;
import c.c.b.h.g0;
import c.c.b.h.r;
import c.c.b.h.s;
import c.c.b.h.y;
import c.c.b.h.z;
import c.c.b.i.c;
import c.c.b.i.d;
import c.c.b.i.g;
import c.c.b.n.a;
import c.c.b.n.e;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class q {
  public static Boolean a;
  
  public static Boolean b;
  
  public static Boolean c;
  
  public static ColorStateList A(Context paramContext, x0 paramx0, int paramInt) {
    if (paramx0.b.hasValue(paramInt)) {
      int i = paramx0.b.getResourceId(paramInt, 0);
      if (i != 0) {
        ColorStateList colorStateList = a.a(paramContext, i);
        if (colorStateList != null)
          return colorStateList; 
      } 
    } 
    return paramx0.c(paramInt);
  }
  
  public static int A0(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0 && paramInt1 <= paramInt2)
      return paramInt1; 
    throw new IndexOutOfBoundsException(B0(paramInt1, paramInt2, "index"));
  }
  
  public static Calendar B(Calendar paramCalendar) {
    paramCalendar = G(paramCalendar);
    Calendar calendar = F();
    calendar.set(paramCalendar.get(1), paramCalendar.get(2), paramCalendar.get(5));
    return calendar;
  }
  
  public static String B0(int paramInt1, int paramInt2, @NullableDecl String paramString) {
    if (paramInt1 < 0)
      return s0("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) }); 
    if (paramInt2 >= 0)
      return s0("%s (%s) must not be greater than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }); 
    StringBuilder stringBuilder = new StringBuilder(26);
    stringBuilder.append("negative size: ");
    stringBuilder.append(paramInt2);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static Drawable C(Context paramContext, TypedArray paramTypedArray, int paramInt) {
    if (paramTypedArray.hasValue(paramInt)) {
      int i = paramTypedArray.getResourceId(paramInt, 0);
      if (i != 0) {
        Drawable drawable = a.b(paramContext, i);
        if (drawable != null)
          return drawable; 
      } 
    } 
    return paramTypedArray.getDrawable(paramInt);
  }
  
  public static void C0(Parcel paramParcel, int paramInt) {
    int i = paramParcel.dataPosition();
    paramParcel.setDataPosition(paramInt - 4);
    paramParcel.writeInt(i - paramInt);
    paramParcel.setDataPosition(i);
  }
  
  public static TimeZone D() {
    return TimeZone.getTimeZone("UTC");
  }
  
  public static void D0(Parcel paramParcel, int paramInt1, int paramInt2) {
    if (paramInt2 >= 65535) {
      paramParcel.writeInt(paramInt1 | 0xFFFF0000);
      paramParcel.writeInt(paramInt2);
      return;
    } 
    paramParcel.writeInt(paramInt1 | paramInt2 << 16);
  }
  
  public static Calendar E() {
    return B(Calendar.getInstance());
  }
  
  public static Calendar F() {
    return G(null);
  }
  
  public static Calendar G(Calendar paramCalendar) {
    Calendar calendar = Calendar.getInstance(D());
    if (paramCalendar == null) {
      calendar.clear();
    } else {
      calendar.setTimeInMillis(paramCalendar.getTimeInMillis());
    } 
    return calendar;
  }
  
  public static boolean H() {
    return (Build.VERSION.SDK_INT >= 26);
  }
  
  @TargetApi(20)
  public static boolean I(Context paramContext) {
    if (a == null)
      a = Boolean.valueOf(paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch")); 
    return a.booleanValue();
  }
  
  @TargetApi(26)
  public static boolean J(Context paramContext) {
    if (I(paramContext)) {
      boolean bool;
      if (Build.VERSION.SDK_INT >= 24) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        if (b == null)
          b = Boolean.valueOf(paramContext.getPackageManager().hasSystemFeature("cn.google")); 
        if (b.booleanValue() && !H())
          return true; 
      } else {
        return true;
      } 
    } 
    return false;
  }
  
  public static int K(int paramInt1, int paramInt2, float paramFloat) {
    return a.a(a.c(paramInt2, Math.round(Color.alpha(paramInt2) * paramFloat)), paramInt1);
  }
  
  public static float L(float paramFloat1, float paramFloat2, float paramFloat3) {
    return paramFloat3 * paramFloat2 + (1.0F - paramFloat3) * paramFloat1;
  }
  
  public static PorterDuff.Mode M(int paramInt, PorterDuff.Mode paramMode) {
    if (paramInt != 3) {
      if (paramInt != 5) {
        if (paramInt != 9) {
          switch (paramInt) {
            default:
              return paramMode;
            case 16:
              return PorterDuff.Mode.ADD;
            case 15:
              return PorterDuff.Mode.SCREEN;
            case 14:
              break;
          } 
          return PorterDuff.Mode.MULTIPLY;
        } 
        return PorterDuff.Mode.SRC_ATOP;
      } 
      return PorterDuff.Mode.SRC_IN;
    } 
    return PorterDuff.Mode.SRC_OVER;
  }
  
  public static void N(AnimatorSet paramAnimatorSet, List<Animator> paramList) {
    int i = paramList.size();
    long l = 0L;
    for (byte b = 0; b < i; b++) {
      Animator animator = paramList.get(b);
      long l1 = animator.getStartDelay();
      l = Math.max(l, animator.getDuration() + l1);
    } 
    ValueAnimator valueAnimator = ValueAnimator.ofInt(new int[] { 0, 0 });
    valueAnimator.setDuration(l);
    paramList.add(0, valueAnimator);
    paramAnimatorSet.playTogether(paramList);
  }
  
  public static boolean O(Parcel paramParcel, int paramInt) {
    v0(paramParcel, paramInt, 4);
    return (paramParcel.readInt() != 0);
  }
  
  public static IBinder P(Parcel paramParcel, int paramInt) {
    paramInt = T(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    IBinder iBinder = paramParcel.readStrongBinder();
    paramParcel.setDataPosition(i + paramInt);
    return iBinder;
  }
  
  public static int Q(Parcel paramParcel, int paramInt) {
    v0(paramParcel, paramInt, 4);
    return paramParcel.readInt();
  }
  
  public static long R(Parcel paramParcel, int paramInt) {
    v0(paramParcel, paramInt, 8);
    return paramParcel.readLong();
  }
  
  public static Long S(Parcel paramParcel, int paramInt) {
    paramInt = T(paramParcel, paramInt);
    if (paramInt == 0)
      return null; 
    z0(paramParcel, paramInt, 8);
    return Long.valueOf(paramParcel.readLong());
  }
  
  public static int T(Parcel paramParcel, int paramInt) {
    return ((paramInt & 0xFFFF0000) != -65536) ? (paramInt >> 16 & 0xFFFF) : paramParcel.readInt();
  }
  
  public static TypedValue U(Context paramContext, int paramInt) {
    TypedValue typedValue = new TypedValue();
    return paramContext.getTheme().resolveAttribute(paramInt, typedValue, true) ? typedValue : null;
  }
  
  public static boolean V(Context paramContext, int paramInt, boolean paramBoolean) {
    TypedValue typedValue = U(paramContext, paramInt);
    boolean bool = paramBoolean;
    if (typedValue != null) {
      bool = paramBoolean;
      if (typedValue.type == 18)
        if (typedValue.data != 0) {
          bool = true;
        } else {
          bool = false;
        }  
    } 
    return bool;
  }
  
  public static int W(Context paramContext, int paramInt, String paramString) {
    TypedValue typedValue = U(paramContext, paramInt);
    if (typedValue != null)
      return typedValue.data; 
    throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[] { paramString, paramContext.getResources().getResourceName(paramInt) }));
  }
  
  public static void X(View paramView, float paramFloat) {
    Drawable drawable = paramView.getBackground();
    if (drawable instanceof g) {
      g g = (g)drawable;
      g.b b = g.b;
      if (b.o != paramFloat) {
        b.o = paramFloat;
        g.x();
      } 
    } 
  }
  
  public static void Y(View paramView, g paramg) {
    boolean bool;
    a a = paramg.b.b;
    if (a != null && a.a) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      ViewParent viewParent = paramView.getParent();
      float f = 0.0F;
      while (viewParent instanceof View) {
        f += l.m((View)viewParent);
        viewParent = viewParent.getParent();
      } 
      g.b b = paramg.b;
      if (b.n != f) {
        b.n = f;
        paramg.x();
      } 
    } 
  }
  
  public static void Z(Parcel paramParcel, int paramInt) {
    paramInt = T(paramParcel, paramInt);
    paramParcel.setDataPosition(paramParcel.dataPosition() + paramInt);
  }
  
  public static int a(Parcel paramParcel) {
    return n0(paramParcel, 20293);
  }
  
  public static PorterDuffColorFilter a0(Drawable paramDrawable, ColorStateList paramColorStateList, PorterDuff.Mode paramMode) {
    return (paramColorStateList == null || paramMode == null) ? null : new PorterDuffColorFilter(paramColorStateList.getColorForState(paramDrawable.getState(), 0), paramMode);
  }
  
  public static void b(boolean paramBoolean) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException();
  }
  
  public static int b0(Parcel paramParcel) {
    int k = paramParcel.readInt();
    int j = T(paramParcel, k);
    int i = paramParcel.dataPosition();
    if ((0xFFFF & k) != 20293) {
      String str = String.valueOf(Integer.toHexString(k));
      if (str.length() != 0) {
        str = "Expected object header. Got 0x".concat(str);
      } else {
        str = new String("Expected object header. Got 0x");
      } 
      throw new b(str, paramParcel);
    } 
    j += i;
    if (j >= i && j <= paramParcel.dataSize())
      return j; 
    StringBuilder stringBuilder = new StringBuilder(54);
    stringBuilder.append("Size read is invalid start=");
    stringBuilder.append(i);
    stringBuilder.append(" end=");
    stringBuilder.append(j);
    throw new b(stringBuilder.toString(), paramParcel);
  }
  
  public static void c(Handler paramHandler) {
    if (Looper.myLooper() == paramHandler.getLooper())
      return; 
    throw new IllegalStateException("Must be called on the handler thread");
  }
  
  public static void c0(Parcel paramParcel, int paramInt, boolean paramBoolean) {
    D0(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramBoolean);
  }
  
  public static String d(String paramString) {
    if (!TextUtils.isEmpty(paramString))
      return paramString; 
    throw new IllegalArgumentException("Given String is empty or null");
  }
  
  public static void d0(Parcel paramParcel, int paramInt1, int paramInt2) {
    D0(paramParcel, paramInt1, 4);
    paramParcel.writeInt(paramInt2);
  }
  
  public static String e(String paramString, Object paramObject) {
    if (!TextUtils.isEmpty(paramString))
      return paramString; 
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
  
  public static void e0(Parcel paramParcel, int paramInt, long paramLong) {
    D0(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong);
  }
  
  public static <T> T f(T paramT) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException("null reference");
  }
  
  public static void f0(Parcel paramParcel, int paramInt, Long paramLong, boolean paramBoolean) {
    if (paramLong == null) {
      if (paramBoolean)
        D0(paramParcel, paramInt, 0); 
      return;
    } 
    D0(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong.longValue());
  }
  
  public static <T> T g(T paramT, Object paramObject) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(String.valueOf(paramObject));
  }
  
  public static void g0(Parcel paramParcel, int paramInt1, Parcelable paramParcelable, int paramInt2, boolean paramBoolean) {
    if (paramParcelable == null) {
      if (paramBoolean)
        D0(paramParcel, paramInt1, 0); 
      return;
    } 
    paramInt1 = n0(paramParcel, paramInt1);
    paramParcelable.writeToParcel(paramParcel, paramInt2);
    C0(paramParcel, paramInt1);
  }
  
  public static <T> T h(T paramT, String paramString) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(paramString);
  }
  
  public static void h0(Parcel paramParcel, int paramInt, String paramString, boolean paramBoolean) {
    if (paramString == null) {
      if (paramBoolean)
        D0(paramParcel, paramInt, 0); 
      return;
    } 
    paramInt = n0(paramParcel, paramInt);
    paramParcel.writeString(paramString);
    C0(paramParcel, paramInt);
  }
  
  public static void i(boolean paramBoolean, Object paramObject) {
    if (paramBoolean)
      return; 
    throw new IllegalStateException(String.valueOf(paramObject));
  }
  
  public static void i0(Parcel paramParcel, int paramInt, List<String> paramList, boolean paramBoolean) {
    if (paramList == null) {
      if (paramBoolean)
        D0(paramParcel, paramInt, 0); 
      return;
    } 
    paramInt = n0(paramParcel, paramInt);
    paramParcel.writeStringList(paramList);
    C0(paramParcel, paramInt);
  }
  
  public static d<?> j(String paramString1, String paramString2) {
    a a = new a(paramString1, paramString2);
    d.b b = d.a(e.class);
    b.d = 1;
    b.c((g)new c(a));
    return b.b();
  }
  
  public static <T extends Parcelable> void j0(Parcel paramParcel, int paramInt1, T[] paramArrayOfT, int paramInt2, boolean paramBoolean) {
    if (paramArrayOfT == null) {
      if (paramBoolean)
        D0(paramParcel, paramInt1, 0); 
      return;
    } 
    int i = n0(paramParcel, paramInt1);
    int j = paramArrayOfT.length;
    paramParcel.writeInt(j);
    for (paramInt1 = 0; paramInt1 < j; paramInt1++) {
      T t = paramArrayOfT[paramInt1];
      if (t == null) {
        paramParcel.writeInt(0);
      } else {
        w0(paramParcel, t, paramInt2);
      } 
    } 
    C0(paramParcel, i);
  }
  
  public static Bundle k(Parcel paramParcel, int paramInt) {
    int i = T(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    Bundle bundle = paramParcel.readBundle();
    paramParcel.setDataPosition(paramInt + i);
    return bundle;
  }
  
  public static <T extends Parcelable> void k0(Parcel paramParcel, int paramInt, List<T> paramList, boolean paramBoolean) {
    if (paramList == null) {
      if (paramBoolean)
        D0(paramParcel, paramInt, 0); 
      return;
    } 
    int j = n0(paramParcel, paramInt);
    int i = paramList.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++) {
      Parcelable parcelable = (Parcelable)paramList.get(paramInt);
      if (parcelable == null) {
        paramParcel.writeInt(0);
      } else {
        w0(paramParcel, parcelable, 0);
      } 
    } 
    C0(paramParcel, j);
  }
  
  public static Animator l(c paramc, float paramFloat1, float paramFloat2, float paramFloat3) {
    ObjectAnimator objectAnimator = ObjectAnimator.ofObject(paramc, c.c.a, c.b.b, (Object[])new c.e[] { new c.e(paramFloat1, paramFloat2, paramFloat3) });
    c.e e = paramc.getRevealInfo();
    if (e != null) {
      float f = e.c;
      Animator animator = ViewAnimationUtils.createCircularReveal((View)paramc, (int)paramFloat1, (int)paramFloat2, f, paramFloat3);
      AnimatorSet animatorSet = new AnimatorSet();
      animatorSet.playTogether(new Animator[] { (Animator)objectAnimator, animator });
      return (Animator)animatorSet;
    } 
    throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
  }
  
  public static int l0(int paramInt) {
    return (int)(Integer.rotateLeft((int)(paramInt * -862048943L), 15) * 461845907L);
  }
  
  public static d m(int paramInt) {
    return (d)((paramInt != 0) ? ((paramInt != 1) ? new i() : new e()) : new i());
  }
  
  public static int m0(int paramInt1, int paramInt2) {
    if (paramInt1 < 0 || paramInt1 >= paramInt2) {
      String str;
      if (paramInt1 >= 0) {
        if (paramInt2 < 0) {
          StringBuilder stringBuilder = new StringBuilder(26);
          stringBuilder.append("negative size: ");
          stringBuilder.append(paramInt2);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        str = s0("%s (%s) must be less than size (%s)", new Object[] { "index", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      } else {
        str = s0("%s (%s) must not be negative", new Object[] { "index", Integer.valueOf(paramInt1) });
      } 
      throw new IndexOutOfBoundsException(str);
    } 
    return paramInt1;
  }
  
  public static <T extends Parcelable> T n(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator) {
    paramInt = T(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    Parcelable parcelable = (Parcelable)paramCreator.createFromParcel(paramParcel);
    paramParcel.setDataPosition(i + paramInt);
    return (T)parcelable;
  }
  
  public static int n0(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(paramInt | 0xFFFF0000);
    paramParcel.writeInt(0);
    return paramParcel.dataPosition();
  }
  
  public static String o(Parcel paramParcel, int paramInt) {
    int i = T(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    if (i == 0)
      return null; 
    String str = paramParcel.readString();
    paramParcel.setDataPosition(paramInt + i);
    return str;
  }
  
  public static int o0(Set<?> paramSet) {
    Iterator<?> iterator = paramSet.iterator();
    int i;
    for (i = 0; iterator.hasNext(); i = i + b ^ 0xFFFFFFFF ^ 0xFFFFFFFF) {
      byte b;
      paramSet = (Set<?>)iterator.next();
      if (paramSet != null) {
        b = paramSet.hashCode();
      } else {
        b = 0;
      } 
    } 
    return i;
  }
  
  public static ArrayList<String> p(Parcel paramParcel, int paramInt) {
    paramInt = T(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    ArrayList<String> arrayList = paramParcel.createStringArrayList();
    paramParcel.setDataPosition(i + paramInt);
    return arrayList;
  }
  
  public static Status p0(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return new Status(17499, null); 
    String[] arrayOfString = paramString.split(":", 2);
    arrayOfString[0] = arrayOfString[0].trim();
    if (arrayOfString.length > 1 && arrayOfString[1] != null)
      arrayOfString[1] = arrayOfString[1].trim(); 
    List<String> list = Arrays.asList(arrayOfString);
    return (list.size() > 1) ? q0(list.get(0), list.get(1)) : q0(list.get(0), null);
  }
  
  public static <T> T[] q(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator) {
    paramInt = T(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    Object[] arrayOfObject = paramParcel.createTypedArray(paramCreator);
    paramParcel.setDataPosition(i + paramInt);
    return (T[])arrayOfObject;
  }
  
  public static Status q0(String paramString1, String paramString2) {
    short s;
    switch (paramString1.hashCode()) {
      default:
        s = -1;
        break;
      case 2082564316:
        if (paramString1.equals("UNSUPPORTED_TENANT_OPERATION")) {
          s = 49;
          break;
        } 
      case 2063209097:
        if (paramString1.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
          s = 63;
          break;
        } 
      case 1898790704:
        if (paramString1.equals("MISSING_SESSION_INFO")) {
          s = 35;
          break;
        } 
      case 1803454477:
        if (paramString1.equals("MISSING_CONTINUE_URI")) {
          s = 44;
          break;
        } 
      case 1497901284:
        if (paramString1.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
          s = 21;
          break;
        } 
      case 1494923453:
        if (paramString1.equals("INVALID_APP_CREDENTIAL")) {
          s = 19;
          break;
        } 
      case 1442968770:
        if (paramString1.equals("INVALID_PHONE_NUMBER")) {
          s = 32;
          break;
        } 
      case 1433767024:
        if (paramString1.equals("USER_DISABLED")) {
          s = 5;
          break;
        } 
      case 1388786705:
        if (paramString1.equals("INVALID_IDENTIFIER")) {
          s = 6;
          break;
        } 
      case 1226505451:
        if (paramString1.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
          s = 12;
          break;
        } 
      case 1199811910:
        if (paramString1.equals("MISSING_CODE")) {
          s = 33;
          break;
        } 
      case 1141576252:
        if (paramString1.equals("SESSION_EXPIRED")) {
          s = 38;
          break;
        } 
      case 1107081238:
        if (paramString1.equals("<<Network Error>>")) {
          s = 15;
          break;
        } 
      case 1094975491:
        if (paramString1.equals("INVALID_PASSWORD")) {
          s = 11;
          break;
        } 
      case 1072360691:
        if (paramString1.equals("INVALID_CUSTOM_TOKEN")) {
          s = 2;
          break;
        } 
      case 1034932393:
        if (paramString1.equals("INVALID_PENDING_TOKEN")) {
          s = 3;
          break;
        } 
      case 989000548:
        if (paramString1.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
          s = 22;
          break;
        } 
      case 922685102:
        if (paramString1.equals("INVALID_MESSAGE_PAYLOAD")) {
          s = 26;
          break;
        } 
      case 895302372:
        if (paramString1.equals("MISSING_CLIENT_IDENTIFIER")) {
          s = 65;
          break;
        } 
      case 886186878:
        if (paramString1.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
          s = 53;
          break;
        } 
      case 844240628:
        if (paramString1.equals("WEB_CONTEXT_CANCELED")) {
          s = 48;
          break;
        } 
      case 819646646:
        if (paramString1.equals("CREDENTIAL_MISMATCH")) {
          s = 1;
          break;
        } 
      case 799258561:
        if (paramString1.equals("INVALID_PROVIDER_ID")) {
          s = 46;
          break;
        } 
      case 786916712:
        if (paramString1.equals("INVALID_VERIFICATION_PROOF")) {
          s = 37;
          break;
        } 
      case 745638750:
        if (paramString1.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
          s = 56;
          break;
        } 
      case 605031096:
        if (paramString1.equals("REJECTED_CREDENTIAL")) {
          s = 52;
          break;
        } 
      case 582457886:
        if (paramString1.equals("UNVERIFIED_EMAIL")) {
          s = 59;
          break;
        } 
      case 542728406:
        if (paramString1.equals("PASSWORD_LOGIN_DISABLED")) {
          s = 18;
          break;
        } 
      case 492072102:
        if (paramString1.equals("WEB_STORAGE_UNSUPPORTED")) {
          s = 43;
          break;
        } 
      case 491979549:
        if (paramString1.equals("INVALID_ID_TOKEN")) {
          s = 13;
          break;
        } 
      case 483847807:
        if (paramString1.equals("EMAIL_EXISTS")) {
          s = 10;
          break;
        } 
      case 423563023:
        if (paramString1.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
          s = 54;
          break;
        } 
      case 408411681:
        if (paramString1.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
          s = 51;
          break;
        } 
      case 278802867:
        if (paramString1.equals("MISSING_PHONE_NUMBER")) {
          s = 31;
          break;
        } 
      case 269327773:
        if (paramString1.equals("INVALID_SENDER")) {
          s = 27;
          break;
        } 
      case 210308040:
        if (paramString1.equals("UNSUPPORTED_FIRST_FACTOR")) {
          s = 62;
          break;
        } 
      case 15352275:
        if (paramString1.equals("EMAIL_NOT_FOUND")) {
          s = 8;
          break;
        } 
      case -40686718:
        if (paramString1.equals("WEAK_PASSWORD")) {
          s = 16;
          break;
        } 
      case -75433118:
        if (paramString1.equals("USER_NOT_FOUND")) {
          s = 9;
          break;
        } 
      case -122667194:
        if (paramString1.equals("MISSING_MFA_ENROLLMENT_ID")) {
          s = 55;
          break;
        } 
      case -217128228:
        if (paramString1.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
          s = 61;
          break;
        } 
      case -294485423:
        if (paramString1.equals("WEB_INTERNAL_ERROR")) {
          s = 42;
          break;
        } 
      case -333672188:
        if (paramString1.equals("OPERATION_NOT_ALLOWED")) {
          s = 17;
          break;
        } 
      case -595928767:
        if (paramString1.equals("TIMEOUT")) {
          s = 14;
          break;
        } 
      case -646022241:
        if (paramString1.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
          s = 20;
          break;
        } 
      case -736207500:
        if (paramString1.equals("MISSING_PASSWORD")) {
          s = 30;
          break;
        } 
      case -749743758:
        if (paramString1.equals("MFA_ENROLLMENT_NOT_FOUND")) {
          s = 57;
          break;
        } 
      case -828507413:
        if (paramString1.equals("NO_SUCH_PROVIDER")) {
          s = 0;
          break;
        } 
      case -863830559:
        if (paramString1.equals("INVALID_CERT_HASH")) {
          s = 40;
          break;
        } 
      case -974503964:
        if (paramString1.equals("MISSING_OR_INVALID_NONCE")) {
          s = 66;
          break;
        } 
      case -1063710844:
        if (paramString1.equals("ADMIN_ONLY_OPERATION")) {
          s = 58;
          break;
        } 
      case -1112393964:
        if (paramString1.equals("INVALID_EMAIL")) {
          s = 7;
          break;
        } 
      case -1202691903:
        if (paramString1.equals("SECOND_FACTOR_EXISTS")) {
          s = 60;
          break;
        } 
      case -1232010689:
        if (paramString1.equals("INVALID_SESSION_INFO")) {
          s = 36;
          break;
        } 
      case -1340100504:
        if (paramString1.equals("INVALID_TENANT_ID")) {
          s = 50;
          break;
        } 
      case -1345867105:
        if (paramString1.equals("TOKEN_EXPIRED")) {
          s = 23;
          break;
        } 
      case -1421414571:
        if (paramString1.equals("INVALID_CODE")) {
          s = 34;
          break;
        } 
      case -1458751677:
        if (paramString1.equals("MISSING_EMAIL")) {
          s = 29;
          break;
        } 
      case -1583894766:
        if (paramString1.equals("INVALID_OOB_CODE")) {
          s = 24;
          break;
        } 
      case -1587614300:
        if (paramString1.equals("EXPIRED_OOB_CODE")) {
          s = 25;
          break;
        } 
      case -1774756919:
        if (paramString1.equals("WEB_NETWORK_REQUEST_FAILED")) {
          s = 41;
          break;
        } 
      case -1800638118:
        if (paramString1.equals("QUOTA_EXCEEDED")) {
          s = 39;
          break;
        } 
      case -1944433728:
        if (paramString1.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
          s = 45;
          break;
        } 
      case -2001169389:
        if (paramString1.equals("INVALID_IDP_RESPONSE")) {
          s = 4;
          break;
        } 
      case -2005236790:
        if (paramString1.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
          s = 64;
          break;
        } 
      case -2014808264:
        if (paramString1.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
          s = 47;
          break;
        } 
      case -2065866930:
        if (paramString1.equals("INVALID_RECIPIENT_EMAIL")) {
          s = 28;
          break;
        } 
      case -2130504259:
        if (paramString1.equals("USER_CANCELLED")) {
          s = 67;
          break;
        } 
    } 
    switch (s) {
      default:
        s = 17499;
        break;
      case 67:
        s = 18001;
        break;
      case 66:
        s = 17094;
        break;
      case 65:
        s = 17093;
        break;
      case 64:
        s = 17091;
        break;
      case 63:
        s = 17090;
        break;
      case 62:
        s = 17089;
        break;
      case 61:
        s = 17088;
        break;
      case 60:
        s = 17087;
        break;
      case 59:
        s = 17086;
        break;
      case 58:
        s = 17085;
        break;
      case 57:
        s = 17084;
        break;
      case 56:
        s = 17083;
        break;
      case 55:
        s = 17082;
        break;
      case 54:
        s = 17081;
        break;
      case 53:
        s = 17078;
        break;
      case 52:
        s = 17075;
        break;
      case 51:
        s = 17074;
        break;
      case 50:
        s = 17079;
        break;
      case 49:
        s = 17073;
        break;
      case 48:
        s = 17058;
        break;
      case 47:
        s = 17057;
        break;
      case 46:
        s = 17071;
        break;
      case 45:
        s = 17068;
        break;
      case 44:
        s = 17040;
        break;
      case 43:
        s = 17065;
        break;
      case 42:
        s = 17062;
        break;
      case 41:
        s = 17061;
        break;
      case 40:
        s = 17064;
        break;
      case 39:
        s = 17052;
        break;
      case 38:
        s = 17051;
        break;
      case 37:
        s = 17049;
        break;
      case 36:
        s = 17046;
        break;
      case 35:
        s = 17045;
        break;
      case 34:
        s = 17044;
        break;
      case 33:
        s = 17043;
        break;
      case 32:
        s = 17042;
        break;
      case 31:
        s = 17041;
        break;
      case 30:
        s = 17035;
        break;
      case 29:
        s = 17034;
        break;
      case 28:
        s = 17033;
        break;
      case 27:
        s = 17032;
        break;
      case 26:
        s = 17031;
        break;
      case 25:
        s = 17029;
        break;
      case 24:
        s = 17030;
        break;
      case 23:
        s = 17021;
        break;
      case 21:
      case 22:
        s = 17010;
        break;
      case 20:
        s = 17014;
        break;
      case 19:
        s = 17028;
        break;
      case 17:
      case 18:
        s = 17006;
        break;
      case 16:
        s = 17026;
        break;
      case 14:
      case 15:
        s = 17020;
        break;
      case 13:
        s = 17017;
        break;
      case 12:
        s = 17025;
        break;
      case 11:
        s = 17009;
        break;
      case 10:
        s = 17007;
        break;
      case 8:
      case 9:
        s = 17011;
        break;
      case 6:
      case 7:
        s = 17008;
        break;
      case 5:
        s = 17005;
        break;
      case 3:
      case 4:
        s = 17004;
        break;
      case 2:
        s = 17000;
        break;
      case 1:
        s = 17002;
        break;
      case 0:
        s = 17016;
        break;
    } 
    if (s == 17499) {
      if (paramString2 != null) {
        int i = paramString1.length();
        StringBuilder stringBuilder = new StringBuilder(paramString2.length() + i + 1);
        stringBuilder.append(paramString1);
        stringBuilder.append(":");
        stringBuilder.append(paramString2);
        return new Status(s, stringBuilder.toString());
      } 
      return new Status(s, paramString1);
    } 
    return new Status(s, paramString2);
  }
  
  public static <T> ArrayList<T> r(Parcel paramParcel, int paramInt, Parcelable.Creator<T> paramCreator) {
    paramInt = T(paramParcel, paramInt);
    int i = paramParcel.dataPosition();
    if (paramInt == 0)
      return null; 
    ArrayList<T> arrayList = paramParcel.createTypedArrayList(paramCreator);
    paramParcel.setDataPosition(i + paramInt);
    return arrayList;
  }
  
  public static n1 r0(b paramb, String paramString) {
    r r;
    d d;
    a0 a0;
    c.c.b.h.q q1;
    z z;
    f(paramb);
    if (r.class.isAssignableFrom(paramb.getClass())) {
      r = (r)paramb;
      f(r);
      return new n1(r.b, r.c, "google.com", null, null, paramString, null, null);
    } 
    if (d.class.isAssignableFrom(r.getClass())) {
      d = (d)r;
      f(d);
      return new n1(null, d.b, "facebook.com", null, null, paramString, null, null);
    } 
    if (a0.class.isAssignableFrom(d.getClass())) {
      a0 = (a0)d;
      f(a0);
      return new n1(null, a0.b, "twitter.com", a0.c, null, paramString, null, null);
    } 
    if (c.c.b.h.q.class.isAssignableFrom(a0.getClass())) {
      q1 = (c.c.b.h.q)a0;
      f(q1);
      return new n1(null, q1.b, "github.com", null, null, paramString, null, null);
    } 
    if (z.class.isAssignableFrom(q1.getClass())) {
      z = (z)q1;
      f(z);
      return new n1(null, null, "playgames.google.com", null, z.b, paramString, null, null);
    } 
    if (g0.class.isAssignableFrom(z.getClass())) {
      g0 g0 = (g0)z;
      f(g0);
      n1 n1 = g0.e;
      if (n1 == null)
        n1 = new n1(g0.c, g0.d, g0.b, g0.g, null, paramString, g0.f, g0.h); 
      return n1;
    } 
    throw new IllegalArgumentException("Unsupported credential type.");
  }
  
  public static <T extends c> T s(byte[] paramArrayOfbyte, Parcelable.Creator<T> paramCreator) {
    f(paramCreator);
    Parcel parcel = Parcel.obtain();
    parcel.unmarshall(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    parcel.setDataPosition(0);
    c c = (c)paramCreator.createFromParcel(parcel);
    parcel.recycle();
    return (T)c;
  }
  
  public static String s0(@NullableDecl String paramString, @NullableDecl Object... paramVarArgs) {
    int k = 0;
    int i;
    for (i = 0; i < paramVarArgs.length; i++) {
      String str;
      Object object = paramVarArgs[i];
      if (object == null) {
        str = "null";
      } else {
        try {
          str = object.toString();
        } catch (Exception exception) {
          str = object.getClass().getName();
          String str1 = Integer.toHexString(System.identityHashCode(object));
          int m = str.length();
          object = new StringBuilder(String.valueOf(str1).length() + m + 1);
          object.append(str);
          object.append('@');
          object.append(str1);
          object = object.toString();
          Logger logger = Logger.getLogger("com.google.common.base.Strings");
          Level level = Level.WARNING;
          str = String.valueOf(object);
          if (str.length() != 0) {
            str = "Exception during lenientFormat for ".concat(str);
          } else {
            str = new String("Exception during lenientFormat for ");
          } 
          logger.logp(level, "com.google.common.base.Strings", "lenientToString", str, exception);
          str = exception.getClass().getName();
          m = String.valueOf(object).length();
          StringBuilder stringBuilder1 = new StringBuilder(str.length() + m + 9);
          stringBuilder1.append("<");
          stringBuilder1.append((String)object);
          stringBuilder1.append(" threw ");
          stringBuilder1.append(str);
          stringBuilder1.append(">");
          str = stringBuilder1.toString();
        } 
      } 
      paramVarArgs[i] = str;
    } 
    i = paramString.length();
    StringBuilder stringBuilder = new StringBuilder(paramVarArgs.length * 16 + i);
    int j = 0;
    i = k;
    while (i < paramVarArgs.length) {
      k = paramString.indexOf("%s", j);
      if (k != -1) {
        stringBuilder.append(paramString, j, k);
        stringBuilder.append(paramVarArgs[i]);
        j = k + 2;
        i++;
      } 
    } 
    stringBuilder.append(paramString, j, paramString.length());
    if (i < paramVarArgs.length) {
      stringBuilder.append(" [");
      j = i + 1;
      stringBuilder.append(paramVarArgs[i]);
      for (i = j; i < paramVarArgs.length; i++) {
        stringBuilder.append(", ");
        stringBuilder.append(paramVarArgs[i]);
      } 
      stringBuilder.append(']');
    } 
    return stringBuilder.toString();
  }
  
  public static String t() {
    try {
      return KotlinVersion.CURRENT.toString();
    } catch (NoClassDefFoundError noClassDefFoundError) {
      return null;
    } 
  }
  
  public static List<s> t0(List<b1> paramList) {
    if (paramList == null || paramList.isEmpty())
      return (List<s>)n.h(); 
    ArrayList<y> arrayList = new ArrayList();
    for (b1 b1 : paramList) {
      y y;
      paramList = null;
      if (b1 != null && !TextUtils.isEmpty(b1.b))
        y = new y(b1.c, b1.d, b1.e, b1.b); 
      if (y != null)
        arrayList.add(y); 
    } 
    return (List)arrayList;
  }
  
  public static float u(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    return (float)Math.hypot((paramFloat3 - paramFloat1), (paramFloat4 - paramFloat2));
  }
  
  public static void u0(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 < 0 || paramInt2 < paramInt1 || paramInt2 > paramInt3) {
      String str;
      if (paramInt1 >= 0 && paramInt1 <= paramInt3) {
        if (paramInt2 < 0 || paramInt2 > paramInt3) {
          String str1 = B0(paramInt2, paramInt3, "end index");
          throw new IndexOutOfBoundsException(str1);
        } 
        str = s0("end index (%s) must not be less than start index (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      } else {
        str = B0(paramInt1, paramInt3, "start index");
      } 
      throw new IndexOutOfBoundsException(str);
    } 
  }
  
  public static void v(Parcel paramParcel, int paramInt) {
    if (paramParcel.dataPosition() == paramInt)
      return; 
    StringBuilder stringBuilder = new StringBuilder(37);
    stringBuilder.append("Overread allowed size end=");
    stringBuilder.append(paramInt);
    throw new b(stringBuilder.toString(), paramParcel);
  }
  
  public static void v0(Parcel paramParcel, int paramInt1, int paramInt2) {
    paramInt1 = T(paramParcel, paramInt1);
    if (paramInt1 == paramInt2)
      return; 
    String str = Integer.toHexString(paramInt1);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 46);
    stringBuilder.append("Expected size ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" got ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" (0x");
    stringBuilder.append(str);
    stringBuilder.append(")");
    throw new b(stringBuilder.toString(), paramParcel);
  }
  
  public static <TResult> d<TResult> w(Exception paramException) {
    t t = new t();
    t.c(paramException);
    return (d<TResult>)t;
  }
  
  public static <T extends Parcelable> void w0(Parcel paramParcel, T paramT, int paramInt) {
    int i = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int j = paramParcel.dataPosition();
    paramT.writeToParcel(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    paramParcel.setDataPosition(i);
    paramParcel.writeInt(paramInt - j);
    paramParcel.setDataPosition(paramInt);
  }
  
  public static int x(Context paramContext, int paramInt1, int paramInt2) {
    TypedValue typedValue = U(paramContext, paramInt1);
    return (typedValue != null) ? typedValue.data : paramInt2;
  }
  
  public static void x0(Object paramObject1, Object paramObject2) {
    if (paramObject1 != null) {
      if (paramObject2 != null)
        return; 
      paramObject1 = String.valueOf(paramObject1);
      paramObject2 = new StringBuilder(paramObject1.length() + 26);
      paramObject2.append("null value in entry: ");
      paramObject2.append((String)paramObject1);
      paramObject2.append("=null");
      throw new NullPointerException(paramObject2.toString());
    } 
    paramObject1 = String.valueOf(paramObject2);
    paramObject2 = new StringBuilder(paramObject1.length() + 24);
    paramObject2.append("null key in entry: null=");
    paramObject2.append((String)paramObject1);
    throw new NullPointerException(paramObject2.toString());
  }
  
  public static int y(View paramView, int paramInt) {
    return W(paramView.getContext(), paramInt, paramView.getClass().getCanonicalName());
  }
  
  public static boolean y0(@NullableDecl Object paramObject1, @NullableDecl Object paramObject2) {
    return (paramObject1 == paramObject2 || (paramObject1 != null && paramObject1.equals(paramObject2)));
  }
  
  public static ColorStateList z(Context paramContext, TypedArray paramTypedArray, int paramInt) {
    if (paramTypedArray.hasValue(paramInt)) {
      int i = paramTypedArray.getResourceId(paramInt, 0);
      if (i != 0) {
        ColorStateList colorStateList = a.a(paramContext, i);
        if (colorStateList != null)
          return colorStateList; 
      } 
    } 
    return paramTypedArray.getColorStateList(paramInt);
  }
  
  public static void z0(Parcel paramParcel, int paramInt1, int paramInt2) {
    if (paramInt1 == paramInt2)
      return; 
    String str = Integer.toHexString(paramInt1);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 46);
    stringBuilder.append("Expected size ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" got ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" (0x");
    stringBuilder.append(str);
    stringBuilder.append(")");
    throw new b(stringBuilder.toString(), paramParcel);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\c\l\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */