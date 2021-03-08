package com.shreeram.awscpdemo;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.ui.ModelAndView;
import com.blade.mvc.annotation.JSON;
import com.blade.mvc.ui.RestResponse;

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
        
        return req.remoteAddress();
    }
}
