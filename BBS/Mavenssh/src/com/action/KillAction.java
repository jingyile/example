package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller("KillAction")
public class KillAction extends ActionSupport {
    private UserService userService;
    public UserService getUserService() {
        return userService;
    }
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String execute() throws Exception {
            Map session = ActionContext.getContext().getSession();
            session.put("username", null);
            return SUCCESS;
        }
}

