package c.c.a.b.l;

import android.util.Property;
import android.view.ViewGroup;
import c.c.a.b.f;

public class c extends Property<ViewGroup, Float> {
  public static final Property<ViewGroup, Float> a = new c("childrenAlpha");
  
  public c(String paramString) {
    super(Float.class, paramString);
  }
  
  public Object get(Object paramObject) {
    paramObject = ((ViewGroup)paramObject).getTag(f.mtrl_internal_children_alpha_tag);
    if (paramObject == null)
      paramObject = Float.valueOf(1.0F); 
    return paramObject;
  }
  
  public void set(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    float f = ((Float)paramObject2).floatValue();
    paramObject1.setTag(f.mtrl_internal_children_alpha_tag, Float.valueOf(f));
    int i = paramObject1.getChildCount();
    for (byte b = 0; b < i; b++)
      paramObject1.getChildAt(b).setAlpha(f); 
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\b\l\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */