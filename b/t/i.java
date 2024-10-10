package b.t;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import b.f.e;
import b.f.h;
import b.i.m.l;
import java.util.ArrayList;

public abstract class i implements Cloneable {
  public static final int[] G = new int[] { 2, 1, 3, 4 };
  
  public static final e H = new a();
  
  public static ThreadLocal<b.f.a<Animator, b>> I = new ThreadLocal<b.f.a<Animator, b>>();
  
  public boolean A = false;
  
  public ArrayList<d> B = null;
  
  public ArrayList<Animator> C = new ArrayList<Animator>();
  
  public n D;
  
  public c E;
  
  public e F = H;
  
  public String b = getClass().getName();
  
  public long c = -1L;
  
  public long d = -1L;
  
  public TimeInterpolator e = null;
  
  public ArrayList<Integer> f = new ArrayList<Integer>();
  
  public ArrayList<View> g = new ArrayList<View>();
  
  public ArrayList<String> h = null;
  
  public ArrayList<Class<?>> i = null;
  
  public ArrayList<Integer> j = null;
  
  public ArrayList<View> k = null;
  
  public ArrayList<Class<?>> l = null;
  
  public ArrayList<String> m = null;
  
  public ArrayList<Integer> n = null;
  
  public ArrayList<View> o = null;
  
  public ArrayList<Class<?>> p = null;
  
  public r q = new r();
  
  public r r = new r();
  
  public o s = null;
  
  public int[] t = G;
  
  public ArrayList<q> u;
  
  public ArrayList<q> v;
  
  public boolean w = false;
  
  public ArrayList<Animator> x = new ArrayList<Animator>();
  
  public int y = 0;
  
  public boolean z = false;
  
  public static void c(r paramr, View paramView, q paramq) {
    paramr.a.put(paramView, paramq);
    int j = paramView.getId();
    if (j >= 0)
      if (paramr.b.indexOfKey(j) >= 0) {
        paramr.b.put(j, null);
      } else {
        paramr.b.put(j, paramView);
      }  
    String str = l.x(paramView);
    if (str != null) {
      if (paramr.d.e(str) >= 0) {
        j = 1;
      } else {
        j = 0;
      } 
      if (j != 0) {
        paramr.d.put(str, null);
      } else {
        paramr.d.put(str, paramView);
      } 
    } 
    if (paramView.getParent() instanceof ListView) {
      ListView listView = (ListView)paramView.getParent();
      if (listView.getAdapter().hasStableIds()) {
        long l = listView.getItemIdAtPosition(listView.getPositionForView(paramView));
        e<View> e1 = paramr.c;
        if (e1.b)
          e1.d(); 
        if (b.f.d.b(e1.c, e1.e, l) >= 0) {
          paramView = (View)paramr.c.e(l);
          if (paramView != null) {
            paramView.setHasTransientState(false);
            paramr.c.g(l, null);
          } 
        } else {
          paramView.setHasTransientState(true);
          paramr.c.g(l, paramView);
        } 
      } 
    } 
  }
  
  public static b.f.a<Animator, b> p() {
    b.f.a<Animator, b> a2 = I.get();
    b.f.a<Animator, b> a1 = a2;
    if (a2 == null) {
      a1 = new b.f.a();
      I.set(a1);
    } 
    return a1;
  }
  
  public static boolean u(q paramq1, q paramq2, String paramString) {
    int j;
    paramq1 = (q)paramq1.a.get(paramString);
    paramq2 = (q)paramq2.a.get(paramString);
    byte b = 1;
    if (paramq1 == null && paramq2 == null) {
      j = 0;
    } else {
      j = b;
      if (paramq1 != null)
        if (paramq2 == null) {
          j = b;
        } else {
          j = true ^ paramq1.equals(paramq2);
        }  
    } 
    return j;
  }
  
  public i A(long paramLong) {
    this.d = paramLong;
    return this;
  }
  
  public void B(c paramc) {
    this.E = paramc;
  }
  
  public i C(TimeInterpolator paramTimeInterpolator) {
    this.e = paramTimeInterpolator;
    return this;
  }
  
  public void D(e parame) {
    e e1 = parame;
    if (parame == null)
      e1 = H; 
    this.F = e1;
  }
  
  public void E(n paramn) {
    this.D = paramn;
  }
  
  public i F(long paramLong) {
    this.c = paramLong;
    return this;
  }
  
  public void G() {
    if (this.y == 0) {
      ArrayList<d> arrayList = this.B;
      if (arrayList != null && arrayList.size() > 0) {
        arrayList = (ArrayList<d>)this.B.clone();
        int j = arrayList.size();
        for (byte b = 0; b < j; b++)
          ((d)arrayList.get(b)).a(this); 
      } 
      this.A = false;
    } 
    this.y++;
  }
  
  public String H(String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic e : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4: astore_1
    //   5: aload_1
    //   6: aload_0
    //   7: invokevirtual getClass : ()Ljava/lang/Class;
    //   10: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   13: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: pop
    //   17: aload_1
    //   18: ldc_w '@'
    //   21: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: pop
    //   25: aload_1
    //   26: aload_0
    //   27: invokevirtual hashCode : ()I
    //   30: invokestatic toHexString : (I)Ljava/lang/String;
    //   33: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload_1
    //   38: ldc_w ': '
    //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: aload_1
    //   46: invokevirtual toString : ()Ljava/lang/String;
    //   49: astore_1
    //   50: aload_1
    //   51: astore #4
    //   53: aload_0
    //   54: getfield d : J
    //   57: ldc2_w -1
    //   60: lcmp
    //   61: ifeq -> 115
    //   64: new java/lang/StringBuilder
    //   67: dup
    //   68: invokespecial <init> : ()V
    //   71: astore #4
    //   73: aload #4
    //   75: aload_1
    //   76: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: pop
    //   80: aload #4
    //   82: ldc_w 'dur('
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload #4
    //   91: aload_0
    //   92: getfield d : J
    //   95: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: aload #4
    //   101: ldc_w ') '
    //   104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload #4
    //   110: invokevirtual toString : ()Ljava/lang/String;
    //   113: astore #4
    //   115: aload #4
    //   117: astore_1
    //   118: aload_0
    //   119: getfield c : J
    //   122: ldc2_w -1
    //   125: lcmp
    //   126: ifeq -> 174
    //   129: new java/lang/StringBuilder
    //   132: dup
    //   133: invokespecial <init> : ()V
    //   136: astore_1
    //   137: aload_1
    //   138: aload #4
    //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: pop
    //   144: aload_1
    //   145: ldc_w 'dly('
    //   148: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: pop
    //   152: aload_1
    //   153: aload_0
    //   154: getfield c : J
    //   157: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   160: pop
    //   161: aload_1
    //   162: ldc_w ') '
    //   165: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: pop
    //   169: aload_1
    //   170: invokevirtual toString : ()Ljava/lang/String;
    //   173: astore_1
    //   174: aload_1
    //   175: astore #4
    //   177: aload_0
    //   178: getfield e : Landroid/animation/TimeInterpolator;
    //   181: ifnull -> 235
    //   184: new java/lang/StringBuilder
    //   187: dup
    //   188: invokespecial <init> : ()V
    //   191: astore #4
    //   193: aload #4
    //   195: aload_1
    //   196: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: pop
    //   200: aload #4
    //   202: ldc_w 'interp('
    //   205: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: pop
    //   209: aload #4
    //   211: aload_0
    //   212: getfield e : Landroid/animation/TimeInterpolator;
    //   215: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   218: pop
    //   219: aload #4
    //   221: ldc_w ') '
    //   224: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: pop
    //   228: aload #4
    //   230: invokevirtual toString : ()Ljava/lang/String;
    //   233: astore #4
    //   235: aload_0
    //   236: getfield f : Ljava/util/ArrayList;
    //   239: invokevirtual size : ()I
    //   242: ifgt -> 258
    //   245: aload #4
    //   247: astore_1
    //   248: aload_0
    //   249: getfield g : Ljava/util/ArrayList;
    //   252: invokevirtual size : ()I
    //   255: ifle -> 431
    //   258: aload #4
    //   260: ldc_w 'tgts('
    //   263: invokestatic c : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   266: astore #4
    //   268: aload_0
    //   269: getfield f : Ljava/util/ArrayList;
    //   272: invokevirtual size : ()I
    //   275: istore_2
    //   276: iconst_0
    //   277: istore_3
    //   278: aload #4
    //   280: astore_1
    //   281: iload_2
    //   282: ifle -> 347
    //   285: iconst_0
    //   286: istore_2
    //   287: aload #4
    //   289: astore_1
    //   290: iload_2
    //   291: aload_0
    //   292: getfield f : Ljava/util/ArrayList;
    //   295: invokevirtual size : ()I
    //   298: if_icmpge -> 347
    //   301: aload #4
    //   303: astore_1
    //   304: iload_2
    //   305: ifle -> 317
    //   308: aload #4
    //   310: ldc_w ', '
    //   313: invokestatic c : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   316: astore_1
    //   317: aload_1
    //   318: invokestatic e : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: astore_1
    //   322: aload_1
    //   323: aload_0
    //   324: getfield f : Ljava/util/ArrayList;
    //   327: iload_2
    //   328: invokevirtual get : (I)Ljava/lang/Object;
    //   331: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   334: pop
    //   335: aload_1
    //   336: invokevirtual toString : ()Ljava/lang/String;
    //   339: astore #4
    //   341: iinc #2, 1
    //   344: goto -> 287
    //   347: aload_1
    //   348: astore #4
    //   350: aload_0
    //   351: getfield g : Ljava/util/ArrayList;
    //   354: invokevirtual size : ()I
    //   357: ifle -> 422
    //   360: iload_3
    //   361: istore_2
    //   362: aload_1
    //   363: astore #4
    //   365: iload_2
    //   366: aload_0
    //   367: getfield g : Ljava/util/ArrayList;
    //   370: invokevirtual size : ()I
    //   373: if_icmpge -> 422
    //   376: aload_1
    //   377: astore #4
    //   379: iload_2
    //   380: ifle -> 392
    //   383: aload_1
    //   384: ldc_w ', '
    //   387: invokestatic c : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   390: astore #4
    //   392: aload #4
    //   394: invokestatic e : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: astore_1
    //   398: aload_1
    //   399: aload_0
    //   400: getfield g : Ljava/util/ArrayList;
    //   403: iload_2
    //   404: invokevirtual get : (I)Ljava/lang/Object;
    //   407: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   410: pop
    //   411: aload_1
    //   412: invokevirtual toString : ()Ljava/lang/String;
    //   415: astore_1
    //   416: iinc #2, 1
    //   419: goto -> 362
    //   422: aload #4
    //   424: ldc_w ')'
    //   427: invokestatic c : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   430: astore_1
    //   431: aload_1
    //   432: areturn
  }
  
  public i a(d paramd) {
    if (this.B == null)
      this.B = new ArrayList<d>(); 
    this.B.add(paramd);
    return this;
  }
  
  public i b(View paramView) {
    this.g.add(paramView);
    return this;
  }
  
  public void d() {
    int j;
    for (j = this.x.size() - 1; j >= 0; j--)
      ((Animator)this.x.get(j)).cancel(); 
    ArrayList<d> arrayList = this.B;
    if (arrayList != null && arrayList.size() > 0) {
      arrayList = (ArrayList<d>)this.B.clone();
      int k = arrayList.size();
      for (j = 0; j < k; j++)
        ((d)arrayList.get(j)).b(this); 
    } 
  }
  
  public abstract void e(q paramq);
  
  public final void f(View paramView, boolean paramBoolean) {
    if (paramView == null)
      return; 
    int j = paramView.getId();
    ArrayList<Integer> arrayList2 = this.j;
    if (arrayList2 != null && arrayList2.contains(Integer.valueOf(j)))
      return; 
    ArrayList<View> arrayList1 = this.k;
    if (arrayList1 != null && arrayList1.contains(paramView))
      return; 
    ArrayList<Class<?>> arrayList = this.l;
    byte b = 0;
    if (arrayList != null) {
      int k = arrayList.size();
      for (byte b1 = 0; b1 < k; b1++) {
        if (((Class)this.l.get(b1)).isInstance(paramView))
          return; 
      } 
    } 
    if (paramView.getParent() instanceof ViewGroup) {
      r r1;
      q q = new q(paramView);
      if (paramBoolean) {
        h(q);
      } else {
        e(q);
      } 
      q.c.add(this);
      g(q);
      if (paramBoolean) {
        r1 = this.q;
      } else {
        r1 = this.r;
      } 
      c(r1, paramView, q);
    } 
    if (paramView instanceof ViewGroup) {
      ArrayList<Integer> arrayList5 = this.n;
      if (arrayList5 != null && arrayList5.contains(Integer.valueOf(j)))
        return; 
      ArrayList<View> arrayList4 = this.o;
      if (arrayList4 != null && arrayList4.contains(paramView))
        return; 
      ArrayList<Class<?>> arrayList3 = this.p;
      if (arrayList3 != null) {
        j = arrayList3.size();
        for (byte b2 = 0; b2 < j; b2++) {
          if (((Class)this.p.get(b2)).isInstance(paramView))
            return; 
        } 
      } 
      ViewGroup viewGroup = (ViewGroup)paramView;
      for (byte b1 = b; b1 < viewGroup.getChildCount(); b1++)
        f(viewGroup.getChildAt(b1), paramBoolean); 
    } 
  }
  
