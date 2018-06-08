
package com.umss.xy.ws.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.8
 * 2018-06-07T17:32:07.050+08:00
 * Generated source version: 2.7.8
 */

@WebFault(name = "getAllCarsFault", targetNamespace = "http://ws.xy.umss.com/")
public class GetAllCarsFault extends Exception {
    
    private com.umss.xy.ws.PersonalDataFault getAllCarsFault;

    public GetAllCarsFault() {
        super();
    }
    
    public GetAllCarsFault(String message) {
        super(message);
    }
    
    public GetAllCarsFault(String message, Throwable cause) {
        super(message, cause);
    }

    public GetAllCarsFault(String message, com.umss.xy.ws.PersonalDataFault getAllCarsFault) {
        super(message);
        this.getAllCarsFault = getAllCarsFault;
    }

    public GetAllCarsFault(String message, com.umss.xy.ws.PersonalDataFault getAllCarsFault, Throwable cause) {
        super(message, cause);
        this.getAllCarsFault = getAllCarsFault;
    }

    public com.umss.xy.ws.PersonalDataFault getFaultInfo() {
        return this.getAllCarsFault;
    }
}
