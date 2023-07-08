package com.sai;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/FilterClass")
public class FilterClass implements Filter {


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.print("Filter filter");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.print("Filter destroy");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	System.out.print("Filter init");
		
	}	

}
