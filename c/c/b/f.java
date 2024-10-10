package c.c.b;

import a.a.a.a.a;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import c.c.a.a.c.i;
import c.c.a.a.c.l.p;
import c.c.a.a.c.l.q;
import c.c.a.a.c.o.d;
import java.util.Arrays;

public final class f {
  public final String a;
  
  public final String b;
  
  public final String c;
  
  public final String d;
  
  public final String e;
  
  public final String f;
  
  public final String g;
  
  public f(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7) {
    q.i(d.b(paramString1) ^ true, "ApplicationId must be set.");
    this.b = paramString1;
    this.a = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = paramString5;
    this.f = paramString6;
    this.g = paramString7;
  }
  
  public static f a(Context paramContext) {
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    q.f(paramContext);
    Resources resources = paramContext.getResources();
    String str8 = resources.getResourcePackageName(i.common_google_play_services_unknown_issue);
    int i = resources.getIdentifier("google_app_id", "string", str8);
    String str7 = null;
    if (i == 0) {
      paramContext = null;
    } else {
      str1 = resources.getString(i);
    } 
    if (TextUtils.isEmpty(str1))
      return null; 
    i = resources.getIdentifier("google_api_key", "string", str8);
    if (i == 0) {
      str2 = null;
    } else {
      str2 = resources.getString(i);
    } 
    i = resources.getIdentifier("firebase_database_url", "string", str8);
    if (i == 0) {
      str3 = null;
    } else {
      str3 = resources.getString(i);
    } 
    i = resources.getIdentifier("ga_trackingId", "string", str8);
    if (i == 0) {
      str4 = null;
    } else {
      str4 = resources.getString(i);
    } 
    i = resources.getIdentifier("gcm_defaultSenderId", "string", str8);
    if (i == 0) {
      str5 = null;
    } else {
      str5 = resources.getString(i);
    } 
    i = resources.getIdentifier("google_storage_bucket", "string", str8);
    if (i == 0) {
      str6 = null;
    } else {
      str6 = resources.getString(i);
    } 
    i = resources.getIdentifier("project_id", "string", str8);
    if (i != 0)
      str7 = resources.getString(i); 
    return new f(str1, str2, str3, str4, str5, str6, str7);
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof f;
    boolean bool1 = false;
    if (!bool)
      return false; 
    paramObject = paramObject;
    bool = bool1;
    if (a.y(this.b, ((f)paramObject).b)) {
      bool = bool1;
      if (a.y(this.a, ((f)paramObject).a)) {
        bool = bool1;
        if (a.y(this.c, ((f)paramObject).c)) {
          bool = bool1;
          if (a.y(this.d, ((f)paramObject).d)) {
            bool = bool1;
            if (a.y(this.e, ((f)paramObject).e)) {
              bool = bool1;
              if (a.y(this.f, ((f)paramObject).f)) {
                bool = bool1;
                if (a.y(this.g, ((f)paramObject).g))
                  bool = true; 
              } 
            } 
          } 
        } 
      } 
    } 
    return bool;
  }
  
  public int hashCode() {
    return Arrays.hashCode(new Object[] { this.b, this.a, this.c, this.d, this.e, this.f, this.g });
  }
  
  public String toString() {
    p p = a.B0(this);
    p.a("applicationId", this.b);
    p.a("apiKey", this.a);
    p.a("databaseUrl", this.c);
    p.a("gcmSenderId", this.e);
    p.a("storageBucket", this.f);
    p.a("projectId", this.g);
    return p.toString();
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */