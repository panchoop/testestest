package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import b.v.a;
import b.v.b;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
  public static IconCompat read(a parama) {
    String str1;
    Parcelable parcelable2;
    byte[] arrayOfByte1;
    Parcelable parcelable1;
    IconCompat iconCompat = new IconCompat();
    iconCompat.a = parama.i(iconCompat.a, 1);
    byte[] arrayOfByte2 = iconCompat.c;
    if (parama.h(2)) {
      b b = (b)parama;
      int i = b.e.readInt();
      if (i < 0) {
        arrayOfByte2 = null;
      } else {
        arrayOfByte2 = new byte[i];
        b.e.readByteArray(arrayOfByte2);
      } 
    } 
    iconCompat.c = arrayOfByte2;
    iconCompat.d = parama.j(iconCompat.d, 3);
    iconCompat.e = parama.i(iconCompat.e, 4);
    iconCompat.f = parama.i(iconCompat.f, 5);
    iconCompat.g = (ColorStateList)parama.j((Parcelable)iconCompat.g, 6);
    String str2 = iconCompat.i;
    if (!parama.h(7)) {
      str1 = str2;
    } else {
      str1 = ((b)str1).e.readString();
    } 
    iconCompat.i = str1;
    iconCompat.h = PorterDuff.Mode.valueOf(str1);
    switch (iconCompat.a) {
      default:
        return iconCompat;
      case 3:
        iconCompat.b = iconCompat.c;
      case 2:
      case 4:
      case 6:
        iconCompat.b = new String(iconCompat.c, Charset.forName("UTF-16"));
      case 1:
      case 5:
        parcelable2 = iconCompat.d;
        if (parcelable2 != null)
          break; 
        arrayOfByte1 = iconCompat.c;
        iconCompat.b = arrayOfByte1;
        iconCompat.a = 3;
        iconCompat.e = 0;
        iconCompat.f = arrayOfByte1.length;
      case -1:
        parcelable1 = iconCompat.d;
        if (parcelable1 != null)
          break; 
        throw new IllegalArgumentException("Invalid icon");
    } 
    iconCompat.b = parcelable1;
  }
  
  public static void write(IconCompat paramIconCompat, a parama) {
    if (parama != null) {
      paramIconCompat.i = paramIconCompat.h.name();
      switch (paramIconCompat.a) {
        case 4:
        case 6:
          paramIconCompat.c = paramIconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
          break;
        case 3:
          paramIconCompat.c = (byte[])paramIconCompat.b;
          break;
        case 2:
          paramIconCompat.c = ((String)paramIconCompat.b).getBytes(Charset.forName("UTF-16"));
          break;
        case -1:
        case 1:
        case 5:
          paramIconCompat.d = (Parcelable)paramIconCompat.b;
          break;
      } 
      int i = paramIconCompat.a;
      if (-1 != i)
        parama.m(i, 1); 
      byte[] arrayOfByte = paramIconCompat.c;
      if (arrayOfByte != null) {
        parama.l(2);
        b b = (b)parama;
        if (arrayOfByte != null) {
          b.e.writeInt(arrayOfByte.length);
          b.e.writeByteArray(arrayOfByte);
        } else {
          b.e.writeInt(-1);
        } 
      } 
      Parcelable parcelable = paramIconCompat.d;
      if (parcelable != null)
        parama.n(parcelable, 3); 
      i = paramIconCompat.e;
      if (i != 0)
        parama.m(i, 4); 
      i = paramIconCompat.f;
      if (i != 0)
        parama.m(i, 5); 
      ColorStateList colorStateList = paramIconCompat.g;
      if (colorStateList != null)
        parama.n((Parcelable)colorStateList, 6); 
      String str = paramIconCompat.i;
      if (str != null) {
        parama.l(7);
        ((b)parama).e.writeString(str);
      } 
      return;
    } 
    throw null;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\core\graphics\drawable\IconCompatParcelizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */