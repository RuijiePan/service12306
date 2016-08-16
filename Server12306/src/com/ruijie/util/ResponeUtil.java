package com.ruijie.util;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class ResponeUtil {
	
	private HttpServletResponse response;
	
	public ResponeUtil(HttpServletResponse response) {
		this.response = response;
	}
	
	public HttpServletResponse getDefaultResponse(){
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		this.response = response;
		return this.response;
	}
	
	public void writeStringJson(String toJson){
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.write(toJson);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(out!=null){
				out.close();
			}
		}
	}
	
	public void writeObjectJson(Object obj){
		String tojson = GsonUtil.toJson(obj);
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.write(tojson);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if (out != null) {
				out.close();
			}
		}
	}
}
