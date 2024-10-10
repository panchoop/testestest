package com.app.damnvulnerablebank;

public class FridaCheckJNI {
  static {
    System.loadLibrary("frida-check");
  }
  
  public native int fridaCheck();
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\com\app\damnvulnerablebank\FridaCheckJNI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */