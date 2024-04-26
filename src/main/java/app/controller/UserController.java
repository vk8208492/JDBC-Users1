package app.controller;

import app.service.UserService;
import app.utils.AppStarter;
import app.view.*;

public class UserController {

    UserService service = new UserService();

    public void create() {
        UserCreateView view = new UserCreateView();
        view.getOutput(service.create(view.getData()));
        AppStarter.startApp();
    }

    public void read() {
        UserReadView view = new UserReadView();
        view.getOutput(service.read());
        AppStarter.startApp();
    }

    public void update() {
        UserUpdateView view = new UserUpdateView();
        view.getOutput(service.update(view.getData()));
        AppStarter.startApp();
    }

    public void delete() {
        UserDeleteView view = new UserDeleteView();
        view.getOutput(service.delete(view.getData()));
        AppStarter.startApp();
    }

    public void readById() {
        UserReadByIdView view = new UserReadByIdView();
        view.getOutput(service.readById(view.getData()));
        AppStarter.startApp();
    }
}
