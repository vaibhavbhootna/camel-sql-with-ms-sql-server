
package com.umss.xy.ws.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.8
 * 2018-06-07T17:32:07.071+08:00
 * Generated source version: 2.7.8
 */

@WebFault(name = "getMyCarFault", targetNamespace = "http://ws.xy.umss.com/")
public class GetMyCarFault extends Exception {
    
    private com.umss.xy.ws.PersonalDataFault getMyCarFault;

    public GetMyCarFault() {
        super();
    }
    
    public GetMyCarFault(String message) {
        super(message);
    }
    
    public GetMyCarFault(String message, Throwable cause) {
        super(message, cause);
    }

    public GetMyCarFault(String message, com.umss.xy.ws.PersonalDataFault getMyCarFault) {
        super(message);
        this.getMyCarFault = getMyCarFault;
    }

    public GetMyCarFault(String message, com.umss.xy.ws.PersonalDataFault getMyCarFault, Throwable cause) {
        super(message, cause);
        this.getMyCarFault = getMyCarFault;
    }

    public com.umss.xy.ws.PersonalDataFault getFaultInfo() {
        return this.getMyCarFault;
    }
}
