package androidx.media;

import android.util.SparseIntArray;
import b.q.a;
import b.v.c;

public class AudioAttributesCompat implements c {
  public static final SparseIntArray b;
  
  public a a;
  
  static {
    SparseIntArray sparseIntArray = new SparseIntArray();
    b = sparseIntArray;
    sparseIntArray.put(5, 1);
    b.put(6, 2);
    b.put(7, 2);
    b.put(8, 1);
    b.put(9, 1);
    b.put(10, 1);
  }
  
  public static int a(boolean paramBoolean, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder;
    boolean bool = true;
    if ((paramInt1 & 0x1) == 1) {
      if (paramBoolean) {
        paramInt1 = bool;
      } else {
        paramInt1 = 7;
      } 
      return paramInt1;
    } 
    bool = false;
    byte b = 0;
    if ((paramInt1 & 0x4) == 4) {
      if (paramBoolean) {
        paramInt1 = b;
      } else {
        paramInt1 = 6;
      } 
      return paramInt1;
    } 
    b = 3;
    paramInt1 = bool;
    switch (paramInt2) {
      default:
        if (!paramBoolean)
          return 3; 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown usage value ");
        stringBuilder.append(paramInt2);
        stringBuilder.append(" in audio attributes");
        throw new IllegalArgumentException(stringBuilder.toString());
      case 13:
        return 1;
      case 11:
        return 10;
      case 6:
        return 2;
      case 5:
      case 7:
      case 8:
      case 9:
      case 10:
        return 5;
      case 4:
        return 4;
      case 3:
        if (paramBoolean) {
          paramInt1 = bool;
        } else {
          paramInt1 = 8;
        } 
      case 2:
        return paramInt1;
      case 1:
      case 12:
      case 14:
      case 16:
        return 3;
      case 0:
        break;
    } 
    paramInt1 = b;
    if (paramBoolean)
      paramInt1 = Integer.MIN_VALUE; 
    return paramInt1;
  }
  
  public static String b(int paramInt) {
    StringBuilder stringBuilder;
    switch (paramInt) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("unknown usage ");
        stringBuilder.append(paramInt);
        return stringBuilder.toString();
      case 16:
        return "USAGE_ASSISTANT";
      case 14:
        return "USAGE_GAME";
      case 13:
        return "USAGE_ASSISTANCE_SONIFICATION";
      case 12:
        return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
      case 11:
        return "USAGE_ASSISTANCE_ACCESSIBILITY";
      case 10:
        return "USAGE_NOTIFICATION_EVENT";
      case 9:
        return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
      case 8:
        return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
      case 7:
        return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
      case 6:
        return "USAGE_NOTIFICATION_RINGTONE";
      case 5:
        return "USAGE_NOTIFICATION";
      case 4:
        return "USAGE_ALARM";
      case 3:
        return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
      case 2:
        return "USAGE_VOICE_COMMUNICATION";
      case 1:
        return "USAGE_MEDIA";
      case 0:
        break;
    } 
    return "USAGE_UNKNOWN";
  }
  
  public boolean equals(Object paramObject) {
    boolean bool1 = paramObject instanceof AudioAttributesCompat;
    boolean bool = false;
    if (!bool1)
      return false; 
    AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat)paramObject;
    paramObject = this.a;
    a a1 = audioAttributesCompat.a;
    if (paramObject == null) {
      if (a1 == null)
        bool = true; 
      return bool;
    } 
    return paramObject.equals(a1);
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public String toString() {
    return this.a.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\androidx\media\AudioAttributesCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */