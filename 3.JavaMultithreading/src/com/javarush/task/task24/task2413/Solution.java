package com.javarush.task.task24.task2413;

import com.javarush.task.task24.task2413.controller.Controller;
import com.javarush.task.task24.task2413.model.MainModel;
import com.javarush.task.task24.task2413.model.Model;
import com.javarush.task.task24.task2413.view.EditUserView;
import com.javarush.task.task24.task2413.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);

        editUserView.fireEventUserDeleted(124L);
        editUserView.fireEventUserChanged("IvanovEdit", 123L, 5);

        usersView.fireEventShowDeletedUsers();
    }
}