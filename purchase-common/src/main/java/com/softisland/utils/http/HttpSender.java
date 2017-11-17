package com.softisland.utils.http;

import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class HttpSender {

	public static String post(String url, String requestBody) {
		HttpClient httpClient = HttpClientBuilder.create().build();

		RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(5000).setConnectionRequestTimeout(1000).setSocketTimeout(5000).build();

		HttpPost method = new HttpPost(url);
		method.setConfig(requestConfig);

		String body = null;

		if (method != null && requestBody != null && !"".equals(requestBody.trim())) {
			try {
				method.addHeader("Content-type", "application/json; charset=utf-8");
				method.setHeader("Accept", "application/json");
				method.setEntity(new StringEntity(requestBody, Charset.forName("UTF-8")));
				HttpResponse response = httpClient.execute(method);
				body = EntityUtils.toString(response.getEntity());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return body;
	}
}