package controller.commands;

import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;

public interface Command {
    String execute(HttpRequest httpRequest, HttpResponse httpResponse);
}