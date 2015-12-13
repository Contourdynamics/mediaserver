package org.contourdynamics.cms.sip.producers;
import java.io.IOException;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.sip.Address;
import javax.servlet.sip.SipErrorEvent;
import javax.servlet.sip.SipErrorListener;
import javax.servlet.sip.SipFactory;
import javax.servlet.sip.SipServlet;
import javax.servlet.sip.SipServletRequest;
import javax.servlet.sip.SipServletResponse;
import javax.servlet.sip.SipSession;
import javax.servlet.sip.annotation.SipListener;

@javax.servlet.sip.annotation.SipServlet(loadOnStartup=1, applicationName="org.contourdynamics.cms.sip.producers.CDsipservlet")
@SipListener
public class CDsipservlet extends SipServlet implements SipErrorListener, Servlet {
	/**
	 * 
	 */
	private SipFactory sipFactory;
	
	private static final long serialVersionUID = 1L;
	@Override
	public void noAckReceived(SipErrorEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void noPrackReceived(SipErrorEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SipFactory sipFactory = (SipFactory) getServletContext().getAttribute(SIP_FACTORY);
	}
	@Override 
	public void doRegister(SipServletRequest register) throws ServletException, IOException {
		int var = 0;
		
	}
	
	@Override
	public void doInvite(SipServletRequest request) throws ServletException, IOException {
		int var = 0;
	}
}