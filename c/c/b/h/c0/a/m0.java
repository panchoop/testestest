package c.c.b.h.c0.a;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import c.a.a.a.a;
import c.c.a.a.c.l.q;
import c.c.a.a.f.c.v0;
import c.c.b.a;
import c.c.b.b;
import c.c.b.c;
import c.c.b.e;
import c.c.b.g;
import c.c.b.h.b;
import c.c.b.h.d0.c0;
import c.c.b.h.d0.f0;
import c.c.b.h.d0.g0;
import c.c.b.h.e;
import c.c.b.h.f;
import c.c.b.h.g;
import c.c.b.h.h;
import c.c.b.h.i;
import c.c.b.h.j;
import c.c.b.h.k;
import c.c.b.h.l;
import c.c.b.h.m;
import c.c.b.h.n;
import c.c.b.h.o;
import c.c.b.h.s;
import c.c.b.h.t;
import c.c.b.h.y;
import c.c.b.m.b.a;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.List;

public final class m0 {
  public static final SparseArray<Pair<String, String>> a;
  
  static {
    SparseArray<Pair<String, String>> sparseArray = new SparseArray();
    a = sparseArray;
    a.g("ERROR_INVALID_CUSTOM_TOKEN", "The custom token format is incorrect. Please check the documentation.", sparseArray, 17000);
    a.g("ERROR_CUSTOM_TOKEN_MISMATCH", "The custom token corresponds to a different audience.", a, 17002);
    a.g("ERROR_INVALID_CREDENTIAL", "The supplied auth credential is malformed or has expired.", a, 17004);
    a.g("ERROR_INVALID_EMAIL", "The email address is badly formatted.", a, 17008);
    a.g("ERROR_WRONG_PASSWORD", "The password is invalid or the user does not have a password.", a, 17009);
    a.g("ERROR_USER_MISMATCH", "The supplied credentials do not correspond to the previously signed in user.", a, 17024);
    a.g("ERROR_REQUIRES_RECENT_LOGIN", "This operation is sensitive and requires recent authentication. Log in again before retrying this request.", a, 17014);
    a.g("ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL", "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address.", a, 17012);
    a.g("ERROR_EMAIL_ALREADY_IN_USE", "The email address is already in use by another account.", a, 17007);
    a.g("ERROR_CREDENTIAL_ALREADY_IN_USE", "This credential is already associated with a different user account.", a, 17025);
    a.g("ERROR_USER_DISABLED", "The user account has been disabled by an administrator.", a, 17005);
    a.g("ERROR_USER_TOKEN_EXPIRED", "The user's credential is no longer valid. The user must sign in again.", a, 17021);
    a.g("ERROR_USER_NOT_FOUND", "There is no user record corresponding to this identifier. The user may have been deleted.", a, 17011);
    a.g("ERROR_INVALID_USER_TOKEN", "This user's credential isn't valid for this project. This can happen if the user's token has been tampered with, or if the user isn't for the project associated with this API key.", a, 17017);
    a.g("ERROR_OPERATION_NOT_ALLOWED", "The given sign-in provider is disabled for this Firebase project. Enable it in the Firebase console, under the sign-in method tab of the Auth section.", a, 17006);
    a.g("ERROR_WEAK_PASSWORD", "The given password is invalid.", a, 17026);
    a.g("ERROR_EXPIRED_ACTION_CODE", "The out of band code has expired.", a, 17029);
    a.g("ERROR_INVALID_ACTION_CODE", "The out of band code is invalid. This can happen if the code is malformed, expired, or has already been used.", a, 17030);
    a.g("ERROR_INVALID_MESSAGE_PAYLOAD", "The email template corresponding to this action contains invalid characters in its message. Please fix by going to the Auth email templates section in the Firebase Console.", a, 17031);
    a.g("ERROR_INVALID_RECIPIENT_EMAIL", "The email corresponding to this action failed to send as the provided recipient email address is invalid.", a, 17033);
    a.g("ERROR_INVALID_SENDER", "The email template corresponding to this action contains an invalid sender email or name. Please fix by going to the Auth email templates section in the Firebase Console.", a, 17032);
    a.g("ERROR_MISSING_EMAIL", "An email address must be provided.", a, 17034);
    a.g("ERROR_MISSING_PASSWORD", "A password must be provided.", a, 17035);
    a.g("ERROR_MISSING_PHONE_NUMBER", "To send verification codes, provide a phone number for the recipient.", a, 17041);
    a.g("ERROR_INVALID_PHONE_NUMBER", "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code].", a, 17042);
    a.g("ERROR_MISSING_VERIFICATION_CODE", "The Phone Auth Credential was created with an empty sms verification Code", a, 17043);
    a.g("ERROR_INVALID_VERIFICATION_CODE", "The sms verification code used to create the phone auth credential is invalid. Please resend the verification code sms and be sure use the verification code provided by the user.", a, 17044);
    a.g("ERROR_MISSING_VERIFICATION_ID", "The Phone Auth Credential was created with an empty verification ID", a, 17045);
    a.g("ERROR_INVALID_VERIFICATION_ID", "The verification ID used to create the phone auth credential is invalid.", a, 17046);
    a.g("ERROR_RETRY_PHONE_AUTH", "An error occurred during authentication using the PhoneAuthCredential. Please retry authentication.", a, 17049);
    a.g("ERROR_SESSION_EXPIRED", "The sms code has expired. Please re-send the verification code to try again.", a, 17051);
    a.g("ERROR_QUOTA_EXCEEDED", "The sms quota for this project has been exceeded.", a, 17052);
    a.g("ERROR_APP_NOT_AUTHORIZED", "This app is not authorized to use Firebase Authentication. Please verify that the correct package name and SHA-1 are configured in the Firebase Console.", a, 17028);
    a.g("ERROR_API_NOT_AVAILABLE_WITHOUT_GOOGLE_PLAY", "The API that you are calling is not available on devices without Google Play services.", a, 17063);
    a.g("ERROR_WEB_INTERNAL_ERROR", "There was an internal error in the web widget.", a, 17062);
    a.g("ERROR_INVALID_CERT_HASH", "There was an error while trying to get your package certificate hash.", a, 17064);
    a.g("ERROR_WEB_STORAGE_UNSUPPORTED", "This browser is not supported or 3rd party cookies and data may be disabled.", a, 17065);
    a.g("ERROR_MISSING_CONTINUE_URI", "A continue URL must be provided in the request.", a, 17040);
    a.g("ERROR_DYNAMIC_LINK_NOT_ACTIVATED", "Please activate Dynamic Links in the Firebase Console and agree to the terms and conditions.", a, 17068);
    a.g("ERROR_INVALID_PROVIDER_ID", "The provider ID provided for the attempted web operation is invalid.", a, 17071);
    a.g("ERROR_WEB_CONTEXT_ALREADY_PRESENTED", "A headful operation is already in progress. Please wait for that to finish.", a, 17057);
    a.g("ERROR_WEB_CONTEXT_CANCELED", "The web operation was canceled by the user.", a, 17058);
    a.g("ERROR_TENANT_ID_MISMATCH", "The provided tenant ID does not match the Auth instance's tenant ID.", a, 17072);
    a.g("ERROR_UNSUPPORTED_TENANT_OPERATION", "This operation is not supported in a multi-tenant context.", a, 17073);
    a.g("ERROR_INVALID_DYNAMIC_LINK_DOMAIN", "The provided dynamic link domain is not configured or authorized for the current project.", a, 17074);
    a.g("ERROR_REJECTED_CREDENTIAL", "The request contains malformed or mismatching credentials", a, 17075);
    a.g("ERROR_PHONE_NUMBER_NOT_FOUND", "The provided phone number does not match any of the second factor phone numbers associated with this user.", a, 17077);
    a.g("ERROR_INVALID_TENANT_ID", "The Auth instance's tenant ID is invalid.", a, 17079);
    a.g("ERROR_SECOND_FACTOR_REQUIRED", "Please complete a second factor challenge to finish signing into this account.", a, 17078);
    a.g("ERROR_API_NOT_AVAILABLE", "The API that you are calling is not available.", a, 17080);
    a.g("ERROR_MISSING_MULTI_FACTOR_SESSION", "The request is missing proof of first factor successful sign-in.", a, 17081);
    a.g("ERROR_MISSING_MULTI_FACTOR_INFO", "No second factor identifier is provided.", a, 17082);
    a.g("ERROR_INVALID_MULTI_FACTOR_SESSION", "The request does not contain a valid proof of first factor successful sign-in.", a, 17083);
    a.g("ERROR_MULTI_FACTOR_INFO_NOT_FOUND", "The user does not have a second factor matching the identifier provided.", a, 17084);
    a.g("ERROR_ADMIN_RESTRICTED_OPERATION", "This operation is restricted to administrators only.", a, 17085);
    a.g("ERROR_UNVERIFIED_EMAIL", "This operation requires a verified email.", a, 17086);
    a.g("ERROR_SECOND_FACTOR_ALREADY_ENROLLED", "The second factor is already enrolled on this account.", a, 17087);
    a.g("ERROR_MAXIMUM_SECOND_FACTOR_COUNT_EXCEEDED", "The maximum allowed number of second factors on a user has been exceeded.", a, 17088);
    a.g("ERROR_UNSUPPORTED_FIRST_FACTOR", "Enrolling a second factor or signing in with a multi-factor account requires sign-in with a supported first factor.", a, 17089);
    a.g("ERROR_EMAIL_CHANGE_NEEDS_VERIFICATION", "Multi-factor users must always have a verified email.", a, 17090);
    a.g("ERROR_INTERNAL_SUCCESS_SIGN_OUT", "This is an internal error code indicating that the operation was successful but the user needs to be signed out.", a, 17091);
    a.g("ERROR_MISSING_CLIENT_IDENTIFIER", "This request is missing a reCAPTCHA token.", a, 17093);
    a.g("ERROR_MISSING_OR_INVALID_NONCE", "The request does not contain a valid nonce. This can occur if the SHA-256 hash of the provided raw nonce does not match the hashed nonce in the ID token payload.", a, 17094);
    a.g("ERROR_USER_CANCELLED", "The user did not grant your application the permissions it requested.", a, 18001);
  }
  
  public static c a(Status paramStatus) {
    int i = paramStatus.c;
    Pair pair = (Pair)a.get(i);
    if (pair != null) {
      str = (String)pair.second;
    } else {
      str = "An internal error has occurred.";
    } 
    String str = e(str, paramStatus);
    if (i != 17020) {
      if (i != 17021)
        if (i != 17051) {
          if (i != 17052) {
            if (i != 17057 && i != 17058)
              if (i != 17000 && i != 17002 && i != 17049)
                if (i != 17068)
                  if (i != 17077) {
                    if (i != 17495) {
                      if (i != 17499)
                        if (i != 18001 && i != 17093)
                          if (i != 17094) {
                            switch (i) {
                              default:
                                switch (i) {
                                  default:
                                    switch (i) {
                                      default:
                                        switch (i) {
                                          default:
                                            switch (i) {
                                              default:
                                                switch (i) {
                                                  default:
                                                    switch (i) {
                                                      default:
                                                        switch (i) {
                                                          default:
                                                            return new c("An internal error has occurred.");
                                                          case 17071:
                                                          case 17072:
                                                          case 17073:
                                                          case 17074:
                                                            return (c)new g(d(i), str);
                                                          case 17075:
                                                            break;
                                                        } 
                                                        break;
                                                      case 17061:
                                                        return (c)new e(e("There was a failure in the connection between the web widget and the Firebase Auth backend.", paramStatus));
                                                      case 17063:
                                                        return (c)new a(str);
                                                      case 17064:
                                                      
                                                      case 17062:
                                                      case 17065:
                                                        break;
                                                    } 
                                                    return (c)new n(d(i), str);
                                                  case 17040:
                                                  
                                                  case 17041:
                                                  case 17042:
                                                  case 17043:
                                                  case 17044:
                                                  case 17045:
                                                  case 17046:
                                                    break;
                                                } 
                                                break;
                                              case 17031:
                                              case 17032:
                                              case 17033:
                                                return (c)new f(d(i), str);
                                              case 17029:
                                              case 17030:
                                                return (c)new e(d(i), str);
                                              case 17028:
                                              
                                              case 17034:
                                              case 17035:
                                                break;
                                            } 
                                            break;
                                          case 17026:
                                            return (c)new m(d(i), str, paramStatus.d);
                                          case 17025:
                                            return (c)new l(d(i), str);
                                          case 17024:
                                            break;
                                        } 
                                        break;
                                      case 17016:
                                        return new c(e("User was not linked to an account with the given provider.", paramStatus));
                                      case 17015:
                                        return new c(e("User has already been linked to the given provider.", paramStatus));
                                      case 17014:
                                        return (c)new k(d(i), str);
                                      case 17017:
                                        break;
                                    } 
                                    break;
                                  case 17080:
                                  case 17079:
                                  case 17085:
                                  case 17086:
                                  case 17087:
                                  case 17088:
                                  case 17089:
                                  case 17090:
                                  case 17091:
                                  
                                  case 17081:
                                  case 17082:
                                  case 17083:
                                  case 17084:
                                    break;
                                } 
                              case 17010:
                                return (c)new g(e("We have blocked all requests from this device due to unusual activity. Try again later.", paramStatus));
                              case 17007:
                              case 17012:
                              case 17006:
                              
                              case 17004:
                              case 17008:
                              case 17009:
                                return (c)new h(d(i), str);
                              case 17005:
                              case 17011:
                                break;
                            } 
                            return (c)new i(d(i), str);
                          }   
                      return new c(e("An internal error has occurred.", paramStatus));
                    } 
                    return (c)new a(e("Please sign in before trying to get a token.", paramStatus));
                  }    
            return (c)new n(d(i), str);
          } 
          return (c)new g(str);
        }  
      return (c)new i(d(i), str);
    } 
    return (c)new e(e("A network error (such as timeout, interrupted connection or unreachable host) has occurred.", paramStatus));
  }
  
  public static c b(Status paramStatus, b paramb, String paramString1, String paramString2) {
    String str;
    boolean bool;
    int i = paramStatus.c;
    if (i == 17012 || i == 17007 || i == 17025) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      String str1;
      Pair pair = (Pair)a.get(i);
      if (pair != null) {
        str1 = (String)pair.second;
      } else {
        str1 = "An internal error has occurred.";
      } 
      str = e(str1, paramStatus);
      return (c)new l(d(i), str);
    } 
    return a((Status)str);
  }
  
  public static j c(FirebaseAuth paramFirebaseAuth, v0 paramv0, o paramo) {
    if (paramFirebaseAuth != null) {
      if (paramv0 != null) {
        Pair pair = (Pair)a.get(17078);
        String str1 = (String)pair.first;
        String str2 = (String)pair.second;
        List list1 = q.t0(paramv0.c);
        ArrayList<y> arrayList = new ArrayList();
        for (s s : list1) {
          if (s instanceof y)
            arrayList.add((y)s); 
        } 
        List list2 = q.t0(paramv0.c);
        String str3 = paramv0.b;
        q.f(list2);
        q.d(str3);
        g0 g0 = new g0();
        g0.d = new ArrayList();
        for (s s : list2) {
          if (s instanceof y)
            g0.d.add((y)s); 
        } 
        g0.c = str3;
        b b = paramFirebaseAuth.a;
        b.a();
        return new j(str1, str2, (t)new f0(arrayList, g0, b.b, paramv0.d, (c0)paramo));
      } 
      throw null;
    } 
    throw null;
  }
  
  public static String d(int paramInt) {
    Pair pair = (Pair)a.get(paramInt);
    return (pair != null) ? (String)pair.first : "INTERNAL_ERROR";
  }
  
  public static String e(String paramString, Status paramStatus) {
    return TextUtils.isEmpty(paramStatus.d) ? paramString : String.format(String.valueOf(paramString).concat(" [ %s ]"), new Object[] { paramStatus.d });
  }
}


/* Location:              C:\Users\panch\Downloads\dvba_v1.1.0-dex2jar.jar!\c\c\b\h\c0\a\m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */