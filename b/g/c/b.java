package b.g.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class b {
  public String a;
  
  public a b;
  
  public int c;
  
  public float d;
  
  public String e;
  
  public boolean f;
  
  public int g;
  
  public b(b paramb, Object paramObject) {
    this.a = paramb.a;
    this.b = paramb.b;
    b(paramObject);
  }
  
  public b(String paramString, a parama, Object paramObject) {
    this.a = paramString;
    this.b = parama;
    b(paramObject);
  }
  
  public static void a(Context paramContext, XmlPullParser paramXmlPullParser, HashMap<String, b> paramHashMap) {
    a a1 = a.h;
    TypedArray typedArray = paramContext.obtainStyledAttributes(Xml.asAttributeSet(paramXmlPullParser), k.CustomAttribute);
    int i = typedArray.getIndexCount();
    Object object1 = null;
    XmlPullParser xmlPullParser = null;
    Object object2 = null;
    byte b1 = 0;
    while (true) {
      int j;
      if (b1 < i) {
        j = typedArray.getIndex(b1);
        if (j == k.CustomAttribute_attributeName) {
          object1 = typedArray.getString(j);
          Object object4 = object1;
          paramXmlPullParser = xmlPullParser;
          Object object3 = object2;
          if (object1 != null) {
            object4 = object1;
            paramXmlPullParser = xmlPullParser;
            object3 = object2;
            if (object1.length() > 0) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append(Character.toUpperCase(object1.charAt(0)));
              stringBuilder.append(object1.substring(1));
              object4 = stringBuilder.toString();
              XmlPullParser xmlPullParser1 = xmlPullParser;
              object3 = object2;
            } 
          } 
          continue;
        } 
        if (j == k.CustomAttribute_customBoolean) {
          Boolean bool = Boolean.valueOf(typedArray.getBoolean(j, false));
          a a2 = a.g;
          Object object = object1;
          continue;
        } 
        if (j == k.CustomAttribute_customColorValue) {
          a a2 = a.d;
        } else if (j == k.CustomAttribute_customColorDrawableValue) {
          a a2 = a.e;
        } else {
          float f;
          if (j == k.CustomAttribute_customPixelDimension) {
            f = TypedValue.applyDimension(1, typedArray.getDimension(j, 0.0F), paramContext.getResources().getDisplayMetrics());
          } else if (j == k.CustomAttribute_customDimension) {
            f = typedArray.getDimension(j, 0.0F);
          } else {
            Integer integer1;
            if (j == k.CustomAttribute_customFloatValue) {
              object3 = a.c;
              Float float_1 = Float.valueOf(typedArray.getFloat(j, Float.NaN));
            } else {
              if (j == k.CustomAttribute_customIntegerValue) {
                object3 = a.b;
                j = typedArray.getInteger(j, -1);
              } else {
                a a3;
                Object object7 = object1;
                paramXmlPullParser = xmlPullParser;
                Object object6 = object2;
                if (j == k.CustomAttribute_customStringValue) {
                  a3 = a.f;
                  object6 = typedArray.getString(j);
                } else {
                  continue;
                } 
                object7 = a3;
                object3 = object6;
                object6 = object7;
                object7 = object1;
              } 
              integer1 = Integer.valueOf(j);
            } 
            Object object5 = object3;
            Object object3 = integer1;
            Object object4 = object5;
            object5 = object1;
          } 
          Float float_ = Float.valueOf(f);
          a a2 = a1;
          Object object = object1;
          continue;
        } 
        j = typedArray.getColor(j, 0);
      } else {
        break;
      } 
      Integer integer = Integer.valueOf(j);
      b1++;
      object1 = SYNTHETIC_LOCAL_VARIABLE_8;
      xmlPullParser = paramXmlPullParser;
      object2 = SYNTHETIC_LOCAL_VARIABLE_7;
    } 
    if (object1 != null && xmlPullParser != null)
      paramHashMap.put(object1, new b((String)object1, (a)object2, xmlPullParser)); 
    typedArray.recycle();
  }
  
  public void b(Object paramObject) {
    switch (this.b.ordinal()) {
      default:
        return;
      case 5:
        this.f = ((Boolean)paramObject).booleanValue();
      case 4:
        this.e = (String)paramObject;
      case 1:
      case 6:
        this.d = ((Float)paramObject).floatValue();
      case 0:
        this.c = ((Integer)paramObject).intValue();
      case 2:
      case 3:
        break;
    } 
    this.g = ((Integer)paramObject).intValue();
  }
  
  public enum a {
    b, c, d, e, f, g, h;
    
    public static final a[] i;
    
    static {
      a a1 = new a("DIMENSION_TYPE", 6);
      h = a1;
      i = new a[] { b, c, d, e, f, g, a1 };
    }
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\g\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */