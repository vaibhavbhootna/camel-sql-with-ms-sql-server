package com.myPersonalData.service.security;

import org.apache.wss4j.common.ext.WSSecurityException;
import org.apache.wss4j.common.ext.WSSecurityException.ErrorCode;
import org.apache.wss4j.dom.handler.RequestData;
import org.apache.wss4j.dom.validate.Credential;
import org.apache.wss4j.dom.validate.UsernameTokenValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomUsernameTokenValidator extends UsernameTokenValidator{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomUsernameTokenValidator.class); 

	@Override
	  public Credential validate(Credential credential, RequestData data) throws WSSecurityException {
		String username = credential.getUsernametoken().getName();
		String password = credential.getUsernametoken().getPassword();
		
		if(username.equals("admin") && password.equals("admin")) {
			LOGGER.info(username +" is successfully validated");
		}else {
			throw new WSSecurityException(ErrorCode.FAILED_AUTHENTICATION);
		}
		return credential;
	}
}