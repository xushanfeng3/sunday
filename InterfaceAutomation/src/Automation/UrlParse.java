package Automation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlParse {
	private URL url;
	
	public URL getUrl() {
		return url;
	}
	public void setUrl(String url) {
		try {
			this.url = new URL(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

public  String sentPost(String param){
		PrintWriter out = null;	
		BufferedReader in = null;	
		String result = "";
		try {
			URLConnection conn = this.url.openConnection();
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			
			conn.setDoOutput(true);
			conn.setDoInput(true);
			
			out = new PrintWriter(conn.getOutputStream());
			out.println(param);
			out.flush();
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while((line = in.readLine())!= null){
				result += line;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("发送post请求异常");
		}
		finally{
			try{
				if(out!=null){
					out.close();
				}
				if(in != null){
					in.close();
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return result;
	}
}