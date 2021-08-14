package service;

import base.service.BaseEntityService;
import domain.User;

public interface UserService extends BaseEntityService<User, Long> {

    void logIn();
}