  public void g(q paramq) {}
  
  public abstract void h(q paramq);
  
  public void i(ViewGroup paramViewGroup, boolean paramBoolean) {
    r r1;
    j(paramBoolean);
    if (this.f.size() > 0 || this.g.size() > 0) {
      ArrayList<String> arrayList = this.h;
      if (arrayList == null || arrayList.isEmpty()) {
        ArrayList<Class<?>> arrayList1 = this.i;
        if (arrayList1 == null || arrayList1.isEmpty()) {
          byte b2;
          byte b3 = 0;
          byte b1 = 0;
          while (true) {
            b2 = b3;
            if (b1 < this.f.size()) {
              View view = paramViewGroup.findViewById(((Integer)this.f.get(b1)).intValue());
              if (view != null) {
                r r2;
                q q = new q(view);
                if (paramBoolean) {
                  h(q);
                } else {
                  e(q);
                } 
                q.c.add(this);
                g(q);
                if (paramBoolean) {
                  r2 = this.q;
                } else {
                  r2 = this.r;
                } 
                c(r2, view, q);
              } 
              b1++;
              continue;
            } 
            break;
          } 
          while (b2 < this.g.size()) {
            View view = this.g.get(b2);
            q q = new q(view);
            if (paramBoolean) {
              h(q);
            } else {
              e(q);
            } 
            q.c.add(this);
            g(q);
            if (paramBoolean) {
              r1 = this.q;
            } else {
              r1 = this.r;
            } 
            c(r1, view, q);
            b2++;
          } 
          return;
        } 
      } 
    } 
    f((View)r1, paramBoolean);
  }
  
  public void j(boolean paramBoolean) {
    r r1;
    if (paramBoolean) {
      this.q.a.clear();
      this.q.b.clear();
      r1 = this.q;
    } else {
      this.r.a.clear();
      this.r.b.clear();
      r1 = this.r;
    } 
    r1.c.b();
  }
  
  public i k() {
    try {
      i i1 = (i)super.clone();
      ArrayList<Animator> arrayList = new ArrayList();
      this();
      i1.C = arrayList;
      r r1 = new r();
      this();
      i1.q = r1;
      r1 = new r();
      this();
      i1.r = r1;
      i1.u = null;
      i1.v = null;
      return i1;
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      return null;
    } 
  }
  
  public Animator l(ViewGroup paramViewGroup, q paramq1, q paramq2) {
    return null;
  }
  
  public void m(ViewGroup paramViewGroup, r paramr1, r paramr2, ArrayList<q> paramArrayList1, ArrayList<q> paramArrayList2) {
    b.f.a<Animator, b> a = p();
    SparseIntArray sparseIntArray = new SparseIntArray();
    int j = paramArrayList1.size();
    for (byte b = 0; b < j; b++) {
      q q3 = paramArrayList1.get(b);
      q q1 = paramArrayList2.get(b);
      q q2 = q3;
      if (q3 != null) {
        q2 = q3;
        if (!q3.c.contains(this))
          q2 = null; 
      } 
      q3 = q1;
      if (q1 != null) {
        q3 = q1;
        if (!q1.c.contains(this))
          q3 = null; 
      } 
      if (q2 != null || q3 != null) {
        int k;
        if (q2 == null || q3 == null || s(q2, q3)) {
          k = 1;
        } else {
          k = 0;
        } 
        if (k) {
          Animator animator = l(paramViewGroup, q2, q3);
          if (animator != null) {
            q q;
            View view;
            if (q3 != null) {
              View view1 = q3.b;
              String[] arrayOfString = q();
              if (arrayOfString != null && arrayOfString.length > 0) {
                q q4 = new q(view1);
                q3 = (q)paramr2.a.get(view1);
                Animator animator1 = animator;
                k = j;
                if (q3 != null) {
                  byte b1 = 0;
                  while (true) {
                    animator1 = animator;
                    k = j;
                    if (b1 < arrayOfString.length) {
                      q4.a.put(arrayOfString[b1], q3.a.get(arrayOfString[b1]));
                      b1++;
                      continue;
                    } 
                    break;
                  } 
                } 
                int m = ((h)a).d;
                j = 0;
                while (true) {
                  if (j < m) {
                    b b1 = (b)a.get(a.h(j));
                    if (b1.c != null && b1.a == view1 && b1.b.equals(this.b) && b1.c.equals(q4)) {
                      b1 = null;
                      q5 = q4;
                      break;
                    } 
                    j++;
                    continue;
                  } 
                  q = q5;
                  q q5 = q4;
                  break;
                } 
              } else {
                q2 = null;
                k = j;
              } 
              view = view1;
            } else {
              view = q2.b;
              q2 = null;
              k = j;
            } 
            j = k;
            if (q != null) {
              a.put(q, new b(view, this.b, this, v.c((View)paramViewGroup), q2));
              this.C.add(q);
              j = k;
            } 
          } 
        } 
      } 
    } 
    if (sparseIntArray.size() != 0)
      for (j = 0; j < sparseIntArray.size(); j++) {
        int k = sparseIntArray.keyAt(j);
        Animator animator = this.C.get(k);
        long l = sparseIntArray.valueAt(j);
        animator.setStartDelay(animator.getStartDelay() + l - Long.MAX_VALUE);
      }  
  }
  
  public void n() {
    int j = this.y - 1;
    this.y = j;
    if (j == 0) {
      ArrayList<d> arrayList = this.B;
      if (arrayList != null && arrayList.size() > 0) {
        arrayList = (ArrayList<d>)this.B.clone();
        int k = arrayList.size();
        for (j = 0; j < k; j++)
          ((d)arrayList.get(j)).c(this); 
      } 
      for (j = 0; j < this.q.c.h(); j++) {
        View view = (View)this.q.c.i(j);
        if (view != null)
          l.c0(view, false); 
      } 
      for (j = 0; j < this.r.c.h(); j++) {
        View view = (View)this.r.c.i(j);
        if (view != null)
          l.c0(view, false); 
      } 
      this.A = true;
    } 
  }
  
  public q o(View paramView, boolean paramBoolean) {
    q q;
    byte b1;
    ArrayList<q> arrayList;
    o o1 = this.s;
    if (o1 != null)
      return o1.o(paramView, paramBoolean); 
    if (paramBoolean) {
      arrayList = this.u;
    } else {
      arrayList = this.v;
    } 
    View view = null;
    if (arrayList == null)
      return null; 
    int j = arrayList.size();
    byte b2 = -1;
    byte b = 0;
    while (true) {
      b1 = b2;
      if (b < j) {
        q q1 = arrayList.get(b);
        if (q1 == null)
          return null; 
        if (q1.b == paramView) {
          b1 = b;
          break;
        } 
        b++;
        continue;
      } 
      break;
    } 
    paramView = view;
    if (b1 >= 0) {
      ArrayList<q> arrayList1;
      if (paramBoolean) {
        arrayList1 = this.v;
      } else {
        arrayList1 = this.u;
      } 
      q = arrayList1.get(b1);
    } 
    return q;
  }
  
  public String[] q() {
    return null;
  }
  
  public q r(View paramView, boolean paramBoolean) {
    r r1;
    o o1 = this.s;
    if (o1 != null)
      return o1.r(paramView, paramBoolean); 
    if (paramBoolean) {
      r1 = this.q;
    } else {
      r1 = this.r;
    } 
    return (q)r1.a.getOrDefault(paramView, null);
  }
  
  public boolean s(q paramq1, q paramq2) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #6
    //   3: iload #6
    //   5: istore #5
    //   7: aload_1
    //   8: ifnull -> 119
    //   11: iload #6
    //   13: istore #5
    //   15: aload_2
    //   16: ifnull -> 119
    //   19: aload_0
    //   20: invokevirtual q : ()[Ljava/lang/String;
    //   23: astore #7
    //   25: aload #7
    //   27: ifnull -> 68
    //   30: aload #7
    //   32: arraylength
    //   33: istore #4
    //   35: iconst_0
    //   36: istore_3
    //   37: iload #6
    //   39: istore #5
    //   41: iload_3
    //   42: iload #4
    //   44: if_icmpge -> 119
    //   47: aload_1
    //   48: aload_2
    //   49: aload #7
    //   51: iload_3
    //   52: aaload
    //   53: invokestatic u : (Lb/t/q;Lb/t/q;Ljava/lang/String;)Z
    //   56: ifeq -> 62
    //   59: goto -> 116
    //   62: iinc #3, 1
    //   65: goto -> 37
    //   68: aload_1
    //   69: getfield a : Ljava/util/Map;
    //   72: invokeinterface keySet : ()Ljava/util/Set;
    //   77: invokeinterface iterator : ()Ljava/util/Iterator;
    //   82: astore #7
    //   84: iload #6
    //   86: istore #5
    //   88: aload #7
    //   90: invokeinterface hasNext : ()Z
    //   95: ifeq -> 119
    //   98: aload_1
    //   99: aload_2
    //   100: aload #7
    //   102: invokeinterface next : ()Ljava/lang/Object;
    //   107: checkcast java/lang/String
    //   110: invokestatic u : (Lb/t/q;Lb/t/q;Ljava/lang/String;)Z
    //   113: ifeq -> 84
    //   116: iconst_1
    //   117: istore #5
    //   119: iload #5
    //   121: ireturn
  }
  
  public boolean t(View paramView) {
    int j = paramView.getId();
    ArrayList<Integer> arrayList3 = this.j;
    if (arrayList3 != null && arrayList3.contains(Integer.valueOf(j)))
      return false; 
    ArrayList<View> arrayList2 = this.k;
    if (arrayList2 != null && arrayList2.contains(paramView))
      return false; 
    ArrayList<Class<?>> arrayList1 = this.l;
    if (arrayList1 != null) {
      int k = arrayList1.size();
      for (byte b = 0; b < k; b++) {
        if (((Class)this.l.get(b)).isInstance(paramView))
          return false; 
      } 
    } 
    if (this.m != null && l.x(paramView) != null && this.m.contains(paramView.getTransitionName()))
      return false; 
    if (this.f.size() == 0 && this.g.size() == 0) {
      arrayList1 = this.i;
      if (arrayList1 == null || arrayList1.isEmpty()) {
        ArrayList<String> arrayList4 = this.h;
        if (arrayList4 == null || arrayList4.isEmpty())
          return true; 
      } 
    } 
    if (this.f.contains(Integer.valueOf(j)) || this.g.contains(paramView))
      return true; 
    ArrayList<String> arrayList = this.h;
    if (arrayList != null && arrayList.contains(l.x(paramView)))
      return true; 
    if (this.i != null)
      for (byte b = 0; b < this.i.size(); b++) {
        if (((Class)this.i.get(b)).isInstance(paramView))
          return true; 
      }  
    return false;
  }
  
  public String toString() {
    return H("");
  }
  
  public void v(View paramView) {
    if (!this.A) {
      b.f.a<Animator, b> a = p();
      int j = ((h)a).d;
      f0 f0 = v.c(paramView);
      while (--j >= 0) {
        b b = (b)a.k(j);
        if (b.a != null && f0.equals(b.d))
          ((Animator)a.h(j)).pause(); 
        j--;
      } 
      ArrayList<d> arrayList = this.B;
      if (arrayList != null && arrayList.size() > 0) {
        arrayList = (ArrayList<d>)this.B.clone();
        int k = arrayList.size();
        for (j = 0; j < k; j++)
          ((d)arrayList.get(j)).d(this); 
      } 
      this.z = true;
    } 
  }
  
  public i w(d paramd) {
    ArrayList<d> arrayList = this.B;
    if (arrayList == null)
      return this; 
    arrayList.remove(paramd);
    if (this.B.size() == 0)
      this.B = null; 
    return this;
  }
  
  public i x(View paramView) {
    this.g.remove(paramView);
    return this;
  }
  
  public void y(View paramView) {
    if (this.z) {
      if (!this.A) {
        b.f.a<Animator, b> a = p();
        int j = ((h)a).d;
        f0 f0 = v.c(paramView);
        while (--j >= 0) {
          b b = (b)a.k(j);
          if (b.a != null && f0.equals(b.d))
            ((Animator)a.h(j)).resume(); 
          j--;
        } 
        ArrayList<d> arrayList = this.B;
        if (arrayList != null && arrayList.size() > 0) {
          arrayList = (ArrayList<d>)this.B.clone();
          int k = arrayList.size();
          for (j = 0; j < k; j++)
            ((d)arrayList.get(j)).e(this); 
        } 
      } 
      this.z = false;
    } 
  }
  
  public void z() {
    G();
    b.f.a<Animator, b> a = p();
    for (Animator animator : this.C) {
      if (a.containsKey(animator)) {
        G();
        if (animator != null) {
          animator.addListener((Animator.AnimatorListener)new j(this, a));
          long l = this.d;
          if (l >= 0L)
            animator.setDuration(l); 
          l = this.c;
          if (l >= 0L)
            animator.setStartDelay(animator.getStartDelay() + l); 
          TimeInterpolator timeInterpolator = this.e;
          if (timeInterpolator != null)
            animator.setInterpolator(timeInterpolator); 
          animator.addListener((Animator.AnimatorListener)new k(this));
          animator.start();
        } 
      } 
    } 
    this.C.clear();
    n();
  }
  
  public static final class a extends e {
    public Path a(float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      Path path = new Path();
      path.moveTo(param1Float1, param1Float2);
      path.lineTo(param1Float3, param1Float4);
      return path;
    }
  }
  
  public static class b {
    public View a;
    
    public String b;
    
    public q c;
    
    public f0 d;
    
    public i e;
    
    public b(View param1View, String param1String, i param1i, f0 param1f0, q param1q) {
      this.a = param1View;
      this.b = param1String;
      this.c = param1q;
      this.d = param1f0;
      this.e = param1i;
    }
  }
  
  public static abstract class c {}
  
  public static interface d {
    void a(i param1i);
    
    void b(i param1i);
    
    void c(i param1i);
    
    void d(i param1i);
    
    void e(i param1i);
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */