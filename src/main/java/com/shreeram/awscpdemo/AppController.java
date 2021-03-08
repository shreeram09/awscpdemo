package com.shreeram.awscpdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.http.Request;
import com.blade.mvc.ui.ModelAndView;
import com.blade.mvc.annotation.JSON;
import com.blade.mvc.ui.RestResponse;
import java.time.LocalDateTime;

@Path("/home")
public class AppController {
    
    @GetRoute("/welcome")
    public ModelAndView welcome(){
        ModelAndView mView = new ModelAndView("home.html");
        return mView;
    }
    
    @GetRoute("/hi")
    @JSON
    public String hi(Request req){
        String server = "";
        String client = req.host()+"/"+req.remoteAddress();
        InetAddress inet;
        try{
        inet = InetAddress.getLocalHost();
        server = inet.toString();
        }catch(UnknownHostException e){

        }

        return "me:"+server+", you:"+client;
    }
    
      @GetRoute("/datetime")
    @JSON
    public String hi(){
        return "current time: "+LocalDateTime.now().toString();
    }
}
