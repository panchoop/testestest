package c.c.a.a.f.c;

public final class d extends e {
  public final char a = '.';
  
  public final boolean b(char paramChar) {
    return (paramChar == this.a);
  }
  
  public final String toString() {
    char c = this.a;
    char[] arrayOfChar = new char[6];
    arrayOfChar[0] = '\\';
    arrayOfChar[1] = 'u';
    arrayOfChar[2] = Character.MIN_VALUE;
    arrayOfChar[3] = Character.MIN_VALUE;
    arrayOfChar[4] = Character.MIN_VALUE;
    arrayOfChar[5] = Character.MIN_VALUE;
    for (byte b = 0; b < 4; b++) {
      arrayOfChar[5 - b] = "0123456789ABCDEF".charAt(c & 0xF);
      c = (char)(c >> 4);
    } 
    String str = String.copyValueOf(arrayOfChar);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 18);
    stringBuilder.append("CharMatcher.is('");
    stringBuilder.append(str);
    stringBuilder.append("')");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\a\a\f\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */