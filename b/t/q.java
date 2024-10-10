package b.t;

import android.view.View;
import c.a.a.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class q {
  public final Map<String, Object> a = new HashMap<String, Object>();
  
  public View b;
  
  public final ArrayList<i> c = new ArrayList<i>();
  
  @Deprecated
  public q() {}
  
  public q(View paramView) {
    this.b = paramView;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof q) {
      View view = this.b;
      paramObject = paramObject;
      if (view == ((q)paramObject).b && this.a.equals(((q)paramObject).a))
        return true; 
    } 
    return false;
  }
  
  public int hashCode() {
    int i = this.b.hashCode();
    return this.a.hashCode() + i * 31;
  }
  
  public String toString() {
    StringBuilder stringBuilder = a.e("TransitionValues@");
    stringBuilder.append(Integer.toHexString(hashCode()));
    stringBuilder.append(":\n");
    String str2 = stringBuilder.toString();
    stringBuilder = new StringBuilder();
    stringBuilder.append(str2);
    stringBuilder.append("    view = ");
    stringBuilder.append(this.b);
    stringBuilder.append("\n");
    String str1 = a.c(stringBuilder.toString(), "    values:");
    for (String str : this.a.keySet()) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str1);
      stringBuilder1.append("    ");
      stringBuilder1.append(str);
      stringBuilder1.append(": ");
      stringBuilder1.append(this.a.get(str));
      stringBuilder1.append("\n");
      str1 = stringBuilder1.toString();
    } 
    return str1;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\t\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */