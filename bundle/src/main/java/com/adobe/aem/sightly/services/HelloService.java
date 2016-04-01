package com.adobe.aem.sightly.services;

import com.adobe.cq.sightly.WCMUsePojo;

/**
 * The Sightly Use helper class com.adobe.cq.sightly.WCMUse has been deprecated
 * and is now replaced by com.adobe.cq.sightly.WCMUsePojo which uses the new Sightly API from Apache Sling.
 */
public class HelloService extends WCMUsePojo {

    @Override
    public void activate() throws Exception {
        // nothing to be done here in this case
    }

    public String getHelloMessage() {
        return "This is the Slightly Service Hello Message using WCMUsePojo Vimal Kumar";
    }
}