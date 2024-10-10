package b.i.e.b;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import b.i.c;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class a {
  public final Shader a;
  
  public final ColorStateList b;
  
  public int c;
  
  public a(Shader paramShader, ColorStateList paramColorStateList, int paramInt) {
    this.a = paramShader;
    this.b = paramColorStateList;
    this.c = paramInt;
  }
  
  public static a a(Resources paramResources, int paramInt, Resources.Theme paramTheme) {
    XmlResourceParser xmlResourceParser = paramResources.getXml(paramInt);
    AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
    while (true) {
      paramInt = xmlResourceParser.next();
      if (paramInt != 2 && paramInt != 1)
        continue; 
      break;
    } 
    if (paramInt == 2) {
      StringBuilder stringBuilder;
      int[] arrayOfInt;
      String str = xmlResourceParser.getName();
      paramInt = -1;
      int i = str.hashCode();
      if (i != 89650992) {
        if (i == 1191572447 && str.equals("selector"))
          paramInt = 0; 
      } else if (str.equals("gradient")) {
        paramInt = 1;
      } 
      if (paramInt != 0) {
        float[] arrayOfFloat;
        if (paramInt == 1) {
          str = xmlResourceParser.getName();
          if (str.equals("gradient")) {
            f f;
            SweepGradient sweepGradient;
            RadialGradient radialGradient;
            TypedArray typedArray = a.a.a.a.a.a0(paramResources, paramTheme, attributeSet, c.GradientColor);
            float f7 = a.a.a.a.a.E(typedArray, (XmlPullParser)xmlResourceParser, "startX", c.GradientColor_android_startX, 0.0F);
            float f1 = a.a.a.a.a.E(typedArray, (XmlPullParser)xmlResourceParser, "startY", c.GradientColor_android_startY, 0.0F);
            float f2 = a.a.a.a.a.E(typedArray, (XmlPullParser)xmlResourceParser, "endX", c.GradientColor_android_endX, 0.0F);
            float f4 = a.a.a.a.a.E(typedArray, (XmlPullParser)xmlResourceParser, "endY", c.GradientColor_android_endY, 0.0F);
            float f5 = a.a.a.a.a.E(typedArray, (XmlPullParser)xmlResourceParser, "centerX", c.GradientColor_android_centerX, 0.0F);
            float f3 = a.a.a.a.a.E(typedArray, (XmlPullParser)xmlResourceParser, "centerY", c.GradientColor_android_centerY, 0.0F);
            i = a.a.a.a.a.F(typedArray, (XmlPullParser)xmlResourceParser, "type", c.GradientColor_android_type, 0);
            int j = a.a.a.a.a.C(typedArray, (XmlPullParser)xmlResourceParser, "startColor", c.GradientColor_android_startColor, 0);
            boolean bool = a.a.a.a.a.N((XmlPullParser)xmlResourceParser, "centerColor");
            int k = a.a.a.a.a.C(typedArray, (XmlPullParser)xmlResourceParser, "centerColor", c.GradientColor_android_centerColor, 0);
            int n = a.a.a.a.a.C(typedArray, (XmlPullParser)xmlResourceParser, "endColor", c.GradientColor_android_endColor, 0);
            paramInt = a.a.a.a.a.F(typedArray, (XmlPullParser)xmlResourceParser, "tileMode", c.GradientColor_android_tileMode, 0);
            float f6 = a.a.a.a.a.E(typedArray, (XmlPullParser)xmlResourceParser, "gradientRadius", c.GradientColor_android_gradientRadius, 0.0F);
            typedArray.recycle();
            int m = xmlResourceParser.getDepth() + 1;
            ArrayList<Float> arrayList1 = new ArrayList(20);
            ArrayList<Integer> arrayList = new ArrayList(20);
            Resources resources = paramResources;
            while (true) {
              int i1 = xmlResourceParser.next();
              if (i1 != 1) {
                int i2 = xmlResourceParser.getDepth();
                if (i2 >= m || i1 != 3) {
                  StringBuilder stringBuilder2;
                  if (i1 != 2)
                    continue; 
                  if (i2 <= m) {
                    if (!xmlResourceParser.getName().equals("item"))
                      continue; 
                    TypedArray typedArray1 = a.a.a.a.a.a0(resources, paramTheme, attributeSet, c.GradientColorItem);
                    boolean bool2 = typedArray1.hasValue(c.GradientColorItem_android_color);
                    boolean bool1 = typedArray1.hasValue(c.GradientColorItem_android_offset);
                    if (bool2 && bool1) {
                      i1 = typedArray1.getColor(c.GradientColorItem_android_color, 0);
                      float f8 = typedArray1.getFloat(c.GradientColorItem_android_offset, 0.0F);
                      typedArray1.recycle();
                      arrayList.add(Integer.valueOf(i1));
                      arrayList1.add(Float.valueOf(f8));
                    } else {
                      stringBuilder2 = new StringBuilder();
                      stringBuilder2.append(xmlResourceParser.getPositionDescription());
                      stringBuilder2.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                      throw new XmlPullParserException(stringBuilder2.toString());
                    } 
                  } 
                  StringBuilder stringBuilder3 = stringBuilder2;
                  continue;
                } 
              } 
              break;
            } 
            if (arrayList.size() > 0) {
              f = new f(arrayList, arrayList1);
            } else {
              paramResources = null;
            } 
            if (paramResources == null) {
              f = new f();
              if (bool) {
                this(j, k, n);
              } else {
                this(j, n);
              } 
            } 
            if (i != 1) {
              LinearGradient linearGradient;
              if (i != 2) {
                Shader.TileMode tileMode;
                arrayOfInt = f.a;
                arrayOfFloat = f.b;
                if (paramInt != 1) {
                  if (paramInt != 2) {
                    tileMode = Shader.TileMode.CLAMP;
                  } else {
                    tileMode = Shader.TileMode.MIRROR;
                  } 
                } else {
                  tileMode = Shader.TileMode.REPEAT;
                } 
                linearGradient = new LinearGradient(f7, f1, f2, f4, arrayOfInt, arrayOfFloat, tileMode);
              } else {
                sweepGradient = new SweepGradient(f5, f3, ((f)linearGradient).a, ((f)linearGradient).b);
              } 
            } else {
              if (f6 > 0.0F) {
                Shader.TileMode tileMode;
                arrayOfInt = ((f)sweepGradient).a;
                arrayOfFloat = ((f)sweepGradient).b;
                if (paramInt != 1) {
                  if (paramInt != 2) {
                    tileMode = Shader.TileMode.CLAMP;
                  } else {
                    tileMode = Shader.TileMode.MIRROR;
                  } 
                } else {
                  tileMode = Shader.TileMode.REPEAT;
                } 
                radialGradient = new RadialGradient(f5, f3, f6, arrayOfInt, arrayOfFloat, tileMode);
                return new a((Shader)radialGradient, null, 0);
              } 
              throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } 
            return new a((Shader)radialGradient, null, 0);
          } 
          StringBuilder stringBuilder1 = new StringBuilder();
          stringBuilder1.append(xmlResourceParser.getPositionDescription());
          stringBuilder1.append(": invalid gradient color tag ");
          stringBuilder1.append((String)arrayOfFloat);
          throw new XmlPullParserException(stringBuilder1.toString());
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append(xmlResourceParser.getPositionDescription());
        stringBuilder.append(": unsupported complex color tag ");
        stringBuilder.append((String)arrayOfFloat);
        throw new XmlPullParserException(stringBuilder.toString());
      } 
      ColorStateList colorStateList = a.a.a.a.a.t((Resources)stringBuilder, (XmlPullParser)xmlResourceParser, attributeSet, (Resources.Theme)arrayOfInt);
      return new a(null, colorStateList, colorStateList.getDefaultColor());
    } 
    throw new XmlPullParserException("No start tag found");
  }
  
  public boolean b() {
    boolean bool;
    if (this.a != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean c() {
    if (this.a == null) {
      ColorStateList colorStateList = this.b;
      if (colorStateList != null && colorStateList.isStateful())
        return true; 
    } 
    return false;
  }
  
  public boolean d(int[] paramArrayOfint) {
    if (c()) {
      ColorStateList colorStateList = this.b;
      int i = colorStateList.getColorForState(paramArrayOfint, colorStateList.getDefaultColor());
      if (i != this.c) {
        boolean bool = true;
        this.c = i;
        return bool;
      } 
    } 
    return false;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\i\e\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */