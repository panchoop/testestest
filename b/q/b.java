package b.q;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import c.a.a.a.a;

@TargetApi(21)
public class b implements a {
  public AudioAttributes a;
  
  public int b = -1;
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof b))
      return false; 
    paramObject = paramObject;
    return this.a.equals(((b)paramObject).a);
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = a.e("AudioAttributesCompat: audioattributes=");
    stringBuilder.append(this.a);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\q\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */