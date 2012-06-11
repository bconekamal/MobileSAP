package com.bcone.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;

/**
 * @author Kamal.Trivedi
 * 
 */
public class ServerConnection {

	// Making a http connection
	public String getDataFromServer(String server_url) {
		String response = null;

		try {
			/* Create a URL we want to load some xml-data from. */

			HttpURLConnection con = null;
			InputStream is = null;
			try {
				URL url = new URL(server_url);
				con = (HttpURLConnection) url.openConnection();
				con.setReadTimeout(10000 /* milliseconds */);
				con.setConnectTimeout(15000 /* milliseconds */);
				con.setRequestMethod("GET");
				con.setDoInput(true);
				con.addRequestProperty("Referer", "http://blog.dahanne.net");
				// Start the query
				con.connect();
				is = con.getInputStream();
			} catch (IOException e) {
				// handle the exception !
				e.printStackTrace();
			}

			StringBuffer sb = new StringBuffer("");
			// example
			while (true) {

				int c = 0;
				while (((c = is.read()) != '\n') && (c != -1)) {
					sb.append((char) c);
					// System.out.println("@@@@ c = "+(char)c);
				}
				if (c == -1) {
					break;
				}

			}
			response = sb.toString();
			System.out.println("Before Response :: " + sb.toString());

		} catch (Exception e) {
			/* Display any Error to the GUI. */
			System.out.println("HttpConnection exception====" + e);
			// tv.setText("Error: " + e.getMessage());

		}

		return response;
	}

	public String getRequest(String url) {
		String REQurl = url;
		System.out.println("REQurl == " + REQurl);
		String response = "";
		String responseStr = "";
		DefaultHttpClient client = new DefaultHttpClient();
		client.getCredentialsProvider().setCredentials(AuthScope.ANY,
				new UsernamePasswordCredentials("PEREIRAS", "bconetea123"));
		HttpGet getRequest = new HttpGet(REQurl);

		try {
			getRequest.setURI(new URI(REQurl));
			getRequest.setHeader("Content-Type", "text/xml");
			getRequest.setHeader("Host", getRequest.getURI().getHost());
			HttpResponse execute = client.execute(getRequest);

			InputStream content = execute.getEntity().getContent();

			BufferedReader buffer = new BufferedReader(new InputStreamReader(
					content));
			String s = "";
			while ((s = buffer.readLine()) != null) {
				response += s;
			}
			execute.getEntity().consumeContent();
			responseStr = response.toString();
			System.out.println("DESC RESPONSE === " + response.toString());

			// int userIDIndex = responseStr.indexOf("USER ID:"); // 8+1 blank
			// // space
			// System.out.println("userIndex = " + userIDIndex);
			//
			// int userCellIndex = responseStr.indexOf("CELL NUM:");
			// System.out.println("userCellIndex = " + userCellIndex);
			//
			// int userEmailIndex = responseStr.indexOf("EMAIL ID :");
			// System.out.println("userEmailIndex = " + userEmailIndex);
			//
			// int userFirstNameIndex = responseStr.indexOf("FIRST NAME:");
			// System.out.println("userFirstNameIndex = " + userFirstNameIndex);
			//
			// int userLastNameIndex = responseStr.indexOf("LAST NAME:");
			// System.out.println("userLastNameIndex = " + userLastNameIndex);
			//
			// int userEmpIndex = responseStr.indexOf("EMP ID :");
			// System.out.println("userLastNameIndex = " + userLastNameIndex);
			//
			// int description = responseStr.indexOf("</d:description>");
			// System.out.println("description = " + description);
			//
			// // String subId = responseStr.substring(749, 758);
			// String subId = responseStr
			// .substring(userIDIndex + 9, userCellIndex);
			// System.out.println("SubString ID === " + subId);
			//
			// String subCell = responseStr.substring(userCellIndex + 10,
			// userEmailIndex);
			// System.out.println("SubString CELL === " + subCell);
			//
			// String subEmail = responseStr.substring(userEmailIndex + 11,
			// userFirstNameIndex);
			// System.out.println("SubString EMAIL === " + subEmail);
			//
			// String subFirstName = responseStr.substring(
			// userFirstNameIndex + 12, userLastNameIndex);
			// System.out.println("SubString FIRST NAME === " + subFirstName);
			//
			// String subLastName = responseStr.substring(userLastNameIndex +
			// 11,
			// userEmpIndex);
			// System.out.println("SubString LAST NAME === " + subLastName);
			//
			// String subEmp = responseStr
			// .substring(userEmpIndex + 9, description);
			// System.out.println("SubString EMP ID === " + subEmp);
			//
			// Descriptiondata descObj = new Descriptiondata();
			// descObj.setUserId(subId);
			// descObj.setCell(subCell);
			// descObj.setEmail(subEmail);
			// descObj.setFirstname(subFirstName);
			// descObj.setLastname(subLastName);
			// descObj.setEmpid(subEmp);
			//
			// descVector = new Vector();
			// descVector.add(descObj);

		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println(e.toString());
		}

		return responseStr;
	}

