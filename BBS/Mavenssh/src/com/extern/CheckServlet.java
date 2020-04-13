package com.extern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        response.setContentType("text/plain;charset=utf-8");
        //获得这个变量要在前面这句话之后添加，不然会出现乱码
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        if("admin".equals(name)||"jingyile".equals((name))||"jinglele".equals((name))||"jiangyutao".equals((name))){
            out.println("用户名已被占用");
        }else{
            out.println("用户名可用");
        }
        out.flush();
        out.close();
    }
}
