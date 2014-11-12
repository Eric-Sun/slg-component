package com.h13.slg.core.util;

import com.h13.slg.core.exception.RequestFatalException;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * UserServiceTest: sunbo
 * Date: 14-2-9
 * Time: 下午4:17
 * To change this template use File | Settings | File Templates.
 */
public class HttpClientUtil {

    public String post(String url, Map<String, String> valuesMap) throws RequestFatalException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        StringBuffer sb = new StringBuffer();
        for (String key : valuesMap.keySet()) {
            nvps.add(new BasicNameValuePair(key, valuesMap.get(key)));
        }
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(nvps));
            CloseableHttpResponse response = httpclient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                InputStream is = entity.getContent();
                byte[] bs = new byte[1024];
                int b = 0;
                while ((b = is.read(bs)) != -1) {
                    sb.append(new String(bs));
                }
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RequestFatalException(
                    String.format("url=%s", url), e);
        }

    }
}
