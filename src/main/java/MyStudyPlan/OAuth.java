package MyStudyPlan;

import java.io.IOException;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.auth.oauth2.TokenRequest;
import com.google.api.client.http.BasicAuthentication;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;

/* WORK IN PROGRESS! */

public class OAuth {
	public OAuth () {
		// Returns a TokenResponse object of the authentication token.
		RequestToken("", "", "test", "1234");
	}
	private TokenResponse RequestToken (String AuthServ, String RedirectURL, String username, String passwd) {
		// Request Token
		try {
			String code = new TokenRequest(
				new NetHttpTransport(),
				new GsonFactory(),
				new GenericUrl(AuthServ),
				"authorization_code"
			).execute().getAccessToken();
			TokenResponse response = new AuthorizationCodeTokenRequest(
				new NetHttpTransport(),
				new GsonFactory(),
				new GenericUrl(AuthServ),
				code
			)
			.setRedirectUri(RedirectURL)
			.setClientAuthentication(new BasicAuthentication(username, passwd))
			.execute();
			return response;
		} catch (IOException ex) {
			System.out.println(ex);
			return null;
		}
	}
}
