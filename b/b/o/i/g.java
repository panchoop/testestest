package b.b.o.i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import b.i.h.a.a;
import b.i.m.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class g implements a {
  public static final int[] z = new int[] { 1, 4, 5, 3, 2, 0 };
  
  public final Context a;
  
  public final Resources b;
  
  public boolean c;
  
  public boolean d;
  
  public a e;
  
  public ArrayList<i> f;
  
  public ArrayList<i> g;
  
  public boolean h;
  
  public ArrayList<i> i;
  
  public ArrayList<i> j;
  
  public boolean k;
  
  public int l;
  
  public CharSequence m;
  
  public Drawable n;
  
  public View o;
  
  public boolean p;
  
  public boolean q;
  
  public boolean r;
  
  public boolean s;
  
  public boolean t;
  
  public ArrayList<i> u;
  
  public CopyOnWriteArrayList<WeakReference<m>> v;
  
  public i w;
  
  public boolean x;
  
  public boolean y;
  
  public g(Context paramContext) {
    boolean bool2 = false;
    this.l = 0;
    this.p = false;
    this.q = false;
    this.r = false;
    this.s = false;
    this.t = false;
    this.u = new ArrayList<i>();
    this.v = new CopyOnWriteArrayList<WeakReference<m>>();
    this.x = false;
    this.a = paramContext;
    this.b = paramContext.getResources();
    this.f = new ArrayList<i>();
    this.g = new ArrayList<i>();
    this.h = true;
    this.i = new ArrayList<i>();
    this.j = new ArrayList<i>();
    this.k = true;
    boolean bool1 = bool2;
    if ((this.b.getConfiguration()).keyboard != 1) {
      bool1 = bool2;
      if (p.d(ViewConfiguration.get(this.a), this.a))
        bool1 = true; 
    } 
    this.d = bool1;
  }
  
  public MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    int j = (0xFFFF0000 & paramInt3) >> 16;
    if (j >= 0) {
      int[] arrayOfInt = z;
      if (j < arrayOfInt.length) {
        j = arrayOfInt[j] << 16 | 0xFFFF & paramInt3;
        i i1 = new i(this, paramInt1, paramInt2, paramInt3, j, paramCharSequence, this.l);
        ArrayList<i> arrayList = this.f;
        paramInt1 = arrayList.size();
        while (true) {
          paramInt2 = paramInt1 - 1;
          if (paramInt2 >= 0) {
            paramInt1 = paramInt2;
            if (((i)arrayList.get(paramInt2)).d <= j) {
              paramInt1 = paramInt2 + 1;
              arrayList.add(paramInt1, i1);
              q(true);
              return (MenuItem)i1;
            } 
            continue;
          } 
          paramInt1 = 0;
          arrayList.add(paramInt1, i1);
          q(true);
          return (MenuItem)i1;
        } 
      } 
    } 
    throw new IllegalArgumentException("order does not contain a valid category.");
  }
  
  public MenuItem add(int paramInt) {
    return a(0, 0, 0, this.b.getString(paramInt));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return a(paramInt1, paramInt2, paramInt3, this.b.getString(paramInt4));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public MenuItem add(CharSequence paramCharSequence) {
    return a(0, 0, 0, paramCharSequence);
  }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem) {
    byte b1;
    PackageManager packageManager = this.a.getPackageManager();
    byte b3 = 0;
    List<ResolveInfo> list = packageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    if (list != null) {
      b1 = list.size();
    } else {
      b1 = 0;
    } 
    byte b2 = b3;
    if ((paramInt4 & 0x1) == 0) {
      removeGroup(paramInt1);
      b2 = b3;
    } 
    while (b2 < b1) {
      ResolveInfo resolveInfo = list.get(b2);
      paramInt4 = resolveInfo.specificIndex;
      if (paramInt4 < 0) {
        intent = paramIntent;
      } else {
        intent = paramArrayOfIntent[paramInt4];
      } 
      Intent intent = new Intent(intent);
      ActivityInfo activityInfo = resolveInfo.activityInfo;
      intent.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
      MenuItem menuItem = a(paramInt1, paramInt2, paramInt3, resolveInfo.loadLabel(packageManager));
      Drawable drawable = resolveInfo.loadIcon(packageManager);
      i i1 = (i)menuItem;
      i1.setIcon(drawable);
      i1.setIntent(intent);
      if (paramArrayOfMenuItem != null) {
        paramInt4 = resolveInfo.specificIndex;
        if (paramInt4 >= 0)
          paramArrayOfMenuItem[paramInt4] = (MenuItem)i1; 
      } 
      b2++;
    } 
    return b1;
  }
  
  public SubMenu addSubMenu(int paramInt) {
    return addSubMenu(0, 0, 0, this.b.getString(paramInt));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return addSubMenu(paramInt1, paramInt2, paramInt3, this.b.getString(paramInt4));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {
    i i1 = (i)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    r r = new r(this.a, this, i1);
    i1.o = r;
    r.setHeaderTitle(i1.e);
    return r;
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence) {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public void b(m paramm, Context paramContext) {
    this.v.add(new WeakReference<m>(paramm));
    paramm.j(paramContext, this);
    this.k = true;
  }
  
  public final void c(boolean paramBoolean) {
    if (this.t)
      return; 
    this.t = true;
    for (WeakReference<m> weakReference : this.v) {
      m m = weakReference.get();
      if (m == null) {
        this.v.remove(weakReference);
        continue;
      } 
      m.b(this, paramBoolean);
    } 
    this.t = false;
  }
  
  public void clear() {
    i i1 = this.w;
    if (i1 != null)
      d(i1); 
    this.f.clear();
    q(true);
  }
  
  public void clearHeader() {
    this.n = null;
    this.m = null;
    this.o = null;
    q(false);
  }
  
  public void close() {
    c(true);
  }
  
  public boolean d(i parami) {
    boolean bool4 = this.v.isEmpty();
    boolean bool1 = false;
    boolean bool3 = false;
    boolean bool2 = bool1;
    if (!bool4)
      if (this.w != parami) {
        bool2 = bool1;
      } else {
        z();
        Iterator<WeakReference<m>> iterator = this.v.iterator();
        bool2 = bool3;
        while (true) {
          bool1 = bool2;
          if (iterator.hasNext()) {
            WeakReference<m> weakReference = iterator.next();
            m m = weakReference.get();
            if (m == null) {
              this.v.remove(weakReference);
              continue;
            } 
            bool1 = m.k(this, parami);
            bool2 = bool1;
            if (bool1)
              break; 
            continue;
          } 
          break;
        } 
        y();
        bool2 = bool1;
        if (bool1) {
          this.w = null;
          bool2 = bool1;
        } 
      }  
    return bool2;
  }
  
  public boolean e(g paramg, MenuItem paramMenuItem) {
    boolean bool;
    a a1 = this.e;
    if (a1 != null && a1.b(paramg, paramMenuItem)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean f(i parami) {
    boolean bool2 = this.v.isEmpty();
    boolean bool1 = false;
    if (bool2)
      return false; 
    z();
    Iterator<WeakReference<m>> iterator = this.v.iterator();
    while (true) {
      bool2 = bool1;
      if (iterator.hasNext()) {
        WeakReference<m> weakReference = iterator.next();
        m m = weakReference.get();
        if (m == null) {
          this.v.remove(weakReference);
          continue;
        } 
        bool2 = m.c(this, parami);
        bool1 = bool2;
        if (bool2)
          break; 
        continue;
      } 
      break;
    } 
    y();
    if (bool2)
      this.w = parami; 
    return bool2;
  }
  
  public MenuItem findItem(int paramInt) {
    int j = size();
    for (byte b = 0; b < j; b++) {
      i i1 = this.f.get(b);
      if (i1.a == paramInt)
        return (MenuItem)i1; 
      if (i1.hasSubMenu()) {
        MenuItem menuItem = i1.o.findItem(paramInt);
        if (menuItem != null)
          return menuItem; 
      } 
    } 
    return null;
  }
  
  public i g(int paramInt, KeyEvent paramKeyEvent) {
    ArrayList<i> arrayList = this.u;
    arrayList.clear();
    h(arrayList, paramInt, paramKeyEvent);
    if (arrayList.isEmpty())
      return null; 
    int k = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
    paramKeyEvent.getKeyData(keyData);
    int j = arrayList.size();
    if (j == 1)
      return arrayList.get(0); 
    boolean bool = n();
    for (byte b = 0; b < j; b++) {
      char c;
      i i1 = arrayList.get(b);
      if (bool) {
        c = i1.j;
      } else {
        c = i1.h;
      } 
      if ((c == keyData.meta[0] && (k & 0x2) == 0) || (c == keyData.meta[2] && (k & 0x2) != 0) || (bool && c == '\b' && paramInt == 67))
        return i1; 
    } 
    return null;
  }
  
  public MenuItem getItem(int paramInt) {
    return (MenuItem)this.f.get(paramInt);
  }
  
  public void h(List<i> paramList, int paramInt, KeyEvent paramKeyEvent) {
    boolean bool = n();
    int k = paramKeyEvent.getModifiers();
    KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
    if (!paramKeyEvent.getKeyData(keyData) && paramInt != 67)
      return; 
    int j = this.f.size();
    for (byte b = 0; b < j; b++) {
      char c;
      int m;
      i i1 = this.f.get(b);
      if (i1.hasSubMenu())
        i1.o.h(paramList, paramInt, paramKeyEvent); 
      if (bool) {
        c = i1.j;
      } else {
        c = i1.h;
      } 
      if (bool) {
        m = i1.k;
      } else {
        m = i1.i;
      } 
      if ((k & 0x1100F) == (m & 0x1100F)) {
        m = 1;
      } else {
        m = 0;
      } 
      if (m != 0 && c != '\000') {
        char[] arrayOfChar = keyData.meta;
        if ((c == arrayOfChar[0] || c == arrayOfChar[2] || (bool && c == '\b' && paramInt == 67)) && i1.isEnabled())
          paramList.add(i1); 
      } 
    } 
  }
  
  public boolean hasVisibleItems() {
    if (this.y)
      return true; 
    int j = size();
    for (byte b = 0; b < j; b++) {
      if (((i)this.f.get(b)).isVisible())
        return true; 
    } 
    return false;
  }
  
  public void i() {
    ArrayList<i> arrayList = l();
    if (!this.k)
      return; 
    Iterator<WeakReference<m>> iterator = this.v.iterator();
    boolean bool;
    for (bool = false; iterator.hasNext(); bool |= m.g()) {
      WeakReference<m> weakReference = iterator.next();
      m m = weakReference.get();
      if (m == null) {
        this.v.remove(weakReference);
        continue;
      } 
    } 
    if (bool) {
      this.i.clear();
      this.j.clear();
      int j = arrayList.size();
      for (bool = false; bool < j; bool++) {
        ArrayList<i> arrayList1;
        i i1 = arrayList.get(bool);
        if (i1.g()) {
          arrayList1 = this.i;
        } else {
          arrayList1 = this.j;
        } 
        arrayList1.add(i1);
      } 
    } else {
      this.i.clear();
      this.j.clear();
      this.j.addAll(l());
    } 
    this.k = false;
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent) {
    boolean bool;
    if (g(paramInt, paramKeyEvent) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public String j() {
    return "android:menu:actionviewstates";
  }
  
  public g k() {
    return this;
  }
  
  public ArrayList<i> l() {
    if (!this.h)
      return this.g; 
    this.g.clear();
    int j = this.f.size();
    for (byte b = 0; b < j; b++) {
      i i1 = this.f.get(b);
      if (i1.isVisible())
        this.g.add(i1); 
    } 
    this.h = false;
    this.k = true;
    return this.g;
  }
  
  public boolean m() {
    return this.x;
  }
  
  public boolean n() {
    return this.c;
  }
  
  public boolean o() {
    return this.d;
  }
  
  public void p() {
    this.k = true;
    q(true);
  }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2) {
    return r(findItem(paramInt1), paramInt2);
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2) {
    boolean bool;
    i i1 = g(paramInt1, paramKeyEvent);
    if (i1 != null) {
      bool = s((MenuItem)i1, null, paramInt2);
    } else {
      bool = false;
    } 
    if ((paramInt2 & 0x2) != 0)
      c(true); 
    return bool;
  }
  
  public void q(boolean paramBoolean) {
    if (!this.p) {
      if (paramBoolean) {
        this.h = true;
        this.k = true;
      } 
      if (!this.v.isEmpty()) {
        z();
        for (WeakReference<m> weakReference : this.v) {
          m m = weakReference.get();
          if (m == null) {
            this.v.remove(weakReference);
            continue;
          } 
          m.h(paramBoolean);
        } 
        y();
      } 
    } else {
      this.q = true;
      if (paramBoolean)
        this.r = true; 
    } 
  }
  
  public boolean r(MenuItem paramMenuItem, int paramInt) {
    return s(paramMenuItem, null, paramInt);
  }
  
  public void removeGroup(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual size : ()I
    //   4: istore_3
    //   5: iconst_0
    //   6: istore_2
    //   7: iload_2
    //   8: iload_3
    //   9: if_icmpge -> 39
    //   12: aload_0
    //   13: getfield f : Ljava/util/ArrayList;
    //   16: iload_2
    //   17: invokevirtual get : (I)Ljava/lang/Object;
    //   20: checkcast b/b/o/i/i
    //   23: getfield b : I
    //   26: iload_1
    //   27: if_icmpne -> 33
    //   30: goto -> 41
    //   33: iinc #2, 1
    //   36: goto -> 7
    //   39: iconst_m1
    //   40: istore_2
    //   41: iload_2
    //   42: iflt -> 99
    //   45: aload_0
    //   46: getfield f : Ljava/util/ArrayList;
    //   49: invokevirtual size : ()I
    //   52: istore #4
    //   54: iconst_0
    //   55: istore_3
    //   56: iload_3
    //   57: iload #4
    //   59: iload_2
    //   60: isub
    //   61: if_icmpge -> 94
    //   64: aload_0
    //   65: getfield f : Ljava/util/ArrayList;
    //   68: iload_2
    //   69: invokevirtual get : (I)Ljava/lang/Object;
    //   72: checkcast b/b/o/i/i
    //   75: getfield b : I
    //   78: iload_1
    //   79: if_icmpne -> 94
    //   82: aload_0
    //   83: iload_2
    //   84: iconst_0
    //   85: invokevirtual t : (IZ)V
    //   88: iinc #3, 1
    //   91: goto -> 56
    //   94: aload_0
    //   95: iconst_1
    //   96: invokevirtual q : (Z)V
    //   99: return
  }
  
  public void removeItem(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual size : ()I
    //   4: istore_3
    //   5: iconst_0
    //   6: istore_2
    //   7: iload_2
    //   8: iload_3
    //   9: if_icmpge -> 39
    //   12: aload_0
    //   13: getfield f : Ljava/util/ArrayList;
    //   16: iload_2
    //   17: invokevirtual get : (I)Ljava/lang/Object;
    //   20: checkcast b/b/o/i/i
    //   23: getfield a : I
    //   26: iload_1
    //   27: if_icmpne -> 33
    //   30: goto -> 41
    //   33: iinc #2, 1
    //   36: goto -> 7
    //   39: iconst_m1
    //   40: istore_2
    //   41: aload_0
    //   42: iload_2
    //   43: iconst_1
    //   44: invokevirtual t : (IZ)V
    //   47: return
  }
  
  public boolean s(MenuItem paramMenuItem, m paramm, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: checkcast b/b/o/i/i
    //   4: astore_1
    //   5: iconst_0
    //   6: istore #7
    //   8: iconst_0
    //   9: istore #6
    //   11: aload_1
    //   12: ifnull -> 449
    //   15: aload_1
    //   16: invokevirtual isEnabled : ()Z
    //   19: ifne -> 25
    //   22: goto -> 449
    //   25: aload_1
    //   26: getfield p : Landroid/view/MenuItem$OnMenuItemClickListener;
    //   29: astore #8
    //   31: aload #8
    //   33: ifnull -> 50
    //   36: aload #8
    //   38: aload_1
    //   39: invokeinterface onMenuItemClick : (Landroid/view/MenuItem;)Z
    //   44: ifeq -> 50
    //   47: goto -> 135
    //   50: aload_1
    //   51: getfield n : Lb/b/o/i/g;
    //   54: astore #8
    //   56: aload #8
    //   58: aload #8
    //   60: aload_1
    //   61: invokevirtual e : (Lb/b/o/i/g;Landroid/view/MenuItem;)Z
    //   64: ifeq -> 70
    //   67: goto -> 135
    //   70: aload_1
    //   71: getfield g : Landroid/content/Intent;
    //   74: astore #8
    //   76: aload #8
    //   78: ifnull -> 110
    //   81: aload_1
    //   82: getfield n : Lb/b/o/i/g;
    //   85: getfield a : Landroid/content/Context;
    //   88: aload #8
    //   90: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   93: goto -> 135
    //   96: astore #8
    //   98: ldc_w 'MenuItemImpl'
    //   101: ldc_w 'Can't find activity to handle intent; ignoring'
    //   104: aload #8
    //   106: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   109: pop
    //   110: aload_1
    //   111: getfield A : Lb/i/m/b;
    //   114: astore #8
    //   116: aload #8
    //   118: ifnull -> 141
    //   121: aload #8
    //   123: checkcast b/b/o/i/j$a
    //   126: getfield b : Landroid/view/ActionProvider;
    //   129: invokevirtual onPerformDefaultAction : ()Z
    //   132: ifeq -> 141
    //   135: iconst_1
    //   136: istore #5
    //   138: goto -> 144
    //   141: iconst_0
    //   142: istore #5
    //   144: aload_1
    //   145: getfield A : Lb/i/m/b;
    //   148: astore #8
    //   150: aload #8
    //   152: ifnull -> 175
    //   155: aload #8
    //   157: checkcast b/b/o/i/j$a
    //   160: getfield b : Landroid/view/ActionProvider;
    //   163: invokevirtual hasSubMenu : ()Z
    //   166: ifeq -> 175
    //   169: iconst_1
    //   170: istore #4
    //   172: goto -> 178
    //   175: iconst_0
    //   176: istore #4
    //   178: aload_1
    //   179: invokevirtual f : ()Z
    //   182: ifeq -> 206
    //   185: iload #5
    //   187: aload_1
    //   188: invokevirtual expandActionView : ()Z
    //   191: ior
    //   192: istore #5
    //   194: iload #5
    //   196: istore #6
    //   198: iload #5
    //   200: ifeq -> 446
    //   203: goto -> 437
    //   206: aload_1
    //   207: invokevirtual hasSubMenu : ()Z
    //   210: ifne -> 234
    //   213: iload #4
    //   215: ifeq -> 221
    //   218: goto -> 234
    //   221: iload #5
    //   223: istore #6
    //   225: iload_3
    //   226: iconst_1
    //   227: iand
    //   228: ifne -> 446
    //   231: goto -> 437
    //   234: iload_3
    //   235: iconst_4
    //   236: iand
    //   237: ifne -> 245
    //   240: aload_0
    //   241: iconst_0
    //   242: invokevirtual c : (Z)V
    //   245: aload_1
    //   246: invokevirtual hasSubMenu : ()Z
    //   249: ifne -> 283
    //   252: new b/b/o/i/r
    //   255: dup
    //   256: aload_0
    //   257: getfield a : Landroid/content/Context;
    //   260: aload_0
    //   261: aload_1
    //   262: invokespecial <init> : (Landroid/content/Context;Lb/b/o/i/g;Lb/b/o/i/i;)V
    //   265: astore #9
    //   267: aload_1
    //   268: aload #9
    //   270: putfield o : Lb/b/o/i/r;
    //   273: aload #9
    //   275: aload_1
    //   276: getfield e : Ljava/lang/CharSequence;
    //   279: invokevirtual setHeaderTitle : (Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    //   282: pop
    //   283: aload_1
    //   284: getfield o : Lb/b/o/i/r;
    //   287: astore_1
    //   288: iload #4
    //   290: ifeq -> 317
    //   293: aload #8
    //   295: checkcast b/b/o/i/j$a
    //   298: astore #8
    //   300: aload #8
    //   302: getfield b : Landroid/view/ActionProvider;
    //   305: aload #8
    //   307: getfield c : Lb/b/o/i/j;
    //   310: aload_1
    //   311: invokevirtual d : (Landroid/view/SubMenu;)Landroid/view/SubMenu;
    //   314: invokevirtual onPrepareSubMenu : (Landroid/view/SubMenu;)V
    //   317: aload_0
    //   318: getfield v : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   321: invokevirtual isEmpty : ()Z
    //   324: ifeq -> 330
    //   327: goto -> 421
    //   330: aload_2
    //   331: ifnull -> 343
    //   334: aload_2
    //   335: aload_1
    //   336: invokeinterface f : (Lb/b/o/i/r;)Z
    //   341: istore #6
    //   343: aload_0
    //   344: getfield v : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   347: invokevirtual iterator : ()Ljava/util/Iterator;
    //   350: astore #8
    //   352: iload #6
    //   354: istore #7
    //   356: aload #8
    //   358: invokeinterface hasNext : ()Z
    //   363: ifeq -> 421
    //   366: aload #8
    //   368: invokeinterface next : ()Ljava/lang/Object;
    //   373: checkcast java/lang/ref/WeakReference
    //   376: astore_2
    //   377: aload_2
    //   378: invokevirtual get : ()Ljava/lang/Object;
    //   381: checkcast b/b/o/i/m
    //   384: astore #9
    //   386: aload #9
    //   388: ifnonnull -> 403
    //   391: aload_0
    //   392: getfield v : Ljava/util/concurrent/CopyOnWriteArrayList;
    //   395: aload_2
    //   396: invokevirtual remove : (Ljava/lang/Object;)Z
    //   399: pop
    //   400: goto -> 352
    //   403: iload #6
    //   405: ifne -> 352
    //   408: aload #9
    //   410: aload_1
    //   411: invokeinterface f : (Lb/b/o/i/r;)Z
    //   416: istore #6
    //   418: goto -> 352
    //   421: iload #5
    //   423: iload #7
    //   425: ior
    //   426: istore #5
    //   428: iload #5
    //   430: istore #6
    //   432: iload #5
    //   434: ifne -> 446
    //   437: aload_0
    //   438: iconst_1
    //   439: invokevirtual c : (Z)V
    //   442: iload #5
    //   444: istore #6
    //   446: iload #6
    //   448: ireturn
    //   449: iconst_0
    //   450: ireturn
    // Exception table:
    //   from	to	target	type
    //   81	93	96	android/content/ActivityNotFoundException
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    int j = this.f.size();
    for (byte b = 0; b < j; b++) {
      i i1 = this.f.get(b);
      if (i1.b == paramInt) {
        boolean bool;
        int k = i1.x;
        if (paramBoolean2) {
          bool = true;
        } else {
          bool = false;
        } 
        i1.x = k & 0xFFFFFFFB | bool;
        i1.setCheckable(paramBoolean1);
      } 
    } 
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean) {
    this.x = paramBoolean;
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean) {
    int j = this.f.size();
    for (byte b = 0; b < j; b++) {
      i i1 = this.f.get(b);
      if (i1.b == paramInt)
        i1.setEnabled(paramBoolean); 
    } 
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean) {
    int j = this.f.size();
    byte b = 0;
    boolean bool;
    for (bool = false; b < j; bool = bool1) {
      i i1 = this.f.get(b);
      boolean bool1 = bool;
      if (i1.b == paramInt) {
        bool1 = bool;
        if (i1.l(paramBoolean))
          bool1 = true; 
      } 
      b++;
    } 
    if (bool)
      q(true); 
  }
  
  public void setQwertyMode(boolean paramBoolean) {
    this.c = paramBoolean;
    q(false);
  }
  
  public int size() {
    return this.f.size();
  }
  
  public final void t(int paramInt, boolean paramBoolean) {
    if (paramInt >= 0 && paramInt < this.f.size()) {
      this.f.remove(paramInt);
      if (paramBoolean)
        q(true); 
    } 
  }
  
  public void u(m paramm) {
    for (WeakReference<m> weakReference : this.v) {
      m m1 = weakReference.get();
      if (m1 == null || m1 == paramm)
        this.v.remove(weakReference); 
    } 
  }
  
  public void v(Bundle paramBundle) {
    if (paramBundle == null)
      return; 
    SparseArray sparseArray = paramBundle.getSparseParcelableArray(j());
    int k = size();
    int j;
    for (j = 0; j < k; j++) {
      MenuItem menuItem = getItem(j);
      View view = menuItem.getActionView();
      if (view != null && view.getId() != -1)
        view.restoreHierarchyState(sparseArray); 
      if (menuItem.hasSubMenu())
        ((r)menuItem.getSubMenu()).v(paramBundle); 
    } 
    j = paramBundle.getInt("android:menu:expandedactionview");
    if (j > 0) {
      MenuItem menuItem = findItem(j);
      if (menuItem != null)
        menuItem.expandActionView(); 
    } 
  }
  
  public void w(Bundle paramBundle) {
    int j = size();
    SparseArray sparseArray = null;
    byte b = 0;
    while (b < j) {
      MenuItem menuItem = getItem(b);
      View view = menuItem.getActionView();
      SparseArray sparseArray1 = sparseArray;
      if (view != null) {
        sparseArray1 = sparseArray;
        if (view.getId() != -1) {
          SparseArray sparseArray2 = sparseArray;
          if (sparseArray == null)
            sparseArray2 = new SparseArray(); 
          view.saveHierarchyState(sparseArray2);
          sparseArray1 = sparseArray2;
          if (menuItem.isActionViewExpanded()) {
            paramBundle.putInt("android:menu:expandedactionview", menuItem.getItemId());
            sparseArray1 = sparseArray2;
          } 
        } 
      } 
      if (menuItem.hasSubMenu())
        ((r)menuItem.getSubMenu()).w(paramBundle); 
      b++;
      sparseArray = sparseArray1;
    } 
    if (sparseArray != null)
      paramBundle.putSparseParcelableArray(j(), sparseArray); 
  }
  
  public final void x(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView) {
    Resources resources = this.b;
    if (paramView != null) {
      this.o = paramView;
      this.m = null;
      this.n = null;
    } else {
      if (paramInt1 > 0) {
        this.m = resources.getText(paramInt1);
      } else if (paramCharSequence != null) {
        this.m = paramCharSequence;
      } 
      if (paramInt2 > 0) {
        this.n = b.i.e.a.c(this.a, paramInt2);
      } else if (paramDrawable != null) {
        this.n = paramDrawable;
      } 
      this.o = null;
    } 
    q(false);
  }
  
  public void y() {
    this.p = false;
    if (this.q) {
      this.q = false;
      q(this.r);
    } 
  }
  
  public void z() {
    if (!this.p) {
      this.p = true;
      this.q = false;
      this.r = false;
    } 
  }
  
  public static interface a {
    void a(g param1g);
    
    boolean b(g param1g, MenuItem param1MenuItem);
  }
  
  public static interface b {
    boolean b(i param1i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\o\i\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */