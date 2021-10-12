package apitest;

import java.io.BufferedInputStream;
import java.net.URL;
 
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
 
public class test111 {
    public final static String PHARM_URL = "https://openapi.gg.go.kr/GSST"
            + "ServiceKey=ad5cda9404a245c29fd5fb5ee40d4d51";
    
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        
        URL url = new URL(PHARM_URL);
 
        XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
        factory.setNamespaceAware(true);
        XmlPullParser xpp = factory.newPullParser();
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        xpp.setInput(bis, "utf-8");
        
        String tag = null;
        int event_type = xpp.getEventType();
        
        
        String xpos = null, ypos= null,name=null;
        while (event_type != XmlPullParser.END_DOCUMENT) {
            if (event_type == XmlPullParser.START_TAG) {
                tag = xpp.getName();
            } else if (event_type == XmlPullParser.TEXT) {
                /**
                 * 약국의 주소만 가져와본다.
                 */
                if(tag.equals("XPos")){
                    xpos = xpp.getText();
                }else if(tag.equals("YPos")){
                    ypos = xpp.getText();
                }else if(tag.equals("addr")){
                    name = xpp.getText();
                }
            } else if (event_type == XmlPullParser.END_TAG) {
                tag = xpp.getName();
                if (tag.equals("item")) {
                    System.out.println("X : "+xpos
                            +" Y : "+ypos
                            +" 주소 : "+name);
                    
                }
            }
            event_type = xpp.next();
        }
        
        
    }
 
}
 