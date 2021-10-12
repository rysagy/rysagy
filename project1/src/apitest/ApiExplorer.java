package apitest;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {
    public static void main(String[] args) throws IOException {
    	// 1. URL�� ����� ���� StringBuilder.
        StringBuilder urlBuilder = new StringBuilder("https://openapi.gg.go.kr/GSST"); /*URL*/
        // 2. ���� API�ǿ�û �԰ݿ� �´� �Ķ���� ����, �߱޹��� ����Ű.
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=ad5cda9404a245c29fd5fb5ee40d4d51"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*XML �Ǵ� JSON*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*�� ������ ��� ��*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*������ ��ȣ*/
        urlBuilder.append("&" + URLEncoder.encode("cond[country_nm::EQ]","UTF-8") + "=" + URLEncoder.encode("����", "UTF-8")); /*�ѱ� ������*/
        urlBuilder.append("&" + URLEncoder.encode("cond[country_iso_alp2::EQ]","UTF-8") + "=" + URLEncoder.encode("GH", "UTF-8")); /*ISO 2�ڸ��ڵ�*/
        // 3. URL ��ü ����.
        URL url = new URL(urlBuilder.toString());
        // 4. ��û�ϰ��� �ϴ� URL�� ����ϱ� ���� Connection ��ü ����.
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        // 5. ����� ���� �޼ҵ� SET.
        conn.setRequestMethod("GET");
        // 6. ����� ���� Content-type SET. 
        conn.setRequestProperty("Content-type", "application/json");
        // 7. ��� ���� �ڵ� Ȯ��.
        System.out.println("Response code: " + conn.getResponseCode());
        // 8. ���޹��� �����͸� BufferedReader ��ü�� ����.
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        // 9. ����� �����͸� ���κ��� �о� StringBuilder ��ü�� ����.
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        // 10. ��ü ����.
        rd.close();
        conn.disconnect();
        // 11. ���޹��� ������ Ȯ��.
        System.out.println(sb.toString());
    }
}