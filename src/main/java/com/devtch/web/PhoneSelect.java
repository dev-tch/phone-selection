package com.devtch.web;
import com.devtch.model.*;
import java.io.IOException;
import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.*;

public class PhoneSelect extends HttpServlet{

    public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException{
        String paramBrand = request.getParameter("brand") ;
        PhoneExpert pe  = new PhoneExpert();
        List result = pe.getPhoneModels(paramBrand) ;
        //response.setContentType("text/html");
        //PrintWriter out = response.getWriter();
        //out.println(paramBrand + " brand Selection Advice<br>") ;
        //out.println("<br>Got brand phone :  " + paramColor);
        /*Iterator iter = result.iterator();
        while(iter.hasNext()){
            out.println("<br> try : " + iter.next()) ;
        }*/
        request.setAttribute("styles" ,result ) ;
        RequestDispatcher view = request.getRequestDispatcher("result.jsp") ;
        view.forward(request, response);

    }
}