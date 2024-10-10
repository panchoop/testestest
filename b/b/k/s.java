package b.b.k;

public class s {
  public static s d;
  
  public long a;
  
  public long b;
  
  public int c;
  
  public void a(long paramLong, double paramDouble1, double paramDouble2) {
    float f1 = (float)(paramLong - 946728000000L) / 8.64E7F;
    float f2 = 0.01720197F * f1 + 6.24006F;
    double d1 = f2;
    double d3 = Math.sin(d1);
    double d2 = Math.sin((2.0F * f2));
    d2 = Math.sin((f2 * 3.0F)) * 5.236000106378924E-6D + d2 * 3.4906598739326E-4D + d3 * 0.03341960161924362D + d1 + 1.796593063D + Math.PI;
    paramDouble2 = -paramDouble2 / 360.0D;
    d3 = ((float)Math.round((f1 - 9.0E-4F) - paramDouble2) + 9.0E-4F);
    d1 = Math.sin(d1);
    paramDouble2 = Math.sin(2.0D * d2) * -0.0069D + d1 * 0.0053D + d3 + paramDouble2;
    d1 = Math.sin(d2);
    d1 = Math.asin(Math.sin(0.4092797040939331D) * d1);
    double d4 = 0.01745329238474369D * paramDouble1;
    paramDouble1 = Math.sin(-0.10471975803375244D);
    d3 = Math.sin(d4);
    d2 = Math.sin(d1);
    d4 = Math.cos(d4);
    paramDouble1 = (paramDouble1 - d2 * d3) / Math.cos(d1) * d4;
    if (paramDouble1 >= 1.0D) {
      this.c = 1;
    } else if (paramDouble1 <= -1.0D) {
      this.c = 0;
    } else {
      paramDouble1 = (float)(Math.acos(paramDouble1) / 6.283185307179586D);
      this.a = Math.round((paramDouble2 + paramDouble1) * 8.64E7D) + 946728000000L;
      long l = Math.round((paramDouble2 - paramDouble1) * 8.64E7D) + 946728000000L;
      this.b = l;
      if (l < paramLong && this.a > paramLong) {
        this.c = 0;
      } else {
        this.c = 1;
      } 
      return;
    } 
    this.a = -1L;
    this.b = -1L;
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\b\b\k\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */