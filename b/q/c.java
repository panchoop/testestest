package b.q;

import androidx.media.AudioAttributesCompat;
import java.util.Arrays;

public class c implements a {
  public int a = 0;
  
  public int b = 0;
  
  public int c = 0;
  
  public int d = -1;
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof c;
    boolean bool1 = false;
    if (!bool)
      return false; 
    paramObject = paramObject;
    bool = bool1;
    if (this.b == ((c)paramObject).b) {
      int i;
      int m = this.c;
      int k = ((c)paramObject).c;
      int j = ((c)paramObject).d;
      if (j == -1)
        j = AudioAttributesCompat.a(false, k, ((c)paramObject).a); 
      if (j == 6) {
        i = k | 0x4;
      } else {
        i = k;
        if (j == 7)
          i = k | 0x1; 
      } 
      bool = bool1;
      if (m == (i & 0x111)) {
        bool = bool1;
        if (this.a == ((c)paramObject).a) {
          bool = bool1;
          if (this.d == ((c)paramObject).d)
            bool = true; 
        } 
      } 
    } 
    return bool;
  }
  
  public int hashCode() {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d) });
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("AudioAttributesCompat:");
    if (this.d != -1) {
      stringBuilder.append(" stream=");
      stringBuilder.append(this.d);
      stringBuilder.append(" derived");
    } 
    stringBuilder.append(" usage=");
    stringBuilder.append(AudioAttributesCompat.b(this.a));
    stringBuilder.append(" content=");
    stringBuilder.append(this.b);
    stringBuilder.append(" flags=0x");
    stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\q\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */