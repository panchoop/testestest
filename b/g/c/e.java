package b.g.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class e {
  public static final int[] d = new int[] { 0, 4, 8 };
  
  public static SparseIntArray e;
  
  public HashMap<String, b> a = new HashMap<String, b>();
  
  public boolean b = true;
  
  public HashMap<Integer, a> c = new HashMap<Integer, a>();
  
  static {
    SparseIntArray sparseIntArray = new SparseIntArray();
    e = sparseIntArray;
    sparseIntArray.append(k.Constraint_layout_constraintLeft_toLeftOf, 25);
    e.append(k.Constraint_layout_constraintLeft_toRightOf, 26);
    e.append(k.Constraint_layout_constraintRight_toLeftOf, 29);
    e.append(k.Constraint_layout_constraintRight_toRightOf, 30);
    e.append(k.Constraint_layout_constraintTop_toTopOf, 36);
    e.append(k.Constraint_layout_constraintTop_toBottomOf, 35);
    e.append(k.Constraint_layout_constraintBottom_toTopOf, 4);
    e.append(k.Constraint_layout_constraintBottom_toBottomOf, 3);
    e.append(k.Constraint_layout_constraintBaseline_toBaselineOf, 1);
    e.append(k.Constraint_layout_editor_absoluteX, 6);
    e.append(k.Constraint_layout_editor_absoluteY, 7);
    e.append(k.Constraint_layout_constraintGuide_begin, 17);
    e.append(k.Constraint_layout_constraintGuide_end, 18);
    e.append(k.Constraint_layout_constraintGuide_percent, 19);
    e.append(k.Constraint_android_orientation, 27);
    e.append(k.Constraint_layout_constraintStart_toEndOf, 32);
    e.append(k.Constraint_layout_constraintStart_toStartOf, 33);
    e.append(k.Constraint_layout_constraintEnd_toStartOf, 10);
    e.append(k.Constraint_layout_constraintEnd_toEndOf, 9);
    e.append(k.Constraint_layout_goneMarginLeft, 13);
    e.append(k.Constraint_layout_goneMarginTop, 16);
    e.append(k.Constraint_layout_goneMarginRight, 14);
    e.append(k.Constraint_layout_goneMarginBottom, 11);
    e.append(k.Constraint_layout_goneMarginStart, 15);
    e.append(k.Constraint_layout_goneMarginEnd, 12);
    e.append(k.Constraint_layout_constraintVertical_weight, 40);
    e.append(k.Constraint_layout_constraintHorizontal_weight, 39);
    e.append(k.Constraint_layout_constraintHorizontal_chainStyle, 41);
    e.append(k.Constraint_layout_constraintVertical_chainStyle, 42);
    e.append(k.Constraint_layout_constraintHorizontal_bias, 20);
    e.append(k.Constraint_layout_constraintVertical_bias, 37);
    e.append(k.Constraint_layout_constraintDimensionRatio, 5);
    e.append(k.Constraint_layout_constraintLeft_creator, 82);
    e.append(k.Constraint_layout_constraintTop_creator, 82);
    e.append(k.Constraint_layout_constraintRight_creator, 82);
    e.append(k.Constraint_layout_constraintBottom_creator, 82);
    e.append(k.Constraint_layout_constraintBaseline_creator, 82);
    e.append(k.Constraint_android_layout_marginLeft, 24);
    e.append(k.Constraint_android_layout_marginRight, 28);
    e.append(k.Constraint_android_layout_marginStart, 31);
    e.append(k.Constraint_android_layout_marginEnd, 8);
    e.append(k.Constraint_android_layout_marginTop, 34);
    e.append(k.Constraint_android_layout_marginBottom, 2);
    e.append(k.Constraint_android_layout_width, 23);
    e.append(k.Constraint_android_layout_height, 21);
    e.append(k.Constraint_android_visibility, 22);
    e.append(k.Constraint_android_alpha, 43);
    e.append(k.Constraint_android_elevation, 44);
    e.append(k.Constraint_android_rotationX, 45);
    e.append(k.Constraint_android_rotationY, 46);
    e.append(k.Constraint_android_rotation, 60);
    e.append(k.Constraint_android_scaleX, 47);
    e.append(k.Constraint_android_scaleY, 48);
    e.append(k.Constraint_android_transformPivotX, 49);
    e.append(k.Constraint_android_transformPivotY, 50);
    e.append(k.Constraint_android_translationX, 51);
    e.append(k.Constraint_android_translationY, 52);
    e.append(k.Constraint_android_translationZ, 53);
    e.append(k.Constraint_layout_constraintWidth_default, 54);
    e.append(k.Constraint_layout_constraintHeight_default, 55);
    e.append(k.Constraint_layout_constraintWidth_max, 56);
    e.append(k.Constraint_layout_constraintHeight_max, 57);
    e.append(k.Constraint_layout_constraintWidth_min, 58);
    e.append(k.Constraint_layout_constraintHeight_min, 59);
    e.append(k.Constraint_layout_constraintCircle, 61);
    e.append(k.Constraint_layout_constraintCircleRadius, 62);
    e.append(k.Constraint_layout_constraintCircleAngle, 63);
    e.append(k.Constraint_animate_relativeTo, 64);
    e.append(k.Constraint_transitionEasing, 65);
    e.append(k.Constraint_drawPath, 66);
    e.append(k.Constraint_transitionPathRotate, 67);
    e.append(k.Constraint_motionStagger, 79);
    e.append(k.Constraint_android_id, 38);
    e.append(k.Constraint_motionProgress, 68);
    e.append(k.Constraint_layout_constraintWidth_percent, 69);
    e.append(k.Constraint_layout_constraintHeight_percent, 70);
    e.append(k.Constraint_chainUseRtl, 71);
    e.append(k.Constraint_barrierDirection, 72);
    e.append(k.Constraint_barrierMargin, 73);
    e.append(k.Constraint_constraint_referenced_ids, 74);
    e.append(k.Constraint_barrierAllowsGoneWidgets, 75);
    e.append(k.Constraint_pathMotionArc, 76);
    e.append(k.Constraint_layout_constraintTag, 77);
    e.append(k.Constraint_visibilityMode, 78);
    e.append(k.Constraint_layout_constrainedWidth, 80);
    e.append(k.Constraint_layout_constrainedHeight, 81);
  }
  
  public static int a(TypedArray paramTypedArray, int paramInt1, int paramInt2) {
    int i = paramTypedArray.getResourceId(paramInt1, paramInt2);
    paramInt2 = i;
    if (i == -1)
      paramInt2 = paramTypedArray.getInt(paramInt1, -1); 
    return paramInt2;
  }
  
  public void b(Context paramContext, int paramInt) {
    ConstraintLayout constraintLayout = (ConstraintLayout)LayoutInflater.from(paramContext).inflate(paramInt, null);
    int i = constraintLayout.getChildCount();
    this.c.clear();
    paramInt = 0;
    while (paramInt < i) {
      View view = constraintLayout.getChildAt(paramInt);
      ConstraintLayout.a a = (ConstraintLayout.a)view.getLayoutParams();
      int j = view.getId();
      if (!this.b || j != -1) {
        if (!this.c.containsKey(Integer.valueOf(j)))
          this.c.put(Integer.valueOf(j), new a()); 
        a a1 = this.c.get(Integer.valueOf(j));
        HashMap<String, b> hashMap = this.a;
        HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
        Class<?> clazz = view.getClass();
        Iterator<String> iterator = hashMap.keySet().iterator();
        while (true) {
          if (iterator.hasNext()) {
            String str = iterator.next();
            b b = hashMap.get(str);
            try {
              if (str.equals("BackgroundColor")) {
                int k = ((ColorDrawable)view.getBackground()).getColor();
                b b1 = new b();
                this(b, Integer.valueOf(k));
              } else {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("getMap");
                stringBuilder.append(str);
                String str1 = stringBuilder.toString();
                try {
                  b b1 = new b(b, clazz.getMethod(str1, new Class[0]).invoke(view, new Object[0]));
                  hashMap1.put(str, b1);
                  continue;
                } catch (NoSuchMethodException noSuchMethodException) {
                
                } catch (IllegalAccessException illegalAccessException) {
                
                } catch (InvocationTargetException null) {}
                invocationTargetException.printStackTrace();
              } 
              hashMap1.put(str, invocationTargetException);
              continue;
            } catch (NoSuchMethodException noSuchMethodException) {
            
            } catch (IllegalAccessException illegalAccessException) {
              illegalAccessException.printStackTrace();
              continue;
            } catch (InvocationTargetException invocationTargetException) {
              invocationTargetException.printStackTrace();
              continue;
            } 
          } else {
            break;
          } 
          invocationTargetException.printStackTrace();
        } 
        a1.f = (HashMap)hashMap1;
        a1.b(j, a);
        a1.b.b = view.getVisibility();
        a1.b.d = view.getAlpha();
        a1.e.b = view.getRotation();
        a1.e.c = view.getRotationX();
        a1.e.d = view.getRotationY();
        a1.e.e = view.getScaleX();
        a1.e.f = view.getScaleY();
        float f1 = view.getPivotX();
        float f2 = view.getPivotY();
        if (f1 != 0.0D || f2 != 0.0D) {
          e e2 = a1.e;
          e2.g = f1;
          e2.h = f2;
        } 
        a1.e.i = view.getTranslationX();
        a1.e.j = view.getTranslationY();
        a1.e.k = view.getTranslationZ();
        e e1 = a1.e;
        if (e1.l)
          e1.m = view.getElevation(); 
        if (view instanceof a) {
          a a2 = (a)view;
          b b = a1.d;
          b.j0 = a2.k.i0;
          b.e0 = a2.getReferencedIds();
          a1.d.b0 = a2.getType();
          a1.d.c0 = a2.getMargin();
        } 
        paramInt++;
        continue;
      } 
      throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    } 
  }
  
  public final int[] c(View paramView, String paramString) {
    String[] arrayOfString = paramString.split(",");
    Context context = paramView.getContext();
    int[] arrayOfInt2 = new int[arrayOfString.length];
    byte b2 = 0;
    byte b1;
    for (b1 = 0; b2 < arrayOfString.length; b1++) {
      String str = arrayOfString[b2].trim();
      try {
        j = j.class.getField(str).getInt(null);
      } catch (Exception exception) {
        j = 0;
      } 
      int i = j;
      if (!j)
        i = context.getResources().getIdentifier(str, "id", context.getPackageName()); 
      int j = i;
      if (i == 0) {
        j = i;
        if (paramView.isInEditMode()) {
          j = i;
          if (paramView.getParent() instanceof ConstraintLayout) {
            Object object = ((ConstraintLayout)paramView.getParent()).c(0, str);
            j = i;
            if (object != null) {
              j = i;
              if (object instanceof Integer)
                j = ((Integer)object).intValue(); 
            } 
          } 
        } 
      } 
      arrayOfInt2[b1] = j;
      b2++;
    } 
    int[] arrayOfInt1 = arrayOfInt2;
    if (b1 != arrayOfString.length)
      arrayOfInt1 = Arrays.copyOf(arrayOfInt2, b1); 
    return arrayOfInt1;
  }
  
  public final a d(Context paramContext, AttributeSet paramAttributeSet) {
    // Byte code:
    //   0: new b/g/c/e$a
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #8
    //   9: aload_1
    //   10: aload_2
    //   11: getstatic b/g/c/k.Constraint : [I
    //   14: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   17: astore #9
    //   19: aload #9
    //   21: invokevirtual getIndexCount : ()I
    //   24: istore #6
    //   26: iconst_0
    //   27: istore_3
    //   28: iload_3
    //   29: iload #6
    //   31: if_icmpge -> 2849
    //   34: aload #9
    //   36: iload_3
    //   37: invokevirtual getIndex : (I)I
    //   40: istore #7
    //   42: iload #7
    //   44: getstatic b/g/c/k.Constraint_android_id : I
    //   47: if_icmpeq -> 102
    //   50: getstatic b/g/c/k.Constraint_android_layout_marginStart : I
    //   53: iload #7
    //   55: if_icmpeq -> 102
    //   58: getstatic b/g/c/k.Constraint_android_layout_marginEnd : I
    //   61: iload #7
    //   63: if_icmpeq -> 102
    //   66: aload #8
    //   68: getfield c : Lb/g/c/e$c;
    //   71: iconst_1
    //   72: putfield a : Z
    //   75: aload #8
    //   77: getfield d : Lb/g/c/e$b;
    //   80: iconst_1
    //   81: putfield b : Z
    //   84: aload #8
    //   86: getfield b : Lb/g/c/e$d;
    //   89: iconst_1
    //   90: putfield a : Z
    //   93: aload #8
    //   95: getfield e : Lb/g/c/e$e;
    //   98: iconst_1
    //   99: putfield a : Z
    //   102: getstatic b/g/c/e.e : Landroid/util/SparseIntArray;
    //   105: iload #7
    //   107: invokevirtual get : (I)I
    //   110: tableswitch default -> 452, 1 -> 2747, 2 -> 2723, 3 -> 2675, 4 -> 2627, 5 -> 2609, 6 -> 2585, 7 -> 2561, 8 -> 2537, 9 -> 2489, 10 -> 2441, 11 -> 2417, 12 -> 2393, 13 -> 2369, 14 -> 2345, 15 -> 2321, 16 -> 2297, 17 -> 2273, 18 -> 2249, 19 -> 2225, 20 -> 2201, 21 -> 2177, 22 -> 2135, 23 -> 2111, 24 -> 2087, 25 -> 2039, 26 -> 1991, 27 -> 1967, 28 -> 1943, 29 -> 1895, 30 -> 1847, 31 -> 1823, 32 -> 1775, 33 -> 1727, 34 -> 1703, 35 -> 1655, 36 -> 1607, 37 -> 1583, 38 -> 1563, 39 -> 1539, 40 -> 1515, 41 -> 1491, 42 -> 1467, 43 -> 1443, 44 -> 1414, 45 -> 1390, 46 -> 1366, 47 -> 1342, 48 -> 1318, 49 -> 1294, 50 -> 1270, 51 -> 1246, 52 -> 1222, 53 -> 1198, 54 -> 1174, 55 -> 1150, 56 -> 1126, 57 -> 1102, 58 -> 1078, 59 -> 1054, 60 -> 1030, 61 -> 982, 62 -> 958, 63 -> 934, 64 -> 886, 65 -> 828, 66 -> 809, 67 -> 785, 68 -> 761, 69 -> 742, 70 -> 723, 71 -> 710, 72 -> 686, 73 -> 662, 74 -> 644, 75 -> 620, 76 -> 596, 77 -> 578, 78 -> 554, 79 -> 530, 80 -> 506, 81 -> 482, 82 -> 467
    //   452: new java/lang/StringBuilder
    //   455: dup
    //   456: invokespecial <init> : ()V
    //   459: astore_1
    //   460: ldc_w 'Unknown attribute 0x'
    //   463: astore_2
    //   464: goto -> 2795
    //   467: new java/lang/StringBuilder
    //   470: dup
    //   471: invokespecial <init> : ()V
    //   474: astore_1
    //   475: ldc_w 'unused attribute 0x'
    //   478: astore_2
    //   479: goto -> 2795
    //   482: aload #8
    //   484: getfield d : Lb/g/c/e$b;
    //   487: astore_1
    //   488: aload_1
    //   489: aload #9
    //   491: iload #7
    //   493: aload_1
    //   494: getfield i0 : Z
    //   497: invokevirtual getBoolean : (IZ)Z
    //   500: putfield i0 : Z
    //   503: goto -> 2843
    //   506: aload #8
    //   508: getfield d : Lb/g/c/e$b;
    //   511: astore_1
    //   512: aload_1
    //   513: aload #9
    //   515: iload #7
    //   517: aload_1
    //   518: getfield h0 : Z
    //   521: invokevirtual getBoolean : (IZ)Z
    //   524: putfield h0 : Z
    //   527: goto -> 2843
    //   530: aload #8
    //   532: getfield c : Lb/g/c/e$c;
    //   535: astore_1
    //   536: aload_1
    //   537: aload #9
    //   539: iload #7
    //   541: aload_1
    //   542: getfield f : F
    //   545: invokevirtual getFloat : (IF)F
    //   548: putfield f : F
    //   551: goto -> 2843
    //   554: aload #8
    //   556: getfield b : Lb/g/c/e$d;
    //   559: astore_1
    //   560: aload_1
    //   561: aload #9
    //   563: iload #7
    //   565: aload_1
    //   566: getfield c : I
    //   569: invokevirtual getInt : (II)I
    //   572: putfield c : I
    //   575: goto -> 2843
    //   578: aload #8
    //   580: getfield d : Lb/g/c/e$b;
    //   583: aload #9
    //   585: iload #7
    //   587: invokevirtual getString : (I)Ljava/lang/String;
    //   590: putfield g0 : Ljava/lang/String;
    //   593: goto -> 2843
    //   596: aload #8
    //   598: getfield c : Lb/g/c/e$c;
    //   601: astore_1
    //   602: aload_1
    //   603: aload #9
    //   605: iload #7
    //   607: aload_1
    //   608: getfield d : I
    //   611: invokevirtual getInt : (II)I
    //   614: putfield d : I
    //   617: goto -> 2843
    //   620: aload #8
    //   622: getfield d : Lb/g/c/e$b;
    //   625: astore_1
    //   626: aload_1
    //   627: aload #9
    //   629: iload #7
    //   631: aload_1
    //   632: getfield j0 : Z
    //   635: invokevirtual getBoolean : (IZ)Z
    //   638: putfield j0 : Z
    //   641: goto -> 2843
    //   644: aload #8
    //   646: getfield d : Lb/g/c/e$b;
    //   649: aload #9
    //   651: iload #7
    //   653: invokevirtual getString : (I)Ljava/lang/String;
    //   656: putfield f0 : Ljava/lang/String;
    //   659: goto -> 2843
    //   662: aload #8
    //   664: getfield d : Lb/g/c/e$b;
    //   667: astore_1
    //   668: aload_1
    //   669: aload #9
    //   671: iload #7
    //   673: aload_1
    //   674: getfield c0 : I
    //   677: invokevirtual getDimensionPixelSize : (II)I
    //   680: putfield c0 : I
    //   683: goto -> 2843
    //   686: aload #8
    //   688: getfield d : Lb/g/c/e$b;
    //   691: astore_1
    //   692: aload_1
    //   693: aload #9
    //   695: iload #7
    //   697: aload_1
    //   698: getfield b0 : I
    //   701: invokevirtual getInt : (II)I
    //   704: putfield b0 : I
    //   707: goto -> 2843
    //   710: ldc_w 'ConstraintSet'
    //   713: ldc_w 'CURRENTLY UNSUPPORTED'
    //   716: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   719: pop
    //   720: goto -> 2843
    //   723: aload #8
    //   725: getfield d : Lb/g/c/e$b;
    //   728: aload #9
    //   730: iload #7
    //   732: fconst_1
    //   733: invokevirtual getFloat : (IF)F
    //   736: putfield a0 : F
    //   739: goto -> 2843
    //   742: aload #8
    //   744: getfield d : Lb/g/c/e$b;
    //   747: aload #9
    //   749: iload #7
    //   751: fconst_1
    //   752: invokevirtual getFloat : (IF)F
    //   755: putfield Z : F
    //   758: goto -> 2843
    //   761: aload #8
    //   763: getfield b : Lb/g/c/e$d;
    //   766: astore_1
    //   767: aload_1
    //   768: aload #9
    //   770: iload #7
    //   772: aload_1
    //   773: getfield e : F
    //   776: invokevirtual getFloat : (IF)F
    //   779: putfield e : F
    //   782: goto -> 2843
    //   785: aload #8
    //   787: getfield c : Lb/g/c/e$c;
    //   790: astore_1
    //   791: aload_1
    //   792: aload #9
    //   794: iload #7
    //   796: aload_1
    //   797: getfield g : F
    //   800: invokevirtual getFloat : (IF)F
    //   803: putfield g : F
    //   806: goto -> 2843
    //   809: aload #8
    //   811: getfield c : Lb/g/c/e$c;
    //   814: aload #9
    //   816: iload #7
    //   818: iconst_0
    //   819: invokevirtual getInt : (II)I
    //   822: putfield e : I
    //   825: goto -> 2843
    //   828: aload #9
    //   830: iload #7
    //   832: invokevirtual peekValue : (I)Landroid/util/TypedValue;
    //   835: getfield type : I
    //   838: iconst_3
    //   839: if_icmpne -> 859
    //   842: aload #8
    //   844: getfield c : Lb/g/c/e$c;
    //   847: astore_2
    //   848: aload #9
    //   850: iload #7
    //   852: invokevirtual getString : (I)Ljava/lang/String;
    //   855: astore_1
    //   856: goto -> 878
    //   859: aload #8
    //   861: getfield c : Lb/g/c/e$c;
    //   864: astore_2
    //   865: getstatic b/g/a/a/a.a : [Ljava/lang/String;
    //   868: aload #9
    //   870: iload #7
    //   872: iconst_0
    //   873: invokevirtual getInteger : (II)I
    //   876: aaload
    //   877: astore_1
    //   878: aload_2
    //   879: aload_1
    //   880: putfield c : Ljava/lang/String;
    //   883: goto -> 2843
    //   886: aload #8
    //   888: getfield c : Lb/g/c/e$c;
    //   891: astore_1
    //   892: aload #9
    //   894: iload #7
    //   896: aload_1
    //   897: getfield b : I
    //   900: invokevirtual getResourceId : (II)I
    //   903: istore #5
    //   905: iload #5
    //   907: istore #4
    //   909: iload #5
    //   911: iconst_m1
    //   912: if_icmpne -> 925
    //   915: aload #9
    //   917: iload #7
    //   919: iconst_m1
    //   920: invokevirtual getInt : (II)I
    //   923: istore #4
    //   925: aload_1
    //   926: iload #4
    //   928: putfield b : I
    //   931: goto -> 2843
    //   934: aload #8
    //   936: getfield d : Lb/g/c/e$b;
    //   939: astore_1
    //   940: aload_1
    //   941: aload #9
    //   943: iload #7
    //   945: aload_1
    //   946: getfield z : F
    //   949: invokevirtual getFloat : (IF)F
    //   952: putfield z : F
    //   955: goto -> 2843
    //   958: aload #8
    //   960: getfield d : Lb/g/c/e$b;
    //   963: astore_1
    //   964: aload_1
    //   965: aload #9
    //   967: iload #7
    //   969: aload_1
    //   970: getfield y : I
    //   973: invokevirtual getDimensionPixelSize : (II)I
    //   976: putfield y : I
    //   979: goto -> 2843
    //   982: aload #8
    //   984: getfield d : Lb/g/c/e$b;
    //   987: astore_1
    //   988: aload #9
    //   990: iload #7
    //   992: aload_1
    //   993: getfield x : I
    //   996: invokevirtual getResourceId : (II)I
    //   999: istore #5
    //   1001: iload #5
    //   1003: istore #4
    //   1005: iload #5
    //   1007: iconst_m1
    //   1008: if_icmpne -> 1021
    //   1011: aload #9
    //   1013: iload #7
    //   1015: iconst_m1
    //   1016: invokevirtual getInt : (II)I
    //   1019: istore #4
    //   1021: aload_1
    //   1022: iload #4
    //   1024: putfield x : I
    //   1027: goto -> 2843
    //   1030: aload #8
    //   1032: getfield e : Lb/g/c/e$e;
    //   1035: astore_1
    //   1036: aload_1
    //   1037: aload #9
    //   1039: iload #7
    //   1041: aload_1
    //   1042: getfield b : F
    //   1045: invokevirtual getFloat : (IF)F
    //   1048: putfield b : F
    //   1051: goto -> 2843
    //   1054: aload #8
    //   1056: getfield d : Lb/g/c/e$b;
    //   1059: astore_1
    //   1060: aload_1
    //   1061: aload #9
    //   1063: iload #7
    //   1065: aload_1
    //   1066: getfield Y : I
    //   1069: invokevirtual getDimensionPixelSize : (II)I
    //   1072: putfield Y : I
    //   1075: goto -> 2843
    //   1078: aload #8
    //   1080: getfield d : Lb/g/c/e$b;
    //   1083: astore_1
    //   1084: aload_1
    //   1085: aload #9
    //   1087: iload #7
    //   1089: aload_1
    //   1090: getfield X : I
    //   1093: invokevirtual getDimensionPixelSize : (II)I
    //   1096: putfield X : I
    //   1099: goto -> 2843
    //   1102: aload #8
    //   1104: getfield d : Lb/g/c/e$b;
    //   1107: astore_1
    //   1108: aload_1
    //   1109: aload #9
    //   1111: iload #7
    //   1113: aload_1
    //   1114: getfield W : I
    //   1117: invokevirtual getDimensionPixelSize : (II)I
    //   1120: putfield W : I
    //   1123: goto -> 2843
    //   1126: aload #8
    //   1128: getfield d : Lb/g/c/e$b;
    //   1131: astore_1
    //   1132: aload_1
    //   1133: aload #9
    //   1135: iload #7
    //   1137: aload_1
    //   1138: getfield V : I
    //   1141: invokevirtual getDimensionPixelSize : (II)I
    //   1144: putfield V : I
    //   1147: goto -> 2843
    //   1150: aload #8
    //   1152: getfield d : Lb/g/c/e$b;
    //   1155: astore_1
    //   1156: aload_1
    //   1157: aload #9
    //   1159: iload #7
    //   1161: aload_1
    //   1162: getfield U : I
    //   1165: invokevirtual getInt : (II)I
    //   1168: putfield U : I
    //   1171: goto -> 2843
    //   1174: aload #8
    //   1176: getfield d : Lb/g/c/e$b;
    //   1179: astore_1
    //   1180: aload_1
    //   1181: aload #9
    //   1183: iload #7
    //   1185: aload_1
    //   1186: getfield T : I
    //   1189: invokevirtual getInt : (II)I
    //   1192: putfield T : I
    //   1195: goto -> 2843
    //   1198: aload #8
    //   1200: getfield e : Lb/g/c/e$e;
    //   1203: astore_1
    //   1204: aload_1
    //   1205: aload #9
    //   1207: iload #7
    //   1209: aload_1
    //   1210: getfield k : F
    //   1213: invokevirtual getDimension : (IF)F
    //   1216: putfield k : F
    //   1219: goto -> 2843
    //   1222: aload #8
    //   1224: getfield e : Lb/g/c/e$e;
    //   1227: astore_1
    //   1228: aload_1
    //   1229: aload #9
    //   1231: iload #7
    //   1233: aload_1
    //   1234: getfield j : F
    //   1237: invokevirtual getDimension : (IF)F
    //   1240: putfield j : F
    //   1243: goto -> 2843
    //   1246: aload #8
    //   1248: getfield e : Lb/g/c/e$e;
    //   1251: astore_1
    //   1252: aload_1
    //   1253: aload #9
    //   1255: iload #7
    //   1257: aload_1
    //   1258: getfield i : F
    //   1261: invokevirtual getDimension : (IF)F
    //   1264: putfield i : F
    //   1267: goto -> 2843
    //   1270: aload #8
    //   1272: getfield e : Lb/g/c/e$e;
    //   1275: astore_1
    //   1276: aload_1
    //   1277: aload #9
    //   1279: iload #7
    //   1281: aload_1
    //   1282: getfield h : F
    //   1285: invokevirtual getDimension : (IF)F
    //   1288: putfield h : F
    //   1291: goto -> 2843
    //   1294: aload #8
    //   1296: getfield e : Lb/g/c/e$e;
    //   1299: astore_1
    //   1300: aload_1
    //   1301: aload #9
    //   1303: iload #7
    //   1305: aload_1
    //   1306: getfield g : F
    //   1309: invokevirtual getDimension : (IF)F
    //   1312: putfield g : F
    //   1315: goto -> 2843
    //   1318: aload #8
    //   1320: getfield e : Lb/g/c/e$e;
    //   1323: astore_1
    //   1324: aload_1
    //   1325: aload #9
    //   1327: iload #7
    //   1329: aload_1
    //   1330: getfield f : F
    //   1333: invokevirtual getFloat : (IF)F
    //   1336: putfield f : F
    //   1339: goto -> 2843
    //   1342: aload #8
    //   1344: getfield e : Lb/g/c/e$e;
    //   1347: astore_1
    //   1348: aload_1
    //   1349: aload #9
    //   1351: iload #7
    //   1353: aload_1
    //   1354: getfield e : F
    //   1357: invokevirtual getFloat : (IF)F
    //   1360: putfield e : F
    //   1363: goto -> 2843
    //   1366: aload #8
    //   1368: getfield e : Lb/g/c/e$e;
    //   1371: astore_1
    //   1372: aload_1
    //   1373: aload #9
    //   1375: iload #7
    //   1377: aload_1
    //   1378: getfield d : F
    //   1381: invokevirtual getFloat : (IF)F
    //   1384: putfield d : F
    //   1387: goto -> 2843
    //   1390: aload #8
    //   1392: getfield e : Lb/g/c/e$e;
    //   1395: astore_1
    //   1396: aload_1
    //   1397: aload #9
    //   1399: iload #7
    //   1401: aload_1
    //   1402: getfield c : F
    //   1405: invokevirtual getFloat : (IF)F
    //   1408: putfield c : F
    //   1411: goto -> 2843
    //   1414: aload #8
    //   1416: getfield e : Lb/g/c/e$e;
    //   1419: astore_1
    //   1420: aload_1
    //   1421: iconst_1
    //   1422: putfield l : Z
    //   1425: aload_1
    //   1426: aload #9
    //   1428: iload #7
    //   1430: aload_1
    //   1431: getfield m : F
    //   1434: invokevirtual getDimension : (IF)F
    //   1437: putfield m : F
    //   1440: goto -> 2843
    //   1443: aload #8
    //   1445: getfield b : Lb/g/c/e$d;
    //   1448: astore_1
    //   1449: aload_1
    //   1450: aload #9
    //   1452: iload #7
    //   1454: aload_1
    //   1455: getfield d : F
    //   1458: invokevirtual getFloat : (IF)F
    //   1461: putfield d : F
    //   1464: goto -> 2843
    //   1467: aload #8
    //   1469: getfield d : Lb/g/c/e$b;
    //   1472: astore_1
    //   1473: aload_1
    //   1474: aload #9
    //   1476: iload #7
    //   1478: aload_1
    //   1479: getfield S : I
    //   1482: invokevirtual getInt : (II)I
    //   1485: putfield S : I
    //   1488: goto -> 2843
    //   1491: aload #8
    //   1493: getfield d : Lb/g/c/e$b;
    //   1496: astore_1
    //   1497: aload_1
    //   1498: aload #9
    //   1500: iload #7
    //   1502: aload_1
    //   1503: getfield R : I
    //   1506: invokevirtual getInt : (II)I
    //   1509: putfield R : I
    //   1512: goto -> 2843
    //   1515: aload #8
    //   1517: getfield d : Lb/g/c/e$b;
    //   1520: astore_1
    //   1521: aload_1
    //   1522: aload #9
    //   1524: iload #7
    //   1526: aload_1
    //   1527: getfield P : F
    //   1530: invokevirtual getFloat : (IF)F
    //   1533: putfield P : F
    //   1536: goto -> 2843
    //   1539: aload #8
    //   1541: getfield d : Lb/g/c/e$b;
    //   1544: astore_1
    //   1545: aload_1
    //   1546: aload #9
    //   1548: iload #7
    //   1550: aload_1
    //   1551: getfield Q : F
    //   1554: invokevirtual getFloat : (IF)F
    //   1557: putfield Q : F
    //   1560: goto -> 2843
    //   1563: aload #8
    //   1565: aload #9
    //   1567: iload #7
    //   1569: aload #8
    //   1571: getfield a : I
    //   1574: invokevirtual getResourceId : (II)I
    //   1577: putfield a : I
    //   1580: goto -> 2843
    //   1583: aload #8
    //   1585: getfield d : Lb/g/c/e$b;
    //   1588: astore_1
    //   1589: aload_1
    //   1590: aload #9
    //   1592: iload #7
    //   1594: aload_1
    //   1595: getfield v : F
    //   1598: invokevirtual getFloat : (IF)F
    //   1601: putfield v : F
    //   1604: goto -> 2843
    //   1607: aload #8
    //   1609: getfield d : Lb/g/c/e$b;
    //   1612: astore_1
    //   1613: aload #9
    //   1615: iload #7
    //   1617: aload_1
    //   1618: getfield l : I
    //   1621: invokevirtual getResourceId : (II)I
    //   1624: istore #5
    //   1626: iload #5
    //   1628: istore #4
    //   1630: iload #5
    //   1632: iconst_m1
    //   1633: if_icmpne -> 1646
    //   1636: aload #9
    //   1638: iload #7
    //   1640: iconst_m1
    //   1641: invokevirtual getInt : (II)I
    //   1644: istore #4
    //   1646: aload_1
    //   1647: iload #4
    //   1649: putfield l : I
    //   1652: goto -> 2843
    //   1655: aload #8
    //   1657: getfield d : Lb/g/c/e$b;
    //   1660: astore_1
    //   1661: aload #9
    //   1663: iload #7
    //   1665: aload_1
    //   1666: getfield m : I
    //   1669: invokevirtual getResourceId : (II)I
    //   1672: istore #5
    //   1674: iload #5
    //   1676: istore #4
    //   1678: iload #5
    //   1680: iconst_m1
    //   1681: if_icmpne -> 1694
    //   1684: aload #9
    //   1686: iload #7
    //   1688: iconst_m1
    //   1689: invokevirtual getInt : (II)I
    //   1692: istore #4
    //   1694: aload_1
    //   1695: iload #4
    //   1697: putfield m : I
    //   1700: goto -> 2843
    //   1703: aload #8
    //   1705: getfield d : Lb/g/c/e$b;
    //   1708: astore_1
    //   1709: aload_1
    //   1710: aload #9
    //   1712: iload #7
    //   1714: aload_1
    //   1715: getfield F : I
    //   1718: invokevirtual getDimensionPixelSize : (II)I
    //   1721: putfield F : I
    //   1724: goto -> 2843
    //   1727: aload #8
    //   1729: getfield d : Lb/g/c/e$b;
    //   1732: astore_1
    //   1733: aload #9
    //   1735: iload #7
    //   1737: aload_1
    //   1738: getfield r : I
    //   1741: invokevirtual getResourceId : (II)I
    //   1744: istore #5
    //   1746: iload #5
    //   1748: istore #4
    //   1750: iload #5
    //   1752: iconst_m1
    //   1753: if_icmpne -> 1766
    //   1756: aload #9
    //   1758: iload #7
    //   1760: iconst_m1
    //   1761: invokevirtual getInt : (II)I
    //   1764: istore #4
    //   1766: aload_1
    //   1767: iload #4
    //   1769: putfield r : I
    //   1772: goto -> 2843
    //   1775: aload #8
    //   1777: getfield d : Lb/g/c/e$b;
    //   1780: astore_1
    //   1781: aload #9
    //   1783: iload #7
    //   1785: aload_1
    //   1786: getfield q : I
    //   1789: invokevirtual getResourceId : (II)I
    //   1792: istore #5
    //   1794: iload #5
    //   1796: istore #4
    //   1798: iload #5
    //   1800: iconst_m1
    //   1801: if_icmpne -> 1814
    //   1804: aload #9
    //   1806: iload #7
    //   1808: iconst_m1
    //   1809: invokevirtual getInt : (II)I
    //   1812: istore #4
    //   1814: aload_1
    //   1815: iload #4
    //   1817: putfield q : I
    //   1820: goto -> 2843
    //   1823: aload #8
    //   1825: getfield d : Lb/g/c/e$b;
    //   1828: astore_1
    //   1829: aload_1
    //   1830: aload #9
    //   1832: iload #7
    //   1834: aload_1
    //   1835: getfield I : I
    //   1838: invokevirtual getDimensionPixelSize : (II)I
    //   1841: putfield I : I
    //   1844: goto -> 2843
    //   1847: aload #8
    //   1849: getfield d : Lb/g/c/e$b;
    //   1852: astore_1
    //   1853: aload #9
    //   1855: iload #7
    //   1857: aload_1
    //   1858: getfield k : I
    //   1861: invokevirtual getResourceId : (II)I
    //   1864: istore #5
    //   1866: iload #5
    //   1868: istore #4
    //   1870: iload #5
    //   1872: iconst_m1
    //   1873: if_icmpne -> 1886
    //   1876: aload #9
    //   1878: iload #7
    //   1880: iconst_m1
    //   1881: invokevirtual getInt : (II)I
    //   1884: istore #4
    //   1886: aload_1
    //   1887: iload #4
    //   1889: putfield k : I
    //   1892: goto -> 2843
    //   1895: aload #8
    //   1897: getfield d : Lb/g/c/e$b;
    //   1900: astore_1
    //   1901: aload #9
    //   1903: iload #7
    //   1905: aload_1
    //   1906: getfield j : I
    //   1909: invokevirtual getResourceId : (II)I
    //   1912: istore #5
    //   1914: iload #5
    //   1916: istore #4
    //   1918: iload #5
    //   1920: iconst_m1
    //   1921: if_icmpne -> 1934
    //   1924: aload #9
    //   1926: iload #7
    //   1928: iconst_m1
    //   1929: invokevirtual getInt : (II)I
    //   1932: istore #4
    //   1934: aload_1
    //   1935: iload #4
    //   1937: putfield j : I
    //   1940: goto -> 2843
    //   1943: aload #8
    //   1945: getfield d : Lb/g/c/e$b;
    //   1948: astore_1
    //   1949: aload_1
    //   1950: aload #9
    //   1952: iload #7
    //   1954: aload_1
    //   1955: getfield E : I
    //   1958: invokevirtual getDimensionPixelSize : (II)I
    //   1961: putfield E : I
    //   1964: goto -> 2843
    //   1967: aload #8
    //   1969: getfield d : Lb/g/c/e$b;
    //   1972: astore_1
    //   1973: aload_1
    //   1974: aload #9
    //   1976: iload #7
    //   1978: aload_1
    //   1979: getfield C : I
    //   1982: invokevirtual getInt : (II)I
    //   1985: putfield C : I
    //   1988: goto -> 2843
    //   1991: aload #8
    //   1993: getfield d : Lb/g/c/e$b;
    //   1996: astore_1
    //   1997: aload #9
    //   1999: iload #7
    //   2001: aload_1
    //   2002: getfield i : I
    //   2005: invokevirtual getResourceId : (II)I
    //   2008: istore #5
    //   2010: iload #5
    //   2012: istore #4
    //   2014: iload #5
    //   2016: iconst_m1
    //   2017: if_icmpne -> 2030
    //   2020: aload #9
    //   2022: iload #7
    //   2024: iconst_m1
    //   2025: invokevirtual getInt : (II)I
    //   2028: istore #4
    //   2030: aload_1
    //   2031: iload #4
    //   2033: putfield i : I
    //   2036: goto -> 2843
    //   2039: aload #8
    //   2041: getfield d : Lb/g/c/e$b;
    //   2044: astore_1
    //   2045: aload #9
    //   2047: iload #7
    //   2049: aload_1
    //   2050: getfield h : I
    //   2053: invokevirtual getResourceId : (II)I
    //   2056: istore #5
    //   2058: iload #5
    //   2060: istore #4
    //   2062: iload #5
    //   2064: iconst_m1
    //   2065: if_icmpne -> 2078
    //   2068: aload #9
    //   2070: iload #7
    //   2072: iconst_m1
    //   2073: invokevirtual getInt : (II)I
    //   2076: istore #4
    //   2078: aload_1
    //   2079: iload #4
    //   2081: putfield h : I
    //   2084: goto -> 2843
    //   2087: aload #8
    //   2089: getfield d : Lb/g/c/e$b;
    //   2092: astore_1
    //   2093: aload_1
    //   2094: aload #9
    //   2096: iload #7
    //   2098: aload_1
    //   2099: getfield D : I
    //   2102: invokevirtual getDimensionPixelSize : (II)I
    //   2105: putfield D : I
    //   2108: goto -> 2843
    //   2111: aload #8
    //   2113: getfield d : Lb/g/c/e$b;
    //   2116: astore_1
    //   2117: aload_1
    //   2118: aload #9
    //   2120: iload #7
    //   2122: aload_1
    //   2123: getfield c : I
    //   2126: invokevirtual getLayoutDimension : (II)I
    //   2129: putfield c : I
    //   2132: goto -> 2843
    //   2135: aload #8
    //   2137: getfield b : Lb/g/c/e$d;
    //   2140: astore_1
    //   2141: aload_1
    //   2142: aload #9
    //   2144: iload #7
    //   2146: aload_1
    //   2147: getfield b : I
    //   2150: invokevirtual getInt : (II)I
    //   2153: putfield b : I
    //   2156: aload #8
    //   2158: getfield b : Lb/g/c/e$d;
    //   2161: astore_1
    //   2162: aload_1
    //   2163: getstatic b/g/c/e.d : [I
    //   2166: aload_1
    //   2167: getfield b : I
    //   2170: iaload
    //   2171: putfield b : I
    //   2174: goto -> 2843
    //   2177: aload #8
    //   2179: getfield d : Lb/g/c/e$b;
    //   2182: astore_1
    //   2183: aload_1
    //   2184: aload #9
    //   2186: iload #7
    //   2188: aload_1
    //   2189: getfield d : I
    //   2192: invokevirtual getLayoutDimension : (II)I
    //   2195: putfield d : I
    //   2198: goto -> 2843
    //   2201: aload #8
    //   2203: getfield d : Lb/g/c/e$b;
    //   2206: astore_1
    //   2207: aload_1
    //   2208: aload #9
    //   2210: iload #7
    //   2212: aload_1
    //   2213: getfield u : F
    //   2216: invokevirtual getFloat : (IF)F
    //   2219: putfield u : F
    //   2222: goto -> 2843
    //   2225: aload #8
    //   2227: getfield d : Lb/g/c/e$b;
    //   2230: astore_1
    //   2231: aload_1
    //   2232: aload #9
    //   2234: iload #7
    //   2236: aload_1
    //   2237: getfield g : F
    //   2240: invokevirtual getFloat : (IF)F
    //   2243: putfield g : F
    //   2246: goto -> 2843
    //   2249: aload #8
    //   2251: getfield d : Lb/g/c/e$b;
    //   2254: astore_1
    //   2255: aload_1
    //   2256: aload #9
    //   2258: iload #7
    //   2260: aload_1
    //   2261: getfield f : I
    //   2264: invokevirtual getDimensionPixelOffset : (II)I
    //   2267: putfield f : I
    //   2270: goto -> 2843
    //   2273: aload #8
    //   2275: getfield d : Lb/g/c/e$b;
    //   2278: astore_1
    //   2279: aload_1
    //   2280: aload #9
    //   2282: iload #7
    //   2284: aload_1
    //   2285: getfield e : I
    //   2288: invokevirtual getDimensionPixelOffset : (II)I
    //   2291: putfield e : I
    //   2294: goto -> 2843
    //   2297: aload #8
    //   2299: getfield d : Lb/g/c/e$b;
    //   2302: astore_1
    //   2303: aload_1
    //   2304: aload #9
    //   2306: iload #7
    //   2308: aload_1
    //   2309: getfield K : I
    //   2312: invokevirtual getDimensionPixelSize : (II)I
    //   2315: putfield K : I
    //   2318: goto -> 2843
    //   2321: aload #8
    //   2323: getfield d : Lb/g/c/e$b;
    //   2326: astore_1
    //   2327: aload_1
    //   2328: aload #9
    //   2330: iload #7
    //   2332: aload_1
    //   2333: getfield O : I
    //   2336: invokevirtual getDimensionPixelSize : (II)I
    //   2339: putfield O : I
    //   2342: goto -> 2843
    //   2345: aload #8
    //   2347: getfield d : Lb/g/c/e$b;
    //   2350: astore_1
    //   2351: aload_1
    //   2352: aload #9
    //   2354: iload #7
    //   2356: aload_1
    //   2357: getfield L : I
    //   2360: invokevirtual getDimensionPixelSize : (II)I
    //   2363: putfield L : I
    //   2366: goto -> 2843
    //   2369: aload #8
    //   2371: getfield d : Lb/g/c/e$b;
    //   2374: astore_1
    //   2375: aload_1
    //   2376: aload #9
    //   2378: iload #7
    //   2380: aload_1
    //   2381: getfield J : I
    //   2384: invokevirtual getDimensionPixelSize : (II)I
    //   2387: putfield J : I
    //   2390: goto -> 2843
    //   2393: aload #8
    //   2395: getfield d : Lb/g/c/e$b;
    //   2398: astore_1
    //   2399: aload_1
    //   2400: aload #9
    //   2402: iload #7
    //   2404: aload_1
    //   2405: getfield N : I
    //   2408: invokevirtual getDimensionPixelSize : (II)I
    //   2411: putfield N : I
    //   2414: goto -> 2843
    //   2417: aload #8
    //   2419: getfield d : Lb/g/c/e$b;
    //   2422: astore_1
    //   2423: aload_1
    //   2424: aload #9
    //   2426: iload #7
    //   2428: aload_1
    //   2429: getfield M : I
    //   2432: invokevirtual getDimensionPixelSize : (II)I
    //   2435: putfield M : I
    //   2438: goto -> 2843
    //   2441: aload #8
    //   2443: getfield d : Lb/g/c/e$b;
    //   2446: astore_1
    //   2447: aload #9
    //   2449: iload #7
    //   2451: aload_1
    //   2452: getfield s : I
    //   2455: invokevirtual getResourceId : (II)I
    //   2458: istore #5
    //   2460: iload #5
    //   2462: istore #4
    //   2464: iload #5
    //   2466: iconst_m1
    //   2467: if_icmpne -> 2480
    //   2470: aload #9
    //   2472: iload #7
    //   2474: iconst_m1
    //   2475: invokevirtual getInt : (II)I
    //   2478: istore #4
    //   2480: aload_1
    //   2481: iload #4
    //   2483: putfield s : I
    //   2486: goto -> 2843
    //   2489: aload #8
    //   2491: getfield d : Lb/g/c/e$b;
    //   2494: astore_1
    //   2495: aload #9
    //   2497: iload #7
    //   2499: aload_1
    //   2500: getfield t : I
    //   2503: invokevirtual getResourceId : (II)I
    //   2506: istore #5
    //   2508: iload #5
    //   2510: istore #4
    //   2512: iload #5
    //   2514: iconst_m1
    //   2515: if_icmpne -> 2528
    //   2518: aload #9
    //   2520: iload #7
    //   2522: iconst_m1
    //   2523: invokevirtual getInt : (II)I
    //   2526: istore #4
    //   2528: aload_1
    //   2529: iload #4
    //   2531: putfield t : I
    //   2534: goto -> 2843
    //   2537: aload #8
    //   2539: getfield d : Lb/g/c/e$b;
    //   2542: astore_1
    //   2543: aload_1
    //   2544: aload #9
    //   2546: iload #7
    //   2548: aload_1
    //   2549: getfield H : I
    //   2552: invokevirtual getDimensionPixelSize : (II)I
    //   2555: putfield H : I
    //   2558: goto -> 2843
    //   2561: aload #8
    //   2563: getfield d : Lb/g/c/e$b;
    //   2566: astore_1
    //   2567: aload_1
    //   2568: aload #9
    //   2570: iload #7
    //   2572: aload_1
    //   2573: getfield B : I
    //   2576: invokevirtual getDimensionPixelOffset : (II)I
    //   2579: putfield B : I
    //   2582: goto -> 2843
    //   2585: aload #8
    //   2587: getfield d : Lb/g/c/e$b;
    //   2590: astore_1
    //   2591: aload_1
    //   2592: aload #9
    //   2594: iload #7
    //   2596: aload_1
    //   2597: getfield A : I
    //   2600: invokevirtual getDimensionPixelOffset : (II)I
    //   2603: putfield A : I
    //   2606: goto -> 2843
    //   2609: aload #8
    //   2611: getfield d : Lb/g/c/e$b;
    //   2614: aload #9
    //   2616: iload #7
    //   2618: invokevirtual getString : (I)Ljava/lang/String;
    //   2621: putfield w : Ljava/lang/String;
    //   2624: goto -> 2843
    //   2627: aload #8
    //   2629: getfield d : Lb/g/c/e$b;
    //   2632: astore_1
    //   2633: aload #9
    //   2635: iload #7
    //   2637: aload_1
    //   2638: getfield n : I
    //   2641: invokevirtual getResourceId : (II)I
    //   2644: istore #5
    //   2646: iload #5
    //   2648: istore #4
    //   2650: iload #5
    //   2652: iconst_m1
    //   2653: if_icmpne -> 2666
    //   2656: aload #9
    //   2658: iload #7
    //   2660: iconst_m1
    //   2661: invokevirtual getInt : (II)I
    //   2664: istore #4
    //   2666: aload_1
    //   2667: iload #4
    //   2669: putfield n : I
    //   2672: goto -> 2843
    //   2675: aload #8
    //   2677: getfield d : Lb/g/c/e$b;
    //   2680: astore_1
    //   2681: aload #9
    //   2683: iload #7
    //   2685: aload_1
    //   2686: getfield o : I
    //   2689: invokevirtual getResourceId : (II)I
    //   2692: istore #5
    //   2694: iload #5
    //   2696: istore #4
    //   2698: iload #5
    //   2700: iconst_m1
    //   2701: if_icmpne -> 2714
    //   2704: aload #9
    //   2706: iload #7
    //   2708: iconst_m1
    //   2709: invokevirtual getInt : (II)I
    //   2712: istore #4
    //   2714: aload_1
    //   2715: iload #4
    //   2717: putfield o : I
    //   2720: goto -> 2843
    //   2723: aload #8
    //   2725: getfield d : Lb/g/c/e$b;
    //   2728: astore_1
    //   2729: aload_1
    //   2730: aload #9
    //   2732: iload #7
    //   2734: aload_1
    //   2735: getfield G : I
    //   2738: invokevirtual getDimensionPixelSize : (II)I
    //   2741: putfield G : I
    //   2744: goto -> 2843
    //   2747: aload #8
    //   2749: getfield d : Lb/g/c/e$b;
    //   2752: astore_1
    //   2753: aload #9
    //   2755: iload #7
    //   2757: aload_1
    //   2758: getfield p : I
    //   2761: invokevirtual getResourceId : (II)I
    //   2764: istore #5
    //   2766: iload #5
    //   2768: istore #4
    //   2770: iload #5
    //   2772: iconst_m1
    //   2773: if_icmpne -> 2786
    //   2776: aload #9
    //   2778: iload #7
    //   2780: iconst_m1
    //   2781: invokevirtual getInt : (II)I
    //   2784: istore #4
    //   2786: aload_1
    //   2787: iload #4
    //   2789: putfield p : I
    //   2792: goto -> 2843
    //   2795: aload_1
    //   2796: aload_2
    //   2797: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2800: pop
    //   2801: aload_1
    //   2802: iload #7
    //   2804: invokestatic toHexString : (I)Ljava/lang/String;
    //   2807: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2810: pop
    //   2811: aload_1
    //   2812: ldc_w '   '
    //   2815: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2818: pop
    //   2819: aload_1
    //   2820: getstatic b/g/c/e.e : Landroid/util/SparseIntArray;
    //   2823: iload #7
    //   2825: invokevirtual get : (I)I
    //   2828: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2831: pop
    //   2832: ldc_w 'ConstraintSet'
    //   2835: aload_1
    //   2836: invokevirtual toString : ()Ljava/lang/String;
    //   2839: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   2842: pop
    //   2843: iinc #3, 1
    //   2846: goto -> 28
    //   2849: aload #9
    //   2851: invokevirtual recycle : ()V
    //   2854: aload #8
    //   2856: areturn
  }
  
  public void e(Context paramContext, int paramInt) {
    XmlResourceParser xmlResourceParser = paramContext.getResources().getXml(paramInt);
    try {
      for (paramInt = xmlResourceParser.getEventType(); paramInt != 1; paramInt = xmlResourceParser.next()) {
        if (paramInt != 0) {
          if (paramInt == 2) {
            String str = xmlResourceParser.getName();
            a a = d(paramContext, Xml.asAttributeSet((XmlPullParser)xmlResourceParser));
            if (str.equalsIgnoreCase("Guideline"))
              a.d.a = true; 
            this.c.put(Integer.valueOf(a.a), a);
          } 
        } else {
          xmlResourceParser.getName();
        } 
      } 
    } catch (XmlPullParserException xmlPullParserException) {
      xmlPullParserException.printStackTrace();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  public static class a {
    public int a;
    
    public final e.d b = new e.d();
    
    public final e.c c = new e.c();
    
    public final e.b d = new e.b();
    
    public final e.e e = new e.e();
    
    public HashMap<String, b> f = new HashMap<String, b>();
    
    public void a(ConstraintLayout.a param1a) {
      e.b b1 = this.d;
      param1a.d = b1.h;
      param1a.e = b1.i;
      param1a.f = b1.j;
      param1a.g = b1.k;
      param1a.h = b1.l;
      param1a.i = b1.m;
      param1a.j = b1.n;
      param1a.k = b1.o;
      param1a.l = b1.p;
      param1a.p = b1.q;
      param1a.q = b1.r;
      param1a.r = b1.s;
      param1a.s = b1.t;
      ((ViewGroup.MarginLayoutParams)param1a).leftMargin = b1.D;
      ((ViewGroup.MarginLayoutParams)param1a).rightMargin = b1.E;
      ((ViewGroup.MarginLayoutParams)param1a).topMargin = b1.F;
      ((ViewGroup.MarginLayoutParams)param1a).bottomMargin = b1.G;
      param1a.x = b1.O;
      param1a.y = b1.N;
      param1a.u = b1.K;
      param1a.w = b1.M;
      param1a.z = b1.u;
      param1a.A = b1.v;
      param1a.m = b1.x;
      param1a.n = b1.y;
      param1a.o = b1.z;
      param1a.B = b1.w;
      param1a.P = b1.A;
      param1a.Q = b1.B;
      param1a.E = b1.P;
      param1a.D = b1.Q;
      param1a.G = b1.S;
      param1a.F = b1.R;
      param1a.S = b1.h0;
      param1a.T = b1.i0;
      param1a.H = b1.T;
      param1a.I = b1.U;
      param1a.L = b1.V;
      param1a.M = b1.W;
      param1a.J = b1.X;
      param1a.K = b1.Y;
      param1a.N = b1.Z;
      param1a.O = b1.a0;
      param1a.R = b1.C;
      param1a.c = b1.g;
      param1a.a = b1.e;
      param1a.b = b1.f;
      ((ViewGroup.MarginLayoutParams)param1a).width = b1.c;
      ((ViewGroup.MarginLayoutParams)param1a).height = b1.d;
      String str = b1.g0;
      if (str != null)
        param1a.U = str; 
      param1a.setMarginStart(this.d.I);
      param1a.setMarginEnd(this.d.H);
      param1a.a();
    }
    
    public final void b(int param1Int, ConstraintLayout.a param1a) {
      this.a = param1Int;
      e.b b1 = this.d;
      b1.h = param1a.d;
      b1.i = param1a.e;
      b1.j = param1a.f;
      b1.k = param1a.g;
      b1.l = param1a.h;
      b1.m = param1a.i;
      b1.n = param1a.j;
      b1.o = param1a.k;
      b1.p = param1a.l;
      b1.q = param1a.p;
      b1.r = param1a.q;
      b1.s = param1a.r;
      b1.t = param1a.s;
      b1.u = param1a.z;
      b1.v = param1a.A;
      b1.w = param1a.B;
      b1.x = param1a.m;
      b1.y = param1a.n;
      b1.z = param1a.o;
      b1.A = param1a.P;
      b1.B = param1a.Q;
      b1.C = param1a.R;
      b1.g = param1a.c;
      b1.e = param1a.a;
      b1.f = param1a.b;
      b1.c = ((ViewGroup.MarginLayoutParams)param1a).width;
      b1.d = ((ViewGroup.MarginLayoutParams)param1a).height;
      b1.D = ((ViewGroup.MarginLayoutParams)param1a).leftMargin;
      b1.E = ((ViewGroup.MarginLayoutParams)param1a).rightMargin;
      b1.F = ((ViewGroup.MarginLayoutParams)param1a).topMargin;
      b1.G = ((ViewGroup.MarginLayoutParams)param1a).bottomMargin;
      b1.P = param1a.E;
      b1.Q = param1a.D;
      b1.S = param1a.G;
      b1.R = param1a.F;
      b1.h0 = param1a.S;
      b1.i0 = param1a.T;
      b1.T = param1a.H;
      b1.U = param1a.I;
      b1.V = param1a.L;
      b1.W = param1a.M;
      b1.X = param1a.J;
      b1.Y = param1a.K;
      b1.Z = param1a.N;
      b1.a0 = param1a.O;
      b1.g0 = param1a.U;
      b1.K = param1a.u;
      b1.M = param1a.w;
      b1.J = param1a.t;
      b1.L = param1a.v;
      b1.O = param1a.x;
      b1.N = param1a.y;
      b1.H = param1a.getMarginEnd();
      this.d.I = param1a.getMarginStart();
    }
    
    public final void c(int param1Int, f.a param1a) {
      b(param1Int, param1a);
      this.b.d = param1a.n0;
      e.e e1 = this.e;
      e1.b = param1a.q0;
      e1.c = param1a.r0;
      e1.d = param1a.s0;
      e1.e = param1a.t0;
      e1.f = param1a.u0;
      e1.g = param1a.v0;
      e1.h = param1a.w0;
      e1.i = param1a.x0;
      e1.j = param1a.y0;
      e1.k = param1a.z0;
      e1.m = param1a.p0;
      e1.l = param1a.o0;
    }
    
    public Object clone() {
      a a1 = new a();
      e.b b2 = a1.d;
      e.b b1 = this.d;
      if (b2 != null) {
        b2.a = b1.a;
        b2.c = b1.c;
        b2.b = b1.b;
        b2.d = b1.d;
        b2.e = b1.e;
        b2.f = b1.f;
        b2.g = b1.g;
        b2.h = b1.h;
        b2.i = b1.i;
        b2.j = b1.j;
        b2.k = b1.k;
        b2.l = b1.l;
        b2.m = b1.m;
        b2.n = b1.n;
        b2.o = b1.o;
        b2.p = b1.p;
        b2.q = b1.q;
        b2.r = b1.r;
        b2.s = b1.s;
        b2.t = b1.t;
        b2.u = b1.u;
        b2.v = b1.v;
        b2.w = b1.w;
        b2.x = b1.x;
        b2.y = b1.y;
        b2.z = b1.z;
        b2.A = b1.A;
        b2.B = b1.B;
        b2.C = b1.C;
        b2.D = b1.D;
        b2.E = b1.E;
        b2.F = b1.F;
        b2.G = b1.G;
        b2.H = b1.H;
        b2.I = b1.I;
        b2.J = b1.J;
        b2.K = b1.K;
        b2.L = b1.L;
        b2.M = b1.M;
        b2.N = b1.N;
        b2.O = b1.O;
        b2.P = b1.P;
        b2.Q = b1.Q;
        b2.R = b1.R;
        b2.S = b1.S;
        b2.T = b1.T;
        b2.U = b1.U;
        b2.V = b1.V;
        b2.W = b1.W;
        b2.X = b1.X;
        b2.Y = b1.Y;
        b2.Z = b1.Z;
        b2.a0 = b1.a0;
        b2.b0 = b1.b0;
        b2.c0 = b1.c0;
        b2.d0 = b1.d0;
        b2.g0 = b1.g0;
        int[] arrayOfInt = b1.e0;
        if (arrayOfInt != null) {
          b2.e0 = Arrays.copyOf(arrayOfInt, arrayOfInt.length);
        } else {
          b2.e0 = null;
        } 
        b2.f0 = b1.f0;
        b2.h0 = b1.h0;
        b2.i0 = b1.i0;
        b2.j0 = b1.j0;
        e.c c1 = a1.c;
        e.c c2 = this.c;
        if (c1 != null) {
          c1.a = c2.a;
          c1.b = c2.b;
          c1.c = c2.c;
          c1.d = c2.d;
          c1.e = c2.e;
          c1.g = c2.g;
          c1.f = c2.f;
          e.d d2 = a1.b;
          e.d d1 = this.b;
          if (d2 != null) {
            d2.a = d1.a;
            d2.b = d1.b;
            d2.d = d1.d;
            d2.e = d1.e;
            d2.c = d1.c;
            e.e e1 = a1.e;
            e.e e2 = this.e;
            if (e1 != null) {
              e1.a = e2.a;
              e1.b = e2.b;
              e1.c = e2.c;
              e1.d = e2.d;
              e1.e = e2.e;
              e1.f = e2.f;
              e1.g = e2.g;
              e1.h = e2.h;
              e1.i = e2.i;
              e1.j = e2.j;
              e1.k = e2.k;
              e1.l = e2.l;
              e1.m = e2.m;
              a1.a = this.a;
              return a1;
            } 
            throw null;
          } 
          throw null;
        } 
        throw null;
      } 
      throw null;
    }
  }
  
  public static class b {
    public static SparseIntArray k0;
    
    public int A = -1;
    
    public int B = -1;
    
    public int C = -1;
    
    public int D = -1;
    
    public int E = -1;
    
    public int F = -1;
    
    public int G = -1;
    
    public int H = -1;
    
    public int I = -1;
    
    public int J = -1;
    
    public int K = -1;
    
    public int L = -1;
    
    public int M = -1;
    
    public int N = -1;
    
    public int O = -1;
    
    public float P = -1.0F;
    
    public float Q = -1.0F;
    
    public int R = 0;
    
    public int S = 0;
    
    public int T = 0;
    
    public int U = 0;
    
    public int V = -1;
    
    public int W = -1;
    
    public int X = -1;
    
    public int Y = -1;
    
    public float Z = 1.0F;
    
    public boolean a = false;
    
    public float a0 = 1.0F;
    
    public boolean b = false;
    
    public int b0 = -1;
    
    public int c;
    
    public int c0 = 0;
    
    public int d;
    
    public int d0 = -1;
    
    public int e = -1;
    
    public int[] e0;
    
    public int f = -1;
    
    public String f0;
    
    public float g = -1.0F;
    
    public String g0;
    
    public int h = -1;
    
    public boolean h0 = false;
    
    public int i = -1;
    
    public boolean i0 = false;
    
    public int j = -1;
    
    public boolean j0 = true;
    
    public int k = -1;
    
    public int l = -1;
    
    public int m = -1;
    
    public int n = -1;
    
    public int o = -1;
    
    public int p = -1;
    
    public int q = -1;
    
    public int r = -1;
    
    public int s = -1;
    
    public int t = -1;
    
    public float u = 0.5F;
    
    public float v = 0.5F;
    
    public String w = null;
    
    public int x = -1;
    
    public int y = 0;
    
    public float z = 0.0F;
    
    static {
      SparseIntArray sparseIntArray = new SparseIntArray();
      k0 = sparseIntArray;
      sparseIntArray.append(k.Layout_layout_constraintLeft_toLeftOf, 24);
      k0.append(k.Layout_layout_constraintLeft_toRightOf, 25);
      k0.append(k.Layout_layout_constraintRight_toLeftOf, 28);
      k0.append(k.Layout_layout_constraintRight_toRightOf, 29);
      k0.append(k.Layout_layout_constraintTop_toTopOf, 35);
      k0.append(k.Layout_layout_constraintTop_toBottomOf, 34);
      k0.append(k.Layout_layout_constraintBottom_toTopOf, 4);
      k0.append(k.Layout_layout_constraintBottom_toBottomOf, 3);
      k0.append(k.Layout_layout_constraintBaseline_toBaselineOf, 1);
      k0.append(k.Layout_layout_editor_absoluteX, 6);
      k0.append(k.Layout_layout_editor_absoluteY, 7);
      k0.append(k.Layout_layout_constraintGuide_begin, 17);
      k0.append(k.Layout_layout_constraintGuide_end, 18);
      k0.append(k.Layout_layout_constraintGuide_percent, 19);
      k0.append(k.Layout_android_orientation, 26);
      k0.append(k.Layout_layout_constraintStart_toEndOf, 31);
      k0.append(k.Layout_layout_constraintStart_toStartOf, 32);
      k0.append(k.Layout_layout_constraintEnd_toStartOf, 10);
      k0.append(k.Layout_layout_constraintEnd_toEndOf, 9);
      k0.append(k.Layout_layout_goneMarginLeft, 13);
      k0.append(k.Layout_layout_goneMarginTop, 16);
      k0.append(k.Layout_layout_goneMarginRight, 14);
      k0.append(k.Layout_layout_goneMarginBottom, 11);
      k0.append(k.Layout_layout_goneMarginStart, 15);
      k0.append(k.Layout_layout_goneMarginEnd, 12);
      k0.append(k.Layout_layout_constraintVertical_weight, 38);
      k0.append(k.Layout_layout_constraintHorizontal_weight, 37);
      k0.append(k.Layout_layout_constraintHorizontal_chainStyle, 39);
      k0.append(k.Layout_layout_constraintVertical_chainStyle, 40);
      k0.append(k.Layout_layout_constraintHorizontal_bias, 20);
      k0.append(k.Layout_layout_constraintVertical_bias, 36);
      k0.append(k.Layout_layout_constraintDimensionRatio, 5);
      k0.append(k.Layout_layout_constraintLeft_creator, 76);
      k0.append(k.Layout_layout_constraintTop_creator, 76);
      k0.append(k.Layout_layout_constraintRight_creator, 76);
      k0.append(k.Layout_layout_constraintBottom_creator, 76);
      k0.append(k.Layout_layout_constraintBaseline_creator, 76);
      k0.append(k.Layout_android_layout_marginLeft, 23);
      k0.append(k.Layout_android_layout_marginRight, 27);
      k0.append(k.Layout_android_layout_marginStart, 30);
      k0.append(k.Layout_android_layout_marginEnd, 8);
      k0.append(k.Layout_android_layout_marginTop, 33);
      k0.append(k.Layout_android_layout_marginBottom, 2);
      k0.append(k.Layout_android_layout_width, 22);
      k0.append(k.Layout_android_layout_height, 21);
      k0.append(k.Layout_layout_constraintCircle, 61);
      k0.append(k.Layout_layout_constraintCircleRadius, 62);
      k0.append(k.Layout_layout_constraintCircleAngle, 63);
      k0.append(k.Layout_layout_constraintWidth_percent, 69);
      k0.append(k.Layout_layout_constraintHeight_percent, 70);
      k0.append(k.Layout_chainUseRtl, 71);
      k0.append(k.Layout_barrierDirection, 72);
      k0.append(k.Layout_barrierMargin, 73);
      k0.append(k.Layout_constraint_referenced_ids, 74);
      k0.append(k.Layout_barrierAllowsGoneWidgets, 75);
    }
    
    public void a(Context param1Context, AttributeSet param1AttributeSet) {
      // Byte code:
      //   0: aload_1
      //   1: aload_2
      //   2: getstatic b/g/c/k.Layout : [I
      //   5: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      //   8: astore #7
      //   10: aload_0
      //   11: iconst_1
      //   12: putfield b : Z
      //   15: aload #7
      //   17: invokevirtual getIndexCount : ()I
      //   20: istore #4
      //   22: iconst_0
      //   23: istore_3
      //   24: iload_3
      //   25: iload #4
      //   27: if_icmpge -> 1483
      //   30: aload #7
      //   32: iload_3
      //   33: invokevirtual getIndex : (I)I
      //   36: istore #5
      //   38: getstatic b/g/c/e$b.k0 : Landroid/util/SparseIntArray;
      //   41: iload #5
      //   43: invokevirtual get : (I)I
      //   46: istore #6
      //   48: iload #6
      //   50: bipush #80
      //   52: if_icmpeq -> 1462
      //   55: iload #6
      //   57: bipush #81
      //   59: if_icmpeq -> 1444
      //   62: iload #6
      //   64: tableswitch default -> 240, 1 -> 1073, 2 -> 1055, 3 -> 1037, 4 -> 1019, 5 -> 1005, 6 -> 987, 7 -> 969, 8 -> 951, 9 -> 933, 10 -> 915, 11 -> 897, 12 -> 879, 13 -> 861, 14 -> 843, 15 -> 825, 16 -> 807, 17 -> 789, 18 -> 771, 19 -> 753, 20 -> 735, 21 -> 717, 22 -> 699, 23 -> 681, 24 -> 663, 25 -> 645, 26 -> 627, 27 -> 609, 28 -> 591, 29 -> 573, 30 -> 555, 31 -> 537, 32 -> 519, 33 -> 501, 34 -> 483, 35 -> 465, 36 -> 447, 37 -> 429, 38 -> 411, 39 -> 393, 40 -> 375
      //   240: iload #6
      //   242: tableswitch default -> 280, 54 -> 1181, 55 -> 1163, 56 -> 1145, 57 -> 1127, 58 -> 1109, 59 -> 1091
      //   280: iload #6
      //   282: tableswitch default -> 308, 61 -> 1235, 62 -> 1217, 63 -> 1199
      //   308: iload #6
      //   310: tableswitch default -> 360, 69 -> 1378, 70 -> 1363, 71 -> 1350, 72 -> 1332, 73 -> 1314, 74 -> 1300, 75 -> 1282, 76 -> 1267, 77 -> 1253
      //   360: new java/lang/StringBuilder
      //   363: dup
      //   364: invokespecial <init> : ()V
      //   367: astore_1
      //   368: ldc_w 'Unknown attribute 0x'
      //   371: astore_2
      //   372: goto -> 1393
      //   375: aload_0
      //   376: aload #7
      //   378: iload #5
      //   380: aload_0
      //   381: getfield S : I
      //   384: invokevirtual getInt : (II)I
      //   387: putfield S : I
      //   390: goto -> 1477
      //   393: aload_0
      //   394: aload #7
      //   396: iload #5
      //   398: aload_0
      //   399: getfield R : I
      //   402: invokevirtual getInt : (II)I
      //   405: putfield R : I
      //   408: goto -> 1477
      //   411: aload_0
      //   412: aload #7
      //   414: iload #5
      //   416: aload_0
      //   417: getfield P : F
      //   420: invokevirtual getFloat : (IF)F
      //   423: putfield P : F
      //   426: goto -> 1477
      //   429: aload_0
      //   430: aload #7
      //   432: iload #5
      //   434: aload_0
      //   435: getfield Q : F
      //   438: invokevirtual getFloat : (IF)F
      //   441: putfield Q : F
      //   444: goto -> 1477
      //   447: aload_0
      //   448: aload #7
      //   450: iload #5
      //   452: aload_0
      //   453: getfield v : F
      //   456: invokevirtual getFloat : (IF)F
      //   459: putfield v : F
      //   462: goto -> 1477
      //   465: aload_0
      //   466: aload #7
      //   468: iload #5
      //   470: aload_0
      //   471: getfield l : I
      //   474: invokestatic a : (Landroid/content/res/TypedArray;II)I
      //   477: putfield l : I
      //   480: goto -> 1477
      //   483: aload_0
      //   484: aload #7
      //   486: iload #5
      //   488: aload_0
      //   489: getfield m : I
      //   492: invokestatic a : (Landroid/content/res/TypedArray;II)I
      //   495: putfield m : I
      //   498: goto -> 1477
      //   501: aload_0
      //   502: aload #7
      //   504: iload #5
      //   506: aload_0
      //   507: getfield F : I
      //   510: invokevirtual getDimensionPixelSize : (II)I
      //   513: putfield F : I
      //   516: goto -> 1477
      //   519: aload_0
      //   520: aload #7
      //   522: iload #5
      //   524: aload_0
      //   525: getfield r : I
      //   528: invokestatic a : (Landroid/content/res/TypedArray;II)I
      //   531: putfield r : I
      //   534: goto -> 1477
      //   537: aload_0
      //   538: aload #7
      //   540: iload #5
      //   542: aload_0
      //   543: getfield q : I
      //   546: invokestatic a : (Landroid/content/res/TypedArray;II)I
      //   549: putfield q : I
      //   552: goto -> 1477
      //   555: aload_0
      //   556: aload #7
      //   558: iload #5
      //   560: aload_0
      //   561: getfield I : I
      //   564: invokevirtual getDimensionPixelSize : (II)I
      //   567: putfield I : I
      //   570: goto -> 1477
      //   573: aload_0
      //   574: aload #7
      //   576: iload #5
      //   578: aload_0
      //   579: getfield k : I
      //   582: invokestatic a : (Landroid/content/res/TypedArray;II)I
      //   585: putfield k : I
      //   588: goto -> 1477
      //   591: aload_0
      //   592: aload #7
      //   594: iload #5
      //   596: aload_0
      //   597: getfield j : I
      //   600: invokestatic a : (Landroid/content/res/TypedArray;II)I
      //   603: putfield j : I
      //   606: goto -> 1477
      //   609: aload_0
      //   610: aload #7
      //   612: iload #5
      //   614: aload_0
      //   615: getfield E : I
      //   618: invokevirtual getDimensionPixelSize : (II)I
      //   621: putfield E : I
      //   624: goto -> 1477
      //   627: aload_0
      //   628: aload #7
      //   630: iload #5
      //   632: aload_0
      //   633: getfield C : I
      //   636: invokevirtual getInt : (II)I
      //   639: putfield C : I
      //   642: goto -> 1477
      //   645: aload_0
      //   646: aload #7
      //   648: iload #5
      //   650: aload_0
      //   651: getfield i : I
      //   654: invokestatic a : (Landroid/content/res/TypedArray;II)I
      //   657: putfield i : I
      //   660: goto -> 1477
      //   663: aload_0
      //   664: aload #7
      //   666: iload #5
      //   668: aload_0
      //   669: getfield h : I
      //   672: invokestatic a : (Landroid/content/res/TypedArray;II)I
      //   675: putfield h : I
      //   678: goto -> 1477
      //   681: aload_0
      //   682: aload #7
      //   684: iload #5
      //   686: aload_0
      //   687: getfield D : I
      //   690: invokevirtual getDimensionPixelSize : (II)I
      //   693: putfield D : I
      //   696: goto -> 1477
      //   699: aload_0
      //   700: aload #7
      //   702: iload #5
      //   704: aload_0
      //   705: getfield c : I
      //   708: invokevirtual getLayoutDimension : (II)I
      //   711: putfield c : I
      //   714: goto -> 1477
      //   717: aload_0
      //   718: aload #7
      //   720: iload #5
      //   722: aload_0
      //   723: getfield d : I
      //   726: invokevirtual getLayoutDimension : (II)I
      //   729: putfield d : I
      //   732: goto -> 1477
      //   735: aload_0
      //   736: aload #7
      //   738: iload #5
      //   740: aload_0
      //   741: getfield u : F
      //   744: invokevirtual getFloat : (IF)F
      //   747: putfield u : F
      //   750: goto -> 1477
      //   753: aload_0
      //   754: aload #7
      //   756: iload #5
      //   758: aload_0
      //   759: getfield g : F
      //   762: invokevirtual getFloat : (IF)F
      //   765: putfield g : F
      //   768: goto -> 1477
      //   771: aload_0
      //   772: aload #7
      //   774: iload #5
      //   776: aload_0
      //   777: getfield f : I
      //   780: invokevirtual getDimensionPixelOffset : (II)I
      //   783: putfield f : I
      //   786: goto -> 1477
      //   789: aload_0
      //   790: aload #7
      //   792: iload #5
      //   794: aload_0
      //   795: getfield e : I
      //   798: invokevirtual getDimensionPixelOffset : (II)I
      //   801: putfield e : I
      //   804: goto -> 1477
      //   807: aload_0
      //   808: aload #7
      //   810: iload #5
      //   812: aload_0
      //   813: getfield K : I
      //   816: invokevirtual getDimensionPixelSize : (II)I
      //   819: putfield K : I
      //   822: goto -> 1477
      //   825: aload_0
      //   826: aload #7
      //   828: iload #5
      //   830: aload_0
      //   831: getfield O : I
      //   834: invokevirtual getDimensionPixelSize : (II)I
      //   837: putfield O : I
      //   840: goto -> 1477
      //   843: aload_0
      //   844: aload #7
      //   846: iload #5
      //   848: aload_0
      //   849: getfield L : I
      //   852: invokevirtual getDimensionPixelSize : (II)I
      //   855: putfield L : I
      //   858: goto -> 1477
      //   861: aload_0
      //   862: aload #7
      //   864: iload #5
      //   866: aload_0
      //   867: getfield J : I
      //   870: invokevirtual getDimensionPixelSize : (II)I
      //   873: putfield J : I
      //   876: goto -> 1477
      //   879: aload_0
      //   880: aload #7
      //   882: iload #5
      //   884: aload_0
      //   885: getfield N : I
      //   888: invokevirtual getDimensionPixelSize : (II)I
      //   891: putfield N : I
      //   894: goto -> 1477
      //   897: aload_0
      //   898: aload #7
      //   900: iload #5
      //   902: aload_0
      //   903: getfield M : I
      //   906: invokevirtual getDimensionPixelSize : (II)I
      //   909: putfield M : I
      //   912: goto -> 1477
      //   915: aload_0
      //   916: aload #7
      //   918: iload #5
      //   920: aload_0
      //   921: getfield s : I
      //   924: invokestatic a : (Landroid/content/res/TypedArray;II)I
      //   927: putfield s : I
      //   930: goto -> 1477
      //   933: aload_0
      //   934: aload #7
      //   936: iload #5
      //   938: aload_0
      //   939: getfield t : I
      //   942: invokestatic a : (Landroid/content/res/TypedArray;II)I
      //   945: putfield t : I
      //   948: goto -> 1477
      //   951: aload_0
      //   952: aload #7
      //   954: iload #5
      //   956: aload_0
      //   957: getfield H : I
      //   960: invokevirtual getDimensionPixelSize : (II)I
      //   963: putfield H : I
      //   966: goto -> 1477
      //   969: aload_0
      //   970: aload #7
      //   972: iload #5
      //   974: aload_0
      //   975: getfield B : I
      //   978: invokevirtual getDimensionPixelOffset : (II)I
      //   981: putfield B : I
      //   984: goto -> 1477
      //   987: aload_0
      //   988: aload #7
      //   990: iload #5
      //   992: aload_0
      //   993: getfield A : I
      //   996: invokevirtual getDimensionPixelOffset : (II)I
      //   999: putfield A : I
      //   1002: goto -> 1477
      //   1005: aload_0
      //   1006: aload #7
      //   1008: iload #5
      //   1010: invokevirtual getString : (I)Ljava/lang/String;
      //   1013: putfield w : Ljava/lang/String;
      //   1016: goto -> 1477
      //   1019: aload_0
      //   1020: aload #7
      //   1022: iload #5
      //   1024: aload_0
      //   1025: getfield n : I
      //   1028: invokestatic a : (Landroid/content/res/TypedArray;II)I
      //   1031: putfield n : I
      //   1034: goto -> 1477
      //   1037: aload_0
      //   1038: aload #7
      //   1040: iload #5
      //   1042: aload_0
      //   1043: getfield o : I
      //   1046: invokestatic a : (Landroid/content/res/TypedArray;II)I
      //   1049: putfield o : I
      //   1052: goto -> 1477
      //   1055: aload_0
      //   1056: aload #7
      //   1058: iload #5
      //   1060: aload_0
      //   1061: getfield G : I
      //   1064: invokevirtual getDimensionPixelSize : (II)I
      //   1067: putfield G : I
      //   1070: goto -> 1477
      //   1073: aload_0
      //   1074: aload #7
      //   1076: iload #5
      //   1078: aload_0
      //   1079: getfield p : I
      //   1082: invokestatic a : (Landroid/content/res/TypedArray;II)I
      //   1085: putfield p : I
      //   1088: goto -> 1477
      //   1091: aload_0
      //   1092: aload #7
      //   1094: iload #5
      //   1096: aload_0
      //   1097: getfield Y : I
      //   1100: invokevirtual getDimensionPixelSize : (II)I
      //   1103: putfield Y : I
      //   1106: goto -> 1477
      //   1109: aload_0
      //   1110: aload #7
      //   1112: iload #5
      //   1114: aload_0
      //   1115: getfield X : I
      //   1118: invokevirtual getDimensionPixelSize : (II)I
      //   1121: putfield X : I
      //   1124: goto -> 1477
      //   1127: aload_0
      //   1128: aload #7
      //   1130: iload #5
      //   1132: aload_0
      //   1133: getfield W : I
      //   1136: invokevirtual getDimensionPixelSize : (II)I
      //   1139: putfield W : I
      //   1142: goto -> 1477
      //   1145: aload_0
      //   1146: aload #7
      //   1148: iload #5
      //   1150: aload_0
      //   1151: getfield V : I
      //   1154: invokevirtual getDimensionPixelSize : (II)I
      //   1157: putfield V : I
      //   1160: goto -> 1477
      //   1163: aload_0
      //   1164: aload #7
      //   1166: iload #5
      //   1168: aload_0
      //   1169: getfield U : I
      //   1172: invokevirtual getInt : (II)I
      //   1175: putfield U : I
      //   1178: goto -> 1477
      //   1181: aload_0
      //   1182: aload #7
      //   1184: iload #5
      //   1186: aload_0
      //   1187: getfield T : I
      //   1190: invokevirtual getInt : (II)I
      //   1193: putfield T : I
      //   1196: goto -> 1477
      //   1199: aload_0
      //   1200: aload #7
      //   1202: iload #5
      //   1204: aload_0
      //   1205: getfield z : F
      //   1208: invokevirtual getFloat : (IF)F
      //   1211: putfield z : F
      //   1214: goto -> 1477
      //   1217: aload_0
      //   1218: aload #7
      //   1220: iload #5
      //   1222: aload_0
      //   1223: getfield y : I
      //   1226: invokevirtual getDimensionPixelSize : (II)I
      //   1229: putfield y : I
      //   1232: goto -> 1477
      //   1235: aload_0
      //   1236: aload #7
      //   1238: iload #5
      //   1240: aload_0
      //   1241: getfield x : I
      //   1244: invokestatic a : (Landroid/content/res/TypedArray;II)I
      //   1247: putfield x : I
      //   1250: goto -> 1477
      //   1253: aload_0
      //   1254: aload #7
      //   1256: iload #5
      //   1258: invokevirtual getString : (I)Ljava/lang/String;
      //   1261: putfield g0 : Ljava/lang/String;
      //   1264: goto -> 1477
      //   1267: new java/lang/StringBuilder
      //   1270: dup
      //   1271: invokespecial <init> : ()V
      //   1274: astore_1
      //   1275: ldc_w 'unused attribute 0x'
      //   1278: astore_2
      //   1279: goto -> 1393
      //   1282: aload_0
      //   1283: aload #7
      //   1285: iload #5
      //   1287: aload_0
      //   1288: getfield j0 : Z
      //   1291: invokevirtual getBoolean : (IZ)Z
      //   1294: putfield j0 : Z
      //   1297: goto -> 1477
      //   1300: aload_0
      //   1301: aload #7
      //   1303: iload #5
      //   1305: invokevirtual getString : (I)Ljava/lang/String;
      //   1308: putfield f0 : Ljava/lang/String;
      //   1311: goto -> 1477
      //   1314: aload_0
      //   1315: aload #7
      //   1317: iload #5
      //   1319: aload_0
      //   1320: getfield c0 : I
      //   1323: invokevirtual getDimensionPixelSize : (II)I
      //   1326: putfield c0 : I
      //   1329: goto -> 1477
      //   1332: aload_0
      //   1333: aload #7
      //   1335: iload #5
      //   1337: aload_0
      //   1338: getfield b0 : I
      //   1341: invokevirtual getInt : (II)I
      //   1344: putfield b0 : I
      //   1347: goto -> 1477
      //   1350: ldc_w 'ConstraintSet'
      //   1353: ldc_w 'CURRENTLY UNSUPPORTED'
      //   1356: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
      //   1359: pop
      //   1360: goto -> 1477
      //   1363: aload_0
      //   1364: aload #7
      //   1366: iload #5
      //   1368: fconst_1
      //   1369: invokevirtual getFloat : (IF)F
      //   1372: putfield a0 : F
      //   1375: goto -> 1477
      //   1378: aload_0
      //   1379: aload #7
      //   1381: iload #5
      //   1383: fconst_1
      //   1384: invokevirtual getFloat : (IF)F
      //   1387: putfield Z : F
      //   1390: goto -> 1477
      //   1393: aload_1
      //   1394: aload_2
      //   1395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1398: pop
      //   1399: aload_1
      //   1400: iload #5
      //   1402: invokestatic toHexString : (I)Ljava/lang/String;
      //   1405: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1408: pop
      //   1409: aload_1
      //   1410: ldc_w '   '
      //   1413: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   1416: pop
      //   1417: aload_1
      //   1418: getstatic b/g/c/e$b.k0 : Landroid/util/SparseIntArray;
      //   1421: iload #5
      //   1423: invokevirtual get : (I)I
      //   1426: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   1429: pop
      //   1430: ldc_w 'ConstraintSet'
      //   1433: aload_1
      //   1434: invokevirtual toString : ()Ljava/lang/String;
      //   1437: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
      //   1440: pop
      //   1441: goto -> 1477
      //   1444: aload_0
      //   1445: aload #7
      //   1447: iload #5
      //   1449: aload_0
      //   1450: getfield i0 : Z
      //   1453: invokevirtual getBoolean : (IZ)Z
      //   1456: putfield i0 : Z
      //   1459: goto -> 1477
      //   1462: aload_0
      //   1463: aload #7
      //   1465: iload #5
      //   1467: aload_0
      //   1468: getfield h0 : Z
      //   1471: invokevirtual getBoolean : (IZ)Z
      //   1474: putfield h0 : Z
      //   1477: iinc #3, 1
      //   1480: goto -> 24
      //   1483: aload #7
      //   1485: invokevirtual recycle : ()V
      //   1488: return
    }
  }
  
  public static class c {
    public static SparseIntArray h;
    
    public boolean a = false;
    
    public int b = -1;
    
    public String c = null;
    
    public int d = -1;
    
    public int e = 0;
    
    public float f = Float.NaN;
    
    public float g = Float.NaN;
    
    static {
      SparseIntArray sparseIntArray = new SparseIntArray();
      h = sparseIntArray;
      sparseIntArray.append(k.Motion_motionPathRotate, 1);
      h.append(k.Motion_pathMotionArc, 2);
      h.append(k.Motion_transitionEasing, 3);
      h.append(k.Motion_drawPath, 4);
      h.append(k.Motion_animate_relativeTo, 5);
      h.append(k.Motion_motionStagger, 6);
    }
    
    public void a(Context param1Context, AttributeSet param1AttributeSet) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, k.Motion);
      this.a = true;
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        String str;
        int j = typedArray.getIndex(b);
        switch (h.get(j)) {
          case 6:
            this.f = typedArray.getFloat(j, this.f);
            break;
          case 5:
            this.b = e.a(typedArray, j, this.b);
            break;
          case 4:
            this.e = typedArray.getInt(j, 0);
            break;
          case 3:
            if ((typedArray.peekValue(j)).type == 3) {
              str = typedArray.getString(j);
            } else {
              str = b.g.a.a.a.a[typedArray.getInteger(j, 0)];
            } 
            this.c = str;
            break;
          case 2:
            this.d = typedArray.getInt(j, this.d);
            break;
          case 1:
            this.g = typedArray.getFloat(j, this.g);
            break;
        } 
      } 
      typedArray.recycle();
    }
  }
  
  public static class d {
    public boolean a = false;
    
    public int b = 0;
    
    public int c = 0;
    
    public float d = 1.0F;
    
    public float e = Float.NaN;
    
    public void a(Context param1Context, AttributeSet param1AttributeSet) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, k.PropertySet);
      this.a = true;
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == k.PropertySet_android_alpha) {
          this.d = typedArray.getFloat(j, this.d);
        } else if (j == k.PropertySet_android_visibility) {
          j = typedArray.getInt(j, this.b);
          this.b = j;
          this.b = e.d[j];
        } else if (j == k.PropertySet_visibilityMode) {
          this.c = typedArray.getInt(j, this.c);
        } else if (j == k.PropertySet_motionProgress) {
          this.e = typedArray.getFloat(j, this.e);
        } 
      } 
      typedArray.recycle();
    }
  }
  
  public static class e {
    public static SparseIntArray n;
    
    public boolean a = false;
    
    public float b = 0.0F;
    
    public float c = 0.0F;
    
    public float d = 0.0F;
    
    public float e = 1.0F;
    
    public float f = 1.0F;
    
    public float g = Float.NaN;
    
    public float h = Float.NaN;
    
    public float i = 0.0F;
    
    public float j = 0.0F;
    
    public float k = 0.0F;
    
    public boolean l = false;
    
    public float m = 0.0F;
    
    static {
      SparseIntArray sparseIntArray = new SparseIntArray();
      n = sparseIntArray;
      sparseIntArray.append(k.Transform_android_rotation, 1);
      n.append(k.Transform_android_rotationX, 2);
      n.append(k.Transform_android_rotationY, 3);
      n.append(k.Transform_android_scaleX, 4);
      n.append(k.Transform_android_scaleY, 5);
      n.append(k.Transform_android_transformPivotX, 6);
      n.append(k.Transform_android_transformPivotY, 7);
      n.append(k.Transform_android_translationX, 8);
      n.append(k.Transform_android_translationY, 9);
      n.append(k.Transform_android_translationZ, 10);
      n.append(k.Transform_android_elevation, 11);
    }
    
    public void a(Context param1Context, AttributeSet param1AttributeSet) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, k.Transform);
      this.a = true;
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        switch (n.get(j)) {
          case 11:
            this.l = true;
            this.m = typedArray.getDimension(j, this.m);
            break;
          case 10:
            this.k = typedArray.getDimension(j, this.k);
            break;
          case 9:
            this.j = typedArray.getDimension(j, this.j);
            break;
          case 8:
            this.i = typedArray.getDimension(j, this.i);
            break;
          case 7:
            this.h = typedArray.getDimension(j, this.h);
            break;
          case 6:
            this.g = typedArray.getDimension(j, this.g);
            break;
          case 5:
            this.f = typedArray.getFloat(j, this.f);
            break;
          case 4:
            this.e = typedArray.getFloat(j, this.e);
            break;
          case 3:
            this.d = typedArray.getFloat(j, this.d);
            break;
          case 2:
            this.c = typedArray.getFloat(j, this.c);
            break;
          case 1:
            this.b = typedArray.getFloat(j, this.b);
            break;
        } 
      } 
      typedArray.recycle();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */