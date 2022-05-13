/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.controllers.tags;

import java.io.IOException;
import java.io.StringWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author will
 */
public class TagWithBody extends SimpleTagSupport{

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag(); 
        
        StringWriter sw = new StringWriter();
        getJspBody().invoke(sw);
        getJspContext().getOut().print("<h3>"+sw.toString()+"</h3>");
    }
}