	/**
	 * This method will post the data to server along with credentials & return
	 * the response
	 * 
	 * @param url
	 *            : Hit's to the specific posting URL
	 * @param xmlContent
	 *            : Get the XML content that is required to post.
	 * 
	 * @return response : Return the response from server
	 */
	public String postDataToServer(String url, String xmlContent) {

		// String REQurl =
		// "http://61.16.181.109:8000/sap/opu/sdata/SAP/ZBC_CM_MOBILE_DEMO1/zbc_gw_mobile_modelCollection?sap-client=100";

		String REQurl = url;

		String strResponse = "";
		DefaultHttpClient client = new DefaultHttpClient();
		client.getCredentialsProvider().setCredentials(AuthScope.ANY,
				new UsernamePasswordCredentials("PEREIRAS", "bconetea123"));
		HttpPost postRequest = new HttpPost(REQurl);

		String strContent = xmlContent;

		// String strContent = " <?xml version='1.0' encoding='utf-8'?>"
		// + " <atom:entry "
		// + " xmlns:atom='http://www.w3.org/2005/Atom' "
		// + " xmlns:d='http://schemas.microsoft.com/ado/2007/08/dataservices' "
		// +
		// " xmlns:m='http://schemas.microsoft.com/ado/2007/08/dataservices/metadata'> "
		// + " <atom:content type='application/xml'> "
		// + " <m:properties> <d:zlastn>" + strLastName
		// + "</d:zlastn> <d:zcellnum>" + strCellNum + "</d:zcellnum> "
		// + " <d:zemail>" + strEmail + "</d:zemail> "
		// + " <d:ep_message>message</d:ep_message> " + " <d:zuserid>"
		// + strUsername + "</d:zuserid> "
		// + "<d:new_password>fromweb</d:new_password>"
		// + " <d:zempid>787</d:zempid> "
		// + " <d:action>action</d:action> " + " <d:zpass>" + strMobPass
		// + "</d:zpass> " + " <d:zstatus>X</d:zstatus> "
		// + " <d:mandt>100</d:mandt> <d:zfirstn>" + strFirstName
		// + "</d:zfirstn> </m:properties> </atom:content> </atom:entry>";

		try {

			System.out.println("user  :" + strContent);
			postRequest.addHeader("X-Requested-With", "XMLHttpRequest");
			StringEntity entity = new StringEntity(strContent);
			entity.setContentType(new BasicHeader("Content-Type",
					"application/atom+xml"));
			postRequest.setEntity(entity);
			HttpResponse response = client.execute(postRequest);

			InputStream inputStream = response.getEntity().getContent();
			// convert to String and return the response
			strResponse = convertInputStreamToString(inputStream);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return strResponse;

	}// End of postDataToServer method

	public String convertInputStreamToString(InputStream inputStream) {
		StringBuffer buffer = new StringBuffer();
		String str = null;
		try {
			byte[] b = new byte[4096];
			for (int n; (n = inputStream.read(b)) != -1;) {

				buffer.append(new String(b, 0, n));
			}
			str = buffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return str;
	}

}// End of class
