package b.g.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class d {
  public SparseArray<a> a = new SparseArray();
  
  public SparseArray<e> b = new SparseArray();
  
  public d(Context paramContext, ConstraintLayout paramConstraintLayout, int paramInt) {
    XmlResourceParser xmlResourceParser = paramContext.getResources().getXml(paramInt);
    paramConstraintLayout = null;
    try {
      paramInt = xmlResourceParser.getEventType();
      while (paramInt != 1) {
        ConstraintLayout constraintLayout;
        if (paramInt != 0) {
          if (paramInt != 2) {
            constraintLayout = paramConstraintLayout;
          } else {
            String str = xmlResourceParser.getName();
            paramInt = -1;
            switch (str.hashCode()) {
              case 1901439077:
                if (str.equals("Variant"))
                  paramInt = 3; 
                break;
              case 1657696882:
                if (str.equals("layoutDescription"))
                  paramInt = 0; 
                break;
              case 1382829617:
                if (str.equals("StateSet"))
                  paramInt = 1; 
                break;
              case 80204913:
                if (str.equals("State"))
                  paramInt = 2; 
                break;
              case -1349929691:
                if (str.equals("ConstraintSet"))
                  paramInt = 4; 
                break;
            } 
            constraintLayout = paramConstraintLayout;
            if (paramInt != 0) {
              constraintLayout = paramConstraintLayout;
              if (paramInt != 1)
                if (paramInt != 2) {
                  if (paramInt != 3) {
                    if (paramInt != 4) {
                      StringBuilder stringBuilder = new StringBuilder();
                      this();
                      stringBuilder.append("unknown tag ");
                      stringBuilder.append(str);
                      Log.v("ConstraintLayoutStates", stringBuilder.toString());
                      ConstraintLayout constraintLayout1 = paramConstraintLayout;
                    } else {
                      a(paramContext, (XmlPullParser)xmlResourceParser);
                      constraintLayout = paramConstraintLayout;
                    } 
                  } else {
                    b b = new b();
                    this(paramContext, (XmlPullParser)xmlResourceParser);
                    constraintLayout = paramConstraintLayout;
                    if (paramConstraintLayout != null) {
                      ((a)paramConstraintLayout).b.add(b);
                      constraintLayout = paramConstraintLayout;
                    } 
                  } 
                } else {
                  a a = new a();
                  this(paramContext, (XmlPullParser)xmlResourceParser);
                  this.a.put(a.a, a);
                }  
            } 
          } 
        } else {
          xmlResourceParser.getName();
          constraintLayout = paramConstraintLayout;
        } 
        paramInt = xmlResourceParser.next();
        paramConstraintLayout = constraintLayout;
      } 
    } catch (XmlPullParserException xmlPullParserException) {
      xmlPullParserException.printStackTrace();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  public final void a(Context paramContext, XmlPullParser paramXmlPullParser) {
    e e = new e();
    int j = paramXmlPullParser.getAttributeCount();
    for (int i = 0; i < j; i++) {
      if ("id".equals(paramXmlPullParser.getAttributeName(i))) {
        String str = paramXmlPullParser.getAttributeValue(i);
        if (str.contains("/")) {
          String str1 = str.substring(str.indexOf('/') + 1);
          i = paramContext.getResources().getIdentifier(str1, "id", paramContext.getPackageName());
        } else {
          i = -1;
        } 
        j = i;
        if (i == -1)
          if (str.length() > 1) {
            j = Integer.parseInt(str.substring(1));
          } else {
            Log.e("ConstraintLayoutStates", "error in parsing id");
            j = i;
          }  
        try {
          i = paramXmlPullParser.getEventType();
          for (String str1 = null; i != 1; str1 = str) {
            if (i != 0) {
              byte b = 3;
              if (i != 2) {
                if (i != 3) {
                  str = str1;
                } else {
                  String str2 = paramXmlPullParser.getName();
                  if ("ConstraintSet".equals(str2))
                    break; 
                  str = str1;
                  if (str2.equalsIgnoreCase("Constraint")) {
                    e.c.put(Integer.valueOf(((e.a)str1).a), str1);
                    str = null;
                  } 
                } 
              } else {
                StringBuilder stringBuilder2;
                RuntimeException runtimeException2;
                StringBuilder stringBuilder1;
                RuntimeException runtimeException1;
                boolean bool;
                RuntimeException runtimeException4;
                StringBuilder stringBuilder4;
                RuntimeException runtimeException3;
                StringBuilder stringBuilder3;
                e.a a;
                str = paramXmlPullParser.getName();
                switch (str.hashCode()) {
                  default:
                    i = -1;
                    break;
                  case 1803088381:
                    if (str.equals("Constraint")) {
                      i = 0;
                      break;
                    } 
                  case 1791837707:
                    if (str.equals("CustomAttribute")) {
                      i = 7;
                      break;
                    } 
                  case 1331510167:
                    if (str.equals("Barrier")) {
                      i = 2;
                      break;
                    } 
                  case -71750448:
                    if (str.equals("Guideline")) {
                      i = 1;
                      break;
                    } 
                  case -1238332596:
                    if (str.equals("Transform")) {
                      i = 4;
                      break;
                    } 
                  case -1269513683:
                    if (str.equals("PropertySet")) {
                      i = b;
                      break;
                    } 
                  case -1984451626:
                    if (str.equals("Motion")) {
                      i = 6;
                      break;
                    } 
                  case -2025855158:
                    bool = str.equals("Layout");
                    if (bool) {
                      i = 5;
                      break;
                    } 
                } 
                switch (i) {
                  default:
                    str = str1;
                    break;
                  case 7:
                    if (str1 != null) {
                      b.a(paramContext, paramXmlPullParser, ((e.a)str1).f);
                      str = str1;
                      break;
                    } 
                    runtimeException4 = new RuntimeException();
                    stringBuilder2 = new StringBuilder();
                    this();
                    stringBuilder2.append("XML parser error must be within a Constraint ");
                    stringBuilder2.append(paramXmlPullParser.getLineNumber());
                    this(stringBuilder2.toString());
                    throw runtimeException4;
                  case 6:
                    if (str1 != null) {
                      ((e.a)str1).c.a((Context)stringBuilder2, Xml.asAttributeSet(paramXmlPullParser));
                      String str2 = str1;
                      break;
                    } 
                    runtimeException2 = new RuntimeException();
                    stringBuilder4 = new StringBuilder();
                    this();
                    stringBuilder4.append("XML parser error must be within a Constraint ");
                    stringBuilder4.append(paramXmlPullParser.getLineNumber());
                    this(stringBuilder4.toString());
                    throw runtimeException2;
                  case 5:
                    if (str1 != null) {
                      ((e.a)str1).d.a((Context)runtimeException2, Xml.asAttributeSet(paramXmlPullParser));
                      String str2 = str1;
                      break;
                    } 
                    runtimeException3 = new RuntimeException();
                    stringBuilder1 = new StringBuilder();
                    this();
                    stringBuilder1.append("XML parser error must be within a Constraint ");
                    stringBuilder1.append(paramXmlPullParser.getLineNumber());
                    this(stringBuilder1.toString());
                    throw runtimeException3;
                  case 4:
                    if (str1 != null) {
                      ((e.a)str1).e.a((Context)stringBuilder1, Xml.asAttributeSet(paramXmlPullParser));
                      String str2 = str1;
                      break;
                    } 
                    runtimeException1 = new RuntimeException();
                    stringBuilder3 = new StringBuilder();
                    this();
                    stringBuilder3.append("XML parser error must be within a Constraint ");
                    stringBuilder3.append(paramXmlPullParser.getLineNumber());
                    this(stringBuilder3.toString());
                    throw runtimeException1;
                  case 3:
                    if (str1 != null) {
                      ((e.a)str1).b.a((Context)runtimeException1, Xml.asAttributeSet(paramXmlPullParser));
                      String str2 = str1;
                      break;
                    } 
                    runtimeException1 = new RuntimeException();
                    stringBuilder3 = new StringBuilder();
                    this();
                    stringBuilder3.append("XML parser error must be within a Constraint ");
                    stringBuilder3.append(paramXmlPullParser.getLineNumber());
                    this(stringBuilder3.toString());
                    throw runtimeException1;
                  case 2:
                    a = e.d((Context)runtimeException1, Xml.asAttributeSet(paramXmlPullParser));
                    a.d.d0 = 1;
                    break;
                  case 1:
                    a = e.d((Context)runtimeException1, Xml.asAttributeSet(paramXmlPullParser));
                    a.d.a = true;
                    a.d.b = true;
                    break;
                  case 0:
                    a = e.d((Context)runtimeException1, Xml.asAttributeSet(paramXmlPullParser));
                    break;
                } 
              } 
            } else {
              paramXmlPullParser.getName();
              str = str1;
            } 
            i = paramXmlPullParser.next();
          } 
        } catch (XmlPullParserException xmlPullParserException) {
          xmlPullParserException.printStackTrace();
        } catch (IOException iOException) {
          iOException.printStackTrace();
        } 
        this.b.put(j, e);
        break;
      } 
    } 
  }
  
  public static class a {
    public int a;
    
    public ArrayList<d.b> b = new ArrayList<d.b>();
    
    public int c = -1;
    
    public e d;
    
    public a(Context param1Context, XmlPullParser param1XmlPullParser) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(Xml.asAttributeSet(param1XmlPullParser), k.State);
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == k.State_android_id) {
          this.a = typedArray.getResourceId(j, this.a);
        } else if (j == k.State_constraints) {
          this.c = typedArray.getResourceId(j, this.c);
          String str = param1Context.getResources().getResourceTypeName(this.c);
          param1Context.getResources().getResourceName(this.c);
          if ("layout".equals(str)) {
            e e1 = new e();
            this.d = e1;
            e1.b(param1Context, this.c);
          } 
        } 
      } 
      typedArray.recycle();
    }
  }
  
  public static class b {
    public float a = Float.NaN;
    
    public float b = Float.NaN;
    
    public float c = Float.NaN;
    
    public float d = Float.NaN;
    
    public int e = -1;
    
    public e f;
    
    public b(Context param1Context, XmlPullParser param1XmlPullParser) {
      TypedArray typedArray = param1Context.obtainStyledAttributes(Xml.asAttributeSet(param1XmlPullParser), k.Variant);
      int i = typedArray.getIndexCount();
      for (byte b1 = 0; b1 < i; b1++) {
        int j = typedArray.getIndex(b1);
        if (j == k.Variant_constraints) {
          this.e = typedArray.getResourceId(j, this.e);
          String str = param1Context.getResources().getResourceTypeName(this.e);
          param1Context.getResources().getResourceName(this.e);
          if ("layout".equals(str)) {
            e e1 = new e();
            this.f = e1;
            e1.b(param1Context, this.e);
          } 
        } else if (j == k.Variant_region_heightLessThan) {
          this.d = typedArray.getDimension(j, this.d);
        } else if (j == k.Variant_region_heightMoreThan) {
          this.b = typedArray.getDimension(j, this.b);
        } else if (j == k.Variant_region_widthLessThan) {
          this.c = typedArray.getDimension(j, this.c);
        } else if (j == k.Variant_region_widthMoreThan) {
          this.a = typedArray.getDimension(j, this.a);
        } else {
          Log.v("ConstraintLayoutStates", "Unknown tag");
        } 
      } 
      typedArray.recycle();
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */