package MyStudyPlan;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.auth.oauth2.TokenRequest;
import com.google.api.client.http.BasicAuthentication;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.gson.Gson;

/* WORK IN PROGRESS! */

public class OAuth {
	public OAuth () {
		TokenResponse token = RequestToken(
			// An example of an OAuth2 API URL.
			"https://accounts.google.com/o/oauth2/auth",
			// Ofcourse, you'd have the user to enter their username, and the password would be hidden.
			"test",
			"1234"
		);
		// save token to resource/credentials.jsonc
		try (PrintWriter out = new PrintWriter(new FileWriter("resource/credentials.json"))) {
			Gson gson = new Gson();
			gson.toJson(token);
		} catch (Exception e) {
			Logger.getLogger(OAuth.class.getName()).log(java.util.logging.Level.WARNING,
				"Failed to save the user's token", e);
		}
	}
	private TokenResponse RequestToken (String AuthServ, String username, String passwd) {
		// Request Token
		GenericUrl authServ = new GenericUrl(AuthServ);
		try {
			// Request Authorization "code".
			String code = new TokenRequest(
				new NetHttpTransport(),
				new GsonFactory(),
				authServ,
				"authorization_code"
			)
			.execute()
			.getAccessToken();
			// Request Access Token.
			TokenResponse response = new AuthorizationCodeTokenRequest(
				new NetHttpTransport(),
				new GsonFactory(),
				authServ,
				code
			)
			.setClientAuthentication(new BasicAuthentication(username, passwd))
			.execute();
			// Returns the TokenResponse object.
			return response;
		} catch (IOException e) {
			Logger.getLogger(OAuth.class.getName()).log(java.util.logging.Level.WARNING,
					"Failed to connect to OAuth server [" + authServ.getHost() + "]!", e);
			return null;
		}
	}
}
